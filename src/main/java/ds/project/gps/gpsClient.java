package ds.project.gps;

import ds.project.coordinates;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Random;

public class gpsClient {
    private static GpsServiceGrpc.GpsServiceBlockingStub blockingStub;
    private static GpsServiceGrpc.GpsServiceStub asyncStub;

    public static void main (String[] args){

        ManagedChannel channel= ManagedChannelBuilder
                .forAddress("localhost",51207)
                .usePlaintext()
                .build();

        blockingStub=GpsServiceGrpc.newBlockingStub(channel);
        asyncStub=GpsServiceGrpc.newStub(channel);
        getDestination();
        getDistanceLeft();
    }
     public static void getDestination(){
         ArrayList<Integer> xaxis=new ArrayList<>();
         ArrayList<Integer> yaxis=new ArrayList<>();

         StreamObserver<gpsResponse> responseStreamObserver=new StreamObserver<gpsResponse>() {
             @Override
             public void onNext(gpsResponse value) {
                 xaxis.add(value.getXAxis());
                 yaxis.add(value.getYAxis());

                 System.out.println("Gps co-ordinates x-axis: "+value.getXAxis()+" y-axis: "+value.getYAxis());
             }

             @Override
             public void onError(Throwable t) {
                 t.printStackTrace();
             }

             @Override
             public void onCompleted() {
                 System.out.println("Completed getDestination....");
             }
         };
         StreamObserver<gpsRequest> requestStreamObserver=asyncStub.gps(responseStreamObserver);
         try {
             requestStreamObserver.onNext(gpsRequest.newBuilder()
                     .setXAxis(100)
                     .build());


             requestStreamObserver.onNext(gpsRequest.newBuilder()
                     .setYAxis(100)
                     .build());

             requestStreamObserver.onNext(gpsRequest.newBuilder()
                     .setDistance(100)
                     .build());

             // Mark the end of requests
             requestStreamObserver.onCompleted();

             // Sleep for a bit before sending the next one.
             Thread.sleep(new Random().nextInt(1000) + 500);

         } catch (RuntimeException e) {
             e.printStackTrace();
         }
         catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
     public  static void  getDistanceLeft(){
        tdRequest request=tdRequest.newBuilder()
                .setXAxis(50)
                .setYAxis(50)
                .build();
        StreamObserver<tdResponse> responseStreamObserver=new StreamObserver<tdResponse>() {
            @Override
            public void onNext(tdResponse value) {
             System.out.println("Distance left is: "+value.getDistanceLeft());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("getDistanceLeft complete...");
            }
        };
        asyncStub.timeDistance(request,responseStreamObserver);

     }

}

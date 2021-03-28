package ds.project.heart;

import ds.project.gps.GpsServiceGrpc;
import ds.project.gps.gpsRequest;
import ds.project.gps.gpsResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Random;

public class heartClient {
    private static HeartServiceGrpc.HeartServiceBlockingStub blockingStub;
    private static HeartServiceGrpc.HeartServiceStub asyncStub;

    public static void main (String[] args){

        ManagedChannel channel= ManagedChannelBuilder
                .forAddress("localhost",51208)
                .usePlaintext()
                .build();

        blockingStub=HeartServiceGrpc.newBlockingStub(channel);
        asyncStub=HeartServiceGrpc.newStub(channel);


    }
    public static void getHeartRate(){
    heartRequest request=heartRequest.newBuilder()
            .setHeartRate(100)
            .build();

        StreamObserver<heartResponse> responseStreamObserver=new StreamObserver<heartResponse>() {

            @Override
            public void onNext(heartResponse value) {
                System.out.println("heart-rate is: " + value.getHeartRate());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed getHeartRate....");
            }
        };
        StreamObserver<heartRequest> requestStreamObserver=asyncStub.heart(responseStreamObserver);
        try {
            requestStreamObserver.onNext(heartRequest.newBuilder()
                    .setHeartRate(100)
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
    public static void slowDown(){
        slowRequest slowReq=slowRequest.newBuilder().setTooHigh(true).build();
        slowResponse slowRes=blockingStub.slow(slowReq);
        System.out.println("Heart-rate is too high slow down");
    }
}

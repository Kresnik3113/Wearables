package ds.project.speed;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Random;

public class speedClient {
    private static SpeedServiceGrpc.SpeedServiceBlockingStub blockingStub;
    private static SpeedServiceGrpc.SpeedServiceStub asyncStub;

    public static void main (String[] args){

        ManagedChannel channel= ManagedChannelBuilder
                .forAddress("localhost",51209)
                .usePlaintext()
                .build();

        blockingStub=SpeedServiceGrpc.newBlockingStub(channel);
        asyncStub=SpeedServiceGrpc.newStub(channel);
        getSpeed();
        howLong();

    }
    public static void getSpeed(){

        StreamObserver<speedResponse> responseStreamObserver=new StreamObserver<speedResponse>() {

            @Override
            public void onNext(speedResponse value) {
                System.out.println("speed is: " + value.getCurrentSpeed());

            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed getSpeed....");
            }
        };
        StreamObserver<speedRequest> requestStreamObserver=asyncStub.speed(responseStreamObserver);
        try {
            requestStreamObserver.onNext(speedRequest.newBuilder()
                    .setCurrentSpeed(100)
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
    public static void howLong(){
        howLongLeftRequest longReq=howLongLeftRequest.newBuilder().setDistanceLeft(100).build();
        howLongLeftResponse longRes=blockingStub.howLongLeft(longReq);
        System.out.println("There is around"+longRes.getTimeLeft()+" seconds left");
    }
}

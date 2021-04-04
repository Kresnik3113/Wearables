package ds.project.heart;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


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

        asyncStub.heart(request,responseStreamObserver);



    }
    public static void slowDown(){
        slowRequest slowReq=slowRequest.newBuilder().setTooHigh(true).build();
        slowResponse slowRes=blockingStub.slow(slowReq);
        System.out.println("Heart-rate is too high slow down");
    }
}

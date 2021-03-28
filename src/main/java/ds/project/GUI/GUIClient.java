package ds.project.GUI;

import ds.project.gps.GpsServiceGrpc;
import ds.project.gps.*;
import ds.project.heart.*;
import ds.project.speed.*;
import ds.project.heart.HeartServiceGrpc;
import ds.project.speed.SpeedServiceGrpc;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GUIClient {
    private JFrame frame;

    private static GpsServiceGrpc.GpsServiceBlockingStub gpsBlockingStub;
    private static GpsServiceGrpc.GpsServiceStub gpsAsyncStub;
    private static HeartServiceGrpc.HeartServiceBlockingStub heartBlockingStub;
    private static HeartServiceGrpc.HeartServiceStub heartAsyncStub;
    private static SpeedServiceGrpc.SpeedServiceBlockingStub speedBlockingStub;
    private static SpeedServiceGrpc.SpeedServiceStub speedAsyncStub;
    private static ServiceInfo gpsServiceInfo;
    private static ServiceInfo heartServiceInfo;
    private static ServiceInfo speedServiceInfo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUIClient window = new GUIClient();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void discoverGpsService(String service_type) {
        try {
            //Create JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            jmdns.addServiceListener(service_type, new ServiceListener() {

                @Override
                public void serviceResolved(ServiceEvent event) {
                    System.out.println("Order Product Service resolved: " + event.getInfo());
                    gpsServiceInfo = event.getInfo();
                    int port = gpsServiceInfo.getPort();
                    System.out.println("resolving " + service_type + " with properties ...");
                    System.out.println("\t port: " + port);
                    System.out.println("\t type:"+ event.getType());
                    System.out.println("\t name: " + event.getName());
                    System.out.println("\t description/properties: " + gpsServiceInfo.getNiceTextString());
                    System.out.println("\t host: " + gpsServiceInfo.getHostAddresses()[0]);
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println("gps Service removed: " + event.getInfo());
                }

                @Override
                public void serviceAdded(ServiceEvent event) {
                    System.out.println("gps Service added: " + event.getInfo());
                }
            });

            Thread.sleep(3000);
            jmdns.close();

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void discoverHeartService(String service_type) {
        try {
            //Create JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            jmdns.addServiceListener(service_type, new ServiceListener() {

                @Override
                public void serviceResolved(ServiceEvent event) {
                    System.out.println("Manage Stock Service resolved: " + event.getInfo());

                    heartServiceInfo = event.getInfo();

                    int port = heartServiceInfo.getPort();

                    System.out.println("resolving " + service_type + " with properties ...");
                    System.out.println("\t port: " + port);
                    System.out.println("\t type:"+ event.getType());
                    System.out.println("\t name: " + event.getName());
                    System.out.println("\t description/properties: " + heartServiceInfo.getNiceTextString());
                    System.out.println("\t host: " + heartServiceInfo.getHostAddresses()[0]);


                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println("Heart Service removed: " + event.getInfo());


                }

                @Override
                public void serviceAdded(ServiceEvent event) {
                    System.out.println("Heart Service added: " + event.getInfo());


                }
            });

            Thread.sleep(3000);
            jmdns.close();

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void discoverSpeedService(String service_type) {
        try {
            //Create JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            jmdns.addServiceListener(service_type, new ServiceListener() {

                @Override
                public void serviceResolved(ServiceEvent event) {
                    System.out.println("Deliver Product Service resolved: " + event.getInfo());
                    speedServiceInfo = event.getInfo();
                    int port = speedServiceInfo.getPort();
                    System.out.println("resolving " + service_type + " with properties ...");
                    System.out.println("\t port: " + port);
                    System.out.println("\t type:"+ event.getType());
                    System.out.println("\t name: " + event.getName());
                    System.out.println("\t description/properties: " + speedServiceInfo.getNiceTextString());
                    System.out.println("\t host: " + speedServiceInfo.getHostAddresses()[0]);
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println("Speed Service removed: " + event.getInfo());
                }

                @Override
                public void serviceAdded(ServiceEvent event) {
                    System.out.println("Speed Service added: " + event.getInfo());
                }
            });

            Thread.sleep(3000);
            jmdns.close();

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void getDestination(int x, int y,int distance) {
        try {
            StreamObserver<gpsResponse> responseObserver = new StreamObserver<gpsResponse>() {

                @Override
                public void onNext(gpsResponse msg) {
                    System.out.println("Displaying destination...");
                    System.out.println("x-axis: " + msg.getXAxis()+" y-axis: "+msg.getYAxis());


                }

                @Override
                public void onError(Throwable t) {
                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {

                    System.out.println("stream is completed");
                }

            };

            StreamObserver<gpsRequest> requestObserver = gpsAsyncStub.gps(responseObserver);
            try {
                requestObserver.onNext(gpsRequest.newBuilder().setXAxis(x).build());
                Thread.sleep(500);

                requestObserver.onNext(gpsRequest.newBuilder().setYAxis(y).build());
                Thread.sleep(500);

                requestObserver.onNext(gpsRequest.newBuilder().setDistance(distance).build());
                Thread.sleep(500);

                // Mark the end of requests
                requestObserver.onCompleted();

                Thread.sleep(5000);

            } catch (RuntimeException er) {
                er.printStackTrace();
            } catch (InterruptedException er) {
                er.printStackTrace();
            }
        } catch (Exception e) {

        }
    }
    public void getDistanceLeft(int x,int y){
        tdRequest request = tdRequest.newBuilder()
                .setXAxis(x)
                .setYAxis(y)
                .build();

        StreamObserver<tdResponse> responseStreamObserver=new StreamObserver<tdResponse>(){
            public void onNext(tdResponse value) {
                System.out.println(""+value.getDistanceLeft()+""+value.getTime());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("The stream is completed");
            }
        };
        gpsAsyncStub.timeDistance(request,responseStreamObserver);

    }
    public void howFast(int sp){
        try {
            StreamObserver<speedResponse> responseStreamObserver=new StreamObserver<speedResponse>() {
                @Override
                public void onNext(speedResponse value) {
                    System.out.println("You are going: "+value.getCurrentSpeed()+" meters a second");
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {
                    System.out.println("The stream is completed");
                }
            };
            StreamObserver<speedRequest> requestStreamObserver=speedAsyncStub.speed(responseStreamObserver);
            try {
                requestStreamObserver.onNext(speedRequest.newBuilder().setCurrentSpeed(sp).build());
                Thread.sleep(500);
                requestStreamObserver.onCompleted();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void howLong(int distance){
        howLongLeftRequest longReq=howLongLeftRequest.newBuilder().setDistanceLeft(distance).build();
        howLongLeftResponse longRes=speedBlockingStub.howLongLeft(longReq);
        System.out.println("roughly "+longRes.getTimeLeft()+" seconds");

    }
    public void slowDown(int hrate) {
        slowRequest request;
        if (hrate > 139) {
            request = slowRequest.newBuilder().setTooHigh(true).build();
        } else {
            request = slowRequest.newBuilder().setTooHigh(false).build();
        }
        slowResponse response = heartBlockingStub.slow(request);

    }
    public void getHeartRate(int hrate){
    heartRequest request=heartRequest.newBuilder().setHeartRate(hrate).build();
    StreamObserver<heartResponse>responseStreamObserver=new StreamObserver<heartResponse>() {
        @Override
        public void onNext(heartResponse value) {
            System.out.println("Your hear-rate is: "+value.getHeartRate());
        }

        @Override
        public void onError(Throwable t) {

        }

        @Override
        public void onCompleted() {

        }
    };
    heartAsyncStub.heart(request,responseStreamObserver);
    }
}


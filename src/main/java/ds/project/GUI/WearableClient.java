package ds.project.GUI;

import ds.project.gps.*;
import ds.project.heart.*;
import ds.project.speed.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class WearableClient extends  JFrame{
    private static GpsServiceGrpc.GpsServiceBlockingStub gpsBlockingStub;
    private static GpsServiceGrpc.GpsServiceStub gpsAsyncStub;
    private static HeartServiceGrpc.HeartServiceBlockingStub heartBlockingStub;
    private static HeartServiceGrpc.HeartServiceStub heartAsyncStub;
    private static SpeedServiceGrpc.SpeedServiceBlockingStub speedBlockingStub;
    private static SpeedServiceGrpc.SpeedServiceStub speedAsyncStub;
    private static ServiceInfo gpsServiceInfo;
    private static ServiceInfo heartServiceInfo;
    private static ServiceInfo speedServiceInfo;
    private JLabel travelDistanceLabel;
    private JPanel mainPane;
    private JTextField travelDistanceTextField;
    private JButton travelDistanceButton;
    private JLabel ditanceAndTimeLeftLabel;
    private JTextField distanceAndTimeLeftTextField;
    private JButton distanceAndTimeLeftButton;
    private JTextField timeLeftTextField;
    private JButton timeLeftButton;
    private JLabel timeLeftLabel;
    private JTextArea detailsTextArea;

    private static  int xaxis;
    private static  int yaxis;
    private static  int dleft;
    private static  int initialXaxis=100;
    private static  int initialYaxis=100;
    private static  int speed=1;

    public WearableClient(String title){
        super(title);
        ditanceAndTimeLeftLabel.setVisible(false);
        distanceAndTimeLeftTextField.setVisible(false);
        distanceAndTimeLeftButton.setVisible(false);
        timeLeftLabel.setVisible(false);
        timeLeftTextField.setVisible(false);
        timeLeftButton.setVisible(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPane);
        this.pack();
        setUp();
        travelDistanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int distance= Integer.parseInt(travelDistanceTextField.getText());
                travelDistanceTextField.setText("");
                System.out.println(distance);
                getDestination(initialXaxis,initialYaxis,distance);
                howFast(speed);

            }
        });
        distanceAndTimeLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getDistanceLeft(xaxis,yaxis);
            }
        });
        timeLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                howLong(dleft);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new WearableClient("Wearable Client");
        frame.setVisible(true);
    }

    private void discoverGpsService(String service_type) {
        try {
            //Create JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            jmdns.addServiceListener(service_type, new ServiceListener() {

                @Override
                public void serviceResolved(ServiceEvent event) {
                    System.out.println("GPS Service resolved: " + event.getInfo());
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
                    System.out.println("Heart rate Service resolved: " + event.getInfo());

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
                    System.out.println("Speed Service resolved: " + event.getInfo());
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
                public void onNext(gpsResponse value) {
                    System.out.println("Displaying destination...");
                    System.out.println("x-axis: " + value.getXAxis()+" y-axis: "+value.getYAxis());
                    xaxis= value.getXAxis();
                    yaxis=value.getYAxis();
                }

                @Override
                public void onError(Throwable t) {
                    t.printStackTrace();
                }

                @Override
                public void onCompleted() {
                    detailsTextArea.append("Set destination for coordinates: "+xaxis+", "+yaxis+" for a "+distance+"m distance from initial destination\n");
                    System.out.println("stream is completed");
                }

            };

            StreamObserver<gpsRequest> requestObserver = gpsAsyncStub.gps(responseObserver);
            try {
                requestObserver.onNext(gpsRequest.newBuilder().setXAxis(x).setYAxis(y).setDistance(distance).build());




                // Mark the end of requests
                requestObserver.onCompleted();

                Thread.sleep(500);

            } catch (RuntimeException er) {
                er.printStackTrace();
            } catch (InterruptedException er) {
                er.printStackTrace();
            }
        } catch (Exception e) {

        }
        ditanceAndTimeLeftLabel.setVisible(true);
        distanceAndTimeLeftTextField.setVisible(true);
        distanceAndTimeLeftButton.setVisible(true);
        timeLeftLabel.setVisible(true);
        timeLeftTextField.setVisible(true);
        timeLeftButton.setVisible(true);
    }
    public void getDistanceLeft(int x,int y){
        tdRequest request = tdRequest.newBuilder()
                .setXAxis(x)
                .setYAxis(y)
                .build();

        StreamObserver<tdResponse> responseStreamObserver=new StreamObserver<tdResponse>(){
            public void onNext(tdResponse value) {
                int currentLocation=(initialXaxis+initialYaxis)*2;
                int dLeft=value.getDistanceLeft()-currentLocation;
                dleft=dLeft;
                System.out.println("you have "+dLeft+" meters left, and have been running for "+value.getTime()+" seconds");
                distanceAndTimeLeftTextField.setText("you have "+value.getDistanceLeft()+" meters left, and have been running for "+value.getTime()+" seconds");
                detailsTextArea.append("you have "+value.getDistanceLeft()+" meters left, and have been running for "+value.getTime()+" seconds\n");
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
                    getHeartRate();
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
        System.out.println("wwwwwwwwwwwwwwwwwwwwwwww!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        timeLeftTextField.setText("roughly "+longRes.getTimeLeft()+" seconds of the run left at the current pace");
        detailsTextArea.append("roughly "+longRes.getTimeLeft()+" seconds of the run left at the current pace\n");


    }
    public void slowDown(int hrate) {
        slowRequest request = null;
        if (hrate > 139) {
            request = slowRequest.newBuilder().setTooHigh(true).build();
        }  if(hrate <= 139) {
            request = slowRequest.newBuilder().setTooHigh(false).build();
        }

        slowResponse response = heartBlockingStub.slow(request);

        boolean flag=response.getTooHigh();
        if(flag==true){
            JOptionPane.showMessageDialog(null, "Heart rate too high, please stop running.", "Shutting down", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else{

        }
    }
    public void getHeartRate(){
        heartRequest request=heartRequest.newBuilder().setHeartRate(100).build();
        StreamObserver<heartResponse>responseStreamObserver=new StreamObserver<heartResponse>() {
            @Override
            public void onNext(heartResponse value) {
                System.out.println("Your hear-rate is: "+value.getHeartRate());
                slowDown(value.getHeartRate());

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
    public void setUp() {

        System.out.println("1");
        String gpsService = "_gps._tcp.local.";
        String heartService = "_heart._tcp.local.";
        String speedService = "_speed._tcp.local.";
        System.out.println("2");
        discoverGpsService(gpsService);
        discoverHeartService(heartService);
        discoverSpeedService(speedService);

        System.out.println("3");

        try {
            String host = gpsServiceInfo.getHostAddresses()[0];
            System.out.println(host);
            int port = gpsServiceInfo.getPort();

            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress(host, port)
                    .usePlaintext()
                    .build();

            //stubs -- generate from proto
            gpsBlockingStub = GpsServiceGrpc.newBlockingStub(channel);
            gpsAsyncStub = GpsServiceGrpc.newStub(channel);


        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "No Host Detected! Check that server is running.", "No Host!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }


        try {
            String host = heartServiceInfo.getHostAddresses()[0];
            System.out.println(host);
            int port = heartServiceInfo.getPort();

            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress(host, port)
                    .usePlaintext()
                    .build();

            //stubs -- generate from proto
            heartBlockingStub = HeartServiceGrpc.newBlockingStub(channel);
            heartAsyncStub = HeartServiceGrpc.newStub(channel);


        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "No Host Detected! Check that server is running.", "No Host!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }


        try {
            String host = speedServiceInfo.getHostAddresses()[0];
            System.out.println(host);
            int port = speedServiceInfo.getPort();

            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress(host, port)
                    .usePlaintext()
                    .build();

            //stubs -- generate from proto
            speedBlockingStub = SpeedServiceGrpc.newBlockingStub(channel);
            speedAsyncStub = SpeedServiceGrpc.newStub(channel);


        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Can't find server, make sure all servers are running.", "No server", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }




    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

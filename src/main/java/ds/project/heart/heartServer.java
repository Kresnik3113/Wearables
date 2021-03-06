package ds.project.heart;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Random;

public class heartServer extends HeartServiceGrpc.HeartServiceImplBase {
    Random rand = new Random();
    int upperbound = 160;
    //generate random values from 0-160
    int hrate = rand.nextInt(upperbound);
    public static void main(String[] args){

        //create server object
        heartServer hserver=new heartServer();

        //assign properties
        Properties properties =hserver.getProperties();
        hserver.registerService(properties);

        //get the services port ()
        int port = Integer.valueOf(properties.getProperty("service_port"));

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(hserver)
                    .build()
                    .start();

            System.out.println("gpsServer has started, listening on port: " + port + "\n");
            server.awaitTermination();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    private Properties getProperties() {
        Properties properties = null;
        try (InputStream input = new FileInputStream("src/main/resources/heart.properties")) {
            properties = new Properties();
            // load a properties file
            properties.load(input);
            // get the property value and print it out
            System.out.println("gpsService properies ...");
            System.out.println("\t service_type: " + properties.getProperty("service_type"));
            System.out.println("\t service_name: " +properties.getProperty("service_name"));
            System.out.println("\t service_description: " +properties.getProperty("service_description"));
            System.out.println("\t service_port: " +properties.getProperty("service_port"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return properties;
    }

    private void registerService(Properties prop) {
        // TODO Auto-generated method stub
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
            String service_name = prop.getProperty("service_name")  ;// "example";

            int service_port = Integer.valueOf( prop.getProperty("service_port") );
            String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
            jmdns.registerService(serviceInfo);
            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
            // Wait a bit
            Thread.sleep(1000);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public StreamObserver<heartRequest> heart(StreamObserver<heartResponse> responseObserver) {
        return  new StreamObserver<heartRequest>() {
            @Override
            public void onNext(heartRequest value) {
                heartResponse response=heartResponse.newBuilder().setHeartRate(hrate).build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void slow(slowRequest request, StreamObserver<slowResponse> responseObserver) {
        System.out.println("1");
        boolean flag=request.getTooHigh();
        if (flag==true){
            System.out.println("2");
            slowResponse response=slowResponse.newBuilder().setTooHigh(true).build();
            responseObserver.onNext(response);
        }else {
            System.out.println("3");
            slowResponse response=slowResponse.newBuilder().setTooHigh(false).build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();

    }
}

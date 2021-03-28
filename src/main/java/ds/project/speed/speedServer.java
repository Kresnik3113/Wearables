package ds.project.speed;

import ds.project.heart.heartServer;
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

public class speedServer extends SpeedServiceGrpc.SpeedServiceImplBase {

    public static void main(String[] args){

        //create server object
        speedServer sserver=new speedServer();

        //assign properties
        Properties properties =sserver.getProperties();
        sserver.registerService(properties);

        //get the services port ()
        int port = Integer.valueOf(properties.getProperty("service_port"));

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(sserver)
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
        try (InputStream input = new FileInputStream("src/main/resources/gps.properties")) {
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
            // Unregister all services
            //jmdns.unregisterAllServices();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void howLongLeft(howLongLeftRequest request, StreamObserver<howLongLeftResponse> responseObserver) {
        super.howLongLeft(request, responseObserver);
    }

    @Override
    public StreamObserver<speedRequest> speed(StreamObserver<speedResponse> responseObserver) {
        return super.speed(responseObserver);
    }
}

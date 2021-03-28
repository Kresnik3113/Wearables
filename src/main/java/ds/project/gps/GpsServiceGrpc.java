package ds.project.gps;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *Create a service to offer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: gps.proto")
public final class GpsServiceGrpc {

  private GpsServiceGrpc() {}

  public static final String SERVICE_NAME = "gps.GpsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.project.gps.gpsRequest,
      ds.project.gps.gpsResponse> getGpsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "gps",
      requestType = ds.project.gps.gpsRequest.class,
      responseType = ds.project.gps.gpsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.project.gps.gpsRequest,
      ds.project.gps.gpsResponse> getGpsMethod() {
    io.grpc.MethodDescriptor<ds.project.gps.gpsRequest, ds.project.gps.gpsResponse> getGpsMethod;
    if ((getGpsMethod = GpsServiceGrpc.getGpsMethod) == null) {
      synchronized (GpsServiceGrpc.class) {
        if ((getGpsMethod = GpsServiceGrpc.getGpsMethod) == null) {
          GpsServiceGrpc.getGpsMethod = getGpsMethod = 
              io.grpc.MethodDescriptor.<ds.project.gps.gpsRequest, ds.project.gps.gpsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "gps.GpsService", "gps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.gps.gpsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.gps.gpsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GpsServiceMethodDescriptorSupplier("gps"))
                  .build();
          }
        }
     }
     return getGpsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.project.gps.tdRequest,
      ds.project.gps.tdResponse> getTimeDistanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "time_distance",
      requestType = ds.project.gps.tdRequest.class,
      responseType = ds.project.gps.tdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.project.gps.tdRequest,
      ds.project.gps.tdResponse> getTimeDistanceMethod() {
    io.grpc.MethodDescriptor<ds.project.gps.tdRequest, ds.project.gps.tdResponse> getTimeDistanceMethod;
    if ((getTimeDistanceMethod = GpsServiceGrpc.getTimeDistanceMethod) == null) {
      synchronized (GpsServiceGrpc.class) {
        if ((getTimeDistanceMethod = GpsServiceGrpc.getTimeDistanceMethod) == null) {
          GpsServiceGrpc.getTimeDistanceMethod = getTimeDistanceMethod = 
              io.grpc.MethodDescriptor.<ds.project.gps.tdRequest, ds.project.gps.tdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gps.GpsService", "time_distance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.gps.tdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.gps.tdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GpsServiceMethodDescriptorSupplier("time_distance"))
                  .build();
          }
        }
     }
     return getTimeDistanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GpsServiceStub newStub(io.grpc.Channel channel) {
    return new GpsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GpsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GpsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GpsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GpsServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static abstract class GpsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *RPC service 1 to 1, client sends a single request to the server and gets a single response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.project.gps.gpsRequest> gps(
        io.grpc.stub.StreamObserver<ds.project.gps.gpsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGpsMethod(), responseObserver);
    }

    /**
     */
    public void timeDistance(ds.project.gps.tdRequest request,
        io.grpc.stub.StreamObserver<ds.project.gps.tdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTimeDistanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGpsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.project.gps.gpsRequest,
                ds.project.gps.gpsResponse>(
                  this, METHODID_GPS)))
          .addMethod(
            getTimeDistanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.project.gps.tdRequest,
                ds.project.gps.tdResponse>(
                  this, METHODID_TIME_DISTANCE)))
          .build();
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class GpsServiceStub extends io.grpc.stub.AbstractStub<GpsServiceStub> {
    private GpsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GpsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GpsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *RPC service 1 to 1, client sends a single request to the server and gets a single response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.project.gps.gpsRequest> gps(
        io.grpc.stub.StreamObserver<ds.project.gps.gpsResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGpsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void timeDistance(ds.project.gps.tdRequest request,
        io.grpc.stub.StreamObserver<ds.project.gps.tdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTimeDistanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class GpsServiceBlockingStub extends io.grpc.stub.AbstractStub<GpsServiceBlockingStub> {
    private GpsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GpsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GpsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.project.gps.tdResponse timeDistance(ds.project.gps.tdRequest request) {
      return blockingUnaryCall(
          getChannel(), getTimeDistanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class GpsServiceFutureStub extends io.grpc.stub.AbstractStub<GpsServiceFutureStub> {
    private GpsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GpsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GpsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.project.gps.tdResponse> timeDistance(
        ds.project.gps.tdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTimeDistanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TIME_DISTANCE = 0;
  private static final int METHODID_GPS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GpsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GpsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TIME_DISTANCE:
          serviceImpl.timeDistance((ds.project.gps.tdRequest) request,
              (io.grpc.stub.StreamObserver<ds.project.gps.tdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GPS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gps(
              (io.grpc.stub.StreamObserver<ds.project.gps.gpsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GpsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GpsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.project.gps.GpsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GpsService");
    }
  }

  private static final class GpsServiceFileDescriptorSupplier
      extends GpsServiceBaseDescriptorSupplier {
    GpsServiceFileDescriptorSupplier() {}
  }

  private static final class GpsServiceMethodDescriptorSupplier
      extends GpsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GpsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GpsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GpsServiceFileDescriptorSupplier())
              .addMethod(getGpsMethod())
              .addMethod(getTimeDistanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}

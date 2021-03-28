package ds.project.speed;

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
    comments = "Source: speed.proto")
public final class SpeedServiceGrpc {

  private SpeedServiceGrpc() {}

  public static final String SERVICE_NAME = "speed.SpeedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.project.speed.speedRequest,
      ds.project.speed.speedResponse> getSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Speed",
      requestType = ds.project.speed.speedRequest.class,
      responseType = ds.project.speed.speedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.project.speed.speedRequest,
      ds.project.speed.speedResponse> getSpeedMethod() {
    io.grpc.MethodDescriptor<ds.project.speed.speedRequest, ds.project.speed.speedResponse> getSpeedMethod;
    if ((getSpeedMethod = SpeedServiceGrpc.getSpeedMethod) == null) {
      synchronized (SpeedServiceGrpc.class) {
        if ((getSpeedMethod = SpeedServiceGrpc.getSpeedMethod) == null) {
          SpeedServiceGrpc.getSpeedMethod = getSpeedMethod = 
              io.grpc.MethodDescriptor.<ds.project.speed.speedRequest, ds.project.speed.speedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "speed.SpeedService", "Speed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.speed.speedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.speed.speedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeedServiceMethodDescriptorSupplier("Speed"))
                  .build();
          }
        }
     }
     return getSpeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.project.speed.howLongLeftRequest,
      ds.project.speed.howLongLeftResponse> getHowLongLeftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "howLongLeft",
      requestType = ds.project.speed.howLongLeftRequest.class,
      responseType = ds.project.speed.howLongLeftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.project.speed.howLongLeftRequest,
      ds.project.speed.howLongLeftResponse> getHowLongLeftMethod() {
    io.grpc.MethodDescriptor<ds.project.speed.howLongLeftRequest, ds.project.speed.howLongLeftResponse> getHowLongLeftMethod;
    if ((getHowLongLeftMethod = SpeedServiceGrpc.getHowLongLeftMethod) == null) {
      synchronized (SpeedServiceGrpc.class) {
        if ((getHowLongLeftMethod = SpeedServiceGrpc.getHowLongLeftMethod) == null) {
          SpeedServiceGrpc.getHowLongLeftMethod = getHowLongLeftMethod = 
              io.grpc.MethodDescriptor.<ds.project.speed.howLongLeftRequest, ds.project.speed.howLongLeftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speed.SpeedService", "howLongLeft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.speed.howLongLeftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.speed.howLongLeftResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeedServiceMethodDescriptorSupplier("howLongLeft"))
                  .build();
          }
        }
     }
     return getHowLongLeftMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeedServiceStub newStub(io.grpc.Channel channel) {
    return new SpeedServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeedServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeedServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static abstract class SpeedServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *RPC service 1 to 1, client sends a single request to the server and gets a single response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.project.speed.speedRequest> speed(
        io.grpc.stub.StreamObserver<ds.project.speed.speedResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSpeedMethod(), responseObserver);
    }

    /**
     */
    public void howLongLeft(ds.project.speed.howLongLeftRequest request,
        io.grpc.stub.StreamObserver<ds.project.speed.howLongLeftResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHowLongLeftMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpeedMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.project.speed.speedRequest,
                ds.project.speed.speedResponse>(
                  this, METHODID_SPEED)))
          .addMethod(
            getHowLongLeftMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.project.speed.howLongLeftRequest,
                ds.project.speed.howLongLeftResponse>(
                  this, METHODID_HOW_LONG_LEFT)))
          .build();
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class SpeedServiceStub extends io.grpc.stub.AbstractStub<SpeedServiceStub> {
    private SpeedServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeedServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeedServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *RPC service 1 to 1, client sends a single request to the server and gets a single response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.project.speed.speedRequest> speed(
        io.grpc.stub.StreamObserver<ds.project.speed.speedResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSpeedMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void howLongLeft(ds.project.speed.howLongLeftRequest request,
        io.grpc.stub.StreamObserver<ds.project.speed.howLongLeftResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHowLongLeftMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class SpeedServiceBlockingStub extends io.grpc.stub.AbstractStub<SpeedServiceBlockingStub> {
    private SpeedServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeedServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeedServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeedServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.project.speed.howLongLeftResponse howLongLeft(ds.project.speed.howLongLeftRequest request) {
      return blockingUnaryCall(
          getChannel(), getHowLongLeftMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class SpeedServiceFutureStub extends io.grpc.stub.AbstractStub<SpeedServiceFutureStub> {
    private SpeedServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeedServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeedServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeedServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.project.speed.howLongLeftResponse> howLongLeft(
        ds.project.speed.howLongLeftRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHowLongLeftMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HOW_LONG_LEFT = 0;
  private static final int METHODID_SPEED = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HOW_LONG_LEFT:
          serviceImpl.howLongLeft((ds.project.speed.howLongLeftRequest) request,
              (io.grpc.stub.StreamObserver<ds.project.speed.howLongLeftResponse>) responseObserver);
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
        case METHODID_SPEED:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.speed(
              (io.grpc.stub.StreamObserver<ds.project.speed.speedResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SpeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.project.speed.SpeedServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpeedService");
    }
  }

  private static final class SpeedServiceFileDescriptorSupplier
      extends SpeedServiceBaseDescriptorSupplier {
    SpeedServiceFileDescriptorSupplier() {}
  }

  private static final class SpeedServiceMethodDescriptorSupplier
      extends SpeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpeedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeedServiceFileDescriptorSupplier())
              .addMethod(getSpeedMethod())
              .addMethod(getHowLongLeftMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package ds.project.heart;

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
    comments = "Source: heart.proto")
public final class HeartServiceGrpc {

  private HeartServiceGrpc() {}

  public static final String SERVICE_NAME = "heart.HeartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.project.heart.heartRequest,
      ds.project.heart.heartResponse> getHeartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heart",
      requestType = ds.project.heart.heartRequest.class,
      responseType = ds.project.heart.heartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.project.heart.heartRequest,
      ds.project.heart.heartResponse> getHeartMethod() {
    io.grpc.MethodDescriptor<ds.project.heart.heartRequest, ds.project.heart.heartResponse> getHeartMethod;
    if ((getHeartMethod = HeartServiceGrpc.getHeartMethod) == null) {
      synchronized (HeartServiceGrpc.class) {
        if ((getHeartMethod = HeartServiceGrpc.getHeartMethod) == null) {
          HeartServiceGrpc.getHeartMethod = getHeartMethod = 
              io.grpc.MethodDescriptor.<ds.project.heart.heartRequest, ds.project.heart.heartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "heart.HeartService", "Heart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.heart.heartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.heart.heartResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeartServiceMethodDescriptorSupplier("Heart"))
                  .build();
          }
        }
     }
     return getHeartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.project.heart.slowRequest,
      ds.project.heart.slowResponse> getUpdateStockLevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateStockLevels",
      requestType = ds.project.heart.slowRequest.class,
      responseType = ds.project.heart.slowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.project.heart.slowRequest,
      ds.project.heart.slowResponse> getUpdateStockLevelsMethod() {
    io.grpc.MethodDescriptor<ds.project.heart.slowRequest, ds.project.heart.slowResponse> getUpdateStockLevelsMethod;
    if ((getUpdateStockLevelsMethod = HeartServiceGrpc.getUpdateStockLevelsMethod) == null) {
      synchronized (HeartServiceGrpc.class) {
        if ((getUpdateStockLevelsMethod = HeartServiceGrpc.getUpdateStockLevelsMethod) == null) {
          HeartServiceGrpc.getUpdateStockLevelsMethod = getUpdateStockLevelsMethod = 
              io.grpc.MethodDescriptor.<ds.project.heart.slowRequest, ds.project.heart.slowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heart.HeartService", "updateStockLevels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.heart.slowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.heart.slowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeartServiceMethodDescriptorSupplier("updateStockLevels"))
                  .build();
          }
        }
     }
     return getUpdateStockLevelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeartServiceStub newStub(io.grpc.Channel channel) {
    return new HeartServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeartServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeartServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static abstract class HeartServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *RPC service 1 to 1, client sends a single request to the server and gets a single response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.project.heart.heartRequest> heart(
        io.grpc.stub.StreamObserver<ds.project.heart.heartResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getHeartMethod(), responseObserver);
    }

    /**
     */
    public void updateStockLevels(ds.project.heart.slowRequest request,
        io.grpc.stub.StreamObserver<ds.project.heart.slowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStockLevelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHeartMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.project.heart.heartRequest,
                ds.project.heart.heartResponse>(
                  this, METHODID_HEART)))
          .addMethod(
            getUpdateStockLevelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.project.heart.slowRequest,
                ds.project.heart.slowResponse>(
                  this, METHODID_UPDATE_STOCK_LEVELS)))
          .build();
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class HeartServiceStub extends io.grpc.stub.AbstractStub<HeartServiceStub> {
    private HeartServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *RPC service 1 to 1, client sends a single request to the server and gets a single response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.project.heart.heartRequest> heart(
        io.grpc.stub.StreamObserver<ds.project.heart.heartResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHeartMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void updateStockLevels(ds.project.heart.slowRequest request,
        io.grpc.stub.StreamObserver<ds.project.heart.slowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStockLevelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class HeartServiceBlockingStub extends io.grpc.stub.AbstractStub<HeartServiceBlockingStub> {
    private HeartServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.project.heart.slowResponse updateStockLevels(ds.project.heart.slowRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStockLevelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Create a service to offer.
   * </pre>
   */
  public static final class HeartServiceFutureStub extends io.grpc.stub.AbstractStub<HeartServiceFutureStub> {
    private HeartServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.project.heart.slowResponse> updateStockLevels(
        ds.project.heart.slowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStockLevelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_STOCK_LEVELS = 0;
  private static final int METHODID_HEART = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_STOCK_LEVELS:
          serviceImpl.updateStockLevels((ds.project.heart.slowRequest) request,
              (io.grpc.stub.StreamObserver<ds.project.heart.slowResponse>) responseObserver);
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
        case METHODID_HEART:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.heart(
              (io.grpc.stub.StreamObserver<ds.project.heart.heartResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HeartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.project.heart.HeartServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeartService");
    }
  }

  private static final class HeartServiceFileDescriptorSupplier
      extends HeartServiceBaseDescriptorSupplier {
    HeartServiceFileDescriptorSupplier() {}
  }

  private static final class HeartServiceMethodDescriptorSupplier
      extends HeartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeartServiceFileDescriptorSupplier())
              .addMethod(getHeartMethod())
              .addMethod(getUpdateStockLevelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

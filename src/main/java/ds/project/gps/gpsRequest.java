// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gps.proto

package ds.project.gps;

/**
 * <pre>
 *The gps request to be used by the defined service.
 * </pre>
 *
 * Protobuf type {@code gps.gpsRequest}
 */
public  final class gpsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gps.gpsRequest)
    gpsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use gpsRequest.newBuilder() to construct.
  private gpsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private gpsRequest() {
    xAxis_ = 0;
    yAxis_ = 0;
    distance_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private gpsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            xAxis_ = input.readInt32();
            break;
          }
          case 16: {

            yAxis_ = input.readInt32();
            break;
          }
          case 24: {

            distance_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.project.gps.GpsServiceImpl.internal_static_gps_gpsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.project.gps.GpsServiceImpl.internal_static_gps_gpsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.project.gps.gpsRequest.class, ds.project.gps.gpsRequest.Builder.class);
  }

  public static final int X_AXIS_FIELD_NUMBER = 1;
  private int xAxis_;
  /**
   * <code>int32 x_axis = 1;</code>
   */
  public int getXAxis() {
    return xAxis_;
  }

  public static final int Y_AXIS_FIELD_NUMBER = 2;
  private int yAxis_;
  /**
   * <code>int32 y_axis = 2;</code>
   */
  public int getYAxis() {
    return yAxis_;
  }

  public static final int DISTANCE_FIELD_NUMBER = 3;
  private int distance_;
  /**
   * <code>int32 distance = 3;</code>
   */
  public int getDistance() {
    return distance_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (xAxis_ != 0) {
      output.writeInt32(1, xAxis_);
    }
    if (yAxis_ != 0) {
      output.writeInt32(2, yAxis_);
    }
    if (distance_ != 0) {
      output.writeInt32(3, distance_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (xAxis_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, xAxis_);
    }
    if (yAxis_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, yAxis_);
    }
    if (distance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, distance_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.project.gps.gpsRequest)) {
      return super.equals(obj);
    }
    ds.project.gps.gpsRequest other = (ds.project.gps.gpsRequest) obj;

    boolean result = true;
    result = result && (getXAxis()
        == other.getXAxis());
    result = result && (getYAxis()
        == other.getYAxis());
    result = result && (getDistance()
        == other.getDistance());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + X_AXIS_FIELD_NUMBER;
    hash = (53 * hash) + getXAxis();
    hash = (37 * hash) + Y_AXIS_FIELD_NUMBER;
    hash = (53 * hash) + getYAxis();
    hash = (37 * hash) + DISTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getDistance();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.project.gps.gpsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.gps.gpsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.gps.gpsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.gps.gpsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.gps.gpsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.gps.gpsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.gps.gpsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.project.gps.gpsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.project.gps.gpsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.project.gps.gpsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.project.gps.gpsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.project.gps.gpsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.project.gps.gpsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *The gps request to be used by the defined service.
   * </pre>
   *
   * Protobuf type {@code gps.gpsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gps.gpsRequest)
      ds.project.gps.gpsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.project.gps.GpsServiceImpl.internal_static_gps_gpsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.project.gps.GpsServiceImpl.internal_static_gps_gpsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.project.gps.gpsRequest.class, ds.project.gps.gpsRequest.Builder.class);
    }

    // Construct using ds.project.gps.gpsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      xAxis_ = 0;

      yAxis_ = 0;

      distance_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.project.gps.GpsServiceImpl.internal_static_gps_gpsRequest_descriptor;
    }

    @java.lang.Override
    public ds.project.gps.gpsRequest getDefaultInstanceForType() {
      return ds.project.gps.gpsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.project.gps.gpsRequest build() {
      ds.project.gps.gpsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.project.gps.gpsRequest buildPartial() {
      ds.project.gps.gpsRequest result = new ds.project.gps.gpsRequest(this);
      result.xAxis_ = xAxis_;
      result.yAxis_ = yAxis_;
      result.distance_ = distance_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.project.gps.gpsRequest) {
        return mergeFrom((ds.project.gps.gpsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.project.gps.gpsRequest other) {
      if (other == ds.project.gps.gpsRequest.getDefaultInstance()) return this;
      if (other.getXAxis() != 0) {
        setXAxis(other.getXAxis());
      }
      if (other.getYAxis() != 0) {
        setYAxis(other.getYAxis());
      }
      if (other.getDistance() != 0) {
        setDistance(other.getDistance());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.project.gps.gpsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.project.gps.gpsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int xAxis_ ;
    /**
     * <code>int32 x_axis = 1;</code>
     */
    public int getXAxis() {
      return xAxis_;
    }
    /**
     * <code>int32 x_axis = 1;</code>
     */
    public Builder setXAxis(int value) {
      
      xAxis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 x_axis = 1;</code>
     */
    public Builder clearXAxis() {
      
      xAxis_ = 0;
      onChanged();
      return this;
    }

    private int yAxis_ ;
    /**
     * <code>int32 y_axis = 2;</code>
     */
    public int getYAxis() {
      return yAxis_;
    }
    /**
     * <code>int32 y_axis = 2;</code>
     */
    public Builder setYAxis(int value) {
      
      yAxis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 y_axis = 2;</code>
     */
    public Builder clearYAxis() {
      
      yAxis_ = 0;
      onChanged();
      return this;
    }

    private int distance_ ;
    /**
     * <code>int32 distance = 3;</code>
     */
    public int getDistance() {
      return distance_;
    }
    /**
     * <code>int32 distance = 3;</code>
     */
    public Builder setDistance(int value) {
      
      distance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 distance = 3;</code>
     */
    public Builder clearDistance() {
      
      distance_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:gps.gpsRequest)
  }

  // @@protoc_insertion_point(class_scope:gps.gpsRequest)
  private static final ds.project.gps.gpsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.project.gps.gpsRequest();
  }

  public static ds.project.gps.gpsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<gpsRequest>
      PARSER = new com.google.protobuf.AbstractParser<gpsRequest>() {
    @java.lang.Override
    public gpsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new gpsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<gpsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<gpsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.project.gps.gpsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


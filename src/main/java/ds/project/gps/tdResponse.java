// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gps.proto

package ds.project.gps;

/**
 * Protobuf type {@code gps.tdResponse}
 */
public  final class tdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gps.tdResponse)
    tdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use tdResponse.newBuilder() to construct.
  private tdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private tdResponse() {
    distanceLeft_ = 0;
    time_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private tdResponse(
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

            distanceLeft_ = input.readInt32();
            break;
          }
          case 16: {

            time_ = input.readInt32();
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
    return ds.project.gps.GpsServiceImpl.internal_static_gps_tdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.project.gps.GpsServiceImpl.internal_static_gps_tdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.project.gps.tdResponse.class, ds.project.gps.tdResponse.Builder.class);
  }

  public static final int DISTANCELEFT_FIELD_NUMBER = 1;
  private int distanceLeft_;
  /**
   * <code>int32 distanceLeft = 1;</code>
   */
  public int getDistanceLeft() {
    return distanceLeft_;
  }

  public static final int TIME_FIELD_NUMBER = 2;
  private int time_;
  /**
   * <code>int32 time = 2;</code>
   */
  public int getTime() {
    return time_;
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
    if (distanceLeft_ != 0) {
      output.writeInt32(1, distanceLeft_);
    }
    if (time_ != 0) {
      output.writeInt32(2, time_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (distanceLeft_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, distanceLeft_);
    }
    if (time_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, time_);
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
    if (!(obj instanceof ds.project.gps.tdResponse)) {
      return super.equals(obj);
    }
    ds.project.gps.tdResponse other = (ds.project.gps.tdResponse) obj;

    boolean result = true;
    result = result && (getDistanceLeft()
        == other.getDistanceLeft());
    result = result && (getTime()
        == other.getTime());
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
    hash = (37 * hash) + DISTANCELEFT_FIELD_NUMBER;
    hash = (53 * hash) + getDistanceLeft();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + getTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.project.gps.tdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.gps.tdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.gps.tdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.gps.tdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.gps.tdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.gps.tdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.gps.tdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.project.gps.tdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.project.gps.tdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.project.gps.tdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.project.gps.tdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.project.gps.tdResponse parseFrom(
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
  public static Builder newBuilder(ds.project.gps.tdResponse prototype) {
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
   * Protobuf type {@code gps.tdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gps.tdResponse)
      ds.project.gps.tdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.project.gps.GpsServiceImpl.internal_static_gps_tdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.project.gps.GpsServiceImpl.internal_static_gps_tdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.project.gps.tdResponse.class, ds.project.gps.tdResponse.Builder.class);
    }

    // Construct using ds.project.gps.tdResponse.newBuilder()
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
      distanceLeft_ = 0;

      time_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.project.gps.GpsServiceImpl.internal_static_gps_tdResponse_descriptor;
    }

    @java.lang.Override
    public ds.project.gps.tdResponse getDefaultInstanceForType() {
      return ds.project.gps.tdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.project.gps.tdResponse build() {
      ds.project.gps.tdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.project.gps.tdResponse buildPartial() {
      ds.project.gps.tdResponse result = new ds.project.gps.tdResponse(this);
      result.distanceLeft_ = distanceLeft_;
      result.time_ = time_;
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
      if (other instanceof ds.project.gps.tdResponse) {
        return mergeFrom((ds.project.gps.tdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.project.gps.tdResponse other) {
      if (other == ds.project.gps.tdResponse.getDefaultInstance()) return this;
      if (other.getDistanceLeft() != 0) {
        setDistanceLeft(other.getDistanceLeft());
      }
      if (other.getTime() != 0) {
        setTime(other.getTime());
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
      ds.project.gps.tdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.project.gps.tdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int distanceLeft_ ;
    /**
     * <code>int32 distanceLeft = 1;</code>
     */
    public int getDistanceLeft() {
      return distanceLeft_;
    }
    /**
     * <code>int32 distanceLeft = 1;</code>
     */
    public Builder setDistanceLeft(int value) {
      
      distanceLeft_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 distanceLeft = 1;</code>
     */
    public Builder clearDistanceLeft() {
      
      distanceLeft_ = 0;
      onChanged();
      return this;
    }

    private int time_ ;
    /**
     * <code>int32 time = 2;</code>
     */
    public int getTime() {
      return time_;
    }
    /**
     * <code>int32 time = 2;</code>
     */
    public Builder setTime(int value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 time = 2;</code>
     */
    public Builder clearTime() {
      
      time_ = 0;
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


    // @@protoc_insertion_point(builder_scope:gps.tdResponse)
  }

  // @@protoc_insertion_point(class_scope:gps.tdResponse)
  private static final ds.project.gps.tdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.project.gps.tdResponse();
  }

  public static ds.project.gps.tdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<tdResponse>
      PARSER = new com.google.protobuf.AbstractParser<tdResponse>() {
    @java.lang.Override
    public tdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new tdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<tdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<tdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.project.gps.tdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

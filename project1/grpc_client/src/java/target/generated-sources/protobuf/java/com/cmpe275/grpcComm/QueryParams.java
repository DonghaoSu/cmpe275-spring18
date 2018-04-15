// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package com.cmpe275.grpcComm;

/**
 * Protobuf type {@code grpcComm.QueryParams}
 */
public  final class QueryParams extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpcComm.QueryParams)
    QueryParamsOrBuilder {
  // Use QueryParams.newBuilder() to construct.
  private QueryParams(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private QueryParams() {
    fromUtc_ = "";
    toUtc_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private QueryParams(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            fromUtc_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            toUtc_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_QueryParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_QueryParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cmpe275.grpcComm.QueryParams.class, com.cmpe275.grpcComm.QueryParams.Builder.class);
  }

  public static final int FROM_UTC_FIELD_NUMBER = 1;
  private volatile java.lang.Object fromUtc_;
  /**
   * <code>optional string from_utc = 1;</code>
   */
  public java.lang.String getFromUtc() {
    java.lang.Object ref = fromUtc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromUtc_ = s;
      return s;
    }
  }
  /**
   * <code>optional string from_utc = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFromUtcBytes() {
    java.lang.Object ref = fromUtc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromUtc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_UTC_FIELD_NUMBER = 2;
  private volatile java.lang.Object toUtc_;
  /**
   * <code>optional string to_utc = 2;</code>
   */
  public java.lang.String getToUtc() {
    java.lang.Object ref = toUtc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toUtc_ = s;
      return s;
    }
  }
  /**
   * <code>optional string to_utc = 2;</code>
   */
  public com.google.protobuf.ByteString
      getToUtcBytes() {
    java.lang.Object ref = toUtc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toUtc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFromUtcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, fromUtc_);
    }
    if (!getToUtcBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, toUtc_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFromUtcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, fromUtc_);
    }
    if (!getToUtcBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, toUtc_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.cmpe275.grpcComm.QueryParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.QueryParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.QueryParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.QueryParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.QueryParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.cmpe275.grpcComm.QueryParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.QueryParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.cmpe275.grpcComm.QueryParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.QueryParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.cmpe275.grpcComm.QueryParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.cmpe275.grpcComm.QueryParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpcComm.QueryParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpcComm.QueryParams)
      com.cmpe275.grpcComm.QueryParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_QueryParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_QueryParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cmpe275.grpcComm.QueryParams.class, com.cmpe275.grpcComm.QueryParams.Builder.class);
    }

    // Construct using com.cmpe275.grpcComm.QueryParams.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      fromUtc_ = "";

      toUtc_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_QueryParams_descriptor;
    }

    public com.cmpe275.grpcComm.QueryParams getDefaultInstanceForType() {
      return com.cmpe275.grpcComm.QueryParams.getDefaultInstance();
    }

    public com.cmpe275.grpcComm.QueryParams build() {
      com.cmpe275.grpcComm.QueryParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cmpe275.grpcComm.QueryParams buildPartial() {
      com.cmpe275.grpcComm.QueryParams result = new com.cmpe275.grpcComm.QueryParams(this);
      result.fromUtc_ = fromUtc_;
      result.toUtc_ = toUtc_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cmpe275.grpcComm.QueryParams) {
        return mergeFrom((com.cmpe275.grpcComm.QueryParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cmpe275.grpcComm.QueryParams other) {
      if (other == com.cmpe275.grpcComm.QueryParams.getDefaultInstance()) return this;
      if (!other.getFromUtc().isEmpty()) {
        fromUtc_ = other.fromUtc_;
        onChanged();
      }
      if (!other.getToUtc().isEmpty()) {
        toUtc_ = other.toUtc_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.cmpe275.grpcComm.QueryParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cmpe275.grpcComm.QueryParams) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fromUtc_ = "";
    /**
     * <code>optional string from_utc = 1;</code>
     */
    public java.lang.String getFromUtc() {
      java.lang.Object ref = fromUtc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromUtc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string from_utc = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromUtcBytes() {
      java.lang.Object ref = fromUtc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromUtc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string from_utc = 1;</code>
     */
    public Builder setFromUtc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fromUtc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string from_utc = 1;</code>
     */
    public Builder clearFromUtc() {
      
      fromUtc_ = getDefaultInstance().getFromUtc();
      onChanged();
      return this;
    }
    /**
     * <code>optional string from_utc = 1;</code>
     */
    public Builder setFromUtcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fromUtc_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object toUtc_ = "";
    /**
     * <code>optional string to_utc = 2;</code>
     */
    public java.lang.String getToUtc() {
      java.lang.Object ref = toUtc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toUtc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string to_utc = 2;</code>
     */
    public com.google.protobuf.ByteString
        getToUtcBytes() {
      java.lang.Object ref = toUtc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toUtc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string to_utc = 2;</code>
     */
    public Builder setToUtc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toUtc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string to_utc = 2;</code>
     */
    public Builder clearToUtc() {
      
      toUtc_ = getDefaultInstance().getToUtc();
      onChanged();
      return this;
    }
    /**
     * <code>optional string to_utc = 2;</code>
     */
    public Builder setToUtcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toUtc_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpcComm.QueryParams)
  }

  // @@protoc_insertion_point(class_scope:grpcComm.QueryParams)
  private static final com.cmpe275.grpcComm.QueryParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cmpe275.grpcComm.QueryParams();
  }

  public static com.cmpe275.grpcComm.QueryParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryParams>
      PARSER = new com.google.protobuf.AbstractParser<QueryParams>() {
    public QueryParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new QueryParams(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<QueryParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryParams> getParserForType() {
    return PARSER;
  }

  public com.cmpe275.grpcComm.QueryParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package com.cmpe275.grpcComm;

/**
 * Protobuf type {@code grpcComm.PutRequest}
 */
public  final class PutRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpcComm.PutRequest)
    PutRequestOrBuilder {
  // Use PutRequest.newBuilder() to construct.
  private PutRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PutRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PutRequest(
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
            com.cmpe275.grpcComm.MetaData.Builder subBuilder = null;
            if (metaData_ != null) {
              subBuilder = metaData_.toBuilder();
            }
            metaData_ = input.readMessage(com.cmpe275.grpcComm.MetaData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metaData_);
              metaData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.cmpe275.grpcComm.DatFragment.Builder subBuilder = null;
            if (datFragment_ != null) {
              subBuilder = datFragment_.toBuilder();
            }
            datFragment_ = input.readMessage(com.cmpe275.grpcComm.DatFragment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(datFragment_);
              datFragment_ = subBuilder.buildPartial();
            }

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
    return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_PutRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_PutRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cmpe275.grpcComm.PutRequest.class, com.cmpe275.grpcComm.PutRequest.Builder.class);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  private com.cmpe275.grpcComm.MetaData metaData_;
  /**
   * <code>optional .grpcComm.MetaData metaData = 1;</code>
   */
  public boolean hasMetaData() {
    return metaData_ != null;
  }
  /**
   * <code>optional .grpcComm.MetaData metaData = 1;</code>
   */
  public com.cmpe275.grpcComm.MetaData getMetaData() {
    return metaData_ == null ? com.cmpe275.grpcComm.MetaData.getDefaultInstance() : metaData_;
  }
  /**
   * <code>optional .grpcComm.MetaData metaData = 1;</code>
   */
  public com.cmpe275.grpcComm.MetaDataOrBuilder getMetaDataOrBuilder() {
    return getMetaData();
  }

  public static final int DATFRAGMENT_FIELD_NUMBER = 2;
  private com.cmpe275.grpcComm.DatFragment datFragment_;
  /**
   * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
   */
  public boolean hasDatFragment() {
    return datFragment_ != null;
  }
  /**
   * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
   */
  public com.cmpe275.grpcComm.DatFragment getDatFragment() {
    return datFragment_ == null ? com.cmpe275.grpcComm.DatFragment.getDefaultInstance() : datFragment_;
  }
  /**
   * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
   */
  public com.cmpe275.grpcComm.DatFragmentOrBuilder getDatFragmentOrBuilder() {
    return getDatFragment();
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
    if (metaData_ != null) {
      output.writeMessage(1, getMetaData());
    }
    if (datFragment_ != null) {
      output.writeMessage(2, getDatFragment());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metaData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetaData());
    }
    if (datFragment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDatFragment());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.cmpe275.grpcComm.PutRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.PutRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.PutRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cmpe275.grpcComm.PutRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.PutRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.cmpe275.grpcComm.PutRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.PutRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.cmpe275.grpcComm.PutRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.cmpe275.grpcComm.PutRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.cmpe275.grpcComm.PutRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.cmpe275.grpcComm.PutRequest prototype) {
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
   * Protobuf type {@code grpcComm.PutRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpcComm.PutRequest)
      com.cmpe275.grpcComm.PutRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_PutRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_PutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cmpe275.grpcComm.PutRequest.class, com.cmpe275.grpcComm.PutRequest.Builder.class);
    }

    // Construct using com.cmpe275.grpcComm.PutRequest.newBuilder()
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
      if (metaDataBuilder_ == null) {
        metaData_ = null;
      } else {
        metaData_ = null;
        metaDataBuilder_ = null;
      }
      if (datFragmentBuilder_ == null) {
        datFragment_ = null;
      } else {
        datFragment_ = null;
        datFragmentBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cmpe275.grpcComm.DataProto.internal_static_grpcComm_PutRequest_descriptor;
    }

    public com.cmpe275.grpcComm.PutRequest getDefaultInstanceForType() {
      return com.cmpe275.grpcComm.PutRequest.getDefaultInstance();
    }

    public com.cmpe275.grpcComm.PutRequest build() {
      com.cmpe275.grpcComm.PutRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cmpe275.grpcComm.PutRequest buildPartial() {
      com.cmpe275.grpcComm.PutRequest result = new com.cmpe275.grpcComm.PutRequest(this);
      if (metaDataBuilder_ == null) {
        result.metaData_ = metaData_;
      } else {
        result.metaData_ = metaDataBuilder_.build();
      }
      if (datFragmentBuilder_ == null) {
        result.datFragment_ = datFragment_;
      } else {
        result.datFragment_ = datFragmentBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cmpe275.grpcComm.PutRequest) {
        return mergeFrom((com.cmpe275.grpcComm.PutRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cmpe275.grpcComm.PutRequest other) {
      if (other == com.cmpe275.grpcComm.PutRequest.getDefaultInstance()) return this;
      if (other.hasMetaData()) {
        mergeMetaData(other.getMetaData());
      }
      if (other.hasDatFragment()) {
        mergeDatFragment(other.getDatFragment());
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
      com.cmpe275.grpcComm.PutRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cmpe275.grpcComm.PutRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.cmpe275.grpcComm.MetaData metaData_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.cmpe275.grpcComm.MetaData, com.cmpe275.grpcComm.MetaData.Builder, com.cmpe275.grpcComm.MetaDataOrBuilder> metaDataBuilder_;
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    public boolean hasMetaData() {
      return metaDataBuilder_ != null || metaData_ != null;
    }
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    public com.cmpe275.grpcComm.MetaData getMetaData() {
      if (metaDataBuilder_ == null) {
        return metaData_ == null ? com.cmpe275.grpcComm.MetaData.getDefaultInstance() : metaData_;
      } else {
        return metaDataBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    public Builder setMetaData(com.cmpe275.grpcComm.MetaData value) {
      if (metaDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metaData_ = value;
        onChanged();
      } else {
        metaDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    public Builder setMetaData(
        com.cmpe275.grpcComm.MetaData.Builder builderForValue) {
      if (metaDataBuilder_ == null) {
        metaData_ = builderForValue.build();
        onChanged();
      } else {
        metaDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    public Builder mergeMetaData(com.cmpe275.grpcComm.MetaData value) {
      if (metaDataBuilder_ == null) {
        if (metaData_ != null) {
          metaData_ =
            com.cmpe275.grpcComm.MetaData.newBuilder(metaData_).mergeFrom(value).buildPartial();
        } else {
          metaData_ = value;
        }
        onChanged();
      } else {
        metaDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    public Builder clearMetaData() {
      if (metaDataBuilder_ == null) {
        metaData_ = null;
        onChanged();
      } else {
        metaData_ = null;
        metaDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    public com.cmpe275.grpcComm.MetaData.Builder getMetaDataBuilder() {
      
      onChanged();
      return getMetaDataFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    public com.cmpe275.grpcComm.MetaDataOrBuilder getMetaDataOrBuilder() {
      if (metaDataBuilder_ != null) {
        return metaDataBuilder_.getMessageOrBuilder();
      } else {
        return metaData_ == null ?
            com.cmpe275.grpcComm.MetaData.getDefaultInstance() : metaData_;
      }
    }
    /**
     * <code>optional .grpcComm.MetaData metaData = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.cmpe275.grpcComm.MetaData, com.cmpe275.grpcComm.MetaData.Builder, com.cmpe275.grpcComm.MetaDataOrBuilder> 
        getMetaDataFieldBuilder() {
      if (metaDataBuilder_ == null) {
        metaDataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.cmpe275.grpcComm.MetaData, com.cmpe275.grpcComm.MetaData.Builder, com.cmpe275.grpcComm.MetaDataOrBuilder>(
                getMetaData(),
                getParentForChildren(),
                isClean());
        metaData_ = null;
      }
      return metaDataBuilder_;
    }

    private com.cmpe275.grpcComm.DatFragment datFragment_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.cmpe275.grpcComm.DatFragment, com.cmpe275.grpcComm.DatFragment.Builder, com.cmpe275.grpcComm.DatFragmentOrBuilder> datFragmentBuilder_;
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    public boolean hasDatFragment() {
      return datFragmentBuilder_ != null || datFragment_ != null;
    }
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    public com.cmpe275.grpcComm.DatFragment getDatFragment() {
      if (datFragmentBuilder_ == null) {
        return datFragment_ == null ? com.cmpe275.grpcComm.DatFragment.getDefaultInstance() : datFragment_;
      } else {
        return datFragmentBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    public Builder setDatFragment(com.cmpe275.grpcComm.DatFragment value) {
      if (datFragmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datFragment_ = value;
        onChanged();
      } else {
        datFragmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    public Builder setDatFragment(
        com.cmpe275.grpcComm.DatFragment.Builder builderForValue) {
      if (datFragmentBuilder_ == null) {
        datFragment_ = builderForValue.build();
        onChanged();
      } else {
        datFragmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    public Builder mergeDatFragment(com.cmpe275.grpcComm.DatFragment value) {
      if (datFragmentBuilder_ == null) {
        if (datFragment_ != null) {
          datFragment_ =
            com.cmpe275.grpcComm.DatFragment.newBuilder(datFragment_).mergeFrom(value).buildPartial();
        } else {
          datFragment_ = value;
        }
        onChanged();
      } else {
        datFragmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    public Builder clearDatFragment() {
      if (datFragmentBuilder_ == null) {
        datFragment_ = null;
        onChanged();
      } else {
        datFragment_ = null;
        datFragmentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    public com.cmpe275.grpcComm.DatFragment.Builder getDatFragmentBuilder() {
      
      onChanged();
      return getDatFragmentFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    public com.cmpe275.grpcComm.DatFragmentOrBuilder getDatFragmentOrBuilder() {
      if (datFragmentBuilder_ != null) {
        return datFragmentBuilder_.getMessageOrBuilder();
      } else {
        return datFragment_ == null ?
            com.cmpe275.grpcComm.DatFragment.getDefaultInstance() : datFragment_;
      }
    }
    /**
     * <code>optional .grpcComm.DatFragment datFragment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.cmpe275.grpcComm.DatFragment, com.cmpe275.grpcComm.DatFragment.Builder, com.cmpe275.grpcComm.DatFragmentOrBuilder> 
        getDatFragmentFieldBuilder() {
      if (datFragmentBuilder_ == null) {
        datFragmentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.cmpe275.grpcComm.DatFragment, com.cmpe275.grpcComm.DatFragment.Builder, com.cmpe275.grpcComm.DatFragmentOrBuilder>(
                getDatFragment(),
                getParentForChildren(),
                isClean());
        datFragment_ = null;
      }
      return datFragmentBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpcComm.PutRequest)
  }

  // @@protoc_insertion_point(class_scope:grpcComm.PutRequest)
  private static final com.cmpe275.grpcComm.PutRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cmpe275.grpcComm.PutRequest();
  }

  public static com.cmpe275.grpcComm.PutRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PutRequest>
      PARSER = new com.google.protobuf.AbstractParser<PutRequest>() {
    public PutRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new PutRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<PutRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PutRequest> getParserForType() {
    return PARSER;
  }

  public com.cmpe275.grpcComm.PutRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GravenInnocencePhotoFinishReq.proto

package emu.grasscutter.net.proto;

public final class GravenInnocencePhotoFinishReqOuterClass {
  private GravenInnocencePhotoFinishReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GravenInnocencePhotoFinishReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GravenInnocencePhotoFinishReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 param = 1;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>uint32 object_id = 4;</code>
     * @return The objectId.
     */
    int getObjectId();
  }
  /**
   * <pre>
   * CmdId: 21750
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GravenInnocencePhotoFinishReq}
   */
  public static final class GravenInnocencePhotoFinishReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GravenInnocencePhotoFinishReq)
      GravenInnocencePhotoFinishReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GravenInnocencePhotoFinishReq.newBuilder() to construct.
    private GravenInnocencePhotoFinishReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GravenInnocencePhotoFinishReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GravenInnocencePhotoFinishReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GravenInnocencePhotoFinishReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              param_ = input.readUInt32();
              break;
            }
            case 32: {

              objectId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.internal_static_GravenInnocencePhotoFinishReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.internal_static_GravenInnocencePhotoFinishReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq.class, emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq.Builder.class);
    }

    public static final int PARAM_FIELD_NUMBER = 1;
    private int param_;
    /**
     * <code>uint32 param = 1;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int OBJECT_ID_FIELD_NUMBER = 4;
    private int objectId_;
    /**
     * <code>uint32 object_id = 4;</code>
     * @return The objectId.
     */
    @java.lang.Override
    public int getObjectId() {
      return objectId_;
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
      if (param_ != 0) {
        output.writeUInt32(1, param_);
      }
      if (objectId_ != 0) {
        output.writeUInt32(4, objectId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, param_);
      }
      if (objectId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, objectId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq other = (emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq) obj;

      if (getParam()
          != other.getParam()) return false;
      if (getObjectId()
          != other.getObjectId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getObjectId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq prototype) {
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
     * CmdId: 21750
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GravenInnocencePhotoFinishReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GravenInnocencePhotoFinishReq)
        emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.internal_static_GravenInnocencePhotoFinishReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.internal_static_GravenInnocencePhotoFinishReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq.class, emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq.newBuilder()
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
        param_ = 0;

        objectId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.internal_static_GravenInnocencePhotoFinishReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq build() {
        emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq buildPartial() {
        emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq result = new emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq(this);
        result.param_ = param_;
        result.objectId_ = objectId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq) {
          return mergeFrom((emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq other) {
        if (other == emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq.getDefaultInstance()) return this;
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.getObjectId() != 0) {
          setObjectId(other.getObjectId());
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
        emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 1;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 1;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private int objectId_ ;
      /**
       * <code>uint32 object_id = 4;</code>
       * @return The objectId.
       */
      @java.lang.Override
      public int getObjectId() {
        return objectId_;
      }
      /**
       * <code>uint32 object_id = 4;</code>
       * @param value The objectId to set.
       * @return This builder for chaining.
       */
      public Builder setObjectId(int value) {
        
        objectId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 object_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearObjectId() {
        
        objectId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GravenInnocencePhotoFinishReq)
    }

    // @@protoc_insertion_point(class_scope:GravenInnocencePhotoFinishReq)
    private static final emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq();
    }

    public static emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GravenInnocencePhotoFinishReq>
        PARSER = new com.google.protobuf.AbstractParser<GravenInnocencePhotoFinishReq>() {
      @java.lang.Override
      public GravenInnocencePhotoFinishReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GravenInnocencePhotoFinishReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GravenInnocencePhotoFinishReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GravenInnocencePhotoFinishReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GravenInnocencePhotoFinishReqOuterClass.GravenInnocencePhotoFinishReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GravenInnocencePhotoFinishReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GravenInnocencePhotoFinishReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GravenInnocencePhotoFinishReq.proto\"A\n" +
      "\035GravenInnocencePhotoFinishReq\022\r\n\005param\030" +
      "\001 \001(\r\022\021\n\tobject_id\030\004 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GravenInnocencePhotoFinishReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GravenInnocencePhotoFinishReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GravenInnocencePhotoFinishReq_descriptor,
        new java.lang.String[] { "Param", "ObjectId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

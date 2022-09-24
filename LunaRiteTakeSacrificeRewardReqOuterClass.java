// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LunaRiteTakeSacrificeRewardReq.proto

package emu.grasscutter.net.proto;

public final class LunaRiteTakeSacrificeRewardReqOuterClass {
  private LunaRiteTakeSacrificeRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LunaRiteTakeSacrificeRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LunaRiteTakeSacrificeRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 area_id = 11;</code>
     * @return The areaId.
     */
    int getAreaId();

    /**
     * <code>uint32 index = 3;</code>
     * @return The index.
     */
    int getIndex();
  }
  /**
   * <pre>
   * CmdId: 8045
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code LunaRiteTakeSacrificeRewardReq}
   */
  public static final class LunaRiteTakeSacrificeRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LunaRiteTakeSacrificeRewardReq)
      LunaRiteTakeSacrificeRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LunaRiteTakeSacrificeRewardReq.newBuilder() to construct.
    private LunaRiteTakeSacrificeRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LunaRiteTakeSacrificeRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LunaRiteTakeSacrificeRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LunaRiteTakeSacrificeRewardReq(
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
            case 24: {

              index_ = input.readUInt32();
              break;
            }
            case 88: {

              areaId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.internal_static_LunaRiteTakeSacrificeRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.internal_static_LunaRiteTakeSacrificeRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq.class, emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq.Builder.class);
    }

    public static final int AREA_ID_FIELD_NUMBER = 11;
    private int areaId_;
    /**
     * <code>uint32 area_id = 11;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
    }

    public static final int INDEX_FIELD_NUMBER = 3;
    private int index_;
    /**
     * <code>uint32 index = 3;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
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
      if (index_ != 0) {
        output.writeUInt32(3, index_);
      }
      if (areaId_ != 0) {
        output.writeUInt32(11, areaId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, index_);
      }
      if (areaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, areaId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq other = (emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq) obj;

      if (getAreaId()
          != other.getAreaId()) return false;
      if (getIndex()
          != other.getIndex()) return false;
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
      hash = (37 * hash) + AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAreaId();
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq prototype) {
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
     * CmdId: 8045
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code LunaRiteTakeSacrificeRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LunaRiteTakeSacrificeRewardReq)
        emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.internal_static_LunaRiteTakeSacrificeRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.internal_static_LunaRiteTakeSacrificeRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq.class, emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq.newBuilder()
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
        areaId_ = 0;

        index_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.internal_static_LunaRiteTakeSacrificeRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq build() {
        emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq buildPartial() {
        emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq result = new emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq(this);
        result.areaId_ = areaId_;
        result.index_ = index_;
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
        if (other instanceof emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq other) {
        if (other == emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq.getDefaultInstance()) return this;
        if (other.getAreaId() != 0) {
          setAreaId(other.getAreaId());
        }
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
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
        emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int areaId_ ;
      /**
       * <code>uint32 area_id = 11;</code>
       * @return The areaId.
       */
      @java.lang.Override
      public int getAreaId() {
        return areaId_;
      }
      /**
       * <code>uint32 area_id = 11;</code>
       * @param value The areaId to set.
       * @return This builder for chaining.
       */
      public Builder setAreaId(int value) {
        
        areaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 area_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaId() {
        
        areaId_ = 0;
        onChanged();
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 3;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 3;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LunaRiteTakeSacrificeRewardReq)
    }

    // @@protoc_insertion_point(class_scope:LunaRiteTakeSacrificeRewardReq)
    private static final emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq();
    }

    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LunaRiteTakeSacrificeRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<LunaRiteTakeSacrificeRewardReq>() {
      @java.lang.Override
      public LunaRiteTakeSacrificeRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LunaRiteTakeSacrificeRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LunaRiteTakeSacrificeRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LunaRiteTakeSacrificeRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardReqOuterClass.LunaRiteTakeSacrificeRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunaRiteTakeSacrificeRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunaRiteTakeSacrificeRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$LunaRiteTakeSacrificeRewardReq.proto\"@" +
      "\n\036LunaRiteTakeSacrificeRewardReq\022\017\n\007area" +
      "_id\030\013 \001(\r\022\r\n\005index\030\003 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LunaRiteTakeSacrificeRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LunaRiteTakeSacrificeRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunaRiteTakeSacrificeRewardReq_descriptor,
        new java.lang.String[] { "AreaId", "Index", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeWidgetBackgroundActiveStateReq.proto

package emu.grasscutter.net.proto;

public final class ChangeWidgetBackgroundActiveStateReqOuterClass {
  private ChangeWidgetBackgroundActiveStateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeWidgetBackgroundActiveStateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeWidgetBackgroundActiveStateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_active = 15;</code>
     * @return The isActive.
     */
    boolean getIsActive();

    /**
     * <code>uint32 material_id = 3;</code>
     * @return The materialId.
     */
    int getMaterialId();
  }
  /**
   * <pre>
   * CmdId: 5907
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ChangeWidgetBackgroundActiveStateReq}
   */
  public static final class ChangeWidgetBackgroundActiveStateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeWidgetBackgroundActiveStateReq)
      ChangeWidgetBackgroundActiveStateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeWidgetBackgroundActiveStateReq.newBuilder() to construct.
    private ChangeWidgetBackgroundActiveStateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeWidgetBackgroundActiveStateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeWidgetBackgroundActiveStateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeWidgetBackgroundActiveStateReq(
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

              materialId_ = input.readUInt32();
              break;
            }
            case 120: {

              isActive_ = input.readBool();
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
      return emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.class, emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.Builder.class);
    }

    public static final int IS_ACTIVE_FIELD_NUMBER = 15;
    private boolean isActive_;
    /**
     * <code>bool is_active = 15;</code>
     * @return The isActive.
     */
    @java.lang.Override
    public boolean getIsActive() {
      return isActive_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 3;
    private int materialId_;
    /**
     * <code>uint32 material_id = 3;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
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
      if (materialId_ != 0) {
        output.writeUInt32(3, materialId_);
      }
      if (isActive_ != false) {
        output.writeBool(15, isActive_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, materialId_);
      }
      if (isActive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isActive_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq other = (emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq) obj;

      if (getIsActive()
          != other.getIsActive()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
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
      hash = (37 * hash) + IS_ACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActive());
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq prototype) {
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
     * CmdId: 5907
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ChangeWidgetBackgroundActiveStateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeWidgetBackgroundActiveStateReq)
        emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.class, emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.newBuilder()
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
        isActive_ = false;

        materialId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq build() {
        emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq buildPartial() {
        emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq result = new emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq(this);
        result.isActive_ = isActive_;
        result.materialId_ = materialId_;
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
        if (other instanceof emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq) {
          return mergeFrom((emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq other) {
        if (other == emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq.getDefaultInstance()) return this;
        if (other.getIsActive() != false) {
          setIsActive(other.getIsActive());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
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
        emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isActive_ ;
      /**
       * <code>bool is_active = 15;</code>
       * @return The isActive.
       */
      @java.lang.Override
      public boolean getIsActive() {
        return isActive_;
      }
      /**
       * <code>bool is_active = 15;</code>
       * @param value The isActive to set.
       * @return This builder for chaining.
       */
      public Builder setIsActive(boolean value) {
        
        isActive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_active = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActive() {
        
        isActive_ = false;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 3;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 3;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChangeWidgetBackgroundActiveStateReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeWidgetBackgroundActiveStateReq)
    private static final emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq();
    }

    public static emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeWidgetBackgroundActiveStateReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeWidgetBackgroundActiveStateReq>() {
      @java.lang.Override
      public ChangeWidgetBackgroundActiveStateReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeWidgetBackgroundActiveStateReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeWidgetBackgroundActiveStateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeWidgetBackgroundActiveStateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChangeWidgetBackgroundActiveStateReqOuterClass.ChangeWidgetBackgroundActiveStateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeWidgetBackgroundActiveStateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*ChangeWidgetBackgroundActiveStateReq.p" +
      "roto\"N\n$ChangeWidgetBackgroundActiveStat" +
      "eReq\022\021\n\tis_active\030\017 \001(\010\022\023\n\013material_id\030\003" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeWidgetBackgroundActiveStateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeWidgetBackgroundActiveStateReq_descriptor,
        new java.lang.String[] { "IsActive", "MaterialId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

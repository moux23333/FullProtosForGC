// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GearActivityFinishPlayGearRsp.proto

package emu.grasscutter.net.proto;

public final class GearActivityFinishPlayGearRspOuterClass {
  private GearActivityFinishPlayGearRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GearActivityFinishPlayGearRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GearActivityFinishPlayGearRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_success = 15;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * CmdId: 21800
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GearActivityFinishPlayGearRsp}
   */
  public static final class GearActivityFinishPlayGearRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GearActivityFinishPlayGearRsp)
      GearActivityFinishPlayGearRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GearActivityFinishPlayGearRsp.newBuilder() to construct.
    private GearActivityFinishPlayGearRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GearActivityFinishPlayGearRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GearActivityFinishPlayGearRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GearActivityFinishPlayGearRsp(
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
            case 16: {

              retcode_ = input.readInt32();
              break;
            }
            case 24: {

              levelId_ = input.readUInt32();
              break;
            }
            case 120: {

              isSuccess_ = input.readBool();
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
      return emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.internal_static_GearActivityFinishPlayGearRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.internal_static_GearActivityFinishPlayGearRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp.class, emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 15;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 15;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 3;
    private int levelId_;
    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(3, levelId_);
      }
      if (isSuccess_ != false) {
        output.writeBool(15, isSuccess_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, levelId_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isSuccess_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp other = (emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp prototype) {
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
     * CmdId: 21800
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GearActivityFinishPlayGearRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GearActivityFinishPlayGearRsp)
        emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.internal_static_GearActivityFinishPlayGearRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.internal_static_GearActivityFinishPlayGearRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp.class, emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp.newBuilder()
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
        retcode_ = 0;

        isSuccess_ = false;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.internal_static_GearActivityFinishPlayGearRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp build() {
        emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp buildPartial() {
        emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp result = new emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp(this);
        result.retcode_ = retcode_;
        result.isSuccess_ = isSuccess_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp other) {
        if (other == emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 15;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 15;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 3;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GearActivityFinishPlayGearRsp)
    }

    // @@protoc_insertion_point(class_scope:GearActivityFinishPlayGearRsp)
    private static final emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp();
    }

    public static emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GearActivityFinishPlayGearRsp>
        PARSER = new com.google.protobuf.AbstractParser<GearActivityFinishPlayGearRsp>() {
      @java.lang.Override
      public GearActivityFinishPlayGearRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GearActivityFinishPlayGearRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GearActivityFinishPlayGearRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GearActivityFinishPlayGearRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GearActivityFinishPlayGearRspOuterClass.GearActivityFinishPlayGearRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GearActivityFinishPlayGearRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GearActivityFinishPlayGearRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GearActivityFinishPlayGearRsp.proto\"V\n" +
      "\035GearActivityFinishPlayGearRsp\022\017\n\007retcod" +
      "e\030\002 \001(\005\022\022\n\nis_success\030\017 \001(\010\022\020\n\010level_id\030" +
      "\003 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GearActivityFinishPlayGearRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GearActivityFinishPlayGearRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GearActivityFinishPlayGearRsp_descriptor,
        new java.lang.String[] { "Retcode", "IsSuccess", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

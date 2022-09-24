// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetBattlePassViewedRsp.proto

package emu.grasscutter.net.proto;

public final class SetBattlePassViewedRspOuterClass {
  private SetBattlePassViewedRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetBattlePassViewedRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetBattlePassViewedRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 2;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2642
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SetBattlePassViewedRsp}
   */
  public static final class SetBattlePassViewedRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetBattlePassViewedRsp)
      SetBattlePassViewedRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetBattlePassViewedRsp.newBuilder() to construct.
    private SetBattlePassViewedRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetBattlePassViewedRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetBattlePassViewedRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetBattlePassViewedRsp(
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

              scheduleId_ = input.readUInt32();
              break;
            }
            case 24: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp.class, emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp.Builder.class);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 2;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 2;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (scheduleId_ != 0) {
        output.writeUInt32(2, scheduleId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, scheduleId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp other = (emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp prototype) {
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
     * CmdId: 2642
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SetBattlePassViewedRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetBattlePassViewedRsp)
        emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp.class, emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp.newBuilder()
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
        scheduleId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp build() {
        emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp buildPartial() {
        emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp result = new emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp(this);
        result.scheduleId_ = scheduleId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp other) {
        if (other == emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 2;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 2;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SetBattlePassViewedRsp)
    }

    // @@protoc_insertion_point(class_scope:SetBattlePassViewedRsp)
    private static final emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp();
    }

    public static emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetBattlePassViewedRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetBattlePassViewedRsp>() {
      @java.lang.Override
      public SetBattlePassViewedRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetBattlePassViewedRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetBattlePassViewedRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetBattlePassViewedRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetBattlePassViewedRspOuterClass.SetBattlePassViewedRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetBattlePassViewedRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetBattlePassViewedRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetBattlePassViewedRsp.proto\">\n\026SetBat" +
      "tlePassViewedRsp\022\023\n\013schedule_id\030\002 \001(\r\022\017\n" +
      "\007retcode\030\003 \001(\005B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetBattlePassViewedRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetBattlePassViewedRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetBattlePassViewedRsp_descriptor,
        new java.lang.String[] { "ScheduleId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

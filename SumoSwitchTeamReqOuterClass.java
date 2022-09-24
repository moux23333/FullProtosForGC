// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoSwitchTeamReq.proto

package emu.grasscutter.net.proto;

public final class SumoSwitchTeamReqOuterClass {
  private SumoSwitchTeamReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoSwitchTeamReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoSwitchTeamReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 9;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 activity_id = 5;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * CmdId: 8351
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SumoSwitchTeamReq}
   */
  public static final class SumoSwitchTeamReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoSwitchTeamReq)
      SumoSwitchTeamReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoSwitchTeamReq.newBuilder() to construct.
    private SumoSwitchTeamReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoSwitchTeamReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoSwitchTeamReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SumoSwitchTeamReq(
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
            case 40: {

              activityId_ = input.readUInt32();
              break;
            }
            case 72: {

              stageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.internal_static_SumoSwitchTeamReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.internal_static_SumoSwitchTeamReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq.class, emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 9;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 9;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 5;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 5;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
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
      if (activityId_ != 0) {
        output.writeUInt32(5, activityId_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(9, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, activityId_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq other = (emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq prototype) {
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
     * CmdId: 8351
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SumoSwitchTeamReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoSwitchTeamReq)
        emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.internal_static_SumoSwitchTeamReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.internal_static_SumoSwitchTeamReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq.class, emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq.newBuilder()
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
        stageId_ = 0;

        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.internal_static_SumoSwitchTeamReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq build() {
        emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq buildPartial() {
        emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq result = new emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq(this);
        result.stageId_ = stageId_;
        result.activityId_ = activityId_;
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
        if (other instanceof emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq) {
          return mergeFrom((emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq other) {
        if (other == emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
        emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 9;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 9;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 5;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 5;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SumoSwitchTeamReq)
    }

    // @@protoc_insertion_point(class_scope:SumoSwitchTeamReq)
    private static final emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq();
    }

    public static emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoSwitchTeamReq>
        PARSER = new com.google.protobuf.AbstractParser<SumoSwitchTeamReq>() {
      @java.lang.Override
      public SumoSwitchTeamReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SumoSwitchTeamReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SumoSwitchTeamReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoSwitchTeamReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SumoSwitchTeamReqOuterClass.SumoSwitchTeamReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoSwitchTeamReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoSwitchTeamReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027SumoSwitchTeamReq.proto\":\n\021SumoSwitchT" +
      "eamReq\022\020\n\010stage_id\030\t \001(\r\022\023\n\013activity_id\030" +
      "\005 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SumoSwitchTeamReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoSwitchTeamReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoSwitchTeamReq_descriptor,
        new java.lang.String[] { "StageId", "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

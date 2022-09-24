// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeGiveUpRsp.proto

package emu.grasscutter.net.proto;

public final class RoguelikeGiveUpRspOuterClass {
  private RoguelikeGiveUpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeGiveUpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeGiveUpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
     * @return The settleInfo.
     */
    emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getSettleInfo();
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
     */
    emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getSettleInfoOrBuilder();

    public emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.InfoCase getInfoCase();
  }
  /**
   * <pre>
   * CmdId: 8139
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code RoguelikeGiveUpRsp}
   */
  public static final class RoguelikeGiveUpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeGiveUpRsp)
      RoguelikeGiveUpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeGiveUpRsp.newBuilder() to construct.
    private RoguelikeGiveUpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeGiveUpRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeGiveUpRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeGiveUpRsp(
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
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 56: {

              stageId_ = input.readUInt32();
              break;
            }
            case 66: {
              emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder subBuilder = null;
              if (infoCase_ == 8) {
                subBuilder = ((emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_).toBuilder();
              }
              info_ =
                  input.readMessage(emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_);
                info_ = subBuilder.buildPartial();
              }
              infoCase_ = 8;
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
      return emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.class, emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.Builder.class);
    }

    private int infoCase_ = 0;
    private java.lang.Object info_;
    public enum InfoCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      SETTLE_INFO(8),
      INFO_NOT_SET(0);
      private final int value;
      private InfoCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static InfoCase valueOf(int value) {
        return forNumber(value);
      }

      public static InfoCase forNumber(int value) {
        switch (value) {
          case 8: return SETTLE_INFO;
          case 0: return INFO_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public InfoCase
    getInfoCase() {
      return InfoCase.forNumber(
          infoCase_);
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 7;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 8;
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return infoCase_ == 8;
    }
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getSettleInfo() {
      if (infoCase_ == 8) {
         return (emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_;
      }
      return emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
    }
    /**
     * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getSettleInfoOrBuilder() {
      if (infoCase_ == 8) {
         return (emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_;
      }
      return emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
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
        output.writeInt32(4, retcode_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(7, stageId_);
      }
      if (infoCase_ == 8) {
        output.writeMessage(8, (emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_);
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
          .computeInt32Size(4, retcode_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, stageId_);
      }
      if (infoCase_ == 8) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, (emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp other = (emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (!getInfoCase().equals(other.getInfoCase())) return false;
      switch (infoCase_) {
        case 8:
          if (!getSettleInfo()
              .equals(other.getSettleInfo())) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      switch (infoCase_) {
        case 8:
          hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
          hash = (53 * hash) + getSettleInfo().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp prototype) {
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
     * CmdId: 8139
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code RoguelikeGiveUpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeGiveUpRsp)
        emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.class, emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.newBuilder()
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

        stageId_ = 0;

        infoCase_ = 0;
        info_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.internal_static_RoguelikeGiveUpRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp build() {
        emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp buildPartial() {
        emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp result = new emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp(this);
        result.retcode_ = retcode_;
        result.stageId_ = stageId_;
        if (infoCase_ == 8) {
          if (settleInfoBuilder_ == null) {
            result.info_ = info_;
          } else {
            result.info_ = settleInfoBuilder_.build();
          }
        }
        result.infoCase_ = infoCase_;
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
        if (other instanceof emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp) {
          return mergeFrom((emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp other) {
        if (other == emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        switch (other.getInfoCase()) {
          case SETTLE_INFO: {
            mergeSettleInfo(other.getSettleInfo());
            break;
          }
          case INFO_NOT_SET: {
            break;
          }
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
        emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int infoCase_ = 0;
      private java.lang.Object info_;
      public InfoCase
          getInfoCase() {
        return InfoCase.forNumber(
            infoCase_);
      }

      public Builder clearInfo() {
        infoCase_ = 0;
        info_ = null;
        onChanged();
        return this;
      }


      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       * @return Whether the settleInfo field is set.
       */
      @java.lang.Override
      public boolean hasSettleInfo() {
        return infoCase_ == 8;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       * @return The settleInfo.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          if (infoCase_ == 8) {
            return (emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_;
          }
          return emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
        } else {
          if (infoCase_ == 8) {
            return settleInfoBuilder_.getMessage();
          }
          return emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       */
      public Builder setSettleInfo(emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }
        infoCase_ = 8;
        return this;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       */
      public Builder setSettleInfo(
          emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }
        infoCase_ = 8;
        return this;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       */
      public Builder mergeSettleInfo(emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (infoCase_ == 8 &&
              info_ != emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance()) {
            info_ = emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.newBuilder((emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_)
                .mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          if (infoCase_ == 8) {
            settleInfoBuilder_.mergeFrom(value);
          }
          settleInfoBuilder_.setMessage(value);
        }
        infoCase_ = 8;
        return this;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          if (infoCase_ == 8) {
            infoCase_ = 0;
            info_ = null;
            onChanged();
          }
        } else {
          if (infoCase_ == 8) {
            infoCase_ = 0;
            info_ = null;
          }
          settleInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       */
      public emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder getSettleInfoBuilder() {
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getSettleInfoOrBuilder() {
        if ((infoCase_ == 8) && (settleInfoBuilder_ != null)) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          if (infoCase_ == 8) {
            return (emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_;
          }
          return emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.RoguelikeDungeonSettleInfo settle_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          if (!(infoCase_ == 8)) {
            info_ = emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
          }
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder>(
                  (emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo) info_,
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        infoCase_ = 8;
        onChanged();;
        return settleInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeGiveUpRsp)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeGiveUpRsp)
    private static final emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp();
    }

    public static emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeGiveUpRsp>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeGiveUpRsp>() {
      @java.lang.Override
      public RoguelikeGiveUpRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeGiveUpRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeGiveUpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeGiveUpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeGiveUpRspOuterClass.RoguelikeGiveUpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeGiveUpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeGiveUpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RoguelikeGiveUpRsp.proto\032 RoguelikeDun" +
      "geonSettleInfo.proto\"s\n\022RoguelikeGiveUpR" +
      "sp\022\017\n\007retcode\030\004 \001(\005\022\020\n\010stage_id\030\007 \001(\r\0222\n" +
      "\013settle_info\030\010 \001(\0132\033.RoguelikeDungeonSet" +
      "tleInfoH\000B\006\n\004infoB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.getDescriptor(),
        });
    internal_static_RoguelikeGiveUpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeGiveUpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeGiveUpRsp_descriptor,
        new java.lang.String[] { "Retcode", "StageId", "SettleInfo", "Info", });
    emu.grasscutter.net.proto.RoguelikeDungeonSettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
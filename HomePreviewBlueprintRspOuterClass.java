// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePreviewBlueprintRsp.proto

package emu.grasscutter.net.proto;

public final class HomePreviewBlueprintRspOuterClass {
  private HomePreviewBlueprintRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePreviewBlueprintRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePreviewBlueprintRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
     * @return Whether the sceneArrangementInfo field is set.
     */
    boolean hasSceneArrangementInfo();
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
     * @return The sceneArrangementInfo.
     */
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo();
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
     */
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>string share_code = 14;</code>
     * @return The shareCode.
     */
    java.lang.String getShareCode();
    /**
     * <code>string share_code = 14;</code>
     * @return The bytes for shareCode.
     */
    com.google.protobuf.ByteString
        getShareCodeBytes();
  }
  /**
   * <pre>
   * CmdId: 4738
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomePreviewBlueprintRsp}
   */
  public static final class HomePreviewBlueprintRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePreviewBlueprintRsp)
      HomePreviewBlueprintRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePreviewBlueprintRsp.newBuilder() to construct.
    private HomePreviewBlueprintRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePreviewBlueprintRsp() {
      shareCode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePreviewBlueprintRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomePreviewBlueprintRsp(
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
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 98: {
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder subBuilder = null;
              if (sceneArrangementInfo_ != null) {
                subBuilder = sceneArrangementInfo_.toBuilder();
              }
              sceneArrangementInfo_ = input.readMessage(emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sceneArrangementInfo_);
                sceneArrangementInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();

              shareCode_ = s;
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
      return emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.internal_static_HomePreviewBlueprintRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.internal_static_HomePreviewBlueprintRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp.class, emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp.Builder.class);
    }

    public static final int SCENE_ARRANGEMENT_INFO_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
     * @return Whether the sceneArrangementInfo field is set.
     */
    @java.lang.Override
    public boolean hasSceneArrangementInfo() {
      return sceneArrangementInfo_ != null;
    }
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
     * @return The sceneArrangementInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
      return sceneArrangementInfo_ == null ? emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
    }
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
      return getSceneArrangementInfo();
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SHARE_CODE_FIELD_NUMBER = 14;
    private volatile java.lang.Object shareCode_;
    /**
     * <code>string share_code = 14;</code>
     * @return The shareCode.
     */
    @java.lang.Override
    public java.lang.String getShareCode() {
      java.lang.Object ref = shareCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareCode_ = s;
        return s;
      }
    }
    /**
     * <code>string share_code = 14;</code>
     * @return The bytes for shareCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getShareCodeBytes() {
      java.lang.Object ref = shareCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
        output.writeInt32(11, retcode_);
      }
      if (sceneArrangementInfo_ != null) {
        output.writeMessage(12, getSceneArrangementInfo());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareCode_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, shareCode_);
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
          .computeInt32Size(11, retcode_);
      }
      if (sceneArrangementInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getSceneArrangementInfo());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareCode_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, shareCode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp other = (emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp) obj;

      if (hasSceneArrangementInfo() != other.hasSceneArrangementInfo()) return false;
      if (hasSceneArrangementInfo()) {
        if (!getSceneArrangementInfo()
            .equals(other.getSceneArrangementInfo())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getShareCode()
          .equals(other.getShareCode())) return false;
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
      if (hasSceneArrangementInfo()) {
        hash = (37 * hash) + SCENE_ARRANGEMENT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSceneArrangementInfo().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SHARE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getShareCode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp prototype) {
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
     * CmdId: 4738
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomePreviewBlueprintRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePreviewBlueprintRsp)
        emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.internal_static_HomePreviewBlueprintRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.internal_static_HomePreviewBlueprintRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp.class, emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp.newBuilder()
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
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = null;
        } else {
          sceneArrangementInfo_ = null;
          sceneArrangementInfoBuilder_ = null;
        }
        retcode_ = 0;

        shareCode_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.internal_static_HomePreviewBlueprintRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp build() {
        emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp buildPartial() {
        emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp result = new emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp(this);
        if (sceneArrangementInfoBuilder_ == null) {
          result.sceneArrangementInfo_ = sceneArrangementInfo_;
        } else {
          result.sceneArrangementInfo_ = sceneArrangementInfoBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.shareCode_ = shareCode_;
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
        if (other instanceof emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp other) {
        if (other == emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp.getDefaultInstance()) return this;
        if (other.hasSceneArrangementInfo()) {
          mergeSceneArrangementInfo(other.getSceneArrangementInfo());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.getShareCode().isEmpty()) {
          shareCode_ = other.shareCode_;
          onChanged();
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
        emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> sceneArrangementInfoBuilder_;
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       * @return Whether the sceneArrangementInfo field is set.
       */
      public boolean hasSceneArrangementInfo() {
        return sceneArrangementInfoBuilder_ != null || sceneArrangementInfo_ != null;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       * @return The sceneArrangementInfo.
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
        if (sceneArrangementInfoBuilder_ == null) {
          return sceneArrangementInfo_ == null ? emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
        } else {
          return sceneArrangementInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       */
      public Builder setSceneArrangementInfo(emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          sceneArrangementInfo_ = value;
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       */
      public Builder setSceneArrangementInfo(
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = builderForValue.build();
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       */
      public Builder mergeSceneArrangementInfo(emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoBuilder_ == null) {
          if (sceneArrangementInfo_ != null) {
            sceneArrangementInfo_ =
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.newBuilder(sceneArrangementInfo_).mergeFrom(value).buildPartial();
          } else {
            sceneArrangementInfo_ = value;
          }
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       */
      public Builder clearSceneArrangementInfo() {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = null;
          onChanged();
        } else {
          sceneArrangementInfo_ = null;
          sceneArrangementInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder getSceneArrangementInfoBuilder() {
        
        onChanged();
        return getSceneArrangementInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
        if (sceneArrangementInfoBuilder_ != null) {
          return sceneArrangementInfoBuilder_.getMessageOrBuilder();
        } else {
          return sceneArrangementInfo_ == null ?
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
        }
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> 
          getSceneArrangementInfoFieldBuilder() {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder>(
                  getSceneArrangementInfo(),
                  getParentForChildren(),
                  isClean());
          sceneArrangementInfo_ = null;
        }
        return sceneArrangementInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object shareCode_ = "";
      /**
       * <code>string share_code = 14;</code>
       * @return The shareCode.
       */
      public java.lang.String getShareCode() {
        java.lang.Object ref = shareCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          shareCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string share_code = 14;</code>
       * @return The bytes for shareCode.
       */
      public com.google.protobuf.ByteString
          getShareCodeBytes() {
        java.lang.Object ref = shareCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          shareCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string share_code = 14;</code>
       * @param value The shareCode to set.
       * @return This builder for chaining.
       */
      public Builder setShareCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        shareCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string share_code = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearShareCode() {
        
        shareCode_ = getDefaultInstance().getShareCode();
        onChanged();
        return this;
      }
      /**
       * <code>string share_code = 14;</code>
       * @param value The bytes for shareCode to set.
       * @return This builder for chaining.
       */
      public Builder setShareCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        shareCode_ = value;
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


      // @@protoc_insertion_point(builder_scope:HomePreviewBlueprintRsp)
    }

    // @@protoc_insertion_point(class_scope:HomePreviewBlueprintRsp)
    private static final emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp();
    }

    public static emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePreviewBlueprintRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomePreviewBlueprintRsp>() {
      @java.lang.Override
      public HomePreviewBlueprintRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomePreviewBlueprintRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomePreviewBlueprintRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePreviewBlueprintRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomePreviewBlueprintRspOuterClass.HomePreviewBlueprintRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePreviewBlueprintRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePreviewBlueprintRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035HomePreviewBlueprintRsp.proto\032\036HomeSce" +
      "neArrangementInfo.proto\"y\n\027HomePreviewBl" +
      "ueprintRsp\0229\n\026scene_arrangement_info\030\014 \001" +
      "(\0132\031.HomeSceneArrangementInfo\022\017\n\007retcode" +
      "\030\013 \001(\005\022\022\n\nshare_code\030\016 \001(\tB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.getDescriptor(),
        });
    internal_static_HomePreviewBlueprintRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePreviewBlueprintRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePreviewBlueprintRsp_descriptor,
        new java.lang.String[] { "SceneArrangementInfo", "Retcode", "ShareCode", });
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

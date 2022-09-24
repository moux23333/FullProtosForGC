// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_LLBCFCDMCID.proto

package emu.grasscutter.net.proto;

public final class Unk3000LLBCFCDMCID {
  private Unk3000LLBCFCDMCID() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_LLBCFCDMCIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_LLBCFCDMCID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 difficulty = 2;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> 
        getAvatarInfoListList();
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE getAvatarInfoList(int index);
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    int getAvatarInfoListCount();
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> 
        getAvatarInfoListOrBuilderList();
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder getAvatarInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 24312
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_LLBCFCDMCID}
   */
  public static final class Unk3000_LLBCFCDMCID extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_LLBCFCDMCID)
      Unk3000_LLBCFCDMCIDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_LLBCFCDMCID.newBuilder() to construct.
    private Unk3000_LLBCFCDMCID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_LLBCFCDMCID() {
      avatarInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_LLBCFCDMCID();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_LLBCFCDMCID(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              difficulty_ = input.readUInt32();
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE>();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.parser(), extensionRegistry));
              break;
            }
            case 104: {

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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.internal_static_Unk3000_LLBCFCDMCID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.internal_static_Unk3000_LLBCFCDMCID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID.class, emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 13;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 2;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 2;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int AVATAR_INFO_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> avatarInfoList_;
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> getAvatarInfoListList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> 
        getAvatarInfoListOrBuilderList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    @java.lang.Override
    public int getAvatarInfoListCount() {
      return avatarInfoList_.size();
    }
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE getAvatarInfoList(int index) {
      return avatarInfoList_.get(index);
    }
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder getAvatarInfoListOrBuilder(
        int index) {
      return avatarInfoList_.get(index);
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
      if (difficulty_ != 0) {
        output.writeUInt32(2, difficulty_);
      }
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        output.writeMessage(7, avatarInfoList_.get(i));
      }
      if (stageId_ != 0) {
        output.writeUInt32(13, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, difficulty_);
      }
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, avatarInfoList_.get(i));
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID other = (emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (!getAvatarInfoListList()
          .equals(other.getAvatarInfoListList())) return false;
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
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      if (getAvatarInfoListCount() > 0) {
        hash = (37 * hash) + AVATAR_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID prototype) {
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
     * CmdId: 24312
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_LLBCFCDMCID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_LLBCFCDMCID)
        emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.internal_static_Unk3000_LLBCFCDMCID_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.internal_static_Unk3000_LLBCFCDMCID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID.class, emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID.newBuilder()
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
          getAvatarInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stageId_ = 0;

        difficulty_ = 0;

        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.internal_static_Unk3000_LLBCFCDMCID_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID build() {
        emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID buildPartial() {
        emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID result = new emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID(this);
        int from_bitField0_ = bitField0_;
        result.stageId_ = stageId_;
        result.difficulty_ = difficulty_;
        if (avatarInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.avatarInfoList_ = avatarInfoList_;
        } else {
          result.avatarInfoList_ = avatarInfoListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID other) {
        if (other == emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (avatarInfoListBuilder_ == null) {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoList_.isEmpty()) {
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvatarInfoListIsMutable();
              avatarInfoList_.addAll(other.avatarInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoListBuilder_.isEmpty()) {
              avatarInfoListBuilder_.dispose();
              avatarInfoListBuilder_ = null;
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              avatarInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarInfoListFieldBuilder() : null;
            } else {
              avatarInfoListBuilder_.addAllMessages(other.avatarInfoList_);
            }
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
        emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 2;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 2;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> avatarInfoList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE>(avatarInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> avatarInfoListBuilder_;

      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> getAvatarInfoListList() {
        if (avatarInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        } else {
          return avatarInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public int getAvatarInfoListCount() {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.size();
        } else {
          return avatarInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE getAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);
        } else {
          return avatarInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder setAvatarInfoList(
          int index, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder setAvatarInfoList(
          int index, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder addAvatarInfoList(emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder addAvatarInfoList(
          int index, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder addAvatarInfoList(
          emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder addAvatarInfoList(
          int index, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder addAllAvatarInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> values) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarInfoList_);
          onChanged();
        } else {
          avatarInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder clearAvatarInfoList() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public Builder removeAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.remove(index);
          onChanged();
        } else {
          avatarInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder getAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder getAvatarInfoListOrBuilder(
          int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);  } else {
          return avatarInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> 
           getAvatarInfoListOrBuilderList() {
        if (avatarInfoListBuilder_ != null) {
          return avatarInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder addAvatarInfoListBuilder() {
        return getAvatarInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder addAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder> 
           getAvatarInfoListBuilderList() {
        return getAvatarInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> 
          getAvatarInfoListFieldBuilder() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder, emu.grasscutter.net.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder>(
                  avatarInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          avatarInfoList_ = null;
        }
        return avatarInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_LLBCFCDMCID)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_LLBCFCDMCID)
    private static final emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID();
    }

    public static emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_LLBCFCDMCID>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_LLBCFCDMCID>() {
      @java.lang.Override
      public Unk3000_LLBCFCDMCID parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_LLBCFCDMCID(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_LLBCFCDMCID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_LLBCFCDMCID> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000LLBCFCDMCID.Unk3000_LLBCFCDMCID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_LLBCFCDMCID_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_LLBCFCDMCID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_LLBCFCDMCID.proto\032\031Unk3000_JAC" +
      "OCADDNFE.proto\"k\n\023Unk3000_LLBCFCDMCID\022\020\n" +
      "\010stage_id\030\r \001(\r\022\022\n\ndifficulty\030\002 \001(\r\022.\n\020a" +
      "vatar_info_list\030\007 \003(\0132\024.Unk3000_JACOCADD" +
      "NFEB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk3000JACOCADDNFE.getDescriptor(),
        });
    internal_static_Unk3000_LLBCFCDMCID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_LLBCFCDMCID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_LLBCFCDMCID_descriptor,
        new java.lang.String[] { "StageId", "Difficulty", "AvatarInfoList", });
    emu.grasscutter.net.proto.Unk3000JACOCADDNFE.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

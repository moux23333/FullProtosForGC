// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MistTrialSelectAvatarAndEnterDungeonReq.proto

package emu.grasscutter.net.proto;

public final class MistTrialSelectAvatarAndEnterDungeonReqOuterClass {
  private MistTrialSelectAvatarAndEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MistTrialSelectAvatarAndEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MistTrialSelectAvatarAndEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trial_id = 4;</code>
     * @return The trialId.
     */
    int getTrialId();

    /**
     * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
     * @return A list containing the selectTrialAvatarIdList.
     */
    java.util.List<java.lang.Integer> getSelectTrialAvatarIdListList();
    /**
     * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
     * @return The count of selectTrialAvatarIdList.
     */
    int getSelectTrialAvatarIdListCount();
    /**
     * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The selectTrialAvatarIdList at the given index.
     */
    int getSelectTrialAvatarIdList(int index);

    /**
     * <code>uint32 enter_point_id = 7;</code>
     * @return The enterPointId.
     */
    int getEnterPointId();
  }
  /**
   * <pre>
   * CmdId: 8666
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code MistTrialSelectAvatarAndEnterDungeonReq}
   */
  public static final class MistTrialSelectAvatarAndEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MistTrialSelectAvatarAndEnterDungeonReq)
      MistTrialSelectAvatarAndEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MistTrialSelectAvatarAndEnterDungeonReq.newBuilder() to construct.
    private MistTrialSelectAvatarAndEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MistTrialSelectAvatarAndEnterDungeonReq() {
      selectTrialAvatarIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MistTrialSelectAvatarAndEnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MistTrialSelectAvatarAndEnterDungeonReq(
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
            case 32: {

              trialId_ = input.readUInt32();
              break;
            }
            case 56: {

              enterPointId_ = input.readUInt32();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                selectTrialAvatarIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              selectTrialAvatarIdList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                selectTrialAvatarIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                selectTrialAvatarIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          selectTrialAvatarIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.internal_static_MistTrialSelectAvatarAndEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.internal_static_MistTrialSelectAvatarAndEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq.class, emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq.Builder.class);
    }

    public static final int TRIAL_ID_FIELD_NUMBER = 4;
    private int trialId_;
    /**
     * <code>uint32 trial_id = 4;</code>
     * @return The trialId.
     */
    @java.lang.Override
    public int getTrialId() {
      return trialId_;
    }

    public static final int SELECT_TRIAL_AVATAR_ID_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList selectTrialAvatarIdList_;
    /**
     * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
     * @return A list containing the selectTrialAvatarIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSelectTrialAvatarIdListList() {
      return selectTrialAvatarIdList_;
    }
    /**
     * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
     * @return The count of selectTrialAvatarIdList.
     */
    public int getSelectTrialAvatarIdListCount() {
      return selectTrialAvatarIdList_.size();
    }
    /**
     * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The selectTrialAvatarIdList at the given index.
     */
    public int getSelectTrialAvatarIdList(int index) {
      return selectTrialAvatarIdList_.getInt(index);
    }
    private int selectTrialAvatarIdListMemoizedSerializedSize = -1;

    public static final int ENTER_POINT_ID_FIELD_NUMBER = 7;
    private int enterPointId_;
    /**
     * <code>uint32 enter_point_id = 7;</code>
     * @return The enterPointId.
     */
    @java.lang.Override
    public int getEnterPointId() {
      return enterPointId_;
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
      getSerializedSize();
      if (trialId_ != 0) {
        output.writeUInt32(4, trialId_);
      }
      if (enterPointId_ != 0) {
        output.writeUInt32(7, enterPointId_);
      }
      if (getSelectTrialAvatarIdListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(selectTrialAvatarIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < selectTrialAvatarIdList_.size(); i++) {
        output.writeUInt32NoTag(selectTrialAvatarIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (trialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, trialId_);
      }
      if (enterPointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, enterPointId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < selectTrialAvatarIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(selectTrialAvatarIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSelectTrialAvatarIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        selectTrialAvatarIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq other = (emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq) obj;

      if (getTrialId()
          != other.getTrialId()) return false;
      if (!getSelectTrialAvatarIdListList()
          .equals(other.getSelectTrialAvatarIdListList())) return false;
      if (getEnterPointId()
          != other.getEnterPointId()) return false;
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
      hash = (37 * hash) + TRIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTrialId();
      if (getSelectTrialAvatarIdListCount() > 0) {
        hash = (37 * hash) + SELECT_TRIAL_AVATAR_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSelectTrialAvatarIdListList().hashCode();
      }
      hash = (37 * hash) + ENTER_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEnterPointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq prototype) {
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
     * CmdId: 8666
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code MistTrialSelectAvatarAndEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MistTrialSelectAvatarAndEnterDungeonReq)
        emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.internal_static_MistTrialSelectAvatarAndEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.internal_static_MistTrialSelectAvatarAndEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq.class, emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq.newBuilder()
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
        trialId_ = 0;

        selectTrialAvatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        enterPointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.internal_static_MistTrialSelectAvatarAndEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq build() {
        emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq buildPartial() {
        emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq result = new emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq(this);
        int from_bitField0_ = bitField0_;
        result.trialId_ = trialId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          selectTrialAvatarIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.selectTrialAvatarIdList_ = selectTrialAvatarIdList_;
        result.enterPointId_ = enterPointId_;
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
        if (other instanceof emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq other) {
        if (other == emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq.getDefaultInstance()) return this;
        if (other.getTrialId() != 0) {
          setTrialId(other.getTrialId());
        }
        if (!other.selectTrialAvatarIdList_.isEmpty()) {
          if (selectTrialAvatarIdList_.isEmpty()) {
            selectTrialAvatarIdList_ = other.selectTrialAvatarIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSelectTrialAvatarIdListIsMutable();
            selectTrialAvatarIdList_.addAll(other.selectTrialAvatarIdList_);
          }
          onChanged();
        }
        if (other.getEnterPointId() != 0) {
          setEnterPointId(other.getEnterPointId());
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
        emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int trialId_ ;
      /**
       * <code>uint32 trial_id = 4;</code>
       * @return The trialId.
       */
      @java.lang.Override
      public int getTrialId() {
        return trialId_;
      }
      /**
       * <code>uint32 trial_id = 4;</code>
       * @param value The trialId to set.
       * @return This builder for chaining.
       */
      public Builder setTrialId(int value) {
        
        trialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trial_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTrialId() {
        
        trialId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList selectTrialAvatarIdList_ = emptyIntList();
      private void ensureSelectTrialAvatarIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          selectTrialAvatarIdList_ = mutableCopy(selectTrialAvatarIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
       * @return A list containing the selectTrialAvatarIdList.
       */
      public java.util.List<java.lang.Integer>
          getSelectTrialAvatarIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(selectTrialAvatarIdList_) : selectTrialAvatarIdList_;
      }
      /**
       * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
       * @return The count of selectTrialAvatarIdList.
       */
      public int getSelectTrialAvatarIdListCount() {
        return selectTrialAvatarIdList_.size();
      }
      /**
       * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
       * @param index The index of the element to return.
       * @return The selectTrialAvatarIdList at the given index.
       */
      public int getSelectTrialAvatarIdList(int index) {
        return selectTrialAvatarIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The selectTrialAvatarIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSelectTrialAvatarIdList(
          int index, int value) {
        ensureSelectTrialAvatarIdListIsMutable();
        selectTrialAvatarIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
       * @param value The selectTrialAvatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSelectTrialAvatarIdList(int value) {
        ensureSelectTrialAvatarIdListIsMutable();
        selectTrialAvatarIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
       * @param values The selectTrialAvatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSelectTrialAvatarIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSelectTrialAvatarIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, selectTrialAvatarIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 select_trial_avatar_id_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelectTrialAvatarIdList() {
        selectTrialAvatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int enterPointId_ ;
      /**
       * <code>uint32 enter_point_id = 7;</code>
       * @return The enterPointId.
       */
      @java.lang.Override
      public int getEnterPointId() {
        return enterPointId_;
      }
      /**
       * <code>uint32 enter_point_id = 7;</code>
       * @param value The enterPointId to set.
       * @return This builder for chaining.
       */
      public Builder setEnterPointId(int value) {
        
        enterPointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enter_point_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterPointId() {
        
        enterPointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MistTrialSelectAvatarAndEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:MistTrialSelectAvatarAndEnterDungeonReq)
    private static final emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq();
    }

    public static emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MistTrialSelectAvatarAndEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<MistTrialSelectAvatarAndEnterDungeonReq>() {
      @java.lang.Override
      public MistTrialSelectAvatarAndEnterDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MistTrialSelectAvatarAndEnterDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MistTrialSelectAvatarAndEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MistTrialSelectAvatarAndEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MistTrialSelectAvatarAndEnterDungeonReqOuterClass.MistTrialSelectAvatarAndEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MistTrialSelectAvatarAndEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MistTrialSelectAvatarAndEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-MistTrialSelectAvatarAndEnterDungeonRe" +
      "q.proto\"x\n\'MistTrialSelectAvatarAndEnter" +
      "DungeonReq\022\020\n\010trial_id\030\004 \001(\r\022#\n\033select_t" +
      "rial_avatar_id_list\030\n \003(\r\022\026\n\016enter_point" +
      "_id\030\007 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MistTrialSelectAvatarAndEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MistTrialSelectAvatarAndEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MistTrialSelectAvatarAndEnterDungeonReq_descriptor,
        new java.lang.String[] { "TrialId", "SelectTrialAvatarIdList", "EnterPointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

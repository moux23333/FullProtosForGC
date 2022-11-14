// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonSetting.proto

package emu.grasscutter.net.proto;

public final class CustomDungeonSettingOuterClass {
  private CustomDungeonSettingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonSettingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonSetting)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 open_room_list = 1;</code>
     * @return A list containing the openRoomList.
     */
    java.util.List<java.lang.Integer> getOpenRoomListList();
    /**
     * <code>repeated uint32 open_room_list = 1;</code>
     * @return The count of openRoomList.
     */
    int getOpenRoomListCount();
    /**
     * <code>repeated uint32 open_room_list = 1;</code>
     * @param index The index of the element to return.
     * @return The openRoomList at the given index.
     */
    int getOpenRoomList(int index);

    /**
     * <code>bool is_arrive_finish = 14;</code>
     * @return The isArriveFinish.
     */
    boolean getIsArriveFinish();

    /**
     * <code>uint32 life_num = 6;</code>
     * @return The lifeNum.
     */
    int getLifeNum();

    /**
     * <code>uint32 start_room_id = 4;</code>
     * @return The startRoomId.
     */
    int getStartRoomId();

    /**
     * <code>bool is_forbid_skill = 3;</code>
     * @return The isForbidSkill.
     */
    boolean getIsForbidSkill();

    /**
     * <code>uint32 coin_limit = 10;</code>
     * @return The coinLimit.
     */
    int getCoinLimit();

    /**
     * <code>uint32 time_limit = 9;</code>
     * @return The timeLimit.
     */
    int getTimeLimit();
  }
  /**
   * Protobuf type {@code CustomDungeonSetting}
   */
  public static final class CustomDungeonSetting extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonSetting)
      CustomDungeonSettingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonSetting.newBuilder() to construct.
    private CustomDungeonSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonSetting() {
      openRoomList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonSetting();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomDungeonSetting(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                openRoomList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              openRoomList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                openRoomList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                openRoomList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 24: {

              isForbidSkill_ = input.readBool();
              break;
            }
            case 32: {

              startRoomId_ = input.readUInt32();
              break;
            }
            case 48: {

              lifeNum_ = input.readUInt32();
              break;
            }
            case 72: {

              timeLimit_ = input.readUInt32();
              break;
            }
            case 80: {

              coinLimit_ = input.readUInt32();
              break;
            }
            case 112: {

              isArriveFinish_ = input.readBool();
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
          openRoomList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.class, emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder.class);
    }

    public static final int OPEN_ROOM_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList openRoomList_;
    /**
     * <code>repeated uint32 open_room_list = 1;</code>
     * @return A list containing the openRoomList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOpenRoomListList() {
      return openRoomList_;
    }
    /**
     * <code>repeated uint32 open_room_list = 1;</code>
     * @return The count of openRoomList.
     */
    public int getOpenRoomListCount() {
      return openRoomList_.size();
    }
    /**
     * <code>repeated uint32 open_room_list = 1;</code>
     * @param index The index of the element to return.
     * @return The openRoomList at the given index.
     */
    public int getOpenRoomList(int index) {
      return openRoomList_.getInt(index);
    }
    private int openRoomListMemoizedSerializedSize = -1;

    public static final int IS_ARRIVE_FINISH_FIELD_NUMBER = 14;
    private boolean isArriveFinish_;
    /**
     * <code>bool is_arrive_finish = 14;</code>
     * @return The isArriveFinish.
     */
    @java.lang.Override
    public boolean getIsArriveFinish() {
      return isArriveFinish_;
    }

    public static final int LIFE_NUM_FIELD_NUMBER = 6;
    private int lifeNum_;
    /**
     * <code>uint32 life_num = 6;</code>
     * @return The lifeNum.
     */
    @java.lang.Override
    public int getLifeNum() {
      return lifeNum_;
    }

    public static final int START_ROOM_ID_FIELD_NUMBER = 4;
    private int startRoomId_;
    /**
     * <code>uint32 start_room_id = 4;</code>
     * @return The startRoomId.
     */
    @java.lang.Override
    public int getStartRoomId() {
      return startRoomId_;
    }

    public static final int IS_FORBID_SKILL_FIELD_NUMBER = 3;
    private boolean isForbidSkill_;
    /**
     * <code>bool is_forbid_skill = 3;</code>
     * @return The isForbidSkill.
     */
    @java.lang.Override
    public boolean getIsForbidSkill() {
      return isForbidSkill_;
    }

    public static final int COIN_LIMIT_FIELD_NUMBER = 10;
    private int coinLimit_;
    /**
     * <code>uint32 coin_limit = 10;</code>
     * @return The coinLimit.
     */
    @java.lang.Override
    public int getCoinLimit() {
      return coinLimit_;
    }

    public static final int TIME_LIMIT_FIELD_NUMBER = 9;
    private int timeLimit_;
    /**
     * <code>uint32 time_limit = 9;</code>
     * @return The timeLimit.
     */
    @java.lang.Override
    public int getTimeLimit() {
      return timeLimit_;
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
      if (getOpenRoomListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(openRoomListMemoizedSerializedSize);
      }
      for (int i = 0; i < openRoomList_.size(); i++) {
        output.writeUInt32NoTag(openRoomList_.getInt(i));
      }
      if (isForbidSkill_ != false) {
        output.writeBool(3, isForbidSkill_);
      }
      if (startRoomId_ != 0) {
        output.writeUInt32(4, startRoomId_);
      }
      if (lifeNum_ != 0) {
        output.writeUInt32(6, lifeNum_);
      }
      if (timeLimit_ != 0) {
        output.writeUInt32(9, timeLimit_);
      }
      if (coinLimit_ != 0) {
        output.writeUInt32(10, coinLimit_);
      }
      if (isArriveFinish_ != false) {
        output.writeBool(14, isArriveFinish_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < openRoomList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(openRoomList_.getInt(i));
        }
        size += dataSize;
        if (!getOpenRoomListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        openRoomListMemoizedSerializedSize = dataSize;
      }
      if (isForbidSkill_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isForbidSkill_);
      }
      if (startRoomId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, startRoomId_);
      }
      if (lifeNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, lifeNum_);
      }
      if (timeLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, timeLimit_);
      }
      if (coinLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, coinLimit_);
      }
      if (isArriveFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isArriveFinish_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting other = (emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting) obj;

      if (!getOpenRoomListList()
          .equals(other.getOpenRoomListList())) return false;
      if (getIsArriveFinish()
          != other.getIsArriveFinish()) return false;
      if (getLifeNum()
          != other.getLifeNum()) return false;
      if (getStartRoomId()
          != other.getStartRoomId()) return false;
      if (getIsForbidSkill()
          != other.getIsForbidSkill()) return false;
      if (getCoinLimit()
          != other.getCoinLimit()) return false;
      if (getTimeLimit()
          != other.getTimeLimit()) return false;
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
      if (getOpenRoomListCount() > 0) {
        hash = (37 * hash) + OPEN_ROOM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOpenRoomListList().hashCode();
      }
      hash = (37 * hash) + IS_ARRIVE_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsArriveFinish());
      hash = (37 * hash) + LIFE_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getLifeNum();
      hash = (37 * hash) + START_ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStartRoomId();
      hash = (37 * hash) + IS_FORBID_SKILL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForbidSkill());
      hash = (37 * hash) + COIN_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getCoinLimit();
      hash = (37 * hash) + TIME_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeLimit();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting prototype) {
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
     * Protobuf type {@code CustomDungeonSetting}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonSetting)
        emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSettingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.class, emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.newBuilder()
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
        openRoomList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isArriveFinish_ = false;

        lifeNum_ = 0;

        startRoomId_ = 0;

        isForbidSkill_ = false;

        coinLimit_ = 0;

        timeLimit_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.internal_static_CustomDungeonSetting_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting build() {
        emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting buildPartial() {
        emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting result = new emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          openRoomList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.openRoomList_ = openRoomList_;
        result.isArriveFinish_ = isArriveFinish_;
        result.lifeNum_ = lifeNum_;
        result.startRoomId_ = startRoomId_;
        result.isForbidSkill_ = isForbidSkill_;
        result.coinLimit_ = coinLimit_;
        result.timeLimit_ = timeLimit_;
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
        if (other instanceof emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting) {
          return mergeFrom((emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting other) {
        if (other == emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.getDefaultInstance()) return this;
        if (!other.openRoomList_.isEmpty()) {
          if (openRoomList_.isEmpty()) {
            openRoomList_ = other.openRoomList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOpenRoomListIsMutable();
            openRoomList_.addAll(other.openRoomList_);
          }
          onChanged();
        }
        if (other.getIsArriveFinish() != false) {
          setIsArriveFinish(other.getIsArriveFinish());
        }
        if (other.getLifeNum() != 0) {
          setLifeNum(other.getLifeNum());
        }
        if (other.getStartRoomId() != 0) {
          setStartRoomId(other.getStartRoomId());
        }
        if (other.getIsForbidSkill() != false) {
          setIsForbidSkill(other.getIsForbidSkill());
        }
        if (other.getCoinLimit() != 0) {
          setCoinLimit(other.getCoinLimit());
        }
        if (other.getTimeLimit() != 0) {
          setTimeLimit(other.getTimeLimit());
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
        emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList openRoomList_ = emptyIntList();
      private void ensureOpenRoomListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          openRoomList_ = mutableCopy(openRoomList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 open_room_list = 1;</code>
       * @return A list containing the openRoomList.
       */
      public java.util.List<java.lang.Integer>
          getOpenRoomListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(openRoomList_) : openRoomList_;
      }
      /**
       * <code>repeated uint32 open_room_list = 1;</code>
       * @return The count of openRoomList.
       */
      public int getOpenRoomListCount() {
        return openRoomList_.size();
      }
      /**
       * <code>repeated uint32 open_room_list = 1;</code>
       * @param index The index of the element to return.
       * @return The openRoomList at the given index.
       */
      public int getOpenRoomList(int index) {
        return openRoomList_.getInt(index);
      }
      /**
       * <code>repeated uint32 open_room_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The openRoomList to set.
       * @return This builder for chaining.
       */
      public Builder setOpenRoomList(
          int index, int value) {
        ensureOpenRoomListIsMutable();
        openRoomList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 open_room_list = 1;</code>
       * @param value The openRoomList to add.
       * @return This builder for chaining.
       */
      public Builder addOpenRoomList(int value) {
        ensureOpenRoomListIsMutable();
        openRoomList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 open_room_list = 1;</code>
       * @param values The openRoomList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOpenRoomList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOpenRoomListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, openRoomList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 open_room_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenRoomList() {
        openRoomList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isArriveFinish_ ;
      /**
       * <code>bool is_arrive_finish = 14;</code>
       * @return The isArriveFinish.
       */
      @java.lang.Override
      public boolean getIsArriveFinish() {
        return isArriveFinish_;
      }
      /**
       * <code>bool is_arrive_finish = 14;</code>
       * @param value The isArriveFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsArriveFinish(boolean value) {
        
        isArriveFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_arrive_finish = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsArriveFinish() {
        
        isArriveFinish_ = false;
        onChanged();
        return this;
      }

      private int lifeNum_ ;
      /**
       * <code>uint32 life_num = 6;</code>
       * @return The lifeNum.
       */
      @java.lang.Override
      public int getLifeNum() {
        return lifeNum_;
      }
      /**
       * <code>uint32 life_num = 6;</code>
       * @param value The lifeNum to set.
       * @return This builder for chaining.
       */
      public Builder setLifeNum(int value) {
        
        lifeNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 life_num = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLifeNum() {
        
        lifeNum_ = 0;
        onChanged();
        return this;
      }

      private int startRoomId_ ;
      /**
       * <code>uint32 start_room_id = 4;</code>
       * @return The startRoomId.
       */
      @java.lang.Override
      public int getStartRoomId() {
        return startRoomId_;
      }
      /**
       * <code>uint32 start_room_id = 4;</code>
       * @param value The startRoomId to set.
       * @return This builder for chaining.
       */
      public Builder setStartRoomId(int value) {
        
        startRoomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_room_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartRoomId() {
        
        startRoomId_ = 0;
        onChanged();
        return this;
      }

      private boolean isForbidSkill_ ;
      /**
       * <code>bool is_forbid_skill = 3;</code>
       * @return The isForbidSkill.
       */
      @java.lang.Override
      public boolean getIsForbidSkill() {
        return isForbidSkill_;
      }
      /**
       * <code>bool is_forbid_skill = 3;</code>
       * @param value The isForbidSkill to set.
       * @return This builder for chaining.
       */
      public Builder setIsForbidSkill(boolean value) {
        
        isForbidSkill_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_forbid_skill = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForbidSkill() {
        
        isForbidSkill_ = false;
        onChanged();
        return this;
      }

      private int coinLimit_ ;
      /**
       * <code>uint32 coin_limit = 10;</code>
       * @return The coinLimit.
       */
      @java.lang.Override
      public int getCoinLimit() {
        return coinLimit_;
      }
      /**
       * <code>uint32 coin_limit = 10;</code>
       * @param value The coinLimit to set.
       * @return This builder for chaining.
       */
      public Builder setCoinLimit(int value) {
        
        coinLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin_limit = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoinLimit() {
        
        coinLimit_ = 0;
        onChanged();
        return this;
      }

      private int timeLimit_ ;
      /**
       * <code>uint32 time_limit = 9;</code>
       * @return The timeLimit.
       */
      @java.lang.Override
      public int getTimeLimit() {
        return timeLimit_;
      }
      /**
       * <code>uint32 time_limit = 9;</code>
       * @param value The timeLimit to set.
       * @return This builder for chaining.
       */
      public Builder setTimeLimit(int value) {
        
        timeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 time_limit = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeLimit() {
        
        timeLimit_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonSetting)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonSetting)
    private static final emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting();
    }

    public static emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonSetting>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonSetting>() {
      @java.lang.Override
      public CustomDungeonSetting parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomDungeonSetting(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomDungeonSetting> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonSetting> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonSetting_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032CustomDungeonSetting.proto\"\262\001\n\024CustomD" +
      "ungeonSetting\022\026\n\016open_room_list\030\001 \003(\r\022\030\n" +
      "\020is_arrive_finish\030\016 \001(\010\022\020\n\010life_num\030\006 \001(" +
      "\r\022\025\n\rstart_room_id\030\004 \001(\r\022\027\n\017is_forbid_sk" +
      "ill\030\003 \001(\010\022\022\n\ncoin_limit\030\n \001(\r\022\022\n\ntime_li" +
      "mit\030\t \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomDungeonSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonSetting_descriptor,
        new java.lang.String[] { "OpenRoomList", "IsArriveFinish", "LifeNum", "StartRoomId", "IsForbidSkill", "CoinLimit", "TimeLimit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldDungeonSettleInfo.proto

package emu.grasscutter.net.proto;

public final class WindFieldDungeonSettleInfoOuterClass {
  private WindFieldDungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldDungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldDungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 after_watcher_id_list = 11;</code>
     * @return A list containing the afterWatcherIdList.
     */
    java.util.List<java.lang.Integer> getAfterWatcherIdListList();
    /**
     * <code>repeated uint32 after_watcher_id_list = 11;</code>
     * @return The count of afterWatcherIdList.
     */
    int getAfterWatcherIdListCount();
    /**
     * <code>repeated uint32 after_watcher_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The afterWatcherIdList at the given index.
     */
    int getAfterWatcherIdList(int index);

    /**
     * <code>repeated uint32 before_watcher_id_list = 7;</code>
     * @return A list containing the beforeWatcherIdList.
     */
    java.util.List<java.lang.Integer> getBeforeWatcherIdListList();
    /**
     * <code>repeated uint32 before_watcher_id_list = 7;</code>
     * @return The count of beforeWatcherIdList.
     */
    int getBeforeWatcherIdListCount();
    /**
     * <code>repeated uint32 before_watcher_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The beforeWatcherIdList at the given index.
     */
    int getBeforeWatcherIdList(int index);

    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    int getFailReasonValue();
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
     * @return The failReason.
     */
    emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason();
  }
  /**
   * Protobuf type {@code WindFieldDungeonSettleInfo}
   */
  public static final class WindFieldDungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldDungeonSettleInfo)
      WindFieldDungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldDungeonSettleInfo.newBuilder() to construct.
    private WindFieldDungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldDungeonSettleInfo() {
      afterWatcherIdList_ = emptyIntList();
      beforeWatcherIdList_ = emptyIntList();
      failReason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldDungeonSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WindFieldDungeonSettleInfo(
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
              int rawValue = input.readEnum();

              failReason_ = rawValue;
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                beforeWatcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              beforeWatcherIdList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                beforeWatcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                beforeWatcherIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                afterWatcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              afterWatcherIdList_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                afterWatcherIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                afterWatcherIdList_.addInt(input.readUInt32());
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          beforeWatcherIdList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          afterWatcherIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
    }

    public static final int AFTER_WATCHER_ID_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList afterWatcherIdList_;
    /**
     * <code>repeated uint32 after_watcher_id_list = 11;</code>
     * @return A list containing the afterWatcherIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAfterWatcherIdListList() {
      return afterWatcherIdList_;
    }
    /**
     * <code>repeated uint32 after_watcher_id_list = 11;</code>
     * @return The count of afterWatcherIdList.
     */
    public int getAfterWatcherIdListCount() {
      return afterWatcherIdList_.size();
    }
    /**
     * <code>repeated uint32 after_watcher_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The afterWatcherIdList at the given index.
     */
    public int getAfterWatcherIdList(int index) {
      return afterWatcherIdList_.getInt(index);
    }
    private int afterWatcherIdListMemoizedSerializedSize = -1;

    public static final int BEFORE_WATCHER_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList beforeWatcherIdList_;
    /**
     * <code>repeated uint32 before_watcher_id_list = 7;</code>
     * @return A list containing the beforeWatcherIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getBeforeWatcherIdListList() {
      return beforeWatcherIdList_;
    }
    /**
     * <code>repeated uint32 before_watcher_id_list = 7;</code>
     * @return The count of beforeWatcherIdList.
     */
    public int getBeforeWatcherIdListCount() {
      return beforeWatcherIdList_.size();
    }
    /**
     * <code>repeated uint32 before_watcher_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The beforeWatcherIdList at the given index.
     */
    public int getBeforeWatcherIdList(int index) {
      return beforeWatcherIdList_.getInt(index);
    }
    private int beforeWatcherIdListMemoizedSerializedSize = -1;

    public static final int FAIL_REASON_FIELD_NUMBER = 2;
    private int failReason_;
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    @java.lang.Override public int getFailReasonValue() {
      return failReason_;
    }
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
     * @return The failReason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.valueOf(failReason_);
      return result == null ? emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
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
      if (failReason_ != emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_REASON_NONE.getNumber()) {
        output.writeEnum(2, failReason_);
      }
      if (getBeforeWatcherIdListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(beforeWatcherIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < beforeWatcherIdList_.size(); i++) {
        output.writeUInt32NoTag(beforeWatcherIdList_.getInt(i));
      }
      if (getAfterWatcherIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(afterWatcherIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < afterWatcherIdList_.size(); i++) {
        output.writeUInt32NoTag(afterWatcherIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (failReason_ != emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, failReason_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < beforeWatcherIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(beforeWatcherIdList_.getInt(i));
        }
        size += dataSize;
        if (!getBeforeWatcherIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        beforeWatcherIdListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < afterWatcherIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(afterWatcherIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAfterWatcherIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        afterWatcherIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other = (emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) obj;

      if (!getAfterWatcherIdListList()
          .equals(other.getAfterWatcherIdListList())) return false;
      if (!getBeforeWatcherIdListList()
          .equals(other.getBeforeWatcherIdListList())) return false;
      if (failReason_ != other.failReason_) return false;
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
      if (getAfterWatcherIdListCount() > 0) {
        hash = (37 * hash) + AFTER_WATCHER_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAfterWatcherIdListList().hashCode();
      }
      if (getBeforeWatcherIdListCount() > 0) {
        hash = (37 * hash) + BEFORE_WATCHER_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBeforeWatcherIdListList().hashCode();
      }
      hash = (37 * hash) + FAIL_REASON_FIELD_NUMBER;
      hash = (53 * hash) + failReason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo prototype) {
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
     * Protobuf type {@code WindFieldDungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldDungeonSettleInfo)
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.newBuilder()
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
        afterWatcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        beforeWatcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        failReason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo build() {
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo buildPartial() {
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = new emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          afterWatcherIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.afterWatcherIdList_ = afterWatcherIdList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          beforeWatcherIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.beforeWatcherIdList_ = beforeWatcherIdList_;
        result.failReason_ = failReason_;
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
        if (other instanceof emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other) {
        if (other == emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance()) return this;
        if (!other.afterWatcherIdList_.isEmpty()) {
          if (afterWatcherIdList_.isEmpty()) {
            afterWatcherIdList_ = other.afterWatcherIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAfterWatcherIdListIsMutable();
            afterWatcherIdList_.addAll(other.afterWatcherIdList_);
          }
          onChanged();
        }
        if (!other.beforeWatcherIdList_.isEmpty()) {
          if (beforeWatcherIdList_.isEmpty()) {
            beforeWatcherIdList_ = other.beforeWatcherIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBeforeWatcherIdListIsMutable();
            beforeWatcherIdList_.addAll(other.beforeWatcherIdList_);
          }
          onChanged();
        }
        if (other.failReason_ != 0) {
          setFailReasonValue(other.getFailReasonValue());
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
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList afterWatcherIdList_ = emptyIntList();
      private void ensureAfterWatcherIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          afterWatcherIdList_ = mutableCopy(afterWatcherIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 after_watcher_id_list = 11;</code>
       * @return A list containing the afterWatcherIdList.
       */
      public java.util.List<java.lang.Integer>
          getAfterWatcherIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(afterWatcherIdList_) : afterWatcherIdList_;
      }
      /**
       * <code>repeated uint32 after_watcher_id_list = 11;</code>
       * @return The count of afterWatcherIdList.
       */
      public int getAfterWatcherIdListCount() {
        return afterWatcherIdList_.size();
      }
      /**
       * <code>repeated uint32 after_watcher_id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The afterWatcherIdList at the given index.
       */
      public int getAfterWatcherIdList(int index) {
        return afterWatcherIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 after_watcher_id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The afterWatcherIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAfterWatcherIdList(
          int index, int value) {
        ensureAfterWatcherIdListIsMutable();
        afterWatcherIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 after_watcher_id_list = 11;</code>
       * @param value The afterWatcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAfterWatcherIdList(int value) {
        ensureAfterWatcherIdListIsMutable();
        afterWatcherIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 after_watcher_id_list = 11;</code>
       * @param values The afterWatcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAfterWatcherIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAfterWatcherIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, afterWatcherIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 after_watcher_id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAfterWatcherIdList() {
        afterWatcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList beforeWatcherIdList_ = emptyIntList();
      private void ensureBeforeWatcherIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          beforeWatcherIdList_ = mutableCopy(beforeWatcherIdList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 before_watcher_id_list = 7;</code>
       * @return A list containing the beforeWatcherIdList.
       */
      public java.util.List<java.lang.Integer>
          getBeforeWatcherIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(beforeWatcherIdList_) : beforeWatcherIdList_;
      }
      /**
       * <code>repeated uint32 before_watcher_id_list = 7;</code>
       * @return The count of beforeWatcherIdList.
       */
      public int getBeforeWatcherIdListCount() {
        return beforeWatcherIdList_.size();
      }
      /**
       * <code>repeated uint32 before_watcher_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The beforeWatcherIdList at the given index.
       */
      public int getBeforeWatcherIdList(int index) {
        return beforeWatcherIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 before_watcher_id_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The beforeWatcherIdList to set.
       * @return This builder for chaining.
       */
      public Builder setBeforeWatcherIdList(
          int index, int value) {
        ensureBeforeWatcherIdListIsMutable();
        beforeWatcherIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 before_watcher_id_list = 7;</code>
       * @param value The beforeWatcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addBeforeWatcherIdList(int value) {
        ensureBeforeWatcherIdListIsMutable();
        beforeWatcherIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 before_watcher_id_list = 7;</code>
       * @param values The beforeWatcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllBeforeWatcherIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBeforeWatcherIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, beforeWatcherIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 before_watcher_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeforeWatcherIdList() {
        beforeWatcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int failReason_ = 0;
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
       * @return The enum numeric value on the wire for failReason.
       */
      @java.lang.Override public int getFailReasonValue() {
        return failReason_;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
       * @param value The enum numeric value on the wire for failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReasonValue(int value) {
        
        failReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
       * @return The failReason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.valueOf(failReason_);
        return result == null ? emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
       * @param value The failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReason(emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        failReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFailReason() {
        
        failReason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WindFieldDungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:WindFieldDungeonSettleInfo)
    private static final emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo();
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldDungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldDungeonSettleInfo>() {
      @java.lang.Override
      public WindFieldDungeonSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WindFieldDungeonSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WindFieldDungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldDungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldDungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n WindFieldDungeonSettleInfo.proto\032 Wind" +
      "FieldDungeonFailReason.proto\"\215\001\n\032WindFie" +
      "ldDungeonSettleInfo\022\035\n\025after_watcher_id_" +
      "list\030\013 \003(\r\022\036\n\026before_watcher_id_list\030\007 \003" +
      "(\r\0220\n\013fail_reason\030\002 \001(\0162\033.WindFieldDunge" +
      "onFailReasonB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor(),
        });
    internal_static_WindFieldDungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldDungeonSettleInfo_descriptor,
        new java.lang.String[] { "AfterWatcherIdList", "BeforeWatcherIdList", "FailReason", });
    emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

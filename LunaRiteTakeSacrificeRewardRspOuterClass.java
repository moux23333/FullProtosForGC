// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LunaRiteTakeSacrificeRewardRsp.proto

package emu.grasscutter.net.proto;

public final class LunaRiteTakeSacrificeRewardRspOuterClass {
  private LunaRiteTakeSacrificeRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LunaRiteTakeSacrificeRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LunaRiteTakeSacrificeRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 index = 11;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>repeated uint32 sacrifice_reward_list = 2;</code>
     * @return A list containing the sacrificeRewardList.
     */
    java.util.List<java.lang.Integer> getSacrificeRewardListList();
    /**
     * <code>repeated uint32 sacrifice_reward_list = 2;</code>
     * @return The count of sacrificeRewardList.
     */
    int getSacrificeRewardListCount();
    /**
     * <code>repeated uint32 sacrifice_reward_list = 2;</code>
     * @param index The index of the element to return.
     * @return The sacrificeRewardList at the given index.
     */
    int getSacrificeRewardList(int index);

    /**
     * <code>uint32 sacrifice_reward_index = 14;</code>
     * @return The sacrificeRewardIndex.
     */
    int getSacrificeRewardIndex();

    /**
     * <code>uint32 area_id = 6;</code>
     * @return The areaId.
     */
    int getAreaId();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8397
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code LunaRiteTakeSacrificeRewardRsp}
   */
  public static final class LunaRiteTakeSacrificeRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LunaRiteTakeSacrificeRewardRsp)
      LunaRiteTakeSacrificeRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LunaRiteTakeSacrificeRewardRsp.newBuilder() to construct.
    private LunaRiteTakeSacrificeRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LunaRiteTakeSacrificeRewardRsp() {
      sacrificeRewardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LunaRiteTakeSacrificeRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LunaRiteTakeSacrificeRewardRsp(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sacrificeRewardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              sacrificeRewardList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                sacrificeRewardList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                sacrificeRewardList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              areaId_ = input.readUInt32();
              break;
            }
            case 88: {

              index_ = input.readUInt32();
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              sacrificeRewardIndex_ = input.readUInt32();
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
          sacrificeRewardList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.internal_static_LunaRiteTakeSacrificeRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.internal_static_LunaRiteTakeSacrificeRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp.class, emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp.Builder.class);
    }

    public static final int INDEX_FIELD_NUMBER = 11;
    private int index_;
    /**
     * <code>uint32 index = 11;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    public static final int SACRIFICE_REWARD_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList sacrificeRewardList_;
    /**
     * <code>repeated uint32 sacrifice_reward_list = 2;</code>
     * @return A list containing the sacrificeRewardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSacrificeRewardListList() {
      return sacrificeRewardList_;
    }
    /**
     * <code>repeated uint32 sacrifice_reward_list = 2;</code>
     * @return The count of sacrificeRewardList.
     */
    public int getSacrificeRewardListCount() {
      return sacrificeRewardList_.size();
    }
    /**
     * <code>repeated uint32 sacrifice_reward_list = 2;</code>
     * @param index The index of the element to return.
     * @return The sacrificeRewardList at the given index.
     */
    public int getSacrificeRewardList(int index) {
      return sacrificeRewardList_.getInt(index);
    }
    private int sacrificeRewardListMemoizedSerializedSize = -1;

    public static final int SACRIFICE_REWARD_INDEX_FIELD_NUMBER = 14;
    private int sacrificeRewardIndex_;
    /**
     * <code>uint32 sacrifice_reward_index = 14;</code>
     * @return The sacrificeRewardIndex.
     */
    @java.lang.Override
    public int getSacrificeRewardIndex() {
      return sacrificeRewardIndex_;
    }

    public static final int AREA_ID_FIELD_NUMBER = 6;
    private int areaId_;
    /**
     * <code>uint32 area_id = 6;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
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
      getSerializedSize();
      if (getSacrificeRewardListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(sacrificeRewardListMemoizedSerializedSize);
      }
      for (int i = 0; i < sacrificeRewardList_.size(); i++) {
        output.writeUInt32NoTag(sacrificeRewardList_.getInt(i));
      }
      if (areaId_ != 0) {
        output.writeUInt32(6, areaId_);
      }
      if (index_ != 0) {
        output.writeUInt32(11, index_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (sacrificeRewardIndex_ != 0) {
        output.writeUInt32(14, sacrificeRewardIndex_);
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
        for (int i = 0; i < sacrificeRewardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sacrificeRewardList_.getInt(i));
        }
        size += dataSize;
        if (!getSacrificeRewardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sacrificeRewardListMemoizedSerializedSize = dataSize;
      }
      if (areaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, areaId_);
      }
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, index_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (sacrificeRewardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, sacrificeRewardIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp other = (emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp) obj;

      if (getIndex()
          != other.getIndex()) return false;
      if (!getSacrificeRewardListList()
          .equals(other.getSacrificeRewardListList())) return false;
      if (getSacrificeRewardIndex()
          != other.getSacrificeRewardIndex()) return false;
      if (getAreaId()
          != other.getAreaId()) return false;
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
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      if (getSacrificeRewardListCount() > 0) {
        hash = (37 * hash) + SACRIFICE_REWARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSacrificeRewardListList().hashCode();
      }
      hash = (37 * hash) + SACRIFICE_REWARD_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getSacrificeRewardIndex();
      hash = (37 * hash) + AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAreaId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp prototype) {
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
     * CmdId: 8397
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code LunaRiteTakeSacrificeRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LunaRiteTakeSacrificeRewardRsp)
        emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.internal_static_LunaRiteTakeSacrificeRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.internal_static_LunaRiteTakeSacrificeRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp.class, emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp.newBuilder()
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
        index_ = 0;

        sacrificeRewardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        sacrificeRewardIndex_ = 0;

        areaId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.internal_static_LunaRiteTakeSacrificeRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp build() {
        emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp buildPartial() {
        emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp result = new emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp(this);
        int from_bitField0_ = bitField0_;
        result.index_ = index_;
        if (((bitField0_ & 0x00000001) != 0)) {
          sacrificeRewardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sacrificeRewardList_ = sacrificeRewardList_;
        result.sacrificeRewardIndex_ = sacrificeRewardIndex_;
        result.areaId_ = areaId_;
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
        if (other instanceof emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp other) {
        if (other == emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp.getDefaultInstance()) return this;
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (!other.sacrificeRewardList_.isEmpty()) {
          if (sacrificeRewardList_.isEmpty()) {
            sacrificeRewardList_ = other.sacrificeRewardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSacrificeRewardListIsMutable();
            sacrificeRewardList_.addAll(other.sacrificeRewardList_);
          }
          onChanged();
        }
        if (other.getSacrificeRewardIndex() != 0) {
          setSacrificeRewardIndex(other.getSacrificeRewardIndex());
        }
        if (other.getAreaId() != 0) {
          setAreaId(other.getAreaId());
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
        emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int index_ ;
      /**
       * <code>uint32 index = 11;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 11;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList sacrificeRewardList_ = emptyIntList();
      private void ensureSacrificeRewardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sacrificeRewardList_ = mutableCopy(sacrificeRewardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 sacrifice_reward_list = 2;</code>
       * @return A list containing the sacrificeRewardList.
       */
      public java.util.List<java.lang.Integer>
          getSacrificeRewardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(sacrificeRewardList_) : sacrificeRewardList_;
      }
      /**
       * <code>repeated uint32 sacrifice_reward_list = 2;</code>
       * @return The count of sacrificeRewardList.
       */
      public int getSacrificeRewardListCount() {
        return sacrificeRewardList_.size();
      }
      /**
       * <code>repeated uint32 sacrifice_reward_list = 2;</code>
       * @param index The index of the element to return.
       * @return The sacrificeRewardList at the given index.
       */
      public int getSacrificeRewardList(int index) {
        return sacrificeRewardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 sacrifice_reward_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The sacrificeRewardList to set.
       * @return This builder for chaining.
       */
      public Builder setSacrificeRewardList(
          int index, int value) {
        ensureSacrificeRewardListIsMutable();
        sacrificeRewardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sacrifice_reward_list = 2;</code>
       * @param value The sacrificeRewardList to add.
       * @return This builder for chaining.
       */
      public Builder addSacrificeRewardList(int value) {
        ensureSacrificeRewardListIsMutable();
        sacrificeRewardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sacrifice_reward_list = 2;</code>
       * @param values The sacrificeRewardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSacrificeRewardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSacrificeRewardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sacrificeRewardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sacrifice_reward_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSacrificeRewardList() {
        sacrificeRewardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int sacrificeRewardIndex_ ;
      /**
       * <code>uint32 sacrifice_reward_index = 14;</code>
       * @return The sacrificeRewardIndex.
       */
      @java.lang.Override
      public int getSacrificeRewardIndex() {
        return sacrificeRewardIndex_;
      }
      /**
       * <code>uint32 sacrifice_reward_index = 14;</code>
       * @param value The sacrificeRewardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setSacrificeRewardIndex(int value) {
        
        sacrificeRewardIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sacrifice_reward_index = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSacrificeRewardIndex() {
        
        sacrificeRewardIndex_ = 0;
        onChanged();
        return this;
      }

      private int areaId_ ;
      /**
       * <code>uint32 area_id = 6;</code>
       * @return The areaId.
       */
      @java.lang.Override
      public int getAreaId() {
        return areaId_;
      }
      /**
       * <code>uint32 area_id = 6;</code>
       * @param value The areaId to set.
       * @return This builder for chaining.
       */
      public Builder setAreaId(int value) {
        
        areaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 area_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaId() {
        
        areaId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
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


      // @@protoc_insertion_point(builder_scope:LunaRiteTakeSacrificeRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:LunaRiteTakeSacrificeRewardRsp)
    private static final emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp();
    }

    public static emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LunaRiteTakeSacrificeRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<LunaRiteTakeSacrificeRewardRsp>() {
      @java.lang.Override
      public LunaRiteTakeSacrificeRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LunaRiteTakeSacrificeRewardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LunaRiteTakeSacrificeRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LunaRiteTakeSacrificeRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LunaRiteTakeSacrificeRewardRspOuterClass.LunaRiteTakeSacrificeRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunaRiteTakeSacrificeRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunaRiteTakeSacrificeRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$LunaRiteTakeSacrificeRewardRsp.proto\"\220" +
      "\001\n\036LunaRiteTakeSacrificeRewardRsp\022\r\n\005ind" +
      "ex\030\013 \001(\r\022\035\n\025sacrifice_reward_list\030\002 \003(\r\022" +
      "\036\n\026sacrifice_reward_index\030\016 \001(\r\022\017\n\007area_" +
      "id\030\006 \001(\r\022\017\n\007retcode\030\014 \001(\005B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LunaRiteTakeSacrificeRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LunaRiteTakeSacrificeRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunaRiteTakeSacrificeRewardRsp_descriptor,
        new java.lang.String[] { "Index", "SacrificeRewardList", "SacrificeRewardIndex", "AreaId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

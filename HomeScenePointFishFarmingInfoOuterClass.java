// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeScenePointFishFarmingInfo.proto

package emu.grasscutter.net.proto;

public final class HomeScenePointFishFarmingInfoOuterClass {
  private HomeScenePointFishFarmingInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeScenePointFishFarmingInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeScenePointFishFarmingInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 13;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>repeated uint32 fish_id_list = 1;</code>
     * @return A list containing the fishIdList.
     */
    java.util.List<java.lang.Integer> getFishIdListList();
    /**
     * <code>repeated uint32 fish_id_list = 1;</code>
     * @return The count of fishIdList.
     */
    int getFishIdListCount();
    /**
     * <code>repeated uint32 fish_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The fishIdList at the given index.
     */
    int getFishIdList(int index);

    /**
     * <code>uint32 local_entity_id = 3;</code>
     * @return The localEntityId.
     */
    int getLocalEntityId();
  }
  /**
   * Protobuf type {@code HomeScenePointFishFarmingInfo}
   */
  public static final class HomeScenePointFishFarmingInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeScenePointFishFarmingInfo)
      HomeScenePointFishFarmingInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeScenePointFishFarmingInfo.newBuilder() to construct.
    private HomeScenePointFishFarmingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeScenePointFishFarmingInfo() {
      fishIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeScenePointFishFarmingInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeScenePointFishFarmingInfo(
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
                fishIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fishIdList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fishIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fishIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 24: {

              localEntityId_ = input.readUInt32();
              break;
            }
            case 104: {

              sceneId_ = input.readUInt32();
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
          fishIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.internal_static_HomeScenePointFishFarmingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.internal_static_HomeScenePointFishFarmingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.class, emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 13;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 13;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int FISH_ID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList fishIdList_;
    /**
     * <code>repeated uint32 fish_id_list = 1;</code>
     * @return A list containing the fishIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFishIdListList() {
      return fishIdList_;
    }
    /**
     * <code>repeated uint32 fish_id_list = 1;</code>
     * @return The count of fishIdList.
     */
    public int getFishIdListCount() {
      return fishIdList_.size();
    }
    /**
     * <code>repeated uint32 fish_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The fishIdList at the given index.
     */
    public int getFishIdList(int index) {
      return fishIdList_.getInt(index);
    }
    private int fishIdListMemoizedSerializedSize = -1;

    public static final int LOCAL_ENTITY_ID_FIELD_NUMBER = 3;
    private int localEntityId_;
    /**
     * <code>uint32 local_entity_id = 3;</code>
     * @return The localEntityId.
     */
    @java.lang.Override
    public int getLocalEntityId() {
      return localEntityId_;
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
      if (getFishIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(fishIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fishIdList_.size(); i++) {
        output.writeUInt32NoTag(fishIdList_.getInt(i));
      }
      if (localEntityId_ != 0) {
        output.writeUInt32(3, localEntityId_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(13, sceneId_);
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
        for (int i = 0; i < fishIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fishIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFishIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fishIdListMemoizedSerializedSize = dataSize;
      }
      if (localEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, localEntityId_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo other = (emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (!getFishIdListList()
          .equals(other.getFishIdListList())) return false;
      if (getLocalEntityId()
          != other.getLocalEntityId()) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      if (getFishIdListCount() > 0) {
        hash = (37 * hash) + FISH_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFishIdListList().hashCode();
      }
      hash = (37 * hash) + LOCAL_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLocalEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo prototype) {
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
     * Protobuf type {@code HomeScenePointFishFarmingInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeScenePointFishFarmingInfo)
        emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.internal_static_HomeScenePointFishFarmingInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.internal_static_HomeScenePointFishFarmingInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.class, emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.newBuilder()
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
        sceneId_ = 0;

        fishIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        localEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.internal_static_HomeScenePointFishFarmingInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo build() {
        emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo buildPartial() {
        emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo result = new emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo(this);
        int from_bitField0_ = bitField0_;
        result.sceneId_ = sceneId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fishIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fishIdList_ = fishIdList_;
        result.localEntityId_ = localEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo other) {
        if (other == emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (!other.fishIdList_.isEmpty()) {
          if (fishIdList_.isEmpty()) {
            fishIdList_ = other.fishIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFishIdListIsMutable();
            fishIdList_.addAll(other.fishIdList_);
          }
          onChanged();
        }
        if (other.getLocalEntityId() != 0) {
          setLocalEntityId(other.getLocalEntityId());
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
        emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 13;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 13;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fishIdList_ = emptyIntList();
      private void ensureFishIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fishIdList_ = mutableCopy(fishIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fish_id_list = 1;</code>
       * @return A list containing the fishIdList.
       */
      public java.util.List<java.lang.Integer>
          getFishIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fishIdList_) : fishIdList_;
      }
      /**
       * <code>repeated uint32 fish_id_list = 1;</code>
       * @return The count of fishIdList.
       */
      public int getFishIdListCount() {
        return fishIdList_.size();
      }
      /**
       * <code>repeated uint32 fish_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The fishIdList at the given index.
       */
      public int getFishIdList(int index) {
        return fishIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fish_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The fishIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFishIdList(
          int index, int value) {
        ensureFishIdListIsMutable();
        fishIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 1;</code>
       * @param value The fishIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFishIdList(int value) {
        ensureFishIdListIsMutable();
        fishIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 1;</code>
       * @param values The fishIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFishIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFishIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fishIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFishIdList() {
        fishIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int localEntityId_ ;
      /**
       * <code>uint32 local_entity_id = 3;</code>
       * @return The localEntityId.
       */
      @java.lang.Override
      public int getLocalEntityId() {
        return localEntityId_;
      }
      /**
       * <code>uint32 local_entity_id = 3;</code>
       * @param value The localEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setLocalEntityId(int value) {
        
        localEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 local_entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocalEntityId() {
        
        localEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeScenePointFishFarmingInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeScenePointFishFarmingInfo)
    private static final emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo();
    }

    public static emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeScenePointFishFarmingInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeScenePointFishFarmingInfo>() {
      @java.lang.Override
      public HomeScenePointFishFarmingInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeScenePointFishFarmingInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeScenePointFishFarmingInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeScenePointFishFarmingInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeScenePointFishFarmingInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeScenePointFishFarmingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#HomeScenePointFishFarmingInfo.proto\"`\n" +
      "\035HomeScenePointFishFarmingInfo\022\020\n\010scene_" +
      "id\030\r \001(\r\022\024\n\014fish_id_list\030\001 \003(\r\022\027\n\017local_" +
      "entity_id\030\003 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeScenePointFishFarmingInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeScenePointFishFarmingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeScenePointFishFarmingInfo_descriptor,
        new java.lang.String[] { "SceneId", "FishIdList", "LocalEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

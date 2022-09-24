// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneDataNotify.proto

package emu.grasscutter.net.proto;

public final class SceneDataNotifyOuterClass {
  private SceneDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string level_config_name_list = 15;</code>
     * @return A list containing the levelConfigNameList.
     */
    java.util.List<java.lang.String>
        getLevelConfigNameListList();
    /**
     * <code>repeated string level_config_name_list = 15;</code>
     * @return The count of levelConfigNameList.
     */
    int getLevelConfigNameListCount();
    /**
     * <code>repeated string level_config_name_list = 15;</code>
     * @param index The index of the element to return.
     * @return The levelConfigNameList at the given index.
     */
    java.lang.String getLevelConfigNameList(int index);
    /**
     * <code>repeated string level_config_name_list = 15;</code>
     * @param index The index of the value to return.
     * @return The bytes of the levelConfigNameList at the given index.
     */
    com.google.protobuf.ByteString
        getLevelConfigNameListBytes(int index);

    /**
     * <code>repeated uint32 scene_tag_id_list = 8;</code>
     * @return A list containing the sceneTagIdList.
     */
    java.util.List<java.lang.Integer> getSceneTagIdListList();
    /**
     * <code>repeated uint32 scene_tag_id_list = 8;</code>
     * @return The count of sceneTagIdList.
     */
    int getSceneTagIdListCount();
    /**
     * <code>repeated uint32 scene_tag_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    int getSceneTagIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 3203
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SceneDataNotify}
   */
  public static final class SceneDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneDataNotify)
      SceneDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneDataNotify.newBuilder() to construct.
    private SceneDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneDataNotify() {
      levelConfigNameList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      sceneTagIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneDataNotify(
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
            case 64: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              sceneTagIdList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                sceneTagIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                levelConfigNameList_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              levelConfigNameList_.add(s);
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
          sceneTagIdList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          levelConfigNameList_ = levelConfigNameList_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneDataNotifyOuterClass.internal_static_SceneDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneDataNotifyOuterClass.internal_static_SceneDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify.class, emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify.Builder.class);
    }

    public static final int LEVEL_CONFIG_NAME_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.LazyStringList levelConfigNameList_;
    /**
     * <code>repeated string level_config_name_list = 15;</code>
     * @return A list containing the levelConfigNameList.
     */
    public com.google.protobuf.ProtocolStringList
        getLevelConfigNameListList() {
      return levelConfigNameList_;
    }
    /**
     * <code>repeated string level_config_name_list = 15;</code>
     * @return The count of levelConfigNameList.
     */
    public int getLevelConfigNameListCount() {
      return levelConfigNameList_.size();
    }
    /**
     * <code>repeated string level_config_name_list = 15;</code>
     * @param index The index of the element to return.
     * @return The levelConfigNameList at the given index.
     */
    public java.lang.String getLevelConfigNameList(int index) {
      return levelConfigNameList_.get(index);
    }
    /**
     * <code>repeated string level_config_name_list = 15;</code>
     * @param index The index of the value to return.
     * @return The bytes of the levelConfigNameList at the given index.
     */
    public com.google.protobuf.ByteString
        getLevelConfigNameListBytes(int index) {
      return levelConfigNameList_.getByteString(index);
    }

    public static final int SCENE_TAG_ID_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList sceneTagIdList_;
    /**
     * <code>repeated uint32 scene_tag_id_list = 8;</code>
     * @return A list containing the sceneTagIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSceneTagIdListList() {
      return sceneTagIdList_;
    }
    /**
     * <code>repeated uint32 scene_tag_id_list = 8;</code>
     * @return The count of sceneTagIdList.
     */
    public int getSceneTagIdListCount() {
      return sceneTagIdList_.size();
    }
    /**
     * <code>repeated uint32 scene_tag_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    public int getSceneTagIdList(int index) {
      return sceneTagIdList_.getInt(index);
    }
    private int sceneTagIdListMemoizedSerializedSize = -1;

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
      if (getSceneTagIdListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(sceneTagIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < sceneTagIdList_.size(); i++) {
        output.writeUInt32NoTag(sceneTagIdList_.getInt(i));
      }
      for (int i = 0; i < levelConfigNameList_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, levelConfigNameList_.getRaw(i));
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
        for (int i = 0; i < sceneTagIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sceneTagIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSceneTagIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sceneTagIdListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < levelConfigNameList_.size(); i++) {
          dataSize += computeStringSizeNoTag(levelConfigNameList_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getLevelConfigNameListList().size();
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify other = (emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify) obj;

      if (!getLevelConfigNameListList()
          .equals(other.getLevelConfigNameListList())) return false;
      if (!getSceneTagIdListList()
          .equals(other.getSceneTagIdListList())) return false;
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
      if (getLevelConfigNameListCount() > 0) {
        hash = (37 * hash) + LEVEL_CONFIG_NAME_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLevelConfigNameListList().hashCode();
      }
      if (getSceneTagIdListCount() > 0) {
        hash = (37 * hash) + SCENE_TAG_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneTagIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify prototype) {
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
     * CmdId: 3203
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SceneDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneDataNotify)
        emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneDataNotifyOuterClass.internal_static_SceneDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneDataNotifyOuterClass.internal_static_SceneDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify.class, emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify.newBuilder()
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
        levelConfigNameList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneDataNotifyOuterClass.internal_static_SceneDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify build() {
        emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify buildPartial() {
        emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify result = new emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          levelConfigNameList_ = levelConfigNameList_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.levelConfigNameList_ = levelConfigNameList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          sceneTagIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.sceneTagIdList_ = sceneTagIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify other) {
        if (other == emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify.getDefaultInstance()) return this;
        if (!other.levelConfigNameList_.isEmpty()) {
          if (levelConfigNameList_.isEmpty()) {
            levelConfigNameList_ = other.levelConfigNameList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLevelConfigNameListIsMutable();
            levelConfigNameList_.addAll(other.levelConfigNameList_);
          }
          onChanged();
        }
        if (!other.sceneTagIdList_.isEmpty()) {
          if (sceneTagIdList_.isEmpty()) {
            sceneTagIdList_ = other.sceneTagIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSceneTagIdListIsMutable();
            sceneTagIdList_.addAll(other.sceneTagIdList_);
          }
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
        emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList levelConfigNameList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureLevelConfigNameListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          levelConfigNameList_ = new com.google.protobuf.LazyStringArrayList(levelConfigNameList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @return A list containing the levelConfigNameList.
       */
      public com.google.protobuf.ProtocolStringList
          getLevelConfigNameListList() {
        return levelConfigNameList_.getUnmodifiableView();
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @return The count of levelConfigNameList.
       */
      public int getLevelConfigNameListCount() {
        return levelConfigNameList_.size();
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @param index The index of the element to return.
       * @return The levelConfigNameList at the given index.
       */
      public java.lang.String getLevelConfigNameList(int index) {
        return levelConfigNameList_.get(index);
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @param index The index of the value to return.
       * @return The bytes of the levelConfigNameList at the given index.
       */
      public com.google.protobuf.ByteString
          getLevelConfigNameListBytes(int index) {
        return levelConfigNameList_.getByteString(index);
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The levelConfigNameList to set.
       * @return This builder for chaining.
       */
      public Builder setLevelConfigNameList(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureLevelConfigNameListIsMutable();
        levelConfigNameList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @param value The levelConfigNameList to add.
       * @return This builder for chaining.
       */
      public Builder addLevelConfigNameList(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureLevelConfigNameListIsMutable();
        levelConfigNameList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @param values The levelConfigNameList to add.
       * @return This builder for chaining.
       */
      public Builder addAllLevelConfigNameList(
          java.lang.Iterable<java.lang.String> values) {
        ensureLevelConfigNameListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, levelConfigNameList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelConfigNameList() {
        levelConfigNameList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string level_config_name_list = 15;</code>
       * @param value The bytes of the levelConfigNameList to add.
       * @return This builder for chaining.
       */
      public Builder addLevelConfigNameListBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureLevelConfigNameListIsMutable();
        levelConfigNameList_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList sceneTagIdList_ = emptyIntList();
      private void ensureSceneTagIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          sceneTagIdList_ = mutableCopy(sceneTagIdList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 8;</code>
       * @return A list containing the sceneTagIdList.
       */
      public java.util.List<java.lang.Integer>
          getSceneTagIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(sceneTagIdList_) : sceneTagIdList_;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 8;</code>
       * @return The count of sceneTagIdList.
       */
      public int getSceneTagIdListCount() {
        return sceneTagIdList_.size();
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 8;</code>
       * @param index The index of the element to return.
       * @return The sceneTagIdList at the given index.
       */
      public int getSceneTagIdList(int index) {
        return sceneTagIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The sceneTagIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTagIdList(
          int index, int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 8;</code>
       * @param value The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSceneTagIdList(int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 8;</code>
       * @param values The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSceneTagIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSceneTagIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sceneTagIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTagIdList() {
        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:SceneDataNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneDataNotify)
    private static final emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify();
    }

    public static emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneDataNotify>() {
      @java.lang.Override
      public SceneDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneDataNotifyOuterClass.SceneDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SceneDataNotify.proto\"L\n\017SceneDataNoti" +
      "fy\022\036\n\026level_config_name_list\030\017 \003(\t\022\031\n\021sc" +
      "ene_tag_id_list\030\010 \003(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneDataNotify_descriptor,
        new java.lang.String[] { "LevelConfigNameList", "SceneTagIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

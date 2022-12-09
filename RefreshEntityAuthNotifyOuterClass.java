// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshEntityAuthNotify.proto

package emu.grasscutter.net.proto;

public final class RefreshEntityAuthNotifyOuterClass {
  private RefreshEntityAuthNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RefreshEntityAuthNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RefreshEntityAuthNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @return A list containing the entityIdList.
     */
    java.util.List<java.lang.Integer> getEntityIdListList();
    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @return The count of entityIdList.
     */
    int getEntityIdListCount();
    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    int getEntityIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3099;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RefreshEntityAuthNotify}
   */
  public static final class RefreshEntityAuthNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RefreshEntityAuthNotify)
      RefreshEntityAuthNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshEntityAuthNotify.newBuilder() to construct.
    private RefreshEntityAuthNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshEntityAuthNotify() {
      entityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RefreshEntityAuthNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshEntityAuthNotify(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                entityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              entityIdList_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                entityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                entityIdList_.addInt(input.readUInt32());
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
          entityIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.internal_static_RefreshEntityAuthNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.internal_static_RefreshEntityAuthNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify.class, emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify.Builder.class);
    }

    public static final int ENTITY_ID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList entityIdList_;
    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @return A list containing the entityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEntityIdListList() {
      return entityIdList_;
    }
    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @return The count of entityIdList.
     */
    public int getEntityIdListCount() {
      return entityIdList_.size();
    }
    /**
     * <code>repeated uint32 entity_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    public int getEntityIdList(int index) {
      return entityIdList_.getInt(index);
    }
    private int entityIdListMemoizedSerializedSize = -1;

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
      if (getEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(entityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < entityIdList_.size(); i++) {
        output.writeUInt32NoTag(entityIdList_.getInt(i));
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
        for (int i = 0; i < entityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(entityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        entityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify other = (emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify) obj;

      if (!getEntityIdListList()
          .equals(other.getEntityIdListList())) return false;
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
      if (getEntityIdListCount() > 0) {
        hash = (37 * hash) + ENTITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 3099;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RefreshEntityAuthNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RefreshEntityAuthNotify)
        emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.internal_static_RefreshEntityAuthNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.internal_static_RefreshEntityAuthNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify.class, emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify.newBuilder()
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
        entityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.internal_static_RefreshEntityAuthNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify build() {
        emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify buildPartial() {
        emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify result = new emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          entityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entityIdList_ = entityIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify) {
          return mergeFrom((emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify other) {
        if (other == emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify.getDefaultInstance()) return this;
        if (!other.entityIdList_.isEmpty()) {
          if (entityIdList_.isEmpty()) {
            entityIdList_ = other.entityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntityIdListIsMutable();
            entityIdList_.addAll(other.entityIdList_);
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
        emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList entityIdList_ = emptyIntList();
      private void ensureEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityIdList_ = mutableCopy(entityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 entity_id_list = 4;</code>
       * @return A list containing the entityIdList.
       */
      public java.util.List<java.lang.Integer>
          getEntityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(entityIdList_) : entityIdList_;
      }
      /**
       * <code>repeated uint32 entity_id_list = 4;</code>
       * @return The count of entityIdList.
       */
      public int getEntityIdListCount() {
        return entityIdList_.size();
      }
      /**
       * <code>repeated uint32 entity_id_list = 4;</code>
       * @param index The index of the element to return.
       * @return The entityIdList at the given index.
       */
      public int getEntityIdList(int index) {
        return entityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 entity_id_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The entityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEntityIdList(
          int index, int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 4;</code>
       * @param value The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEntityIdList(int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 4;</code>
       * @param values The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityIdList() {
        entityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:RefreshEntityAuthNotify)
    }

    // @@protoc_insertion_point(class_scope:RefreshEntityAuthNotify)
    private static final emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify();
    }

    public static emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RefreshEntityAuthNotify>
        PARSER = new com.google.protobuf.AbstractParser<RefreshEntityAuthNotify>() {
      @java.lang.Override
      public RefreshEntityAuthNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RefreshEntityAuthNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RefreshEntityAuthNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshEntityAuthNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RefreshEntityAuthNotifyOuterClass.RefreshEntityAuthNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RefreshEntityAuthNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RefreshEntityAuthNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035RefreshEntityAuthNotify.proto\"1\n\027Refre" +
      "shEntityAuthNotify\022\026\n\016entity_id_list\030\004 \003" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RefreshEntityAuthNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RefreshEntityAuthNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RefreshEntityAuthNotify_descriptor,
        new java.lang.String[] { "EntityIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

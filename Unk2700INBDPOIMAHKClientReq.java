// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_INBDPOIMAHK_ClientReq.proto

package emu.grasscutter.net.proto;

public final class Unk2700INBDPOIMAHKClientReq {
  private Unk2700INBDPOIMAHKClientReq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_INBDPOIMAHK_ClientReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_INBDPOIMAHK_ClientReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 tag_list = 1;</code>
     * @return A list containing the tagList.
     */
    java.util.List<java.lang.Integer> getTagListList();
    /**
     * <code>repeated uint32 tag_list = 1;</code>
     * @return The count of tagList.
     */
    int getTagListCount();
    /**
     * <code>repeated uint32 tag_list = 1;</code>
     * @param index The index of the element to return.
     * @return The tagList at the given index.
     */
    int getTagList(int index);

    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    long getUnk2700ONOOJBEABOE();
  }
  /**
   * <pre>
   * CmdId: 6242
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_INBDPOIMAHK_ClientReq}
   */
  public static final class Unk2700_INBDPOIMAHK_ClientReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_INBDPOIMAHK_ClientReq)
      Unk2700_INBDPOIMAHK_ClientReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_INBDPOIMAHK_ClientReq.newBuilder() to construct.
    private Unk2700_INBDPOIMAHK_ClientReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_INBDPOIMAHK_ClientReq() {
      tagList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_INBDPOIMAHK_ClientReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_INBDPOIMAHK_ClientReq(
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
                tagList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              tagList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                tagList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                tagList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {

              unk2700ONOOJBEABOE_ = input.readUInt64();
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
          tagList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.internal_static_Unk2700_INBDPOIMAHK_ClientReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.internal_static_Unk2700_INBDPOIMAHK_ClientReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq.class, emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq.Builder.class);
    }

    public static final int TAG_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList tagList_;
    /**
     * <code>repeated uint32 tag_list = 1;</code>
     * @return A list containing the tagList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTagListList() {
      return tagList_;
    }
    /**
     * <code>repeated uint32 tag_list = 1;</code>
     * @return The count of tagList.
     */
    public int getTagListCount() {
      return tagList_.size();
    }
    /**
     * <code>repeated uint32 tag_list = 1;</code>
     * @param index The index of the element to return.
     * @return The tagList at the given index.
     */
    public int getTagList(int index) {
      return tagList_.getInt(index);
    }
    private int tagListMemoizedSerializedSize = -1;

    public static final int UNK2700_ONOOJBEABOE_FIELD_NUMBER = 5;
    private long unk2700ONOOJBEABOE_;
    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    @java.lang.Override
    public long getUnk2700ONOOJBEABOE() {
      return unk2700ONOOJBEABOE_;
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
      if (getTagListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(tagListMemoizedSerializedSize);
      }
      for (int i = 0; i < tagList_.size(); i++) {
        output.writeUInt32NoTag(tagList_.getInt(i));
      }
      if (unk2700ONOOJBEABOE_ != 0L) {
        output.writeUInt64(5, unk2700ONOOJBEABOE_);
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
        for (int i = 0; i < tagList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(tagList_.getInt(i));
        }
        size += dataSize;
        if (!getTagListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        tagListMemoizedSerializedSize = dataSize;
      }
      if (unk2700ONOOJBEABOE_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, unk2700ONOOJBEABOE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq other = (emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq) obj;

      if (!getTagListList()
          .equals(other.getTagListList())) return false;
      if (getUnk2700ONOOJBEABOE()
          != other.getUnk2700ONOOJBEABOE()) return false;
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
      if (getTagListCount() > 0) {
        hash = (37 * hash) + TAG_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTagListList().hashCode();
      }
      hash = (37 * hash) + UNK2700_ONOOJBEABOE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk2700ONOOJBEABOE());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq prototype) {
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
     * CmdId: 6242
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_INBDPOIMAHK_ClientReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_INBDPOIMAHK_ClientReq)
        emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.internal_static_Unk2700_INBDPOIMAHK_ClientReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.internal_static_Unk2700_INBDPOIMAHK_ClientReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq.class, emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq.newBuilder()
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
        tagList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk2700ONOOJBEABOE_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.internal_static_Unk2700_INBDPOIMAHK_ClientReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq build() {
        emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq buildPartial() {
        emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq result = new emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          tagList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tagList_ = tagList_;
        result.unk2700ONOOJBEABOE_ = unk2700ONOOJBEABOE_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq other) {
        if (other == emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq.getDefaultInstance()) return this;
        if (!other.tagList_.isEmpty()) {
          if (tagList_.isEmpty()) {
            tagList_ = other.tagList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagListIsMutable();
            tagList_.addAll(other.tagList_);
          }
          onChanged();
        }
        if (other.getUnk2700ONOOJBEABOE() != 0L) {
          setUnk2700ONOOJBEABOE(other.getUnk2700ONOOJBEABOE());
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
        emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList tagList_ = emptyIntList();
      private void ensureTagListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          tagList_ = mutableCopy(tagList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 tag_list = 1;</code>
       * @return A list containing the tagList.
       */
      public java.util.List<java.lang.Integer>
          getTagListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(tagList_) : tagList_;
      }
      /**
       * <code>repeated uint32 tag_list = 1;</code>
       * @return The count of tagList.
       */
      public int getTagListCount() {
        return tagList_.size();
      }
      /**
       * <code>repeated uint32 tag_list = 1;</code>
       * @param index The index of the element to return.
       * @return The tagList at the given index.
       */
      public int getTagList(int index) {
        return tagList_.getInt(index);
      }
      /**
       * <code>repeated uint32 tag_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The tagList to set.
       * @return This builder for chaining.
       */
      public Builder setTagList(
          int index, int value) {
        ensureTagListIsMutable();
        tagList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tag_list = 1;</code>
       * @param value The tagList to add.
       * @return This builder for chaining.
       */
      public Builder addTagList(int value) {
        ensureTagListIsMutable();
        tagList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tag_list = 1;</code>
       * @param values The tagList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTagList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTagListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tagList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tag_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTagList() {
        tagList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private long unk2700ONOOJBEABOE_ ;
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
       * @return The unk2700ONOOJBEABOE.
       */
      @java.lang.Override
      public long getUnk2700ONOOJBEABOE() {
        return unk2700ONOOJBEABOE_;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
       * @param value The unk2700ONOOJBEABOE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700ONOOJBEABOE(long value) {
        
        unk2700ONOOJBEABOE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700ONOOJBEABOE() {
        
        unk2700ONOOJBEABOE_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_INBDPOIMAHK_ClientReq)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_INBDPOIMAHK_ClientReq)
    private static final emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq();
    }

    public static emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_INBDPOIMAHK_ClientReq>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_INBDPOIMAHK_ClientReq>() {
      @java.lang.Override
      public Unk2700_INBDPOIMAHK_ClientReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_INBDPOIMAHK_ClientReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_INBDPOIMAHK_ClientReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_INBDPOIMAHK_ClientReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700INBDPOIMAHKClientReq.Unk2700_INBDPOIMAHK_ClientReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_INBDPOIMAHK_ClientReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_INBDPOIMAHK_ClientReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_INBDPOIMAHK_ClientReq.proto\"N\n" +
      "\035Unk2700_INBDPOIMAHK_ClientReq\022\020\n\010tag_li" +
      "st\030\001 \003(\r\022\033\n\023Unk2700_ONOOJBEABOE\030\005 \001(\004B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_INBDPOIMAHK_ClientReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_INBDPOIMAHK_ClientReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_INBDPOIMAHK_ClientReq_descriptor,
        new java.lang.String[] { "TagList", "Unk2700ONOOJBEABOE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

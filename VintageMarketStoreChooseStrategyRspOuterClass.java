// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketStoreChooseStrategyRsp.proto

package emu.grasscutter.net.proto;

public final class VintageMarketStoreChooseStrategyRspOuterClass {
  private VintageMarketStoreChooseStrategyRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketStoreChooseStrategyRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketStoreChooseStrategyRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 store_id = 15;</code>
     * @return The storeId.
     */
    int getStoreId();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 strategy_list = 2;</code>
     * @return A list containing the strategyList.
     */
    java.util.List<java.lang.Integer> getStrategyListList();
    /**
     * <code>repeated uint32 strategy_list = 2;</code>
     * @return The count of strategyList.
     */
    int getStrategyListCount();
    /**
     * <code>repeated uint32 strategy_list = 2;</code>
     * @param index The index of the element to return.
     * @return The strategyList at the given index.
     */
    int getStrategyList(int index);
  }
  /**
   * <pre>
   * CmdId: 24860
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code VintageMarketStoreChooseStrategyRsp}
   */
  public static final class VintageMarketStoreChooseStrategyRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketStoreChooseStrategyRsp)
      VintageMarketStoreChooseStrategyRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketStoreChooseStrategyRsp.newBuilder() to construct.
    private VintageMarketStoreChooseStrategyRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketStoreChooseStrategyRsp() {
      strategyList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketStoreChooseStrategyRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageMarketStoreChooseStrategyRsp(
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
                strategyList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              strategyList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                strategyList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                strategyList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              storeId_ = input.readUInt32();
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
          strategyList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.class, emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.Builder.class);
    }

    public static final int STORE_ID_FIELD_NUMBER = 15;
    private int storeId_;
    /**
     * <code>uint32 store_id = 15;</code>
     * @return The storeId.
     */
    @java.lang.Override
    public int getStoreId() {
      return storeId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int STRATEGY_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList strategyList_;
    /**
     * <code>repeated uint32 strategy_list = 2;</code>
     * @return A list containing the strategyList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getStrategyListList() {
      return strategyList_;
    }
    /**
     * <code>repeated uint32 strategy_list = 2;</code>
     * @return The count of strategyList.
     */
    public int getStrategyListCount() {
      return strategyList_.size();
    }
    /**
     * <code>repeated uint32 strategy_list = 2;</code>
     * @param index The index of the element to return.
     * @return The strategyList at the given index.
     */
    public int getStrategyList(int index) {
      return strategyList_.getInt(index);
    }
    private int strategyListMemoizedSerializedSize = -1;

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
      if (getStrategyListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(strategyListMemoizedSerializedSize);
      }
      for (int i = 0; i < strategyList_.size(); i++) {
        output.writeUInt32NoTag(strategyList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (storeId_ != 0) {
        output.writeUInt32(15, storeId_);
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
        for (int i = 0; i < strategyList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(strategyList_.getInt(i));
        }
        size += dataSize;
        if (!getStrategyListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        strategyListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (storeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, storeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp other = (emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp) obj;

      if (getStoreId()
          != other.getStoreId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getStrategyListList()
          .equals(other.getStrategyListList())) return false;
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
      hash = (37 * hash) + STORE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStoreId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getStrategyListCount() > 0) {
        hash = (37 * hash) + STRATEGY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStrategyListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp prototype) {
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
     * CmdId: 24860
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code VintageMarketStoreChooseStrategyRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketStoreChooseStrategyRsp)
        emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.class, emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.newBuilder()
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
        storeId_ = 0;

        retcode_ = 0;

        strategyList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp build() {
        emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp buildPartial() {
        emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp result = new emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp(this);
        int from_bitField0_ = bitField0_;
        result.storeId_ = storeId_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          strategyList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.strategyList_ = strategyList_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp other) {
        if (other == emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.getDefaultInstance()) return this;
        if (other.getStoreId() != 0) {
          setStoreId(other.getStoreId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.strategyList_.isEmpty()) {
          if (strategyList_.isEmpty()) {
            strategyList_ = other.strategyList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStrategyListIsMutable();
            strategyList_.addAll(other.strategyList_);
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
        emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int storeId_ ;
      /**
       * <code>uint32 store_id = 15;</code>
       * @return The storeId.
       */
      @java.lang.Override
      public int getStoreId() {
        return storeId_;
      }
      /**
       * <code>uint32 store_id = 15;</code>
       * @param value The storeId to set.
       * @return This builder for chaining.
       */
      public Builder setStoreId(int value) {
        
        storeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 store_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreId() {
        
        storeId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList strategyList_ = emptyIntList();
      private void ensureStrategyListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          strategyList_ = mutableCopy(strategyList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 strategy_list = 2;</code>
       * @return A list containing the strategyList.
       */
      public java.util.List<java.lang.Integer>
          getStrategyListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(strategyList_) : strategyList_;
      }
      /**
       * <code>repeated uint32 strategy_list = 2;</code>
       * @return The count of strategyList.
       */
      public int getStrategyListCount() {
        return strategyList_.size();
      }
      /**
       * <code>repeated uint32 strategy_list = 2;</code>
       * @param index The index of the element to return.
       * @return The strategyList at the given index.
       */
      public int getStrategyList(int index) {
        return strategyList_.getInt(index);
      }
      /**
       * <code>repeated uint32 strategy_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The strategyList to set.
       * @return This builder for chaining.
       */
      public Builder setStrategyList(
          int index, int value) {
        ensureStrategyListIsMutable();
        strategyList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 2;</code>
       * @param value The strategyList to add.
       * @return This builder for chaining.
       */
      public Builder addStrategyList(int value) {
        ensureStrategyListIsMutable();
        strategyList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 2;</code>
       * @param values The strategyList to add.
       * @return This builder for chaining.
       */
      public Builder addAllStrategyList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureStrategyListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, strategyList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStrategyList() {
        strategyList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:VintageMarketStoreChooseStrategyRsp)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketStoreChooseStrategyRsp)
    private static final emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp();
    }

    public static emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketStoreChooseStrategyRsp>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketStoreChooseStrategyRsp>() {
      @java.lang.Override
      public VintageMarketStoreChooseStrategyRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageMarketStoreChooseStrategyRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageMarketStoreChooseStrategyRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketStoreChooseStrategyRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketStoreChooseStrategyRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketStoreChooseStrategyRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)VintageMarketStoreChooseStrategyRsp.pr" +
      "oto\"_\n#VintageMarketStoreChooseStrategyR" +
      "sp\022\020\n\010store_id\030\017 \001(\r\022\017\n\007retcode\030\t \001(\005\022\025\n" +
      "\rstrategy_list\030\002 \003(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageMarketStoreChooseStrategyRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketStoreChooseStrategyRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketStoreChooseStrategyRsp_descriptor,
        new java.lang.String[] { "StoreId", "Retcode", "StrategyList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

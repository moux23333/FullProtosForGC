// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_KGNJIBIMAHI.proto

package emu.grasscutter.net.proto;

public final class Unk2700KGNJIBIMAHI {
  private Unk2700KGNJIBIMAHI() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_KGNJIBIMAHIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_KGNJIBIMAHI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new = 12;</code>
     * @return The isNew.
     */
    boolean getIsNew();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);

    /**
     * <code>uint32 Unk2700_BPNCECAFPDK = 11;</code>
     * @return The unk2700BPNCECAFPDK.
     */
    int getUnk2700BPNCECAFPDK();
  }
  /**
   * <pre>
   * CmdId: 8842
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_KGNJIBIMAHI}
   */
  public static final class Unk2700_KGNJIBIMAHI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_KGNJIBIMAHI)
      Unk2700_KGNJIBIMAHIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_KGNJIBIMAHI.newBuilder() to construct.
    private Unk2700_KGNJIBIMAHI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_KGNJIBIMAHI() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_KGNJIBIMAHI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_KGNJIBIMAHI(
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
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                affixList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              affixList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                affixList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                affixList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 88: {

              unk2700BPNCECAFPDK_ = input.readUInt32();
              break;
            }
            case 96: {

              isNew_ = input.readBool();
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
          affixList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.internal_static_Unk2700_KGNJIBIMAHI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.internal_static_Unk2700_KGNJIBIMAHI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI.class, emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI.Builder.class);
    }

    public static final int IS_NEW_FIELD_NUMBER = 12;
    private boolean isNew_;
    /**
     * <code>bool is_new = 12;</code>
     * @return The isNew.
     */
    @java.lang.Override
    public boolean getIsNew() {
      return isNew_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList affixList_;
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

    public static final int UNK2700_BPNCECAFPDK_FIELD_NUMBER = 11;
    private int unk2700BPNCECAFPDK_;
    /**
     * <code>uint32 Unk2700_BPNCECAFPDK = 11;</code>
     * @return The unk2700BPNCECAFPDK.
     */
    @java.lang.Override
    public int getUnk2700BPNCECAFPDK() {
      return unk2700BPNCECAFPDK_;
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (unk2700BPNCECAFPDK_ != 0) {
        output.writeUInt32(11, unk2700BPNCECAFPDK_);
      }
      if (isNew_ != false) {
        output.writeBool(12, isNew_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < affixList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(affixList_.getInt(i));
        }
        size += dataSize;
        if (!getAffixListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        affixListMemoizedSerializedSize = dataSize;
      }
      if (unk2700BPNCECAFPDK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk2700BPNCECAFPDK_);
      }
      if (isNew_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isNew_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI other = (emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI) obj;

      if (getIsNew()
          != other.getIsNew()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
      if (getUnk2700BPNCECAFPDK()
          != other.getUnk2700BPNCECAFPDK()) return false;
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
      hash = (37 * hash) + IS_NEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNew());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (37 * hash) + UNK2700_BPNCECAFPDK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700BPNCECAFPDK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI prototype) {
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
     * CmdId: 8842
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_KGNJIBIMAHI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_KGNJIBIMAHI)
        emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.internal_static_Unk2700_KGNJIBIMAHI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.internal_static_Unk2700_KGNJIBIMAHI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI.class, emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI.newBuilder()
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
        isNew_ = false;

        retcode_ = 0;

        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk2700BPNCECAFPDK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.internal_static_Unk2700_KGNJIBIMAHI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI build() {
        emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI buildPartial() {
        emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI result = new emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI(this);
        int from_bitField0_ = bitField0_;
        result.isNew_ = isNew_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          affixList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.affixList_ = affixList_;
        result.unk2700BPNCECAFPDK_ = unk2700BPNCECAFPDK_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI other) {
        if (other == emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI.getDefaultInstance()) return this;
        if (other.getIsNew() != false) {
          setIsNew(other.getIsNew());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.affixList_.isEmpty()) {
          if (affixList_.isEmpty()) {
            affixList_ = other.affixList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAffixListIsMutable();
            affixList_.addAll(other.affixList_);
          }
          onChanged();
        }
        if (other.getUnk2700BPNCECAFPDK() != 0) {
          setUnk2700BPNCECAFPDK(other.getUnk2700BPNCECAFPDK());
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
        emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isNew_ ;
      /**
       * <code>bool is_new = 12;</code>
       * @return The isNew.
       */
      @java.lang.Override
      public boolean getIsNew() {
        return isNew_;
      }
      /**
       * <code>bool is_new = 12;</code>
       * @param value The isNew to set.
       * @return This builder for chaining.
       */
      public Builder setIsNew(boolean value) {
        
        isNew_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNew() {
        
        isNew_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
      private void ensureAffixListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          affixList_ = mutableCopy(affixList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(affixList_) : affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The affixList to set.
       * @return This builder for chaining.
       */
      public Builder setAffixList(
          int index, int value) {
        ensureAffixListIsMutable();
        affixList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param value The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAffixList(int value) {
        ensureAffixListIsMutable();
        affixList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param values The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAffixList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAffixListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, affixList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int unk2700BPNCECAFPDK_ ;
      /**
       * <code>uint32 Unk2700_BPNCECAFPDK = 11;</code>
       * @return The unk2700BPNCECAFPDK.
       */
      @java.lang.Override
      public int getUnk2700BPNCECAFPDK() {
        return unk2700BPNCECAFPDK_;
      }
      /**
       * <code>uint32 Unk2700_BPNCECAFPDK = 11;</code>
       * @param value The unk2700BPNCECAFPDK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700BPNCECAFPDK(int value) {
        
        unk2700BPNCECAFPDK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_BPNCECAFPDK = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700BPNCECAFPDK() {
        
        unk2700BPNCECAFPDK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_KGNJIBIMAHI)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_KGNJIBIMAHI)
    private static final emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI();
    }

    public static emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_KGNJIBIMAHI>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_KGNJIBIMAHI>() {
      @java.lang.Override
      public Unk2700_KGNJIBIMAHI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_KGNJIBIMAHI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_KGNJIBIMAHI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_KGNJIBIMAHI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700KGNJIBIMAHI.Unk2700_KGNJIBIMAHI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_KGNJIBIMAHI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_KGNJIBIMAHI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_KGNJIBIMAHI.proto\"g\n\023Unk2700_K" +
      "GNJIBIMAHI\022\016\n\006is_new\030\014 \001(\010\022\017\n\007retcode\030\006 " +
      "\001(\005\022\022\n\naffix_list\030\010 \003(\r\022\033\n\023Unk2700_BPNCE" +
      "CAFPDK\030\013 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_KGNJIBIMAHI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_KGNJIBIMAHI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_KGNJIBIMAHI_descriptor,
        new java.lang.String[] { "IsNew", "Retcode", "AffixList", "Unk2700BPNCECAFPDK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3100_JJKFAMDHEBL.proto

package emu.grasscutter.net.proto;

public final class Unk3100JJKFAMDHEBL {
  private Unk3100JJKFAMDHEBL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3100_JJKFAMDHEBLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3100_JJKFAMDHEBL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3100_CIJIHEGPEMB = 15;</code>
     * @return The unk3100CIJIHEGPEMB.
     */
    int getUnk3100CIJIHEGPEMB();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
     * @return A list containing the unk3100CKOJIKGDEPO.
     */
    java.util.List<java.lang.Integer> getUnk3100CKOJIKGDEPOList();
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
     * @return The count of unk3100CKOJIKGDEPO.
     */
    int getUnk3100CKOJIKGDEPOCount();
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
     * @param index The index of the element to return.
     * @return The unk3100CKOJIKGDEPO at the given index.
     */
    int getUnk3100CKOJIKGDEPO(int index);
  }
  /**
   * <pre>
   * CmdId: 24860
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3100_JJKFAMDHEBL}
   */
  public static final class Unk3100_JJKFAMDHEBL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3100_JJKFAMDHEBL)
      Unk3100_JJKFAMDHEBLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3100_JJKFAMDHEBL.newBuilder() to construct.
    private Unk3100_JJKFAMDHEBL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3100_JJKFAMDHEBL() {
      unk3100CKOJIKGDEPO_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3100_JJKFAMDHEBL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3100_JJKFAMDHEBL(
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
                unk3100CKOJIKGDEPO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3100CKOJIKGDEPO_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk3100CKOJIKGDEPO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3100CKOJIKGDEPO_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              unk3100CIJIHEGPEMB_ = input.readUInt32();
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
          unk3100CKOJIKGDEPO_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.internal_static_Unk3100_JJKFAMDHEBL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.internal_static_Unk3100_JJKFAMDHEBL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL.class, emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL.Builder.class);
    }

    public static final int UNK3100_CIJIHEGPEMB_FIELD_NUMBER = 15;
    private int unk3100CIJIHEGPEMB_;
    /**
     * <code>uint32 Unk3100_CIJIHEGPEMB = 15;</code>
     * @return The unk3100CIJIHEGPEMB.
     */
    @java.lang.Override
    public int getUnk3100CIJIHEGPEMB() {
      return unk3100CIJIHEGPEMB_;
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

    public static final int UNK3100_CKOJIKGDEPO_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList unk3100CKOJIKGDEPO_;
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
     * @return A list containing the unk3100CKOJIKGDEPO.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3100CKOJIKGDEPOList() {
      return unk3100CKOJIKGDEPO_;
    }
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
     * @return The count of unk3100CKOJIKGDEPO.
     */
    public int getUnk3100CKOJIKGDEPOCount() {
      return unk3100CKOJIKGDEPO_.size();
    }
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
     * @param index The index of the element to return.
     * @return The unk3100CKOJIKGDEPO at the given index.
     */
    public int getUnk3100CKOJIKGDEPO(int index) {
      return unk3100CKOJIKGDEPO_.getInt(index);
    }
    private int unk3100CKOJIKGDEPOMemoizedSerializedSize = -1;

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
      if (getUnk3100CKOJIKGDEPOList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(unk3100CKOJIKGDEPOMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3100CKOJIKGDEPO_.size(); i++) {
        output.writeUInt32NoTag(unk3100CKOJIKGDEPO_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (unk3100CIJIHEGPEMB_ != 0) {
        output.writeUInt32(15, unk3100CIJIHEGPEMB_);
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
        for (int i = 0; i < unk3100CKOJIKGDEPO_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3100CKOJIKGDEPO_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3100CKOJIKGDEPOList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3100CKOJIKGDEPOMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (unk3100CIJIHEGPEMB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3100CIJIHEGPEMB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL other = (emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL) obj;

      if (getUnk3100CIJIHEGPEMB()
          != other.getUnk3100CIJIHEGPEMB()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getUnk3100CKOJIKGDEPOList()
          .equals(other.getUnk3100CKOJIKGDEPOList())) return false;
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
      hash = (37 * hash) + UNK3100_CIJIHEGPEMB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3100CIJIHEGPEMB();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getUnk3100CKOJIKGDEPOCount() > 0) {
        hash = (37 * hash) + UNK3100_CKOJIKGDEPO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3100CKOJIKGDEPOList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL prototype) {
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
     * Protobuf type {@code Unk3100_JJKFAMDHEBL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3100_JJKFAMDHEBL)
        emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.internal_static_Unk3100_JJKFAMDHEBL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.internal_static_Unk3100_JJKFAMDHEBL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL.class, emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL.newBuilder()
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
        unk3100CIJIHEGPEMB_ = 0;

        retcode_ = 0;

        unk3100CKOJIKGDEPO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.internal_static_Unk3100_JJKFAMDHEBL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL build() {
        emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL buildPartial() {
        emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL result = new emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL(this);
        int from_bitField0_ = bitField0_;
        result.unk3100CIJIHEGPEMB_ = unk3100CIJIHEGPEMB_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3100CKOJIKGDEPO_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3100CKOJIKGDEPO_ = unk3100CKOJIKGDEPO_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL other) {
        if (other == emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL.getDefaultInstance()) return this;
        if (other.getUnk3100CIJIHEGPEMB() != 0) {
          setUnk3100CIJIHEGPEMB(other.getUnk3100CIJIHEGPEMB());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.unk3100CKOJIKGDEPO_.isEmpty()) {
          if (unk3100CKOJIKGDEPO_.isEmpty()) {
            unk3100CKOJIKGDEPO_ = other.unk3100CKOJIKGDEPO_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3100CKOJIKGDEPOIsMutable();
            unk3100CKOJIKGDEPO_.addAll(other.unk3100CKOJIKGDEPO_);
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
        emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int unk3100CIJIHEGPEMB_ ;
      /**
       * <code>uint32 Unk3100_CIJIHEGPEMB = 15;</code>
       * @return The unk3100CIJIHEGPEMB.
       */
      @java.lang.Override
      public int getUnk3100CIJIHEGPEMB() {
        return unk3100CIJIHEGPEMB_;
      }
      /**
       * <code>uint32 Unk3100_CIJIHEGPEMB = 15;</code>
       * @param value The unk3100CIJIHEGPEMB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100CIJIHEGPEMB(int value) {
        
        unk3100CIJIHEGPEMB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3100_CIJIHEGPEMB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100CIJIHEGPEMB() {
        
        unk3100CIJIHEGPEMB_ = 0;
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

      private com.google.protobuf.Internal.IntList unk3100CKOJIKGDEPO_ = emptyIntList();
      private void ensureUnk3100CKOJIKGDEPOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3100CKOJIKGDEPO_ = mutableCopy(unk3100CKOJIKGDEPO_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
       * @return A list containing the unk3100CKOJIKGDEPO.
       */
      public java.util.List<java.lang.Integer>
          getUnk3100CKOJIKGDEPOList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3100CKOJIKGDEPO_) : unk3100CKOJIKGDEPO_;
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
       * @return The count of unk3100CKOJIKGDEPO.
       */
      public int getUnk3100CKOJIKGDEPOCount() {
        return unk3100CKOJIKGDEPO_.size();
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
       * @param index The index of the element to return.
       * @return The unk3100CKOJIKGDEPO at the given index.
       */
      public int getUnk3100CKOJIKGDEPO(int index) {
        return unk3100CKOJIKGDEPO_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
       * @param index The index to set the value at.
       * @param value The unk3100CKOJIKGDEPO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100CKOJIKGDEPO(
          int index, int value) {
        ensureUnk3100CKOJIKGDEPOIsMutable();
        unk3100CKOJIKGDEPO_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
       * @param value The unk3100CKOJIKGDEPO to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3100CKOJIKGDEPO(int value) {
        ensureUnk3100CKOJIKGDEPOIsMutable();
        unk3100CKOJIKGDEPO_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
       * @param values The unk3100CKOJIKGDEPO to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3100CKOJIKGDEPO(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3100CKOJIKGDEPOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3100CKOJIKGDEPO_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100CKOJIKGDEPO() {
        unk3100CKOJIKGDEPO_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk3100_JJKFAMDHEBL)
    }

    // @@protoc_insertion_point(class_scope:Unk3100_JJKFAMDHEBL)
    private static final emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL();
    }

    public static emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3100_JJKFAMDHEBL>
        PARSER = new com.google.protobuf.AbstractParser<Unk3100_JJKFAMDHEBL>() {
      @java.lang.Override
      public Unk3100_JJKFAMDHEBL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3100_JJKFAMDHEBL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3100_JJKFAMDHEBL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3100_JJKFAMDHEBL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3100JJKFAMDHEBL.Unk3100_JJKFAMDHEBL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3100_JJKFAMDHEBL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3100_JJKFAMDHEBL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3100_JJKFAMDHEBL.proto\"`\n\023Unk3100_J" +
      "JKFAMDHEBL\022\033\n\023Unk3100_CIJIHEGPEMB\030\017 \001(\r\022" +
      "\017\n\007retcode\030\t \001(\005\022\033\n\023Unk3100_CKOJIKGDEPO\030" +
      "\002 \003(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3100_JJKFAMDHEBL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3100_JJKFAMDHEBL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3100_JJKFAMDHEBL_descriptor,
        new java.lang.String[] { "Unk3100CIJIHEGPEMB", "Retcode", "Unk3100CKOJIKGDEPO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
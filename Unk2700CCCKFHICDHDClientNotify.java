// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_CCCKFHICDHD_ClientNotify.proto

package emu.grasscutter.net.proto;

public final class Unk2700CCCKFHICDHDClientNotify {
  private Unk2700CCCKFHICDHDClientNotify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_CCCKFHICDHD_ClientNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_CCCKFHICDHD_ClientNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
     * @return A list containing the unk2700KPKEIFJJDAO.
     */
    java.util.List<java.lang.Integer> getUnk2700KPKEIFJJDAOList();
    /**
     * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
     * @return The count of unk2700KPKEIFJJDAO.
     */
    int getUnk2700KPKEIFJJDAOCount();
    /**
     * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
     * @param index The index of the element to return.
     * @return The unk2700KPKEIFJJDAO at the given index.
     */
    int getUnk2700KPKEIFJJDAO(int index);
  }
  /**
   * <pre>
   * CmdId: 3314
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_CCCKFHICDHD_ClientNotify}
   */
  public static final class Unk2700_CCCKFHICDHD_ClientNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_CCCKFHICDHD_ClientNotify)
      Unk2700_CCCKFHICDHD_ClientNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_CCCKFHICDHD_ClientNotify.newBuilder() to construct.
    private Unk2700_CCCKFHICDHD_ClientNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_CCCKFHICDHD_ClientNotify() {
      unk2700KPKEIFJJDAO_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_CCCKFHICDHD_ClientNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_CCCKFHICDHD_ClientNotify(
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
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700KPKEIFJJDAO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700KPKEIFJJDAO_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk2700KPKEIFJJDAO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk2700KPKEIFJJDAO_.addInt(input.readUInt32());
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
          unk2700KPKEIFJJDAO_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.internal_static_Unk2700_CCCKFHICDHD_ClientNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.internal_static_Unk2700_CCCKFHICDHD_ClientNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify.class, emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify.Builder.class);
    }

    public static final int UNK2700_KPKEIFJJDAO_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList unk2700KPKEIFJJDAO_;
    /**
     * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
     * @return A list containing the unk2700KPKEIFJJDAO.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2700KPKEIFJJDAOList() {
      return unk2700KPKEIFJJDAO_;
    }
    /**
     * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
     * @return The count of unk2700KPKEIFJJDAO.
     */
    public int getUnk2700KPKEIFJJDAOCount() {
      return unk2700KPKEIFJJDAO_.size();
    }
    /**
     * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
     * @param index The index of the element to return.
     * @return The unk2700KPKEIFJJDAO at the given index.
     */
    public int getUnk2700KPKEIFJJDAO(int index) {
      return unk2700KPKEIFJJDAO_.getInt(index);
    }
    private int unk2700KPKEIFJJDAOMemoizedSerializedSize = -1;

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
      if (getUnk2700KPKEIFJJDAOList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(unk2700KPKEIFJJDAOMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700KPKEIFJJDAO_.size(); i++) {
        output.writeUInt32NoTag(unk2700KPKEIFJJDAO_.getInt(i));
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
        for (int i = 0; i < unk2700KPKEIFJJDAO_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2700KPKEIFJJDAO_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2700KPKEIFJJDAOList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700KPKEIFJJDAOMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify other = (emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify) obj;

      if (!getUnk2700KPKEIFJJDAOList()
          .equals(other.getUnk2700KPKEIFJJDAOList())) return false;
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
      if (getUnk2700KPKEIFJJDAOCount() > 0) {
        hash = (37 * hash) + UNK2700_KPKEIFJJDAO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700KPKEIFJJDAOList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify prototype) {
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
     * CmdId: 3314
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_CCCKFHICDHD_ClientNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_CCCKFHICDHD_ClientNotify)
        emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.internal_static_Unk2700_CCCKFHICDHD_ClientNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.internal_static_Unk2700_CCCKFHICDHD_ClientNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify.class, emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify.newBuilder()
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
        unk2700KPKEIFJJDAO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.internal_static_Unk2700_CCCKFHICDHD_ClientNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify build() {
        emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify buildPartial() {
        emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify result = new emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700KPKEIFJJDAO_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700KPKEIFJJDAO_ = unk2700KPKEIFJJDAO_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify other) {
        if (other == emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify.getDefaultInstance()) return this;
        if (!other.unk2700KPKEIFJJDAO_.isEmpty()) {
          if (unk2700KPKEIFJJDAO_.isEmpty()) {
            unk2700KPKEIFJJDAO_ = other.unk2700KPKEIFJJDAO_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700KPKEIFJJDAOIsMutable();
            unk2700KPKEIFJJDAO_.addAll(other.unk2700KPKEIFJJDAO_);
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
        emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unk2700KPKEIFJJDAO_ = emptyIntList();
      private void ensureUnk2700KPKEIFJJDAOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700KPKEIFJJDAO_ = mutableCopy(unk2700KPKEIFJJDAO_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
       * @return A list containing the unk2700KPKEIFJJDAO.
       */
      public java.util.List<java.lang.Integer>
          getUnk2700KPKEIFJJDAOList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700KPKEIFJJDAO_) : unk2700KPKEIFJJDAO_;
      }
      /**
       * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
       * @return The count of unk2700KPKEIFJJDAO.
       */
      public int getUnk2700KPKEIFJJDAOCount() {
        return unk2700KPKEIFJJDAO_.size();
      }
      /**
       * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
       * @param index The index of the element to return.
       * @return The unk2700KPKEIFJJDAO at the given index.
       */
      public int getUnk2700KPKEIFJJDAO(int index) {
        return unk2700KPKEIFJJDAO_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
       * @param index The index to set the value at.
       * @param value The unk2700KPKEIFJJDAO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KPKEIFJJDAO(
          int index, int value) {
        ensureUnk2700KPKEIFJJDAOIsMutable();
        unk2700KPKEIFJJDAO_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
       * @param value The unk2700KPKEIFJJDAO to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700KPKEIFJJDAO(int value) {
        ensureUnk2700KPKEIFJJDAOIsMutable();
        unk2700KPKEIFJJDAO_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
       * @param values The unk2700KPKEIFJJDAO to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700KPKEIFJJDAO(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2700KPKEIFJJDAOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700KPKEIFJJDAO_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_KPKEIFJJDAO = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KPKEIFJJDAO() {
        unk2700KPKEIFJJDAO_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk2700_CCCKFHICDHD_ClientNotify)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_CCCKFHICDHD_ClientNotify)
    private static final emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify();
    }

    public static emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_CCCKFHICDHD_ClientNotify>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_CCCKFHICDHD_ClientNotify>() {
      @java.lang.Override
      public Unk2700_CCCKFHICDHD_ClientNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_CCCKFHICDHD_ClientNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_CCCKFHICDHD_ClientNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_CCCKFHICDHD_ClientNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700CCCKFHICDHDClientNotify.Unk2700_CCCKFHICDHD_ClientNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_CCCKFHICDHD_ClientNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_CCCKFHICDHD_ClientNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&Unk2700_CCCKFHICDHD_ClientNotify.proto" +
      "\"?\n Unk2700_CCCKFHICDHD_ClientNotify\022\033\n\023" +
      "Unk2700_KPKEIFJJDAO\030\t \003(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_CCCKFHICDHD_ClientNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_CCCKFHICDHD_ClientNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_CCCKFHICDHD_ClientNotify_descriptor,
        new java.lang.String[] { "Unk2700KPKEIFJJDAO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

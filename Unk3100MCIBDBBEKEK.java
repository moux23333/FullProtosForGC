// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3100_MCIBDBBEKEK.proto

package emu.grasscutter.net.proto;

public final class Unk3100MCIBDBBEKEK {
  private Unk3100MCIBDBBEKEK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3100_MCIBDBBEKEKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3100_MCIBDBBEKEK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
     * @return A list containing the unk3100NNOCAMHJFAO.
     */
    java.util.List<java.lang.Integer> getUnk3100NNOCAMHJFAOList();
    /**
     * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
     * @return The count of unk3100NNOCAMHJFAO.
     */
    int getUnk3100NNOCAMHJFAOCount();
    /**
     * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
     * @param index The index of the element to return.
     * @return The unk3100NNOCAMHJFAO at the given index.
     */
    int getUnk3100NNOCAMHJFAO(int index);

    /**
     * <code>uint32 Unk3100_NDGIJLCIEDB = 13;</code>
     * @return The unk3100NDGIJLCIEDB.
     */
    int getUnk3100NDGIJLCIEDB();
  }
  /**
   * Protobuf type {@code Unk3100_MCIBDBBEKEK}
   */
  public static final class Unk3100_MCIBDBBEKEK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3100_MCIBDBBEKEK)
      Unk3100_MCIBDBBEKEKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3100_MCIBDBBEKEK.newBuilder() to construct.
    private Unk3100_MCIBDBBEKEK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3100_MCIBDBBEKEK() {
      unk3100NNOCAMHJFAO_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3100_MCIBDBBEKEK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3100_MCIBDBBEKEK(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk3100NNOCAMHJFAO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3100NNOCAMHJFAO_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk3100NNOCAMHJFAO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3100NNOCAMHJFAO_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {

              unk3100NDGIJLCIEDB_ = input.readUInt32();
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
          unk3100NNOCAMHJFAO_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.internal_static_Unk3100_MCIBDBBEKEK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.internal_static_Unk3100_MCIBDBBEKEK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK.class, emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK.Builder.class);
    }

    public static final int UNK3100_NNOCAMHJFAO_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList unk3100NNOCAMHJFAO_;
    /**
     * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
     * @return A list containing the unk3100NNOCAMHJFAO.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3100NNOCAMHJFAOList() {
      return unk3100NNOCAMHJFAO_;
    }
    /**
     * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
     * @return The count of unk3100NNOCAMHJFAO.
     */
    public int getUnk3100NNOCAMHJFAOCount() {
      return unk3100NNOCAMHJFAO_.size();
    }
    /**
     * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
     * @param index The index of the element to return.
     * @return The unk3100NNOCAMHJFAO at the given index.
     */
    public int getUnk3100NNOCAMHJFAO(int index) {
      return unk3100NNOCAMHJFAO_.getInt(index);
    }
    private int unk3100NNOCAMHJFAOMemoizedSerializedSize = -1;

    public static final int UNK3100_NDGIJLCIEDB_FIELD_NUMBER = 13;
    private int unk3100NDGIJLCIEDB_;
    /**
     * <code>uint32 Unk3100_NDGIJLCIEDB = 13;</code>
     * @return The unk3100NDGIJLCIEDB.
     */
    @java.lang.Override
    public int getUnk3100NDGIJLCIEDB() {
      return unk3100NDGIJLCIEDB_;
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
      if (getUnk3100NNOCAMHJFAOList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(unk3100NNOCAMHJFAOMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3100NNOCAMHJFAO_.size(); i++) {
        output.writeUInt32NoTag(unk3100NNOCAMHJFAO_.getInt(i));
      }
      if (unk3100NDGIJLCIEDB_ != 0) {
        output.writeUInt32(13, unk3100NDGIJLCIEDB_);
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
        for (int i = 0; i < unk3100NNOCAMHJFAO_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3100NNOCAMHJFAO_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3100NNOCAMHJFAOList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3100NNOCAMHJFAOMemoizedSerializedSize = dataSize;
      }
      if (unk3100NDGIJLCIEDB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3100NDGIJLCIEDB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK other = (emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK) obj;

      if (!getUnk3100NNOCAMHJFAOList()
          .equals(other.getUnk3100NNOCAMHJFAOList())) return false;
      if (getUnk3100NDGIJLCIEDB()
          != other.getUnk3100NDGIJLCIEDB()) return false;
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
      if (getUnk3100NNOCAMHJFAOCount() > 0) {
        hash = (37 * hash) + UNK3100_NNOCAMHJFAO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3100NNOCAMHJFAOList().hashCode();
      }
      hash = (37 * hash) + UNK3100_NDGIJLCIEDB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3100NDGIJLCIEDB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK prototype) {
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
     * Protobuf type {@code Unk3100_MCIBDBBEKEK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3100_MCIBDBBEKEK)
        emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.internal_static_Unk3100_MCIBDBBEKEK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.internal_static_Unk3100_MCIBDBBEKEK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK.class, emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK.newBuilder()
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
        unk3100NNOCAMHJFAO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3100NDGIJLCIEDB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.internal_static_Unk3100_MCIBDBBEKEK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK build() {
        emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK buildPartial() {
        emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK result = new emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3100NNOCAMHJFAO_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3100NNOCAMHJFAO_ = unk3100NNOCAMHJFAO_;
        result.unk3100NDGIJLCIEDB_ = unk3100NDGIJLCIEDB_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK other) {
        if (other == emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK.getDefaultInstance()) return this;
        if (!other.unk3100NNOCAMHJFAO_.isEmpty()) {
          if (unk3100NNOCAMHJFAO_.isEmpty()) {
            unk3100NNOCAMHJFAO_ = other.unk3100NNOCAMHJFAO_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3100NNOCAMHJFAOIsMutable();
            unk3100NNOCAMHJFAO_.addAll(other.unk3100NNOCAMHJFAO_);
          }
          onChanged();
        }
        if (other.getUnk3100NDGIJLCIEDB() != 0) {
          setUnk3100NDGIJLCIEDB(other.getUnk3100NDGIJLCIEDB());
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
        emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unk3100NNOCAMHJFAO_ = emptyIntList();
      private void ensureUnk3100NNOCAMHJFAOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3100NNOCAMHJFAO_ = mutableCopy(unk3100NNOCAMHJFAO_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
       * @return A list containing the unk3100NNOCAMHJFAO.
       */
      public java.util.List<java.lang.Integer>
          getUnk3100NNOCAMHJFAOList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3100NNOCAMHJFAO_) : unk3100NNOCAMHJFAO_;
      }
      /**
       * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
       * @return The count of unk3100NNOCAMHJFAO.
       */
      public int getUnk3100NNOCAMHJFAOCount() {
        return unk3100NNOCAMHJFAO_.size();
      }
      /**
       * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
       * @param index The index of the element to return.
       * @return The unk3100NNOCAMHJFAO at the given index.
       */
      public int getUnk3100NNOCAMHJFAO(int index) {
        return unk3100NNOCAMHJFAO_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
       * @param index The index to set the value at.
       * @param value The unk3100NNOCAMHJFAO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100NNOCAMHJFAO(
          int index, int value) {
        ensureUnk3100NNOCAMHJFAOIsMutable();
        unk3100NNOCAMHJFAO_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
       * @param value The unk3100NNOCAMHJFAO to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3100NNOCAMHJFAO(int value) {
        ensureUnk3100NNOCAMHJFAOIsMutable();
        unk3100NNOCAMHJFAO_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
       * @param values The unk3100NNOCAMHJFAO to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3100NNOCAMHJFAO(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3100NNOCAMHJFAOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3100NNOCAMHJFAO_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_NNOCAMHJFAO = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100NNOCAMHJFAO() {
        unk3100NNOCAMHJFAO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int unk3100NDGIJLCIEDB_ ;
      /**
       * <code>uint32 Unk3100_NDGIJLCIEDB = 13;</code>
       * @return The unk3100NDGIJLCIEDB.
       */
      @java.lang.Override
      public int getUnk3100NDGIJLCIEDB() {
        return unk3100NDGIJLCIEDB_;
      }
      /**
       * <code>uint32 Unk3100_NDGIJLCIEDB = 13;</code>
       * @param value The unk3100NDGIJLCIEDB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100NDGIJLCIEDB(int value) {
        
        unk3100NDGIJLCIEDB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3100_NDGIJLCIEDB = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100NDGIJLCIEDB() {
        
        unk3100NDGIJLCIEDB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3100_MCIBDBBEKEK)
    }

    // @@protoc_insertion_point(class_scope:Unk3100_MCIBDBBEKEK)
    private static final emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK();
    }

    public static emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3100_MCIBDBBEKEK>
        PARSER = new com.google.protobuf.AbstractParser<Unk3100_MCIBDBBEKEK>() {
      @java.lang.Override
      public Unk3100_MCIBDBBEKEK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3100_MCIBDBBEKEK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3100_MCIBDBBEKEK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3100_MCIBDBBEKEK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3100MCIBDBBEKEK.Unk3100_MCIBDBBEKEK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3100_MCIBDBBEKEK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3100_MCIBDBBEKEK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3100_MCIBDBBEKEK.proto\"O\n\023Unk3100_M" +
      "CIBDBBEKEK\022\033\n\023Unk3100_NNOCAMHJFAO\030\010 \003(\r\022" +
      "\033\n\023Unk3100_NDGIJLCIEDB\030\r \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3100_MCIBDBBEKEK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3100_MCIBDBBEKEK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3100_MCIBDBBEKEK_descriptor,
        new java.lang.String[] { "Unk3100NNOCAMHJFAO", "Unk3100NDGIJLCIEDB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

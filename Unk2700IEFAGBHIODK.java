// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_IEFAGBHIODK.proto

package emu.grasscutter.net.proto;

public final class Unk2700IEFAGBHIODK {
  private Unk2700IEFAGBHIODK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_IEFAGBHIODKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_IEFAGBHIODK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
     * @return A list containing the unk2700CPOJCHEOPLB.
     */
    java.util.List<java.lang.Integer> getUnk2700CPOJCHEOPLBList();
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
     * @return The count of unk2700CPOJCHEOPLB.
     */
    int getUnk2700CPOJCHEOPLBCount();
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
     * @param index The index of the element to return.
     * @return The unk2700CPOJCHEOPLB at the given index.
     */
    int getUnk2700CPOJCHEOPLB(int index);

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 time = 8;</code>
     * @return The time.
     */
    int getTime();
  }
  /**
   * <pre>
   * CmdId: 8402
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_IEFAGBHIODK}
   */
  public static final class Unk2700_IEFAGBHIODK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_IEFAGBHIODK)
      Unk2700_IEFAGBHIODKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_IEFAGBHIODK.newBuilder() to construct.
    private Unk2700_IEFAGBHIODK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_IEFAGBHIODK() {
      unk2700CPOJCHEOPLB_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_IEFAGBHIODK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_IEFAGBHIODK(
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
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 64: {

              time_ = input.readUInt32();
              break;
            }
            case 80: {

              levelId_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700CPOJCHEOPLB_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700CPOJCHEOPLB_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk2700CPOJCHEOPLB_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk2700CPOJCHEOPLB_.addInt(input.readUInt32());
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
          unk2700CPOJCHEOPLB_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.class, emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK2700_CPOJCHEOPLB_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList unk2700CPOJCHEOPLB_;
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
     * @return A list containing the unk2700CPOJCHEOPLB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2700CPOJCHEOPLBList() {
      return unk2700CPOJCHEOPLB_;
    }
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
     * @return The count of unk2700CPOJCHEOPLB.
     */
    public int getUnk2700CPOJCHEOPLBCount() {
      return unk2700CPOJCHEOPLB_.size();
    }
    /**
     * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
     * @param index The index of the element to return.
     * @return The unk2700CPOJCHEOPLB at the given index.
     */
    public int getUnk2700CPOJCHEOPLB(int index) {
      return unk2700CPOJCHEOPLB_.getInt(index);
    }
    private int unk2700CPOJCHEOPLBMemoizedSerializedSize = -1;

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int TIME_FIELD_NUMBER = 8;
    private int time_;
    /**
     * <code>uint32 time = 8;</code>
     * @return The time.
     */
    @java.lang.Override
    public int getTime() {
      return time_;
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
        output.writeInt32(5, retcode_);
      }
      if (time_ != 0) {
        output.writeUInt32(8, time_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      if (getUnk2700CPOJCHEOPLBList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(unk2700CPOJCHEOPLBMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700CPOJCHEOPLB_.size(); i++) {
        output.writeUInt32NoTag(unk2700CPOJCHEOPLB_.getInt(i));
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
          .computeInt32Size(5, retcode_);
      }
      if (time_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, time_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk2700CPOJCHEOPLB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2700CPOJCHEOPLB_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2700CPOJCHEOPLBList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700CPOJCHEOPLBMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK other = (emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getUnk2700CPOJCHEOPLBList()
          .equals(other.getUnk2700CPOJCHEOPLBList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getTime()
          != other.getTime()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getUnk2700CPOJCHEOPLBCount() > 0) {
        hash = (37 * hash) + UNK2700_CPOJCHEOPLB_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700CPOJCHEOPLBList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK prototype) {
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
     * CmdId: 8402
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_IEFAGBHIODK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_IEFAGBHIODK)
        emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.class, emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.newBuilder()
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
        retcode_ = 0;

        unk2700CPOJCHEOPLB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;

        time_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.internal_static_Unk2700_IEFAGBHIODK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK build() {
        emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK buildPartial() {
        emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK result = new emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700CPOJCHEOPLB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700CPOJCHEOPLB_ = unk2700CPOJCHEOPLB_;
        result.levelId_ = levelId_;
        result.time_ = time_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK other) {
        if (other == emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.unk2700CPOJCHEOPLB_.isEmpty()) {
          if (unk2700CPOJCHEOPLB_.isEmpty()) {
            unk2700CPOJCHEOPLB_ = other.unk2700CPOJCHEOPLB_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700CPOJCHEOPLBIsMutable();
            unk2700CPOJCHEOPLB_.addAll(other.unk2700CPOJCHEOPLB_);
          }
          onChanged();
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getTime() != 0) {
          setTime(other.getTime());
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
        emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk2700CPOJCHEOPLB_ = emptyIntList();
      private void ensureUnk2700CPOJCHEOPLBIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700CPOJCHEOPLB_ = mutableCopy(unk2700CPOJCHEOPLB_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
       * @return A list containing the unk2700CPOJCHEOPLB.
       */
      public java.util.List<java.lang.Integer>
          getUnk2700CPOJCHEOPLBList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700CPOJCHEOPLB_) : unk2700CPOJCHEOPLB_;
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
       * @return The count of unk2700CPOJCHEOPLB.
       */
      public int getUnk2700CPOJCHEOPLBCount() {
        return unk2700CPOJCHEOPLB_.size();
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
       * @param index The index of the element to return.
       * @return The unk2700CPOJCHEOPLB at the given index.
       */
      public int getUnk2700CPOJCHEOPLB(int index) {
        return unk2700CPOJCHEOPLB_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
       * @param index The index to set the value at.
       * @param value The unk2700CPOJCHEOPLB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700CPOJCHEOPLB(
          int index, int value) {
        ensureUnk2700CPOJCHEOPLBIsMutable();
        unk2700CPOJCHEOPLB_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
       * @param value The unk2700CPOJCHEOPLB to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700CPOJCHEOPLB(int value) {
        ensureUnk2700CPOJCHEOPLBIsMutable();
        unk2700CPOJCHEOPLB_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
       * @param values The unk2700CPOJCHEOPLB to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700CPOJCHEOPLB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2700CPOJCHEOPLBIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700CPOJCHEOPLB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_CPOJCHEOPLB = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700CPOJCHEOPLB() {
        unk2700CPOJCHEOPLB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int time_ ;
      /**
       * <code>uint32 time = 8;</code>
       * @return The time.
       */
      @java.lang.Override
      public int getTime() {
        return time_;
      }
      /**
       * <code>uint32 time = 8;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(int value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        
        time_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_IEFAGBHIODK)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_IEFAGBHIODK)
    private static final emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK();
    }

    public static emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_IEFAGBHIODK>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_IEFAGBHIODK>() {
      @java.lang.Override
      public Unk2700_IEFAGBHIODK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_IEFAGBHIODK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_IEFAGBHIODK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_IEFAGBHIODK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700IEFAGBHIODK.Unk2700_IEFAGBHIODK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_IEFAGBHIODK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_IEFAGBHIODK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_IEFAGBHIODK.proto\"c\n\023Unk2700_I" +
      "EFAGBHIODK\022\017\n\007retcode\030\005 \001(\005\022\033\n\023Unk2700_C" +
      "POJCHEOPLB\030\r \003(\r\022\020\n\010level_id\030\n \001(\r\022\014\n\004ti" +
      "me\030\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_IEFAGBHIODK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_IEFAGBHIODK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_IEFAGBHIODK_descriptor,
        new java.lang.String[] { "Retcode", "Unk2700CPOJCHEOPLB", "LevelId", "Time", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

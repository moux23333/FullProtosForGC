// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_EOHBLDIKPME.proto

package emu.grasscutter.net.proto;

public final class Unk2700EOHBLDIKPME {
  private Unk2700EOHBLDIKPME() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_EOHBLDIKPMEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_EOHBLDIKPME)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 map_id = 6;</code>
     * @return The mapId.
     */
    int getMapId();

    /**
     * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
     * @return Whether the unk2700JONOMFENDFP field is set.
     */
    boolean hasUnk2700JONOMFENDFP();
    /**
     * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
     * @return The unk2700JONOMFENDFP.
     */
    emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB getUnk2700JONOMFENDFP();
    /**
     * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
     */
    emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFBOrBuilder getUnk2700JONOMFENDFPOrBuilder();

    /**
     * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
     * @return A list containing the unk2700LDIGKKLLDOC.
     */
    java.util.List<java.lang.Integer> getUnk2700LDIGKKLLDOCList();
    /**
     * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
     * @return The count of unk2700LDIGKKLLDOC.
     */
    int getUnk2700LDIGKKLLDOCCount();
    /**
     * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
     * @param index The index of the element to return.
     * @return The unk2700LDIGKKLLDOC at the given index.
     */
    int getUnk2700LDIGKKLLDOC(int index);

    /**
     * <code>uint32 best_score = 8;</code>
     * @return The bestScore.
     */
    int getBestScore();
  }
  /**
   * Protobuf type {@code Unk2700_EOHBLDIKPME}
   */
  public static final class Unk2700_EOHBLDIKPME extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_EOHBLDIKPME)
      Unk2700_EOHBLDIKPMEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_EOHBLDIKPME.newBuilder() to construct.
    private Unk2700_EOHBLDIKPME(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_EOHBLDIKPME() {
      unk2700LDIGKKLLDOC_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_EOHBLDIKPME();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_EOHBLDIKPME(
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700LDIGKKLLDOC_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700LDIGKKLLDOC_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk2700LDIGKKLLDOC_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk2700LDIGKKLLDOC_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              mapId_ = input.readUInt32();
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.Builder subBuilder = null;
              if (unk2700JONOMFENDFP_ != null) {
                subBuilder = unk2700JONOMFENDFP_.toBuilder();
              }
              unk2700JONOMFENDFP_ = input.readMessage(emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(unk2700JONOMFENDFP_);
                unk2700JONOMFENDFP_ = subBuilder.buildPartial();
              }

              break;
            }
            case 64: {

              bestScore_ = input.readUInt32();
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
          unk2700LDIGKKLLDOC_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.internal_static_Unk2700_EOHBLDIKPME_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.internal_static_Unk2700_EOHBLDIKPME_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME.class, emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME.Builder.class);
    }

    public static final int MAP_ID_FIELD_NUMBER = 6;
    private int mapId_;
    /**
     * <code>uint32 map_id = 6;</code>
     * @return The mapId.
     */
    @java.lang.Override
    public int getMapId() {
      return mapId_;
    }

    public static final int UNK2700_JONOMFENDFP_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB unk2700JONOMFENDFP_;
    /**
     * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
     * @return Whether the unk2700JONOMFENDFP field is set.
     */
    @java.lang.Override
    public boolean hasUnk2700JONOMFENDFP() {
      return unk2700JONOMFENDFP_ != null;
    }
    /**
     * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
     * @return The unk2700JONOMFENDFP.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB getUnk2700JONOMFENDFP() {
      return unk2700JONOMFENDFP_ == null ? emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.getDefaultInstance() : unk2700JONOMFENDFP_;
    }
    /**
     * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFBOrBuilder getUnk2700JONOMFENDFPOrBuilder() {
      return getUnk2700JONOMFENDFP();
    }

    public static final int UNK2700_LDIGKKLLDOC_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList unk2700LDIGKKLLDOC_;
    /**
     * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
     * @return A list containing the unk2700LDIGKKLLDOC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2700LDIGKKLLDOCList() {
      return unk2700LDIGKKLLDOC_;
    }
    /**
     * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
     * @return The count of unk2700LDIGKKLLDOC.
     */
    public int getUnk2700LDIGKKLLDOCCount() {
      return unk2700LDIGKKLLDOC_.size();
    }
    /**
     * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
     * @param index The index of the element to return.
     * @return The unk2700LDIGKKLLDOC at the given index.
     */
    public int getUnk2700LDIGKKLLDOC(int index) {
      return unk2700LDIGKKLLDOC_.getInt(index);
    }
    private int unk2700LDIGKKLLDOCMemoizedSerializedSize = -1;

    public static final int BEST_SCORE_FIELD_NUMBER = 8;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 8;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
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
      if (getUnk2700LDIGKKLLDOCList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(unk2700LDIGKKLLDOCMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700LDIGKKLLDOC_.size(); i++) {
        output.writeUInt32NoTag(unk2700LDIGKKLLDOC_.getInt(i));
      }
      if (mapId_ != 0) {
        output.writeUInt32(6, mapId_);
      }
      if (unk2700JONOMFENDFP_ != null) {
        output.writeMessage(7, getUnk2700JONOMFENDFP());
      }
      if (bestScore_ != 0) {
        output.writeUInt32(8, bestScore_);
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
        for (int i = 0; i < unk2700LDIGKKLLDOC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2700LDIGKKLLDOC_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2700LDIGKKLLDOCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700LDIGKKLLDOCMemoizedSerializedSize = dataSize;
      }
      if (mapId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, mapId_);
      }
      if (unk2700JONOMFENDFP_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getUnk2700JONOMFENDFP());
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, bestScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME other = (emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME) obj;

      if (getMapId()
          != other.getMapId()) return false;
      if (hasUnk2700JONOMFENDFP() != other.hasUnk2700JONOMFENDFP()) return false;
      if (hasUnk2700JONOMFENDFP()) {
        if (!getUnk2700JONOMFENDFP()
            .equals(other.getUnk2700JONOMFENDFP())) return false;
      }
      if (!getUnk2700LDIGKKLLDOCList()
          .equals(other.getUnk2700LDIGKKLLDOCList())) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
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
      hash = (37 * hash) + MAP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMapId();
      if (hasUnk2700JONOMFENDFP()) {
        hash = (37 * hash) + UNK2700_JONOMFENDFP_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700JONOMFENDFP().hashCode();
      }
      if (getUnk2700LDIGKKLLDOCCount() > 0) {
        hash = (37 * hash) + UNK2700_LDIGKKLLDOC_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700LDIGKKLLDOCList().hashCode();
      }
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME prototype) {
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
     * Protobuf type {@code Unk2700_EOHBLDIKPME}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_EOHBLDIKPME)
        emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPMEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.internal_static_Unk2700_EOHBLDIKPME_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.internal_static_Unk2700_EOHBLDIKPME_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME.class, emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME.newBuilder()
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
        mapId_ = 0;

        if (unk2700JONOMFENDFPBuilder_ == null) {
          unk2700JONOMFENDFP_ = null;
        } else {
          unk2700JONOMFENDFP_ = null;
          unk2700JONOMFENDFPBuilder_ = null;
        }
        unk2700LDIGKKLLDOC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        bestScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.internal_static_Unk2700_EOHBLDIKPME_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME build() {
        emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME buildPartial() {
        emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME result = new emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME(this);
        int from_bitField0_ = bitField0_;
        result.mapId_ = mapId_;
        if (unk2700JONOMFENDFPBuilder_ == null) {
          result.unk2700JONOMFENDFP_ = unk2700JONOMFENDFP_;
        } else {
          result.unk2700JONOMFENDFP_ = unk2700JONOMFENDFPBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700LDIGKKLLDOC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700LDIGKKLLDOC_ = unk2700LDIGKKLLDOC_;
        result.bestScore_ = bestScore_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME other) {
        if (other == emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME.getDefaultInstance()) return this;
        if (other.getMapId() != 0) {
          setMapId(other.getMapId());
        }
        if (other.hasUnk2700JONOMFENDFP()) {
          mergeUnk2700JONOMFENDFP(other.getUnk2700JONOMFENDFP());
        }
        if (!other.unk2700LDIGKKLLDOC_.isEmpty()) {
          if (unk2700LDIGKKLLDOC_.isEmpty()) {
            unk2700LDIGKKLLDOC_ = other.unk2700LDIGKKLLDOC_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700LDIGKKLLDOCIsMutable();
            unk2700LDIGKKLLDOC_.addAll(other.unk2700LDIGKKLLDOC_);
          }
          onChanged();
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
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
        emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int mapId_ ;
      /**
       * <code>uint32 map_id = 6;</code>
       * @return The mapId.
       */
      @java.lang.Override
      public int getMapId() {
        return mapId_;
      }
      /**
       * <code>uint32 map_id = 6;</code>
       * @param value The mapId to set.
       * @return This builder for chaining.
       */
      public Builder setMapId(int value) {
        
        mapId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 map_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearMapId() {
        
        mapId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB unk2700JONOMFENDFP_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB, emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.Builder, emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFBOrBuilder> unk2700JONOMFENDFPBuilder_;
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       * @return Whether the unk2700JONOMFENDFP field is set.
       */
      public boolean hasUnk2700JONOMFENDFP() {
        return unk2700JONOMFENDFPBuilder_ != null || unk2700JONOMFENDFP_ != null;
      }
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       * @return The unk2700JONOMFENDFP.
       */
      public emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB getUnk2700JONOMFENDFP() {
        if (unk2700JONOMFENDFPBuilder_ == null) {
          return unk2700JONOMFENDFP_ == null ? emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.getDefaultInstance() : unk2700JONOMFENDFP_;
        } else {
          return unk2700JONOMFENDFPBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       */
      public Builder setUnk2700JONOMFENDFP(emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB value) {
        if (unk2700JONOMFENDFPBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk2700JONOMFENDFP_ = value;
          onChanged();
        } else {
          unk2700JONOMFENDFPBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       */
      public Builder setUnk2700JONOMFENDFP(
          emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.Builder builderForValue) {
        if (unk2700JONOMFENDFPBuilder_ == null) {
          unk2700JONOMFENDFP_ = builderForValue.build();
          onChanged();
        } else {
          unk2700JONOMFENDFPBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       */
      public Builder mergeUnk2700JONOMFENDFP(emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB value) {
        if (unk2700JONOMFENDFPBuilder_ == null) {
          if (unk2700JONOMFENDFP_ != null) {
            unk2700JONOMFENDFP_ =
              emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.newBuilder(unk2700JONOMFENDFP_).mergeFrom(value).buildPartial();
          } else {
            unk2700JONOMFENDFP_ = value;
          }
          onChanged();
        } else {
          unk2700JONOMFENDFPBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       */
      public Builder clearUnk2700JONOMFENDFP() {
        if (unk2700JONOMFENDFPBuilder_ == null) {
          unk2700JONOMFENDFP_ = null;
          onChanged();
        } else {
          unk2700JONOMFENDFP_ = null;
          unk2700JONOMFENDFPBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       */
      public emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.Builder getUnk2700JONOMFENDFPBuilder() {
        
        onChanged();
        return getUnk2700JONOMFENDFPFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       */
      public emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFBOrBuilder getUnk2700JONOMFENDFPOrBuilder() {
        if (unk2700JONOMFENDFPBuilder_ != null) {
          return unk2700JONOMFENDFPBuilder_.getMessageOrBuilder();
        } else {
          return unk2700JONOMFENDFP_ == null ?
              emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.getDefaultInstance() : unk2700JONOMFENDFP_;
        }
      }
      /**
       * <code>.Unk2700_INMNHKOPCFB Unk2700_JONOMFENDFP = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB, emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.Builder, emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFBOrBuilder> 
          getUnk2700JONOMFENDFPFieldBuilder() {
        if (unk2700JONOMFENDFPBuilder_ == null) {
          unk2700JONOMFENDFPBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB, emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFB.Builder, emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.Unk2700_INMNHKOPCFBOrBuilder>(
                  getUnk2700JONOMFENDFP(),
                  getParentForChildren(),
                  isClean());
          unk2700JONOMFENDFP_ = null;
        }
        return unk2700JONOMFENDFPBuilder_;
      }

      private com.google.protobuf.Internal.IntList unk2700LDIGKKLLDOC_ = emptyIntList();
      private void ensureUnk2700LDIGKKLLDOCIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700LDIGKKLLDOC_ = mutableCopy(unk2700LDIGKKLLDOC_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
       * @return A list containing the unk2700LDIGKKLLDOC.
       */
      public java.util.List<java.lang.Integer>
          getUnk2700LDIGKKLLDOCList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700LDIGKKLLDOC_) : unk2700LDIGKKLLDOC_;
      }
      /**
       * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
       * @return The count of unk2700LDIGKKLLDOC.
       */
      public int getUnk2700LDIGKKLLDOCCount() {
        return unk2700LDIGKKLLDOC_.size();
      }
      /**
       * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
       * @param index The index of the element to return.
       * @return The unk2700LDIGKKLLDOC at the given index.
       */
      public int getUnk2700LDIGKKLLDOC(int index) {
        return unk2700LDIGKKLLDOC_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
       * @param index The index to set the value at.
       * @param value The unk2700LDIGKKLLDOC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700LDIGKKLLDOC(
          int index, int value) {
        ensureUnk2700LDIGKKLLDOCIsMutable();
        unk2700LDIGKKLLDOC_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
       * @param value The unk2700LDIGKKLLDOC to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700LDIGKKLLDOC(int value) {
        ensureUnk2700LDIGKKLLDOCIsMutable();
        unk2700LDIGKKLLDOC_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
       * @param values The unk2700LDIGKKLLDOC to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700LDIGKKLLDOC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2700LDIGKKLLDOCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700LDIGKKLLDOC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_LDIGKKLLDOC = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700LDIGKKLLDOC() {
        unk2700LDIGKKLLDOC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 8;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 8;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_EOHBLDIKPME)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_EOHBLDIKPME)
    private static final emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME();
    }

    public static emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_EOHBLDIKPME>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_EOHBLDIKPME>() {
      @java.lang.Override
      public Unk2700_EOHBLDIKPME parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_EOHBLDIKPME(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_EOHBLDIKPME> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_EOHBLDIKPME> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700EOHBLDIKPME.Unk2700_EOHBLDIKPME getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_EOHBLDIKPME_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_EOHBLDIKPME_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_EOHBLDIKPME.proto\032\031Unk2700_INM" +
      "NHKOPCFB.proto\"\211\001\n\023Unk2700_EOHBLDIKPME\022\016" +
      "\n\006map_id\030\006 \001(\r\0221\n\023Unk2700_JONOMFENDFP\030\007 " +
      "\001(\0132\024.Unk2700_INMNHKOPCFB\022\033\n\023Unk2700_LDI" +
      "GKKLLDOC\030\003 \003(\r\022\022\n\nbest_score\030\010 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.getDescriptor(),
        });
    internal_static_Unk2700_EOHBLDIKPME_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_EOHBLDIKPME_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_EOHBLDIKPME_descriptor,
        new java.lang.String[] { "MapId", "Unk2700JONOMFENDFP", "Unk2700LDIGKKLLDOC", "BestScore", });
    emu.grasscutter.net.proto.Unk2700INMNHKOPCFB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_FCJOEKKHPLB.proto

package emu.grasscutter.net.proto;

public final class Unk2700FCJOEKKHPLB {
  private Unk2700FCJOEKKHPLB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_FCJOEKKHPLBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_FCJOEKKHPLB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_AMJKJDFKOHF = 2;</code>
     * @return The unk2700AMJKJDFKOHF.
     */
    int getUnk2700AMJKJDFKOHF();

    /**
     * <code>uint32 Unk2700_JFBLEPOMGLC = 3;</code>
     * @return The unk2700JFBLEPOMGLC.
     */
    int getUnk2700JFBLEPOMGLC();

    /**
     * <code>uint32 Unk2700_NDJKPHLIALK = 1;</code>
     * @return The unk2700NDJKPHLIALK.
     */
    int getUnk2700NDJKPHLIALK();

    /**
     * <code>uint32 Unk2700_HKKPKBEKCME = 6;</code>
     * @return The unk2700HKKPKBEKCME.
     */
    int getUnk2700HKKPKBEKCME();

    /**
     * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
     * @return A list containing the unk2700ADPPEOELMBP.
     */
    java.util.List<java.lang.Integer> getUnk2700ADPPEOELMBPList();
    /**
     * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
     * @return The count of unk2700ADPPEOELMBP.
     */
    int getUnk2700ADPPEOELMBPCount();
    /**
     * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
     * @param index The index of the element to return.
     * @return The unk2700ADPPEOELMBP at the given index.
     */
    int getUnk2700ADPPEOELMBP(int index);

    /**
     * <code>uint32 Unk2700_MLCEOFAMBFM = 7;</code>
     * @return The unk2700MLCEOFAMBFM.
     */
    int getUnk2700MLCEOFAMBFM();
  }
  /**
   * Protobuf type {@code Unk2700_FCJOEKKHPLB}
   */
  public static final class Unk2700_FCJOEKKHPLB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_FCJOEKKHPLB)
      Unk2700_FCJOEKKHPLBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_FCJOEKKHPLB.newBuilder() to construct.
    private Unk2700_FCJOEKKHPLB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_FCJOEKKHPLB() {
      unk2700ADPPEOELMBP_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_FCJOEKKHPLB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_FCJOEKKHPLB(
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

              unk2700NDJKPHLIALK_ = input.readUInt32();
              break;
            }
            case 16: {

              unk2700AMJKJDFKOHF_ = input.readUInt32();
              break;
            }
            case 24: {

              unk2700JFBLEPOMGLC_ = input.readUInt32();
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700ADPPEOELMBP_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700ADPPEOELMBP_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk2700ADPPEOELMBP_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk2700ADPPEOELMBP_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              unk2700HKKPKBEKCME_ = input.readUInt32();
              break;
            }
            case 56: {

              unk2700MLCEOFAMBFM_ = input.readUInt32();
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
          unk2700ADPPEOELMBP_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.internal_static_Unk2700_FCJOEKKHPLB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.internal_static_Unk2700_FCJOEKKHPLB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB.class, emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB.Builder.class);
    }

    public static final int UNK2700_AMJKJDFKOHF_FIELD_NUMBER = 2;
    private int unk2700AMJKJDFKOHF_;
    /**
     * <code>uint32 Unk2700_AMJKJDFKOHF = 2;</code>
     * @return The unk2700AMJKJDFKOHF.
     */
    @java.lang.Override
    public int getUnk2700AMJKJDFKOHF() {
      return unk2700AMJKJDFKOHF_;
    }

    public static final int UNK2700_JFBLEPOMGLC_FIELD_NUMBER = 3;
    private int unk2700JFBLEPOMGLC_;
    /**
     * <code>uint32 Unk2700_JFBLEPOMGLC = 3;</code>
     * @return The unk2700JFBLEPOMGLC.
     */
    @java.lang.Override
    public int getUnk2700JFBLEPOMGLC() {
      return unk2700JFBLEPOMGLC_;
    }

    public static final int UNK2700_NDJKPHLIALK_FIELD_NUMBER = 1;
    private int unk2700NDJKPHLIALK_;
    /**
     * <code>uint32 Unk2700_NDJKPHLIALK = 1;</code>
     * @return The unk2700NDJKPHLIALK.
     */
    @java.lang.Override
    public int getUnk2700NDJKPHLIALK() {
      return unk2700NDJKPHLIALK_;
    }

    public static final int UNK2700_HKKPKBEKCME_FIELD_NUMBER = 6;
    private int unk2700HKKPKBEKCME_;
    /**
     * <code>uint32 Unk2700_HKKPKBEKCME = 6;</code>
     * @return The unk2700HKKPKBEKCME.
     */
    @java.lang.Override
    public int getUnk2700HKKPKBEKCME() {
      return unk2700HKKPKBEKCME_;
    }

    public static final int UNK2700_ADPPEOELMBP_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList unk2700ADPPEOELMBP_;
    /**
     * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
     * @return A list containing the unk2700ADPPEOELMBP.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2700ADPPEOELMBPList() {
      return unk2700ADPPEOELMBP_;
    }
    /**
     * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
     * @return The count of unk2700ADPPEOELMBP.
     */
    public int getUnk2700ADPPEOELMBPCount() {
      return unk2700ADPPEOELMBP_.size();
    }
    /**
     * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
     * @param index The index of the element to return.
     * @return The unk2700ADPPEOELMBP at the given index.
     */
    public int getUnk2700ADPPEOELMBP(int index) {
      return unk2700ADPPEOELMBP_.getInt(index);
    }
    private int unk2700ADPPEOELMBPMemoizedSerializedSize = -1;

    public static final int UNK2700_MLCEOFAMBFM_FIELD_NUMBER = 7;
    private int unk2700MLCEOFAMBFM_;
    /**
     * <code>uint32 Unk2700_MLCEOFAMBFM = 7;</code>
     * @return The unk2700MLCEOFAMBFM.
     */
    @java.lang.Override
    public int getUnk2700MLCEOFAMBFM() {
      return unk2700MLCEOFAMBFM_;
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
      if (unk2700NDJKPHLIALK_ != 0) {
        output.writeUInt32(1, unk2700NDJKPHLIALK_);
      }
      if (unk2700AMJKJDFKOHF_ != 0) {
        output.writeUInt32(2, unk2700AMJKJDFKOHF_);
      }
      if (unk2700JFBLEPOMGLC_ != 0) {
        output.writeUInt32(3, unk2700JFBLEPOMGLC_);
      }
      if (getUnk2700ADPPEOELMBPList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(unk2700ADPPEOELMBPMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700ADPPEOELMBP_.size(); i++) {
        output.writeUInt32NoTag(unk2700ADPPEOELMBP_.getInt(i));
      }
      if (unk2700HKKPKBEKCME_ != 0) {
        output.writeUInt32(6, unk2700HKKPKBEKCME_);
      }
      if (unk2700MLCEOFAMBFM_ != 0) {
        output.writeUInt32(7, unk2700MLCEOFAMBFM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700NDJKPHLIALK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk2700NDJKPHLIALK_);
      }
      if (unk2700AMJKJDFKOHF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk2700AMJKJDFKOHF_);
      }
      if (unk2700JFBLEPOMGLC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk2700JFBLEPOMGLC_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk2700ADPPEOELMBP_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2700ADPPEOELMBP_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2700ADPPEOELMBPList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700ADPPEOELMBPMemoizedSerializedSize = dataSize;
      }
      if (unk2700HKKPKBEKCME_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk2700HKKPKBEKCME_);
      }
      if (unk2700MLCEOFAMBFM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk2700MLCEOFAMBFM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB other = (emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB) obj;

      if (getUnk2700AMJKJDFKOHF()
          != other.getUnk2700AMJKJDFKOHF()) return false;
      if (getUnk2700JFBLEPOMGLC()
          != other.getUnk2700JFBLEPOMGLC()) return false;
      if (getUnk2700NDJKPHLIALK()
          != other.getUnk2700NDJKPHLIALK()) return false;
      if (getUnk2700HKKPKBEKCME()
          != other.getUnk2700HKKPKBEKCME()) return false;
      if (!getUnk2700ADPPEOELMBPList()
          .equals(other.getUnk2700ADPPEOELMBPList())) return false;
      if (getUnk2700MLCEOFAMBFM()
          != other.getUnk2700MLCEOFAMBFM()) return false;
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
      hash = (37 * hash) + UNK2700_AMJKJDFKOHF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700AMJKJDFKOHF();
      hash = (37 * hash) + UNK2700_JFBLEPOMGLC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700JFBLEPOMGLC();
      hash = (37 * hash) + UNK2700_NDJKPHLIALK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700NDJKPHLIALK();
      hash = (37 * hash) + UNK2700_HKKPKBEKCME_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700HKKPKBEKCME();
      if (getUnk2700ADPPEOELMBPCount() > 0) {
        hash = (37 * hash) + UNK2700_ADPPEOELMBP_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700ADPPEOELMBPList().hashCode();
      }
      hash = (37 * hash) + UNK2700_MLCEOFAMBFM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700MLCEOFAMBFM();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB prototype) {
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
     * Protobuf type {@code Unk2700_FCJOEKKHPLB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_FCJOEKKHPLB)
        emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.internal_static_Unk2700_FCJOEKKHPLB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.internal_static_Unk2700_FCJOEKKHPLB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB.class, emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB.newBuilder()
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
        unk2700AMJKJDFKOHF_ = 0;

        unk2700JFBLEPOMGLC_ = 0;

        unk2700NDJKPHLIALK_ = 0;

        unk2700HKKPKBEKCME_ = 0;

        unk2700ADPPEOELMBP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk2700MLCEOFAMBFM_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.internal_static_Unk2700_FCJOEKKHPLB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB build() {
        emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB buildPartial() {
        emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB result = new emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB(this);
        int from_bitField0_ = bitField0_;
        result.unk2700AMJKJDFKOHF_ = unk2700AMJKJDFKOHF_;
        result.unk2700JFBLEPOMGLC_ = unk2700JFBLEPOMGLC_;
        result.unk2700NDJKPHLIALK_ = unk2700NDJKPHLIALK_;
        result.unk2700HKKPKBEKCME_ = unk2700HKKPKBEKCME_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700ADPPEOELMBP_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700ADPPEOELMBP_ = unk2700ADPPEOELMBP_;
        result.unk2700MLCEOFAMBFM_ = unk2700MLCEOFAMBFM_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB other) {
        if (other == emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB.getDefaultInstance()) return this;
        if (other.getUnk2700AMJKJDFKOHF() != 0) {
          setUnk2700AMJKJDFKOHF(other.getUnk2700AMJKJDFKOHF());
        }
        if (other.getUnk2700JFBLEPOMGLC() != 0) {
          setUnk2700JFBLEPOMGLC(other.getUnk2700JFBLEPOMGLC());
        }
        if (other.getUnk2700NDJKPHLIALK() != 0) {
          setUnk2700NDJKPHLIALK(other.getUnk2700NDJKPHLIALK());
        }
        if (other.getUnk2700HKKPKBEKCME() != 0) {
          setUnk2700HKKPKBEKCME(other.getUnk2700HKKPKBEKCME());
        }
        if (!other.unk2700ADPPEOELMBP_.isEmpty()) {
          if (unk2700ADPPEOELMBP_.isEmpty()) {
            unk2700ADPPEOELMBP_ = other.unk2700ADPPEOELMBP_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700ADPPEOELMBPIsMutable();
            unk2700ADPPEOELMBP_.addAll(other.unk2700ADPPEOELMBP_);
          }
          onChanged();
        }
        if (other.getUnk2700MLCEOFAMBFM() != 0) {
          setUnk2700MLCEOFAMBFM(other.getUnk2700MLCEOFAMBFM());
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
        emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int unk2700AMJKJDFKOHF_ ;
      /**
       * <code>uint32 Unk2700_AMJKJDFKOHF = 2;</code>
       * @return The unk2700AMJKJDFKOHF.
       */
      @java.lang.Override
      public int getUnk2700AMJKJDFKOHF() {
        return unk2700AMJKJDFKOHF_;
      }
      /**
       * <code>uint32 Unk2700_AMJKJDFKOHF = 2;</code>
       * @param value The unk2700AMJKJDFKOHF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700AMJKJDFKOHF(int value) {
        
        unk2700AMJKJDFKOHF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_AMJKJDFKOHF = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700AMJKJDFKOHF() {
        
        unk2700AMJKJDFKOHF_ = 0;
        onChanged();
        return this;
      }

      private int unk2700JFBLEPOMGLC_ ;
      /**
       * <code>uint32 Unk2700_JFBLEPOMGLC = 3;</code>
       * @return The unk2700JFBLEPOMGLC.
       */
      @java.lang.Override
      public int getUnk2700JFBLEPOMGLC() {
        return unk2700JFBLEPOMGLC_;
      }
      /**
       * <code>uint32 Unk2700_JFBLEPOMGLC = 3;</code>
       * @param value The unk2700JFBLEPOMGLC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700JFBLEPOMGLC(int value) {
        
        unk2700JFBLEPOMGLC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_JFBLEPOMGLC = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700JFBLEPOMGLC() {
        
        unk2700JFBLEPOMGLC_ = 0;
        onChanged();
        return this;
      }

      private int unk2700NDJKPHLIALK_ ;
      /**
       * <code>uint32 Unk2700_NDJKPHLIALK = 1;</code>
       * @return The unk2700NDJKPHLIALK.
       */
      @java.lang.Override
      public int getUnk2700NDJKPHLIALK() {
        return unk2700NDJKPHLIALK_;
      }
      /**
       * <code>uint32 Unk2700_NDJKPHLIALK = 1;</code>
       * @param value The unk2700NDJKPHLIALK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700NDJKPHLIALK(int value) {
        
        unk2700NDJKPHLIALK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_NDJKPHLIALK = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700NDJKPHLIALK() {
        
        unk2700NDJKPHLIALK_ = 0;
        onChanged();
        return this;
      }

      private int unk2700HKKPKBEKCME_ ;
      /**
       * <code>uint32 Unk2700_HKKPKBEKCME = 6;</code>
       * @return The unk2700HKKPKBEKCME.
       */
      @java.lang.Override
      public int getUnk2700HKKPKBEKCME() {
        return unk2700HKKPKBEKCME_;
      }
      /**
       * <code>uint32 Unk2700_HKKPKBEKCME = 6;</code>
       * @param value The unk2700HKKPKBEKCME to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700HKKPKBEKCME(int value) {
        
        unk2700HKKPKBEKCME_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_HKKPKBEKCME = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700HKKPKBEKCME() {
        
        unk2700HKKPKBEKCME_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk2700ADPPEOELMBP_ = emptyIntList();
      private void ensureUnk2700ADPPEOELMBPIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700ADPPEOELMBP_ = mutableCopy(unk2700ADPPEOELMBP_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
       * @return A list containing the unk2700ADPPEOELMBP.
       */
      public java.util.List<java.lang.Integer>
          getUnk2700ADPPEOELMBPList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700ADPPEOELMBP_) : unk2700ADPPEOELMBP_;
      }
      /**
       * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
       * @return The count of unk2700ADPPEOELMBP.
       */
      public int getUnk2700ADPPEOELMBPCount() {
        return unk2700ADPPEOELMBP_.size();
      }
      /**
       * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
       * @param index The index of the element to return.
       * @return The unk2700ADPPEOELMBP at the given index.
       */
      public int getUnk2700ADPPEOELMBP(int index) {
        return unk2700ADPPEOELMBP_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
       * @param index The index to set the value at.
       * @param value The unk2700ADPPEOELMBP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700ADPPEOELMBP(
          int index, int value) {
        ensureUnk2700ADPPEOELMBPIsMutable();
        unk2700ADPPEOELMBP_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
       * @param value The unk2700ADPPEOELMBP to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700ADPPEOELMBP(int value) {
        ensureUnk2700ADPPEOELMBPIsMutable();
        unk2700ADPPEOELMBP_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
       * @param values The unk2700ADPPEOELMBP to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700ADPPEOELMBP(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2700ADPPEOELMBPIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700ADPPEOELMBP_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_ADPPEOELMBP = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700ADPPEOELMBP() {
        unk2700ADPPEOELMBP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int unk2700MLCEOFAMBFM_ ;
      /**
       * <code>uint32 Unk2700_MLCEOFAMBFM = 7;</code>
       * @return The unk2700MLCEOFAMBFM.
       */
      @java.lang.Override
      public int getUnk2700MLCEOFAMBFM() {
        return unk2700MLCEOFAMBFM_;
      }
      /**
       * <code>uint32 Unk2700_MLCEOFAMBFM = 7;</code>
       * @param value The unk2700MLCEOFAMBFM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MLCEOFAMBFM(int value) {
        
        unk2700MLCEOFAMBFM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_MLCEOFAMBFM = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700MLCEOFAMBFM() {
        
        unk2700MLCEOFAMBFM_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_FCJOEKKHPLB)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_FCJOEKKHPLB)
    private static final emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB();
    }

    public static emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_FCJOEKKHPLB>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_FCJOEKKHPLB>() {
      @java.lang.Override
      public Unk2700_FCJOEKKHPLB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_FCJOEKKHPLB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_FCJOEKKHPLB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_FCJOEKKHPLB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700FCJOEKKHPLB.Unk2700_FCJOEKKHPLB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_FCJOEKKHPLB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_FCJOEKKHPLB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_FCJOEKKHPLB.proto\"\303\001\n\023Unk2700_" +
      "FCJOEKKHPLB\022\033\n\023Unk2700_AMJKJDFKOHF\030\002 \001(\r" +
      "\022\033\n\023Unk2700_JFBLEPOMGLC\030\003 \001(\r\022\033\n\023Unk2700" +
      "_NDJKPHLIALK\030\001 \001(\r\022\033\n\023Unk2700_HKKPKBEKCM" +
      "E\030\006 \001(\r\022\033\n\023Unk2700_ADPPEOELMBP\030\004 \003(\r\022\033\n\023" +
      "Unk2700_MLCEOFAMBFM\030\007 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_FCJOEKKHPLB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_FCJOEKKHPLB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_FCJOEKKHPLB_descriptor,
        new java.lang.String[] { "Unk2700AMJKJDFKOHF", "Unk2700JFBLEPOMGLC", "Unk2700NDJKPHLIALK", "Unk2700HKKPKBEKCME", "Unk2700ADPPEOELMBP", "Unk2700MLCEOFAMBFM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

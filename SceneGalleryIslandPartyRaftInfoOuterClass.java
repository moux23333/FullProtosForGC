// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryIslandPartyRaftInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryIslandPartyRaftInfoOuterClass {
  private SceneGalleryIslandPartyRaftInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryIslandPartyRaftInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryIslandPartyRaftInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 coin = 6;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
     * @return The enum numeric value on the wire for unk2800ENJGEFBCLOL.
     */
    int getUnk2800ENJGEFBCLOLValue();
    /**
     * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
     * @return The unk2800ENJGEFBCLOL.
     */
    emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB getUnk2800ENJGEFBCLOL();

    /**
     * <code>uint32 Unk2800_BAEEDEAADIA = 1;</code>
     * @return The unk2800BAEEDEAADIA.
     */
    int getUnk2800BAEEDEAADIA();

    /**
     * <code>uint32 Unk2800_EOFOECJJMLJ = 15;</code>
     * @return The unk2800EOFOECJJMLJ.
     */
    int getUnk2800EOFOECJJMLJ();

    /**
     * <code>uint32 point_id = 12;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 Unk2800_MKNGANDAJFJ = 4;</code>
     * @return The unk2800MKNGANDAJFJ.
     */
    int getUnk2800MKNGANDAJFJ();
  }
  /**
   * Protobuf type {@code SceneGalleryIslandPartyRaftInfo}
   */
  public static final class SceneGalleryIslandPartyRaftInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryIslandPartyRaftInfo)
      SceneGalleryIslandPartyRaftInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryIslandPartyRaftInfo.newBuilder() to construct.
    private SceneGalleryIslandPartyRaftInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryIslandPartyRaftInfo() {
      unk2800ENJGEFBCLOL_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryIslandPartyRaftInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryIslandPartyRaftInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              unk2800BAEEDEAADIA_ = input.readUInt32();
              break;
            }
            case 32: {

              unk2800MKNGANDAJFJ_ = input.readUInt32();
              break;
            }
            case 48: {

              coin_ = input.readUInt32();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              unk2800ENJGEFBCLOL_ = rawValue;
              break;
            }
            case 96: {

              pointId_ = input.readUInt32();
              break;
            }
            case 120: {

              unk2800EOFOECJJMLJ_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.class, emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.Builder.class);
    }

    public static final int COIN_FIELD_NUMBER = 6;
    private int coin_;
    /**
     * <code>uint32 coin = 6;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int UNK2800_ENJGEFBCLOL_FIELD_NUMBER = 7;
    private int unk2800ENJGEFBCLOL_;
    /**
     * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
     * @return The enum numeric value on the wire for unk2800ENJGEFBCLOL.
     */
    @java.lang.Override public int getUnk2800ENJGEFBCLOLValue() {
      return unk2800ENJGEFBCLOL_;
    }
    /**
     * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
     * @return The unk2800ENJGEFBCLOL.
     */
    @java.lang.Override public emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB getUnk2800ENJGEFBCLOL() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB result = emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.valueOf(unk2800ENJGEFBCLOL_);
      return result == null ? emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.UNRECOGNIZED : result;
    }

    public static final int UNK2800_BAEEDEAADIA_FIELD_NUMBER = 1;
    private int unk2800BAEEDEAADIA_;
    /**
     * <code>uint32 Unk2800_BAEEDEAADIA = 1;</code>
     * @return The unk2800BAEEDEAADIA.
     */
    @java.lang.Override
    public int getUnk2800BAEEDEAADIA() {
      return unk2800BAEEDEAADIA_;
    }

    public static final int UNK2800_EOFOECJJMLJ_FIELD_NUMBER = 15;
    private int unk2800EOFOECJJMLJ_;
    /**
     * <code>uint32 Unk2800_EOFOECJJMLJ = 15;</code>
     * @return The unk2800EOFOECJJMLJ.
     */
    @java.lang.Override
    public int getUnk2800EOFOECJJMLJ() {
      return unk2800EOFOECJJMLJ_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 12;
    private int pointId_;
    /**
     * <code>uint32 point_id = 12;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int UNK2800_MKNGANDAJFJ_FIELD_NUMBER = 4;
    private int unk2800MKNGANDAJFJ_;
    /**
     * <code>uint32 Unk2800_MKNGANDAJFJ = 4;</code>
     * @return The unk2800MKNGANDAJFJ.
     */
    @java.lang.Override
    public int getUnk2800MKNGANDAJFJ() {
      return unk2800MKNGANDAJFJ_;
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
      if (unk2800BAEEDEAADIA_ != 0) {
        output.writeUInt32(1, unk2800BAEEDEAADIA_);
      }
      if (unk2800MKNGANDAJFJ_ != 0) {
        output.writeUInt32(4, unk2800MKNGANDAJFJ_);
      }
      if (coin_ != 0) {
        output.writeUInt32(6, coin_);
      }
      if (unk2800ENJGEFBCLOL_ != emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO.getNumber()) {
        output.writeEnum(7, unk2800ENJGEFBCLOL_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(12, pointId_);
      }
      if (unk2800EOFOECJJMLJ_ != 0) {
        output.writeUInt32(15, unk2800EOFOECJJMLJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2800BAEEDEAADIA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk2800BAEEDEAADIA_);
      }
      if (unk2800MKNGANDAJFJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk2800MKNGANDAJFJ_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, coin_);
      }
      if (unk2800ENJGEFBCLOL_ != emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, unk2800ENJGEFBCLOL_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, pointId_);
      }
      if (unk2800EOFOECJJMLJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk2800EOFOECJJMLJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo other = (emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo) obj;

      if (getCoin()
          != other.getCoin()) return false;
      if (unk2800ENJGEFBCLOL_ != other.unk2800ENJGEFBCLOL_) return false;
      if (getUnk2800BAEEDEAADIA()
          != other.getUnk2800BAEEDEAADIA()) return false;
      if (getUnk2800EOFOECJJMLJ()
          != other.getUnk2800EOFOECJJMLJ()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getUnk2800MKNGANDAJFJ()
          != other.getUnk2800MKNGANDAJFJ()) return false;
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
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + UNK2800_ENJGEFBCLOL_FIELD_NUMBER;
      hash = (53 * hash) + unk2800ENJGEFBCLOL_;
      hash = (37 * hash) + UNK2800_BAEEDEAADIA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800BAEEDEAADIA();
      hash = (37 * hash) + UNK2800_EOFOECJJMLJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800EOFOECJJMLJ();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + UNK2800_MKNGANDAJFJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800MKNGANDAJFJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo prototype) {
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
     * Protobuf type {@code SceneGalleryIslandPartyRaftInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryIslandPartyRaftInfo)
        emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.class, emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.newBuilder()
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
        coin_ = 0;

        unk2800ENJGEFBCLOL_ = 0;

        unk2800BAEEDEAADIA_ = 0;

        unk2800EOFOECJJMLJ_ = 0;

        pointId_ = 0;

        unk2800MKNGANDAJFJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo build() {
        emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo result = new emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo(this);
        result.coin_ = coin_;
        result.unk2800ENJGEFBCLOL_ = unk2800ENJGEFBCLOL_;
        result.unk2800BAEEDEAADIA_ = unk2800BAEEDEAADIA_;
        result.unk2800EOFOECJJMLJ_ = unk2800EOFOECJJMLJ_;
        result.pointId_ = pointId_;
        result.unk2800MKNGANDAJFJ_ = unk2800MKNGANDAJFJ_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.getDefaultInstance()) return this;
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
        }
        if (other.unk2800ENJGEFBCLOL_ != 0) {
          setUnk2800ENJGEFBCLOLValue(other.getUnk2800ENJGEFBCLOLValue());
        }
        if (other.getUnk2800BAEEDEAADIA() != 0) {
          setUnk2800BAEEDEAADIA(other.getUnk2800BAEEDEAADIA());
        }
        if (other.getUnk2800EOFOECJJMLJ() != 0) {
          setUnk2800EOFOECJJMLJ(other.getUnk2800EOFOECJJMLJ());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getUnk2800MKNGANDAJFJ() != 0) {
          setUnk2800MKNGANDAJFJ(other.getUnk2800MKNGANDAJFJ());
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
        emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int coin_ ;
      /**
       * <code>uint32 coin = 6;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 6;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
        onChanged();
        return this;
      }

      private int unk2800ENJGEFBCLOL_ = 0;
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
       * @return The enum numeric value on the wire for unk2800ENJGEFBCLOL.
       */
      @java.lang.Override public int getUnk2800ENJGEFBCLOLValue() {
        return unk2800ENJGEFBCLOL_;
      }
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
       * @param value The enum numeric value on the wire for unk2800ENJGEFBCLOL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800ENJGEFBCLOLValue(int value) {
        
        unk2800ENJGEFBCLOL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
       * @return The unk2800ENJGEFBCLOL.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB getUnk2800ENJGEFBCLOL() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB result = emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.valueOf(unk2800ENJGEFBCLOL_);
        return result == null ? emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
       * @param value The unk2800ENJGEFBCLOL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800ENJGEFBCLOL(emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.Unk2800_FMAOEPEBKHB value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk2800ENJGEFBCLOL_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2800_FMAOEPEBKHB Unk2800_ENJGEFBCLOL = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800ENJGEFBCLOL() {
        
        unk2800ENJGEFBCLOL_ = 0;
        onChanged();
        return this;
      }

      private int unk2800BAEEDEAADIA_ ;
      /**
       * <code>uint32 Unk2800_BAEEDEAADIA = 1;</code>
       * @return The unk2800BAEEDEAADIA.
       */
      @java.lang.Override
      public int getUnk2800BAEEDEAADIA() {
        return unk2800BAEEDEAADIA_;
      }
      /**
       * <code>uint32 Unk2800_BAEEDEAADIA = 1;</code>
       * @param value The unk2800BAEEDEAADIA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800BAEEDEAADIA(int value) {
        
        unk2800BAEEDEAADIA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_BAEEDEAADIA = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800BAEEDEAADIA() {
        
        unk2800BAEEDEAADIA_ = 0;
        onChanged();
        return this;
      }

      private int unk2800EOFOECJJMLJ_ ;
      /**
       * <code>uint32 Unk2800_EOFOECJJMLJ = 15;</code>
       * @return The unk2800EOFOECJJMLJ.
       */
      @java.lang.Override
      public int getUnk2800EOFOECJJMLJ() {
        return unk2800EOFOECJJMLJ_;
      }
      /**
       * <code>uint32 Unk2800_EOFOECJJMLJ = 15;</code>
       * @param value The unk2800EOFOECJJMLJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800EOFOECJJMLJ(int value) {
        
        unk2800EOFOECJJMLJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_EOFOECJJMLJ = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800EOFOECJJMLJ() {
        
        unk2800EOFOECJJMLJ_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 12;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 12;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int unk2800MKNGANDAJFJ_ ;
      /**
       * <code>uint32 Unk2800_MKNGANDAJFJ = 4;</code>
       * @return The unk2800MKNGANDAJFJ.
       */
      @java.lang.Override
      public int getUnk2800MKNGANDAJFJ() {
        return unk2800MKNGANDAJFJ_;
      }
      /**
       * <code>uint32 Unk2800_MKNGANDAJFJ = 4;</code>
       * @param value The unk2800MKNGANDAJFJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800MKNGANDAJFJ(int value) {
        
        unk2800MKNGANDAJFJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_MKNGANDAJFJ = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800MKNGANDAJFJ() {
        
        unk2800MKNGANDAJFJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryIslandPartyRaftInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryIslandPartyRaftInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryIslandPartyRaftInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryIslandPartyRaftInfo>() {
      @java.lang.Override
      public SceneGalleryIslandPartyRaftInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryIslandPartyRaftInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryIslandPartyRaftInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryIslandPartyRaftInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryIslandPartyRaftInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryIslandPartyRaftInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%SceneGalleryIslandPartyRaftInfo.proto\032" +
      "\031Unk2800_FMAOEPEBKHB.proto\"\313\001\n\037SceneGall" +
      "eryIslandPartyRaftInfo\022\014\n\004coin\030\006 \001(\r\0221\n\023" +
      "Unk2800_ENJGEFBCLOL\030\007 \001(\0162\024.Unk2800_FMAO" +
      "EPEBKHB\022\033\n\023Unk2800_BAEEDEAADIA\030\001 \001(\r\022\033\n\023" +
      "Unk2800_EOFOECJJMLJ\030\017 \001(\r\022\020\n\010point_id\030\014 " +
      "\001(\r\022\033\n\023Unk2800_MKNGANDAJFJ\030\004 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.getDescriptor(),
        });
    internal_static_SceneGalleryIslandPartyRaftInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryIslandPartyRaftInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryIslandPartyRaftInfo_descriptor,
        new java.lang.String[] { "Coin", "Unk2800ENJGEFBCLOL", "Unk2800BAEEDEAADIA", "Unk2800EOFOECJJMLJ", "PointId", "Unk2800MKNGANDAJFJ", });
    emu.grasscutter.net.proto.Unk2800FMAOEPEBKHB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

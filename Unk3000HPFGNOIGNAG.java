// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_HPFGNOIGNAG.proto

package emu.grasscutter.net.proto;

public final class Unk3000HPFGNOIGNAG {
  private Unk3000HPFGNOIGNAG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_HPFGNOIGNAGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_HPFGNOIGNAG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3000_PHIIBCMNPEK = 11;</code>
     * @return The unk3000PHIIBCMNPEK.
     */
    boolean getUnk3000PHIIBCMNPEK();

    /**
     * <code>bool Unk3000_NFLEINABPPC = 7;</code>
     * @return The unk3000NFLEINABPPC.
     */
    boolean getUnk3000NFLEINABPPC();

    /**
     * <code>uint32 round = 15;</code>
     * @return The round.
     */
    int getRound();

    /**
     * <code>uint32 stage_id = 8;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * CmdId: 21961
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_HPFGNOIGNAG}
   */
  public static final class Unk3000_HPFGNOIGNAG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_HPFGNOIGNAG)
      Unk3000_HPFGNOIGNAGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_HPFGNOIGNAG.newBuilder() to construct.
    private Unk3000_HPFGNOIGNAG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_HPFGNOIGNAG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_HPFGNOIGNAG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_HPFGNOIGNAG(
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
            case 56: {

              unk3000NFLEINABPPC_ = input.readBool();
              break;
            }
            case 64: {

              stageId_ = input.readUInt32();
              break;
            }
            case 80: {

              levelId_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3000PHIIBCMNPEK_ = input.readBool();
              break;
            }
            case 120: {

              round_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.internal_static_Unk3000_HPFGNOIGNAG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.internal_static_Unk3000_HPFGNOIGNAG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG.class, emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG.Builder.class);
    }

    public static final int UNK3000_PHIIBCMNPEK_FIELD_NUMBER = 11;
    private boolean unk3000PHIIBCMNPEK_;
    /**
     * <code>bool Unk3000_PHIIBCMNPEK = 11;</code>
     * @return The unk3000PHIIBCMNPEK.
     */
    @java.lang.Override
    public boolean getUnk3000PHIIBCMNPEK() {
      return unk3000PHIIBCMNPEK_;
    }

    public static final int UNK3000_NFLEINABPPC_FIELD_NUMBER = 7;
    private boolean unk3000NFLEINABPPC_;
    /**
     * <code>bool Unk3000_NFLEINABPPC = 7;</code>
     * @return The unk3000NFLEINABPPC.
     */
    @java.lang.Override
    public boolean getUnk3000NFLEINABPPC() {
      return unk3000NFLEINABPPC_;
    }

    public static final int ROUND_FIELD_NUMBER = 15;
    private int round_;
    /**
     * <code>uint32 round = 15;</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 8;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 8;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

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
      if (unk3000NFLEINABPPC_ != false) {
        output.writeBool(7, unk3000NFLEINABPPC_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(8, stageId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      if (unk3000PHIIBCMNPEK_ != false) {
        output.writeBool(11, unk3000PHIIBCMNPEK_);
      }
      if (round_ != 0) {
        output.writeUInt32(15, round_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3000NFLEINABPPC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, unk3000NFLEINABPPC_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, stageId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      if (unk3000PHIIBCMNPEK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, unk3000PHIIBCMNPEK_);
      }
      if (round_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, round_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG other = (emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG) obj;

      if (getUnk3000PHIIBCMNPEK()
          != other.getUnk3000PHIIBCMNPEK()) return false;
      if (getUnk3000NFLEINABPPC()
          != other.getUnk3000NFLEINABPPC()) return false;
      if (getRound()
          != other.getRound()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + UNK3000_PHIIBCMNPEK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3000PHIIBCMNPEK());
      hash = (37 * hash) + UNK3000_NFLEINABPPC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3000NFLEINABPPC());
      hash = (37 * hash) + ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getRound();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG prototype) {
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
     * CmdId: 21961
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_HPFGNOIGNAG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_HPFGNOIGNAG)
        emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.internal_static_Unk3000_HPFGNOIGNAG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.internal_static_Unk3000_HPFGNOIGNAG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG.class, emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG.newBuilder()
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
        unk3000PHIIBCMNPEK_ = false;

        unk3000NFLEINABPPC_ = false;

        round_ = 0;

        stageId_ = 0;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.internal_static_Unk3000_HPFGNOIGNAG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG build() {
        emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG buildPartial() {
        emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG result = new emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG(this);
        result.unk3000PHIIBCMNPEK_ = unk3000PHIIBCMNPEK_;
        result.unk3000NFLEINABPPC_ = unk3000NFLEINABPPC_;
        result.round_ = round_;
        result.stageId_ = stageId_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG other) {
        if (other == emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG.getDefaultInstance()) return this;
        if (other.getUnk3000PHIIBCMNPEK() != false) {
          setUnk3000PHIIBCMNPEK(other.getUnk3000PHIIBCMNPEK());
        }
        if (other.getUnk3000NFLEINABPPC() != false) {
          setUnk3000NFLEINABPPC(other.getUnk3000NFLEINABPPC());
        }
        if (other.getRound() != 0) {
          setRound(other.getRound());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk3000PHIIBCMNPEK_ ;
      /**
       * <code>bool Unk3000_PHIIBCMNPEK = 11;</code>
       * @return The unk3000PHIIBCMNPEK.
       */
      @java.lang.Override
      public boolean getUnk3000PHIIBCMNPEK() {
        return unk3000PHIIBCMNPEK_;
      }
      /**
       * <code>bool Unk3000_PHIIBCMNPEK = 11;</code>
       * @param value The unk3000PHIIBCMNPEK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000PHIIBCMNPEK(boolean value) {
        
        unk3000PHIIBCMNPEK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3000_PHIIBCMNPEK = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000PHIIBCMNPEK() {
        
        unk3000PHIIBCMNPEK_ = false;
        onChanged();
        return this;
      }

      private boolean unk3000NFLEINABPPC_ ;
      /**
       * <code>bool Unk3000_NFLEINABPPC = 7;</code>
       * @return The unk3000NFLEINABPPC.
       */
      @java.lang.Override
      public boolean getUnk3000NFLEINABPPC() {
        return unk3000NFLEINABPPC_;
      }
      /**
       * <code>bool Unk3000_NFLEINABPPC = 7;</code>
       * @param value The unk3000NFLEINABPPC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000NFLEINABPPC(boolean value) {
        
        unk3000NFLEINABPPC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3000_NFLEINABPPC = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000NFLEINABPPC() {
        
        unk3000NFLEINABPPC_ = false;
        onChanged();
        return this;
      }

      private int round_ ;
      /**
       * <code>uint32 round = 15;</code>
       * @return The round.
       */
      @java.lang.Override
      public int getRound() {
        return round_;
      }
      /**
       * <code>uint32 round = 15;</code>
       * @param value The round to set.
       * @return This builder for chaining.
       */
      public Builder setRound(int value) {
        
        round_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 round = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRound() {
        
        round_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 8;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 8;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_HPFGNOIGNAG)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_HPFGNOIGNAG)
    private static final emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG();
    }

    public static emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_HPFGNOIGNAG>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_HPFGNOIGNAG>() {
      @java.lang.Override
      public Unk3000_HPFGNOIGNAG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_HPFGNOIGNAG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_HPFGNOIGNAG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_HPFGNOIGNAG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000HPFGNOIGNAG.Unk3000_HPFGNOIGNAG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_HPFGNOIGNAG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_HPFGNOIGNAG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_HPFGNOIGNAG.proto\"\202\001\n\023Unk3000_" +
      "HPFGNOIGNAG\022\033\n\023Unk3000_PHIIBCMNPEK\030\013 \001(\010" +
      "\022\033\n\023Unk3000_NFLEINABPPC\030\007 \001(\010\022\r\n\005round\030\017" +
      " \001(\r\022\020\n\010stage_id\030\010 \001(\r\022\020\n\010level_id\030\n \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_HPFGNOIGNAG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_HPFGNOIGNAG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_HPFGNOIGNAG_descriptor,
        new java.lang.String[] { "Unk3000PHIIBCMNPEK", "Unk3000NFLEINABPPC", "Round", "StageId", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

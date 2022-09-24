// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusCardInfo.proto

package emu.grasscutter.net.proto;

public final class InBattleMechanicusCardInfoOuterClass {
  private InBattleMechanicusCardInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusCardInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusCardInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rand_effect_id = 12;</code>
     * @return The randEffectId.
     */
    int getRandEffectId();

    /**
     * <code>uint32 end_round = 3;</code>
     * @return The endRound.
     */
    int getEndRound();

    /**
     * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
     * @return The enum numeric value on the wire for challengeState.
     */
    int getChallengeStateValue();
    /**
     * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
     * @return The challengeState.
     */
    emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState getChallengeState();

    /**
     * <code>uint32 cost_points = 1;</code>
     * @return The costPoints.
     */
    int getCostPoints();

    /**
     * <code>uint32 card_id = 11;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 begin_round = 8;</code>
     * @return The beginRound.
     */
    int getBeginRound();
  }
  /**
   * Protobuf type {@code InBattleMechanicusCardInfo}
   */
  public static final class InBattleMechanicusCardInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusCardInfo)
      InBattleMechanicusCardInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusCardInfo.newBuilder() to construct.
    private InBattleMechanicusCardInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusCardInfo() {
      challengeState_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusCardInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBattleMechanicusCardInfo(
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

              costPoints_ = input.readUInt32();
              break;
            }
            case 24: {

              endRound_ = input.readUInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              challengeState_ = rawValue;
              break;
            }
            case 64: {

              beginRound_ = input.readUInt32();
              break;
            }
            case 88: {

              cardId_ = input.readUInt32();
              break;
            }
            case 96: {

              randEffectId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.class, emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.Builder.class);
    }

    public static final int RAND_EFFECT_ID_FIELD_NUMBER = 12;
    private int randEffectId_;
    /**
     * <code>uint32 rand_effect_id = 12;</code>
     * @return The randEffectId.
     */
    @java.lang.Override
    public int getRandEffectId() {
      return randEffectId_;
    }

    public static final int END_ROUND_FIELD_NUMBER = 3;
    private int endRound_;
    /**
     * <code>uint32 end_round = 3;</code>
     * @return The endRound.
     */
    @java.lang.Override
    public int getEndRound() {
      return endRound_;
    }

    public static final int CHALLENGE_STATE_FIELD_NUMBER = 5;
    private int challengeState_;
    /**
     * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
     * @return The enum numeric value on the wire for challengeState.
     */
    @java.lang.Override public int getChallengeStateValue() {
      return challengeState_;
    }
    /**
     * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
     * @return The challengeState.
     */
    @java.lang.Override public emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState getChallengeState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState result = emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.valueOf(challengeState_);
      return result == null ? emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.UNRECOGNIZED : result;
    }

    public static final int COST_POINTS_FIELD_NUMBER = 1;
    private int costPoints_;
    /**
     * <code>uint32 cost_points = 1;</code>
     * @return The costPoints.
     */
    @java.lang.Override
    public int getCostPoints() {
      return costPoints_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 11;
    private int cardId_;
    /**
     * <code>uint32 card_id = 11;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int BEGIN_ROUND_FIELD_NUMBER = 8;
    private int beginRound_;
    /**
     * <code>uint32 begin_round = 8;</code>
     * @return The beginRound.
     */
    @java.lang.Override
    public int getBeginRound() {
      return beginRound_;
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
      if (costPoints_ != 0) {
        output.writeUInt32(1, costPoints_);
      }
      if (endRound_ != 0) {
        output.writeUInt32(3, endRound_);
      }
      if (challengeState_ != emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.IN_BATTLE_MECHANICUS_CARD_CHALLENGE_STATE_NONE.getNumber()) {
        output.writeEnum(5, challengeState_);
      }
      if (beginRound_ != 0) {
        output.writeUInt32(8, beginRound_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(11, cardId_);
      }
      if (randEffectId_ != 0) {
        output.writeUInt32(12, randEffectId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, costPoints_);
      }
      if (endRound_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, endRound_);
      }
      if (challengeState_ != emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.IN_BATTLE_MECHANICUS_CARD_CHALLENGE_STATE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, challengeState_);
      }
      if (beginRound_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, beginRound_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, cardId_);
      }
      if (randEffectId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, randEffectId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo other = (emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo) obj;

      if (getRandEffectId()
          != other.getRandEffectId()) return false;
      if (getEndRound()
          != other.getEndRound()) return false;
      if (challengeState_ != other.challengeState_) return false;
      if (getCostPoints()
          != other.getCostPoints()) return false;
      if (getCardId()
          != other.getCardId()) return false;
      if (getBeginRound()
          != other.getBeginRound()) return false;
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
      hash = (37 * hash) + RAND_EFFECT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRandEffectId();
      hash = (37 * hash) + END_ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getEndRound();
      hash = (37 * hash) + CHALLENGE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + challengeState_;
      hash = (37 * hash) + COST_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getCostPoints();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + BEGIN_ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getBeginRound();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo prototype) {
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
     * Protobuf type {@code InBattleMechanicusCardInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusCardInfo)
        emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.class, emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.newBuilder()
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
        randEffectId_ = 0;

        endRound_ = 0;

        challengeState_ = 0;

        costPoints_ = 0;

        cardId_ = 0;

        beginRound_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo build() {
        emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo buildPartial() {
        emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo result = new emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo(this);
        result.randEffectId_ = randEffectId_;
        result.endRound_ = endRound_;
        result.challengeState_ = challengeState_;
        result.costPoints_ = costPoints_;
        result.cardId_ = cardId_;
        result.beginRound_ = beginRound_;
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
        if (other instanceof emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo) {
          return mergeFrom((emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo other) {
        if (other == emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.getDefaultInstance()) return this;
        if (other.getRandEffectId() != 0) {
          setRandEffectId(other.getRandEffectId());
        }
        if (other.getEndRound() != 0) {
          setEndRound(other.getEndRound());
        }
        if (other.challengeState_ != 0) {
          setChallengeStateValue(other.getChallengeStateValue());
        }
        if (other.getCostPoints() != 0) {
          setCostPoints(other.getCostPoints());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getBeginRound() != 0) {
          setBeginRound(other.getBeginRound());
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
        emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int randEffectId_ ;
      /**
       * <code>uint32 rand_effect_id = 12;</code>
       * @return The randEffectId.
       */
      @java.lang.Override
      public int getRandEffectId() {
        return randEffectId_;
      }
      /**
       * <code>uint32 rand_effect_id = 12;</code>
       * @param value The randEffectId to set.
       * @return This builder for chaining.
       */
      public Builder setRandEffectId(int value) {
        
        randEffectId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rand_effect_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandEffectId() {
        
        randEffectId_ = 0;
        onChanged();
        return this;
      }

      private int endRound_ ;
      /**
       * <code>uint32 end_round = 3;</code>
       * @return The endRound.
       */
      @java.lang.Override
      public int getEndRound() {
        return endRound_;
      }
      /**
       * <code>uint32 end_round = 3;</code>
       * @param value The endRound to set.
       * @return This builder for chaining.
       */
      public Builder setEndRound(int value) {
        
        endRound_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_round = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndRound() {
        
        endRound_ = 0;
        onChanged();
        return this;
      }

      private int challengeState_ = 0;
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
       * @return The enum numeric value on the wire for challengeState.
       */
      @java.lang.Override public int getChallengeStateValue() {
        return challengeState_;
      }
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
       * @param value The enum numeric value on the wire for challengeState to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeStateValue(int value) {
        
        challengeState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
       * @return The challengeState.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState getChallengeState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState result = emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.valueOf(challengeState_);
        return result == null ? emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.UNRECOGNIZED : result;
      }
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
       * @param value The challengeState to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeState(emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        challengeState_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeState() {
        
        challengeState_ = 0;
        onChanged();
        return this;
      }

      private int costPoints_ ;
      /**
       * <code>uint32 cost_points = 1;</code>
       * @return The costPoints.
       */
      @java.lang.Override
      public int getCostPoints() {
        return costPoints_;
      }
      /**
       * <code>uint32 cost_points = 1;</code>
       * @param value The costPoints to set.
       * @return This builder for chaining.
       */
      public Builder setCostPoints(int value) {
        
        costPoints_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_points = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostPoints() {
        
        costPoints_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 11;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 11;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int beginRound_ ;
      /**
       * <code>uint32 begin_round = 8;</code>
       * @return The beginRound.
       */
      @java.lang.Override
      public int getBeginRound() {
        return beginRound_;
      }
      /**
       * <code>uint32 begin_round = 8;</code>
       * @param value The beginRound to set.
       * @return This builder for chaining.
       */
      public Builder setBeginRound(int value) {
        
        beginRound_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_round = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginRound() {
        
        beginRound_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusCardInfo)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusCardInfo)
    private static final emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo();
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusCardInfo>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusCardInfo>() {
      @java.lang.Override
      public InBattleMechanicusCardInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InBattleMechanicusCardInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InBattleMechanicusCardInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusCardInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusCardInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusCardInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n InBattleMechanicusCardInfo.proto\032*InBa" +
      "ttleMechanicusCardChallengeState.proto\"\302" +
      "\001\n\032InBattleMechanicusCardInfo\022\026\n\016rand_ef" +
      "fect_id\030\014 \001(\r\022\021\n\tend_round\030\003 \001(\r\022>\n\017chal" +
      "lenge_state\030\005 \001(\0162%.InBattleMechanicusCa" +
      "rdChallengeState\022\023\n\013cost_points\030\001 \001(\r\022\017\n" +
      "\007card_id\030\013 \001(\r\022\023\n\013begin_round\030\010 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.getDescriptor(),
        });
    internal_static_InBattleMechanicusCardInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusCardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusCardInfo_descriptor,
        new java.lang.String[] { "RandEffectId", "EndRound", "ChallengeState", "CostPoints", "CardId", "BeginRound", });
    emu.grasscutter.net.proto.InBattleMechanicusCardChallengeStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
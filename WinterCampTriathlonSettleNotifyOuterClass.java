// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampTriathlonSettleNotify.proto

package emu.grasscutter.net.proto;

public final class WinterCampTriathlonSettleNotifyOuterClass {
  private WinterCampTriathlonSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampTriathlonSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampTriathlonSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 limited_coin = 9;</code>
     * @return The limitedCoin.
     */
    int getLimitedCoin();

    /**
     * <code>uint32 normal_coin = 2;</code>
     * @return The normalCoin.
     */
    int getNormalCoin();

    /**
     * <code>bool is_new_record = 7;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>bool is_success = 3;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 gallery_id = 13;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 remain_time = 4;</code>
     * @return The remainTime.
     */
    int getRemainTime();

    /**
     * <code>uint32 score = 11;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 race_id = 15;</code>
     * @return The raceId.
     */
    int getRaceId();
  }
  /**
   * <pre>
   * CmdId: 8342
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code WinterCampTriathlonSettleNotify}
   */
  public static final class WinterCampTriathlonSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampTriathlonSettleNotify)
      WinterCampTriathlonSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampTriathlonSettleNotify.newBuilder() to construct.
    private WinterCampTriathlonSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampTriathlonSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampTriathlonSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WinterCampTriathlonSettleNotify(
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
            case 16: {

              normalCoin_ = input.readUInt32();
              break;
            }
            case 24: {

              isSuccess_ = input.readBool();
              break;
            }
            case 32: {

              remainTime_ = input.readUInt32();
              break;
            }
            case 56: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 72: {

              limitedCoin_ = input.readUInt32();
              break;
            }
            case 88: {

              score_ = input.readUInt32();
              break;
            }
            case 104: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 120: {

              raceId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.internal_static_WinterCampTriathlonSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.internal_static_WinterCampTriathlonSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.class, emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.Builder.class);
    }

    public static final int LIMITED_COIN_FIELD_NUMBER = 9;
    private int limitedCoin_;
    /**
     * <code>uint32 limited_coin = 9;</code>
     * @return The limitedCoin.
     */
    @java.lang.Override
    public int getLimitedCoin() {
      return limitedCoin_;
    }

    public static final int NORMAL_COIN_FIELD_NUMBER = 2;
    private int normalCoin_;
    /**
     * <code>uint32 normal_coin = 2;</code>
     * @return The normalCoin.
     */
    @java.lang.Override
    public int getNormalCoin() {
      return normalCoin_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 7;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 7;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 3;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 3;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 13;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 13;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int REMAIN_TIME_FIELD_NUMBER = 4;
    private int remainTime_;
    /**
     * <code>uint32 remain_time = 4;</code>
     * @return The remainTime.
     */
    @java.lang.Override
    public int getRemainTime() {
      return remainTime_;
    }

    public static final int SCORE_FIELD_NUMBER = 11;
    private int score_;
    /**
     * <code>uint32 score = 11;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int RACE_ID_FIELD_NUMBER = 15;
    private int raceId_;
    /**
     * <code>uint32 race_id = 15;</code>
     * @return The raceId.
     */
    @java.lang.Override
    public int getRaceId() {
      return raceId_;
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
      if (normalCoin_ != 0) {
        output.writeUInt32(2, normalCoin_);
      }
      if (isSuccess_ != false) {
        output.writeBool(3, isSuccess_);
      }
      if (remainTime_ != 0) {
        output.writeUInt32(4, remainTime_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(7, isNewRecord_);
      }
      if (limitedCoin_ != 0) {
        output.writeUInt32(9, limitedCoin_);
      }
      if (score_ != 0) {
        output.writeUInt32(11, score_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(13, galleryId_);
      }
      if (raceId_ != 0) {
        output.writeUInt32(15, raceId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (normalCoin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, normalCoin_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isSuccess_);
      }
      if (remainTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, remainTime_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isNewRecord_);
      }
      if (limitedCoin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, limitedCoin_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, score_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, galleryId_);
      }
      if (raceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, raceId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify other = (emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify) obj;

      if (getLimitedCoin()
          != other.getLimitedCoin()) return false;
      if (getNormalCoin()
          != other.getNormalCoin()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getRemainTime()
          != other.getRemainTime()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getRaceId()
          != other.getRaceId()) return false;
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
      hash = (37 * hash) + LIMITED_COIN_FIELD_NUMBER;
      hash = (53 * hash) + getLimitedCoin();
      hash = (37 * hash) + NORMAL_COIN_FIELD_NUMBER;
      hash = (53 * hash) + getNormalCoin();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + REMAIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getRemainTime();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + RACE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRaceId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify prototype) {
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
     * CmdId: 8342
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code WinterCampTriathlonSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampTriathlonSettleNotify)
        emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.internal_static_WinterCampTriathlonSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.internal_static_WinterCampTriathlonSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.class, emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.newBuilder()
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
        limitedCoin_ = 0;

        normalCoin_ = 0;

        isNewRecord_ = false;

        isSuccess_ = false;

        galleryId_ = 0;

        remainTime_ = 0;

        score_ = 0;

        raceId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.internal_static_WinterCampTriathlonSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify build() {
        emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify buildPartial() {
        emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify result = new emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify(this);
        result.limitedCoin_ = limitedCoin_;
        result.normalCoin_ = normalCoin_;
        result.isNewRecord_ = isNewRecord_;
        result.isSuccess_ = isSuccess_;
        result.galleryId_ = galleryId_;
        result.remainTime_ = remainTime_;
        result.score_ = score_;
        result.raceId_ = raceId_;
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
        if (other instanceof emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify other) {
        if (other == emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify.getDefaultInstance()) return this;
        if (other.getLimitedCoin() != 0) {
          setLimitedCoin(other.getLimitedCoin());
        }
        if (other.getNormalCoin() != 0) {
          setNormalCoin(other.getNormalCoin());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getRemainTime() != 0) {
          setRemainTime(other.getRemainTime());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getRaceId() != 0) {
          setRaceId(other.getRaceId());
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
        emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int limitedCoin_ ;
      /**
       * <code>uint32 limited_coin = 9;</code>
       * @return The limitedCoin.
       */
      @java.lang.Override
      public int getLimitedCoin() {
        return limitedCoin_;
      }
      /**
       * <code>uint32 limited_coin = 9;</code>
       * @param value The limitedCoin to set.
       * @return This builder for chaining.
       */
      public Builder setLimitedCoin(int value) {
        
        limitedCoin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 limited_coin = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLimitedCoin() {
        
        limitedCoin_ = 0;
        onChanged();
        return this;
      }

      private int normalCoin_ ;
      /**
       * <code>uint32 normal_coin = 2;</code>
       * @return The normalCoin.
       */
      @java.lang.Override
      public int getNormalCoin() {
        return normalCoin_;
      }
      /**
       * <code>uint32 normal_coin = 2;</code>
       * @param value The normalCoin to set.
       * @return This builder for chaining.
       */
      public Builder setNormalCoin(int value) {
        
        normalCoin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 normal_coin = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNormalCoin() {
        
        normalCoin_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 7;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 7;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 3;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 3;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int remainTime_ ;
      /**
       * <code>uint32 remain_time = 4;</code>
       * @return The remainTime.
       */
      @java.lang.Override
      public int getRemainTime() {
        return remainTime_;
      }
      /**
       * <code>uint32 remain_time = 4;</code>
       * @param value The remainTime to set.
       * @return This builder for chaining.
       */
      public Builder setRemainTime(int value) {
        
        remainTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 remain_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainTime() {
        
        remainTime_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 11;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 11;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int raceId_ ;
      /**
       * <code>uint32 race_id = 15;</code>
       * @return The raceId.
       */
      @java.lang.Override
      public int getRaceId() {
        return raceId_;
      }
      /**
       * <code>uint32 race_id = 15;</code>
       * @param value The raceId to set.
       * @return This builder for chaining.
       */
      public Builder setRaceId(int value) {
        
        raceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 race_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRaceId() {
        
        raceId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WinterCampTriathlonSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:WinterCampTriathlonSettleNotify)
    private static final emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify();
    }

    public static emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampTriathlonSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampTriathlonSettleNotify>() {
      @java.lang.Override
      public WinterCampTriathlonSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WinterCampTriathlonSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WinterCampTriathlonSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampTriathlonSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampTriathlonSettleNotifyOuterClass.WinterCampTriathlonSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampTriathlonSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampTriathlonSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%WinterCampTriathlonSettleNotify.proto\"" +
      "\300\001\n\037WinterCampTriathlonSettleNotify\022\024\n\014l" +
      "imited_coin\030\t \001(\r\022\023\n\013normal_coin\030\002 \001(\r\022\025" +
      "\n\ris_new_record\030\007 \001(\010\022\022\n\nis_success\030\003 \001(" +
      "\010\022\022\n\ngallery_id\030\r \001(\r\022\023\n\013remain_time\030\004 \001" +
      "(\r\022\r\n\005score\030\013 \001(\r\022\017\n\007race_id\030\017 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WinterCampTriathlonSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampTriathlonSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampTriathlonSettleNotify_descriptor,
        new java.lang.String[] { "LimitedCoin", "NormalCoin", "IsNewRecord", "IsSuccess", "GalleryId", "RemainTime", "Score", "RaceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
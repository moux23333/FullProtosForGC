// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_IJFEPCBOLDF.proto

package emu.grasscutter.net.proto;

public final class Unk2700IJFEPCBOLDF {
  private Unk2700IJFEPCBOLDF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_IJFEPCBOLDFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_IJFEPCBOLDF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new_record = 9;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>bool Unk2700_MMNILGLDHHD = 3;</code>
     * @return The unk2700MMNILGLDHHD.
     */
    boolean getUnk2700MMNILGLDHHD();

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 score = 8;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * <pre>
   * CmdId: 8756
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_IJFEPCBOLDF}
   */
  public static final class Unk2700_IJFEPCBOLDF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_IJFEPCBOLDF)
      Unk2700_IJFEPCBOLDFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_IJFEPCBOLDF.newBuilder() to construct.
    private Unk2700_IJFEPCBOLDF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_IJFEPCBOLDF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_IJFEPCBOLDF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_IJFEPCBOLDF(
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
            case 24: {

              unk2700MMNILGLDHHD_ = input.readBool();
              break;
            }
            case 64: {

              score_ = input.readUInt32();
              break;
            }
            case 72: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 120: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.internal_static_Unk2700_IJFEPCBOLDF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.internal_static_Unk2700_IJFEPCBOLDF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF.class, emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF.Builder.class);
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 9;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 9;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int UNK2700_MMNILGLDHHD_FIELD_NUMBER = 3;
    private boolean unk2700MMNILGLDHHD_;
    /**
     * <code>bool Unk2700_MMNILGLDHHD = 3;</code>
     * @return The unk2700MMNILGLDHHD.
     */
    @java.lang.Override
    public boolean getUnk2700MMNILGLDHHD() {
      return unk2700MMNILGLDHHD_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 15;
    private int levelId_;
    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int SCORE_FIELD_NUMBER = 8;
    private int score_;
    /**
     * <code>uint32 score = 8;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (unk2700MMNILGLDHHD_ != false) {
        output.writeBool(3, unk2700MMNILGLDHHD_);
      }
      if (score_ != 0) {
        output.writeUInt32(8, score_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(9, isNewRecord_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(15, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700MMNILGLDHHD_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, unk2700MMNILGLDHHD_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, score_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isNewRecord_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF other = (emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF) obj;

      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getUnk2700MMNILGLDHHD()
          != other.getUnk2700MMNILGLDHHD()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + UNK2700_MMNILGLDHHD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700MMNILGLDHHD());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF prototype) {
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
     * CmdId: 8756
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_IJFEPCBOLDF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_IJFEPCBOLDF)
        emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.internal_static_Unk2700_IJFEPCBOLDF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.internal_static_Unk2700_IJFEPCBOLDF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF.class, emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF.newBuilder()
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
        isNewRecord_ = false;

        unk2700MMNILGLDHHD_ = false;

        levelId_ = 0;

        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.internal_static_Unk2700_IJFEPCBOLDF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF build() {
        emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF buildPartial() {
        emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF result = new emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF(this);
        result.isNewRecord_ = isNewRecord_;
        result.unk2700MMNILGLDHHD_ = unk2700MMNILGLDHHD_;
        result.levelId_ = levelId_;
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF other) {
        if (other == emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getUnk2700MMNILGLDHHD() != false) {
          setUnk2700MMNILGLDHHD(other.getUnk2700MMNILGLDHHD());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
        emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 9;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 9;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private boolean unk2700MMNILGLDHHD_ ;
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 3;</code>
       * @return The unk2700MMNILGLDHHD.
       */
      @java.lang.Override
      public boolean getUnk2700MMNILGLDHHD() {
        return unk2700MMNILGLDHHD_;
      }
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 3;</code>
       * @param value The unk2700MMNILGLDHHD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MMNILGLDHHD(boolean value) {
        
        unk2700MMNILGLDHHD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700MMNILGLDHHD() {
        
        unk2700MMNILGLDHHD_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 15;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 8;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 8;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_IJFEPCBOLDF)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_IJFEPCBOLDF)
    private static final emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF();
    }

    public static emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_IJFEPCBOLDF>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_IJFEPCBOLDF>() {
      @java.lang.Override
      public Unk2700_IJFEPCBOLDF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_IJFEPCBOLDF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_IJFEPCBOLDF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_IJFEPCBOLDF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700IJFEPCBOLDF.Unk2700_IJFEPCBOLDF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_IJFEPCBOLDF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_IJFEPCBOLDF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_IJFEPCBOLDF.proto\"j\n\023Unk2700_I" +
      "JFEPCBOLDF\022\025\n\ris_new_record\030\t \001(\010\022\033\n\023Unk" +
      "2700_MMNILGLDHHD\030\003 \001(\010\022\020\n\010level_id\030\017 \001(\r" +
      "\022\r\n\005score\030\010 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_IJFEPCBOLDF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_IJFEPCBOLDF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_IJFEPCBOLDF_descriptor,
        new java.lang.String[] { "IsNewRecord", "Unk2700MMNILGLDHHD", "LevelId", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

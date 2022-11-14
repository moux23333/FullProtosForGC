// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalvageScoreChallengeInfo.proto

package emu.grasscutter.net.proto;

public final class SalvageScoreChallengeInfoOuterClass {
  private SalvageScoreChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SalvageScoreChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SalvageScoreChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 salvage_challenge_id = 13;</code>
     * @return The salvageChallengeId.
     */
    int getSalvageChallengeId();

    /**
     * <code>uint32 max_score = 7;</code>
     * @return The maxScore.
     */
    int getMaxScore();
  }
  /**
   * Protobuf type {@code SalvageScoreChallengeInfo}
   */
  public static final class SalvageScoreChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SalvageScoreChallengeInfo)
      SalvageScoreChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SalvageScoreChallengeInfo.newBuilder() to construct.
    private SalvageScoreChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SalvageScoreChallengeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SalvageScoreChallengeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SalvageScoreChallengeInfo(
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

              maxScore_ = input.readUInt32();
              break;
            }
            case 104: {

              salvageChallengeId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.internal_static_SalvageScoreChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.internal_static_SalvageScoreChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo.class, emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo.Builder.class);
    }

    public static final int SALVAGE_CHALLENGE_ID_FIELD_NUMBER = 13;
    private int salvageChallengeId_;
    /**
     * <code>uint32 salvage_challenge_id = 13;</code>
     * @return The salvageChallengeId.
     */
    @java.lang.Override
    public int getSalvageChallengeId() {
      return salvageChallengeId_;
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 7;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 7;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
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
      if (maxScore_ != 0) {
        output.writeUInt32(7, maxScore_);
      }
      if (salvageChallengeId_ != 0) {
        output.writeUInt32(13, salvageChallengeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, maxScore_);
      }
      if (salvageChallengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, salvageChallengeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo other = (emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo) obj;

      if (getSalvageChallengeId()
          != other.getSalvageChallengeId()) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
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
      hash = (37 * hash) + SALVAGE_CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSalvageChallengeId();
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo prototype) {
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
     * Protobuf type {@code SalvageScoreChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SalvageScoreChallengeInfo)
        emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.internal_static_SalvageScoreChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.internal_static_SalvageScoreChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo.class, emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo.newBuilder()
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
        salvageChallengeId_ = 0;

        maxScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.internal_static_SalvageScoreChallengeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo build() {
        emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo buildPartial() {
        emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo result = new emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo(this);
        result.salvageChallengeId_ = salvageChallengeId_;
        result.maxScore_ = maxScore_;
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
        if (other instanceof emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo other) {
        if (other == emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo.getDefaultInstance()) return this;
        if (other.getSalvageChallengeId() != 0) {
          setSalvageChallengeId(other.getSalvageChallengeId());
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
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
        emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int salvageChallengeId_ ;
      /**
       * <code>uint32 salvage_challenge_id = 13;</code>
       * @return The salvageChallengeId.
       */
      @java.lang.Override
      public int getSalvageChallengeId() {
        return salvageChallengeId_;
      }
      /**
       * <code>uint32 salvage_challenge_id = 13;</code>
       * @param value The salvageChallengeId to set.
       * @return This builder for chaining.
       */
      public Builder setSalvageChallengeId(int value) {
        
        salvageChallengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 salvage_challenge_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSalvageChallengeId() {
        
        salvageChallengeId_ = 0;
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 7;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 7;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SalvageScoreChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:SalvageScoreChallengeInfo)
    private static final emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo();
    }

    public static emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SalvageScoreChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<SalvageScoreChallengeInfo>() {
      @java.lang.Override
      public SalvageScoreChallengeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SalvageScoreChallengeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SalvageScoreChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SalvageScoreChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SalvageScoreChallengeInfoOuterClass.SalvageScoreChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalvageScoreChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalvageScoreChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SalvageScoreChallengeInfo.proto\"L\n\031Sal" +
      "vageScoreChallengeInfo\022\034\n\024salvage_challe" +
      "nge_id\030\r \001(\r\022\021\n\tmax_score\030\007 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SalvageScoreChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SalvageScoreChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalvageScoreChallengeInfo_descriptor,
        new java.lang.String[] { "SalvageChallengeId", "MaxScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

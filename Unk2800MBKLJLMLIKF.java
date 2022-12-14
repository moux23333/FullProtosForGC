// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_MBKLJLMLIKF.proto

package emu.grasscutter.net.proto;

public final class Unk2800MBKLJLMLIKF {
  private Unk2800MBKLJLMLIKF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_MBKLJLMLIKFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_MBKLJLMLIKF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_open = 14;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 best_score = 4;</code>
     * @return The bestScore.
     */
    int getBestScore();
  }
  /**
   * Protobuf type {@code Unk2800_MBKLJLMLIKF}
   */
  public static final class Unk2800_MBKLJLMLIKF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_MBKLJLMLIKF)
      Unk2800_MBKLJLMLIKFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_MBKLJLMLIKF.newBuilder() to construct.
    private Unk2800_MBKLJLMLIKF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_MBKLJLMLIKF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_MBKLJLMLIKF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2800_MBKLJLMLIKF(
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
            case 32: {

              bestScore_ = input.readUInt32();
              break;
            }
            case 104: {

              stageId_ = input.readUInt32();
              break;
            }
            case 112: {

              isOpen_ = input.readBool();
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
      return emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.internal_static_Unk2800_MBKLJLMLIKF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.internal_static_Unk2800_MBKLJLMLIKF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF.class, emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 13;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 14;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 14;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 4;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 4;</code>
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
      if (bestScore_ != 0) {
        output.writeUInt32(4, bestScore_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(13, stageId_);
      }
      if (isOpen_ != false) {
        output.writeBool(14, isOpen_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, bestScore_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, stageId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF other = (emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF prototype) {
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
     * Protobuf type {@code Unk2800_MBKLJLMLIKF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_MBKLJLMLIKF)
        emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.internal_static_Unk2800_MBKLJLMLIKF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.internal_static_Unk2800_MBKLJLMLIKF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF.class, emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF.newBuilder()
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
        stageId_ = 0;

        isOpen_ = false;

        bestScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.internal_static_Unk2800_MBKLJLMLIKF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF build() {
        emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF buildPartial() {
        emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF result = new emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF(this);
        result.stageId_ = stageId_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF other) {
        if (other == emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
        emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 14;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 14;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 4;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 4;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:Unk2800_MBKLJLMLIKF)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_MBKLJLMLIKF)
    private static final emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF();
    }

    public static emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_MBKLJLMLIKF>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_MBKLJLMLIKF>() {
      @java.lang.Override
      public Unk2800_MBKLJLMLIKF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2800_MBKLJLMLIKF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2800_MBKLJLMLIKF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_MBKLJLMLIKF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2800MBKLJLMLIKF.Unk2800_MBKLJLMLIKF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_MBKLJLMLIKF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_MBKLJLMLIKF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_MBKLJLMLIKF.proto\"L\n\023Unk2800_M" +
      "BKLJLMLIKF\022\020\n\010stage_id\030\r \001(\r\022\017\n\007is_open\030" +
      "\016 \001(\010\022\022\n\nbest_score\030\004 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2800_MBKLJLMLIKF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_MBKLJLMLIKF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_MBKLJLMLIKF_descriptor,
        new java.lang.String[] { "StageId", "IsOpen", "BestScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

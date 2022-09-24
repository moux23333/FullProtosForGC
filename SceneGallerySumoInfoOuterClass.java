// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGallerySumoInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGallerySumoInfoOuterClass {
  private SceneGallerySumoInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGallerySumoInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGallerySumoInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 2;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 kill_normal_mosnter_num = 15;</code>
     * @return The killNormalMosnterNum.
     */
    int getKillNormalMosnterNum();

    /**
     * <code>uint32 kill_elite_monster_num = 14;</code>
     * @return The killEliteMonsterNum.
     */
    int getKillEliteMonsterNum();
  }
  /**
   * Protobuf type {@code SceneGallerySumoInfo}
   */
  public static final class SceneGallerySumoInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGallerySumoInfo)
      SceneGallerySumoInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGallerySumoInfo.newBuilder() to construct.
    private SceneGallerySumoInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGallerySumoInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGallerySumoInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGallerySumoInfo(
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

              score_ = input.readUInt32();
              break;
            }
            case 112: {

              killEliteMonsterNum_ = input.readUInt32();
              break;
            }
            case 120: {

              killNormalMosnterNum_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.class, emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 2;
    private int score_;
    /**
     * <code>uint32 score = 2;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int KILL_NORMAL_MOSNTER_NUM_FIELD_NUMBER = 15;
    private int killNormalMosnterNum_;
    /**
     * <code>uint32 kill_normal_mosnter_num = 15;</code>
     * @return The killNormalMosnterNum.
     */
    @java.lang.Override
    public int getKillNormalMosnterNum() {
      return killNormalMosnterNum_;
    }

    public static final int KILL_ELITE_MONSTER_NUM_FIELD_NUMBER = 14;
    private int killEliteMonsterNum_;
    /**
     * <code>uint32 kill_elite_monster_num = 14;</code>
     * @return The killEliteMonsterNum.
     */
    @java.lang.Override
    public int getKillEliteMonsterNum() {
      return killEliteMonsterNum_;
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
      if (score_ != 0) {
        output.writeUInt32(2, score_);
      }
      if (killEliteMonsterNum_ != 0) {
        output.writeUInt32(14, killEliteMonsterNum_);
      }
      if (killNormalMosnterNum_ != 0) {
        output.writeUInt32(15, killNormalMosnterNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, score_);
      }
      if (killEliteMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, killEliteMonsterNum_);
      }
      if (killNormalMosnterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, killNormalMosnterNum_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo other = (emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo) obj;

      if (getScore()
          != other.getScore()) return false;
      if (getKillNormalMosnterNum()
          != other.getKillNormalMosnterNum()) return false;
      if (getKillEliteMonsterNum()
          != other.getKillEliteMonsterNum()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + KILL_NORMAL_MOSNTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillNormalMosnterNum();
      hash = (37 * hash) + KILL_ELITE_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillEliteMonsterNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo prototype) {
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
     * Protobuf type {@code SceneGallerySumoInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGallerySumoInfo)
        emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.class, emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.newBuilder()
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
        score_ = 0;

        killNormalMosnterNum_ = 0;

        killEliteMonsterNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo build() {
        emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo result = new emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo(this);
        result.score_ = score_;
        result.killNormalMosnterNum_ = killNormalMosnterNum_;
        result.killEliteMonsterNum_ = killEliteMonsterNum_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getKillNormalMosnterNum() != 0) {
          setKillNormalMosnterNum(other.getKillNormalMosnterNum());
        }
        if (other.getKillEliteMonsterNum() != 0) {
          setKillEliteMonsterNum(other.getKillEliteMonsterNum());
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
        emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 2;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 2;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int killNormalMosnterNum_ ;
      /**
       * <code>uint32 kill_normal_mosnter_num = 15;</code>
       * @return The killNormalMosnterNum.
       */
      @java.lang.Override
      public int getKillNormalMosnterNum() {
        return killNormalMosnterNum_;
      }
      /**
       * <code>uint32 kill_normal_mosnter_num = 15;</code>
       * @param value The killNormalMosnterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillNormalMosnterNum(int value) {
        
        killNormalMosnterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_normal_mosnter_num = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillNormalMosnterNum() {
        
        killNormalMosnterNum_ = 0;
        onChanged();
        return this;
      }

      private int killEliteMonsterNum_ ;
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @return The killEliteMonsterNum.
       */
      @java.lang.Override
      public int getKillEliteMonsterNum() {
        return killEliteMonsterNum_;
      }
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @param value The killEliteMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillEliteMonsterNum(int value) {
        
        killEliteMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillEliteMonsterNum() {
        
        killEliteMonsterNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGallerySumoInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGallerySumoInfo)
    private static final emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo();
    }

    public static emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGallerySumoInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGallerySumoInfo>() {
      @java.lang.Override
      public SceneGallerySumoInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGallerySumoInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGallerySumoInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGallerySumoInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGallerySumoInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGallerySumoInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneGallerySumoInfo.proto\"f\n\024SceneGal" +
      "lerySumoInfo\022\r\n\005score\030\002 \001(\r\022\037\n\027kill_norm" +
      "al_mosnter_num\030\017 \001(\r\022\036\n\026kill_elite_monst" +
      "er_num\030\016 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGallerySumoInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGallerySumoInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGallerySumoInfo_descriptor,
        new java.lang.String[] { "Score", "KillNormalMosnterNum", "KillEliteMonsterNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

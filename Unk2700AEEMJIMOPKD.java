// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_AEEMJIMOPKD.proto

package emu.grasscutter.net.proto;

public final class Unk2700AEEMJIMOPKD {
  private Unk2700AEEMJIMOPKD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_AEEMJIMOPKDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_AEEMJIMOPKD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_success = 3;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();
  }
  /**
   * <pre>
   * CmdId: 8481
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_AEEMJIMOPKD}
   */
  public static final class Unk2700_AEEMJIMOPKD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_AEEMJIMOPKD)
      Unk2700_AEEMJIMOPKDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_AEEMJIMOPKD.newBuilder() to construct.
    private Unk2700_AEEMJIMOPKD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_AEEMJIMOPKD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_AEEMJIMOPKD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_AEEMJIMOPKD(
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

              isSuccess_ = input.readBool();
              break;
            }
            case 104: {

              stageId_ = input.readUInt32();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.internal_static_Unk2700_AEEMJIMOPKD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.internal_static_Unk2700_AEEMJIMOPKD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD.class, emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD.Builder.class);
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

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (isSuccess_ != false) {
        output.writeBool(3, isSuccess_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(13, stageId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isSuccess_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, stageId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD other = (emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD prototype) {
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
     * CmdId: 8481
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_AEEMJIMOPKD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_AEEMJIMOPKD)
        emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.internal_static_Unk2700_AEEMJIMOPKD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.internal_static_Unk2700_AEEMJIMOPKD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD.class, emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD.newBuilder()
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

        retcode_ = 0;

        isSuccess_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.internal_static_Unk2700_AEEMJIMOPKD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD build() {
        emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD buildPartial() {
        emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD result = new emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD(this);
        result.stageId_ = stageId_;
        result.retcode_ = retcode_;
        result.isSuccess_ = isSuccess_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD other) {
        if (other == emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
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
        emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD) e.getUnfinishedMessage();
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_AEEMJIMOPKD)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_AEEMJIMOPKD)
    private static final emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD();
    }

    public static emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_AEEMJIMOPKD>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_AEEMJIMOPKD>() {
      @java.lang.Override
      public Unk2700_AEEMJIMOPKD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_AEEMJIMOPKD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_AEEMJIMOPKD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_AEEMJIMOPKD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700AEEMJIMOPKD.Unk2700_AEEMJIMOPKD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_AEEMJIMOPKD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_AEEMJIMOPKD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_AEEMJIMOPKD.proto\"L\n\023Unk2700_A" +
      "EEMJIMOPKD\022\020\n\010stage_id\030\r \001(\r\022\017\n\007retcode\030" +
      "\016 \001(\005\022\022\n\nis_success\030\003 \001(\010B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_AEEMJIMOPKD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_AEEMJIMOPKD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_AEEMJIMOPKD_descriptor,
        new java.lang.String[] { "StageId", "Retcode", "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

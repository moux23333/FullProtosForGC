// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReportFightAntiCheatNotify.proto

package emu.grasscutter.net.proto;

public final class ReportFightAntiCheatNotifyOuterClass {
  private ReportFightAntiCheatNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReportFightAntiCheatNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReportFightAntiCheatNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cheat_count = 8;</code>
     * @return The cheatCount.
     */
    int getCheatCount();

    /**
     * <code>uint32 cheat_type = 12;</code>
     * @return The cheatType.
     */
    int getCheatType();
  }
  /**
   * <pre>
   * CmdId: 368
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ReportFightAntiCheatNotify}
   */
  public static final class ReportFightAntiCheatNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReportFightAntiCheatNotify)
      ReportFightAntiCheatNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReportFightAntiCheatNotify.newBuilder() to construct.
    private ReportFightAntiCheatNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReportFightAntiCheatNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReportFightAntiCheatNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReportFightAntiCheatNotify(
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
            case 64: {

              cheatCount_ = input.readUInt32();
              break;
            }
            case 96: {

              cheatType_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.internal_static_ReportFightAntiCheatNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.internal_static_ReportFightAntiCheatNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify.class, emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify.Builder.class);
    }

    public static final int CHEAT_COUNT_FIELD_NUMBER = 8;
    private int cheatCount_;
    /**
     * <code>uint32 cheat_count = 8;</code>
     * @return The cheatCount.
     */
    @java.lang.Override
    public int getCheatCount() {
      return cheatCount_;
    }

    public static final int CHEAT_TYPE_FIELD_NUMBER = 12;
    private int cheatType_;
    /**
     * <code>uint32 cheat_type = 12;</code>
     * @return The cheatType.
     */
    @java.lang.Override
    public int getCheatType() {
      return cheatType_;
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
      if (cheatCount_ != 0) {
        output.writeUInt32(8, cheatCount_);
      }
      if (cheatType_ != 0) {
        output.writeUInt32(12, cheatType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cheatCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cheatCount_);
      }
      if (cheatType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, cheatType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify other = (emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify) obj;

      if (getCheatCount()
          != other.getCheatCount()) return false;
      if (getCheatType()
          != other.getCheatType()) return false;
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
      hash = (37 * hash) + CHEAT_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCheatCount();
      hash = (37 * hash) + CHEAT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCheatType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify prototype) {
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
     * CmdId: 368
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ReportFightAntiCheatNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReportFightAntiCheatNotify)
        emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.internal_static_ReportFightAntiCheatNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.internal_static_ReportFightAntiCheatNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify.class, emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify.newBuilder()
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
        cheatCount_ = 0;

        cheatType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.internal_static_ReportFightAntiCheatNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify build() {
        emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify buildPartial() {
        emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify result = new emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify(this);
        result.cheatCount_ = cheatCount_;
        result.cheatType_ = cheatType_;
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
        if (other instanceof emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify other) {
        if (other == emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify.getDefaultInstance()) return this;
        if (other.getCheatCount() != 0) {
          setCheatCount(other.getCheatCount());
        }
        if (other.getCheatType() != 0) {
          setCheatType(other.getCheatType());
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
        emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cheatCount_ ;
      /**
       * <code>uint32 cheat_count = 8;</code>
       * @return The cheatCount.
       */
      @java.lang.Override
      public int getCheatCount() {
        return cheatCount_;
      }
      /**
       * <code>uint32 cheat_count = 8;</code>
       * @param value The cheatCount to set.
       * @return This builder for chaining.
       */
      public Builder setCheatCount(int value) {
        
        cheatCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cheat_count = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheatCount() {
        
        cheatCount_ = 0;
        onChanged();
        return this;
      }

      private int cheatType_ ;
      /**
       * <code>uint32 cheat_type = 12;</code>
       * @return The cheatType.
       */
      @java.lang.Override
      public int getCheatType() {
        return cheatType_;
      }
      /**
       * <code>uint32 cheat_type = 12;</code>
       * @param value The cheatType to set.
       * @return This builder for chaining.
       */
      public Builder setCheatType(int value) {
        
        cheatType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cheat_type = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheatType() {
        
        cheatType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ReportFightAntiCheatNotify)
    }

    // @@protoc_insertion_point(class_scope:ReportFightAntiCheatNotify)
    private static final emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify();
    }

    public static emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReportFightAntiCheatNotify>
        PARSER = new com.google.protobuf.AbstractParser<ReportFightAntiCheatNotify>() {
      @java.lang.Override
      public ReportFightAntiCheatNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReportFightAntiCheatNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReportFightAntiCheatNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReportFightAntiCheatNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReportFightAntiCheatNotifyOuterClass.ReportFightAntiCheatNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReportFightAntiCheatNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReportFightAntiCheatNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ReportFightAntiCheatNotify.proto\"E\n\032Re" +
      "portFightAntiCheatNotify\022\023\n\013cheat_count\030" +
      "\010 \001(\r\022\022\n\ncheat_type\030\014 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReportFightAntiCheatNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReportFightAntiCheatNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReportFightAntiCheatNotify_descriptor,
        new java.lang.String[] { "CheatCount", "CheatType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

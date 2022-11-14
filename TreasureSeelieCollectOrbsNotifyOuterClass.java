// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TreasureSeelieCollectOrbsNotify.proto

package emu.grasscutter.net.proto;

public final class TreasureSeelieCollectOrbsNotifyOuterClass {
  private TreasureSeelieCollectOrbsNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TreasureSeelieCollectOrbsNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TreasureSeelieCollectOrbsNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 current_num = 11;</code>
     * @return The currentNum.
     */
    int getCurrentNum();

    /**
     * <code>uint32 total_num = 5;</code>
     * @return The totalNum.
     */
    int getTotalNum();
  }
  /**
   * <pre>
   * CmdId: 20754
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code TreasureSeelieCollectOrbsNotify}
   */
  public static final class TreasureSeelieCollectOrbsNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TreasureSeelieCollectOrbsNotify)
      TreasureSeelieCollectOrbsNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TreasureSeelieCollectOrbsNotify.newBuilder() to construct.
    private TreasureSeelieCollectOrbsNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TreasureSeelieCollectOrbsNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TreasureSeelieCollectOrbsNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TreasureSeelieCollectOrbsNotify(
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
            case 40: {

              totalNum_ = input.readUInt32();
              break;
            }
            case 88: {

              currentNum_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.internal_static_TreasureSeelieCollectOrbsNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.internal_static_TreasureSeelieCollectOrbsNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify.class, emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify.Builder.class);
    }

    public static final int CURRENT_NUM_FIELD_NUMBER = 11;
    private int currentNum_;
    /**
     * <code>uint32 current_num = 11;</code>
     * @return The currentNum.
     */
    @java.lang.Override
    public int getCurrentNum() {
      return currentNum_;
    }

    public static final int TOTAL_NUM_FIELD_NUMBER = 5;
    private int totalNum_;
    /**
     * <code>uint32 total_num = 5;</code>
     * @return The totalNum.
     */
    @java.lang.Override
    public int getTotalNum() {
      return totalNum_;
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
      if (totalNum_ != 0) {
        output.writeUInt32(5, totalNum_);
      }
      if (currentNum_ != 0) {
        output.writeUInt32(11, currentNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, totalNum_);
      }
      if (currentNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, currentNum_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify other = (emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify) obj;

      if (getCurrentNum()
          != other.getCurrentNum()) return false;
      if (getTotalNum()
          != other.getTotalNum()) return false;
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
      hash = (37 * hash) + CURRENT_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentNum();
      hash = (37 * hash) + TOTAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTotalNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify prototype) {
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
     * CmdId: 20754
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code TreasureSeelieCollectOrbsNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TreasureSeelieCollectOrbsNotify)
        emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.internal_static_TreasureSeelieCollectOrbsNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.internal_static_TreasureSeelieCollectOrbsNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify.class, emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify.newBuilder()
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
        currentNum_ = 0;

        totalNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.internal_static_TreasureSeelieCollectOrbsNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify build() {
        emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify buildPartial() {
        emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify result = new emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify(this);
        result.currentNum_ = currentNum_;
        result.totalNum_ = totalNum_;
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
        if (other instanceof emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify other) {
        if (other == emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify.getDefaultInstance()) return this;
        if (other.getCurrentNum() != 0) {
          setCurrentNum(other.getCurrentNum());
        }
        if (other.getTotalNum() != 0) {
          setTotalNum(other.getTotalNum());
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
        emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int currentNum_ ;
      /**
       * <code>uint32 current_num = 11;</code>
       * @return The currentNum.
       */
      @java.lang.Override
      public int getCurrentNum() {
        return currentNum_;
      }
      /**
       * <code>uint32 current_num = 11;</code>
       * @param value The currentNum to set.
       * @return This builder for chaining.
       */
      public Builder setCurrentNum(int value) {
        
        currentNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 current_num = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurrentNum() {
        
        currentNum_ = 0;
        onChanged();
        return this;
      }

      private int totalNum_ ;
      /**
       * <code>uint32 total_num = 5;</code>
       * @return The totalNum.
       */
      @java.lang.Override
      public int getTotalNum() {
        return totalNum_;
      }
      /**
       * <code>uint32 total_num = 5;</code>
       * @param value The totalNum to set.
       * @return This builder for chaining.
       */
      public Builder setTotalNum(int value) {
        
        totalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_num = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalNum() {
        
        totalNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TreasureSeelieCollectOrbsNotify)
    }

    // @@protoc_insertion_point(class_scope:TreasureSeelieCollectOrbsNotify)
    private static final emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify();
    }

    public static emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TreasureSeelieCollectOrbsNotify>
        PARSER = new com.google.protobuf.AbstractParser<TreasureSeelieCollectOrbsNotify>() {
      @java.lang.Override
      public TreasureSeelieCollectOrbsNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TreasureSeelieCollectOrbsNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TreasureSeelieCollectOrbsNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TreasureSeelieCollectOrbsNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TreasureSeelieCollectOrbsNotifyOuterClass.TreasureSeelieCollectOrbsNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TreasureSeelieCollectOrbsNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TreasureSeelieCollectOrbsNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%TreasureSeelieCollectOrbsNotify.proto\"" +
      "I\n\037TreasureSeelieCollectOrbsNotify\022\023\n\013cu" +
      "rrent_num\030\013 \001(\r\022\021\n\ttotal_num\030\005 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TreasureSeelieCollectOrbsNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TreasureSeelieCollectOrbsNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TreasureSeelieCollectOrbsNotify_descriptor,
        new java.lang.String[] { "CurrentNum", "TotalNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

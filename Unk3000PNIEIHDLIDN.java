// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_PNIEIHDLIDN.proto

package emu.grasscutter.net.proto;

public final class Unk3000PNIEIHDLIDN {
  private Unk3000PNIEIHDLIDN() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_PNIEIHDLIDNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_PNIEIHDLIDN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 add_progress = 4;</code>
     * @return The addProgress.
     */
    int getAddProgress();

    /**
     * <code>uint32 stage = 2;</code>
     * @return The stage.
     */
    int getStage();

    /**
     * <code>uint32 watcher_id = 12;</code>
     * @return The watcherId.
     */
    int getWatcherId();
  }
  /**
   * <pre>
   * CmdId: 2207
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_PNIEIHDLIDN}
   */
  public static final class Unk3000_PNIEIHDLIDN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_PNIEIHDLIDN)
      Unk3000_PNIEIHDLIDNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_PNIEIHDLIDN.newBuilder() to construct.
    private Unk3000_PNIEIHDLIDN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_PNIEIHDLIDN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_PNIEIHDLIDN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_PNIEIHDLIDN(
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

              stage_ = input.readUInt32();
              break;
            }
            case 32: {

              addProgress_ = input.readUInt32();
              break;
            }
            case 96: {

              watcherId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.internal_static_Unk3000_PNIEIHDLIDN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.internal_static_Unk3000_PNIEIHDLIDN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN.class, emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN.Builder.class);
    }

    public static final int ADD_PROGRESS_FIELD_NUMBER = 4;
    private int addProgress_;
    /**
     * <code>uint32 add_progress = 4;</code>
     * @return The addProgress.
     */
    @java.lang.Override
    public int getAddProgress() {
      return addProgress_;
    }

    public static final int STAGE_FIELD_NUMBER = 2;
    private int stage_;
    /**
     * <code>uint32 stage = 2;</code>
     * @return The stage.
     */
    @java.lang.Override
    public int getStage() {
      return stage_;
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 12;
    private int watcherId_;
    /**
     * <code>uint32 watcher_id = 12;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
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
      if (stage_ != 0) {
        output.writeUInt32(2, stage_);
      }
      if (addProgress_ != 0) {
        output.writeUInt32(4, addProgress_);
      }
      if (watcherId_ != 0) {
        output.writeUInt32(12, watcherId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stage_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stage_);
      }
      if (addProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, addProgress_);
      }
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, watcherId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN other = (emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN) obj;

      if (getAddProgress()
          != other.getAddProgress()) return false;
      if (getStage()
          != other.getStage()) return false;
      if (getWatcherId()
          != other.getWatcherId()) return false;
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
      hash = (37 * hash) + ADD_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddProgress();
      hash = (37 * hash) + STAGE_FIELD_NUMBER;
      hash = (53 * hash) + getStage();
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN prototype) {
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
     * CmdId: 2207
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_PNIEIHDLIDN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_PNIEIHDLIDN)
        emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.internal_static_Unk3000_PNIEIHDLIDN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.internal_static_Unk3000_PNIEIHDLIDN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN.class, emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN.newBuilder()
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
        addProgress_ = 0;

        stage_ = 0;

        watcherId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.internal_static_Unk3000_PNIEIHDLIDN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN build() {
        emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN buildPartial() {
        emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN result = new emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN(this);
        result.addProgress_ = addProgress_;
        result.stage_ = stage_;
        result.watcherId_ = watcherId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN other) {
        if (other == emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN.getDefaultInstance()) return this;
        if (other.getAddProgress() != 0) {
          setAddProgress(other.getAddProgress());
        }
        if (other.getStage() != 0) {
          setStage(other.getStage());
        }
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
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
        emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int addProgress_ ;
      /**
       * <code>uint32 add_progress = 4;</code>
       * @return The addProgress.
       */
      @java.lang.Override
      public int getAddProgress() {
        return addProgress_;
      }
      /**
       * <code>uint32 add_progress = 4;</code>
       * @param value The addProgress to set.
       * @return This builder for chaining.
       */
      public Builder setAddProgress(int value) {
        
        addProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 add_progress = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddProgress() {
        
        addProgress_ = 0;
        onChanged();
        return this;
      }

      private int stage_ ;
      /**
       * <code>uint32 stage = 2;</code>
       * @return The stage.
       */
      @java.lang.Override
      public int getStage() {
        return stage_;
      }
      /**
       * <code>uint32 stage = 2;</code>
       * @param value The stage to set.
       * @return This builder for chaining.
       */
      public Builder setStage(int value) {
        
        stage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStage() {
        
        stage_ = 0;
        onChanged();
        return this;
      }

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 12;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 12;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        
        watcherId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_PNIEIHDLIDN)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_PNIEIHDLIDN)
    private static final emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN();
    }

    public static emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_PNIEIHDLIDN>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_PNIEIHDLIDN>() {
      @java.lang.Override
      public Unk3000_PNIEIHDLIDN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_PNIEIHDLIDN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_PNIEIHDLIDN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_PNIEIHDLIDN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000PNIEIHDLIDN.Unk3000_PNIEIHDLIDN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_PNIEIHDLIDN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_PNIEIHDLIDN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_PNIEIHDLIDN.proto\"N\n\023Unk3000_P" +
      "NIEIHDLIDN\022\024\n\014add_progress\030\004 \001(\r\022\r\n\005stag" +
      "e\030\002 \001(\r\022\022\n\nwatcher_id\030\014 \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_PNIEIHDLIDN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_PNIEIHDLIDN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_PNIEIHDLIDN_descriptor,
        new java.lang.String[] { "AddProgress", "Stage", "WatcherId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

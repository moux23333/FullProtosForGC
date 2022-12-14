// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_PCGBDJJOIHH.proto

package emu.grasscutter.net.proto;

public final class Unk3000PCGBDJJOIHH {
  private Unk3000PCGBDJJOIHH() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_PCGBDJJOIHHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_PCGBDJJOIHH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_entity_id = 14;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();

    /**
     * <code>uint32 source_entity_id = 12;</code>
     * @return The sourceEntityId.
     */
    int getSourceEntityId();
  }
  /**
   * <pre>
   * CmdId: 3475
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_PCGBDJJOIHH}
   */
  public static final class Unk3000_PCGBDJJOIHH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_PCGBDJJOIHH)
      Unk3000_PCGBDJJOIHHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_PCGBDJJOIHH.newBuilder() to construct.
    private Unk3000_PCGBDJJOIHH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_PCGBDJJOIHH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_PCGBDJJOIHH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_PCGBDJJOIHH(
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
            case 96: {

              sourceEntityId_ = input.readUInt32();
              break;
            }
            case 112: {

              targetEntityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.internal_static_Unk3000_PCGBDJJOIHH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.internal_static_Unk3000_PCGBDJJOIHH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH.class, emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH.Builder.class);
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 14;
    private int targetEntityId_;
    /**
     * <code>uint32 target_entity_id = 14;</code>
     * @return The targetEntityId.
     */
    @java.lang.Override
    public int getTargetEntityId() {
      return targetEntityId_;
    }

    public static final int SOURCE_ENTITY_ID_FIELD_NUMBER = 12;
    private int sourceEntityId_;
    /**
     * <code>uint32 source_entity_id = 12;</code>
     * @return The sourceEntityId.
     */
    @java.lang.Override
    public int getSourceEntityId() {
      return sourceEntityId_;
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
      if (sourceEntityId_ != 0) {
        output.writeUInt32(12, sourceEntityId_);
      }
      if (targetEntityId_ != 0) {
        output.writeUInt32(14, targetEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sourceEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, sourceEntityId_);
      }
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, targetEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH other = (emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH) obj;

      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
      if (getSourceEntityId()
          != other.getSourceEntityId()) return false;
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
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      hash = (37 * hash) + SOURCE_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH prototype) {
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
     * CmdId: 3475
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_PCGBDJJOIHH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_PCGBDJJOIHH)
        emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.internal_static_Unk3000_PCGBDJJOIHH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.internal_static_Unk3000_PCGBDJJOIHH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH.class, emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH.newBuilder()
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
        targetEntityId_ = 0;

        sourceEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.internal_static_Unk3000_PCGBDJJOIHH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH build() {
        emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH buildPartial() {
        emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH result = new emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH(this);
        result.targetEntityId_ = targetEntityId_;
        result.sourceEntityId_ = sourceEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH other) {
        if (other == emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH.getDefaultInstance()) return this;
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
        }
        if (other.getSourceEntityId() != 0) {
          setSourceEntityId(other.getSourceEntityId());
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
        emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 14;</code>
       * @return The targetEntityId.
       */
      @java.lang.Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 14;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {
        
        targetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        
        targetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int sourceEntityId_ ;
      /**
       * <code>uint32 source_entity_id = 12;</code>
       * @return The sourceEntityId.
       */
      @java.lang.Override
      public int getSourceEntityId() {
        return sourceEntityId_;
      }
      /**
       * <code>uint32 source_entity_id = 12;</code>
       * @param value The sourceEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setSourceEntityId(int value) {
        
        sourceEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 source_entity_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceEntityId() {
        
        sourceEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_PCGBDJJOIHH)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_PCGBDJJOIHH)
    private static final emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH();
    }

    public static emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_PCGBDJJOIHH>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_PCGBDJJOIHH>() {
      @java.lang.Override
      public Unk3000_PCGBDJJOIHH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_PCGBDJJOIHH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_PCGBDJJOIHH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_PCGBDJJOIHH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000PCGBDJJOIHH.Unk3000_PCGBDJJOIHH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_PCGBDJJOIHH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_PCGBDJJOIHH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_PCGBDJJOIHH.proto\"I\n\023Unk3000_P" +
      "CGBDJJOIHH\022\030\n\020target_entity_id\030\016 \001(\r\022\030\n\020" +
      "source_entity_id\030\014 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_PCGBDJJOIHH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_PCGBDJJOIHH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_PCGBDJJOIHH_descriptor,
        new java.lang.String[] { "TargetEntityId", "SourceEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

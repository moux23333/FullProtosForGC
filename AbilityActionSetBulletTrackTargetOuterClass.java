// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityActionSetBulletTrackTarget.proto

package emu.grasscutter.net.proto;

public final class AbilityActionSetBulletTrackTargetOuterClass {
  private AbilityActionSetBulletTrackTargetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityActionSetBulletTrackTargetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityActionSetBulletTrackTarget)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_GKACKBIEOHK = 10;</code>
     * @return The unk3300GKACKBIEOHK.
     */
    int getUnk3300GKACKBIEOHK();

    /**
     * <code>uint32 Unk3300_HGBOFFKEPDJ = 4;</code>
     * @return The unk3300HGBOFFKEPDJ.
     */
    int getUnk3300HGBOFFKEPDJ();
  }
  /**
   * Protobuf type {@code AbilityActionSetBulletTrackTarget}
   */
  public static final class AbilityActionSetBulletTrackTarget extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityActionSetBulletTrackTarget)
      AbilityActionSetBulletTrackTargetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityActionSetBulletTrackTarget.newBuilder() to construct.
    private AbilityActionSetBulletTrackTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityActionSetBulletTrackTarget() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityActionSetBulletTrackTarget();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityActionSetBulletTrackTarget(
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

              unk3300HGBOFFKEPDJ_ = input.readUInt32();
              break;
            }
            case 80: {

              unk3300GKACKBIEOHK_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.internal_static_AbilityActionSetBulletTrackTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.internal_static_AbilityActionSetBulletTrackTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget.class, emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget.Builder.class);
    }

    public static final int UNK3300_GKACKBIEOHK_FIELD_NUMBER = 10;
    private int unk3300GKACKBIEOHK_;
    /**
     * <code>uint32 Unk3300_GKACKBIEOHK = 10;</code>
     * @return The unk3300GKACKBIEOHK.
     */
    @java.lang.Override
    public int getUnk3300GKACKBIEOHK() {
      return unk3300GKACKBIEOHK_;
    }

    public static final int UNK3300_HGBOFFKEPDJ_FIELD_NUMBER = 4;
    private int unk3300HGBOFFKEPDJ_;
    /**
     * <code>uint32 Unk3300_HGBOFFKEPDJ = 4;</code>
     * @return The unk3300HGBOFFKEPDJ.
     */
    @java.lang.Override
    public int getUnk3300HGBOFFKEPDJ() {
      return unk3300HGBOFFKEPDJ_;
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
      if (unk3300HGBOFFKEPDJ_ != 0) {
        output.writeUInt32(4, unk3300HGBOFFKEPDJ_);
      }
      if (unk3300GKACKBIEOHK_ != 0) {
        output.writeUInt32(10, unk3300GKACKBIEOHK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300HGBOFFKEPDJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3300HGBOFFKEPDJ_);
      }
      if (unk3300GKACKBIEOHK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300GKACKBIEOHK_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget other = (emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget) obj;

      if (getUnk3300GKACKBIEOHK()
          != other.getUnk3300GKACKBIEOHK()) return false;
      if (getUnk3300HGBOFFKEPDJ()
          != other.getUnk3300HGBOFFKEPDJ()) return false;
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
      hash = (37 * hash) + UNK3300_GKACKBIEOHK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GKACKBIEOHK();
      hash = (37 * hash) + UNK3300_HGBOFFKEPDJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HGBOFFKEPDJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget prototype) {
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
     * Protobuf type {@code AbilityActionSetBulletTrackTarget}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityActionSetBulletTrackTarget)
        emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTargetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.internal_static_AbilityActionSetBulletTrackTarget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.internal_static_AbilityActionSetBulletTrackTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget.class, emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget.newBuilder()
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
        unk3300GKACKBIEOHK_ = 0;

        unk3300HGBOFFKEPDJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.internal_static_AbilityActionSetBulletTrackTarget_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget build() {
        emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget buildPartial() {
        emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget result = new emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget(this);
        result.unk3300GKACKBIEOHK_ = unk3300GKACKBIEOHK_;
        result.unk3300HGBOFFKEPDJ_ = unk3300HGBOFFKEPDJ_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget other) {
        if (other == emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget.getDefaultInstance()) return this;
        if (other.getUnk3300GKACKBIEOHK() != 0) {
          setUnk3300GKACKBIEOHK(other.getUnk3300GKACKBIEOHK());
        }
        if (other.getUnk3300HGBOFFKEPDJ() != 0) {
          setUnk3300HGBOFFKEPDJ(other.getUnk3300HGBOFFKEPDJ());
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
        emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300GKACKBIEOHK_ ;
      /**
       * <code>uint32 Unk3300_GKACKBIEOHK = 10;</code>
       * @return The unk3300GKACKBIEOHK.
       */
      @java.lang.Override
      public int getUnk3300GKACKBIEOHK() {
        return unk3300GKACKBIEOHK_;
      }
      /**
       * <code>uint32 Unk3300_GKACKBIEOHK = 10;</code>
       * @param value The unk3300GKACKBIEOHK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GKACKBIEOHK(int value) {
        
        unk3300GKACKBIEOHK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GKACKBIEOHK = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GKACKBIEOHK() {
        
        unk3300GKACKBIEOHK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300HGBOFFKEPDJ_ ;
      /**
       * <code>uint32 Unk3300_HGBOFFKEPDJ = 4;</code>
       * @return The unk3300HGBOFFKEPDJ.
       */
      @java.lang.Override
      public int getUnk3300HGBOFFKEPDJ() {
        return unk3300HGBOFFKEPDJ_;
      }
      /**
       * <code>uint32 Unk3300_HGBOFFKEPDJ = 4;</code>
       * @param value The unk3300HGBOFFKEPDJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HGBOFFKEPDJ(int value) {
        
        unk3300HGBOFFKEPDJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HGBOFFKEPDJ = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HGBOFFKEPDJ() {
        
        unk3300HGBOFFKEPDJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityActionSetBulletTrackTarget)
    }

    // @@protoc_insertion_point(class_scope:AbilityActionSetBulletTrackTarget)
    private static final emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget();
    }

    public static emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityActionSetBulletTrackTarget>
        PARSER = new com.google.protobuf.AbstractParser<AbilityActionSetBulletTrackTarget>() {
      @java.lang.Override
      public AbilityActionSetBulletTrackTarget parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityActionSetBulletTrackTarget(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityActionSetBulletTrackTarget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityActionSetBulletTrackTarget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityActionSetBulletTrackTargetOuterClass.AbilityActionSetBulletTrackTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityActionSetBulletTrackTarget_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityActionSetBulletTrackTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'AbilityActionSetBulletTrackTarget.prot" +
      "o\"]\n!AbilityActionSetBulletTrackTarget\022\033" +
      "\n\023Unk3300_GKACKBIEOHK\030\n \001(\r\022\033\n\023Unk3300_H" +
      "GBOFFKEPDJ\030\004 \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityActionSetBulletTrackTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityActionSetBulletTrackTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityActionSetBulletTrackTarget_descriptor,
        new java.lang.String[] { "Unk3300GKACKBIEOHK", "Unk3300HGBOFFKEPDJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

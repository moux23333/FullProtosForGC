// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryBulletHitNotify.proto

package emu.grasscutter.net.proto;

public final class GalleryBulletHitNotifyOuterClass {
  private GalleryBulletHitNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryBulletHitNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryBulletHitNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 hit_count = 14;</code>
     * @return The hitCount.
     */
    int getHitCount();

    /**
     * <code>uint32 gallery_id = 12;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 5531
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GalleryBulletHitNotify}
   */
  public static final class GalleryBulletHitNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryBulletHitNotify)
      GalleryBulletHitNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryBulletHitNotify.newBuilder() to construct.
    private GalleryBulletHitNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryBulletHitNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryBulletHitNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GalleryBulletHitNotify(
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

              galleryId_ = input.readUInt32();
              break;
            }
            case 112: {

              hitCount_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.internal_static_GalleryBulletHitNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.internal_static_GalleryBulletHitNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify.class, emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify.Builder.class);
    }

    public static final int HIT_COUNT_FIELD_NUMBER = 14;
    private int hitCount_;
    /**
     * <code>uint32 hit_count = 14;</code>
     * @return The hitCount.
     */
    @java.lang.Override
    public int getHitCount() {
      return hitCount_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 12;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 12;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(12, galleryId_);
      }
      if (hitCount_ != 0) {
        output.writeUInt32(14, hitCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, galleryId_);
      }
      if (hitCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, hitCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify other = (emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify) obj;

      if (getHitCount()
          != other.getHitCount()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + HIT_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getHitCount();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify prototype) {
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
     * CmdId: 5531
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GalleryBulletHitNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryBulletHitNotify)
        emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.internal_static_GalleryBulletHitNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.internal_static_GalleryBulletHitNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify.class, emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify.newBuilder()
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
        hitCount_ = 0;

        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.internal_static_GalleryBulletHitNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify build() {
        emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify buildPartial() {
        emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify result = new emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify(this);
        result.hitCount_ = hitCount_;
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify other) {
        if (other == emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify.getDefaultInstance()) return this;
        if (other.getHitCount() != 0) {
          setHitCount(other.getHitCount());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hitCount_ ;
      /**
       * <code>uint32 hit_count = 14;</code>
       * @return The hitCount.
       */
      @java.lang.Override
      public int getHitCount() {
        return hitCount_;
      }
      /**
       * <code>uint32 hit_count = 14;</code>
       * @param value The hitCount to set.
       * @return This builder for chaining.
       */
      public Builder setHitCount(int value) {
        
        hitCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hit_count = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHitCount() {
        
        hitCount_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 12;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 12;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryBulletHitNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryBulletHitNotify)
    private static final emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify();
    }

    public static emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryBulletHitNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryBulletHitNotify>() {
      @java.lang.Override
      public GalleryBulletHitNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GalleryBulletHitNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GalleryBulletHitNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryBulletHitNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GalleryBulletHitNotifyOuterClass.GalleryBulletHitNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryBulletHitNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryBulletHitNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GalleryBulletHitNotify.proto\"?\n\026Galler" +
      "yBulletHitNotify\022\021\n\thit_count\030\016 \001(\r\022\022\n\ng" +
      "allery_id\030\014 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GalleryBulletHitNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryBulletHitNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryBulletHitNotify_descriptor,
        new java.lang.String[] { "HitCount", "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

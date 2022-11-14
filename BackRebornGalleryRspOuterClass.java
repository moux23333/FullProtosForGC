// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BackRebornGalleryRsp.proto

package emu.grasscutter.net.proto;

public final class BackRebornGalleryRspOuterClass {
  private BackRebornGalleryRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BackRebornGalleryRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BackRebornGalleryRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 9;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 5527
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code BackRebornGalleryRsp}
   */
  public static final class BackRebornGalleryRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BackRebornGalleryRsp)
      BackRebornGalleryRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BackRebornGalleryRsp.newBuilder() to construct.
    private BackRebornGalleryRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BackRebornGalleryRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BackRebornGalleryRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BackRebornGalleryRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 72: {

              galleryId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.internal_static_BackRebornGalleryRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.internal_static_BackRebornGalleryRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp.class, emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 9;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 9;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(9, galleryId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, galleryId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp other = (emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp prototype) {
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
     * CmdId: 5527
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code BackRebornGalleryRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BackRebornGalleryRsp)
        emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.internal_static_BackRebornGalleryRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.internal_static_BackRebornGalleryRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp.class, emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp.newBuilder()
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
        galleryId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.internal_static_BackRebornGalleryRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp build() {
        emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp buildPartial() {
        emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp result = new emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp(this);
        result.galleryId_ = galleryId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp) {
          return mergeFrom((emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp other) {
        if (other == emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 9;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 9;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BackRebornGalleryRsp)
    }

    // @@protoc_insertion_point(class_scope:BackRebornGalleryRsp)
    private static final emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp();
    }

    public static emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BackRebornGalleryRsp>
        PARSER = new com.google.protobuf.AbstractParser<BackRebornGalleryRsp>() {
      @java.lang.Override
      public BackRebornGalleryRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BackRebornGalleryRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BackRebornGalleryRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BackRebornGalleryRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BackRebornGalleryRspOuterClass.BackRebornGalleryRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BackRebornGalleryRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BackRebornGalleryRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032BackRebornGalleryRsp.proto\";\n\024BackRebo" +
      "rnGalleryRsp\022\022\n\ngallery_id\030\t \001(\r\022\017\n\007retc" +
      "ode\030\005 \001(\005B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BackRebornGalleryRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BackRebornGalleryRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BackRebornGalleryRsp_descriptor,
        new java.lang.String[] { "GalleryId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

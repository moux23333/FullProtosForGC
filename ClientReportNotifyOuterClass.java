// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientReportNotify.proto

package emu.grasscutter.net.proto;

public final class ClientReportNotifyOuterClass {
  private ClientReportNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientReportNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientReportNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
     * @return The unk3300JHJDJEBAFCM.
     */
    java.lang.String getUnk3300JHJDJEBAFCM();
    /**
     * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
     * @return The bytes for unk3300JHJDJEBAFCM.
     */
    com.google.protobuf.ByteString
        getUnk3300JHJDJEBAFCMBytes();

    /**
     * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
     * @return The unk3300AMLEAJLJDFO.
     */
    java.lang.String getUnk3300AMLEAJLJDFO();
    /**
     * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
     * @return The bytes for unk3300AMLEAJLJDFO.
     */
    com.google.protobuf.ByteString
        getUnk3300AMLEAJLJDFOBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 25;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ClientReportNotify}
   */
  public static final class ClientReportNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientReportNotify)
      ClientReportNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientReportNotify.newBuilder() to construct.
    private ClientReportNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientReportNotify() {
      unk3300JHJDJEBAFCM_ = "";
      unk3300AMLEAJLJDFO_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientReportNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientReportNotify(
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
            case 82: {
              java.lang.String s = input.readStringRequireUtf8();

              unk3300AMLEAJLJDFO_ = s;
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              unk3300JHJDJEBAFCM_ = s;
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
      return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.class, emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.Builder.class);
    }

    public static final int UNK3300_JHJDJEBAFCM_FIELD_NUMBER = 15;
    private volatile java.lang.Object unk3300JHJDJEBAFCM_;
    /**
     * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
     * @return The unk3300JHJDJEBAFCM.
     */
    @java.lang.Override
    public java.lang.String getUnk3300JHJDJEBAFCM() {
      java.lang.Object ref = unk3300JHJDJEBAFCM_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3300JHJDJEBAFCM_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
     * @return The bytes for unk3300JHJDJEBAFCM.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3300JHJDJEBAFCMBytes() {
      java.lang.Object ref = unk3300JHJDJEBAFCM_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3300JHJDJEBAFCM_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNK3300_AMLEAJLJDFO_FIELD_NUMBER = 10;
    private volatile java.lang.Object unk3300AMLEAJLJDFO_;
    /**
     * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
     * @return The unk3300AMLEAJLJDFO.
     */
    @java.lang.Override
    public java.lang.String getUnk3300AMLEAJLJDFO() {
      java.lang.Object ref = unk3300AMLEAJLJDFO_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3300AMLEAJLJDFO_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
     * @return The bytes for unk3300AMLEAJLJDFO.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3300AMLEAJLJDFOBytes() {
      java.lang.Object ref = unk3300AMLEAJLJDFO_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3300AMLEAJLJDFO_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300AMLEAJLJDFO_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, unk3300AMLEAJLJDFO_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300JHJDJEBAFCM_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, unk3300JHJDJEBAFCM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300AMLEAJLJDFO_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, unk3300AMLEAJLJDFO_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300JHJDJEBAFCM_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, unk3300JHJDJEBAFCM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify other = (emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify) obj;

      if (!getUnk3300JHJDJEBAFCM()
          .equals(other.getUnk3300JHJDJEBAFCM())) return false;
      if (!getUnk3300AMLEAJLJDFO()
          .equals(other.getUnk3300AMLEAJLJDFO())) return false;
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
      hash = (37 * hash) + UNK3300_JHJDJEBAFCM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JHJDJEBAFCM().hashCode();
      hash = (37 * hash) + UNK3300_AMLEAJLJDFO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300AMLEAJLJDFO().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 25;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ClientReportNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientReportNotify)
        emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.class, emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.newBuilder()
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
        unk3300JHJDJEBAFCM_ = "";

        unk3300AMLEAJLJDFO_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.internal_static_ClientReportNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify build() {
        emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify buildPartial() {
        emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify result = new emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify(this);
        result.unk3300JHJDJEBAFCM_ = unk3300JHJDJEBAFCM_;
        result.unk3300AMLEAJLJDFO_ = unk3300AMLEAJLJDFO_;
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
        if (other instanceof emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify other) {
        if (other == emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify.getDefaultInstance()) return this;
        if (!other.getUnk3300JHJDJEBAFCM().isEmpty()) {
          unk3300JHJDJEBAFCM_ = other.unk3300JHJDJEBAFCM_;
          onChanged();
        }
        if (!other.getUnk3300AMLEAJLJDFO().isEmpty()) {
          unk3300AMLEAJLJDFO_ = other.unk3300AMLEAJLJDFO_;
          onChanged();
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
        emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object unk3300JHJDJEBAFCM_ = "";
      /**
       * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
       * @return The unk3300JHJDJEBAFCM.
       */
      public java.lang.String getUnk3300JHJDJEBAFCM() {
        java.lang.Object ref = unk3300JHJDJEBAFCM_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3300JHJDJEBAFCM_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
       * @return The bytes for unk3300JHJDJEBAFCM.
       */
      public com.google.protobuf.ByteString
          getUnk3300JHJDJEBAFCMBytes() {
        java.lang.Object ref = unk3300JHJDJEBAFCM_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3300JHJDJEBAFCM_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
       * @param value The unk3300JHJDJEBAFCM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JHJDJEBAFCM(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3300JHJDJEBAFCM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JHJDJEBAFCM() {
        
        unk3300JHJDJEBAFCM_ = getDefaultInstance().getUnk3300JHJDJEBAFCM();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_JHJDJEBAFCM = 15;</code>
       * @param value The bytes for unk3300JHJDJEBAFCM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JHJDJEBAFCMBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3300JHJDJEBAFCM_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object unk3300AMLEAJLJDFO_ = "";
      /**
       * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
       * @return The unk3300AMLEAJLJDFO.
       */
      public java.lang.String getUnk3300AMLEAJLJDFO() {
        java.lang.Object ref = unk3300AMLEAJLJDFO_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3300AMLEAJLJDFO_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
       * @return The bytes for unk3300AMLEAJLJDFO.
       */
      public com.google.protobuf.ByteString
          getUnk3300AMLEAJLJDFOBytes() {
        java.lang.Object ref = unk3300AMLEAJLJDFO_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3300AMLEAJLJDFO_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
       * @param value The unk3300AMLEAJLJDFO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AMLEAJLJDFO(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3300AMLEAJLJDFO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AMLEAJLJDFO() {
        
        unk3300AMLEAJLJDFO_ = getDefaultInstance().getUnk3300AMLEAJLJDFO();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_AMLEAJLJDFO = 10;</code>
       * @param value The bytes for unk3300AMLEAJLJDFO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AMLEAJLJDFOBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3300AMLEAJLJDFO_ = value;
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


      // @@protoc_insertion_point(builder_scope:ClientReportNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientReportNotify)
    private static final emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify();
    }

    public static emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientReportNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientReportNotify>() {
      @java.lang.Override
      public ClientReportNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientReportNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientReportNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientReportNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientReportNotifyOuterClass.ClientReportNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientReportNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientReportNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ClientReportNotify.proto\"N\n\022ClientRepo" +
      "rtNotify\022\033\n\023Unk3300_JHJDJEBAFCM\030\017 \001(\t\022\033\n" +
      "\023Unk3300_AMLEAJLJDFO\030\n \001(\tB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientReportNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientReportNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientReportNotify_descriptor,
        new java.lang.String[] { "Unk3300JHJDJEBAFCM", "Unk3300AMLEAJLJDFO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

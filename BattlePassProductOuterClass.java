// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassProduct.proto

package emu.grasscutter.net.proto;

public final class BattlePassProductOuterClass {
  private BattlePassProductOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassProductOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassProduct)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string Unk3300_AOMGCJOGGED = 12;</code>
     * @return The unk3300AOMGCJOGGED.
     */
    java.lang.String getUnk3300AOMGCJOGGED();
    /**
     * <code>string Unk3300_AOMGCJOGGED = 12;</code>
     * @return The bytes for unk3300AOMGCJOGGED.
     */
    com.google.protobuf.ByteString
        getUnk3300AOMGCJOGGEDBytes();

    /**
     * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
     * @return The unk3300NHOAGMGNEIM.
     */
    java.lang.String getUnk3300NHOAGMGNEIM();
    /**
     * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
     * @return The bytes for unk3300NHOAGMGNEIM.
     */
    com.google.protobuf.ByteString
        getUnk3300NHOAGMGNEIMBytes();

    /**
     * <code>string Unk3300_NIEBADLADMK = 7;</code>
     * @return The unk3300NIEBADLADMK.
     */
    java.lang.String getUnk3300NIEBADLADMK();
    /**
     * <code>string Unk3300_NIEBADLADMK = 7;</code>
     * @return The bytes for unk3300NIEBADLADMK.
     */
    com.google.protobuf.ByteString
        getUnk3300NIEBADLADMKBytes();
  }
  /**
   * Protobuf type {@code BattlePassProduct}
   */
  public static final class BattlePassProduct extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassProduct)
      BattlePassProductOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassProduct.newBuilder() to construct.
    private BattlePassProduct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassProduct() {
      unk3300AOMGCJOGGED_ = "";
      unk3300NHOAGMGNEIM_ = "";
      unk3300NIEBADLADMK_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassProduct();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BattlePassProduct(
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
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              unk3300NIEBADLADMK_ = s;
              break;
            }
            case 74: {
              java.lang.String s = input.readStringRequireUtf8();

              unk3300NHOAGMGNEIM_ = s;
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              unk3300AOMGCJOGGED_ = s;
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
      return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.class, emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.Builder.class);
    }

    public static final int UNK3300_AOMGCJOGGED_FIELD_NUMBER = 12;
    private volatile java.lang.Object unk3300AOMGCJOGGED_;
    /**
     * <code>string Unk3300_AOMGCJOGGED = 12;</code>
     * @return The unk3300AOMGCJOGGED.
     */
    @java.lang.Override
    public java.lang.String getUnk3300AOMGCJOGGED() {
      java.lang.Object ref = unk3300AOMGCJOGGED_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3300AOMGCJOGGED_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3300_AOMGCJOGGED = 12;</code>
     * @return The bytes for unk3300AOMGCJOGGED.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3300AOMGCJOGGEDBytes() {
      java.lang.Object ref = unk3300AOMGCJOGGED_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3300AOMGCJOGGED_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNK3300_NHOAGMGNEIM_FIELD_NUMBER = 9;
    private volatile java.lang.Object unk3300NHOAGMGNEIM_;
    /**
     * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
     * @return The unk3300NHOAGMGNEIM.
     */
    @java.lang.Override
    public java.lang.String getUnk3300NHOAGMGNEIM() {
      java.lang.Object ref = unk3300NHOAGMGNEIM_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3300NHOAGMGNEIM_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
     * @return The bytes for unk3300NHOAGMGNEIM.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3300NHOAGMGNEIMBytes() {
      java.lang.Object ref = unk3300NHOAGMGNEIM_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3300NHOAGMGNEIM_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNK3300_NIEBADLADMK_FIELD_NUMBER = 7;
    private volatile java.lang.Object unk3300NIEBADLADMK_;
    /**
     * <code>string Unk3300_NIEBADLADMK = 7;</code>
     * @return The unk3300NIEBADLADMK.
     */
    @java.lang.Override
    public java.lang.String getUnk3300NIEBADLADMK() {
      java.lang.Object ref = unk3300NIEBADLADMK_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3300NIEBADLADMK_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3300_NIEBADLADMK = 7;</code>
     * @return The bytes for unk3300NIEBADLADMK.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3300NIEBADLADMKBytes() {
      java.lang.Object ref = unk3300NIEBADLADMK_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3300NIEBADLADMK_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300NIEBADLADMK_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, unk3300NIEBADLADMK_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300NHOAGMGNEIM_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, unk3300NHOAGMGNEIM_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300AOMGCJOGGED_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, unk3300AOMGCJOGGED_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300NIEBADLADMK_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, unk3300NIEBADLADMK_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300NHOAGMGNEIM_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, unk3300NHOAGMGNEIM_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300AOMGCJOGGED_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, unk3300AOMGCJOGGED_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct other = (emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct) obj;

      if (!getUnk3300AOMGCJOGGED()
          .equals(other.getUnk3300AOMGCJOGGED())) return false;
      if (!getUnk3300NHOAGMGNEIM()
          .equals(other.getUnk3300NHOAGMGNEIM())) return false;
      if (!getUnk3300NIEBADLADMK()
          .equals(other.getUnk3300NIEBADLADMK())) return false;
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
      hash = (37 * hash) + UNK3300_AOMGCJOGGED_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300AOMGCJOGGED().hashCode();
      hash = (37 * hash) + UNK3300_NHOAGMGNEIM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NHOAGMGNEIM().hashCode();
      hash = (37 * hash) + UNK3300_NIEBADLADMK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NIEBADLADMK().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct prototype) {
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
     * Protobuf type {@code BattlePassProduct}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassProduct)
        emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProductOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.class, emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.newBuilder()
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
        unk3300AOMGCJOGGED_ = "";

        unk3300NHOAGMGNEIM_ = "";

        unk3300NIEBADLADMK_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassProductOuterClass.internal_static_BattlePassProduct_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct build() {
        emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct buildPartial() {
        emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct result = new emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct(this);
        result.unk3300AOMGCJOGGED_ = unk3300AOMGCJOGGED_;
        result.unk3300NHOAGMGNEIM_ = unk3300NHOAGMGNEIM_;
        result.unk3300NIEBADLADMK_ = unk3300NIEBADLADMK_;
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
        if (other instanceof emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct other) {
        if (other == emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct.getDefaultInstance()) return this;
        if (!other.getUnk3300AOMGCJOGGED().isEmpty()) {
          unk3300AOMGCJOGGED_ = other.unk3300AOMGCJOGGED_;
          onChanged();
        }
        if (!other.getUnk3300NHOAGMGNEIM().isEmpty()) {
          unk3300NHOAGMGNEIM_ = other.unk3300NHOAGMGNEIM_;
          onChanged();
        }
        if (!other.getUnk3300NIEBADLADMK().isEmpty()) {
          unk3300NIEBADLADMK_ = other.unk3300NIEBADLADMK_;
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
        emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object unk3300AOMGCJOGGED_ = "";
      /**
       * <code>string Unk3300_AOMGCJOGGED = 12;</code>
       * @return The unk3300AOMGCJOGGED.
       */
      public java.lang.String getUnk3300AOMGCJOGGED() {
        java.lang.Object ref = unk3300AOMGCJOGGED_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3300AOMGCJOGGED_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3300_AOMGCJOGGED = 12;</code>
       * @return The bytes for unk3300AOMGCJOGGED.
       */
      public com.google.protobuf.ByteString
          getUnk3300AOMGCJOGGEDBytes() {
        java.lang.Object ref = unk3300AOMGCJOGGED_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3300AOMGCJOGGED_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3300_AOMGCJOGGED = 12;</code>
       * @param value The unk3300AOMGCJOGGED to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AOMGCJOGGED(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3300AOMGCJOGGED_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_AOMGCJOGGED = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AOMGCJOGGED() {
        
        unk3300AOMGCJOGGED_ = getDefaultInstance().getUnk3300AOMGCJOGGED();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_AOMGCJOGGED = 12;</code>
       * @param value The bytes for unk3300AOMGCJOGGED to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AOMGCJOGGEDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3300AOMGCJOGGED_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object unk3300NHOAGMGNEIM_ = "";
      /**
       * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
       * @return The unk3300NHOAGMGNEIM.
       */
      public java.lang.String getUnk3300NHOAGMGNEIM() {
        java.lang.Object ref = unk3300NHOAGMGNEIM_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3300NHOAGMGNEIM_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
       * @return The bytes for unk3300NHOAGMGNEIM.
       */
      public com.google.protobuf.ByteString
          getUnk3300NHOAGMGNEIMBytes() {
        java.lang.Object ref = unk3300NHOAGMGNEIM_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3300NHOAGMGNEIM_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
       * @param value The unk3300NHOAGMGNEIM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NHOAGMGNEIM(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3300NHOAGMGNEIM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NHOAGMGNEIM() {
        
        unk3300NHOAGMGNEIM_ = getDefaultInstance().getUnk3300NHOAGMGNEIM();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_NHOAGMGNEIM = 9;</code>
       * @param value The bytes for unk3300NHOAGMGNEIM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NHOAGMGNEIMBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3300NHOAGMGNEIM_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object unk3300NIEBADLADMK_ = "";
      /**
       * <code>string Unk3300_NIEBADLADMK = 7;</code>
       * @return The unk3300NIEBADLADMK.
       */
      public java.lang.String getUnk3300NIEBADLADMK() {
        java.lang.Object ref = unk3300NIEBADLADMK_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3300NIEBADLADMK_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3300_NIEBADLADMK = 7;</code>
       * @return The bytes for unk3300NIEBADLADMK.
       */
      public com.google.protobuf.ByteString
          getUnk3300NIEBADLADMKBytes() {
        java.lang.Object ref = unk3300NIEBADLADMK_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3300NIEBADLADMK_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3300_NIEBADLADMK = 7;</code>
       * @param value The unk3300NIEBADLADMK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NIEBADLADMK(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3300NIEBADLADMK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_NIEBADLADMK = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NIEBADLADMK() {
        
        unk3300NIEBADLADMK_ = getDefaultInstance().getUnk3300NIEBADLADMK();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_NIEBADLADMK = 7;</code>
       * @param value The bytes for unk3300NIEBADLADMK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NIEBADLADMKBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3300NIEBADLADMK_ = value;
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


      // @@protoc_insertion_point(builder_scope:BattlePassProduct)
    }

    // @@protoc_insertion_point(class_scope:BattlePassProduct)
    private static final emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct();
    }

    public static emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassProduct>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassProduct>() {
      @java.lang.Override
      public BattlePassProduct parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattlePassProduct(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BattlePassProduct> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassProduct> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassProductOuterClass.BattlePassProduct getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassProduct_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BattlePassProduct.proto\"j\n\021BattlePassP" +
      "roduct\022\033\n\023Unk3300_AOMGCJOGGED\030\014 \001(\t\022\033\n\023U" +
      "nk3300_NHOAGMGNEIM\030\t \001(\t\022\033\n\023Unk3300_NIEB" +
      "ADLADMK\030\007 \001(\tB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BattlePassProduct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassProduct_descriptor,
        new java.lang.String[] { "Unk3300AOMGCJOGGED", "Unk3300NHOAGMGNEIM", "Unk3300NIEBADLADMK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_IOBHBFFAONO.proto

package emu.grasscutter.net.proto;

public final class Unk2800IOBHBFFAONO {
  private Unk2800IOBHBFFAONO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_IOBHBFFAONOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_IOBHBFFAONO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 param1 = 7;</code>
     * @return The param1.
     */
    int getParam1();

    /**
     * <code>uint32 param2 = 2;</code>
     * @return The param2.
     */
    int getParam2();

    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason();

    /**
     * <code>uint32 param3 = 6;</code>
     * @return The param3.
     */
    int getParam3();

    /**
     * <code>uint32 Unk2800_NGGPIECNHJA = 12;</code>
     * @return The unk2800NGGPIECNHJA.
     */
    int getUnk2800NGGPIECNHJA();

    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * Protobuf type {@code Unk2800_IOBHBFFAONO}
   */
  public static final class Unk2800_IOBHBFFAONO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_IOBHBFFAONO)
      Unk2800_IOBHBFFAONOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_IOBHBFFAONO.newBuilder() to construct.
    private Unk2800_IOBHBFFAONO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_IOBHBFFAONO() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_IOBHBFFAONO();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2800_IOBHBFFAONO(
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
            case 8: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 16: {

              param2_ = input.readUInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 48: {

              param3_ = input.readUInt32();
              break;
            }
            case 56: {

              param1_ = input.readUInt32();
              break;
            }
            case 96: {

              unk2800NGGPIECNHJA_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.internal_static_Unk2800_IOBHBFFAONO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.internal_static_Unk2800_IOBHBFFAONO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO.class, emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO.Builder.class);
    }

    public static final int PARAM1_FIELD_NUMBER = 7;
    private int param1_;
    /**
     * <code>uint32 param1 = 7;</code>
     * @return The param1.
     */
    @java.lang.Override
    public int getParam1() {
      return param1_;
    }

    public static final int PARAM2_FIELD_NUMBER = 2;
    private int param2_;
    /**
     * <code>uint32 param2 = 2;</code>
     * @return The param2.
     */
    @java.lang.Override
    public int getParam2() {
      return param2_;
    }

    public static final int REASON_FIELD_NUMBER = 3;
    private int reason_;
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP result = emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.UNRECOGNIZED : result;
    }

    public static final int PARAM3_FIELD_NUMBER = 6;
    private int param3_;
    /**
     * <code>uint32 param3 = 6;</code>
     * @return The param3.
     */
    @java.lang.Override
    public int getParam3() {
      return param3_;
    }

    public static final int UNK2800_NGGPIECNHJA_FIELD_NUMBER = 12;
    private int unk2800NGGPIECNHJA_;
    /**
     * <code>uint32 Unk2800_NGGPIECNHJA = 12;</code>
     * @return The unk2800NGGPIECNHJA.
     */
    @java.lang.Override
    public int getUnk2800NGGPIECNHJA() {
      return unk2800NGGPIECNHJA_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 1;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 1;</code>
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
        output.writeUInt32(1, galleryId_);
      }
      if (param2_ != 0) {
        output.writeUInt32(2, param2_);
      }
      if (reason_ != emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.Unk2700_MOFABPNGIKP_Unk2700_DGJFKKIBLCJ.getNumber()) {
        output.writeEnum(3, reason_);
      }
      if (param3_ != 0) {
        output.writeUInt32(6, param3_);
      }
      if (param1_ != 0) {
        output.writeUInt32(7, param1_);
      }
      if (unk2800NGGPIECNHJA_ != 0) {
        output.writeUInt32(12, unk2800NGGPIECNHJA_);
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
          .computeUInt32Size(1, galleryId_);
      }
      if (param2_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, param2_);
      }
      if (reason_ != emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.Unk2700_MOFABPNGIKP_Unk2700_DGJFKKIBLCJ.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, reason_);
      }
      if (param3_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, param3_);
      }
      if (param1_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, param1_);
      }
      if (unk2800NGGPIECNHJA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk2800NGGPIECNHJA_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO other = (emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO) obj;

      if (getParam1()
          != other.getParam1()) return false;
      if (getParam2()
          != other.getParam2()) return false;
      if (reason_ != other.reason_) return false;
      if (getParam3()
          != other.getParam3()) return false;
      if (getUnk2800NGGPIECNHJA()
          != other.getUnk2800NGGPIECNHJA()) return false;
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
      hash = (37 * hash) + PARAM1_FIELD_NUMBER;
      hash = (53 * hash) + getParam1();
      hash = (37 * hash) + PARAM2_FIELD_NUMBER;
      hash = (53 * hash) + getParam2();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + PARAM3_FIELD_NUMBER;
      hash = (53 * hash) + getParam3();
      hash = (37 * hash) + UNK2800_NGGPIECNHJA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800NGGPIECNHJA();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO prototype) {
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
     * Protobuf type {@code Unk2800_IOBHBFFAONO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_IOBHBFFAONO)
        emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.internal_static_Unk2800_IOBHBFFAONO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.internal_static_Unk2800_IOBHBFFAONO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO.class, emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO.newBuilder()
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
        param1_ = 0;

        param2_ = 0;

        reason_ = 0;

        param3_ = 0;

        unk2800NGGPIECNHJA_ = 0;

        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.internal_static_Unk2800_IOBHBFFAONO_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO build() {
        emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO buildPartial() {
        emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO result = new emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO(this);
        result.param1_ = param1_;
        result.param2_ = param2_;
        result.reason_ = reason_;
        result.param3_ = param3_;
        result.unk2800NGGPIECNHJA_ = unk2800NGGPIECNHJA_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO other) {
        if (other == emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO.getDefaultInstance()) return this;
        if (other.getParam1() != 0) {
          setParam1(other.getParam1());
        }
        if (other.getParam2() != 0) {
          setParam2(other.getParam2());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getParam3() != 0) {
          setParam3(other.getParam3());
        }
        if (other.getUnk2800NGGPIECNHJA() != 0) {
          setUnk2800NGGPIECNHJA(other.getUnk2800NGGPIECNHJA());
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
        emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int param1_ ;
      /**
       * <code>uint32 param1 = 7;</code>
       * @return The param1.
       */
      @java.lang.Override
      public int getParam1() {
        return param1_;
      }
      /**
       * <code>uint32 param1 = 7;</code>
       * @param value The param1 to set.
       * @return This builder for chaining.
       */
      public Builder setParam1(int value) {
        
        param1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param1 = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam1() {
        
        param1_ = 0;
        onChanged();
        return this;
      }

      private int param2_ ;
      /**
       * <code>uint32 param2 = 2;</code>
       * @return The param2.
       */
      @java.lang.Override
      public int getParam2() {
        return param2_;
      }
      /**
       * <code>uint32 param2 = 2;</code>
       * @param value The param2 to set.
       * @return This builder for chaining.
       */
      public Builder setParam2(int value) {
        
        param2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param2 = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam2() {
        
        param2_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP result = emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int param3_ ;
      /**
       * <code>uint32 param3 = 6;</code>
       * @return The param3.
       */
      @java.lang.Override
      public int getParam3() {
        return param3_;
      }
      /**
       * <code>uint32 param3 = 6;</code>
       * @param value The param3 to set.
       * @return This builder for chaining.
       */
      public Builder setParam3(int value) {
        
        param3_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param3 = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam3() {
        
        param3_ = 0;
        onChanged();
        return this;
      }

      private int unk2800NGGPIECNHJA_ ;
      /**
       * <code>uint32 Unk2800_NGGPIECNHJA = 12;</code>
       * @return The unk2800NGGPIECNHJA.
       */
      @java.lang.Override
      public int getUnk2800NGGPIECNHJA() {
        return unk2800NGGPIECNHJA_;
      }
      /**
       * <code>uint32 Unk2800_NGGPIECNHJA = 12;</code>
       * @param value The unk2800NGGPIECNHJA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800NGGPIECNHJA(int value) {
        
        unk2800NGGPIECNHJA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_NGGPIECNHJA = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800NGGPIECNHJA() {
        
        unk2800NGGPIECNHJA_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:Unk2800_IOBHBFFAONO)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_IOBHBFFAONO)
    private static final emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO();
    }

    public static emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_IOBHBFFAONO>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_IOBHBFFAONO>() {
      @java.lang.Override
      public Unk2800_IOBHBFFAONO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2800_IOBHBFFAONO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2800_IOBHBFFAONO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_IOBHBFFAONO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2800IOBHBFFAONO.Unk2800_IOBHBFFAONO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_IOBHBFFAONO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_IOBHBFFAONO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_IOBHBFFAONO.proto\032\031Unk2700_MOF" +
      "ABPNGIKP.proto\"\234\001\n\023Unk2800_IOBHBFFAONO\022\016" +
      "\n\006param1\030\007 \001(\r\022\016\n\006param2\030\002 \001(\r\022$\n\006reason" +
      "\030\003 \001(\0162\024.Unk2700_MOFABPNGIKP\022\016\n\006param3\030\006" +
      " \001(\r\022\033\n\023Unk2800_NGGPIECNHJA\030\014 \001(\r\022\022\n\ngal" +
      "lery_id\030\001 \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.getDescriptor(),
        });
    internal_static_Unk2800_IOBHBFFAONO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_IOBHBFFAONO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_IOBHBFFAONO_descriptor,
        new java.lang.String[] { "Param1", "Param2", "Reason", "Param3", "Unk2800NGGPIECNHJA", "GalleryId", });
    emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

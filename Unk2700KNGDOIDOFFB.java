// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_KNGDOIDOFFB.proto

package emu.grasscutter.net.proto;

public final class Unk2700KNGDOIDOFFB {
  private Unk2700KNGDOIDOFFB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_KNGDOIDOFFBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_KNGDOIDOFFB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_HLEMPIKMBMP = 6;</code>
     * @return The unk2700HLEMPIKMBMP.
     */
    int getUnk2700HLEMPIKMBMP();

    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason();

    /**
     * <code>uint32 Unk2700_OMCCFBBDJMI = 1;</code>
     * @return The unk2700OMCCFBBDJMI.
     */
    int getUnk2700OMCCFBBDJMI();
  }
  /**
   * Protobuf type {@code Unk2700_KNGDOIDOFFB}
   */
  public static final class Unk2700_KNGDOIDOFFB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_KNGDOIDOFFB)
      Unk2700_KNGDOIDOFFBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_KNGDOIDOFFB.newBuilder() to construct.
    private Unk2700_KNGDOIDOFFB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_KNGDOIDOFFB() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_KNGDOIDOFFB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_KNGDOIDOFFB(
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

              unk2700OMCCFBBDJMI_ = input.readUInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 48: {

              unk2700HLEMPIKMBMP_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.internal_static_Unk2700_KNGDOIDOFFB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.internal_static_Unk2700_KNGDOIDOFFB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.class, emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.Builder.class);
    }

    public static final int UNK2700_HLEMPIKMBMP_FIELD_NUMBER = 6;
    private int unk2700HLEMPIKMBMP_;
    /**
     * <code>uint32 Unk2700_HLEMPIKMBMP = 6;</code>
     * @return The unk2700HLEMPIKMBMP.
     */
    @java.lang.Override
    public int getUnk2700HLEMPIKMBMP() {
      return unk2700HLEMPIKMBMP_;
    }

    public static final int REASON_FIELD_NUMBER = 4;
    private int reason_;
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP result = emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.UNRECOGNIZED : result;
    }

    public static final int UNK2700_OMCCFBBDJMI_FIELD_NUMBER = 1;
    private int unk2700OMCCFBBDJMI_;
    /**
     * <code>uint32 Unk2700_OMCCFBBDJMI = 1;</code>
     * @return The unk2700OMCCFBBDJMI.
     */
    @java.lang.Override
    public int getUnk2700OMCCFBBDJMI() {
      return unk2700OMCCFBBDJMI_;
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
      if (unk2700OMCCFBBDJMI_ != 0) {
        output.writeUInt32(1, unk2700OMCCFBBDJMI_);
      }
      if (reason_ != emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.Unk2700_MOFABPNGIKP_Unk2700_DGJFKKIBLCJ.getNumber()) {
        output.writeEnum(4, reason_);
      }
      if (unk2700HLEMPIKMBMP_ != 0) {
        output.writeUInt32(6, unk2700HLEMPIKMBMP_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700OMCCFBBDJMI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk2700OMCCFBBDJMI_);
      }
      if (reason_ != emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.Unk2700_MOFABPNGIKP_Unk2700_DGJFKKIBLCJ.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, reason_);
      }
      if (unk2700HLEMPIKMBMP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk2700HLEMPIKMBMP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB other = (emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB) obj;

      if (getUnk2700HLEMPIKMBMP()
          != other.getUnk2700HLEMPIKMBMP()) return false;
      if (reason_ != other.reason_) return false;
      if (getUnk2700OMCCFBBDJMI()
          != other.getUnk2700OMCCFBBDJMI()) return false;
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
      hash = (37 * hash) + UNK2700_HLEMPIKMBMP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700HLEMPIKMBMP();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + UNK2700_OMCCFBBDJMI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700OMCCFBBDJMI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB prototype) {
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
     * Protobuf type {@code Unk2700_KNGDOIDOFFB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_KNGDOIDOFFB)
        emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.internal_static_Unk2700_KNGDOIDOFFB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.internal_static_Unk2700_KNGDOIDOFFB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.class, emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.newBuilder()
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
        unk2700HLEMPIKMBMP_ = 0;

        reason_ = 0;

        unk2700OMCCFBBDJMI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.internal_static_Unk2700_KNGDOIDOFFB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB build() {
        emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB buildPartial() {
        emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB result = new emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB(this);
        result.unk2700HLEMPIKMBMP_ = unk2700HLEMPIKMBMP_;
        result.reason_ = reason_;
        result.unk2700OMCCFBBDJMI_ = unk2700OMCCFBBDJMI_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB other) {
        if (other == emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB.getDefaultInstance()) return this;
        if (other.getUnk2700HLEMPIKMBMP() != 0) {
          setUnk2700HLEMPIKMBMP(other.getUnk2700HLEMPIKMBMP());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getUnk2700OMCCFBBDJMI() != 0) {
          setUnk2700OMCCFBBDJMI(other.getUnk2700OMCCFBBDJMI());
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
        emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk2700HLEMPIKMBMP_ ;
      /**
       * <code>uint32 Unk2700_HLEMPIKMBMP = 6;</code>
       * @return The unk2700HLEMPIKMBMP.
       */
      @java.lang.Override
      public int getUnk2700HLEMPIKMBMP() {
        return unk2700HLEMPIKMBMP_;
      }
      /**
       * <code>uint32 Unk2700_HLEMPIKMBMP = 6;</code>
       * @param value The unk2700HLEMPIKMBMP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700HLEMPIKMBMP(int value) {
        
        unk2700HLEMPIKMBMP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_HLEMPIKMBMP = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700HLEMPIKMBMP() {
        
        unk2700HLEMPIKMBMP_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP result = emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
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
       * <code>.Unk2700_MOFABPNGIKP reason = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int unk2700OMCCFBBDJMI_ ;
      /**
       * <code>uint32 Unk2700_OMCCFBBDJMI = 1;</code>
       * @return The unk2700OMCCFBBDJMI.
       */
      @java.lang.Override
      public int getUnk2700OMCCFBBDJMI() {
        return unk2700OMCCFBBDJMI_;
      }
      /**
       * <code>uint32 Unk2700_OMCCFBBDJMI = 1;</code>
       * @param value The unk2700OMCCFBBDJMI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700OMCCFBBDJMI(int value) {
        
        unk2700OMCCFBBDJMI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_OMCCFBBDJMI = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700OMCCFBBDJMI() {
        
        unk2700OMCCFBBDJMI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_KNGDOIDOFFB)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_KNGDOIDOFFB)
    private static final emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB();
    }

    public static emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_KNGDOIDOFFB>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_KNGDOIDOFFB>() {
      @java.lang.Override
      public Unk2700_KNGDOIDOFFB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_KNGDOIDOFFB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_KNGDOIDOFFB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_KNGDOIDOFFB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700KNGDOIDOFFB.Unk2700_KNGDOIDOFFB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_KNGDOIDOFFB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_KNGDOIDOFFB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_KNGDOIDOFFB.proto\032\031Unk2700_MOF" +
      "ABPNGIKP.proto\"u\n\023Unk2700_KNGDOIDOFFB\022\033\n" +
      "\023Unk2700_HLEMPIKMBMP\030\006 \001(\r\022$\n\006reason\030\004 \001" +
      "(\0162\024.Unk2700_MOFABPNGIKP\022\033\n\023Unk2700_OMCC" +
      "FBBDJMI\030\001 \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.getDescriptor(),
        });
    internal_static_Unk2700_KNGDOIDOFFB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_KNGDOIDOFFB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_KNGDOIDOFFB_descriptor,
        new java.lang.String[] { "Unk2700HLEMPIKMBMP", "Reason", "Unk2700OMCCFBBDJMI", });
    emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
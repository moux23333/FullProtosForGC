// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterTrainingSettleInfo.proto

package emu.grasscutter.net.proto;

public final class FungusFighterTrainingSettleInfoOuterClass {
  private FungusFighterTrainingSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterTrainingSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterTrainingSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 used_time = 15;</code>
     * @return The usedTime.
     */
    int getUsedTime();

    /**
     * <code>.GalleryStopReason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GalleryStopReason reason = 3;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason();

    /**
     * <code>string transaction = 1;</code>
     * @return The transaction.
     */
    java.lang.String getTransaction();
    /**
     * <code>string transaction = 1;</code>
     * @return The bytes for transaction.
     */
    com.google.protobuf.ByteString
        getTransactionBytes();
  }
  /**
   * Protobuf type {@code FungusFighterTrainingSettleInfo}
   */
  public static final class FungusFighterTrainingSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterTrainingSettleInfo)
      FungusFighterTrainingSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterTrainingSettleInfo.newBuilder() to construct.
    private FungusFighterTrainingSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterTrainingSettleInfo() {
      reason_ = 0;
      transaction_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterTrainingSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusFighterTrainingSettleInfo(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              transaction_ = s;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 120: {

              usedTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.internal_static_FungusFighterTrainingSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.internal_static_FungusFighterTrainingSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo.class, emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo.Builder.class);
    }

    public static final int USED_TIME_FIELD_NUMBER = 15;
    private int usedTime_;
    /**
     * <code>uint32 used_time = 15;</code>
     * @return The usedTime.
     */
    @java.lang.Override
    public int getUsedTime() {
      return usedTime_;
    }

    public static final int REASON_FIELD_NUMBER = 3;
    private int reason_;
    /**
     * <code>.GalleryStopReason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GalleryStopReason reason = 3;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
    }

    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private volatile java.lang.Object transaction_;
    /**
     * <code>string transaction = 1;</code>
     * @return The transaction.
     */
    @java.lang.Override
    public java.lang.String getTransaction() {
      java.lang.Object ref = transaction_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transaction_ = s;
        return s;
      }
    }
    /**
     * <code>string transaction = 1;</code>
     * @return The bytes for transaction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTransactionBytes() {
      java.lang.Object ref = transaction_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transaction_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transaction_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, transaction_);
      }
      if (reason_ != emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        output.writeEnum(3, reason_);
      }
      if (usedTime_ != 0) {
        output.writeUInt32(15, usedTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transaction_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, transaction_);
      }
      if (reason_ != emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, reason_);
      }
      if (usedTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, usedTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo other = (emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo) obj;

      if (getUsedTime()
          != other.getUsedTime()) return false;
      if (reason_ != other.reason_) return false;
      if (!getTransaction()
          .equals(other.getTransaction())) return false;
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
      hash = (37 * hash) + USED_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUsedTime();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTransaction().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo prototype) {
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
     * Protobuf type {@code FungusFighterTrainingSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterTrainingSettleInfo)
        emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.internal_static_FungusFighterTrainingSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.internal_static_FungusFighterTrainingSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo.class, emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo.newBuilder()
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
        usedTime_ = 0;

        reason_ = 0;

        transaction_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.internal_static_FungusFighterTrainingSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo build() {
        emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo buildPartial() {
        emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo result = new emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo(this);
        result.usedTime_ = usedTime_;
        result.reason_ = reason_;
        result.transaction_ = transaction_;
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
        if (other instanceof emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo other) {
        if (other == emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo.getDefaultInstance()) return this;
        if (other.getUsedTime() != 0) {
          setUsedTime(other.getUsedTime());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (!other.getTransaction().isEmpty()) {
          transaction_ = other.transaction_;
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
        emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int usedTime_ ;
      /**
       * <code>uint32 used_time = 15;</code>
       * @return The usedTime.
       */
      @java.lang.Override
      public int getUsedTime() {
        return usedTime_;
      }
      /**
       * <code>uint32 used_time = 15;</code>
       * @param value The usedTime to set.
       * @return This builder for chaining.
       */
      public Builder setUsedTime(int value) {
        
        usedTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 used_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsedTime() {
        
        usedTime_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object transaction_ = "";
      /**
       * <code>string transaction = 1;</code>
       * @return The transaction.
       */
      public java.lang.String getTransaction() {
        java.lang.Object ref = transaction_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          transaction_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string transaction = 1;</code>
       * @return The bytes for transaction.
       */
      public com.google.protobuf.ByteString
          getTransactionBytes() {
        java.lang.Object ref = transaction_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          transaction_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string transaction = 1;</code>
       * @param value The transaction to set.
       * @return This builder for chaining.
       */
      public Builder setTransaction(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        transaction_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string transaction = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTransaction() {
        
        transaction_ = getDefaultInstance().getTransaction();
        onChanged();
        return this;
      }
      /**
       * <code>string transaction = 1;</code>
       * @param value The bytes for transaction to set.
       * @return This builder for chaining.
       */
      public Builder setTransactionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        transaction_ = value;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterTrainingSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterTrainingSettleInfo)
    private static final emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo();
    }

    public static emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterTrainingSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterTrainingSettleInfo>() {
      @java.lang.Override
      public FungusFighterTrainingSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusFighterTrainingSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusFighterTrainingSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterTrainingSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusFighterTrainingSettleInfoOuterClass.FungusFighterTrainingSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterTrainingSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterTrainingSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%FungusFighterTrainingSettleInfo.proto\032" +
      "\027GalleryStopReason.proto\"m\n\037FungusFighte" +
      "rTrainingSettleInfo\022\021\n\tused_time\030\017 \001(\r\022\"" +
      "\n\006reason\030\003 \001(\0162\022.GalleryStopReason\022\023\n\013tr" +
      "ansaction\030\001 \001(\tB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GalleryStopReasonOuterClass.getDescriptor(),
        });
    internal_static_FungusFighterTrainingSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterTrainingSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterTrainingSettleInfo_descriptor,
        new java.lang.String[] { "UsedTime", "Reason", "Transaction", });
    emu.grasscutter.net.proto.GalleryStopReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

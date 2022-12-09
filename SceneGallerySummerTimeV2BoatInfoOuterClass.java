// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGallerySummerTimeV2BoatInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGallerySummerTimeV2BoatInfoOuterClass {
  private SceneGallerySummerTimeV2BoatInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGallerySummerTimeV2BoatInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGallerySummerTimeV2BoatInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 used_time = 6;</code>
     * @return The usedTime.
     */
    int getUsedTime();

    /**
     * <code>uint32 param1 = 5;</code>
     * @return The param1.
     */
    int getParam1();

    /**
     * <code>uint32 param3 = 12;</code>
     * @return The param3.
     */
    int getParam3();

    /**
     * <code>uint32 param2 = 3;</code>
     * @return The param2.
     */
    int getParam2();
  }
  /**
   * Protobuf type {@code SceneGallerySummerTimeV2BoatInfo}
   */
  public static final class SceneGallerySummerTimeV2BoatInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGallerySummerTimeV2BoatInfo)
      SceneGallerySummerTimeV2BoatInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGallerySummerTimeV2BoatInfo.newBuilder() to construct.
    private SceneGallerySummerTimeV2BoatInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGallerySummerTimeV2BoatInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGallerySummerTimeV2BoatInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGallerySummerTimeV2BoatInfo(
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
            case 24: {

              param2_ = input.readUInt32();
              break;
            }
            case 40: {

              param1_ = input.readUInt32();
              break;
            }
            case 48: {

              usedTime_ = input.readUInt32();
              break;
            }
            case 96: {

              param3_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.internal_static_SceneGallerySummerTimeV2BoatInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.internal_static_SceneGallerySummerTimeV2BoatInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo.class, emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo.Builder.class);
    }

    public static final int USED_TIME_FIELD_NUMBER = 6;
    private int usedTime_;
    /**
     * <code>uint32 used_time = 6;</code>
     * @return The usedTime.
     */
    @java.lang.Override
    public int getUsedTime() {
      return usedTime_;
    }

    public static final int PARAM1_FIELD_NUMBER = 5;
    private int param1_;
    /**
     * <code>uint32 param1 = 5;</code>
     * @return The param1.
     */
    @java.lang.Override
    public int getParam1() {
      return param1_;
    }

    public static final int PARAM3_FIELD_NUMBER = 12;
    private int param3_;
    /**
     * <code>uint32 param3 = 12;</code>
     * @return The param3.
     */
    @java.lang.Override
    public int getParam3() {
      return param3_;
    }

    public static final int PARAM2_FIELD_NUMBER = 3;
    private int param2_;
    /**
     * <code>uint32 param2 = 3;</code>
     * @return The param2.
     */
    @java.lang.Override
    public int getParam2() {
      return param2_;
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
      if (param2_ != 0) {
        output.writeUInt32(3, param2_);
      }
      if (param1_ != 0) {
        output.writeUInt32(5, param1_);
      }
      if (usedTime_ != 0) {
        output.writeUInt32(6, usedTime_);
      }
      if (param3_ != 0) {
        output.writeUInt32(12, param3_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param2_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, param2_);
      }
      if (param1_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, param1_);
      }
      if (usedTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, usedTime_);
      }
      if (param3_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, param3_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo other = (emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo) obj;

      if (getUsedTime()
          != other.getUsedTime()) return false;
      if (getParam1()
          != other.getParam1()) return false;
      if (getParam3()
          != other.getParam3()) return false;
      if (getParam2()
          != other.getParam2()) return false;
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
      hash = (37 * hash) + PARAM1_FIELD_NUMBER;
      hash = (53 * hash) + getParam1();
      hash = (37 * hash) + PARAM3_FIELD_NUMBER;
      hash = (53 * hash) + getParam3();
      hash = (37 * hash) + PARAM2_FIELD_NUMBER;
      hash = (53 * hash) + getParam2();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo prototype) {
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
     * Protobuf type {@code SceneGallerySummerTimeV2BoatInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGallerySummerTimeV2BoatInfo)
        emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.internal_static_SceneGallerySummerTimeV2BoatInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.internal_static_SceneGallerySummerTimeV2BoatInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo.class, emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo.newBuilder()
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

        param1_ = 0;

        param3_ = 0;

        param2_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.internal_static_SceneGallerySummerTimeV2BoatInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo build() {
        emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo result = new emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo(this);
        result.usedTime_ = usedTime_;
        result.param1_ = param1_;
        result.param3_ = param3_;
        result.param2_ = param2_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo.getDefaultInstance()) return this;
        if (other.getUsedTime() != 0) {
          setUsedTime(other.getUsedTime());
        }
        if (other.getParam1() != 0) {
          setParam1(other.getParam1());
        }
        if (other.getParam3() != 0) {
          setParam3(other.getParam3());
        }
        if (other.getParam2() != 0) {
          setParam2(other.getParam2());
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
        emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo) e.getUnfinishedMessage();
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
       * <code>uint32 used_time = 6;</code>
       * @return The usedTime.
       */
      @java.lang.Override
      public int getUsedTime() {
        return usedTime_;
      }
      /**
       * <code>uint32 used_time = 6;</code>
       * @param value The usedTime to set.
       * @return This builder for chaining.
       */
      public Builder setUsedTime(int value) {
        
        usedTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 used_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsedTime() {
        
        usedTime_ = 0;
        onChanged();
        return this;
      }

      private int param1_ ;
      /**
       * <code>uint32 param1 = 5;</code>
       * @return The param1.
       */
      @java.lang.Override
      public int getParam1() {
        return param1_;
      }
      /**
       * <code>uint32 param1 = 5;</code>
       * @param value The param1 to set.
       * @return This builder for chaining.
       */
      public Builder setParam1(int value) {
        
        param1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param1 = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam1() {
        
        param1_ = 0;
        onChanged();
        return this;
      }

      private int param3_ ;
      /**
       * <code>uint32 param3 = 12;</code>
       * @return The param3.
       */
      @java.lang.Override
      public int getParam3() {
        return param3_;
      }
      /**
       * <code>uint32 param3 = 12;</code>
       * @param value The param3 to set.
       * @return This builder for chaining.
       */
      public Builder setParam3(int value) {
        
        param3_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param3 = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam3() {
        
        param3_ = 0;
        onChanged();
        return this;
      }

      private int param2_ ;
      /**
       * <code>uint32 param2 = 3;</code>
       * @return The param2.
       */
      @java.lang.Override
      public int getParam2() {
        return param2_;
      }
      /**
       * <code>uint32 param2 = 3;</code>
       * @param value The param2 to set.
       * @return This builder for chaining.
       */
      public Builder setParam2(int value) {
        
        param2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param2 = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam2() {
        
        param2_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGallerySummerTimeV2BoatInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGallerySummerTimeV2BoatInfo)
    private static final emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo();
    }

    public static emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGallerySummerTimeV2BoatInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGallerySummerTimeV2BoatInfo>() {
      @java.lang.Override
      public SceneGallerySummerTimeV2BoatInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGallerySummerTimeV2BoatInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGallerySummerTimeV2BoatInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGallerySummerTimeV2BoatInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGallerySummerTimeV2BoatInfoOuterClass.SceneGallerySummerTimeV2BoatInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGallerySummerTimeV2BoatInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGallerySummerTimeV2BoatInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&SceneGallerySummerTimeV2BoatInfo.proto" +
      "\"e\n SceneGallerySummerTimeV2BoatInfo\022\021\n\t" +
      "used_time\030\006 \001(\r\022\016\n\006param1\030\005 \001(\r\022\016\n\006param" +
      "3\030\014 \001(\r\022\016\n\006param2\030\003 \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGallerySummerTimeV2BoatInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGallerySummerTimeV2BoatInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGallerySummerTimeV2BoatInfo_descriptor,
        new java.lang.String[] { "UsedTime", "Param1", "Param3", "Param2", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

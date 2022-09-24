// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_IHOOCHJACEL.proto

package emu.grasscutter.net.proto;

public final class Unk2700IHOOCHJACEL {
  private Unk2700IHOOCHJACEL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_IHOOCHJACELOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_IHOOCHJACEL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO> 
        getUnk2700GMAEHKMDIGGList();
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO getUnk2700GMAEHKMDIGG(int index);
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    int getUnk2700GMAEHKMDIGGCount();
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder> 
        getUnk2700GMAEHKMDIGGOrBuilderList();
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder getUnk2700GMAEHKMDIGGOrBuilder(
        int index);

    /**
     * <code>uint32 difficulty_id = 10;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   * CmdId: 8325
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_IHOOCHJACEL}
   */
  public static final class Unk2700_IHOOCHJACEL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_IHOOCHJACEL)
      Unk2700_IHOOCHJACELOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_IHOOCHJACEL.newBuilder() to construct.
    private Unk2700_IHOOCHJACEL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_IHOOCHJACEL() {
      unk2700GMAEHKMDIGG_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_IHOOCHJACEL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_IHOOCHJACEL(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 56: {

              levelId_ = input.readUInt32();
              break;
            }
            case 80: {

              difficultyId_ = input.readUInt32();
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700GMAEHKMDIGG_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700GMAEHKMDIGG_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unk2700GMAEHKMDIGG_ = java.util.Collections.unmodifiableList(unk2700GMAEHKMDIGG_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.internal_static_Unk2700_IHOOCHJACEL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.internal_static_Unk2700_IHOOCHJACEL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL.class, emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 7;
    private int levelId_;
    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int UNK2700_GMAEHKMDIGG_FIELD_NUMBER = 13;
    private java.util.List<emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO> unk2700GMAEHKMDIGG_;
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO> getUnk2700GMAEHKMDIGGList() {
      return unk2700GMAEHKMDIGG_;
    }
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder> 
        getUnk2700GMAEHKMDIGGOrBuilderList() {
      return unk2700GMAEHKMDIGG_;
    }
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    @java.lang.Override
    public int getUnk2700GMAEHKMDIGGCount() {
      return unk2700GMAEHKMDIGG_.size();
    }
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO getUnk2700GMAEHKMDIGG(int index) {
      return unk2700GMAEHKMDIGG_.get(index);
    }
    /**
     * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder getUnk2700GMAEHKMDIGGOrBuilder(
        int index) {
      return unk2700GMAEHKMDIGG_.get(index);
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 10;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 10;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
      if (levelId_ != 0) {
        output.writeUInt32(7, levelId_);
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(10, difficultyId_);
      }
      for (int i = 0; i < unk2700GMAEHKMDIGG_.size(); i++) {
        output.writeMessage(13, unk2700GMAEHKMDIGG_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, levelId_);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, difficultyId_);
      }
      for (int i = 0; i < unk2700GMAEHKMDIGG_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, unk2700GMAEHKMDIGG_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL other = (emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getUnk2700GMAEHKMDIGGList()
          .equals(other.getUnk2700GMAEHKMDIGGList())) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getUnk2700GMAEHKMDIGGCount() > 0) {
        hash = (37 * hash) + UNK2700_GMAEHKMDIGG_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700GMAEHKMDIGGList().hashCode();
      }
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL prototype) {
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
     * CmdId: 8325
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_IHOOCHJACEL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_IHOOCHJACEL)
        emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACELOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.internal_static_Unk2700_IHOOCHJACEL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.internal_static_Unk2700_IHOOCHJACEL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL.class, emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL.newBuilder()
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
          getUnk2700GMAEHKMDIGGFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelId_ = 0;

        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          unk2700GMAEHKMDIGG_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700GMAEHKMDIGGBuilder_.clear();
        }
        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.internal_static_Unk2700_IHOOCHJACEL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL build() {
        emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL buildPartial() {
        emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL result = new emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL(this);
        int from_bitField0_ = bitField0_;
        result.levelId_ = levelId_;
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700GMAEHKMDIGG_ = java.util.Collections.unmodifiableList(unk2700GMAEHKMDIGG_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700GMAEHKMDIGG_ = unk2700GMAEHKMDIGG_;
        } else {
          result.unk2700GMAEHKMDIGG_ = unk2700GMAEHKMDIGGBuilder_.build();
        }
        result.difficultyId_ = difficultyId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL other) {
        if (other == emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (!other.unk2700GMAEHKMDIGG_.isEmpty()) {
            if (unk2700GMAEHKMDIGG_.isEmpty()) {
              unk2700GMAEHKMDIGG_ = other.unk2700GMAEHKMDIGG_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700GMAEHKMDIGGIsMutable();
              unk2700GMAEHKMDIGG_.addAll(other.unk2700GMAEHKMDIGG_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700GMAEHKMDIGG_.isEmpty()) {
            if (unk2700GMAEHKMDIGGBuilder_.isEmpty()) {
              unk2700GMAEHKMDIGGBuilder_.dispose();
              unk2700GMAEHKMDIGGBuilder_ = null;
              unk2700GMAEHKMDIGG_ = other.unk2700GMAEHKMDIGG_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700GMAEHKMDIGGBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700GMAEHKMDIGGFieldBuilder() : null;
            } else {
              unk2700GMAEHKMDIGGBuilder_.addAllMessages(other.unk2700GMAEHKMDIGG_);
            }
          }
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
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
        emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 7;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO> unk2700GMAEHKMDIGG_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700GMAEHKMDIGGIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700GMAEHKMDIGG_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO>(unk2700GMAEHKMDIGG_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder> unk2700GMAEHKMDIGGBuilder_;

      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO> getUnk2700GMAEHKMDIGGList() {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700GMAEHKMDIGG_);
        } else {
          return unk2700GMAEHKMDIGGBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public int getUnk2700GMAEHKMDIGGCount() {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          return unk2700GMAEHKMDIGG_.size();
        } else {
          return unk2700GMAEHKMDIGGBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO getUnk2700GMAEHKMDIGG(int index) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          return unk2700GMAEHKMDIGG_.get(index);
        } else {
          return unk2700GMAEHKMDIGGBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder setUnk2700GMAEHKMDIGG(
          int index, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO value) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.set(index, value);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder setUnk2700GMAEHKMDIGG(
          int index, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder builderForValue) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder addUnk2700GMAEHKMDIGG(emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO value) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.add(value);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder addUnk2700GMAEHKMDIGG(
          int index, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO value) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.add(index, value);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder addUnk2700GMAEHKMDIGG(
          emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder builderForValue) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder addUnk2700GMAEHKMDIGG(
          int index, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder builderForValue) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder addAllUnk2700GMAEHKMDIGG(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO> values) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700GMAEHKMDIGG_);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder clearUnk2700GMAEHKMDIGG() {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          unk2700GMAEHKMDIGG_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public Builder removeUnk2700GMAEHKMDIGG(int index) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.remove(index);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder getUnk2700GMAEHKMDIGGBuilder(
          int index) {
        return getUnk2700GMAEHKMDIGGFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder getUnk2700GMAEHKMDIGGOrBuilder(
          int index) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          return unk2700GMAEHKMDIGG_.get(index);  } else {
          return unk2700GMAEHKMDIGGBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder> 
           getUnk2700GMAEHKMDIGGOrBuilderList() {
        if (unk2700GMAEHKMDIGGBuilder_ != null) {
          return unk2700GMAEHKMDIGGBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700GMAEHKMDIGG_);
        }
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder addUnk2700GMAEHKMDIGGBuilder() {
        return getUnk2700GMAEHKMDIGGFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder addUnk2700GMAEHKMDIGGBuilder(
          int index) {
        return getUnk2700GMAEHKMDIGGFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_BGKMAAINPCO Unk2700_GMAEHKMDIGG = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder> 
           getUnk2700GMAEHKMDIGGBuilderList() {
        return getUnk2700GMAEHKMDIGGFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder> 
          getUnk2700GMAEHKMDIGGFieldBuilder() {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          unk2700GMAEHKMDIGGBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCO.Builder, emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.Unk2700_BGKMAAINPCOOrBuilder>(
                  unk2700GMAEHKMDIGG_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700GMAEHKMDIGG_ = null;
        }
        return unk2700GMAEHKMDIGGBuilder_;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 10;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 10;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_IHOOCHJACEL)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_IHOOCHJACEL)
    private static final emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL();
    }

    public static emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_IHOOCHJACEL>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_IHOOCHJACEL>() {
      @java.lang.Override
      public Unk2700_IHOOCHJACEL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_IHOOCHJACEL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_IHOOCHJACEL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_IHOOCHJACEL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700IHOOCHJACEL.Unk2700_IHOOCHJACEL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_IHOOCHJACEL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_IHOOCHJACEL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_IHOOCHJACEL.proto\032\031Unk2700_BGK" +
      "MAAINPCO.proto\"q\n\023Unk2700_IHOOCHJACEL\022\020\n" +
      "\010level_id\030\007 \001(\r\0221\n\023Unk2700_GMAEHKMDIGG\030\r" +
      " \003(\0132\024.Unk2700_BGKMAAINPCO\022\025\n\rdifficulty" +
      "_id\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.getDescriptor(),
        });
    internal_static_Unk2700_IHOOCHJACEL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_IHOOCHJACEL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_IHOOCHJACEL_descriptor,
        new java.lang.String[] { "LevelId", "Unk2700GMAEHKMDIGG", "DifficultyId", });
    emu.grasscutter.net.proto.Unk2700BGKMAAINPCO.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

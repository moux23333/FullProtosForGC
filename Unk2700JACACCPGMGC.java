// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_JACACCPGMGC.proto

package emu.grasscutter.net.proto;

public final class Unk2700JACACCPGMGC {
  private Unk2700JACACCPGMGC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_JACACCPGMGCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_JACACCPGMGC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA> 
        getUnk2700IDGMODJPBGFList();
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA getUnk2700IDGMODJPBGF(int index);
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    int getUnk2700IDGMODJPBGFCount();
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder> 
        getUnk2700IDGMODJPBGFOrBuilderList();
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder getUnk2700IDGMODJPBGFOrBuilder(
        int index);

    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * Protobuf type {@code Unk2700_JACACCPGMGC}
   */
  public static final class Unk2700_JACACCPGMGC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_JACACCPGMGC)
      Unk2700_JACACCPGMGCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_JACACCPGMGC.newBuilder() to construct.
    private Unk2700_JACACCPGMGC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_JACACCPGMGC() {
      unk2700IDGMODJPBGF_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_JACACCPGMGC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_JACACCPGMGC(
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
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700IDGMODJPBGF_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700IDGMODJPBGF_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.parser(), extensionRegistry));
              break;
            }
            case 112: {

              levelId_ = input.readUInt32();
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
          unk2700IDGMODJPBGF_ = java.util.Collections.unmodifiableList(unk2700IDGMODJPBGF_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700JACACCPGMGC.internal_static_Unk2700_JACACCPGMGC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700JACACCPGMGC.internal_static_Unk2700_JACACCPGMGC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC.class, emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC.Builder.class);
    }

    public static final int UNK2700_IDGMODJPBGF_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA> unk2700IDGMODJPBGF_;
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA> getUnk2700IDGMODJPBGFList() {
      return unk2700IDGMODJPBGF_;
    }
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder> 
        getUnk2700IDGMODJPBGFOrBuilderList() {
      return unk2700IDGMODJPBGF_;
    }
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    @java.lang.Override
    public int getUnk2700IDGMODJPBGFCount() {
      return unk2700IDGMODJPBGF_.size();
    }
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA getUnk2700IDGMODJPBGF(int index) {
      return unk2700IDGMODJPBGF_.get(index);
    }
    /**
     * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder getUnk2700IDGMODJPBGFOrBuilder(
        int index) {
      return unk2700IDGMODJPBGF_.get(index);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 14;
    private int levelId_;
    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      for (int i = 0; i < unk2700IDGMODJPBGF_.size(); i++) {
        output.writeMessage(11, unk2700IDGMODJPBGF_.get(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(14, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700IDGMODJPBGF_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, unk2700IDGMODJPBGF_.get(i));
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC other = (emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC) obj;

      if (!getUnk2700IDGMODJPBGFList()
          .equals(other.getUnk2700IDGMODJPBGFList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      if (getUnk2700IDGMODJPBGFCount() > 0) {
        hash = (37 * hash) + UNK2700_IDGMODJPBGF_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700IDGMODJPBGFList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC prototype) {
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
     * Protobuf type {@code Unk2700_JACACCPGMGC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_JACACCPGMGC)
        emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700JACACCPGMGC.internal_static_Unk2700_JACACCPGMGC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700JACACCPGMGC.internal_static_Unk2700_JACACCPGMGC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC.class, emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC.newBuilder()
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
          getUnk2700IDGMODJPBGFFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          unk2700IDGMODJPBGF_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700IDGMODJPBGFBuilder_.clear();
        }
        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700JACACCPGMGC.internal_static_Unk2700_JACACCPGMGC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC build() {
        emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC buildPartial() {
        emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC result = new emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC(this);
        int from_bitField0_ = bitField0_;
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700IDGMODJPBGF_ = java.util.Collections.unmodifiableList(unk2700IDGMODJPBGF_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700IDGMODJPBGF_ = unk2700IDGMODJPBGF_;
        } else {
          result.unk2700IDGMODJPBGF_ = unk2700IDGMODJPBGFBuilder_.build();
        }
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC other) {
        if (other == emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC.getDefaultInstance()) return this;
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          if (!other.unk2700IDGMODJPBGF_.isEmpty()) {
            if (unk2700IDGMODJPBGF_.isEmpty()) {
              unk2700IDGMODJPBGF_ = other.unk2700IDGMODJPBGF_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700IDGMODJPBGFIsMutable();
              unk2700IDGMODJPBGF_.addAll(other.unk2700IDGMODJPBGF_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700IDGMODJPBGF_.isEmpty()) {
            if (unk2700IDGMODJPBGFBuilder_.isEmpty()) {
              unk2700IDGMODJPBGFBuilder_.dispose();
              unk2700IDGMODJPBGFBuilder_ = null;
              unk2700IDGMODJPBGF_ = other.unk2700IDGMODJPBGF_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700IDGMODJPBGFBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700IDGMODJPBGFFieldBuilder() : null;
            } else {
              unk2700IDGMODJPBGFBuilder_.addAllMessages(other.unk2700IDGMODJPBGF_);
            }
          }
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA> unk2700IDGMODJPBGF_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700IDGMODJPBGFIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700IDGMODJPBGF_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA>(unk2700IDGMODJPBGF_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder> unk2700IDGMODJPBGFBuilder_;

      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA> getUnk2700IDGMODJPBGFList() {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700IDGMODJPBGF_);
        } else {
          return unk2700IDGMODJPBGFBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public int getUnk2700IDGMODJPBGFCount() {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          return unk2700IDGMODJPBGF_.size();
        } else {
          return unk2700IDGMODJPBGFBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA getUnk2700IDGMODJPBGF(int index) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          return unk2700IDGMODJPBGF_.get(index);
        } else {
          return unk2700IDGMODJPBGFBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder setUnk2700IDGMODJPBGF(
          int index, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA value) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700IDGMODJPBGFIsMutable();
          unk2700IDGMODJPBGF_.set(index, value);
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder setUnk2700IDGMODJPBGF(
          int index, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder builderForValue) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          ensureUnk2700IDGMODJPBGFIsMutable();
          unk2700IDGMODJPBGF_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder addUnk2700IDGMODJPBGF(emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA value) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700IDGMODJPBGFIsMutable();
          unk2700IDGMODJPBGF_.add(value);
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder addUnk2700IDGMODJPBGF(
          int index, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA value) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700IDGMODJPBGFIsMutable();
          unk2700IDGMODJPBGF_.add(index, value);
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder addUnk2700IDGMODJPBGF(
          emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder builderForValue) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          ensureUnk2700IDGMODJPBGFIsMutable();
          unk2700IDGMODJPBGF_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder addUnk2700IDGMODJPBGF(
          int index, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder builderForValue) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          ensureUnk2700IDGMODJPBGFIsMutable();
          unk2700IDGMODJPBGF_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder addAllUnk2700IDGMODJPBGF(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA> values) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          ensureUnk2700IDGMODJPBGFIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700IDGMODJPBGF_);
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder clearUnk2700IDGMODJPBGF() {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          unk2700IDGMODJPBGF_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public Builder removeUnk2700IDGMODJPBGF(int index) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          ensureUnk2700IDGMODJPBGFIsMutable();
          unk2700IDGMODJPBGF_.remove(index);
          onChanged();
        } else {
          unk2700IDGMODJPBGFBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder getUnk2700IDGMODJPBGFBuilder(
          int index) {
        return getUnk2700IDGMODJPBGFFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder getUnk2700IDGMODJPBGFOrBuilder(
          int index) {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          return unk2700IDGMODJPBGF_.get(index);  } else {
          return unk2700IDGMODJPBGFBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder> 
           getUnk2700IDGMODJPBGFOrBuilderList() {
        if (unk2700IDGMODJPBGFBuilder_ != null) {
          return unk2700IDGMODJPBGFBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700IDGMODJPBGF_);
        }
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder addUnk2700IDGMODJPBGFBuilder() {
        return getUnk2700IDGMODJPBGFFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder addUnk2700IDGMODJPBGFBuilder(
          int index) {
        return getUnk2700IDGMODJPBGFFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_MIMJBGMEMCA Unk2700_IDGMODJPBGF = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder> 
           getUnk2700IDGMODJPBGFBuilderList() {
        return getUnk2700IDGMODJPBGFFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder> 
          getUnk2700IDGMODJPBGFFieldBuilder() {
        if (unk2700IDGMODJPBGFBuilder_ == null) {
          unk2700IDGMODJPBGFBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder, emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder>(
                  unk2700IDGMODJPBGF_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700IDGMODJPBGF_ = null;
        }
        return unk2700IDGMODJPBGFBuilder_;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 14;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_JACACCPGMGC)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_JACACCPGMGC)
    private static final emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC();
    }

    public static emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_JACACCPGMGC>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_JACACCPGMGC>() {
      @java.lang.Override
      public Unk2700_JACACCPGMGC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_JACACCPGMGC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_JACACCPGMGC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_JACACCPGMGC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700JACACCPGMGC.Unk2700_JACACCPGMGC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_JACACCPGMGC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_JACACCPGMGC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_JACACCPGMGC.proto\032\031Unk2700_MIM" +
      "JBGMEMCA.proto\"Z\n\023Unk2700_JACACCPGMGC\0221\n" +
      "\023Unk2700_IDGMODJPBGF\030\013 \003(\0132\024.Unk2700_MIM" +
      "JBGMEMCA\022\020\n\010level_id\030\016 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.getDescriptor(),
        });
    internal_static_Unk2700_JACACCPGMGC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_JACACCPGMGC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_JACACCPGMGC_descriptor,
        new java.lang.String[] { "Unk2700IDGMODJPBGF", "LevelId", });
    emu.grasscutter.net.proto.Unk2700MIMJBGMEMCA.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

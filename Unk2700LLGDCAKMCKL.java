// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_LLGDCAKMCKL.proto

package emu.grasscutter.net.proto;

public final class Unk2700LLGDCAKMCKL {
  private Unk2700LLGDCAKMCKL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_LLGDCAKMCKLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_LLGDCAKMCKL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE> 
        getChallengeInfoListList();
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE getChallengeInfoList(int index);
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    int getChallengeInfoListCount();
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder> 
        getChallengeInfoListOrBuilderList();
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder getChallengeInfoListOrBuilder(
        int index);

    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code Unk2700_LLGDCAKMCKL}
   */
  public static final class Unk2700_LLGDCAKMCKL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_LLGDCAKMCKL)
      Unk2700_LLGDCAKMCKLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_LLGDCAKMCKL.newBuilder() to construct.
    private Unk2700_LLGDCAKMCKL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_LLGDCAKMCKL() {
      challengeInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_LLGDCAKMCKL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_LLGDCAKMCKL(
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
            case 16: {

              stageId_ = input.readUInt32();
              break;
            }
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                challengeInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE>();
                mutable_bitField0_ |= 0x00000001;
              }
              challengeInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.parser(), extensionRegistry));
              break;
            }
            case 80: {

              isOpen_ = input.readBool();
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
          challengeInfoList_ = java.util.Collections.unmodifiableList(challengeInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.internal_static_Unk2700_LLGDCAKMCKL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.internal_static_Unk2700_LLGDCAKMCKL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL.class, emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL.Builder.class);
    }

    public static final int CHALLENGE_INFO_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE> challengeInfoList_;
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE> getChallengeInfoListList() {
      return challengeInfoList_;
    }
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder> 
        getChallengeInfoListOrBuilderList() {
      return challengeInfoList_;
    }
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    @java.lang.Override
    public int getChallengeInfoListCount() {
      return challengeInfoList_.size();
    }
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE getChallengeInfoList(int index) {
      return challengeInfoList_.get(index);
    }
    /**
     * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder getChallengeInfoListOrBuilder(
        int index) {
      return challengeInfoList_.get(index);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 10;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 2;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (stageId_ != 0) {
        output.writeUInt32(2, stageId_);
      }
      for (int i = 0; i < challengeInfoList_.size(); i++) {
        output.writeMessage(9, challengeInfoList_.get(i));
      }
      if (isOpen_ != false) {
        output.writeBool(10, isOpen_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stageId_);
      }
      for (int i = 0; i < challengeInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, challengeInfoList_.get(i));
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL other = (emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL) obj;

      if (!getChallengeInfoListList()
          .equals(other.getChallengeInfoListList())) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      if (getChallengeInfoListCount() > 0) {
        hash = (37 * hash) + CHALLENGE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChallengeInfoListList().hashCode();
      }
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL prototype) {
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
     * Protobuf type {@code Unk2700_LLGDCAKMCKL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_LLGDCAKMCKL)
        emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.internal_static_Unk2700_LLGDCAKMCKL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.internal_static_Unk2700_LLGDCAKMCKL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL.class, emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL.newBuilder()
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
          getChallengeInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (challengeInfoListBuilder_ == null) {
          challengeInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          challengeInfoListBuilder_.clear();
        }
        isOpen_ = false;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.internal_static_Unk2700_LLGDCAKMCKL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL build() {
        emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL buildPartial() {
        emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL result = new emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL(this);
        int from_bitField0_ = bitField0_;
        if (challengeInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            challengeInfoList_ = java.util.Collections.unmodifiableList(challengeInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.challengeInfoList_ = challengeInfoList_;
        } else {
          result.challengeInfoList_ = challengeInfoListBuilder_.build();
        }
        result.isOpen_ = isOpen_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL other) {
        if (other == emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL.getDefaultInstance()) return this;
        if (challengeInfoListBuilder_ == null) {
          if (!other.challengeInfoList_.isEmpty()) {
            if (challengeInfoList_.isEmpty()) {
              challengeInfoList_ = other.challengeInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureChallengeInfoListIsMutable();
              challengeInfoList_.addAll(other.challengeInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.challengeInfoList_.isEmpty()) {
            if (challengeInfoListBuilder_.isEmpty()) {
              challengeInfoListBuilder_.dispose();
              challengeInfoListBuilder_ = null;
              challengeInfoList_ = other.challengeInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              challengeInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChallengeInfoListFieldBuilder() : null;
            } else {
              challengeInfoListBuilder_.addAllMessages(other.challengeInfoList_);
            }
          }
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE> challengeInfoList_ =
        java.util.Collections.emptyList();
      private void ensureChallengeInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          challengeInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE>(challengeInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder> challengeInfoListBuilder_;

      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE> getChallengeInfoListList() {
        if (challengeInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(challengeInfoList_);
        } else {
          return challengeInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public int getChallengeInfoListCount() {
        if (challengeInfoListBuilder_ == null) {
          return challengeInfoList_.size();
        } else {
          return challengeInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE getChallengeInfoList(int index) {
        if (challengeInfoListBuilder_ == null) {
          return challengeInfoList_.get(index);
        } else {
          return challengeInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder setChallengeInfoList(
          int index, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE value) {
        if (challengeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.set(index, value);
          onChanged();
        } else {
          challengeInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder setChallengeInfoList(
          int index, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder builderForValue) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          challengeInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder addChallengeInfoList(emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE value) {
        if (challengeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.add(value);
          onChanged();
        } else {
          challengeInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder addChallengeInfoList(
          int index, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE value) {
        if (challengeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.add(index, value);
          onChanged();
        } else {
          challengeInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder addChallengeInfoList(
          emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder builderForValue) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          challengeInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder addChallengeInfoList(
          int index, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder builderForValue) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          challengeInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder addAllChallengeInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE> values) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, challengeInfoList_);
          onChanged();
        } else {
          challengeInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder clearChallengeInfoList() {
        if (challengeInfoListBuilder_ == null) {
          challengeInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          challengeInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public Builder removeChallengeInfoList(int index) {
        if (challengeInfoListBuilder_ == null) {
          ensureChallengeInfoListIsMutable();
          challengeInfoList_.remove(index);
          onChanged();
        } else {
          challengeInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder getChallengeInfoListBuilder(
          int index) {
        return getChallengeInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder getChallengeInfoListOrBuilder(
          int index) {
        if (challengeInfoListBuilder_ == null) {
          return challengeInfoList_.get(index);  } else {
          return challengeInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder> 
           getChallengeInfoListOrBuilderList() {
        if (challengeInfoListBuilder_ != null) {
          return challengeInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(challengeInfoList_);
        }
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder addChallengeInfoListBuilder() {
        return getChallengeInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder addChallengeInfoListBuilder(
          int index) {
        return getChallengeInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_DMPIJLBHEAE challenge_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder> 
           getChallengeInfoListBuilderList() {
        return getChallengeInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder> 
          getChallengeInfoListFieldBuilder() {
        if (challengeInfoListBuilder_ == null) {
          challengeInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAE.Builder, emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.Unk2700_DMPIJLBHEAEOrBuilder>(
                  challengeInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          challengeInfoList_ = null;
        }
        return challengeInfoListBuilder_;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 10;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_LLGDCAKMCKL)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_LLGDCAKMCKL)
    private static final emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL();
    }

    public static emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_LLGDCAKMCKL>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_LLGDCAKMCKL>() {
      @java.lang.Override
      public Unk2700_LLGDCAKMCKL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_LLGDCAKMCKL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_LLGDCAKMCKL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_LLGDCAKMCKL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700LLGDCAKMCKL.Unk2700_LLGDCAKMCKL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_LLGDCAKMCKL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_LLGDCAKMCKL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_LLGDCAKMCKL.proto\032\031Unk2700_DMP" +
      "IJLBHEAE.proto\"k\n\023Unk2700_LLGDCAKMCKL\0221\n" +
      "\023challenge_info_list\030\t \003(\0132\024.Unk2700_DMP" +
      "IJLBHEAE\022\017\n\007is_open\030\n \001(\010\022\020\n\010stage_id\030\002 " +
      "\001(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.getDescriptor(),
        });
    internal_static_Unk2700_LLGDCAKMCKL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_LLGDCAKMCKL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_LLGDCAKMCKL_descriptor,
        new java.lang.String[] { "ChallengeInfoList", "IsOpen", "StageId", });
    emu.grasscutter.net.proto.Unk2700DMPIJLBHEAE.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

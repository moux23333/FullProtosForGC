// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryInstableSprayInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryInstableSprayInfoOuterClass {
  private SceneGalleryInstableSprayInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryInstableSprayInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryInstableSprayInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB> 
        getUnk2700INIBKFPMCFOList();
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB getUnk2700INIBKFPMCFO(int index);
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    int getUnk2700INIBKFPMCFOCount();
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder> 
        getUnk2700INIBKFPMCFOOrBuilderList();
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder getUnk2700INIBKFPMCFOOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code SceneGalleryInstableSprayInfo}
   */
  public static final class SceneGalleryInstableSprayInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryInstableSprayInfo)
      SceneGalleryInstableSprayInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryInstableSprayInfo.newBuilder() to construct.
    private SceneGalleryInstableSprayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryInstableSprayInfo() {
      unk2700INIBKFPMCFO_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryInstableSprayInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryInstableSprayInfo(
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
            case 40: {

              score_ = input.readUInt32();
              break;
            }
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700INIBKFPMCFO_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700INIBKFPMCFO_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.parser(), extensionRegistry));
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
          unk2700INIBKFPMCFO_ = java.util.Collections.unmodifiableList(unk2700INIBKFPMCFO_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.class, emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 5;
    private int score_;
    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int UNK2700_INIBKFPMCFO_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB> unk2700INIBKFPMCFO_;
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB> getUnk2700INIBKFPMCFOList() {
      return unk2700INIBKFPMCFO_;
    }
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder> 
        getUnk2700INIBKFPMCFOOrBuilderList() {
      return unk2700INIBKFPMCFO_;
    }
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    @java.lang.Override
    public int getUnk2700INIBKFPMCFOCount() {
      return unk2700INIBKFPMCFO_.size();
    }
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB getUnk2700INIBKFPMCFO(int index) {
      return unk2700INIBKFPMCFO_.get(index);
    }
    /**
     * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder getUnk2700INIBKFPMCFOOrBuilder(
        int index) {
      return unk2700INIBKFPMCFO_.get(index);
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
      if (score_ != 0) {
        output.writeUInt32(5, score_);
      }
      for (int i = 0; i < unk2700INIBKFPMCFO_.size(); i++) {
        output.writeMessage(12, unk2700INIBKFPMCFO_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, score_);
      }
      for (int i = 0; i < unk2700INIBKFPMCFO_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, unk2700INIBKFPMCFO_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo other = (emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo) obj;

      if (getScore()
          != other.getScore()) return false;
      if (!getUnk2700INIBKFPMCFOList()
          .equals(other.getUnk2700INIBKFPMCFOList())) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      if (getUnk2700INIBKFPMCFOCount() > 0) {
        hash = (37 * hash) + UNK2700_INIBKFPMCFO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700INIBKFPMCFOList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo prototype) {
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
     * Protobuf type {@code SceneGalleryInstableSprayInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryInstableSprayInfo)
        emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.class, emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.newBuilder()
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
          getUnk2700INIBKFPMCFOFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        score_ = 0;

        if (unk2700INIBKFPMCFOBuilder_ == null) {
          unk2700INIBKFPMCFO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700INIBKFPMCFOBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.internal_static_SceneGalleryInstableSprayInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo build() {
        emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo result = new emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo(this);
        int from_bitField0_ = bitField0_;
        result.score_ = score_;
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700INIBKFPMCFO_ = java.util.Collections.unmodifiableList(unk2700INIBKFPMCFO_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700INIBKFPMCFO_ = unk2700INIBKFPMCFO_;
        } else {
          result.unk2700INIBKFPMCFO_ = unk2700INIBKFPMCFOBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          if (!other.unk2700INIBKFPMCFO_.isEmpty()) {
            if (unk2700INIBKFPMCFO_.isEmpty()) {
              unk2700INIBKFPMCFO_ = other.unk2700INIBKFPMCFO_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700INIBKFPMCFOIsMutable();
              unk2700INIBKFPMCFO_.addAll(other.unk2700INIBKFPMCFO_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700INIBKFPMCFO_.isEmpty()) {
            if (unk2700INIBKFPMCFOBuilder_.isEmpty()) {
              unk2700INIBKFPMCFOBuilder_.dispose();
              unk2700INIBKFPMCFOBuilder_ = null;
              unk2700INIBKFPMCFO_ = other.unk2700INIBKFPMCFO_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700INIBKFPMCFOBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700INIBKFPMCFOFieldBuilder() : null;
            } else {
              unk2700INIBKFPMCFOBuilder_.addAllMessages(other.unk2700INIBKFPMCFO_);
            }
          }
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
        emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int score_ ;
      /**
       * <code>uint32 score = 5;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB> unk2700INIBKFPMCFO_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700INIBKFPMCFOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700INIBKFPMCFO_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB>(unk2700INIBKFPMCFO_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder> unk2700INIBKFPMCFOBuilder_;

      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB> getUnk2700INIBKFPMCFOList() {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700INIBKFPMCFO_);
        } else {
          return unk2700INIBKFPMCFOBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public int getUnk2700INIBKFPMCFOCount() {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          return unk2700INIBKFPMCFO_.size();
        } else {
          return unk2700INIBKFPMCFOBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB getUnk2700INIBKFPMCFO(int index) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          return unk2700INIBKFPMCFO_.get(index);
        } else {
          return unk2700INIBKFPMCFOBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder setUnk2700INIBKFPMCFO(
          int index, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB value) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700INIBKFPMCFOIsMutable();
          unk2700INIBKFPMCFO_.set(index, value);
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder setUnk2700INIBKFPMCFO(
          int index, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder builderForValue) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          ensureUnk2700INIBKFPMCFOIsMutable();
          unk2700INIBKFPMCFO_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder addUnk2700INIBKFPMCFO(emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB value) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700INIBKFPMCFOIsMutable();
          unk2700INIBKFPMCFO_.add(value);
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder addUnk2700INIBKFPMCFO(
          int index, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB value) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700INIBKFPMCFOIsMutable();
          unk2700INIBKFPMCFO_.add(index, value);
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder addUnk2700INIBKFPMCFO(
          emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder builderForValue) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          ensureUnk2700INIBKFPMCFOIsMutable();
          unk2700INIBKFPMCFO_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder addUnk2700INIBKFPMCFO(
          int index, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder builderForValue) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          ensureUnk2700INIBKFPMCFOIsMutable();
          unk2700INIBKFPMCFO_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder addAllUnk2700INIBKFPMCFO(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB> values) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          ensureUnk2700INIBKFPMCFOIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700INIBKFPMCFO_);
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder clearUnk2700INIBKFPMCFO() {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          unk2700INIBKFPMCFO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public Builder removeUnk2700INIBKFPMCFO(int index) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          ensureUnk2700INIBKFPMCFOIsMutable();
          unk2700INIBKFPMCFO_.remove(index);
          onChanged();
        } else {
          unk2700INIBKFPMCFOBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder getUnk2700INIBKFPMCFOBuilder(
          int index) {
        return getUnk2700INIBKFPMCFOFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder getUnk2700INIBKFPMCFOOrBuilder(
          int index) {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          return unk2700INIBKFPMCFO_.get(index);  } else {
          return unk2700INIBKFPMCFOBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder> 
           getUnk2700INIBKFPMCFOOrBuilderList() {
        if (unk2700INIBKFPMCFOBuilder_ != null) {
          return unk2700INIBKFPMCFOBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700INIBKFPMCFO_);
        }
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder addUnk2700INIBKFPMCFOBuilder() {
        return getUnk2700INIBKFPMCFOFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder addUnk2700INIBKFPMCFOBuilder(
          int index) {
        return getUnk2700INIBKFPMCFOFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_OMCBMAHOLHB Unk2700_INIBKFPMCFO = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder> 
           getUnk2700INIBKFPMCFOBuilderList() {
        return getUnk2700INIBKFPMCFOFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder> 
          getUnk2700INIBKFPMCFOFieldBuilder() {
        if (unk2700INIBKFPMCFOBuilder_ == null) {
          unk2700INIBKFPMCFOBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder, emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder>(
                  unk2700INIBKFPMCFO_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700INIBKFPMCFO_ = null;
        }
        return unk2700INIBKFPMCFOBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryInstableSprayInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryInstableSprayInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryInstableSprayInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryInstableSprayInfo>() {
      @java.lang.Override
      public SceneGalleryInstableSprayInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryInstableSprayInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryInstableSprayInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryInstableSprayInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryInstableSprayInfoOuterClass.SceneGalleryInstableSprayInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryInstableSprayInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryInstableSprayInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGalleryInstableSprayInfo.proto\032\031U" +
      "nk3000_OMCBMAHOLHB.proto\"a\n\035SceneGallery" +
      "InstableSprayInfo\022\r\n\005score\030\005 \001(\r\0221\n\023Unk2" +
      "700_INIBKFPMCFO\030\014 \003(\0132\024.Unk3000_OMCBMAHO" +
      "LHBB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.getDescriptor(),
        });
    internal_static_SceneGalleryInstableSprayInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryInstableSprayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryInstableSprayInfo_descriptor,
        new java.lang.String[] { "Score", "Unk2700INIBKFPMCFO", });
    emu.grasscutter.net.proto.Unk3000OMCBMAHOLHB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

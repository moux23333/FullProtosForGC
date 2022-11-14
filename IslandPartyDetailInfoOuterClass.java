// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IslandPartyDetailInfo.proto

package emu.grasscutter.net.proto;

public final class IslandPartyDetailInfoOuterClass {
  private IslandPartyDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IslandPartyDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IslandPartyDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData> 
        getStageDataListList();
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getStageDataList(int index);
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    int getStageDataListCount();
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder> 
        getStageDataListOrBuilderList();
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder getStageDataListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code IslandPartyDetailInfo}
   */
  public static final class IslandPartyDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IslandPartyDetailInfo)
      IslandPartyDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IslandPartyDetailInfo.newBuilder() to construct.
    private IslandPartyDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IslandPartyDetailInfo() {
      stageDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IslandPartyDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IslandPartyDetailInfo(
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
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                stageDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData>();
                mutable_bitField0_ |= 0x00000001;
              }
              stageDataList_.add(
                  input.readMessage(emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.parser(), extensionRegistry));
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
          stageDataList_ = java.util.Collections.unmodifiableList(stageDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.internal_static_IslandPartyDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.internal_static_IslandPartyDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo.class, emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo.Builder.class);
    }

    public static final int STAGE_DATA_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData> stageDataList_;
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData> getStageDataListList() {
      return stageDataList_;
    }
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder> 
        getStageDataListOrBuilderList() {
      return stageDataList_;
    }
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    @java.lang.Override
    public int getStageDataListCount() {
      return stageDataList_.size();
    }
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getStageDataList(int index) {
      return stageDataList_.get(index);
    }
    /**
     * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder getStageDataListOrBuilder(
        int index) {
      return stageDataList_.get(index);
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
      for (int i = 0; i < stageDataList_.size(); i++) {
        output.writeMessage(15, stageDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stageDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, stageDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo other = (emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo) obj;

      if (!getStageDataListList()
          .equals(other.getStageDataListList())) return false;
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
      if (getStageDataListCount() > 0) {
        hash = (37 * hash) + STAGE_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStageDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo prototype) {
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
     * Protobuf type {@code IslandPartyDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IslandPartyDetailInfo)
        emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.internal_static_IslandPartyDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.internal_static_IslandPartyDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo.class, emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo.newBuilder()
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
          getStageDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (stageDataListBuilder_ == null) {
          stageDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          stageDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.internal_static_IslandPartyDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo build() {
        emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo buildPartial() {
        emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo result = new emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo(this);
        int from_bitField0_ = bitField0_;
        if (stageDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            stageDataList_ = java.util.Collections.unmodifiableList(stageDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stageDataList_ = stageDataList_;
        } else {
          result.stageDataList_ = stageDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo other) {
        if (other == emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo.getDefaultInstance()) return this;
        if (stageDataListBuilder_ == null) {
          if (!other.stageDataList_.isEmpty()) {
            if (stageDataList_.isEmpty()) {
              stageDataList_ = other.stageDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStageDataListIsMutable();
              stageDataList_.addAll(other.stageDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.stageDataList_.isEmpty()) {
            if (stageDataListBuilder_.isEmpty()) {
              stageDataListBuilder_.dispose();
              stageDataListBuilder_ = null;
              stageDataList_ = other.stageDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stageDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStageDataListFieldBuilder() : null;
            } else {
              stageDataListBuilder_.addAllMessages(other.stageDataList_);
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
        emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData> stageDataList_ =
        java.util.Collections.emptyList();
      private void ensureStageDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData>(stageDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder> stageDataListBuilder_;

      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData> getStageDataListList() {
        if (stageDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageDataList_);
        } else {
          return stageDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public int getStageDataListCount() {
        if (stageDataListBuilder_ == null) {
          return stageDataList_.size();
        } else {
          return stageDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getStageDataList(int index) {
        if (stageDataListBuilder_ == null) {
          return stageDataList_.get(index);
        } else {
          return stageDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder setStageDataList(
          int index, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData value) {
        if (stageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageDataListIsMutable();
          stageDataList_.set(index, value);
          onChanged();
        } else {
          stageDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder setStageDataList(
          int index, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder builderForValue) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          stageDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          stageDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder addStageDataList(emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData value) {
        if (stageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageDataListIsMutable();
          stageDataList_.add(value);
          onChanged();
        } else {
          stageDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder addStageDataList(
          int index, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData value) {
        if (stageDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageDataListIsMutable();
          stageDataList_.add(index, value);
          onChanged();
        } else {
          stageDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder addStageDataList(
          emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder builderForValue) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          stageDataList_.add(builderForValue.build());
          onChanged();
        } else {
          stageDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder addStageDataList(
          int index, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder builderForValue) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          stageDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          stageDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder addAllStageDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData> values) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, stageDataList_);
          onChanged();
        } else {
          stageDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder clearStageDataList() {
        if (stageDataListBuilder_ == null) {
          stageDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stageDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public Builder removeStageDataList(int index) {
        if (stageDataListBuilder_ == null) {
          ensureStageDataListIsMutable();
          stageDataList_.remove(index);
          onChanged();
        } else {
          stageDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder getStageDataListBuilder(
          int index) {
        return getStageDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder getStageDataListOrBuilder(
          int index) {
        if (stageDataListBuilder_ == null) {
          return stageDataList_.get(index);  } else {
          return stageDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder> 
           getStageDataListOrBuilderList() {
        if (stageDataListBuilder_ != null) {
          return stageDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageDataList_);
        }
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder addStageDataListBuilder() {
        return getStageDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder addStageDataListBuilder(
          int index) {
        return getStageDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .IslandPartyStageData stage_data_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder> 
           getStageDataListBuilderList() {
        return getStageDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder> 
          getStageDataListFieldBuilder() {
        if (stageDataListBuilder_ == null) {
          stageDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder>(
                  stageDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          stageDataList_ = null;
        }
        return stageDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IslandPartyDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:IslandPartyDetailInfo)
    private static final emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo();
    }

    public static emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IslandPartyDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<IslandPartyDetailInfo>() {
      @java.lang.Override
      public IslandPartyDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IslandPartyDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IslandPartyDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IslandPartyDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IslandPartyDetailInfoOuterClass.IslandPartyDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IslandPartyDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IslandPartyDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033IslandPartyDetailInfo.proto\032\032IslandPar" +
      "tyStageData.proto\"G\n\025IslandPartyDetailIn" +
      "fo\022.\n\017stage_data_list\030\017 \003(\0132\025.IslandPart" +
      "yStageDataB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.getDescriptor(),
        });
    internal_static_IslandPartyDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IslandPartyDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IslandPartyDetailInfo_descriptor,
        new java.lang.String[] { "StageDataList", });
    emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

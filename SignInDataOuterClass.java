// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SignInData.proto

package emu.grasscutter.net.proto;

public final class SignInDataOuterClass {
  private SignInDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SignInDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SignInData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 day_count = 14;</code>
     * @return The dayCount.
     */
    int getDayCount();

    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getRewardItemListList();
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getRewardItemList(int index);
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    int getRewardItemListCount();
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getRewardItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getRewardItemListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code SignInData}
   */
  public static final class SignInData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SignInData)
      SignInDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SignInData.newBuilder() to construct.
    private SignInData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SignInData() {
      rewardItemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SignInData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SignInData(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                rewardItemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              rewardItemList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
              break;
            }
            case 112: {

              dayCount_ = input.readUInt32();
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
          rewardItemList_ = java.util.Collections.unmodifiableList(rewardItemList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SignInDataOuterClass.internal_static_SignInData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SignInDataOuterClass.internal_static_SignInData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SignInDataOuterClass.SignInData.class, emu.grasscutter.net.proto.SignInDataOuterClass.SignInData.Builder.class);
    }

    public static final int DAY_COUNT_FIELD_NUMBER = 14;
    private int dayCount_;
    /**
     * <code>uint32 day_count = 14;</code>
     * @return The dayCount.
     */
    @java.lang.Override
    public int getDayCount() {
      return dayCount_;
    }

    public static final int REWARD_ITEM_LIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> rewardItemList_;
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getRewardItemListList() {
      return rewardItemList_;
    }
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getRewardItemListOrBuilderList() {
      return rewardItemList_;
    }
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    @java.lang.Override
    public int getRewardItemListCount() {
      return rewardItemList_.size();
    }
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getRewardItemList(int index) {
      return rewardItemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam reward_item_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getRewardItemListOrBuilder(
        int index) {
      return rewardItemList_.get(index);
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
      for (int i = 0; i < rewardItemList_.size(); i++) {
        output.writeMessage(5, rewardItemList_.get(i));
      }
      if (dayCount_ != 0) {
        output.writeUInt32(14, dayCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < rewardItemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, rewardItemList_.get(i));
      }
      if (dayCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, dayCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SignInDataOuterClass.SignInData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SignInDataOuterClass.SignInData other = (emu.grasscutter.net.proto.SignInDataOuterClass.SignInData) obj;

      if (getDayCount()
          != other.getDayCount()) return false;
      if (!getRewardItemListList()
          .equals(other.getRewardItemListList())) return false;
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
      hash = (37 * hash) + DAY_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDayCount();
      if (getRewardItemListCount() > 0) {
        hash = (37 * hash) + REWARD_ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRewardItemListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SignInDataOuterClass.SignInData prototype) {
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
     * Protobuf type {@code SignInData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SignInData)
        emu.grasscutter.net.proto.SignInDataOuterClass.SignInDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SignInDataOuterClass.internal_static_SignInData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SignInDataOuterClass.internal_static_SignInData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SignInDataOuterClass.SignInData.class, emu.grasscutter.net.proto.SignInDataOuterClass.SignInData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SignInDataOuterClass.SignInData.newBuilder()
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
          getRewardItemListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dayCount_ = 0;

        if (rewardItemListBuilder_ == null) {
          rewardItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          rewardItemListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SignInDataOuterClass.internal_static_SignInData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SignInDataOuterClass.SignInData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SignInDataOuterClass.SignInData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SignInDataOuterClass.SignInData build() {
        emu.grasscutter.net.proto.SignInDataOuterClass.SignInData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SignInDataOuterClass.SignInData buildPartial() {
        emu.grasscutter.net.proto.SignInDataOuterClass.SignInData result = new emu.grasscutter.net.proto.SignInDataOuterClass.SignInData(this);
        int from_bitField0_ = bitField0_;
        result.dayCount_ = dayCount_;
        if (rewardItemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            rewardItemList_ = java.util.Collections.unmodifiableList(rewardItemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.rewardItemList_ = rewardItemList_;
        } else {
          result.rewardItemList_ = rewardItemListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.SignInDataOuterClass.SignInData) {
          return mergeFrom((emu.grasscutter.net.proto.SignInDataOuterClass.SignInData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SignInDataOuterClass.SignInData other) {
        if (other == emu.grasscutter.net.proto.SignInDataOuterClass.SignInData.getDefaultInstance()) return this;
        if (other.getDayCount() != 0) {
          setDayCount(other.getDayCount());
        }
        if (rewardItemListBuilder_ == null) {
          if (!other.rewardItemList_.isEmpty()) {
            if (rewardItemList_.isEmpty()) {
              rewardItemList_ = other.rewardItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRewardItemListIsMutable();
              rewardItemList_.addAll(other.rewardItemList_);
            }
            onChanged();
          }
        } else {
          if (!other.rewardItemList_.isEmpty()) {
            if (rewardItemListBuilder_.isEmpty()) {
              rewardItemListBuilder_.dispose();
              rewardItemListBuilder_ = null;
              rewardItemList_ = other.rewardItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              rewardItemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRewardItemListFieldBuilder() : null;
            } else {
              rewardItemListBuilder_.addAllMessages(other.rewardItemList_);
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
        emu.grasscutter.net.proto.SignInDataOuterClass.SignInData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SignInDataOuterClass.SignInData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int dayCount_ ;
      /**
       * <code>uint32 day_count = 14;</code>
       * @return The dayCount.
       */
      @java.lang.Override
      public int getDayCount() {
        return dayCount_;
      }
      /**
       * <code>uint32 day_count = 14;</code>
       * @param value The dayCount to set.
       * @return This builder for chaining.
       */
      public Builder setDayCount(int value) {
        
        dayCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 day_count = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDayCount() {
        
        dayCount_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> rewardItemList_ =
        java.util.Collections.emptyList();
      private void ensureRewardItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          rewardItemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(rewardItemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> rewardItemListBuilder_;

      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getRewardItemListList() {
        if (rewardItemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rewardItemList_);
        } else {
          return rewardItemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public int getRewardItemListCount() {
        if (rewardItemListBuilder_ == null) {
          return rewardItemList_.size();
        } else {
          return rewardItemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getRewardItemList(int index) {
        if (rewardItemListBuilder_ == null) {
          return rewardItemList_.get(index);
        } else {
          return rewardItemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder setRewardItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (rewardItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardItemListIsMutable();
          rewardItemList_.set(index, value);
          onChanged();
        } else {
          rewardItemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder setRewardItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (rewardItemListBuilder_ == null) {
          ensureRewardItemListIsMutable();
          rewardItemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          rewardItemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder addRewardItemList(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (rewardItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardItemListIsMutable();
          rewardItemList_.add(value);
          onChanged();
        } else {
          rewardItemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder addRewardItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (rewardItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardItemListIsMutable();
          rewardItemList_.add(index, value);
          onChanged();
        } else {
          rewardItemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder addRewardItemList(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (rewardItemListBuilder_ == null) {
          ensureRewardItemListIsMutable();
          rewardItemList_.add(builderForValue.build());
          onChanged();
        } else {
          rewardItemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder addRewardItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (rewardItemListBuilder_ == null) {
          ensureRewardItemListIsMutable();
          rewardItemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          rewardItemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder addAllRewardItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (rewardItemListBuilder_ == null) {
          ensureRewardItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, rewardItemList_);
          onChanged();
        } else {
          rewardItemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder clearRewardItemList() {
        if (rewardItemListBuilder_ == null) {
          rewardItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          rewardItemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public Builder removeRewardItemList(int index) {
        if (rewardItemListBuilder_ == null) {
          ensureRewardItemListIsMutable();
          rewardItemList_.remove(index);
          onChanged();
        } else {
          rewardItemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getRewardItemListBuilder(
          int index) {
        return getRewardItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getRewardItemListOrBuilder(
          int index) {
        if (rewardItemListBuilder_ == null) {
          return rewardItemList_.get(index);  } else {
          return rewardItemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getRewardItemListOrBuilderList() {
        if (rewardItemListBuilder_ != null) {
          return rewardItemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rewardItemList_);
        }
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addRewardItemListBuilder() {
        return getRewardItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addRewardItemListBuilder(
          int index) {
        return getRewardItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam reward_item_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getRewardItemListBuilderList() {
        return getRewardItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getRewardItemListFieldBuilder() {
        if (rewardItemListBuilder_ == null) {
          rewardItemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  rewardItemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          rewardItemList_ = null;
        }
        return rewardItemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SignInData)
    }

    // @@protoc_insertion_point(class_scope:SignInData)
    private static final emu.grasscutter.net.proto.SignInDataOuterClass.SignInData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SignInDataOuterClass.SignInData();
    }

    public static emu.grasscutter.net.proto.SignInDataOuterClass.SignInData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SignInData>
        PARSER = new com.google.protobuf.AbstractParser<SignInData>() {
      @java.lang.Override
      public SignInData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SignInData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SignInData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SignInData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SignInDataOuterClass.SignInData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignInData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignInData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020SignInData.proto\032\017ItemParam.proto\"E\n\nS" +
      "ignInData\022\021\n\tday_count\030\016 \001(\r\022$\n\020reward_i" +
      "tem_list\030\005 \003(\0132\n.ItemParamB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_SignInData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SignInData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignInData_descriptor,
        new java.lang.String[] { "DayCount", "RewardItemList", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
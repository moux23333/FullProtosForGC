// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeFishFarmingInfoNotify.proto

package emu.grasscutter.net.proto;

public final class HomeFishFarmingInfoNotifyOuterClass {
  private HomeFishFarmingInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeFishFarmingInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeFishFarmingInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> 
        getFishFarmingInfoListList();
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getFishFarmingInfoList(int index);
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    int getFishFarmingInfoListCount();
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> 
        getFishFarmingInfoListOrBuilderList();
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 4677
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomeFishFarmingInfoNotify}
   */
  public static final class HomeFishFarmingInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeFishFarmingInfoNotify)
      HomeFishFarmingInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeFishFarmingInfoNotify.newBuilder() to construct.
    private HomeFishFarmingInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeFishFarmingInfoNotify() {
      fishFarmingInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeFishFarmingInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeFishFarmingInfoNotify(
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
                fishFarmingInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              fishFarmingInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.parser(), extensionRegistry));
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
          fishFarmingInfoList_ = java.util.Collections.unmodifiableList(fishFarmingInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.internal_static_HomeFishFarmingInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.internal_static_HomeFishFarmingInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify.class, emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify.Builder.class);
    }

    public static final int FISH_FARMING_INFO_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> fishFarmingInfoList_;
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> getFishFarmingInfoListList() {
      return fishFarmingInfoList_;
    }
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> 
        getFishFarmingInfoListOrBuilderList() {
      return fishFarmingInfoList_;
    }
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    @java.lang.Override
    public int getFishFarmingInfoListCount() {
      return fishFarmingInfoList_.size();
    }
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getFishFarmingInfoList(int index) {
      return fishFarmingInfoList_.get(index);
    }
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
        int index) {
      return fishFarmingInfoList_.get(index);
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
      for (int i = 0; i < fishFarmingInfoList_.size(); i++) {
        output.writeMessage(15, fishFarmingInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fishFarmingInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, fishFarmingInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify other = (emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify) obj;

      if (!getFishFarmingInfoListList()
          .equals(other.getFishFarmingInfoListList())) return false;
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
      if (getFishFarmingInfoListCount() > 0) {
        hash = (37 * hash) + FISH_FARMING_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFishFarmingInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify prototype) {
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
     * CmdId: 4677
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomeFishFarmingInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeFishFarmingInfoNotify)
        emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.internal_static_HomeFishFarmingInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.internal_static_HomeFishFarmingInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify.class, emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify.newBuilder()
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
          getFishFarmingInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          fishFarmingInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.internal_static_HomeFishFarmingInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify build() {
        emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify buildPartial() {
        emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify result = new emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (fishFarmingInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            fishFarmingInfoList_ = java.util.Collections.unmodifiableList(fishFarmingInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fishFarmingInfoList_ = fishFarmingInfoList_;
        } else {
          result.fishFarmingInfoList_ = fishFarmingInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify other) {
        if (other == emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify.getDefaultInstance()) return this;
        if (fishFarmingInfoListBuilder_ == null) {
          if (!other.fishFarmingInfoList_.isEmpty()) {
            if (fishFarmingInfoList_.isEmpty()) {
              fishFarmingInfoList_ = other.fishFarmingInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFishFarmingInfoListIsMutable();
              fishFarmingInfoList_.addAll(other.fishFarmingInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.fishFarmingInfoList_.isEmpty()) {
            if (fishFarmingInfoListBuilder_.isEmpty()) {
              fishFarmingInfoListBuilder_.dispose();
              fishFarmingInfoListBuilder_ = null;
              fishFarmingInfoList_ = other.fishFarmingInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fishFarmingInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFishFarmingInfoListFieldBuilder() : null;
            } else {
              fishFarmingInfoListBuilder_.addAllMessages(other.fishFarmingInfoList_);
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
        emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> fishFarmingInfoList_ =
        java.util.Collections.emptyList();
      private void ensureFishFarmingInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fishFarmingInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo>(fishFarmingInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> fishFarmingInfoListBuilder_;

      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> getFishFarmingInfoListList() {
        if (fishFarmingInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fishFarmingInfoList_);
        } else {
          return fishFarmingInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public int getFishFarmingInfoListCount() {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.size();
        } else {
          return fishFarmingInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getFishFarmingInfoList(int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.get(index);
        } else {
          return fishFarmingInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder setFishFarmingInfoList(
          int index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.set(index, value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder setFishFarmingInfoList(
          int index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder addFishFarmingInfoList(emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder addFishFarmingInfoList(
          int index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(index, value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder addFishFarmingInfoList(
          emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder addFishFarmingInfoList(
          int index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder addAllFishFarmingInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> values) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fishFarmingInfoList_);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder clearFishFarmingInfoList() {
        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public Builder removeFishFarmingInfoList(int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.remove(index);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder getFishFarmingInfoListBuilder(
          int index) {
        return getFishFarmingInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
          int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.get(index);  } else {
          return fishFarmingInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> 
           getFishFarmingInfoListOrBuilderList() {
        if (fishFarmingInfoListBuilder_ != null) {
          return fishFarmingInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fishFarmingInfoList_);
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder addFishFarmingInfoListBuilder() {
        return getFishFarmingInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder addFishFarmingInfoListBuilder(
          int index) {
        return getFishFarmingInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder> 
           getFishFarmingInfoListBuilderList() {
        return getFishFarmingInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> 
          getFishFarmingInfoListFieldBuilder() {
        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder>(
                  fishFarmingInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          fishFarmingInfoList_ = null;
        }
        return fishFarmingInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeFishFarmingInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeFishFarmingInfoNotify)
    private static final emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify();
    }

    public static emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeFishFarmingInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeFishFarmingInfoNotify>() {
      @java.lang.Override
      public HomeFishFarmingInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeFishFarmingInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeFishFarmingInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeFishFarmingInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFishFarmingInfoNotifyOuterClass.HomeFishFarmingInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeFishFarmingInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeFishFarmingInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HomeFishFarmingInfoNotify.proto\032\031HomeF" +
      "ishFarmingInfo.proto\"Q\n\031HomeFishFarmingI" +
      "nfoNotify\0224\n\026fish_farming_info_list\030\017 \003(" +
      "\0132\024.HomeFishFarmingInfoB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeFishFarmingInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeFishFarmingInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeFishFarmingInfoNotify_descriptor,
        new java.lang.String[] { "FishFarmingInfoList", });
    emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

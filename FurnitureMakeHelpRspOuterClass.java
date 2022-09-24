// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeHelpRsp.proto

package emu.grasscutter.net.proto;

public final class FurnitureMakeHelpRspOuterClass {
  private FurnitureMakeHelpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeHelpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeHelpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> 
        getHelpDataListList();
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData getHelpDataList(int index);
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    int getHelpDataListCount();
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> 
        getHelpDataListOrBuilderList();
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder getHelpDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 4756
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FurnitureMakeHelpRsp}
   */
  public static final class FurnitureMakeHelpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeHelpRsp)
      FurnitureMakeHelpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeHelpRsp.newBuilder() to construct.
    private FurnitureMakeHelpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeHelpRsp() {
      helpDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeHelpRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FurnitureMakeHelpRsp(
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
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                helpDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData>();
                mutable_bitField0_ |= 0x00000001;
              }
              helpDataList_.add(
                  input.readMessage(emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.parser(), extensionRegistry));
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
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
          helpDataList_ = java.util.Collections.unmodifiableList(helpDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.internal_static_FurnitureMakeHelpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.internal_static_FurnitureMakeHelpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp.class, emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int HELP_DATA_LIST_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> helpDataList_;
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> getHelpDataListList() {
      return helpDataList_;
    }
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> 
        getHelpDataListOrBuilderList() {
      return helpDataList_;
    }
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    @java.lang.Override
    public int getHelpDataListCount() {
      return helpDataList_.size();
    }
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData getHelpDataList(int index) {
      return helpDataList_.get(index);
    }
    /**
     * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder getHelpDataListOrBuilder(
        int index) {
      return helpDataList_.get(index);
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
      for (int i = 0; i < helpDataList_.size(); i++) {
        output.writeMessage(6, helpDataList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < helpDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, helpDataList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp other = (emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getHelpDataListList()
          .equals(other.getHelpDataListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getHelpDataListCount() > 0) {
        hash = (37 * hash) + HELP_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getHelpDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp prototype) {
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
     * CmdId: 4756
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FurnitureMakeHelpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeHelpRsp)
        emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.internal_static_FurnitureMakeHelpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.internal_static_FurnitureMakeHelpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp.class, emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp.newBuilder()
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
          getHelpDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (helpDataListBuilder_ == null) {
          helpDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          helpDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.internal_static_FurnitureMakeHelpRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp build() {
        emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp buildPartial() {
        emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp result = new emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (helpDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            helpDataList_ = java.util.Collections.unmodifiableList(helpDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.helpDataList_ = helpDataList_;
        } else {
          result.helpDataList_ = helpDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp) {
          return mergeFrom((emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp other) {
        if (other == emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (helpDataListBuilder_ == null) {
          if (!other.helpDataList_.isEmpty()) {
            if (helpDataList_.isEmpty()) {
              helpDataList_ = other.helpDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureHelpDataListIsMutable();
              helpDataList_.addAll(other.helpDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.helpDataList_.isEmpty()) {
            if (helpDataListBuilder_.isEmpty()) {
              helpDataListBuilder_.dispose();
              helpDataListBuilder_ = null;
              helpDataList_ = other.helpDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              helpDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getHelpDataListFieldBuilder() : null;
            } else {
              helpDataListBuilder_.addAllMessages(other.helpDataList_);
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
        emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> helpDataList_ =
        java.util.Collections.emptyList();
      private void ensureHelpDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          helpDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData>(helpDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> helpDataListBuilder_;

      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> getHelpDataListList() {
        if (helpDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(helpDataList_);
        } else {
          return helpDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public int getHelpDataListCount() {
        if (helpDataListBuilder_ == null) {
          return helpDataList_.size();
        } else {
          return helpDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData getHelpDataList(int index) {
        if (helpDataListBuilder_ == null) {
          return helpDataList_.get(index);
        } else {
          return helpDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder setHelpDataList(
          int index, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData value) {
        if (helpDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHelpDataListIsMutable();
          helpDataList_.set(index, value);
          onChanged();
        } else {
          helpDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder setHelpDataList(
          int index, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder builderForValue) {
        if (helpDataListBuilder_ == null) {
          ensureHelpDataListIsMutable();
          helpDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          helpDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder addHelpDataList(emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData value) {
        if (helpDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHelpDataListIsMutable();
          helpDataList_.add(value);
          onChanged();
        } else {
          helpDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder addHelpDataList(
          int index, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData value) {
        if (helpDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHelpDataListIsMutable();
          helpDataList_.add(index, value);
          onChanged();
        } else {
          helpDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder addHelpDataList(
          emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder builderForValue) {
        if (helpDataListBuilder_ == null) {
          ensureHelpDataListIsMutable();
          helpDataList_.add(builderForValue.build());
          onChanged();
        } else {
          helpDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder addHelpDataList(
          int index, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder builderForValue) {
        if (helpDataListBuilder_ == null) {
          ensureHelpDataListIsMutable();
          helpDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          helpDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder addAllHelpDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData> values) {
        if (helpDataListBuilder_ == null) {
          ensureHelpDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, helpDataList_);
          onChanged();
        } else {
          helpDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder clearHelpDataList() {
        if (helpDataListBuilder_ == null) {
          helpDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          helpDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public Builder removeHelpDataList(int index) {
        if (helpDataListBuilder_ == null) {
          ensureHelpDataListIsMutable();
          helpDataList_.remove(index);
          onChanged();
        } else {
          helpDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder getHelpDataListBuilder(
          int index) {
        return getHelpDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder getHelpDataListOrBuilder(
          int index) {
        if (helpDataListBuilder_ == null) {
          return helpDataList_.get(index);  } else {
          return helpDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> 
           getHelpDataListOrBuilderList() {
        if (helpDataListBuilder_ != null) {
          return helpDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(helpDataList_);
        }
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder addHelpDataListBuilder() {
        return getHelpDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.getDefaultInstance());
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder addHelpDataListBuilder(
          int index) {
        return getHelpDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.getDefaultInstance());
      }
      /**
       * <code>repeated .FurnitureMakeHelpData help_data_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder> 
           getHelpDataListBuilderList() {
        return getHelpDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder> 
          getHelpDataListFieldBuilder() {
        if (helpDataListBuilder_ == null) {
          helpDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpData.Builder, emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.FurnitureMakeHelpDataOrBuilder>(
                  helpDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          helpDataList_ = null;
        }
        return helpDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FurnitureMakeHelpRsp)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeHelpRsp)
    private static final emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp();
    }

    public static emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeHelpRsp>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeHelpRsp>() {
      @java.lang.Override
      public FurnitureMakeHelpRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FurnitureMakeHelpRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FurnitureMakeHelpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeHelpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeHelpRspOuterClass.FurnitureMakeHelpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeHelpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeHelpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032FurnitureMakeHelpRsp.proto\032\033FurnitureM" +
      "akeHelpData.proto\"W\n\024FurnitureMakeHelpRs" +
      "p\022\017\n\007retcode\030\n \001(\005\022.\n\016help_data_list\030\006 \003" +
      "(\0132\026.FurnitureMakeHelpDataB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.getDescriptor(),
        });
    internal_static_FurnitureMakeHelpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeHelpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeHelpRsp_descriptor,
        new java.lang.String[] { "Retcode", "HelpDataList", });
    emu.grasscutter.net.proto.FurnitureMakeHelpDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

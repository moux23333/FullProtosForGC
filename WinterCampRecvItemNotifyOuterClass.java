// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampRecvItemNotify.proto

package emu.grasscutter.net.proto;

public final class WinterCampRecvItemNotifyOuterClass {
  private WinterCampRecvItemNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampRecvItemNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampRecvItemNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
     * @return Whether the recvItemData field is set.
     */
    boolean hasRecvItemData();
    /**
     * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
     * @return The recvItemData.
     */
    emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData getRecvItemData();
    /**
     * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
     */
    emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder getRecvItemDataOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 8580
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code WinterCampRecvItemNotify}
   */
  public static final class WinterCampRecvItemNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampRecvItemNotify)
      WinterCampRecvItemNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampRecvItemNotify.newBuilder() to construct.
    private WinterCampRecvItemNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampRecvItemNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampRecvItemNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WinterCampRecvItemNotify(
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
            case 114: {
              emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder subBuilder = null;
              if (recvItemData_ != null) {
                subBuilder = recvItemData_.toBuilder();
              }
              recvItemData_ = input.readMessage(emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(recvItemData_);
                recvItemData_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.internal_static_WinterCampRecvItemNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.internal_static_WinterCampRecvItemNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify.class, emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify.Builder.class);
    }

    public static final int RECV_ITEM_DATA_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData recvItemData_;
    /**
     * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
     * @return Whether the recvItemData field is set.
     */
    @java.lang.Override
    public boolean hasRecvItemData() {
      return recvItemData_ != null;
    }
    /**
     * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
     * @return The recvItemData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData getRecvItemData() {
      return recvItemData_ == null ? emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.getDefaultInstance() : recvItemData_;
    }
    /**
     * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder getRecvItemDataOrBuilder() {
      return getRecvItemData();
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
      if (recvItemData_ != null) {
        output.writeMessage(14, getRecvItemData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (recvItemData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getRecvItemData());
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
      if (!(obj instanceof emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify other = (emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify) obj;

      if (hasRecvItemData() != other.hasRecvItemData()) return false;
      if (hasRecvItemData()) {
        if (!getRecvItemData()
            .equals(other.getRecvItemData())) return false;
      }
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
      if (hasRecvItemData()) {
        hash = (37 * hash) + RECV_ITEM_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getRecvItemData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify prototype) {
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
     * CmdId: 8580
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code WinterCampRecvItemNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampRecvItemNotify)
        emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.internal_static_WinterCampRecvItemNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.internal_static_WinterCampRecvItemNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify.class, emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify.newBuilder()
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
        if (recvItemDataBuilder_ == null) {
          recvItemData_ = null;
        } else {
          recvItemData_ = null;
          recvItemDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.internal_static_WinterCampRecvItemNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify build() {
        emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify buildPartial() {
        emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify result = new emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify(this);
        if (recvItemDataBuilder_ == null) {
          result.recvItemData_ = recvItemData_;
        } else {
          result.recvItemData_ = recvItemDataBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify other) {
        if (other == emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify.getDefaultInstance()) return this;
        if (other.hasRecvItemData()) {
          mergeRecvItemData(other.getRecvItemData());
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
        emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData recvItemData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder> recvItemDataBuilder_;
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       * @return Whether the recvItemData field is set.
       */
      public boolean hasRecvItemData() {
        return recvItemDataBuilder_ != null || recvItemData_ != null;
      }
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       * @return The recvItemData.
       */
      public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData getRecvItemData() {
        if (recvItemDataBuilder_ == null) {
          return recvItemData_ == null ? emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.getDefaultInstance() : recvItemData_;
        } else {
          return recvItemDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       */
      public Builder setRecvItemData(emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData value) {
        if (recvItemDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          recvItemData_ = value;
          onChanged();
        } else {
          recvItemDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       */
      public Builder setRecvItemData(
          emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder builderForValue) {
        if (recvItemDataBuilder_ == null) {
          recvItemData_ = builderForValue.build();
          onChanged();
        } else {
          recvItemDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       */
      public Builder mergeRecvItemData(emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData value) {
        if (recvItemDataBuilder_ == null) {
          if (recvItemData_ != null) {
            recvItemData_ =
              emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.newBuilder(recvItemData_).mergeFrom(value).buildPartial();
          } else {
            recvItemData_ = value;
          }
          onChanged();
        } else {
          recvItemDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       */
      public Builder clearRecvItemData() {
        if (recvItemDataBuilder_ == null) {
          recvItemData_ = null;
          onChanged();
        } else {
          recvItemData_ = null;
          recvItemDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       */
      public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder getRecvItemDataBuilder() {
        
        onChanged();
        return getRecvItemDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       */
      public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder getRecvItemDataOrBuilder() {
        if (recvItemDataBuilder_ != null) {
          return recvItemDataBuilder_.getMessageOrBuilder();
        } else {
          return recvItemData_ == null ?
              emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.getDefaultInstance() : recvItemData_;
        }
      }
      /**
       * <code>.WinterCampRecvItemData recv_item_data = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder> 
          getRecvItemDataFieldBuilder() {
        if (recvItemDataBuilder_ == null) {
          recvItemDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder>(
                  getRecvItemData(),
                  getParentForChildren(),
                  isClean());
          recvItemData_ = null;
        }
        return recvItemDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WinterCampRecvItemNotify)
    }

    // @@protoc_insertion_point(class_scope:WinterCampRecvItemNotify)
    private static final emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify();
    }

    public static emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampRecvItemNotify>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampRecvItemNotify>() {
      @java.lang.Override
      public WinterCampRecvItemNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WinterCampRecvItemNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WinterCampRecvItemNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampRecvItemNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampRecvItemNotifyOuterClass.WinterCampRecvItemNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampRecvItemNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampRecvItemNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036WinterCampRecvItemNotify.proto\032\034Winter" +
      "CampRecvItemData.proto\"K\n\030WinterCampRecv" +
      "ItemNotify\022/\n\016recv_item_data\030\016 \001(\0132\027.Win" +
      "terCampRecvItemDataB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.getDescriptor(),
        });
    internal_static_WinterCampRecvItemNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampRecvItemNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampRecvItemNotify_descriptor,
        new java.lang.String[] { "RecvItemData", });
    emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
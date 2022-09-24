// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DigActivityMarkPointChangeNotify.proto

package emu.grasscutter.net.proto;

public final class DigActivityMarkPointChangeNotifyOuterClass {
  private DigActivityMarkPointChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DigActivityMarkPointChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DigActivityMarkPointChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint> 
        getDigMarkPointListList();
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint getDigMarkPointList(int index);
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    int getDigMarkPointListCount();
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder> 
        getDigMarkPointListOrBuilderList();
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder getDigMarkPointListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 8109
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DigActivityMarkPointChangeNotify}
   */
  public static final class DigActivityMarkPointChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DigActivityMarkPointChangeNotify)
      DigActivityMarkPointChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DigActivityMarkPointChangeNotify.newBuilder() to construct.
    private DigActivityMarkPointChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DigActivityMarkPointChangeNotify() {
      digMarkPointList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DigActivityMarkPointChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DigActivityMarkPointChangeNotify(
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
                digMarkPointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint>();
                mutable_bitField0_ |= 0x00000001;
              }
              digMarkPointList_.add(
                  input.readMessage(emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.parser(), extensionRegistry));
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
          digMarkPointList_ = java.util.Collections.unmodifiableList(digMarkPointList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.internal_static_DigActivityMarkPointChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.internal_static_DigActivityMarkPointChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify.class, emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify.Builder.class);
    }

    public static final int DIG_MARK_POINT_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint> digMarkPointList_;
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint> getDigMarkPointListList() {
      return digMarkPointList_;
    }
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder> 
        getDigMarkPointListOrBuilderList() {
      return digMarkPointList_;
    }
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    @java.lang.Override
    public int getDigMarkPointListCount() {
      return digMarkPointList_.size();
    }
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint getDigMarkPointList(int index) {
      return digMarkPointList_.get(index);
    }
    /**
     * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder getDigMarkPointListOrBuilder(
        int index) {
      return digMarkPointList_.get(index);
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
      for (int i = 0; i < digMarkPointList_.size(); i++) {
        output.writeMessage(11, digMarkPointList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < digMarkPointList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, digMarkPointList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify other = (emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify) obj;

      if (!getDigMarkPointListList()
          .equals(other.getDigMarkPointListList())) return false;
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
      if (getDigMarkPointListCount() > 0) {
        hash = (37 * hash) + DIG_MARK_POINT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDigMarkPointListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify prototype) {
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
     * CmdId: 8109
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DigActivityMarkPointChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DigActivityMarkPointChangeNotify)
        emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.internal_static_DigActivityMarkPointChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.internal_static_DigActivityMarkPointChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify.class, emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify.newBuilder()
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
          getDigMarkPointListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (digMarkPointListBuilder_ == null) {
          digMarkPointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          digMarkPointListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.internal_static_DigActivityMarkPointChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify build() {
        emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify buildPartial() {
        emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify result = new emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify(this);
        int from_bitField0_ = bitField0_;
        if (digMarkPointListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            digMarkPointList_ = java.util.Collections.unmodifiableList(digMarkPointList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.digMarkPointList_ = digMarkPointList_;
        } else {
          result.digMarkPointList_ = digMarkPointListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify other) {
        if (other == emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify.getDefaultInstance()) return this;
        if (digMarkPointListBuilder_ == null) {
          if (!other.digMarkPointList_.isEmpty()) {
            if (digMarkPointList_.isEmpty()) {
              digMarkPointList_ = other.digMarkPointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDigMarkPointListIsMutable();
              digMarkPointList_.addAll(other.digMarkPointList_);
            }
            onChanged();
          }
        } else {
          if (!other.digMarkPointList_.isEmpty()) {
            if (digMarkPointListBuilder_.isEmpty()) {
              digMarkPointListBuilder_.dispose();
              digMarkPointListBuilder_ = null;
              digMarkPointList_ = other.digMarkPointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              digMarkPointListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDigMarkPointListFieldBuilder() : null;
            } else {
              digMarkPointListBuilder_.addAllMessages(other.digMarkPointList_);
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
        emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint> digMarkPointList_ =
        java.util.Collections.emptyList();
      private void ensureDigMarkPointListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          digMarkPointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint>(digMarkPointList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder> digMarkPointListBuilder_;

      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint> getDigMarkPointListList() {
        if (digMarkPointListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(digMarkPointList_);
        } else {
          return digMarkPointListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public int getDigMarkPointListCount() {
        if (digMarkPointListBuilder_ == null) {
          return digMarkPointList_.size();
        } else {
          return digMarkPointListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint getDigMarkPointList(int index) {
        if (digMarkPointListBuilder_ == null) {
          return digMarkPointList_.get(index);
        } else {
          return digMarkPointListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder setDigMarkPointList(
          int index, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint value) {
        if (digMarkPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDigMarkPointListIsMutable();
          digMarkPointList_.set(index, value);
          onChanged();
        } else {
          digMarkPointListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder setDigMarkPointList(
          int index, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder builderForValue) {
        if (digMarkPointListBuilder_ == null) {
          ensureDigMarkPointListIsMutable();
          digMarkPointList_.set(index, builderForValue.build());
          onChanged();
        } else {
          digMarkPointListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder addDigMarkPointList(emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint value) {
        if (digMarkPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDigMarkPointListIsMutable();
          digMarkPointList_.add(value);
          onChanged();
        } else {
          digMarkPointListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder addDigMarkPointList(
          int index, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint value) {
        if (digMarkPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDigMarkPointListIsMutable();
          digMarkPointList_.add(index, value);
          onChanged();
        } else {
          digMarkPointListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder addDigMarkPointList(
          emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder builderForValue) {
        if (digMarkPointListBuilder_ == null) {
          ensureDigMarkPointListIsMutable();
          digMarkPointList_.add(builderForValue.build());
          onChanged();
        } else {
          digMarkPointListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder addDigMarkPointList(
          int index, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder builderForValue) {
        if (digMarkPointListBuilder_ == null) {
          ensureDigMarkPointListIsMutable();
          digMarkPointList_.add(index, builderForValue.build());
          onChanged();
        } else {
          digMarkPointListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder addAllDigMarkPointList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint> values) {
        if (digMarkPointListBuilder_ == null) {
          ensureDigMarkPointListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, digMarkPointList_);
          onChanged();
        } else {
          digMarkPointListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder clearDigMarkPointList() {
        if (digMarkPointListBuilder_ == null) {
          digMarkPointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          digMarkPointListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public Builder removeDigMarkPointList(int index) {
        if (digMarkPointListBuilder_ == null) {
          ensureDigMarkPointListIsMutable();
          digMarkPointList_.remove(index);
          onChanged();
        } else {
          digMarkPointListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder getDigMarkPointListBuilder(
          int index) {
        return getDigMarkPointListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder getDigMarkPointListOrBuilder(
          int index) {
        if (digMarkPointListBuilder_ == null) {
          return digMarkPointList_.get(index);  } else {
          return digMarkPointListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder> 
           getDigMarkPointListOrBuilderList() {
        if (digMarkPointListBuilder_ != null) {
          return digMarkPointListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(digMarkPointList_);
        }
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder addDigMarkPointListBuilder() {
        return getDigMarkPointListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.getDefaultInstance());
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder addDigMarkPointListBuilder(
          int index) {
        return getDigMarkPointListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.getDefaultInstance());
      }
      /**
       * <code>repeated .DigMarkPoint dig_mark_point_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder> 
           getDigMarkPointListBuilderList() {
        return getDigMarkPointListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder> 
          getDigMarkPointListFieldBuilder() {
        if (digMarkPointListBuilder_ == null) {
          digMarkPointListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPoint.Builder, emu.grasscutter.net.proto.DigMarkPointOuterClass.DigMarkPointOrBuilder>(
                  digMarkPointList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          digMarkPointList_ = null;
        }
        return digMarkPointListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DigActivityMarkPointChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:DigActivityMarkPointChangeNotify)
    private static final emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify();
    }

    public static emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DigActivityMarkPointChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<DigActivityMarkPointChangeNotify>() {
      @java.lang.Override
      public DigActivityMarkPointChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DigActivityMarkPointChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DigActivityMarkPointChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DigActivityMarkPointChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DigActivityMarkPointChangeNotifyOuterClass.DigActivityMarkPointChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DigActivityMarkPointChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DigActivityMarkPointChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&DigActivityMarkPointChangeNotify.proto" +
      "\032\022DigMarkPoint.proto\"N\n DigActivityMarkP" +
      "ointChangeNotify\022*\n\023dig_mark_point_list\030" +
      "\013 \003(\0132\r.DigMarkPointB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DigMarkPointOuterClass.getDescriptor(),
        });
    internal_static_DigActivityMarkPointChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DigActivityMarkPointChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DigActivityMarkPointChangeNotify_descriptor,
        new java.lang.String[] { "DigMarkPointList", });
    emu.grasscutter.net.proto.DigMarkPointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

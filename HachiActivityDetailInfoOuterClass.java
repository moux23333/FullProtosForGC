// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HachiActivityDetailInfo.proto

package emu.grasscutter.net.proto;

public final class HachiActivityDetailInfoOuterClass {
  private HachiActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HachiActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HachiActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */
    int getStageMapCount();
    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */
    boolean containsStageMap(
        int key);
    /**
     * Use {@link #getStageMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>
    getStageMap();
    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>
    getStageMapMap();
    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */

    emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData getStageMapOrDefault(
        int key,
        emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData defaultValue);
    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */

    emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData getStageMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code HachiActivityDetailInfo}
   */
  public static final class HachiActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HachiActivityDetailInfo)
      HachiActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HachiActivityDetailInfo.newBuilder() to construct.
    private HachiActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HachiActivityDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HachiActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HachiActivityDetailInfo(
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
                stageMap_ = com.google.protobuf.MapField.newMapField(
                    StageMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>
              stageMap__ = input.readMessage(
                  StageMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              stageMap_.getMutableMap().put(
                  stageMap__.getKey(), stageMap__.getValue());
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
      return emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.internal_static_HachiActivityDetailInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetStageMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.internal_static_HachiActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo.class, emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo.Builder.class);
    }

    public static final int STAGE_MAP_FIELD_NUMBER = 6;
    private static final class StageMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>newDefaultInstance(
                  emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.internal_static_HachiActivityDetailInfo_StageMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> stageMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>
    internalGetStageMap() {
      if (stageMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StageMapDefaultEntryHolder.defaultEntry);
      }
      return stageMap_;
    }

    public int getStageMapCount() {
      return internalGetStageMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */

    @java.lang.Override
    public boolean containsStageMap(
        int key) {
      
      return internalGetStageMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStageMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> getStageMap() {
      return getStageMapMap();
    }
    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> getStageMapMap() {
      return internalGetStageMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData getStageMapOrDefault(
        int key,
        emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> map =
          internalGetStageMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData getStageMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> map =
          internalGetStageMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetStageMap(),
          StageMapDefaultEntryHolder.defaultEntry,
          6);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> entry
           : internalGetStageMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>
        stageMap__ = StageMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(6, stageMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo other = (emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo) obj;

      if (!internalGetStageMap().equals(
          other.internalGetStageMap())) return false;
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
      if (!internalGetStageMap().getMap().isEmpty()) {
        hash = (37 * hash) + STAGE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetStageMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo prototype) {
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
     * Protobuf type {@code HachiActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HachiActivityDetailInfo)
        emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.internal_static_HachiActivityDetailInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetMutableStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.internal_static_HachiActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo.class, emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo.newBuilder()
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
        internalGetMutableStageMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.internal_static_HachiActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo build() {
        emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo buildPartial() {
        emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo result = new emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.stageMap_ = internalGetStageMap();
        result.stageMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo other) {
        if (other == emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo.getDefaultInstance()) return this;
        internalGetMutableStageMap().mergeFrom(
            other.internalGetStageMap());
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
        emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> stageMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>
      internalGetStageMap() {
        if (stageMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              StageMapDefaultEntryHolder.defaultEntry);
        }
        return stageMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>
      internalGetMutableStageMap() {
        onChanged();;
        if (stageMap_ == null) {
          stageMap_ = com.google.protobuf.MapField.newMapField(
              StageMapDefaultEntryHolder.defaultEntry);
        }
        if (!stageMap_.isMutable()) {
          stageMap_ = stageMap_.copy();
        }
        return stageMap_;
      }

      public int getStageMapCount() {
        return internalGetStageMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
       */

      @java.lang.Override
      public boolean containsStageMap(
          int key) {
        
        return internalGetStageMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getStageMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> getStageMap() {
        return getStageMapMap();
      }
      /**
       * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> getStageMapMap() {
        return internalGetStageMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData getStageMapOrDefault(
          int key,
          emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> map =
            internalGetStageMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData getStageMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> map =
            internalGetStageMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearStageMap() {
        internalGetMutableStageMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
       */

      public Builder removeStageMap(
          int key) {
        
        internalGetMutableStageMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData>
      getMutableStageMap() {
        return internalGetMutableStageMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
       */
      public Builder putStageMap(
          int key,
          emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableStageMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .HachiStageData&gt; stage_map = 6;</code>
       */

      public Builder putAllStageMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageDataOuterClass.HachiStageData> values) {
        internalGetMutableStageMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:HachiActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:HachiActivityDetailInfo)
    private static final emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HachiActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<HachiActivityDetailInfo>() {
      @java.lang.Override
      public HachiActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HachiActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HachiActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HachiActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HachiActivityDetailInfoOuterClass.HachiActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HachiActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HachiActivityDetailInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HachiActivityDetailInfo_StageMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HachiActivityDetailInfo_StageMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035HachiActivityDetailInfo.proto\032\024HachiSt" +
      "ageData.proto\"\226\001\n\027HachiActivityDetailInf" +
      "o\0229\n\tstage_map\030\006 \003(\0132&.HachiActivityDeta" +
      "ilInfo.StageMapEntry\032@\n\rStageMapEntry\022\013\n" +
      "\003key\030\001 \001(\r\022\036\n\005value\030\002 \001(\0132\017.HachiStageDa" +
      "ta:\0028\001B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HachiStageDataOuterClass.getDescriptor(),
        });
    internal_static_HachiActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HachiActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HachiActivityDetailInfo_descriptor,
        new java.lang.String[] { "StageMap", });
    internal_static_HachiActivityDetailInfo_StageMapEntry_descriptor =
      internal_static_HachiActivityDetailInfo_descriptor.getNestedTypes().get(0);
    internal_static_HachiActivityDetailInfo_StageMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HachiActivityDetailInfo_StageMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.HachiStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoActivityDetailInfo.proto

package emu.grasscutter.net.proto;

public final class SumoActivityDetailInfoOuterClass {
  private SumoActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 difficulty_id = 11;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();

    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */
    int getSumoStageMapCount();
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */
    boolean containsSumoStageMap(
        int key);
    /**
     * Use {@link #getSumoStageMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
    getSumoStageMap();
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
    getSumoStageMapMap();
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */

    emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrDefault(
        int key,
        emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData defaultValue);
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */

    emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrThrow(
        int key);

    /**
     * <code>uint32 Unk2700_NIJIAJMFLLD = 14;</code>
     * @return The unk2700NIJIAJMFLLD.
     */
    int getUnk2700NIJIAJMFLLD();
  }
  /**
   * Protobuf type {@code SumoActivityDetailInfo}
   */
  public static final class SumoActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoActivityDetailInfo)
      SumoActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoActivityDetailInfo.newBuilder() to construct.
    private SumoActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoActivityDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SumoActivityDetailInfo(
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
            case 88: {

              difficultyId_ = input.readUInt32();
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sumoStageMap_ = com.google.protobuf.MapField.newMapField(
                    SumoStageMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
              sumoStageMap__ = input.readMessage(
                  SumoStageMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              sumoStageMap_.getMutableMap().put(
                  sumoStageMap__.getKey(), sumoStageMap__.getValue());
              break;
            }
            case 112: {

              unk2700NIJIAJMFLLD_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 13:
          return internalGetSumoStageMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.class, emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.Builder.class);
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 11;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 11;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    public static final int SUMO_STAGE_MAP_FIELD_NUMBER = 13;
    private static final class SumoStageMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>newDefaultInstance(
                  emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> sumoStageMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
    internalGetSumoStageMap() {
      if (sumoStageMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SumoStageMapDefaultEntryHolder.defaultEntry);
      }
      return sumoStageMap_;
    }

    public int getSumoStageMapCount() {
      return internalGetSumoStageMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */

    @java.lang.Override
    public boolean containsSumoStageMap(
        int key) {
      
      return internalGetSumoStageMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSumoStageMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> getSumoStageMap() {
      return getSumoStageMapMap();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> getSumoStageMapMap() {
      return internalGetSumoStageMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrDefault(
        int key,
        emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> map =
          internalGetSumoStageMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> map =
          internalGetSumoStageMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int UNK2700_NIJIAJMFLLD_FIELD_NUMBER = 14;
    private int unk2700NIJIAJMFLLD_;
    /**
     * <code>uint32 Unk2700_NIJIAJMFLLD = 14;</code>
     * @return The unk2700NIJIAJMFLLD.
     */
    @java.lang.Override
    public int getUnk2700NIJIAJMFLLD() {
      return unk2700NIJIAJMFLLD_;
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
      if (difficultyId_ != 0) {
        output.writeUInt32(11, difficultyId_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSumoStageMap(),
          SumoStageMapDefaultEntryHolder.defaultEntry,
          13);
      if (unk2700NIJIAJMFLLD_ != 0) {
        output.writeUInt32(14, unk2700NIJIAJMFLLD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, difficultyId_);
      }
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> entry
           : internalGetSumoStageMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
        sumoStageMap__ = SumoStageMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(13, sumoStageMap__);
      }
      if (unk2700NIJIAJMFLLD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk2700NIJIAJMFLLD_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo other = (emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo) obj;

      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (!internalGetSumoStageMap().equals(
          other.internalGetSumoStageMap())) return false;
      if (getUnk2700NIJIAJMFLLD()
          != other.getUnk2700NIJIAJMFLLD()) return false;
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
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      if (!internalGetSumoStageMap().getMap().isEmpty()) {
        hash = (37 * hash) + SUMO_STAGE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSumoStageMap().hashCode();
      }
      hash = (37 * hash) + UNK2700_NIJIAJMFLLD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700NIJIAJMFLLD();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo prototype) {
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
     * Protobuf type {@code SumoActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoActivityDetailInfo)
        emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetSumoStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetMutableSumoStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.class, emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.newBuilder()
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
        difficultyId_ = 0;

        internalGetMutableSumoStageMap().clear();
        unk2700NIJIAJMFLLD_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo build() {
        emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo buildPartial() {
        emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo result = new emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.difficultyId_ = difficultyId_;
        result.sumoStageMap_ = internalGetSumoStageMap();
        result.sumoStageMap_.makeImmutable();
        result.unk2700NIJIAJMFLLD_ = unk2700NIJIAJMFLLD_;
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
        if (other instanceof emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo other) {
        if (other == emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.getDefaultInstance()) return this;
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        internalGetMutableSumoStageMap().mergeFrom(
            other.internalGetSumoStageMap());
        if (other.getUnk2700NIJIAJMFLLD() != 0) {
          setUnk2700NIJIAJMFLLD(other.getUnk2700NIJIAJMFLLD());
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
        emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> sumoStageMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
      internalGetSumoStageMap() {
        if (sumoStageMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SumoStageMapDefaultEntryHolder.defaultEntry);
        }
        return sumoStageMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
      internalGetMutableSumoStageMap() {
        onChanged();;
        if (sumoStageMap_ == null) {
          sumoStageMap_ = com.google.protobuf.MapField.newMapField(
              SumoStageMapDefaultEntryHolder.defaultEntry);
        }
        if (!sumoStageMap_.isMutable()) {
          sumoStageMap_ = sumoStageMap_.copy();
        }
        return sumoStageMap_;
      }

      public int getSumoStageMapCount() {
        return internalGetSumoStageMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
       */

      @java.lang.Override
      public boolean containsSumoStageMap(
          int key) {
        
        return internalGetSumoStageMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSumoStageMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> getSumoStageMap() {
        return getSumoStageMapMap();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> getSumoStageMapMap() {
        return internalGetSumoStageMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrDefault(
          int key,
          emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> map =
            internalGetSumoStageMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> map =
            internalGetSumoStageMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearSumoStageMap() {
        internalGetMutableSumoStageMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
       */

      public Builder removeSumoStageMap(
          int key) {
        
        internalGetMutableSumoStageMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData>
      getMutableSumoStageMap() {
        return internalGetMutableSumoStageMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
       */
      public Builder putSumoStageMap(
          int key,
          emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableSumoStageMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 13;</code>
       */

      public Builder putAllSumoStageMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.SumoStageDataOuterClass.SumoStageData> values) {
        internalGetMutableSumoStageMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int unk2700NIJIAJMFLLD_ ;
      /**
       * <code>uint32 Unk2700_NIJIAJMFLLD = 14;</code>
       * @return The unk2700NIJIAJMFLLD.
       */
      @java.lang.Override
      public int getUnk2700NIJIAJMFLLD() {
        return unk2700NIJIAJMFLLD_;
      }
      /**
       * <code>uint32 Unk2700_NIJIAJMFLLD = 14;</code>
       * @param value The unk2700NIJIAJMFLLD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700NIJIAJMFLLD(int value) {
        
        unk2700NIJIAJMFLLD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_NIJIAJMFLLD = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700NIJIAJMFLLD() {
        
        unk2700NIJIAJMFLLD_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SumoActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:SumoActivityDetailInfo)
    private static final emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo();
    }

    public static emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<SumoActivityDetailInfo>() {
      @java.lang.Override
      public SumoActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SumoActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SumoActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoActivityDetailInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoActivityDetailInfo_SumoStageMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SumoActivityDetailInfo.proto\032\023SumoStag" +
      "eData.proto\"\324\001\n\026SumoActivityDetailInfo\022\025" +
      "\n\rdifficulty_id\030\013 \001(\r\022A\n\016sumo_stage_map\030" +
      "\r \003(\0132).SumoActivityDetailInfo.SumoStage" +
      "MapEntry\022\033\n\023Unk2700_NIJIAJMFLLD\030\016 \001(\r\032C\n" +
      "\021SumoStageMapEntry\022\013\n\003key\030\001 \001(\r\022\035\n\005value" +
      "\030\002 \001(\0132\016.SumoStageData:\0028\001B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SumoStageDataOuterClass.getDescriptor(),
        });
    internal_static_SumoActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoActivityDetailInfo_descriptor,
        new java.lang.String[] { "DifficultyId", "SumoStageMap", "Unk2700NIJIAJMFLLD", });
    internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor =
      internal_static_SumoActivityDetailInfo_descriptor.getNestedTypes().get(0);
    internal_static_SumoActivityDetailInfo_SumoStageMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.SumoStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

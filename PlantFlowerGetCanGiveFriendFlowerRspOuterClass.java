// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlantFlowerGetCanGiveFriendFlowerRsp.proto

package emu.grasscutter.net.proto;

public final class PlantFlowerGetCanGiveFriendFlowerRspOuterClass {
  private PlantFlowerGetCanGiveFriendFlowerRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlantFlowerGetCanGiveFriendFlowerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlantFlowerGetCanGiveFriendFlowerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */
    int getFlowerNumMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */
    boolean containsFlowerNumMap(
        int key);
    /**
     * Use {@link #getFlowerNumMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getFlowerNumMap();
    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getFlowerNumMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */

    int getFlowerNumMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */

    int getFlowerNumMapOrThrow(
        int key);

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8273;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlantFlowerGetCanGiveFriendFlowerRsp}
   */
  public static final class PlantFlowerGetCanGiveFriendFlowerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlantFlowerGetCanGiveFriendFlowerRsp)
      PlantFlowerGetCanGiveFriendFlowerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlantFlowerGetCanGiveFriendFlowerRsp.newBuilder() to construct.
    private PlantFlowerGetCanGiveFriendFlowerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlantFlowerGetCanGiveFriendFlowerRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlantFlowerGetCanGiveFriendFlowerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlantFlowerGetCanGiveFriendFlowerRsp(
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
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                flowerNumMap_ = com.google.protobuf.MapField.newMapField(
                    FlowerNumMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              flowerNumMap__ = input.readMessage(
                  FlowerNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              flowerNumMap_.getMutableMap().put(
                  flowerNumMap__.getKey(), flowerNumMap__.getValue());
              break;
            }
            case 104: {

              scheduleId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetFlowerNumMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp.class, emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp.Builder.class);
    }

    public static final int FLOWER_NUM_MAP_FIELD_NUMBER = 5;
    private static final class FlowerNumMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_FlowerNumMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> flowerNumMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetFlowerNumMap() {
      if (flowerNumMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FlowerNumMapDefaultEntryHolder.defaultEntry);
      }
      return flowerNumMap_;
    }

    public int getFlowerNumMapCount() {
      return internalGetFlowerNumMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */

    @java.lang.Override
    public boolean containsFlowerNumMap(
        int key) {
      
      return internalGetFlowerNumMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFlowerNumMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getFlowerNumMap() {
      return getFlowerNumMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getFlowerNumMapMap() {
      return internalGetFlowerNumMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */
    @java.lang.Override

    public int getFlowerNumMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetFlowerNumMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
     */
    @java.lang.Override

    public int getFlowerNumMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetFlowerNumMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 13;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetFlowerNumMap(),
          FlowerNumMapDefaultEntryHolder.defaultEntry,
          5);
      if (scheduleId_ != 0) {
        output.writeUInt32(13, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetFlowerNumMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        flowerNumMap__ = FlowerNumMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(5, flowerNumMap__);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, scheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp other = (emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp) obj;

      if (!internalGetFlowerNumMap().equals(
          other.internalGetFlowerNumMap())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      if (!internalGetFlowerNumMap().getMap().isEmpty()) {
        hash = (37 * hash) + FLOWER_NUM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetFlowerNumMap().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 8273;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlantFlowerGetCanGiveFriendFlowerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlantFlowerGetCanGiveFriendFlowerRsp)
        emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetFlowerNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetMutableFlowerNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp.class, emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp.newBuilder()
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
        internalGetMutableFlowerNumMap().clear();
        retcode_ = 0;

        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp build() {
        emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp buildPartial() {
        emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp result = new emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp(this);
        int from_bitField0_ = bitField0_;
        result.flowerNumMap_ = internalGetFlowerNumMap();
        result.flowerNumMap_.makeImmutable();
        result.retcode_ = retcode_;
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp other) {
        if (other == emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp.getDefaultInstance()) return this;
        internalGetMutableFlowerNumMap().mergeFrom(
            other.internalGetFlowerNumMap());
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp) e.getUnfinishedMessage();
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
          java.lang.Integer, java.lang.Integer> flowerNumMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetFlowerNumMap() {
        if (flowerNumMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              FlowerNumMapDefaultEntryHolder.defaultEntry);
        }
        return flowerNumMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableFlowerNumMap() {
        onChanged();;
        if (flowerNumMap_ == null) {
          flowerNumMap_ = com.google.protobuf.MapField.newMapField(
              FlowerNumMapDefaultEntryHolder.defaultEntry);
        }
        if (!flowerNumMap_.isMutable()) {
          flowerNumMap_ = flowerNumMap_.copy();
        }
        return flowerNumMap_;
      }

      public int getFlowerNumMapCount() {
        return internalGetFlowerNumMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
       */

      @java.lang.Override
      public boolean containsFlowerNumMap(
          int key) {
        
        return internalGetFlowerNumMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getFlowerNumMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getFlowerNumMap() {
        return getFlowerNumMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getFlowerNumMapMap() {
        return internalGetFlowerNumMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
       */
      @java.lang.Override

      public int getFlowerNumMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetFlowerNumMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
       */
      @java.lang.Override

      public int getFlowerNumMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetFlowerNumMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearFlowerNumMap() {
        internalGetMutableFlowerNumMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
       */

      public Builder removeFlowerNumMap(
          int key) {
        
        internalGetMutableFlowerNumMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableFlowerNumMap() {
        return internalGetMutableFlowerNumMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
       */
      public Builder putFlowerNumMap(
          int key,
          int value) {
        
        
        internalGetMutableFlowerNumMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; flower_num_map = 5;</code>
       */

      public Builder putAllFlowerNumMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableFlowerNumMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlantFlowerGetCanGiveFriendFlowerRsp)
    }

    // @@protoc_insertion_point(class_scope:PlantFlowerGetCanGiveFriendFlowerRsp)
    private static final emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp();
    }

    public static emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlantFlowerGetCanGiveFriendFlowerRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlantFlowerGetCanGiveFriendFlowerRsp>() {
      @java.lang.Override
      public PlantFlowerGetCanGiveFriendFlowerRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlantFlowerGetCanGiveFriendFlowerRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlantFlowerGetCanGiveFriendFlowerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlantFlowerGetCanGiveFriendFlowerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlantFlowerGetCanGiveFriendFlowerRspOuterClass.PlantFlowerGetCanGiveFriendFlowerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_FlowerNumMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_FlowerNumMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*PlantFlowerGetCanGiveFriendFlowerRsp.p" +
      "roto\"\322\001\n$PlantFlowerGetCanGiveFriendFlow" +
      "erRsp\022O\n\016flower_num_map\030\005 \003(\01327.PlantFlo" +
      "werGetCanGiveFriendFlowerRsp.FlowerNumMa" +
      "pEntry\022\017\n\007retcode\030\003 \001(\005\022\023\n\013schedule_id\030\r" +
      " \001(\r\0323\n\021FlowerNumMapEntry\022\013\n\003key\030\001 \001(\r\022\r" +
      "\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_descriptor,
        new java.lang.String[] { "FlowerNumMap", "Retcode", "ScheduleId", });
    internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_FlowerNumMapEntry_descriptor =
      internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_descriptor.getNestedTypes().get(0);
    internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_FlowerNumMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlantFlowerGetCanGiveFriendFlowerRsp_FlowerNumMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

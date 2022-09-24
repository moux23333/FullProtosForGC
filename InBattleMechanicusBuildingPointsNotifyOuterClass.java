// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusBuildingPointsNotify.proto

package emu.grasscutter.net.proto;

public final class InBattleMechanicusBuildingPointsNotifyOuterClass {
  private InBattleMechanicusBuildingPointsNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusBuildingPointsNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusBuildingPointsNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */
    int getPlayerBuildingPointsMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */
    boolean containsPlayerBuildingPointsMap(
        int key);
    /**
     * Use {@link #getPlayerBuildingPointsMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPlayerBuildingPointsMap();
    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPlayerBuildingPointsMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */

    int getPlayerBuildingPointsMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */

    int getPlayerBuildingPointsMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 5303
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusBuildingPointsNotify}
   */
  public static final class InBattleMechanicusBuildingPointsNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusBuildingPointsNotify)
      InBattleMechanicusBuildingPointsNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusBuildingPointsNotify.newBuilder() to construct.
    private InBattleMechanicusBuildingPointsNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusBuildingPointsNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusBuildingPointsNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBattleMechanicusBuildingPointsNotify(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerBuildingPointsMap_ = com.google.protobuf.MapField.newMapField(
                    PlayerBuildingPointsMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              playerBuildingPointsMap__ = input.readMessage(
                  PlayerBuildingPointsMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              playerBuildingPointsMap_.getMutableMap().put(
                  playerBuildingPointsMap__.getKey(), playerBuildingPointsMap__.getValue());
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
      return emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.internal_static_InBattleMechanicusBuildingPointsNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetPlayerBuildingPointsMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.internal_static_InBattleMechanicusBuildingPointsNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify.class, emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify.Builder.class);
    }

    public static final int PLAYER_BUILDING_POINTS_MAP_FIELD_NUMBER = 4;
    private static final class PlayerBuildingPointsMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.internal_static_InBattleMechanicusBuildingPointsNotify_PlayerBuildingPointsMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> playerBuildingPointsMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetPlayerBuildingPointsMap() {
      if (playerBuildingPointsMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PlayerBuildingPointsMapDefaultEntryHolder.defaultEntry);
      }
      return playerBuildingPointsMap_;
    }

    public int getPlayerBuildingPointsMapCount() {
      return internalGetPlayerBuildingPointsMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */

    @java.lang.Override
    public boolean containsPlayerBuildingPointsMap(
        int key) {
      
      return internalGetPlayerBuildingPointsMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPlayerBuildingPointsMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerBuildingPointsMap() {
      return getPlayerBuildingPointsMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerBuildingPointsMapMap() {
      return internalGetPlayerBuildingPointsMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */
    @java.lang.Override

    public int getPlayerBuildingPointsMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPlayerBuildingPointsMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
     */
    @java.lang.Override

    public int getPlayerBuildingPointsMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPlayerBuildingPointsMap().getMap();
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
          internalGetPlayerBuildingPointsMap(),
          PlayerBuildingPointsMapDefaultEntryHolder.defaultEntry,
          4);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetPlayerBuildingPointsMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        playerBuildingPointsMap__ = PlayerBuildingPointsMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, playerBuildingPointsMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify other = (emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify) obj;

      if (!internalGetPlayerBuildingPointsMap().equals(
          other.internalGetPlayerBuildingPointsMap())) return false;
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
      if (!internalGetPlayerBuildingPointsMap().getMap().isEmpty()) {
        hash = (37 * hash) + PLAYER_BUILDING_POINTS_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPlayerBuildingPointsMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify prototype) {
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
     * CmdId: 5303
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusBuildingPointsNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusBuildingPointsNotify)
        emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.internal_static_InBattleMechanicusBuildingPointsNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetPlayerBuildingPointsMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutablePlayerBuildingPointsMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.internal_static_InBattleMechanicusBuildingPointsNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify.class, emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify.newBuilder()
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
        internalGetMutablePlayerBuildingPointsMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.internal_static_InBattleMechanicusBuildingPointsNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify build() {
        emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify buildPartial() {
        emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify result = new emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify(this);
        int from_bitField0_ = bitField0_;
        result.playerBuildingPointsMap_ = internalGetPlayerBuildingPointsMap();
        result.playerBuildingPointsMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify) {
          return mergeFrom((emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify other) {
        if (other == emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify.getDefaultInstance()) return this;
        internalGetMutablePlayerBuildingPointsMap().mergeFrom(
            other.internalGetPlayerBuildingPointsMap());
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
        emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify) e.getUnfinishedMessage();
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
          java.lang.Integer, java.lang.Integer> playerBuildingPointsMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetPlayerBuildingPointsMap() {
        if (playerBuildingPointsMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PlayerBuildingPointsMapDefaultEntryHolder.defaultEntry);
        }
        return playerBuildingPointsMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutablePlayerBuildingPointsMap() {
        onChanged();;
        if (playerBuildingPointsMap_ == null) {
          playerBuildingPointsMap_ = com.google.protobuf.MapField.newMapField(
              PlayerBuildingPointsMapDefaultEntryHolder.defaultEntry);
        }
        if (!playerBuildingPointsMap_.isMutable()) {
          playerBuildingPointsMap_ = playerBuildingPointsMap_.copy();
        }
        return playerBuildingPointsMap_;
      }

      public int getPlayerBuildingPointsMapCount() {
        return internalGetPlayerBuildingPointsMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
       */

      @java.lang.Override
      public boolean containsPlayerBuildingPointsMap(
          int key) {
        
        return internalGetPlayerBuildingPointsMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPlayerBuildingPointsMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerBuildingPointsMap() {
        return getPlayerBuildingPointsMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerBuildingPointsMapMap() {
        return internalGetPlayerBuildingPointsMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
       */
      @java.lang.Override

      public int getPlayerBuildingPointsMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPlayerBuildingPointsMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
       */
      @java.lang.Override

      public int getPlayerBuildingPointsMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPlayerBuildingPointsMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearPlayerBuildingPointsMap() {
        internalGetMutablePlayerBuildingPointsMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
       */

      public Builder removePlayerBuildingPointsMap(
          int key) {
        
        internalGetMutablePlayerBuildingPointsMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutablePlayerBuildingPointsMap() {
        return internalGetMutablePlayerBuildingPointsMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
       */
      public Builder putPlayerBuildingPointsMap(
          int key,
          int value) {
        
        
        internalGetMutablePlayerBuildingPointsMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_building_points_map = 4;</code>
       */

      public Builder putAllPlayerBuildingPointsMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutablePlayerBuildingPointsMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusBuildingPointsNotify)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusBuildingPointsNotify)
    private static final emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify();
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusBuildingPointsNotify>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusBuildingPointsNotify>() {
      @java.lang.Override
      public InBattleMechanicusBuildingPointsNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InBattleMechanicusBuildingPointsNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InBattleMechanicusBuildingPointsNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusBuildingPointsNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InBattleMechanicusBuildingPointsNotifyOuterClass.InBattleMechanicusBuildingPointsNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusBuildingPointsNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusBuildingPointsNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusBuildingPointsNotify_PlayerBuildingPointsMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusBuildingPointsNotify_PlayerBuildingPointsMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,InBattleMechanicusBuildingPointsNotify" +
      ".proto\"\322\001\n&InBattleMechanicusBuildingPoi" +
      "ntsNotify\022h\n\032player_building_points_map\030" +
      "\004 \003(\0132D.InBattleMechanicusBuildingPoints" +
      "Notify.PlayerBuildingPointsMapEntry\032>\n\034P" +
      "layerBuildingPointsMapEntry\022\013\n\003key\030\001 \001(\r" +
      "\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusBuildingPointsNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusBuildingPointsNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusBuildingPointsNotify_descriptor,
        new java.lang.String[] { "PlayerBuildingPointsMap", });
    internal_static_InBattleMechanicusBuildingPointsNotify_PlayerBuildingPointsMapEntry_descriptor =
      internal_static_InBattleMechanicusBuildingPointsNotify_descriptor.getNestedTypes().get(0);
    internal_static_InBattleMechanicusBuildingPointsNotify_PlayerBuildingPointsMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusBuildingPointsNotify_PlayerBuildingPointsMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

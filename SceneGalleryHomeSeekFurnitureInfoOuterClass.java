// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryHomeSeekFurnitureInfo.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryHomeSeekFurnitureInfoOuterClass {
  private SceneGalleryHomeSeekFurnitureInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryHomeSeekFurnitureInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryHomeSeekFurnitureInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_KDBENBBODGP = 6;</code>
     * @return The unk2700KDBENBBODGP.
     */
    int getUnk2700KDBENBBODGP();

    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */
    int getUnk2700DDHOJHOICBLCount();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */
    boolean containsUnk2700DDHOJHOICBL(
        int key);
    /**
     * Use {@link #getUnk2700DDHOJHOICBLMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUnk2700DDHOJHOICBL();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUnk2700DDHOJHOICBLMap();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */

    int getUnk2700DDHOJHOICBLOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */

    int getUnk2700DDHOJHOICBLOrThrow(
        int key);

    /**
     * <code>uint32 Unk2700_LODFFCPFJLC = 12;</code>
     * @return The unk2700LODFFCPFJLC.
     */
    int getUnk2700LODFFCPFJLC();

    /**
     * <code>uint32 Unk2700_HLCIHCCGFFC = 9;</code>
     * @return The unk2700HLCIHCCGFFC.
     */
    int getUnk2700HLCIHCCGFFC();
  }
  /**
   * Protobuf type {@code SceneGalleryHomeSeekFurnitureInfo}
   */
  public static final class SceneGalleryHomeSeekFurnitureInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryHomeSeekFurnitureInfo)
      SceneGalleryHomeSeekFurnitureInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryHomeSeekFurnitureInfo.newBuilder() to construct.
    private SceneGalleryHomeSeekFurnitureInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryHomeSeekFurnitureInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryHomeSeekFurnitureInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryHomeSeekFurnitureInfo(
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
            case 48: {

              unk2700KDBENBBODGP_ = input.readUInt32();
              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700DDHOJHOICBL_ = com.google.protobuf.MapField.newMapField(
                    Unk2700DDHOJHOICBLDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              unk2700DDHOJHOICBL__ = input.readMessage(
                  Unk2700DDHOJHOICBLDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              unk2700DDHOJHOICBL_.getMutableMap().put(
                  unk2700DDHOJHOICBL__.getKey(), unk2700DDHOJHOICBL__.getValue());
              break;
            }
            case 72: {

              unk2700HLCIHCCGFFC_ = input.readUInt32();
              break;
            }
            case 96: {

              unk2700LODFFCPFJLC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetUnk2700DDHOJHOICBL();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.class, emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.Builder.class);
    }

    public static final int UNK2700_KDBENBBODGP_FIELD_NUMBER = 6;
    private int unk2700KDBENBBODGP_;
    /**
     * <code>uint32 Unk2700_KDBENBBODGP = 6;</code>
     * @return The unk2700KDBENBBODGP.
     */
    @java.lang.Override
    public int getUnk2700KDBENBBODGP() {
      return unk2700KDBENBBODGP_;
    }

    public static final int UNK2700_DDHOJHOICBL_FIELD_NUMBER = 8;
    private static final class Unk2700DDHOJHOICBLDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_Unk2700DDHOJHOICBLEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> unk2700DDHOJHOICBL_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetUnk2700DDHOJHOICBL() {
      if (unk2700DDHOJHOICBL_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            Unk2700DDHOJHOICBLDefaultEntryHolder.defaultEntry);
      }
      return unk2700DDHOJHOICBL_;
    }

    public int getUnk2700DDHOJHOICBLCount() {
      return internalGetUnk2700DDHOJHOICBL().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */

    @java.lang.Override
    public boolean containsUnk2700DDHOJHOICBL(
        int key) {
      
      return internalGetUnk2700DDHOJHOICBL().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUnk2700DDHOJHOICBLMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DDHOJHOICBL() {
      return getUnk2700DDHOJHOICBLMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DDHOJHOICBLMap() {
      return internalGetUnk2700DDHOJHOICBL().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */
    @java.lang.Override

    public int getUnk2700DDHOJHOICBLOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUnk2700DDHOJHOICBL().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
     */
    @java.lang.Override

    public int getUnk2700DDHOJHOICBLOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUnk2700DDHOJHOICBL().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int UNK2700_LODFFCPFJLC_FIELD_NUMBER = 12;
    private int unk2700LODFFCPFJLC_;
    /**
     * <code>uint32 Unk2700_LODFFCPFJLC = 12;</code>
     * @return The unk2700LODFFCPFJLC.
     */
    @java.lang.Override
    public int getUnk2700LODFFCPFJLC() {
      return unk2700LODFFCPFJLC_;
    }

    public static final int UNK2700_HLCIHCCGFFC_FIELD_NUMBER = 9;
    private int unk2700HLCIHCCGFFC_;
    /**
     * <code>uint32 Unk2700_HLCIHCCGFFC = 9;</code>
     * @return The unk2700HLCIHCCGFFC.
     */
    @java.lang.Override
    public int getUnk2700HLCIHCCGFFC() {
      return unk2700HLCIHCCGFFC_;
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
      if (unk2700KDBENBBODGP_ != 0) {
        output.writeUInt32(6, unk2700KDBENBBODGP_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetUnk2700DDHOJHOICBL(),
          Unk2700DDHOJHOICBLDefaultEntryHolder.defaultEntry,
          8);
      if (unk2700HLCIHCCGFFC_ != 0) {
        output.writeUInt32(9, unk2700HLCIHCCGFFC_);
      }
      if (unk2700LODFFCPFJLC_ != 0) {
        output.writeUInt32(12, unk2700LODFFCPFJLC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700KDBENBBODGP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk2700KDBENBBODGP_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetUnk2700DDHOJHOICBL().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        unk2700DDHOJHOICBL__ = Unk2700DDHOJHOICBLDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(8, unk2700DDHOJHOICBL__);
      }
      if (unk2700HLCIHCCGFFC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk2700HLCIHCCGFFC_);
      }
      if (unk2700LODFFCPFJLC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk2700LODFFCPFJLC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo other = (emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo) obj;

      if (getUnk2700KDBENBBODGP()
          != other.getUnk2700KDBENBBODGP()) return false;
      if (!internalGetUnk2700DDHOJHOICBL().equals(
          other.internalGetUnk2700DDHOJHOICBL())) return false;
      if (getUnk2700LODFFCPFJLC()
          != other.getUnk2700LODFFCPFJLC()) return false;
      if (getUnk2700HLCIHCCGFFC()
          != other.getUnk2700HLCIHCCGFFC()) return false;
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
      hash = (37 * hash) + UNK2700_KDBENBBODGP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700KDBENBBODGP();
      if (!internalGetUnk2700DDHOJHOICBL().getMap().isEmpty()) {
        hash = (37 * hash) + UNK2700_DDHOJHOICBL_FIELD_NUMBER;
        hash = (53 * hash) + internalGetUnk2700DDHOJHOICBL().hashCode();
      }
      hash = (37 * hash) + UNK2700_LODFFCPFJLC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700LODFFCPFJLC();
      hash = (37 * hash) + UNK2700_HLCIHCCGFFC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700HLCIHCCGFFC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo prototype) {
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
     * Protobuf type {@code SceneGalleryHomeSeekFurnitureInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryHomeSeekFurnitureInfo)
        emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetUnk2700DDHOJHOICBL();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetMutableUnk2700DDHOJHOICBL();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.class, emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.newBuilder()
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
        unk2700KDBENBBODGP_ = 0;

        internalGetMutableUnk2700DDHOJHOICBL().clear();
        unk2700LODFFCPFJLC_ = 0;

        unk2700HLCIHCCGFFC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo build() {
        emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo result = new emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo(this);
        int from_bitField0_ = bitField0_;
        result.unk2700KDBENBBODGP_ = unk2700KDBENBBODGP_;
        result.unk2700DDHOJHOICBL_ = internalGetUnk2700DDHOJHOICBL();
        result.unk2700DDHOJHOICBL_.makeImmutable();
        result.unk2700LODFFCPFJLC_ = unk2700LODFFCPFJLC_;
        result.unk2700HLCIHCCGFFC_ = unk2700HLCIHCCGFFC_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.getDefaultInstance()) return this;
        if (other.getUnk2700KDBENBBODGP() != 0) {
          setUnk2700KDBENBBODGP(other.getUnk2700KDBENBBODGP());
        }
        internalGetMutableUnk2700DDHOJHOICBL().mergeFrom(
            other.internalGetUnk2700DDHOJHOICBL());
        if (other.getUnk2700LODFFCPFJLC() != 0) {
          setUnk2700LODFFCPFJLC(other.getUnk2700LODFFCPFJLC());
        }
        if (other.getUnk2700HLCIHCCGFFC() != 0) {
          setUnk2700HLCIHCCGFFC(other.getUnk2700HLCIHCCGFFC());
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
        emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int unk2700KDBENBBODGP_ ;
      /**
       * <code>uint32 Unk2700_KDBENBBODGP = 6;</code>
       * @return The unk2700KDBENBBODGP.
       */
      @java.lang.Override
      public int getUnk2700KDBENBBODGP() {
        return unk2700KDBENBBODGP_;
      }
      /**
       * <code>uint32 Unk2700_KDBENBBODGP = 6;</code>
       * @param value The unk2700KDBENBBODGP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KDBENBBODGP(int value) {
        
        unk2700KDBENBBODGP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_KDBENBBODGP = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KDBENBBODGP() {
        
        unk2700KDBENBBODGP_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> unk2700DDHOJHOICBL_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetUnk2700DDHOJHOICBL() {
        if (unk2700DDHOJHOICBL_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              Unk2700DDHOJHOICBLDefaultEntryHolder.defaultEntry);
        }
        return unk2700DDHOJHOICBL_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableUnk2700DDHOJHOICBL() {
        onChanged();;
        if (unk2700DDHOJHOICBL_ == null) {
          unk2700DDHOJHOICBL_ = com.google.protobuf.MapField.newMapField(
              Unk2700DDHOJHOICBLDefaultEntryHolder.defaultEntry);
        }
        if (!unk2700DDHOJHOICBL_.isMutable()) {
          unk2700DDHOJHOICBL_ = unk2700DDHOJHOICBL_.copy();
        }
        return unk2700DDHOJHOICBL_;
      }

      public int getUnk2700DDHOJHOICBLCount() {
        return internalGetUnk2700DDHOJHOICBL().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
       */

      @java.lang.Override
      public boolean containsUnk2700DDHOJHOICBL(
          int key) {
        
        return internalGetUnk2700DDHOJHOICBL().getMap().containsKey(key);
      }
      /**
       * Use {@link #getUnk2700DDHOJHOICBLMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DDHOJHOICBL() {
        return getUnk2700DDHOJHOICBLMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DDHOJHOICBLMap() {
        return internalGetUnk2700DDHOJHOICBL().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
       */
      @java.lang.Override

      public int getUnk2700DDHOJHOICBLOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUnk2700DDHOJHOICBL().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
       */
      @java.lang.Override

      public int getUnk2700DDHOJHOICBLOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUnk2700DDHOJHOICBL().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearUnk2700DDHOJHOICBL() {
        internalGetMutableUnk2700DDHOJHOICBL().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
       */

      public Builder removeUnk2700DDHOJHOICBL(
          int key) {
        
        internalGetMutableUnk2700DDHOJHOICBL().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableUnk2700DDHOJHOICBL() {
        return internalGetMutableUnk2700DDHOJHOICBL().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
       */
      public Builder putUnk2700DDHOJHOICBL(
          int key,
          int value) {
        
        
        internalGetMutableUnk2700DDHOJHOICBL().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DDHOJHOICBL = 8;</code>
       */

      public Builder putAllUnk2700DDHOJHOICBL(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableUnk2700DDHOJHOICBL().getMutableMap()
            .putAll(values);
        return this;
      }

      private int unk2700LODFFCPFJLC_ ;
      /**
       * <code>uint32 Unk2700_LODFFCPFJLC = 12;</code>
       * @return The unk2700LODFFCPFJLC.
       */
      @java.lang.Override
      public int getUnk2700LODFFCPFJLC() {
        return unk2700LODFFCPFJLC_;
      }
      /**
       * <code>uint32 Unk2700_LODFFCPFJLC = 12;</code>
       * @param value The unk2700LODFFCPFJLC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700LODFFCPFJLC(int value) {
        
        unk2700LODFFCPFJLC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_LODFFCPFJLC = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700LODFFCPFJLC() {
        
        unk2700LODFFCPFJLC_ = 0;
        onChanged();
        return this;
      }

      private int unk2700HLCIHCCGFFC_ ;
      /**
       * <code>uint32 Unk2700_HLCIHCCGFFC = 9;</code>
       * @return The unk2700HLCIHCCGFFC.
       */
      @java.lang.Override
      public int getUnk2700HLCIHCCGFFC() {
        return unk2700HLCIHCCGFFC_;
      }
      /**
       * <code>uint32 Unk2700_HLCIHCCGFFC = 9;</code>
       * @param value The unk2700HLCIHCCGFFC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700HLCIHCCGFFC(int value) {
        
        unk2700HLCIHCCGFFC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_HLCIHCCGFFC = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700HLCIHCCGFFC() {
        
        unk2700HLCIHCCGFFC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryHomeSeekFurnitureInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryHomeSeekFurnitureInfo)
    private static final emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo();
    }

    public static emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryHomeSeekFurnitureInfo>() {
      @java.lang.Override
      public SceneGalleryHomeSeekFurnitureInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryHomeSeekFurnitureInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryHomeSeekFurnitureInfo_Unk2700DDHOJHOICBLEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryHomeSeekFurnitureInfo_Unk2700DDHOJHOICBLEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SceneGalleryHomeSeekFurnitureInfo.prot" +
      "o\"\216\002\n!SceneGalleryHomeSeekFurnitureInfo\022" +
      "\033\n\023Unk2700_KDBENBBODGP\030\006 \001(\r\022W\n\023Unk2700_" +
      "DDHOJHOICBL\030\010 \003(\0132:.SceneGalleryHomeSeek" +
      "FurnitureInfo.Unk2700DDHOJHOICBLEntry\022\033\n" +
      "\023Unk2700_LODFFCPFJLC\030\014 \001(\r\022\033\n\023Unk2700_HL" +
      "CIHCCGFFC\030\t \001(\r\0329\n\027Unk2700DDHOJHOICBLEnt" +
      "ry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor,
        new java.lang.String[] { "Unk2700KDBENBBODGP", "Unk2700DDHOJHOICBL", "Unk2700LODFFCPFJLC", "Unk2700HLCIHCCGFFC", });
    internal_static_SceneGalleryHomeSeekFurnitureInfo_Unk2700DDHOJHOICBLEntry_descriptor =
      internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor.getNestedTypes().get(0);
    internal_static_SceneGalleryHomeSeekFurnitureInfo_Unk2700DDHOJHOICBLEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryHomeSeekFurnitureInfo_Unk2700DDHOJHOICBLEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

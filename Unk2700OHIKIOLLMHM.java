// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_OHIKIOLLMHM.proto

package emu.grasscutter.net.proto;

public final class Unk2700OHIKIOLLMHM {
  private Unk2700OHIKIOLLMHM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_OHIKIOLLMHMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_OHIKIOLLMHM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 5;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 schedule_id = 1;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */
    int getUnk2700IFCNGIPPOAECount();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */
    boolean containsUnk2700IFCNGIPPOAE(
        int key);
    /**
     * Use {@link #getUnk2700IFCNGIPPOAEMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUnk2700IFCNGIPPOAE();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUnk2700IFCNGIPPOAEMap();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */

    int getUnk2700IFCNGIPPOAEOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */

    int getUnk2700IFCNGIPPOAEOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 8233
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_OHIKIOLLMHM}
   */
  public static final class Unk2700_OHIKIOLLMHM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_OHIKIOLLMHM)
      Unk2700_OHIKIOLLMHMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_OHIKIOLLMHM.newBuilder() to construct.
    private Unk2700_OHIKIOLLMHM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_OHIKIOLLMHM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_OHIKIOLLMHM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_OHIKIOLLMHM(
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
            case 8: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700IFCNGIPPOAE_ = com.google.protobuf.MapField.newMapField(
                    Unk2700IFCNGIPPOAEDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              unk2700IFCNGIPPOAE__ = input.readMessage(
                  Unk2700IFCNGIPPOAEDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              unk2700IFCNGIPPOAE_.getMutableMap().put(
                  unk2700IFCNGIPPOAE__.getKey(), unk2700IFCNGIPPOAE__.getValue());
              break;
            }
            case 40: {

              uid_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.internal_static_Unk2700_OHIKIOLLMHM_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetUnk2700IFCNGIPPOAE();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.internal_static_Unk2700_OHIKIOLLMHM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM.class, emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 5;
    private int uid_;
    /**
     * <code>uint32 uid = 5;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 1;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 1;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int UNK2700_IFCNGIPPOAE_FIELD_NUMBER = 4;
    private static final class Unk2700IFCNGIPPOAEDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.internal_static_Unk2700_OHIKIOLLMHM_Unk2700IFCNGIPPOAEEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> unk2700IFCNGIPPOAE_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetUnk2700IFCNGIPPOAE() {
      if (unk2700IFCNGIPPOAE_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            Unk2700IFCNGIPPOAEDefaultEntryHolder.defaultEntry);
      }
      return unk2700IFCNGIPPOAE_;
    }

    public int getUnk2700IFCNGIPPOAECount() {
      return internalGetUnk2700IFCNGIPPOAE().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */

    @java.lang.Override
    public boolean containsUnk2700IFCNGIPPOAE(
        int key) {
      
      return internalGetUnk2700IFCNGIPPOAE().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUnk2700IFCNGIPPOAEMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700IFCNGIPPOAE() {
      return getUnk2700IFCNGIPPOAEMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700IFCNGIPPOAEMap() {
      return internalGetUnk2700IFCNGIPPOAE().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */
    @java.lang.Override

    public int getUnk2700IFCNGIPPOAEOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUnk2700IFCNGIPPOAE().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
     */
    @java.lang.Override

    public int getUnk2700IFCNGIPPOAEOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUnk2700IFCNGIPPOAE().getMap();
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
      if (scheduleId_ != 0) {
        output.writeUInt32(1, scheduleId_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetUnk2700IFCNGIPPOAE(),
          Unk2700IFCNGIPPOAEDefaultEntryHolder.defaultEntry,
          4);
      if (uid_ != 0) {
        output.writeUInt32(5, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, scheduleId_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetUnk2700IFCNGIPPOAE().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        unk2700IFCNGIPPOAE__ = Unk2700IFCNGIPPOAEDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, unk2700IFCNGIPPOAE__);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM other = (emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM) obj;

      if (getUid()
          != other.getUid()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (!internalGetUnk2700IFCNGIPPOAE().equals(
          other.internalGetUnk2700IFCNGIPPOAE())) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      if (!internalGetUnk2700IFCNGIPPOAE().getMap().isEmpty()) {
        hash = (37 * hash) + UNK2700_IFCNGIPPOAE_FIELD_NUMBER;
        hash = (53 * hash) + internalGetUnk2700IFCNGIPPOAE().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM prototype) {
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
     * CmdId: 8233
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_OHIKIOLLMHM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_OHIKIOLLMHM)
        emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.internal_static_Unk2700_OHIKIOLLMHM_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetUnk2700IFCNGIPPOAE();
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
            return internalGetMutableUnk2700IFCNGIPPOAE();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.internal_static_Unk2700_OHIKIOLLMHM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM.class, emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM.newBuilder()
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
        uid_ = 0;

        scheduleId_ = 0;

        internalGetMutableUnk2700IFCNGIPPOAE().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.internal_static_Unk2700_OHIKIOLLMHM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM build() {
        emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM buildPartial() {
        emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM result = new emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM(this);
        int from_bitField0_ = bitField0_;
        result.uid_ = uid_;
        result.scheduleId_ = scheduleId_;
        result.unk2700IFCNGIPPOAE_ = internalGetUnk2700IFCNGIPPOAE();
        result.unk2700IFCNGIPPOAE_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM other) {
        if (other == emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        internalGetMutableUnk2700IFCNGIPPOAE().mergeFrom(
            other.internalGetUnk2700IFCNGIPPOAE());
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
        emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int uid_ ;
      /**
       * <code>uint32 uid = 5;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 5;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 1;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 1;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> unk2700IFCNGIPPOAE_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetUnk2700IFCNGIPPOAE() {
        if (unk2700IFCNGIPPOAE_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              Unk2700IFCNGIPPOAEDefaultEntryHolder.defaultEntry);
        }
        return unk2700IFCNGIPPOAE_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableUnk2700IFCNGIPPOAE() {
        onChanged();;
        if (unk2700IFCNGIPPOAE_ == null) {
          unk2700IFCNGIPPOAE_ = com.google.protobuf.MapField.newMapField(
              Unk2700IFCNGIPPOAEDefaultEntryHolder.defaultEntry);
        }
        if (!unk2700IFCNGIPPOAE_.isMutable()) {
          unk2700IFCNGIPPOAE_ = unk2700IFCNGIPPOAE_.copy();
        }
        return unk2700IFCNGIPPOAE_;
      }

      public int getUnk2700IFCNGIPPOAECount() {
        return internalGetUnk2700IFCNGIPPOAE().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
       */

      @java.lang.Override
      public boolean containsUnk2700IFCNGIPPOAE(
          int key) {
        
        return internalGetUnk2700IFCNGIPPOAE().getMap().containsKey(key);
      }
      /**
       * Use {@link #getUnk2700IFCNGIPPOAEMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700IFCNGIPPOAE() {
        return getUnk2700IFCNGIPPOAEMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700IFCNGIPPOAEMap() {
        return internalGetUnk2700IFCNGIPPOAE().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
       */
      @java.lang.Override

      public int getUnk2700IFCNGIPPOAEOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUnk2700IFCNGIPPOAE().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
       */
      @java.lang.Override

      public int getUnk2700IFCNGIPPOAEOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUnk2700IFCNGIPPOAE().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearUnk2700IFCNGIPPOAE() {
        internalGetMutableUnk2700IFCNGIPPOAE().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
       */

      public Builder removeUnk2700IFCNGIPPOAE(
          int key) {
        
        internalGetMutableUnk2700IFCNGIPPOAE().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableUnk2700IFCNGIPPOAE() {
        return internalGetMutableUnk2700IFCNGIPPOAE().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
       */
      public Builder putUnk2700IFCNGIPPOAE(
          int key,
          int value) {
        
        
        internalGetMutableUnk2700IFCNGIPPOAE().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_IFCNGIPPOAE = 4;</code>
       */

      public Builder putAllUnk2700IFCNGIPPOAE(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableUnk2700IFCNGIPPOAE().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:Unk2700_OHIKIOLLMHM)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_OHIKIOLLMHM)
    private static final emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM();
    }

    public static emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_OHIKIOLLMHM>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_OHIKIOLLMHM>() {
      @java.lang.Override
      public Unk2700_OHIKIOLLMHM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_OHIKIOLLMHM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_OHIKIOLLMHM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_OHIKIOLLMHM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700OHIKIOLLMHM.Unk2700_OHIKIOLLMHM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_OHIKIOLLMHM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_OHIKIOLLMHM_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_OHIKIOLLMHM_Unk2700IFCNGIPPOAEEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_OHIKIOLLMHM_Unk2700IFCNGIPPOAEEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_OHIKIOLLMHM.proto\"\275\001\n\023Unk2700_" +
      "OHIKIOLLMHM\022\013\n\003uid\030\005 \001(\r\022\023\n\013schedule_id\030" +
      "\001 \001(\r\022I\n\023Unk2700_IFCNGIPPOAE\030\004 \003(\0132,.Unk" +
      "2700_OHIKIOLLMHM.Unk2700IFCNGIPPOAEEntry" +
      "\0329\n\027Unk2700IFCNGIPPOAEEntry\022\013\n\003key\030\001 \001(\r" +
      "\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_OHIKIOLLMHM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_OHIKIOLLMHM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_OHIKIOLLMHM_descriptor,
        new java.lang.String[] { "Uid", "ScheduleId", "Unk2700IFCNGIPPOAE", });
    internal_static_Unk2700_OHIKIOLLMHM_Unk2700IFCNGIPPOAEEntry_descriptor =
      internal_static_Unk2700_OHIKIOLLMHM_descriptor.getNestedTypes().get(0);
    internal_static_Unk2700_OHIKIOLLMHM_Unk2700IFCNGIPPOAEEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_OHIKIOLLMHM_Unk2700IFCNGIPPOAEEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

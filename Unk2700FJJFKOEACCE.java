// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_FJJFKOEACCE.proto

package emu.grasscutter.net.proto;

public final class Unk2700FJJFKOEACCE {
  private Unk2700FJJFKOEACCE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_FJJFKOEACCEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_FJJFKOEACCE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_EMPNNJKDMHE = 14;</code>
     * @return The unk2700EMPNNJKDMHE.
     */
    int getUnk2700EMPNNJKDMHE();

    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */
    int getUnk2700DNMNEMKIELDCount();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */
    boolean containsUnk2700DNMNEMKIELD(
        int key);
    /**
     * Use {@link #getUnk2700DNMNEMKIELDMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUnk2700DNMNEMKIELD();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUnk2700DNMNEMKIELDMap();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */

    int getUnk2700DNMNEMKIELDOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */

    int getUnk2700DNMNEMKIELDOrThrow(
        int key);

    /**
     * <code>uint32 Unk2700_GKBGMLGFIBN = 2;</code>
     * @return The unk2700GKBGMLGFIBN.
     */
    int getUnk2700GKBGMLGFIBN();

    /**
     * <code>uint32 Unk2700_OGHMDKMIKBK = 13;</code>
     * @return The unk2700OGHMDKMIKBK.
     */
    int getUnk2700OGHMDKMIKBK();
  }
  /**
   * <pre>
   * CmdId: 8450
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_FJJFKOEACCE}
   */
  public static final class Unk2700_FJJFKOEACCE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_FJJFKOEACCE)
      Unk2700_FJJFKOEACCEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_FJJFKOEACCE.newBuilder() to construct.
    private Unk2700_FJJFKOEACCE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_FJJFKOEACCE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_FJJFKOEACCE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_FJJFKOEACCE(
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
            case 16: {

              unk2700GKBGMLGFIBN_ = input.readUInt32();
              break;
            }
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700DNMNEMKIELD_ = com.google.protobuf.MapField.newMapField(
                    Unk2700DNMNEMKIELDDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              unk2700DNMNEMKIELD__ = input.readMessage(
                  Unk2700DNMNEMKIELDDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              unk2700DNMNEMKIELD_.getMutableMap().put(
                  unk2700DNMNEMKIELD__.getKey(), unk2700DNMNEMKIELD__.getValue());
              break;
            }
            case 104: {

              unk2700OGHMDKMIKBK_ = input.readUInt32();
              break;
            }
            case 112: {

              unk2700EMPNNJKDMHE_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.internal_static_Unk2700_FJJFKOEACCE_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetUnk2700DNMNEMKIELD();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.internal_static_Unk2700_FJJFKOEACCE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE.class, emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE.Builder.class);
    }

    public static final int UNK2700_EMPNNJKDMHE_FIELD_NUMBER = 14;
    private int unk2700EMPNNJKDMHE_;
    /**
     * <code>uint32 Unk2700_EMPNNJKDMHE = 14;</code>
     * @return The unk2700EMPNNJKDMHE.
     */
    @java.lang.Override
    public int getUnk2700EMPNNJKDMHE() {
      return unk2700EMPNNJKDMHE_;
    }

    public static final int UNK2700_DNMNEMKIELD_FIELD_NUMBER = 6;
    private static final class Unk2700DNMNEMKIELDDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.internal_static_Unk2700_FJJFKOEACCE_Unk2700DNMNEMKIELDEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> unk2700DNMNEMKIELD_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetUnk2700DNMNEMKIELD() {
      if (unk2700DNMNEMKIELD_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            Unk2700DNMNEMKIELDDefaultEntryHolder.defaultEntry);
      }
      return unk2700DNMNEMKIELD_;
    }

    public int getUnk2700DNMNEMKIELDCount() {
      return internalGetUnk2700DNMNEMKIELD().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */

    @java.lang.Override
    public boolean containsUnk2700DNMNEMKIELD(
        int key) {
      
      return internalGetUnk2700DNMNEMKIELD().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUnk2700DNMNEMKIELDMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DNMNEMKIELD() {
      return getUnk2700DNMNEMKIELDMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DNMNEMKIELDMap() {
      return internalGetUnk2700DNMNEMKIELD().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */
    @java.lang.Override

    public int getUnk2700DNMNEMKIELDOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUnk2700DNMNEMKIELD().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
     */
    @java.lang.Override

    public int getUnk2700DNMNEMKIELDOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUnk2700DNMNEMKIELD().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int UNK2700_GKBGMLGFIBN_FIELD_NUMBER = 2;
    private int unk2700GKBGMLGFIBN_;
    /**
     * <code>uint32 Unk2700_GKBGMLGFIBN = 2;</code>
     * @return The unk2700GKBGMLGFIBN.
     */
    @java.lang.Override
    public int getUnk2700GKBGMLGFIBN() {
      return unk2700GKBGMLGFIBN_;
    }

    public static final int UNK2700_OGHMDKMIKBK_FIELD_NUMBER = 13;
    private int unk2700OGHMDKMIKBK_;
    /**
     * <code>uint32 Unk2700_OGHMDKMIKBK = 13;</code>
     * @return The unk2700OGHMDKMIKBK.
     */
    @java.lang.Override
    public int getUnk2700OGHMDKMIKBK() {
      return unk2700OGHMDKMIKBK_;
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
      if (unk2700GKBGMLGFIBN_ != 0) {
        output.writeUInt32(2, unk2700GKBGMLGFIBN_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetUnk2700DNMNEMKIELD(),
          Unk2700DNMNEMKIELDDefaultEntryHolder.defaultEntry,
          6);
      if (unk2700OGHMDKMIKBK_ != 0) {
        output.writeUInt32(13, unk2700OGHMDKMIKBK_);
      }
      if (unk2700EMPNNJKDMHE_ != 0) {
        output.writeUInt32(14, unk2700EMPNNJKDMHE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700GKBGMLGFIBN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk2700GKBGMLGFIBN_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetUnk2700DNMNEMKIELD().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        unk2700DNMNEMKIELD__ = Unk2700DNMNEMKIELDDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(6, unk2700DNMNEMKIELD__);
      }
      if (unk2700OGHMDKMIKBK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk2700OGHMDKMIKBK_);
      }
      if (unk2700EMPNNJKDMHE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk2700EMPNNJKDMHE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE other = (emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE) obj;

      if (getUnk2700EMPNNJKDMHE()
          != other.getUnk2700EMPNNJKDMHE()) return false;
      if (!internalGetUnk2700DNMNEMKIELD().equals(
          other.internalGetUnk2700DNMNEMKIELD())) return false;
      if (getUnk2700GKBGMLGFIBN()
          != other.getUnk2700GKBGMLGFIBN()) return false;
      if (getUnk2700OGHMDKMIKBK()
          != other.getUnk2700OGHMDKMIKBK()) return false;
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
      hash = (37 * hash) + UNK2700_EMPNNJKDMHE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700EMPNNJKDMHE();
      if (!internalGetUnk2700DNMNEMKIELD().getMap().isEmpty()) {
        hash = (37 * hash) + UNK2700_DNMNEMKIELD_FIELD_NUMBER;
        hash = (53 * hash) + internalGetUnk2700DNMNEMKIELD().hashCode();
      }
      hash = (37 * hash) + UNK2700_GKBGMLGFIBN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700GKBGMLGFIBN();
      hash = (37 * hash) + UNK2700_OGHMDKMIKBK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700OGHMDKMIKBK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE prototype) {
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
     * CmdId: 8450
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_FJJFKOEACCE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_FJJFKOEACCE)
        emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.internal_static_Unk2700_FJJFKOEACCE_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetUnk2700DNMNEMKIELD();
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
            return internalGetMutableUnk2700DNMNEMKIELD();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.internal_static_Unk2700_FJJFKOEACCE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE.class, emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE.newBuilder()
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
        unk2700EMPNNJKDMHE_ = 0;

        internalGetMutableUnk2700DNMNEMKIELD().clear();
        unk2700GKBGMLGFIBN_ = 0;

        unk2700OGHMDKMIKBK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.internal_static_Unk2700_FJJFKOEACCE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE build() {
        emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE buildPartial() {
        emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE result = new emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE(this);
        int from_bitField0_ = bitField0_;
        result.unk2700EMPNNJKDMHE_ = unk2700EMPNNJKDMHE_;
        result.unk2700DNMNEMKIELD_ = internalGetUnk2700DNMNEMKIELD();
        result.unk2700DNMNEMKIELD_.makeImmutable();
        result.unk2700GKBGMLGFIBN_ = unk2700GKBGMLGFIBN_;
        result.unk2700OGHMDKMIKBK_ = unk2700OGHMDKMIKBK_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE other) {
        if (other == emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE.getDefaultInstance()) return this;
        if (other.getUnk2700EMPNNJKDMHE() != 0) {
          setUnk2700EMPNNJKDMHE(other.getUnk2700EMPNNJKDMHE());
        }
        internalGetMutableUnk2700DNMNEMKIELD().mergeFrom(
            other.internalGetUnk2700DNMNEMKIELD());
        if (other.getUnk2700GKBGMLGFIBN() != 0) {
          setUnk2700GKBGMLGFIBN(other.getUnk2700GKBGMLGFIBN());
        }
        if (other.getUnk2700OGHMDKMIKBK() != 0) {
          setUnk2700OGHMDKMIKBK(other.getUnk2700OGHMDKMIKBK());
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
        emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int unk2700EMPNNJKDMHE_ ;
      /**
       * <code>uint32 Unk2700_EMPNNJKDMHE = 14;</code>
       * @return The unk2700EMPNNJKDMHE.
       */
      @java.lang.Override
      public int getUnk2700EMPNNJKDMHE() {
        return unk2700EMPNNJKDMHE_;
      }
      /**
       * <code>uint32 Unk2700_EMPNNJKDMHE = 14;</code>
       * @param value The unk2700EMPNNJKDMHE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700EMPNNJKDMHE(int value) {
        
        unk2700EMPNNJKDMHE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_EMPNNJKDMHE = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700EMPNNJKDMHE() {
        
        unk2700EMPNNJKDMHE_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> unk2700DNMNEMKIELD_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetUnk2700DNMNEMKIELD() {
        if (unk2700DNMNEMKIELD_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              Unk2700DNMNEMKIELDDefaultEntryHolder.defaultEntry);
        }
        return unk2700DNMNEMKIELD_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableUnk2700DNMNEMKIELD() {
        onChanged();;
        if (unk2700DNMNEMKIELD_ == null) {
          unk2700DNMNEMKIELD_ = com.google.protobuf.MapField.newMapField(
              Unk2700DNMNEMKIELDDefaultEntryHolder.defaultEntry);
        }
        if (!unk2700DNMNEMKIELD_.isMutable()) {
          unk2700DNMNEMKIELD_ = unk2700DNMNEMKIELD_.copy();
        }
        return unk2700DNMNEMKIELD_;
      }

      public int getUnk2700DNMNEMKIELDCount() {
        return internalGetUnk2700DNMNEMKIELD().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
       */

      @java.lang.Override
      public boolean containsUnk2700DNMNEMKIELD(
          int key) {
        
        return internalGetUnk2700DNMNEMKIELD().getMap().containsKey(key);
      }
      /**
       * Use {@link #getUnk2700DNMNEMKIELDMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DNMNEMKIELD() {
        return getUnk2700DNMNEMKIELDMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DNMNEMKIELDMap() {
        return internalGetUnk2700DNMNEMKIELD().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
       */
      @java.lang.Override

      public int getUnk2700DNMNEMKIELDOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUnk2700DNMNEMKIELD().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
       */
      @java.lang.Override

      public int getUnk2700DNMNEMKIELDOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUnk2700DNMNEMKIELD().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearUnk2700DNMNEMKIELD() {
        internalGetMutableUnk2700DNMNEMKIELD().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
       */

      public Builder removeUnk2700DNMNEMKIELD(
          int key) {
        
        internalGetMutableUnk2700DNMNEMKIELD().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableUnk2700DNMNEMKIELD() {
        return internalGetMutableUnk2700DNMNEMKIELD().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
       */
      public Builder putUnk2700DNMNEMKIELD(
          int key,
          int value) {
        
        
        internalGetMutableUnk2700DNMNEMKIELD().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DNMNEMKIELD = 6;</code>
       */

      public Builder putAllUnk2700DNMNEMKIELD(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableUnk2700DNMNEMKIELD().getMutableMap()
            .putAll(values);
        return this;
      }

      private int unk2700GKBGMLGFIBN_ ;
      /**
       * <code>uint32 Unk2700_GKBGMLGFIBN = 2;</code>
       * @return The unk2700GKBGMLGFIBN.
       */
      @java.lang.Override
      public int getUnk2700GKBGMLGFIBN() {
        return unk2700GKBGMLGFIBN_;
      }
      /**
       * <code>uint32 Unk2700_GKBGMLGFIBN = 2;</code>
       * @param value The unk2700GKBGMLGFIBN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700GKBGMLGFIBN(int value) {
        
        unk2700GKBGMLGFIBN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_GKBGMLGFIBN = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700GKBGMLGFIBN() {
        
        unk2700GKBGMLGFIBN_ = 0;
        onChanged();
        return this;
      }

      private int unk2700OGHMDKMIKBK_ ;
      /**
       * <code>uint32 Unk2700_OGHMDKMIKBK = 13;</code>
       * @return The unk2700OGHMDKMIKBK.
       */
      @java.lang.Override
      public int getUnk2700OGHMDKMIKBK() {
        return unk2700OGHMDKMIKBK_;
      }
      /**
       * <code>uint32 Unk2700_OGHMDKMIKBK = 13;</code>
       * @param value The unk2700OGHMDKMIKBK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700OGHMDKMIKBK(int value) {
        
        unk2700OGHMDKMIKBK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_OGHMDKMIKBK = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700OGHMDKMIKBK() {
        
        unk2700OGHMDKMIKBK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_FJJFKOEACCE)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_FJJFKOEACCE)
    private static final emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE();
    }

    public static emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_FJJFKOEACCE>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_FJJFKOEACCE>() {
      @java.lang.Override
      public Unk2700_FJJFKOEACCE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_FJJFKOEACCE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_FJJFKOEACCE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_FJJFKOEACCE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700FJJFKOEACCE.Unk2700_FJJFKOEACCE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_FJJFKOEACCE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_FJJFKOEACCE_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_FJJFKOEACCE_Unk2700DNMNEMKIELDEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_FJJFKOEACCE_Unk2700DNMNEMKIELDEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_FJJFKOEACCE.proto\"\362\001\n\023Unk2700_" +
      "FJJFKOEACCE\022\033\n\023Unk2700_EMPNNJKDMHE\030\016 \001(\r" +
      "\022I\n\023Unk2700_DNMNEMKIELD\030\006 \003(\0132,.Unk2700_" +
      "FJJFKOEACCE.Unk2700DNMNEMKIELDEntry\022\033\n\023U" +
      "nk2700_GKBGMLGFIBN\030\002 \001(\r\022\033\n\023Unk2700_OGHM" +
      "DKMIKBK\030\r \001(\r\0329\n\027Unk2700DNMNEMKIELDEntry" +
      "\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_FJJFKOEACCE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_FJJFKOEACCE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_FJJFKOEACCE_descriptor,
        new java.lang.String[] { "Unk2700EMPNNJKDMHE", "Unk2700DNMNEMKIELD", "Unk2700GKBGMLGFIBN", "Unk2700OGHMDKMIKBK", });
    internal_static_Unk2700_FJJFKOEACCE_Unk2700DNMNEMKIELDEntry_descriptor =
      internal_static_Unk2700_FJJFKOEACCE_descriptor.getNestedTypes().get(0);
    internal_static_Unk2700_FJJFKOEACCE_Unk2700DNMNEMKIELDEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_FJJFKOEACCE_Unk2700DNMNEMKIELDEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

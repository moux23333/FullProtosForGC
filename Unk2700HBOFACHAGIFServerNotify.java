// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_HBOFACHAGIF_ServerNotify.proto

package emu.grasscutter.net.proto;

public final class Unk2700HBOFACHAGIFServerNotify {
  private Unk2700HBOFACHAGIFServerNotify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_HBOFACHAGIF_ServerNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_HBOFACHAGIF_ServerNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */
    int getUnk2700MEANPNKMDFGCount();
    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */
    boolean containsUnk2700MEANPNKMDFG(
        int key);
    /**
     * Use {@link #getUnk2700MEANPNKMDFGMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>
    getUnk2700MEANPNKMDFG();
    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>
    getUnk2700MEANPNKMDFGMap();
    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */

    emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getUnk2700MEANPNKMDFGOrDefault(
        int key,
        emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD defaultValue);
    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */

    emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getUnk2700MEANPNKMDFGOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 9072
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_HBOFACHAGIF_ServerNotify}
   */
  public static final class Unk2700_HBOFACHAGIF_ServerNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_HBOFACHAGIF_ServerNotify)
      Unk2700_HBOFACHAGIF_ServerNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_HBOFACHAGIF_ServerNotify.newBuilder() to construct.
    private Unk2700_HBOFACHAGIF_ServerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_HBOFACHAGIF_ServerNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_HBOFACHAGIF_ServerNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_HBOFACHAGIF_ServerNotify(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700MEANPNKMDFG_ = com.google.protobuf.MapField.newMapField(
                    Unk2700MEANPNKMDFGDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>
              unk2700MEANPNKMDFG__ = input.readMessage(
                  Unk2700MEANPNKMDFGDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              unk2700MEANPNKMDFG_.getMutableMap().put(
                  unk2700MEANPNKMDFG__.getKey(), unk2700MEANPNKMDFG__.getValue());
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
      return emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.internal_static_Unk2700_HBOFACHAGIF_ServerNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetUnk2700MEANPNKMDFG();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.internal_static_Unk2700_HBOFACHAGIF_ServerNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify.class, emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify.Builder.class);
    }

    public static final int UNK2700_MEANPNKMDFG_FIELD_NUMBER = 2;
    private static final class Unk2700MEANPNKMDFGDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>newDefaultInstance(
                  emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.internal_static_Unk2700_HBOFACHAGIF_ServerNotify_Unk2700MEANPNKMDFGEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> unk2700MEANPNKMDFG_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>
    internalGetUnk2700MEANPNKMDFG() {
      if (unk2700MEANPNKMDFG_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            Unk2700MEANPNKMDFGDefaultEntryHolder.defaultEntry);
      }
      return unk2700MEANPNKMDFG_;
    }

    public int getUnk2700MEANPNKMDFGCount() {
      return internalGetUnk2700MEANPNKMDFG().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */

    @java.lang.Override
    public boolean containsUnk2700MEANPNKMDFG(
        int key) {
      
      return internalGetUnk2700MEANPNKMDFG().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUnk2700MEANPNKMDFGMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> getUnk2700MEANPNKMDFG() {
      return getUnk2700MEANPNKMDFGMap();
    }
    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> getUnk2700MEANPNKMDFGMap() {
      return internalGetUnk2700MEANPNKMDFG().getMap();
    }
    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getUnk2700MEANPNKMDFGOrDefault(
        int key,
        emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> map =
          internalGetUnk2700MEANPNKMDFG().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getUnk2700MEANPNKMDFGOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> map =
          internalGetUnk2700MEANPNKMDFG().getMap();
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
          internalGetUnk2700MEANPNKMDFG(),
          Unk2700MEANPNKMDFGDefaultEntryHolder.defaultEntry,
          2);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> entry
           : internalGetUnk2700MEANPNKMDFG().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>
        unk2700MEANPNKMDFG__ = Unk2700MEANPNKMDFGDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, unk2700MEANPNKMDFG__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify other = (emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify) obj;

      if (!internalGetUnk2700MEANPNKMDFG().equals(
          other.internalGetUnk2700MEANPNKMDFG())) return false;
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
      if (!internalGetUnk2700MEANPNKMDFG().getMap().isEmpty()) {
        hash = (37 * hash) + UNK2700_MEANPNKMDFG_FIELD_NUMBER;
        hash = (53 * hash) + internalGetUnk2700MEANPNKMDFG().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify prototype) {
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
     * CmdId: 9072
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_HBOFACHAGIF_ServerNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_HBOFACHAGIF_ServerNotify)
        emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.internal_static_Unk2700_HBOFACHAGIF_ServerNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetUnk2700MEANPNKMDFG();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableUnk2700MEANPNKMDFG();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.internal_static_Unk2700_HBOFACHAGIF_ServerNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify.class, emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify.newBuilder()
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
        internalGetMutableUnk2700MEANPNKMDFG().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.internal_static_Unk2700_HBOFACHAGIF_ServerNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify build() {
        emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify buildPartial() {
        emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify result = new emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify(this);
        int from_bitField0_ = bitField0_;
        result.unk2700MEANPNKMDFG_ = internalGetUnk2700MEANPNKMDFG();
        result.unk2700MEANPNKMDFG_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify other) {
        if (other == emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify.getDefaultInstance()) return this;
        internalGetMutableUnk2700MEANPNKMDFG().mergeFrom(
            other.internalGetUnk2700MEANPNKMDFG());
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
        emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify) e.getUnfinishedMessage();
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
          java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> unk2700MEANPNKMDFG_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>
      internalGetUnk2700MEANPNKMDFG() {
        if (unk2700MEANPNKMDFG_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              Unk2700MEANPNKMDFGDefaultEntryHolder.defaultEntry);
        }
        return unk2700MEANPNKMDFG_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>
      internalGetMutableUnk2700MEANPNKMDFG() {
        onChanged();;
        if (unk2700MEANPNKMDFG_ == null) {
          unk2700MEANPNKMDFG_ = com.google.protobuf.MapField.newMapField(
              Unk2700MEANPNKMDFGDefaultEntryHolder.defaultEntry);
        }
        if (!unk2700MEANPNKMDFG_.isMutable()) {
          unk2700MEANPNKMDFG_ = unk2700MEANPNKMDFG_.copy();
        }
        return unk2700MEANPNKMDFG_;
      }

      public int getUnk2700MEANPNKMDFGCount() {
        return internalGetUnk2700MEANPNKMDFG().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
       */

      @java.lang.Override
      public boolean containsUnk2700MEANPNKMDFG(
          int key) {
        
        return internalGetUnk2700MEANPNKMDFG().getMap().containsKey(key);
      }
      /**
       * Use {@link #getUnk2700MEANPNKMDFGMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> getUnk2700MEANPNKMDFG() {
        return getUnk2700MEANPNKMDFGMap();
      }
      /**
       * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> getUnk2700MEANPNKMDFGMap() {
        return internalGetUnk2700MEANPNKMDFG().getMap();
      }
      /**
       * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getUnk2700MEANPNKMDFGOrDefault(
          int key,
          emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> map =
            internalGetUnk2700MEANPNKMDFG().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getUnk2700MEANPNKMDFGOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> map =
            internalGetUnk2700MEANPNKMDFG().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearUnk2700MEANPNKMDFG() {
        internalGetMutableUnk2700MEANPNKMDFG().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
       */

      public Builder removeUnk2700MEANPNKMDFG(
          int key) {
        
        internalGetMutableUnk2700MEANPNKMDFG().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD>
      getMutableUnk2700MEANPNKMDFG() {
        return internalGetMutableUnk2700MEANPNKMDFG().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
       */
      public Builder putUnk2700MEANPNKMDFG(
          int key,
          emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableUnk2700MEANPNKMDFG().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .Unk2700_EKDHFFHMNCD&gt; Unk2700_MEANPNKMDFG = 2;</code>
       */

      public Builder putAllUnk2700MEANPNKMDFG(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD> values) {
        internalGetMutableUnk2700MEANPNKMDFG().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:Unk2700_HBOFACHAGIF_ServerNotify)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_HBOFACHAGIF_ServerNotify)
    private static final emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify();
    }

    public static emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_HBOFACHAGIF_ServerNotify>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_HBOFACHAGIF_ServerNotify>() {
      @java.lang.Override
      public Unk2700_HBOFACHAGIF_ServerNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_HBOFACHAGIF_ServerNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_HBOFACHAGIF_ServerNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_HBOFACHAGIF_ServerNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700HBOFACHAGIFServerNotify.Unk2700_HBOFACHAGIF_ServerNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_HBOFACHAGIF_ServerNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_HBOFACHAGIF_ServerNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_HBOFACHAGIF_ServerNotify_Unk2700MEANPNKMDFGEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_HBOFACHAGIF_ServerNotify_Unk2700MEANPNKMDFGEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&Unk2700_HBOFACHAGIF_ServerNotify.proto" +
      "\032\031Unk2700_EKDHFFHMNCD.proto\"\313\001\n Unk2700_" +
      "HBOFACHAGIF_ServerNotify\022V\n\023Unk2700_MEAN" +
      "PNKMDFG\030\002 \003(\01329.Unk2700_HBOFACHAGIF_Serv" +
      "erNotify.Unk2700MEANPNKMDFGEntry\032O\n\027Unk2" +
      "700MEANPNKMDFGEntry\022\013\n\003key\030\001 \001(\r\022#\n\005valu" +
      "e\030\002 \001(\0132\024.Unk2700_EKDHFFHMNCD:\0028\001B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.getDescriptor(),
        });
    internal_static_Unk2700_HBOFACHAGIF_ServerNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_HBOFACHAGIF_ServerNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_HBOFACHAGIF_ServerNotify_descriptor,
        new java.lang.String[] { "Unk2700MEANPNKMDFG", });
    internal_static_Unk2700_HBOFACHAGIF_ServerNotify_Unk2700MEANPNKMDFGEntry_descriptor =
      internal_static_Unk2700_HBOFACHAGIF_ServerNotify_descriptor.getNestedTypes().get(0);
    internal_static_Unk2700_HBOFACHAGIF_ServerNotify_Unk2700MEANPNKMDFGEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_HBOFACHAGIF_ServerNotify_Unk2700MEANPNKMDFGEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.Unk2700EKDHFFHMNCD.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_NMEENGOJOKD.proto

package emu.grasscutter.net.proto;

public final class Unk2700NMEENGOJOKD {
  private Unk2700NMEENGOJOKD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_NMEENGOJOKDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_NMEENGOJOKD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */
    int getUnk2700DACHHINLDDJCount();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */
    boolean containsUnk2700DACHHINLDDJ(
        int key);
    /**
     * Use {@link #getUnk2700DACHHINLDDJMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUnk2700DACHHINLDDJ();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getUnk2700DACHHINLDDJMap();
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */

    int getUnk2700DACHHINLDDJOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */

    int getUnk2700DACHHINLDDJOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 8930
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_NMEENGOJOKD}
   */
  public static final class Unk2700_NMEENGOJOKD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_NMEENGOJOKD)
      Unk2700_NMEENGOJOKDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_NMEENGOJOKD.newBuilder() to construct.
    private Unk2700_NMEENGOJOKD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_NMEENGOJOKD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_NMEENGOJOKD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_NMEENGOJOKD(
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
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700DACHHINLDDJ_ = com.google.protobuf.MapField.newMapField(
                    Unk2700DACHHINLDDJDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              unk2700DACHHINLDDJ__ = input.readMessage(
                  Unk2700DACHHINLDDJDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              unk2700DACHHINLDDJ_.getMutableMap().put(
                  unk2700DACHHINLDDJ__.getKey(), unk2700DACHHINLDDJ__.getValue());
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
      return emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.internal_static_Unk2700_NMEENGOJOKD_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 12:
          return internalGetUnk2700DACHHINLDDJ();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.internal_static_Unk2700_NMEENGOJOKD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD.class, emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD.Builder.class);
    }

    public static final int UNK2700_DACHHINLDDJ_FIELD_NUMBER = 12;
    private static final class Unk2700DACHHINLDDJDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.internal_static_Unk2700_NMEENGOJOKD_Unk2700DACHHINLDDJEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> unk2700DACHHINLDDJ_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetUnk2700DACHHINLDDJ() {
      if (unk2700DACHHINLDDJ_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            Unk2700DACHHINLDDJDefaultEntryHolder.defaultEntry);
      }
      return unk2700DACHHINLDDJ_;
    }

    public int getUnk2700DACHHINLDDJCount() {
      return internalGetUnk2700DACHHINLDDJ().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */

    @java.lang.Override
    public boolean containsUnk2700DACHHINLDDJ(
        int key) {
      
      return internalGetUnk2700DACHHINLDDJ().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUnk2700DACHHINLDDJMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DACHHINLDDJ() {
      return getUnk2700DACHHINLDDJMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DACHHINLDDJMap() {
      return internalGetUnk2700DACHHINLDDJ().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */
    @java.lang.Override

    public int getUnk2700DACHHINLDDJOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUnk2700DACHHINLDDJ().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
     */
    @java.lang.Override

    public int getUnk2700DACHHINLDDJOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetUnk2700DACHHINLDDJ().getMap();
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
          internalGetUnk2700DACHHINLDDJ(),
          Unk2700DACHHINLDDJDefaultEntryHolder.defaultEntry,
          12);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetUnk2700DACHHINLDDJ().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        unk2700DACHHINLDDJ__ = Unk2700DACHHINLDDJDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, unk2700DACHHINLDDJ__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD other = (emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD) obj;

      if (!internalGetUnk2700DACHHINLDDJ().equals(
          other.internalGetUnk2700DACHHINLDDJ())) return false;
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
      if (!internalGetUnk2700DACHHINLDDJ().getMap().isEmpty()) {
        hash = (37 * hash) + UNK2700_DACHHINLDDJ_FIELD_NUMBER;
        hash = (53 * hash) + internalGetUnk2700DACHHINLDDJ().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD prototype) {
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
     * CmdId: 8930
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_NMEENGOJOKD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_NMEENGOJOKD)
        emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.internal_static_Unk2700_NMEENGOJOKD_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetUnk2700DACHHINLDDJ();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutableUnk2700DACHHINLDDJ();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.internal_static_Unk2700_NMEENGOJOKD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD.class, emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD.newBuilder()
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
        internalGetMutableUnk2700DACHHINLDDJ().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.internal_static_Unk2700_NMEENGOJOKD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD build() {
        emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD buildPartial() {
        emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD result = new emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD(this);
        int from_bitField0_ = bitField0_;
        result.unk2700DACHHINLDDJ_ = internalGetUnk2700DACHHINLDDJ();
        result.unk2700DACHHINLDDJ_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD other) {
        if (other == emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD.getDefaultInstance()) return this;
        internalGetMutableUnk2700DACHHINLDDJ().mergeFrom(
            other.internalGetUnk2700DACHHINLDDJ());
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
        emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD) e.getUnfinishedMessage();
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
          java.lang.Integer, java.lang.Integer> unk2700DACHHINLDDJ_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetUnk2700DACHHINLDDJ() {
        if (unk2700DACHHINLDDJ_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              Unk2700DACHHINLDDJDefaultEntryHolder.defaultEntry);
        }
        return unk2700DACHHINLDDJ_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableUnk2700DACHHINLDDJ() {
        onChanged();;
        if (unk2700DACHHINLDDJ_ == null) {
          unk2700DACHHINLDDJ_ = com.google.protobuf.MapField.newMapField(
              Unk2700DACHHINLDDJDefaultEntryHolder.defaultEntry);
        }
        if (!unk2700DACHHINLDDJ_.isMutable()) {
          unk2700DACHHINLDDJ_ = unk2700DACHHINLDDJ_.copy();
        }
        return unk2700DACHHINLDDJ_;
      }

      public int getUnk2700DACHHINLDDJCount() {
        return internalGetUnk2700DACHHINLDDJ().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
       */

      @java.lang.Override
      public boolean containsUnk2700DACHHINLDDJ(
          int key) {
        
        return internalGetUnk2700DACHHINLDDJ().getMap().containsKey(key);
      }
      /**
       * Use {@link #getUnk2700DACHHINLDDJMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DACHHINLDDJ() {
        return getUnk2700DACHHINLDDJMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getUnk2700DACHHINLDDJMap() {
        return internalGetUnk2700DACHHINLDDJ().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
       */
      @java.lang.Override

      public int getUnk2700DACHHINLDDJOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUnk2700DACHHINLDDJ().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
       */
      @java.lang.Override

      public int getUnk2700DACHHINLDDJOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetUnk2700DACHHINLDDJ().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearUnk2700DACHHINLDDJ() {
        internalGetMutableUnk2700DACHHINLDDJ().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
       */

      public Builder removeUnk2700DACHHINLDDJ(
          int key) {
        
        internalGetMutableUnk2700DACHHINLDDJ().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableUnk2700DACHHINLDDJ() {
        return internalGetMutableUnk2700DACHHINLDDJ().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
       */
      public Builder putUnk2700DACHHINLDDJ(
          int key,
          int value) {
        
        
        internalGetMutableUnk2700DACHHINLDDJ().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; Unk2700_DACHHINLDDJ = 12;</code>
       */

      public Builder putAllUnk2700DACHHINLDDJ(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableUnk2700DACHHINLDDJ().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:Unk2700_NMEENGOJOKD)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_NMEENGOJOKD)
    private static final emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD();
    }

    public static emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_NMEENGOJOKD>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_NMEENGOJOKD>() {
      @java.lang.Override
      public Unk2700_NMEENGOJOKD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_NMEENGOJOKD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_NMEENGOJOKD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_NMEENGOJOKD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700NMEENGOJOKD.Unk2700_NMEENGOJOKD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_NMEENGOJOKD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_NMEENGOJOKD_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_NMEENGOJOKD_Unk2700DACHHINLDDJEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_NMEENGOJOKD_Unk2700DACHHINLDDJEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_NMEENGOJOKD.proto\"\233\001\n\023Unk2700_" +
      "NMEENGOJOKD\022I\n\023Unk2700_DACHHINLDDJ\030\014 \003(\013" +
      "2,.Unk2700_NMEENGOJOKD.Unk2700DACHHINLDD" +
      "JEntry\0329\n\027Unk2700DACHHINLDDJEntry\022\013\n\003key" +
      "\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_NMEENGOJOKD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_NMEENGOJOKD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_NMEENGOJOKD_descriptor,
        new java.lang.String[] { "Unk2700DACHHINLDDJ", });
    internal_static_Unk2700_NMEENGOJOKD_Unk2700DACHHINLDDJEntry_descriptor =
      internal_static_Unk2700_NMEENGOJOKD_descriptor.getNestedTypes().get(0);
    internal_static_Unk2700_NMEENGOJOKD_Unk2700DACHHINLDDJEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_NMEENGOJOKD_Unk2700DACHHINLDDJEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
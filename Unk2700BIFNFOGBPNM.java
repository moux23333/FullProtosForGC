// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_BIFNFOGBPNM.proto

package emu.grasscutter.net.proto;

public final class Unk2700BIFNFOGBPNM {
  private Unk2700BIFNFOGBPNM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_BIFNFOGBPNMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_BIFNFOGBPNM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 route_id = 9;</code>
     * @return The routeId.
     */
    int getRouteId();

    /**
     * <code>bool Unk2700_MMNILGLDHHD = 15;</code>
     * @return The unk2700MMNILGLDHHD.
     */
    boolean getUnk2700MMNILGLDHHD();
  }
  /**
   * Protobuf type {@code Unk2700_BIFNFOGBPNM}
   */
  public static final class Unk2700_BIFNFOGBPNM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_BIFNFOGBPNM)
      Unk2700_BIFNFOGBPNMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_BIFNFOGBPNM.newBuilder() to construct.
    private Unk2700_BIFNFOGBPNM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_BIFNFOGBPNM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_BIFNFOGBPNM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_BIFNFOGBPNM(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 40: {

              isOpen_ = input.readBool();
              break;
            }
            case 72: {

              routeId_ = input.readUInt32();
              break;
            }
            case 120: {

              unk2700MMNILGLDHHD_ = input.readBool();
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
      return emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.internal_static_Unk2700_BIFNFOGBPNM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.internal_static_Unk2700_BIFNFOGBPNM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM.class, emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 5;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int ROUTE_ID_FIELD_NUMBER = 9;
    private int routeId_;
    /**
     * <code>uint32 route_id = 9;</code>
     * @return The routeId.
     */
    @java.lang.Override
    public int getRouteId() {
      return routeId_;
    }

    public static final int UNK2700_MMNILGLDHHD_FIELD_NUMBER = 15;
    private boolean unk2700MMNILGLDHHD_;
    /**
     * <code>bool Unk2700_MMNILGLDHHD = 15;</code>
     * @return The unk2700MMNILGLDHHD.
     */
    @java.lang.Override
    public boolean getUnk2700MMNILGLDHHD() {
      return unk2700MMNILGLDHHD_;
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
      if (isOpen_ != false) {
        output.writeBool(5, isOpen_);
      }
      if (routeId_ != 0) {
        output.writeUInt32(9, routeId_);
      }
      if (unk2700MMNILGLDHHD_ != false) {
        output.writeBool(15, unk2700MMNILGLDHHD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOpen_);
      }
      if (routeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, routeId_);
      }
      if (unk2700MMNILGLDHHD_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, unk2700MMNILGLDHHD_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM other = (emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getRouteId()
          != other.getRouteId()) return false;
      if (getUnk2700MMNILGLDHHD()
          != other.getUnk2700MMNILGLDHHD()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + ROUTE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRouteId();
      hash = (37 * hash) + UNK2700_MMNILGLDHHD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700MMNILGLDHHD());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM prototype) {
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
     * Protobuf type {@code Unk2700_BIFNFOGBPNM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_BIFNFOGBPNM)
        emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.internal_static_Unk2700_BIFNFOGBPNM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.internal_static_Unk2700_BIFNFOGBPNM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM.class, emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM.newBuilder()
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
        isOpen_ = false;

        routeId_ = 0;

        unk2700MMNILGLDHHD_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.internal_static_Unk2700_BIFNFOGBPNM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM build() {
        emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM buildPartial() {
        emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM result = new emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM(this);
        result.isOpen_ = isOpen_;
        result.routeId_ = routeId_;
        result.unk2700MMNILGLDHHD_ = unk2700MMNILGLDHHD_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM other) {
        if (other == emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getRouteId() != 0) {
          setRouteId(other.getRouteId());
        }
        if (other.getUnk2700MMNILGLDHHD() != false) {
          setUnk2700MMNILGLDHHD(other.getUnk2700MMNILGLDHHD());
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
        emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 5;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int routeId_ ;
      /**
       * <code>uint32 route_id = 9;</code>
       * @return The routeId.
       */
      @java.lang.Override
      public int getRouteId() {
        return routeId_;
      }
      /**
       * <code>uint32 route_id = 9;</code>
       * @param value The routeId to set.
       * @return This builder for chaining.
       */
      public Builder setRouteId(int value) {
        
        routeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 route_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRouteId() {
        
        routeId_ = 0;
        onChanged();
        return this;
      }

      private boolean unk2700MMNILGLDHHD_ ;
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 15;</code>
       * @return The unk2700MMNILGLDHHD.
       */
      @java.lang.Override
      public boolean getUnk2700MMNILGLDHHD() {
        return unk2700MMNILGLDHHD_;
      }
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 15;</code>
       * @param value The unk2700MMNILGLDHHD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MMNILGLDHHD(boolean value) {
        
        unk2700MMNILGLDHHD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700MMNILGLDHHD() {
        
        unk2700MMNILGLDHHD_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_BIFNFOGBPNM)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_BIFNFOGBPNM)
    private static final emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM();
    }

    public static emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_BIFNFOGBPNM>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_BIFNFOGBPNM>() {
      @java.lang.Override
      public Unk2700_BIFNFOGBPNM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_BIFNFOGBPNM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_BIFNFOGBPNM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_BIFNFOGBPNM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700BIFNFOGBPNM.Unk2700_BIFNFOGBPNM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_BIFNFOGBPNM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_BIFNFOGBPNM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_BIFNFOGBPNM.proto\"U\n\023Unk2700_B" +
      "IFNFOGBPNM\022\017\n\007is_open\030\005 \001(\010\022\020\n\010route_id\030" +
      "\t \001(\r\022\033\n\023Unk2700_MMNILGLDHHD\030\017 \001(\010B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_BIFNFOGBPNM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_BIFNFOGBPNM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_BIFNFOGBPNM_descriptor,
        new java.lang.String[] { "IsOpen", "RouteId", "Unk2700MMNILGLDHHD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

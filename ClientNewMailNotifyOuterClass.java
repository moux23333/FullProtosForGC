// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientNewMailNotify.proto

package emu.grasscutter.net.proto;

public final class ClientNewMailNotifyOuterClass {
  private ClientNewMailNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientNewMailNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientNewMailNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_FBDGCFAALFN = 13;</code>
     * @return The unk3300FBDGCFAALFN.
     */
    int getUnk3300FBDGCFAALFN();

    /**
     * <code>uint32 Unk3300_MANJMCPELLJ = 2;</code>
     * @return The unk3300MANJMCPELLJ.
     */
    int getUnk3300MANJMCPELLJ();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1457;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ClientNewMailNotify}
   */
  public static final class ClientNewMailNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientNewMailNotify)
      ClientNewMailNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientNewMailNotify.newBuilder() to construct.
    private ClientNewMailNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientNewMailNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientNewMailNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ClientNewMailNotify(
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
            case 16: {

              unk3300MANJMCPELLJ_ = input.readUInt32();
              break;
            }
            case 104: {

              unk3300FBDGCFAALFN_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.class, emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.Builder.class);
    }

    public static final int UNK3300_FBDGCFAALFN_FIELD_NUMBER = 13;
    private int unk3300FBDGCFAALFN_;
    /**
     * <code>uint32 Unk3300_FBDGCFAALFN = 13;</code>
     * @return The unk3300FBDGCFAALFN.
     */
    @java.lang.Override
    public int getUnk3300FBDGCFAALFN() {
      return unk3300FBDGCFAALFN_;
    }

    public static final int UNK3300_MANJMCPELLJ_FIELD_NUMBER = 2;
    private int unk3300MANJMCPELLJ_;
    /**
     * <code>uint32 Unk3300_MANJMCPELLJ = 2;</code>
     * @return The unk3300MANJMCPELLJ.
     */
    @java.lang.Override
    public int getUnk3300MANJMCPELLJ() {
      return unk3300MANJMCPELLJ_;
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
      if (unk3300MANJMCPELLJ_ != 0) {
        output.writeUInt32(2, unk3300MANJMCPELLJ_);
      }
      if (unk3300FBDGCFAALFN_ != 0) {
        output.writeUInt32(13, unk3300FBDGCFAALFN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300MANJMCPELLJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3300MANJMCPELLJ_);
      }
      if (unk3300FBDGCFAALFN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300FBDGCFAALFN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify other = (emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify) obj;

      if (getUnk3300FBDGCFAALFN()
          != other.getUnk3300FBDGCFAALFN()) return false;
      if (getUnk3300MANJMCPELLJ()
          != other.getUnk3300MANJMCPELLJ()) return false;
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
      hash = (37 * hash) + UNK3300_FBDGCFAALFN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FBDGCFAALFN();
      hash = (37 * hash) + UNK3300_MANJMCPELLJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MANJMCPELLJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify prototype) {
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
     *   CMD_ID = 1457;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ClientNewMailNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientNewMailNotify)
        emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.class, emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.newBuilder()
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
        unk3300FBDGCFAALFN_ = 0;

        unk3300MANJMCPELLJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.internal_static_ClientNewMailNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify build() {
        emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify buildPartial() {
        emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify result = new emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify(this);
        result.unk3300FBDGCFAALFN_ = unk3300FBDGCFAALFN_;
        result.unk3300MANJMCPELLJ_ = unk3300MANJMCPELLJ_;
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
        if (other instanceof emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify other) {
        if (other == emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.getDefaultInstance()) return this;
        if (other.getUnk3300FBDGCFAALFN() != 0) {
          setUnk3300FBDGCFAALFN(other.getUnk3300FBDGCFAALFN());
        }
        if (other.getUnk3300MANJMCPELLJ() != 0) {
          setUnk3300MANJMCPELLJ(other.getUnk3300MANJMCPELLJ());
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
        emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300FBDGCFAALFN_ ;
      /**
       * <code>uint32 Unk3300_FBDGCFAALFN = 13;</code>
       * @return The unk3300FBDGCFAALFN.
       */
      @java.lang.Override
      public int getUnk3300FBDGCFAALFN() {
        return unk3300FBDGCFAALFN_;
      }
      /**
       * <code>uint32 Unk3300_FBDGCFAALFN = 13;</code>
       * @param value The unk3300FBDGCFAALFN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FBDGCFAALFN(int value) {
        
        unk3300FBDGCFAALFN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FBDGCFAALFN = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FBDGCFAALFN() {
        
        unk3300FBDGCFAALFN_ = 0;
        onChanged();
        return this;
      }

      private int unk3300MANJMCPELLJ_ ;
      /**
       * <code>uint32 Unk3300_MANJMCPELLJ = 2;</code>
       * @return The unk3300MANJMCPELLJ.
       */
      @java.lang.Override
      public int getUnk3300MANJMCPELLJ() {
        return unk3300MANJMCPELLJ_;
      }
      /**
       * <code>uint32 Unk3300_MANJMCPELLJ = 2;</code>
       * @param value The unk3300MANJMCPELLJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MANJMCPELLJ(int value) {
        
        unk3300MANJMCPELLJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MANJMCPELLJ = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MANJMCPELLJ() {
        
        unk3300MANJMCPELLJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClientNewMailNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientNewMailNotify)
    private static final emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify();
    }

    public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientNewMailNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientNewMailNotify>() {
      @java.lang.Override
      public ClientNewMailNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientNewMailNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ClientNewMailNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientNewMailNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientNewMailNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientNewMailNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ClientNewMailNotify.proto\"O\n\023ClientNew" +
      "MailNotify\022\033\n\023Unk3300_FBDGCFAALFN\030\r \001(\r\022" +
      "\033\n\023Unk3300_MANJMCPELLJ\030\002 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientNewMailNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientNewMailNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientNewMailNotify_descriptor,
        new java.lang.String[] { "Unk3300FBDGCFAALFN", "Unk3300MANJMCPELLJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_FLGMLEFJHBB_ClientReq.proto

package emu.grasscutter.net.proto;

public final class Unk2700FLGMLEFJHBBClientReq {
  private Unk2700FLGMLEFJHBBClientReq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_FLGMLEFJHBB_ClientReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_FLGMLEFJHBB_ClientReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk2700_FGHPHCPAFKJ = 5;</code>
     * @return The unk2700FGHPHCPAFKJ.
     */
    boolean getUnk2700FGHPHCPAFKJ();

    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 10;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    long getUnk2700ONOOJBEABOE();
  }
  /**
   * <pre>
   * CmdId: 6210
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_FLGMLEFJHBB_ClientReq}
   */
  public static final class Unk2700_FLGMLEFJHBB_ClientReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_FLGMLEFJHBB_ClientReq)
      Unk2700_FLGMLEFJHBB_ClientReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_FLGMLEFJHBB_ClientReq.newBuilder() to construct.
    private Unk2700_FLGMLEFJHBB_ClientReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_FLGMLEFJHBB_ClientReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_FLGMLEFJHBB_ClientReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_FLGMLEFJHBB_ClientReq(
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

              unk2700FGHPHCPAFKJ_ = input.readBool();
              break;
            }
            case 80: {

              unk2700ONOOJBEABOE_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.internal_static_Unk2700_FLGMLEFJHBB_ClientReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.internal_static_Unk2700_FLGMLEFJHBB_ClientReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq.class, emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq.Builder.class);
    }

    public static final int UNK2700_FGHPHCPAFKJ_FIELD_NUMBER = 5;
    private boolean unk2700FGHPHCPAFKJ_;
    /**
     * <code>bool Unk2700_FGHPHCPAFKJ = 5;</code>
     * @return The unk2700FGHPHCPAFKJ.
     */
    @java.lang.Override
    public boolean getUnk2700FGHPHCPAFKJ() {
      return unk2700FGHPHCPAFKJ_;
    }

    public static final int UNK2700_ONOOJBEABOE_FIELD_NUMBER = 10;
    private long unk2700ONOOJBEABOE_;
    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 10;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    @java.lang.Override
    public long getUnk2700ONOOJBEABOE() {
      return unk2700ONOOJBEABOE_;
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
      if (unk2700FGHPHCPAFKJ_ != false) {
        output.writeBool(5, unk2700FGHPHCPAFKJ_);
      }
      if (unk2700ONOOJBEABOE_ != 0L) {
        output.writeUInt64(10, unk2700ONOOJBEABOE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700FGHPHCPAFKJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, unk2700FGHPHCPAFKJ_);
      }
      if (unk2700ONOOJBEABOE_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, unk2700ONOOJBEABOE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq other = (emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq) obj;

      if (getUnk2700FGHPHCPAFKJ()
          != other.getUnk2700FGHPHCPAFKJ()) return false;
      if (getUnk2700ONOOJBEABOE()
          != other.getUnk2700ONOOJBEABOE()) return false;
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
      hash = (37 * hash) + UNK2700_FGHPHCPAFKJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700FGHPHCPAFKJ());
      hash = (37 * hash) + UNK2700_ONOOJBEABOE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk2700ONOOJBEABOE());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq prototype) {
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
     * CmdId: 6210
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_FLGMLEFJHBB_ClientReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_FLGMLEFJHBB_ClientReq)
        emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.internal_static_Unk2700_FLGMLEFJHBB_ClientReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.internal_static_Unk2700_FLGMLEFJHBB_ClientReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq.class, emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq.newBuilder()
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
        unk2700FGHPHCPAFKJ_ = false;

        unk2700ONOOJBEABOE_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.internal_static_Unk2700_FLGMLEFJHBB_ClientReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq build() {
        emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq buildPartial() {
        emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq result = new emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq(this);
        result.unk2700FGHPHCPAFKJ_ = unk2700FGHPHCPAFKJ_;
        result.unk2700ONOOJBEABOE_ = unk2700ONOOJBEABOE_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq other) {
        if (other == emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq.getDefaultInstance()) return this;
        if (other.getUnk2700FGHPHCPAFKJ() != false) {
          setUnk2700FGHPHCPAFKJ(other.getUnk2700FGHPHCPAFKJ());
        }
        if (other.getUnk2700ONOOJBEABOE() != 0L) {
          setUnk2700ONOOJBEABOE(other.getUnk2700ONOOJBEABOE());
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
        emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk2700FGHPHCPAFKJ_ ;
      /**
       * <code>bool Unk2700_FGHPHCPAFKJ = 5;</code>
       * @return The unk2700FGHPHCPAFKJ.
       */
      @java.lang.Override
      public boolean getUnk2700FGHPHCPAFKJ() {
        return unk2700FGHPHCPAFKJ_;
      }
      /**
       * <code>bool Unk2700_FGHPHCPAFKJ = 5;</code>
       * @param value The unk2700FGHPHCPAFKJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700FGHPHCPAFKJ(boolean value) {
        
        unk2700FGHPHCPAFKJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_FGHPHCPAFKJ = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700FGHPHCPAFKJ() {
        
        unk2700FGHPHCPAFKJ_ = false;
        onChanged();
        return this;
      }

      private long unk2700ONOOJBEABOE_ ;
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 10;</code>
       * @return The unk2700ONOOJBEABOE.
       */
      @java.lang.Override
      public long getUnk2700ONOOJBEABOE() {
        return unk2700ONOOJBEABOE_;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 10;</code>
       * @param value The unk2700ONOOJBEABOE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700ONOOJBEABOE(long value) {
        
        unk2700ONOOJBEABOE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700ONOOJBEABOE() {
        
        unk2700ONOOJBEABOE_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_FLGMLEFJHBB_ClientReq)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_FLGMLEFJHBB_ClientReq)
    private static final emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq();
    }

    public static emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_FLGMLEFJHBB_ClientReq>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_FLGMLEFJHBB_ClientReq>() {
      @java.lang.Override
      public Unk2700_FLGMLEFJHBB_ClientReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_FLGMLEFJHBB_ClientReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_FLGMLEFJHBB_ClientReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_FLGMLEFJHBB_ClientReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700FLGMLEFJHBBClientReq.Unk2700_FLGMLEFJHBB_ClientReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_FLGMLEFJHBB_ClientReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_FLGMLEFJHBB_ClientReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_FLGMLEFJHBB_ClientReq.proto\"Y\n" +
      "\035Unk2700_FLGMLEFJHBB_ClientReq\022\033\n\023Unk270" +
      "0_FGHPHCPAFKJ\030\005 \001(\010\022\033\n\023Unk2700_ONOOJBEAB" +
      "OE\030\n \001(\004B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_FLGMLEFJHBB_ClientReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_FLGMLEFJHBB_ClientReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_FLGMLEFJHBB_ClientReq_descriptor,
        new java.lang.String[] { "Unk2700FGHPHCPAFKJ", "Unk2700ONOOJBEABOE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
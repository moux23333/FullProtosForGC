// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_HIIFAMCBJCD_ServerRsp.proto

package emu.grasscutter.net.proto;

public final class Unk2700HIIFAMCBJCDServerRsp {
  private Unk2700HIIFAMCBJCDServerRsp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_HIIFAMCBJCD_ServerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_HIIFAMCBJCD_ServerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 type_id = 5;</code>
     * @return The typeId.
     */
    int getTypeId();

    /**
     * <code>uint32 Unk2700_LEKOKKMDNAO = 14;</code>
     * @return The unk2700LEKOKKMDNAO.
     */
    int getUnk2700LEKOKKMDNAO();
  }
  /**
   * <pre>
   * CmdId: 4206
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_HIIFAMCBJCD_ServerRsp}
   */
  public static final class Unk2700_HIIFAMCBJCD_ServerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_HIIFAMCBJCD_ServerRsp)
      Unk2700_HIIFAMCBJCD_ServerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_HIIFAMCBJCD_ServerRsp.newBuilder() to construct.
    private Unk2700_HIIFAMCBJCD_ServerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_HIIFAMCBJCD_ServerRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_HIIFAMCBJCD_ServerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_HIIFAMCBJCD_ServerRsp(
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

              typeId_ = input.readUInt32();
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              unk2700LEKOKKMDNAO_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp.class, emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TYPE_ID_FIELD_NUMBER = 5;
    private int typeId_;
    /**
     * <code>uint32 type_id = 5;</code>
     * @return The typeId.
     */
    @java.lang.Override
    public int getTypeId() {
      return typeId_;
    }

    public static final int UNK2700_LEKOKKMDNAO_FIELD_NUMBER = 14;
    private int unk2700LEKOKKMDNAO_;
    /**
     * <code>uint32 Unk2700_LEKOKKMDNAO = 14;</code>
     * @return The unk2700LEKOKKMDNAO.
     */
    @java.lang.Override
    public int getUnk2700LEKOKKMDNAO() {
      return unk2700LEKOKKMDNAO_;
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
      if (typeId_ != 0) {
        output.writeUInt32(5, typeId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (unk2700LEKOKKMDNAO_ != 0) {
        output.writeUInt32(14, unk2700LEKOKKMDNAO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (typeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, typeId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      if (unk2700LEKOKKMDNAO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk2700LEKOKKMDNAO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp other = (emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getTypeId()
          != other.getTypeId()) return false;
      if (getUnk2700LEKOKKMDNAO()
          != other.getUnk2700LEKOKKMDNAO()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + TYPE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTypeId();
      hash = (37 * hash) + UNK2700_LEKOKKMDNAO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700LEKOKKMDNAO();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp prototype) {
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
     * CmdId: 4206
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_HIIFAMCBJCD_ServerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_HIIFAMCBJCD_ServerRsp)
        emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp.class, emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp.newBuilder()
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
        retcode_ = 0;

        typeId_ = 0;

        unk2700LEKOKKMDNAO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp build() {
        emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp buildPartial() {
        emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp result = new emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp(this);
        result.retcode_ = retcode_;
        result.typeId_ = typeId_;
        result.unk2700LEKOKKMDNAO_ = unk2700LEKOKKMDNAO_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp other) {
        if (other == emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getTypeId() != 0) {
          setTypeId(other.getTypeId());
        }
        if (other.getUnk2700LEKOKKMDNAO() != 0) {
          setUnk2700LEKOKKMDNAO(other.getUnk2700LEKOKKMDNAO());
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
        emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int typeId_ ;
      /**
       * <code>uint32 type_id = 5;</code>
       * @return The typeId.
       */
      @java.lang.Override
      public int getTypeId() {
        return typeId_;
      }
      /**
       * <code>uint32 type_id = 5;</code>
       * @param value The typeId to set.
       * @return This builder for chaining.
       */
      public Builder setTypeId(int value) {
        
        typeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTypeId() {
        
        typeId_ = 0;
        onChanged();
        return this;
      }

      private int unk2700LEKOKKMDNAO_ ;
      /**
       * <code>uint32 Unk2700_LEKOKKMDNAO = 14;</code>
       * @return The unk2700LEKOKKMDNAO.
       */
      @java.lang.Override
      public int getUnk2700LEKOKKMDNAO() {
        return unk2700LEKOKKMDNAO_;
      }
      /**
       * <code>uint32 Unk2700_LEKOKKMDNAO = 14;</code>
       * @param value The unk2700LEKOKKMDNAO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700LEKOKKMDNAO(int value) {
        
        unk2700LEKOKKMDNAO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_LEKOKKMDNAO = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700LEKOKKMDNAO() {
        
        unk2700LEKOKKMDNAO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_HIIFAMCBJCD_ServerRsp)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_HIIFAMCBJCD_ServerRsp)
    private static final emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp();
    }

    public static emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_HIIFAMCBJCD_ServerRsp>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_HIIFAMCBJCD_ServerRsp>() {
      @java.lang.Override
      public Unk2700_HIIFAMCBJCD_ServerRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_HIIFAMCBJCD_ServerRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_HIIFAMCBJCD_ServerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_HIIFAMCBJCD_ServerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700HIIFAMCBJCDServerRsp.Unk2700_HIIFAMCBJCD_ServerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_HIIFAMCBJCD_ServerRsp.proto\"^\n" +
      "\035Unk2700_HIIFAMCBJCD_ServerRsp\022\017\n\007retcod" +
      "e\030\n \001(\005\022\017\n\007type_id\030\005 \001(\r\022\033\n\023Unk2700_LEKO" +
      "KKMDNAO\030\016 \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_HIIFAMCBJCD_ServerRsp_descriptor,
        new java.lang.String[] { "Retcode", "TypeId", "Unk2700LEKOKKMDNAO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
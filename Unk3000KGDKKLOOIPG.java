// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_KGDKKLOOIPG.proto

package emu.grasscutter.net.proto;

public final class Unk3000KGDKKLOOIPG {
  private Unk3000KGDKKLOOIPG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_KGDKKLOOIPGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_KGDKKLOOIPG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 Unk3000_CCNCELKPPFN = 14;</code>
     * @return The unk3000CCNCELKPPFN.
     */
    int getUnk3000CCNCELKPPFN();

    /**
     * <code>uint32 Unk3000_OIIEJOKFHPP = 13;</code>
     * @return The unk3000OIIEJOKFHPP.
     */
    int getUnk3000OIIEJOKFHPP();

    /**
     * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
     * @return The unk3000CIOLEGEHDAC.
     */
    int getUnk3000CIOLEGEHDAC();
  }
  /**
   * <pre>
   * CmdId: 457
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_KGDKKLOOIPG}
   */
  public static final class Unk3000_KGDKKLOOIPG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_KGDKKLOOIPG)
      Unk3000_KGDKKLOOIPGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_KGDKKLOOIPG.newBuilder() to construct.
    private Unk3000_KGDKKLOOIPG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_KGDKKLOOIPG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_KGDKKLOOIPG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_KGDKKLOOIPG(
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
            case 8: {

              unk3000CIOLEGEHDAC_ = input.readUInt32();
              break;
            }
            case 104: {

              unk3000OIIEJOKFHPP_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3000CCNCELKPPFN_ = input.readUInt32();
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.internal_static_Unk3000_KGDKKLOOIPG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.internal_static_Unk3000_KGDKKLOOIPG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG.class, emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3000_CCNCELKPPFN_FIELD_NUMBER = 14;
    private int unk3000CCNCELKPPFN_;
    /**
     * <code>uint32 Unk3000_CCNCELKPPFN = 14;</code>
     * @return The unk3000CCNCELKPPFN.
     */
    @java.lang.Override
    public int getUnk3000CCNCELKPPFN() {
      return unk3000CCNCELKPPFN_;
    }

    public static final int UNK3000_OIIEJOKFHPP_FIELD_NUMBER = 13;
    private int unk3000OIIEJOKFHPP_;
    /**
     * <code>uint32 Unk3000_OIIEJOKFHPP = 13;</code>
     * @return The unk3000OIIEJOKFHPP.
     */
    @java.lang.Override
    public int getUnk3000OIIEJOKFHPP() {
      return unk3000OIIEJOKFHPP_;
    }

    public static final int UNK3000_CIOLEGEHDAC_FIELD_NUMBER = 1;
    private int unk3000CIOLEGEHDAC_;
    /**
     * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
     * @return The unk3000CIOLEGEHDAC.
     */
    @java.lang.Override
    public int getUnk3000CIOLEGEHDAC() {
      return unk3000CIOLEGEHDAC_;
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
      if (unk3000CIOLEGEHDAC_ != 0) {
        output.writeUInt32(1, unk3000CIOLEGEHDAC_);
      }
      if (unk3000OIIEJOKFHPP_ != 0) {
        output.writeUInt32(13, unk3000OIIEJOKFHPP_);
      }
      if (unk3000CCNCELKPPFN_ != 0) {
        output.writeUInt32(14, unk3000CCNCELKPPFN_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3000CIOLEGEHDAC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3000CIOLEGEHDAC_);
      }
      if (unk3000OIIEJOKFHPP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3000OIIEJOKFHPP_);
      }
      if (unk3000CCNCELKPPFN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3000CCNCELKPPFN_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG other = (emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUnk3000CCNCELKPPFN()
          != other.getUnk3000CCNCELKPPFN()) return false;
      if (getUnk3000OIIEJOKFHPP()
          != other.getUnk3000OIIEJOKFHPP()) return false;
      if (getUnk3000CIOLEGEHDAC()
          != other.getUnk3000CIOLEGEHDAC()) return false;
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
      hash = (37 * hash) + UNK3000_CCNCELKPPFN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000CCNCELKPPFN();
      hash = (37 * hash) + UNK3000_OIIEJOKFHPP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000OIIEJOKFHPP();
      hash = (37 * hash) + UNK3000_CIOLEGEHDAC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000CIOLEGEHDAC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG prototype) {
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
     * CmdId: 457
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_KGDKKLOOIPG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_KGDKKLOOIPG)
        emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.internal_static_Unk3000_KGDKKLOOIPG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.internal_static_Unk3000_KGDKKLOOIPG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG.class, emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG.newBuilder()
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

        unk3000CCNCELKPPFN_ = 0;

        unk3000OIIEJOKFHPP_ = 0;

        unk3000CIOLEGEHDAC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.internal_static_Unk3000_KGDKKLOOIPG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG build() {
        emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG buildPartial() {
        emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG result = new emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG(this);
        result.retcode_ = retcode_;
        result.unk3000CCNCELKPPFN_ = unk3000CCNCELKPPFN_;
        result.unk3000OIIEJOKFHPP_ = unk3000OIIEJOKFHPP_;
        result.unk3000CIOLEGEHDAC_ = unk3000CIOLEGEHDAC_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG other) {
        if (other == emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUnk3000CCNCELKPPFN() != 0) {
          setUnk3000CCNCELKPPFN(other.getUnk3000CCNCELKPPFN());
        }
        if (other.getUnk3000OIIEJOKFHPP() != 0) {
          setUnk3000OIIEJOKFHPP(other.getUnk3000OIIEJOKFHPP());
        }
        if (other.getUnk3000CIOLEGEHDAC() != 0) {
          setUnk3000CIOLEGEHDAC(other.getUnk3000CIOLEGEHDAC());
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
        emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int unk3000CCNCELKPPFN_ ;
      /**
       * <code>uint32 Unk3000_CCNCELKPPFN = 14;</code>
       * @return The unk3000CCNCELKPPFN.
       */
      @java.lang.Override
      public int getUnk3000CCNCELKPPFN() {
        return unk3000CCNCELKPPFN_;
      }
      /**
       * <code>uint32 Unk3000_CCNCELKPPFN = 14;</code>
       * @param value The unk3000CCNCELKPPFN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000CCNCELKPPFN(int value) {
        
        unk3000CCNCELKPPFN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_CCNCELKPPFN = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000CCNCELKPPFN() {
        
        unk3000CCNCELKPPFN_ = 0;
        onChanged();
        return this;
      }

      private int unk3000OIIEJOKFHPP_ ;
      /**
       * <code>uint32 Unk3000_OIIEJOKFHPP = 13;</code>
       * @return The unk3000OIIEJOKFHPP.
       */
      @java.lang.Override
      public int getUnk3000OIIEJOKFHPP() {
        return unk3000OIIEJOKFHPP_;
      }
      /**
       * <code>uint32 Unk3000_OIIEJOKFHPP = 13;</code>
       * @param value The unk3000OIIEJOKFHPP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000OIIEJOKFHPP(int value) {
        
        unk3000OIIEJOKFHPP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_OIIEJOKFHPP = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000OIIEJOKFHPP() {
        
        unk3000OIIEJOKFHPP_ = 0;
        onChanged();
        return this;
      }

      private int unk3000CIOLEGEHDAC_ ;
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
       * @return The unk3000CIOLEGEHDAC.
       */
      @java.lang.Override
      public int getUnk3000CIOLEGEHDAC() {
        return unk3000CIOLEGEHDAC_;
      }
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
       * @param value The unk3000CIOLEGEHDAC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000CIOLEGEHDAC(int value) {
        
        unk3000CIOLEGEHDAC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000CIOLEGEHDAC() {
        
        unk3000CIOLEGEHDAC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_KGDKKLOOIPG)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_KGDKKLOOIPG)
    private static final emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG();
    }

    public static emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_KGDKKLOOIPG>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_KGDKKLOOIPG>() {
      @java.lang.Override
      public Unk3000_KGDKKLOOIPG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_KGDKKLOOIPG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_KGDKKLOOIPG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_KGDKKLOOIPG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000KGDKKLOOIPG.Unk3000_KGDKKLOOIPG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_KGDKKLOOIPG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_KGDKKLOOIPG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_KGDKKLOOIPG.proto\"}\n\023Unk3000_K" +
      "GDKKLOOIPG\022\017\n\007retcode\030\017 \001(\005\022\033\n\023Unk3000_C" +
      "CNCELKPPFN\030\016 \001(\r\022\033\n\023Unk3000_OIIEJOKFHPP\030" +
      "\r \001(\r\022\033\n\023Unk3000_CIOLEGEHDAC\030\001 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_KGDKKLOOIPG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_KGDKKLOOIPG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_KGDKKLOOIPG_descriptor,
        new java.lang.String[] { "Retcode", "Unk3000CCNCELKPPFN", "Unk3000OIIEJOKFHPP", "Unk3000CIOLEGEHDAC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_DPEJONKFONL.proto

package emu.grasscutter.net.proto;

public final class Unk3000DPEJONKFONL {
  private Unk3000DPEJONKFONL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_DPEJONKFONLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_DPEJONKFONL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 param = 1;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>uint32 Unk3000_PAFIGDFHGNA = 4;</code>
     * @return The unk3000PAFIGDFHGNA.
     */
    int getUnk3000PAFIGDFHGNA();
  }
  /**
   * <pre>
   * CmdId: 21750
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_DPEJONKFONL}
   */
  public static final class Unk3000_DPEJONKFONL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_DPEJONKFONL)
      Unk3000_DPEJONKFONLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_DPEJONKFONL.newBuilder() to construct.
    private Unk3000_DPEJONKFONL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_DPEJONKFONL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_DPEJONKFONL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_DPEJONKFONL(
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

              param_ = input.readUInt32();
              break;
            }
            case 32: {

              unk3000PAFIGDFHGNA_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3000DPEJONKFONL.internal_static_Unk3000_DPEJONKFONL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000DPEJONKFONL.internal_static_Unk3000_DPEJONKFONL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL.class, emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL.Builder.class);
    }

    public static final int PARAM_FIELD_NUMBER = 1;
    private int param_;
    /**
     * <code>uint32 param = 1;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int UNK3000_PAFIGDFHGNA_FIELD_NUMBER = 4;
    private int unk3000PAFIGDFHGNA_;
    /**
     * <code>uint32 Unk3000_PAFIGDFHGNA = 4;</code>
     * @return The unk3000PAFIGDFHGNA.
     */
    @java.lang.Override
    public int getUnk3000PAFIGDFHGNA() {
      return unk3000PAFIGDFHGNA_;
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
      if (param_ != 0) {
        output.writeUInt32(1, param_);
      }
      if (unk3000PAFIGDFHGNA_ != 0) {
        output.writeUInt32(4, unk3000PAFIGDFHGNA_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, param_);
      }
      if (unk3000PAFIGDFHGNA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3000PAFIGDFHGNA_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL other = (emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL) obj;

      if (getParam()
          != other.getParam()) return false;
      if (getUnk3000PAFIGDFHGNA()
          != other.getUnk3000PAFIGDFHGNA()) return false;
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
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + UNK3000_PAFIGDFHGNA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000PAFIGDFHGNA();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL prototype) {
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
     * CmdId: 21750
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_DPEJONKFONL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_DPEJONKFONL)
        emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000DPEJONKFONL.internal_static_Unk3000_DPEJONKFONL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000DPEJONKFONL.internal_static_Unk3000_DPEJONKFONL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL.class, emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL.newBuilder()
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
        param_ = 0;

        unk3000PAFIGDFHGNA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000DPEJONKFONL.internal_static_Unk3000_DPEJONKFONL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL build() {
        emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL buildPartial() {
        emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL result = new emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL(this);
        result.param_ = param_;
        result.unk3000PAFIGDFHGNA_ = unk3000PAFIGDFHGNA_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL other) {
        if (other == emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL.getDefaultInstance()) return this;
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.getUnk3000PAFIGDFHGNA() != 0) {
          setUnk3000PAFIGDFHGNA(other.getUnk3000PAFIGDFHGNA());
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
        emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 1;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 1;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private int unk3000PAFIGDFHGNA_ ;
      /**
       * <code>uint32 Unk3000_PAFIGDFHGNA = 4;</code>
       * @return The unk3000PAFIGDFHGNA.
       */
      @java.lang.Override
      public int getUnk3000PAFIGDFHGNA() {
        return unk3000PAFIGDFHGNA_;
      }
      /**
       * <code>uint32 Unk3000_PAFIGDFHGNA = 4;</code>
       * @param value The unk3000PAFIGDFHGNA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000PAFIGDFHGNA(int value) {
        
        unk3000PAFIGDFHGNA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_PAFIGDFHGNA = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000PAFIGDFHGNA() {
        
        unk3000PAFIGDFHGNA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_DPEJONKFONL)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_DPEJONKFONL)
    private static final emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL();
    }

    public static emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_DPEJONKFONL>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_DPEJONKFONL>() {
      @java.lang.Override
      public Unk3000_DPEJONKFONL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_DPEJONKFONL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_DPEJONKFONL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_DPEJONKFONL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000DPEJONKFONL.Unk3000_DPEJONKFONL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_DPEJONKFONL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_DPEJONKFONL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_DPEJONKFONL.proto\"A\n\023Unk3000_D" +
      "PEJONKFONL\022\r\n\005param\030\001 \001(\r\022\033\n\023Unk3000_PAF" +
      "IGDFHGNA\030\004 \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_DPEJONKFONL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_DPEJONKFONL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_DPEJONKFONL_descriptor,
        new java.lang.String[] { "Param", "Unk3000PAFIGDFHGNA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

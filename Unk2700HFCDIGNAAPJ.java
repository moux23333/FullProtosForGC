// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_HFCDIGNAAPJ.proto

package emu.grasscutter.net.proto;

public final class Unk2700HFCDIGNAAPJ {
  private Unk2700HFCDIGNAAPJ() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_HFCDIGNAAPJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_HFCDIGNAAPJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_OBDGPNILPND = 9;</code>
     * @return The unk2700OBDGPNILPND.
     */
    int getUnk2700OBDGPNILPND();

    /**
     * <code>uint32 Unk2700_KKHAKNLGBLJ = 13;</code>
     * @return The unk2700KKHAKNLGBLJ.
     */
    int getUnk2700KKHAKNLGBLJ();
  }
  /**
   * <pre>
   * CmdId: 8129
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_HFCDIGNAAPJ}
   */
  public static final class Unk2700_HFCDIGNAAPJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_HFCDIGNAAPJ)
      Unk2700_HFCDIGNAAPJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_HFCDIGNAAPJ.newBuilder() to construct.
    private Unk2700_HFCDIGNAAPJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_HFCDIGNAAPJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_HFCDIGNAAPJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_HFCDIGNAAPJ(
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
            case 72: {

              unk2700OBDGPNILPND_ = input.readUInt32();
              break;
            }
            case 104: {

              unk2700KKHAKNLGBLJ_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.internal_static_Unk2700_HFCDIGNAAPJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.internal_static_Unk2700_HFCDIGNAAPJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ.class, emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ.Builder.class);
    }

    public static final int UNK2700_OBDGPNILPND_FIELD_NUMBER = 9;
    private int unk2700OBDGPNILPND_;
    /**
     * <code>uint32 Unk2700_OBDGPNILPND = 9;</code>
     * @return The unk2700OBDGPNILPND.
     */
    @java.lang.Override
    public int getUnk2700OBDGPNILPND() {
      return unk2700OBDGPNILPND_;
    }

    public static final int UNK2700_KKHAKNLGBLJ_FIELD_NUMBER = 13;
    private int unk2700KKHAKNLGBLJ_;
    /**
     * <code>uint32 Unk2700_KKHAKNLGBLJ = 13;</code>
     * @return The unk2700KKHAKNLGBLJ.
     */
    @java.lang.Override
    public int getUnk2700KKHAKNLGBLJ() {
      return unk2700KKHAKNLGBLJ_;
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
      if (unk2700OBDGPNILPND_ != 0) {
        output.writeUInt32(9, unk2700OBDGPNILPND_);
      }
      if (unk2700KKHAKNLGBLJ_ != 0) {
        output.writeUInt32(13, unk2700KKHAKNLGBLJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700OBDGPNILPND_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk2700OBDGPNILPND_);
      }
      if (unk2700KKHAKNLGBLJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk2700KKHAKNLGBLJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ other = (emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ) obj;

      if (getUnk2700OBDGPNILPND()
          != other.getUnk2700OBDGPNILPND()) return false;
      if (getUnk2700KKHAKNLGBLJ()
          != other.getUnk2700KKHAKNLGBLJ()) return false;
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
      hash = (37 * hash) + UNK2700_OBDGPNILPND_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700OBDGPNILPND();
      hash = (37 * hash) + UNK2700_KKHAKNLGBLJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700KKHAKNLGBLJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ prototype) {
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
     * CmdId: 8129
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_HFCDIGNAAPJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_HFCDIGNAAPJ)
        emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.internal_static_Unk2700_HFCDIGNAAPJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.internal_static_Unk2700_HFCDIGNAAPJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ.class, emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ.newBuilder()
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
        unk2700OBDGPNILPND_ = 0;

        unk2700KKHAKNLGBLJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.internal_static_Unk2700_HFCDIGNAAPJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ build() {
        emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ buildPartial() {
        emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ result = new emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ(this);
        result.unk2700OBDGPNILPND_ = unk2700OBDGPNILPND_;
        result.unk2700KKHAKNLGBLJ_ = unk2700KKHAKNLGBLJ_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ other) {
        if (other == emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ.getDefaultInstance()) return this;
        if (other.getUnk2700OBDGPNILPND() != 0) {
          setUnk2700OBDGPNILPND(other.getUnk2700OBDGPNILPND());
        }
        if (other.getUnk2700KKHAKNLGBLJ() != 0) {
          setUnk2700KKHAKNLGBLJ(other.getUnk2700KKHAKNLGBLJ());
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
        emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk2700OBDGPNILPND_ ;
      /**
       * <code>uint32 Unk2700_OBDGPNILPND = 9;</code>
       * @return The unk2700OBDGPNILPND.
       */
      @java.lang.Override
      public int getUnk2700OBDGPNILPND() {
        return unk2700OBDGPNILPND_;
      }
      /**
       * <code>uint32 Unk2700_OBDGPNILPND = 9;</code>
       * @param value The unk2700OBDGPNILPND to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700OBDGPNILPND(int value) {
        
        unk2700OBDGPNILPND_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_OBDGPNILPND = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700OBDGPNILPND() {
        
        unk2700OBDGPNILPND_ = 0;
        onChanged();
        return this;
      }

      private int unk2700KKHAKNLGBLJ_ ;
      /**
       * <code>uint32 Unk2700_KKHAKNLGBLJ = 13;</code>
       * @return The unk2700KKHAKNLGBLJ.
       */
      @java.lang.Override
      public int getUnk2700KKHAKNLGBLJ() {
        return unk2700KKHAKNLGBLJ_;
      }
      /**
       * <code>uint32 Unk2700_KKHAKNLGBLJ = 13;</code>
       * @param value The unk2700KKHAKNLGBLJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KKHAKNLGBLJ(int value) {
        
        unk2700KKHAKNLGBLJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_KKHAKNLGBLJ = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KKHAKNLGBLJ() {
        
        unk2700KKHAKNLGBLJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_HFCDIGNAAPJ)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_HFCDIGNAAPJ)
    private static final emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ();
    }

    public static emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_HFCDIGNAAPJ>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_HFCDIGNAAPJ>() {
      @java.lang.Override
      public Unk2700_HFCDIGNAAPJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_HFCDIGNAAPJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_HFCDIGNAAPJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_HFCDIGNAAPJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700HFCDIGNAAPJ.Unk2700_HFCDIGNAAPJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_HFCDIGNAAPJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_HFCDIGNAAPJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_HFCDIGNAAPJ.proto\"O\n\023Unk2700_H" +
      "FCDIGNAAPJ\022\033\n\023Unk2700_OBDGPNILPND\030\t \001(\r\022" +
      "\033\n\023Unk2700_KKHAKNLGBLJ\030\r \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_HFCDIGNAAPJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_HFCDIGNAAPJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_HFCDIGNAAPJ_descriptor,
        new java.lang.String[] { "Unk2700OBDGPNILPND", "Unk2700KKHAKNLGBLJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

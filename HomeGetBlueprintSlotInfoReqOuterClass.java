// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeGetBlueprintSlotInfoReq.proto

package emu.grasscutter.net.proto;

public final class HomeGetBlueprintSlotInfoReqOuterClass {
  private HomeGetBlueprintSlotInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeGetBlueprintSlotInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeGetBlueprintSlotInfoReq)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4688;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeGetBlueprintSlotInfoReq}
   */
  public static final class HomeGetBlueprintSlotInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeGetBlueprintSlotInfoReq)
      HomeGetBlueprintSlotInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeGetBlueprintSlotInfoReq.newBuilder() to construct.
    private HomeGetBlueprintSlotInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeGetBlueprintSlotInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeGetBlueprintSlotInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeGetBlueprintSlotInfoReq(
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
      return emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.internal_static_HomeGetBlueprintSlotInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.internal_static_HomeGetBlueprintSlotInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq.class, emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq other = (emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq prototype) {
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
     *   CMD_ID = 4688;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeGetBlueprintSlotInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeGetBlueprintSlotInfoReq)
        emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.internal_static_HomeGetBlueprintSlotInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.internal_static_HomeGetBlueprintSlotInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq.class, emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.internal_static_HomeGetBlueprintSlotInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq build() {
        emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq buildPartial() {
        emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq result = new emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq(this);
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
        if (other instanceof emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq other) {
        if (other == emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq.getDefaultInstance()) return this;
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
        emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:HomeGetBlueprintSlotInfoReq)
    }

    // @@protoc_insertion_point(class_scope:HomeGetBlueprintSlotInfoReq)
    private static final emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq();
    }

    public static emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeGetBlueprintSlotInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeGetBlueprintSlotInfoReq>() {
      @java.lang.Override
      public HomeGetBlueprintSlotInfoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeGetBlueprintSlotInfoReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeGetBlueprintSlotInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeGetBlueprintSlotInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGetBlueprintSlotInfoReqOuterClass.HomeGetBlueprintSlotInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeGetBlueprintSlotInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeGetBlueprintSlotInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!HomeGetBlueprintSlotInfoReq.proto\"\035\n\033H" +
      "omeGetBlueprintSlotInfoReqB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeGetBlueprintSlotInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeGetBlueprintSlotInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeGetBlueprintSlotInfoReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

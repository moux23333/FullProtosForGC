// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_EBOECOIFJMP.proto

package emu.grasscutter.net.proto;

public final class Unk2700EBOECOIFJMP {
  private Unk2700EBOECOIFJMP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_EBOECOIFJMPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_EBOECOIFJMP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk2700_PHGMKGEMCFF = 1;</code>
     * @return The unk2700PHGMKGEMCFF.
     */
    boolean getUnk2700PHGMKGEMCFF();

    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * CmdId: 8717
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_EBOECOIFJMP}
   */
  public static final class Unk2700_EBOECOIFJMP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_EBOECOIFJMP)
      Unk2700_EBOECOIFJMPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_EBOECOIFJMP.newBuilder() to construct.
    private Unk2700_EBOECOIFJMP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_EBOECOIFJMP() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_EBOECOIFJMP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_EBOECOIFJMP(
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

              unk2700PHGMKGEMCFF_ = input.readBool();
              break;
            }
            case 88: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.internal_static_Unk2700_EBOECOIFJMP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.internal_static_Unk2700_EBOECOIFJMP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP.class, emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP.Builder.class);
    }

    public static final int UNK2700_PHGMKGEMCFF_FIELD_NUMBER = 1;
    private boolean unk2700PHGMKGEMCFF_;
    /**
     * <code>bool Unk2700_PHGMKGEMCFF = 1;</code>
     * @return The unk2700PHGMKGEMCFF.
     */
    @java.lang.Override
    public boolean getUnk2700PHGMKGEMCFF() {
      return unk2700PHGMKGEMCFF_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 11;
    private int levelId_;
    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (unk2700PHGMKGEMCFF_ != false) {
        output.writeBool(1, unk2700PHGMKGEMCFF_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(11, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700PHGMKGEMCFF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, unk2700PHGMKGEMCFF_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP other = (emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP) obj;

      if (getUnk2700PHGMKGEMCFF()
          != other.getUnk2700PHGMKGEMCFF()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + UNK2700_PHGMKGEMCFF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700PHGMKGEMCFF());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP prototype) {
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
     * CmdId: 8717
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_EBOECOIFJMP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_EBOECOIFJMP)
        emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.internal_static_Unk2700_EBOECOIFJMP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.internal_static_Unk2700_EBOECOIFJMP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP.class, emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP.newBuilder()
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
        unk2700PHGMKGEMCFF_ = false;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.internal_static_Unk2700_EBOECOIFJMP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP build() {
        emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP buildPartial() {
        emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP result = new emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP(this);
        result.unk2700PHGMKGEMCFF_ = unk2700PHGMKGEMCFF_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP other) {
        if (other == emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP.getDefaultInstance()) return this;
        if (other.getUnk2700PHGMKGEMCFF() != false) {
          setUnk2700PHGMKGEMCFF(other.getUnk2700PHGMKGEMCFF());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk2700PHGMKGEMCFF_ ;
      /**
       * <code>bool Unk2700_PHGMKGEMCFF = 1;</code>
       * @return The unk2700PHGMKGEMCFF.
       */
      @java.lang.Override
      public boolean getUnk2700PHGMKGEMCFF() {
        return unk2700PHGMKGEMCFF_;
      }
      /**
       * <code>bool Unk2700_PHGMKGEMCFF = 1;</code>
       * @param value The unk2700PHGMKGEMCFF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700PHGMKGEMCFF(boolean value) {
        
        unk2700PHGMKGEMCFF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_PHGMKGEMCFF = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700PHGMKGEMCFF() {
        
        unk2700PHGMKGEMCFF_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 11;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_EBOECOIFJMP)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_EBOECOIFJMP)
    private static final emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP();
    }

    public static emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_EBOECOIFJMP>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_EBOECOIFJMP>() {
      @java.lang.Override
      public Unk2700_EBOECOIFJMP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_EBOECOIFJMP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_EBOECOIFJMP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_EBOECOIFJMP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700EBOECOIFJMP.Unk2700_EBOECOIFJMP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_EBOECOIFJMP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_EBOECOIFJMP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_EBOECOIFJMP.proto\"D\n\023Unk2700_E" +
      "BOECOIFJMP\022\033\n\023Unk2700_PHGMKGEMCFF\030\001 \001(\010\022" +
      "\020\n\010level_id\030\013 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_EBOECOIFJMP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_EBOECOIFJMP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_EBOECOIFJMP_descriptor,
        new java.lang.String[] { "Unk2700PHGMKGEMCFF", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

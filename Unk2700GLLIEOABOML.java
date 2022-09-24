// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_GLLIEOABOML.proto

package emu.grasscutter.net.proto;

public final class Unk2700GLLIEOABOML {
  private Unk2700GLLIEOABOML() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_GLLIEOABOMLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_GLLIEOABOML)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 8;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool Unk2700_PHGMKGEMCFF = 10;</code>
     * @return The unk2700PHGMKGEMCFF.
     */
    boolean getUnk2700PHGMKGEMCFF();
  }
  /**
   * <pre>
   * CmdId: 8057
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_GLLIEOABOML}
   */
  public static final class Unk2700_GLLIEOABOML extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_GLLIEOABOML)
      Unk2700_GLLIEOABOMLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_GLLIEOABOML.newBuilder() to construct.
    private Unk2700_GLLIEOABOML(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_GLLIEOABOML() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_GLLIEOABOML();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_GLLIEOABOML(
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

              levelId_ = input.readUInt32();
              break;
            }
            case 64: {

              cardId_ = input.readUInt32();
              break;
            }
            case 80: {

              unk2700PHGMKGEMCFF_ = input.readBool();
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
      return emu.grasscutter.net.proto.Unk2700GLLIEOABOML.internal_static_Unk2700_GLLIEOABOML_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700GLLIEOABOML.internal_static_Unk2700_GLLIEOABOML_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML.class, emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 8;
    private int cardId_;
    /**
     * <code>uint32 card_id = 8;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int UNK2700_PHGMKGEMCFF_FIELD_NUMBER = 10;
    private boolean unk2700PHGMKGEMCFF_;
    /**
     * <code>bool Unk2700_PHGMKGEMCFF = 10;</code>
     * @return The unk2700PHGMKGEMCFF.
     */
    @java.lang.Override
    public boolean getUnk2700PHGMKGEMCFF() {
      return unk2700PHGMKGEMCFF_;
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
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(8, cardId_);
      }
      if (unk2700PHGMKGEMCFF_ != false) {
        output.writeBool(10, unk2700PHGMKGEMCFF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cardId_);
      }
      if (unk2700PHGMKGEMCFF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, unk2700PHGMKGEMCFF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML other = (emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML) obj;

      if (getCardId()
          != other.getCardId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getUnk2700PHGMKGEMCFF()
          != other.getUnk2700PHGMKGEMCFF()) return false;
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
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + UNK2700_PHGMKGEMCFF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700PHGMKGEMCFF());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML prototype) {
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
     * CmdId: 8057
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_GLLIEOABOML}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_GLLIEOABOML)
        emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOMLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700GLLIEOABOML.internal_static_Unk2700_GLLIEOABOML_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700GLLIEOABOML.internal_static_Unk2700_GLLIEOABOML_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML.class, emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML.newBuilder()
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
        cardId_ = 0;

        levelId_ = 0;

        unk2700PHGMKGEMCFF_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700GLLIEOABOML.internal_static_Unk2700_GLLIEOABOML_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML build() {
        emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML buildPartial() {
        emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML result = new emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML(this);
        result.cardId_ = cardId_;
        result.levelId_ = levelId_;
        result.unk2700PHGMKGEMCFF_ = unk2700PHGMKGEMCFF_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML other) {
        if (other == emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getUnk2700PHGMKGEMCFF() != false) {
          setUnk2700PHGMKGEMCFF(other.getUnk2700PHGMKGEMCFF());
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
        emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 8;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 8;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean unk2700PHGMKGEMCFF_ ;
      /**
       * <code>bool Unk2700_PHGMKGEMCFF = 10;</code>
       * @return The unk2700PHGMKGEMCFF.
       */
      @java.lang.Override
      public boolean getUnk2700PHGMKGEMCFF() {
        return unk2700PHGMKGEMCFF_;
      }
      /**
       * <code>bool Unk2700_PHGMKGEMCFF = 10;</code>
       * @param value The unk2700PHGMKGEMCFF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700PHGMKGEMCFF(boolean value) {
        
        unk2700PHGMKGEMCFF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_PHGMKGEMCFF = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700PHGMKGEMCFF() {
        
        unk2700PHGMKGEMCFF_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_GLLIEOABOML)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_GLLIEOABOML)
    private static final emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML();
    }

    public static emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_GLLIEOABOML>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_GLLIEOABOML>() {
      @java.lang.Override
      public Unk2700_GLLIEOABOML parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_GLLIEOABOML(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_GLLIEOABOML> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_GLLIEOABOML> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700GLLIEOABOML.Unk2700_GLLIEOABOML getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_GLLIEOABOML_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_GLLIEOABOML_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_GLLIEOABOML.proto\"U\n\023Unk2700_G" +
      "LLIEOABOML\022\017\n\007card_id\030\010 \001(\r\022\020\n\010level_id\030" +
      "\005 \001(\r\022\033\n\023Unk2700_PHGMKGEMCFF\030\n \001(\010B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_GLLIEOABOML_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_GLLIEOABOML_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_GLLIEOABOML_descriptor,
        new java.lang.String[] { "CardId", "LevelId", "Unk2700PHGMKGEMCFF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
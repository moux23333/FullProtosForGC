// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_OMGNOBICOCD.proto

package emu.grasscutter.net.proto;

public final class Unk2800OMGNOBICOCD {
  private Unk2800OMGNOBICOCD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_OMGNOBICOCDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_OMGNOBICOCD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2800_DPEOIJKEAPB = 14;</code>
     * @return The unk2800DPEOIJKEAPB.
     */
    int getUnk2800DPEOIJKEAPB();

    /**
     * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
     * @return Whether the unk2700OCIHJFOKHPK field is set.
     */
    boolean hasUnk2700OCIHJFOKHPK();
    /**
     * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
     * @return The unk2700OCIHJFOKHPK.
     */
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getUnk2700OCIHJFOKHPK();
    /**
     * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
     */
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getUnk2700OCIHJFOKHPKOrBuilder();

    /**
     * <code>uint32 gadget_entity_id = 10;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();
  }
  /**
   * <pre>
   * CmdId: 843
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2800_OMGNOBICOCD}
   */
  public static final class Unk2800_OMGNOBICOCD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_OMGNOBICOCD)
      Unk2800_OMGNOBICOCDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_OMGNOBICOCD.newBuilder() to construct.
    private Unk2800_OMGNOBICOCD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_OMGNOBICOCD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_OMGNOBICOCD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2800_OMGNOBICOCD(
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
            case 80: {

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder subBuilder = null;
              if (unk2700OCIHJFOKHPK_ != null) {
                subBuilder = unk2700OCIHJFOKHPK_.toBuilder();
              }
              unk2700OCIHJFOKHPK_ = input.readMessage(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(unk2700OCIHJFOKHPK_);
                unk2700OCIHJFOKHPK_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              unk2800DPEOIJKEAPB_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.internal_static_Unk2800_OMGNOBICOCD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.internal_static_Unk2800_OMGNOBICOCD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD.class, emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD.Builder.class);
    }

    public static final int UNK2800_DPEOIJKEAPB_FIELD_NUMBER = 14;
    private int unk2800DPEOIJKEAPB_;
    /**
     * <code>uint32 Unk2800_DPEOIJKEAPB = 14;</code>
     * @return The unk2800DPEOIJKEAPB.
     */
    @java.lang.Override
    public int getUnk2800DPEOIJKEAPB() {
      return unk2800DPEOIJKEAPB_;
    }

    public static final int UNK2700_OCIHJFOKHPK_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo unk2700OCIHJFOKHPK_;
    /**
     * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
     * @return Whether the unk2700OCIHJFOKHPK field is set.
     */
    @java.lang.Override
    public boolean hasUnk2700OCIHJFOKHPK() {
      return unk2700OCIHJFOKHPK_ != null;
    }
    /**
     * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
     * @return The unk2700OCIHJFOKHPK.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getUnk2700OCIHJFOKHPK() {
      return unk2700OCIHJFOKHPK_ == null ? emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : unk2700OCIHJFOKHPK_;
    }
    /**
     * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getUnk2700OCIHJFOKHPKOrBuilder() {
      return getUnk2700OCIHJFOKHPK();
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 10;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 10;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(10, gadgetEntityId_);
      }
      if (unk2700OCIHJFOKHPK_ != null) {
        output.writeMessage(11, getUnk2700OCIHJFOKHPK());
      }
      if (unk2800DPEOIJKEAPB_ != 0) {
        output.writeUInt32(14, unk2800DPEOIJKEAPB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gadgetEntityId_);
      }
      if (unk2700OCIHJFOKHPK_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getUnk2700OCIHJFOKHPK());
      }
      if (unk2800DPEOIJKEAPB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk2800DPEOIJKEAPB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD other = (emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD) obj;

      if (getUnk2800DPEOIJKEAPB()
          != other.getUnk2800DPEOIJKEAPB()) return false;
      if (hasUnk2700OCIHJFOKHPK() != other.hasUnk2700OCIHJFOKHPK()) return false;
      if (hasUnk2700OCIHJFOKHPK()) {
        if (!getUnk2700OCIHJFOKHPK()
            .equals(other.getUnk2700OCIHJFOKHPK())) return false;
      }
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
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
      hash = (37 * hash) + UNK2800_DPEOIJKEAPB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800DPEOIJKEAPB();
      if (hasUnk2700OCIHJFOKHPK()) {
        hash = (37 * hash) + UNK2700_OCIHJFOKHPK_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700OCIHJFOKHPK().hashCode();
      }
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD prototype) {
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
     * CmdId: 843
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2800_OMGNOBICOCD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_OMGNOBICOCD)
        emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.internal_static_Unk2800_OMGNOBICOCD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.internal_static_Unk2800_OMGNOBICOCD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD.class, emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD.newBuilder()
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
        unk2800DPEOIJKEAPB_ = 0;

        if (unk2700OCIHJFOKHPKBuilder_ == null) {
          unk2700OCIHJFOKHPK_ = null;
        } else {
          unk2700OCIHJFOKHPK_ = null;
          unk2700OCIHJFOKHPKBuilder_ = null;
        }
        gadgetEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.internal_static_Unk2800_OMGNOBICOCD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD build() {
        emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD buildPartial() {
        emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD result = new emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD(this);
        result.unk2800DPEOIJKEAPB_ = unk2800DPEOIJKEAPB_;
        if (unk2700OCIHJFOKHPKBuilder_ == null) {
          result.unk2700OCIHJFOKHPK_ = unk2700OCIHJFOKHPK_;
        } else {
          result.unk2700OCIHJFOKHPK_ = unk2700OCIHJFOKHPKBuilder_.build();
        }
        result.gadgetEntityId_ = gadgetEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD other) {
        if (other == emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD.getDefaultInstance()) return this;
        if (other.getUnk2800DPEOIJKEAPB() != 0) {
          setUnk2800DPEOIJKEAPB(other.getUnk2800DPEOIJKEAPB());
        }
        if (other.hasUnk2700OCIHJFOKHPK()) {
          mergeUnk2700OCIHJFOKHPK(other.getUnk2700OCIHJFOKHPK());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
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
        emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk2800DPEOIJKEAPB_ ;
      /**
       * <code>uint32 Unk2800_DPEOIJKEAPB = 14;</code>
       * @return The unk2800DPEOIJKEAPB.
       */
      @java.lang.Override
      public int getUnk2800DPEOIJKEAPB() {
        return unk2800DPEOIJKEAPB_;
      }
      /**
       * <code>uint32 Unk2800_DPEOIJKEAPB = 14;</code>
       * @param value The unk2800DPEOIJKEAPB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800DPEOIJKEAPB(int value) {
        
        unk2800DPEOIJKEAPB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_DPEOIJKEAPB = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800DPEOIJKEAPB() {
        
        unk2800DPEOIJKEAPB_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo unk2700OCIHJFOKHPK_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> unk2700OCIHJFOKHPKBuilder_;
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       * @return Whether the unk2700OCIHJFOKHPK field is set.
       */
      public boolean hasUnk2700OCIHJFOKHPK() {
        return unk2700OCIHJFOKHPKBuilder_ != null || unk2700OCIHJFOKHPK_ != null;
      }
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       * @return The unk2700OCIHJFOKHPK.
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getUnk2700OCIHJFOKHPK() {
        if (unk2700OCIHJFOKHPKBuilder_ == null) {
          return unk2700OCIHJFOKHPK_ == null ? emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : unk2700OCIHJFOKHPK_;
        } else {
          return unk2700OCIHJFOKHPKBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       */
      public Builder setUnk2700OCIHJFOKHPK(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (unk2700OCIHJFOKHPKBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk2700OCIHJFOKHPK_ = value;
          onChanged();
        } else {
          unk2700OCIHJFOKHPKBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       */
      public Builder setUnk2700OCIHJFOKHPK(
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder builderForValue) {
        if (unk2700OCIHJFOKHPKBuilder_ == null) {
          unk2700OCIHJFOKHPK_ = builderForValue.build();
          onChanged();
        } else {
          unk2700OCIHJFOKHPKBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       */
      public Builder mergeUnk2700OCIHJFOKHPK(emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (unk2700OCIHJFOKHPKBuilder_ == null) {
          if (unk2700OCIHJFOKHPK_ != null) {
            unk2700OCIHJFOKHPK_ =
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.newBuilder(unk2700OCIHJFOKHPK_).mergeFrom(value).buildPartial();
          } else {
            unk2700OCIHJFOKHPK_ = value;
          }
          onChanged();
        } else {
          unk2700OCIHJFOKHPKBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       */
      public Builder clearUnk2700OCIHJFOKHPK() {
        if (unk2700OCIHJFOKHPKBuilder_ == null) {
          unk2700OCIHJFOKHPK_ = null;
          onChanged();
        } else {
          unk2700OCIHJFOKHPK_ = null;
          unk2700OCIHJFOKHPKBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder getUnk2700OCIHJFOKHPKBuilder() {
        
        onChanged();
        return getUnk2700OCIHJFOKHPKFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       */
      public emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getUnk2700OCIHJFOKHPKOrBuilder() {
        if (unk2700OCIHJFOKHPKBuilder_ != null) {
          return unk2700OCIHJFOKHPKBuilder_.getMessageOrBuilder();
        } else {
          return unk2700OCIHJFOKHPK_ == null ?
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : unk2700OCIHJFOKHPK_;
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo Unk2700_OCIHJFOKHPK = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> 
          getUnk2700OCIHJFOKHPKFieldBuilder() {
        if (unk2700OCIHJFOKHPKBuilder_ == null) {
          unk2700OCIHJFOKHPKBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder>(
                  getUnk2700OCIHJFOKHPK(),
                  getParentForChildren(),
                  isClean());
          unk2700OCIHJFOKHPK_ = null;
        }
        return unk2700OCIHJFOKHPKBuilder_;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_OMGNOBICOCD)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_OMGNOBICOCD)
    private static final emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD();
    }

    public static emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_OMGNOBICOCD>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_OMGNOBICOCD>() {
      @java.lang.Override
      public Unk2800_OMGNOBICOCD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2800_OMGNOBICOCD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2800_OMGNOBICOCD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_OMGNOBICOCD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2800OMGNOBICOCD.Unk2800_OMGNOBICOCD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_OMGNOBICOCD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_OMGNOBICOCD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_OMGNOBICOCD.proto\032\032CustomGadge" +
      "tTreeInfo.proto\"\200\001\n\023Unk2800_OMGNOBICOCD\022" +
      "\033\n\023Unk2800_DPEOIJKEAPB\030\016 \001(\r\0222\n\023Unk2700_" +
      "OCIHJFOKHPK\030\013 \001(\0132\025.CustomGadgetTreeInfo" +
      "\022\030\n\020gadget_entity_id\030\n \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor(),
        });
    internal_static_Unk2800_OMGNOBICOCD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_OMGNOBICOCD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_OMGNOBICOCD_descriptor,
        new java.lang.String[] { "Unk2800DPEOIJKEAPB", "Unk2700OCIHJFOKHPK", "GadgetEntityId", });
    emu.grasscutter.net.proto.CustomGadgetTreeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

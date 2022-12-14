// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_HOPDLJLBKIC_ServerRsp.proto

package emu.grasscutter.net.proto;

public final class Unk2700HOPDLJLBKICServerRsp {
  private Unk2700HOPDLJLBKICServerRsp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_HOPDLJLBKIC_ServerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_HOPDLJLBKIC_ServerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 material_id = 11;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
     * @return The enum numeric value on the wire for unk2700MHEKJGAIFBO.
     */
    int getUnk2700MHEKJGAIFBOValue();
    /**
     * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
     * @return The unk2700MHEKJGAIFBO.
     */
    emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK getUnk2700MHEKJGAIFBO();

    /**
     * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
     * @return Whether the unk2700LNPJLPODIGB field is set.
     */
    boolean hasUnk2700LNPJLPODIGB();
    /**
     * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
     * @return The unk2700LNPJLPODIGB.
     */
    emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getUnk2700LNPJLPODIGB();
    /**
     * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
     */
    emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getUnk2700LNPJLPODIGBOrBuilder();

    /**
     * <code>uint32 Unk2700_GMHLHKIIGIC = 15;</code>
     * @return The unk2700GMHLHKIIGIC.
     */
    int getUnk2700GMHLHKIIGIC();
  }
  /**
   * <pre>
   * CmdId: 6056
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_HOPDLJLBKIC_ServerRsp}
   */
  public static final class Unk2700_HOPDLJLBKIC_ServerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_HOPDLJLBKIC_ServerRsp)
      Unk2700_HOPDLJLBKIC_ServerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_HOPDLJLBKIC_ServerRsp.newBuilder() to construct.
    private Unk2700_HOPDLJLBKIC_ServerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_HOPDLJLBKIC_ServerRsp() {
      unk2700MHEKJGAIFBO_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_HOPDLJLBKIC_ServerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_HOPDLJLBKIC_ServerRsp(
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
            case 48: {
              int rawValue = input.readEnum();

              unk2700MHEKJGAIFBO_ = rawValue;
              break;
            }
            case 82: {
              emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder subBuilder = null;
              if (unk2700LNPJLPODIGB_ != null) {
                subBuilder = unk2700LNPJLPODIGB_.toBuilder();
              }
              unk2700LNPJLPODIGB_ = input.readMessage(emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(unk2700LNPJLPODIGB_);
                unk2700LNPJLPODIGB_ = subBuilder.buildPartial();
              }

              break;
            }
            case 88: {

              materialId_ = input.readUInt32();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              unk2700GMHLHKIIGIC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp.class, emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 11;
    private int materialId_;
    /**
     * <code>uint32 material_id = 11;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int UNK2700_MHEKJGAIFBO_FIELD_NUMBER = 6;
    private int unk2700MHEKJGAIFBO_;
    /**
     * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
     * @return The enum numeric value on the wire for unk2700MHEKJGAIFBO.
     */
    @java.lang.Override public int getUnk2700MHEKJGAIFBOValue() {
      return unk2700MHEKJGAIFBO_;
    }
    /**
     * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
     * @return The unk2700MHEKJGAIFBO.
     */
    @java.lang.Override public emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK getUnk2700MHEKJGAIFBO() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK result = emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK.valueOf(unk2700MHEKJGAIFBO_);
      return result == null ? emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK.UNRECOGNIZED : result;
    }

    public static final int UNK2700_LNPJLPODIGB_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData unk2700LNPJLPODIGB_;
    /**
     * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
     * @return Whether the unk2700LNPJLPODIGB field is set.
     */
    @java.lang.Override
    public boolean hasUnk2700LNPJLPODIGB() {
      return unk2700LNPJLPODIGB_ != null;
    }
    /**
     * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
     * @return The unk2700LNPJLPODIGB.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getUnk2700LNPJLPODIGB() {
      return unk2700LNPJLPODIGB_ == null ? emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance() : unk2700LNPJLPODIGB_;
    }
    /**
     * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getUnk2700LNPJLPODIGBOrBuilder() {
      return getUnk2700LNPJLPODIGB();
    }

    public static final int UNK2700_GMHLHKIIGIC_FIELD_NUMBER = 15;
    private int unk2700GMHLHKIIGIC_;
    /**
     * <code>uint32 Unk2700_GMHLHKIIGIC = 15;</code>
     * @return The unk2700GMHLHKIIGIC.
     */
    @java.lang.Override
    public int getUnk2700GMHLHKIIGIC() {
      return unk2700GMHLHKIIGIC_;
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
      if (unk2700MHEKJGAIFBO_ != emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK.Unk2700_NOCLNCCJEGK_NONE.getNumber()) {
        output.writeEnum(6, unk2700MHEKJGAIFBO_);
      }
      if (unk2700LNPJLPODIGB_ != null) {
        output.writeMessage(10, getUnk2700LNPJLPODIGB());
      }
      if (materialId_ != 0) {
        output.writeUInt32(11, materialId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      if (unk2700GMHLHKIIGIC_ != 0) {
        output.writeUInt32(15, unk2700GMHLHKIIGIC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700MHEKJGAIFBO_ != emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK.Unk2700_NOCLNCCJEGK_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, unk2700MHEKJGAIFBO_);
      }
      if (unk2700LNPJLPODIGB_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getUnk2700LNPJLPODIGB());
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, materialId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
      }
      if (unk2700GMHLHKIIGIC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk2700GMHLHKIIGIC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp other = (emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (unk2700MHEKJGAIFBO_ != other.unk2700MHEKJGAIFBO_) return false;
      if (hasUnk2700LNPJLPODIGB() != other.hasUnk2700LNPJLPODIGB()) return false;
      if (hasUnk2700LNPJLPODIGB()) {
        if (!getUnk2700LNPJLPODIGB()
            .equals(other.getUnk2700LNPJLPODIGB())) return false;
      }
      if (getUnk2700GMHLHKIIGIC()
          != other.getUnk2700GMHLHKIIGIC()) return false;
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
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + UNK2700_MHEKJGAIFBO_FIELD_NUMBER;
      hash = (53 * hash) + unk2700MHEKJGAIFBO_;
      if (hasUnk2700LNPJLPODIGB()) {
        hash = (37 * hash) + UNK2700_LNPJLPODIGB_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700LNPJLPODIGB().hashCode();
      }
      hash = (37 * hash) + UNK2700_GMHLHKIIGIC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700GMHLHKIIGIC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp prototype) {
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
     * CmdId: 6056
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_HOPDLJLBKIC_ServerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_HOPDLJLBKIC_ServerRsp)
        emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp.class, emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp.newBuilder()
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

        materialId_ = 0;

        unk2700MHEKJGAIFBO_ = 0;

        if (unk2700LNPJLPODIGBBuilder_ == null) {
          unk2700LNPJLPODIGB_ = null;
        } else {
          unk2700LNPJLPODIGB_ = null;
          unk2700LNPJLPODIGBBuilder_ = null;
        }
        unk2700GMHLHKIIGIC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp build() {
        emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp buildPartial() {
        emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp result = new emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp(this);
        result.retcode_ = retcode_;
        result.materialId_ = materialId_;
        result.unk2700MHEKJGAIFBO_ = unk2700MHEKJGAIFBO_;
        if (unk2700LNPJLPODIGBBuilder_ == null) {
          result.unk2700LNPJLPODIGB_ = unk2700LNPJLPODIGB_;
        } else {
          result.unk2700LNPJLPODIGB_ = unk2700LNPJLPODIGBBuilder_.build();
        }
        result.unk2700GMHLHKIIGIC_ = unk2700GMHLHKIIGIC_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp other) {
        if (other == emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.unk2700MHEKJGAIFBO_ != 0) {
          setUnk2700MHEKJGAIFBOValue(other.getUnk2700MHEKJGAIFBOValue());
        }
        if (other.hasUnk2700LNPJLPODIGB()) {
          mergeUnk2700LNPJLPODIGB(other.getUnk2700LNPJLPODIGB());
        }
        if (other.getUnk2700GMHLHKIIGIC() != 0) {
          setUnk2700GMHLHKIIGIC(other.getUnk2700GMHLHKIIGIC());
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
        emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 11;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 11;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private int unk2700MHEKJGAIFBO_ = 0;
      /**
       * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
       * @return The enum numeric value on the wire for unk2700MHEKJGAIFBO.
       */
      @java.lang.Override public int getUnk2700MHEKJGAIFBOValue() {
        return unk2700MHEKJGAIFBO_;
      }
      /**
       * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
       * @param value The enum numeric value on the wire for unk2700MHEKJGAIFBO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MHEKJGAIFBOValue(int value) {
        
        unk2700MHEKJGAIFBO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
       * @return The unk2700MHEKJGAIFBO.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK getUnk2700MHEKJGAIFBO() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK result = emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK.valueOf(unk2700MHEKJGAIFBO_);
        return result == null ? emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
       * @param value The unk2700MHEKJGAIFBO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MHEKJGAIFBO(emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.Unk2700_NOCLNCCJEGK value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk2700MHEKJGAIFBO_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_NOCLNCCJEGK Unk2700_MHEKJGAIFBO = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700MHEKJGAIFBO() {
        
        unk2700MHEKJGAIFBO_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData unk2700LNPJLPODIGB_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData, emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> unk2700LNPJLPODIGBBuilder_;
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       * @return Whether the unk2700LNPJLPODIGB field is set.
       */
      public boolean hasUnk2700LNPJLPODIGB() {
        return unk2700LNPJLPODIGBBuilder_ != null || unk2700LNPJLPODIGB_ != null;
      }
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       * @return The unk2700LNPJLPODIGB.
       */
      public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getUnk2700LNPJLPODIGB() {
        if (unk2700LNPJLPODIGBBuilder_ == null) {
          return unk2700LNPJLPODIGB_ == null ? emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance() : unk2700LNPJLPODIGB_;
        } else {
          return unk2700LNPJLPODIGBBuilder_.getMessage();
        }
      }
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       */
      public Builder setUnk2700LNPJLPODIGB(emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
        if (unk2700LNPJLPODIGBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk2700LNPJLPODIGB_ = value;
          onChanged();
        } else {
          unk2700LNPJLPODIGBBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       */
      public Builder setUnk2700LNPJLPODIGB(
          emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
        if (unk2700LNPJLPODIGBBuilder_ == null) {
          unk2700LNPJLPODIGB_ = builderForValue.build();
          onChanged();
        } else {
          unk2700LNPJLPODIGBBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       */
      public Builder mergeUnk2700LNPJLPODIGB(emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
        if (unk2700LNPJLPODIGBBuilder_ == null) {
          if (unk2700LNPJLPODIGB_ != null) {
            unk2700LNPJLPODIGB_ =
              emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.newBuilder(unk2700LNPJLPODIGB_).mergeFrom(value).buildPartial();
          } else {
            unk2700LNPJLPODIGB_ = value;
          }
          onChanged();
        } else {
          unk2700LNPJLPODIGBBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       */
      public Builder clearUnk2700LNPJLPODIGB() {
        if (unk2700LNPJLPODIGBBuilder_ == null) {
          unk2700LNPJLPODIGB_ = null;
          onChanged();
        } else {
          unk2700LNPJLPODIGB_ = null;
          unk2700LNPJLPODIGBBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       */
      public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder getUnk2700LNPJLPODIGBBuilder() {
        
        onChanged();
        return getUnk2700LNPJLPODIGBFieldBuilder().getBuilder();
      }
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       */
      public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getUnk2700LNPJLPODIGBOrBuilder() {
        if (unk2700LNPJLPODIGBBuilder_ != null) {
          return unk2700LNPJLPODIGBBuilder_.getMessageOrBuilder();
        } else {
          return unk2700LNPJLPODIGB_ == null ?
              emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance() : unk2700LNPJLPODIGB_;
        }
      }
      /**
       * <code>.WidgetCoolDownData Unk2700_LNPJLPODIGB = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData, emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> 
          getUnk2700LNPJLPODIGBFieldBuilder() {
        if (unk2700LNPJLPODIGBBuilder_ == null) {
          unk2700LNPJLPODIGBBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData, emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>(
                  getUnk2700LNPJLPODIGB(),
                  getParentForChildren(),
                  isClean());
          unk2700LNPJLPODIGB_ = null;
        }
        return unk2700LNPJLPODIGBBuilder_;
      }

      private int unk2700GMHLHKIIGIC_ ;
      /**
       * <code>uint32 Unk2700_GMHLHKIIGIC = 15;</code>
       * @return The unk2700GMHLHKIIGIC.
       */
      @java.lang.Override
      public int getUnk2700GMHLHKIIGIC() {
        return unk2700GMHLHKIIGIC_;
      }
      /**
       * <code>uint32 Unk2700_GMHLHKIIGIC = 15;</code>
       * @param value The unk2700GMHLHKIIGIC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700GMHLHKIIGIC(int value) {
        
        unk2700GMHLHKIIGIC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_GMHLHKIIGIC = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700GMHLHKIIGIC() {
        
        unk2700GMHLHKIIGIC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_HOPDLJLBKIC_ServerRsp)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_HOPDLJLBKIC_ServerRsp)
    private static final emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp();
    }

    public static emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_HOPDLJLBKIC_ServerRsp>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_HOPDLJLBKIC_ServerRsp>() {
      @java.lang.Override
      public Unk2700_HOPDLJLBKIC_ServerRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_HOPDLJLBKIC_ServerRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_HOPDLJLBKIC_ServerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_HOPDLJLBKIC_ServerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700HOPDLJLBKICServerRsp.Unk2700_HOPDLJLBKIC_ServerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_HOPDLJLBKIC_ServerRsp.proto\032\031U" +
      "nk2700_NOCLNCCJEGK.proto\032\030WidgetCoolDown" +
      "Data.proto\"\307\001\n\035Unk2700_HOPDLJLBKIC_Serve" +
      "rRsp\022\017\n\007retcode\030\016 \001(\005\022\023\n\013material_id\030\013 \001" +
      "(\r\0221\n\023Unk2700_MHEKJGAIFBO\030\006 \001(\0162\024.Unk270" +
      "0_NOCLNCCJEGK\0220\n\023Unk2700_LNPJLPODIGB\030\n \001" +
      "(\0132\023.WidgetCoolDownData\022\033\n\023Unk2700_GMHLH" +
      "KIIGIC\030\017 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.getDescriptor(),
          emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.getDescriptor(),
        });
    internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_HOPDLJLBKIC_ServerRsp_descriptor,
        new java.lang.String[] { "Retcode", "MaterialId", "Unk2700MHEKJGAIFBO", "Unk2700LNPJLPODIGB", "Unk2700GMHLHKIIGIC", });
    emu.grasscutter.net.proto.Unk2700NOCLNCCJEGK.getDescriptor();
    emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_LMAKABBJNLN.proto

package emu.grasscutter.net.proto;

public final class Unk2700LMAKABBJNLN {
  private Unk2700LMAKABBJNLN() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_LMAKABBJNLNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_LMAKABBJNLN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON> 
        getUnk2700COOFMKLNBNDList();
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON getUnk2700COOFMKLNBND(int index);
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    int getUnk2700COOFMKLNBNDCount();
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder> 
        getUnk2700COOFMKLNBNDOrBuilderList();
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder getUnk2700COOFMKLNBNDOrBuilder(
        int index);

    /**
     * <code>uint32 schedule_id = 10;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 8253
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_LMAKABBJNLN}
   */
  public static final class Unk2700_LMAKABBJNLN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_LMAKABBJNLN)
      Unk2700_LMAKABBJNLNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_LMAKABBJNLN.newBuilder() to construct.
    private Unk2700_LMAKABBJNLN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_LMAKABBJNLN() {
      unk2700COOFMKLNBND_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_LMAKABBJNLN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_LMAKABBJNLN(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700COOFMKLNBND_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700COOFMKLNBND_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unk2700COOFMKLNBND_ = java.util.Collections.unmodifiableList(unk2700COOFMKLNBND_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.internal_static_Unk2700_LMAKABBJNLN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.internal_static_Unk2700_LMAKABBJNLN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN.class, emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK2700_COOFMKLNBND_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON> unk2700COOFMKLNBND_;
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON> getUnk2700COOFMKLNBNDList() {
      return unk2700COOFMKLNBND_;
    }
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder> 
        getUnk2700COOFMKLNBNDOrBuilderList() {
      return unk2700COOFMKLNBND_;
    }
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    @java.lang.Override
    public int getUnk2700COOFMKLNBNDCount() {
      return unk2700COOFMKLNBND_.size();
    }
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON getUnk2700COOFMKLNBND(int index) {
      return unk2700COOFMKLNBND_.get(index);
    }
    /**
     * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder getUnk2700COOFMKLNBNDOrBuilder(
        int index) {
      return unk2700COOFMKLNBND_.get(index);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 10;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 10;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(10, scheduleId_);
      }
      for (int i = 0; i < unk2700COOFMKLNBND_.size(); i++) {
        output.writeMessage(11, unk2700COOFMKLNBND_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, scheduleId_);
      }
      for (int i = 0; i < unk2700COOFMKLNBND_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, unk2700COOFMKLNBND_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN other = (emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getUnk2700COOFMKLNBNDList()
          .equals(other.getUnk2700COOFMKLNBNDList())) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      if (getUnk2700COOFMKLNBNDCount() > 0) {
        hash = (37 * hash) + UNK2700_COOFMKLNBND_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700COOFMKLNBNDList().hashCode();
      }
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN prototype) {
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
     * CmdId: 8253
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_LMAKABBJNLN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_LMAKABBJNLN)
        emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.internal_static_Unk2700_LMAKABBJNLN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.internal_static_Unk2700_LMAKABBJNLN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN.class, emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN.newBuilder()
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
          getUnk2700COOFMKLNBNDFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (unk2700COOFMKLNBNDBuilder_ == null) {
          unk2700COOFMKLNBND_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700COOFMKLNBNDBuilder_.clear();
        }
        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.internal_static_Unk2700_LMAKABBJNLN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN build() {
        emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN buildPartial() {
        emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN result = new emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700COOFMKLNBND_ = java.util.Collections.unmodifiableList(unk2700COOFMKLNBND_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700COOFMKLNBND_ = unk2700COOFMKLNBND_;
        } else {
          result.unk2700COOFMKLNBND_ = unk2700COOFMKLNBNDBuilder_.build();
        }
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN other) {
        if (other == emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          if (!other.unk2700COOFMKLNBND_.isEmpty()) {
            if (unk2700COOFMKLNBND_.isEmpty()) {
              unk2700COOFMKLNBND_ = other.unk2700COOFMKLNBND_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700COOFMKLNBNDIsMutable();
              unk2700COOFMKLNBND_.addAll(other.unk2700COOFMKLNBND_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700COOFMKLNBND_.isEmpty()) {
            if (unk2700COOFMKLNBNDBuilder_.isEmpty()) {
              unk2700COOFMKLNBNDBuilder_.dispose();
              unk2700COOFMKLNBNDBuilder_ = null;
              unk2700COOFMKLNBND_ = other.unk2700COOFMKLNBND_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700COOFMKLNBNDBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700COOFMKLNBNDFieldBuilder() : null;
            } else {
              unk2700COOFMKLNBNDBuilder_.addAllMessages(other.unk2700COOFMKLNBND_);
            }
          }
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON> unk2700COOFMKLNBND_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700COOFMKLNBNDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700COOFMKLNBND_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON>(unk2700COOFMKLNBND_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder> unk2700COOFMKLNBNDBuilder_;

      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON> getUnk2700COOFMKLNBNDList() {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700COOFMKLNBND_);
        } else {
          return unk2700COOFMKLNBNDBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public int getUnk2700COOFMKLNBNDCount() {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          return unk2700COOFMKLNBND_.size();
        } else {
          return unk2700COOFMKLNBNDBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON getUnk2700COOFMKLNBND(int index) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          return unk2700COOFMKLNBND_.get(index);
        } else {
          return unk2700COOFMKLNBNDBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder setUnk2700COOFMKLNBND(
          int index, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON value) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700COOFMKLNBNDIsMutable();
          unk2700COOFMKLNBND_.set(index, value);
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder setUnk2700COOFMKLNBND(
          int index, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder builderForValue) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          ensureUnk2700COOFMKLNBNDIsMutable();
          unk2700COOFMKLNBND_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder addUnk2700COOFMKLNBND(emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON value) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700COOFMKLNBNDIsMutable();
          unk2700COOFMKLNBND_.add(value);
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder addUnk2700COOFMKLNBND(
          int index, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON value) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700COOFMKLNBNDIsMutable();
          unk2700COOFMKLNBND_.add(index, value);
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder addUnk2700COOFMKLNBND(
          emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder builderForValue) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          ensureUnk2700COOFMKLNBNDIsMutable();
          unk2700COOFMKLNBND_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder addUnk2700COOFMKLNBND(
          int index, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder builderForValue) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          ensureUnk2700COOFMKLNBNDIsMutable();
          unk2700COOFMKLNBND_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder addAllUnk2700COOFMKLNBND(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON> values) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          ensureUnk2700COOFMKLNBNDIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700COOFMKLNBND_);
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder clearUnk2700COOFMKLNBND() {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          unk2700COOFMKLNBND_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public Builder removeUnk2700COOFMKLNBND(int index) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          ensureUnk2700COOFMKLNBNDIsMutable();
          unk2700COOFMKLNBND_.remove(index);
          onChanged();
        } else {
          unk2700COOFMKLNBNDBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder getUnk2700COOFMKLNBNDBuilder(
          int index) {
        return getUnk2700COOFMKLNBNDFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder getUnk2700COOFMKLNBNDOrBuilder(
          int index) {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          return unk2700COOFMKLNBND_.get(index);  } else {
          return unk2700COOFMKLNBNDBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder> 
           getUnk2700COOFMKLNBNDOrBuilderList() {
        if (unk2700COOFMKLNBNDBuilder_ != null) {
          return unk2700COOFMKLNBNDBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700COOFMKLNBND_);
        }
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder addUnk2700COOFMKLNBNDBuilder() {
        return getUnk2700COOFMKLNBNDFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder addUnk2700COOFMKLNBNDBuilder(
          int index) {
        return getUnk2700COOFMKLNBNDFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_FGJFFMPOJON Unk2700_COOFMKLNBND = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder> 
           getUnk2700COOFMKLNBNDBuilderList() {
        return getUnk2700COOFMKLNBNDFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder> 
          getUnk2700COOFMKLNBNDFieldBuilder() {
        if (unk2700COOFMKLNBNDBuilder_ == null) {
          unk2700COOFMKLNBNDBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJON.Builder, emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.Unk2700_FGJFFMPOJONOrBuilder>(
                  unk2700COOFMKLNBND_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700COOFMKLNBND_ = null;
        }
        return unk2700COOFMKLNBNDBuilder_;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_LMAKABBJNLN)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_LMAKABBJNLN)
    private static final emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN();
    }

    public static emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_LMAKABBJNLN>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_LMAKABBJNLN>() {
      @java.lang.Override
      public Unk2700_LMAKABBJNLN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_LMAKABBJNLN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_LMAKABBJNLN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_LMAKABBJNLN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700LMAKABBJNLN.Unk2700_LMAKABBJNLN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_LMAKABBJNLN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_LMAKABBJNLN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_LMAKABBJNLN.proto\032\031Unk2700_FGJ" +
      "FFMPOJON.proto\"n\n\023Unk2700_LMAKABBJNLN\022\017\n" +
      "\007retcode\030\006 \001(\005\0221\n\023Unk2700_COOFMKLNBND\030\013 " +
      "\003(\0132\024.Unk2700_FGJFFMPOJON\022\023\n\013schedule_id" +
      "\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.getDescriptor(),
        });
    internal_static_Unk2700_LMAKABBJNLN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_LMAKABBJNLN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_LMAKABBJNLN_descriptor,
        new java.lang.String[] { "Retcode", "Unk2700COOFMKLNBND", "ScheduleId", });
    emu.grasscutter.net.proto.Unk2700FGJFFMPOJON.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

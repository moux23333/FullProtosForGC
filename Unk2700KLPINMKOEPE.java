// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_KLPINMKOEPE.proto

package emu.grasscutter.net.proto;

public final class Unk2700KLPINMKOEPE {
  private Unk2700KLPINMKOEPE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_KLPINMKOEPEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_KLPINMKOEPE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 room_id = 15;</code>
     * @return The roomId.
     */
    int getRoomId();

    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE> 
        getUnk2700ICMKKOMLHIHList();
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE getUnk2700ICMKKOMLHIH(int index);
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    int getUnk2700ICMKKOMLHIHCount();
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder> 
        getUnk2700ICMKKOMLHIHOrBuilderList();
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder getUnk2700ICMKKOMLHIHOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Unk2700_KLPINMKOEPE}
   */
  public static final class Unk2700_KLPINMKOEPE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_KLPINMKOEPE)
      Unk2700_KLPINMKOEPEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_KLPINMKOEPE.newBuilder() to construct.
    private Unk2700_KLPINMKOEPE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_KLPINMKOEPE() {
      unk2700ICMKKOMLHIH_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_KLPINMKOEPE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_KLPINMKOEPE(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700ICMKKOMLHIH_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700ICMKKOMLHIH_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.parser(), extensionRegistry));
              break;
            }
            case 120: {

              roomId_ = input.readUInt32();
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
          unk2700ICMKKOMLHIH_ = java.util.Collections.unmodifiableList(unk2700ICMKKOMLHIH_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.internal_static_Unk2700_KLPINMKOEPE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.internal_static_Unk2700_KLPINMKOEPE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE.class, emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE.Builder.class);
    }

    public static final int ROOM_ID_FIELD_NUMBER = 15;
    private int roomId_;
    /**
     * <code>uint32 room_id = 15;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public int getRoomId() {
      return roomId_;
    }

    public static final int UNK2700_ICMKKOMLHIH_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE> unk2700ICMKKOMLHIH_;
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE> getUnk2700ICMKKOMLHIHList() {
      return unk2700ICMKKOMLHIH_;
    }
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder> 
        getUnk2700ICMKKOMLHIHOrBuilderList() {
      return unk2700ICMKKOMLHIH_;
    }
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    @java.lang.Override
    public int getUnk2700ICMKKOMLHIHCount() {
      return unk2700ICMKKOMLHIH_.size();
    }
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE getUnk2700ICMKKOMLHIH(int index) {
      return unk2700ICMKKOMLHIH_.get(index);
    }
    /**
     * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder getUnk2700ICMKKOMLHIHOrBuilder(
        int index) {
      return unk2700ICMKKOMLHIH_.get(index);
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
      for (int i = 0; i < unk2700ICMKKOMLHIH_.size(); i++) {
        output.writeMessage(4, unk2700ICMKKOMLHIH_.get(i));
      }
      if (roomId_ != 0) {
        output.writeUInt32(15, roomId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700ICMKKOMLHIH_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, unk2700ICMKKOMLHIH_.get(i));
      }
      if (roomId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, roomId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE other = (emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE) obj;

      if (getRoomId()
          != other.getRoomId()) return false;
      if (!getUnk2700ICMKKOMLHIHList()
          .equals(other.getUnk2700ICMKKOMLHIHList())) return false;
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
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomId();
      if (getUnk2700ICMKKOMLHIHCount() > 0) {
        hash = (37 * hash) + UNK2700_ICMKKOMLHIH_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700ICMKKOMLHIHList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE prototype) {
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
     * Protobuf type {@code Unk2700_KLPINMKOEPE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_KLPINMKOEPE)
        emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.internal_static_Unk2700_KLPINMKOEPE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.internal_static_Unk2700_KLPINMKOEPE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE.class, emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE.newBuilder()
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
          getUnk2700ICMKKOMLHIHFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        roomId_ = 0;

        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          unk2700ICMKKOMLHIH_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700ICMKKOMLHIHBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.internal_static_Unk2700_KLPINMKOEPE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE build() {
        emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE buildPartial() {
        emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE result = new emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE(this);
        int from_bitField0_ = bitField0_;
        result.roomId_ = roomId_;
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700ICMKKOMLHIH_ = java.util.Collections.unmodifiableList(unk2700ICMKKOMLHIH_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700ICMKKOMLHIH_ = unk2700ICMKKOMLHIH_;
        } else {
          result.unk2700ICMKKOMLHIH_ = unk2700ICMKKOMLHIHBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE other) {
        if (other == emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE.getDefaultInstance()) return this;
        if (other.getRoomId() != 0) {
          setRoomId(other.getRoomId());
        }
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          if (!other.unk2700ICMKKOMLHIH_.isEmpty()) {
            if (unk2700ICMKKOMLHIH_.isEmpty()) {
              unk2700ICMKKOMLHIH_ = other.unk2700ICMKKOMLHIH_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700ICMKKOMLHIHIsMutable();
              unk2700ICMKKOMLHIH_.addAll(other.unk2700ICMKKOMLHIH_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700ICMKKOMLHIH_.isEmpty()) {
            if (unk2700ICMKKOMLHIHBuilder_.isEmpty()) {
              unk2700ICMKKOMLHIHBuilder_.dispose();
              unk2700ICMKKOMLHIHBuilder_ = null;
              unk2700ICMKKOMLHIH_ = other.unk2700ICMKKOMLHIH_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700ICMKKOMLHIHBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700ICMKKOMLHIHFieldBuilder() : null;
            } else {
              unk2700ICMKKOMLHIHBuilder_.addAllMessages(other.unk2700ICMKKOMLHIH_);
            }
          }
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
        emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int roomId_ ;
      /**
       * <code>uint32 room_id = 15;</code>
       * @return The roomId.
       */
      @java.lang.Override
      public int getRoomId() {
        return roomId_;
      }
      /**
       * <code>uint32 room_id = 15;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(int value) {
        
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        
        roomId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE> unk2700ICMKKOMLHIH_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700ICMKKOMLHIHIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700ICMKKOMLHIH_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE>(unk2700ICMKKOMLHIH_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder> unk2700ICMKKOMLHIHBuilder_;

      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE> getUnk2700ICMKKOMLHIHList() {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700ICMKKOMLHIH_);
        } else {
          return unk2700ICMKKOMLHIHBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public int getUnk2700ICMKKOMLHIHCount() {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          return unk2700ICMKKOMLHIH_.size();
        } else {
          return unk2700ICMKKOMLHIHBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE getUnk2700ICMKKOMLHIH(int index) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          return unk2700ICMKKOMLHIH_.get(index);
        } else {
          return unk2700ICMKKOMLHIHBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder setUnk2700ICMKKOMLHIH(
          int index, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE value) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700ICMKKOMLHIHIsMutable();
          unk2700ICMKKOMLHIH_.set(index, value);
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder setUnk2700ICMKKOMLHIH(
          int index, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder builderForValue) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          ensureUnk2700ICMKKOMLHIHIsMutable();
          unk2700ICMKKOMLHIH_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder addUnk2700ICMKKOMLHIH(emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE value) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700ICMKKOMLHIHIsMutable();
          unk2700ICMKKOMLHIH_.add(value);
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder addUnk2700ICMKKOMLHIH(
          int index, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE value) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700ICMKKOMLHIHIsMutable();
          unk2700ICMKKOMLHIH_.add(index, value);
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder addUnk2700ICMKKOMLHIH(
          emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder builderForValue) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          ensureUnk2700ICMKKOMLHIHIsMutable();
          unk2700ICMKKOMLHIH_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder addUnk2700ICMKKOMLHIH(
          int index, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder builderForValue) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          ensureUnk2700ICMKKOMLHIHIsMutable();
          unk2700ICMKKOMLHIH_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder addAllUnk2700ICMKKOMLHIH(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE> values) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          ensureUnk2700ICMKKOMLHIHIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700ICMKKOMLHIH_);
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder clearUnk2700ICMKKOMLHIH() {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          unk2700ICMKKOMLHIH_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public Builder removeUnk2700ICMKKOMLHIH(int index) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          ensureUnk2700ICMKKOMLHIHIsMutable();
          unk2700ICMKKOMLHIH_.remove(index);
          onChanged();
        } else {
          unk2700ICMKKOMLHIHBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder getUnk2700ICMKKOMLHIHBuilder(
          int index) {
        return getUnk2700ICMKKOMLHIHFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder getUnk2700ICMKKOMLHIHOrBuilder(
          int index) {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          return unk2700ICMKKOMLHIH_.get(index);  } else {
          return unk2700ICMKKOMLHIHBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder> 
           getUnk2700ICMKKOMLHIHOrBuilderList() {
        if (unk2700ICMKKOMLHIHBuilder_ != null) {
          return unk2700ICMKKOMLHIHBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700ICMKKOMLHIH_);
        }
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder addUnk2700ICMKKOMLHIHBuilder() {
        return getUnk2700ICMKKOMLHIHFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder addUnk2700ICMKKOMLHIHBuilder(
          int index) {
        return getUnk2700ICMKKOMLHIHFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_IGJLOMCPLLE Unk2700_ICMKKOMLHIH = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder> 
           getUnk2700ICMKKOMLHIHBuilderList() {
        return getUnk2700ICMKKOMLHIHFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder> 
          getUnk2700ICMKKOMLHIHFieldBuilder() {
        if (unk2700ICMKKOMLHIHBuilder_ == null) {
          unk2700ICMKKOMLHIHBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLE.Builder, emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.Unk2700_IGJLOMCPLLEOrBuilder>(
                  unk2700ICMKKOMLHIH_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700ICMKKOMLHIH_ = null;
        }
        return unk2700ICMKKOMLHIHBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_KLPINMKOEPE)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_KLPINMKOEPE)
    private static final emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE();
    }

    public static emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_KLPINMKOEPE>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_KLPINMKOEPE>() {
      @java.lang.Override
      public Unk2700_KLPINMKOEPE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_KLPINMKOEPE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_KLPINMKOEPE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_KLPINMKOEPE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700KLPINMKOEPE.Unk2700_KLPINMKOEPE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_KLPINMKOEPE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_KLPINMKOEPE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_KLPINMKOEPE.proto\032\031Unk2700_IGJ" +
      "LOMCPLLE.proto\"Y\n\023Unk2700_KLPINMKOEPE\022\017\n" +
      "\007room_id\030\017 \001(\r\0221\n\023Unk2700_ICMKKOMLHIH\030\004 " +
      "\003(\0132\024.Unk2700_IGJLOMCPLLEB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.getDescriptor(),
        });
    internal_static_Unk2700_KLPINMKOEPE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_KLPINMKOEPE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_KLPINMKOEPE_descriptor,
        new java.lang.String[] { "RoomId", "Unk2700ICMKKOMLHIH", });
    emu.grasscutter.net.proto.Unk2700IGJLOMCPLLE.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

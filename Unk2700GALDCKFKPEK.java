// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_GALDCKFKPEK.proto

package emu.grasscutter.net.proto;

public final class Unk2700GALDCKFKPEK {
  private Unk2700GALDCKFKPEK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_GALDCKFKPEKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_GALDCKFKPEK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO> 
        getUnk2700KLOAFPMHOKIList();
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO getUnk2700KLOAFPMHOKI(int index);
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    int getUnk2700KLOAFPMHOKICount();
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder> 
        getUnk2700KLOAFPMHOKIOrBuilderList();
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder getUnk2700KLOAFPMHOKIOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Unk2700_GALDCKFKPEK}
   */
  public static final class Unk2700_GALDCKFKPEK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_GALDCKFKPEK)
      Unk2700_GALDCKFKPEKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_GALDCKFKPEK.newBuilder() to construct.
    private Unk2700_GALDCKFKPEK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_GALDCKFKPEK() {
      unk2700KLOAFPMHOKI_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_GALDCKFKPEK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_GALDCKFKPEK(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700KLOAFPMHOKI_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700KLOAFPMHOKI_.add(
                  input.readMessage(emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.parser(), extensionRegistry));
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
          unk2700KLOAFPMHOKI_ = java.util.Collections.unmodifiableList(unk2700KLOAFPMHOKI_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.internal_static_Unk2700_GALDCKFKPEK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.internal_static_Unk2700_GALDCKFKPEK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK.class, emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK.Builder.class);
    }

    public static final int UNK2700_KLOAFPMHOKI_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO> unk2700KLOAFPMHOKI_;
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO> getUnk2700KLOAFPMHOKIList() {
      return unk2700KLOAFPMHOKI_;
    }
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder> 
        getUnk2700KLOAFPMHOKIOrBuilderList() {
      return unk2700KLOAFPMHOKI_;
    }
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    @java.lang.Override
    public int getUnk2700KLOAFPMHOKICount() {
      return unk2700KLOAFPMHOKI_.size();
    }
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO getUnk2700KLOAFPMHOKI(int index) {
      return unk2700KLOAFPMHOKI_.get(index);
    }
    /**
     * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder getUnk2700KLOAFPMHOKIOrBuilder(
        int index) {
      return unk2700KLOAFPMHOKI_.get(index);
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
      for (int i = 0; i < unk2700KLOAFPMHOKI_.size(); i++) {
        output.writeMessage(1, unk2700KLOAFPMHOKI_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700KLOAFPMHOKI_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, unk2700KLOAFPMHOKI_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK other = (emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK) obj;

      if (!getUnk2700KLOAFPMHOKIList()
          .equals(other.getUnk2700KLOAFPMHOKIList())) return false;
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
      if (getUnk2700KLOAFPMHOKICount() > 0) {
        hash = (37 * hash) + UNK2700_KLOAFPMHOKI_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700KLOAFPMHOKIList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK prototype) {
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
     * Protobuf type {@code Unk2700_GALDCKFKPEK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_GALDCKFKPEK)
        emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.internal_static_Unk2700_GALDCKFKPEK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.internal_static_Unk2700_GALDCKFKPEK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK.class, emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK.newBuilder()
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
          getUnk2700KLOAFPMHOKIFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          unk2700KLOAFPMHOKI_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700KLOAFPMHOKIBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.internal_static_Unk2700_GALDCKFKPEK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK build() {
        emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK buildPartial() {
        emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK result = new emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK(this);
        int from_bitField0_ = bitField0_;
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700KLOAFPMHOKI_ = java.util.Collections.unmodifiableList(unk2700KLOAFPMHOKI_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700KLOAFPMHOKI_ = unk2700KLOAFPMHOKI_;
        } else {
          result.unk2700KLOAFPMHOKI_ = unk2700KLOAFPMHOKIBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK other) {
        if (other == emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK.getDefaultInstance()) return this;
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          if (!other.unk2700KLOAFPMHOKI_.isEmpty()) {
            if (unk2700KLOAFPMHOKI_.isEmpty()) {
              unk2700KLOAFPMHOKI_ = other.unk2700KLOAFPMHOKI_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700KLOAFPMHOKIIsMutable();
              unk2700KLOAFPMHOKI_.addAll(other.unk2700KLOAFPMHOKI_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700KLOAFPMHOKI_.isEmpty()) {
            if (unk2700KLOAFPMHOKIBuilder_.isEmpty()) {
              unk2700KLOAFPMHOKIBuilder_.dispose();
              unk2700KLOAFPMHOKIBuilder_ = null;
              unk2700KLOAFPMHOKI_ = other.unk2700KLOAFPMHOKI_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700KLOAFPMHOKIBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700KLOAFPMHOKIFieldBuilder() : null;
            } else {
              unk2700KLOAFPMHOKIBuilder_.addAllMessages(other.unk2700KLOAFPMHOKI_);
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
        emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO> unk2700KLOAFPMHOKI_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700KLOAFPMHOKIIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700KLOAFPMHOKI_ = new java.util.ArrayList<emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO>(unk2700KLOAFPMHOKI_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder> unk2700KLOAFPMHOKIBuilder_;

      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO> getUnk2700KLOAFPMHOKIList() {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700KLOAFPMHOKI_);
        } else {
          return unk2700KLOAFPMHOKIBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public int getUnk2700KLOAFPMHOKICount() {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          return unk2700KLOAFPMHOKI_.size();
        } else {
          return unk2700KLOAFPMHOKIBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO getUnk2700KLOAFPMHOKI(int index) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          return unk2700KLOAFPMHOKI_.get(index);
        } else {
          return unk2700KLOAFPMHOKIBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder setUnk2700KLOAFPMHOKI(
          int index, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO value) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700KLOAFPMHOKIIsMutable();
          unk2700KLOAFPMHOKI_.set(index, value);
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder setUnk2700KLOAFPMHOKI(
          int index, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder builderForValue) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          ensureUnk2700KLOAFPMHOKIIsMutable();
          unk2700KLOAFPMHOKI_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder addUnk2700KLOAFPMHOKI(emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO value) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700KLOAFPMHOKIIsMutable();
          unk2700KLOAFPMHOKI_.add(value);
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder addUnk2700KLOAFPMHOKI(
          int index, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO value) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700KLOAFPMHOKIIsMutable();
          unk2700KLOAFPMHOKI_.add(index, value);
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder addUnk2700KLOAFPMHOKI(
          emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder builderForValue) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          ensureUnk2700KLOAFPMHOKIIsMutable();
          unk2700KLOAFPMHOKI_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder addUnk2700KLOAFPMHOKI(
          int index, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder builderForValue) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          ensureUnk2700KLOAFPMHOKIIsMutable();
          unk2700KLOAFPMHOKI_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder addAllUnk2700KLOAFPMHOKI(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO> values) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          ensureUnk2700KLOAFPMHOKIIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700KLOAFPMHOKI_);
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder clearUnk2700KLOAFPMHOKI() {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          unk2700KLOAFPMHOKI_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public Builder removeUnk2700KLOAFPMHOKI(int index) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          ensureUnk2700KLOAFPMHOKIIsMutable();
          unk2700KLOAFPMHOKI_.remove(index);
          onChanged();
        } else {
          unk2700KLOAFPMHOKIBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder getUnk2700KLOAFPMHOKIBuilder(
          int index) {
        return getUnk2700KLOAFPMHOKIFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder getUnk2700KLOAFPMHOKIOrBuilder(
          int index) {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          return unk2700KLOAFPMHOKI_.get(index);  } else {
          return unk2700KLOAFPMHOKIBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder> 
           getUnk2700KLOAFPMHOKIOrBuilderList() {
        if (unk2700KLOAFPMHOKIBuilder_ != null) {
          return unk2700KLOAFPMHOKIBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700KLOAFPMHOKI_);
        }
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder addUnk2700KLOAFPMHOKIBuilder() {
        return getUnk2700KLOAFPMHOKIFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder addUnk2700KLOAFPMHOKIBuilder(
          int index) {
        return getUnk2700KLOAFPMHOKIFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_MPELMDDJFHO Unk2700_KLOAFPMHOKI = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder> 
           getUnk2700KLOAFPMHOKIBuilderList() {
        return getUnk2700KLOAFPMHOKIFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder> 
          getUnk2700KLOAFPMHOKIFieldBuilder() {
        if (unk2700KLOAFPMHOKIBuilder_ == null) {
          unk2700KLOAFPMHOKIBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHO.Builder, emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.Unk2700_MPELMDDJFHOOrBuilder>(
                  unk2700KLOAFPMHOKI_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700KLOAFPMHOKI_ = null;
        }
        return unk2700KLOAFPMHOKIBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_GALDCKFKPEK)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_GALDCKFKPEK)
    private static final emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK();
    }

    public static emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_GALDCKFKPEK>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_GALDCKFKPEK>() {
      @java.lang.Override
      public Unk2700_GALDCKFKPEK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_GALDCKFKPEK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_GALDCKFKPEK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_GALDCKFKPEK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700GALDCKFKPEK.Unk2700_GALDCKFKPEK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_GALDCKFKPEK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_GALDCKFKPEK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_GALDCKFKPEK.proto\032\031Unk2700_MPE" +
      "LMDDJFHO.proto\"H\n\023Unk2700_GALDCKFKPEK\0221\n" +
      "\023Unk2700_KLOAFPMHOKI\030\001 \003(\0132\024.Unk2700_MPE" +
      "LMDDJFHOB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.getDescriptor(),
        });
    internal_static_Unk2700_GALDCKFKPEK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_GALDCKFKPEK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_GALDCKFKPEK_descriptor,
        new java.lang.String[] { "Unk2700KLOAFPMHOKI", });
    emu.grasscutter.net.proto.Unk2700MPELMDDJFHO.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

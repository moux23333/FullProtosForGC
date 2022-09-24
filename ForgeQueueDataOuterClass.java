// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForgeQueueData.proto

package emu.grasscutter.net.proto;

public final class ForgeQueueDataOuterClass {
  private ForgeQueueDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForgeQueueDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForgeQueueData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 finish_count = 13;</code>
     * @return The finishCount.
     */
    int getFinishCount();

    /**
     * <code>uint32 total_finish_timestamp = 14;</code>
     * @return The totalFinishTimestamp.
     */
    int getTotalFinishTimestamp();

    /**
     * <code>uint32 avatar_id = 7;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 queue_id = 1;</code>
     * @return The queueId.
     */
    int getQueueId();

    /**
     * <code>uint32 unfinish_count = 10;</code>
     * @return The unfinishCount.
     */
    int getUnfinishCount();

    /**
     * <code>uint32 next_finish_timestamp = 11;</code>
     * @return The nextFinishTimestamp.
     */
    int getNextFinishTimestamp();

    /**
     * <code>uint32 forge_id = 15;</code>
     * @return The forgeId.
     */
    int getForgeId();
  }
  /**
   * Protobuf type {@code ForgeQueueData}
   */
  public static final class ForgeQueueData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForgeQueueData)
      ForgeQueueDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForgeQueueData.newBuilder() to construct.
    private ForgeQueueData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForgeQueueData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForgeQueueData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ForgeQueueData(
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

              queueId_ = input.readUInt32();
              break;
            }
            case 56: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 80: {

              unfinishCount_ = input.readUInt32();
              break;
            }
            case 88: {

              nextFinishTimestamp_ = input.readUInt32();
              break;
            }
            case 104: {

              finishCount_ = input.readUInt32();
              break;
            }
            case 112: {

              totalFinishTimestamp_ = input.readUInt32();
              break;
            }
            case 120: {

              forgeId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.class, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder.class);
    }

    public static final int FINISH_COUNT_FIELD_NUMBER = 13;
    private int finishCount_;
    /**
     * <code>uint32 finish_count = 13;</code>
     * @return The finishCount.
     */
    @java.lang.Override
    public int getFinishCount() {
      return finishCount_;
    }

    public static final int TOTAL_FINISH_TIMESTAMP_FIELD_NUMBER = 14;
    private int totalFinishTimestamp_;
    /**
     * <code>uint32 total_finish_timestamp = 14;</code>
     * @return The totalFinishTimestamp.
     */
    @java.lang.Override
    public int getTotalFinishTimestamp() {
      return totalFinishTimestamp_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 7;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 7;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int QUEUE_ID_FIELD_NUMBER = 1;
    private int queueId_;
    /**
     * <code>uint32 queue_id = 1;</code>
     * @return The queueId.
     */
    @java.lang.Override
    public int getQueueId() {
      return queueId_;
    }

    public static final int UNFINISH_COUNT_FIELD_NUMBER = 10;
    private int unfinishCount_;
    /**
     * <code>uint32 unfinish_count = 10;</code>
     * @return The unfinishCount.
     */
    @java.lang.Override
    public int getUnfinishCount() {
      return unfinishCount_;
    }

    public static final int NEXT_FINISH_TIMESTAMP_FIELD_NUMBER = 11;
    private int nextFinishTimestamp_;
    /**
     * <code>uint32 next_finish_timestamp = 11;</code>
     * @return The nextFinishTimestamp.
     */
    @java.lang.Override
    public int getNextFinishTimestamp() {
      return nextFinishTimestamp_;
    }

    public static final int FORGE_ID_FIELD_NUMBER = 15;
    private int forgeId_;
    /**
     * <code>uint32 forge_id = 15;</code>
     * @return The forgeId.
     */
    @java.lang.Override
    public int getForgeId() {
      return forgeId_;
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
      if (queueId_ != 0) {
        output.writeUInt32(1, queueId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(7, avatarId_);
      }
      if (unfinishCount_ != 0) {
        output.writeUInt32(10, unfinishCount_);
      }
      if (nextFinishTimestamp_ != 0) {
        output.writeUInt32(11, nextFinishTimestamp_);
      }
      if (finishCount_ != 0) {
        output.writeUInt32(13, finishCount_);
      }
      if (totalFinishTimestamp_ != 0) {
        output.writeUInt32(14, totalFinishTimestamp_);
      }
      if (forgeId_ != 0) {
        output.writeUInt32(15, forgeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (queueId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, queueId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, avatarId_);
      }
      if (unfinishCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unfinishCount_);
      }
      if (nextFinishTimestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, nextFinishTimestamp_);
      }
      if (finishCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, finishCount_);
      }
      if (totalFinishTimestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, totalFinishTimestamp_);
      }
      if (forgeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, forgeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData other = (emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) obj;

      if (getFinishCount()
          != other.getFinishCount()) return false;
      if (getTotalFinishTimestamp()
          != other.getTotalFinishTimestamp()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getQueueId()
          != other.getQueueId()) return false;
      if (getUnfinishCount()
          != other.getUnfinishCount()) return false;
      if (getNextFinishTimestamp()
          != other.getNextFinishTimestamp()) return false;
      if (getForgeId()
          != other.getForgeId()) return false;
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
      hash = (37 * hash) + FINISH_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getFinishCount();
      hash = (37 * hash) + TOTAL_FINISH_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTotalFinishTimestamp();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + QUEUE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueueId();
      hash = (37 * hash) + UNFINISH_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getUnfinishCount();
      hash = (37 * hash) + NEXT_FINISH_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getNextFinishTimestamp();
      hash = (37 * hash) + FORGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getForgeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData prototype) {
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
     * Protobuf type {@code ForgeQueueData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForgeQueueData)
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.class, emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.newBuilder()
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
        finishCount_ = 0;

        totalFinishTimestamp_ = 0;

        avatarId_ = 0;

        queueId_ = 0;

        unfinishCount_ = 0;

        nextFinishTimestamp_ = 0;

        forgeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData build() {
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData buildPartial() {
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData result = new emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData(this);
        result.finishCount_ = finishCount_;
        result.totalFinishTimestamp_ = totalFinishTimestamp_;
        result.avatarId_ = avatarId_;
        result.queueId_ = queueId_;
        result.unfinishCount_ = unfinishCount_;
        result.nextFinishTimestamp_ = nextFinishTimestamp_;
        result.forgeId_ = forgeId_;
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
        if (other instanceof emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) {
          return mergeFrom((emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData other) {
        if (other == emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance()) return this;
        if (other.getFinishCount() != 0) {
          setFinishCount(other.getFinishCount());
        }
        if (other.getTotalFinishTimestamp() != 0) {
          setTotalFinishTimestamp(other.getTotalFinishTimestamp());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getQueueId() != 0) {
          setQueueId(other.getQueueId());
        }
        if (other.getUnfinishCount() != 0) {
          setUnfinishCount(other.getUnfinishCount());
        }
        if (other.getNextFinishTimestamp() != 0) {
          setNextFinishTimestamp(other.getNextFinishTimestamp());
        }
        if (other.getForgeId() != 0) {
          setForgeId(other.getForgeId());
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
        emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int finishCount_ ;
      /**
       * <code>uint32 finish_count = 13;</code>
       * @return The finishCount.
       */
      @java.lang.Override
      public int getFinishCount() {
        return finishCount_;
      }
      /**
       * <code>uint32 finish_count = 13;</code>
       * @param value The finishCount to set.
       * @return This builder for chaining.
       */
      public Builder setFinishCount(int value) {
        
        finishCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_count = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishCount() {
        
        finishCount_ = 0;
        onChanged();
        return this;
      }

      private int totalFinishTimestamp_ ;
      /**
       * <code>uint32 total_finish_timestamp = 14;</code>
       * @return The totalFinishTimestamp.
       */
      @java.lang.Override
      public int getTotalFinishTimestamp() {
        return totalFinishTimestamp_;
      }
      /**
       * <code>uint32 total_finish_timestamp = 14;</code>
       * @param value The totalFinishTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTotalFinishTimestamp(int value) {
        
        totalFinishTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_finish_timestamp = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalFinishTimestamp() {
        
        totalFinishTimestamp_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int queueId_ ;
      /**
       * <code>uint32 queue_id = 1;</code>
       * @return The queueId.
       */
      @java.lang.Override
      public int getQueueId() {
        return queueId_;
      }
      /**
       * <code>uint32 queue_id = 1;</code>
       * @param value The queueId to set.
       * @return This builder for chaining.
       */
      public Builder setQueueId(int value) {
        
        queueId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 queue_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueueId() {
        
        queueId_ = 0;
        onChanged();
        return this;
      }

      private int unfinishCount_ ;
      /**
       * <code>uint32 unfinish_count = 10;</code>
       * @return The unfinishCount.
       */
      @java.lang.Override
      public int getUnfinishCount() {
        return unfinishCount_;
      }
      /**
       * <code>uint32 unfinish_count = 10;</code>
       * @param value The unfinishCount to set.
       * @return This builder for chaining.
       */
      public Builder setUnfinishCount(int value) {
        
        unfinishCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 unfinish_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnfinishCount() {
        
        unfinishCount_ = 0;
        onChanged();
        return this;
      }

      private int nextFinishTimestamp_ ;
      /**
       * <code>uint32 next_finish_timestamp = 11;</code>
       * @return The nextFinishTimestamp.
       */
      @java.lang.Override
      public int getNextFinishTimestamp() {
        return nextFinishTimestamp_;
      }
      /**
       * <code>uint32 next_finish_timestamp = 11;</code>
       * @param value The nextFinishTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setNextFinishTimestamp(int value) {
        
        nextFinishTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 next_finish_timestamp = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextFinishTimestamp() {
        
        nextFinishTimestamp_ = 0;
        onChanged();
        return this;
      }

      private int forgeId_ ;
      /**
       * <code>uint32 forge_id = 15;</code>
       * @return The forgeId.
       */
      @java.lang.Override
      public int getForgeId() {
        return forgeId_;
      }
      /**
       * <code>uint32 forge_id = 15;</code>
       * @param value The forgeId to set.
       * @return This builder for chaining.
       */
      public Builder setForgeId(int value) {
        
        forgeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 forge_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearForgeId() {
        
        forgeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ForgeQueueData)
    }

    // @@protoc_insertion_point(class_scope:ForgeQueueData)
    private static final emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData();
    }

    public static emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForgeQueueData>
        PARSER = new com.google.protobuf.AbstractParser<ForgeQueueData>() {
      @java.lang.Override
      public ForgeQueueData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ForgeQueueData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ForgeQueueData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForgeQueueData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ForgeQueueDataOuterClass.ForgeQueueData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForgeQueueData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForgeQueueData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ForgeQueueData.proto\"\264\001\n\016ForgeQueueDat" +
      "a\022\024\n\014finish_count\030\r \001(\r\022\036\n\026total_finish_" +
      "timestamp\030\016 \001(\r\022\021\n\tavatar_id\030\007 \001(\r\022\020\n\010qu" +
      "eue_id\030\001 \001(\r\022\026\n\016unfinish_count\030\n \001(\r\022\035\n\025" +
      "next_finish_timestamp\030\013 \001(\r\022\020\n\010forge_id\030" +
      "\017 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ForgeQueueData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForgeQueueData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForgeQueueData_descriptor,
        new java.lang.String[] { "FinishCount", "TotalFinishTimestamp", "AvatarId", "QueueId", "UnfinishCount", "NextFinishTimestamp", "ForgeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

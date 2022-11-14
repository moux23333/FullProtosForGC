// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeDungeonInfo.proto

package emu.grasscutter.net.proto;

public final class SummerTimeDungeonInfoOuterClass {
  private SummerTimeDungeonInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeDungeonInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeDungeonInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 taken_chest_count = 15;</code>
     * @return The takenChestCount.
     */
    int getTakenChestCount();

    /**
     * <code>uint32 total_chest_count = 12;</code>
     * @return The totalChestCount.
     */
    int getTotalChestCount();

    /**
     * <code>uint32 taken_shell_count = 14;</code>
     * @return The takenShellCount.
     */
    int getTakenShellCount();

    /**
     * <code>uint32 dungeon_id = 4;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 total_shell_count = 13;</code>
     * @return The totalShellCount.
     */
    int getTotalShellCount();
  }
  /**
   * Protobuf type {@code SummerTimeDungeonInfo}
   */
  public static final class SummerTimeDungeonInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeDungeonInfo)
      SummerTimeDungeonInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeDungeonInfo.newBuilder() to construct.
    private SummerTimeDungeonInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeDungeonInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeDungeonInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SummerTimeDungeonInfo(
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
            case 32: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 96: {

              totalChestCount_ = input.readUInt32();
              break;
            }
            case 104: {

              totalShellCount_ = input.readUInt32();
              break;
            }
            case 112: {

              takenShellCount_ = input.readUInt32();
              break;
            }
            case 120: {

              takenChestCount_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.class, emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.Builder.class);
    }

    public static final int TAKEN_CHEST_COUNT_FIELD_NUMBER = 15;
    private int takenChestCount_;
    /**
     * <code>uint32 taken_chest_count = 15;</code>
     * @return The takenChestCount.
     */
    @java.lang.Override
    public int getTakenChestCount() {
      return takenChestCount_;
    }

    public static final int TOTAL_CHEST_COUNT_FIELD_NUMBER = 12;
    private int totalChestCount_;
    /**
     * <code>uint32 total_chest_count = 12;</code>
     * @return The totalChestCount.
     */
    @java.lang.Override
    public int getTotalChestCount() {
      return totalChestCount_;
    }

    public static final int TAKEN_SHELL_COUNT_FIELD_NUMBER = 14;
    private int takenShellCount_;
    /**
     * <code>uint32 taken_shell_count = 14;</code>
     * @return The takenShellCount.
     */
    @java.lang.Override
    public int getTakenShellCount() {
      return takenShellCount_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 4;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 4;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int TOTAL_SHELL_COUNT_FIELD_NUMBER = 13;
    private int totalShellCount_;
    /**
     * <code>uint32 total_shell_count = 13;</code>
     * @return The totalShellCount.
     */
    @java.lang.Override
    public int getTotalShellCount() {
      return totalShellCount_;
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
      if (dungeonId_ != 0) {
        output.writeUInt32(4, dungeonId_);
      }
      if (totalChestCount_ != 0) {
        output.writeUInt32(12, totalChestCount_);
      }
      if (totalShellCount_ != 0) {
        output.writeUInt32(13, totalShellCount_);
      }
      if (takenShellCount_ != 0) {
        output.writeUInt32(14, takenShellCount_);
      }
      if (takenChestCount_ != 0) {
        output.writeUInt32(15, takenChestCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, dungeonId_);
      }
      if (totalChestCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, totalChestCount_);
      }
      if (totalShellCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, totalShellCount_);
      }
      if (takenShellCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, takenShellCount_);
      }
      if (takenChestCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, takenChestCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo other = (emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo) obj;

      if (getTakenChestCount()
          != other.getTakenChestCount()) return false;
      if (getTotalChestCount()
          != other.getTotalChestCount()) return false;
      if (getTakenShellCount()
          != other.getTakenShellCount()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getTotalShellCount()
          != other.getTotalShellCount()) return false;
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
      hash = (37 * hash) + TAKEN_CHEST_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTakenChestCount();
      hash = (37 * hash) + TOTAL_CHEST_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTotalChestCount();
      hash = (37 * hash) + TAKEN_SHELL_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTakenShellCount();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + TOTAL_SHELL_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTotalShellCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo prototype) {
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
     * Protobuf type {@code SummerTimeDungeonInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeDungeonInfo)
        emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.class, emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.newBuilder()
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
        takenChestCount_ = 0;

        totalChestCount_ = 0;

        takenShellCount_ = 0;

        dungeonId_ = 0;

        totalShellCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.internal_static_SummerTimeDungeonInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo build() {
        emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo buildPartial() {
        emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo result = new emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo(this);
        result.takenChestCount_ = takenChestCount_;
        result.totalChestCount_ = totalChestCount_;
        result.takenShellCount_ = takenShellCount_;
        result.dungeonId_ = dungeonId_;
        result.totalShellCount_ = totalShellCount_;
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
        if (other instanceof emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo other) {
        if (other == emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo.getDefaultInstance()) return this;
        if (other.getTakenChestCount() != 0) {
          setTakenChestCount(other.getTakenChestCount());
        }
        if (other.getTotalChestCount() != 0) {
          setTotalChestCount(other.getTotalChestCount());
        }
        if (other.getTakenShellCount() != 0) {
          setTakenShellCount(other.getTakenShellCount());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getTotalShellCount() != 0) {
          setTotalShellCount(other.getTotalShellCount());
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
        emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int takenChestCount_ ;
      /**
       * <code>uint32 taken_chest_count = 15;</code>
       * @return The takenChestCount.
       */
      @java.lang.Override
      public int getTakenChestCount() {
        return takenChestCount_;
      }
      /**
       * <code>uint32 taken_chest_count = 15;</code>
       * @param value The takenChestCount to set.
       * @return This builder for chaining.
       */
      public Builder setTakenChestCount(int value) {
        
        takenChestCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 taken_chest_count = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTakenChestCount() {
        
        takenChestCount_ = 0;
        onChanged();
        return this;
      }

      private int totalChestCount_ ;
      /**
       * <code>uint32 total_chest_count = 12;</code>
       * @return The totalChestCount.
       */
      @java.lang.Override
      public int getTotalChestCount() {
        return totalChestCount_;
      }
      /**
       * <code>uint32 total_chest_count = 12;</code>
       * @param value The totalChestCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalChestCount(int value) {
        
        totalChestCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_chest_count = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalChestCount() {
        
        totalChestCount_ = 0;
        onChanged();
        return this;
      }

      private int takenShellCount_ ;
      /**
       * <code>uint32 taken_shell_count = 14;</code>
       * @return The takenShellCount.
       */
      @java.lang.Override
      public int getTakenShellCount() {
        return takenShellCount_;
      }
      /**
       * <code>uint32 taken_shell_count = 14;</code>
       * @param value The takenShellCount to set.
       * @return This builder for chaining.
       */
      public Builder setTakenShellCount(int value) {
        
        takenShellCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 taken_shell_count = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTakenShellCount() {
        
        takenShellCount_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int totalShellCount_ ;
      /**
       * <code>uint32 total_shell_count = 13;</code>
       * @return The totalShellCount.
       */
      @java.lang.Override
      public int getTotalShellCount() {
        return totalShellCount_;
      }
      /**
       * <code>uint32 total_shell_count = 13;</code>
       * @param value The totalShellCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalShellCount(int value) {
        
        totalShellCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_shell_count = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalShellCount() {
        
        totalShellCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeDungeonInfo)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeDungeonInfo)
    private static final emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo();
    }

    public static emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeDungeonInfo>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeDungeonInfo>() {
      @java.lang.Override
      public SummerTimeDungeonInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SummerTimeDungeonInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SummerTimeDungeonInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeDungeonInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SummerTimeDungeonInfoOuterClass.SummerTimeDungeonInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeDungeonInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeDungeonInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SummerTimeDungeonInfo.proto\"\227\001\n\025Summer" +
      "TimeDungeonInfo\022\031\n\021taken_chest_count\030\017 \001" +
      "(\r\022\031\n\021total_chest_count\030\014 \001(\r\022\031\n\021taken_s" +
      "hell_count\030\016 \001(\r\022\022\n\ndungeon_id\030\004 \001(\r\022\031\n\021" +
      "total_shell_count\030\r \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeDungeonInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeDungeonInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeDungeonInfo_descriptor,
        new java.lang.String[] { "TakenChestCount", "TotalChestCount", "TakenShellCount", "DungeonId", "TotalShellCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
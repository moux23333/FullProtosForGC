// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGLevelType.proto

package emu.grasscutter.net.proto;

public final class GCGLevelTypeOuterClass {
  private GCGLevelTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GCGLevelType}
   */
  public enum GCGLevelType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_LEVEL_TYPE_NONE = 0;</code>
     */
    GCG_LEVEL_TYPE_NONE(0),
    /**
     * <code>GCG_LEVEL_TYPE_CONST = 1;</code>
     */
    GCG_LEVEL_TYPE_CONST(1),
    /**
     * <code>GCG_LEVEL_TYPE_WEEK = 2;</code>
     */
    GCG_LEVEL_TYPE_WEEK(2),
    /**
     * <code>GCG_LEVEL_TYPE_WORLD = 3;</code>
     */
    GCG_LEVEL_TYPE_WORLD(3),
    /**
     * <code>GCG_LEVEL_TYPE_BOSS = 4;</code>
     */
    GCG_LEVEL_TYPE_BOSS(4),
    /**
     * <code>GCG_LEVEL_TYPE_CHARACTER = 5;</code>
     */
    GCG_LEVEL_TYPE_CHARACTER(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_LEVEL_TYPE_NONE = 0;</code>
     */
    public static final int GCG_LEVEL_TYPE_NONE_VALUE = 0;
    /**
     * <code>GCG_LEVEL_TYPE_CONST = 1;</code>
     */
    public static final int GCG_LEVEL_TYPE_CONST_VALUE = 1;
    /**
     * <code>GCG_LEVEL_TYPE_WEEK = 2;</code>
     */
    public static final int GCG_LEVEL_TYPE_WEEK_VALUE = 2;
    /**
     * <code>GCG_LEVEL_TYPE_WORLD = 3;</code>
     */
    public static final int GCG_LEVEL_TYPE_WORLD_VALUE = 3;
    /**
     * <code>GCG_LEVEL_TYPE_BOSS = 4;</code>
     */
    public static final int GCG_LEVEL_TYPE_BOSS_VALUE = 4;
    /**
     * <code>GCG_LEVEL_TYPE_CHARACTER = 5;</code>
     */
    public static final int GCG_LEVEL_TYPE_CHARACTER_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GCGLevelType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGLevelType forNumber(int value) {
      switch (value) {
        case 0: return GCG_LEVEL_TYPE_NONE;
        case 1: return GCG_LEVEL_TYPE_CONST;
        case 2: return GCG_LEVEL_TYPE_WEEK;
        case 3: return GCG_LEVEL_TYPE_WORLD;
        case 4: return GCG_LEVEL_TYPE_BOSS;
        case 5: return GCG_LEVEL_TYPE_CHARACTER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGLevelType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGLevelType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGLevelType>() {
            public GCGLevelType findValueByNumber(int number) {
              return GCGLevelType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGLevelTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGLevelType[] VALUES = values();

    public static GCGLevelType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GCGLevelType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGLevelType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022GCGLevelType.proto*\253\001\n\014GCGLevelType\022\027\n" +
      "\023GCG_LEVEL_TYPE_NONE\020\000\022\030\n\024GCG_LEVEL_TYPE" +
      "_CONST\020\001\022\027\n\023GCG_LEVEL_TYPE_WEEK\020\002\022\030\n\024GCG" +
      "_LEVEL_TYPE_WORLD\020\003\022\027\n\023GCG_LEVEL_TYPE_BO" +
      "SS\020\004\022\034\n\030GCG_LEVEL_TYPE_CHARACTER\020\005B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

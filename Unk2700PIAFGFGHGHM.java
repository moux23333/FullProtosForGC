// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_PIAFGFGHGHM.proto

package emu.grasscutter.net.proto;

public final class Unk2700PIAFGFGHGHM {
  private Unk2700PIAFGFGHGHM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Unk2700_PIAFGFGHGHM}
   */
  public enum Unk2700_PIAFGFGHGHM
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unk2700_PIAFGFGHGHM_Unk2700_LKEBMNKGKCP = 0;</code>
     */
    Unk2700_PIAFGFGHGHM_Unk2700_LKEBMNKGKCP(0),
    /**
     * <code>Unk2700_PIAFGFGHGHM_Unk2700_PJHOMLBMENK = 1;</code>
     */
    Unk2700_PIAFGFGHGHM_Unk2700_PJHOMLBMENK(1),
    /**
     * <code>Unk2700_PIAFGFGHGHM_Unk2700_MPGMPAOGMCB = 2;</code>
     */
    Unk2700_PIAFGFGHGHM_Unk2700_MPGMPAOGMCB(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unk2700_PIAFGFGHGHM_Unk2700_LKEBMNKGKCP = 0;</code>
     */
    public static final int Unk2700_PIAFGFGHGHM_Unk2700_LKEBMNKGKCP_VALUE = 0;
    /**
     * <code>Unk2700_PIAFGFGHGHM_Unk2700_PJHOMLBMENK = 1;</code>
     */
    public static final int Unk2700_PIAFGFGHGHM_Unk2700_PJHOMLBMENK_VALUE = 1;
    /**
     * <code>Unk2700_PIAFGFGHGHM_Unk2700_MPGMPAOGMCB = 2;</code>
     */
    public static final int Unk2700_PIAFGFGHGHM_Unk2700_MPGMPAOGMCB_VALUE = 2;


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
    public static Unk2700_PIAFGFGHGHM valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Unk2700_PIAFGFGHGHM forNumber(int value) {
      switch (value) {
        case 0: return Unk2700_PIAFGFGHGHM_Unk2700_LKEBMNKGKCP;
        case 1: return Unk2700_PIAFGFGHGHM_Unk2700_PJHOMLBMENK;
        case 2: return Unk2700_PIAFGFGHGHM_Unk2700_MPGMPAOGMCB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unk2700_PIAFGFGHGHM>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unk2700_PIAFGFGHGHM> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unk2700_PIAFGFGHGHM>() {
            public Unk2700_PIAFGFGHGHM findValueByNumber(int number) {
              return Unk2700_PIAFGFGHGHM.forNumber(number);
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
      return emu.grasscutter.net.proto.Unk2700PIAFGFGHGHM.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unk2700_PIAFGFGHGHM[] VALUES = values();

    public static Unk2700_PIAFGFGHGHM valueOf(
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

    private Unk2700_PIAFGFGHGHM(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Unk2700_PIAFGFGHGHM)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_PIAFGFGHGHM.proto*\234\001\n\023Unk2700_" +
      "PIAFGFGHGHM\022+\n\'Unk2700_PIAFGFGHGHM_Unk27" +
      "00_LKEBMNKGKCP\020\000\022+\n\'Unk2700_PIAFGFGHGHM_" +
      "Unk2700_PJHOMLBMENK\020\001\022+\n\'Unk2700_PIAFGFG" +
      "HGHM_Unk2700_MPGMPAOGMCB\020\002B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
package p256j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.g3 */
/* loaded from: classes3.dex */
public final class EnumC5202g3 {
    public static final EnumC5202g3 DOUBLE_VALUE;
    public static final EnumC5202g3 INT_VALUE;
    public static final EnumC5202g3 LONG_VALUE;
    public static final EnumC5202g3 REFERENCE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC5202g3[] f18603a;

    public static EnumC5202g3 valueOf(String str) {
        return (EnumC5202g3) Enum.valueOf(EnumC5202g3.class, str);
    }

    public static EnumC5202g3[] values() {
        return (EnumC5202g3[]) f18603a.clone();
    }

    static {
        EnumC5202g3 enumC5202g3 = new EnumC5202g3("REFERENCE", 0);
        REFERENCE = enumC5202g3;
        EnumC5202g3 enumC5202g32 = new EnumC5202g3("INT_VALUE", 1);
        INT_VALUE = enumC5202g32;
        EnumC5202g3 enumC5202g33 = new EnumC5202g3("LONG_VALUE", 2);
        LONG_VALUE = enumC5202g33;
        EnumC5202g3 enumC5202g34 = new EnumC5202g3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC5202g34;
        f18603a = new EnumC5202g3[]{enumC5202g3, enumC5202g32, enumC5202g33, enumC5202g34};
    }
}

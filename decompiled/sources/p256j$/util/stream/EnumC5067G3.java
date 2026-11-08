package p256j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.G3 */
/* loaded from: classes3.dex */
final class EnumC5067G3 {
    public static final EnumC5067G3 MAYBE_MORE;
    public static final EnumC5067G3 NO_MORE;
    public static final EnumC5067G3 UNLIMITED;

    /* renamed from: a */
    private static final /* synthetic */ EnumC5067G3[] f18383a;

    static {
        EnumC5067G3 enumC5067G3 = new EnumC5067G3("NO_MORE", 0);
        NO_MORE = enumC5067G3;
        EnumC5067G3 enumC5067G32 = new EnumC5067G3("MAYBE_MORE", 1);
        MAYBE_MORE = enumC5067G32;
        EnumC5067G3 enumC5067G33 = new EnumC5067G3("UNLIMITED", 2);
        UNLIMITED = enumC5067G33;
        f18383a = new EnumC5067G3[]{enumC5067G3, enumC5067G32, enumC5067G33};
    }

    public static EnumC5067G3 valueOf(String str) {
        return (EnumC5067G3) Enum.valueOf(EnumC5067G3.class, str);
    }

    public static EnumC5067G3[] values() {
        return (EnumC5067G3[]) f18383a.clone();
    }
}

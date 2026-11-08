package p256j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.e3 */
/* loaded from: classes3.dex */
final class EnumC5190e3 {

    /* renamed from: OP */
    public static final EnumC5190e3 f18570OP;
    public static final EnumC5190e3 SPLITERATOR;
    public static final EnumC5190e3 STREAM;
    public static final EnumC5190e3 TERMINAL_OP;
    public static final EnumC5190e3 UPSTREAM_TERMINAL_OP;

    /* renamed from: a */
    private static final /* synthetic */ EnumC5190e3[] f18571a;

    public static EnumC5190e3 valueOf(String str) {
        return (EnumC5190e3) Enum.valueOf(EnumC5190e3.class, str);
    }

    public static EnumC5190e3[] values() {
        return (EnumC5190e3[]) f18571a.clone();
    }

    static {
        EnumC5190e3 enumC5190e3 = new EnumC5190e3("SPLITERATOR", 0);
        SPLITERATOR = enumC5190e3;
        EnumC5190e3 enumC5190e32 = new EnumC5190e3("STREAM", 1);
        STREAM = enumC5190e32;
        EnumC5190e3 enumC5190e33 = new EnumC5190e3("OP", 2);
        f18570OP = enumC5190e33;
        EnumC5190e3 enumC5190e34 = new EnumC5190e3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC5190e34;
        EnumC5190e3 enumC5190e35 = new EnumC5190e3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC5190e35;
        f18571a = new EnumC5190e3[]{enumC5190e3, enumC5190e32, enumC5190e33, enumC5190e34, enumC5190e35};
    }
}

package p256j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.k */
/* loaded from: classes3.dex */
final class EnumC4874k implements InterfaceC4869f {
    public static final EnumC4874k INSENSITIVE;
    public static final EnumC4874k LENIENT;
    public static final EnumC4874k SENSITIVE;
    public static final EnumC4874k STRICT;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4874k[] f17994a;

    @Override // p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public final boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        return true;
    }

    public static EnumC4874k valueOf(String str) {
        return (EnumC4874k) Enum.valueOf(EnumC4874k.class, str);
    }

    public static EnumC4874k[] values() {
        return (EnumC4874k[]) f17994a.clone();
    }

    static {
        EnumC4874k enumC4874k = new EnumC4874k("SENSITIVE", 0);
        SENSITIVE = enumC4874k;
        EnumC4874k enumC4874k2 = new EnumC4874k("INSENSITIVE", 1);
        INSENSITIVE = enumC4874k2;
        EnumC4874k enumC4874k3 = new EnumC4874k("STRICT", 2);
        STRICT = enumC4874k3;
        EnumC4874k enumC4874k4 = new EnumC4874k("LENIENT", 3);
        LENIENT = enumC4874k4;
        f17994a = new EnumC4874k[]{enumC4874k, enumC4874k2, enumC4874k3, enumC4874k4};
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}

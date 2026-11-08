package p256j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.u */
/* loaded from: classes3.dex */
public final class EnumC4884u {
    public static final EnumC4884u ALWAYS;
    public static final EnumC4884u EXCEEDS_PAD;
    public static final EnumC4884u NEVER;
    public static final EnumC4884u NORMAL;
    public static final EnumC4884u NOT_NEGATIVE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4884u[] f18017a;

    public static EnumC4884u valueOf(String str) {
        return (EnumC4884u) Enum.valueOf(EnumC4884u.class, str);
    }

    public static EnumC4884u[] values() {
        return (EnumC4884u[]) f18017a.clone();
    }

    static {
        EnumC4884u enumC4884u = new EnumC4884u("NORMAL", 0);
        NORMAL = enumC4884u;
        EnumC4884u enumC4884u2 = new EnumC4884u("ALWAYS", 1);
        ALWAYS = enumC4884u2;
        EnumC4884u enumC4884u3 = new EnumC4884u("NEVER", 2);
        NEVER = enumC4884u3;
        EnumC4884u enumC4884u4 = new EnumC4884u("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enumC4884u4;
        EnumC4884u enumC4884u5 = new EnumC4884u("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enumC4884u5;
        f18017a = new EnumC4884u[]{enumC4884u, enumC4884u2, enumC4884u3, enumC4884u4, enumC4884u5};
    }
}

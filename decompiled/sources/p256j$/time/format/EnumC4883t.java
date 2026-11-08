package p256j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.t */
/* loaded from: classes3.dex */
public final class EnumC4883t {
    public static final EnumC4883t LENIENT;
    public static final EnumC4883t SMART;
    public static final EnumC4883t STRICT;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4883t[] f18016a;

    public static EnumC4883t valueOf(String str) {
        return (EnumC4883t) Enum.valueOf(EnumC4883t.class, str);
    }

    public static EnumC4883t[] values() {
        return (EnumC4883t[]) f18016a.clone();
    }

    static {
        EnumC4883t enumC4883t = new EnumC4883t("STRICT", 0);
        STRICT = enumC4883t;
        EnumC4883t enumC4883t2 = new EnumC4883t("SMART", 1);
        SMART = enumC4883t2;
        EnumC4883t enumC4883t3 = new EnumC4883t("LENIENT", 2);
        LENIENT = enumC4883t3;
        f18016a = new EnumC4883t[]{enumC4883t, enumC4883t2, enumC4883t3};
    }
}

package p256j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.v */
/* loaded from: classes3.dex */
public final class EnumC4885v {
    public static final EnumC4885v FULL;
    public static final EnumC4885v FULL_STANDALONE;
    public static final EnumC4885v NARROW;
    public static final EnumC4885v NARROW_STANDALONE;
    public static final EnumC4885v SHORT;
    public static final EnumC4885v SHORT_STANDALONE;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4885v[] f18018a;

    public static EnumC4885v valueOf(String str) {
        return (EnumC4885v) Enum.valueOf(EnumC4885v.class, str);
    }

    public static EnumC4885v[] values() {
        return (EnumC4885v[]) f18018a.clone();
    }

    static {
        EnumC4885v enumC4885v = new EnumC4885v("FULL", 0);
        FULL = enumC4885v;
        EnumC4885v enumC4885v2 = new EnumC4885v("FULL_STANDALONE", 1);
        FULL_STANDALONE = enumC4885v2;
        EnumC4885v enumC4885v3 = new EnumC4885v("SHORT", 2);
        SHORT = enumC4885v3;
        EnumC4885v enumC4885v4 = new EnumC4885v("SHORT_STANDALONE", 3);
        SHORT_STANDALONE = enumC4885v4;
        EnumC4885v enumC4885v5 = new EnumC4885v("NARROW", 4);
        NARROW = enumC4885v5;
        EnumC4885v enumC4885v6 = new EnumC4885v("NARROW_STANDALONE", 5);
        NARROW_STANDALONE = enumC4885v6;
        f18018a = new EnumC4885v[]{enumC4885v, enumC4885v2, enumC4885v3, enumC4885v4, enumC4885v5, enumC4885v6};
    }
}

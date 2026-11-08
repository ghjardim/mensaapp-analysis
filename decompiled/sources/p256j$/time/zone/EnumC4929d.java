package p256j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.zone.d */
/* loaded from: classes3.dex */
public final class EnumC4929d {
    public static final EnumC4929d STANDARD;
    public static final EnumC4929d UTC;
    public static final EnumC4929d WALL;

    /* renamed from: a */
    private static final /* synthetic */ EnumC4929d[] f18108a;

    public static EnumC4929d valueOf(String str) {
        return (EnumC4929d) Enum.valueOf(EnumC4929d.class, str);
    }

    public static EnumC4929d[] values() {
        return (EnumC4929d[]) f18108a.clone();
    }

    static {
        EnumC4929d enumC4929d = new EnumC4929d("UTC", 0);
        UTC = enumC4929d;
        EnumC4929d enumC4929d2 = new EnumC4929d("WALL", 1);
        WALL = enumC4929d2;
        EnumC4929d enumC4929d3 = new EnumC4929d("STANDARD", 2);
        STANDARD = enumC4929d3;
        f18108a = new EnumC4929d[]{enumC4929d, enumC4929d2, enumC4929d3};
    }
}

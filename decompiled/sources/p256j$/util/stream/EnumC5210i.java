package p256j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.i */
/* loaded from: classes3.dex */
public final class EnumC5210i {
    public static final EnumC5210i CONCURRENT;
    public static final EnumC5210i IDENTITY_FINISH;
    public static final EnumC5210i UNORDERED;

    /* renamed from: a */
    private static final /* synthetic */ EnumC5210i[] f18624a;

    public static EnumC5210i valueOf(String str) {
        return (EnumC5210i) Enum.valueOf(EnumC5210i.class, str);
    }

    public static EnumC5210i[] values() {
        return (EnumC5210i[]) f18624a.clone();
    }

    static {
        EnumC5210i enumC5210i = new EnumC5210i("CONCURRENT", 0);
        CONCURRENT = enumC5210i;
        EnumC5210i enumC5210i2 = new EnumC5210i("UNORDERED", 1);
        UNORDERED = enumC5210i2;
        EnumC5210i enumC5210i3 = new EnumC5210i("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC5210i3;
        f18624a = new EnumC5210i[]{enumC5210i, enumC5210i2, enumC5210i3};
    }
}

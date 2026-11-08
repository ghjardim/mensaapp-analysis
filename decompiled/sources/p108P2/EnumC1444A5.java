package p108P2;

/* renamed from: P2.A5 */
/* loaded from: classes.dex */
public enum EnumC1444A5 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* renamed from: a */
    public final int f4510a;

    EnumC1444A5(int i7) {
        this.f4510a = i7;
    }

    /* renamed from: b */
    public static EnumC1444A5 m5576b(int i7) {
        for (EnumC1444A5 enumC1444A5 : values()) {
            if (enumC1444A5.f4510a == i7) {
                return enumC1444A5;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f4510a;
    }
}

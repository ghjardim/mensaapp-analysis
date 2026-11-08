package p256j$.time.chrono;

import p256j$.time.temporal.EnumC4900a;

/* renamed from: j$.time.chrono.H */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC4830H {

    /* renamed from: a */
    static final /* synthetic */ int[] f17912a;

    static {
        int[] iArr = new int[EnumC4900a.values().length];
        f17912a = iArr;
        try {
            iArr[EnumC4900a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17912a[EnumC4900a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17912a[EnumC4900a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

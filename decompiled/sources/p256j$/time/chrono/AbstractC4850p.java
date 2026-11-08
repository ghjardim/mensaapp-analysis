package p256j$.time.chrono;

import p256j$.time.temporal.EnumC4900a;

/* renamed from: j$.time.chrono.p */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC4850p {

    /* renamed from: a */
    static final /* synthetic */ int[] f17935a;

    static {
        int[] iArr = new int[EnumC4900a.values().length];
        f17935a = iArr;
        try {
            iArr[EnumC4900a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17935a[EnumC4900a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17935a[EnumC4900a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17935a[EnumC4900a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17935a[EnumC4900a.YEAR_OF_ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17935a[EnumC4900a.ERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

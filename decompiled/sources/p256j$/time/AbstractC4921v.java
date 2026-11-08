package p256j$.time;

import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;

/* renamed from: j$.time.v */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC4921v {

    /* renamed from: a */
    static final /* synthetic */ int[] f18089a;

    /* renamed from: b */
    static final /* synthetic */ int[] f18090b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f18090b = iArr;
        try {
            iArr[ChronoUnit.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18090b[ChronoUnit.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18090b[ChronoUnit.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18090b[ChronoUnit.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18090b[ChronoUnit.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[EnumC4900a.values().length];
        f18089a = iArr2;
        try {
            iArr2[EnumC4900a.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18089a[EnumC4900a.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f18089a[EnumC4900a.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

package p256j$.time;

import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;

/* renamed from: j$.time.x */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC4923x {

    /* renamed from: a */
    static final /* synthetic */ int[] f18093a;

    /* renamed from: b */
    static final /* synthetic */ int[] f18094b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f18094b = iArr;
        try {
            iArr[ChronoUnit.MONTHS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18094b[ChronoUnit.YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18094b[ChronoUnit.DECADES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18094b[ChronoUnit.CENTURIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18094b[ChronoUnit.MILLENNIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18094b[ChronoUnit.ERAS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[EnumC4900a.values().length];
        f18093a = iArr2;
        try {
            iArr2[EnumC4900a.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f18093a[EnumC4900a.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f18093a[EnumC4900a.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f18093a[EnumC4900a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f18093a[EnumC4900a.ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}

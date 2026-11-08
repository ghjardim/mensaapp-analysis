package p256j$.time;

import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;

/* renamed from: j$.time.k */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC4890k {

    /* renamed from: a */
    static final /* synthetic */ int[] f18029a;

    /* renamed from: b */
    static final /* synthetic */ int[] f18030b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f18030b = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18030b[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18030b[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18030b[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18030b[ChronoUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18030b[ChronoUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18030b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[EnumC4900a.values().length];
        f18029a = iArr2;
        try {
            iArr2[EnumC4900a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f18029a[EnumC4900a.NANO_OF_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f18029a[EnumC4900a.MICRO_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f18029a[EnumC4900a.MICRO_OF_DAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f18029a[EnumC4900a.MILLI_OF_SECOND.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f18029a[EnumC4900a.MILLI_OF_DAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f18029a[EnumC4900a.SECOND_OF_MINUTE.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f18029a[EnumC4900a.SECOND_OF_DAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f18029a[EnumC4900a.MINUTE_OF_HOUR.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f18029a[EnumC4900a.MINUTE_OF_DAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f18029a[EnumC4900a.HOUR_OF_AMPM.ordinal()] = 11;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f18029a[EnumC4900a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f18029a[EnumC4900a.HOUR_OF_DAY.ordinal()] = 13;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f18029a[EnumC4900a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f18029a[EnumC4900a.AMPM_OF_DAY.ordinal()] = 15;
        } catch (NoSuchFieldError unused22) {
        }
    }
}

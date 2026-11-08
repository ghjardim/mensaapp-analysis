package p256j$.util;

import java.util.TimeZone;
import p256j$.time.ZoneId;

/* loaded from: classes3.dex */
public class DesugarTimeZone {
    public static TimeZone getTimeZone(String str) {
        return TimeZone.getTimeZone(str);
    }

    public static TimeZone getTimeZone(ZoneId zoneId) {
        String mo20963k = zoneId.mo20963k();
        char charAt = mo20963k.charAt(0);
        if (charAt == '+' || charAt == '-') {
            mo20963k = "GMT".concat(mo20963k);
        } else if (charAt == 'Z' && mo20963k.length() == 1) {
            mo20963k = "UTC";
        }
        return TimeZone.getTimeZone(mo20963k);
    }
}

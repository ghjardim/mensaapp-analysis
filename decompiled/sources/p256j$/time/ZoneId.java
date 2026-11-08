package p256j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.Temporal;
import p256j$.time.zone.C4931f;
import p256j$.util.Objects;

/* loaded from: classes3.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a */
    public static final Map f17891a;
    private static final long serialVersionUID = 8352817235686L;

    /* renamed from: J */
    public abstract C4931f mo20961J();

    /* renamed from: N */
    abstract void mo20962N(ObjectOutput objectOutput);

    /* renamed from: k */
    public abstract String mo20963k();

    static {
        Map.Entry[] entryArr = {AbstractC4815a.m20869g("ACT", "Australia/Darwin"), AbstractC4815a.m20869g("AET", "Australia/Sydney"), AbstractC4815a.m20869g("AGT", "America/Argentina/Buenos_Aires"), AbstractC4815a.m20869g("ART", "Africa/Cairo"), AbstractC4815a.m20869g("AST", "America/Anchorage"), AbstractC4815a.m20869g("BET", "America/Sao_Paulo"), AbstractC4815a.m20869g("BST", "Asia/Dhaka"), AbstractC4815a.m20869g("CAT", "Africa/Harare"), AbstractC4815a.m20869g("CNT", "America/St_Johns"), AbstractC4815a.m20869g("CST", "America/Chicago"), AbstractC4815a.m20869g("CTT", "Asia/Shanghai"), AbstractC4815a.m20869g("EAT", "Africa/Addis_Ababa"), AbstractC4815a.m20869g("ECT", "Europe/Paris"), AbstractC4815a.m20869g("IET", "America/Indiana/Indianapolis"), AbstractC4815a.m20869g("IST", "Asia/Kolkata"), AbstractC4815a.m20869g("JST", "Asia/Tokyo"), AbstractC4815a.m20869g("MIT", "Pacific/Apia"), AbstractC4815a.m20869g("NET", "Asia/Yerevan"), AbstractC4815a.m20869g("NST", "Pacific/Auckland"), AbstractC4815a.m20869g("PLT", "Asia/Karachi"), AbstractC4815a.m20869g("PNT", "America/Phoenix"), AbstractC4815a.m20869g("PRT", "America/Puerto_Rico"), AbstractC4815a.m20869g("PST", "America/Los_Angeles"), AbstractC4815a.m20869g("SST", "Pacific/Guadalcanal"), AbstractC4815a.m20869g("VST", "Asia/Ho_Chi_Minh"), AbstractC4815a.m20869g("EST", "-05:00"), AbstractC4815a.m20869g("MST", "-07:00"), AbstractC4815a.m20869g("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i7 = 0; i7 < 28; i7++) {
            Map.Entry entry = entryArr[i7];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        f17891a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static ZoneId m20960of(String str) {
        return m20957K(str, true);
    }

    /* renamed from: L */
    public static ZoneId m20958L(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.m20971Q() != 0) {
            str = str.concat(zoneOffset.mo20963k());
        }
        return new C4925z(str, C4931f.m21243h(zoneOffset));
    }

    /* renamed from: K */
    static ZoneId m20957K(String str, boolean z6) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.m20965R(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return m20959M(str, 3, z6);
        }
        if (str.startsWith("UT")) {
            return m20959M(str, 2, z6);
        }
        return C4925z.m21223O(str, z6);
    }

    /* renamed from: M */
    private static ZoneId m20959M(String str, int i7, boolean z6) {
        String substring = str.substring(0, i7);
        if (str.length() == i7) {
            return m20958L(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i7) != '+' && str.charAt(i7) != '-') {
            return C4925z.m21223O(str, z6);
        }
        try {
            ZoneOffset m20965R = ZoneOffset.m20965R(str.substring(i7));
            if (m20965R == ZoneOffset.UTC) {
                return m20958L(substring, m20965R);
            }
            return m20958L(substring, m20965R);
        } catch (C4822c e7) {
            throw new C4822c("Invalid ID for offset-based ZoneId: ".concat(str), e7);
        }
    }

    /* renamed from: I */
    public static ZoneId m20956I(Temporal temporal) {
        ZoneId zoneId = (ZoneId) temporal.mo20915w(AbstractC4911l.m21195j());
        if (zoneId != null) {
            return zoneId;
        }
        throw new C4822c("Unable to obtain ZoneId from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != C4925z.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return mo20963k().equals(((ZoneId) obj).mo20963k());
        }
        return false;
    }

    public int hashCode() {
        return mo20963k().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return mo20963k();
    }

    private Object writeReplace() {
        return new C4920u((byte) 7, this);
    }
}

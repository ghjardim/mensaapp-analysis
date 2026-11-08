package p253i5;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;
import p195b3.AbstractC3525e;

/* renamed from: i5.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4599c0 {

    /* renamed from: a */
    public static final long f16775a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    public static List m19821a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!(list.get(i7) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i7), Integer.valueOf(i7), list));
            }
        }
        return list;
    }

    /* renamed from: b */
    public static List m19822b(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!(list.get(i7) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", list.get(i7), Integer.valueOf(i7), list));
            }
        }
        return list;
    }

    /* renamed from: c */
    public static boolean m19823c(long j7, int i7) {
        if (j7 >= -315576000000L && j7 <= 315576000000L) {
            long j8 = i7;
            if (j8 >= -999999999 && j8 < f16775a) {
                if (j7 >= 0 && i7 >= 0) {
                    return true;
                }
                if (j7 <= 0 && i7 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static Boolean m19824d(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    /* renamed from: e */
    public static List m19825e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    /* renamed from: f */
    public static List m19826f(Map map, String str) {
        List m19825e = m19825e(map, str);
        if (m19825e == null) {
            return null;
        }
        return m19821a(m19825e);
    }

    /* renamed from: g */
    public static List m19827g(Map map, String str) {
        List m19825e = m19825e(map, str);
        if (m19825e == null) {
            return null;
        }
        return m19822b(m19825e);
    }

    /* renamed from: h */
    public static Double m19828h(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    /* renamed from: i */
    public static Integer m19829i(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d7 = (Double) obj;
        int intValue = d7.intValue();
        if (intValue == d7.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d7);
    }

    /* renamed from: j */
    public static Map m19830j(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    /* renamed from: k */
    public static String m19831k(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    /* renamed from: l */
    public static Long m19832l(Map map, String str) {
        String m19831k = m19831k(map, str);
        if (m19831k == null) {
            return null;
        }
        try {
            return Long.valueOf(m19834n(m19831k));
        } catch (ParseException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: m */
    public static long m19833m(long j7, int i7) {
        long j8 = i7;
        long j9 = f16775a;
        if (j8 <= (-j9) || j8 >= j9) {
            j7 = AbstractC3525e.m14165a(j7, j8 / j9);
            i7 = (int) (j8 % j9);
        }
        if (j7 > 0 && i7 < 0) {
            i7 = (int) (i7 + j9);
            j7--;
        }
        if (j7 < 0 && i7 > 0) {
            i7 = (int) (i7 - j9);
            j7++;
        }
        if (m19823c(j7, i7)) {
            return m19836p(TimeUnit.SECONDS.toNanos(j7), i7);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j7), Integer.valueOf(i7)));
    }

    /* renamed from: n */
    public static long m19834n(String str) {
        boolean z6;
        String str2;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z6 = true;
        } else {
            z6 = false;
        }
        String substring = str.substring(0, str.length() - 1);
        int indexOf = substring.indexOf(46);
        if (indexOf != -1) {
            str2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str2 = StringUtils.EMPTY;
        }
        long parseLong = Long.parseLong(substring);
        int m19835o = str2.isEmpty() ? 0 : m19835o(str2);
        if (parseLong < 0) {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (z6) {
            parseLong = -parseLong;
            m19835o = -m19835o;
        }
        try {
            return m19833m(parseLong, m19835o);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    /* renamed from: o */
    public static int m19835o(String str) {
        int i7 = 0;
        for (int i8 = 0; i8 < 9; i8++) {
            i7 *= 10;
            if (i8 < str.length()) {
                if (str.charAt(i8) < '0' || str.charAt(i8) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                i7 += str.charAt(i8) - '0';
            }
        }
        return i7;
    }

    /* renamed from: p */
    public static long m19836p(long j7, long j8) {
        long j9 = j7 + j8;
        return (((j8 ^ j7) > 0L ? 1 : ((j8 ^ j7) == 0L ? 0 : -1)) < 0) | ((j7 ^ j9) >= 0) ? j9 : ((j9 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}

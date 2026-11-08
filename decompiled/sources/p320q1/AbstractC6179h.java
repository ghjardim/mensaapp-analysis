package p320q1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.C5357z;

/* renamed from: q1.h */
/* loaded from: classes.dex */
public abstract class AbstractC6179h {

    /* renamed from: a */
    public static final Pattern f22126a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static Matcher m25832a(C5357z c5357z) {
        String m21959r;
        while (true) {
            String m21959r2 = c5357z.m21959r();
            if (m21959r2 == null) {
                return null;
            }
            if (f22126a.matcher(m21959r2).matches()) {
                do {
                    m21959r = c5357z.m21959r();
                    if (m21959r != null) {
                    }
                } while (!m21959r.isEmpty());
            } else {
                Matcher matcher = AbstractC6176e.f22100a.matcher(m21959r2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m25833b(C5357z c5357z) {
        String m21959r = c5357z.m21959r();
        return m21959r != null && m21959r.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static float m25834c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m25835d(String str) {
        String[] m21740f1 = AbstractC5330M.m21740f1(str, "\\.");
        long j7 = 0;
        for (String str2 : AbstractC5330M.m21737e1(m21740f1[0], TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j8 = j7 * 1000;
        if (m21740f1.length == 2) {
            j8 += Long.parseLong(m21740f1[1]);
        }
        return j8 * 1000;
    }

    /* renamed from: e */
    public static void m25836e(C5357z c5357z) {
        int m21947f = c5357z.m21947f();
        if (m25833b(c5357z)) {
            return;
        }
        c5357z.m21939T(m21947f);
        throw C4295A.m17943a("Expected WEBVTT. Got " + c5357z.m21959r(), null);
    }
}

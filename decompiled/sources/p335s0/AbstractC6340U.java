package p335s0;

import android.util.Pair;
import java.util.Map;

/* renamed from: s0.U */
/* loaded from: classes.dex */
public abstract class AbstractC6340U {
    /* renamed from: a */
    public static long m26539a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public static Pair m26540b(InterfaceC6354n interfaceC6354n) {
        Map mo26497d = interfaceC6354n.mo26497d();
        if (mo26497d == null) {
            return null;
        }
        return new Pair(Long.valueOf(m26539a(mo26497d, "LicenseDurationRemaining")), Long.valueOf(m26539a(mo26497d, "PlaybackDurationRemaining")));
    }
}

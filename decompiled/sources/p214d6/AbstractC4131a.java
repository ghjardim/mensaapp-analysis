package p214d6;

import kotlin.jvm.internal.AbstractC5469l;
import p206c6.AbstractC3612Y;
import p206c6.C3616d;

/* renamed from: d6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4131a {

    /* renamed from: a */
    public static final byte[] f13839a = AbstractC3612Y.m14561a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m17323a() {
        return f13839a;
    }

    /* renamed from: b */
    public static final String m17324b(C3616d c3616d, long j7) {
        AbstractC5469l.m23028e(c3616d, "<this>");
        if (j7 > 0) {
            long j8 = j7 - 1;
            if (c3616d.m14627o(j8) == 13) {
                String mo14518l = c3616d.mo14518l(j8);
                c3616d.skip(2L);
                return mo14518l;
            }
        }
        String mo14518l2 = c3616d.mo14518l(j7);
        c3616d.skip(1L);
        return mo14518l2;
    }
}

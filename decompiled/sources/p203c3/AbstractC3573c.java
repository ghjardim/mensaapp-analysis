package p203c3;

import org.apache.tika.fork.ForkServer;
import p171Y2.AbstractC2932o;

/* renamed from: c3.c */
/* loaded from: classes.dex */
public abstract class AbstractC3573c {
    /* renamed from: a */
    public static char m14409a(long j7) {
        char c7 = (char) j7;
        AbstractC2932o.m10567j(((long) c7) == j7, "Out of range: %s", j7);
        return c7;
    }

    /* renamed from: b */
    public static boolean m14410b(char[] cArr, char c7) {
        for (char c8 : cArr) {
            if (c8 == c7) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static char m14411c(byte b7, byte b8) {
        return (char) ((b7 << 8) | (b8 & ForkServer.ERROR));
    }
}

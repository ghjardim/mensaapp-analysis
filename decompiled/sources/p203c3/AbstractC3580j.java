package p203c3;

import org.apache.tika.fork.ForkServer;
import p171Y2.AbstractC2932o;

/* renamed from: c3.j */
/* loaded from: classes.dex */
public abstract class AbstractC3580j {
    /* renamed from: a */
    public static byte m14442a(long j7) {
        AbstractC2932o.m10567j((j7 >> 8) == 0, "out of range: %s", j7);
        return (byte) j7;
    }

    /* renamed from: b */
    public static int m14443b(byte b7) {
        return b7 & ForkServer.ERROR;
    }
}

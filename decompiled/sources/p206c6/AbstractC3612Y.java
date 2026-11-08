package p206c6;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5469l;
import p125R5.C2277c;

/* renamed from: c6.Y */
/* loaded from: classes2.dex */
public abstract class AbstractC3612Y {
    /* renamed from: a */
    public static final byte[] m14561a(String str) {
        AbstractC5469l.m23028e(str, "<this>");
        byte[] bytes = str.getBytes(C2277c.f6921b);
        AbstractC5469l.m23027d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final ReentrantLock m14562b() {
        return new ReentrantLock();
    }

    /* renamed from: c */
    public static final String m14563c(byte[] bArr) {
        AbstractC5469l.m23028e(bArr, "<this>");
        return new String(bArr, C2277c.f6921b);
    }
}

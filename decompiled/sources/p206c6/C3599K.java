package p206c6;

import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.K */
/* loaded from: classes2.dex */
public final class C3599K implements InterfaceC3607T {

    /* renamed from: a */
    public final OutputStream f12050a;

    /* renamed from: b */
    public final AbstractC3610W f12051b;

    public C3599K(OutputStream out, AbstractC3610W timeout) {
        AbstractC5469l.m23028e(out, "out");
        AbstractC5469l.m23028e(timeout, "timeout");
        this.f12050a = out;
        this.f12051b = timeout;
    }

    @Override // p206c6.InterfaceC3607T, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12050a.close();
    }

    @Override // p206c6.InterfaceC3607T, java.io.Flushable
    public void flush() {
        this.f12050a.flush();
    }

    @Override // p206c6.InterfaceC3607T
    /* renamed from: s */
    public void mo14482s(C3616d source, long j7) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC3614b.m14567b(source.m14618c0(), 0L, j7);
        while (j7 > 0) {
            this.f12051b.mo14553c();
            C3604P c3604p = source.f12107a;
            AbstractC5469l.m23025b(c3604p);
            int min = (int) Math.min(j7, c3604p.f12066c - c3604p.f12065b);
            this.f12050a.write(c3604p.f12064a, c3604p.f12065b, min);
            c3604p.f12065b += min;
            long j8 = min;
            j7 -= j8;
            source.m14615T(source.m14618c0() - j8);
            if (c3604p.f12065b == c3604p.f12066c) {
                source.f12107a = c3604p.m14525b();
                C3605Q.m14530b(c3604p);
            }
        }
    }

    public String toString() {
        return "sink(" + this.f12050a + ')';
    }
}

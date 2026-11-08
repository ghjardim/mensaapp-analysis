package p206c6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.m */
/* loaded from: classes2.dex */
public class C3625m implements InterfaceC3609V {

    /* renamed from: a */
    public final InputStream f12149a;

    /* renamed from: b */
    public final AbstractC3610W f12150b;

    public C3625m(InputStream input, AbstractC3610W timeout) {
        AbstractC5469l.m23028e(input, "input");
        AbstractC5469l.m23028e(timeout, "timeout");
        this.f12149a = input;
        this.f12150b = timeout;
    }

    @Override // p206c6.InterfaceC3609V
    /* renamed from: P */
    public long mo14512P(C3616d sink, long j7) {
        AbstractC5469l.m23028e(sink, "sink");
        if (j7 == 0) {
            return 0L;
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        try {
            this.f12150b.mo14553c();
            C3604P m14624k0 = sink.m14624k0(1);
            int read = this.f12149a.read(m14624k0.f12064a, m14624k0.f12066c, (int) Math.min(j7, 8192 - m14624k0.f12066c));
            if (read != -1) {
                m14624k0.f12066c += read;
                long j8 = read;
                sink.m14615T(sink.m14618c0() + j8);
                return j8;
            }
            if (m14624k0.f12065b != m14624k0.f12066c) {
                return -1L;
            }
            sink.f12107a = m14624k0.m14525b();
            C3605Q.m14530b(m14624k0);
            return -1L;
        } catch (AssertionError e7) {
            if (AbstractC3596H.m14471c(e7)) {
                throw new IOException(e7);
            }
            throw e7;
        }
    }

    @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f12149a.close();
    }

    public String toString() {
        return "source(" + this.f12149a + ')';
    }
}

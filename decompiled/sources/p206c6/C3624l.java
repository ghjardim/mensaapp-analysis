package p206c6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.l */
/* loaded from: classes2.dex */
public final class C3624l implements InterfaceC3609V {

    /* renamed from: a */
    public final InterfaceC3618f f12145a;

    /* renamed from: b */
    public final Inflater f12146b;

    /* renamed from: c */
    public int f12147c;

    /* renamed from: d */
    public boolean f12148d;

    public C3624l(InterfaceC3618f source, Inflater inflater) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(inflater, "inflater");
        this.f12145a = source;
        this.f12146b = inflater;
    }

    @Override // p206c6.InterfaceC3609V
    /* renamed from: P */
    public long mo14512P(C3616d sink, long j7) {
        AbstractC5469l.m23028e(sink, "sink");
        do {
            long m14682a = m14682a(sink, j7);
            if (m14682a > 0) {
                return m14682a;
            }
            if (this.f12146b.finished() || this.f12146b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f12145a.mo14523z());
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: a */
    public final long m14682a(C3616d sink, long j7) {
        AbstractC5469l.m23028e(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (this.f12148d) {
            throw new IllegalStateException("closed");
        }
        if (j7 == 0) {
            return 0L;
        }
        try {
            C3604P m14624k0 = sink.m14624k0(1);
            int min = (int) Math.min(j7, 8192 - m14624k0.f12066c);
            m14683c();
            int inflate = this.f12146b.inflate(m14624k0.f12064a, m14624k0.f12066c, min);
            m14684d();
            if (inflate > 0) {
                m14624k0.f12066c += inflate;
                long j8 = inflate;
                sink.m14615T(sink.m14618c0() + j8);
                return j8;
            }
            if (m14624k0.f12065b == m14624k0.f12066c) {
                sink.f12107a = m14624k0.m14525b();
                C3605Q.m14530b(m14624k0);
            }
            return 0L;
        } catch (DataFormatException e7) {
            throw new IOException(e7);
        }
    }

    /* renamed from: c */
    public final boolean m14683c() {
        if (!this.f12146b.needsInput()) {
            return false;
        }
        if (this.f12145a.mo14523z()) {
            return true;
        }
        C3604P c3604p = this.f12145a.mo14522x().f12107a;
        AbstractC5469l.m23025b(c3604p);
        int i7 = c3604p.f12066c;
        int i8 = c3604p.f12065b;
        int i9 = i7 - i8;
        this.f12147c = i9;
        this.f12146b.setInput(c3604p.f12064a, i8, i9);
        return false;
    }

    @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (this.f12148d) {
            return;
        }
        this.f12146b.end();
        this.f12148d = true;
        this.f12145a.close();
    }

    /* renamed from: d */
    public final void m14684d() {
        int i7 = this.f12147c;
        if (i7 == 0) {
            return;
        }
        int remaining = i7 - this.f12146b.getRemaining();
        this.f12147c -= remaining;
        this.f12145a.skip(remaining);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3624l(InterfaceC3609V source, Inflater inflater) {
        this(AbstractC3596H.m14470b(source), inflater);
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(inflater, "inflater");
    }
}

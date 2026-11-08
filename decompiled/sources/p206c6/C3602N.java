package p206c6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.N */
/* loaded from: classes2.dex */
public final class C3602N implements InterfaceC3617e {

    /* renamed from: a */
    public final InterfaceC3607T f12055a;

    /* renamed from: b */
    public final C3616d f12056b;

    /* renamed from: c */
    public boolean f12057c;

    public C3602N(InterfaceC3607T sink) {
        AbstractC5469l.m23028e(sink, "sink");
        this.f12055a = sink;
        this.f12056b = new C3616d();
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: A */
    public InterfaceC3617e mo14505A(int i7) {
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        this.f12056b.mo14505A(i7);
        return m14507a();
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: O */
    public InterfaceC3617e mo14506O(String string) {
        AbstractC5469l.m23028e(string, "string");
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        this.f12056b.mo14506O(string);
        return m14507a();
    }

    /* renamed from: a */
    public InterfaceC3617e m14507a() {
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        long m14622g = this.f12056b.m14622g();
        if (m14622g > 0) {
            this.f12055a.mo14482s(this.f12056b, m14622g);
        }
        return this;
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: b0 */
    public InterfaceC3617e mo14508b0(byte[] source) {
        AbstractC5469l.m23028e(source, "source");
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        this.f12056b.mo14508b0(source);
        return m14507a();
    }

    @Override // p206c6.InterfaceC3607T, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12057c) {
            return;
        }
        try {
            if (this.f12056b.m14618c0() > 0) {
                InterfaceC3607T interfaceC3607T = this.f12055a;
                C3616d c3616d = this.f12056b;
                interfaceC3607T.mo14482s(c3616d, c3616d.m14618c0());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f12055a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f12057c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p206c6.InterfaceC3617e, p206c6.InterfaceC3607T, java.io.Flushable
    public void flush() {
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        if (this.f12056b.m14618c0() > 0) {
            InterfaceC3607T interfaceC3607T = this.f12055a;
            C3616d c3616d = this.f12056b;
            interfaceC3607T.mo14482s(c3616d, c3616d.m14618c0());
        }
        this.f12055a.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f12057c;
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: q */
    public InterfaceC3617e mo14509q(int i7) {
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        this.f12056b.mo14509q(i7);
        return m14507a();
    }

    @Override // p206c6.InterfaceC3607T
    /* renamed from: s */
    public void mo14482s(C3616d source, long j7) {
        AbstractC5469l.m23028e(source, "source");
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        this.f12056b.mo14482s(source, j7);
        m14507a();
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: t */
    public InterfaceC3617e mo14510t(int i7) {
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        this.f12056b.mo14510t(i7);
        return m14507a();
    }

    public String toString() {
        return "buffer(" + this.f12055a + ')';
    }

    @Override // p206c6.InterfaceC3617e
    /* renamed from: u0 */
    public OutputStream mo14511u0() {
        return new a();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC5469l.m23028e(source, "source");
        if (this.f12057c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f12056b.write(source);
        m14507a();
        return write;
    }

    /* renamed from: c6.N$a */
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3602N.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            C3602N c3602n = C3602N.this;
            if (c3602n.f12057c) {
                return;
            }
            c3602n.flush();
        }

        public String toString() {
            return C3602N.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            C3602N c3602n = C3602N.this;
            if (c3602n.f12057c) {
                throw new IOException("closed");
            }
            c3602n.f12056b.mo14505A((byte) i7);
            C3602N.this.m14507a();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i7, int i8) {
            AbstractC5469l.m23028e(data, "data");
            C3602N c3602n = C3602N.this;
            if (!c3602n.f12057c) {
                c3602n.f12056b.m14632x0(data, i7, i8);
                C3602N.this.m14507a();
                return;
            }
            throw new IOException("closed");
        }
    }
}

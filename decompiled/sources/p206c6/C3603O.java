package p206c6;

import com.google.android.gms.common.api.C3643a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.fork.ForkServer;

/* renamed from: c6.O */
/* loaded from: classes2.dex */
public final class C3603O implements InterfaceC3618f {

    /* renamed from: a */
    public final InterfaceC3609V f12059a;

    /* renamed from: b */
    public final C3616d f12060b;

    /* renamed from: c */
    public boolean f12061c;

    public C3603O(InterfaceC3609V source) {
        AbstractC5469l.m23028e(source, "source");
        this.f12059a = source;
        this.f12060b = new C3616d();
    }

    @Override // p206c6.InterfaceC3609V
    /* renamed from: P */
    public long mo14512P(C3616d sink, long j7) {
        AbstractC5469l.m23028e(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (this.f12061c) {
            throw new IllegalStateException("closed");
        }
        if (this.f12060b.m14618c0() == 0 && this.f12059a.mo14512P(this.f12060b, 8192L) == -1) {
            return -1L;
        }
        return this.f12060b.mo14512P(sink, Math.min(j7, this.f12060b.m14618c0()));
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: Y */
    public int mo14513Y() {
        mo14520s0(4L);
        return this.f12060b.mo14513Y();
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: Z */
    public byte[] mo14514Z(long j7) {
        mo14520s0(j7);
        return this.f12060b.mo14514Z(j7);
    }

    /* renamed from: a */
    public boolean m14515a(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (this.f12061c) {
            throw new IllegalStateException("closed");
        }
        while (this.f12060b.m14618c0() < j7) {
            if (this.f12059a.mo14512P(this.f12060b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // p206c6.InterfaceC3609V, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (this.f12061c) {
            return;
        }
        this.f12061c = true;
        this.f12059a.close();
        this.f12060b.m14617c();
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: e0 */
    public short mo14516e0() {
        mo14520s0(2L);
        return this.f12060b.mo14516e0();
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: i0 */
    public long mo14517i0() {
        mo14520s0(8L);
        return this.f12060b.mo14517i0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f12061c;
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: l */
    public String mo14518l(long j7) {
        mo14520s0(j7);
        return this.f12060b.mo14518l(j7);
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: p */
    public C3619g mo14519p(long j7) {
        mo14520s0(j7);
        return this.f12060b.mo14519p(j7);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC5469l.m23028e(sink, "sink");
        if (this.f12060b.m14618c0() == 0 && this.f12059a.mo14512P(this.f12060b, 8192L) == -1) {
            return -1;
        }
        return this.f12060b.read(sink);
    }

    @Override // p206c6.InterfaceC3618f
    public byte readByte() {
        mo14520s0(1L);
        return this.f12060b.readByte();
    }

    @Override // p206c6.InterfaceC3618f
    public int readInt() {
        mo14520s0(4L);
        return this.f12060b.readInt();
    }

    @Override // p206c6.InterfaceC3618f
    public short readShort() {
        mo14520s0(2L);
        return this.f12060b.readShort();
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: s0 */
    public void mo14520s0(long j7) {
        if (!m14515a(j7)) {
            throw new EOFException();
        }
    }

    @Override // p206c6.InterfaceC3618f
    public void skip(long j7) {
        if (this.f12061c) {
            throw new IllegalStateException("closed");
        }
        while (j7 > 0) {
            if (this.f12060b.m14618c0() == 0 && this.f12059a.mo14512P(this.f12060b, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j7, this.f12060b.m14618c0());
            this.f12060b.skip(min);
            j7 -= min;
        }
    }

    public String toString() {
        return "buffer(" + this.f12059a + ')';
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: w0 */
    public InputStream mo14521w0() {
        return new a();
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: x */
    public C3616d mo14522x() {
        return this.f12060b;
    }

    @Override // p206c6.InterfaceC3618f
    /* renamed from: z */
    public boolean mo14523z() {
        if (this.f12061c) {
            throw new IllegalStateException("closed");
        }
        return this.f12060b.mo14523z() && this.f12059a.mo14512P(this.f12060b, 8192L) == -1;
    }

    /* renamed from: c6.O$a */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            C3603O c3603o = C3603O.this;
            if (c3603o.f12061c) {
                throw new IOException("closed");
            }
            return (int) Math.min(c3603o.f12060b.m14618c0(), C3643a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3603O.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            C3603O c3603o = C3603O.this;
            if (c3603o.f12061c) {
                throw new IOException("closed");
            }
            if (c3603o.f12060b.m14618c0() == 0) {
                C3603O c3603o2 = C3603O.this;
                if (c3603o2.f12059a.mo14512P(c3603o2.f12060b, 8192L) == -1) {
                    return -1;
                }
            }
            return C3603O.this.f12060b.readByte() & ForkServer.ERROR;
        }

        public String toString() {
            return C3603O.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i7, int i8) {
            AbstractC5469l.m23028e(data, "data");
            if (!C3603O.this.f12061c) {
                AbstractC3614b.m14567b(data.length, i7, i8);
                if (C3603O.this.f12060b.m14618c0() == 0) {
                    C3603O c3603o = C3603O.this;
                    if (c3603o.f12059a.mo14512P(c3603o.f12060b, 8192L) == -1) {
                        return -1;
                    }
                }
                return C3603O.this.f12060b.read(data, i7, i8);
            }
            throw new IOException("closed");
        }
    }
}

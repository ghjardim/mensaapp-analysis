package p253i5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p171Y2.AbstractC2932o;
import p186a3.AbstractC3107b;
import p237g5.C4448l0;
import p237g5.C4452n0;
import p237g5.InterfaceC4416Q;
import p237g5.InterfaceC4447l;
import p237g5.InterfaceC4451n;
import p237g5.InterfaceC4465w;

/* renamed from: i5.n0 */
/* loaded from: classes2.dex */
public class C4621n0 implements InterfaceC4575P {

    /* renamed from: a */
    public final d f17128a;

    /* renamed from: c */
    public InterfaceC4589W0 f17130c;

    /* renamed from: h */
    public final InterfaceC4591X0 f17135h;

    /* renamed from: i */
    public final C4576P0 f17136i;

    /* renamed from: j */
    public boolean f17137j;

    /* renamed from: k */
    public int f17138k;

    /* renamed from: m */
    public long f17140m;

    /* renamed from: b */
    public int f17129b = -1;

    /* renamed from: d */
    public InterfaceC4451n f17131d = InterfaceC4447l.b.f15793a;

    /* renamed from: e */
    public boolean f17132e = true;

    /* renamed from: f */
    public final c f17133f = new c();

    /* renamed from: g */
    public final ByteBuffer f17134g = ByteBuffer.allocate(5);

    /* renamed from: l */
    public int f17139l = -1;

    /* renamed from: i5.n0$d */
    public interface d {
        /* renamed from: f */
        void mo19766f(InterfaceC4589W0 interfaceC4589W0, boolean z6, boolean z7, int i7);
    }

    public C4621n0(d dVar, InterfaceC4591X0 interfaceC4591X0, C4576P0 c4576p0) {
        this.f17128a = (d) AbstractC2932o.m10573p(dVar, "sink");
        this.f17135h = (InterfaceC4591X0) AbstractC2932o.m10573p(interfaceC4591X0, "bufferAllocator");
        this.f17136i = (C4576P0) AbstractC2932o.m10573p(c4576p0, "statsTraceCtx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static int m20037p(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof InterfaceC4465w) {
            return ((InterfaceC4465w) inputStream).mo19033a(outputStream);
        }
        long m11350b = AbstractC3107b.m11350b(inputStream, outputStream);
        AbstractC2932o.m10567j(m11350b <= 2147483647L, "Message size overflow: %s", m11350b);
        return (int) m11350b;
    }

    /* renamed from: c */
    public final void m20038c(boolean z6, boolean z7) {
        InterfaceC4589W0 interfaceC4589W0 = this.f17130c;
        this.f17130c = null;
        this.f17128a.mo19766f(interfaceC4589W0, z6, z7, this.f17138k);
        this.f17138k = 0;
    }

    @Override // p253i5.InterfaceC4575P
    public void close() {
        if (mo19579f()) {
            return;
        }
        this.f17137j = true;
        InterfaceC4589W0 interfaceC4589W0 = this.f17130c;
        if (interfaceC4589W0 != null && interfaceC4589W0.mo19694b() == 0) {
            m20040i();
        }
        m20038c(true, true);
    }

    /* renamed from: d */
    public final int m20039d(InputStream inputStream) {
        if ((inputStream instanceof InterfaceC4416Q) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    @Override // p253i5.InterfaceC4575P
    /* renamed from: f */
    public boolean mo19579f() {
        return this.f17137j;
    }

    @Override // p253i5.InterfaceC4575P
    public void flush() {
        InterfaceC4589W0 interfaceC4589W0 = this.f17130c;
        if (interfaceC4589W0 == null || interfaceC4589W0.mo19694b() <= 0) {
            return;
        }
        m20038c(false, true);
    }

    @Override // p253i5.InterfaceC4575P
    /* renamed from: g */
    public void mo19580g(InputStream inputStream) {
        m20042k();
        this.f17138k++;
        int i7 = this.f17139l + 1;
        this.f17139l = i7;
        this.f17140m = 0L;
        this.f17136i.m19590i(i7);
        boolean z6 = this.f17132e && this.f17131d != InterfaceC4447l.b.f15793a;
        try {
            int m20039d = m20039d(inputStream);
            int m20047q = (m20039d == 0 || !z6) ? m20047q(inputStream, m20039d) : m20044m(inputStream, m20039d);
            if (m20039d != -1 && m20047q != m20039d) {
                throw C4448l0.f15809s.m18963q(String.format("Message length inaccurate %s != %s", Integer.valueOf(m20047q), Integer.valueOf(m20039d))).m18956d();
            }
            long j7 = m20047q;
            this.f17136i.m19592k(j7);
            this.f17136i.m19593l(this.f17140m);
            this.f17136i.m19591j(this.f17139l, this.f17140m, j7);
        } catch (C4452n0 e7) {
            throw e7;
        } catch (IOException e8) {
            throw C4448l0.f15809s.m18963q("Failed to frame message").m18962p(e8).m18956d();
        } catch (RuntimeException e9) {
            throw C4448l0.f15809s.m18963q("Failed to frame message").m18962p(e9).m18956d();
        }
    }

    @Override // p253i5.InterfaceC4575P
    /* renamed from: h */
    public void mo19581h(int i7) {
        AbstractC2932o.m10579v(this.f17129b == -1, "max size already set");
        this.f17129b = i7;
    }

    /* renamed from: i */
    public final void m20040i() {
        InterfaceC4589W0 interfaceC4589W0 = this.f17130c;
        if (interfaceC4589W0 != null) {
            interfaceC4589W0.release();
            this.f17130c = null;
        }
    }

    @Override // p253i5.InterfaceC4575P
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C4621n0 mo19578e(InterfaceC4451n interfaceC4451n) {
        this.f17131d = (InterfaceC4451n) AbstractC2932o.m10573p(interfaceC4451n, "Can't pass an empty compressor");
        return this;
    }

    /* renamed from: k */
    public final void m20042k() {
        if (mo19579f()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    /* renamed from: l */
    public final void m20043l(b bVar, boolean z6) {
        int m20050b = bVar.m20050b();
        int i7 = this.f17129b;
        if (i7 >= 0 && m20050b > i7) {
            throw C4448l0.f15804n.m18963q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(m20050b), Integer.valueOf(this.f17129b))).m18956d();
        }
        this.f17134g.clear();
        this.f17134g.put(z6 ? (byte) 1 : (byte) 0).putInt(m20050b);
        InterfaceC4589W0 mo19702a = this.f17135h.mo19702a(5);
        mo19702a.mo19693a(this.f17134g.array(), 0, this.f17134g.position());
        if (m20050b == 0) {
            this.f17130c = mo19702a;
            return;
        }
        this.f17128a.mo19766f(mo19702a, false, false, this.f17138k - 1);
        this.f17138k = 1;
        List list = bVar.f17141a;
        for (int i8 = 0; i8 < list.size() - 1; i8++) {
            this.f17128a.mo19766f((InterfaceC4589W0) list.get(i8), false, false, 0);
        }
        this.f17130c = (InterfaceC4589W0) list.get(list.size() - 1);
        this.f17140m = m20050b;
    }

    /* renamed from: m */
    public final int m20044m(InputStream inputStream, int i7) {
        b bVar = new b();
        OutputStream mo18946c = this.f17131d.mo18946c(bVar);
        try {
            int m20037p = m20037p(inputStream, mo18946c);
            mo18946c.close();
            int i8 = this.f17129b;
            if (i8 >= 0 && m20037p > i8) {
                throw C4448l0.f15804n.m18963q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(m20037p), Integer.valueOf(this.f17129b))).m18956d();
            }
            m20043l(bVar, true);
            return m20037p;
        } catch (Throwable th) {
            mo18946c.close();
            throw th;
        }
    }

    /* renamed from: n */
    public final int m20045n(InputStream inputStream, int i7) {
        int i8 = this.f17129b;
        if (i8 >= 0 && i7 > i8) {
            throw C4448l0.f15804n.m18963q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i7), Integer.valueOf(this.f17129b))).m18956d();
        }
        this.f17134g.clear();
        this.f17134g.put((byte) 0).putInt(i7);
        if (this.f17130c == null) {
            this.f17130c = this.f17135h.mo19702a(this.f17134g.position() + i7);
        }
        m20046o(this.f17134g.array(), 0, this.f17134g.position());
        return m20037p(inputStream, this.f17133f);
    }

    /* renamed from: o */
    public final void m20046o(byte[] bArr, int i7, int i8) {
        while (i8 > 0) {
            InterfaceC4589W0 interfaceC4589W0 = this.f17130c;
            if (interfaceC4589W0 != null && interfaceC4589W0.mo19695c() == 0) {
                m20038c(false, false);
            }
            if (this.f17130c == null) {
                this.f17130c = this.f17135h.mo19702a(i8);
            }
            int min = Math.min(i8, this.f17130c.mo19695c());
            this.f17130c.mo19693a(bArr, i7, min);
            i7 += min;
            i8 -= min;
        }
    }

    /* renamed from: q */
    public final int m20047q(InputStream inputStream, int i7) {
        if (i7 != -1) {
            this.f17140m = i7;
            return m20045n(inputStream, i7);
        }
        b bVar = new b();
        int m20037p = m20037p(inputStream, bVar);
        m20043l(bVar, false);
        return m20037p;
    }

    /* renamed from: i5.n0$c */
    public class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            write(new byte[]{(byte) i7}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            C4621n0.this.m20046o(bArr, i7, i8);
        }
    }

    /* renamed from: i5.n0$b */
    public final class b extends OutputStream {

        /* renamed from: a */
        public final List f17141a;

        /* renamed from: b */
        public InterfaceC4589W0 f17142b;

        public b() {
            this.f17141a = new ArrayList();
        }

        /* renamed from: b */
        public final int m20050b() {
            Iterator it = this.f17141a.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                i7 += ((InterfaceC4589W0) it.next()).mo19694b();
            }
            return i7;
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            InterfaceC4589W0 interfaceC4589W0 = this.f17142b;
            if (interfaceC4589W0 == null || interfaceC4589W0.mo19695c() <= 0) {
                write(new byte[]{(byte) i7}, 0, 1);
            } else {
                this.f17142b.mo19696d((byte) i7);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            if (this.f17142b == null) {
                InterfaceC4589W0 mo19702a = C4621n0.this.f17135h.mo19702a(i8);
                this.f17142b = mo19702a;
                this.f17141a.add(mo19702a);
            }
            while (i8 > 0) {
                int min = Math.min(i8, this.f17142b.mo19695c());
                if (min == 0) {
                    InterfaceC4589W0 mo19702a2 = C4621n0.this.f17135h.mo19702a(Math.max(i8, this.f17142b.mo19694b() * 2));
                    this.f17142b = mo19702a2;
                    this.f17141a.add(mo19702a2);
                } else {
                    this.f17142b.mo19693a(bArr, i7, min);
                    i7 += min;
                    i8 -= min;
                }
            }
        }
    }
}

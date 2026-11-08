package p253i5;

import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import p171Y2.AbstractC2932o;
import p237g5.C4448l0;
import p237g5.InterfaceC4447l;
import p237g5.InterfaceC4463u;
import p253i5.InterfaceC4579R0;

/* renamed from: i5.m0 */
/* loaded from: classes2.dex */
public class C4619m0 implements Closeable, InterfaceC4644z {

    /* renamed from: a */
    public b f17093a;

    /* renamed from: b */
    public int f17094b;

    /* renamed from: c */
    public final C4576P0 f17095c;

    /* renamed from: d */
    public final C4587V0 f17096d;

    /* renamed from: e */
    public InterfaceC4463u f17097e;

    /* renamed from: f */
    public C4582T f17098f;

    /* renamed from: n */
    public byte[] f17099n;

    /* renamed from: o */
    public int f17100o;

    /* renamed from: r */
    public boolean f17103r;

    /* renamed from: s */
    public C4636v f17104s;

    /* renamed from: u */
    public long f17106u;

    /* renamed from: x */
    public int f17109x;

    /* renamed from: p */
    public e f17101p = e.HEADER;

    /* renamed from: q */
    public int f17102q = 5;

    /* renamed from: t */
    public C4636v f17105t = new C4636v();

    /* renamed from: v */
    public boolean f17107v = false;

    /* renamed from: w */
    public int f17108w = -1;

    /* renamed from: y */
    public boolean f17110y = false;

    /* renamed from: z */
    public volatile boolean f17111z = false;

    /* renamed from: i5.m0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17112a;

        static {
            int[] iArr = new int[e.values().length];
            f17112a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17112a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: i5.m0$b */
    public interface b {
        /* renamed from: a */
        void mo19529a(InterfaceC4579R0.a aVar);

        /* renamed from: c */
        void mo19531c(boolean z6);

        /* renamed from: d */
        void mo19532d(int i7);

        /* renamed from: e */
        void mo19533e(Throwable th);
    }

    /* renamed from: i5.m0$c */
    public static class c implements InterfaceC4579R0.a {

        /* renamed from: a */
        public InputStream f17113a;

        public /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // p253i5.InterfaceC4579R0.a
        public InputStream next() {
            InputStream inputStream = this.f17113a;
            this.f17113a = null;
            return inputStream;
        }

        public c(InputStream inputStream) {
            this.f17113a = inputStream;
        }
    }

    /* renamed from: i5.m0$e */
    public enum e {
        HEADER,
        BODY
    }

    public C4619m0(b bVar, InterfaceC4463u interfaceC4463u, int i7, C4576P0 c4576p0, C4587V0 c4587v0) {
        this.f17093a = (b) AbstractC2932o.m10573p(bVar, "sink");
        this.f17097e = (InterfaceC4463u) AbstractC2932o.m10573p(interfaceC4463u, "decompressor");
        this.f17094b = i7;
        this.f17095c = (C4576P0) AbstractC2932o.m10573p(c4576p0, "statsTraceCtx");
        this.f17096d = (C4587V0) AbstractC2932o.m10573p(c4587v0, "transportTracer");
    }

    /* renamed from: C */
    public final void m20019C() {
        int readUnsignedByte = this.f17104s.readUnsignedByte();
        if ((readUnsignedByte & 254) != 0) {
            throw C4448l0.f15809s.m18963q("gRPC frame header malformed: reserved bits not zero").m18956d();
        }
        this.f17103r = (readUnsignedByte & 1) != 0;
        int readInt = this.f17104s.readInt();
        this.f17102q = readInt;
        if (readInt < 0 || readInt > this.f17094b) {
            throw C4448l0.f15804n.m18963q(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f17094b), Integer.valueOf(this.f17102q))).m18956d();
        }
        int i7 = this.f17108w + 1;
        this.f17108w = i7;
        this.f17095c.m19586d(i7);
        this.f17096d.m19680d();
        this.f17101p = e.BODY;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: all -> 0x002c, DataFormatException -> 0x0032, IOException -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0034, DataFormatException -> 0x0032, blocks: (B:14:0x0022, B:16:0x0026, B:19:0x0042, B:22:0x008f, B:35:0x0036), top: B:13:0x0022, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m20020D() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p253i5.C4619m0.m20020D():boolean");
    }

    /* renamed from: F */
    public void m20021F(C4582T c4582t) {
        AbstractC2932o.m10579v(this.f17097e == InterfaceC4447l.b.f15793a, "per-message decompressor already set");
        AbstractC2932o.m10579v(this.f17098f == null, "full stream decompressor already set");
        this.f17098f = (C4582T) AbstractC2932o.m10573p(c4582t, "Can't pass a null full stream decompressor");
        this.f17105t = null;
    }

    /* renamed from: G */
    public void m20022G(b bVar) {
        this.f17093a = bVar;
    }

    /* renamed from: K */
    public void m20023K() {
        this.f17111z = true;
    }

    /* renamed from: a */
    public final void m20024a() {
        if (this.f17107v) {
            return;
        }
        this.f17107v = true;
        while (!this.f17111z && this.f17106u > 0 && m20020D()) {
            try {
                int i7 = a.f17112a[this.f17101p.ordinal()];
                if (i7 == 1) {
                    m20019C();
                } else {
                    if (i7 != 2) {
                        throw new AssertionError("Invalid state: " + this.f17101p);
                    }
                    m20030y();
                    this.f17106u--;
                }
            } catch (Throwable th) {
                this.f17107v = false;
                throw th;
            }
        }
        if (this.f17111z) {
            close();
            this.f17107v = false;
        } else {
            if (this.f17110y && m20029w()) {
                close();
            }
            this.f17107v = false;
        }
    }

    /* renamed from: c */
    public final InputStream m20025c() {
        InterfaceC4463u interfaceC4463u = this.f17097e;
        if (interfaceC4463u == InterfaceC4447l.b.f15793a) {
            throw C4448l0.f15809s.m18963q("Can't decode compressed gRPC message as compression not configured").m18956d();
        }
        try {
            return new d(interfaceC4463u.mo18945b(AbstractC4546A0.m19329c(this.f17104s, true)), this.f17094b, this.f17095c);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, p253i5.InterfaceC4644z
    public void close() {
        if (m20027r()) {
            return;
        }
        C4636v c4636v = this.f17104s;
        boolean z6 = false;
        boolean z7 = c4636v != null && c4636v.mo19335b() > 0;
        try {
            C4582T c4582t = this.f17098f;
            if (c4582t != null) {
                if (!z7) {
                    if (c4582t.m19648y()) {
                    }
                    this.f17098f.close();
                    z7 = z6;
                }
                z6 = true;
                this.f17098f.close();
                z7 = z6;
            }
            C4636v c4636v2 = this.f17105t;
            if (c4636v2 != null) {
                c4636v2.close();
            }
            C4636v c4636v3 = this.f17104s;
            if (c4636v3 != null) {
                c4636v3.close();
            }
            this.f17098f = null;
            this.f17105t = null;
            this.f17104s = null;
            this.f17093a.mo19531c(z7);
        } catch (Throwable th) {
            this.f17098f = null;
            this.f17105t = null;
            this.f17104s = null;
            throw th;
        }
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: d */
    public void mo19861d(int i7) {
        AbstractC2932o.m10562e(i7 > 0, "numMessages must be > 0");
        if (m20027r()) {
            return;
        }
        this.f17106u += i7;
        m20024a();
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: g */
    public void mo19862g(int i7) {
        this.f17094b = i7;
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: h */
    public void mo19863h() {
        if (m20027r()) {
            return;
        }
        if (m20029w()) {
            close();
        } else {
            this.f17110y = true;
        }
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: j */
    public void mo19864j(InterfaceC4463u interfaceC4463u) {
        AbstractC2932o.m10579v(this.f17098f == null, "Already set full stream decompressor");
        this.f17097e = (InterfaceC4463u) AbstractC2932o.m10573p(interfaceC4463u, "Can't pass an empty decompressor");
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: m */
    public void mo19865m(InterfaceC4645z0 interfaceC4645z0) {
        AbstractC2932o.m10573p(interfaceC4645z0, "data");
        boolean z6 = true;
        try {
            if (m20028v()) {
                interfaceC4645z0.close();
                return;
            }
            C4582T c4582t = this.f17098f;
            if (c4582t != null) {
                c4582t.m19644o(interfaceC4645z0);
            } else {
                this.f17105t.m20154d(interfaceC4645z0);
            }
            try {
                m20024a();
            } catch (Throwable th) {
                th = th;
                z6 = false;
                if (z6) {
                    interfaceC4645z0.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: o */
    public final InputStream m20026o() {
        this.f17095c.m19588f(this.f17104s.mo19335b());
        return AbstractC4546A0.m19329c(this.f17104s, true);
    }

    /* renamed from: r */
    public boolean m20027r() {
        return this.f17105t == null && this.f17098f == null;
    }

    /* renamed from: v */
    public final boolean m20028v() {
        return m20027r() || this.f17110y;
    }

    /* renamed from: w */
    public final boolean m20029w() {
        C4582T c4582t = this.f17098f;
        return c4582t != null ? c4582t.m19636G() : this.f17105t.mo19335b() == 0;
    }

    /* renamed from: y */
    public final void m20030y() {
        this.f17095c.m19587e(this.f17108w, this.f17109x, -1L);
        this.f17109x = 0;
        InputStream m20025c = this.f17103r ? m20025c() : m20026o();
        this.f17104s.m19794c();
        this.f17104s = null;
        this.f17093a.mo19529a(new c(m20025c, null));
        this.f17101p = e.HEADER;
        this.f17102q = 5;
    }

    /* renamed from: i5.m0$d */
    public static final class d extends FilterInputStream {

        /* renamed from: a */
        public final int f17114a;

        /* renamed from: b */
        public final C4576P0 f17115b;

        /* renamed from: c */
        public long f17116c;

        /* renamed from: d */
        public long f17117d;

        /* renamed from: e */
        public long f17118e;

        public d(InputStream inputStream, int i7, C4576P0 c4576p0) {
            super(inputStream);
            this.f17118e = -1L;
            this.f17114a = i7;
            this.f17115b = c4576p0;
        }

        /* renamed from: a */
        public final void m20031a() {
            long j7 = this.f17117d;
            long j8 = this.f17116c;
            if (j7 > j8) {
                this.f17115b.m19588f(j7 - j8);
                this.f17116c = this.f17117d;
            }
        }

        /* renamed from: c */
        public final void m20032c() {
            if (this.f17117d <= this.f17114a) {
                return;
            }
            throw C4448l0.f15804n.m18963q("Decompressed gRPC message exceeds maximum size " + this.f17114a).m18956d();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i7) {
            ((FilterInputStream) this).in.mark(i7);
            this.f17118e = this.f17117d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f17117d++;
            }
            m20032c();
            m20031a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f17118e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f17117d = this.f17118e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j7) {
            long skip = ((FilterInputStream) this).in.skip(j7);
            this.f17117d += skip;
            m20032c();
            m20031a();
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            int read = ((FilterInputStream) this).in.read(bArr, i7, i8);
            if (read != -1) {
                this.f17117d += read;
            }
            m20032c();
            m20031a();
            return read;
        }
    }
}

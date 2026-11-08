package p253i5;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.tika.fork.ForkServer;
import p171Y2.AbstractC2932o;

/* renamed from: i5.T */
/* loaded from: classes2.dex */
public class C4582T implements Closeable {

    /* renamed from: e */
    public int f16617e;

    /* renamed from: f */
    public int f16618f;

    /* renamed from: n */
    public Inflater f16619n;

    /* renamed from: q */
    public int f16622q;

    /* renamed from: r */
    public int f16623r;

    /* renamed from: s */
    public long f16624s;

    /* renamed from: a */
    public final C4636v f16613a = new C4636v();

    /* renamed from: b */
    public final CRC32 f16614b = new CRC32();

    /* renamed from: c */
    public final b f16615c = new b(this, null);

    /* renamed from: d */
    public final byte[] f16616d = new byte[512];

    /* renamed from: o */
    public c f16620o = c.HEADER;

    /* renamed from: p */
    public boolean f16621p = false;

    /* renamed from: t */
    public int f16625t = 0;

    /* renamed from: u */
    public int f16626u = 0;

    /* renamed from: v */
    public boolean f16627v = true;

    /* renamed from: i5.T$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16628a;

        static {
            int[] iArr = new int[c.values().length];
            f16628a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16628a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16628a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16628a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16628a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16628a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16628a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16628a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16628a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16628a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: i5.T$b */
    public class b {
        public b() {
        }

        /* renamed from: g */
        public final boolean m19655g() {
            while (m19659k() > 0) {
                if (m19656h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public final int m19656h() {
            int readUnsignedByte;
            if (C4582T.this.f16618f - C4582T.this.f16617e > 0) {
                readUnsignedByte = C4582T.this.f16616d[C4582T.this.f16617e] & ForkServer.ERROR;
                C4582T.m19628d(C4582T.this, 1);
            } else {
                readUnsignedByte = C4582T.this.f16613a.readUnsignedByte();
            }
            C4582T.this.f16614b.update(readUnsignedByte);
            C4582T.m19632m(C4582T.this, 1);
            return readUnsignedByte;
        }

        /* renamed from: i */
        public final long m19657i() {
            return m19658j() | (m19658j() << 16);
        }

        /* renamed from: j */
        public final int m19658j() {
            return m19656h() | (m19656h() << 8);
        }

        /* renamed from: k */
        public final int m19659k() {
            return (C4582T.this.f16618f - C4582T.this.f16617e) + C4582T.this.f16613a.mo19335b();
        }

        /* renamed from: l */
        public final void m19660l(int i7) {
            int i8;
            int i9 = C4582T.this.f16618f - C4582T.this.f16617e;
            if (i9 > 0) {
                int min = Math.min(i9, i7);
                C4582T.this.f16614b.update(C4582T.this.f16616d, C4582T.this.f16617e, min);
                C4582T.m19628d(C4582T.this, min);
                i8 = i7 - min;
            } else {
                i8 = i7;
            }
            if (i8 > 0) {
                byte[] bArr = new byte[512];
                int i10 = 0;
                while (i10 < i8) {
                    int min2 = Math.min(i8 - i10, 512);
                    C4582T.this.f16613a.mo19333Q(bArr, 0, min2);
                    C4582T.this.f16614b.update(bArr, 0, min2);
                    i10 += min2;
                }
            }
            C4582T.m19632m(C4582T.this, i7);
        }

        public /* synthetic */ b(C4582T c4582t, a aVar) {
            this();
        }
    }

    /* renamed from: i5.T$c */
    public enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    /* renamed from: d */
    public static /* synthetic */ int m19628d(C4582T c4582t, int i7) {
        int i8 = c4582t.f16617e + i7;
        c4582t.f16617e = i8;
        return i8;
    }

    /* renamed from: m */
    public static /* synthetic */ int m19632m(C4582T c4582t, int i7) {
        int i8 = c4582t.f16625t + i7;
        c4582t.f16625t = i8;
        return i8;
    }

    /* renamed from: C */
    public final int m19633C(byte[] bArr, int i7, int i8) {
        AbstractC2932o.m10579v(this.f16619n != null, "inflater is null");
        try {
            int totalIn = this.f16619n.getTotalIn();
            int inflate = this.f16619n.inflate(bArr, i7, i8);
            int totalIn2 = this.f16619n.getTotalIn() - totalIn;
            this.f16625t += totalIn2;
            this.f16626u += totalIn2;
            this.f16617e += totalIn2;
            this.f16614b.update(bArr, i7, inflate);
            if (this.f16619n.finished()) {
                this.f16624s = this.f16619n.getBytesWritten() & 4294967295L;
                this.f16620o = c.TRAILER;
            } else if (this.f16619n.needsInput()) {
                this.f16620o = c.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (DataFormatException e7) {
            throw new DataFormatException("Inflater data format exception: " + e7.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007d, code lost:
    
        if (r6.f16620o != p253i5.C4582T.c.f16630a) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
    
        if (r6.f16615c.m19659k() >= 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008b, code lost:
    
        r6.f16627v = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        return r3;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m19634D(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f16621p
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "GzipInflatingBuffer is closed"
            p171Y2.AbstractC2932o.m10579v(r0, r2)
            r0 = 0
            r3 = r0
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L77
            int r4 = r9 - r3
            if (r4 <= 0) goto L77
            int[] r2 = p253i5.C4582T.a.f16628a
            i5.T$c r5 = r6.f16620o
            int r5 = r5.ordinal()
            r2 = r2[r5]
            switch(r2) {
                case 1: goto L72;
                case 2: goto L6d;
                case 3: goto L68;
                case 4: goto L63;
                case 5: goto L5e;
                case 6: goto L59;
                case 7: goto L54;
                case 8: goto L42;
                case 9: goto L3d;
                case 10: goto L38;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid state: "
            r8.append(r9)
            i5.T$c r9 = r6.f16620o
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            boolean r2 = r6.m19643c0()
            goto Lc
        L3d:
            boolean r2 = r6.m19645r()
            goto Lc
        L42:
            int r2 = r8 + r3
            int r2 = r6.m19633C(r7, r2, r4)
            int r3 = r3 + r2
            i5.T$c r2 = r6.f16620o
            i5.T$c r4 = p253i5.C4582T.c.TRAILER
            if (r2 != r4) goto Lb
            boolean r2 = r6.m19643c0()
            goto Lc
        L54:
            boolean r2 = r6.m19635F()
            goto Lc
        L59:
            boolean r2 = r6.m19639N()
            goto Lc
        L5e:
            boolean r2 = r6.m19638M()
            goto Lc
        L63:
            boolean r2 = r6.m19642T()
            goto Lc
        L68:
            boolean r2 = r6.m19640R()
            goto Lc
        L6d:
            boolean r2 = r6.m19641S()
            goto Lc
        L72:
            boolean r2 = r6.m19637K()
            goto Lc
        L77:
            if (r2 == 0) goto L8b
            i5.T$c r7 = r6.f16620o
            i5.T$c r8 = p253i5.C4582T.c.HEADER
            if (r7 != r8) goto L8a
            i5.T$b r7 = r6.f16615c
            int r7 = p253i5.C4582T.b.m19652d(r7)
            r8 = 10
            if (r7 >= r8) goto L8a
            goto L8b
        L8a:
            r1 = r0
        L8b:
            r6.f16627v = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p253i5.C4582T.m19634D(byte[], int, int):int");
    }

    /* renamed from: F */
    public final boolean m19635F() {
        Inflater inflater = this.f16619n;
        if (inflater == null) {
            this.f16619n = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f16614b.reset();
        int i7 = this.f16618f;
        int i8 = this.f16617e;
        int i9 = i7 - i8;
        if (i9 > 0) {
            this.f16619n.setInput(this.f16616d, i8, i9);
            this.f16620o = c.INFLATING;
        } else {
            this.f16620o = c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    /* renamed from: G */
    public boolean m19636G() {
        AbstractC2932o.m10579v(!this.f16621p, "GzipInflatingBuffer is closed");
        return this.f16627v;
    }

    /* renamed from: K */
    public final boolean m19637K() {
        if (this.f16615c.m19659k() < 10) {
            return false;
        }
        if (this.f16615c.m19658j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f16615c.m19656h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f16622q = this.f16615c.m19656h();
        this.f16615c.m19660l(6);
        this.f16620o = c.HEADER_EXTRA_LEN;
        return true;
    }

    /* renamed from: M */
    public final boolean m19638M() {
        if ((this.f16622q & 16) != 16) {
            this.f16620o = c.HEADER_CRC;
            return true;
        }
        if (!this.f16615c.m19655g()) {
            return false;
        }
        this.f16620o = c.HEADER_CRC;
        return true;
    }

    /* renamed from: N */
    public final boolean m19639N() {
        if ((this.f16622q & 2) != 2) {
            this.f16620o = c.INITIALIZE_INFLATER;
            return true;
        }
        if (this.f16615c.m19659k() < 2) {
            return false;
        }
        if ((((int) this.f16614b.getValue()) & 65535) != this.f16615c.m19658j()) {
            throw new ZipException("Corrupt GZIP header");
        }
        this.f16620o = c.INITIALIZE_INFLATER;
        return true;
    }

    /* renamed from: R */
    public final boolean m19640R() {
        int m19659k = this.f16615c.m19659k();
        int i7 = this.f16623r;
        if (m19659k < i7) {
            return false;
        }
        this.f16615c.m19660l(i7);
        this.f16620o = c.HEADER_NAME;
        return true;
    }

    /* renamed from: S */
    public final boolean m19641S() {
        if ((this.f16622q & 4) != 4) {
            this.f16620o = c.HEADER_NAME;
            return true;
        }
        if (this.f16615c.m19659k() < 2) {
            return false;
        }
        this.f16623r = this.f16615c.m19658j();
        this.f16620o = c.HEADER_EXTRA;
        return true;
    }

    /* renamed from: T */
    public final boolean m19642T() {
        if ((this.f16622q & 8) != 8) {
            this.f16620o = c.HEADER_COMMENT;
            return true;
        }
        if (!this.f16615c.m19655g()) {
            return false;
        }
        this.f16620o = c.HEADER_COMMENT;
        return true;
    }

    /* renamed from: c0 */
    public final boolean m19643c0() {
        if (this.f16619n != null && this.f16615c.m19659k() <= 18) {
            this.f16619n.end();
            this.f16619n = null;
        }
        if (this.f16615c.m19659k() < 8) {
            return false;
        }
        if (this.f16614b.getValue() != this.f16615c.m19657i() || this.f16624s != this.f16615c.m19657i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f16614b.reset();
        this.f16620o = c.HEADER;
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f16621p) {
            return;
        }
        this.f16621p = true;
        this.f16613a.close();
        Inflater inflater = this.f16619n;
        if (inflater != null) {
            inflater.end();
            this.f16619n = null;
        }
    }

    /* renamed from: o */
    public void m19644o(InterfaceC4645z0 interfaceC4645z0) {
        AbstractC2932o.m10579v(!this.f16621p, "GzipInflatingBuffer is closed");
        this.f16613a.m20154d(interfaceC4645z0);
        this.f16627v = false;
    }

    /* renamed from: r */
    public final boolean m19645r() {
        AbstractC2932o.m10579v(this.f16619n != null, "inflater is null");
        AbstractC2932o.m10579v(this.f16617e == this.f16618f, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f16613a.mo19335b(), 512);
        if (min == 0) {
            return false;
        }
        this.f16617e = 0;
        this.f16618f = min;
        this.f16613a.mo19333Q(this.f16616d, 0, min);
        this.f16619n.setInput(this.f16616d, this.f16617e, min);
        this.f16620o = c.INFLATING;
        return true;
    }

    /* renamed from: v */
    public int m19646v() {
        int i7 = this.f16625t;
        this.f16625t = 0;
        return i7;
    }

    /* renamed from: w */
    public int m19647w() {
        int i7 = this.f16626u;
        this.f16626u = 0;
        return i7;
    }

    /* renamed from: y */
    public boolean m19648y() {
        AbstractC2932o.m10579v(!this.f16621p, "GzipInflatingBuffer is closed");
        return (this.f16615c.m19659k() == 0 && this.f16620o == c.HEADER) ? false : true;
    }
}

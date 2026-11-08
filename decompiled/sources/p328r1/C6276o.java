package p328r1;

import java.util.Arrays;
import java.util.Collections;
import org.apache.tika.fork.ForkServer;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5356y;
import p259j0.C5357z;
import p268k0.AbstractC5400d;
import p328r1.InterfaceC6259K;

/* renamed from: r1.o */
/* loaded from: classes.dex */
public final class C6276o implements InterfaceC6274m {

    /* renamed from: l */
    public static final float[] f22589l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final C6261M f22590a;

    /* renamed from: b */
    public final C5357z f22591b;

    /* renamed from: e */
    public final C6284w f22594e;

    /* renamed from: f */
    public b f22595f;

    /* renamed from: g */
    public long f22596g;

    /* renamed from: h */
    public String f22597h;

    /* renamed from: i */
    public InterfaceC0861T f22598i;

    /* renamed from: j */
    public boolean f22599j;

    /* renamed from: c */
    public final boolean[] f22592c = new boolean[4];

    /* renamed from: d */
    public final a f22593d = new a(128);

    /* renamed from: k */
    public long f22600k = -9223372036854775807L;

    /* renamed from: r1.o$a */
    public static final class a {

        /* renamed from: f */
        public static final byte[] f22601f = {0, 0, 1};

        /* renamed from: a */
        public boolean f22602a;

        /* renamed from: b */
        public int f22603b;

        /* renamed from: c */
        public int f22604c;

        /* renamed from: d */
        public int f22605d;

        /* renamed from: e */
        public byte[] f22606e;

        public a(int i7) {
            this.f22606e = new byte[i7];
        }

        /* renamed from: a */
        public void m26240a(byte[] bArr, int i7, int i8) {
            if (this.f22602a) {
                int i9 = i8 - i7;
                byte[] bArr2 = this.f22606e;
                int length = bArr2.length;
                int i10 = this.f22604c;
                if (length < i10 + i9) {
                    this.f22606e = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i7, this.f22606e, this.f22604c, i9);
                this.f22604c += i9;
            }
        }

        /* renamed from: b */
        public boolean m26241b(int i7, int i8) {
            int i9 = this.f22603b;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i7 == 179 || i7 == 181) {
                                this.f22604c -= i8;
                                this.f22602a = false;
                                return true;
                            }
                        } else if ((i7 & 240) != 32) {
                            AbstractC5346o.m21867h("H263Reader", "Unexpected start code value");
                            m26242c();
                        } else {
                            this.f22605d = this.f22604c;
                            this.f22603b = 4;
                        }
                    } else if (i7 > 31) {
                        AbstractC5346o.m21867h("H263Reader", "Unexpected start code value");
                        m26242c();
                    } else {
                        this.f22603b = 3;
                    }
                } else if (i7 != 181) {
                    AbstractC5346o.m21867h("H263Reader", "Unexpected start code value");
                    m26242c();
                } else {
                    this.f22603b = 2;
                }
            } else if (i7 == 176) {
                this.f22603b = 1;
                this.f22602a = true;
            }
            byte[] bArr = f22601f;
            m26240a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m26242c() {
            this.f22602a = false;
            this.f22604c = 0;
            this.f22603b = 0;
        }
    }

    /* renamed from: r1.o$b */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC0861T f22607a;

        /* renamed from: b */
        public boolean f22608b;

        /* renamed from: c */
        public boolean f22609c;

        /* renamed from: d */
        public boolean f22610d;

        /* renamed from: e */
        public int f22611e;

        /* renamed from: f */
        public int f22612f;

        /* renamed from: g */
        public long f22613g;

        /* renamed from: h */
        public long f22614h;

        public b(InterfaceC0861T interfaceC0861T) {
            this.f22607a = interfaceC0861T;
        }

        /* renamed from: a */
        public void m26243a(byte[] bArr, int i7, int i8) {
            if (this.f22609c) {
                int i9 = this.f22612f;
                int i10 = (i7 + 1) - i9;
                if (i10 >= i8) {
                    this.f22612f = i9 + (i8 - i7);
                } else {
                    this.f22610d = ((bArr[i10] & 192) >> 6) == 0;
                    this.f22609c = false;
                }
            }
        }

        /* renamed from: b */
        public void m26244b(long j7, int i7, boolean z6) {
            AbstractC5332a.m21802g(this.f22614h != -9223372036854775807L);
            if (this.f22611e == 182 && z6 && this.f22608b) {
                this.f22607a.mo562c(this.f22614h, this.f22610d ? 1 : 0, (int) (j7 - this.f22613g), i7, null);
            }
            if (this.f22611e != 179) {
                this.f22613g = j7;
            }
        }

        /* renamed from: c */
        public void m26245c(int i7, long j7) {
            this.f22611e = i7;
            this.f22610d = false;
            this.f22608b = i7 == 182 || i7 == 179;
            this.f22609c = i7 == 182;
            this.f22612f = 0;
            this.f22614h = j7;
        }

        /* renamed from: d */
        public void m26246d() {
            this.f22608b = false;
            this.f22609c = false;
            this.f22610d = false;
            this.f22611e = -1;
        }
    }

    public C6276o(C6261M c6261m) {
        this.f22590a = c6261m;
        if (c6261m != null) {
            this.f22594e = new C6284w(178, 128);
            this.f22591b = new C5357z();
        } else {
            this.f22594e = null;
            this.f22591b = null;
        }
    }

    /* renamed from: f */
    public static C4327q m26239f(a aVar, int i7, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f22606e, aVar.f22604c);
        C5356y c5356y = new C5356y(copyOf);
        c5356y.m21919s(i7);
        c5356y.m21919s(4);
        c5356y.m21917q();
        c5356y.m21918r(8);
        if (c5356y.m21907g()) {
            c5356y.m21918r(4);
            c5356y.m21918r(3);
        }
        int m21908h = c5356y.m21908h(4);
        float f7 = 1.0f;
        if (m21908h == 15) {
            int m21908h2 = c5356y.m21908h(8);
            int m21908h3 = c5356y.m21908h(8);
            if (m21908h3 == 0) {
                AbstractC5346o.m21867h("H263Reader", "Invalid aspect ratio");
            } else {
                f7 = m21908h2 / m21908h3;
            }
        } else {
            float[] fArr = f22589l;
            if (m21908h < fArr.length) {
                f7 = fArr[m21908h];
            } else {
                AbstractC5346o.m21867h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c5356y.m21907g()) {
            c5356y.m21918r(2);
            c5356y.m21918r(1);
            if (c5356y.m21907g()) {
                c5356y.m21918r(15);
                c5356y.m21917q();
                c5356y.m21918r(15);
                c5356y.m21917q();
                c5356y.m21918r(15);
                c5356y.m21917q();
                c5356y.m21918r(3);
                c5356y.m21918r(11);
                c5356y.m21917q();
                c5356y.m21918r(15);
                c5356y.m21917q();
            }
        }
        if (c5356y.m21908h(2) != 0) {
            AbstractC5346o.m21867h("H263Reader", "Unhandled video object layer shape");
        }
        c5356y.m21917q();
        int m21908h4 = c5356y.m21908h(16);
        c5356y.m21917q();
        if (c5356y.m21907g()) {
            if (m21908h4 == 0) {
                AbstractC5346o.m21867h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i8 = 0;
                for (int i9 = m21908h4 - 1; i9 > 0; i9 >>= 1) {
                    i8++;
                }
                c5356y.m21918r(i8);
            }
        }
        c5356y.m21917q();
        int m21908h5 = c5356y.m21908h(13);
        c5356y.m21917q();
        int m21908h6 = c5356y.m21908h(13);
        c5356y.m21917q();
        c5356y.m21917q();
        return new C4327q.b().m18250a0(str).m18264o0("video/mp4v-es").m18271v0(m21908h5).m18248Y(m21908h6).m18260k0(f7).m18251b0(Collections.singletonList(copyOf)).m18234K();
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    public void mo26186a(C5357z c5357z) {
        AbstractC5332a.m21804i(this.f22595f);
        AbstractC5332a.m21804i(this.f22598i);
        int m21947f = c5357z.m21947f();
        int m21948g = c5357z.m21948g();
        byte[] m21946e = c5357z.m21946e();
        this.f22596g += c5357z.m21942a();
        this.f22598i.mo564d(c5357z, c5357z.m21942a());
        while (true) {
            int m22318c = AbstractC5400d.m22318c(m21946e, m21947f, m21948g, this.f22592c);
            if (m22318c == m21948g) {
                break;
            }
            int i7 = m22318c + 3;
            int i8 = c5357z.m21946e()[i7] & ForkServer.ERROR;
            int i9 = m22318c - m21947f;
            int i10 = 0;
            if (!this.f22599j) {
                if (i9 > 0) {
                    this.f22593d.m26240a(m21946e, m21947f, m22318c);
                }
                if (this.f22593d.m26241b(i8, i9 < 0 ? -i9 : 0)) {
                    InterfaceC0861T interfaceC0861T = this.f22598i;
                    a aVar = this.f22593d;
                    interfaceC0861T.mo566e(m26239f(aVar, aVar.f22605d, (String) AbstractC5332a.m21800e(this.f22597h)));
                    this.f22599j = true;
                }
            }
            this.f22595f.m26243a(m21946e, m21947f, m22318c);
            C6284w c6284w = this.f22594e;
            if (c6284w != null) {
                if (i9 > 0) {
                    c6284w.m26314a(m21946e, m21947f, m22318c);
                } else {
                    i10 = -i9;
                }
                if (this.f22594e.m26315b(i10)) {
                    C6284w c6284w2 = this.f22594e;
                    ((C5357z) AbstractC5330M.m21747i(this.f22591b)).m21937R(this.f22594e.f22764d, AbstractC5400d.m22333r(c6284w2.f22764d, c6284w2.f22765e));
                    ((C6261M) AbstractC5330M.m21747i(this.f22590a)).m26182a(this.f22600k, this.f22591b);
                }
                if (i8 == 178 && c5357z.m21946e()[m22318c + 2] == 1) {
                    this.f22594e.m26318e(i8);
                }
            }
            int i11 = m21948g - m22318c;
            this.f22595f.m26244b(this.f22596g - i11, i11, this.f22599j);
            this.f22595f.m26245c(i8, this.f22600k);
            m21947f = i7;
        }
        if (!this.f22599j) {
            this.f22593d.m26240a(m21946e, m21947f, m21948g);
        }
        this.f22595f.m26243a(m21946e, m21947f, m21948g);
        C6284w c6284w3 = this.f22594e;
        if (c6284w3 != null) {
            c6284w3.m26314a(m21946e, m21947f, m21948g);
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        AbstractC5400d.m22316a(this.f22592c);
        this.f22593d.m26242c();
        b bVar = this.f22595f;
        if (bVar != null) {
            bVar.m26246d();
        }
        C6284w c6284w = this.f22594e;
        if (c6284w != null) {
            c6284w.m26317d();
        }
        this.f22596g = 0L;
        this.f22600k = -9223372036854775807L;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22597h = dVar.m26175b();
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(dVar.m26176c(), 2);
        this.f22598i = mo455b;
        this.f22595f = new b(mo455b);
        C6261M c6261m = this.f22590a;
        if (c6261m != null) {
            c6261m.m26183b(interfaceC0885t, dVar);
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
        AbstractC5332a.m21804i(this.f22595f);
        if (z6) {
            this.f22595f.m26244b(this.f22596g, 0, this.f22599j);
            this.f22595f.m26246d();
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22600k = j7;
    }
}

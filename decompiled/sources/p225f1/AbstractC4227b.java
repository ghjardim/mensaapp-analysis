package p225f1;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p078L0.AbstractC0853K;
import p078L0.AbstractC0864W;
import p078L0.AbstractC0866a;
import p078L0.AbstractC0867b;
import p078L0.AbstractC0868c;
import p078L0.AbstractC0886u;
import p078L0.C0847E;
import p078L0.C0848F;
import p078L0.C0869d;
import p078L0.C0880o;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3577g;
import p225f1.AbstractC4226a;
import p232g0.AbstractC4336z;
import p232g0.C4295A;
import p232g0.C4318h;
import p232g0.C4323m;
import p232g0.C4327q;
import p232g0.C4334x;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5335d;
import p259j0.AbstractC5346o;
import p259j0.C5356y;
import p259j0.C5357z;
import p268k0.C5397a;
import p268k0.C5398b;
import p268k0.C5399c;

/* renamed from: f1.b */
/* loaded from: classes.dex */
public abstract class AbstractC4227b {

    /* renamed from: a */
    public static final byte[] f14448a = AbstractC5330M.m21773s0("OpusHead");

    /* renamed from: f1.b$a */
    public static final class a {

        /* renamed from: a */
        public final int f14449a;

        /* renamed from: b */
        public int f14450b;

        /* renamed from: c */
        public int f14451c;

        /* renamed from: d */
        public long f14452d;

        /* renamed from: e */
        public final boolean f14453e;

        /* renamed from: f */
        public final C5357z f14454f;

        /* renamed from: g */
        public final C5357z f14455g;

        /* renamed from: h */
        public int f14456h;

        /* renamed from: i */
        public int f14457i;

        public a(C5357z c5357z, C5357z c5357z2, boolean z6) {
            this.f14455g = c5357z;
            this.f14454f = c5357z2;
            this.f14453e = z6;
            c5357z2.m21939T(12);
            this.f14449a = c5357z2.m21930K();
            c5357z.m21939T(12);
            this.f14457i = c5357z.m21930K();
            AbstractC0886u.m3689a(c5357z.m21957p() == 1, "first_chunk must be 1");
            this.f14450b = -1;
        }

        /* renamed from: a */
        public boolean m17703a() {
            int i7 = this.f14450b + 1;
            this.f14450b = i7;
            if (i7 == this.f14449a) {
                return false;
            }
            this.f14452d = this.f14453e ? this.f14454f.m21931L() : this.f14454f.m21928I();
            if (this.f14450b == this.f14456h) {
                this.f14451c = this.f14455g.m21930K();
                this.f14455g.m21940U(4);
                int i8 = this.f14457i - 1;
                this.f14457i = i8;
                this.f14456h = i8 > 0 ? this.f14455g.m21930K() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: f1.b$b */
    public static final class b {

        /* renamed from: a */
        public final String f14458a;

        /* renamed from: b */
        public final byte[] f14459b;

        /* renamed from: c */
        public final long f14460c;

        /* renamed from: d */
        public final long f14461d;

        public b(String str, byte[] bArr, long j7, long j8) {
            this.f14458a = str;
            this.f14459b = bArr;
            this.f14460c = j7;
            this.f14461d = j8;
        }
    }

    /* renamed from: f1.b$c */
    public interface c {
        /* renamed from: a */
        int mo17708a();

        /* renamed from: b */
        int mo17709b();

        /* renamed from: c */
        int mo17710c();
    }

    /* renamed from: f1.b$d */
    public static final class d {

        /* renamed from: a */
        public final C4245t[] f14462a;

        /* renamed from: b */
        public C4327q f14463b;

        /* renamed from: c */
        public int f14464c;

        /* renamed from: d */
        public int f14465d = 0;

        public d(int i7) {
            this.f14462a = new C4245t[i7];
        }
    }

    /* renamed from: f1.b$e */
    public static final class e implements c {

        /* renamed from: a */
        public final int f14466a;

        /* renamed from: b */
        public final int f14467b;

        /* renamed from: c */
        public final C5357z f14468c;

        public e(AbstractC4226a.b bVar, C4327q c4327q) {
            C5357z c5357z = bVar.f14447b;
            this.f14468c = c5357z;
            c5357z.m21939T(12);
            int m21930K = c5357z.m21930K();
            if ("audio/raw".equals(c4327q.f15138n)) {
                int m21748i0 = AbstractC5330M.m21748i0(c4327q.f15116D, c4327q.f15114B);
                if (m21930K == 0 || m21930K % m21748i0 != 0) {
                    AbstractC5346o.m21867h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + m21748i0 + ", stsz sample size: " + m21930K);
                    m21930K = m21748i0;
                }
            }
            this.f14466a = m21930K == 0 ? -1 : m21930K;
            this.f14467b = c5357z.m21930K();
        }

        @Override // p225f1.AbstractC4227b.c
        /* renamed from: a */
        public int mo17708a() {
            return this.f14466a;
        }

        @Override // p225f1.AbstractC4227b.c
        /* renamed from: b */
        public int mo17709b() {
            return this.f14467b;
        }

        @Override // p225f1.AbstractC4227b.c
        /* renamed from: c */
        public int mo17710c() {
            int i7 = this.f14466a;
            return i7 == -1 ? this.f14468c.m21930K() : i7;
        }
    }

    /* renamed from: f1.b$f */
    public static final class f implements c {

        /* renamed from: a */
        public final C5357z f14469a;

        /* renamed from: b */
        public final int f14470b;

        /* renamed from: c */
        public final int f14471c;

        /* renamed from: d */
        public int f14472d;

        /* renamed from: e */
        public int f14473e;

        public f(AbstractC4226a.b bVar) {
            C5357z c5357z = bVar.f14447b;
            this.f14469a = c5357z;
            c5357z.m21939T(12);
            this.f14471c = c5357z.m21930K() & 255;
            this.f14470b = c5357z.m21930K();
        }

        @Override // p225f1.AbstractC4227b.c
        /* renamed from: a */
        public int mo17708a() {
            return -1;
        }

        @Override // p225f1.AbstractC4227b.c
        /* renamed from: b */
        public int mo17709b() {
            return this.f14470b;
        }

        @Override // p225f1.AbstractC4227b.c
        /* renamed from: c */
        public int mo17710c() {
            int i7 = this.f14471c;
            if (i7 == 8) {
                return this.f14469a.m21926G();
            }
            if (i7 == 16) {
                return this.f14469a.m21932M();
            }
            int i8 = this.f14472d;
            this.f14472d = i8 + 1;
            if (i8 % 2 != 0) {
                return this.f14473e & 15;
            }
            int m21926G = this.f14469a.m21926G();
            this.f14473e = m21926G;
            return (m21926G & 240) >> 4;
        }
    }

    /* renamed from: f1.b$g */
    public static final class g {

        /* renamed from: a */
        public final int f14474a;

        /* renamed from: b */
        public final long f14475b;

        /* renamed from: c */
        public final int f14476c;

        public g(int i7, long j7, int i8) {
            this.f14474a = i7;
            this.f14475b = j7;
            this.f14476c = i8;
        }
    }

    /* renamed from: A */
    public static C4244s m17671A(AbstractC4226a.a aVar, AbstractC4226a.b bVar, long j7, C4323m c4323m, boolean z6, boolean z7) {
        AbstractC4226a.b bVar2;
        long j8;
        long[] jArr;
        long[] jArr2;
        AbstractC4226a.a m17669f;
        Pair m17686j;
        AbstractC4226a.a aVar2 = (AbstractC4226a.a) AbstractC5332a.m21800e(aVar.m17669f(1835297121));
        int m17681e = m17681e(m17689m(((AbstractC4226a.b) AbstractC5332a.m21800e(aVar2.m17670g(1751411826))).f14447b));
        if (m17681e == -1) {
            return null;
        }
        g m17702z = m17702z(((AbstractC4226a.b) AbstractC5332a.m21800e(aVar.m17670g(1953196132))).f14447b);
        if (j7 == -9223372036854775807L) {
            bVar2 = bVar;
            j8 = m17702z.f14475b;
        } else {
            bVar2 = bVar;
            j8 = j7;
        }
        long j9 = m17694r(bVar2.f14447b).f19245c;
        long m21718X0 = j8 != -9223372036854775807L ? AbstractC5330M.m21718X0(j8, 1000000L, j9) : -9223372036854775807L;
        AbstractC4226a.a aVar3 = (AbstractC4226a.a) AbstractC5332a.m21800e(((AbstractC4226a.a) AbstractC5332a.m21800e(aVar2.m17669f(1835626086))).m17669f(1937007212));
        Pair m17691o = m17691o(((AbstractC4226a.b) AbstractC5332a.m21800e(aVar2.m17670g(1835296868))).f14447b);
        AbstractC4226a.b m17670g = aVar3.m17670g(1937011556);
        if (m17670g == null) {
            throw C4295A.m17943a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d m17700x = m17700x(m17670g.f14447b, m17702z.f14474a, m17702z.f14476c, (String) m17691o.second, c4323m, z7);
        if (z6 || (m17669f = aVar.m17669f(1701082227)) == null || (m17686j = m17686j(m17669f)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) m17686j.first;
            jArr2 = (long[]) m17686j.second;
            jArr = jArr3;
        }
        if (m17700x.f14463b == null) {
            return null;
        }
        return new C4244s(m17702z.f14474a, m17681e, ((Long) m17691o.first).longValue(), j9, m21718X0, m17700x.f14463b, m17700x.f14465d, m17700x.f14462a, m17700x.f14464c, jArr, jArr2);
    }

    /* renamed from: B */
    public static List m17672B(AbstractC4226a.a aVar, C0847E c0847e, long j7, C4323m c4323m, boolean z6, boolean z7, InterfaceC2924g interfaceC2924g) {
        C4244s c4244s;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < aVar.f14446d.size(); i7++) {
            AbstractC4226a.a aVar2 = (AbstractC4226a.a) aVar.f14446d.get(i7);
            if (aVar2.f14443a == 1953653099 && (c4244s = (C4244s) interfaceC2924g.apply(m17671A(aVar2, (AbstractC4226a.b) AbstractC5332a.m21800e(aVar.m17670g(1836476516)), j7, c4323m, z6, z7))) != null) {
                arrayList.add(m17699w(c4244s, (AbstractC4226a.a) AbstractC5332a.m21800e(((AbstractC4226a.a) AbstractC5332a.m21800e(((AbstractC4226a.a) AbstractC5332a.m21800e(aVar2.m17669f(1835297121))).m17669f(1835626086))).m17669f(1937007212)), c0847e));
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public static C4334x m17673C(AbstractC4226a.b bVar) {
        C5357z c5357z = bVar.f14447b;
        c5357z.m21939T(8);
        C4334x c4334x = new C4334x(new C4334x.b[0]);
        while (c5357z.m21942a() >= 8) {
            int m21947f = c5357z.m21947f();
            int m21957p = c5357z.m21957p();
            int m21957p2 = c5357z.m21957p();
            if (m21957p2 == 1835365473) {
                c5357z.m21939T(m21947f);
                c4334x = c4334x.m18399b(m17674D(c5357z, m21947f + m21957p));
            } else if (m21957p2 == 1936553057) {
                c5357z.m21939T(m21947f);
                c4334x = c4334x.m18399b(AbstractC4242q.m17820b(c5357z, m21947f + m21957p));
            } else if (m21957p2 == -1451722374) {
                c4334x = c4334x.m18399b(m17676F(c5357z));
            }
            c5357z.m21939T(m21947f + m21957p);
        }
        return c4334x;
    }

    /* renamed from: D */
    public static C4334x m17674D(C5357z c5357z, int i7) {
        c5357z.m21940U(8);
        m17682f(c5357z);
        while (c5357z.m21947f() < i7) {
            int m21947f = c5357z.m21947f();
            int m21957p = c5357z.m21957p();
            if (c5357z.m21957p() == 1768715124) {
                c5357z.m21939T(m21947f);
                return m17690n(c5357z, m21947f + m21957p);
            }
            c5357z.m21939T(m21947f + m21957p);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.util.List] */
    /* renamed from: E */
    public static void m17675E(C5357z c5357z, int i7, int i8, int i9, int i10, int i11, C4323m c4323m, d dVar, int i12) {
        C4323m c4323m2;
        int i13;
        String str;
        float f7;
        int i14;
        int i15;
        int i16;
        int i17 = i8;
        int i18 = i9;
        C4323m c4323m3 = c4323m;
        d dVar2 = dVar;
        c5357z.m21939T(i17 + 16);
        c5357z.m21940U(16);
        int m21932M = c5357z.m21932M();
        int m21932M2 = c5357z.m21932M();
        c5357z.m21940U(50);
        int m21947f = c5357z.m21947f();
        int i19 = i7;
        if (i19 == 1701733238) {
            Pair m17697u = m17697u(c5357z, i17, i18);
            if (m17697u != null) {
                i19 = ((Integer) m17697u.first).intValue();
                c4323m3 = c4323m3 == null ? null : c4323m3.m18168c(((C4245t) m17697u.second).f14607b);
                dVar2.f14462a[i12] = (C4245t) m17697u.second;
            }
            c5357z.m21939T(m21947f);
        }
        String str2 = "video/3gpp";
        String str3 = i19 == 1831958048 ? "video/mpeg" : i19 == 1211250227 ? "video/3gpp" : null;
        float f8 = 1.0f;
        int i20 = 8;
        int i21 = 8;
        AbstractC3033v abstractC3033v = null;
        String str4 = null;
        byte[] bArr = null;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        ByteBuffer byteBuffer = null;
        b bVar = null;
        boolean z6 = false;
        while (m21947f - i17 < i18) {
            c5357z.m21939T(m21947f);
            int m21947f2 = c5357z.m21947f();
            int m21957p = c5357z.m21957p();
            if (m21957p == 0 && c5357z.m21947f() - i17 == i18) {
                break;
            }
            AbstractC0886u.m3689a(m21957p > 0, "childAtomSize must be positive");
            int m21957p2 = c5357z.m21957p();
            if (m21957p2 == 1635148611) {
                AbstractC0886u.m3689a(str3 == null, null);
                c5357z.m21939T(m21947f2 + 8);
                C0869d m3606b = C0869d.m3606b(c5357z);
                ?? r8 = m3606b.f3008a;
                dVar2.f14464c = m3606b.f3009b;
                if (!z6) {
                    f8 = m3606b.f3018k;
                }
                String str5 = m3606b.f3019l;
                int i27 = m3606b.f3017j;
                int i28 = m3606b.f3014g;
                int i29 = m3606b.f3015h;
                int i30 = m3606b.f3016i;
                int i31 = m3606b.f3012e;
                c4323m2 = c4323m3;
                i13 = i19;
                str = str2;
                i23 = i27;
                i24 = i28;
                i25 = i29;
                i26 = i30;
                i21 = m3606b.f3013f;
                i20 = i31;
                abstractC3033v = r8;
                str3 = "video/avc";
                str4 = str5;
            } else if (m21957p2 == 1752589123) {
                AbstractC0886u.m3689a(str3 == null, null);
                c5357z.m21939T(m21947f2 + 8);
                C0848F m3526a = C0848F.m3526a(c5357z);
                ?? r22 = m3526a.f2904a;
                dVar2.f14464c = m3526a.f2905b;
                if (!z6) {
                    f8 = m3526a.f2913j;
                }
                int i32 = m3526a.f2914k;
                String str6 = m3526a.f2915l;
                c4323m2 = c4323m3;
                i23 = i32;
                i13 = i19;
                str = str2;
                i24 = m3526a.f2910g;
                i25 = m3526a.f2911h;
                i26 = m3526a.f2912i;
                str3 = "video/hevc";
                i20 = m3526a.f2908e;
                str4 = str6;
                abstractC3033v = r22;
                i21 = m3526a.f2909f;
            } else {
                if (m21957p2 == 1685480259 || m21957p2 == 1685485123) {
                    c4323m2 = c4323m3;
                    i13 = i19;
                    str = str2;
                    f7 = f8;
                    i14 = i20;
                    i15 = i24;
                    i16 = i26;
                    C0880o m3673a = C0880o.m3673a(c5357z);
                    if (m3673a != null) {
                        str4 = m3673a.f3088c;
                        str3 = "video/dolby-vision";
                    }
                } else if (m21957p2 == 1987076931) {
                    AbstractC0886u.m3689a(str3 == null, null);
                    String str7 = i19 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    c5357z.m21939T(m21947f2 + 12);
                    c5357z.m21940U(2);
                    int m21926G = c5357z.m21926G();
                    int i33 = m21926G >> 4;
                    boolean z7 = (m21926G & 1) != 0;
                    int m21926G2 = c5357z.m21926G();
                    int m21926G3 = c5357z.m21926G();
                    i24 = C4318h.m18143j(m21926G2);
                    i25 = z7 ? 1 : 2;
                    i26 = C4318h.m18144k(m21926G3);
                    c4323m2 = c4323m3;
                    i20 = i33;
                    i21 = i20;
                    i13 = i19;
                    str = str2;
                    str3 = str7;
                } else if (m21957p2 == 1635135811) {
                    int i34 = m21957p - 8;
                    byte[] bArr2 = new byte[i34];
                    c5357z.m21953l(bArr2, 0, i34);
                    abstractC3033v = AbstractC3033v.m11051u(bArr2);
                    c5357z.m21939T(m21947f2 + 8);
                    C4318h m17684h = m17684h(c5357z);
                    int i35 = m17684h.f15044e;
                    int i36 = m17684h.f15045f;
                    int i37 = m17684h.f15040a;
                    int i38 = m17684h.f15041b;
                    i26 = m17684h.f15042c;
                    c4323m2 = c4323m3;
                    i13 = i19;
                    str = str2;
                    i24 = i37;
                    i25 = i38;
                    str3 = "video/av01";
                    i20 = i35;
                    i21 = i36;
                } else if (m21957p2 == 1668050025) {
                    if (byteBuffer == null) {
                        byteBuffer = m17677a();
                    }
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(c5357z.m21922C());
                    byteBuffer2.putShort(c5357z.m21922C());
                    byteBuffer = byteBuffer2;
                    c4323m2 = c4323m3;
                    i13 = i19;
                    str = str2;
                } else if (m21957p2 == 1835295606) {
                    if (byteBuffer == null) {
                        byteBuffer = m17677a();
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    short m21922C = c5357z.m21922C();
                    short m21922C2 = c5357z.m21922C();
                    short m21922C3 = c5357z.m21922C();
                    i13 = i19;
                    short m21922C4 = c5357z.m21922C();
                    str = str2;
                    short m21922C5 = c5357z.m21922C();
                    short m21922C6 = c5357z.m21922C();
                    int i39 = i20;
                    short m21922C7 = c5357z.m21922C();
                    c4323m2 = c4323m3;
                    short m21922C8 = c5357z.m21922C();
                    long m21928I = c5357z.m21928I();
                    long m21928I2 = c5357z.m21928I();
                    byteBuffer3.position(1);
                    byteBuffer3.putShort(m21922C5);
                    byteBuffer3.putShort(m21922C6);
                    byteBuffer3.putShort(m21922C);
                    byteBuffer3.putShort(m21922C2);
                    byteBuffer3.putShort(m21922C3);
                    byteBuffer3.putShort(m21922C4);
                    byteBuffer3.putShort(m21922C7);
                    byteBuffer3.putShort(m21922C8);
                    byteBuffer3.putShort((short) (m21928I / 10000));
                    byteBuffer3.putShort((short) (m21928I2 / 10000));
                    byteBuffer = byteBuffer3;
                    i20 = i39;
                    f8 = f8;
                } else {
                    c4323m2 = c4323m3;
                    i13 = i19;
                    str = str2;
                    f7 = f8;
                    i14 = i20;
                    if (m21957p2 == 1681012275) {
                        AbstractC0886u.m3689a(str3 == null, null);
                        str3 = str;
                    } else if (m21957p2 == 1702061171) {
                        AbstractC0886u.m3689a(str3 == null, null);
                        bVar = m17687k(c5357z, m21947f2);
                        String str8 = bVar.f14458a;
                        byte[] bArr3 = bVar.f14459b;
                        if (bArr3 != null) {
                            abstractC3033v = AbstractC3033v.m11051u(bArr3);
                        }
                        str3 = str8;
                    } else if (m21957p2 == 1885434736) {
                        f8 = m17695s(c5357z, m21947f2);
                        i20 = i14;
                        z6 = true;
                    } else if (m21957p2 == 1937126244) {
                        bArr = m17696t(c5357z, m21947f2, m21957p);
                    } else if (m21957p2 == 1936995172) {
                        int m21926G4 = c5357z.m21926G();
                        c5357z.m21940U(3);
                        if (m21926G4 == 0) {
                            int m21926G5 = c5357z.m21926G();
                            if (m21926G5 == 0) {
                                i22 = 0;
                            } else if (m21926G5 == 1) {
                                i22 = 1;
                            } else if (m21926G5 == 2) {
                                i22 = 2;
                            } else if (m21926G5 == 3) {
                                i22 = 3;
                            }
                        }
                    } else if (m21957p2 == 1668246642) {
                        i15 = i24;
                        i16 = i26;
                        if (i15 == -1 && i16 == -1) {
                            int m21957p3 = c5357z.m21957p();
                            if (m21957p3 == 1852009592 || m21957p3 == 1852009571) {
                                int m21932M3 = c5357z.m21932M();
                                int m21932M4 = c5357z.m21932M();
                                c5357z.m21940U(2);
                                boolean z8 = m21957p == 19 && (c5357z.m21926G() & 128) != 0;
                                i24 = C4318h.m18143j(m21932M3);
                                i25 = z8 ? 1 : 2;
                                i26 = C4318h.m18144k(m21932M4);
                                i20 = i14;
                                f8 = f7;
                            } else {
                                AbstractC5346o.m21867h("AtomParsers", "Unsupported color type: " + AbstractC4226a.m17664a(m21957p3));
                            }
                        }
                    } else {
                        i15 = i24;
                        i16 = i26;
                    }
                    i20 = i14;
                    f8 = f7;
                }
                i24 = i15;
                i26 = i16;
                i20 = i14;
                f8 = f7;
            }
            m21947f += m21957p;
            i17 = i8;
            i18 = i9;
            dVar2 = dVar;
            i19 = i13;
            str2 = str;
            c4323m3 = c4323m2;
        }
        C4323m c4323m4 = c4323m3;
        float f9 = f8;
        int i40 = i20;
        int i41 = i24;
        int i42 = i26;
        if (str3 == null) {
            return;
        }
        C4327q.b m18239P = new C4327q.b().m18249Z(i10).m18264o0(str3).m18238O(str4).m18271v0(m21932M).m18248Y(m21932M2).m18260k0(f9).m18263n0(i11).m18261l0(bArr).m18267r0(i22).m18251b0(abstractC3033v).m18256g0(i23).m18244U(c4323m4).m18239P(new C4318h.b().m18154d(i41).m18153c(i25).m18155e(i42).m18156f(byteBuffer != null ? byteBuffer.array() : null).m18157g(i40).m18152b(i21).m18151a());
        if (bVar != null) {
            m18239P.m18236M(AbstractC3577g.m14430m(bVar.f14460c)).m18259j0(AbstractC3577g.m14430m(bVar.f14461d));
        }
        dVar.f14463b = m18239P.m18234K();
    }

    /* renamed from: F */
    public static C4334x m17676F(C5357z c5357z) {
        short m21922C = c5357z.m21922C();
        c5357z.m21940U(2);
        String m21923D = c5357z.m21923D(m21922C);
        int max = Math.max(m21923D.lastIndexOf(43), m21923D.lastIndexOf(45));
        try {
            return new C4334x(new C5398b(Float.parseFloat(m21923D.substring(0, max)), Float.parseFloat(m21923D.substring(max, m21923D.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m17677a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: b */
    public static boolean m17678b(long[] jArr, long j7, long j8, long j9) {
        int length = jArr.length - 1;
        return jArr[0] <= j8 && j8 < jArr[AbstractC5330M.m21766p(4, 0, length)] && jArr[AbstractC5330M.m21766p(jArr.length - 4, 0, length)] < j9 && j9 <= j7;
    }

    /* renamed from: c */
    public static boolean m17679c(int i7) {
        return i7 != 1;
    }

    /* renamed from: d */
    public static int m17680d(C5357z c5357z, int i7, int i8, int i9) {
        int m21947f = c5357z.m21947f();
        AbstractC0886u.m3689a(m21947f >= i8, null);
        while (m21947f - i8 < i9) {
            c5357z.m21939T(m21947f);
            int m21957p = c5357z.m21957p();
            AbstractC0886u.m3689a(m21957p > 0, "childAtomSize must be positive");
            if (c5357z.m21957p() == i7) {
                return m21947f;
            }
            m21947f += m21957p;
        }
        return -1;
    }

    /* renamed from: e */
    public static int m17681e(int i7) {
        if (i7 == 1936684398) {
            return 1;
        }
        if (i7 == 1986618469) {
            return 2;
        }
        if (i7 == 1952807028 || i7 == 1935832172 || i7 == 1937072756 || i7 == 1668047728) {
            return 3;
        }
        return i7 == 1835365473 ? 5 : -1;
    }

    /* renamed from: f */
    public static void m17682f(C5357z c5357z) {
        int m21947f = c5357z.m21947f();
        c5357z.m21940U(4);
        if (c5357z.m21957p() != 1751411826) {
            m21947f += 4;
        }
        c5357z.m21939T(m21947f);
    }

    /* renamed from: g */
    public static void m17683g(C5357z c5357z, int i7, int i8, int i9, int i10, String str, boolean z6, C4323m c4323m, d dVar, int i11) {
        int i12;
        int m21932M;
        int m21927H;
        int m21957p;
        int i13;
        String str2;
        String str3;
        char c7;
        char c8;
        int i14;
        int i15 = i8;
        int i16 = i9;
        C4323m c4323m2 = c4323m;
        c5357z.m21939T(i15 + 16);
        if (z6) {
            i12 = c5357z.m21932M();
            c5357z.m21940U(6);
        } else {
            c5357z.m21940U(8);
            i12 = 0;
        }
        if (i12 == 0 || i12 == 1) {
            m21932M = c5357z.m21932M();
            c5357z.m21940U(6);
            m21927H = c5357z.m21927H();
            c5357z.m21939T(c5357z.m21947f() - 4);
            m21957p = c5357z.m21957p();
            if (i12 == 1) {
                c5357z.m21940U(16);
            }
            i13 = -1;
        } else {
            if (i12 != 2) {
                return;
            }
            c5357z.m21940U(16);
            m21927H = (int) Math.round(c5357z.m21956o());
            m21932M = c5357z.m21930K();
            c5357z.m21940U(4);
            int m21930K = c5357z.m21930K();
            int m21930K2 = c5357z.m21930K();
            boolean z7 = (m21930K2 & 1) != 0;
            boolean z8 = (m21930K2 & 2) != 0;
            if (z7) {
                if (m21930K == 32) {
                    i13 = 4;
                    c5357z.m21940U(8);
                    m21957p = 0;
                }
                i13 = -1;
                c5357z.m21940U(8);
                m21957p = 0;
            } else {
                if (m21930K == 8) {
                    i13 = 3;
                } else if (m21930K == 16) {
                    i13 = z8 ? 268435456 : 2;
                } else if (m21930K == 24) {
                    i13 = z8 ? 1342177280 : 21;
                } else {
                    if (m21930K == 32) {
                        i13 = z8 ? 1610612736 : 22;
                    }
                    i13 = -1;
                }
                c5357z.m21940U(8);
                m21957p = 0;
            }
        }
        int m21947f = c5357z.m21947f();
        int i17 = i7;
        if (i17 == 1701733217) {
            Pair m17697u = m17697u(c5357z, i15, i16);
            if (m17697u != null) {
                i17 = ((Integer) m17697u.first).intValue();
                c4323m2 = c4323m2 == null ? null : c4323m2.m18168c(((C4245t) m17697u.second).f14607b);
                dVar.f14462a[i11] = (C4245t) m17697u.second;
            }
            c5357z.m21939T(m21947f);
        }
        String str4 = "audio/mhm1";
        if (i17 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i17 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i17 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i17 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i17 == 1685353320 || i17 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i17 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i17 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i17 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i17 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i17 != 1936684916) {
                if (i17 == 1953984371) {
                    str2 = "audio/raw";
                    i13 = 268435456;
                } else if (i17 != 1819304813) {
                    str2 = (i17 == 778924082 || i17 == 778924083) ? "audio/mpeg" : i17 == 1835557169 ? "audio/mha1" : i17 == 1835560241 ? "audio/mhm1" : i17 == 1634492771 ? "audio/alac" : i17 == 1634492791 ? "audio/g711-alaw" : i17 == 1970037111 ? "audio/g711-mlaw" : i17 == 1332770163 ? "audio/opus" : i17 == 1716281667 ? "audio/flac" : i17 == 1835823201 ? "audio/true-hd" : null;
                } else if (i13 != -1) {
                    str2 = "audio/raw";
                }
            }
            str2 = "audio/raw";
            i13 = 2;
        }
        int i18 = i13;
        String str5 = null;
        List list = null;
        b bVar = null;
        while (m21947f - i15 < i16) {
            c5357z.m21939T(m21947f);
            int m21957p2 = c5357z.m21957p();
            AbstractC0886u.m3689a(m21957p2 > 0, "childAtomSize must be positive");
            int m21957p3 = c5357z.m21957p();
            if (m21957p3 == 1835557187) {
                c5357z.m21939T(m21947f + 8);
                c5357z.m21940U(1);
                int m21926G = c5357z.m21926G();
                c5357z.m21940U(1);
                if (Objects.equals(str2, str4)) {
                    i14 = 0;
                    str5 = String.format("mhm1.%02X", Integer.valueOf(m21926G));
                    str3 = str4;
                } else {
                    i14 = 0;
                    str3 = str4;
                    str5 = String.format("mha1.%02X", Integer.valueOf(m21926G));
                }
                int m21932M2 = c5357z.m21932M();
                byte[] bArr = new byte[m21932M2];
                c5357z.m21953l(bArr, i14, m21932M2);
                list = list == null ? AbstractC3033v.m11051u(bArr) : AbstractC3033v.m11052w(bArr, (byte[]) list.get(i14));
            } else {
                str3 = str4;
                if (m21957p3 == 1835557200) {
                    c5357z.m21939T(m21947f + 8);
                    int m21926G2 = c5357z.m21926G();
                    if (m21926G2 > 0) {
                        byte[] bArr2 = new byte[m21926G2];
                        c5357z.m21953l(bArr2, 0, m21926G2);
                        list = list == null ? AbstractC3033v.m11051u(bArr2) : AbstractC3033v.m11052w((byte[]) list.get(0), bArr2);
                    }
                } else {
                    if (m21957p3 == 1702061171 || (z6 && m21957p3 == 2002876005)) {
                        int m17680d = m21957p3 == 1702061171 ? m21947f : m17680d(c5357z, 1702061171, m21947f, m21957p2);
                        if (m17680d != -1) {
                            bVar = m17687k(c5357z, m17680d);
                            str2 = bVar.f14458a;
                            byte[] bArr3 = bVar.f14459b;
                            if (bArr3 != null) {
                                if ("audio/vorbis".equals(str2)) {
                                    list = AbstractC0864W.m3570e(bArr3);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        AbstractC0866a.b m3587f = AbstractC0866a.m3587f(bArr3);
                                        int i19 = m3587f.f2986a;
                                        m21932M = m3587f.f2987b;
                                        str5 = m3587f.f2988c;
                                        m21927H = i19;
                                    }
                                    list = AbstractC3033v.m11051u(bArr3);
                                }
                            }
                        }
                    } else {
                        if (m21957p3 == 1684103987) {
                            c7 = '\b';
                            c5357z.m21939T(m21947f + 8);
                            dVar.f14463b = AbstractC0867b.m3592d(c5357z, Integer.toString(i10), str, c4323m2);
                        } else {
                            c7 = '\b';
                            if (m21957p3 == 1684366131) {
                                c5357z.m21939T(m21947f + 8);
                                dVar.f14463b = AbstractC0867b.m3596h(c5357z, Integer.toString(i10), str, c4323m2);
                            } else if (m21957p3 == 1684103988) {
                                c5357z.m21939T(m21947f + 8);
                                dVar.f14463b = AbstractC0868c.m3600b(c5357z, Integer.toString(i10), str, c4323m2);
                                c8 = 24931;
                            } else if (m21957p3 == 1684892784) {
                                if (m21957p <= 0) {
                                    throw C4295A.m17943a("Invalid sample rate for Dolby TrueHD MLP stream: " + m21957p, null);
                                }
                                m21927H = m21957p;
                                m21932M = 2;
                            } else if (m21957p3 == 1684305011 || m21957p3 == 1969517683) {
                                c8 = 24931;
                                dVar.f14463b = new C4327q.b().m18249Z(i10).m18264o0(str2).m18237N(m21932M).m18265p0(m21927H).m18244U(c4323m2).m18254e0(str).m18234K();
                            } else if (m21957p3 == 1682927731) {
                                int i20 = m21957p2 - 8;
                                byte[] bArr4 = f14448a;
                                byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i20);
                                c5357z.m21939T(m21947f + 8);
                                c5357z.m21953l(copyOf, bArr4.length, i20);
                                list = AbstractC0853K.m3542a(copyOf);
                            } else if (m21957p3 == 1684425825) {
                                byte[] bArr5 = new byte[m21957p2 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                c5357z.m21939T(m21947f + 12);
                                c5357z.m21953l(bArr5, 4, m21957p2 - 12);
                                list = AbstractC3033v.m11051u(bArr5);
                            } else {
                                c8 = 24931;
                                if (m21957p3 == 1634492771) {
                                    int i21 = m21957p2 - 12;
                                    byte[] bArr6 = new byte[i21];
                                    c5357z.m21939T(m21947f + 12);
                                    c5357z.m21953l(bArr6, 0, i21);
                                    Pair m21815h = AbstractC5335d.m21815h(bArr6);
                                    int intValue = ((Integer) m21815h.first).intValue();
                                    m21932M = ((Integer) m21815h.second).intValue();
                                    list = AbstractC3033v.m11051u(bArr6);
                                    m21927H = intValue;
                                }
                            }
                        }
                        c8 = 24931;
                    }
                    m21947f += m21957p2;
                    i15 = i8;
                    i16 = i9;
                    str4 = str3;
                }
            }
            m21947f += m21957p2;
            i15 = i8;
            i16 = i9;
            str4 = str3;
        }
        if (dVar.f14463b != null || str2 == null) {
            return;
        }
        C4327q.b m18254e0 = new C4327q.b().m18249Z(i10).m18264o0(str2).m18238O(str5).m18237N(m21932M).m18265p0(m21927H).m18258i0(i18).m18251b0(list).m18244U(c4323m2).m18254e0(str);
        if (bVar != null) {
            m18254e0.m18236M(AbstractC3577g.m14430m(bVar.f14460c)).m18259j0(AbstractC3577g.m14430m(bVar.f14461d));
        }
        dVar.f14463b = m18254e0.m18234K();
    }

    /* renamed from: h */
    public static C4318h m17684h(C5357z c5357z) {
        C4318h.b bVar = new C4318h.b();
        C5356y c5356y = new C5356y(c5357z.m21946e());
        c5356y.m21916p(c5357z.m21947f() * 8);
        c5356y.m21919s(1);
        int m21908h = c5356y.m21908h(3);
        c5356y.m21918r(6);
        boolean m21907g = c5356y.m21907g();
        boolean m21907g2 = c5356y.m21907g();
        if (m21908h == 2 && m21907g) {
            bVar.m18157g(m21907g2 ? 12 : 10);
            bVar.m18152b(m21907g2 ? 12 : 10);
        } else if (m21908h <= 2) {
            bVar.m18157g(m21907g ? 10 : 8);
            bVar.m18152b(m21907g ? 10 : 8);
        }
        c5356y.m21918r(13);
        c5356y.m21917q();
        int m21908h2 = c5356y.m21908h(4);
        if (m21908h2 != 1) {
            AbstractC5346o.m21865f("AtomParsers", "Unsupported obu_type: " + m21908h2);
            return bVar.m18151a();
        }
        if (c5356y.m21907g()) {
            AbstractC5346o.m21865f("AtomParsers", "Unsupported obu_extension_flag");
            return bVar.m18151a();
        }
        boolean m21907g3 = c5356y.m21907g();
        c5356y.m21917q();
        if (m21907g3 && c5356y.m21908h(8) > 127) {
            AbstractC5346o.m21865f("AtomParsers", "Excessive obu_size");
            return bVar.m18151a();
        }
        int m21908h3 = c5356y.m21908h(3);
        c5356y.m21917q();
        if (c5356y.m21907g()) {
            AbstractC5346o.m21865f("AtomParsers", "Unsupported reduced_still_picture_header");
            return bVar.m18151a();
        }
        if (c5356y.m21907g()) {
            AbstractC5346o.m21865f("AtomParsers", "Unsupported timing_info_present_flag");
            return bVar.m18151a();
        }
        if (c5356y.m21907g()) {
            AbstractC5346o.m21865f("AtomParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.m18151a();
        }
        int m21908h4 = c5356y.m21908h(5);
        boolean z6 = false;
        for (int i7 = 0; i7 <= m21908h4; i7++) {
            c5356y.m21918r(12);
            if (c5356y.m21908h(5) > 7) {
                c5356y.m21917q();
            }
        }
        int m21908h5 = c5356y.m21908h(4);
        int m21908h6 = c5356y.m21908h(4);
        c5356y.m21918r(m21908h5 + 1);
        c5356y.m21918r(m21908h6 + 1);
        if (c5356y.m21907g()) {
            c5356y.m21918r(7);
        }
        c5356y.m21918r(7);
        boolean m21907g4 = c5356y.m21907g();
        if (m21907g4) {
            c5356y.m21918r(2);
        }
        if ((c5356y.m21907g() ? 2 : c5356y.m21908h(1)) > 0 && !c5356y.m21907g()) {
            c5356y.m21918r(1);
        }
        if (m21907g4) {
            c5356y.m21918r(3);
        }
        c5356y.m21918r(3);
        boolean m21907g5 = c5356y.m21907g();
        if (m21908h3 == 2 && m21907g5) {
            c5356y.m21917q();
        }
        if (m21908h3 != 1 && c5356y.m21907g()) {
            z6 = true;
        }
        if (c5356y.m21907g()) {
            int m21908h7 = c5356y.m21908h(8);
            int m21908h8 = c5356y.m21908h(8);
            bVar.m18154d(C4318h.m18143j(m21908h7)).m18153c(((z6 || m21908h7 != 1 || m21908h8 != 13 || c5356y.m21908h(8) != 0) ? c5356y.m21908h(1) : 1) != 1 ? 2 : 1).m18155e(C4318h.m18144k(m21908h8));
        }
        return bVar.m18151a();
    }

    /* renamed from: i */
    public static Pair m17685i(C5357z c5357z, int i7, int i8) {
        int i9 = i7 + 8;
        int i10 = -1;
        int i11 = 0;
        String str = null;
        Integer num = null;
        while (i9 - i7 < i8) {
            c5357z.m21939T(i9);
            int m21957p = c5357z.m21957p();
            int m21957p2 = c5357z.m21957p();
            if (m21957p2 == 1718775137) {
                num = Integer.valueOf(c5357z.m21957p());
            } else if (m21957p2 == 1935894637) {
                c5357z.m21940U(4);
                str = c5357z.m21923D(4);
            } else if (m21957p2 == 1935894633) {
                i10 = i9;
                i11 = m21957p;
            }
            i9 += m21957p;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        AbstractC0886u.m3689a(num != null, "frma atom is mandatory");
        AbstractC0886u.m3689a(i10 != -1, "schi atom is mandatory");
        C4245t m17698v = m17698v(c5357z, i10, i11, str);
        AbstractC0886u.m3689a(m17698v != null, "tenc atom is mandatory");
        return Pair.create(num, (C4245t) AbstractC5330M.m21747i(m17698v));
    }

    /* renamed from: j */
    public static Pair m17686j(AbstractC4226a.a aVar) {
        AbstractC4226a.b m17670g = aVar.m17670g(1701606260);
        if (m17670g == null) {
            return null;
        }
        C5357z c5357z = m17670g.f14447b;
        c5357z.m21939T(8);
        int m17666c = AbstractC4226a.m17666c(c5357z.m21957p());
        int m21930K = c5357z.m21930K();
        long[] jArr = new long[m21930K];
        long[] jArr2 = new long[m21930K];
        for (int i7 = 0; i7 < m21930K; i7++) {
            jArr[i7] = m17666c == 1 ? c5357z.m21931L() : c5357z.m21928I();
            jArr2[i7] = m17666c == 1 ? c5357z.m21967z() : c5357z.m21957p();
            if (c5357z.m21922C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c5357z.m21940U(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: k */
    public static b m17687k(C5357z c5357z, int i7) {
        c5357z.m21939T(i7 + 12);
        c5357z.m21940U(1);
        m17688l(c5357z);
        c5357z.m21940U(2);
        int m21926G = c5357z.m21926G();
        if ((m21926G & 128) != 0) {
            c5357z.m21940U(2);
        }
        if ((m21926G & 64) != 0) {
            c5357z.m21940U(c5357z.m21926G());
        }
        if ((m21926G & 32) != 0) {
            c5357z.m21940U(2);
        }
        c5357z.m21940U(1);
        m17688l(c5357z);
        String m18415h = AbstractC4336z.m18415h(c5357z.m21926G());
        if ("audio/mpeg".equals(m18415h) || "audio/vnd.dts".equals(m18415h) || "audio/vnd.dts.hd".equals(m18415h)) {
            return new b(m18415h, null, -1L, -1L);
        }
        c5357z.m21940U(4);
        long m21928I = c5357z.m21928I();
        long m21928I2 = c5357z.m21928I();
        c5357z.m21940U(1);
        int m17688l = m17688l(c5357z);
        byte[] bArr = new byte[m17688l];
        c5357z.m21953l(bArr, 0, m17688l);
        return new b(m18415h, bArr, m21928I2 > 0 ? m21928I2 : -1L, m21928I > 0 ? m21928I : -1L);
    }

    /* renamed from: l */
    public static int m17688l(C5357z c5357z) {
        int m21926G = c5357z.m21926G();
        int i7 = m21926G & 127;
        while ((m21926G & 128) == 128) {
            m21926G = c5357z.m21926G();
            i7 = (i7 << 7) | (m21926G & 127);
        }
        return i7;
    }

    /* renamed from: m */
    public static int m17689m(C5357z c5357z) {
        c5357z.m21939T(16);
        return c5357z.m21957p();
    }

    /* renamed from: n */
    public static C4334x m17690n(C5357z c5357z, int i7) {
        c5357z.m21940U(8);
        ArrayList arrayList = new ArrayList();
        while (c5357z.m21947f() < i7) {
            C4334x.b m17770c = AbstractC4235j.m17770c(c5357z);
            if (m17770c != null) {
                arrayList.add(m17770c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4334x(arrayList);
    }

    /* renamed from: o */
    public static Pair m17691o(C5357z c5357z) {
        c5357z.m21939T(8);
        int m17666c = AbstractC4226a.m17666c(c5357z.m21957p());
        c5357z.m21940U(m17666c == 0 ? 8 : 16);
        long m21928I = c5357z.m21928I();
        c5357z.m21940U(m17666c == 0 ? 4 : 8);
        int m21932M = c5357z.m21932M();
        return Pair.create(Long.valueOf(m21928I), StringUtils.EMPTY + ((char) (((m21932M >> 10) & 31) + 96)) + ((char) (((m21932M >> 5) & 31) + 96)) + ((char) ((m21932M & 31) + 96)));
    }

    /* renamed from: p */
    public static C4334x m17692p(AbstractC4226a.a aVar) {
        AbstractC4226a.b m17670g = aVar.m17670g(1751411826);
        AbstractC4226a.b m17670g2 = aVar.m17670g(1801812339);
        AbstractC4226a.b m17670g3 = aVar.m17670g(1768715124);
        if (m17670g == null || m17670g2 == null || m17670g3 == null || m17689m(m17670g.f14447b) != 1835299937) {
            return null;
        }
        C5357z c5357z = m17670g2.f14447b;
        c5357z.m21939T(12);
        int m21957p = c5357z.m21957p();
        String[] strArr = new String[m21957p];
        for (int i7 = 0; i7 < m21957p; i7++) {
            int m21957p2 = c5357z.m21957p();
            c5357z.m21940U(4);
            strArr[i7] = c5357z.m21923D(m21957p2 - 8);
        }
        C5357z c5357z2 = m17670g3.f14447b;
        c5357z2.m21939T(8);
        ArrayList arrayList = new ArrayList();
        while (c5357z2.m21942a() > 8) {
            int m21947f = c5357z2.m21947f();
            int m21957p3 = c5357z2.m21957p();
            int m21957p4 = c5357z2.m21957p() - 1;
            if (m21957p4 < 0 || m21957p4 >= m21957p) {
                AbstractC5346o.m21867h("AtomParsers", "Skipped metadata with unknown key index: " + m21957p4);
            } else {
                C5397a m17775h = AbstractC4235j.m17775h(c5357z2, m21947f + m21957p3, strArr[m21957p4]);
                if (m17775h != null) {
                    arrayList.add(m17775h);
                }
            }
            c5357z2.m21939T(m21947f + m21957p3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4334x(arrayList);
    }

    /* renamed from: q */
    public static void m17693q(C5357z c5357z, int i7, int i8, int i9, d dVar) {
        c5357z.m21939T(i8 + 16);
        if (i7 == 1835365492) {
            c5357z.m21920A();
            String m21920A = c5357z.m21920A();
            if (m21920A != null) {
                dVar.f14463b = new C4327q.b().m18249Z(i9).m18264o0(m21920A).m18234K();
            }
        }
    }

    /* renamed from: r */
    public static C5399c m17694r(C5357z c5357z) {
        long m21967z;
        long m21967z2;
        c5357z.m21939T(8);
        if (AbstractC4226a.m17666c(c5357z.m21957p()) == 0) {
            m21967z = c5357z.m21928I();
            m21967z2 = c5357z.m21928I();
        } else {
            m21967z = c5357z.m21967z();
            m21967z2 = c5357z.m21967z();
        }
        return new C5399c(m21967z, m21967z2, c5357z.m21928I());
    }

    /* renamed from: s */
    public static float m17695s(C5357z c5357z, int i7) {
        c5357z.m21939T(i7 + 8);
        return c5357z.m21930K() / c5357z.m21930K();
    }

    /* renamed from: t */
    public static byte[] m17696t(C5357z c5357z, int i7, int i8) {
        int i9 = i7 + 8;
        while (i9 - i7 < i8) {
            c5357z.m21939T(i9);
            int m21957p = c5357z.m21957p();
            if (c5357z.m21957p() == 1886547818) {
                return Arrays.copyOfRange(c5357z.m21946e(), i9, m21957p + i9);
            }
            i9 += m21957p;
        }
        return null;
    }

    /* renamed from: u */
    public static Pair m17697u(C5357z c5357z, int i7, int i8) {
        Pair m17685i;
        int m21947f = c5357z.m21947f();
        while (m21947f - i7 < i8) {
            c5357z.m21939T(m21947f);
            int m21957p = c5357z.m21957p();
            AbstractC0886u.m3689a(m21957p > 0, "childAtomSize must be positive");
            if (c5357z.m21957p() == 1936289382 && (m17685i = m17685i(c5357z, m21947f, m21957p)) != null) {
                return m17685i;
            }
            m21947f += m21957p;
        }
        return null;
    }

    /* renamed from: v */
    public static C4245t m17698v(C5357z c5357z, int i7, int i8, String str) {
        int i9;
        int i10;
        int i11 = i7 + 8;
        while (true) {
            byte[] bArr = null;
            if (i11 - i7 >= i8) {
                return null;
            }
            c5357z.m21939T(i11);
            int m21957p = c5357z.m21957p();
            if (c5357z.m21957p() == 1952804451) {
                int m17666c = AbstractC4226a.m17666c(c5357z.m21957p());
                c5357z.m21940U(1);
                if (m17666c == 0) {
                    c5357z.m21940U(1);
                    i10 = 0;
                    i9 = 0;
                } else {
                    int m21926G = c5357z.m21926G();
                    i9 = m21926G & 15;
                    i10 = (m21926G & 240) >> 4;
                }
                boolean z6 = c5357z.m21926G() == 1;
                int m21926G2 = c5357z.m21926G();
                byte[] bArr2 = new byte[16];
                c5357z.m21953l(bArr2, 0, 16);
                if (z6 && m21926G2 == 0) {
                    int m21926G3 = c5357z.m21926G();
                    bArr = new byte[m21926G3];
                    c5357z.m21953l(bArr, 0, m21926G3);
                }
                return new C4245t(z6, str, m21926G2, bArr2, i10, i9, bArr);
            }
            i11 += m21957p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0429 A[EDGE_INSN: B:97:0x0429->B:98:0x0429 BREAK  A[LOOP:2: B:76:0x03c8->B:92:0x0422], SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p225f1.C4247v m17699w(p225f1.C4244s r37, p225f1.AbstractC4226a.a r38, p078L0.C0847E r39) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p225f1.AbstractC4227b.m17699w(f1.s, f1.a$a, L0.E):f1.v");
    }

    /* renamed from: x */
    public static d m17700x(C5357z c5357z, int i7, int i8, String str, C4323m c4323m, boolean z6) {
        int i9;
        c5357z.m21939T(12);
        int m21957p = c5357z.m21957p();
        d dVar = new d(m21957p);
        for (int i10 = 0; i10 < m21957p; i10++) {
            int m21947f = c5357z.m21947f();
            int m21957p2 = c5357z.m21957p();
            AbstractC0886u.m3689a(m21957p2 > 0, "childAtomSize must be positive");
            int m21957p3 = c5357z.m21957p();
            if (m21957p3 == 1635148593 || m21957p3 == 1635148595 || m21957p3 == 1701733238 || m21957p3 == 1831958048 || m21957p3 == 1836070006 || m21957p3 == 1752589105 || m21957p3 == 1751479857 || m21957p3 == 1932670515 || m21957p3 == 1211250227 || m21957p3 == 1987063864 || m21957p3 == 1987063865 || m21957p3 == 1635135537 || m21957p3 == 1685479798 || m21957p3 == 1685479729 || m21957p3 == 1685481573 || m21957p3 == 1685481521) {
                i9 = m21947f;
                m17675E(c5357z, m21957p3, i9, m21957p2, i7, i8, c4323m, dVar, i10);
            } else if (m21957p3 == 1836069985 || m21957p3 == 1701733217 || m21957p3 == 1633889587 || m21957p3 == 1700998451 || m21957p3 == 1633889588 || m21957p3 == 1835823201 || m21957p3 == 1685353315 || m21957p3 == 1685353317 || m21957p3 == 1685353320 || m21957p3 == 1685353324 || m21957p3 == 1685353336 || m21957p3 == 1935764850 || m21957p3 == 1935767394 || m21957p3 == 1819304813 || m21957p3 == 1936684916 || m21957p3 == 1953984371 || m21957p3 == 778924082 || m21957p3 == 778924083 || m21957p3 == 1835557169 || m21957p3 == 1835560241 || m21957p3 == 1634492771 || m21957p3 == 1634492791 || m21957p3 == 1970037111 || m21957p3 == 1332770163 || m21957p3 == 1716281667) {
                i9 = m21947f;
                m17683g(c5357z, m21957p3, m21947f, m21957p2, i7, str, z6, c4323m, dVar, i10);
            } else {
                if (m21957p3 == 1414810956 || m21957p3 == 1954034535 || m21957p3 == 2004251764 || m21957p3 == 1937010800 || m21957p3 == 1664495672) {
                    m17701y(c5357z, m21957p3, m21947f, m21957p2, i7, str, dVar);
                } else if (m21957p3 == 1835365492) {
                    m17693q(c5357z, m21957p3, m21947f, i7, dVar);
                } else if (m21957p3 == 1667329389) {
                    dVar.f14463b = new C4327q.b().m18249Z(i7).m18264o0("application/x-camera-motion").m18234K();
                }
                i9 = m21947f;
            }
            c5357z.m21939T(i9 + m21957p2);
        }
        return dVar;
    }

    /* renamed from: y */
    public static void m17701y(C5357z c5357z, int i7, int i8, int i9, int i10, String str, d dVar) {
        c5357z.m21939T(i8 + 16);
        String str2 = "application/ttml+xml";
        AbstractC3033v abstractC3033v = null;
        long j7 = Long.MAX_VALUE;
        if (i7 != 1414810956) {
            if (i7 == 1954034535) {
                int i11 = i9 - 16;
                byte[] bArr = new byte[i11];
                c5357z.m21953l(bArr, 0, i11);
                abstractC3033v = AbstractC3033v.m11051u(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i7 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i7 == 1937010800) {
                j7 = 0;
            } else {
                if (i7 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f14465d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f14463b = new C4327q.b().m18249Z(i10).m18264o0(str2).m18254e0(str).m18268s0(j7).m18251b0(abstractC3033v).m18234K();
    }

    /* renamed from: z */
    public static g m17702z(C5357z c5357z) {
        long j7;
        c5357z.m21939T(8);
        int m17666c = AbstractC4226a.m17666c(c5357z.m21957p());
        c5357z.m21940U(m17666c == 0 ? 8 : 16);
        int m21957p = c5357z.m21957p();
        c5357z.m21940U(4);
        int m21947f = c5357z.m21947f();
        int i7 = m17666c == 0 ? 4 : 8;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            j7 = -9223372036854775807L;
            if (i9 >= i7) {
                c5357z.m21940U(i7);
                break;
            }
            if (c5357z.m21946e()[m21947f + i9] != -1) {
                long m21928I = m17666c == 0 ? c5357z.m21928I() : c5357z.m21931L();
                if (m21928I != 0) {
                    j7 = m21928I;
                }
            } else {
                i9++;
            }
        }
        c5357z.m21940U(16);
        int m21957p2 = c5357z.m21957p();
        int m21957p3 = c5357z.m21957p();
        c5357z.m21940U(4);
        int m21957p4 = c5357z.m21957p();
        int m21957p5 = c5357z.m21957p();
        if (m21957p2 == 0 && m21957p3 == 65536 && m21957p4 == -65536 && m21957p5 == 0) {
            i8 = 90;
        } else if (m21957p2 == 0 && m21957p3 == -65536 && m21957p4 == 65536 && m21957p5 == 0) {
            i8 = 270;
        } else if (m21957p2 == -65536 && m21957p3 == 0 && m21957p4 == 0 && m21957p5 == -65536) {
            i8 = 180;
        }
        return new g(m21957p, j7, i8);
    }
}

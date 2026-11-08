package p043G0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.pipes.PipesConfigBase;
import p022D0.InterfaceC0120F;
import p029E0.AbstractC0220m;
import p029E0.InterfaceC0221n;
import p043G0.InterfaceC0375y;
import p050H0.InterfaceC0536e;
import p178Z2.AbstractC2987A;
import p178Z2.AbstractC2994H;
import p178Z2.AbstractC3033v;
import p178Z2.InterfaceC2989C;
import p232g0.AbstractC4303I;
import p232g0.C4304J;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;
import p259j0.InterfaceC5334c;

/* renamed from: G0.a */
/* loaded from: classes.dex */
public class C0351a extends AbstractC0353c {

    /* renamed from: h */
    public final InterfaceC0536e f1306h;

    /* renamed from: i */
    public final long f1307i;

    /* renamed from: j */
    public final long f1308j;

    /* renamed from: k */
    public final long f1309k;

    /* renamed from: l */
    public final int f1310l;

    /* renamed from: m */
    public final int f1311m;

    /* renamed from: n */
    public final float f1312n;

    /* renamed from: o */
    public final float f1313o;

    /* renamed from: p */
    public final AbstractC3033v f1314p;

    /* renamed from: q */
    public final InterfaceC5334c f1315q;

    /* renamed from: r */
    public float f1316r;

    /* renamed from: s */
    public int f1317s;

    /* renamed from: t */
    public int f1318t;

    /* renamed from: u */
    public long f1319u;

    /* renamed from: v */
    public AbstractC0220m f1320v;

    /* renamed from: w */
    public long f1321w;

    /* renamed from: G0.a$a */
    public static final class a {

        /* renamed from: a */
        public final long f1322a;

        /* renamed from: b */
        public final long f1323b;

        public a(long j7, long j8) {
            this.f1322a = j7;
            this.f1323b = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1322a == aVar.f1322a && this.f1323b == aVar.f1323b;
        }

        public int hashCode() {
            return (((int) this.f1322a) * 31) + ((int) this.f1323b);
        }
    }

    /* renamed from: G0.a$b */
    public static class b implements InterfaceC0375y.b {

        /* renamed from: a */
        public final int f1324a;

        /* renamed from: b */
        public final int f1325b;

        /* renamed from: c */
        public final int f1326c;

        /* renamed from: d */
        public final int f1327d;

        /* renamed from: e */
        public final int f1328e;

        /* renamed from: f */
        public final float f1329f;

        /* renamed from: g */
        public final float f1330g;

        /* renamed from: h */
        public final InterfaceC5334c f1331h;

        public b() {
            this(PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS, 25000, 25000, 0.7f);
        }

        @Override // p043G0.InterfaceC0375y.b
        /* renamed from: a */
        public final InterfaceC0375y[] mo1401a(InterfaceC0375y.a[] aVarArr, InterfaceC0536e interfaceC0536e, InterfaceC0120F.b bVar, AbstractC4303I abstractC4303I) {
            AbstractC3033v m1387B = C0351a.m1387B(aVarArr);
            InterfaceC0375y[] interfaceC0375yArr = new InterfaceC0375y[aVarArr.length];
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                InterfaceC0375y.a aVar = aVarArr[i7];
                if (aVar != null) {
                    int[] iArr = aVar.f1470b;
                    if (iArr.length != 0) {
                        interfaceC0375yArr[i7] = iArr.length == 1 ? new C0376z(aVar.f1469a, iArr[0], aVar.f1471c) : m1402b(aVar.f1469a, iArr, aVar.f1471c, interfaceC0536e, (AbstractC3033v) m1387B.get(i7));
                    }
                }
            }
            return interfaceC0375yArr;
        }

        /* renamed from: b */
        public C0351a m1402b(C4304J c4304j, int[] iArr, int i7, InterfaceC0536e interfaceC0536e, AbstractC3033v abstractC3033v) {
            return new C0351a(c4304j, iArr, i7, interfaceC0536e, this.f1324a, this.f1325b, this.f1326c, this.f1327d, this.f1328e, this.f1329f, this.f1330g, abstractC3033v, this.f1331h);
        }

        public b(int i7, int i8, int i9, float f7) {
            this(i7, i8, i9, 1279, 719, f7, 0.75f, InterfaceC5334c.f18817a);
        }

        public b(int i7, int i8, int i9, int i10, int i11, float f7, float f8, InterfaceC5334c interfaceC5334c) {
            this.f1324a = i7;
            this.f1325b = i8;
            this.f1326c = i9;
            this.f1327d = i10;
            this.f1328e = i11;
            this.f1329f = f7;
            this.f1330g = f8;
            this.f1331h = interfaceC5334c;
        }
    }

    public C0351a(C4304J c4304j, int[] iArr, int i7, InterfaceC0536e interfaceC0536e, long j7, long j8, long j9, int i8, int i9, float f7, float f8, List list, InterfaceC5334c interfaceC5334c) {
        super(c4304j, iArr, i7);
        InterfaceC0536e interfaceC0536e2;
        long j10;
        if (j9 < j7) {
            AbstractC5346o.m21867h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            interfaceC0536e2 = interfaceC0536e;
            j10 = j7;
        } else {
            interfaceC0536e2 = interfaceC0536e;
            j10 = j9;
        }
        this.f1306h = interfaceC0536e2;
        this.f1307i = j7 * 1000;
        this.f1308j = j8 * 1000;
        this.f1309k = j10 * 1000;
        this.f1310l = i8;
        this.f1311m = i9;
        this.f1312n = f7;
        this.f1313o = f8;
        this.f1314p = AbstractC3033v.m11048p(list);
        this.f1315q = interfaceC5334c;
        this.f1316r = 1.0f;
        this.f1318t = 0;
        this.f1319u = -9223372036854775807L;
        this.f1321w = -2147483647L;
    }

    /* renamed from: B */
    public static AbstractC3033v m1387B(InterfaceC0375y.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0375y.a aVar : aVarArr) {
            if (aVar == null || aVar.f1470b.length <= 1) {
                arrayList.add(null);
            } else {
                AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
                m11045m.mo11040a(new a(0L, 0L));
                arrayList.add(m11045m);
            }
        }
        long[][] m1388G = m1388G(aVarArr);
        int[] iArr = new int[m1388G.length];
        long[] jArr = new long[m1388G.length];
        for (int i7 = 0; i7 < m1388G.length; i7++) {
            long[] jArr2 = m1388G[i7];
            jArr[i7] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        m1391y(arrayList, jArr);
        AbstractC3033v m1389H = m1389H(m1388G);
        for (int i8 = 0; i8 < m1389H.size(); i8++) {
            int intValue = ((Integer) m1389H.get(i8)).intValue();
            int i9 = iArr[intValue] + 1;
            iArr[intValue] = i9;
            jArr[intValue] = m1388G[intValue][i9];
            m1391y(arrayList, jArr);
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (arrayList.get(i10) != null) {
                jArr[i10] = jArr[i10] * 2;
            }
        }
        m1391y(arrayList, jArr);
        AbstractC3033v.a m11045m2 = AbstractC3033v.m11045m();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            AbstractC3033v.a aVar2 = (AbstractC3033v.a) arrayList.get(i11);
            m11045m2.mo11040a(aVar2 == null ? AbstractC3033v.m11050t() : aVar2.m11063k());
        }
        return m11045m2.m11063k();
    }

    /* renamed from: G */
    public static long[][] m1388G(InterfaceC0375y.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            InterfaceC0375y.a aVar = aVarArr[i7];
            if (aVar == null) {
                jArr[i7] = new long[0];
            } else {
                jArr[i7] = new long[aVar.f1470b.length];
                int i8 = 0;
                while (true) {
                    int[] iArr = aVar.f1470b;
                    if (i8 >= iArr.length) {
                        break;
                    }
                    long j7 = aVar.f1469a.m18064a(iArr[i8]).f15133i;
                    long[] jArr2 = jArr[i7];
                    if (j7 == -1) {
                        j7 = 0;
                    }
                    jArr2[i8] = j7;
                    i8++;
                }
                Arrays.sort(jArr[i7]);
            }
        }
        return jArr;
    }

    /* renamed from: H */
    public static AbstractC3033v m1389H(long[][] jArr) {
        InterfaceC2989C mo10824e = AbstractC2994H.m10820c().m10825a().mo10824e();
        for (int i7 = 0; i7 < jArr.length; i7++) {
            long[] jArr2 = jArr[i7];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr3 = jArr[i7];
                    double d7 = 0.0d;
                    if (i8 >= jArr3.length) {
                        break;
                    }
                    long j7 = jArr3[i8];
                    if (j7 != -1) {
                        d7 = Math.log(j7);
                    }
                    dArr[i8] = d7;
                    i8++;
                }
                int i9 = length - 1;
                double d8 = dArr[i9] - dArr[0];
                int i10 = 0;
                while (i10 < i9) {
                    double d9 = dArr[i10];
                    i10++;
                    mo10824e.put(Double.valueOf(d8 == 0.0d ? 1.0d : (((d9 + dArr[i10]) * 0.5d) - dArr[0]) / d8), Integer.valueOf(i7));
                }
            }
        }
        return AbstractC3033v.m11048p(mo10824e.values());
    }

    /* renamed from: y */
    public static void m1391y(List list, long[] jArr) {
        long j7 = 0;
        for (long j8 : jArr) {
            j7 += j8;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            AbstractC3033v.a aVar = (AbstractC3033v.a) list.get(i7);
            if (aVar != null) {
                aVar.mo11040a(new a(j7, jArr[i7]));
            }
        }
    }

    /* renamed from: A */
    public final int m1392A(long j7, long j8) {
        long m1393C = m1393C(j8);
        int i7 = 0;
        for (int i8 = 0; i8 < this.f1333b; i8++) {
            if (j7 == Long.MIN_VALUE || !mo395i(i8, j7)) {
                C4327q mo390b = mo390b(i8);
                if (m1400z(mo390b, mo390b.f15133i, m1393C)) {
                    return i8;
                }
                i7 = i8;
            }
        }
        return i7;
    }

    /* renamed from: C */
    public final long m1393C(long j7) {
        long m1397I = m1397I(j7);
        if (this.f1314p.isEmpty()) {
            return m1397I;
        }
        int i7 = 1;
        while (i7 < this.f1314p.size() - 1 && ((a) this.f1314p.get(i7)).f1322a < m1397I) {
            i7++;
        }
        a aVar = (a) this.f1314p.get(i7 - 1);
        a aVar2 = (a) this.f1314p.get(i7);
        long j8 = aVar.f1322a;
        float f7 = (m1397I - j8) / (aVar2.f1322a - j8);
        return aVar.f1323b + ((long) (f7 * (aVar2.f1323b - r2)));
    }

    /* renamed from: D */
    public final long m1394D(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC0220m abstractC0220m = (AbstractC0220m) AbstractC2987A.m10751d(list);
        long j7 = abstractC0220m.f878g;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = abstractC0220m.f879h;
        if (j8 != -9223372036854775807L) {
            return j8 - j7;
        }
        return -9223372036854775807L;
    }

    /* renamed from: E */
    public long m1395E() {
        return this.f1309k;
    }

    /* renamed from: F */
    public final long m1396F(InterfaceC0221n[] interfaceC0221nArr, List list) {
        int i7 = this.f1317s;
        if (i7 < interfaceC0221nArr.length && interfaceC0221nArr[i7].next()) {
            InterfaceC0221n interfaceC0221n = interfaceC0221nArr[this.f1317s];
            return interfaceC0221n.mo921b() - interfaceC0221n.mo920a();
        }
        for (InterfaceC0221n interfaceC0221n2 : interfaceC0221nArr) {
            if (interfaceC0221n2.next()) {
                return interfaceC0221n2.mo921b() - interfaceC0221n2.mo920a();
            }
        }
        return m1394D(list);
    }

    /* renamed from: I */
    public final long m1397I(long j7) {
        long mo2049h = this.f1306h.mo2049h();
        this.f1321w = mo2049h;
        long j8 = (long) (mo2049h * this.f1312n);
        long mo2045a = this.f1306h.mo2045a();
        if (mo2045a == -9223372036854775807L || j7 == -9223372036854775807L) {
            return (long) (j8 / this.f1316r);
        }
        float f7 = j7;
        return (long) ((j8 * Math.max((f7 / this.f1316r) - mo2045a, 0.0f)) / f7);
    }

    /* renamed from: J */
    public final long m1398J(long j7, long j8) {
        if (j7 == -9223372036854775807L) {
            return this.f1307i;
        }
        if (j8 != -9223372036854775807L) {
            j7 -= j8;
        }
        return Math.min((long) (j7 * this.f1313o), this.f1307i);
    }

    /* renamed from: K */
    public boolean m1399K(long j7, List list) {
        long j8 = this.f1319u;
        return j8 == -9223372036854775807L || j7 - j8 >= 1000 || !(list.isEmpty() || ((AbstractC0220m) AbstractC2987A.m10751d(list)).equals(this.f1320v));
    }

    @Override // p043G0.AbstractC0353c, p043G0.InterfaceC0375y
    /* renamed from: h */
    public void mo394h() {
        this.f1320v = null;
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: k */
    public int mo397k() {
        return this.f1317s;
    }

    @Override // p043G0.AbstractC0353c, p043G0.InterfaceC0375y
    /* renamed from: m */
    public void mo399m() {
        this.f1319u = -9223372036854775807L;
        this.f1320v = null;
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: n */
    public void mo400n(long j7, long j8, long j9, List list, InterfaceC0221n[] interfaceC0221nArr) {
        long mo21613b = this.f1315q.mo21613b();
        long m1396F = m1396F(interfaceC0221nArr, list);
        int i7 = this.f1318t;
        if (i7 == 0) {
            this.f1318t = 1;
            this.f1317s = m1392A(mo21613b, m1396F);
            return;
        }
        int i8 = this.f1317s;
        int mo392d = list.isEmpty() ? -1 : mo392d(((AbstractC0220m) AbstractC2987A.m10751d(list)).f875d);
        if (mo392d != -1) {
            i7 = ((AbstractC0220m) AbstractC2987A.m10751d(list)).f876e;
            i8 = mo392d;
        }
        int m1392A = m1392A(mo21613b, m1396F);
        if (m1392A != i8 && !mo395i(i8, mo21613b)) {
            C4327q mo390b = mo390b(i8);
            C4327q mo390b2 = mo390b(m1392A);
            long m1398J = m1398J(j9, m1396F);
            int i9 = mo390b2.f15133i;
            int i10 = mo390b.f15133i;
            if ((i9 > i10 && j8 < m1398J) || (i9 < i10 && j8 >= this.f1308j)) {
                m1392A = i8;
            }
        }
        if (m1392A != i8) {
            i7 = 3;
        }
        this.f1318t = i7;
        this.f1317s = m1392A;
    }

    @Override // p043G0.AbstractC0353c, p043G0.InterfaceC0375y
    /* renamed from: o */
    public int mo401o(long j7, List list) {
        int i7;
        int i8;
        long mo21613b = this.f1315q.mo21613b();
        if (!m1399K(mo21613b, list)) {
            return list.size();
        }
        this.f1319u = mo21613b;
        this.f1320v = list.isEmpty() ? null : (AbstractC0220m) AbstractC2987A.m10751d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m21751j0 = AbstractC5330M.m21751j0(((AbstractC0220m) list.get(size - 1)).f878g - j7, this.f1316r);
        long m1395E = m1395E();
        if (m21751j0 < m1395E) {
            return size;
        }
        C4327q mo390b = mo390b(m1392A(mo21613b, m1394D(list)));
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC0220m abstractC0220m = (AbstractC0220m) list.get(i9);
            C4327q c4327q = abstractC0220m.f875d;
            if (AbstractC5330M.m21751j0(abstractC0220m.f878g - j7, this.f1316r) >= m1395E && c4327q.f15133i < mo390b.f15133i && (i7 = c4327q.f15145u) != -1 && i7 <= this.f1311m && (i8 = c4327q.f15144t) != -1 && i8 <= this.f1310l && i7 < mo390b.f15145u) {
                return i9;
            }
        }
        return size;
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: r */
    public int mo404r() {
        return this.f1318t;
    }

    @Override // p043G0.AbstractC0353c, p043G0.InterfaceC0375y
    /* renamed from: t */
    public void mo406t(float f7) {
        this.f1316r = f7;
    }

    @Override // p043G0.InterfaceC0375y
    /* renamed from: u */
    public Object mo407u() {
        return null;
    }

    /* renamed from: z */
    public boolean m1400z(C4327q c4327q, int i7, long j7) {
        return ((long) i7) <= j7;
    }
}

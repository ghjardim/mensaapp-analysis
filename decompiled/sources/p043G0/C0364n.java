package p043G0;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.common.api.C3643a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
import p022D0.C0165m0;
import p022D0.InterfaceC0120F;
import p043G0.AbstractC0346A;
import p043G0.C0351a;
import p043G0.C0364n;
import p043G0.InterfaceC0375y;
import p171Y2.InterfaceC2933p;
import p178Z2.AbstractC2999M;
import p178Z2.AbstractC3025n;
import p178Z2.AbstractC3033v;
import p207d.AbstractC4094d;
import p232g0.AbstractC4303I;
import p232g0.C4304J;
import p232g0.C4305K;
import p232g0.C4312b;
import p232g0.C4327q;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p292n0.AbstractC5705W0;
import p292n0.C5709Y0;
import p292n0.InterfaceC5703V0;
import p292n0.InterfaceC5707X0;
import p311p0.ExecutorC6065Z;

/* renamed from: G0.n */
/* loaded from: classes.dex */
public class C0364n extends AbstractC0346A implements InterfaceC5707X0.a {

    /* renamed from: k */
    public static final AbstractC2999M f1349k = AbstractC2999M.m10842b(new Comparator() { // from class: G0.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m1419P;
            m1419P = C0364n.m1419P((Integer) obj, (Integer) obj2);
            return m1419P;
        }
    });

    /* renamed from: d */
    public final Object f1350d;

    /* renamed from: e */
    public final Context f1351e;

    /* renamed from: f */
    public final InterfaceC0375y.b f1352f;

    /* renamed from: g */
    public final boolean f1353g;

    /* renamed from: h */
    public e f1354h;

    /* renamed from: i */
    public g f1355i;

    /* renamed from: j */
    public C4312b f1356j;

    /* renamed from: G0.n$b */
    public static final class b extends i implements Comparable {

        /* renamed from: A */
        public final int f1357A;

        /* renamed from: B */
        public final int f1358B;

        /* renamed from: C */
        public final boolean f1359C;

        /* renamed from: D */
        public final boolean f1360D;

        /* renamed from: e */
        public final int f1361e;

        /* renamed from: f */
        public final boolean f1362f;

        /* renamed from: n */
        public final String f1363n;

        /* renamed from: o */
        public final e f1364o;

        /* renamed from: p */
        public final boolean f1365p;

        /* renamed from: q */
        public final int f1366q;

        /* renamed from: r */
        public final int f1367r;

        /* renamed from: s */
        public final int f1368s;

        /* renamed from: t */
        public final boolean f1369t;

        /* renamed from: u */
        public final boolean f1370u;

        /* renamed from: v */
        public final int f1371v;

        /* renamed from: w */
        public final int f1372w;

        /* renamed from: x */
        public final boolean f1373x;

        /* renamed from: y */
        public final int f1374y;

        /* renamed from: z */
        public final int f1375z;

        public b(int i7, C4304J c4304j, int i8, e eVar, int i9, boolean z6, InterfaceC2933p interfaceC2933p, int i10) {
            super(i7, c4304j, i8);
            int i11;
            int i12;
            int i13;
            this.f1364o = eVar;
            int i14 = eVar.f1410s0 ? 24 : 16;
            this.f1369t = eVar.f1406o0 && (i10 & i14) != 0;
            this.f1363n = C0364n.m1422U(this.f1453d.f15128d);
            this.f1365p = AbstractC5705W0.m23928k(i9, false);
            int i15 = 0;
            while (true) {
                int size = eVar.f14903n.size();
                i11 = C3643a.e.API_PRIORITY_OTHER;
                if (i15 >= size) {
                    i12 = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    i12 = C0364n.m1410E(this.f1453d, (String) eVar.f14903n.get(i15), false);
                    if (i12 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f1367r = i15;
            this.f1366q = i12;
            this.f1368s = C0364n.m1413H(this.f1453d.f15130f, eVar.f14904o);
            C4327q c4327q = this.f1453d;
            int i16 = c4327q.f15130f;
            this.f1370u = i16 == 0 || (i16 & 1) != 0;
            this.f1373x = (c4327q.f15129e & 1) != 0;
            int i17 = c4327q.f15114B;
            this.f1374y = i17;
            this.f1375z = c4327q.f15115C;
            int i18 = c4327q.f15133i;
            this.f1357A = i18;
            this.f1362f = (i18 == -1 || i18 <= eVar.f14906q) && (i17 == -1 || i17 <= eVar.f14905p) && interfaceC2933p.apply(c4327q);
            String[] m21763n0 = AbstractC5330M.m21763n0();
            int i19 = 0;
            while (true) {
                if (i19 >= m21763n0.length) {
                    i13 = 0;
                    i19 = Integer.MAX_VALUE;
                    break;
                } else {
                    i13 = C0364n.m1410E(this.f1453d, m21763n0[i19], false);
                    if (i13 > 0) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.f1371v = i19;
            this.f1372w = i13;
            int i20 = 0;
            while (true) {
                if (i20 < eVar.f14907r.size()) {
                    String str = this.f1453d.f15138n;
                    if (str != null && str.equals(eVar.f14907r.get(i20))) {
                        i11 = i20;
                        break;
                    }
                    i20++;
                } else {
                    break;
                }
            }
            this.f1358B = i11;
            this.f1359C = AbstractC5705W0.m23924g(i9) == 128;
            this.f1360D = AbstractC5705W0.m23926i(i9) == 64;
            this.f1361e = m1453j(i9, z6, i14);
        }

        /* renamed from: g */
        public static int m1448g(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        /* renamed from: i */
        public static AbstractC3033v m1449i(int i7, C4304J c4304j, e eVar, int[] iArr, boolean z6, InterfaceC2933p interfaceC2933p, int i8) {
            AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
            for (int i9 = 0; i9 < c4304j.f14850a; i9++) {
                m11045m.mo11040a(new b(i7, c4304j, i9, eVar, iArr[i9], z6, interfaceC2933p, i8));
            }
            return m11045m.m11063k();
        }

        @Override // p043G0.C0364n.i
        /* renamed from: b */
        public int mo1450b() {
            return this.f1361e;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            AbstractC2999M mo10834g = (this.f1362f && this.f1365p) ? C0364n.f1349k : C0364n.f1349k.mo10834g();
            AbstractC3025n mo11020f = AbstractC3025n.m11017j().mo11021g(this.f1365p, bVar.f1365p).mo11020f(Integer.valueOf(this.f1367r), Integer.valueOf(bVar.f1367r), AbstractC2999M.m10843d().mo10834g()).mo11018d(this.f1366q, bVar.f1366q).mo11018d(this.f1368s, bVar.f1368s).mo11021g(this.f1373x, bVar.f1373x).mo11021g(this.f1370u, bVar.f1370u).mo11020f(Integer.valueOf(this.f1371v), Integer.valueOf(bVar.f1371v), AbstractC2999M.m10843d().mo10834g()).mo11018d(this.f1372w, bVar.f1372w).mo11021g(this.f1362f, bVar.f1362f).mo11020f(Integer.valueOf(this.f1358B), Integer.valueOf(bVar.f1358B), AbstractC2999M.m10843d().mo10834g());
            if (this.f1364o.f14914y) {
                mo11020f = mo11020f.mo11020f(Integer.valueOf(this.f1357A), Integer.valueOf(bVar.f1357A), C0364n.f1349k.mo10834g());
            }
            AbstractC3025n mo11020f2 = mo11020f.mo11021g(this.f1359C, bVar.f1359C).mo11021g(this.f1360D, bVar.f1360D).mo11020f(Integer.valueOf(this.f1374y), Integer.valueOf(bVar.f1374y), mo10834g).mo11020f(Integer.valueOf(this.f1375z), Integer.valueOf(bVar.f1375z), mo10834g);
            if (AbstractC5330M.m21729c(this.f1363n, bVar.f1363n)) {
                mo11020f2 = mo11020f2.mo11020f(Integer.valueOf(this.f1357A), Integer.valueOf(bVar.f1357A), mo10834g);
            }
            return mo11020f2.mo11023i();
        }

        /* renamed from: j */
        public final int m1453j(int i7, boolean z6, int i8) {
            if (!AbstractC5705W0.m23928k(i7, this.f1364o.f1412u0)) {
                return 0;
            }
            if (!this.f1362f && !this.f1364o.f1405n0) {
                return 0;
            }
            e eVar = this.f1364o;
            if (eVar.f14908s.f14920a == 2 && !C0364n.m1423V(eVar, i7, this.f1453d)) {
                return 0;
            }
            if (AbstractC5705W0.m23928k(i7, false) && this.f1362f && this.f1453d.f15133i != -1) {
                e eVar2 = this.f1364o;
                if (!eVar2.f14915z && !eVar2.f14914y && ((eVar2.f1414w0 || !z6) && eVar2.f14908s.f14920a != 2 && (i7 & i8) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p043G0.C0364n.i
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo1451f(b bVar) {
            int i7;
            String str;
            int i8;
            if ((this.f1364o.f1408q0 || ((i8 = this.f1453d.f15114B) != -1 && i8 == bVar.f1453d.f15114B)) && (this.f1369t || ((str = this.f1453d.f15138n) != null && TextUtils.equals(str, bVar.f1453d.f15138n)))) {
                e eVar = this.f1364o;
                if ((eVar.f1407p0 || ((i7 = this.f1453d.f15115C) != -1 && i7 == bVar.f1453d.f15115C)) && (eVar.f1409r0 || (this.f1359C == bVar.f1359C && this.f1360D == bVar.f1360D))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: G0.n$c */
    public static final class c extends i implements Comparable {

        /* renamed from: e */
        public final int f1376e;

        /* renamed from: f */
        public final int f1377f;

        public c(int i7, C4304J c4304j, int i8, e eVar, int i9) {
            super(i7, c4304j, i8);
            this.f1376e = AbstractC5705W0.m23928k(i9, eVar.f1412u0) ? 1 : 0;
            this.f1377f = this.f1453d.m18195d();
        }

        /* renamed from: g */
        public static int m1455g(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        /* renamed from: i */
        public static AbstractC3033v m1456i(int i7, C4304J c4304j, e eVar, int[] iArr) {
            AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
            for (int i8 = 0; i8 < c4304j.f14850a; i8++) {
                m11045m.mo11040a(new c(i7, c4304j, i8, eVar, iArr[i8]));
            }
            return m11045m.m11063k();
        }

        @Override // p043G0.C0364n.i
        /* renamed from: b */
        public int mo1450b() {
            return this.f1376e;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f1377f, cVar.f1377f);
        }

        @Override // p043G0.C0364n.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo1451f(c cVar) {
            return false;
        }
    }

    /* renamed from: G0.n$d */
    public static final class d implements Comparable {

        /* renamed from: a */
        public final boolean f1378a;

        /* renamed from: b */
        public final boolean f1379b;

        public d(C4327q c4327q, int i7) {
            this.f1378a = (c4327q.f15129e & 1) != 0;
            this.f1379b = AbstractC5705W0.m23928k(i7, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return AbstractC3025n.m11017j().mo11021g(this.f1379b, dVar.f1379b).mo11021g(this.f1378a, dVar.f1378a).mo11023i();
        }
    }

    /* renamed from: G0.n$e */
    public static final class e extends C4305K {

        /* renamed from: A0 */
        public static final e f1380A0;

        /* renamed from: B0 */
        public static final e f1381B0;

        /* renamed from: C0 */
        public static final String f1382C0;

        /* renamed from: D0 */
        public static final String f1383D0;

        /* renamed from: E0 */
        public static final String f1384E0;

        /* renamed from: F0 */
        public static final String f1385F0;

        /* renamed from: G0 */
        public static final String f1386G0;

        /* renamed from: H0 */
        public static final String f1387H0;

        /* renamed from: I0 */
        public static final String f1388I0;

        /* renamed from: J0 */
        public static final String f1389J0;

        /* renamed from: K0 */
        public static final String f1390K0;

        /* renamed from: L0 */
        public static final String f1391L0;

        /* renamed from: M0 */
        public static final String f1392M0;

        /* renamed from: N0 */
        public static final String f1393N0;

        /* renamed from: O0 */
        public static final String f1394O0;

        /* renamed from: P0 */
        public static final String f1395P0;

        /* renamed from: Q0 */
        public static final String f1396Q0;

        /* renamed from: R0 */
        public static final String f1397R0;

        /* renamed from: S0 */
        public static final String f1398S0;

        /* renamed from: T0 */
        public static final String f1399T0;

        /* renamed from: U0 */
        public static final String f1400U0;

        /* renamed from: j0 */
        public final boolean f1401j0;

        /* renamed from: k0 */
        public final boolean f1402k0;

        /* renamed from: l0 */
        public final boolean f1403l0;

        /* renamed from: m0 */
        public final boolean f1404m0;

        /* renamed from: n0 */
        public final boolean f1405n0;

        /* renamed from: o0 */
        public final boolean f1406o0;

        /* renamed from: p0 */
        public final boolean f1407p0;

        /* renamed from: q0 */
        public final boolean f1408q0;

        /* renamed from: r0 */
        public final boolean f1409r0;

        /* renamed from: s0 */
        public final boolean f1410s0;

        /* renamed from: t0 */
        public final boolean f1411t0;

        /* renamed from: u0 */
        public final boolean f1412u0;

        /* renamed from: v0 */
        public final boolean f1413v0;

        /* renamed from: w0 */
        public final boolean f1414w0;

        /* renamed from: x0 */
        public final boolean f1415x0;

        /* renamed from: y0 */
        public final SparseArray f1416y0;

        /* renamed from: z0 */
        public final SparseBooleanArray f1417z0;

        /* renamed from: G0.n$e$a */
        public static final class a extends C4305K.c {

            /* renamed from: C */
            public boolean f1418C;

            /* renamed from: D */
            public boolean f1419D;

            /* renamed from: E */
            public boolean f1420E;

            /* renamed from: F */
            public boolean f1421F;

            /* renamed from: G */
            public boolean f1422G;

            /* renamed from: H */
            public boolean f1423H;

            /* renamed from: I */
            public boolean f1424I;

            /* renamed from: J */
            public boolean f1425J;

            /* renamed from: K */
            public boolean f1426K;

            /* renamed from: L */
            public boolean f1427L;

            /* renamed from: M */
            public boolean f1428M;

            /* renamed from: N */
            public boolean f1429N;

            /* renamed from: O */
            public boolean f1430O;

            /* renamed from: P */
            public boolean f1431P;

            /* renamed from: Q */
            public boolean f1432Q;

            /* renamed from: R */
            public final SparseArray f1433R;

            /* renamed from: S */
            public final SparseBooleanArray f1434S;

            /* renamed from: a0 */
            public static SparseArray m1487a0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                    sparseArray2.put(sparseArray.keyAt(i7), new HashMap((Map) sparseArray.valueAt(i7)));
                }
                return sparseArray2;
            }

            @Override // p232g0.C4305K.c
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public e mo1488C() {
                return new e(this);
            }

            /* renamed from: b0 */
            public final void m1493b0() {
                this.f1418C = true;
                this.f1419D = false;
                this.f1420E = true;
                this.f1421F = false;
                this.f1422G = true;
                this.f1423H = false;
                this.f1424I = false;
                this.f1425J = false;
                this.f1426K = false;
                this.f1427L = true;
                this.f1428M = true;
                this.f1429N = true;
                this.f1430O = false;
                this.f1431P = true;
                this.f1432Q = false;
            }

            /* renamed from: c0 */
            public a m1494c0(C4305K c4305k) {
                super.m18100E(c4305k);
                return this;
            }

            @Override // p232g0.C4305K.c
            /* renamed from: d0, reason: merged with bridge method [inline-methods] */
            public a mo1489F(Context context) {
                super.mo1489F(context);
                return this;
            }

            @Override // p232g0.C4305K.c
            /* renamed from: e0, reason: merged with bridge method [inline-methods] */
            public a mo1490G(int i7, int i8, boolean z6) {
                super.mo1490G(i7, i8, z6);
                return this;
            }

            @Override // p232g0.C4305K.c
            /* renamed from: f0, reason: merged with bridge method [inline-methods] */
            public a mo1491H(Context context, boolean z6) {
                super.mo1491H(context, z6);
                return this;
            }

            public a() {
                this.f1433R = new SparseArray();
                this.f1434S = new SparseBooleanArray();
                m1493b0();
            }

            public a(Context context) {
                super(context);
                this.f1433R = new SparseArray();
                this.f1434S = new SparseBooleanArray();
                m1493b0();
            }

            public a(e eVar) {
                super(eVar);
                this.f1418C = eVar.f1401j0;
                this.f1419D = eVar.f1402k0;
                this.f1420E = eVar.f1403l0;
                this.f1421F = eVar.f1404m0;
                this.f1422G = eVar.f1405n0;
                this.f1423H = eVar.f1406o0;
                this.f1424I = eVar.f1407p0;
                this.f1425J = eVar.f1408q0;
                this.f1426K = eVar.f1409r0;
                this.f1427L = eVar.f1410s0;
                this.f1428M = eVar.f1411t0;
                this.f1429N = eVar.f1412u0;
                this.f1430O = eVar.f1413v0;
                this.f1431P = eVar.f1414w0;
                this.f1432Q = eVar.f1415x0;
                this.f1433R = m1487a0(eVar.f1416y0);
                this.f1434S = eVar.f1417z0.clone();
            }
        }

        static {
            e mo1488C = new a().mo1488C();
            f1380A0 = mo1488C;
            f1381B0 = mo1488C;
            f1382C0 = AbstractC5330M.m21783x0(PipesIterator.DEFAULT_QUEUE_SIZE);
            f1383D0 = AbstractC5330M.m21783x0(1001);
            f1384E0 = AbstractC5330M.m21783x0(1002);
            f1385F0 = AbstractC5330M.m21783x0(1003);
            f1386G0 = AbstractC5330M.m21783x0(1004);
            f1387H0 = AbstractC5330M.m21783x0(1005);
            f1388I0 = AbstractC5330M.m21783x0(1006);
            f1389J0 = AbstractC5330M.m21783x0(1007);
            f1390K0 = AbstractC5330M.m21783x0(1008);
            f1391L0 = AbstractC5330M.m21783x0(1009);
            f1392M0 = AbstractC5330M.m21783x0(1010);
            f1393N0 = AbstractC5330M.m21783x0(1011);
            f1394O0 = AbstractC5330M.m21783x0(1012);
            f1395P0 = AbstractC5330M.m21783x0(1013);
            f1396Q0 = AbstractC5330M.m21783x0(1014);
            f1397R0 = AbstractC5330M.m21783x0(1015);
            f1398S0 = AbstractC5330M.m21783x0(1016);
            f1399T0 = AbstractC5330M.m21783x0(1017);
            f1400U0 = AbstractC5330M.m21783x0(1018);
        }

        /* renamed from: c */
        public static boolean m1462c(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public static boolean m1463d(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i7));
                if (indexOfKey < 0 || !m1464e((Map) sparseArray.valueAt(i7), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public static boolean m1464e(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                C0165m0 c0165m0 = (C0165m0) entry.getKey();
                if (!map2.containsKey(c0165m0) || !AbstractC5330M.m21729c(entry.getValue(), map2.get(c0165m0))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public static e m1465g(Context context) {
            return new a(context).mo1488C();
        }

        @Override // p232g0.C4305K
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return super.equals(eVar) && this.f1401j0 == eVar.f1401j0 && this.f1402k0 == eVar.f1402k0 && this.f1403l0 == eVar.f1403l0 && this.f1404m0 == eVar.f1404m0 && this.f1405n0 == eVar.f1405n0 && this.f1406o0 == eVar.f1406o0 && this.f1407p0 == eVar.f1407p0 && this.f1408q0 == eVar.f1408q0 && this.f1409r0 == eVar.f1409r0 && this.f1410s0 == eVar.f1410s0 && this.f1411t0 == eVar.f1411t0 && this.f1412u0 == eVar.f1412u0 && this.f1413v0 == eVar.f1413v0 && this.f1414w0 == eVar.f1414w0 && this.f1415x0 == eVar.f1415x0 && m1462c(this.f1417z0, eVar.f1417z0) && m1463d(this.f1416y0, eVar.f1416y0);
        }

        /* renamed from: f */
        public a m1466f() {
            return new a();
        }

        /* renamed from: h */
        public boolean m1467h(int i7) {
            return this.f1417z0.get(i7);
        }

        @Override // p232g0.C4305K
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f1401j0 ? 1 : 0)) * 31) + (this.f1402k0 ? 1 : 0)) * 31) + (this.f1403l0 ? 1 : 0)) * 31) + (this.f1404m0 ? 1 : 0)) * 31) + (this.f1405n0 ? 1 : 0)) * 31) + (this.f1406o0 ? 1 : 0)) * 31) + (this.f1407p0 ? 1 : 0)) * 31) + (this.f1408q0 ? 1 : 0)) * 31) + (this.f1409r0 ? 1 : 0)) * 31) + (this.f1410s0 ? 1 : 0)) * 31) + (this.f1411t0 ? 1 : 0)) * 31) + (this.f1412u0 ? 1 : 0)) * 31) + (this.f1413v0 ? 1 : 0)) * 31) + (this.f1414w0 ? 1 : 0)) * 31) + (this.f1415x0 ? 1 : 0);
        }

        /* renamed from: i */
        public f m1468i(int i7, C0165m0 c0165m0) {
            Map map = (Map) this.f1416y0.get(i7);
            if (map == null) {
                return null;
            }
            AbstractC4094d.m17162a(map.get(c0165m0));
            return null;
        }

        /* renamed from: j */
        public boolean m1469j(int i7, C0165m0 c0165m0) {
            Map map = (Map) this.f1416y0.get(i7);
            return map != null && map.containsKey(c0165m0);
        }

        public e(a aVar) {
            super(aVar);
            this.f1401j0 = aVar.f1418C;
            this.f1402k0 = aVar.f1419D;
            this.f1403l0 = aVar.f1420E;
            this.f1404m0 = aVar.f1421F;
            this.f1405n0 = aVar.f1422G;
            this.f1406o0 = aVar.f1423H;
            this.f1407p0 = aVar.f1424I;
            this.f1408q0 = aVar.f1425J;
            this.f1409r0 = aVar.f1426K;
            this.f1410s0 = aVar.f1427L;
            this.f1411t0 = aVar.f1428M;
            this.f1412u0 = aVar.f1429N;
            this.f1413v0 = aVar.f1430O;
            this.f1414w0 = aVar.f1431P;
            this.f1415x0 = aVar.f1432Q;
            this.f1416y0 = aVar.f1433R;
            this.f1417z0 = aVar.f1434S;
        }
    }

    /* renamed from: G0.n$f */
    public static final class f {
    }

    /* renamed from: G0.n$g */
    public static class g {

        /* renamed from: a */
        public final Spatializer f1435a;

        /* renamed from: b */
        public final boolean f1436b;

        /* renamed from: c */
        public Handler f1437c;

        /* renamed from: d */
        public Spatializer$OnSpatializerStateChangedListener f1438d;

        /* renamed from: G0.n$g$a */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a */
            public final /* synthetic */ C0364n f1439a;

            public a(C0364n c0364n) {
                this.f1439a = c0364n;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z6) {
                this.f1439a.m1438S();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z6) {
                this.f1439a.m1438S();
            }
        }

        public g(Spatializer spatializer) {
            int immersiveAudioLevel;
            this.f1435a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.f1436b = immersiveAudioLevel != 0;
        }

        /* renamed from: g */
        public static g m1498g(Context context) {
            Spatializer spatializer;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            spatializer = audioManager.getSpatializer();
            return new g(spatializer);
        }

        /* renamed from: a */
        public boolean m1499a(C4312b c4312b, C4327q c4327q) {
            boolean canBeSpatialized;
            int m21697N = AbstractC5330M.m21697N(("audio/eac3-joc".equals(c4327q.f15138n) && c4327q.f15114B == 16) ? 12 : c4327q.f15114B);
            if (m21697N == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(m21697N);
            int i7 = c4327q.f15115C;
            if (i7 != -1) {
                channelMask.setSampleRate(i7);
            }
            canBeSpatialized = this.f1435a.canBeSpatialized(c4312b.m18123a().f15018a, channelMask.build());
            return canBeSpatialized;
        }

        /* renamed from: b */
        public void m1500b(C0364n c0364n, Looper looper) {
            if (this.f1438d == null && this.f1437c == null) {
                this.f1438d = new a(c0364n);
                Handler handler = new Handler(looper);
                this.f1437c = handler;
                Spatializer spatializer = this.f1435a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new ExecutorC6065Z(handler), this.f1438d);
            }
        }

        /* renamed from: c */
        public boolean m1501c() {
            boolean isAvailable;
            isAvailable = this.f1435a.isAvailable();
            return isAvailable;
        }

        /* renamed from: d */
        public boolean m1502d() {
            boolean isEnabled;
            isEnabled = this.f1435a.isEnabled();
            return isEnabled;
        }

        /* renamed from: e */
        public boolean m1503e() {
            return this.f1436b;
        }

        /* renamed from: f */
        public void m1504f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f1438d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f1437c == null) {
                return;
            }
            this.f1435a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) AbstractC5330M.m21747i(this.f1437c)).removeCallbacksAndMessages(null);
            this.f1437c = null;
            this.f1438d = null;
        }
    }

    /* renamed from: G0.n$h */
    public static final class h extends i implements Comparable {

        /* renamed from: e */
        public final int f1441e;

        /* renamed from: f */
        public final boolean f1442f;

        /* renamed from: n */
        public final boolean f1443n;

        /* renamed from: o */
        public final boolean f1444o;

        /* renamed from: p */
        public final int f1445p;

        /* renamed from: q */
        public final int f1446q;

        /* renamed from: r */
        public final int f1447r;

        /* renamed from: s */
        public final int f1448s;

        /* renamed from: t */
        public final boolean f1449t;

        public h(int i7, C4304J c4304j, int i8, e eVar, int i9, String str) {
            super(i7, c4304j, i8);
            int i10;
            int i11 = 0;
            this.f1442f = AbstractC5705W0.m23928k(i9, false);
            int i12 = this.f1453d.f15129e & (~eVar.f14911v);
            this.f1443n = (i12 & 1) != 0;
            this.f1444o = (i12 & 2) != 0;
            AbstractC3033v m11051u = eVar.f14909t.isEmpty() ? AbstractC3033v.m11051u(StringUtils.EMPTY) : eVar.f14909t;
            int i13 = 0;
            while (true) {
                if (i13 >= m11051u.size()) {
                    i13 = C3643a.e.API_PRIORITY_OTHER;
                    i10 = 0;
                    break;
                } else {
                    i10 = C0364n.m1410E(this.f1453d, (String) m11051u.get(i13), eVar.f14912w);
                    if (i10 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f1445p = i13;
            this.f1446q = i10;
            int m1413H = C0364n.m1413H(this.f1453d.f15130f, eVar.f14910u);
            this.f1447r = m1413H;
            this.f1449t = (this.f1453d.f15130f & 1088) != 0;
            int m1410E = C0364n.m1410E(this.f1453d, str, C0364n.m1422U(str) == null);
            this.f1448s = m1410E;
            boolean z6 = i10 > 0 || (eVar.f14909t.isEmpty() && m1413H > 0) || this.f1443n || (this.f1444o && m1410E > 0);
            if (AbstractC5705W0.m23928k(i9, eVar.f1412u0) && z6) {
                i11 = 1;
            }
            this.f1441e = i11;
        }

        /* renamed from: g */
        public static int m1505g(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        /* renamed from: i */
        public static AbstractC3033v m1506i(int i7, C4304J c4304j, e eVar, int[] iArr, String str) {
            AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
            for (int i8 = 0; i8 < c4304j.f14850a; i8++) {
                m11045m.mo11040a(new h(i7, c4304j, i8, eVar, iArr[i8], str));
            }
            return m11045m.m11063k();
        }

        @Override // p043G0.C0364n.i
        /* renamed from: b */
        public int mo1450b() {
            return this.f1441e;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            AbstractC3025n mo11018d = AbstractC3025n.m11017j().mo11021g(this.f1442f, hVar.f1442f).mo11020f(Integer.valueOf(this.f1445p), Integer.valueOf(hVar.f1445p), AbstractC2999M.m10843d().mo10834g()).mo11018d(this.f1446q, hVar.f1446q).mo11018d(this.f1447r, hVar.f1447r).mo11021g(this.f1443n, hVar.f1443n).mo11020f(Boolean.valueOf(this.f1444o), Boolean.valueOf(hVar.f1444o), this.f1446q == 0 ? AbstractC2999M.m10843d() : AbstractC2999M.m10843d().mo10834g()).mo11018d(this.f1448s, hVar.f1448s);
            if (this.f1447r == 0) {
                mo11018d = mo11018d.mo11022h(this.f1449t, hVar.f1449t);
            }
            return mo11018d.mo11023i();
        }

        @Override // p043G0.C0364n.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo1451f(h hVar) {
            return false;
        }
    }

    /* renamed from: G0.n$i */
    public static abstract class i {

        /* renamed from: a */
        public final int f1450a;

        /* renamed from: b */
        public final C4304J f1451b;

        /* renamed from: c */
        public final int f1452c;

        /* renamed from: d */
        public final C4327q f1453d;

        /* renamed from: G0.n$i$a */
        public interface a {
            /* renamed from: a */
            List mo1405a(int i7, C4304J c4304j, int[] iArr);
        }

        public i(int i7, C4304J c4304j, int i8) {
            this.f1450a = i7;
            this.f1451b = c4304j;
            this.f1452c = i8;
            this.f1453d = c4304j.m18064a(i8);
        }

        /* renamed from: b */
        public abstract int mo1450b();

        /* renamed from: f */
        public abstract boolean mo1451f(i iVar);
    }

    /* renamed from: G0.n$j */
    public static final class j extends i {

        /* renamed from: e */
        public final boolean f1454e;

        /* renamed from: f */
        public final e f1455f;

        /* renamed from: n */
        public final boolean f1456n;

        /* renamed from: o */
        public final boolean f1457o;

        /* renamed from: p */
        public final boolean f1458p;

        /* renamed from: q */
        public final int f1459q;

        /* renamed from: r */
        public final int f1460r;

        /* renamed from: s */
        public final int f1461s;

        /* renamed from: t */
        public final int f1462t;

        /* renamed from: u */
        public final boolean f1463u;

        /* renamed from: v */
        public final boolean f1464v;

        /* renamed from: w */
        public final int f1465w;

        /* renamed from: x */
        public final boolean f1466x;

        /* renamed from: y */
        public final boolean f1467y;

        /* renamed from: z */
        public final int f1468z;

        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00d9 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(int r5, p232g0.C4304J r6, int r7, p043G0.C0364n.e r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p043G0.C0364n.j.<init>(int, g0.J, int, G0.n$e, int, int, boolean):void");
        }

        /* renamed from: i */
        public static int m1511i(j jVar, j jVar2) {
            AbstractC3025n mo11021g = AbstractC3025n.m11017j().mo11021g(jVar.f1457o, jVar2.f1457o).mo11018d(jVar.f1462t, jVar2.f1462t).mo11021g(jVar.f1463u, jVar2.f1463u).mo11021g(jVar.f1458p, jVar2.f1458p).mo11021g(jVar.f1454e, jVar2.f1454e).mo11021g(jVar.f1456n, jVar2.f1456n).mo11020f(Integer.valueOf(jVar.f1461s), Integer.valueOf(jVar2.f1461s), AbstractC2999M.m10843d().mo10834g()).mo11021g(jVar.f1466x, jVar2.f1466x).mo11021g(jVar.f1467y, jVar2.f1467y);
            if (jVar.f1466x && jVar.f1467y) {
                mo11021g = mo11021g.mo11018d(jVar.f1468z, jVar2.f1468z);
            }
            return mo11021g.mo11023i();
        }

        /* renamed from: j */
        public static int m1512j(j jVar, j jVar2) {
            AbstractC2999M mo10834g = (jVar.f1454e && jVar.f1457o) ? C0364n.f1349k : C0364n.f1349k.mo10834g();
            AbstractC3025n m11017j = AbstractC3025n.m11017j();
            if (jVar.f1455f.f14914y) {
                m11017j = m11017j.mo11020f(Integer.valueOf(jVar.f1459q), Integer.valueOf(jVar2.f1459q), C0364n.f1349k.mo10834g());
            }
            return m11017j.mo11020f(Integer.valueOf(jVar.f1460r), Integer.valueOf(jVar2.f1460r), mo10834g).mo11020f(Integer.valueOf(jVar.f1459q), Integer.valueOf(jVar2.f1459q), mo10834g).mo11023i();
        }

        /* renamed from: k */
        public static int m1513k(List list, List list2) {
            return AbstractC3025n.m11017j().mo11020f((j) Collections.max(list, new Comparator() { // from class: G0.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m1511i;
                    m1511i = C0364n.j.m1511i((C0364n.j) obj, (C0364n.j) obj2);
                    return m1511i;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: G0.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m1511i;
                    m1511i = C0364n.j.m1511i((C0364n.j) obj, (C0364n.j) obj2);
                    return m1511i;
                }
            }), new Comparator() { // from class: G0.v
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m1511i;
                    m1511i = C0364n.j.m1511i((C0364n.j) obj, (C0364n.j) obj2);
                    return m1511i;
                }
            }).mo11018d(list.size(), list2.size()).mo11020f((j) Collections.max(list, new Comparator() { // from class: G0.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m1512j;
                    m1512j = C0364n.j.m1512j((C0364n.j) obj, (C0364n.j) obj2);
                    return m1512j;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: G0.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m1512j;
                    m1512j = C0364n.j.m1512j((C0364n.j) obj, (C0364n.j) obj2);
                    return m1512j;
                }
            }), new Comparator() { // from class: G0.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m1512j;
                    m1512j = C0364n.j.m1512j((C0364n.j) obj, (C0364n.j) obj2);
                    return m1512j;
                }
            }).mo11023i();
        }

        /* renamed from: l */
        public static AbstractC3033v m1514l(int i7, C4304J c4304j, e eVar, int[] iArr, int i8) {
            int m1411F = C0364n.m1411F(c4304j, eVar.f14898i, eVar.f14899j, eVar.f14900k);
            AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
            for (int i9 = 0; i9 < c4304j.f14850a; i9++) {
                int m18195d = c4304j.m18064a(i9).m18195d();
                m11045m.mo11040a(new j(i7, c4304j, i9, eVar, iArr[i9], i8, m1411F == Integer.MAX_VALUE || (m18195d != -1 && m18195d <= m1411F)));
            }
            return m11045m.m11063k();
        }

        @Override // p043G0.C0364n.i
        /* renamed from: b */
        public int mo1450b() {
            return this.f1465w;
        }

        /* renamed from: m */
        public final int m1515m(int i7, int i8) {
            if ((this.f1453d.f15130f & 16384) != 0 || !AbstractC5705W0.m23928k(i7, this.f1455f.f1412u0)) {
                return 0;
            }
            if (!this.f1454e && !this.f1455f.f1401j0) {
                return 0;
            }
            if (AbstractC5705W0.m23928k(i7, false) && this.f1456n && this.f1454e && this.f1453d.f15133i != -1) {
                e eVar = this.f1455f;
                if (!eVar.f14915z && !eVar.f14914y && (i7 & i8) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p043G0.C0364n.i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean mo1451f(j jVar) {
            return (this.f1464v || AbstractC5330M.m21729c(this.f1453d.f15138n, jVar.f1453d.f15138n)) && (this.f1455f.f1404m0 || (this.f1466x == jVar.f1466x && this.f1467y == jVar.f1467y));
        }
    }

    public C0364n(Context context) {
        this(context, new C0351a.b());
    }

    /* renamed from: B */
    public static void m1407B(AbstractC0346A.a aVar, e eVar, InterfaceC0375y.a[] aVarArr) {
        int m1366d = aVar.m1366d();
        for (int i7 = 0; i7 < m1366d; i7++) {
            C0165m0 m1368f = aVar.m1368f(i7);
            if (eVar.m1469j(i7, m1368f)) {
                eVar.m1468i(i7, m1368f);
                aVarArr[i7] = null;
            }
        }
    }

    /* renamed from: C */
    public static void m1408C(AbstractC0346A.a aVar, C4305K c4305k, InterfaceC0375y.a[] aVarArr) {
        int m1366d = aVar.m1366d();
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < m1366d; i7++) {
            m1409D(aVar.m1368f(i7), c4305k, hashMap);
        }
        m1409D(aVar.m1370h(), c4305k, hashMap);
        for (int i8 = 0; i8 < m1366d; i8++) {
            AbstractC4094d.m17162a(hashMap.get(Integer.valueOf(aVar.m1367e(i8))));
        }
    }

    /* renamed from: D */
    public static void m1409D(C0165m0 c0165m0, C4305K c4305k, Map map) {
        for (int i7 = 0; i7 < c0165m0.f685a; i7++) {
            AbstractC4094d.m17162a(c4305k.f14888A.get(c0165m0.m653b(i7)));
        }
    }

    /* renamed from: E */
    public static int m1410E(C4327q c4327q, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(c4327q.f15128d)) {
            return 4;
        }
        String m1422U = m1422U(str);
        String m1422U2 = m1422U(c4327q.f15128d);
        if (m1422U2 == null || m1422U == null) {
            return (z6 && m1422U2 == null) ? 1 : 0;
        }
        if (m1422U2.startsWith(m1422U) || m1422U.startsWith(m1422U2)) {
            return 3;
        }
        return AbstractC5330M.m21740f1(m1422U2, "-")[0].equals(AbstractC5330M.m21740f1(m1422U, "-")[0]) ? 2 : 0;
    }

    /* renamed from: F */
    public static int m1411F(C4304J c4304j, int i7, int i8, boolean z6) {
        int i9;
        int i10 = C3643a.e.API_PRIORITY_OTHER;
        if (i7 != Integer.MAX_VALUE && i8 != Integer.MAX_VALUE) {
            for (int i11 = 0; i11 < c4304j.f14850a; i11++) {
                C4327q m18064a = c4304j.m18064a(i11);
                int i12 = m18064a.f15144t;
                if (i12 > 0 && (i9 = m18064a.f15145u) > 0) {
                    Point m1412G = m1412G(z6, i7, i8, i12, i9);
                    int i13 = m18064a.f15144t;
                    int i14 = m18064a.f15145u;
                    int i15 = i13 * i14;
                    if (i13 >= ((int) (m1412G.x * 0.98f)) && i14 >= ((int) (m1412G.y * 0.98f)) && i15 < i10) {
                        i10 = i15;
                    }
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point m1412G(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p259j0.AbstractC5330M.m21753k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p259j0.AbstractC5330M.m21753k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p043G0.C0364n.m1412G(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: H */
    public static int m1413H(int i7, int i8) {
        return (i7 == 0 || i7 != i8) ? Integer.bitCount(i7 & i8) : C3643a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: I */
    public static int m1414I(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: K */
    public static boolean m1415K(C4327q c4327q) {
        String str = c4327q.f15138n;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    /* renamed from: M */
    public static /* synthetic */ List m1416M(e eVar, int i7, C4304J c4304j, int[] iArr) {
        return c.m1456i(i7, c4304j, eVar, iArr);
    }

    /* renamed from: N */
    public static /* synthetic */ List m1417N(e eVar, String str, int i7, C4304J c4304j, int[] iArr) {
        return h.m1506i(i7, c4304j, eVar, iArr, str);
    }

    /* renamed from: O */
    public static /* synthetic */ List m1418O(e eVar, int[] iArr, int i7, C4304J c4304j, int[] iArr2) {
        return j.m1514l(i7, c4304j, eVar, iArr2, iArr[i7]);
    }

    /* renamed from: P */
    public static /* synthetic */ int m1419P(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* renamed from: Q */
    public static void m1420Q(e eVar, AbstractC0346A.a aVar, int[][][] iArr, C5709Y0[] c5709y0Arr, InterfaceC0375y[] interfaceC0375yArr) {
        int i7 = -1;
        boolean z6 = false;
        int i8 = 0;
        for (int i9 = 0; i9 < aVar.m1366d(); i9++) {
            int m1367e = aVar.m1367e(i9);
            InterfaceC0375y interfaceC0375y = interfaceC0375yArr[i9];
            if (m1367e != 1 && interfaceC0375y != null) {
                return;
            }
            if (m1367e == 1 && interfaceC0375y != null && interfaceC0375y.length() == 1) {
                if (m1423V(eVar, iArr[i9][aVar.m1368f(i9).m655d(interfaceC0375y.mo389a())][interfaceC0375y.mo391c(0)], interfaceC0375y.mo403q())) {
                    i8++;
                    i7 = i9;
                }
            }
        }
        if (i8 == 1) {
            int i10 = eVar.f14908s.f14921b ? 1 : 2;
            C5709Y0 c5709y0 = c5709y0Arr[i7];
            if (c5709y0 != null && c5709y0.f20643b) {
                z6 = true;
            }
            c5709y0Arr[i7] = new C5709Y0(i10, z6);
        }
    }

    /* renamed from: R */
    public static void m1421R(AbstractC0346A.a aVar, int[][][] iArr, C5709Y0[] c5709y0Arr, InterfaceC0375y[] interfaceC0375yArr) {
        boolean z6;
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < aVar.m1366d(); i9++) {
            int m1367e = aVar.m1367e(i9);
            InterfaceC0375y interfaceC0375y = interfaceC0375yArr[i9];
            if ((m1367e == 1 || m1367e == 2) && interfaceC0375y != null && m1424W(iArr[i9], aVar.m1368f(i9), interfaceC0375y)) {
                if (m1367e == 1) {
                    if (i8 != -1) {
                        z6 = false;
                        break;
                    }
                    i8 = i9;
                } else {
                    if (i7 != -1) {
                        z6 = false;
                        break;
                    }
                    i7 = i9;
                }
            }
        }
        z6 = true;
        if (z6 && ((i8 == -1 || i7 == -1) ? false : true)) {
            C5709Y0 c5709y0 = new C5709Y0(0, true);
            c5709y0Arr[i8] = c5709y0;
            c5709y0Arr[i7] = c5709y0;
        }
    }

    /* renamed from: U */
    public static String m1422U(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: V */
    public static boolean m1423V(e eVar, int i7, C4327q c4327q) {
        if (AbstractC5705W0.m23923f(i7) == 0) {
            return false;
        }
        if (eVar.f14908s.f14922c && (AbstractC5705W0.m23923f(i7) & 2048) == 0) {
            return false;
        }
        if (eVar.f14908s.f14921b) {
            return !(c4327q.f15117E != 0 || c4327q.f15118F != 0) || ((AbstractC5705W0.m23923f(i7) & 1024) != 0);
        }
        return true;
    }

    /* renamed from: W */
    public static boolean m1424W(int[][] iArr, C0165m0 c0165m0, InterfaceC0375y interfaceC0375y) {
        if (interfaceC0375y == null) {
            return false;
        }
        int m655d = c0165m0.m655d(interfaceC0375y.mo389a());
        for (int i7 = 0; i7 < interfaceC0375y.length(); i7++) {
            if (AbstractC5705W0.m23927j(iArr[m655d][interfaceC0375y.mo391c(i7)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    public final boolean m1436J(C4327q c4327q) {
        boolean z6;
        g gVar;
        g gVar2;
        synchronized (this.f1350d) {
            try {
                if (this.f1354h.f1411t0) {
                    if (!this.f1353g) {
                        if (c4327q.f15114B > 2) {
                            if (m1415K(c4327q)) {
                                if (AbstractC5330M.f18800a >= 32 && (gVar2 = this.f1355i) != null && gVar2.m1503e()) {
                                }
                            }
                            if (AbstractC5330M.f18800a < 32 || (gVar = this.f1355i) == null || !gVar.m1503e() || !this.f1355i.m1501c() || !this.f1355i.m1502d() || !this.f1355i.m1499a(this.f1356j, c4327q)) {
                                z6 = false;
                            }
                        }
                    }
                }
                z6 = true;
            } finally {
            }
        }
        return z6;
    }

    /* renamed from: L */
    public final /* synthetic */ List m1437L(e eVar, boolean z6, int[] iArr, int i7, C4304J c4304j, int[] iArr2) {
        return b.m1449i(i7, c4304j, eVar, iArr2, z6, new InterfaceC2933p() { // from class: G0.d
            @Override // p171Y2.InterfaceC2933p
            public final boolean apply(Object obj) {
                boolean m1436J;
                m1436J = C0364n.this.m1436J((C4327q) obj);
                return m1436J;
            }
        }, iArr[i7]);
    }

    /* renamed from: S */
    public final void m1438S() {
        boolean z6;
        g gVar;
        synchronized (this.f1350d) {
            try {
                z6 = this.f1354h.f1411t0 && !this.f1353g && AbstractC5330M.f18800a >= 32 && (gVar = this.f1355i) != null && gVar.m1503e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            m1377e();
        }
    }

    /* renamed from: T */
    public final void m1439T(InterfaceC5703V0 interfaceC5703V0) {
        boolean z6;
        synchronized (this.f1350d) {
            z6 = this.f1354h.f1415x0;
        }
        if (z6) {
            m1378f(interfaceC5703V0);
        }
    }

    /* renamed from: X */
    public InterfaceC0375y.a[] m1440X(AbstractC0346A.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        int m1366d = aVar.m1366d();
        InterfaceC0375y.a[] aVarArr = new InterfaceC0375y.a[m1366d];
        Pair m1447d0 = m1447d0(aVar, iArr, iArr2, eVar);
        String str = null;
        Pair m1442Z = (eVar.f14913x || m1447d0 == null) ? m1442Z(aVar, iArr, eVar) : null;
        if (m1442Z != null) {
            aVarArr[((Integer) m1442Z.second).intValue()] = (InterfaceC0375y.a) m1442Z.first;
        } else if (m1447d0 != null) {
            aVarArr[((Integer) m1447d0.second).intValue()] = (InterfaceC0375y.a) m1447d0.first;
        }
        Pair m1441Y = m1441Y(aVar, iArr, iArr2, eVar);
        if (m1441Y != null) {
            aVarArr[((Integer) m1441Y.second).intValue()] = (InterfaceC0375y.a) m1441Y.first;
        }
        if (m1441Y != null) {
            Object obj = m1441Y.first;
            str = ((InterfaceC0375y.a) obj).f1469a.m18064a(((InterfaceC0375y.a) obj).f1470b[0]).f15128d;
        }
        Pair m1445b0 = m1445b0(aVar, iArr, eVar, str);
        if (m1445b0 != null) {
            aVarArr[((Integer) m1445b0.second).intValue()] = (InterfaceC0375y.a) m1445b0.first;
        }
        for (int i7 = 0; i7 < m1366d; i7++) {
            int m1367e = aVar.m1367e(i7);
            if (m1367e != 2 && m1367e != 1 && m1367e != 3 && m1367e != 4) {
                aVarArr[i7] = m1444a0(m1367e, aVar.m1368f(i7), iArr[i7], eVar);
            }
        }
        return aVarArr;
    }

    /* renamed from: Y */
    public Pair m1441Y(AbstractC0346A.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 < aVar.m1366d()) {
                if (2 == aVar.m1367e(i7) && aVar.m1368f(i7).f685a > 0) {
                    z6 = true;
                    break;
                }
                i7++;
            } else {
                break;
            }
        }
        return m1446c0(1, aVar, iArr, new i.a() { // from class: G0.h
            @Override // p043G0.C0364n.i.a
            /* renamed from: a */
            public final List mo1405a(int i8, C4304J c4304j, int[] iArr3) {
                List m1437L;
                m1437L = C0364n.this.m1437L(eVar, z6, iArr2, i8, c4304j, iArr3);
                return m1437L;
            }
        }, new Comparator() { // from class: G0.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C0364n.b.m1448g((List) obj, (List) obj2);
            }
        });
    }

    /* renamed from: Z */
    public Pair m1442Z(AbstractC0346A.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f14908s.f14920a == 2) {
            return null;
        }
        return m1446c0(4, aVar, iArr, new i.a() { // from class: G0.f
            @Override // p043G0.C0364n.i.a
            /* renamed from: a */
            public final List mo1405a(int i7, C4304J c4304j, int[] iArr2) {
                List m1416M;
                m1416M = C0364n.m1416M(C0364n.e.this, i7, c4304j, iArr2);
                return m1416M;
            }
        }, new Comparator() { // from class: G0.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C0364n.c.m1455g((List) obj, (List) obj2);
            }
        });
    }

    @Override // p292n0.InterfaceC5707X0.a
    /* renamed from: a */
    public void mo1443a(InterfaceC5703V0 interfaceC5703V0) {
        m1439T(interfaceC5703V0);
    }

    /* renamed from: a0 */
    public InterfaceC0375y.a m1444a0(int i7, C0165m0 c0165m0, int[][] iArr, e eVar) {
        if (eVar.f14908s.f14920a == 2) {
            return null;
        }
        int i8 = 0;
        C4304J c4304j = null;
        d dVar = null;
        for (int i9 = 0; i9 < c0165m0.f685a; i9++) {
            C4304J m653b = c0165m0.m653b(i9);
            int[] iArr2 = iArr[i9];
            for (int i10 = 0; i10 < m653b.f14850a; i10++) {
                if (AbstractC5705W0.m23928k(iArr2[i10], eVar.f1412u0)) {
                    d dVar2 = new d(m653b.m18064a(i10), iArr2[i10]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        c4304j = m653b;
                        i8 = i10;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (c4304j == null) {
            return null;
        }
        return new InterfaceC0375y.a(c4304j, i8);
    }

    /* renamed from: b0 */
    public Pair m1445b0(AbstractC0346A.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f14908s.f14920a == 2) {
            return null;
        }
        return m1446c0(3, aVar, iArr, new i.a() { // from class: G0.l
            @Override // p043G0.C0364n.i.a
            /* renamed from: a */
            public final List mo1405a(int i7, C4304J c4304j, int[] iArr2) {
                List m1417N;
                m1417N = C0364n.m1417N(C0364n.e.this, str, i7, c4304j, iArr2);
                return m1417N;
            }
        }, new Comparator() { // from class: G0.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C0364n.h.m1505g((List) obj, (List) obj2);
            }
        });
    }

    /* renamed from: c0 */
    public final Pair m1446c0(int i7, AbstractC0346A.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i8;
        RandomAccess randomAccess;
        AbstractC0346A.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int m1366d = aVar.m1366d();
        int i9 = 0;
        while (i9 < m1366d) {
            if (i7 == aVar3.m1367e(i9)) {
                C0165m0 m1368f = aVar3.m1368f(i9);
                for (int i10 = 0; i10 < m1368f.f685a; i10++) {
                    C4304J m653b = m1368f.m653b(i10);
                    List mo1405a = aVar2.mo1405a(i9, m653b, iArr[i9][i10]);
                    boolean[] zArr = new boolean[m653b.f14850a];
                    int i11 = 0;
                    while (i11 < m653b.f14850a) {
                        i iVar = (i) mo1405a.get(i11);
                        int mo1450b = iVar.mo1450b();
                        if (zArr[i11] || mo1450b == 0) {
                            i8 = m1366d;
                        } else {
                            if (mo1450b == 1) {
                                randomAccess = AbstractC3033v.m11051u(iVar);
                                i8 = m1366d;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i12 = i11 + 1;
                                while (i12 < m653b.f14850a) {
                                    i iVar2 = (i) mo1405a.get(i12);
                                    int i13 = m1366d;
                                    if (iVar2.mo1450b() == 2 && iVar.mo1451f(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i12] = true;
                                    }
                                    i12++;
                                    m1366d = i13;
                                }
                                i8 = m1366d;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i11++;
                        m1366d = i8;
                    }
                }
            }
            i9++;
            aVar3 = aVar;
            m1366d = m1366d;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((i) list.get(i14)).f1452c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new InterfaceC0375y.a(iVar3.f1451b, iArr2), Integer.valueOf(iVar3.f1450a));
    }

    /* renamed from: d0 */
    public Pair m1447d0(AbstractC0346A.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        if (eVar.f14908s.f14920a == 2) {
            return null;
        }
        return m1446c0(2, aVar, iArr, new i.a() { // from class: G0.j
            @Override // p043G0.C0364n.i.a
            /* renamed from: a */
            public final List mo1405a(int i7, C4304J c4304j, int[] iArr3) {
                List m1418O;
                m1418O = C0364n.m1418O(C0364n.e.this, iArr2, i7, c4304j, iArr3);
                return m1418O;
            }
        }, new Comparator() { // from class: G0.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C0364n.j.m1513k((List) obj, (List) obj2);
            }
        });
    }

    @Override // p043G0.AbstractC0349D
    /* renamed from: g */
    public boolean mo1379g() {
        return true;
    }

    @Override // p043G0.AbstractC0349D
    /* renamed from: i */
    public void mo1380i() {
        g gVar;
        synchronized (this.f1350d) {
            try {
                if (AbstractC5330M.f18800a >= 32 && (gVar = this.f1355i) != null) {
                    gVar.m1504f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo1380i();
    }

    @Override // p043G0.AbstractC0349D
    /* renamed from: k */
    public void mo1381k(C4312b c4312b) {
        boolean equals;
        synchronized (this.f1350d) {
            equals = this.f1356j.equals(c4312b);
            this.f1356j = c4312b;
        }
        if (equals) {
            return;
        }
        m1438S();
    }

    @Override // p043G0.AbstractC0346A
    /* renamed from: o */
    public final Pair mo1362o(AbstractC0346A.a aVar, int[][][] iArr, int[] iArr2, InterfaceC0120F.b bVar, AbstractC4303I abstractC4303I) {
        e eVar;
        g gVar;
        synchronized (this.f1350d) {
            try {
                eVar = this.f1354h;
                if (eVar.f1411t0 && AbstractC5330M.f18800a >= 32 && (gVar = this.f1355i) != null) {
                    gVar.m1500b(this, (Looper) AbstractC5332a.m21804i(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int m1366d = aVar.m1366d();
        InterfaceC0375y.a[] m1440X = m1440X(aVar, iArr, iArr2, eVar);
        m1408C(aVar, eVar, m1440X);
        m1407B(aVar, eVar, m1440X);
        for (int i7 = 0; i7 < m1366d; i7++) {
            int m1367e = aVar.m1367e(i7);
            if (eVar.m1467h(i7) || eVar.f14889B.contains(Integer.valueOf(m1367e))) {
                m1440X[i7] = null;
            }
        }
        InterfaceC0375y[] mo1401a = this.f1352f.mo1401a(m1440X, m1374b(), bVar, abstractC4303I);
        C5709Y0[] c5709y0Arr = new C5709Y0[m1366d];
        for (int i8 = 0; i8 < m1366d; i8++) {
            c5709y0Arr[i8] = (eVar.m1467h(i8) || eVar.f14889B.contains(Integer.valueOf(aVar.m1367e(i8))) || (aVar.m1367e(i8) != -2 && mo1401a[i8] == null)) ? null : C5709Y0.f20641c;
        }
        if (eVar.f1413v0) {
            m1421R(aVar, iArr, c5709y0Arr, mo1401a);
        }
        if (eVar.f14908s.f14920a != 0) {
            m1420Q(eVar, aVar, iArr, c5709y0Arr, mo1401a);
        }
        return Pair.create(c5709y0Arr, mo1401a);
    }

    public C0364n(Context context, InterfaceC0375y.b bVar) {
        this(context, e.m1465g(context), bVar);
    }

    public C0364n(Context context, C4305K c4305k, InterfaceC0375y.b bVar) {
        this(c4305k, bVar, context);
    }

    public C0364n(C4305K c4305k, InterfaceC0375y.b bVar, Context context) {
        this.f1350d = new Object();
        this.f1351e = context != null ? context.getApplicationContext() : null;
        this.f1352f = bVar;
        if (c4305k instanceof e) {
            this.f1354h = (e) c4305k;
        } else {
            this.f1354h = (context == null ? e.f1380A0 : e.m1465g(context)).m1466f().m1494c0(c4305k).mo1488C();
        }
        this.f1356j = C4312b.f15006g;
        boolean z6 = context != null && AbstractC5330M.m21682F0(context);
        this.f1353g = z6;
        if (!z6 && context != null && AbstractC5330M.f18800a >= 32) {
            this.f1355i = g.m1498g(context);
        }
        if (this.f1354h.f1411t0 && context == null) {
            AbstractC5346o.m21867h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // p043G0.AbstractC0349D
    /* renamed from: c */
    public InterfaceC5707X0.a mo1375c() {
        return this;
    }
}

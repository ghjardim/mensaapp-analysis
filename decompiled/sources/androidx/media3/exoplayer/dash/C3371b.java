package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.C3371b;
import androidx.media3.exoplayer.dash.C3373d;
import androidx.media3.exoplayer.dash.InterfaceC3370a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import p022D0.C0165m0;
import p022D0.C0173s;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0145c0;
import p022D0.InterfaceC0147d0;
import p022D0.InterfaceC0158j;
import p029E0.C0215h;
import p043G0.InterfaceC0375y;
import p050H0.AbstractC0537f;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p050H0.InterfaceC0546o;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC2990D;
import p178Z2.AbstractC2992F;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3577g;
import p232g0.C4304J;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p276l0.InterfaceC5511y;
import p292n0.C5714a1;
import p292n0.C5762v0;
import p300o0.C5912w1;
import p319q0.C6163b;
import p319q0.C6171j;
import p327r0.AbstractC6243j;
import p327r0.C6234a;
import p327r0.C6236c;
import p327r0.C6238e;
import p327r0.C6239f;
import p327r0.C6240g;
import p335s0.InterfaceC6362v;
import p335s0.InterfaceC6364x;

/* renamed from: androidx.media3.exoplayer.dash.b */
/* loaded from: classes.dex */
public final class C3371b implements InterfaceC0117C, InterfaceC0147d0.a, C0215h.b {

    /* renamed from: F */
    public static final Pattern f10861F = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: G */
    public static final Pattern f10862G = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: B */
    public InterfaceC0147d0 f10864B;

    /* renamed from: C */
    public C6236c f10865C;

    /* renamed from: D */
    public int f10866D;

    /* renamed from: E */
    public List f10867E;

    /* renamed from: a */
    public final int f10868a;

    /* renamed from: b */
    public final InterfaceC3370a.a f10869b;

    /* renamed from: c */
    public final InterfaceC5511y f10870c;

    /* renamed from: d */
    public final InterfaceC6364x f10871d;

    /* renamed from: e */
    public final InterfaceC0544m f10872e;

    /* renamed from: f */
    public final C6163b f10873f;

    /* renamed from: n */
    public final long f10874n;

    /* renamed from: o */
    public final InterfaceC0546o f10875o;

    /* renamed from: p */
    public final InterfaceC0533b f10876p;

    /* renamed from: q */
    public final C0165m0 f10877q;

    /* renamed from: r */
    public final a[] f10878r;

    /* renamed from: s */
    public final InterfaceC0158j f10879s;

    /* renamed from: t */
    public final C3373d f10880t;

    /* renamed from: v */
    public final InterfaceC0127M.a f10882v;

    /* renamed from: w */
    public final InterfaceC6362v.a f10883w;

    /* renamed from: x */
    public final C5912w1 f10884x;

    /* renamed from: y */
    public InterfaceC0117C.a f10885y;

    /* renamed from: z */
    public C0215h[] f10886z = m13064I(0);

    /* renamed from: A */
    public C6171j[] f10863A = new C6171j[0];

    /* renamed from: u */
    public final IdentityHashMap f10881u = new IdentityHashMap();

    /* renamed from: androidx.media3.exoplayer.dash.b$a */
    public static final class a {

        /* renamed from: a */
        public final int[] f10887a;

        /* renamed from: b */
        public final int f10888b;

        /* renamed from: c */
        public final int f10889c;

        /* renamed from: d */
        public final int f10890d;

        /* renamed from: e */
        public final int f10891e;

        /* renamed from: f */
        public final int f10892f;

        /* renamed from: g */
        public final int f10893g;

        /* renamed from: h */
        public final AbstractC3033v f10894h;

        public a(int i7, int i8, int[] iArr, int i9, int i10, int i11, int i12, AbstractC3033v abstractC3033v) {
            this.f10888b = i7;
            this.f10887a = iArr;
            this.f10889c = i8;
            this.f10891e = i9;
            this.f10892f = i10;
            this.f10893g = i11;
            this.f10890d = i12;
            this.f10894h = abstractC3033v;
        }

        /* renamed from: a */
        public static a m13082a(int[] iArr, int i7, AbstractC3033v abstractC3033v) {
            return new a(3, 1, iArr, i7, -1, -1, -1, abstractC3033v);
        }

        /* renamed from: b */
        public static a m13083b(int[] iArr, int i7) {
            return new a(5, 1, iArr, i7, -1, -1, -1, AbstractC3033v.m11050t());
        }

        /* renamed from: c */
        public static a m13084c(int i7) {
            return new a(5, 2, new int[0], -1, -1, -1, i7, AbstractC3033v.m11050t());
        }

        /* renamed from: d */
        public static a m13085d(int i7, int[] iArr, int i8, int i9, int i10) {
            return new a(i7, 0, iArr, i8, i9, i10, -1, AbstractC3033v.m11050t());
        }
    }

    public C3371b(int i7, C6236c c6236c, C6163b c6163b, int i8, InterfaceC3370a.a aVar, InterfaceC5511y interfaceC5511y, AbstractC0537f abstractC0537f, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar2, InterfaceC0544m interfaceC0544m, InterfaceC0127M.a aVar3, long j7, InterfaceC0546o interfaceC0546o, InterfaceC0533b interfaceC0533b, InterfaceC0158j interfaceC0158j, C3373d.b bVar, C5912w1 c5912w1) {
        this.f10868a = i7;
        this.f10865C = c6236c;
        this.f10873f = c6163b;
        this.f10866D = i8;
        this.f10869b = aVar;
        this.f10870c = interfaceC5511y;
        this.f10871d = interfaceC6364x;
        this.f10883w = aVar2;
        this.f10872e = interfaceC0544m;
        this.f10882v = aVar3;
        this.f10874n = j7;
        this.f10875o = interfaceC0546o;
        this.f10876p = interfaceC0533b;
        this.f10879s = interfaceC0158j;
        this.f10884x = c5912w1;
        this.f10880t = new C3373d(c6236c, bVar, interfaceC0533b);
        this.f10864B = interfaceC0158j.mo643b();
        C6240g m26007d = c6236c.m26007d(i8);
        List list = m26007d.f22326d;
        this.f10867E = list;
        Pair m13069w = m13069w(interfaceC6364x, aVar, m26007d.f22325c, list);
        this.f10877q = (C0165m0) m13069w.first;
        this.f10878r = (a[]) m13069w.second;
    }

    /* renamed from: A */
    public static C4327q[] m13058A(List list, int[] iArr) {
        for (int i7 : iArr) {
            C6234a c6234a = (C6234a) list.get(i7);
            List list2 = ((C6234a) list.get(i7)).f22281d;
            for (int i8 = 0; i8 < list2.size(); i8++) {
                C6238e c6238e = (C6238e) list2.get(i8);
                if ("urn:scte:dash:cc:cea-608:2015".equals(c6238e.f22315a)) {
                    return m13065K(c6238e, f10861F, new C4327q.b().m18264o0("application/cea-608").m18250a0(c6234a.f22278a + ":cea608").m18234K());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(c6238e.f22315a)) {
                    return m13065K(c6238e, f10862G, new C4327q.b().m18264o0("application/cea-708").m18250a0(c6234a.f22278a + ":cea708").m18234K());
                }
            }
        }
        return new C4327q[0];
    }

    /* renamed from: B */
    public static int[][] m13059B(List list) {
        C6238e m13070x;
        Integer num;
        int size = list.size();
        HashMap m10798f = AbstractC2992F.m10798f(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            m10798f.put(Long.valueOf(((C6234a) list.get(i7)).f22278a), Integer.valueOf(i7));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        for (int i8 = 0; i8 < size; i8++) {
            C6234a c6234a = (C6234a) list.get(i8);
            C6238e m13072z = m13072z(c6234a.f22282e);
            if (m13072z == null) {
                m13072z = m13072z(c6234a.f22283f);
            }
            int intValue = (m13072z == null || (num = (Integer) m10798f.get(Long.valueOf(Long.parseLong(m13072z.f22316b)))) == null) ? i8 : num.intValue();
            if (intValue == i8 && (m13070x = m13070x(c6234a.f22283f)) != null) {
                for (String str : AbstractC5330M.m21737e1(m13070x.f22316b, ",")) {
                    Integer num2 = (Integer) m10798f.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i8) {
                List list2 = (List) sparseArray.get(i8);
                List list3 = (List) sparseArray.get(intValue);
                list3.addAll(list2);
                sparseArray.put(i8, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            int[] m14431n = AbstractC3577g.m14431n((Collection) arrayList.get(i9));
            iArr[i9] = m14431n;
            Arrays.sort(m14431n);
        }
        return iArr;
    }

    /* renamed from: E */
    public static boolean m13060E(List list, int[] iArr) {
        for (int i7 : iArr) {
            List list2 = ((C6234a) list.get(i7)).f22280c;
            for (int i8 = 0; i8 < list2.size(); i8++) {
                if (!((AbstractC6243j) list2.get(i8)).f22341e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    public static int m13061F(int i7, List list, int[][] iArr, boolean[] zArr, C4327q[][] c4327qArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            if (m13060E(list, iArr[i9])) {
                zArr[i9] = true;
                i8++;
            }
            C4327q[] m13058A = m13058A(list, iArr[i9]);
            c4327qArr[i9] = m13058A;
            if (m13058A.length != 0) {
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: G */
    public static /* synthetic */ List m13062G(C0215h c0215h) {
        return AbstractC3033v.m11051u(Integer.valueOf(c0215h.f887a));
    }

    /* renamed from: H */
    public static void m13063H(InterfaceC3370a.a aVar, C4327q[] c4327qArr) {
        for (int i7 = 0; i7 < c4327qArr.length; i7++) {
            c4327qArr[i7] = aVar.mo13056c(c4327qArr[i7]);
        }
    }

    /* renamed from: I */
    public static C0215h[] m13064I(int i7) {
        return new C0215h[i7];
    }

    /* renamed from: K */
    public static C4327q[] m13065K(C6238e c6238e, Pattern pattern, C4327q c4327q) {
        String str = c6238e.f22316b;
        if (str == null) {
            return new C4327q[]{c4327q};
        }
        String[] m21737e1 = AbstractC5330M.m21737e1(str, ";");
        C4327q[] c4327qArr = new C4327q[m21737e1.length];
        for (int i7 = 0; i7 < m21737e1.length; i7++) {
            Matcher matcher = pattern.matcher(m21737e1[i7]);
            if (!matcher.matches()) {
                return new C4327q[]{c4327q};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            c4327qArr[i7] = c4327q.m18193a().m18250a0(c4327q.f15125a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + parseInt).m18235L(parseInt).m18254e0(matcher.group(2)).m18234K();
        }
        return c4327qArr;
    }

    /* renamed from: q */
    public static void m13067q(List list, C4304J[] c4304jArr, a[] aVarArr, int i7) {
        int i8 = 0;
        while (i8 < list.size()) {
            C6239f c6239f = (C6239f) list.get(i8);
            c4304jArr[i7] = new C4304J(c6239f.m26085a() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i8, new C4327q.b().m18250a0(c6239f.m26085a()).m18264o0("application/x-emsg").m18234K());
            aVarArr[i7] = a.m13084c(i8);
            i8++;
            i7++;
        }
    }

    /* renamed from: r */
    public static int m13068r(InterfaceC6364x interfaceC6364x, InterfaceC3370a.a aVar, List list, int[][] iArr, int i7, boolean[] zArr, C4327q[][] c4327qArr, C4304J[] c4304jArr, a[] aVarArr) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i7) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            int length = iArr2.length;
            for (int i15 = i12; i15 < length; i15++) {
                arrayList.addAll(((C6234a) list.get(iArr2[i15])).f22280c);
            }
            int size = arrayList.size();
            C4327q[] c4327qArr2 = new C4327q[size];
            for (int i16 = i12; i16 < size; i16++) {
                C4327q c4327q = ((AbstractC6243j) arrayList.get(i16)).f22338b;
                c4327qArr2[i16] = c4327q.m18193a().m18241R(interfaceC6364x.mo26608d(c4327q)).m18234K();
            }
            C6234a c6234a = (C6234a) list.get(iArr2[i12]);
            long j7 = c6234a.f22278a;
            String l7 = j7 != -1 ? Long.toString(j7) : "unset:" + i13;
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i8 = i14 + 2;
            } else {
                i8 = i17;
                i17 = -1;
            }
            if (c4327qArr[i13].length != 0) {
                i9 = i8 + 1;
            } else {
                i9 = i8;
                i8 = -1;
            }
            m13063H(aVar, c4327qArr2);
            c4304jArr[i14] = new C4304J(l7, c4327qArr2);
            aVarArr[i14] = a.m13085d(c6234a.f22279b, iArr2, i14, i17, i8);
            if (i17 != -1) {
                String str = l7 + ":emsg";
                i10 = 0;
                c4304jArr[i17] = new C4304J(str, new C4327q.b().m18250a0(str).m18264o0("application/x-emsg").m18234K());
                aVarArr[i17] = a.m13083b(iArr2, i14);
                i11 = -1;
            } else {
                i10 = 0;
                i11 = -1;
            }
            if (i8 != i11) {
                aVarArr[i8] = a.m13082a(iArr2, i14, AbstractC3033v.m11049q(c4327qArr[i13]));
                m13063H(aVar, c4327qArr[i13]);
                c4304jArr[i8] = new C4304J(l7 + ":cc", c4327qArr[i13]);
            }
            i13++;
            i14 = i9;
            i12 = i10;
        }
        return i14;
    }

    /* renamed from: w */
    public static Pair m13069w(InterfaceC6364x interfaceC6364x, InterfaceC3370a.a aVar, List list, List list2) {
        int[][] m13059B = m13059B(list);
        int length = m13059B.length;
        boolean[] zArr = new boolean[length];
        C4327q[][] c4327qArr = new C4327q[length][];
        int m13061F = m13061F(length, list, m13059B, zArr, c4327qArr) + length + list2.size();
        C4304J[] c4304jArr = new C4304J[m13061F];
        a[] aVarArr = new a[m13061F];
        m13067q(list2, c4304jArr, aVarArr, m13068r(interfaceC6364x, aVar, list, m13059B, length, zArr, c4327qArr, c4304jArr, aVarArr));
        return Pair.create(new C0165m0(c4304jArr), aVarArr);
    }

    /* renamed from: x */
    public static C6238e m13070x(List list) {
        return m13071y(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    /* renamed from: y */
    public static C6238e m13071y(List list, String str) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6238e c6238e = (C6238e) list.get(i7);
            if (str.equals(c6238e.f22315a)) {
                return c6238e;
            }
        }
        return null;
    }

    /* renamed from: z */
    public static C6238e m13072z(List list) {
        return m13071y(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: C */
    public final int m13073C(int i7, int[] iArr) {
        int i8 = iArr[i7];
        if (i8 == -1) {
            return -1;
        }
        int i9 = this.f10878r[i8].f10891e;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == i9 && this.f10878r[i11].f10889c == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public final int[] m13074D(InterfaceC0375y[] interfaceC0375yArr) {
        int[] iArr = new int[interfaceC0375yArr.length];
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            InterfaceC0375y interfaceC0375y = interfaceC0375yArr[i7];
            if (interfaceC0375y != null) {
                iArr[i7] = this.f10877q.m655d(interfaceC0375y.mo389a());
            } else {
                iArr[i7] = -1;
            }
        }
        return iArr;
    }

    @Override // p022D0.InterfaceC0147d0.a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo386b(C0215h c0215h) {
        this.f10885y.mo386b(this);
    }

    /* renamed from: L */
    public void m13076L() {
        this.f10880t.m13124o();
        for (C0215h c0215h : this.f10886z) {
            c0215h.m897Q(this);
        }
        this.f10885y = null;
    }

    /* renamed from: M */
    public final void m13077M(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr) {
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            if (interfaceC0375yArr[i7] == null || !zArr[i7]) {
                InterfaceC0145c0 interfaceC0145c0 = interfaceC0145c0Arr[i7];
                if (interfaceC0145c0 instanceof C0215h) {
                    ((C0215h) interfaceC0145c0).m897Q(this);
                } else if (interfaceC0145c0 instanceof C0215h.a) {
                    ((C0215h.a) interfaceC0145c0).m903d();
                }
                interfaceC0145c0Arr[i7] = null;
            }
        }
    }

    /* renamed from: N */
    public final void m13078N(InterfaceC0375y[] interfaceC0375yArr, InterfaceC0145c0[] interfaceC0145c0Arr, int[] iArr) {
        boolean z6;
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            InterfaceC0145c0 interfaceC0145c0 = interfaceC0145c0Arr[i7];
            if ((interfaceC0145c0 instanceof C0173s) || (interfaceC0145c0 instanceof C0215h.a)) {
                int m13073C = m13073C(i7, iArr);
                if (m13073C == -1) {
                    z6 = interfaceC0145c0Arr[i7] instanceof C0173s;
                } else {
                    InterfaceC0145c0 interfaceC0145c02 = interfaceC0145c0Arr[i7];
                    z6 = (interfaceC0145c02 instanceof C0215h.a) && ((C0215h.a) interfaceC0145c02).f906a == interfaceC0145c0Arr[m13073C];
                }
                if (!z6) {
                    InterfaceC0145c0 interfaceC0145c03 = interfaceC0145c0Arr[i7];
                    if (interfaceC0145c03 instanceof C0215h.a) {
                        ((C0215h.a) interfaceC0145c03).m903d();
                    }
                    interfaceC0145c0Arr[i7] = null;
                }
            }
        }
    }

    /* renamed from: O */
    public final void m13079O(InterfaceC0375y[] interfaceC0375yArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr, long j7, int[] iArr) {
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            InterfaceC0375y interfaceC0375y = interfaceC0375yArr[i7];
            if (interfaceC0375y != null) {
                InterfaceC0145c0 interfaceC0145c0 = interfaceC0145c0Arr[i7];
                if (interfaceC0145c0 == null) {
                    zArr[i7] = true;
                    a aVar = this.f10878r[iArr[i7]];
                    int i8 = aVar.f10889c;
                    if (i8 == 0) {
                        interfaceC0145c0Arr[i7] = m13081v(aVar, interfaceC0375y, j7);
                    } else if (i8 == 2) {
                        interfaceC0145c0Arr[i7] = new C6171j((C6239f) this.f10867E.get(aVar.f10890d), interfaceC0375y.mo389a().m18064a(0), this.f10865C.f22291d);
                    }
                } else if (interfaceC0145c0 instanceof C0215h) {
                    ((InterfaceC3370a) ((C0215h) interfaceC0145c0).m886E()).mo13052a(interfaceC0375y);
                }
            }
        }
        for (int i9 = 0; i9 < interfaceC0375yArr.length; i9++) {
            if (interfaceC0145c0Arr[i9] == null && interfaceC0375yArr[i9] != null) {
                a aVar2 = this.f10878r[iArr[i9]];
                if (aVar2.f10889c == 1) {
                    int m13073C = m13073C(i9, iArr);
                    if (m13073C == -1) {
                        interfaceC0145c0Arr[i9] = new C0173s();
                    } else {
                        interfaceC0145c0Arr[i9] = ((C0215h) interfaceC0145c0Arr[m13073C]).m899T(j7, aVar2.f10888b);
                    }
                }
            }
        }
    }

    /* renamed from: P */
    public void m13080P(C6236c c6236c, int i7) {
        this.f10865C = c6236c;
        this.f10866D = i7;
        this.f10880t.m13126q(c6236c);
        C0215h[] c0215hArr = this.f10886z;
        if (c0215hArr != null) {
            for (C0215h c0215h : c0215hArr) {
                ((InterfaceC3370a) c0215h.m886E()).mo13053e(c6236c, i7);
            }
            this.f10885y.mo386b(this);
        }
        this.f10867E = c6236c.m26007d(i7).f22326d;
        for (C6171j c6171j : this.f10863A) {
            Iterator it = this.f10867E.iterator();
            while (true) {
                if (it.hasNext()) {
                    C6239f c6239f = (C6239f) it.next();
                    if (c6239f.m26085a().equals(c6171j.m25746a())) {
                        c6171j.m25748e(c6239f, c6236c.f22291d && i7 == c6236c.m26008e() - 1);
                    }
                }
            }
        }
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return this.f10864B.mo309a();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f10864B.mo310d();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        return this.f10864B.mo311e(c5762v0);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        return this.f10864B.mo312f();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        for (C0215h c0215h : this.f10886z) {
            if (c0215h.f887a == 2) {
                return c0215h.m900g(j7, c5714a1);
            }
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        this.f10864B.mo314h(j7);
    }

    @Override // p029E0.C0215h.b
    /* renamed from: i */
    public synchronized void mo904i(C0215h c0215h) {
        C3373d.c cVar = (C3373d.c) this.f10881u.remove(c0215h);
        if (cVar != null) {
            cVar.m13134n();
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        this.f10875o.mo2097c();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        int[] m13074D = m13074D(interfaceC0375yArr);
        m13077M(interfaceC0375yArr, zArr, interfaceC0145c0Arr);
        m13078N(interfaceC0375yArr, interfaceC0145c0Arr, m13074D);
        m13079O(interfaceC0375yArr, interfaceC0145c0Arr, zArr2, j7, m13074D);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC0145c0 interfaceC0145c0 : interfaceC0145c0Arr) {
            if (interfaceC0145c0 instanceof C0215h) {
                arrayList.add((C0215h) interfaceC0145c0);
            } else if (interfaceC0145c0 instanceof C6171j) {
                arrayList2.add((C6171j) interfaceC0145c0);
            }
        }
        C0215h[] m13064I = m13064I(arrayList.size());
        this.f10886z = m13064I;
        arrayList.toArray(m13064I);
        C6171j[] c6171jArr = new C6171j[arrayList2.size()];
        this.f10863A = c6171jArr;
        arrayList2.toArray(c6171jArr);
        this.f10864B = this.f10879s.mo642a(arrayList, AbstractC2990D.m10791k(arrayList, new InterfaceC2924g() { // from class: q0.d
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                List m13062G;
                m13062G = C3371b.m13062G((C0215h) obj);
                return m13062G;
            }
        }));
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        for (C0215h c0215h : this.f10886z) {
            c0215h.m898S(j7);
        }
        for (C6171j c6171j : this.f10863A) {
            c6171j.m25747d(j7);
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f10885y = aVar;
        aVar.mo322c(this);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        return -9223372036854775807L;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return this.f10877q;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        for (C0215h c0215h : this.f10886z) {
            c0215h.m901u(j7, z6);
        }
    }

    /* renamed from: v */
    public final C0215h m13081v(a aVar, InterfaceC0375y interfaceC0375y, long j7) {
        int i7;
        C4304J c4304j;
        int i8;
        int i9 = aVar.f10892f;
        boolean z6 = i9 != -1;
        C3373d.c cVar = null;
        if (z6) {
            c4304j = this.f10877q.m653b(i9);
            i7 = 1;
        } else {
            i7 = 0;
            c4304j = null;
        }
        int i10 = aVar.f10893g;
        AbstractC3033v m11050t = i10 != -1 ? this.f10878r[i10].f10894h : AbstractC3033v.m11050t();
        int size = i7 + m11050t.size();
        C4327q[] c4327qArr = new C4327q[size];
        int[] iArr = new int[size];
        if (z6) {
            c4327qArr[0] = c4304j.m18064a(0);
            iArr[0] = 5;
            i8 = 1;
        } else {
            i8 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < m11050t.size(); i11++) {
            C4327q c4327q = (C4327q) m11050t.get(i11);
            c4327qArr[i8] = c4327q;
            iArr[i8] = 3;
            arrayList.add(c4327q);
            i8++;
        }
        if (this.f10865C.f22291d && z6) {
            cVar = this.f10880t.m13120k();
        }
        C3373d.c cVar2 = cVar;
        C0215h c0215h = new C0215h(aVar.f10888b, iArr, c4327qArr, this.f10869b.mo13057d(this.f10875o, this.f10865C, this.f10873f, this.f10866D, aVar.f10887a, interfaceC0375y, aVar.f10888b, this.f10874n, z6, arrayList, cVar2, this.f10870c, this.f10884x, null), this, this.f10876p, j7, this.f10871d, this.f10883w, this.f10872e, this.f10882v);
        synchronized (this) {
            this.f10881u.put(c0215h, cVar2);
        }
        return c0215h;
    }
}

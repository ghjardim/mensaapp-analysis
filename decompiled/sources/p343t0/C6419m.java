package p343t0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import p022D0.C0165m0;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0145c0;
import p022D0.InterfaceC0147d0;
import p022D0.InterfaceC0158j;
import p043G0.InterfaceC0375y;
import p050H0.AbstractC0537f;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC2990D;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3577g;
import p232g0.AbstractC4336z;
import p232g0.C4304J;
import p232g0.C4323m;
import p232g0.C4327q;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5511y;
import p292n0.C5714a1;
import p292n0.C5762v0;
import p300o0.C5912w1;
import p335s0.InterfaceC6362v;
import p335s0.InterfaceC6364x;
import p343t0.C6425s;
import p351u0.C6590g;
import p351u0.InterfaceC6594k;

/* renamed from: t0.m */
/* loaded from: classes.dex */
public final class C6419m implements InterfaceC0117C, InterfaceC6594k.b {

    /* renamed from: A */
    public int f23215A;

    /* renamed from: B */
    public C0165m0 f23216B;

    /* renamed from: F */
    public int f23220F;

    /* renamed from: G */
    public InterfaceC0147d0 f23221G;

    /* renamed from: a */
    public final InterfaceC6414h f23222a;

    /* renamed from: b */
    public final InterfaceC6594k f23223b;

    /* renamed from: c */
    public final InterfaceC6413g f23224c;

    /* renamed from: d */
    public final InterfaceC5511y f23225d;

    /* renamed from: e */
    public final InterfaceC6364x f23226e;

    /* renamed from: f */
    public final InterfaceC6362v.a f23227f;

    /* renamed from: n */
    public final InterfaceC0544m f23228n;

    /* renamed from: o */
    public final InterfaceC0127M.a f23229o;

    /* renamed from: p */
    public final InterfaceC0533b f23230p;

    /* renamed from: s */
    public final InterfaceC0158j f23233s;

    /* renamed from: t */
    public final boolean f23234t;

    /* renamed from: u */
    public final int f23235u;

    /* renamed from: v */
    public final boolean f23236v;

    /* renamed from: w */
    public final C5912w1 f23237w;

    /* renamed from: y */
    public final long f23239y;

    /* renamed from: z */
    public InterfaceC0117C.a f23240z;

    /* renamed from: x */
    public final C6425s.b f23238x = new b();

    /* renamed from: q */
    public final IdentityHashMap f23231q = new IdentityHashMap();

    /* renamed from: r */
    public final C6428v f23232r = new C6428v();

    /* renamed from: C */
    public C6425s[] f23217C = new C6425s[0];

    /* renamed from: D */
    public C6425s[] f23218D = new C6425s[0];

    /* renamed from: E */
    public int[][] f23219E = new int[0][];

    /* renamed from: t0.m$b */
    public class b implements C6425s.b {
        public b() {
        }

        @Override // p022D0.InterfaceC0147d0.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo386b(C6425s c6425s) {
            C6419m.this.f23240z.mo386b(C6419m.this);
        }

        @Override // p343t0.C6425s.b
        /* renamed from: j */
        public void mo26841j() {
            if (C6419m.m26827j(C6419m.this) > 0) {
                return;
            }
            int i7 = 0;
            for (C6425s c6425s : C6419m.this.f23217C) {
                i7 += c6425s.m26896t().f685a;
            }
            C4304J[] c4304jArr = new C4304J[i7];
            int i8 = 0;
            for (C6425s c6425s2 : C6419m.this.f23217C) {
                int i9 = c6425s2.m26896t().f685a;
                int i10 = 0;
                while (i10 < i9) {
                    c4304jArr[i8] = c6425s2.m26896t().m653b(i10);
                    i10++;
                    i8++;
                }
            }
            C6419m.this.f23216B = new C0165m0(c4304jArr);
            C6419m.this.f23240z.mo322c(C6419m.this);
        }

        @Override // p343t0.C6425s.b
        /* renamed from: k */
        public void mo26842k(Uri uri) {
            C6419m.this.f23223b.mo27399n(uri);
        }
    }

    public C6419m(InterfaceC6414h interfaceC6414h, InterfaceC6594k interfaceC6594k, InterfaceC6413g interfaceC6413g, InterfaceC5511y interfaceC5511y, AbstractC0537f abstractC0537f, InterfaceC6364x interfaceC6364x, InterfaceC6362v.a aVar, InterfaceC0544m interfaceC0544m, InterfaceC0127M.a aVar2, InterfaceC0533b interfaceC0533b, InterfaceC0158j interfaceC0158j, boolean z6, int i7, boolean z7, C5912w1 c5912w1, long j7) {
        this.f23222a = interfaceC6414h;
        this.f23223b = interfaceC6594k;
        this.f23224c = interfaceC6413g;
        this.f23225d = interfaceC5511y;
        this.f23226e = interfaceC6364x;
        this.f23227f = aVar;
        this.f23228n = interfaceC0544m;
        this.f23229o = aVar2;
        this.f23230p = interfaceC0533b;
        this.f23233s = interfaceC0158j;
        this.f23234t = z6;
        this.f23235u = i7;
        this.f23236v = z7;
        this.f23237w = c5912w1;
        this.f23239y = j7;
        this.f23221G = interfaceC0158j.mo643b();
    }

    /* renamed from: A */
    public static Map m26823A(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            C4323m c4323m = (C4323m) list.get(i7);
            String str = c4323m.f15069c;
            i7++;
            int i8 = i7;
            while (i8 < arrayList.size()) {
                C4323m c4323m2 = (C4323m) arrayList.get(i8);
                if (TextUtils.equals(c4323m2.f15069c, str)) {
                    c4323m = c4323m.m18170f(c4323m2);
                    arrayList.remove(i8);
                } else {
                    i8++;
                }
            }
            hashMap.put(str, c4323m);
        }
        return hashMap;
    }

    /* renamed from: B */
    public static C4327q m26824B(C4327q c4327q) {
        String m21707S = AbstractC5330M.m21707S(c4327q.f15134j, 2);
        return new C4327q.b().m18250a0(c4327q.f15125a).m18252c0(c4327q.f15126b).m18253d0(c4327q.f15127c).m18240Q(c4327q.f15137m).m18264o0(AbstractC4336z.m18414g(m21707S)).m18238O(m21707S).m18257h0(c4327q.f15135k).m18236M(c4327q.f15131g).m18259j0(c4327q.f15132h).m18271v0(c4327q.f15144t).m18248Y(c4327q.f15145u).m18247X(c4327q.f15146v).m18266q0(c4327q.f15129e).m18262m0(c4327q.f15130f).m18234K();
    }

    /* renamed from: C */
    public static /* synthetic */ List m26825C(C6425s c6425s) {
        return c6425s.m26896t().m654c();
    }

    /* renamed from: j */
    public static /* synthetic */ int m26827j(C6419m c6419m) {
        int i7 = c6419m.f23215A - 1;
        c6419m.f23215A = i7;
        return i7;
    }

    /* renamed from: z */
    public static C4327q m26832z(C4327q c4327q, C4327q c4327q2, boolean z6) {
        C4334x c4334x;
        int i7;
        String str;
        int i8;
        int i9;
        String str2;
        String str3;
        List list;
        List m11050t = AbstractC3033v.m11050t();
        if (c4327q2 != null) {
            str3 = c4327q2.f15134j;
            c4334x = c4327q2.f15135k;
            i8 = c4327q2.f15114B;
            i7 = c4327q2.f15129e;
            i9 = c4327q2.f15130f;
            str = c4327q2.f15128d;
            str2 = c4327q2.f15126b;
            list = c4327q2.f15127c;
        } else {
            String m21707S = AbstractC5330M.m21707S(c4327q.f15134j, 1);
            c4334x = c4327q.f15135k;
            if (z6) {
                i8 = c4327q.f15114B;
                i7 = c4327q.f15129e;
                i9 = c4327q.f15130f;
                str = c4327q.f15128d;
                str2 = c4327q.f15126b;
                m11050t = c4327q.f15127c;
            } else {
                i7 = 0;
                str = null;
                i8 = -1;
                i9 = 0;
                str2 = null;
            }
            List list2 = m11050t;
            str3 = m21707S;
            list = list2;
        }
        return new C4327q.b().m18250a0(c4327q.f15125a).m18252c0(str2).m18253d0(list).m18240Q(c4327q.f15137m).m18264o0(AbstractC4336z.m18414g(str3)).m18238O(str3).m18257h0(c4334x).m18236M(z6 ? c4327q.f15131g : -1).m18259j0(z6 ? c4327q.f15132h : -1).m18237N(i8).m18266q0(i7).m18262m0(i9).m18254e0(str).m18234K();
    }

    /* renamed from: D */
    public void m26833D() {
        this.f23223b.mo27397j(this);
        for (C6425s c6425s : this.f23217C) {
            c6425s.m26883h0();
        }
        this.f23240z = null;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return this.f23221G.mo309a();
    }

    @Override // p351u0.InterfaceC6594k.b
    /* renamed from: b */
    public void mo26834b() {
        for (C6425s c6425s : this.f23217C) {
            c6425s.m26878d0();
        }
        this.f23240z.mo386b(this);
    }

    @Override // p351u0.InterfaceC6594k.b
    /* renamed from: c */
    public boolean mo26835c(Uri uri, InterfaceC0544m.c cVar, boolean z6) {
        boolean z7 = true;
        for (C6425s c6425s : this.f23217C) {
            z7 &= c6425s.m26877c0(uri, cVar, z6);
        }
        this.f23240z.mo386b(this);
        return z7;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f23221G.mo310d();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        if (this.f23216B != null) {
            return this.f23221G.mo311e(c5762v0);
        }
        for (C6425s c6425s : this.f23217C) {
            c6425s.m26857C();
        }
        return false;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        return this.f23221G.mo312f();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        for (C6425s c6425s : this.f23218D) {
            if (c6425s.m26867S()) {
                return c6425s.m26881g(j7, c5714a1);
            }
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        this.f23221G.mo314h(j7);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        for (C6425s c6425s : this.f23217C) {
            c6425s.m26887l();
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        InterfaceC0145c0[] interfaceC0145c0Arr2 = interfaceC0145c0Arr;
        int[] iArr = new int[interfaceC0375yArr.length];
        int[] iArr2 = new int[interfaceC0375yArr.length];
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            InterfaceC0145c0 interfaceC0145c0 = interfaceC0145c0Arr2[i7];
            iArr[i7] = interfaceC0145c0 == null ? -1 : ((Integer) this.f23231q.get(interfaceC0145c0)).intValue();
            iArr2[i7] = -1;
            InterfaceC0375y interfaceC0375y = interfaceC0375yArr[i7];
            if (interfaceC0375y != null) {
                C4304J mo389a = interfaceC0375y.mo389a();
                int i8 = 0;
                while (true) {
                    C6425s[] c6425sArr = this.f23217C;
                    if (i8 >= c6425sArr.length) {
                        break;
                    }
                    if (c6425sArr[i8].m26896t().m655d(mo389a) != -1) {
                        iArr2[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
        }
        this.f23231q.clear();
        int length = interfaceC0375yArr.length;
        InterfaceC0145c0[] interfaceC0145c0Arr3 = new InterfaceC0145c0[length];
        InterfaceC0145c0[] interfaceC0145c0Arr4 = new InterfaceC0145c0[interfaceC0375yArr.length];
        InterfaceC0375y[] interfaceC0375yArr2 = new InterfaceC0375y[interfaceC0375yArr.length];
        C6425s[] c6425sArr2 = new C6425s[this.f23217C.length];
        int i9 = 0;
        int i10 = 0;
        boolean z6 = false;
        while (i10 < this.f23217C.length) {
            for (int i11 = 0; i11 < interfaceC0375yArr.length; i11++) {
                InterfaceC0375y interfaceC0375y2 = null;
                interfaceC0145c0Arr4[i11] = iArr[i11] == i10 ? interfaceC0145c0Arr2[i11] : null;
                if (iArr2[i11] == i10) {
                    interfaceC0375y2 = interfaceC0375yArr[i11];
                }
                interfaceC0375yArr2[i11] = interfaceC0375y2;
            }
            C6425s c6425s = this.f23217C[i10];
            int i12 = i9;
            int i13 = length;
            int i14 = i10;
            InterfaceC0375y[] interfaceC0375yArr3 = interfaceC0375yArr2;
            C6425s[] c6425sArr3 = c6425sArr2;
            boolean m26888l0 = c6425s.m26888l0(interfaceC0375yArr2, zArr, interfaceC0145c0Arr4, zArr2, j7, z6);
            int i15 = 0;
            boolean z7 = false;
            while (true) {
                if (i15 >= interfaceC0375yArr.length) {
                    break;
                }
                InterfaceC0145c0 interfaceC0145c02 = interfaceC0145c0Arr4[i15];
                if (iArr2[i15] == i14) {
                    AbstractC5332a.m21800e(interfaceC0145c02);
                    interfaceC0145c0Arr3[i15] = interfaceC0145c02;
                    this.f23231q.put(interfaceC0145c02, Integer.valueOf(i14));
                    z7 = true;
                } else if (iArr[i15] == i14) {
                    AbstractC5332a.m21802g(interfaceC0145c02 == null);
                }
                i15++;
            }
            if (z7) {
                c6425sArr3[i12] = c6425s;
                i9 = i12 + 1;
                if (i12 == 0) {
                    c6425s.m26891o0(true);
                    if (!m26888l0) {
                        C6425s[] c6425sArr4 = this.f23218D;
                        if (c6425sArr4.length != 0 && c6425s == c6425sArr4[0]) {
                        }
                    }
                    this.f23232r.m26911b();
                    z6 = true;
                } else {
                    c6425s.m26891o0(i14 < this.f23220F);
                }
            } else {
                i9 = i12;
            }
            i10 = i14 + 1;
            interfaceC0145c0Arr2 = interfaceC0145c0Arr;
            c6425sArr2 = c6425sArr3;
            length = i13;
            interfaceC0375yArr2 = interfaceC0375yArr3;
        }
        System.arraycopy(interfaceC0145c0Arr3, 0, interfaceC0145c0Arr2, 0, length);
        C6425s[] c6425sArr5 = (C6425s[]) AbstractC5330M.m21702P0(c6425sArr2, i9);
        this.f23218D = c6425sArr5;
        AbstractC3033v m11049q = AbstractC3033v.m11049q(c6425sArr5);
        this.f23221G = this.f23233s.mo642a(m11049q, AbstractC2990D.m10791k(m11049q, new InterfaceC2924g() { // from class: t0.l
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                List m26825C;
                m26825C = C6419m.m26825C((C6425s) obj);
                return m26825C;
            }
        }));
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        C6425s[] c6425sArr = this.f23218D;
        if (c6425sArr.length > 0) {
            boolean m26886k0 = c6425sArr[0].m26886k0(j7, false);
            int i7 = 1;
            while (true) {
                C6425s[] c6425sArr2 = this.f23218D;
                if (i7 >= c6425sArr2.length) {
                    break;
                }
                c6425sArr2[i7].m26886k0(j7, m26886k0);
                i7++;
            }
            if (m26886k0) {
                this.f23232r.m26911b();
            }
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f23240z = aVar;
        this.f23223b.mo27388a(this);
        m26838x(j7);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        return -9223372036854775807L;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return (C0165m0) AbstractC5332a.m21800e(this.f23216B);
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        for (C6425s c6425s : this.f23218D) {
            c6425s.m26897u(j7, z6);
        }
    }

    /* renamed from: v */
    public final void m26836v(long j7, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = ((C6590g.a) list.get(i7)).f23710d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z6 = true;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    if (AbstractC5330M.m21729c(str, ((C6590g.a) list.get(i8)).f23710d)) {
                        C6590g.a aVar = (C6590g.a) list.get(i8);
                        arrayList3.add(Integer.valueOf(i8));
                        arrayList.add(aVar.f23707a);
                        arrayList2.add(aVar.f23708b);
                        z6 &= AbstractC5330M.m21705R(aVar.f23708b.f15134j, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                C6425s m26839y = m26839y(str2, 1, (Uri[]) arrayList.toArray((Uri[]) AbstractC5330M.m21750j(new Uri[0])), (C4327q[]) arrayList2.toArray(new C4327q[0]), null, Collections.emptyList(), map, j7);
                list3.add(AbstractC3577g.m14431n(arrayList3));
                list2.add(m26839y);
                if (this.f23234t && z6) {
                    m26839y.m26880f0(new C4304J[]{new C4304J(str2, (C4327q[]) arrayList2.toArray(new C4327q[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* renamed from: w */
    public final void m26837w(C6590g c6590g, long j7, List list, List list2, Map map) {
        int i7;
        boolean z6;
        boolean z7;
        int size = c6590g.f23698e.size();
        int[] iArr = new int[size];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < c6590g.f23698e.size(); i10++) {
            C4327q c4327q = ((C6590g.b) c6590g.f23698e.get(i10)).f23712b;
            if (c4327q.f15145u > 0 || AbstractC5330M.m21707S(c4327q.f15134j, 2) != null) {
                iArr[i10] = 2;
                i8++;
            } else if (AbstractC5330M.m21707S(c4327q.f15134j, 1) != null) {
                iArr[i10] = 1;
                i9++;
            } else {
                iArr[i10] = -1;
            }
        }
        if (i8 > 0) {
            i7 = i8;
            z6 = true;
            z7 = false;
        } else if (i9 < size) {
            i7 = size - i9;
            z7 = true;
            z6 = false;
        } else {
            i7 = size;
            z6 = false;
            z7 = false;
        }
        Uri[] uriArr = new Uri[i7];
        C4327q[] c4327qArr = new C4327q[i7];
        int[] iArr2 = new int[i7];
        int i11 = 0;
        for (int i12 = 0; i12 < c6590g.f23698e.size(); i12++) {
            if ((!z6 || iArr[i12] == 2) && (!z7 || iArr[i12] != 1)) {
                C6590g.b bVar = (C6590g.b) c6590g.f23698e.get(i12);
                uriArr[i11] = bVar.f23711a;
                c4327qArr[i11] = bVar.f23712b;
                iArr2[i11] = i12;
                i11++;
            }
        }
        String str = c4327qArr[0].f15134j;
        int m21705R = AbstractC5330M.m21705R(str, 2);
        int m21705R2 = AbstractC5330M.m21705R(str, 1);
        boolean z8 = (m21705R2 == 1 || (m21705R2 == 0 && c6590g.f23700g.isEmpty())) && m21705R <= 1 && m21705R2 + m21705R > 0;
        C6425s m26839y = m26839y("main", (z6 || m21705R2 <= 0) ? 0 : 1, uriArr, c4327qArr, c6590g.f23703j, c6590g.f23704k, map, j7);
        list.add(m26839y);
        list2.add(iArr2);
        if (this.f23234t && z8) {
            ArrayList arrayList = new ArrayList();
            if (m21705R > 0) {
                C4327q[] c4327qArr2 = new C4327q[i7];
                for (int i13 = 0; i13 < i7; i13++) {
                    c4327qArr2[i13] = m26824B(c4327qArr[i13]);
                }
                arrayList.add(new C4304J("main", c4327qArr2));
                if (m21705R2 > 0 && (c6590g.f23703j != null || c6590g.f23700g.isEmpty())) {
                    arrayList.add(new C4304J("main:audio", m26832z(c4327qArr[0], c6590g.f23703j, false)));
                }
                List list3 = c6590g.f23704k;
                if (list3 != null) {
                    for (int i14 = 0; i14 < list3.size(); i14++) {
                        arrayList.add(new C4304J("main:cc:" + i14, this.f23222a.mo26772c((C4327q) list3.get(i14))));
                    }
                }
            } else {
                C4327q[] c4327qArr3 = new C4327q[i7];
                for (int i15 = 0; i15 < i7; i15++) {
                    c4327qArr3[i15] = m26832z(c4327qArr[i15], c6590g.f23703j, true);
                }
                arrayList.add(new C4304J("main", c4327qArr3));
            }
            C4304J c4304j = new C4304J("main:id3", new C4327q.b().m18250a0("ID3").m18264o0("application/id3").m18234K());
            arrayList.add(c4304j);
            m26839y.m26880f0((C4304J[]) arrayList.toArray(new C4304J[0]), 0, arrayList.indexOf(c4304j));
        }
    }

    /* renamed from: x */
    public final void m26838x(long j7) {
        int i7 = 0;
        int i8 = 1;
        C6590g c6590g = (C6590g) AbstractC5332a.m21800e(this.f23223b.mo27395h());
        Map m26823A = this.f23236v ? m26823A(c6590g.f23706m) : Collections.emptyMap();
        boolean isEmpty = c6590g.f23698e.isEmpty();
        List list = c6590g.f23700g;
        List list2 = c6590g.f23701h;
        this.f23215A = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!isEmpty) {
            m26837w(c6590g, j7, arrayList, arrayList2, m26823A);
        }
        m26836v(j7, list, arrayList, arrayList2, m26823A);
        this.f23220F = arrayList.size();
        int i9 = 0;
        while (i9 < list2.size()) {
            C6590g.a aVar = (C6590g.a) list2.get(i9);
            String str = "subtitle:" + i9 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + aVar.f23710d;
            C4327q c4327q = aVar.f23708b;
            Uri[] uriArr = new Uri[i8];
            uriArr[i7] = aVar.f23707a;
            C4327q[] c4327qArr = new C4327q[i8];
            c4327qArr[i7] = c4327q;
            ArrayList arrayList3 = arrayList2;
            int i10 = i9;
            C6425s m26839y = m26839y(str, 3, uriArr, c4327qArr, null, Collections.emptyList(), m26823A, j7);
            arrayList3.add(new int[]{i10});
            arrayList.add(m26839y);
            m26839y.m26880f0(new C4304J[]{new C4304J(str, this.f23222a.mo26772c(c4327q))}, 0, new int[0]);
            i9 = i10 + 1;
            i7 = 0;
            arrayList2 = arrayList3;
            i8 = 1;
        }
        int i11 = i7;
        this.f23217C = (C6425s[]) arrayList.toArray(new C6425s[i11]);
        this.f23219E = (int[][]) arrayList2.toArray(new int[i11][]);
        this.f23215A = this.f23217C.length;
        for (int i12 = i11; i12 < this.f23220F; i12++) {
            this.f23217C[i12].m26891o0(true);
        }
        C6425s[] c6425sArr = this.f23217C;
        int length = c6425sArr.length;
        for (int i13 = i11; i13 < length; i13++) {
            c6425sArr[i13].m26857C();
        }
        this.f23218D = this.f23217C;
    }

    /* renamed from: y */
    public final C6425s m26839y(String str, int i7, Uri[] uriArr, C4327q[] c4327qArr, C4327q c4327q, List list, Map map, long j7) {
        return new C6425s(str, i7, this.f23238x, new C6412f(this.f23222a, this.f23223b, uriArr, c4327qArr, this.f23224c, this.f23225d, this.f23232r, this.f23239y, list, this.f23237w, null), map, this.f23230p, j7, c4327q, this.f23226e, this.f23227f, this.f23228n, this.f23229o, this.f23235u);
    }
}

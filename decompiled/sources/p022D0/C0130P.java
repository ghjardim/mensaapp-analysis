package p022D0;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p022D0.InterfaceC0120F;
import p050H0.InterfaceC0533b;
import p178Z2.AbstractC2994H;
import p178Z2.InterfaceC2993G;
import p232g0.AbstractC4303I;
import p232g0.C4331u;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5511y;

/* renamed from: D0.P */
/* loaded from: classes.dex */
public final class C0130P extends AbstractC0154h {

    /* renamed from: C */
    public static final C4331u f413C = new C4331u.c().m18278c("MergingMediaSource").m18276a();

    /* renamed from: A */
    public long[][] f414A;

    /* renamed from: B */
    public b f415B;

    /* renamed from: r */
    public final boolean f416r;

    /* renamed from: s */
    public final boolean f417s;

    /* renamed from: t */
    public final InterfaceC0120F[] f418t;

    /* renamed from: u */
    public final AbstractC4303I[] f419u;

    /* renamed from: v */
    public final ArrayList f420v;

    /* renamed from: w */
    public final InterfaceC0158j f421w;

    /* renamed from: x */
    public final Map f422x;

    /* renamed from: y */
    public final InterfaceC2993G f423y;

    /* renamed from: z */
    public int f424z;

    /* renamed from: D0.P$a */
    public static final class a extends AbstractC0177w {

        /* renamed from: f */
        public final long[] f425f;

        /* renamed from: g */
        public final long[] f426g;

        public a(AbstractC4303I abstractC4303I, Map map) {
            super(abstractC4303I);
            int mo308p = abstractC4303I.mo308p();
            this.f426g = new long[abstractC4303I.mo308p()];
            AbstractC4303I.c cVar = new AbstractC4303I.c();
            for (int i7 = 0; i7 < mo308p; i7++) {
                this.f426g[i7] = abstractC4303I.m18031n(i7, cVar).f14844m;
            }
            int mo307i = abstractC4303I.mo307i();
            this.f425f = new long[mo307i];
            AbstractC4303I.b bVar = new AbstractC4303I.b();
            for (int i8 = 0; i8 < mo307i; i8++) {
                abstractC4303I.mo303g(i8, bVar, true);
                long longValue = ((Long) AbstractC5332a.m21800e((Long) map.get(bVar.f14810b))).longValue();
                long[] jArr = this.f425f;
                longValue = longValue == Long.MIN_VALUE ? bVar.f14812d : longValue;
                jArr[i8] = longValue;
                long j7 = bVar.f14812d;
                if (j7 != -9223372036854775807L) {
                    long[] jArr2 = this.f426g;
                    int i9 = bVar.f14811c;
                    jArr2[i9] = jArr2[i9] - (j7 - longValue);
                }
            }
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: g */
        public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
            super.mo303g(i7, bVar, z6);
            bVar.f14812d = this.f425f[i7];
            return bVar;
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: o */
        public AbstractC4303I.c mo305o(int i7, AbstractC4303I.c cVar, long j7) {
            long j8;
            super.mo305o(i7, cVar, j7);
            long j9 = this.f426g[i7];
            cVar.f14844m = j9;
            if (j9 != -9223372036854775807L) {
                long j10 = cVar.f14843l;
                if (j10 != -9223372036854775807L) {
                    j8 = Math.min(j10, j9);
                    cVar.f14843l = j8;
                    return cVar;
                }
            }
            j8 = cVar.f14843l;
            cVar.f14843l = j8;
            return cVar;
        }
    }

    /* renamed from: D0.P$b */
    public static final class b extends IOException {

        /* renamed from: a */
        public final int f427a;

        public b(int i7) {
            this.f427a = i7;
        }
    }

    public C0130P(InterfaceC0120F... interfaceC0120FArr) {
        this(false, interfaceC0120FArr);
    }

    @Override // p022D0.AbstractC0154h, p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        super.mo410C(interfaceC5511y);
        for (int i7 = 0; i7 < this.f418t.length; i7++) {
            m622L(Integer.valueOf(i7), this.f418t[i7]);
        }
    }

    @Override // p022D0.AbstractC0154h, p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
        super.mo286E();
        Arrays.fill(this.f419u, (Object) null);
        this.f424z = -1;
        this.f415B = null;
        this.f420v.clear();
        Collections.addAll(this.f420v, this.f418t);
    }

    /* renamed from: M */
    public final void m413M() {
        AbstractC4303I.b bVar = new AbstractC4303I.b();
        for (int i7 = 0; i7 < this.f424z; i7++) {
            long j7 = -this.f419u[0].m18027f(i7, bVar).m18047n();
            int i8 = 1;
            while (true) {
                AbstractC4303I[] abstractC4303IArr = this.f419u;
                if (i8 < abstractC4303IArr.length) {
                    this.f414A[i7][i8] = j7 - (-abstractC4303IArr[i8].m18027f(i7, bVar).m18047n());
                    i8++;
                }
            }
        }
    }

    @Override // p022D0.AbstractC0154h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public InterfaceC0120F.b mo411G(Integer num, InterfaceC0120F.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // p022D0.AbstractC0154h
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m621J(Integer num, InterfaceC0120F interfaceC0120F, AbstractC4303I abstractC4303I) {
        if (this.f415B != null) {
            return;
        }
        if (this.f424z == -1) {
            this.f424z = abstractC4303I.mo307i();
        } else if (abstractC4303I.mo307i() != this.f424z) {
            this.f415B = new b(0);
            return;
        }
        if (this.f414A.length == 0) {
            this.f414A = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f424z, this.f419u.length);
        }
        this.f420v.remove(interfaceC0120F);
        this.f419u[num.intValue()] = abstractC4303I;
        if (this.f420v.isEmpty()) {
            if (this.f416r) {
                m413M();
            }
            AbstractC4303I abstractC4303I2 = this.f419u[0];
            if (this.f417s) {
                m416P();
                abstractC4303I2 = new a(abstractC4303I2, this.f422x);
            }
            m522D(abstractC4303I2);
        }
    }

    /* renamed from: P */
    public final void m416P() {
        AbstractC4303I[] abstractC4303IArr;
        AbstractC4303I.b bVar = new AbstractC4303I.b();
        for (int i7 = 0; i7 < this.f424z; i7++) {
            int i8 = 0;
            long j7 = Long.MIN_VALUE;
            while (true) {
                abstractC4303IArr = this.f419u;
                if (i8 >= abstractC4303IArr.length) {
                    break;
                }
                long m18043j = abstractC4303IArr[i8].m18027f(i7, bVar).m18043j();
                if (m18043j != -9223372036854775807L) {
                    long j8 = m18043j + this.f414A[i7][i8];
                    if (j7 == Long.MIN_VALUE || j8 < j7) {
                        j7 = j8;
                    }
                }
                i8++;
            }
            Object mo304m = abstractC4303IArr[0].mo304m(i7);
            this.f422x.put(mo304m, Long.valueOf(j7));
            Iterator it = this.f423y.get(mo304m).iterator();
            while (it.hasNext()) {
                ((C0148e) it.next()).m596w(0L, j7);
            }
        }
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public void mo294a(C4331u c4331u) {
        this.f418t[0].mo294a(c4331u);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        int length = this.f418t.length;
        InterfaceC0117C[] interfaceC0117CArr = new InterfaceC0117C[length];
        int mo302b = this.f419u[0].mo302b(bVar.f367a);
        for (int i7 = 0; i7 < length; i7++) {
            interfaceC0117CArr[i7] = this.f418t[i7].mo296e(bVar.m344a(this.f419u[i7].mo304m(mo302b)), interfaceC0533b, j7 - this.f414A[mo302b][i7]);
        }
        C0129O c0129o = new C0129O(this.f421w, this.f414A[mo302b], interfaceC0117CArr);
        if (!this.f417s) {
            return c0129o;
        }
        C0148e c0148e = new C0148e(c0129o, true, 0L, ((Long) AbstractC5332a.m21800e((Long) this.f422x.get(bVar.f367a))).longValue());
        this.f423y.put(bVar.f367a, c0148e);
        return c0148e;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        if (this.f417s) {
            C0148e c0148e = (C0148e) interfaceC0117C;
            Iterator it = this.f423y.mo10815a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C0148e) entry.getValue()).equals(c0148e)) {
                    this.f423y.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            interfaceC0117C = c0148e.f575a;
        }
        C0129O c0129o = (C0129O) interfaceC0117C;
        int i7 = 0;
        while (true) {
            InterfaceC0120F[] interfaceC0120FArr = this.f418t;
            if (i7 >= interfaceC0120FArr.length) {
                return;
            }
            interfaceC0120FArr[i7].mo297f(c0129o.m387m(i7));
            i7++;
        }
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public C4331u mo331i() {
        InterfaceC0120F[] interfaceC0120FArr = this.f418t;
        return interfaceC0120FArr.length > 0 ? interfaceC0120FArr[0].mo331i() : f413C;
    }

    @Override // p022D0.AbstractC0154h, p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
        b bVar = this.f415B;
        if (bVar != null) {
            throw bVar;
        }
        super.mo298n();
    }

    public C0130P(boolean z6, InterfaceC0120F... interfaceC0120FArr) {
        this(z6, false, interfaceC0120FArr);
    }

    public C0130P(boolean z6, boolean z7, InterfaceC0120F... interfaceC0120FArr) {
        this(z6, z7, new C0160k(), interfaceC0120FArr);
    }

    public C0130P(boolean z6, boolean z7, InterfaceC0158j interfaceC0158j, InterfaceC0120F... interfaceC0120FArr) {
        this.f416r = z6;
        this.f417s = z7;
        this.f418t = interfaceC0120FArr;
        this.f421w = interfaceC0158j;
        this.f420v = new ArrayList(Arrays.asList(interfaceC0120FArr));
        this.f424z = -1;
        this.f419u = new AbstractC4303I[interfaceC0120FArr.length];
        this.f414A = new long[0][];
        this.f422x = new HashMap();
        this.f423y = AbstractC2994H.m10818a().m10825a().mo10824e();
    }
}

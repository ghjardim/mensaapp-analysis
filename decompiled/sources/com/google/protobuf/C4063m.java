package com.google.protobuf;

import com.google.protobuf.AbstractC4014B0;
import com.google.protobuf.C4027N;
import com.google.protobuf.InterfaceC4016C0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p272k4.C5410A;

/* renamed from: com.google.protobuf.m */
/* loaded from: classes.dex */
public final class C4063m implements InterfaceC4016C0 {

    /* renamed from: a */
    public final AbstractC4061l f13465a;

    /* renamed from: com.google.protobuf.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13466a;

        static {
            int[] iArr = new int[AbstractC4014B0.b.values().length];
            f13466a = iArr;
            try {
                iArr[AbstractC4014B0.b.f13251q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13250p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13248n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13258x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13260z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13256v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13249o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13246e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13259y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13242A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13247f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13466a[AbstractC4014B0.b.f13252r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C4063m(AbstractC4061l abstractC4061l) {
        AbstractC4061l abstractC4061l2 = (AbstractC4061l) AbstractC4015C.m16184b(abstractC4061l, "output");
        this.f13465a = abstractC4061l2;
        abstractC4061l2.f13454a = this;
    }

    /* renamed from: P */
    public static C4063m m16796P(AbstractC4061l abstractC4061l) {
        C4063m c4063m = abstractC4061l.f13454a;
        return c4063m != null ? c4063m : new C4063m(abstractC4061l);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: A */
    public void mo16196A(int i7, float f7) {
        this.f13465a.m16773t0(i7, f7);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: B */
    public void mo16197B(int i7) {
        this.f13465a.mo16748R0(i7, 4);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: C */
    public void mo16198C(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.m16742L0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16693L(((Integer) list.get(i10)).intValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16743M0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: D */
    public void mo16199D(int i7, int i8) {
        this.f13465a.m16767n0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: E */
    public void mo16200E(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.m16732B0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16730z(((Long) list.get(i10)).longValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16733C0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: F */
    public void mo16201F(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.m16767n0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16717m(((Integer) list.get(i10)).intValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16768o0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: G */
    public void mo16202G(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.m16765l0(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16715k(((Double) list.get(i10)).doubleValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16766m0(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: H */
    public void mo16203H(int i7, int i8) {
        this.f13465a.m16742L0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: I */
    public void mo16204I(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f13465a.mo16763j0(i7, (AbstractC4055i) list.get(i8));
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: J */
    public void mo16205J(int i7, List list, InterfaceC4066n0 interfaceC4066n0) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mo16207L(i7, list.get(i8), interfaceC4066n0);
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: K */
    public void mo16206K(int i7, List list, InterfaceC4066n0 interfaceC4066n0) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mo16208M(i7, list.get(i8), interfaceC4066n0);
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: L */
    public void mo16207L(int i7, Object obj, InterfaceC4066n0 interfaceC4066n0) {
        this.f13465a.mo16734D0(i7, (InterfaceC4034V) obj, interfaceC4066n0);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: M */
    public void mo16208M(int i7, Object obj, InterfaceC4066n0 interfaceC4066n0) {
        this.f13465a.m16776w0(i7, (InterfaceC4034V) obj, interfaceC4066n0);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: N */
    public void mo16209N(int i7, AbstractC4055i abstractC4055i) {
        this.f13465a.mo16763j0(i7, abstractC4055i);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: O */
    public void mo16210O(int i7, C4027N.a aVar, Map map) {
        if (this.f13465a.m16755Z()) {
            m16800T(i7, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f13465a.mo16748R0(i7, 2);
            this.f13465a.mo16750T0(C4027N.m16283b(aVar, entry.getKey(), entry.getValue()));
            C4027N.m16285e(this.f13465a, aVar, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: Q */
    public final void m16797Q(int i7, boolean z6, Object obj, C4027N.a aVar) {
        this.f13465a.mo16748R0(i7, 2);
        this.f13465a.mo16750T0(C4027N.m16283b(aVar, Boolean.valueOf(z6), obj));
        C4027N.m16285e(this.f13465a, aVar, Boolean.valueOf(z6), obj);
    }

    /* renamed from: R */
    public final void m16798R(int i7, C4027N.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Integer) it.next()).intValue();
            i8++;
        }
        Arrays.sort(iArr);
        for (int i9 = 0; i9 < size; i9++) {
            int i10 = iArr[i9];
            Object obj = map.get(Integer.valueOf(i10));
            this.f13465a.mo16748R0(i7, 2);
            this.f13465a.mo16750T0(C4027N.m16283b(aVar, Integer.valueOf(i10), obj));
            C4027N.m16285e(this.f13465a, aVar, Integer.valueOf(i10), obj);
        }
    }

    /* renamed from: S */
    public final void m16799S(int i7, C4027N.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr[i8] = ((Long) it.next()).longValue();
            i8++;
        }
        Arrays.sort(jArr);
        for (int i9 = 0; i9 < size; i9++) {
            long j7 = jArr[i9];
            Object obj = map.get(Long.valueOf(j7));
            this.f13465a.mo16748R0(i7, 2);
            this.f13465a.mo16750T0(C4027N.m16283b(aVar, Long.valueOf(j7), obj));
            C4027N.m16285e(this.f13465a, aVar, Long.valueOf(j7), obj);
        }
    }

    /* renamed from: T */
    public final void m16800T(int i7, C4027N.a aVar, Map map) {
        switch (a.f13466a[aVar.f13322a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m16797Q(i7, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m16797Q(i7, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m16798R(i7, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m16799S(i7, aVar, map);
                return;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                m16801U(i7, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f13322a);
        }
    }

    /* renamed from: U */
    public final void m16801U(int i7, C4027N.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            strArr[i8] = (String) it.next();
            i8++;
        }
        Arrays.sort(strArr);
        for (int i9 = 0; i9 < size; i9++) {
            String str = strArr[i9];
            Object obj = map.get(str);
            this.f13465a.mo16748R0(i7, 2);
            this.f13465a.mo16750T0(C4027N.m16283b(aVar, str, obj));
            C4027N.m16285e(this.f13465a, aVar, str, obj);
        }
    }

    /* renamed from: V */
    public final void m16802V(int i7, Object obj) {
        if (obj instanceof String) {
            this.f13465a.mo16746P0(i7, (String) obj);
        } else {
            this.f13465a.mo16763j0(i7, (AbstractC4055i) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: a */
    public void mo16211a(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.m16773t0(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16723s(((Float) list.get(i10)).floatValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16774u0(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: b */
    public void mo16212b(int i7, int i8) {
        this.f13465a.mo16749S0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: c */
    public final void mo16213c(int i7, Object obj) {
        if (obj instanceof AbstractC4055i) {
            this.f13465a.mo16737G0(i7, (AbstractC4055i) obj);
        } else {
            this.f13465a.mo16736F0(i7, (InterfaceC4034V) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: d */
    public void mo16214d(int i7, int i8) {
        this.f13465a.mo16769p0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: e */
    public void mo16215e(int i7, double d7) {
        this.f13465a.m16765l0(i7, d7);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: f */
    public void mo16216f(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.m16740J0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16691J(((Long) list.get(i10)).longValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16741K0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: g */
    public void mo16217g(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.mo16751U0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16702U(((Long) list.get(i10)).longValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.mo16752V0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: h */
    public void mo16218h(int i7, long j7) {
        this.f13465a.mo16771r0(i7, j7);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: i */
    public InterfaceC4016C0.a mo16219i() {
        return InterfaceC4016C0.a.ASCENDING;
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: j */
    public void mo16220j(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof InterfaceC4023J)) {
            while (i8 < list.size()) {
                this.f13465a.mo16746P0(i7, (String) list.get(i8));
                i8++;
            }
        } else {
            InterfaceC4023J interfaceC4023J = (InterfaceC4023J) list;
            while (i8 < list.size()) {
                m16802V(i7, interfaceC4023J.mo16264l0(i8));
                i8++;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: k */
    public void mo16221k(int i7, String str) {
        this.f13465a.mo16746P0(i7, str);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: l */
    public void mo16222l(int i7, long j7) {
        this.f13465a.mo16751U0(i7, j7);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: m */
    public void mo16223m(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.mo16779z0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16728x(((Integer) list.get(i10)).intValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.mo16731A0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: n */
    public void mo16224n(int i7, long j7) {
        this.f13465a.m16732B0(i7, j7);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: o */
    public void mo16225o(int i7, boolean z6) {
        this.f13465a.mo16759f0(i7, z6);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: p */
    public void mo16226p(int i7, int i8) {
        this.f13465a.m16738H0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: q */
    public void mo16227q(int i7) {
        this.f13465a.mo16748R0(i7, 3);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: r */
    public void mo16228r(int i7, int i8) {
        this.f13465a.mo16779z0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: s */
    public void mo16229s(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.mo16771r0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16721q(((Long) list.get(i10)).longValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.mo16772s0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: t */
    public void mo16230t(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.m16738H0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16689H(((Integer) list.get(i10)).intValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16739I0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: u */
    public void mo16231u(int i7, long j7) {
        this.f13465a.m16740J0(i7, j7);
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: v */
    public void mo16232v(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.mo16769p0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16719o(((Integer) list.get(i10)).intValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.mo16770q0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: w */
    public void mo16233w(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.mo16759f0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16710f(((Boolean) list.get(i10)).booleanValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16760g0(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: x */
    public void mo16234x(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.mo16749S0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16700S(((Integer) list.get(i10)).intValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.mo16750T0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: y */
    public void mo16235y(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f13465a.m16744N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f13465a.mo16748R0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC4061l.m16695N(((Long) list.get(i10)).longValue());
        }
        this.f13465a.mo16750T0(i9);
        while (i8 < list.size()) {
            this.f13465a.m16745O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.InterfaceC4016C0
    /* renamed from: z */
    public void mo16236z(int i7, long j7) {
        this.f13465a.m16744N0(i7, j7);
    }
}

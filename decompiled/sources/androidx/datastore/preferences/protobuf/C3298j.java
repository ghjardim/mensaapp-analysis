package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3301k0;
import androidx.datastore.preferences.protobuf.C3257C;
import androidx.datastore.preferences.protobuf.InterfaceC3303l0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p272k4.C5410A;

/* renamed from: androidx.datastore.preferences.protobuf.j */
/* loaded from: classes.dex */
public final class C3298j implements InterfaceC3303l0 {

    /* renamed from: a */
    public final AbstractC3296i f10527a;

    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10528a;

        static {
            int[] iArr = new int[AbstractC3301k0.b.values().length];
            f10528a = iArr;
            try {
                iArr[AbstractC3301k0.b.f10543q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10542p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10540n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10550x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10552z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10548v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10541o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10538e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10551y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10534A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10539f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10528a[AbstractC3301k0.b.f10544r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C3298j(AbstractC3296i abstractC3296i) {
        AbstractC3296i abstractC3296i2 = (AbstractC3296i) AbstractC3312u.m12835b(abstractC3296i, "output");
        this.f10527a = abstractC3296i2;
        abstractC3296i2.f10496a = this;
    }

    /* renamed from: P */
    public static C3298j m12659P(AbstractC3296i abstractC3296i) {
        C3298j c3298j = abstractC3296i.f10496a;
        return c3298j != null ? c3298j : new C3298j(abstractC3296i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: A */
    public void mo12660A(int i7, float f7) {
        this.f10527a.m12573o0(i7, f7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: B */
    public void mo12661B(int i7) {
        this.f10527a.mo12550M0(i7, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: C */
    public void mo12662C(int i7, List list, boolean z6) {
        m12696f0(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: D */
    public void mo12663D(int i7, int i8) {
        this.f10527a.m12567i0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: E */
    public void mo12664E(int i7, List list, boolean z6) {
        m12690c0(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: F */
    public void mo12665F(int i7, List list, boolean z6) {
        m12682X(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: G */
    public void mo12666G(int i7, List list, boolean z6) {
        m12681W(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: H */
    public void mo12667H(int i7, int i8) {
        this.f10527a.m12544G0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: I */
    public void mo12668I(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f10527a.mo12563e0(i7, (AbstractC3290f) list.get(i8));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: J */
    public void mo12669J(int i7, List list, InterfaceC3278Y interfaceC3278Y) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mo12672M(i7, list.get(i8), interfaceC3278Y);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: K */
    public void mo12670K(int i7, List list, InterfaceC3278Y interfaceC3278Y) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mo12674O(i7, list.get(i8), interfaceC3278Y);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: L */
    public void mo12671L(int i7, AbstractC3290f abstractC3290f) {
        this.f10527a.mo12563e0(i7, abstractC3290f);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: M */
    public void mo12672M(int i7, Object obj, InterfaceC3278Y interfaceC3278Y) {
        this.f10527a.mo12583y0(i7, (InterfaceC3264J) obj, interfaceC3278Y);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: N */
    public void mo12673N(int i7, C3257C.a aVar, Map map) {
        if (this.f10527a.m12557X()) {
            m12679U(i7, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f10527a.mo12550M0(i7, 2);
            this.f10527a.mo12552O0(C3257C.m12062b(aVar, entry.getKey(), entry.getValue()));
            C3257C.m12064e(this.f10527a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: O */
    public void mo12674O(int i7, Object obj, InterfaceC3278Y interfaceC3278Y) {
        this.f10527a.m12576r0(i7, (InterfaceC3264J) obj, interfaceC3278Y);
    }

    /* renamed from: Q */
    public final void m12675Q(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.mo12559a0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12515d(((Boolean) list.get(i10)).booleanValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12560b0(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    /* renamed from: R */
    public final void m12676R(int i7, boolean z6, Object obj, C3257C.a aVar) {
        this.f10527a.mo12550M0(i7, 2);
        this.f10527a.mo12552O0(C3257C.m12062b(aVar, Boolean.valueOf(z6), obj));
        C3257C.m12064e(this.f10527a, aVar, Boolean.valueOf(z6), obj);
    }

    /* renamed from: S */
    public final void m12677S(int i7, C3257C.a aVar, Map map) {
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
            this.f10527a.mo12550M0(i7, 2);
            this.f10527a.mo12552O0(C3257C.m12062b(aVar, Integer.valueOf(i10), obj));
            C3257C.m12064e(this.f10527a, aVar, Integer.valueOf(i10), obj);
        }
    }

    /* renamed from: T */
    public final void m12678T(int i7, C3257C.a aVar, Map map) {
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
            this.f10527a.mo12550M0(i7, 2);
            this.f10527a.mo12552O0(C3257C.m12062b(aVar, Long.valueOf(j7), obj));
            C3257C.m12064e(this.f10527a, aVar, Long.valueOf(j7), obj);
        }
    }

    /* renamed from: U */
    public final void m12679U(int i7, C3257C.a aVar, Map map) {
        switch (a.f10528a[aVar.f10372a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m12676R(i7, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m12676R(i7, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m12677S(i7, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m12678T(i7, aVar, map);
                return;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                m12680V(i7, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f10372a);
        }
    }

    /* renamed from: V */
    public final void m12680V(int i7, C3257C.a aVar, Map map) {
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
            this.f10527a.mo12550M0(i7, 2);
            this.f10527a.mo12552O0(C3257C.m12062b(aVar, str, obj));
            C3257C.m12064e(this.f10527a, aVar, str, obj);
        }
    }

    /* renamed from: W */
    public final void m12681W(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.m12565g0(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12520i(((Double) list.get(i10)).doubleValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12566h0(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    /* renamed from: X */
    public final void m12682X(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.m12567i0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12522k(((Integer) list.get(i10)).intValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12568j0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    /* renamed from: Y */
    public final void m12683Y(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.mo12569k0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12524m(((Integer) list.get(i10)).intValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.mo12570l0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    /* renamed from: Z */
    public final void m12684Z(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.mo12571m0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12526o(((Long) list.get(i10)).longValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.mo12572n0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: a */
    public void mo12685a(int i7, List list, boolean z6) {
        m12686a0(i7, list, z6);
    }

    /* renamed from: a0 */
    public final void m12686a0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.m12573o0(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12528q(((Float) list.get(i10)).floatValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12574p0(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: b */
    public void mo12687b(int i7, int i8) {
        this.f10527a.mo12551N0(i7, i8);
    }

    /* renamed from: b0 */
    public final void m12688b0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.mo12579u0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12533v(((Integer) list.get(i10)).intValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.mo12580v0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: c */
    public final void mo12689c(int i7, Object obj) {
        if (obj instanceof AbstractC3290f) {
            this.f10527a.mo12539B0(i7, (AbstractC3290f) obj);
        } else {
            this.f10527a.mo12538A0(i7, (InterfaceC3264J) obj);
        }
    }

    /* renamed from: c0 */
    public final void m12690c0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.m12581w0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12535x(((Long) list.get(i10)).longValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12582x0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: d */
    public void mo12691d(int i7, int i8) {
        this.f10527a.mo12569k0(i7, i8);
    }

    /* renamed from: d0 */
    public final void m12692d0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.m12540C0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12496F(((Integer) list.get(i10)).intValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12541D0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: e */
    public void mo12693e(int i7, double d7) {
        this.f10527a.m12565g0(i7, d7);
    }

    /* renamed from: e0 */
    public final void m12694e0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.m12542E0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12498H(((Long) list.get(i10)).longValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12543F0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: f */
    public void mo12695f(int i7, List list, boolean z6) {
        m12694e0(i7, list, z6);
    }

    /* renamed from: f0 */
    public void m12696f0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.m12544G0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12500J(((Integer) list.get(i10)).intValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12545H0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: g */
    public void mo12697g(int i7, List list, boolean z6) {
        m12702i0(i7, list, z6);
    }

    /* renamed from: g0 */
    public final void m12698g0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.m12546I0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12502L(((Long) list.get(i10)).longValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.m12547J0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: h */
    public void mo12699h(int i7, long j7) {
        this.f10527a.mo12571m0(i7, j7);
    }

    /* renamed from: h0 */
    public void m12700h0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.mo12551N0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12507Q(((Integer) list.get(i10)).intValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.mo12552O0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: i */
    public InterfaceC3303l0.a mo12701i() {
        return InterfaceC3303l0.a.ASCENDING;
    }

    /* renamed from: i0 */
    public final void m12702i0(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f10527a.mo12553P0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10527a.mo12550M0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC3296i.m12509S(((Long) list.get(i10)).longValue());
        }
        this.f10527a.mo12552O0(i9);
        while (i8 < list.size()) {
            this.f10527a.mo12554Q0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: j */
    public void mo12703j(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f10527a.mo12548K0(i7, (String) list.get(i8));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: k */
    public void mo12704k(int i7, String str) {
        this.f10527a.mo12548K0(i7, str);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: l */
    public void mo12705l(int i7, long j7) {
        this.f10527a.mo12553P0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: m */
    public void mo12706m(int i7, List list, boolean z6) {
        m12688b0(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: n */
    public void mo12707n(int i7, long j7) {
        this.f10527a.m12581w0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: o */
    public void mo12708o(int i7, boolean z6) {
        this.f10527a.mo12559a0(i7, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: p */
    public void mo12709p(int i7, int i8) {
        this.f10527a.m12540C0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: q */
    public void mo12710q(int i7) {
        this.f10527a.mo12550M0(i7, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: r */
    public void mo12711r(int i7, int i8) {
        this.f10527a.mo12579u0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: s */
    public void mo12712s(int i7, List list, boolean z6) {
        m12684Z(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: t */
    public void mo12713t(int i7, List list, boolean z6) {
        m12692d0(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: u */
    public void mo12714u(int i7, long j7) {
        this.f10527a.m12542E0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: v */
    public void mo12715v(int i7, List list, boolean z6) {
        m12683Y(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: w */
    public void mo12716w(int i7, List list, boolean z6) {
        m12675Q(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: x */
    public void mo12717x(int i7, List list, boolean z6) {
        m12700h0(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: y */
    public void mo12718y(int i7, List list, boolean z6) {
        m12698g0(i7, list, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3303l0
    /* renamed from: z */
    public void mo12719z(int i7, long j7) {
        this.f10527a.m12546I0(i7, j7);
    }
}

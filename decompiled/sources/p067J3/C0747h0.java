package p067J3;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p067J3.C0735b0;
import p067J3.C0762p;
import p088M3.AbstractC1175q;
import p088M3.AbstractC1184z;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.C1179u;
import p272k4.C5413D;

/* renamed from: J3.h0 */
/* loaded from: classes.dex */
public final class C0747h0 {

    /* renamed from: a */
    public String f2631a;

    /* renamed from: b */
    public final List f2632b;

    /* renamed from: c */
    public final List f2633c;

    /* renamed from: d */
    public final C1179u f2634d;

    /* renamed from: e */
    public final String f2635e;

    /* renamed from: f */
    public final long f2636f;

    /* renamed from: g */
    public final C0748i f2637g;

    /* renamed from: h */
    public final C0748i f2638h;

    /* renamed from: J3.h0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2639a;

        static {
            int[] iArr = new int[C0762p.b.values().length];
            f2639a = iArr;
            try {
                iArr[C0762p.b.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2639a[C0762p.b.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2639a[C0762p.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2639a[C0762p.b.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2639a[C0762p.b.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2639a[C0762p.b.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2639a[C0762p.b.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2639a[C0762p.b.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2639a[C0762p.b.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2639a[C0762p.b.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public C0747h0(C1179u c1179u, String str, List list, List list2, long j7, C0748i c0748i, C0748i c0748i2) {
        this.f2634d = c1179u;
        this.f2635e = str;
        this.f2632b = list2;
        this.f2633c = list;
        this.f2636f = j7;
        this.f2637g = c0748i;
        this.f2638h = c0748i2;
    }

    /* renamed from: a */
    public List m3179a(AbstractC1175q abstractC1175q) {
        AbstractC1175q.c m4519c = abstractC1175q.m4519c();
        if (m4519c == null) {
            return null;
        }
        for (C0762p c0762p : m3185g(m4519c.mo4457g())) {
            int i7 = a.f2639a[c0762p.m3271g().ordinal()];
            if (i7 == 1) {
                return c0762p.m3272h().m22453l0().mo22555g();
            }
            if (i7 == 2) {
                return Collections.singletonList(c0762p.m3272h());
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public final Pair m3180b(AbstractC1175q.c cVar, C0748i c0748i) {
        C5413D c5413d = AbstractC1184z.f3801c;
        Iterator it = m3185g(cVar.mo4457g()).iterator();
        boolean z6 = true;
        while (true) {
            int i7 = 0;
            boolean z7 = false;
            if (!it.hasNext()) {
                if (c0748i != null) {
                    while (true) {
                        if (i7 < this.f2632b.size()) {
                            if (((C0735b0) this.f2632b.get(i7)).m3087c().equals(cVar.mo4457g())) {
                                C5413D c5413d2 = (C5413D) c0748i.m3199b().get(i7);
                                if (AbstractC1184z.m4585E(c5413d, z6, c5413d2, c0748i.m3200c()) < 0) {
                                    z6 = c0748i.m3200c();
                                    c5413d = c5413d2;
                                }
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                return new Pair(c5413d, Boolean.valueOf(z6));
            }
            C0762p c0762p = (C0762p) it.next();
            C5413D c5413d3 = AbstractC1184z.f3801c;
            switch (a.f2639a[c0762p.m3271g().ordinal()]) {
                case 3:
                case 4:
                case 9:
                    c5413d3 = c0762p.m3272h();
                    z7 = true;
                    break;
                case 5:
                case 6:
                default:
                    z7 = true;
                    break;
                case 7:
                case 8:
                    c5413d3 = AbstractC1184z.m4609s(c0762p.m3272h());
                    z7 = true;
                    break;
                case 10:
                    c5413d3 = c0762p.m3272h();
                    break;
            }
            if (AbstractC1184z.m4585E(c5413d, z6, c5413d3, z7) < 0) {
                z6 = z7;
                c5413d = c5413d3;
            }
        }
    }

    /* renamed from: c */
    public String m3181c() {
        String str = this.f2631a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m3192n().mo4464g());
        if (this.f2635e != null) {
            sb.append("|cg:");
            sb.append(this.f2635e);
        }
        sb.append("|f:");
        Iterator it = m3186h().iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0764q) it.next()).mo3220a());
        }
        sb.append("|ob:");
        for (C0735b0 c0735b0 : m3191m()) {
            sb.append(c0735b0.m3087c().mo4464g());
            sb.append(c0735b0.m3086b().equals(C0735b0.a.ASCENDING) ? "asc" : "desc");
        }
        if (m3196r()) {
            sb.append("|l:");
            sb.append(m3188j());
        }
        if (this.f2637g != null) {
            sb.append("|lb:");
            sb.append(this.f2637g.m3200c() ? "b:" : "a:");
            sb.append(this.f2637g.m3201d());
        }
        if (this.f2638h != null) {
            sb.append("|ub:");
            sb.append(this.f2638h.m3200c() ? "a:" : "b:");
            sb.append(this.f2638h.m3201d());
        }
        String sb2 = sb.toString();
        this.f2631a = sb2;
        return sb2;
    }

    /* renamed from: d */
    public String m3182d() {
        return this.f2635e;
    }

    /* renamed from: e */
    public final Pair m3183e(AbstractC1175q.c cVar, C0748i c0748i) {
        C5413D c5413d = AbstractC1184z.f3803e;
        Iterator it = m3185g(cVar.mo4457g()).iterator();
        boolean z6 = true;
        while (true) {
            int i7 = 0;
            r5 = false;
            boolean z7 = false;
            if (!it.hasNext()) {
                if (c0748i != null) {
                    while (true) {
                        if (i7 < this.f2632b.size()) {
                            if (((C0735b0) this.f2632b.get(i7)).m3087c().equals(cVar.mo4457g())) {
                                C5413D c5413d2 = (C5413D) c0748i.m3199b().get(i7);
                                if (AbstractC1184z.m4590J(c5413d, z6, c5413d2, c0748i.m3200c()) > 0) {
                                    z6 = c0748i.m3200c();
                                    c5413d = c5413d2;
                                }
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                return new Pair(c5413d, Boolean.valueOf(z6));
            }
            C0762p c0762p = (C0762p) it.next();
            C5413D c5413d3 = AbstractC1184z.f3803e;
            switch (a.f2639a[c0762p.m3271g().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    c5413d3 = c0762p.m3272h();
                case 5:
                case 6:
                default:
                    z7 = true;
                    break;
                case 7:
                    c5413d3 = c0762p.m3272h();
                    break;
                case 9:
                case 10:
                    c5413d3 = AbstractC1184z.m4610t(c0762p.m3272h());
                    break;
            }
            if (AbstractC1184z.m4590J(c5413d, z6, c5413d3, z7) > 0) {
                z6 = z7;
                c5413d = c5413d3;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0747h0.class != obj.getClass()) {
            return false;
        }
        C0747h0 c0747h0 = (C0747h0) obj;
        String str = this.f2635e;
        if (str == null ? c0747h0.f2635e != null : !str.equals(c0747h0.f2635e)) {
            return false;
        }
        if (this.f2636f != c0747h0.f2636f || !this.f2632b.equals(c0747h0.f2632b) || !this.f2633c.equals(c0747h0.f2633c) || !this.f2634d.equals(c0747h0.f2634d)) {
            return false;
        }
        C0748i c0748i = this.f2637g;
        if (c0748i == null ? c0747h0.f2637g != null : !c0748i.equals(c0747h0.f2637g)) {
            return false;
        }
        C0748i c0748i2 = this.f2638h;
        C0748i c0748i3 = c0747h0.f2638h;
        return c0748i2 != null ? c0748i2.equals(c0748i3) : c0748i3 == null;
    }

    /* renamed from: f */
    public C0748i m3184f() {
        return this.f2638h;
    }

    /* renamed from: g */
    public final List m3185g(C1176r c1176r) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0764q abstractC0764q : this.f2633c) {
            if (abstractC0764q instanceof C0762p) {
                C0762p c0762p = (C0762p) abstractC0764q;
                if (c0762p.m3270f().equals(c1176r)) {
                    arrayList.add(c0762p);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public List m3186h() {
        return this.f2633c;
    }

    public int hashCode() {
        int hashCode = this.f2632b.hashCode() * 31;
        String str = this.f2635e;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f2633c.hashCode()) * 31) + this.f2634d.hashCode()) * 31;
        long j7 = this.f2636f;
        int i7 = (hashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        C0748i c0748i = this.f2637g;
        int hashCode3 = (i7 + (c0748i != null ? c0748i.hashCode() : 0)) * 31;
        C0748i c0748i2 = this.f2638h;
        return hashCode3 + (c0748i2 != null ? c0748i2.hashCode() : 0);
    }

    /* renamed from: i */
    public C0735b0.a m3187i() {
        return ((C0735b0) this.f2632b.get(r0.size() - 1)).m3086b();
    }

    /* renamed from: j */
    public long m3188j() {
        return this.f2636f;
    }

    /* renamed from: k */
    public C0748i m3189k(AbstractC1175q abstractC1175q) {
        ArrayList arrayList = new ArrayList();
        boolean z6 = true;
        for (AbstractC1175q.c cVar : abstractC1175q.m4520e()) {
            Pair m3180b = cVar.mo4458h().equals(AbstractC1175q.c.a.ASCENDING) ? m3180b(cVar, this.f2637g) : m3183e(cVar, this.f2637g);
            arrayList.add((C5413D) m3180b.first);
            z6 &= ((Boolean) m3180b.second).booleanValue();
        }
        return new C0748i(arrayList, z6);
    }

    /* renamed from: l */
    public Collection m3190l(AbstractC1175q abstractC1175q) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AbstractC1175q.c cVar : abstractC1175q.m4520e()) {
            for (C0762p c0762p : m3185g(cVar.mo4457g())) {
                int i7 = a.f2639a[c0762p.m3271g().ordinal()];
                if (i7 == 3 || i7 == 4) {
                    linkedHashMap.put(cVar.mo4457g(), c0762p.m3272h());
                } else if (i7 == 5 || i7 == 6) {
                    linkedHashMap.put(cVar.mo4457g(), c0762p.m3272h());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    /* renamed from: m */
    public List m3191m() {
        return this.f2632b;
    }

    /* renamed from: n */
    public C1179u m3192n() {
        return this.f2634d;
    }

    /* renamed from: o */
    public int m3193o() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2633c.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            for (C0762p c0762p : ((AbstractC0764q) it.next()).mo3222c()) {
                if (!c0762p.m3270f().m4537x()) {
                    if (c0762p.m3271g().equals(C0762p.b.ARRAY_CONTAINS) || c0762p.m3271g().equals(C0762p.b.ARRAY_CONTAINS_ANY)) {
                        i7 = 1;
                    } else {
                        hashSet.add(c0762p.m3270f());
                    }
                }
            }
        }
        for (C0735b0 c0735b0 : this.f2632b) {
            if (!c0735b0.m3087c().m4537x()) {
                hashSet.add(c0735b0.m3087c());
            }
        }
        return hashSet.size() + i7;
    }

    /* renamed from: p */
    public C0748i m3194p() {
        return this.f2637g;
    }

    /* renamed from: q */
    public C0748i m3195q(AbstractC1175q abstractC1175q) {
        ArrayList arrayList = new ArrayList();
        boolean z6 = true;
        for (AbstractC1175q.c cVar : abstractC1175q.m4520e()) {
            Pair m3183e = cVar.mo4458h().equals(AbstractC1175q.c.a.ASCENDING) ? m3183e(cVar, this.f2638h) : m3180b(cVar, this.f2638h);
            arrayList.add((C5413D) m3183e.first);
            z6 &= ((Boolean) m3183e.second).booleanValue();
        }
        return new C0748i(arrayList, z6);
    }

    /* renamed from: r */
    public boolean m3196r() {
        return this.f2636f != -1;
    }

    /* renamed from: s */
    public boolean m3197s() {
        return C1170l.m4500q(this.f2634d) && this.f2635e == null && this.f2633c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.f2634d.mo4464g());
        if (this.f2635e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f2635e);
        }
        if (!this.f2633c.isEmpty()) {
            sb.append(" where ");
            for (int i7 = 0; i7 < this.f2633c.size(); i7++) {
                if (i7 > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f2633c.get(i7));
            }
        }
        if (!this.f2632b.isEmpty()) {
            sb.append(" order by ");
            for (int i8 = 0; i8 < this.f2632b.size(); i8++) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f2632b.get(i8));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

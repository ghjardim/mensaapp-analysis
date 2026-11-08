package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3301k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p207d.AbstractC4094d;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: androidx.datastore.preferences.protobuf.q */
/* loaded from: classes.dex */
public final class C3308q {

    /* renamed from: d */
    public static final C3308q f10577d = new C3308q(true);

    /* renamed from: a */
    public final AbstractC3283b0 f10578a;

    /* renamed from: b */
    public boolean f10579b;

    /* renamed from: c */
    public boolean f10580c;

    /* renamed from: androidx.datastore.preferences.protobuf.q$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10581a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f10582b;

        static {
            int[] iArr = new int[AbstractC3301k0.b.values().length];
            f10582b = iArr;
            try {
                iArr[AbstractC3301k0.b.f10536c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10537d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10538e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10539f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10540n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10541o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10542p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10543q.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10545s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10546t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10544r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10547u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10548v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10550x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10551y.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10552z.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10534A.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10582b[AbstractC3301k0.b.f10549w.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[AbstractC3301k0.c.values().length];
            f10581a = iArr2;
            try {
                iArr2[AbstractC3301k0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10581a[AbstractC3301k0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10581a[AbstractC3301k0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10581a[AbstractC3301k0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10581a[AbstractC3301k0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f10581a[AbstractC3301k0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f10581a[AbstractC3301k0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10581a[AbstractC3301k0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f10581a[AbstractC3301k0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.q$b */
    public interface b extends Comparable {
        /* renamed from: a */
        int m12790a();

        /* renamed from: c */
        boolean m12791c();

        /* renamed from: d */
        AbstractC3301k0.b m12792d();

        /* renamed from: e */
        boolean m12793e();
    }

    public C3308q() {
        this.f10578a = AbstractC3283b0.m12300q();
    }

    /* renamed from: b */
    public static int m12768b(AbstractC3301k0.b bVar, int i7, Object obj) {
        int m12505O = AbstractC3296i.m12505O(i7);
        if (bVar == AbstractC3301k0.b.f10545s) {
            m12505O *= 2;
        }
        return m12505O + m12769c(bVar, obj);
    }

    /* renamed from: c */
    public static int m12769c(AbstractC3301k0.b bVar, Object obj) {
        switch (a.f10582b[bVar.ordinal()]) {
            case 1:
                return AbstractC3296i.m12520i(((Double) obj).doubleValue());
            case 2:
                return AbstractC3296i.m12528q(((Float) obj).floatValue());
            case 3:
                return AbstractC3296i.m12535x(((Long) obj).longValue());
            case 4:
                return AbstractC3296i.m12509S(((Long) obj).longValue());
            case 5:
                return AbstractC3296i.m12533v(((Integer) obj).intValue());
            case 6:
                return AbstractC3296i.m12526o(((Long) obj).longValue());
            case 7:
                return AbstractC3296i.m12524m(((Integer) obj).intValue());
            case 8:
                return AbstractC3296i.m12515d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC3296i.m12530s((InterfaceC3264J) obj);
            case 10:
                return AbstractC3296i.m12491A((InterfaceC3264J) obj);
            case 11:
                return obj instanceof AbstractC3290f ? AbstractC3296i.m12518g((AbstractC3290f) obj) : AbstractC3296i.m12504N((String) obj);
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC3290f ? AbstractC3296i.m12518g((AbstractC3290f) obj) : AbstractC3296i.m12516e((byte[]) obj);
            case 13:
                return AbstractC3296i.m12507Q(((Integer) obj).intValue());
            case 14:
                return AbstractC3296i.m12496F(((Integer) obj).intValue());
            case 15:
                return AbstractC3296i.m12498H(((Long) obj).longValue());
            case 16:
                return AbstractC3296i.m12500J(((Integer) obj).intValue());
            case 17:
                return AbstractC3296i.m12502L(((Long) obj).longValue());
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return AbstractC3296i.m12522k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m12770d(b bVar, Object obj) {
        AbstractC3301k0.b m12792d = bVar.m12792d();
        int m12790a = bVar.m12790a();
        if (!bVar.m12791c()) {
            return m12768b(m12792d, m12790a, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i7 = 0;
        if (!bVar.m12793e()) {
            int i8 = 0;
            while (i7 < size) {
                i8 += m12768b(m12792d, m12790a, list.get(i7));
                i7++;
            }
            return i8;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i9 = 0;
        while (i7 < size) {
            i9 += m12769c(m12792d, list.get(i7));
            i7++;
        }
        return AbstractC3296i.m12505O(m12790a) + i9 + AbstractC3296i.m12507Q(i9);
    }

    /* renamed from: i */
    public static int m12771i(AbstractC3301k0.b bVar, boolean z6) {
        if (z6) {
            return 2;
        }
        return bVar.m12749f();
    }

    /* renamed from: l */
    public static boolean m12772l(Map.Entry entry) {
        AbstractC4094d.m17162a(entry.getKey());
        throw null;
    }

    /* renamed from: m */
    public static boolean m12773m(AbstractC3301k0.b bVar, Object obj) {
        AbstractC3312u.m12834a(obj);
        switch (a.f10581a[bVar.m12748b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC3290f) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof InterfaceC3264J;
            default:
                return false;
        }
    }

    /* renamed from: r */
    public static C3308q m12774r() {
        return new C3308q();
    }

    /* renamed from: u */
    public static void m12775u(AbstractC3296i abstractC3296i, AbstractC3301k0.b bVar, int i7, Object obj) {
        if (bVar == AbstractC3301k0.b.f10545s) {
            abstractC3296i.m12575q0(i7, (InterfaceC3264J) obj);
        } else {
            abstractC3296i.mo12550M0(i7, m12771i(bVar, false));
            m12776v(abstractC3296i, bVar, obj);
        }
    }

    /* renamed from: v */
    public static void m12776v(AbstractC3296i abstractC3296i, AbstractC3301k0.b bVar, Object obj) {
        switch (a.f10582b[bVar.ordinal()]) {
            case 1:
                abstractC3296i.m12566h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC3296i.m12574p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC3296i.m12582x0(((Long) obj).longValue());
                break;
            case 4:
                abstractC3296i.mo12554Q0(((Long) obj).longValue());
                break;
            case 5:
                abstractC3296i.mo12580v0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC3296i.mo12572n0(((Long) obj).longValue());
                break;
            case 7:
                abstractC3296i.mo12570l0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC3296i.m12560b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC3296i.m12577s0((InterfaceC3264J) obj);
                break;
            case 10:
                abstractC3296i.mo12584z0((InterfaceC3264J) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC3290f)) {
                    abstractC3296i.mo12549L0((String) obj);
                    break;
                } else {
                    abstractC3296i.mo12564f0((AbstractC3290f) obj);
                    break;
                }
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (!(obj instanceof AbstractC3290f)) {
                    abstractC3296i.m12561c0((byte[]) obj);
                    break;
                } else {
                    abstractC3296i.mo12564f0((AbstractC3290f) obj);
                    break;
                }
            case 13:
                abstractC3296i.mo12552O0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC3296i.m12541D0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC3296i.m12543F0(((Long) obj).longValue());
                break;
            case 16:
                abstractC3296i.m12545H0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC3296i.m12547J0(((Long) obj).longValue());
                break;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                abstractC3296i.m12568j0(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3308q clone() {
        C3308q m12774r = m12774r();
        int m12306k = this.f10578a.m12306k();
        for (int i7 = 0; i7 < m12306k; i7++) {
            Map.Entry m12305j = this.f10578a.m12305j(i7);
            AbstractC4094d.m17162a(m12305j.getKey());
            m12774r.m12788s(null, m12305j.getValue());
        }
        for (Map.Entry entry : this.f10578a.m12308m()) {
            AbstractC4094d.m17162a(entry.getKey());
            m12774r.m12788s(null, entry.getValue());
        }
        m12774r.f10580c = this.f10580c;
        return m12774r;
    }

    /* renamed from: e */
    public Iterator m12778e() {
        return m12782j() ? Collections.emptyIterator() : this.f10580c ? new C3315x(this.f10578a.m12303h().iterator()) : this.f10578a.m12303h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3308q) {
            return this.f10578a.equals(((C3308q) obj).f10578a);
        }
        return false;
    }

    /* renamed from: f */
    public int m12779f() {
        int m12306k = this.f10578a.m12306k();
        int i7 = 0;
        for (int i8 = 0; i8 < m12306k; i8++) {
            i7 += m12780g(this.f10578a.m12305j(i8));
        }
        Iterator it = this.f10578a.m12308m().iterator();
        while (it.hasNext()) {
            i7 += m12780g((Map.Entry) it.next());
        }
        return i7;
    }

    /* renamed from: g */
    public final int m12780g(Map.Entry entry) {
        AbstractC4094d.m17162a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* renamed from: h */
    public int m12781h() {
        int m12306k = this.f10578a.m12306k();
        int i7 = 0;
        for (int i8 = 0; i8 < m12306k; i8++) {
            Map.Entry m12305j = this.f10578a.m12305j(i8);
            AbstractC4094d.m17162a(m12305j.getKey());
            i7 += m12770d(null, m12305j.getValue());
        }
        for (Map.Entry entry : this.f10578a.m12308m()) {
            AbstractC4094d.m17162a(entry.getKey());
            i7 += m12770d(null, entry.getValue());
        }
        return i7;
    }

    public int hashCode() {
        return this.f10578a.hashCode();
    }

    /* renamed from: j */
    public boolean m12782j() {
        return this.f10578a.isEmpty();
    }

    /* renamed from: k */
    public boolean m12783k() {
        int m12306k = this.f10578a.m12306k();
        for (int i7 = 0; i7 < m12306k; i7++) {
            if (!m12772l(this.f10578a.m12305j(i7))) {
                return false;
            }
        }
        Iterator it = this.f10578a.m12308m().iterator();
        while (it.hasNext()) {
            if (!m12772l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public Iterator m12784n() {
        return m12782j() ? Collections.emptyIterator() : this.f10580c ? new C3315x(this.f10578a.entrySet().iterator()) : this.f10578a.entrySet().iterator();
    }

    /* renamed from: o */
    public void m12785o() {
        if (this.f10579b) {
            return;
        }
        int m12306k = this.f10578a.m12306k();
        for (int i7 = 0; i7 < m12306k; i7++) {
            Map.Entry m12305j = this.f10578a.m12305j(i7);
            if (m12305j.getValue() instanceof AbstractC3311t) {
                ((AbstractC3311t) m12305j.getValue()).m12808D();
            }
        }
        this.f10578a.mo12311p();
        this.f10579b = true;
    }

    /* renamed from: p */
    public void m12786p(C3308q c3308q) {
        int m12306k = c3308q.f10578a.m12306k();
        for (int i7 = 0; i7 < m12306k; i7++) {
            m12787q(c3308q.f10578a.m12305j(i7));
        }
        Iterator it = c3308q.f10578a.m12308m().iterator();
        while (it.hasNext()) {
            m12787q((Map.Entry) it.next());
        }
    }

    /* renamed from: q */
    public final void m12787q(Map.Entry entry) {
        AbstractC4094d.m17162a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* renamed from: s */
    public void m12788s(b bVar, Object obj) {
        if (!bVar.m12791c()) {
            m12789t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m12789t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f10578a.m12312r(bVar, obj);
    }

    /* renamed from: t */
    public final void m12789t(b bVar, Object obj) {
        if (!m12773m(bVar.m12792d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.m12790a()), bVar.m12792d().m12748b(), obj.getClass().getName()));
        }
    }

    public C3308q(boolean z6) {
        this(AbstractC3283b0.m12300q());
        m12785o();
    }

    public C3308q(AbstractC3283b0 abstractC3283b0) {
        this.f10578a = abstractC3283b0;
        m12785o();
    }
}

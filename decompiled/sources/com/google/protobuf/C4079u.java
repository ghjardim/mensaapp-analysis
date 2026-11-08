package com.google.protobuf;

import com.google.protobuf.AbstractC4014B0;
import com.google.protobuf.AbstractC4015C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p207d.AbstractC4094d;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: com.google.protobuf.u */
/* loaded from: classes.dex */
public final class C4079u {

    /* renamed from: d */
    public static final C4079u f13514d = new C4079u(true);

    /* renamed from: a */
    public final AbstractC4072q0 f13515a;

    /* renamed from: b */
    public boolean f13516b;

    /* renamed from: c */
    public boolean f13517c;

    /* renamed from: com.google.protobuf.u$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13518a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f13519b;

        static {
            int[] iArr = new int[AbstractC4014B0.b.values().length];
            f13519b = iArr;
            try {
                iArr[AbstractC4014B0.b.f13244c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13245d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13246e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13247f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13248n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13249o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13250p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13251q.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13253s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13254t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13252r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13255u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13256v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13258x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13259y.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13260z.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13242A.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13519b[AbstractC4014B0.b.f13257w.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[AbstractC4014B0.c.values().length];
            f13518a = iArr2;
            try {
                iArr2[AbstractC4014B0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13518a[AbstractC4014B0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13518a[AbstractC4014B0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13518a[AbstractC4014B0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13518a[AbstractC4014B0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13518a[AbstractC4014B0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f13518a[AbstractC4014B0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13518a[AbstractC4014B0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13518a[AbstractC4014B0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.protobuf.u$b */
    public interface b extends Comparable {
        /* renamed from: a */
        int m16959a();

        /* renamed from: c */
        boolean m16960c();

        /* renamed from: d */
        AbstractC4014B0.b m16961d();

        /* renamed from: e */
        boolean m16962e();
    }

    public C4079u() {
        this.f13515a = AbstractC4072q0.m16885q(16);
    }

    /* renamed from: b */
    public static int m16937b(AbstractC4014B0.b bVar, int i7, Object obj) {
        int m16698Q = AbstractC4061l.m16698Q(i7);
        if (bVar == AbstractC4014B0.b.f13253s) {
            m16698Q *= 2;
        }
        return m16698Q + m16938c(bVar, obj);
    }

    /* renamed from: c */
    public static int m16938c(AbstractC4014B0.b bVar, Object obj) {
        switch (a.f13519b[bVar.ordinal()]) {
            case 1:
                return AbstractC4061l.m16715k(((Double) obj).doubleValue());
            case 2:
                return AbstractC4061l.m16723s(((Float) obj).floatValue());
            case 3:
                return AbstractC4061l.m16730z(((Long) obj).longValue());
            case 4:
                return AbstractC4061l.m16702U(((Long) obj).longValue());
            case 5:
                return AbstractC4061l.m16728x(((Integer) obj).intValue());
            case 6:
                return AbstractC4061l.m16721q(((Long) obj).longValue());
            case 7:
                return AbstractC4061l.m16719o(((Integer) obj).intValue());
            case 8:
                return AbstractC4061l.m16710f(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC4061l.m16725u((InterfaceC4034V) obj);
            case 10:
                return AbstractC4061l.m16684C((InterfaceC4034V) obj);
            case 11:
                return obj instanceof AbstractC4055i ? AbstractC4061l.m16713i((AbstractC4055i) obj) : AbstractC4061l.m16697P((String) obj);
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC4055i ? AbstractC4061l.m16713i((AbstractC4055i) obj) : AbstractC4061l.m16711g((byte[]) obj);
            case 13:
                return AbstractC4061l.m16700S(((Integer) obj).intValue());
            case 14:
                return AbstractC4061l.m16689H(((Integer) obj).intValue());
            case 15:
                return AbstractC4061l.m16691J(((Long) obj).longValue());
            case 16:
                return AbstractC4061l.m16693L(((Integer) obj).intValue());
            case 17:
                return AbstractC4061l.m16695N(((Long) obj).longValue());
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return obj instanceof AbstractC4015C.a ? AbstractC4061l.m16717m(((AbstractC4015C.a) obj).mo16192a()) : AbstractC4061l.m16717m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m16939d(b bVar, Object obj) {
        AbstractC4014B0.b m16961d = bVar.m16961d();
        int m16959a = bVar.m16959a();
        if (!bVar.m16960c()) {
            return m16937b(m16961d, m16959a, obj);
        }
        List list = (List) obj;
        int i7 = 0;
        if (!bVar.m16962e()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i7 += m16937b(m16961d, m16959a, it.next());
            }
            return i7;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i7 += m16938c(m16961d, it2.next());
        }
        return AbstractC4061l.m16698Q(m16959a) + i7 + AbstractC4061l.m16700S(i7);
    }

    /* renamed from: i */
    public static int m16940i(AbstractC4014B0.b bVar, boolean z6) {
        if (z6) {
            return 2;
        }
        return bVar.m16182f();
    }

    /* renamed from: l */
    public static boolean m16941l(Map.Entry entry) {
        AbstractC4094d.m17162a(entry.getKey());
        throw null;
    }

    /* renamed from: m */
    public static boolean m16942m(AbstractC4014B0.b bVar, Object obj) {
        AbstractC4015C.m16183a(obj);
        switch (a.f13518a[bVar.m16181b().ordinal()]) {
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
                return (obj instanceof AbstractC4055i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof AbstractC4015C.a);
            case 9:
                return obj instanceof InterfaceC4034V;
            default:
                return false;
        }
    }

    /* renamed from: r */
    public static C4079u m16943r() {
        return new C4079u();
    }

    /* renamed from: u */
    public static void m16944u(AbstractC4061l abstractC4061l, AbstractC4014B0.b bVar, int i7, Object obj) {
        if (bVar == AbstractC4014B0.b.f13253s) {
            abstractC4061l.m16775v0(i7, (InterfaceC4034V) obj);
        } else {
            abstractC4061l.mo16748R0(i7, m16940i(bVar, false));
            m16945v(abstractC4061l, bVar, obj);
        }
    }

    /* renamed from: v */
    public static void m16945v(AbstractC4061l abstractC4061l, AbstractC4014B0.b bVar, Object obj) {
        switch (a.f13519b[bVar.ordinal()]) {
            case 1:
                abstractC4061l.m16766m0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC4061l.m16774u0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC4061l.m16733C0(((Long) obj).longValue());
                break;
            case 4:
                abstractC4061l.mo16752V0(((Long) obj).longValue());
                break;
            case 5:
                abstractC4061l.mo16731A0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC4061l.mo16772s0(((Long) obj).longValue());
                break;
            case 7:
                abstractC4061l.mo16770q0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC4061l.m16760g0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC4061l.m16777x0((InterfaceC4034V) obj);
                break;
            case 10:
                abstractC4061l.mo16735E0((InterfaceC4034V) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC4055i)) {
                    abstractC4061l.mo16747Q0((String) obj);
                    break;
                } else {
                    abstractC4061l.mo16764k0((AbstractC4055i) obj);
                    break;
                }
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (!(obj instanceof AbstractC4055i)) {
                    abstractC4061l.m16761h0((byte[]) obj);
                    break;
                } else {
                    abstractC4061l.mo16764k0((AbstractC4055i) obj);
                    break;
                }
            case 13:
                abstractC4061l.mo16750T0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC4061l.m16739I0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC4061l.m16741K0(((Long) obj).longValue());
                break;
            case 16:
                abstractC4061l.m16743M0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC4061l.m16745O0(((Long) obj).longValue());
                break;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (!(obj instanceof AbstractC4015C.a)) {
                    abstractC4061l.m16768o0(((Integer) obj).intValue());
                    break;
                } else {
                    abstractC4061l.m16768o0(((AbstractC4015C.a) obj).mo16192a());
                    break;
                }
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4079u clone() {
        C4079u m16943r = m16943r();
        for (int i7 = 0; i7 < this.f13515a.m16891k(); i7++) {
            Map.Entry m16890j = this.f13515a.m16890j(i7);
            AbstractC4094d.m17162a(m16890j.getKey());
            m16943r.m16957s(null, m16890j.getValue());
        }
        for (Map.Entry entry : this.f13515a.m16893m()) {
            AbstractC4094d.m17162a(entry.getKey());
            m16943r.m16957s(null, entry.getValue());
        }
        m16943r.f13517c = this.f13517c;
        return m16943r;
    }

    /* renamed from: e */
    public Iterator m16947e() {
        return this.f13517c ? new C4021H(this.f13515a.m16888h().iterator()) : this.f13515a.m16888h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4079u) {
            return this.f13515a.equals(((C4079u) obj).f13515a);
        }
        return false;
    }

    /* renamed from: f */
    public int m16948f() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f13515a.m16891k(); i8++) {
            i7 += m16949g(this.f13515a.m16890j(i8));
        }
        Iterator it = this.f13515a.m16893m().iterator();
        while (it.hasNext()) {
            i7 += m16949g((Map.Entry) it.next());
        }
        return i7;
    }

    /* renamed from: g */
    public final int m16949g(Map.Entry entry) {
        AbstractC4094d.m17162a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* renamed from: h */
    public int m16950h() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f13515a.m16891k(); i8++) {
            Map.Entry m16890j = this.f13515a.m16890j(i8);
            AbstractC4094d.m17162a(m16890j.getKey());
            i7 += m16939d(null, m16890j.getValue());
        }
        for (Map.Entry entry : this.f13515a.m16893m()) {
            AbstractC4094d.m17162a(entry.getKey());
            i7 += m16939d(null, entry.getValue());
        }
        return i7;
    }

    public int hashCode() {
        return this.f13515a.hashCode();
    }

    /* renamed from: j */
    public boolean m16951j() {
        return this.f13515a.isEmpty();
    }

    /* renamed from: k */
    public boolean m16952k() {
        for (int i7 = 0; i7 < this.f13515a.m16891k(); i7++) {
            if (!m16941l(this.f13515a.m16890j(i7))) {
                return false;
            }
        }
        Iterator it = this.f13515a.m16893m().iterator();
        while (it.hasNext()) {
            if (!m16941l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public Iterator m16953n() {
        return this.f13517c ? new C4021H(this.f13515a.entrySet().iterator()) : this.f13515a.entrySet().iterator();
    }

    /* renamed from: o */
    public void m16954o() {
        if (this.f13516b) {
            return;
        }
        for (int i7 = 0; i7 < this.f13515a.m16891k(); i7++) {
            Map.Entry m16890j = this.f13515a.m16890j(i7);
            if (m16890j.getValue() instanceof AbstractC4087y) {
                ((AbstractC4087y) m16890j.getValue()).m17041J();
            }
        }
        this.f13515a.mo16896p();
        this.f13516b = true;
    }

    /* renamed from: p */
    public void m16955p(C4079u c4079u) {
        for (int i7 = 0; i7 < c4079u.f13515a.m16891k(); i7++) {
            m16956q(c4079u.f13515a.m16890j(i7));
        }
        Iterator it = c4079u.f13515a.m16893m().iterator();
        while (it.hasNext()) {
            m16956q((Map.Entry) it.next());
        }
    }

    /* renamed from: q */
    public final void m16956q(Map.Entry entry) {
        AbstractC4094d.m17162a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* renamed from: s */
    public void m16957s(b bVar, Object obj) {
        if (!bVar.m16960c()) {
            m16958t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m16958t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f13515a.m16897r(bVar, obj);
    }

    /* renamed from: t */
    public final void m16958t(b bVar, Object obj) {
        if (!m16942m(bVar.m16961d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.m16959a()), bVar.m16961d().m16181b(), obj.getClass().getName()));
        }
    }

    public C4079u(boolean z6) {
        this(AbstractC4072q0.m16885q(0));
        m16954o();
    }

    public C4079u(AbstractC4072q0 abstractC4072q0) {
        this.f13515a = abstractC4072q0;
        m16954o();
    }
}

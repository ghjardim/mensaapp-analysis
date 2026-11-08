package com.google.protobuf;

import com.google.protobuf.AbstractC4015C;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC4070p0 {

    /* renamed from: a */
    public static final Class f13480a = m16823A();

    /* renamed from: b */
    public static final AbstractC4082v0 f13481b = m16824B();

    /* renamed from: c */
    public static final AbstractC4082v0 f13482c = new C4086x0();

    /* renamed from: A */
    public static Class m16823A() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static AbstractC4082v0 m16824B() {
        try {
            Class m16825C = m16825C();
            if (m16825C == null) {
                return null;
            }
            return (AbstractC4082v0) m16825C.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static Class m16825C() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static void m16826D(AbstractC4073r abstractC4073r, Object obj, Object obj2) {
        C4079u mo16911c = abstractC4073r.mo16911c(obj2);
        if (mo16911c.m16951j()) {
            return;
        }
        abstractC4073r.mo16912d(obj).m16955p(mo16911c);
    }

    /* renamed from: E */
    public static void m16827E(InterfaceC4029P interfaceC4029P, Object obj, Object obj2, long j7) {
        AbstractC4090z0.m17102V(obj, j7, interfaceC4029P.mo16299a(AbstractC4090z0.m17087G(obj, j7), AbstractC4090z0.m17087G(obj2, j7)));
    }

    /* renamed from: F */
    public static void m16828F(AbstractC4082v0 abstractC4082v0, Object obj, Object obj2) {
        abstractC4082v0.mo16980p(obj, abstractC4082v0.mo16975k(abstractC4082v0.mo16971g(obj), abstractC4082v0.mo16971g(obj2)));
    }

    /* renamed from: G */
    public static void m16829G(Class cls) {
        Class cls2;
        if (!AbstractC4087y.class.isAssignableFrom(cls) && (cls2 = f13480a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: H */
    public static boolean m16830H(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: I */
    public static Object m16831I(Object obj, int i7, int i8, Object obj2, AbstractC4082v0 abstractC4082v0) {
        if (obj2 == null) {
            obj2 = abstractC4082v0.mo16970f(obj);
        }
        abstractC4082v0.mo16969e(obj2, i7, i8);
        return obj2;
    }

    /* renamed from: J */
    public static AbstractC4082v0 m16832J() {
        return f13481b;
    }

    /* renamed from: K */
    public static AbstractC4082v0 m16833K() {
        return f13482c;
    }

    /* renamed from: L */
    public static void m16834L(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16233w(i7, list, z6);
    }

    /* renamed from: M */
    public static void m16835M(int i7, List list, InterfaceC4016C0 interfaceC4016C0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16204I(i7, list);
    }

    /* renamed from: N */
    public static void m16836N(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16202G(i7, list, z6);
    }

    /* renamed from: O */
    public static void m16837O(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16201F(i7, list, z6);
    }

    /* renamed from: P */
    public static void m16838P(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16232v(i7, list, z6);
    }

    /* renamed from: Q */
    public static void m16839Q(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16229s(i7, list, z6);
    }

    /* renamed from: R */
    public static void m16840R(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16211a(i7, list, z6);
    }

    /* renamed from: S */
    public static void m16841S(int i7, List list, InterfaceC4016C0 interfaceC4016C0, InterfaceC4066n0 interfaceC4066n0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16206K(i7, list, interfaceC4066n0);
    }

    /* renamed from: T */
    public static void m16842T(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16223m(i7, list, z6);
    }

    /* renamed from: U */
    public static void m16843U(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16200E(i7, list, z6);
    }

    /* renamed from: V */
    public static void m16844V(int i7, List list, InterfaceC4016C0 interfaceC4016C0, InterfaceC4066n0 interfaceC4066n0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16205J(i7, list, interfaceC4066n0);
    }

    /* renamed from: W */
    public static void m16845W(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16230t(i7, list, z6);
    }

    /* renamed from: X */
    public static void m16846X(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16216f(i7, list, z6);
    }

    /* renamed from: Y */
    public static void m16847Y(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16198C(i7, list, z6);
    }

    /* renamed from: Z */
    public static void m16848Z(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16235y(i7, list, z6);
    }

    /* renamed from: a */
    public static int m16849a(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(size) : size * AbstractC4061l.m16709e(i7, true);
    }

    /* renamed from: a0 */
    public static void m16850a0(int i7, List list, InterfaceC4016C0 interfaceC4016C0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16220j(i7, list);
    }

    /* renamed from: b */
    public static int m16851b(List list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m16852b0(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16234x(i7, list, z6);
    }

    /* renamed from: c */
    public static int m16853c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16698Q = size * AbstractC4061l.m16698Q(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            m16698Q += AbstractC4061l.m16713i((AbstractC4055i) list.get(i8));
        }
        return m16698Q;
    }

    /* renamed from: c0 */
    public static void m16854c0(int i7, List list, InterfaceC4016C0 interfaceC4016C0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4016C0.mo16217g(i7, list, z6);
    }

    /* renamed from: d */
    public static int m16855d(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16856e = m16856e(list);
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(m16856e) : m16856e + (size * AbstractC4061l.m16698Q(i7));
    }

    /* renamed from: e */
    public static int m16856e(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4013B) {
            C4013B c4013b = (C4013B) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16717m(c4013b.m16173l(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16717m(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    /* renamed from: f */
    public static int m16857f(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(size * 4) : size * AbstractC4061l.m16718n(i7, 0);
    }

    /* renamed from: g */
    public static int m16858g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m16859h(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(size * 8) : size * AbstractC4061l.m16720p(i7, 0L);
    }

    /* renamed from: i */
    public static int m16860i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m16861j(int i7, List list, InterfaceC4066n0 interfaceC4066n0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += AbstractC4061l.m16724t(i7, (InterfaceC4034V) list.get(i9), interfaceC4066n0);
        }
        return i8;
    }

    /* renamed from: k */
    public static int m16862k(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16863l = m16863l(list);
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(m16863l) : m16863l + (size * AbstractC4061l.m16698Q(i7));
    }

    /* renamed from: l */
    public static int m16863l(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4013B) {
            C4013B c4013b = (C4013B) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16728x(c4013b.m16173l(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16728x(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    /* renamed from: m */
    public static int m16864m(int i7, List list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        int m16865n = m16865n(list);
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(m16865n) : m16865n + (list.size() * AbstractC4061l.m16698Q(i7));
    }

    /* renamed from: n */
    public static int m16865n(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC4025L) {
            AbstractC4025L abstractC4025L = (AbstractC4025L) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16730z(abstractC4025L.m16275e(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16730z(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    /* renamed from: o */
    public static int m16866o(int i7, Object obj, InterfaceC4066n0 interfaceC4066n0) {
        return AbstractC4061l.m16683B(i7, (InterfaceC4034V) obj, interfaceC4066n0);
    }

    /* renamed from: p */
    public static int m16867p(int i7, List list, InterfaceC4066n0 interfaceC4066n0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16698Q = AbstractC4061l.m16698Q(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            m16698Q += AbstractC4061l.m16685D((InterfaceC4034V) list.get(i8), interfaceC4066n0);
        }
        return m16698Q;
    }

    /* renamed from: q */
    public static int m16868q(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16869r = m16869r(list);
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(m16869r) : m16869r + (size * AbstractC4061l.m16698Q(i7));
    }

    /* renamed from: r */
    public static int m16869r(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4013B) {
            C4013B c4013b = (C4013B) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16693L(c4013b.m16173l(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16693L(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    /* renamed from: s */
    public static int m16870s(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16871t = m16871t(list);
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(m16871t) : m16871t + (size * AbstractC4061l.m16698Q(i7));
    }

    /* renamed from: t */
    public static int m16871t(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC4025L) {
            AbstractC4025L abstractC4025L = (AbstractC4025L) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16695N(abstractC4025L.m16275e(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16695N(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    /* renamed from: u */
    public static int m16872u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int m16698Q = AbstractC4061l.m16698Q(i7) * size;
        if (list instanceof InterfaceC4023J) {
            InterfaceC4023J interfaceC4023J = (InterfaceC4023J) list;
            while (i8 < size) {
                Object mo16264l0 = interfaceC4023J.mo16264l0(i8);
                m16698Q += mo16264l0 instanceof AbstractC4055i ? AbstractC4061l.m16713i((AbstractC4055i) mo16264l0) : AbstractC4061l.m16697P((String) mo16264l0);
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                m16698Q += obj instanceof AbstractC4055i ? AbstractC4061l.m16713i((AbstractC4055i) obj) : AbstractC4061l.m16697P((String) obj);
                i8++;
            }
        }
        return m16698Q;
    }

    /* renamed from: v */
    public static int m16873v(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16874w = m16874w(list);
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(m16874w) : m16874w + (size * AbstractC4061l.m16698Q(i7));
    }

    /* renamed from: w */
    public static int m16874w(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4013B) {
            C4013B c4013b = (C4013B) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16700S(c4013b.m16173l(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16700S(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    /* renamed from: x */
    public static int m16875x(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m16876y = m16876y(list);
        return z6 ? AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(m16876y) : m16876y + (size * AbstractC4061l.m16698Q(i7));
    }

    /* renamed from: y */
    public static int m16876y(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC4025L) {
            AbstractC4025L abstractC4025L = (AbstractC4025L) list;
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16702U(abstractC4025L.m16275e(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC4061l.m16702U(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    /* renamed from: z */
    public static Object m16877z(Object obj, int i7, List list, AbstractC4015C.c cVar, Object obj2, AbstractC4082v0 abstractC4082v0) {
        if (cVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int intValue = num.intValue();
                if (cVar.m16193a(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj2 = m16831I(obj, i7, intValue, obj2, abstractC4082v0);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!cVar.m16193a(intValue2)) {
                    obj2 = m16831I(obj, i7, intValue2, obj2, abstractC4082v0);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}

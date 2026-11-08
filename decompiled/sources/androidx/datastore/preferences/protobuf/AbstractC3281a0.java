package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3312u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC3281a0 {

    /* renamed from: a */
    public static final Class f10421a = m12240A();

    /* renamed from: b */
    public static final AbstractC3291f0 f10422b = m12241B();

    /* renamed from: c */
    public static final AbstractC3291f0 f10423c = new C3295h0();

    /* renamed from: A */
    public static Class m12240A() {
        if (C3274U.f10411d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static AbstractC3291f0 m12241B() {
        try {
            Class m12242C = m12242C();
            if (m12242C == null) {
                return null;
            }
            return (AbstractC3291f0) m12242C.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static Class m12242C() {
        if (C3274U.f10411d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static void m12243D(AbstractC3305n abstractC3305n, Object obj, Object obj2) {
        C3308q mo12757c = abstractC3305n.mo12757c(obj2);
        if (mo12757c.m12782j()) {
            return;
        }
        abstractC3305n.mo12758d(obj).m12786p(mo12757c);
    }

    /* renamed from: E */
    public static void m12244E(InterfaceC3259E interfaceC3259E, Object obj, Object obj2, long j7) {
        AbstractC3297i0.m12611O(obj, j7, interfaceC3259E.mo12078a(AbstractC3297i0.m12639z(obj, j7), AbstractC3297i0.m12639z(obj2, j7)));
    }

    /* renamed from: F */
    public static void m12245F(AbstractC3291f0 abstractC3291f0, Object obj, Object obj2) {
        abstractC3291f0.mo12374p(obj, abstractC3291f0.mo12369k(abstractC3291f0.mo12365g(obj), abstractC3291f0.mo12365g(obj2)));
    }

    /* renamed from: G */
    public static void m12246G(Class cls) {
        Class cls2;
        if (!AbstractC3311t.class.isAssignableFrom(cls) && !C3274U.f10411d && (cls2 = f10421a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: H */
    public static boolean m12247H(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: I */
    public static Object m12248I(Object obj, int i7, int i8, Object obj2, AbstractC3291f0 abstractC3291f0) {
        if (obj2 == null) {
            obj2 = abstractC3291f0.mo12364f(obj);
        }
        abstractC3291f0.mo12363e(obj2, i7, i8);
        return obj2;
    }

    /* renamed from: J */
    public static AbstractC3291f0 m12249J() {
        return f10422b;
    }

    /* renamed from: K */
    public static AbstractC3291f0 m12250K() {
        return f10423c;
    }

    /* renamed from: L */
    public static void m12251L(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12716w(i7, list, z6);
    }

    /* renamed from: M */
    public static void m12252M(int i7, List list, InterfaceC3303l0 interfaceC3303l0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12668I(i7, list);
    }

    /* renamed from: N */
    public static void m12253N(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12666G(i7, list, z6);
    }

    /* renamed from: O */
    public static void m12254O(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12665F(i7, list, z6);
    }

    /* renamed from: P */
    public static void m12255P(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12715v(i7, list, z6);
    }

    /* renamed from: Q */
    public static void m12256Q(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12712s(i7, list, z6);
    }

    /* renamed from: R */
    public static void m12257R(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12685a(i7, list, z6);
    }

    /* renamed from: S */
    public static void m12258S(int i7, List list, InterfaceC3303l0 interfaceC3303l0, InterfaceC3278Y interfaceC3278Y) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12670K(i7, list, interfaceC3278Y);
    }

    /* renamed from: T */
    public static void m12259T(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12706m(i7, list, z6);
    }

    /* renamed from: U */
    public static void m12260U(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12664E(i7, list, z6);
    }

    /* renamed from: V */
    public static void m12261V(int i7, List list, InterfaceC3303l0 interfaceC3303l0, InterfaceC3278Y interfaceC3278Y) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12669J(i7, list, interfaceC3278Y);
    }

    /* renamed from: W */
    public static void m12262W(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12713t(i7, list, z6);
    }

    /* renamed from: X */
    public static void m12263X(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12695f(i7, list, z6);
    }

    /* renamed from: Y */
    public static void m12264Y(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12662C(i7, list, z6);
    }

    /* renamed from: Z */
    public static void m12265Z(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12718y(i7, list, z6);
    }

    /* renamed from: a */
    public static int m12266a(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(size) : size * AbstractC3296i.m12514c(i7, true);
    }

    /* renamed from: a0 */
    public static void m12267a0(int i7, List list, InterfaceC3303l0 interfaceC3303l0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12703j(i7, list);
    }

    /* renamed from: b */
    public static int m12268b(List list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m12269b0(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12717x(i7, list, z6);
    }

    /* renamed from: c */
    public static int m12270c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12505O = size * AbstractC3296i.m12505O(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            m12505O += AbstractC3296i.m12518g((AbstractC3290f) list.get(i8));
        }
        return m12505O;
    }

    /* renamed from: c0 */
    public static void m12271c0(int i7, List list, InterfaceC3303l0 interfaceC3303l0, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC3303l0.mo12697g(i7, list, z6);
    }

    /* renamed from: d */
    public static int m12272d(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12273e = m12273e(list);
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(m12273e) : m12273e + (size * AbstractC3296i.m12505O(i7));
    }

    /* renamed from: e */
    public static int m12273e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC3296i.m12522k(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    /* renamed from: f */
    public static int m12274f(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(size * 4) : size * AbstractC3296i.m12523l(i7, 0);
    }

    /* renamed from: g */
    public static int m12275g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m12276h(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(size * 8) : size * AbstractC3296i.m12525n(i7, 0L);
    }

    /* renamed from: i */
    public static int m12277i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m12278j(int i7, List list, InterfaceC3278Y interfaceC3278Y) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += AbstractC3296i.m12529r(i7, (InterfaceC3264J) list.get(i9), interfaceC3278Y);
        }
        return i8;
    }

    /* renamed from: k */
    public static int m12279k(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12280l = m12280l(list);
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(m12280l) : m12280l + (size * AbstractC3296i.m12505O(i7));
    }

    /* renamed from: l */
    public static int m12280l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC3296i.m12533v(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    /* renamed from: m */
    public static int m12281m(int i7, List list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        int m12282n = m12282n(list);
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(m12282n) : m12282n + (list.size() * AbstractC3296i.m12505O(i7));
    }

    /* renamed from: n */
    public static int m12282n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC3296i.m12535x(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    /* renamed from: o */
    public static int m12283o(int i7, Object obj, InterfaceC3278Y interfaceC3278Y) {
        return AbstractC3296i.m12537z(i7, (InterfaceC3264J) obj, interfaceC3278Y);
    }

    /* renamed from: p */
    public static int m12284p(int i7, List list, InterfaceC3278Y interfaceC3278Y) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12505O = AbstractC3296i.m12505O(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            m12505O += AbstractC3296i.m12492B((InterfaceC3264J) list.get(i8), interfaceC3278Y);
        }
        return m12505O;
    }

    /* renamed from: q */
    public static int m12285q(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12286r = m12286r(list);
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(m12286r) : m12286r + (size * AbstractC3296i.m12505O(i7));
    }

    /* renamed from: r */
    public static int m12286r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC3296i.m12500J(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    /* renamed from: s */
    public static int m12287s(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12288t = m12288t(list);
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(m12288t) : m12288t + (size * AbstractC3296i.m12505O(i7));
    }

    /* renamed from: t */
    public static int m12288t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC3296i.m12502L(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    /* renamed from: u */
    public static int m12289u(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12505O = AbstractC3296i.m12505O(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            m12505O += obj instanceof AbstractC3290f ? AbstractC3296i.m12518g((AbstractC3290f) obj) : AbstractC3296i.m12504N((String) obj);
        }
        return m12505O;
    }

    /* renamed from: v */
    public static int m12290v(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12291w = m12291w(list);
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(m12291w) : m12291w + (size * AbstractC3296i.m12505O(i7));
    }

    /* renamed from: w */
    public static int m12291w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC3296i.m12507Q(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    /* renamed from: x */
    public static int m12292x(int i7, List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m12293y = m12293y(list);
        return z6 ? AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(m12293y) : m12293y + (size * AbstractC3296i.m12505O(i7));
    }

    /* renamed from: y */
    public static int m12293y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC3296i.m12509S(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    /* renamed from: z */
    public static Object m12294z(Object obj, int i7, List list, AbstractC3312u.a aVar, Object obj2, AbstractC3291f0 abstractC3291f0) {
        if (aVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int intValue = num.intValue();
                if (aVar.m12841a(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj2 = m12248I(obj, i7, intValue, obj2, abstractC3291f0);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aVar.m12841a(intValue2)) {
                    obj2 = m12248I(obj, i7, intValue2, obj2, abstractC3291f0);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}

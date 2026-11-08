package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3280a;
import androidx.datastore.preferences.protobuf.AbstractC3312u;
import com.google.android.gms.common.api.C3643a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.t */
/* loaded from: classes.dex */
public abstract class AbstractC3311t extends AbstractC3280a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC3311t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C3293g0 unknownFields = C3293g0.m12445c();

    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static abstract class a extends AbstractC3280a.a {

        /* renamed from: a */
        public final AbstractC3311t f10651a;

        /* renamed from: b */
        public AbstractC3311t f10652b;

        public a(AbstractC3311t abstractC3311t) {
            this.f10651a = abstractC3311t;
            if (abstractC3311t.m12807C()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f10652b = m12827p();
        }

        /* renamed from: o */
        public static void m12826o(Object obj, Object obj2) {
            C3274U.m12181a().m12184d(obj).mo12140a(obj, obj2);
        }

        /* renamed from: p */
        private AbstractC3311t m12827p() {
            return this.f10651a.m12811I();
        }

        /* renamed from: i */
        public final AbstractC3311t m12828i() {
            AbstractC3311t mo12097h = mo12097h();
            if (mo12097h.m12806A()) {
                return mo12097h;
            }
            throw AbstractC3280a.a.m12239g(mo12097h);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC3264J.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AbstractC3311t mo12097h() {
            if (!this.f10652b.m12807C()) {
                return this.f10652b;
            }
            this.f10652b.m12808D();
            return this.f10652b;
        }

        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a mo12095c = mo12098a().mo12095c();
            mo12095c.f10652b = mo12097h();
            return mo12095c;
        }

        /* renamed from: l */
        public final void m12831l() {
            if (this.f10652b.m12807C()) {
                return;
            }
            m12832m();
        }

        /* renamed from: m */
        public void m12832m() {
            AbstractC3311t m12827p = m12827p();
            m12826o(m12827p, this.f10652b);
            this.f10652b = m12827p;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC3265K
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public AbstractC3311t mo12098a() {
            return this.f10651a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$b */
    public static class b extends AbstractC3282b {

        /* renamed from: b */
        public final AbstractC3311t f10653b;

        public b(AbstractC3311t abstractC3311t) {
            this.f10653b = abstractC3311t;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static class c extends AbstractC3300k {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: B */
    public static final boolean m12796B(AbstractC3311t abstractC3311t, boolean z6) {
        byte byteValue = ((Byte) abstractC3311t.m12820q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo12144c = C3274U.m12181a().m12184d(abstractC3311t).mo12144c(abstractC3311t);
        if (z6) {
            abstractC3311t.m12821r(d.SET_MEMOIZED_IS_INITIALIZED, mo12144c ? abstractC3311t : null);
        }
        return mo12144c;
    }

    /* renamed from: F */
    public static AbstractC3312u.b m12797F(AbstractC3312u.b bVar) {
        int size = bVar.size();
        return bVar.mo12187d(size == 0 ? 10 : size * 2);
    }

    /* renamed from: H */
    public static Object m12798H(InterfaceC3264J interfaceC3264J, String str, Object[] objArr) {
        return new C3276W(interfaceC3264J, str, objArr);
    }

    /* renamed from: J */
    public static AbstractC3311t m12799J(AbstractC3311t abstractC3311t, InputStream inputStream) {
        return m12802k(m12800K(abstractC3311t, AbstractC3292g.m12381g(inputStream), C3304m.m12753b()));
    }

    /* renamed from: K */
    public static AbstractC3311t m12800K(AbstractC3311t abstractC3311t, AbstractC3292g abstractC3292g, C3304m c3304m) {
        AbstractC3311t m12811I = abstractC3311t.m12811I();
        try {
            InterfaceC3278Y m12184d = C3274U.m12181a().m12184d(m12811I);
            m12184d.mo12151g(m12811I, C3294h.m12463O(abstractC3292g), c3304m);
            m12184d.mo12142b(m12811I);
            return m12811I;
        } catch (C3289e0 e7) {
            throw e7.m12333a().m12854k(m12811I);
        } catch (C3313v e8) {
            e = e8;
            if (e.m12852a()) {
                e = new C3313v(e);
            }
            throw e.m12854k(m12811I);
        } catch (IOException e9) {
            if (e9.getCause() instanceof C3313v) {
                throw ((C3313v) e9.getCause());
            }
            throw new C3313v(e9).m12854k(m12811I);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C3313v) {
                throw ((C3313v) e10.getCause());
            }
            throw e10;
        }
    }

    /* renamed from: L */
    public static void m12801L(Class cls, AbstractC3311t abstractC3311t) {
        abstractC3311t.m12809E();
        defaultInstanceMap.put(cls, abstractC3311t);
    }

    /* renamed from: k */
    public static AbstractC3311t m12802k(AbstractC3311t abstractC3311t) {
        if (abstractC3311t == null || abstractC3311t.m12806A()) {
            return abstractC3311t;
        }
        throw abstractC3311t.m12235g().m12333a().m12854k(abstractC3311t);
    }

    /* renamed from: t */
    public static AbstractC3312u.b m12803t() {
        return C3275V.m12186e();
    }

    /* renamed from: u */
    public static AbstractC3311t m12804u(Class cls) {
        AbstractC3311t abstractC3311t = defaultInstanceMap.get(cls);
        if (abstractC3311t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3311t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC3311t == null) {
            abstractC3311t = ((AbstractC3311t) AbstractC3297i0.m12622i(cls)).mo12098a();
            if (abstractC3311t == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC3311t);
        }
        return abstractC3311t;
    }

    /* renamed from: z */
    public static Object m12805z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: A */
    public final boolean m12806A() {
        return m12796B(this, true);
    }

    /* renamed from: C */
    public boolean m12807C() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* renamed from: D */
    public void m12808D() {
        C3274U.m12181a().m12184d(this).mo12142b(this);
        m12809E();
    }

    /* renamed from: E */
    public void m12809E() {
        this.memoizedSerializedSize &= C3643a.e.API_PRIORITY_OTHER;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3264J
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a mo12095c() {
        return (a) m12820q(d.NEW_BUILDER);
    }

    /* renamed from: I */
    public AbstractC3311t m12811I() {
        return (AbstractC3311t) m12820q(d.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: M */
    public void m12812M(int i7) {
        this.memoizedHashCode = i7;
    }

    /* renamed from: N */
    public void m12813N(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & C3643a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3264J
    /* renamed from: b */
    public int mo12094b() {
        return mo12234f(null);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3264J
    /* renamed from: d */
    public void mo12096d(AbstractC3296i abstractC3296i) {
        C3274U.m12181a().m12184d(this).mo12153h(this, C3298j.m12659P(abstractC3296i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C3274U.m12181a().m12184d(this).mo12145d(this, (AbstractC3311t) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3280a
    /* renamed from: f */
    public int mo12234f(InterfaceC3278Y interfaceC3278Y) {
        if (!m12807C()) {
            if (m12824x() != Integer.MAX_VALUE) {
                return m12824x();
            }
            int m12818o = m12818o(interfaceC3278Y);
            m12813N(m12818o);
            return m12818o;
        }
        int m12818o2 = m12818o(interfaceC3278Y);
        if (m12818o2 >= 0) {
            return m12818o2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m12818o2);
    }

    public int hashCode() {
        if (m12807C()) {
            return m12817n();
        }
        if (m12825y()) {
            m12812M(m12817n());
        }
        return m12823w();
    }

    /* renamed from: j */
    public Object m12814j() {
        return m12820q(d.BUILD_MESSAGE_INFO);
    }

    /* renamed from: l */
    public void m12815l() {
        this.memoizedHashCode = 0;
    }

    /* renamed from: m */
    public void m12816m() {
        m12813N(C3643a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: n */
    public int m12817n() {
        return C3274U.m12181a().m12184d(this).mo12149f(this);
    }

    /* renamed from: o */
    public final int m12818o(InterfaceC3278Y interfaceC3278Y) {
        return interfaceC3278Y == null ? C3274U.m12181a().m12184d(this).mo12147e(this) : interfaceC3278Y.mo12147e(this);
    }

    /* renamed from: p */
    public final a m12819p() {
        return (a) m12820q(d.NEW_BUILDER);
    }

    /* renamed from: q */
    public Object m12820q(d dVar) {
        return mo8221s(dVar, null, null);
    }

    /* renamed from: r */
    public Object m12821r(d dVar, Object obj) {
        return mo8221s(dVar, obj, null);
    }

    /* renamed from: s */
    public abstract Object mo8221s(d dVar, Object obj, Object obj2);

    public String toString() {
        return AbstractC3266L.m12104f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3265K
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC3311t mo12098a() {
        return (AbstractC3311t) m12820q(d.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: w */
    public int m12823w() {
        return this.memoizedHashCode;
    }

    /* renamed from: x */
    public int m12824x() {
        return this.memoizedSerializedSize & C3643a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: y */
    public boolean m12825y() {
        return m12823w() == 0;
    }
}

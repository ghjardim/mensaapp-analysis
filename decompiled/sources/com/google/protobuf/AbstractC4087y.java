package com.google.protobuf;

import com.google.android.gms.common.api.C3643a;
import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4039a;
import com.google.protobuf.AbstractC4049f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.y */
/* loaded from: classes.dex */
public abstract class AbstractC4087y extends AbstractC4039a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC4087y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C4084w0 unknownFields = C4084w0.m16986c();

    /* renamed from: com.google.protobuf.y$a */
    public static abstract class a extends AbstractC4039a.a {

        /* renamed from: a */
        public final AbstractC4087y f13596a;

        /* renamed from: b */
        public AbstractC4087y f13597b;

        public a(AbstractC4087y abstractC4087y) {
            this.f13596a = abstractC4087y;
            if (abstractC4087y.m17040I()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f13597b = m17058v();
        }

        /* renamed from: u */
        public static void m17057u(Object obj, Object obj2) {
            C4056i0.m16519a().m16522d(obj).mo16366a(obj, obj2);
        }

        /* renamed from: v */
        private AbstractC4087y m17058v() {
            return this.f13596a.m17044O();
        }

        @Override // com.google.protobuf.InterfaceC4035W
        /* renamed from: d */
        public final boolean mo16323d() {
            return AbstractC4087y.m17024H(this.f13597b, false);
        }

        /* renamed from: n */
        public final AbstractC4087y m17059n() {
            AbstractC4087y mo16321h = mo16321h();
            if (mo16321h.mo16323d()) {
                return mo16321h;
            }
            throw AbstractC4039a.a.m16418m(mo16321h);
        }

        @Override // com.google.protobuf.InterfaceC4034V.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractC4087y mo16321h() {
            if (!this.f13597b.m17040I()) {
                return this.f13597b;
            }
            this.f13597b.m17041J();
            return this.f13597b;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a mo16316c = mo16322a().mo16316c();
            mo16316c.f13597b = mo16321h();
            return mo16316c;
        }

        /* renamed from: q */
        public final void m17062q() {
            if (this.f13597b.m17040I()) {
                return;
            }
            m17063r();
        }

        /* renamed from: r */
        public void m17063r() {
            AbstractC4087y m17058v = m17058v();
            m17057u(m17058v, this.f13597b);
            this.f13597b = m17058v;
        }

        @Override // com.google.protobuf.InterfaceC4035W
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public AbstractC4087y mo16322a() {
            return this.f13596a;
        }

        /* renamed from: t */
        public a m17065t(AbstractC4087y abstractC4087y) {
            if (mo16322a().equals(abstractC4087y)) {
                return this;
            }
            m17062q();
            m17057u(this.f13597b, abstractC4087y);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.y$b */
    public static class b extends AbstractC4041b {

        /* renamed from: b */
        public final AbstractC4087y f13598b;

        public b(AbstractC4087y abstractC4087y) {
            this.f13598b = abstractC4087y;
        }

        @Override // com.google.protobuf.InterfaceC4050f0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC4087y mo16487b(AbstractC4057j abstractC4057j, C4071q c4071q) {
            return AbstractC4087y.m17031T(this.f13598b, abstractC4057j, c4071q);
        }
    }

    /* renamed from: com.google.protobuf.y$c */
    public static class c extends AbstractC4067o {
    }

    /* renamed from: com.google.protobuf.y$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: A */
    public static AbstractC4015C.e m17021A() {
        return C4058j0.m16624e();
    }

    /* renamed from: B */
    public static AbstractC4087y m17022B(Class cls) {
        AbstractC4087y abstractC4087y = defaultInstanceMap.get(cls);
        if (abstractC4087y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC4087y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC4087y == null) {
            abstractC4087y = ((AbstractC4087y) AbstractC4090z0.m17116l(cls)).mo16322a();
            if (abstractC4087y == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC4087y);
        }
        return abstractC4087y;
    }

    /* renamed from: G */
    public static Object m17023G(Method method, Object obj, Object... objArr) {
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

    /* renamed from: H */
    public static final boolean m17024H(AbstractC4087y abstractC4087y, boolean z6) {
        byte byteValue = ((Byte) abstractC4087y.m17055w(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo16369c = C4056i0.m16519a().m16522d(abstractC4087y).mo16369c(abstractC4087y);
        if (z6) {
            abstractC4087y.m17056x(d.SET_MEMOIZED_IS_INITIALIZED, mo16369c ? abstractC4087y : null);
        }
        return mo16369c;
    }

    /* renamed from: L */
    public static AbstractC4015C.e m17025L(AbstractC4015C.e eVar) {
        int size = eVar.size();
        return eVar.mo16168d(size == 0 ? 10 : size * 2);
    }

    /* renamed from: N */
    public static Object m17026N(InterfaceC4034V interfaceC4034V, String str, Object[] objArr) {
        return new C4060k0(interfaceC4034V, str, objArr);
    }

    /* renamed from: P */
    public static AbstractC4087y m17027P(AbstractC4087y abstractC4087y, AbstractC4055i abstractC4055i) {
        return m17034p(m17028Q(abstractC4087y, abstractC4055i, C4071q.m16878b()));
    }

    /* renamed from: Q */
    public static AbstractC4087y m17028Q(AbstractC4087y abstractC4087y, AbstractC4055i abstractC4055i, C4071q c4071q) {
        return m17034p(m17030S(abstractC4087y, abstractC4055i, c4071q));
    }

    /* renamed from: R */
    public static AbstractC4087y m17029R(AbstractC4087y abstractC4087y, byte[] bArr) {
        return m17034p(m17032U(abstractC4087y, bArr, 0, bArr.length, C4071q.m16878b()));
    }

    /* renamed from: S */
    public static AbstractC4087y m17030S(AbstractC4087y abstractC4087y, AbstractC4055i abstractC4055i, C4071q c4071q) {
        AbstractC4057j mo16441w = abstractC4055i.mo16441w();
        AbstractC4087y m17031T = m17031T(abstractC4087y, mo16441w, c4071q);
        try {
            mo16441w.mo16543a(0);
            return m17031T;
        } catch (C4017D e7) {
            throw e7.m16249k(m17031T);
        }
    }

    /* renamed from: T */
    public static AbstractC4087y m17031T(AbstractC4087y abstractC4087y, AbstractC4057j abstractC4057j, C4071q c4071q) {
        AbstractC4087y m17044O = abstractC4087y.m17044O();
        try {
            InterfaceC4066n0 m16522d = C4056i0.m16519a().m16522d(m17044O);
            m16522d.mo16379h(m17044O, C4059k.m16628O(abstractC4057j), c4071q);
            m16522d.mo16367b(m17044O);
            return m17044O;
        } catch (C4017D e7) {
            e = e7;
            if (e.m16247a()) {
                e = new C4017D(e);
            }
            throw e.m16249k(m17044O);
        } catch (C4080u0 e8) {
            throw e8.m16963a().m16249k(m17044O);
        } catch (IOException e9) {
            if (e9.getCause() instanceof C4017D) {
                throw ((C4017D) e9.getCause());
            }
            throw new C4017D(e9).m16249k(m17044O);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C4017D) {
                throw ((C4017D) e10.getCause());
            }
            throw e10;
        }
    }

    /* renamed from: U */
    public static AbstractC4087y m17032U(AbstractC4087y abstractC4087y, byte[] bArr, int i7, int i8, C4071q c4071q) {
        AbstractC4087y m17044O = abstractC4087y.m17044O();
        try {
            InterfaceC4066n0 m16522d = C4056i0.m16519a().m16522d(m17044O);
            m16522d.mo16381i(m17044O, bArr, i7, i7 + i8, new AbstractC4049f.a(c4071q));
            m16522d.mo16367b(m17044O);
            return m17044O;
        } catch (C4017D e7) {
            e = e7;
            if (e.m16247a()) {
                e = new C4017D(e);
            }
            throw e.m16249k(m17044O);
        } catch (C4080u0 e8) {
            throw e8.m16963a().m16249k(m17044O);
        } catch (IOException e9) {
            if (e9.getCause() instanceof C4017D) {
                throw ((C4017D) e9.getCause());
            }
            throw new C4017D(e9).m16249k(m17044O);
        } catch (IndexOutOfBoundsException unused) {
            throw C4017D.m16246m().m16249k(m17044O);
        }
    }

    /* renamed from: V */
    public static void m17033V(Class cls, AbstractC4087y abstractC4087y) {
        abstractC4087y.m17042K();
        defaultInstanceMap.put(cls, abstractC4087y);
    }

    /* renamed from: p */
    public static AbstractC4087y m17034p(AbstractC4087y abstractC4087y) {
        if (abstractC4087y == null || abstractC4087y.mo16323d()) {
            return abstractC4087y;
        }
        throw abstractC4087y.m16415n().m16963a().m16249k(abstractC4087y);
    }

    /* renamed from: z */
    public static AbstractC4015C.d m17035z() {
        return C4013B.m16164h();
    }

    @Override // com.google.protobuf.InterfaceC4035W
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final AbstractC4087y mo16322a() {
        return (AbstractC4087y) m17055w(d.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: D */
    public int m17037D() {
        return this.memoizedHashCode;
    }

    /* renamed from: E */
    public int m17038E() {
        return this.memoizedSerializedSize & C3643a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: F */
    public boolean m17039F() {
        return m17037D() == 0;
    }

    /* renamed from: I */
    public boolean m17040I() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* renamed from: J */
    public void m17041J() {
        C4056i0.m16519a().m16522d(this).mo16367b(this);
        m17042K();
    }

    /* renamed from: K */
    public void m17042K() {
        this.memoizedSerializedSize &= C3643a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.protobuf.InterfaceC4034V
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final a mo16316c() {
        return (a) m17055w(d.NEW_BUILDER);
    }

    /* renamed from: O */
    public AbstractC4087y m17044O() {
        return (AbstractC4087y) m17055w(d.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: W */
    public void m17045W(int i7) {
        this.memoizedHashCode = i7;
    }

    /* renamed from: X */
    public void m17046X(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & C3643a.e.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i7);
        }
    }

    /* renamed from: Y */
    public final a m17047Y() {
        return ((a) m17055w(d.NEW_BUILDER)).m17065t(this);
    }

    @Override // com.google.protobuf.InterfaceC4034V
    /* renamed from: b */
    public int mo16315b() {
        return mo16413l(null);
    }

    @Override // com.google.protobuf.InterfaceC4035W
    /* renamed from: d */
    public final boolean mo16323d() {
        return m17024H(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4056i0.m16519a().m16522d(this).mo16371d(this, (AbstractC4087y) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4034V
    /* renamed from: f */
    public void mo16318f(AbstractC4061l abstractC4061l) {
        C4056i0.m16519a().m16522d(this).mo16377g(this, C4063m.m16796P(abstractC4061l));
    }

    public int hashCode() {
        if (m17040I()) {
            return m17051s();
        }
        if (m17039F()) {
            m17045W(m17051s());
        }
        return m17037D();
    }

    @Override // com.google.protobuf.InterfaceC4034V
    /* renamed from: j */
    public final InterfaceC4050f0 mo16320j() {
        return (InterfaceC4050f0) m17055w(d.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC4039a
    /* renamed from: l */
    public int mo16413l(InterfaceC4066n0 interfaceC4066n0) {
        if (!m17040I()) {
            if (m17038E() != Integer.MAX_VALUE) {
                return m17038E();
            }
            int m17052t = m17052t(interfaceC4066n0);
            m17046X(m17052t);
            return m17052t;
        }
        int m17052t2 = m17052t(interfaceC4066n0);
        if (m17052t2 >= 0) {
            return m17052t2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m17052t2);
    }

    /* renamed from: o */
    public Object m17048o() {
        return m17055w(d.BUILD_MESSAGE_INFO);
    }

    /* renamed from: q */
    public void m17049q() {
        this.memoizedHashCode = 0;
    }

    /* renamed from: r */
    public void m17050r() {
        m17046X(C3643a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: s */
    public int m17051s() {
        return C4056i0.m16519a().m16522d(this).mo16375f(this);
    }

    /* renamed from: t */
    public final int m17052t(InterfaceC4066n0 interfaceC4066n0) {
        return interfaceC4066n0 == null ? C4056i0.m16519a().m16522d(this).mo16373e(this) : interfaceC4066n0.mo16373e(this);
    }

    public String toString() {
        return AbstractC4036X.m16329f(this, super.toString());
    }

    /* renamed from: u */
    public final a m17053u() {
        return (a) m17055w(d.NEW_BUILDER);
    }

    /* renamed from: v */
    public final a m17054v(AbstractC4087y abstractC4087y) {
        return m17053u().m17065t(abstractC4087y);
    }

    /* renamed from: w */
    public Object m17055w(d dVar) {
        return mo4943y(dVar, null, null);
    }

    /* renamed from: x */
    public Object m17056x(d dVar, Object obj) {
        return mo4943y(dVar, obj, null);
    }

    /* renamed from: y */
    public abstract Object mo4943y(d dVar, Object obj, Object obj2);
}

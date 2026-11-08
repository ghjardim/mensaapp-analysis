package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC4090z0 {

    /* renamed from: a */
    public static final Unsafe f13614a = m17088H();

    /* renamed from: b */
    public static final Class f13615b = AbstractC4045d.m16429b();

    /* renamed from: c */
    public static final boolean f13616c = m17121q(Long.TYPE);

    /* renamed from: d */
    public static final boolean f13617d = m17121q(Integer.TYPE);

    /* renamed from: e */
    public static final e f13618e = m17086F();

    /* renamed from: f */
    public static final boolean f13619f = m17104X();

    /* renamed from: g */
    public static final boolean f13620g = m17103W();

    /* renamed from: h */
    public static final long f13621h;

    /* renamed from: i */
    public static final long f13622i;

    /* renamed from: j */
    public static final long f13623j;

    /* renamed from: k */
    public static final long f13624k;

    /* renamed from: l */
    public static final long f13625l;

    /* renamed from: m */
    public static final long f13626m;

    /* renamed from: n */
    public static final long f13627n;

    /* renamed from: o */
    public static final long f13628o;

    /* renamed from: p */
    public static final long f13629p;

    /* renamed from: q */
    public static final long f13630q;

    /* renamed from: r */
    public static final long f13631r;

    /* renamed from: s */
    public static final long f13632s;

    /* renamed from: t */
    public static final long f13633t;

    /* renamed from: u */
    public static final long f13634u;

    /* renamed from: v */
    public static final int f13635v;

    /* renamed from: w */
    public static final boolean f13636w;

    /* renamed from: com.google.protobuf.z0$a */
    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.protobuf.z0$b */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: c */
        public void mo17132c(long j7, byte[] bArr, long j8, long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: d */
        public boolean mo17133d(Object obj, long j7) {
            return AbstractC4090z0.f13636w ? AbstractC4090z0.m17125u(obj, j7) : AbstractC4090z0.m17126v(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: e */
        public byte mo17134e(long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: f */
        public byte mo17135f(Object obj, long j7) {
            return AbstractC4090z0.f13636w ? AbstractC4090z0.m17129y(obj, j7) : AbstractC4090z0.m17130z(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: g */
        public double mo17136g(Object obj, long j7) {
            return Double.longBitsToDouble(m17148k(obj, j7));
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: h */
        public float mo17137h(Object obj, long j7) {
            return Float.intBitsToFloat(m17147i(obj, j7));
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: j */
        public long mo17138j(long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: n */
        public void mo17139n(Object obj, long j7, boolean z6) {
            if (AbstractC4090z0.f13636w) {
                AbstractC4090z0.m17093M(obj, j7, z6);
            } else {
                AbstractC4090z0.m17094N(obj, j7, z6);
            }
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: o */
        public void mo17140o(Object obj, long j7, byte b7) {
            if (AbstractC4090z0.f13636w) {
                AbstractC4090z0.m17096P(obj, j7, b7);
            } else {
                AbstractC4090z0.m17097Q(obj, j7, b7);
            }
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: p */
        public void mo17141p(Object obj, long j7, double d7) {
            m17152s(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: q */
        public void mo17142q(Object obj, long j7, float f7) {
            m17151r(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: v */
        public boolean mo17143v() {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.z0$c */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: c */
        public void mo17132c(long j7, byte[] bArr, long j8, long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: d */
        public boolean mo17133d(Object obj, long j7) {
            return AbstractC4090z0.f13636w ? AbstractC4090z0.m17125u(obj, j7) : AbstractC4090z0.m17126v(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: e */
        public byte mo17134e(long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: f */
        public byte mo17135f(Object obj, long j7) {
            return AbstractC4090z0.f13636w ? AbstractC4090z0.m17129y(obj, j7) : AbstractC4090z0.m17130z(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: g */
        public double mo17136g(Object obj, long j7) {
            return Double.longBitsToDouble(m17148k(obj, j7));
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: h */
        public float mo17137h(Object obj, long j7) {
            return Float.intBitsToFloat(m17147i(obj, j7));
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: j */
        public long mo17138j(long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: n */
        public void mo17139n(Object obj, long j7, boolean z6) {
            if (AbstractC4090z0.f13636w) {
                AbstractC4090z0.m17093M(obj, j7, z6);
            } else {
                AbstractC4090z0.m17094N(obj, j7, z6);
            }
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: o */
        public void mo17140o(Object obj, long j7, byte b7) {
            if (AbstractC4090z0.f13636w) {
                AbstractC4090z0.m17096P(obj, j7, b7);
            } else {
                AbstractC4090z0.m17097Q(obj, j7, b7);
            }
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: p */
        public void mo17141p(Object obj, long j7, double d7) {
            m17152s(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: q */
        public void mo17142q(Object obj, long j7, float f7) {
            m17151r(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: v */
        public boolean mo17143v() {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.z0$d */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: c */
        public void mo17132c(long j7, byte[] bArr, long j8, long j9) {
            this.f13637a.copyMemory((Object) null, j7, bArr, AbstractC4090z0.f13621h + j8, j9);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: d */
        public boolean mo17133d(Object obj, long j7) {
            return this.f13637a.getBoolean(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: e */
        public byte mo17134e(long j7) {
            return this.f13637a.getByte(j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: f */
        public byte mo17135f(Object obj, long j7) {
            return this.f13637a.getByte(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: g */
        public double mo17136g(Object obj, long j7) {
            return this.f13637a.getDouble(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: h */
        public float mo17137h(Object obj, long j7) {
            return this.f13637a.getFloat(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: j */
        public long mo17138j(long j7) {
            return this.f13637a.getLong(j7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: n */
        public void mo17139n(Object obj, long j7, boolean z6) {
            this.f13637a.putBoolean(obj, j7, z6);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: o */
        public void mo17140o(Object obj, long j7, byte b7) {
            this.f13637a.putByte(obj, j7, b7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: p */
        public void mo17141p(Object obj, long j7, double d7) {
            this.f13637a.putDouble(obj, j7, d7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: q */
        public void mo17142q(Object obj, long j7, float f7) {
            this.f13637a.putFloat(obj, j7, f7);
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: u */
        public boolean mo17144u() {
            if (!super.mo17144u()) {
                return false;
            }
            try {
                Class<?> cls = this.f13637a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                AbstractC4090z0.m17091K(th);
                return false;
            }
        }

        @Override // com.google.protobuf.AbstractC4090z0.e
        /* renamed from: v */
        public boolean mo17143v() {
            if (!super.mo17143v()) {
                return false;
            }
            try {
                Class<?> cls = this.f13637a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                AbstractC4090z0.m17091K(th);
                return false;
            }
        }
    }

    /* renamed from: com.google.protobuf.z0$e */
    public static abstract class e {

        /* renamed from: a */
        public Unsafe f13637a;

        public e(Unsafe unsafe) {
            this.f13637a = unsafe;
        }

        /* renamed from: a */
        public final int m17145a(Class cls) {
            return this.f13637a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m17146b(Class cls) {
            return this.f13637a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo17132c(long j7, byte[] bArr, long j8, long j9);

        /* renamed from: d */
        public abstract boolean mo17133d(Object obj, long j7);

        /* renamed from: e */
        public abstract byte mo17134e(long j7);

        /* renamed from: f */
        public abstract byte mo17135f(Object obj, long j7);

        /* renamed from: g */
        public abstract double mo17136g(Object obj, long j7);

        /* renamed from: h */
        public abstract float mo17137h(Object obj, long j7);

        /* renamed from: i */
        public final int m17147i(Object obj, long j7) {
            return this.f13637a.getInt(obj, j7);
        }

        /* renamed from: j */
        public abstract long mo17138j(long j7);

        /* renamed from: k */
        public final long m17148k(Object obj, long j7) {
            return this.f13637a.getLong(obj, j7);
        }

        /* renamed from: l */
        public final Object m17149l(Object obj, long j7) {
            return this.f13637a.getObject(obj, j7);
        }

        /* renamed from: m */
        public final long m17150m(Field field) {
            return this.f13637a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo17139n(Object obj, long j7, boolean z6);

        /* renamed from: o */
        public abstract void mo17140o(Object obj, long j7, byte b7);

        /* renamed from: p */
        public abstract void mo17141p(Object obj, long j7, double d7);

        /* renamed from: q */
        public abstract void mo17142q(Object obj, long j7, float f7);

        /* renamed from: r */
        public final void m17151r(Object obj, long j7, int i7) {
            this.f13637a.putInt(obj, j7, i7);
        }

        /* renamed from: s */
        public final void m17152s(Object obj, long j7, long j8) {
            this.f13637a.putLong(obj, j7, j8);
        }

        /* renamed from: t */
        public final void m17153t(Object obj, long j7, Object obj2) {
            this.f13637a.putObject(obj, j7, obj2);
        }

        /* renamed from: u */
        public boolean mo17144u() {
            Unsafe unsafe = this.f13637a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                AbstractC4090z0.m17091K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo17143v() {
            Unsafe unsafe = this.f13637a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return AbstractC4090z0.m17119o() != null;
            } catch (Throwable th) {
                AbstractC4090z0.m17091K(th);
                return false;
            }
        }
    }

    static {
        long m17117m = m17117m(byte[].class);
        f13621h = m17117m;
        f13622i = m17117m(boolean[].class);
        f13623j = m17118n(boolean[].class);
        f13624k = m17117m(int[].class);
        f13625l = m17118n(int[].class);
        f13626m = m17117m(long[].class);
        f13627n = m17118n(long[].class);
        f13628o = m17117m(float[].class);
        f13629p = m17118n(float[].class);
        f13630q = m17117m(double[].class);
        f13631r = m17118n(double[].class);
        f13632s = m17117m(Object[].class);
        f13633t = m17118n(Object[].class);
        f13634u = m17123s(m17119o());
        f13635v = (int) (m17117m & 7);
        f13636w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: A */
    public static double m17081A(Object obj, long j7) {
        return f13618e.mo17136g(obj, j7);
    }

    /* renamed from: B */
    public static float m17082B(Object obj, long j7) {
        return f13618e.mo17137h(obj, j7);
    }

    /* renamed from: C */
    public static int m17083C(Object obj, long j7) {
        return f13618e.m17147i(obj, j7);
    }

    /* renamed from: D */
    public static long m17084D(long j7) {
        return f13618e.mo17138j(j7);
    }

    /* renamed from: E */
    public static long m17085E(Object obj, long j7) {
        return f13618e.m17148k(obj, j7);
    }

    /* renamed from: F */
    public static e m17086F() {
        Unsafe unsafe = f13614a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC4045d.m16430c()) {
            return new d(unsafe);
        }
        if (f13616c) {
            return new c(unsafe);
        }
        if (f13617d) {
            return new b(unsafe);
        }
        return null;
    }

    /* renamed from: G */
    public static Object m17087G(Object obj, long j7) {
        return f13618e.m17149l(obj, j7);
    }

    /* renamed from: H */
    public static Unsafe m17088H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static boolean m17089I() {
        return f13620g;
    }

    /* renamed from: J */
    public static boolean m17090J() {
        return f13619f;
    }

    /* renamed from: K */
    public static void m17091K(Throwable th) {
        Logger.getLogger(AbstractC4090z0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: L */
    public static void m17092L(Object obj, long j7, boolean z6) {
        f13618e.mo17139n(obj, j7, z6);
    }

    /* renamed from: M */
    public static void m17093M(Object obj, long j7, boolean z6) {
        m17096P(obj, j7, z6 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: N */
    public static void m17094N(Object obj, long j7, boolean z6) {
        m17097Q(obj, j7, z6 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: O */
    public static void m17095O(byte[] bArr, long j7, byte b7) {
        f13618e.mo17140o(bArr, f13621h + j7, b7);
    }

    /* renamed from: P */
    public static void m17096P(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int m17083C = m17083C(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        m17100T(obj, j8, ((255 & b7) << i7) | (m17083C & (~(255 << i7))));
    }

    /* renamed from: Q */
    public static void m17097Q(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        m17100T(obj, j8, ((255 & b7) << i7) | (m17083C(obj, j8) & (~(255 << i7))));
    }

    /* renamed from: R */
    public static void m17098R(Object obj, long j7, double d7) {
        f13618e.mo17141p(obj, j7, d7);
    }

    /* renamed from: S */
    public static void m17099S(Object obj, long j7, float f7) {
        f13618e.mo17142q(obj, j7, f7);
    }

    /* renamed from: T */
    public static void m17100T(Object obj, long j7, int i7) {
        f13618e.m17151r(obj, j7, i7);
    }

    /* renamed from: U */
    public static void m17101U(Object obj, long j7, long j8) {
        f13618e.m17152s(obj, j7, j8);
    }

    /* renamed from: V */
    public static void m17102V(Object obj, long j7, Object obj2) {
        f13618e.m17153t(obj, j7, obj2);
    }

    /* renamed from: W */
    public static boolean m17103W() {
        e eVar = f13618e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo17144u();
    }

    /* renamed from: X */
    public static boolean m17104X() {
        e eVar = f13618e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo17143v();
    }

    /* renamed from: k */
    public static long m17115k(ByteBuffer byteBuffer) {
        return f13618e.m17148k(byteBuffer, f13634u);
    }

    /* renamed from: l */
    public static Object m17116l(Class cls) {
        try {
            return f13614a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* renamed from: m */
    public static int m17117m(Class cls) {
        if (f13620g) {
            return f13618e.m17145a(cls);
        }
        return -1;
    }

    /* renamed from: n */
    public static int m17118n(Class cls) {
        if (f13620g) {
            return f13618e.m17146b(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static Field m17119o() {
        Field m17122r;
        if (AbstractC4045d.m16430c() && (m17122r = m17122r(Buffer.class, "effectiveDirectAddress")) != null) {
            return m17122r;
        }
        Field m17122r2 = m17122r(Buffer.class, "address");
        if (m17122r2 == null || m17122r2.getType() != Long.TYPE) {
            return null;
        }
        return m17122r2;
    }

    /* renamed from: p */
    public static void m17120p(long j7, byte[] bArr, long j8, long j9) {
        f13618e.mo17132c(j7, bArr, j8, j9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static boolean m17121q(Class cls) {
        if (!AbstractC4045d.m16430c()) {
            return false;
        }
        try {
            Class cls2 = f13615b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: r */
    public static Field m17122r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static long m17123s(Field field) {
        e eVar;
        if (field == null || (eVar = f13618e) == null) {
            return -1L;
        }
        return eVar.m17150m(field);
    }

    /* renamed from: t */
    public static boolean m17124t(Object obj, long j7) {
        return f13618e.mo17133d(obj, j7);
    }

    /* renamed from: u */
    public static boolean m17125u(Object obj, long j7) {
        return m17129y(obj, j7) != 0;
    }

    /* renamed from: v */
    public static boolean m17126v(Object obj, long j7) {
        return m17130z(obj, j7) != 0;
    }

    /* renamed from: w */
    public static byte m17127w(long j7) {
        return f13618e.mo17134e(j7);
    }

    /* renamed from: x */
    public static byte m17128x(byte[] bArr, long j7) {
        return f13618e.mo17135f(bArr, f13621h + j7);
    }

    /* renamed from: y */
    public static byte m17129y(Object obj, long j7) {
        return (byte) ((m17083C(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* renamed from: z */
    public static byte m17130z(Object obj, long j7) {
        return (byte) ((m17083C(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }
}

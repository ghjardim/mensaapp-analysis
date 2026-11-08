package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC3297i0 {

    /* renamed from: a */
    public static final Unsafe f10503a = m12597A();

    /* renamed from: b */
    public static final Class f10504b = AbstractC3286d.m12326b();

    /* renamed from: c */
    public static final boolean f10505c = m12626m(Long.TYPE);

    /* renamed from: d */
    public static final boolean f10506d = m12626m(Integer.TYPE);

    /* renamed from: e */
    public static final e f10507e = m12638y();

    /* renamed from: f */
    public static final boolean f10508f = m12613Q();

    /* renamed from: g */
    public static final boolean f10509g = m12612P();

    /* renamed from: h */
    public static final long f10510h;

    /* renamed from: i */
    public static final long f10511i;

    /* renamed from: j */
    public static final long f10512j;

    /* renamed from: k */
    public static final long f10513k;

    /* renamed from: l */
    public static final long f10514l;

    /* renamed from: m */
    public static final long f10515m;

    /* renamed from: n */
    public static final long f10516n;

    /* renamed from: o */
    public static final long f10517o;

    /* renamed from: p */
    public static final long f10518p;

    /* renamed from: q */
    public static final long f10519q;

    /* renamed from: r */
    public static final long f10520r;

    /* renamed from: s */
    public static final long f10521s;

    /* renamed from: t */
    public static final long f10522t;

    /* renamed from: u */
    public static final long f10523u;

    /* renamed from: v */
    public static final int f10524v;

    /* renamed from: w */
    public static final boolean f10525w;

    /* renamed from: androidx.datastore.preferences.protobuf.i0$a */
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

    /* renamed from: androidx.datastore.preferences.protobuf.i0$b */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: c */
        public boolean mo12641c(Object obj, long j7) {
            return AbstractC3297i0.f10525w ? AbstractC3297i0.m12630q(obj, j7) : AbstractC3297i0.m12631r(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: d */
        public double mo12642d(Object obj, long j7) {
            return Double.longBitsToDouble(m12653g(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: e */
        public float mo12643e(Object obj, long j7) {
            return Float.intBitsToFloat(m12652f(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: j */
        public void mo12644j(Object obj, long j7, boolean z6) {
            if (AbstractC3297i0.f10525w) {
                AbstractC3297i0.m12602F(obj, j7, z6);
            } else {
                AbstractC3297i0.m12603G(obj, j7, z6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: k */
        public void mo12645k(Object obj, long j7, byte b7) {
            if (AbstractC3297i0.f10525w) {
                AbstractC3297i0.m12605I(obj, j7, b7);
            } else {
                AbstractC3297i0.m12606J(obj, j7, b7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: l */
        public void mo12646l(Object obj, long j7, double d7) {
            m12657o(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: m */
        public void mo12647m(Object obj, long j7, float f7) {
            m12656n(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: r */
        public boolean mo12648r() {
            return false;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i0$c */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: c */
        public boolean mo12641c(Object obj, long j7) {
            return AbstractC3297i0.f10525w ? AbstractC3297i0.m12630q(obj, j7) : AbstractC3297i0.m12631r(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: d */
        public double mo12642d(Object obj, long j7) {
            return Double.longBitsToDouble(m12653g(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: e */
        public float mo12643e(Object obj, long j7) {
            return Float.intBitsToFloat(m12652f(obj, j7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: j */
        public void mo12644j(Object obj, long j7, boolean z6) {
            if (AbstractC3297i0.f10525w) {
                AbstractC3297i0.m12602F(obj, j7, z6);
            } else {
                AbstractC3297i0.m12603G(obj, j7, z6);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: k */
        public void mo12645k(Object obj, long j7, byte b7) {
            if (AbstractC3297i0.f10525w) {
                AbstractC3297i0.m12605I(obj, j7, b7);
            } else {
                AbstractC3297i0.m12606J(obj, j7, b7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: l */
        public void mo12646l(Object obj, long j7, double d7) {
            m12657o(obj, j7, Double.doubleToLongBits(d7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: m */
        public void mo12647m(Object obj, long j7, float f7) {
            m12656n(obj, j7, Float.floatToIntBits(f7));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: r */
        public boolean mo12648r() {
            return false;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i0$d */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: c */
        public boolean mo12641c(Object obj, long j7) {
            return this.f10526a.getBoolean(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: d */
        public double mo12642d(Object obj, long j7) {
            return this.f10526a.getDouble(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: e */
        public float mo12643e(Object obj, long j7) {
            return this.f10526a.getFloat(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: j */
        public void mo12644j(Object obj, long j7, boolean z6) {
            this.f10526a.putBoolean(obj, j7, z6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: k */
        public void mo12645k(Object obj, long j7, byte b7) {
            this.f10526a.putByte(obj, j7, b7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: l */
        public void mo12646l(Object obj, long j7, double d7) {
            this.f10526a.putDouble(obj, j7, d7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: m */
        public void mo12647m(Object obj, long j7, float f7) {
            this.f10526a.putFloat(obj, j7, f7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: q */
        public boolean mo12649q() {
            if (!super.mo12649q()) {
                return false;
            }
            try {
                Class<?> cls = this.f10526a.getClass();
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
                AbstractC3297i0.m12600D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3297i0.e
        /* renamed from: r */
        public boolean mo12648r() {
            if (!super.mo12648r()) {
                return false;
            }
            try {
                Class<?> cls = this.f10526a.getClass();
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
                AbstractC3297i0.m12600D(th);
                return false;
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i0$e */
    public static abstract class e {

        /* renamed from: a */
        public Unsafe f10526a;

        public e(Unsafe unsafe) {
            this.f10526a = unsafe;
        }

        /* renamed from: a */
        public final int m12650a(Class cls) {
            return this.f10526a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m12651b(Class cls) {
            return this.f10526a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo12641c(Object obj, long j7);

        /* renamed from: d */
        public abstract double mo12642d(Object obj, long j7);

        /* renamed from: e */
        public abstract float mo12643e(Object obj, long j7);

        /* renamed from: f */
        public final int m12652f(Object obj, long j7) {
            return this.f10526a.getInt(obj, j7);
        }

        /* renamed from: g */
        public final long m12653g(Object obj, long j7) {
            return this.f10526a.getLong(obj, j7);
        }

        /* renamed from: h */
        public final Object m12654h(Object obj, long j7) {
            return this.f10526a.getObject(obj, j7);
        }

        /* renamed from: i */
        public final long m12655i(Field field) {
            return this.f10526a.objectFieldOffset(field);
        }

        /* renamed from: j */
        public abstract void mo12644j(Object obj, long j7, boolean z6);

        /* renamed from: k */
        public abstract void mo12645k(Object obj, long j7, byte b7);

        /* renamed from: l */
        public abstract void mo12646l(Object obj, long j7, double d7);

        /* renamed from: m */
        public abstract void mo12647m(Object obj, long j7, float f7);

        /* renamed from: n */
        public final void m12656n(Object obj, long j7, int i7) {
            this.f10526a.putInt(obj, j7, i7);
        }

        /* renamed from: o */
        public final void m12657o(Object obj, long j7, long j8) {
            this.f10526a.putLong(obj, j7, j8);
        }

        /* renamed from: p */
        public final void m12658p(Object obj, long j7, Object obj2) {
            this.f10526a.putObject(obj, j7, obj2);
        }

        /* renamed from: q */
        public boolean mo12649q() {
            Unsafe unsafe = this.f10526a;
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
                AbstractC3297i0.m12600D(th);
                return false;
            }
        }

        /* renamed from: r */
        public boolean mo12648r() {
            Unsafe unsafe = this.f10526a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return AbstractC3297i0.m12625l() != null;
            } catch (Throwable th) {
                AbstractC3297i0.m12600D(th);
                return false;
            }
        }
    }

    static {
        long m12623j = m12623j(byte[].class);
        f10510h = m12623j;
        f10511i = m12623j(boolean[].class);
        f10512j = m12624k(boolean[].class);
        f10513k = m12623j(int[].class);
        f10514l = m12624k(int[].class);
        f10515m = m12623j(long[].class);
        f10516n = m12624k(long[].class);
        f10517o = m12623j(float[].class);
        f10518p = m12624k(float[].class);
        f10519q = m12623j(double[].class);
        f10520r = m12624k(double[].class);
        f10521s = m12623j(Object[].class);
        f10522t = m12624k(Object[].class);
        f10523u = m12628o(m12625l());
        f10524v = (int) (m12623j & 7);
        f10525w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: A */
    public static Unsafe m12597A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static boolean m12598B() {
        return f10509g;
    }

    /* renamed from: C */
    public static boolean m12599C() {
        return f10508f;
    }

    /* renamed from: D */
    public static void m12600D(Throwable th) {
        Logger.getLogger(AbstractC3297i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: E */
    public static void m12601E(Object obj, long j7, boolean z6) {
        f10507e.mo12644j(obj, j7, z6);
    }

    /* renamed from: F */
    public static void m12602F(Object obj, long j7, boolean z6) {
        m12605I(obj, j7, z6 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: G */
    public static void m12603G(Object obj, long j7, boolean z6) {
        m12606J(obj, j7, z6 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: H */
    public static void m12604H(byte[] bArr, long j7, byte b7) {
        f10507e.mo12645k(bArr, f10510h + j7, b7);
    }

    /* renamed from: I */
    public static void m12605I(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int m12636w = m12636w(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        m12609M(obj, j8, ((255 & b7) << i7) | (m12636w & (~(255 << i7))));
    }

    /* renamed from: J */
    public static void m12606J(Object obj, long j7, byte b7) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        m12609M(obj, j8, ((255 & b7) << i7) | (m12636w(obj, j8) & (~(255 << i7))));
    }

    /* renamed from: K */
    public static void m12607K(Object obj, long j7, double d7) {
        f10507e.mo12646l(obj, j7, d7);
    }

    /* renamed from: L */
    public static void m12608L(Object obj, long j7, float f7) {
        f10507e.mo12647m(obj, j7, f7);
    }

    /* renamed from: M */
    public static void m12609M(Object obj, long j7, int i7) {
        f10507e.m12656n(obj, j7, i7);
    }

    /* renamed from: N */
    public static void m12610N(Object obj, long j7, long j8) {
        f10507e.m12657o(obj, j7, j8);
    }

    /* renamed from: O */
    public static void m12611O(Object obj, long j7, Object obj2) {
        f10507e.m12658p(obj, j7, obj2);
    }

    /* renamed from: P */
    public static boolean m12612P() {
        e eVar = f10507e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo12649q();
    }

    /* renamed from: Q */
    public static boolean m12613Q() {
        e eVar = f10507e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo12648r();
    }

    /* renamed from: i */
    public static Object m12622i(Class cls) {
        try {
            return f10503a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    /* renamed from: j */
    public static int m12623j(Class cls) {
        if (f10509g) {
            return f10507e.m12650a(cls);
        }
        return -1;
    }

    /* renamed from: k */
    public static int m12624k(Class cls) {
        if (f10509g) {
            return f10507e.m12651b(cls);
        }
        return -1;
    }

    /* renamed from: l */
    public static Field m12625l() {
        Field m12627n;
        if (AbstractC3286d.m12327c() && (m12627n = m12627n(Buffer.class, "effectiveDirectAddress")) != null) {
            return m12627n;
        }
        Field m12627n2 = m12627n(Buffer.class, "address");
        if (m12627n2 == null || m12627n2.getType() != Long.TYPE) {
            return null;
        }
        return m12627n2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static boolean m12626m(Class cls) {
        if (!AbstractC3286d.m12327c()) {
            return false;
        }
        try {
            Class cls2 = f10504b;
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

    /* renamed from: n */
    public static Field m12627n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static long m12628o(Field field) {
        e eVar;
        if (field == null || (eVar = f10507e) == null) {
            return -1L;
        }
        return eVar.m12655i(field);
    }

    /* renamed from: p */
    public static boolean m12629p(Object obj, long j7) {
        return f10507e.mo12641c(obj, j7);
    }

    /* renamed from: q */
    public static boolean m12630q(Object obj, long j7) {
        return m12632s(obj, j7) != 0;
    }

    /* renamed from: r */
    public static boolean m12631r(Object obj, long j7) {
        return m12633t(obj, j7) != 0;
    }

    /* renamed from: s */
    public static byte m12632s(Object obj, long j7) {
        return (byte) ((m12636w(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    /* renamed from: t */
    public static byte m12633t(Object obj, long j7) {
        return (byte) ((m12636w(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    /* renamed from: u */
    public static double m12634u(Object obj, long j7) {
        return f10507e.mo12642d(obj, j7);
    }

    /* renamed from: v */
    public static float m12635v(Object obj, long j7) {
        return f10507e.mo12643e(obj, j7);
    }

    /* renamed from: w */
    public static int m12636w(Object obj, long j7) {
        return f10507e.m12652f(obj, j7);
    }

    /* renamed from: x */
    public static long m12637x(Object obj, long j7) {
        return f10507e.m12653g(obj, j7);
    }

    /* renamed from: y */
    public static e m12638y() {
        Unsafe unsafe = f10503a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC3286d.m12327c()) {
            return new d(unsafe);
        }
        if (f10505c) {
            return new c(unsafe);
        }
        if (f10506d) {
            return new b(unsafe);
        }
        return null;
    }

    /* renamed from: z */
    public static Object m12639z(Object obj, long j7) {
        return f10507e.m12654h(obj, j7);
    }
}

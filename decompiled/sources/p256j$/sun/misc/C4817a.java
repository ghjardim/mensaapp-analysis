package p256j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import sun.misc.Unsafe;

/* renamed from: j$.sun.misc.a */
/* loaded from: classes3.dex */
public final class C4817a {

    /* renamed from: b */
    private static final C4817a f17876b;

    /* renamed from: a */
    private final Unsafe f17877a;

    static {
        Field m20877i = m20877i();
        m20877i.setAccessible(true);
        try {
            f17876b = new C4817a((Unsafe) m20877i.get(null));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("Couldn't get the Unsafe", e7);
        }
    }

    C4817a(Unsafe unsafe) {
        this.f17877a = unsafe;
    }

    /* renamed from: i */
    private static Field m20877i() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e7) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e7);
        }
    }

    /* renamed from: h */
    public static C4817a m20876h() {
        return f17876b;
    }

    /* renamed from: f */
    public final int m20883f(Object obj, long j7) {
        int intVolatile;
        do {
            intVolatile = this.f17877a.getIntVolatile(obj, j7);
        } while (!this.f17877a.compareAndSwapInt(obj, j7, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    /* renamed from: k */
    public final long m20886k(Field field) {
        return this.f17877a.objectFieldOffset(field);
    }

    /* renamed from: j */
    public final long m20885j(Class cls, String str) {
        try {
            return m20886k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e7) {
            throw new AssertionError("Cannot find field:", e7);
        }
    }

    /* renamed from: a */
    public final int m20878a(Class cls) {
        return this.f17877a.arrayBaseOffset(cls);
    }

    /* renamed from: b */
    public final int m20879b(Class cls) {
        return this.f17877a.arrayIndexScale(cls);
    }

    /* renamed from: g */
    public final Object m20884g(Object obj, long j7) {
        return this.f17877a.getObjectVolatile(obj, j7);
    }

    /* renamed from: l */
    public final void m20887l(Object obj, long j7, Object obj2) {
        this.f17877a.putObjectVolatile(obj, j7, obj2);
    }

    /* renamed from: c */
    public final boolean m20880c(Object obj, long j7, int i7, int i8) {
        return this.f17877a.compareAndSwapInt(obj, j7, i7, i8);
    }

    /* renamed from: d */
    public final boolean m20881d(Object obj, long j7, long j8, long j9) {
        return this.f17877a.compareAndSwapLong(obj, j7, j8, j9);
    }

    /* renamed from: e */
    public final boolean m20882e(Object obj, long j7, Object obj2) {
        return AbstractC4815a.m20871i(this.f17877a, obj, j7, obj2);
    }
}

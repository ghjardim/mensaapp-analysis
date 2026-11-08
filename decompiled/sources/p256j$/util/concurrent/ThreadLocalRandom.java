package p256j$.util.concurrent;

import com.google.android.gms.common.api.C3643a;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p256j$.util.stream.AbstractC5034A0;
import p256j$.util.stream.C5048D;
import p256j$.util.stream.C5181d0;
import p256j$.util.stream.C5247o0;

/* loaded from: classes3.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a */
    long f18198a;

    /* renamed from: b */
    int f18199b;

    /* renamed from: c */
    boolean f18200c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d */
    private static final ThreadLocal f18194d = new ThreadLocal();

    /* renamed from: e */
    private static final AtomicInteger f18195e = new AtomicInteger();

    /* renamed from: f */
    private static final ThreadLocal f18196f = new C4990w();

    /* renamed from: g */
    private static final AtomicLong f18197g = new AtomicLong(m21323h(System.currentTimeMillis()) ^ m21323h(System.nanoTime()));

    /* synthetic */ ThreadLocalRandom(int i7) {
        this();
    }

    /* renamed from: g */
    private static int m21322g(long j7) {
        long j8 = (j7 ^ (j7 >>> 33)) * (-49064778989728563L);
        return (int) (((j8 ^ (j8 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    /* renamed from: h */
    private static long m21323h(long j7) {
        long j8 = (j7 ^ (j7 >>> 33)) * (-49064778989728563L);
        long j9 = (j8 ^ (j8 >>> 33)) * (-4265267296055464877L);
        return j9 ^ (j9 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f18200c = true;
    }

    /* renamed from: f */
    static final void m21321f() {
        int addAndGet = f18195e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long m21323h = m21323h(f18197g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f18196f.get();
        threadLocalRandom.f18198a = m21323h;
        threadLocalRandom.f18199b = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f18196f.get();
        if (threadLocalRandom.f18199b == 0) {
            m21321f();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j7) {
        if (this.f18200c) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    final long m21327i() {
        long j7 = this.f18198a - 7046029254386353131L;
        this.f18198a = j7;
        return j7;
    }

    @Override // java.util.Random
    protected final int next(int i7) {
        return nextInt() >>> (32 - i7);
    }

    /* renamed from: e */
    final long m21326e(long j7, long j8) {
        long m21323h = m21323h(m21327i());
        if (j7 >= j8) {
            return m21323h;
        }
        long j9 = j8 - j7;
        long j10 = j9 - 1;
        if ((j9 & j10) == 0) {
            return (m21323h & j10) + j7;
        }
        if (j9 > 0) {
            while (true) {
                long j11 = m21323h >>> 1;
                long j12 = j11 + j10;
                long j13 = j11 % j9;
                if (j12 - j13 >= 0) {
                    return j13 + j7;
                }
                m21323h = m21323h(m21327i());
            }
        } else {
            while (true) {
                if (m21323h >= j7 && m21323h < j8) {
                    return m21323h;
                }
                m21323h = m21323h(m21327i());
            }
        }
    }

    /* renamed from: d */
    final int m21325d(int i7, int i8) {
        int i9;
        int m21322g = m21322g(m21327i());
        if (i7 >= i8) {
            return m21322g;
        }
        int i10 = i8 - i7;
        int i11 = i10 - 1;
        if ((i10 & i11) == 0) {
            i9 = m21322g & i11;
        } else if (i10 > 0) {
            int i12 = m21322g >>> 1;
            while (true) {
                int i13 = i12 + i11;
                i9 = i12 % i10;
                if (i13 - i9 >= 0) {
                    break;
                }
                i12 = m21322g(m21327i()) >>> 1;
            }
        } else {
            while (true) {
                if (m21322g >= i7 && m21322g < i8) {
                    return m21322g;
                }
                m21322g = m21322g(m21327i());
            }
        }
        return i9 + i7;
    }

    /* renamed from: c */
    final double m21324c(double d7, double d8) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d7 >= d8) {
            return nextLong;
        }
        double d9 = ((d8 - d7) * nextLong) + d7;
        return d9 >= d8 ? Double.longBitsToDouble(Double.doubleToLongBits(d8) - 1) : d9;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return m21322g(m21327i());
    }

    @Override // java.util.Random
    public final int nextInt(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int m21322g = m21322g(m21327i());
        int i8 = i7 - 1;
        if ((i7 & i8) == 0) {
            return m21322g & i8;
        }
        while (true) {
            int i9 = m21322g >>> 1;
            int i10 = i9 + i8;
            int i11 = i9 % i7;
            if (i10 - i11 >= 0) {
                return i11;
            }
            m21322g = m21322g(m21327i());
        }
    }

    public final int nextInt(int i7, int i8) {
        if (i7 >= i8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m21325d(i7, i8);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return m21323h(m21327i());
    }

    public final long nextLong(long j7) {
        if (j7 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long m21323h = m21323h(m21327i());
        long j8 = j7 - 1;
        if ((j7 & j8) == 0) {
            return m21323h & j8;
        }
        while (true) {
            long j9 = m21323h >>> 1;
            long j10 = j9 + j8;
            long j11 = j9 % j7;
            if (j10 - j11 >= 0) {
                return j11;
            }
            m21323h = m21323h(m21327i());
        }
    }

    public final long nextLong(long j7, long j8) {
        if (j7 >= j8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m21326e(j7, j8);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (m21323h(m21327i()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d7) {
        if (d7 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double m21323h = (m21323h(m21327i()) >>> 11) * 1.1102230246251565E-16d * d7;
        return m21323h < d7 ? m21323h : Double.longBitsToDouble(Double.doubleToLongBits(d7) - 1);
    }

    public final double nextDouble(double d7, double d8) {
        if (d7 >= d8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return m21324c(d7, d8);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return m21322g(m21327i()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (m21322g(m21327i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f18194d;
        Double d7 = (Double) threadLocal.get();
        if (d7 != null) {
            threadLocal.set(null);
            return d7.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d8 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d8 < 1.0d && d8 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d8) * (-2.0d)) / d8);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j7) {
        if (j7 >= 0) {
            return C5181d0.m21544k(AbstractC5034A0.m21387T(new C4993z(0L, j7, C3643a.e.API_PRIORITY_OTHER, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return C5181d0.m21544k(AbstractC5034A0.m21387T(new C4993z(0L, Long.MAX_VALUE, C3643a.e.API_PRIORITY_OTHER, 0)));
    }

    @Override // java.util.Random
    public final IntStream ints(long j7, int i7, int i8) {
        if (j7 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i7 < i8) {
            return C5181d0.m21544k(AbstractC5034A0.m21387T(new C4993z(0L, j7, i7, i8)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final IntStream ints(int i7, int i8) {
        if (i7 < i8) {
            return C5181d0.m21544k(AbstractC5034A0.m21387T(new C4993z(0L, Long.MAX_VALUE, i7, i8)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j7) {
        if (j7 >= 0) {
            return C5247o0.m21584k(AbstractC5034A0.m21389V(new C4967A(0L, j7, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C5247o0.m21584k(AbstractC5034A0.m21389V(new C4967A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j7, long j8, long j9) {
        if (j7 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j8 < j9) {
            return C5247o0.m21584k(AbstractC5034A0.m21389V(new C4967A(0L, j7, j8, j9)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j7, long j8) {
        if (j7 < j8) {
            return C5247o0.m21584k(AbstractC5034A0.m21389V(new C4967A(0L, Long.MAX_VALUE, j7, j8)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j7) {
        if (j7 >= 0) {
            return C5048D.m21456k(AbstractC5034A0.m21378K(new C4992y(0L, j7, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return C5048D.m21456k(AbstractC5034A0.m21378K(new C4992y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j7, double d7, double d8) {
        if (j7 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d7 < d8) {
            return C5048D.m21456k(AbstractC5034A0.m21378K(new C4992y(0L, j7, d7, d8)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d7, double d8) {
        if (d7 < d8) {
            return C5048D.m21456k(AbstractC5034A0.m21378K(new C4992y(0L, Long.MAX_VALUE, d7, d8)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    /* renamed from: b */
    static final int m21320b() {
        return ((ThreadLocalRandom) f18196f.get()).f18199b;
    }

    /* renamed from: a */
    static final int m21319a(int i7) {
        int i8 = i7 ^ (i7 << 13);
        int i9 = i8 ^ (i8 >>> 17);
        int i10 = i9 ^ (i9 << 5);
        ((ThreadLocalRandom) f18196f.get()).f18199b = i10;
        return i10;
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new C4991x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j7 = seed[0] & 255;
            for (int i7 = 1; i7 < 8; i7++) {
                j7 = (j7 << 8) | (seed[i7] & 255);
            }
            f18197g.set(j7);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.f18198a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}

package p167X5;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5464g;
import p350u.AbstractC6581b;

/* renamed from: X5.t */
/* loaded from: classes2.dex */
public final class C2875t {

    /* renamed from: e */
    public static final a f8856e = new a(null);

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8857f = AtomicReferenceFieldUpdater.newUpdater(C2875t.class, Object.class, "_next$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f8858g = AtomicLongFieldUpdater.newUpdater(C2875t.class, "_state$volatile");

    /* renamed from: h */
    public static final C2846G f8859h = new C2846G("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f8860a;

    /* renamed from: b */
    public final boolean f8861b;

    /* renamed from: c */
    public final int f8862c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f8863d;

    /* renamed from: X5.t$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final int m10385a(long j7) {
            return (j7 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m10386b(long j7, int i7) {
            return m10388d(j7, 1073741823L) | i7;
        }

        /* renamed from: c */
        public final long m10387c(long j7, int i7) {
            return m10388d(j7, 1152921503533105152L) | (i7 << 30);
        }

        /* renamed from: d */
        public final long m10388d(long j7, long j8) {
            return j7 & (~j8);
        }

        public a() {
        }
    }

    /* renamed from: X5.t$b */
    public static final class b {

        /* renamed from: a */
        public final int f8864a;

        public b(int i7) {
            this.f8864a = i7;
        }
    }

    public C2875t(int i7, boolean z6) {
        this.f8860a = i7;
        this.f8861b = z6;
        int i8 = i7 - 1;
        this.f8862c = i8;
        this.f8863d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: a */
    public final int m10373a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8858g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j7) != 0) {
                return f8856e.m10385a(j7);
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            int i9 = this.f8862c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            if (!this.f8861b && m10378f().get(i8 & i9) != null) {
                int i10 = this.f8860a;
                if (i10 < 1024 || ((i8 - i7) & 1073741823) > (i10 >> 1)) {
                    break;
                }
            } else if (f8858g.compareAndSet(this, j7, f8856e.m10387c(j7, (i8 + 1) & 1073741823))) {
                m10378f().set(i8 & i9, obj);
                C2875t c2875t = this;
                while ((f8858g.get(c2875t) & 1152921504606846976L) != 0 && (c2875t = c2875t.m10382l().m10377e(i8, obj)) != null) {
                }
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: b */
    public final C2875t m10374b(long j7) {
        C2875t c2875t = new C2875t(this.f8860a * 2, this.f8861b);
        int i7 = (int) (1073741823 & j7);
        int i8 = (int) ((1152921503533105152L & j7) >> 30);
        while (true) {
            int i9 = this.f8862c;
            if ((i7 & i9) == (i9 & i8)) {
                f8858g.set(c2875t, f8856e.m10388d(j7, 1152921504606846976L));
                return c2875t;
            }
            Object obj = m10378f().get(this.f8862c & i7);
            if (obj == null) {
                obj = new b(i7);
            }
            c2875t.m10378f().set(c2875t.f8862c & i7, obj);
            i7++;
        }
    }

    /* renamed from: c */
    public final C2875t m10375c(long j7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8857f;
        while (true) {
            C2875t c2875t = (C2875t) atomicReferenceFieldUpdater.get(this);
            if (c2875t != null) {
                return c2875t;
            }
            AbstractC6581b.m27343a(f8857f, this, null, m10374b(j7));
        }
    }

    /* renamed from: d */
    public final boolean m10376d() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8858g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j7 | 2305843009213693952L));
        return true;
    }

    /* renamed from: e */
    public final C2875t m10377e(int i7, Object obj) {
        Object obj2 = m10378f().get(this.f8862c & i7);
        if (!(obj2 instanceof b) || ((b) obj2).f8864a != i7) {
            return null;
        }
        m10378f().set(i7 & this.f8862c, obj);
        return this;
    }

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray m10378f() {
        return this.f8863d;
    }

    /* renamed from: g */
    public final int m10379g() {
        long j7 = f8858g.get(this);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    /* renamed from: j */
    public final boolean m10380j() {
        long j7 = f8858g.get(this);
        return ((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30));
    }

    /* renamed from: k */
    public final long m10381k() {
        long j7;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8858g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                return j7;
            }
            j8 = j7 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j8));
        return j8;
    }

    /* renamed from: l */
    public final C2875t m10382l() {
        return m10375c(m10381k());
    }

    /* renamed from: m */
    public final Object m10383m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8858g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j7) != 0) {
                return f8859h;
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = this.f8862c;
            if ((((int) ((1152921503533105152L & j7) >> 30)) & i8) == (i8 & i7)) {
                return null;
            }
            Object obj = m10378f().get(this.f8862c & i7);
            if (obj == null) {
                if (this.f8861b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i9 = (i7 + 1) & 1073741823;
                if (f8858g.compareAndSet(this, j7, f8856e.m10386b(j7, i9))) {
                    m10378f().set(this.f8862c & i7, null);
                    return obj;
                }
                if (this.f8861b) {
                    C2875t c2875t = this;
                    do {
                        c2875t = c2875t.m10384n(i7, i9);
                    } while (c2875t != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: n */
    public final C2875t m10384n(int i7, int i8) {
        long j7;
        int i9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8858g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            i9 = (int) (1073741823 & j7);
            if ((1152921504606846976L & j7) != 0) {
                return m10382l();
            }
        } while (!f8858g.compareAndSet(this, j7, f8856e.m10386b(j7, i8)));
        m10378f().set(this.f8862c & i9, null);
        return null;
    }
}

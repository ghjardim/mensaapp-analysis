package p256j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.E */
/* loaded from: classes3.dex */
public final class C4940E {

    /* renamed from: c */
    private static final C4940E f18140c = new C4940E();

    /* renamed from: a */
    private final boolean f18141a;

    /* renamed from: b */
    private final long f18142b;

    private C4940E() {
        this.f18141a = false;
        this.f18142b = 0L;
    }

    /* renamed from: a */
    public static C4940E m21267a() {
        return f18140c;
    }

    private C4940E(long j7) {
        this.f18141a = true;
        this.f18142b = j7;
    }

    /* renamed from: d */
    public static C4940E m21268d(long j7) {
        return new C4940E(j7);
    }

    /* renamed from: b */
    public final long m21269b() {
        if (!this.f18141a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f18142b;
    }

    /* renamed from: c */
    public final boolean m21270c() {
        return this.f18141a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4940E)) {
            return false;
        }
        C4940E c4940e = (C4940E) obj;
        boolean z6 = this.f18141a;
        if (z6 && c4940e.f18141a) {
            if (this.f18142b == c4940e.f18142b) {
                return true;
            }
        } else if (z6 == c4940e.f18141a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f18141a) {
            return 0;
        }
        long j7 = this.f18142b;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        if (this.f18141a) {
            return "OptionalLong[" + this.f18142b + "]";
        }
        return "OptionalLong.empty";
    }
}

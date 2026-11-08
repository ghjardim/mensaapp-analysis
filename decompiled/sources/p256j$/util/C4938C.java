package p256j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.C */
/* loaded from: classes3.dex */
public final class C4938C {

    /* renamed from: c */
    private static final C4938C f18134c = new C4938C();

    /* renamed from: a */
    private final boolean f18135a;

    /* renamed from: b */
    private final double f18136b;

    private C4938C() {
        this.f18135a = false;
        this.f18136b = Double.NaN;
    }

    /* renamed from: a */
    public static C4938C m21255a() {
        return f18134c;
    }

    private C4938C(double d7) {
        this.f18135a = true;
        this.f18136b = d7;
    }

    /* renamed from: d */
    public static C4938C m21256d(double d7) {
        return new C4938C(d7);
    }

    /* renamed from: b */
    public final double m21257b() {
        if (!this.f18135a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f18136b;
    }

    /* renamed from: c */
    public final boolean m21258c() {
        return this.f18135a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4938C)) {
            return false;
        }
        C4938C c4938c = (C4938C) obj;
        boolean z6 = this.f18135a;
        if (z6 && c4938c.f18135a) {
            if (Double.compare(this.f18136b, c4938c.f18136b) == 0) {
                return true;
            }
        } else if (z6 == c4938c.f18135a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f18135a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f18136b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f18135a) {
            return "OptionalDouble[" + this.f18136b + "]";
        }
        return "OptionalDouble.empty";
    }
}

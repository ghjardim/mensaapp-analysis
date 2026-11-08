package p256j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p256j$.time.C4822c;

/* renamed from: j$.time.temporal.t */
/* loaded from: classes3.dex */
public final class C4919t implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a */
    private final long f18083a;

    /* renamed from: b */
    private final long f18084b;

    /* renamed from: c */
    private final long f18085c;

    /* renamed from: d */
    private final long f18086d;

    /* renamed from: j */
    public static C4919t m21198j(long j7, long j8) {
        if (j7 > j8) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C4919t(j7, j7, j8, j8);
    }

    /* renamed from: k */
    public static C4919t m21199k(long j7, long j8) {
        if (j7 > j8) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j8) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C4919t(1L, 1L, j7, j8);
    }

    private C4919t(long j7, long j8, long j9, long j10) {
        this.f18083a = j7;
        this.f18084b = j8;
        this.f18085c = j9;
        this.f18086d = j10;
    }

    /* renamed from: g */
    public final boolean m21205g() {
        return this.f18083a == this.f18084b && this.f18085c == this.f18086d;
    }

    /* renamed from: e */
    public final long m21203e() {
        return this.f18083a;
    }

    /* renamed from: f */
    public final long m21204f() {
        return this.f18085c;
    }

    /* renamed from: d */
    public final long m21202d() {
        return this.f18086d;
    }

    /* renamed from: h */
    public final boolean m21206h() {
        return this.f18083a >= -2147483648L && this.f18086d <= 2147483647L;
    }

    /* renamed from: i */
    public final boolean m21207i(long j7) {
        return j7 >= this.f18083a && j7 <= this.f18086d;
    }

    /* renamed from: a */
    public final int m21200a(long j7, InterfaceC4915p interfaceC4915p) {
        if (m21206h() && m21207i(j7)) {
            return (int) j7;
        }
        throw new C4822c(m21197c(j7, interfaceC4915p));
    }

    /* renamed from: b */
    public final void m21201b(long j7, InterfaceC4915p interfaceC4915p) {
        if (!m21207i(j7)) {
            throw new C4822c(m21197c(j7, interfaceC4915p));
        }
    }

    /* renamed from: c */
    private String m21197c(long j7, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p != null) {
            return "Invalid value for " + interfaceC4915p + " (valid values " + this + "): " + j7;
        }
        return "Invalid value (valid values " + this + "): " + j7;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j7 = this.f18083a;
        long j8 = this.f18084b;
        if (j7 > j8) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j9 = this.f18085c;
        long j10 = this.f18086d;
        if (j9 > j10) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j8 > j10) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4919t)) {
            return false;
        }
        C4919t c4919t = (C4919t) obj;
        return this.f18083a == c4919t.f18083a && this.f18084b == c4919t.f18084b && this.f18085c == c4919t.f18085c && this.f18086d == c4919t.f18086d;
    }

    public final int hashCode() {
        long j7 = this.f18084b;
        long j8 = this.f18083a + (j7 << 16) + (j7 >> 48);
        long j9 = this.f18085c;
        long j10 = j8 + (j9 << 32) + (j9 >> 32);
        long j11 = this.f18086d;
        long j12 = j10 + (j11 << 48) + (j11 >> 16);
        return (int) ((j12 >>> 32) ^ j12);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j7 = this.f18083a;
        sb.append(j7);
        long j8 = this.f18084b;
        if (j7 != j8) {
            sb.append('/');
            sb.append(j8);
        }
        sb.append(" - ");
        long j9 = this.f18085c;
        sb.append(j9);
        long j10 = this.f18086d;
        if (j9 != j10) {
            sb.append('/');
            sb.append(j10);
        }
        return sb.toString();
    }
}

package p253i5;

import java.util.Set;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p178Z2.AbstractC3037z;

/* renamed from: i5.U */
/* loaded from: classes2.dex */
public final class C4584U {

    /* renamed from: a */
    public final int f16643a;

    /* renamed from: b */
    public final long f16644b;

    /* renamed from: c */
    public final Set f16645c;

    public C4584U(int i7, long j7, Set set) {
        this.f16643a = i7;
        this.f16644b = j7;
        this.f16645c = AbstractC3037z.m11106o(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4584U.class != obj.getClass()) {
            return false;
        }
        C4584U c4584u = (C4584U) obj;
        return this.f16643a == c4584u.f16643a && this.f16644b == c4584u.f16644b && AbstractC2928k.m10550a(this.f16645c, c4584u.f16645c);
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(Integer.valueOf(this.f16643a), Long.valueOf(this.f16644b), this.f16645c);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10538b("maxAttempts", this.f16643a).m10539c("hedgingDelayNanos", this.f16644b).m10540d("nonFatalStatusCodes", this.f16645c).toString();
    }
}

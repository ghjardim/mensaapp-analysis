package p163X1;

import java.util.List;

/* renamed from: X1.d */
/* loaded from: classes.dex */
public final class C2802d extends AbstractC2808j {

    /* renamed from: a */
    public final List f8597a;

    public C2802d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f8597a = list;
    }

    @Override // p163X1.AbstractC2808j
    /* renamed from: c */
    public List mo10011c() {
        return this.f8597a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2808j) {
            return this.f8597a.equals(((AbstractC2808j) obj).mo10011c());
        }
        return false;
    }

    public int hashCode() {
        return this.f8597a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f8597a + "}";
    }
}

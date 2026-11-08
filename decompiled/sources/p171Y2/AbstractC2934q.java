package p171Y2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: Y2.q */
/* loaded from: classes.dex */
public abstract class AbstractC2934q {

    /* renamed from: Y2.q$b */
    public static class b implements InterfaceC2933p, Serializable {

        /* renamed from: a */
        public final List f9024a;

        @Override // p171Y2.InterfaceC2933p
        public boolean apply(Object obj) {
            for (int i7 = 0; i7 < this.f9024a.size(); i7++) {
                if (!((InterfaceC2933p) this.f9024a.get(i7)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f9024a.equals(((b) obj).f9024a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9024a.hashCode() + 306654252;
        }

        public String toString() {
            return AbstractC2934q.m10585d("and", this.f9024a);
        }

        public b(List list) {
            this.f9024a = list;
        }
    }

    /* renamed from: b */
    public static InterfaceC2933p m10583b(InterfaceC2933p interfaceC2933p, InterfaceC2933p interfaceC2933p2) {
        return new b(m10584c((InterfaceC2933p) AbstractC2932o.m10572o(interfaceC2933p), (InterfaceC2933p) AbstractC2932o.m10572o(interfaceC2933p2)));
    }

    /* renamed from: c */
    public static List m10584c(InterfaceC2933p interfaceC2933p, InterfaceC2933p interfaceC2933p2) {
        return Arrays.asList(interfaceC2933p, interfaceC2933p2);
    }

    /* renamed from: d */
    public static String m10585d(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z6 = true;
        for (Object obj : iterable) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}

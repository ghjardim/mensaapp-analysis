package p078L0;

import org.apache.tika.utils.StringUtils;
import p259j0.AbstractC5332a;

/* renamed from: L0.M */
/* loaded from: classes.dex */
public interface InterfaceC0855M {

    /* renamed from: L0.M$a */
    public static final class a {

        /* renamed from: a */
        public final C0856N f2936a;

        /* renamed from: b */
        public final C0856N f2937b;

        public a(C0856N c0856n) {
            this(c0856n, c0856n);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2936a.equals(aVar.f2936a) && this.f2937b.equals(aVar.f2937b);
        }

        public int hashCode() {
            return (this.f2936a.hashCode() * 31) + this.f2937b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f2936a);
            if (this.f2936a.equals(this.f2937b)) {
                str = StringUtils.EMPTY;
            } else {
                str = ", " + this.f2937b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public a(C0856N c0856n, C0856N c0856n2) {
            this.f2936a = (C0856N) AbstractC5332a.m21800e(c0856n);
            this.f2937b = (C0856N) AbstractC5332a.m21800e(c0856n2);
        }
    }

    /* renamed from: L0.M$b */
    public static class b implements InterfaceC0855M {

        /* renamed from: a */
        public final long f2938a;

        /* renamed from: b */
        public final a f2939b;

        public b(long j7) {
            this(j7, 0L);
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: f */
        public boolean mo3499f() {
            return false;
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: j */
        public a mo3500j(long j7) {
            return this.f2939b;
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: l */
        public long mo474l() {
            return this.f2938a;
        }

        public b(long j7, long j8) {
            this.f2938a = j7;
            this.f2939b = new a(j8 == 0 ? C0856N.f2940c : new C0856N(0L, j8));
        }
    }

    /* renamed from: f */
    boolean mo3499f();

    /* renamed from: j */
    a mo3500j(long j7);

    /* renamed from: l */
    long mo474l();
}

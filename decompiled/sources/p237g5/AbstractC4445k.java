package p237g5;

import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p237g5.C4429c;

/* renamed from: g5.k */
/* loaded from: classes2.dex */
public abstract class AbstractC4445k extends AbstractC4454o0 {

    /* renamed from: a */
    public static final C4429c.c f15785a = C4429c.c.m18870b("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    /* renamed from: g5.k$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC4445k mo18933a(b bVar, C4424Z c4424z);
    }

    /* renamed from: g5.k$b */
    public static final class b {

        /* renamed from: a */
        public final C4429c f15786a;

        /* renamed from: b */
        public final int f15787b;

        /* renamed from: c */
        public final boolean f15788c;

        /* renamed from: g5.k$b$a */
        public static final class a {

            /* renamed from: a */
            public C4429c f15789a = C4429c.f15720k;

            /* renamed from: b */
            public int f15790b;

            /* renamed from: c */
            public boolean f15791c;

            /* renamed from: a */
            public b m18935a() {
                return new b(this.f15789a, this.f15790b, this.f15791c);
            }

            /* renamed from: b */
            public a m18936b(C4429c c4429c) {
                this.f15789a = (C4429c) AbstractC2932o.m10573p(c4429c, "callOptions cannot be null");
                return this;
            }

            /* renamed from: c */
            public a m18937c(boolean z6) {
                this.f15791c = z6;
                return this;
            }

            /* renamed from: d */
            public a m18938d(int i7) {
                this.f15790b = i7;
                return this;
            }
        }

        public b(C4429c c4429c, int i7, boolean z6) {
            this.f15786a = (C4429c) AbstractC2932o.m10573p(c4429c, "callOptions");
            this.f15787b = i7;
            this.f15788c = z6;
        }

        /* renamed from: a */
        public static a m18934a() {
            return new a();
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10540d("callOptions", this.f15786a).m10538b("previousAttempts", this.f15787b).m10541e("isTransparentRetry", this.f15788c).toString();
        }
    }

    /* renamed from: j */
    public void mo18928j() {
    }

    /* renamed from: k */
    public void mo18929k() {
    }

    /* renamed from: m */
    public void mo18931m() {
    }

    /* renamed from: l */
    public void mo18930l(C4424Z c4424z) {
    }

    /* renamed from: n */
    public void mo18932n(C4425a c4425a, C4424Z c4424z) {
    }
}

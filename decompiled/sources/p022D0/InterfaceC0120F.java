package p022D0;

import android.os.Handler;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p232g0.AbstractC4303I;
import p232g0.C4331u;
import p249i1.InterfaceC4529t;
import p276l0.InterfaceC5511y;
import p300o0.C5912w1;
import p335s0.InterfaceC6321A;
import p335s0.InterfaceC6362v;

/* renamed from: D0.F */
/* loaded from: classes.dex */
public interface InterfaceC0120F {

    /* renamed from: D0.F$a */
    public interface a {
        /* renamed from: a */
        a mo339a(InterfaceC4529t.a aVar);

        /* renamed from: b */
        a mo340b(boolean z6);

        /* renamed from: c */
        a mo341c(InterfaceC0544m interfaceC0544m);

        /* renamed from: d */
        a mo342d(InterfaceC6321A interfaceC6321A);

        /* renamed from: e */
        InterfaceC0120F mo343e(C4331u c4331u);
    }

    /* renamed from: D0.F$b */
    public static final class b {

        /* renamed from: a */
        public final Object f367a;

        /* renamed from: b */
        public final int f368b;

        /* renamed from: c */
        public final int f369c;

        /* renamed from: d */
        public final long f370d;

        /* renamed from: e */
        public final int f371e;

        public b(Object obj) {
            this(obj, -1L);
        }

        /* renamed from: a */
        public b m344a(Object obj) {
            return this.f367a.equals(obj) ? this : new b(obj, this.f368b, this.f369c, this.f370d, this.f371e);
        }

        /* renamed from: b */
        public boolean m345b() {
            return this.f368b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f367a.equals(bVar.f367a) && this.f368b == bVar.f368b && this.f369c == bVar.f369c && this.f370d == bVar.f370d && this.f371e == bVar.f371e;
        }

        public int hashCode() {
            return ((((((((527 + this.f367a.hashCode()) * 31) + this.f368b) * 31) + this.f369c) * 31) + ((int) this.f370d)) * 31) + this.f371e;
        }

        public b(Object obj, long j7) {
            this(obj, -1, -1, j7, -1);
        }

        public b(Object obj, long j7, int i7) {
            this(obj, -1, -1, j7, i7);
        }

        public b(Object obj, int i7, int i8, long j7) {
            this(obj, i7, i8, j7, -1);
        }

        public b(Object obj, int i7, int i8, long j7, int i9) {
            this.f367a = obj;
            this.f368b = i7;
            this.f369c = i8;
            this.f370d = j7;
            this.f371e = i9;
        }
    }

    /* renamed from: D0.F$c */
    public interface c {
        /* renamed from: a */
        void mo346a(InterfaceC0120F interfaceC0120F, AbstractC4303I abstractC4303I);
    }

    /* renamed from: a */
    void mo294a(C4331u c4331u);

    /* renamed from: c */
    void mo328c(Handler handler, InterfaceC0127M interfaceC0127M);

    /* renamed from: d */
    void mo329d(Handler handler, InterfaceC6362v interfaceC6362v);

    /* renamed from: e */
    InterfaceC0117C mo296e(b bVar, InterfaceC0533b interfaceC0533b, long j7);

    /* renamed from: f */
    void mo297f(InterfaceC0117C interfaceC0117C);

    /* renamed from: g */
    void mo330g(c cVar, InterfaceC5511y interfaceC5511y, C5912w1 c5912w1);

    /* renamed from: i */
    C4331u mo331i();

    /* renamed from: j */
    void mo332j(c cVar);

    /* renamed from: l */
    void mo333l(InterfaceC0127M interfaceC0127M);

    /* renamed from: n */
    void mo298n();

    /* renamed from: o */
    boolean mo334o();

    /* renamed from: p */
    void mo335p(c cVar);

    /* renamed from: q */
    AbstractC4303I mo336q();

    /* renamed from: s */
    void mo337s(c cVar);

    /* renamed from: t */
    void mo338t(InterfaceC6362v interfaceC6362v);
}

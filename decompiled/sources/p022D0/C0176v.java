package p022D0;

import p022D0.InterfaceC0120F;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p232g0.C4331u;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5511y;
import p335s0.InterfaceC6321A;

/* renamed from: D0.v */
/* loaded from: classes.dex */
public final class C0176v extends AbstractC0140a {

    /* renamed from: o */
    public final long f728o;

    /* renamed from: p */
    public C4331u f729p;

    @Override // p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        m522D(new C0151f0(this.f728o, true, false, false, null, mo331i()));
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public synchronized void mo294a(C4331u c4331u) {
        this.f729p = c4331u;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        C4331u mo331i = mo331i();
        AbstractC5332a.m21800e(mo331i.f15212b);
        AbstractC5332a.m21801f(mo331i.f15212b.f15305b, "Externally loaded mediaItems require a MIME type.");
        C4331u.h hVar = mo331i.f15212b;
        return new C0175u(hVar.f15304a, hVar.f15305b, null);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        ((C0175u) interfaceC0117C).m705k();
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public synchronized C4331u mo331i() {
        return this.f729p;
    }

    public C0176v(C4331u c4331u, long j7, InterfaceC0174t interfaceC0174t) {
        this.f729p = c4331u;
        this.f728o = j7;
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
    }

    /* renamed from: D0.v$b */
    public static final class b implements InterfaceC0120F.a {

        /* renamed from: a */
        public final long f730a;

        public b(long j7, InterfaceC0174t interfaceC0174t) {
            this.f730a = j7;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: a */
        public /* synthetic */ InterfaceC0120F.a mo339a(InterfaceC4529t.a aVar) {
            return AbstractC0119E.m327b(this, aVar);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: b */
        public /* synthetic */ InterfaceC0120F.a mo340b(boolean z6) {
            return AbstractC0119E.m326a(this, z6);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0176v mo343e(C4331u c4331u) {
            return new C0176v(c4331u, this.f730a, null);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: c */
        public InterfaceC0120F.a mo341c(InterfaceC0544m interfaceC0544m) {
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: d */
        public InterfaceC0120F.a mo342d(InterfaceC6321A interfaceC6321A) {
            return this;
        }
    }
}

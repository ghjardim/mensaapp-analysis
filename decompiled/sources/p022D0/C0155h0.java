package p022D0;

import android.net.Uri;
import p022D0.InterfaceC0120F;
import p050H0.C0542k;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p171Y2.AbstractC2926i;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4303I;
import p232g0.C4327q;
import p232g0.C4331u;
import p259j0.AbstractC5332a;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;

/* renamed from: D0.h0 */
/* loaded from: classes.dex */
public final class C0155h0 extends AbstractC0140a {

    /* renamed from: o */
    public final C5497k f652o;

    /* renamed from: p */
    public final InterfaceC5493g.a f653p;

    /* renamed from: q */
    public final C4327q f654q;

    /* renamed from: r */
    public final long f655r;

    /* renamed from: s */
    public final InterfaceC0544m f656s;

    /* renamed from: t */
    public final boolean f657t;

    /* renamed from: u */
    public final AbstractC4303I f658u;

    /* renamed from: v */
    public final C4331u f659v;

    /* renamed from: w */
    public InterfaceC5511y f660w;

    /* renamed from: D0.h0$b */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC5493g.a f661a;

        /* renamed from: b */
        public InterfaceC0544m f662b = new C0542k();

        /* renamed from: c */
        public boolean f663c = true;

        /* renamed from: d */
        public Object f664d;

        /* renamed from: e */
        public String f665e;

        public b(InterfaceC5493g.a aVar) {
            this.f661a = (InterfaceC5493g.a) AbstractC5332a.m21800e(aVar);
        }

        /* renamed from: a */
        public C0155h0 m632a(C4331u.k kVar, long j7) {
            return new C0155h0(this.f665e, kVar, this.f661a, j7, this.f662b, this.f663c, this.f664d);
        }

        /* renamed from: b */
        public b m633b(InterfaceC0544m interfaceC0544m) {
            if (interfaceC0544m == null) {
                interfaceC0544m = new C0542k();
            }
            this.f662b = interfaceC0544m;
            return this;
        }
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        this.f660w = interfaceC5511y;
        m522D(this.f658u);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        return new C0153g0(this.f652o, this.f653p, this.f660w, this.f654q, this.f655r, this.f656s, m526x(bVar), this.f657t);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        ((C0153g0) interfaceC0117C).m613q();
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public C4331u mo331i() {
        return this.f659v;
    }

    public C0155h0(String str, C4331u.k kVar, InterfaceC5493g.a aVar, long j7, InterfaceC0544m interfaceC0544m, boolean z6, Object obj) {
        this.f653p = aVar;
        this.f655r = j7;
        this.f656s = interfaceC0544m;
        this.f657t = z6;
        C4331u m18276a = new C4331u.c().m18282g(Uri.EMPTY).m18278c(kVar.f15323a.toString()).m18280e(AbstractC3033v.m11051u(kVar)).m18281f(obj).m18276a();
        this.f659v = m18276a;
        C4327q.b m18252c0 = new C4327q.b().m18264o0((String) AbstractC2926i.m10533a(kVar.f15324b, "text/x-unknown")).m18254e0(kVar.f15325c).m18266q0(kVar.f15326d).m18262m0(kVar.f15327e).m18252c0(kVar.f15328f);
        String str2 = kVar.f15329g;
        this.f654q = m18252c0.m18250a0(str2 == null ? str : str2).m18234K();
        this.f652o = new C5497k.b().m23094i(kVar.f15323a).m23087b(1).m23086a();
        this.f658u = new C0151f0(j7, true, false, false, null, m18276a);
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
    }
}

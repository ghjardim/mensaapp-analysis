package p067J3;

import com.google.firebase.firestore.C3953g;
import p046G3.C0412Z;
import p067J3.AbstractC0750j;
import p081L3.AbstractC1085i0;
import p081L3.C1024K;
import p081L3.C1041Q;
import p081L3.C1067c0;
import p081L3.C1091k0;
import p081L3.C1093l;
import p081L3.C1105p;
import p081L3.InterfaceC1032M1;
import p095N3.C1268h;
import p109P3.C1906O;
import p109P3.C1911U;
import p237g5.C4448l0;
import p376x3.C6950e;

/* renamed from: J3.Y */
/* loaded from: classes.dex */
public class C0730Y extends AbstractC0750j {

    /* renamed from: J3.Y$b */
    public class b implements C1911U.c {
        public b() {
        }

        @Override // p109P3.C1911U.c
        /* renamed from: a */
        public void mo3077a(EnumC0733a0 enumC0733a0) {
            C0730Y.this.m3218r().mo3077a(enumC0733a0);
        }

        @Override // p109P3.C1911U.c
        /* renamed from: b */
        public C6950e mo3078b(int i7) {
            return C0730Y.this.m3218r().mo3078b(i7);
        }

        @Override // p109P3.C1911U.c
        /* renamed from: c */
        public void mo3079c(C1268h c1268h) {
            C0730Y.this.m3218r().mo3079c(c1268h);
        }

        @Override // p109P3.C1911U.c
        /* renamed from: d */
        public void mo3080d(C1906O c1906o) {
            C0730Y.this.m3218r().mo3080d(c1906o);
        }

        @Override // p109P3.C1911U.c
        /* renamed from: e */
        public void mo3081e(int i7, C4448l0 c4448l0) {
            C0730Y.this.m3218r().mo3081e(i7, c4448l0);
        }

        @Override // p109P3.C1911U.c
        /* renamed from: f */
        public void mo3082f(int i7, C4448l0 c4448l0) {
            C0730Y.this.m3218r().mo3082f(i7, c4448l0);
        }
    }

    public C0730Y(C3953g c3953g) {
        super(c3953g);
    }

    @Override // p067J3.AbstractC0750j
    /* renamed from: a */
    public C0760o mo3069a(AbstractC0750j.a aVar) {
        return new C0760o(m3218r());
    }

    @Override // p067J3.AbstractC0750j
    /* renamed from: b */
    public InterfaceC1032M1 mo3070b(AbstractC0750j.a aVar) {
        return null;
    }

    @Override // p067J3.AbstractC0750j
    /* renamed from: c */
    public C1093l mo3071c(AbstractC0750j.a aVar) {
        return null;
    }

    @Override // p067J3.AbstractC0750j
    /* renamed from: d */
    public C1024K mo3072d(AbstractC0750j.a aVar) {
        return new C1024K(m3215o(), new C1091k0(), aVar.f2656d);
    }

    @Override // p067J3.AbstractC0750j
    /* renamed from: e */
    public AbstractC1085i0 mo3073e(AbstractC0750j.a aVar) {
        if (!m3076t(this.f2644a)) {
            return C1067c0.m4211o();
        }
        return C1067c0.m4212p(C1041Q.b.m4140a(this.f2644a.m15593g()), new C1105p(m3216p()));
    }

    @Override // p067J3.AbstractC0750j
    /* renamed from: f */
    public C1911U mo3074f(AbstractC0750j.a aVar) {
        return new C1911U(aVar.f2655c.m3230a(), new b(), m3214n(), m3210j(), aVar.f2654b, m3209i());
    }

    @Override // p067J3.AbstractC0750j
    /* renamed from: g */
    public C0745g0 mo3075g(AbstractC0750j.a aVar) {
        return new C0745g0(m3214n(), m3217q(), aVar.f2656d, aVar.f2657e);
    }

    /* renamed from: t */
    public final boolean m3076t(C3953g c3953g) {
        if (c3953g.m15592f() != null && (c3953g.m15592f() instanceof C0412Z)) {
            ((C0412Z) c3953g.m15592f()).m1621a();
        }
        return false;
    }
}

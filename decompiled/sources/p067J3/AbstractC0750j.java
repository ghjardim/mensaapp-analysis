package p067J3;

import android.content.Context;
import com.google.firebase.firestore.C3953g;
import p053H3.AbstractC0555a;
import p053H3.C0564j;
import p081L3.AbstractC1085i0;
import p081L3.C1024K;
import p081L3.C1093l;
import p081L3.InterfaceC1032M1;
import p109P3.C1905N;
import p109P3.C1907P;
import p109P3.C1911U;
import p109P3.C1938r;
import p109P3.InterfaceC1901J;
import p109P3.InterfaceC1935o;
import p116Q3.AbstractC2133b;
import p116Q3.C2138g;

/* renamed from: J3.j */
/* loaded from: classes.dex */
public abstract class AbstractC0750j {

    /* renamed from: a */
    public final C3953g f2644a;

    /* renamed from: b */
    public C1905N f2645b = new C1905N();

    /* renamed from: c */
    public AbstractC1085i0 f2646c;

    /* renamed from: d */
    public C1024K f2647d;

    /* renamed from: e */
    public C0745g0 f2648e;

    /* renamed from: f */
    public C1911U f2649f;

    /* renamed from: g */
    public C0760o f2650g;

    /* renamed from: h */
    public C1093l f2651h;

    /* renamed from: i */
    public InterfaceC1032M1 f2652i;

    /* renamed from: J3.j$a */
    public static final class a {

        /* renamed from: a */
        public final Context f2653a;

        /* renamed from: b */
        public final C2138g f2654b;

        /* renamed from: c */
        public final C0754l f2655c;

        /* renamed from: d */
        public final C0564j f2656d;

        /* renamed from: e */
        public final int f2657e;

        /* renamed from: f */
        public final AbstractC0555a f2658f;

        /* renamed from: g */
        public final AbstractC0555a f2659g;

        /* renamed from: h */
        public final InterfaceC1901J f2660h;

        public a(Context context, C2138g c2138g, C0754l c0754l, C0564j c0564j, int i7, AbstractC0555a abstractC0555a, AbstractC0555a abstractC0555a2, InterfaceC1901J interfaceC1901J) {
            this.f2653a = context;
            this.f2654b = c2138g;
            this.f2655c = c0754l;
            this.f2656d = c0564j;
            this.f2657e = i7;
            this.f2658f = abstractC0555a;
            this.f2659g = abstractC0555a2;
            this.f2660h = interfaceC1901J;
        }
    }

    public AbstractC0750j(C3953g c3953g) {
        this.f2644a = c3953g;
    }

    /* renamed from: h */
    public static AbstractC0750j m3208h(C3953g c3953g) {
        return c3953g.m15595i() ? new C0743f0(c3953g) : new C0730Y(c3953g);
    }

    /* renamed from: a */
    public abstract C0760o mo3069a(a aVar);

    /* renamed from: b */
    public abstract InterfaceC1032M1 mo3070b(a aVar);

    /* renamed from: c */
    public abstract C1093l mo3071c(a aVar);

    /* renamed from: d */
    public abstract C1024K mo3072d(a aVar);

    /* renamed from: e */
    public abstract AbstractC1085i0 mo3073e(a aVar);

    /* renamed from: f */
    public abstract C1911U mo3074f(a aVar);

    /* renamed from: g */
    public abstract C0745g0 mo3075g(a aVar);

    /* renamed from: i */
    public InterfaceC1935o m3209i() {
        return this.f2645b.m6637f();
    }

    /* renamed from: j */
    public C1938r m3210j() {
        return this.f2645b.m6638g();
    }

    /* renamed from: k */
    public C0760o m3211k() {
        return (C0760o) AbstractC2133b.m7218e(this.f2650g, "eventManager not initialized yet", new Object[0]);
    }

    /* renamed from: l */
    public InterfaceC1032M1 m3212l() {
        return this.f2652i;
    }

    /* renamed from: m */
    public C1093l m3213m() {
        return this.f2651h;
    }

    /* renamed from: n */
    public C1024K m3214n() {
        return (C1024K) AbstractC2133b.m7218e(this.f2647d, "localStore not initialized yet", new Object[0]);
    }

    /* renamed from: o */
    public AbstractC1085i0 m3215o() {
        return (AbstractC1085i0) AbstractC2133b.m7218e(this.f2646c, "persistence not initialized yet", new Object[0]);
    }

    /* renamed from: p */
    public C1907P m3216p() {
        return this.f2645b.m6641j();
    }

    /* renamed from: q */
    public C1911U m3217q() {
        return (C1911U) AbstractC2133b.m7218e(this.f2649f, "remoteStore not initialized yet", new Object[0]);
    }

    /* renamed from: r */
    public C0745g0 m3218r() {
        return (C0745g0) AbstractC2133b.m7218e(this.f2648e, "syncEngine not initialized yet", new Object[0]);
    }

    /* renamed from: s */
    public void m3219s(a aVar) {
        this.f2645b.m6642k(aVar);
        AbstractC1085i0 mo3073e = mo3073e(aVar);
        this.f2646c = mo3073e;
        mo3073e.mo4226n();
        this.f2647d = mo3072d(aVar);
        this.f2649f = mo3074f(aVar);
        this.f2648e = mo3075g(aVar);
        this.f2650g = mo3069a(aVar);
        this.f2647d.m4039q0();
        this.f2649f.m6728P();
        this.f2652i = mo3070b(aVar);
        this.f2651h = mo3071c(aVar);
    }
}

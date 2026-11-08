package p362v3;

import p137T3.InterfaceC2446a;
import p137T3.InterfaceC2447b;

/* renamed from: v3.D */
/* loaded from: classes.dex */
public class C6749D implements InterfaceC2447b, InterfaceC2446a {

    /* renamed from: c */
    public static final InterfaceC2446a.a f24300c = new InterfaceC2446a.a() { // from class: v3.A
        @Override // p137T3.InterfaceC2446a.a
        /* renamed from: a */
        public final void mo2144a(InterfaceC2447b interfaceC2447b) {
            C6749D.m27696f(interfaceC2447b);
        }
    };

    /* renamed from: d */
    public static final InterfaceC2447b f24301d = new InterfaceC2447b() { // from class: v3.B
        @Override // p137T3.InterfaceC2447b
        public final Object get() {
            Object m27697g;
            m27697g = C6749D.m27697g();
            return m27697g;
        }
    };

    /* renamed from: a */
    public InterfaceC2446a.a f24302a;

    /* renamed from: b */
    public volatile InterfaceC2447b f24303b;

    public C6749D(InterfaceC2446a.a aVar, InterfaceC2447b interfaceC2447b) {
        this.f24302a = aVar;
        this.f24303b = interfaceC2447b;
    }

    /* renamed from: e */
    public static C6749D m27695e() {
        return new C6749D(f24300c, f24301d);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m27697g() {
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m27698h(InterfaceC2446a.a aVar, InterfaceC2446a.a aVar2, InterfaceC2447b interfaceC2447b) {
        aVar.mo2144a(interfaceC2447b);
        aVar2.mo2144a(interfaceC2447b);
    }

    /* renamed from: i */
    public static C6749D m27699i(InterfaceC2447b interfaceC2447b) {
        return new C6749D(null, interfaceC2447b);
    }

    @Override // p137T3.InterfaceC2446a
    /* renamed from: a */
    public void mo8312a(final InterfaceC2446a.a aVar) {
        InterfaceC2447b interfaceC2447b;
        InterfaceC2447b interfaceC2447b2;
        InterfaceC2447b interfaceC2447b3 = this.f24303b;
        InterfaceC2447b interfaceC2447b4 = f24301d;
        if (interfaceC2447b3 != interfaceC2447b4) {
            aVar.mo2144a(interfaceC2447b3);
            return;
        }
        synchronized (this) {
            interfaceC2447b = this.f24303b;
            if (interfaceC2447b != interfaceC2447b4) {
                interfaceC2447b2 = interfaceC2447b;
            } else {
                final InterfaceC2446a.a aVar2 = this.f24302a;
                this.f24302a = new InterfaceC2446a.a() { // from class: v3.C
                    @Override // p137T3.InterfaceC2446a.a
                    /* renamed from: a */
                    public final void mo2144a(InterfaceC2447b interfaceC2447b5) {
                        C6749D.m27698h(InterfaceC2446a.a.this, aVar, interfaceC2447b5);
                    }
                };
                interfaceC2447b2 = null;
            }
        }
        if (interfaceC2447b2 != null) {
            aVar.mo2144a(interfaceC2447b);
        }
    }

    @Override // p137T3.InterfaceC2447b
    public Object get() {
        return this.f24303b.get();
    }

    /* renamed from: j */
    public void m27700j(InterfaceC2447b interfaceC2447b) {
        InterfaceC2446a.a aVar;
        if (this.f24303b != f24301d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f24302a;
            this.f24302a = null;
            this.f24303b = interfaceC2447b;
        }
        aVar.mo2144a(interfaceC2447b);
    }

    /* renamed from: f */
    public static /* synthetic */ void m27696f(InterfaceC2447b interfaceC2447b) {
    }
}

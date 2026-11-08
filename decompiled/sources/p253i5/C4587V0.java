package p253i5;

import p171Y2.AbstractC2932o;

/* renamed from: i5.V0 */
/* loaded from: classes2.dex */
public final class C4587V0 {

    /* renamed from: l */
    public static final b f16652l = new b(InterfaceC4581S0.f16612a);

    /* renamed from: a */
    public final InterfaceC4581S0 f16653a;

    /* renamed from: b */
    public long f16654b;

    /* renamed from: c */
    public long f16655c;

    /* renamed from: d */
    public long f16656d;

    /* renamed from: e */
    public long f16657e;

    /* renamed from: f */
    public long f16658f;

    /* renamed from: g */
    public c f16659g;

    /* renamed from: h */
    public long f16660h;

    /* renamed from: i */
    public long f16661i;

    /* renamed from: j */
    public final InterfaceC4605f0 f16662j;

    /* renamed from: k */
    public volatile long f16663k;

    /* renamed from: i5.V0$b */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC4581S0 f16664a;

        public b(InterfaceC4581S0 interfaceC4581S0) {
            this.f16664a = interfaceC4581S0;
        }

        /* renamed from: a */
        public C4587V0 m19684a() {
            return new C4587V0(this.f16664a);
        }
    }

    /* renamed from: i5.V0$c */
    public interface c {
    }

    /* renamed from: a */
    public static b m19677a() {
        return f16652l;
    }

    /* renamed from: b */
    public void m19678b() {
        this.f16658f++;
    }

    /* renamed from: c */
    public void m19679c() {
        this.f16654b++;
        this.f16655c = this.f16653a.mo19625a();
    }

    /* renamed from: d */
    public void m19680d() {
        this.f16662j.mo19364a(1L);
        this.f16663k = this.f16653a.mo19625a();
    }

    /* renamed from: e */
    public void m19681e(int i7) {
        if (i7 == 0) {
            return;
        }
        this.f16660h += i7;
        this.f16661i = this.f16653a.mo19625a();
    }

    /* renamed from: f */
    public void m19682f(boolean z6) {
        if (z6) {
            this.f16656d++;
        } else {
            this.f16657e++;
        }
    }

    /* renamed from: g */
    public void m19683g(c cVar) {
        this.f16659g = (c) AbstractC2932o.m10572o(cVar);
    }

    public C4587V0(InterfaceC4581S0 interfaceC4581S0) {
        this.f16662j = AbstractC4607g0.m19876a();
        this.f16653a = interfaceC4581S0;
    }
}

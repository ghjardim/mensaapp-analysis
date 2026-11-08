package p253i5;

/* renamed from: i5.n */
/* loaded from: classes2.dex */
public final class C4620n {

    /* renamed from: f */
    public static final b f17122f = new a();

    /* renamed from: a */
    public final InterfaceC4581S0 f17123a;

    /* renamed from: b */
    public final InterfaceC4605f0 f17124b = AbstractC4607g0.m19876a();

    /* renamed from: c */
    public final InterfaceC4605f0 f17125c = AbstractC4607g0.m19876a();

    /* renamed from: d */
    public final InterfaceC4605f0 f17126d = AbstractC4607g0.m19876a();

    /* renamed from: e */
    public volatile long f17127e;

    /* renamed from: i5.n$a */
    public class a implements b {
        @Override // p253i5.C4620n.b
        /* renamed from: a */
        public C4620n mo19953a() {
            return new C4620n(InterfaceC4581S0.f16612a);
        }
    }

    /* renamed from: i5.n$b */
    public interface b {
        /* renamed from: a */
        C4620n mo19953a();
    }

    public C4620n(InterfaceC4581S0 interfaceC4581S0) {
        this.f17123a = interfaceC4581S0;
    }

    /* renamed from: a */
    public void m20033a(boolean z6) {
        if (z6) {
            this.f17125c.mo19364a(1L);
        } else {
            this.f17126d.mo19364a(1L);
        }
    }

    /* renamed from: b */
    public void m20034b() {
        this.f17124b.mo19364a(1L);
        this.f17127e = this.f17123a.mo19625a();
    }
}

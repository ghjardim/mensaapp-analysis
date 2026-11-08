package p253i5;

import java.io.Closeable;
import java.io.InputStream;
import p171Y2.AbstractC2932o;
import p237g5.InterfaceC4463u;
import p253i5.C4604f;
import p253i5.C4619m0;
import p253i5.InterfaceC4579R0;

/* renamed from: i5.e */
/* loaded from: classes2.dex */
public class C4602e implements InterfaceC4644z {

    /* renamed from: a */
    public final C4619m0.b f16800a;

    /* renamed from: b */
    public final C4604f f16801b;

    /* renamed from: c */
    public final C4619m0 f16802c;

    /* renamed from: i5.e$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f16803a;

        public a(int i7) {
            this.f16803a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4602e.this.f16802c.m20027r()) {
                return;
            }
            try {
                C4602e.this.f16802c.mo19861d(this.f16803a);
            } catch (Throwable th) {
                C4602e.this.f16801b.mo19533e(th);
                C4602e.this.f16802c.close();
            }
        }
    }

    /* renamed from: i5.e$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4645z0 f16805a;

        public b(InterfaceC4645z0 interfaceC4645z0) {
            this.f16805a = interfaceC4645z0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4602e.this.f16802c.mo19865m(this.f16805a);
            } catch (Throwable th) {
                C4602e.this.f16801b.mo19533e(th);
                C4602e.this.f16802c.close();
            }
        }
    }

    /* renamed from: i5.e$c */
    public class c implements Closeable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4645z0 f16807a;

        public c(InterfaceC4645z0 interfaceC4645z0) {
            this.f16807a = interfaceC4645z0;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f16807a.close();
        }
    }

    /* renamed from: i5.e$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4602e.this.f16802c.mo19863h();
        }
    }

    /* renamed from: i5.e$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4602e.this.f16802c.close();
        }
    }

    /* renamed from: i5.e$f */
    public class f extends g implements Closeable {

        /* renamed from: d */
        public final Closeable f16811d;

        public f(Runnable runnable, Closeable closeable) {
            super(C4602e.this, runnable, null);
            this.f16811d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f16811d.close();
        }
    }

    /* renamed from: i5.e$g */
    public class g implements InterfaceC4579R0.a {

        /* renamed from: a */
        public final Runnable f16813a;

        /* renamed from: b */
        public boolean f16814b;

        public /* synthetic */ g(C4602e c4602e, Runnable runnable, a aVar) {
            this(runnable);
        }

        /* renamed from: a */
        public final void m19866a() {
            if (this.f16814b) {
                return;
            }
            this.f16813a.run();
            this.f16814b = true;
        }

        @Override // p253i5.InterfaceC4579R0.a
        public InputStream next() {
            m19866a();
            return C4602e.this.f16801b.m19868f();
        }

        public g(Runnable runnable) {
            this.f16814b = false;
            this.f16813a = runnable;
        }
    }

    /* renamed from: i5.e$h */
    public interface h extends C4604f.d {
    }

    public C4602e(C4619m0.b bVar, h hVar, C4619m0 c4619m0) {
        C4574O0 c4574o0 = new C4574O0((C4619m0.b) AbstractC2932o.m10573p(bVar, "listener"));
        this.f16800a = c4574o0;
        C4604f c4604f = new C4604f(c4574o0, hVar);
        this.f16801b = c4604f;
        c4619m0.m20022G(c4604f);
        this.f16802c = c4619m0;
    }

    @Override // p253i5.InterfaceC4644z
    public void close() {
        this.f16802c.m20023K();
        this.f16800a.mo19529a(new g(this, new e(), null));
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: d */
    public void mo19861d(int i7) {
        this.f16800a.mo19529a(new g(this, new a(i7), null));
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: g */
    public void mo19862g(int i7) {
        this.f16802c.mo19862g(i7);
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: h */
    public void mo19863h() {
        this.f16800a.mo19529a(new g(this, new d(), null));
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: j */
    public void mo19864j(InterfaceC4463u interfaceC4463u) {
        this.f16802c.mo19864j(interfaceC4463u);
    }

    @Override // p253i5.InterfaceC4644z
    /* renamed from: m */
    public void mo19865m(InterfaceC4645z0 interfaceC4645z0) {
        this.f16800a.mo19529a(new f(new b(interfaceC4645z0), new c(interfaceC4645z0)));
    }
}

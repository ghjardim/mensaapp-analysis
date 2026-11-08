package p253i5;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p171Y2.AbstractC2932o;
import p253i5.C4619m0;
import p253i5.InterfaceC4579R0;

/* renamed from: i5.f */
/* loaded from: classes2.dex */
public final class C4604f implements C4619m0.b {

    /* renamed from: a */
    public final d f16818a;

    /* renamed from: b */
    public final C4619m0.b f16819b;

    /* renamed from: c */
    public final Queue f16820c = new ArrayDeque();

    /* renamed from: i5.f$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f16821a;

        public a(int i7) {
            this.f16821a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4604f.this.f16819b.mo19532d(this.f16821a);
        }
    }

    /* renamed from: i5.f$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f16823a;

        public b(boolean z6) {
            this.f16823a = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4604f.this.f16819b.mo19531c(this.f16823a);
        }
    }

    /* renamed from: i5.f$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Throwable f16825a;

        public c(Throwable th) {
            this.f16825a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4604f.this.f16819b.mo19533e(this.f16825a);
        }
    }

    /* renamed from: i5.f$d */
    public interface d {
        /* renamed from: f */
        void mo19869f(Runnable runnable);
    }

    public C4604f(C4619m0.b bVar, d dVar) {
        this.f16819b = (C4619m0.b) AbstractC2932o.m10573p(bVar, "listener");
        this.f16818a = (d) AbstractC2932o.m10573p(dVar, "transportExecutor");
    }

    @Override // p253i5.C4619m0.b
    /* renamed from: a */
    public void mo19529a(InterfaceC4579R0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f16820c.add(next);
            }
        }
    }

    @Override // p253i5.C4619m0.b
    /* renamed from: c */
    public void mo19531c(boolean z6) {
        this.f16818a.mo19869f(new b(z6));
    }

    @Override // p253i5.C4619m0.b
    /* renamed from: d */
    public void mo19532d(int i7) {
        this.f16818a.mo19869f(new a(i7));
    }

    @Override // p253i5.C4619m0.b
    /* renamed from: e */
    public void mo19533e(Throwable th) {
        this.f16818a.mo19869f(new c(th));
    }

    /* renamed from: f */
    public InputStream m19868f() {
        return (InputStream) this.f16820c.poll();
    }
}

package p226f2;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p170Y1.AbstractC2908o;
import p234g2.InterfaceC4371d;
import p242h2.InterfaceC4484b;

/* renamed from: f2.v */
/* loaded from: classes.dex */
public class C4270v {

    /* renamed from: a */
    public final Executor f14703a;

    /* renamed from: b */
    public final InterfaceC4371d f14704b;

    /* renamed from: c */
    public final InterfaceC4272x f14705c;

    /* renamed from: d */
    public final InterfaceC4484b f14706d;

    public C4270v(Executor executor, InterfaceC4371d interfaceC4371d, InterfaceC4272x interfaceC4272x, InterfaceC4484b interfaceC4484b) {
        this.f14703a = executor;
        this.f14704b = interfaceC4371d;
        this.f14705c = interfaceC4272x;
        this.f14706d = interfaceC4484b;
    }

    /* renamed from: c */
    public void m17888c() {
        this.f14703a.execute(new Runnable() { // from class: f2.t
            @Override // java.lang.Runnable
            public final void run() {
                C4270v.this.m17890e();
            }
        });
    }

    /* renamed from: d */
    public final /* synthetic */ Object m17889d() {
        Iterator it = this.f14704b.mo18526E().iterator();
        while (it.hasNext()) {
            this.f14705c.mo17846b((AbstractC2908o) it.next(), 1);
        }
        return null;
    }

    /* renamed from: e */
    public final /* synthetic */ void m17890e() {
        this.f14706d.mo18544a(new InterfaceC4484b.a() { // from class: f2.u
            @Override // p242h2.InterfaceC4484b.a
            /* renamed from: a */
            public final Object mo17487a() {
                Object m17889d;
                m17889d = C4270v.this.m17889d();
                return m17889d;
            }
        });
    }
}

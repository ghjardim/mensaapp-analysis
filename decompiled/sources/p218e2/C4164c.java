package p218e2;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p149V1.InterfaceC2617j;
import p170Y1.AbstractC2902i;
import p170Y1.AbstractC2908o;
import p170Y1.C2913t;
import p177Z1.InterfaceC2978e;
import p177Z1.InterfaceC2986m;
import p226f2.InterfaceC4272x;
import p234g2.InterfaceC4371d;
import p242h2.InterfaceC4484b;

/* renamed from: e2.c */
/* loaded from: classes.dex */
public class C4164c implements InterfaceC4166e {

    /* renamed from: f */
    public static final Logger f13974f = Logger.getLogger(C2913t.class.getName());

    /* renamed from: a */
    public final InterfaceC4272x f13975a;

    /* renamed from: b */
    public final Executor f13976b;

    /* renamed from: c */
    public final InterfaceC2978e f13977c;

    /* renamed from: d */
    public final InterfaceC4371d f13978d;

    /* renamed from: e */
    public final InterfaceC4484b f13979e;

    public C4164c(Executor executor, InterfaceC2978e interfaceC2978e, InterfaceC4272x interfaceC4272x, InterfaceC4371d interfaceC4371d, InterfaceC4484b interfaceC4484b) {
        this.f13976b = executor;
        this.f13977c = interfaceC2978e;
        this.f13975a = interfaceC4272x;
        this.f13978d = interfaceC4371d;
        this.f13979e = interfaceC4484b;
    }

    @Override // p218e2.InterfaceC4166e
    /* renamed from: a */
    public void mo17490a(final AbstractC2908o abstractC2908o, final AbstractC2902i abstractC2902i, final InterfaceC2617j interfaceC2617j) {
        this.f13976b.execute(new Runnable() { // from class: e2.a
            @Override // java.lang.Runnable
            public final void run() {
                C4164c.this.m17492e(abstractC2908o, interfaceC2617j, abstractC2902i);
            }
        });
    }

    /* renamed from: d */
    public final /* synthetic */ Object m17491d(AbstractC2908o abstractC2908o, AbstractC2902i abstractC2902i) {
        this.f13978d.mo18545a0(abstractC2908o, abstractC2902i);
        this.f13975a.mo17846b(abstractC2908o, 1);
        return null;
    }

    /* renamed from: e */
    public final /* synthetic */ void m17492e(final AbstractC2908o abstractC2908o, InterfaceC2617j interfaceC2617j, AbstractC2902i abstractC2902i) {
        try {
            InterfaceC2986m mo10730a = this.f13977c.mo10730a(abstractC2908o.mo10455b());
            if (mo10730a == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC2908o.mo10455b());
                f13974f.warning(format);
                interfaceC2617j.mo8996a(new IllegalArgumentException(format));
            } else {
                final AbstractC2902i mo9128a = mo10730a.mo9128a(abstractC2902i);
                this.f13979e.mo18544a(new InterfaceC4484b.a() { // from class: e2.b
                    @Override // p242h2.InterfaceC4484b.a
                    /* renamed from: a */
                    public final Object mo17487a() {
                        Object m17491d;
                        m17491d = C4164c.this.m17491d(abstractC2908o, mo9128a);
                        return m17491d;
                    }
                });
                interfaceC2617j.mo8996a(null);
            }
        } catch (Exception e7) {
            f13974f.warning("Error scheduling event " + e7.getMessage());
            interfaceC2617j.mo8996a(e7);
        }
    }
}

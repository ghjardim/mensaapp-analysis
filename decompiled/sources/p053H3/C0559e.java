package p053H3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2155x;
import p116Q3.InterfaceC2154w;
import p137T3.InterfaceC2446a;
import p137T3.InterfaceC2447b;
import p219e3.C4173c;
import p262j3.AbstractC5368d;
import p303o3.InterfaceC5938a;
import p303o3.InterfaceC5939b;

/* renamed from: H3.e */
/* loaded from: classes.dex */
public final class C0559e extends AbstractC0555a {

    /* renamed from: a */
    public InterfaceC2154w f1829a;

    /* renamed from: b */
    public InterfaceC5939b f1830b;

    /* renamed from: c */
    public boolean f1831c;

    /* renamed from: d */
    public final InterfaceC5938a f1832d = new InterfaceC5938a() { // from class: H3.b
        @Override // p303o3.InterfaceC5938a
        /* renamed from: a */
        public final void mo2143a(AbstractC5368d abstractC5368d) {
            C0559e.this.m2149i(abstractC5368d);
        }
    };

    public C0559e(InterfaceC2446a interfaceC2446a) {
        interfaceC2446a.mo8312a(new InterfaceC2446a.a() { // from class: H3.c
            @Override // p137T3.InterfaceC2446a.a
            /* renamed from: a */
            public final void mo2144a(InterfaceC2447b interfaceC2447b) {
                C0559e.this.m2150j(interfaceC2447b);
            }
        });
    }

    /* renamed from: h */
    public static /* synthetic */ Task m2148h(Task task) {
        return task.isSuccessful() ? Tasks.forResult(((AbstractC5368d) task.getResult()).mo22074b()) : Tasks.forException(task.getException());
    }

    @Override // p053H3.AbstractC0555a
    /* renamed from: a */
    public synchronized Task mo2139a() {
        InterfaceC5939b interfaceC5939b = this.f1830b;
        if (interfaceC5939b == null) {
            return Tasks.forException(new C4173c("AppCheck is not available"));
        }
        Task mo23363b = interfaceC5939b.mo23363b(this.f1831c);
        this.f1831c = false;
        return mo23363b.continueWithTask(AbstractC2147p.f6508b, new Continuation() { // from class: H3.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m2148h;
                m2148h = C0559e.m2148h(task);
                return m2148h;
            }
        });
    }

    @Override // p053H3.AbstractC0555a
    /* renamed from: b */
    public synchronized void mo2140b() {
        this.f1831c = true;
    }

    @Override // p053H3.AbstractC0555a
    /* renamed from: c */
    public synchronized void mo2141c() {
        this.f1829a = null;
        InterfaceC5939b interfaceC5939b = this.f1830b;
        if (interfaceC5939b != null) {
            interfaceC5939b.mo23362a(this.f1832d);
        }
    }

    @Override // p053H3.AbstractC0555a
    /* renamed from: d */
    public synchronized void mo2142d(InterfaceC2154w interfaceC2154w) {
        this.f1829a = interfaceC2154w;
    }

    /* renamed from: j */
    public final /* synthetic */ void m2150j(InterfaceC2447b interfaceC2447b) {
        synchronized (this) {
            try {
                InterfaceC5939b interfaceC5939b = (InterfaceC5939b) interfaceC2447b.get();
                this.f1830b = interfaceC5939b;
                if (interfaceC5939b != null) {
                    interfaceC5939b.mo23364c(this.f1832d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final synchronized void m2149i(AbstractC5368d abstractC5368d) {
        try {
            if (abstractC5368d.mo22073a() != null) {
                AbstractC2155x.m7313e("FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + abstractC5368d.mo22073a(), new Object[0]);
            }
            InterfaceC2154w interfaceC2154w = this.f1829a;
            if (interfaceC2154w != null) {
                interfaceC2154w.mo2991a(abstractC5368d.mo22074b());
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

package p053H3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p116Q3.AbstractC2147p;
import p116Q3.AbstractC2155x;
import p116Q3.InterfaceC2154w;
import p137T3.InterfaceC2446a;
import p137T3.InterfaceC2447b;
import p172Y3.C2945b;
import p219e3.C4173c;
import p346t3.C6462C;
import p354u3.InterfaceC6638a;
import p354u3.InterfaceC6640b;

/* renamed from: H3.i */
/* loaded from: classes.dex */
public final class C0563i extends AbstractC0555a {

    /* renamed from: a */
    public final InterfaceC6638a f1837a = new InterfaceC6638a() { // from class: H3.f
        @Override // p354u3.InterfaceC6638a
        /* renamed from: a */
        public final void mo2152a(C2945b c2945b) {
            C0563i.this.m2159j(c2945b);
        }
    };

    /* renamed from: b */
    public InterfaceC6640b f1838b;

    /* renamed from: c */
    public InterfaceC2154w f1839c;

    /* renamed from: d */
    public int f1840d;

    /* renamed from: e */
    public boolean f1841e;

    public C0563i(InterfaceC2446a interfaceC2446a) {
        interfaceC2446a.mo8312a(new InterfaceC2446a.a() { // from class: H3.g
            @Override // p137T3.InterfaceC2446a.a
            /* renamed from: a */
            public final void mo2144a(InterfaceC2447b interfaceC2447b) {
                C0563i.this.m2156k(interfaceC2447b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m2156k(InterfaceC2447b interfaceC2447b) {
        synchronized (this) {
            this.f1838b = (InterfaceC6640b) interfaceC2447b.get();
            m2160l();
            this.f1838b.mo15345b(this.f1837a);
        }
    }

    @Override // p053H3.AbstractC0555a
    /* renamed from: a */
    public synchronized Task mo2139a() {
        InterfaceC6640b interfaceC6640b = this.f1838b;
        if (interfaceC6640b == null) {
            return Tasks.forException(new C4173c("auth is not available"));
        }
        Task mo15348d = interfaceC6640b.mo15348d(this.f1841e);
        this.f1841e = false;
        final int i7 = this.f1840d;
        return mo15348d.continueWithTask(AbstractC2147p.f6508b, new Continuation() { // from class: H3.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m2158i;
                m2158i = C0563i.this.m2158i(i7, task);
                return m2158i;
            }
        });
    }

    @Override // p053H3.AbstractC0555a
    /* renamed from: b */
    public synchronized void mo2140b() {
        this.f1841e = true;
    }

    @Override // p053H3.AbstractC0555a
    /* renamed from: c */
    public synchronized void mo2141c() {
        this.f1839c = null;
        InterfaceC6640b interfaceC6640b = this.f1838b;
        if (interfaceC6640b != null) {
            interfaceC6640b.mo15346c(this.f1837a);
        }
    }

    @Override // p053H3.AbstractC0555a
    /* renamed from: d */
    public synchronized void mo2142d(InterfaceC2154w interfaceC2154w) {
        this.f1839c = interfaceC2154w;
        interfaceC2154w.mo2991a(m2157h());
    }

    /* renamed from: h */
    public final synchronized C0564j m2157h() {
        String mo15343a;
        try {
            InterfaceC6640b interfaceC6640b = this.f1838b;
            mo15343a = interfaceC6640b == null ? null : interfaceC6640b.mo15343a();
        } catch (Throwable th) {
            throw th;
        }
        return mo15343a != null ? new C0564j(mo15343a) : C0564j.f1842b;
    }

    /* renamed from: i */
    public final /* synthetic */ Task m2158i(int i7, Task task) {
        synchronized (this) {
            try {
                if (i7 != this.f1840d) {
                    AbstractC2155x.m7309a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    return mo2139a();
                }
                if (task.isSuccessful()) {
                    return Tasks.forResult(((C6462C) task.getResult()).m26994g());
                }
                return Tasks.forException(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void m2159j(C2945b c2945b) {
        m2160l();
    }

    /* renamed from: l */
    public final synchronized void m2160l() {
        this.f1840d++;
        InterfaceC2154w interfaceC2154w = this.f1839c;
        if (interfaceC2154w != null) {
            interfaceC2154w.mo2991a(m2157h());
        }
    }
}

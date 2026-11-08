package p145U4;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.AbstractC3975E;
import com.google.firebase.storage.C3990f;
import com.google.firebase.storage.InterfaceC3996l;
import com.google.firebase.storage.InterfaceC3997m;
import java.util.HashMap;
import java.util.Map;
import p061I4.C0652d;
import p145U4.AbstractC2550G;

/* renamed from: U4.M */
/* loaded from: classes2.dex */
public class C2556M implements C0652d.d {

    /* renamed from: a */
    public final C2568l f7506a;

    /* renamed from: b */
    public final C3990f f7507b;

    /* renamed from: c */
    public final AbstractC3975E f7508c;

    /* renamed from: d */
    public final String f7509d;

    /* renamed from: e */
    public final String f7510e = "taskState";

    /* renamed from: f */
    public final String f7511f = "appName";

    /* renamed from: g */
    public final String f7512g = "snapshot";

    /* renamed from: h */
    public final String f7513h = "error";

    public C2556M(C2568l c2568l, C3990f c3990f, AbstractC3975E abstractC3975E, String str) {
        this.f7506a = c2568l;
        this.f7507b = c3990f;
        this.f7508c = abstractC3975E;
        this.f7509d = str;
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        if (!this.f7508c.isCanceled()) {
            this.f7508c.m15929w();
        }
        if (!this.f7506a.m8703g()) {
            this.f7506a.m8700b();
        }
        Map map = C2567k.f7528e;
        C0652d c0652d = (C0652d) map.get(this.f7509d);
        if (c0652d != null) {
            c0652d.m2628d(null);
            map.remove(this.f7509d);
        }
        Map map2 = C2567k.f7529f;
        if (map2.get(this.f7509d) != null) {
            map2.remove(this.f7509d);
        }
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        this.f7508c.m15925s(new InterfaceC3997m() { // from class: U4.H
            @Override // com.google.firebase.storage.InterfaceC3997m
            /* renamed from: a */
            public final void mo8646a(Object obj2) {
                C2556M.this.m8654i(bVar, (AbstractC3975E.a) obj2);
            }
        });
        this.f7508c.m15924r(new InterfaceC3996l() { // from class: U4.I
            @Override // com.google.firebase.storage.InterfaceC3996l
            /* renamed from: a */
            public final void mo8647a(Object obj2) {
                C2556M.this.m8655j(bVar, (AbstractC3975E.a) obj2);
            }
        });
        this.f7508c.addOnSuccessListener(new OnSuccessListener() { // from class: U4.J
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                C2556M.this.m8656k(bVar, (AbstractC3975E.a) obj2);
            }
        });
        this.f7508c.addOnCanceledListener(new OnCanceledListener() { // from class: U4.K
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                C2556M.this.m8657l(bVar);
            }
        });
        this.f7508c.addOnFailureListener(new OnFailureListener() { // from class: U4.L
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C2556M.this.m8658m(bVar, exc);
            }
        });
    }

    /* renamed from: h */
    public final Map m8653h(Object obj, Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f7507b.m15999a().m17533q());
        if (obj != null) {
            hashMap.put("snapshot", C2568l.m8696l(obj));
        }
        if (exc != null) {
            hashMap.put("error", C2567k.m8665H(exc));
        }
        return hashMap;
    }

    /* renamed from: i */
    public final /* synthetic */ void m8654i(C0652d.b bVar, AbstractC3975E.a aVar) {
        if (this.f7506a.m8703g()) {
            return;
        }
        Map m8653h = m8653h(aVar, null);
        m8653h.put("taskState", Integer.valueOf(AbstractC2550G.j.RUNNING.f7495a));
        bVar.mo2629a(m8653h);
        this.f7506a.m8706j();
    }

    /* renamed from: j */
    public final /* synthetic */ void m8655j(C0652d.b bVar, AbstractC3975E.a aVar) {
        if (this.f7506a.m8703g()) {
            return;
        }
        Map m8653h = m8653h(aVar, null);
        m8653h.put("taskState", Integer.valueOf(AbstractC2550G.j.PAUSED.f7495a));
        bVar.mo2629a(m8653h);
        this.f7506a.m8705i();
    }

    /* renamed from: k */
    public final /* synthetic */ void m8656k(C0652d.b bVar, AbstractC3975E.a aVar) {
        if (this.f7506a.m8703g()) {
            return;
        }
        Map m8653h = m8653h(aVar, null);
        m8653h.put("taskState", Integer.valueOf(AbstractC2550G.j.SUCCESS.f7495a));
        bVar.mo2629a(m8653h);
        this.f7506a.m8700b();
    }

    /* renamed from: l */
    public final /* synthetic */ void m8657l(C0652d.b bVar) {
        if (this.f7506a.m8703g()) {
            return;
        }
        Map m8653h = m8653h(null, null);
        m8653h.put("taskState", Integer.valueOf(AbstractC2550G.j.ERROR.f7495a));
        HashMap hashMap = new HashMap();
        hashMap.put("code", AbstractC2557a.m8659a(-13040));
        hashMap.put("message", AbstractC2557a.m8660b(-13040));
        m8653h.put("error", hashMap);
        bVar.mo2629a(m8653h);
        this.f7506a.m8704h();
        this.f7506a.m8700b();
    }

    /* renamed from: m */
    public final /* synthetic */ void m8658m(C0652d.b bVar, Exception exc) {
        if (this.f7506a.m8703g()) {
            return;
        }
        Map m8653h = m8653h(null, exc);
        m8653h.put("taskState", Integer.valueOf(AbstractC2550G.j.ERROR.f7495a));
        bVar.mo2629a(m8653h);
        this.f7506a.m8700b();
    }
}

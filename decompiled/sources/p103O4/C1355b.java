package p103O4;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p061I4.C0652d;
import p346t3.AbstractC6458A;

/* renamed from: O4.b */
/* loaded from: classes2.dex */
public class C1355b implements C0652d.d {

    /* renamed from: a */
    public final FirebaseAuth f4222a;

    /* renamed from: b */
    public FirebaseAuth.InterfaceC3928a f4223b;

    public C1355b(FirebaseAuth firebaseAuth) {
        this.f4222a = firebaseAuth;
    }

    /* renamed from: d */
    public static /* synthetic */ void m5205d(AtomicBoolean atomicBoolean, Map map, C0652d.b bVar, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        AbstractC6458A m15361m = firebaseAuth.m15361m();
        if (m15361m == null) {
            map.put("user", null);
        } else {
            map.put("user", AbstractC1381j1.m5455c(AbstractC1381j1.m5462j(m15361m)));
        }
        bVar.mo2629a(map);
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        FirebaseAuth.InterfaceC3928a interfaceC3928a = this.f4223b;
        if (interfaceC3928a != null) {
            this.f4222a.m15372s(interfaceC3928a);
            this.f4223b = null;
        }
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f4222a.m15359l().m17533q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.InterfaceC3928a interfaceC3928a = new FirebaseAuth.InterfaceC3928a() { // from class: O4.a
            @Override // com.google.firebase.auth.FirebaseAuth.InterfaceC3928a
            /* renamed from: a */
            public final void mo5198a(FirebaseAuth firebaseAuth) {
                C1355b.m5205d(atomicBoolean, hashMap, bVar, firebaseAuth);
            }
        };
        this.f4223b = interfaceC3928a;
        this.f4222a.m15350e(interfaceC3928a);
    }
}

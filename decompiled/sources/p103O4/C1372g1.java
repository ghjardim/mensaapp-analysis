package p103O4;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p061I4.C0652d;
import p346t3.AbstractC6458A;

/* renamed from: O4.g1 */
/* loaded from: classes2.dex */
public class C1372g1 implements C0652d.d {

    /* renamed from: a */
    public final FirebaseAuth f4393a;

    /* renamed from: b */
    public FirebaseAuth.InterfaceC3929b f4394b;

    public C1372g1(FirebaseAuth firebaseAuth) {
        this.f4393a = firebaseAuth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m5448d(AtomicBoolean atomicBoolean, Map map, C0652d.b bVar, FirebaseAuth firebaseAuth) {
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
        FirebaseAuth.InterfaceC3929b interfaceC3929b = this.f4394b;
        if (interfaceC3929b != null) {
            this.f4393a.m15373t(interfaceC3929b);
            this.f4394b = null;
        }
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f4393a.m15359l().m17533q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.InterfaceC3929b interfaceC3929b = new FirebaseAuth.InterfaceC3929b() { // from class: O4.f1
            @Override // com.google.firebase.auth.FirebaseAuth.InterfaceC3929b
            /* renamed from: a */
            public final void mo5446a(FirebaseAuth firebaseAuth) {
                C1372g1.m5448d(atomicBoolean, hashMap, bVar, firebaseAuth);
            }
        };
        this.f4394b = interfaceC3929b;
        this.f4393a.m15351f(interfaceC3929b);
    }
}

package p124R4;

import com.google.firebase.firestore.FirebaseFirestore;
import p046G3.InterfaceC0407U;
import p061I4.C0652d;

/* renamed from: R4.j */
/* loaded from: classes2.dex */
public class C2269j implements C0652d.d {

    /* renamed from: a */
    public InterfaceC0407U f6900a;

    /* renamed from: b */
    public FirebaseFirestore f6901b;

    public C2269j(FirebaseFirestore firebaseFirestore) {
        this.f6901b = firebaseFirestore;
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        InterfaceC0407U interfaceC0407U = this.f6900a;
        if (interfaceC0407U != null) {
            interfaceC0407U.remove();
            this.f6900a = null;
        }
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        this.f6900a = this.f6901b.m15496o(new Runnable() { // from class: R4.i
            @Override // java.lang.Runnable
            public final void run() {
                C0652d.b.this.mo2629a(null);
            }
        });
    }
}

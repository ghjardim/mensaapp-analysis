package p124R4;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.firestore.FirebaseFirestore;
import p046G3.C0409W;
import p046G3.C0410X;
import p046G3.InterfaceC0420d0;
import p061I4.C0652d;
import p131S4.AbstractC2314a;
import p256j$.util.Objects;

/* renamed from: R4.e */
/* loaded from: classes2.dex */
public class C2264e implements C0652d.d {

    /* renamed from: a */
    public C0652d.b f6889a;

    /* renamed from: b */
    public final FirebaseFirestore f6890b;

    /* renamed from: c */
    public final byte[] f6891c;

    public C2264e(FirebaseFirestore firebaseFirestore, byte[] bArr) {
        this.f6890b = firebaseFirestore;
        this.f6891c = bArr;
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        this.f6889a.mo2631c();
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        this.f6889a = bVar;
        C0409W m15486T = this.f6890b.m15486T(this.f6891c);
        Objects.requireNonNull(bVar);
        m15486T.m1603a(new InterfaceC0420d0() { // from class: R4.c
            @Override // p046G3.InterfaceC0420d0
            /* renamed from: a */
            public final void mo1633a(Object obj2) {
                C0652d.b.this.mo2629a((C0410X) obj2);
            }
        });
        m15486T.addOnFailureListener(new OnFailureListener() { // from class: R4.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C2264e.this.m7696d(bVar, exc);
            }
        });
    }

    /* renamed from: d */
    public final /* synthetic */ void m7696d(C0652d.b bVar, Exception exc) {
        bVar.mo2630b("firebase_firestore", exc.getMessage(), AbstractC2314a.m7829a(exc));
        mo2635a(null);
    }
}

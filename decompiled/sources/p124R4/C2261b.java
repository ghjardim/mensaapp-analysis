package p124R4;

import com.google.firebase.firestore.C3949c;
import com.google.firebase.firestore.C3950d;
import com.google.firebase.firestore.C3952f;
import com.google.firebase.firestore.FirebaseFirestore;
import p046G3.C0450s0;
import p046G3.EnumC0406T;
import p046G3.EnumC0418c0;
import p046G3.InterfaceC0407U;
import p046G3.InterfaceC0447r;
import p061I4.C0652d;
import p131S4.AbstractC2314a;
import p131S4.AbstractC2315b;

/* renamed from: R4.b */
/* loaded from: classes2.dex */
public class C2261b implements C0652d.d {

    /* renamed from: a */
    public InterfaceC0407U f6880a;

    /* renamed from: b */
    public FirebaseFirestore f6881b;

    /* renamed from: c */
    public C3949c f6882c;

    /* renamed from: d */
    public EnumC0418c0 f6883d;

    /* renamed from: e */
    public C3950d.a f6884e;

    /* renamed from: f */
    public EnumC0406T f6885f;

    public C2261b(FirebaseFirestore firebaseFirestore, C3949c c3949c, Boolean bool, C3950d.a aVar, EnumC0406T enumC0406T) {
        this.f6881b = firebaseFirestore;
        this.f6882c = c3949c;
        this.f6883d = bool.booleanValue() ? EnumC0418c0.INCLUDE : EnumC0418c0.EXCLUDE;
        this.f6884e = aVar;
        this.f6885f = enumC0406T;
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        InterfaceC0407U interfaceC0407U = this.f6880a;
        if (interfaceC0407U != null) {
            interfaceC0407U.remove();
            this.f6880a = null;
        }
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, final C0652d.b bVar) {
        C0450s0.b bVar2 = new C0450s0.b();
        bVar2.m1670f(this.f6883d);
        bVar2.m1671g(this.f6885f);
        this.f6880a = this.f6882c.m15545j(bVar2.m1669e(), new InterfaceC0447r() { // from class: R4.a
            @Override // p046G3.InterfaceC0447r
            /* renamed from: a */
            public final void mo1589a(Object obj2, C3952f c3952f) {
                C2261b.this.m7694d(bVar, (C3950d) obj2, c3952f);
            }
        });
    }

    /* renamed from: d */
    public final /* synthetic */ void m7694d(C0652d.b bVar, C3950d c3950d, C3952f c3952f) {
        if (c3952f == null) {
            bVar.mo2629a(AbstractC2315b.m7841k(c3950d, this.f6884e).m7536e());
            return;
        }
        bVar.mo2630b("firebase_firestore", c3952f.getMessage(), AbstractC2314a.m7829a(c3952f));
        bVar.mo2631c();
        mo2635a(null);
    }
}

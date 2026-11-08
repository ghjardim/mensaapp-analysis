package com.google.firebase.firestore;

import com.google.firebase.firestore.C3950d;
import java.util.Map;
import p088M3.C1170l;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2157z;

/* renamed from: com.google.firebase.firestore.j */
/* loaded from: classes.dex */
public class C3956j extends C3950d {
    public C3956j(FirebaseFirestore firebaseFirestore, C1170l c1170l, InterfaceC1167i interfaceC1167i, boolean z6, boolean z7) {
        super(firebaseFirestore, c1170l, interfaceC1167i, z6, z7);
    }

    /* renamed from: h */
    public static C3956j m15658h(FirebaseFirestore firebaseFirestore, InterfaceC1167i interfaceC1167i, boolean z6, boolean z7) {
        return new C3956j(firebaseFirestore, interfaceC1167i.getKey(), interfaceC1167i, z6, z7);
    }

    @Override // com.google.firebase.firestore.C3950d
    /* renamed from: d */
    public Map mo15560d() {
        Map mo15560d = super.mo15560d();
        AbstractC2133b.m7217d(mo15560d != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return mo15560d;
    }

    @Override // com.google.firebase.firestore.C3950d
    /* renamed from: e */
    public Map mo15561e(C3950d.a aVar) {
        AbstractC2157z.m7330c(aVar, "Provided serverTimestampBehavior value must not be null.");
        Map mo15561e = super.mo15561e(aVar);
        AbstractC2133b.m7217d(mo15561e != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return mo15561e;
    }
}

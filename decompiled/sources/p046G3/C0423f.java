package p046G3;

import com.google.firebase.firestore.C3955i;
import com.google.firebase.firestore.FirebaseFirestore;
import p067J3.C0737c0;
import p088M3.C1179u;

/* renamed from: G3.f */
/* loaded from: classes.dex */
public class C0423f extends C3955i {
    public C0423f(C1179u c1179u, FirebaseFirestore firebaseFirestore) {
        super(C0737c0.m3090b(c1179u), firebaseFirestore);
        if (c1179u.m4471q() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + c1179u.mo4464g() + " has " + c1179u.m4471q());
    }
}

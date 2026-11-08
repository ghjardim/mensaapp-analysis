package com.google.firebase.firestore;

import android.util.SparseArray;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2157z;
import p219e3.C4183m;

/* renamed from: com.google.firebase.firestore.f */
/* loaded from: classes.dex */
public class C3952f extends C4183m {

    /* renamed from: a */
    public final a f12918a;

    /* renamed from: com.google.firebase.firestore.f$a */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: z */
        public static final SparseArray f12937z = m15584f();

        /* renamed from: a */
        public final int f12938a;

        a(int i7) {
            this.f12938a = i7;
        }

        /* renamed from: f */
        public static SparseArray m15584f() {
            SparseArray sparseArray = new SparseArray();
            for (a aVar : values()) {
                a aVar2 = (a) sparseArray.get(aVar.m15586h());
                if (aVar2 != null) {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
                sparseArray.put(aVar.m15586h(), aVar);
            }
            return sparseArray;
        }

        /* renamed from: g */
        public static a m15585g(int i7) {
            return (a) f12937z.get(i7, UNKNOWN);
        }

        /* renamed from: h */
        public int m15586h() {
            return this.f12938a;
        }
    }

    public C3952f(String str, a aVar) {
        super(str);
        AbstractC2157z.m7330c(str, "Provided message must not be null.");
        AbstractC2133b.m7217d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f12918a = (a) AbstractC2157z.m7330c(aVar, "Provided code must not be null.");
    }

    /* renamed from: a */
    public a m15582a() {
        return this.f12918a;
    }

    public C3952f(String str, a aVar, Throwable th) {
        super(str, th);
        AbstractC2157z.m7330c(str, "Provided message must not be null.");
        AbstractC2133b.m7217d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f12918a = (a) AbstractC2157z.m7330c(aVar, "Provided code must not be null.");
    }
}

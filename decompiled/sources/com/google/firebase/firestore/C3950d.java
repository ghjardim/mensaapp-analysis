package com.google.firebase.firestore;

import java.util.Map;
import p046G3.C0452t0;
import p088M3.C1170l;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2157z;

/* renamed from: com.google.firebase.firestore.d */
/* loaded from: classes.dex */
public class C3950d {

    /* renamed from: a */
    public final FirebaseFirestore f12904a;

    /* renamed from: b */
    public final C1170l f12905b;

    /* renamed from: c */
    public final InterfaceC1167i f12906c;

    /* renamed from: d */
    public final C0452t0 f12907d;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.firebase.firestore.d$a, still in use, count: 1, list:
      (r0v0 com.google.firebase.firestore.d$a) from 0x0024: SPUT (r0v0 com.google.firebase.firestore.d$a) (LINE:37) com.google.firebase.firestore.d.a.d com.google.firebase.firestore.d$a
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.google.firebase.firestore.d$a */
    public static final class a {
        NONE,
        ESTIMATE,
        PREVIOUS;


        /* renamed from: d */
        public static final a f12911d = new a();

        static {
        }

        public a() {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f12912e.clone();
        }
    }

    public C3950d(FirebaseFirestore firebaseFirestore, C1170l c1170l, InterfaceC1167i interfaceC1167i, boolean z6, boolean z7) {
        this.f12904a = (FirebaseFirestore) AbstractC2157z.m7329b(firebaseFirestore);
        this.f12905b = (C1170l) AbstractC2157z.m7329b(c1170l);
        this.f12906c = interfaceC1167i;
        this.f12907d = new C0452t0(z7, z6);
    }

    /* renamed from: b */
    public static C3950d m15557b(FirebaseFirestore firebaseFirestore, InterfaceC1167i interfaceC1167i, boolean z6, boolean z7) {
        return new C3950d(firebaseFirestore, interfaceC1167i.getKey(), interfaceC1167i, z6, z7);
    }

    /* renamed from: c */
    public static C3950d m15558c(FirebaseFirestore firebaseFirestore, C1170l c1170l, boolean z6) {
        return new C3950d(firebaseFirestore, c1170l, null, z6, false);
    }

    /* renamed from: a */
    public boolean m15559a() {
        return this.f12906c != null;
    }

    /* renamed from: d */
    public Map mo15560d() {
        return mo15561e(a.f12911d);
    }

    /* renamed from: e */
    public Map mo15561e(a aVar) {
        AbstractC2157z.m7330c(aVar, "Provided serverTimestampBehavior value must not be null.");
        C3959m c3959m = new C3959m(this.f12904a, aVar);
        InterfaceC1167i interfaceC1167i = this.f12906c;
        if (interfaceC1167i == null) {
            return null;
        }
        return c3959m.m15676b(interfaceC1167i.mo4480a().m4560k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3950d)) {
            return false;
        }
        C3950d c3950d = (C3950d) obj;
        if (this.f12904a.equals(c3950d.f12904a) && this.f12905b.equals(c3950d.f12905b) && this.f12907d.equals(c3950d.f12907d)) {
            InterfaceC1167i interfaceC1167i = this.f12906c;
            if (interfaceC1167i == null) {
                if (c3950d.f12906c == null) {
                    return true;
                }
            } else if (c3950d.f12906c != null && interfaceC1167i.mo4480a().equals(c3950d.f12906c.mo4480a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C0452t0 m15562f() {
        return this.f12907d;
    }

    /* renamed from: g */
    public C3949c m15563g() {
        return new C3949c(this.f12905b, this.f12904a);
    }

    public int hashCode() {
        int hashCode = ((this.f12904a.hashCode() * 31) + this.f12905b.hashCode()) * 31;
        InterfaceC1167i interfaceC1167i = this.f12906c;
        int hashCode2 = (hashCode + (interfaceC1167i != null ? interfaceC1167i.getKey().hashCode() : 0)) * 31;
        InterfaceC1167i interfaceC1167i2 = this.f12906c;
        return ((hashCode2 + (interfaceC1167i2 != null ? interfaceC1167i2.mo4480a().hashCode() : 0)) * 31) + this.f12907d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.f12905b + ", metadata=" + this.f12907d + ", doc=" + this.f12906c + '}';
    }
}

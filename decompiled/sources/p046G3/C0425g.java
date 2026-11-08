package p046G3;

import com.google.firebase.firestore.C3956j;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.List;
import p067J3.C0756m;
import p067J3.C0783z0;
import p088M3.C1172n;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;

/* renamed from: G3.g */
/* loaded from: classes.dex */
public class C0425g {

    /* renamed from: a */
    public final b f1553a;

    /* renamed from: b */
    public final C3956j f1554b;

    /* renamed from: c */
    public final int f1555c;

    /* renamed from: d */
    public final int f1556d;

    /* renamed from: G3.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1557a;

        static {
            int[] iArr = new int[C0756m.a.values().length];
            f1557a = iArr;
            try {
                iArr[C0756m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1557a[C0756m.a.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1557a[C0756m.a.MODIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1557a[C0756m.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: G3.g$b */
    public enum b {
        ADDED,
        MODIFIED,
        REMOVED
    }

    public C0425g(C3956j c3956j, b bVar, int i7, int i8) {
        this.f1553a = bVar;
        this.f1554b = c3956j;
        this.f1555c = i7;
        this.f1556d = i8;
    }

    /* renamed from: a */
    public static List m1639a(FirebaseFirestore firebaseFirestore, EnumC0418c0 enumC0418c0, C0783z0 c0783z0) {
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        if (c0783z0.m3336g().isEmpty()) {
            InterfaceC1167i interfaceC1167i = null;
            int i9 = 0;
            for (C0756m c0756m : c0783z0.m3333d()) {
                InterfaceC1167i m3251b = c0756m.m3251b();
                C3956j m15658h = C3956j.m15658h(firebaseFirestore, m3251b, c0783z0.m3340k(), c0783z0.m3335f().contains(m3251b.getKey()));
                AbstractC2133b.m7217d(c0756m.m3252c() == C0756m.a.ADDED, "Invalid added event for first snapshot", new Object[0]);
                AbstractC2133b.m7217d(interfaceC1167i == null || c0783z0.m3337h().m3097c().compare(interfaceC1167i, m3251b) < 0, "Got added events in wrong order", new Object[0]);
                arrayList.add(new C0425g(m15658h, b.ADDED, -1, i9));
                interfaceC1167i = m3251b;
                i9++;
            }
        } else {
            C1172n m3336g = c0783z0.m3336g();
            for (C0756m c0756m2 : c0783z0.m3333d()) {
                if (enumC0418c0 != EnumC0418c0.EXCLUDE || c0756m2.m3252c() != C0756m.a.METADATA) {
                    InterfaceC1167i m3251b2 = c0756m2.m3251b();
                    C3956j m15658h2 = C3956j.m15658h(firebaseFirestore, m3251b2, c0783z0.m3340k(), c0783z0.m3335f().contains(m3251b2.getKey()));
                    b m1640f = m1640f(c0756m2);
                    if (m1640f != b.ADDED) {
                        i7 = m3336g.m4514i(m3251b2.getKey());
                        AbstractC2133b.m7217d(i7 >= 0, "Index for document not found", new Object[0]);
                        m3336g = m3336g.m4515l(m3251b2.getKey());
                    } else {
                        i7 = -1;
                    }
                    if (m1640f != b.REMOVED) {
                        m3336g = m3336g.m4510b(m3251b2);
                        i8 = m3336g.m4514i(m3251b2.getKey());
                        AbstractC2133b.m7217d(i8 >= 0, "Index for document not found", new Object[0]);
                    } else {
                        i8 = -1;
                    }
                    arrayList.add(new C0425g(m15658h2, m1640f, i7, i8));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static b m1640f(C0756m c0756m) {
        int i7 = a.f1557a[c0756m.m3252c().ordinal()];
        if (i7 == 1) {
            return b.ADDED;
        }
        if (i7 == 2 || i7 == 3) {
            return b.MODIFIED;
        }
        if (i7 == 4) {
            return b.REMOVED;
        }
        throw new IllegalArgumentException("Unknown view change type: " + c0756m.m3252c());
    }

    /* renamed from: b */
    public C3956j m1641b() {
        return this.f1554b;
    }

    /* renamed from: c */
    public int m1642c() {
        return this.f1556d;
    }

    /* renamed from: d */
    public int m1643d() {
        return this.f1555c;
    }

    /* renamed from: e */
    public b m1644e() {
        return this.f1553a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0425g)) {
            return false;
        }
        C0425g c0425g = (C0425g) obj;
        return this.f1553a.equals(c0425g.f1553a) && this.f1554b.equals(c0425g.f1554b) && this.f1555c == c0425g.f1555c && this.f1556d == c0425g.f1556d;
    }

    public int hashCode() {
        return (((((this.f1553a.hashCode() * 31) + this.f1554b.hashCode()) * 31) + this.f1555c) * 31) + this.f1556d;
    }
}

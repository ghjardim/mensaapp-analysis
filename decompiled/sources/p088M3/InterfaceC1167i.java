package p088M3;

import java.util.Comparator;
import p272k4.C5413D;

/* renamed from: M3.i */
/* loaded from: classes.dex */
public interface InterfaceC1167i {

    /* renamed from: a */
    public static final Comparator f3757a = new Comparator() { // from class: M3.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareTo;
            compareTo = ((InterfaceC1167i) obj).getKey().compareTo(((InterfaceC1167i) obj2).getKey());
            return compareTo;
        }
    };

    /* renamed from: a */
    C1178t mo4480a();

    /* renamed from: b */
    C1177s mo4481b();

    /* renamed from: c */
    boolean mo4482c();

    /* renamed from: d */
    boolean mo4483d();

    /* renamed from: e */
    boolean mo4484e();

    /* renamed from: f */
    C5413D mo4485f(C1176r c1176r);

    /* renamed from: g */
    boolean mo4486g();

    C1170l getKey();

    /* renamed from: h */
    C1181w mo4487h();

    /* renamed from: i */
    boolean mo4488i();

    /* renamed from: j */
    boolean mo4489j();

    /* renamed from: k */
    C1181w mo4490k();
}

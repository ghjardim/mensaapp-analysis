package p264j5;

import java.util.ArrayList;
import java.util.List;
import p171Y2.AbstractC2932o;
import p206c6.C3619g;
import p237g5.AbstractC4412M;
import p237g5.C4424Z;
import p253i5.AbstractC4580S;
import p253i5.AbstractC4583T0;
import p281l5.C5542d;

/* renamed from: j5.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5375d {

    /* renamed from: a */
    public static final C5542d f19026a;

    /* renamed from: b */
    public static final C5542d f19027b;

    /* renamed from: c */
    public static final C5542d f19028c;

    /* renamed from: d */
    public static final C5542d f19029d;

    /* renamed from: e */
    public static final C5542d f19030e;

    /* renamed from: f */
    public static final C5542d f19031f;

    static {
        C3619g c3619g = C5542d.f19972g;
        f19026a = new C5542d(c3619g, "https");
        f19027b = new C5542d(c3619g, "http");
        C3619g c3619g2 = C5542d.f19970e;
        f19028c = new C5542d(c3619g2, "POST");
        f19029d = new C5542d(c3619g2, "GET");
        f19030e = new C5542d(AbstractC4580S.f16578j.m18808d(), "application/grpc");
        f19031f = new C5542d("te", "trailers");
    }

    /* renamed from: a */
    public static List m22125a(List list, C4424Z c4424z) {
        byte[][] m19664d = AbstractC4583T0.m19664d(c4424z);
        for (int i7 = 0; i7 < m19664d.length; i7 += 2) {
            C3619g m14641w = C3619g.m14641w(m19664d[i7]);
            if (m14641w.size() != 0 && m14641w.m14647i(0) != 58) {
                list.add(new C5542d(m14641w, C3619g.m14641w(m19664d[i7 + 1])));
            }
        }
        return list;
    }

    /* renamed from: b */
    public static List m22126b(C4424Z c4424z, String str, String str2, String str3, boolean z6, boolean z7) {
        AbstractC2932o.m10573p(c4424z, "headers");
        AbstractC2932o.m10573p(str, "defaultPath");
        AbstractC2932o.m10573p(str2, "authority");
        m22127c(c4424z);
        ArrayList arrayList = new ArrayList(AbstractC4412M.m18671a(c4424z) + 7);
        if (z7) {
            arrayList.add(f19027b);
        } else {
            arrayList.add(f19026a);
        }
        if (z6) {
            arrayList.add(f19029d);
        } else {
            arrayList.add(f19028c);
        }
        arrayList.add(new C5542d(C5542d.f19973h, str2));
        arrayList.add(new C5542d(C5542d.f19971f, str));
        arrayList.add(new C5542d(AbstractC4580S.f16580l.m18808d(), str3));
        arrayList.add(f19030e);
        arrayList.add(f19031f);
        return m22125a(arrayList, c4424z);
    }

    /* renamed from: c */
    public static void m22127c(C4424Z c4424z) {
        c4424z.m18777e(AbstractC4580S.f16578j);
        c4424z.m18777e(AbstractC4580S.f16579k);
        c4424z.m18777e(AbstractC4580S.f16580l);
    }
}

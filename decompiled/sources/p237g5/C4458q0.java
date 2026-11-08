package p237g5;

import java.util.logging.Level;
import java.util.logging.Logger;
import p237g5.C4459r;

/* renamed from: g5.q0 */
/* loaded from: classes2.dex */
public final class C4458q0 extends C4459r.c {

    /* renamed from: a */
    public static final Logger f15879a = Logger.getLogger(C4458q0.class.getName());

    /* renamed from: b */
    public static final ThreadLocal f15880b = new ThreadLocal();

    @Override // p237g5.C4459r.c
    /* renamed from: a */
    public C4459r mo19000a() {
        C4459r c4459r = (C4459r) f15880b.get();
        return c4459r == null ? C4459r.f15882c : c4459r;
    }

    @Override // p237g5.C4459r.c
    /* renamed from: b */
    public void mo19001b(C4459r c4459r, C4459r c4459r2) {
        if (mo19000a() != c4459r) {
            f15879a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c4459r2 != C4459r.f15882c) {
            f15880b.set(c4459r2);
        } else {
            f15880b.set(null);
        }
    }

    @Override // p237g5.C4459r.c
    /* renamed from: c */
    public C4459r mo19002c(C4459r c4459r) {
        C4459r mo19000a = mo19000a();
        f15880b.set(c4459r);
        return mo19000a;
    }
}

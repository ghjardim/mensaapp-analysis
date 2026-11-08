package p343t0;

import android.util.SparseArray;
import p259j0.C5322E;

/* renamed from: t0.v */
/* loaded from: classes.dex */
public final class C6428v {

    /* renamed from: a */
    public final SparseArray f23320a = new SparseArray();

    /* renamed from: a */
    public C5322E m26910a(int i7) {
        C5322E c5322e = (C5322E) this.f23320a.get(i7);
        if (c5322e != null) {
            return c5322e;
        }
        C5322E c5322e2 = new C5322E(9223372036854775806L);
        this.f23320a.put(i7, c5322e2);
        return c5322e2;
    }

    /* renamed from: b */
    public void m26911b() {
        this.f23320a.clear();
    }
}

package p108P2;

import android.os.Bundle;

/* renamed from: P2.O2 */
/* loaded from: classes.dex */
public final class C1566O2 {

    /* renamed from: a */
    public final String f4854a;

    /* renamed from: b */
    public final String f4855b;

    /* renamed from: c */
    public final long f4856c;

    /* renamed from: d */
    public final Bundle f4857d;

    public C1566O2(String str, String str2, Bundle bundle, long j7) {
        this.f4854a = str;
        this.f4855b = str2;
        this.f4857d = bundle;
        this.f4856c = j7;
    }

    /* renamed from: b */
    public static C1566O2 m5945b(C1519J c1519j) {
        return new C1566O2(c1519j.f4758a, c1519j.f4760c, c1519j.f4759b.m5769z0(), c1519j.f4761d);
    }

    /* renamed from: a */
    public final C1519J m5946a() {
        return new C1519J(this.f4854a, new C1501H(new Bundle(this.f4857d)), this.f4855b, this.f4856c);
    }

    public final String toString() {
        return "origin=" + this.f4855b + ",name=" + this.f4854a + ",params=" + this.f4857d.toString();
    }
}

package p108P2;

import android.os.Bundle;

/* renamed from: P2.Q4 */
/* loaded from: classes.dex */
public final class RunnableC1584Q4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4891a;

    /* renamed from: b */
    public final /* synthetic */ String f4892b;

    /* renamed from: c */
    public final /* synthetic */ long f4893c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f4894d;

    /* renamed from: e */
    public final /* synthetic */ boolean f4895e;

    /* renamed from: f */
    public final /* synthetic */ boolean f4896f;

    /* renamed from: n */
    public final /* synthetic */ boolean f4897n;

    /* renamed from: o */
    public final /* synthetic */ String f4898o;

    /* renamed from: p */
    public final /* synthetic */ C1799p5 f4899p;

    public RunnableC1584Q4(C1799p5 c1799p5, String str, String str2, long j7, Bundle bundle, boolean z6, boolean z7, boolean z8, String str3) {
        this.f4891a = str;
        this.f4892b = str2;
        this.f4893c = j7;
        this.f4894d = bundle;
        this.f4895e = z6;
        this.f4896f = z7;
        this.f4897n = z8;
        this.f4898o = str3;
        this.f4899p = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4899p.m6187H(this.f4891a, this.f4892b, this.f4893c, this.f4894d, this.f4895e, this.f4896f, this.f4897n, this.f4898o);
    }
}

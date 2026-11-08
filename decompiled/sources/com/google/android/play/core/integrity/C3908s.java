package com.google.android.play.core.integrity;

import android.content.Context;
import p157W2.C2685k;
import p157W2.C2687m;
import p157W2.InterfaceC2686l;
import p157W2.InterfaceC2689o;

/* renamed from: com.google.android.play.core.integrity.s */
/* loaded from: classes.dex */
final class C3908s {

    /* renamed from: a */
    private final C3908s f12753a = this;

    /* renamed from: b */
    private final InterfaceC2689o f12754b;

    /* renamed from: c */
    private final InterfaceC2689o f12755c;

    /* renamed from: d */
    private final InterfaceC2689o f12756d;

    /* renamed from: e */
    private final InterfaceC2689o f12757e;

    /* renamed from: f */
    private final InterfaceC2689o f12758f;

    public /* synthetic */ C3908s(Context context, C3907r c3907r) {
        C3844ad c3844ad;
        C3900m c3900m;
        C3900m c3900m2;
        InterfaceC2686l m9183b = C2687m.m9183b(context);
        this.f12754b = m9183b;
        c3844ad = C3843ac.f12644a;
        InterfaceC2689o m9181b = C2685k.m9181b(c3844ad);
        this.f12755c = m9181b;
        c3900m = C3899l.f12746a;
        C3861au c3861au = new C3861au(m9183b, c3900m);
        this.f12756d = c3861au;
        c3900m2 = C3899l.f12746a;
        InterfaceC2689o m9181b2 = C2685k.m9181b(new C3852al(m9183b, m9181b, c3861au, c3900m2));
        this.f12757e = m9181b2;
        this.f12758f = C2685k.m9181b(new C3842ab(m9181b2));
    }

    /* renamed from: a */
    public final IntegrityManager m15252a() {
        return (IntegrityManager) this.f12758f.mo9182a();
    }
}

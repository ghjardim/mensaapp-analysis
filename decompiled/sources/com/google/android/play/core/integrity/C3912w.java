package com.google.android.play.core.integrity;

import android.content.Context;
import p157W2.C2685k;
import p157W2.C2687m;
import p157W2.InterfaceC2686l;
import p157W2.InterfaceC2689o;

/* renamed from: com.google.android.play.core.integrity.w */
/* loaded from: classes.dex */
final class C3912w implements InterfaceC3863aw {

    /* renamed from: a */
    private final C3912w f12760a = this;

    /* renamed from: b */
    private final InterfaceC2689o f12761b;

    /* renamed from: c */
    private final InterfaceC2689o f12762c;

    /* renamed from: d */
    private final InterfaceC2689o f12763d;

    /* renamed from: e */
    private final InterfaceC2689o f12764e;

    /* renamed from: f */
    private final InterfaceC2689o f12765f;

    /* renamed from: g */
    private final InterfaceC2689o f12766g;

    public /* synthetic */ C3912w(Context context, C3911v c3911v) {
        C3870bc c3870bc;
        C3904o c3904o;
        C3904o c3904o2;
        InterfaceC2686l m9183b = C2687m.m9183b(context);
        this.f12761b = m9183b;
        c3870bc = C3869bb.f12697a;
        InterfaceC2689o m9181b = C2685k.m9181b(c3870bc);
        this.f12762c = m9181b;
        c3904o = C3903n.f12751a;
        C3861au c3861au = new C3861au(m9183b, c3904o);
        this.f12763d = c3861au;
        c3904o2 = C3903n.f12751a;
        InterfaceC2689o m9181b2 = C2685k.m9181b(new C3883bp(m9183b, m9181b, c3861au, c3904o2));
        this.f12764e = m9181b2;
        InterfaceC2689o m9181b3 = C2685k.m9181b(new C3888bu(m9181b2));
        this.f12765f = m9181b3;
        this.f12766g = C2685k.m9181b(new C3868ba(m9181b2, m9181b3));
    }

    @Override // com.google.android.play.core.integrity.InterfaceC3863aw
    /* renamed from: a */
    public final StandardIntegrityManager mo15224a() {
        return (StandardIntegrityManager) this.f12766g.mo9182a();
    }
}

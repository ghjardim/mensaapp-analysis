package p177Z1;

import android.content.Context;
import p185a2.InterfaceC3103b;
import p364v5.InterfaceC6784a;

/* renamed from: Z1.l */
/* loaded from: classes.dex */
public final class C2985l implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f9153a;

    /* renamed from: b */
    public final InterfaceC6784a f9154b;

    public C2985l(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2) {
        this.f9153a = interfaceC6784a;
        this.f9154b = interfaceC6784a2;
    }

    /* renamed from: a */
    public static C2985l m10745a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2) {
        return new C2985l(interfaceC6784a, interfaceC6784a2);
    }

    /* renamed from: c */
    public static C2984k m10746c(Context context, Object obj) {
        return new C2984k(context, (C2982i) obj);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2984k get() {
        return m10746c((Context) this.f9153a.get(), this.f9154b.get());
    }
}

package p177Z1;

import android.content.Context;
import p185a2.InterfaceC3103b;
import p250i2.InterfaceC4534a;
import p364v5.InterfaceC6784a;

/* renamed from: Z1.j */
/* loaded from: classes.dex */
public final class C2983j implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f9145a;

    /* renamed from: b */
    public final InterfaceC6784a f9146b;

    /* renamed from: c */
    public final InterfaceC6784a f9147c;

    public C2983j(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3) {
        this.f9145a = interfaceC6784a;
        this.f9146b = interfaceC6784a2;
        this.f9147c = interfaceC6784a3;
    }

    /* renamed from: a */
    public static C2983j m10738a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3) {
        return new C2983j(interfaceC6784a, interfaceC6784a2, interfaceC6784a3);
    }

    /* renamed from: c */
    public static C2982i m10739c(Context context, InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2) {
        return new C2982i(context, interfaceC4534a, interfaceC4534a2);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2982i get() {
        return m10739c((Context) this.f9145a.get(), (InterfaceC4534a) this.f9146b.get(), (InterfaceC4534a) this.f9147c.get());
    }
}

package p218e2;

import android.content.Context;
import p185a2.AbstractC3105d;
import p185a2.InterfaceC3103b;
import p226f2.AbstractC4254f;
import p226f2.InterfaceC4272x;
import p234g2.InterfaceC4371d;
import p250i2.InterfaceC4534a;
import p364v5.InterfaceC6784a;

/* renamed from: e2.i */
/* loaded from: classes.dex */
public final class C4170i implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f13986a;

    /* renamed from: b */
    public final InterfaceC6784a f13987b;

    /* renamed from: c */
    public final InterfaceC6784a f13988c;

    /* renamed from: d */
    public final InterfaceC6784a f13989d;

    public C4170i(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4) {
        this.f13986a = interfaceC6784a;
        this.f13987b = interfaceC6784a2;
        this.f13988c = interfaceC6784a3;
        this.f13989d = interfaceC6784a4;
    }

    /* renamed from: a */
    public static C4170i m17501a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4) {
        return new C4170i(interfaceC6784a, interfaceC6784a2, interfaceC6784a3, interfaceC6784a4);
    }

    /* renamed from: c */
    public static InterfaceC4272x m17502c(Context context, InterfaceC4371d interfaceC4371d, AbstractC4254f abstractC4254f, InterfaceC4534a interfaceC4534a) {
        return (InterfaceC4272x) AbstractC3105d.m11328c(AbstractC4169h.m17500a(context, interfaceC4371d, abstractC4254f, interfaceC4534a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4272x get() {
        return m17502c((Context) this.f13986a.get(), (InterfaceC4371d) this.f13987b.get(), (AbstractC4254f) this.f13988c.get(), (InterfaceC4534a) this.f13989d.get());
    }
}

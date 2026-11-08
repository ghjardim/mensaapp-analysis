package p226f2;

import android.content.Context;
import java.util.concurrent.Executor;
import p177Z1.InterfaceC2978e;
import p185a2.InterfaceC3103b;
import p234g2.InterfaceC4370c;
import p234g2.InterfaceC4371d;
import p242h2.InterfaceC4484b;
import p250i2.InterfaceC4534a;
import p364v5.InterfaceC6784a;

/* renamed from: f2.s */
/* loaded from: classes.dex */
public final class C4267s implements InterfaceC3103b {

    /* renamed from: a */
    public final InterfaceC6784a f14692a;

    /* renamed from: b */
    public final InterfaceC6784a f14693b;

    /* renamed from: c */
    public final InterfaceC6784a f14694c;

    /* renamed from: d */
    public final InterfaceC6784a f14695d;

    /* renamed from: e */
    public final InterfaceC6784a f14696e;

    /* renamed from: f */
    public final InterfaceC6784a f14697f;

    /* renamed from: g */
    public final InterfaceC6784a f14698g;

    /* renamed from: h */
    public final InterfaceC6784a f14699h;

    /* renamed from: i */
    public final InterfaceC6784a f14700i;

    public C4267s(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4, InterfaceC6784a interfaceC6784a5, InterfaceC6784a interfaceC6784a6, InterfaceC6784a interfaceC6784a7, InterfaceC6784a interfaceC6784a8, InterfaceC6784a interfaceC6784a9) {
        this.f14692a = interfaceC6784a;
        this.f14693b = interfaceC6784a2;
        this.f14694c = interfaceC6784a3;
        this.f14695d = interfaceC6784a4;
        this.f14696e = interfaceC6784a5;
        this.f14697f = interfaceC6784a6;
        this.f14698g = interfaceC6784a7;
        this.f14699h = interfaceC6784a8;
        this.f14700i = interfaceC6784a9;
    }

    /* renamed from: a */
    public static C4267s m17883a(InterfaceC6784a interfaceC6784a, InterfaceC6784a interfaceC6784a2, InterfaceC6784a interfaceC6784a3, InterfaceC6784a interfaceC6784a4, InterfaceC6784a interfaceC6784a5, InterfaceC6784a interfaceC6784a6, InterfaceC6784a interfaceC6784a7, InterfaceC6784a interfaceC6784a8, InterfaceC6784a interfaceC6784a9) {
        return new C4267s(interfaceC6784a, interfaceC6784a2, interfaceC6784a3, interfaceC6784a4, interfaceC6784a5, interfaceC6784a6, interfaceC6784a7, interfaceC6784a8, interfaceC6784a9);
    }

    /* renamed from: c */
    public static C4266r m17884c(Context context, InterfaceC2978e interfaceC2978e, InterfaceC4371d interfaceC4371d, InterfaceC4272x interfaceC4272x, Executor executor, InterfaceC4484b interfaceC4484b, InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2, InterfaceC4370c interfaceC4370c) {
        return new C4266r(context, interfaceC2978e, interfaceC4371d, interfaceC4272x, executor, interfaceC4484b, interfaceC4534a, interfaceC4534a2, interfaceC4370c);
    }

    @Override // p364v5.InterfaceC6784a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4266r get() {
        return m17884c((Context) this.f14692a.get(), (InterfaceC2978e) this.f14693b.get(), (InterfaceC4371d) this.f14694c.get(), (InterfaceC4272x) this.f14695d.get(), (Executor) this.f14696e.get(), (InterfaceC4484b) this.f14697f.get(), (InterfaceC4534a) this.f14698g.get(), (InterfaceC4534a) this.f14699h.get(), (InterfaceC4370c) this.f14700i.get());
    }
}

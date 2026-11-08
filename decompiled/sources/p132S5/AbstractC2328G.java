package p132S5;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p167X5.AbstractC2870o;
import p167X5.C2866k;
import p167X5.C2869n;
import p392z5.AbstractC7153a;
import p392z5.AbstractC7154b;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7158f;
import p392z5.InterfaceC7161i;

/* renamed from: S5.G */
/* loaded from: classes2.dex */
public abstract class AbstractC2328G extends AbstractC7153a implements InterfaceC7158f {

    /* renamed from: b */
    public static final a f7063b = new a(null);

    /* renamed from: S5.G$a */
    public static final class a extends AbstractC7154b {

        /* renamed from: S5.G$a$a, reason: collision with other inner class name */
        public static final class C7185a extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public static final C7185a f7064a = new C7185a();

            public C7185a() {
                super(1);
            }

            @Override // p069J5.InterfaceC0800l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC2328G invoke(InterfaceC7161i.b bVar) {
                if (bVar instanceof AbstractC2328G) {
                    return (AbstractC2328G) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
            super(InterfaceC7158f.f25437m, C7185a.f7064a);
        }
    }

    public AbstractC2328G() {
        super(InterfaceC7158f.f25437m);
    }

    /* renamed from: D */
    public abstract void mo7983D(InterfaceC7161i interfaceC7161i, Runnable runnable);

    /* renamed from: F */
    public boolean mo7984F(InterfaceC7161i interfaceC7161i) {
        return true;
    }

    /* renamed from: G */
    public AbstractC2328G mo7985G(int i7) {
        AbstractC2870o.m10346a(i7);
        return new C2869n(this, i7);
    }

    @Override // p392z5.AbstractC7153a, p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public InterfaceC7161i.b get(InterfaceC7161i.c cVar) {
        return InterfaceC7158f.a.m29470a(this, cVar);
    }

    @Override // p392z5.InterfaceC7158f
    /* renamed from: j */
    public final void mo7986j(InterfaceC7157e interfaceC7157e) {
        AbstractC5469l.m23026c(interfaceC7157e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C2866k) interfaceC7157e).m10333s();
    }

    @Override // p392z5.InterfaceC7158f
    /* renamed from: m */
    public final InterfaceC7157e mo7987m(InterfaceC7157e interfaceC7157e) {
        return new C2866k(this, interfaceC7157e);
    }

    @Override // p392z5.AbstractC7153a, p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public InterfaceC7161i minusKey(InterfaceC7161i.c cVar) {
        return InterfaceC7158f.a.m29471b(this, cVar);
    }

    public String toString() {
        return AbstractC2342N.m8004a(this) + '@' + AbstractC2342N.m8005b(this);
    }
}

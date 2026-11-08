package p160W5;

import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p132S5.AbstractC2326F;
import p146U5.EnumC2583a;
import p146U5.InterfaceC2600r;
import p153V5.InterfaceC2631d;
import p153V5.InterfaceC2632e;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7158f;
import p392z5.InterfaceC7161i;

/* renamed from: W5.g */
/* loaded from: classes2.dex */
public abstract class AbstractC2731g extends AbstractC2729e {

    /* renamed from: d */
    public final InterfaceC2631d f8061d;

    /* renamed from: W5.g$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f8062a;

        /* renamed from: b */
        public /* synthetic */ Object f8063b;

        public a(InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
            return ((a) create(interfaceC2632e, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            a aVar = AbstractC2731g.this.new a(interfaceC7157e);
            aVar.f8063b = obj;
            return aVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f8062a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                InterfaceC2632e interfaceC2632e = (InterfaceC2632e) this.f8063b;
                AbstractC2731g abstractC2731g = AbstractC2731g.this;
                this.f8062a = 1;
                if (abstractC2731g.mo9359n(interfaceC2632e, this) == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return C6934q.f24811a;
        }
    }

    public AbstractC2731g(InterfaceC2631d interfaceC2631d, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        super(interfaceC7161i, i7, enumC2583a);
        this.f8061d = interfaceC2631d;
    }

    /* renamed from: k */
    public static /* synthetic */ Object m9356k(AbstractC2731g abstractC2731g, InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
        if (abstractC2731g.f8052b == -3) {
            InterfaceC7161i context = interfaceC7157e.getContext();
            InterfaceC7161i m7977e = AbstractC2326F.m7977e(context, abstractC2731g.f8051a);
            if (AbstractC5469l.m23024a(m7977e, context)) {
                Object mo9359n = abstractC2731g.mo9359n(interfaceC2632e, interfaceC7157e);
                return mo9359n == AbstractC0024c.m76e() ? mo9359n : C6934q.f24811a;
            }
            InterfaceC7158f.b bVar = InterfaceC7158f.f25437m;
            if (AbstractC5469l.m23024a(m7977e.get(bVar), context.get(bVar))) {
                Object m9358m = abstractC2731g.m9358m(interfaceC2632e, m7977e, interfaceC7157e);
                return m9358m == AbstractC0024c.m76e() ? m9358m : C6934q.f24811a;
            }
        }
        Object mo7083a = super.mo7083a(interfaceC2632e, interfaceC7157e);
        return mo7083a == AbstractC0024c.m76e() ? mo7083a : C6934q.f24811a;
    }

    /* renamed from: l */
    public static /* synthetic */ Object m9357l(AbstractC2731g abstractC2731g, InterfaceC2600r interfaceC2600r, InterfaceC7157e interfaceC7157e) {
        Object mo9359n = abstractC2731g.mo9359n(new C2741q(interfaceC2600r), interfaceC7157e);
        return mo9359n == AbstractC0024c.m76e() ? mo9359n : C6934q.f24811a;
    }

    @Override // p160W5.AbstractC2729e, p153V5.InterfaceC2631d
    /* renamed from: a */
    public Object mo7083a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
        return m9356k(this, interfaceC2632e, interfaceC7157e);
    }

    @Override // p160W5.AbstractC2729e
    /* renamed from: f */
    public Object mo9049f(InterfaceC2600r interfaceC2600r, InterfaceC7157e interfaceC7157e) {
        return m9357l(this, interfaceC2600r, interfaceC7157e);
    }

    /* renamed from: m */
    public final Object m9358m(InterfaceC2632e interfaceC2632e, InterfaceC7161i interfaceC7161i, InterfaceC7157e interfaceC7157e) {
        InterfaceC2632e m9355d;
        m9355d = AbstractC2730f.m9355d(interfaceC2632e, interfaceC7157e.getContext());
        return AbstractC2730f.m9354c(interfaceC7161i, m9355d, null, new a(null), interfaceC7157e, 4, null);
    }

    /* renamed from: n */
    public abstract Object mo9359n(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e);

    @Override // p160W5.AbstractC2729e
    public String toString() {
        return this.f8061d + " -> " + super.toString();
    }
}

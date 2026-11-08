package p140U;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p112Q.InterfaceC1987h;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: U.i */
/* loaded from: classes.dex */
public abstract class AbstractC2497i {

    /* renamed from: U.i$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f7332a;

        /* renamed from: b */
        public /* synthetic */ Object f7333b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC0804p f7334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f7334c = interfaceC0804p;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC2494f abstractC2494f, InterfaceC7157e interfaceC7157e) {
            return ((a) create(abstractC2494f, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            a aVar = new a(this.f7334c, interfaceC7157e);
            aVar.f7333b = obj;
            return aVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f7332a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2491c c2491c = (C2491c) this.f7333b;
                AbstractC6928k.m28382b(obj);
                return c2491c;
            }
            AbstractC6928k.m28382b(obj);
            C2491c m8437c = ((AbstractC2494f) this.f7333b).m8437c();
            InterfaceC0804p interfaceC0804p = this.f7334c;
            this.f7333b = m8437c;
            this.f7332a = 1;
            return interfaceC0804p.invoke(m8437c, this) == m76e ? m76e : m8437c;
        }
    }

    /* renamed from: a */
    public static final Object m8450a(InterfaceC1987h interfaceC1987h, InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
        return interfaceC1987h.mo7043b(new a(interfaceC0804p, null), interfaceC7157e);
    }
}

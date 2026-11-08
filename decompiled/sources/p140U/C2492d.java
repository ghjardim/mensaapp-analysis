package p140U;

import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p112Q.InterfaceC1987h;
import p153V5.InterfaceC2631d;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: U.d */
/* loaded from: classes.dex */
public final class C2492d implements InterfaceC1987h {

    /* renamed from: a */
    public final InterfaceC1987h f7325a;

    /* renamed from: U.d$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f7326a;

        /* renamed from: b */
        public /* synthetic */ Object f7327b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC0804p f7328c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f7328c = interfaceC0804p;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC2494f abstractC2494f, InterfaceC7157e interfaceC7157e) {
            return ((a) create(abstractC2494f, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            a aVar = new a(this.f7328c, interfaceC7157e);
            aVar.f7327b = obj;
            return aVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f7326a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                AbstractC2494f abstractC2494f = (AbstractC2494f) this.f7327b;
                InterfaceC0804p interfaceC0804p = this.f7328c;
                this.f7326a = 1;
                obj = interfaceC0804p.invoke(abstractC2494f, this);
                if (obj == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            AbstractC2494f abstractC2494f2 = (AbstractC2494f) obj;
            AbstractC5469l.m23026c(abstractC2494f2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((C2491c) abstractC2494f2).m8427g();
            return abstractC2494f2;
        }
    }

    public C2492d(InterfaceC1987h delegate) {
        AbstractC5469l.m23028e(delegate, "delegate");
        this.f7325a = delegate;
    }

    @Override // p112Q.InterfaceC1987h
    /* renamed from: a */
    public InterfaceC2631d mo7042a() {
        return this.f7325a.mo7042a();
    }

    @Override // p112Q.InterfaceC1987h
    /* renamed from: b */
    public Object mo7043b(InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
        return this.f7325a.mo7043b(new a(interfaceC0804p, null), interfaceC7157e);
    }
}

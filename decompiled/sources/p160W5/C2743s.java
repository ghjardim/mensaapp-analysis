package p160W5;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0804p;
import p153V5.InterfaceC2632e;
import p167X5.AbstractC2850K;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: W5.s */
/* loaded from: classes2.dex */
public final class C2743s implements InterfaceC2632e {

    /* renamed from: a */
    public final InterfaceC7161i f8084a;

    /* renamed from: b */
    public final Object f8085b;

    /* renamed from: c */
    public final InterfaceC0804p f8086c;

    /* renamed from: W5.s$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f8087a;

        /* renamed from: b */
        public /* synthetic */ Object f8088b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC2632e f8089c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2632e interfaceC2632e, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f8089c = interfaceC2632e;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC7157e interfaceC7157e) {
            return ((a) create(obj, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            a aVar = new a(this.f8089c, interfaceC7157e);
            aVar.f8088b = obj;
            return aVar;
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f8087a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                Object obj2 = this.f8088b;
                InterfaceC2632e interfaceC2632e = this.f8089c;
                this.f8087a = 1;
                if (interfaceC2632e.mo2989e(obj2, this) == m76e) {
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

    public C2743s(InterfaceC2632e interfaceC2632e, InterfaceC7161i interfaceC7161i) {
        this.f8084a = interfaceC7161i;
        this.f8085b = AbstractC2850K.m10279b(interfaceC7161i);
        this.f8086c = new a(interfaceC2632e, null);
    }

    @Override // p153V5.InterfaceC2632e
    /* renamed from: e */
    public Object mo2989e(Object obj, InterfaceC7157e interfaceC7157e) {
        Object m9353b = AbstractC2730f.m9353b(this.f8084a, obj, this.f8085b, this.f8086c, interfaceC7157e);
        return m9353b == AbstractC0024c.m76e() ? m9353b : C6934q.f24811a;
    }
}

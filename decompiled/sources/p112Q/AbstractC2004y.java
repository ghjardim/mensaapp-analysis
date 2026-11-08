package p112Q;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p069J5.InterfaceC0805q;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: Q.y */
/* loaded from: classes.dex */
public abstract class AbstractC2004y {

    /* renamed from: Q.y$a */
    public static final class a extends AbstractC0068l implements InterfaceC0805q {

        /* renamed from: a */
        public int f6196a;

        /* renamed from: b */
        public /* synthetic */ Object f6197b;

        public a(InterfaceC7157e interfaceC7157e) {
            super(3, interfaceC7157e);
        }

        /* renamed from: a */
        public final Object m7132a(InterfaceC1997r interfaceC1997r, boolean z6, InterfaceC7157e interfaceC7157e) {
            a aVar = new a(interfaceC7157e);
            aVar.f6197b = interfaceC1997r;
            return aVar.invokeSuspend(C6934q.f24811a);
        }

        @Override // p069J5.InterfaceC0805q
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo3350c(Object obj, Object obj2, Object obj3) {
            return m7132a((InterfaceC1997r) obj, ((Boolean) obj2).booleanValue(), (InterfaceC7157e) obj3);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            Object m76e = AbstractC0024c.m76e();
            int i7 = this.f6196a;
            if (i7 == 0) {
                AbstractC6928k.m28382b(obj);
                InterfaceC1997r interfaceC1997r = (InterfaceC1997r) this.f6197b;
                this.f6196a = 1;
                obj = interfaceC1997r.mo7115c(this);
                if (obj == m76e) {
                    return m76e;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC6928k.m28382b(obj);
            }
            return obj;
        }
    }

    /* renamed from: a */
    public static final Object m7131a(InterfaceC2003x interfaceC2003x, InterfaceC7157e interfaceC7157e) {
        return interfaceC2003x.mo7128a(new a(null), interfaceC7157e);
    }
}

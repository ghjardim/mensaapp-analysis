package p160W5;

import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2409u0;
import p167X5.C2842C;
import p392z5.InterfaceC7161i;

/* renamed from: W5.p */
/* loaded from: classes2.dex */
public abstract class AbstractC2740p {

    /* renamed from: W5.p$a */
    public static final class a extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public final /* synthetic */ C2738n f8080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2738n c2738n) {
            super(2);
            this.f8080a = c2738n;
        }

        /* renamed from: a */
        public final Integer m9371a(int i7, InterfaceC7161i.b bVar) {
            InterfaceC7161i.c key = bVar.getKey();
            InterfaceC7161i.b bVar2 = this.f8080a.f8073b.get(key);
            if (key != InterfaceC2409u0.f7157j) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i7 + 1);
            }
            InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) bVar2;
            AbstractC5469l.m23026c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC2409u0 m9370b = AbstractC2740p.m9370b((InterfaceC2409u0) bVar, interfaceC2409u0);
            if (m9370b == interfaceC2409u0) {
                if (interfaceC2409u0 != null) {
                    i7++;
                }
                return Integer.valueOf(i7);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + m9370b + ", expected child of " + interfaceC2409u0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m9371a(((Number) obj).intValue(), (InterfaceC7161i.b) obj2);
        }
    }

    /* renamed from: a */
    public static final void m9369a(C2738n c2738n, InterfaceC7161i interfaceC7161i) {
        if (((Number) interfaceC7161i.fold(0, new a(c2738n))).intValue() == c2738n.f8074c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c2738n.f8073b + ",\n\t\tbut emission happened in " + interfaceC7161i + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final InterfaceC2409u0 m9370b(InterfaceC2409u0 interfaceC2409u0, InterfaceC2409u0 interfaceC2409u02) {
        while (interfaceC2409u0 != null) {
            if (interfaceC2409u0 == interfaceC2409u02) {
                return interfaceC2409u0;
            }
            if (!(interfaceC2409u0 instanceof C2842C)) {
                return interfaceC2409u0;
            }
            interfaceC2409u0 = interfaceC2409u0.getParent();
        }
        return null;
    }
}

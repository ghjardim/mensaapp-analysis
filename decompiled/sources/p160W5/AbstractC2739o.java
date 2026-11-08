package p160W5;

import kotlin.jvm.internal.AbstractC5457A;
import kotlin.jvm.internal.AbstractC5467j;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0805q;
import p153V5.InterfaceC2632e;
import p392z5.InterfaceC7157e;

/* renamed from: W5.o */
/* loaded from: classes2.dex */
public abstract class AbstractC2739o {

    /* renamed from: a */
    public static final InterfaceC0805q f8078a;

    /* renamed from: W5.o$a */
    public /* synthetic */ class a extends AbstractC5467j implements InterfaceC0805q {

        /* renamed from: a */
        public static final a f8079a = new a();

        public a() {
            super(3, InterfaceC2632e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p069J5.InterfaceC0805q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object mo3350c(InterfaceC2632e interfaceC2632e, Object obj, InterfaceC7157e interfaceC7157e) {
            return interfaceC2632e.mo2989e(obj, interfaceC7157e);
        }
    }

    static {
        a aVar = a.f8079a;
        AbstractC5469l.m23026c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f8078a = (InterfaceC0805q) AbstractC5457A.m23004b(aVar, 3);
    }
}

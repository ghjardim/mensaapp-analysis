package p367w1;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p132S5.InterfaceC2348Q;
import p211d3.InterfaceFutureC4115e;
import p350u.AbstractC6582c;
import p371w5.C6934q;

/* renamed from: w1.b */
/* loaded from: classes.dex */
public abstract class AbstractC6842b {

    /* renamed from: w1.b$a */
    public static final class a extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public final /* synthetic */ AbstractC6582c.a f24638a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC2348Q f24639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC6582c.a aVar, InterfaceC2348Q interfaceC2348Q) {
            super(1);
            this.f24638a = aVar;
            this.f24639b = interfaceC2348Q;
        }

        /* renamed from: a */
        public final void m28214a(Throwable th) {
            if (th == null) {
                this.f24638a.m27346b(this.f24639b.getCompleted());
            } else if (th instanceof CancellationException) {
                this.f24638a.m27347c();
            } else {
                this.f24638a.m27349e(th);
            }
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m28214a((Throwable) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: b */
    public static final InterfaceFutureC4115e m28211b(final InterfaceC2348Q interfaceC2348Q, final Object obj) {
        AbstractC5469l.m23028e(interfaceC2348Q, "<this>");
        InterfaceFutureC4115e m27344a = AbstractC6582c.m27344a(new AbstractC6582c.c() { // from class: w1.a
            @Override // p350u.AbstractC6582c.c
            /* renamed from: a */
            public final Object mo27350a(AbstractC6582c.a aVar) {
                Object m28213d;
                m28213d = AbstractC6842b.m28213d(InterfaceC2348Q.this, obj, aVar);
                return m28213d;
            }
        });
        AbstractC5469l.m23027d(m27344a, "getFuture { completer ->…      }\n        tag\n    }");
        return m27344a;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceFutureC4115e m28212c(InterfaceC2348Q interfaceC2348Q, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return m28211b(interfaceC2348Q, obj);
    }

    /* renamed from: d */
    public static final Object m28213d(InterfaceC2348Q this_asListenableFuture, Object obj, AbstractC6582c.a completer) {
        AbstractC5469l.m23028e(this_asListenableFuture, "$this_asListenableFuture");
        AbstractC5469l.m23028e(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new a(completer, this_asListenableFuture));
        return obj;
    }
}

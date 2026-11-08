package p211d3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;

/* renamed from: d3.c */
/* loaded from: classes.dex */
public abstract class AbstractC4113c extends AbstractC4114d {

    /* renamed from: d3.c$a */
    public static final class a implements Runnable {

        /* renamed from: a */
        public final Future f13814a;

        /* renamed from: b */
        public final InterfaceC4112b f13815b;

        public a(Future future, InterfaceC4112b interfaceC4112b) {
            this.f13814a = future;
            this.f13815b = interfaceC4112b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f13815b.onSuccess(AbstractC4113c.m17291b(this.f13814a));
            } catch (ExecutionException e7) {
                this.f13815b.mo5892a(e7.getCause());
            } catch (Throwable th) {
                this.f13815b.mo5892a(th);
            }
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10547k(this.f13815b).toString();
        }
    }

    /* renamed from: a */
    public static void m17290a(InterfaceFutureC4115e interfaceFutureC4115e, InterfaceC4112b interfaceC4112b, Executor executor) {
        AbstractC2932o.m10572o(interfaceC4112b);
        interfaceFutureC4115e.mo17292b(new a(interfaceFutureC4115e, interfaceC4112b), executor);
    }

    /* renamed from: b */
    public static Object m17291b(Future future) {
        AbstractC2932o.m10581x(future.isDone(), "Future was expected to be done: %s", future);
        return AbstractC4118h.m17300a(future);
    }
}

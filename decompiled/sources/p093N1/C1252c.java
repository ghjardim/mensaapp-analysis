package p093N1;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5469l;
import p042G.InterfaceC0339a;
import p079L1.C0901j;
import p086M1.InterfaceC1145a;
import p378x5.AbstractC7024o;

/* renamed from: N1.c */
/* loaded from: classes.dex */
public final class C1252c implements InterfaceC1145a {
    /* renamed from: d */
    public static final void m4799d(InterfaceC0339a callback) {
        AbstractC5469l.m23028e(callback, "$callback");
        callback.accept(new C0901j(AbstractC7024o.m28861g()));
    }

    @Override // p086M1.InterfaceC1145a
    /* renamed from: a */
    public void mo4430a(InterfaceC0339a callback) {
        AbstractC5469l.m23028e(callback, "callback");
    }

    @Override // p086M1.InterfaceC1145a
    /* renamed from: b */
    public void mo4431b(Context context, Executor executor, final InterfaceC0339a callback) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(executor, "executor");
        AbstractC5469l.m23028e(callback, "callback");
        executor.execute(new Runnable() { // from class: N1.b
            @Override // java.lang.Runnable
            public final void run() {
                C1252c.m4799d(InterfaceC0339a.this);
            }
        });
    }
}

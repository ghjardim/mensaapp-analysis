package p108P2;

import android.content.ComponentName;

/* renamed from: P2.m6 */
/* loaded from: classes.dex */
public final class RunnableC1773m6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ComponentName f5235a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnectionC1827s6 f5236b;

    public RunnableC1773m6(ServiceConnectionC1827s6 serviceConnectionC1827s6, ComponentName componentName) {
        this.f5235a = componentName;
        this.f5236b = serviceConnectionC1827s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1836t6.m6384j0(this.f5236b.f5470c, this.f5235a);
    }
}

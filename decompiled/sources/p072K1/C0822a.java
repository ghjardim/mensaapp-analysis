package p072K1;

import android.app.Activity;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5469l;
import p042G.InterfaceC0339a;
import p065J1.C0704a;
import p079L1.InterfaceC0897f;
import p153V5.InterfaceC2631d;

/* renamed from: K1.a */
/* loaded from: classes.dex */
public final class C0822a implements InterfaceC0897f {

    /* renamed from: b */
    public final InterfaceC0897f f2848b;

    /* renamed from: c */
    public final C0704a f2849c;

    public C0822a(InterfaceC0897f interfaceC0897f, C0704a c0704a) {
        this.f2848b = interfaceC0897f;
        this.f2849c = c0704a;
    }

    @Override // p079L1.InterfaceC0897f
    /* renamed from: a */
    public InterfaceC2631d mo3440a(Activity activity) {
        AbstractC5469l.m23028e(activity, "activity");
        return this.f2848b.mo3440a(activity);
    }

    /* renamed from: b */
    public final void m3441b(Activity activity, Executor executor, InterfaceC0339a consumer) {
        AbstractC5469l.m23028e(activity, "activity");
        AbstractC5469l.m23028e(executor, "executor");
        AbstractC5469l.m23028e(consumer, "consumer");
        this.f2849c.m2986a(executor, consumer, this.f2848b.mo3440a(activity));
    }

    /* renamed from: c */
    public final void m3442c(InterfaceC0339a consumer) {
        AbstractC5469l.m23028e(consumer, "consumer");
        this.f2849c.m2987b(consumer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0822a(InterfaceC0897f tracker) {
        this(tracker, new C0704a());
        AbstractC5469l.m23028e(tracker, "tracker");
    }
}

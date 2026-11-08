package p181Z5;

import p132S5.AbstractC2342N;

/* renamed from: Z5.k */
/* loaded from: classes2.dex */
public final class C3090k extends AbstractRunnableC3087h {

    /* renamed from: c */
    public final Runnable f9556c;

    public C3090k(Runnable runnable, long j7, InterfaceC3088i interfaceC3088i) {
        super(j7, interfaceC3088i);
        this.f9556c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f9556c.run();
        } finally {
            this.f9554b.mo11288a();
        }
    }

    public String toString() {
        return "Task[" + AbstractC2342N.m8004a(this.f9556c) + '@' + AbstractC2342N.m8005b(this.f9556c) + ", " + this.f9553a + ", " + this.f9554b + ']';
    }
}

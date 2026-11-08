package p253i5;

import p237g5.C4459r;

/* renamed from: i5.y */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC4642y implements Runnable {

    /* renamed from: a */
    public final C4459r f17289a;

    public AbstractRunnableC4642y(C4459r c4459r) {
        this.f17289a = c4459r;
    }

    /* renamed from: a */
    public abstract void mo19323a();

    @Override // java.lang.Runnable
    public final void run() {
        C4459r m19008b = this.f17289a.m19008b();
        try {
            mo19323a();
        } finally {
            this.f17289a.m19010f(m19008b);
        }
    }
}

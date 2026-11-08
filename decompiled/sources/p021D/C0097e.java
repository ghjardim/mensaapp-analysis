package p021D;

import android.os.CancellationSignal;

/* renamed from: D.e */
/* loaded from: classes.dex */
public final class C0097e {

    /* renamed from: a */
    public boolean f327a;

    /* renamed from: b */
    public a f328b;

    /* renamed from: c */
    public Object f329c;

    /* renamed from: d */
    public boolean f330d;

    /* renamed from: D.e$a */
    public interface a {
        /* renamed from: a */
        void mo256a();
    }

    /* renamed from: a */
    public void m253a() {
        synchronized (this) {
            try {
                if (this.f327a) {
                    return;
                }
                this.f327a = true;
                this.f330d = true;
                a aVar = this.f328b;
                Object obj = this.f329c;
                if (aVar != null) {
                    try {
                        aVar.mo256a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f330d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f330d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public void m254b(a aVar) {
        synchronized (this) {
            try {
                m255c();
                if (this.f328b == aVar) {
                    return;
                }
                this.f328b = aVar;
                if (this.f327a && aVar != null) {
                    aVar.mo256a();
                }
            } finally {
            }
        }
    }

    /* renamed from: c */
    public final void m255c() {
        while (this.f330d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}

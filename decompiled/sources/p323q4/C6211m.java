package p323q4;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: q4.m */
/* loaded from: classes.dex */
public class C6211m {

    /* renamed from: a */
    public final String f22204a;

    /* renamed from: b */
    public final int f22205b;

    /* renamed from: c */
    public HandlerThread f22206c;

    /* renamed from: d */
    public Handler f22207d;

    /* renamed from: e */
    public Runnable f22208e;

    /* renamed from: f */
    public C6209k f22209f;

    public C6211m(String str, int i7) {
        this.f22204a = str;
        this.f22205b = i7;
    }

    /* renamed from: b */
    public boolean m25955b() {
        C6209k c6209k = this.f22209f;
        return c6209k != null && c6209k.m25953b();
    }

    /* renamed from: d */
    public Integer m25957d() {
        C6209k c6209k = this.f22209f;
        if (c6209k != null) {
            return c6209k.m25952a();
        }
        return null;
    }

    /* renamed from: e */
    public void m25958e(final C6209k c6209k) {
        this.f22207d.post(new Runnable() { // from class: q4.l
            @Override // java.lang.Runnable
            public final void run() {
                C6211m.this.m25956c(c6209k);
            }
        });
    }

    /* renamed from: f */
    public synchronized void m25959f() {
        HandlerThread handlerThread = this.f22206c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f22206c = null;
            this.f22207d = null;
        }
    }

    /* renamed from: g */
    public synchronized void m25960g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f22204a, this.f22205b);
        this.f22206c = handlerThread;
        handlerThread.start();
        this.f22207d = new Handler(this.f22206c.getLooper());
        this.f22208e = runnable;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m25956c(C6209k c6209k) {
        c6209k.f22201b.run();
        this.f22209f = c6209k;
        this.f22208e.run();
    }
}

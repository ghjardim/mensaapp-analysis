package p108P2;

import android.os.Process;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* renamed from: P2.u3 */
/* loaded from: classes.dex */
public final class C1842u3 extends Thread {

    /* renamed from: a */
    public final Object f5535a;

    /* renamed from: b */
    public final BlockingQueue f5536b;

    /* renamed from: c */
    public boolean f5537c = false;

    /* renamed from: d */
    public final /* synthetic */ C1851v3 f5538d;

    public C1842u3(C1851v3 c1851v3, String str, BlockingQueue blockingQueue) {
        this.f5538d = c1851v3;
        AbstractC3802r.m15129k(str);
        AbstractC3802r.m15129k(blockingQueue);
        this.f5535a = new Object();
        this.f5536b = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m6422a() {
        Object obj = this.f5535a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m6423b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C1842u3 c1842u3;
        C1842u3 c1842u32;
        C1851v3 c1851v3 = this.f5538d;
        obj = c1851v3.f5577i;
        synchronized (obj) {
            try {
                if (!this.f5537c) {
                    semaphore = c1851v3.f5578j;
                    semaphore.release();
                    obj2 = c1851v3.f5577i;
                    obj2.notifyAll();
                    c1842u3 = c1851v3.f5571c;
                    if (this == c1842u3) {
                        c1851v3.f5571c = null;
                    } else {
                        c1842u32 = c1851v3.f5572d;
                        if (this == c1842u32) {
                            c1851v3.f5572d = null;
                        } else {
                            c1851v3.f5129a.mo5624b().m5936r().m5902a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.f5537c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m6424c(InterruptedException interruptedException) {
        this.f5538d.f5129a.mo5624b().m5941w().m5903b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z6 = false;
        while (!z6) {
            try {
                semaphore = this.f5538d.f5578j;
                semaphore.acquire();
                z6 = true;
            } catch (InterruptedException e7) {
                m6424c(e7);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f5536b;
                C1833t3 c1833t3 = (C1833t3) blockingQueue.poll();
                if (c1833t3 != null) {
                    Process.setThreadPriority(true != c1833t3.f5516b ? 10 : threadPriority);
                    c1833t3.run();
                } else {
                    Object obj2 = this.f5535a;
                    synchronized (obj2) {
                        if (blockingQueue.peek() == null) {
                            C1851v3.m6438C(this.f5538d);
                            try {
                                obj2.wait(30000L);
                            } catch (InterruptedException e8) {
                                m6424c(e8);
                            }
                        }
                    }
                    obj = this.f5538d.f5577i;
                    synchronized (obj) {
                        if (this.f5536b.peek() == null) {
                            m6423b();
                            m6423b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m6423b();
            throw th;
        }
    }
}

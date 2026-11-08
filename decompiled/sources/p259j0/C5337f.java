package p259j0;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public class C5337f {

    /* renamed from: a */
    public final InterfaceC5334c f18824a;

    /* renamed from: b */
    public boolean f18825b;

    public C5337f() {
        this(InterfaceC5334c.f18817a);
    }

    /* renamed from: a */
    public synchronized void m21821a() {
        while (!this.f18825b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized void m21822b() {
        boolean z6 = false;
        while (!this.f18825b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public synchronized boolean m21823c() {
        boolean z6;
        z6 = this.f18825b;
        this.f18825b = false;
        return z6;
    }

    /* renamed from: d */
    public synchronized boolean m21824d() {
        return this.f18825b;
    }

    /* renamed from: e */
    public synchronized boolean m21825e() {
        if (this.f18825b) {
            return false;
        }
        this.f18825b = true;
        notifyAll();
        return true;
    }

    public C5337f(InterfaceC5334c interfaceC5334c) {
        this.f18824a = interfaceC5334c;
    }
}

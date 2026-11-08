package p191b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0789a;
import p371w5.C6934q;

/* renamed from: b.t */
/* loaded from: classes.dex */
public final class C3496t {

    /* renamed from: a */
    public final Executor f11723a;

    /* renamed from: b */
    public final InterfaceC0789a f11724b;

    /* renamed from: c */
    public final Object f11725c;

    /* renamed from: d */
    public int f11726d;

    /* renamed from: e */
    public boolean f11727e;

    /* renamed from: f */
    public boolean f11728f;

    /* renamed from: g */
    public final List f11729g;

    /* renamed from: h */
    public final Runnable f11730h;

    public C3496t(Executor executor, InterfaceC0789a reportFullyDrawn) {
        AbstractC5469l.m23028e(executor, "executor");
        AbstractC5469l.m23028e(reportFullyDrawn, "reportFullyDrawn");
        this.f11723a = executor;
        this.f11724b = reportFullyDrawn;
        this.f11725c = new Object();
        this.f11729g = new ArrayList();
        this.f11730h = new Runnable() { // from class: b.s
            @Override // java.lang.Runnable
            public final void run() {
                C3496t.m14035d(C3496t.this);
            }
        };
    }

    /* renamed from: d */
    public static final void m14035d(C3496t this$0) {
        AbstractC5469l.m23028e(this$0, "this$0");
        synchronized (this$0.f11725c) {
            try {
                this$0.f11727e = false;
                if (this$0.f11726d == 0 && !this$0.f11728f) {
                    this$0.f11724b.invoke();
                    this$0.m14036b();
                }
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m14036b() {
        synchronized (this.f11725c) {
            try {
                this.f11728f = true;
                Iterator it = this.f11729g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0789a) it.next()).invoke();
                }
                this.f11729g.clear();
                C6934q c6934q = C6934q.f24811a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean m14037c() {
        boolean z6;
        synchronized (this.f11725c) {
            z6 = this.f11728f;
        }
        return z6;
    }
}

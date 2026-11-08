package p259j0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p259j0.InterfaceC5342k;

/* renamed from: j0.C */
/* loaded from: classes.dex */
public final class C5320C implements InterfaceC5342k {

    /* renamed from: b */
    public static final List f18787b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f18788a;

    /* renamed from: j0.C$b */
    public static final class b implements InterfaceC5342k.a {

        /* renamed from: a */
        public Message f18789a;

        /* renamed from: b */
        public C5320C f18790b;

        public b() {
        }

        @Override // p259j0.InterfaceC5342k.a
        /* renamed from: a */
        public void mo21632a() {
            ((Message) AbstractC5332a.m21800e(this.f18789a)).sendToTarget();
            m21633b();
        }

        /* renamed from: b */
        public final void m21633b() {
            this.f18789a = null;
            this.f18790b = null;
            C5320C.m21620n(this);
        }

        /* renamed from: c */
        public boolean m21634c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC5332a.m21800e(this.f18789a));
            m21633b();
            return sendMessageAtFrontOfQueue;
        }

        /* renamed from: d */
        public b m21635d(Message message, C5320C c5320c) {
            this.f18789a = message;
            this.f18790b = c5320c;
            return this;
        }
    }

    public C5320C(Handler handler) {
        this.f18788a = handler;
    }

    /* renamed from: m */
    public static b m21619m() {
        b bVar;
        List list = f18787b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* renamed from: n */
    public static void m21620n(b bVar) {
        List list = f18787b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: a */
    public InterfaceC5342k.a mo21621a(int i7, int i8, int i9) {
        return m21619m().m21635d(this.f18788a.obtainMessage(i7, i8, i9), this);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: b */
    public boolean mo21622b(Runnable runnable) {
        return this.f18788a.post(runnable);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: c */
    public InterfaceC5342k.a mo21623c(int i7) {
        return m21619m().m21635d(this.f18788a.obtainMessage(i7), this);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: d */
    public boolean mo21624d(InterfaceC5342k.a aVar) {
        return ((b) aVar).m21634c(this.f18788a);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: e */
    public boolean mo21625e(int i7) {
        AbstractC5332a.m21796a(i7 != 0);
        return this.f18788a.hasMessages(i7);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: f */
    public boolean mo21626f(int i7) {
        return this.f18788a.sendEmptyMessage(i7);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: g */
    public boolean mo21627g(int i7, long j7) {
        return this.f18788a.sendEmptyMessageAtTime(i7, j7);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: h */
    public void mo21628h(int i7) {
        AbstractC5332a.m21796a(i7 != 0);
        this.f18788a.removeMessages(i7);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: i */
    public InterfaceC5342k.a mo21629i(int i7, Object obj) {
        return m21619m().m21635d(this.f18788a.obtainMessage(i7, obj), this);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: j */
    public void mo21630j(Object obj) {
        this.f18788a.removeCallbacksAndMessages(obj);
    }

    @Override // p259j0.InterfaceC5342k
    /* renamed from: k */
    public Looper mo21631k() {
        return this.f18788a.getLooper();
    }
}

package p335s0;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p022D0.C0116B;
import p022D0.C0179y;
import p050H0.InterfaceC0544m;
import p232g0.AbstractC4317g;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5339h;
import p259j0.InterfaceC5338g;
import p284m0.InterfaceC5554b;
import p300o0.C5912w1;
import p335s0.InterfaceC6326F;
import p335s0.InterfaceC6354n;
import p335s0.InterfaceC6362v;

/* renamed from: s0.g */
/* loaded from: classes.dex */
public class C6347g implements InterfaceC6354n {

    /* renamed from: a */
    public final List f22913a;

    /* renamed from: b */
    public final InterfaceC6326F f22914b;

    /* renamed from: c */
    public final a f22915c;

    /* renamed from: d */
    public final b f22916d;

    /* renamed from: e */
    public final int f22917e;

    /* renamed from: f */
    public final boolean f22918f;

    /* renamed from: g */
    public final boolean f22919g;

    /* renamed from: h */
    public final HashMap f22920h;

    /* renamed from: i */
    public final C5339h f22921i;

    /* renamed from: j */
    public final InterfaceC0544m f22922j;

    /* renamed from: k */
    public final C5912w1 f22923k;

    /* renamed from: l */
    public final InterfaceC6337Q f22924l;

    /* renamed from: m */
    public final UUID f22925m;

    /* renamed from: n */
    public final Looper f22926n;

    /* renamed from: o */
    public final e f22927o;

    /* renamed from: p */
    public int f22928p;

    /* renamed from: q */
    public int f22929q;

    /* renamed from: r */
    public HandlerThread f22930r;

    /* renamed from: s */
    public c f22931s;

    /* renamed from: t */
    public InterfaceC5554b f22932t;

    /* renamed from: u */
    public InterfaceC6354n.a f22933u;

    /* renamed from: v */
    public byte[] f22934v;

    /* renamed from: w */
    public byte[] f22935w;

    /* renamed from: x */
    public InterfaceC6326F.a f22936x;

    /* renamed from: y */
    public InterfaceC6326F.d f22937y;

    /* renamed from: s0.g$a */
    public interface a {
        /* renamed from: a */
        void mo26573a(Exception exc, boolean z6);

        /* renamed from: b */
        void mo26574b(C6347g c6347g);

        /* renamed from: c */
        void mo26575c();
    }

    /* renamed from: s0.g$b */
    public interface b {
        /* renamed from: a */
        void mo26576a(C6347g c6347g, int i7);

        /* renamed from: b */
        void mo26577b(C6347g c6347g, int i7);
    }

    /* renamed from: s0.g$c */
    public class c extends Handler {

        /* renamed from: a */
        public boolean f22938a;

        public c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final boolean m26578a(Message message, C6338S c6338s) {
            d dVar = (d) message.obj;
            if (!dVar.f22941b) {
                return false;
            }
            int i7 = dVar.f22944e + 1;
            dVar.f22944e = i7;
            if (i7 > C6347g.this.f22922j.mo2088d(3)) {
                return false;
            }
            long mo2087c = C6347g.this.f22922j.mo2087c(new InterfaceC0544m.c(new C0179y(dVar.f22940a, c6338s.f22906a, c6338s.f22907b, c6338s.f22908c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f22942c, c6338s.f22909d), new C0116B(3), c6338s.getCause() instanceof IOException ? (IOException) c6338s.getCause() : new f(c6338s.getCause()), dVar.f22944e));
            if (mo2087c == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f22938a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), mo2087c);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: b */
        public void m26579b(int i7, Object obj, boolean z6) {
            obtainMessage(i7, new d(C0179y.m716a(), z6, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void m26580c() {
            removeCallbacksAndMessages(null);
            this.f22938a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i7 = message.what;
                if (i7 == 1) {
                    th = C6347g.this.f22924l.mo26536a(C6347g.this.f22925m, (InterfaceC6326F.d) dVar.f22943d);
                } else {
                    if (i7 != 2) {
                        throw new RuntimeException();
                    }
                    th = C6347g.this.f22924l.mo26537b(C6347g.this.f22925m, (InterfaceC6326F.a) dVar.f22943d);
                }
            } catch (C6338S e7) {
                boolean m26578a = m26578a(message, e7);
                th = e7;
                if (m26578a) {
                    return;
                }
            } catch (Exception e8) {
                AbstractC5346o.m21868i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e8);
                th = e8;
            }
            C6347g.this.f22922j.mo2086b(dVar.f22940a);
            synchronized (this) {
                try {
                    if (!this.f22938a) {
                        C6347g.this.f22927o.obtainMessage(message.what, Pair.create(dVar.f22943d, th)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: s0.g$d */
    public static final class d {

        /* renamed from: a */
        public final long f22940a;

        /* renamed from: b */
        public final boolean f22941b;

        /* renamed from: c */
        public final long f22942c;

        /* renamed from: d */
        public final Object f22943d;

        /* renamed from: e */
        public int f22944e;

        public d(long j7, boolean z6, long j8, Object obj) {
            this.f22940a = j7;
            this.f22941b = z6;
            this.f22942c = j8;
            this.f22943d = obj;
        }
    }

    /* renamed from: s0.g$e */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i7 = message.what;
            if (i7 == 1) {
                C6347g.this.m26560F(obj, obj2);
            } else {
                if (i7 != 2) {
                    return;
                }
                C6347g.this.m26572z(obj, obj2);
            }
        }
    }

    /* renamed from: s0.g$f */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public C6347g(UUID uuid, InterfaceC6326F interfaceC6326F, a aVar, b bVar, List list, int i7, boolean z6, boolean z7, byte[] bArr, HashMap hashMap, InterfaceC6337Q interfaceC6337Q, Looper looper, InterfaceC0544m interfaceC0544m, C5912w1 c5912w1) {
        if (i7 == 1 || i7 == 3) {
            AbstractC5332a.m21800e(bArr);
        }
        this.f22925m = uuid;
        this.f22915c = aVar;
        this.f22916d = bVar;
        this.f22914b = interfaceC6326F;
        this.f22917e = i7;
        this.f22918f = z6;
        this.f22919g = z7;
        if (bArr != null) {
            this.f22935w = bArr;
            this.f22913a = null;
        } else {
            this.f22913a = DesugarCollections.unmodifiableList((List) AbstractC5332a.m21800e(list));
        }
        this.f22920h = hashMap;
        this.f22924l = interfaceC6337Q;
        this.f22921i = new C5339h();
        this.f22922j = interfaceC0544m;
        this.f22923k = c5912w1;
        this.f22928p = 2;
        this.f22926n = looper;
        this.f22927o = new e(looper);
    }

    /* renamed from: w */
    public static /* synthetic */ void m26553w(Throwable th, InterfaceC6362v.a aVar) {
        aVar.m26643l((Exception) th);
    }

    /* renamed from: A */
    public final void m26555A(Throwable th, boolean z6) {
        if ((th instanceof NotProvisionedException) || AbstractC6322B.m26476b(th)) {
            this.f22915c.mo26574b(this);
        } else {
            m26571y(th, z6 ? 1 : 2);
        }
    }

    /* renamed from: B */
    public final void m26556B() {
        if (this.f22917e == 0 && this.f22928p == 4) {
            AbstractC5330M.m21747i(this.f22934v);
            m26567s(false);
        }
    }

    /* renamed from: C */
    public void m26557C(int i7) {
        if (i7 != 2) {
            return;
        }
        m26556B();
    }

    /* renamed from: D */
    public void m26558D() {
        if (m26561G()) {
            m26567s(true);
        }
    }

    /* renamed from: E */
    public void m26559E(Exception exc, boolean z6) {
        m26571y(exc, z6 ? 1 : 3);
    }

    /* renamed from: F */
    public final void m26560F(Object obj, Object obj2) {
        if (obj == this.f22937y) {
            if (this.f22928p == 2 || m26570v()) {
                this.f22937y = null;
                if (obj2 instanceof Exception) {
                    this.f22915c.mo26573a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f22914b.mo26491k((byte[]) obj2);
                    this.f22915c.mo26575c();
                } catch (Exception e7) {
                    this.f22915c.mo26573a(e7, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m26561G() {
        /*
            r4 = this;
            boolean r0 = r4.m26570v()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            s0.F r0 = r4.f22914b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.mo26485e()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f22934v = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            s0.F r2 = r4.f22914b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            o0.w1 r3 = r4.f22923k     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.mo26481a(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            s0.F r0 = r4.f22914b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f22934v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            m0.b r0 = r0.mo26484d(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f22932t = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.f22928p = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            s0.e r2 = new s0.e     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.m26566r(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f22934v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            p259j0.AbstractC5332a.m21800e(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = p335s0.AbstractC6322B.m26476b(r0)
            if (r2 == 0) goto L41
            s0.g$a r0 = r4.f22915c
            r0.mo26574b(r4)
            goto L4a
        L41:
            r4.m26571y(r0, r1)
            goto L4a
        L45:
            s0.g$a r0 = r4.f22915c
            r0.mo26574b(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p335s0.C6347g.m26561G():boolean");
    }

    /* renamed from: H */
    public final void m26562H(byte[] bArr, int i7, boolean z6) {
        try {
            this.f22936x = this.f22914b.mo26492l(bArr, this.f22913a, i7, this.f22920h);
            ((c) AbstractC5330M.m21747i(this.f22931s)).m26579b(2, AbstractC5332a.m21800e(this.f22936x), z6);
        } catch (Exception | NoSuchMethodError e7) {
            m26555A(e7, true);
        }
    }

    /* renamed from: I */
    public void m26563I() {
        this.f22937y = this.f22914b.mo26483c();
        ((c) AbstractC5330M.m21747i(this.f22931s)).m26579b(1, AbstractC5332a.m21800e(this.f22937y), true);
    }

    /* renamed from: J */
    public final boolean m26564J() {
        try {
            this.f22914b.mo26487g(this.f22934v, this.f22935w);
            return true;
        } catch (Exception | NoSuchMethodError e7) {
            m26571y(e7, 1);
            return false;
        }
    }

    /* renamed from: K */
    public final void m26565K() {
        if (Thread.currentThread() != this.f22926n.getThread()) {
            AbstractC5346o.m21868i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f22926n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: a */
    public final InterfaceC6354n.a mo26494a() {
        m26565K();
        if (this.f22928p == 1) {
            return this.f22933u;
        }
        return null;
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: b */
    public final UUID mo26495b() {
        m26565K();
        return this.f22925m;
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: c */
    public boolean mo26496c() {
        m26565K();
        return this.f22918f;
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: d */
    public Map mo26497d() {
        m26565K();
        byte[] bArr = this.f22934v;
        if (bArr == null) {
            return null;
        }
        return this.f22914b.mo26482b(bArr);
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: e */
    public final int mo26498e() {
        m26565K();
        return this.f22928p;
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: f */
    public void mo26499f(InterfaceC6362v.a aVar) {
        m26565K();
        if (this.f22929q < 0) {
            AbstractC5346o.m21862c("DefaultDrmSession", "Session reference count less than zero: " + this.f22929q);
            this.f22929q = 0;
        }
        if (aVar != null) {
            this.f22921i.m21826a(aVar);
        }
        int i7 = this.f22929q + 1;
        this.f22929q = i7;
        if (i7 == 1) {
            AbstractC5332a.m21802g(this.f22928p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f22930r = handlerThread;
            handlerThread.start();
            this.f22931s = new c(this.f22930r.getLooper());
            if (m26561G()) {
                m26567s(true);
            }
        } else if (aVar != null && m26570v() && this.f22921i.m21827b(aVar) == 1) {
            aVar.m26642k(this.f22928p);
        }
        this.f22916d.mo26577b(this, this.f22929q);
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: g */
    public void mo26500g(InterfaceC6362v.a aVar) {
        m26565K();
        int i7 = this.f22929q;
        if (i7 <= 0) {
            AbstractC5346o.m21862c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i8 = i7 - 1;
        this.f22929q = i8;
        if (i8 == 0) {
            this.f22928p = 0;
            ((e) AbstractC5330M.m21747i(this.f22927o)).removeCallbacksAndMessages(null);
            ((c) AbstractC5330M.m21747i(this.f22931s)).m26580c();
            this.f22931s = null;
            ((HandlerThread) AbstractC5330M.m21747i(this.f22930r)).quit();
            this.f22930r = null;
            this.f22932t = null;
            this.f22933u = null;
            this.f22936x = null;
            this.f22937y = null;
            byte[] bArr = this.f22934v;
            if (bArr != null) {
                this.f22914b.mo26488h(bArr);
                this.f22934v = null;
            }
        }
        if (aVar != null) {
            this.f22921i.m21829f(aVar);
            if (this.f22921i.m21827b(aVar) == 0) {
                aVar.m26644m();
            }
        }
        this.f22916d.mo26576a(this, this.f22929q);
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: h */
    public boolean mo26501h(String str) {
        m26565K();
        return this.f22914b.mo26486f((byte[]) AbstractC5332a.m21804i(this.f22934v), str);
    }

    @Override // p335s0.InterfaceC6354n
    /* renamed from: i */
    public final InterfaceC5554b mo26502i() {
        m26565K();
        return this.f22932t;
    }

    /* renamed from: r */
    public final void m26566r(InterfaceC5338g interfaceC5338g) {
        Iterator it = this.f22921i.m21828e().iterator();
        while (it.hasNext()) {
            interfaceC5338g.accept((InterfaceC6362v.a) it.next());
        }
    }

    /* renamed from: s */
    public final void m26567s(boolean z6) {
        if (this.f22919g) {
            return;
        }
        byte[] bArr = (byte[]) AbstractC5330M.m21747i(this.f22934v);
        int i7 = this.f22917e;
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                if (this.f22935w == null || m26564J()) {
                    m26562H(bArr, 2, z6);
                    return;
                }
                return;
            }
            if (i7 != 3) {
                return;
            }
            AbstractC5332a.m21800e(this.f22935w);
            AbstractC5332a.m21800e(this.f22934v);
            m26562H(this.f22935w, 3, z6);
            return;
        }
        if (this.f22935w == null) {
            m26562H(bArr, 1, z6);
            return;
        }
        if (this.f22928p == 4 || m26564J()) {
            long m26568t = m26568t();
            if (this.f22917e != 0 || m26568t > 60) {
                if (m26568t <= 0) {
                    m26571y(new C6336P(), 2);
                    return;
                } else {
                    this.f22928p = 4;
                    m26566r(new InterfaceC5338g() { // from class: s0.f
                        @Override // p259j0.InterfaceC5338g
                        public final void accept(Object obj) {
                            ((InterfaceC6362v.a) obj).m26641j();
                        }
                    });
                    return;
                }
            }
            AbstractC5346o.m21861b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + m26568t);
            m26562H(bArr, 2, z6);
        }
    }

    /* renamed from: t */
    public final long m26568t() {
        if (!AbstractC4317g.f15030d.equals(this.f22925m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC5332a.m21800e(AbstractC6340U.m26540b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: u */
    public boolean m26569u(byte[] bArr) {
        m26565K();
        return Arrays.equals(this.f22934v, bArr);
    }

    /* renamed from: v */
    public final boolean m26570v() {
        int i7 = this.f22928p;
        return i7 == 3 || i7 == 4;
    }

    /* renamed from: y */
    public final void m26571y(final Throwable th, int i7) {
        this.f22933u = new InterfaceC6354n.a(th, AbstractC6322B.m26475a(th, i7));
        AbstractC5346o.m21863d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            m26566r(new InterfaceC5338g() { // from class: s0.d
                @Override // p259j0.InterfaceC5338g
                public final void accept(Object obj) {
                    C6347g.m26553w(th, (InterfaceC6362v.a) obj);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!AbstractC6322B.m26477c(th) && !AbstractC6322B.m26476b(th)) {
                throw ((Error) th);
            }
        }
        if (this.f22928p != 4) {
            this.f22928p = 1;
        }
    }

    /* renamed from: z */
    public final void m26572z(Object obj, Object obj2) {
        if (obj == this.f22936x && m26570v()) {
            this.f22936x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                m26555A((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f22917e == 3) {
                    this.f22914b.mo26489i((byte[]) AbstractC5330M.m21747i(this.f22935w), bArr);
                    m26566r(new InterfaceC5338g() { // from class: s0.b
                        @Override // p259j0.InterfaceC5338g
                        public final void accept(Object obj3) {
                            ((InterfaceC6362v.a) obj3).m26640i();
                        }
                    });
                    return;
                }
                byte[] mo26489i = this.f22914b.mo26489i(this.f22934v, bArr);
                int i7 = this.f22917e;
                if ((i7 == 2 || (i7 == 0 && this.f22935w != null)) && mo26489i != null && mo26489i.length != 0) {
                    this.f22935w = mo26489i;
                }
                this.f22928p = 4;
                m26566r(new InterfaceC5338g() { // from class: s0.c
                    @Override // p259j0.InterfaceC5338g
                    public final void accept(Object obj3) {
                        ((InterfaceC6362v.a) obj3).m26639h();
                    }
                });
            } catch (Exception e7) {
                e = e7;
                m26555A(e, true);
            } catch (NoSuchMethodError e8) {
                e = e8;
                m26555A(e, true);
            }
        }
    }
}

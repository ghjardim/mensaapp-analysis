package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p022D0.C0143b0;
import p029E0.AbstractC0212e;
import p050H0.InterfaceC0533b;
import p078L0.AbstractC0860S;
import p078L0.InterfaceC0861T;
import p141U0.C2500b;
import p155W0.C2653a;
import p155W0.C2654b;
import p232g0.C4295A;
import p232g0.C4327q;
import p232g0.C4334x;
import p232g0.InterfaceC4319i;
import p259j0.AbstractC5330M;
import p259j0.C5357z;
import p292n0.C5756s0;
import p327r0.C6236c;

/* renamed from: androidx.media3.exoplayer.dash.d */
/* loaded from: classes.dex */
public final class C3373d implements Handler.Callback {

    /* renamed from: a */
    public final InterfaceC0533b f10921a;

    /* renamed from: b */
    public final b f10922b;

    /* renamed from: f */
    public C6236c f10926f;

    /* renamed from: n */
    public long f10927n;

    /* renamed from: o */
    public boolean f10928o;

    /* renamed from: p */
    public boolean f10929p;

    /* renamed from: q */
    public boolean f10930q;

    /* renamed from: e */
    public final TreeMap f10925e = new TreeMap();

    /* renamed from: d */
    public final Handler f10924d = AbstractC5330M.m21673B(this);

    /* renamed from: c */
    public final C2654b f10923c = new C2654b();

    /* renamed from: androidx.media3.exoplayer.dash.d$a */
    public static final class a {

        /* renamed from: a */
        public final long f10931a;

        /* renamed from: b */
        public final long f10932b;

        public a(long j7, long j8) {
            this.f10931a = j7;
            this.f10932b = j8;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.d$b */
    public interface b {
        /* renamed from: a */
        void mo13041a();

        /* renamed from: b */
        void mo13042b(long j7);
    }

    /* renamed from: androidx.media3.exoplayer.dash.d$c */
    public final class c implements InterfaceC0861T {

        /* renamed from: a */
        public final C0143b0 f10933a;

        /* renamed from: b */
        public final C5756s0 f10934b = new C5756s0();

        /* renamed from: c */
        public final C2500b f10935c = new C2500b();

        /* renamed from: d */
        public long f10936d = -9223372036854775807L;

        public c(InterfaceC0533b interfaceC0533b) {
            this.f10933a = C0143b0.m532l(interfaceC0533b);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: a */
        public /* synthetic */ int mo558a(InterfaceC4319i interfaceC4319i, int i7, boolean z6) {
            return AbstractC0860S.m3555a(this, interfaceC4319i, i7, z6);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: b */
        public void mo560b(C5357z c5357z, int i7, int i8) {
            this.f10933a.mo564d(c5357z, i7);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: c */
        public void mo562c(long j7, int i7, int i8, int i9, InterfaceC0861T.a aVar) {
            this.f10933a.mo562c(j7, i7, i8, i9, aVar);
            m13132l();
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: d */
        public /* synthetic */ void mo564d(C5357z c5357z, int i7) {
            AbstractC0860S.m3556b(this, c5357z, i7);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: e */
        public void mo566e(C4327q c4327q) {
            this.f10933a.mo566e(c4327q);
        }

        @Override // p078L0.InterfaceC0861T
        /* renamed from: f */
        public int mo568f(InterfaceC4319i interfaceC4319i, int i7, boolean z6, int i8) {
            return this.f10933a.mo558a(interfaceC4319i, i7, z6);
        }

        /* renamed from: g */
        public final C2500b m13127g() {
            this.f10935c.mo19253j();
            if (this.f10933a.m551T(this.f10934b, this.f10935c, 0, false) != -4) {
                return null;
            }
            this.f10935c.m23291t();
            return this.f10935c;
        }

        /* renamed from: h */
        public boolean m13128h(long j7) {
            return C3373d.this.m13119j(j7);
        }

        /* renamed from: i */
        public void m13129i(AbstractC0212e abstractC0212e) {
            long j7 = this.f10936d;
            if (j7 == -9223372036854775807L || abstractC0212e.f879h > j7) {
                this.f10936d = abstractC0212e.f879h;
            }
            C3373d.this.m13122m(abstractC0212e);
        }

        /* renamed from: j */
        public boolean m13130j(AbstractC0212e abstractC0212e) {
            long j7 = this.f10936d;
            return C3373d.this.m13123n(j7 != -9223372036854775807L && j7 < abstractC0212e.f878g);
        }

        /* renamed from: k */
        public final void m13131k(long j7, long j8) {
            C3373d.this.f10924d.sendMessage(C3373d.this.f10924d.obtainMessage(1, new a(j7, j8)));
        }

        /* renamed from: l */
        public final void m13132l() {
            while (this.f10933a.m544L(false)) {
                C2500b m13127g = m13127g();
                if (m13127g != null) {
                    long j7 = m13127g.f20079f;
                    C4334x mo8456a = C3373d.this.f10923c.mo8456a(m13127g);
                    if (mo8456a != null) {
                        C2653a c2653a = (C2653a) mo8456a.m18401d(0);
                        if (C3373d.m13115h(c2653a.f7873a, c2653a.f7874b)) {
                            m13133m(j7, c2653a);
                        }
                    }
                }
            }
            this.f10933a.m581s();
        }

        /* renamed from: m */
        public final void m13133m(long j7, C2653a c2653a) {
            long m13114f = C3373d.m13114f(c2653a);
            if (m13114f == -9223372036854775807L) {
                return;
            }
            m13131k(j7, m13114f);
        }

        /* renamed from: n */
        public void m13134n() {
            this.f10933a.m552U();
        }
    }

    public C3373d(C6236c c6236c, b bVar, InterfaceC0533b interfaceC0533b) {
        this.f10926f = c6236c;
        this.f10922b = bVar;
        this.f10921a = interfaceC0533b;
    }

    /* renamed from: f */
    public static long m13114f(C2653a c2653a) {
        try {
            return AbstractC5330M.m21706R0(AbstractC5330M.m21687I(c2653a.f7877e));
        } catch (C4295A unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: h */
    public static boolean m13115h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    /* renamed from: e */
    public final Map.Entry m13116e(long j7) {
        return this.f10925e.ceilingEntry(Long.valueOf(j7));
    }

    /* renamed from: g */
    public final void m13117g(long j7, long j8) {
        Long l7 = (Long) this.f10925e.get(Long.valueOf(j8));
        if (l7 == null) {
            this.f10925e.put(Long.valueOf(j8), Long.valueOf(j7));
        } else if (l7.longValue() > j7) {
            this.f10925e.put(Long.valueOf(j8), Long.valueOf(j7));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f10930q) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        m13117g(aVar.f10931a, aVar.f10932b);
        return true;
    }

    /* renamed from: i */
    public final void m13118i() {
        if (this.f10928o) {
            this.f10929p = true;
            this.f10928o = false;
            this.f10922b.mo13041a();
        }
    }

    /* renamed from: j */
    public boolean m13119j(long j7) {
        C6236c c6236c = this.f10926f;
        boolean z6 = false;
        if (!c6236c.f22291d) {
            return false;
        }
        if (this.f10929p) {
            return true;
        }
        Map.Entry m13116e = m13116e(c6236c.f22295h);
        if (m13116e != null && ((Long) m13116e.getValue()).longValue() < j7) {
            this.f10927n = ((Long) m13116e.getKey()).longValue();
            m13121l();
            z6 = true;
        }
        if (z6) {
            m13118i();
        }
        return z6;
    }

    /* renamed from: k */
    public c m13120k() {
        return new c(this.f10921a);
    }

    /* renamed from: l */
    public final void m13121l() {
        this.f10922b.mo13042b(this.f10927n);
    }

    /* renamed from: m */
    public void m13122m(AbstractC0212e abstractC0212e) {
        this.f10928o = true;
    }

    /* renamed from: n */
    public boolean m13123n(boolean z6) {
        if (!this.f10926f.f22291d) {
            return false;
        }
        if (this.f10929p) {
            return true;
        }
        if (!z6) {
            return false;
        }
        m13118i();
        return true;
    }

    /* renamed from: o */
    public void m13124o() {
        this.f10930q = true;
        this.f10924d.removeCallbacksAndMessages(null);
    }

    /* renamed from: p */
    public final void m13125p() {
        Iterator it = this.f10925e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f10926f.f22295h) {
                it.remove();
            }
        }
    }

    /* renamed from: q */
    public void m13126q(C6236c c6236c) {
        this.f10929p = false;
        this.f10927n = -9223372036854775807L;
        this.f10926f = c6236c;
        m13125p();
    }
}

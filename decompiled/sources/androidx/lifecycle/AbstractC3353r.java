package androidx.lifecycle;

import androidx.lifecycle.AbstractC3345j;
import java.util.Map;
import p299o.C5790c;
import p310p.C6040b;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public abstract class AbstractC3353r {

    /* renamed from: k */
    public static final Object f10765k = new Object();

    /* renamed from: a */
    public final Object f10766a = new Object();

    /* renamed from: b */
    public C6040b f10767b = new C6040b();

    /* renamed from: c */
    public int f10768c = 0;

    /* renamed from: d */
    public boolean f10769d;

    /* renamed from: e */
    public volatile Object f10770e;

    /* renamed from: f */
    public volatile Object f10771f;

    /* renamed from: g */
    public int f10772g;

    /* renamed from: h */
    public boolean f10773h;

    /* renamed from: i */
    public boolean f10774i;

    /* renamed from: j */
    public final Runnable f10775j;

    /* renamed from: androidx.lifecycle.r$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC3353r.this.f10766a) {
                obj = AbstractC3353r.this.f10771f;
                AbstractC3353r.this.f10771f = AbstractC3353r.f10765k;
            }
            AbstractC3353r.this.mo12971n(obj);
        }
    }

    /* renamed from: androidx.lifecycle.r$b */
    public class b extends d {
        public b(InterfaceC3356u interfaceC3356u) {
            super(interfaceC3356u);
        }

        @Override // androidx.lifecycle.AbstractC3353r.d
        /* renamed from: i */
        public boolean mo12972i() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.r$c */
    public class c extends d implements InterfaceC3347l {

        /* renamed from: e */
        public final InterfaceC3349n f10778e;

        public c(InterfaceC3349n interfaceC3349n, InterfaceC3356u interfaceC3356u) {
            super(interfaceC3356u);
            this.f10778e = interfaceC3349n;
        }

        @Override // androidx.lifecycle.InterfaceC3347l
        /* renamed from: d */
        public void mo78d(InterfaceC3349n interfaceC3349n, AbstractC3345j.a aVar) {
            AbstractC3345j.b mo12928b = this.f10778e.mo9642a().mo12928b();
            if (mo12928b == AbstractC3345j.b.DESTROYED) {
                AbstractC3353r.this.mo12970m(this.f10780a);
                return;
            }
            AbstractC3345j.b bVar = null;
            while (bVar != mo12928b) {
                m12975b(mo12972i());
                bVar = mo12928b;
                mo12928b = this.f10778e.mo9642a().mo12928b();
            }
        }

        @Override // androidx.lifecycle.AbstractC3353r.d
        /* renamed from: e */
        public void mo12973e() {
            this.f10778e.mo9642a().mo12929c(this);
        }

        @Override // androidx.lifecycle.AbstractC3353r.d
        /* renamed from: f */
        public boolean mo12974f(InterfaceC3349n interfaceC3349n) {
            return this.f10778e == interfaceC3349n;
        }

        @Override // androidx.lifecycle.AbstractC3353r.d
        /* renamed from: i */
        public boolean mo12972i() {
            return this.f10778e.mo9642a().mo12928b().m12935f(AbstractC3345j.b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.r$d */
    public abstract class d {

        /* renamed from: a */
        public final InterfaceC3356u f10780a;

        /* renamed from: b */
        public boolean f10781b;

        /* renamed from: c */
        public int f10782c = -1;

        public d(InterfaceC3356u interfaceC3356u) {
            this.f10780a = interfaceC3356u;
        }

        /* renamed from: b */
        public void m12975b(boolean z6) {
            if (z6 == this.f10781b) {
                return;
            }
            this.f10781b = z6;
            AbstractC3353r.this.m12960c(z6 ? 1 : -1);
            if (this.f10781b) {
                AbstractC3353r.this.m12962e(this);
            }
        }

        /* renamed from: e */
        public void mo12973e() {
        }

        /* renamed from: f */
        public boolean mo12974f(InterfaceC3349n interfaceC3349n) {
            return false;
        }

        /* renamed from: i */
        public abstract boolean mo12972i();
    }

    public AbstractC3353r() {
        Object obj = f10765k;
        this.f10771f = obj;
        this.f10775j = new a();
        this.f10770e = obj;
        this.f10772g = -1;
    }

    /* renamed from: b */
    public static void m12959b(String str) {
        if (C5790c.m24453f().mo24457b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: c */
    public void m12960c(int i7) {
        int i8 = this.f10768c;
        this.f10768c = i7 + i8;
        if (this.f10769d) {
            return;
        }
        this.f10769d = true;
        while (true) {
            try {
                int i9 = this.f10768c;
                if (i8 == i9) {
                    this.f10769d = false;
                    return;
                }
                boolean z6 = i8 == 0 && i9 > 0;
                boolean z7 = i8 > 0 && i9 == 0;
                if (z6) {
                    mo12967j();
                } else if (z7) {
                    mo12968k();
                }
                i8 = i9;
            } catch (Throwable th) {
                this.f10769d = false;
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m12961d(d dVar) {
        if (dVar.f10781b) {
            if (!dVar.mo12972i()) {
                dVar.m12975b(false);
                return;
            }
            int i7 = dVar.f10782c;
            int i8 = this.f10772g;
            if (i7 >= i8) {
                return;
            }
            dVar.f10782c = i8;
            dVar.f10780a.mo8344a(this.f10770e);
        }
    }

    /* renamed from: e */
    public void m12962e(d dVar) {
        if (this.f10773h) {
            this.f10774i = true;
            return;
        }
        this.f10773h = true;
        do {
            this.f10774i = false;
            if (dVar != null) {
                m12961d(dVar);
                dVar = null;
            } else {
                C6040b.d m25096e = this.f10767b.m25096e();
                while (m25096e.hasNext()) {
                    m12961d((d) ((Map.Entry) m25096e.next()).getValue());
                    if (this.f10774i) {
                        break;
                    }
                }
            }
        } while (this.f10774i);
        this.f10773h = false;
    }

    /* renamed from: f */
    public Object m12963f() {
        Object obj = this.f10770e;
        if (obj != f10765k) {
            return obj;
        }
        return null;
    }

    /* renamed from: g */
    public boolean m12964g() {
        return this.f10768c > 0;
    }

    /* renamed from: h */
    public void m12965h(InterfaceC3349n interfaceC3349n, InterfaceC3356u interfaceC3356u) {
        m12959b("observe");
        if (interfaceC3349n.mo9642a().mo12928b() == AbstractC3345j.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC3349n, interfaceC3356u);
        d dVar = (d) this.f10767b.mo25092h(interfaceC3356u, cVar);
        if (dVar != null && !dVar.mo12974f(interfaceC3349n)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC3349n.mo9642a().mo12927a(cVar);
    }

    /* renamed from: i */
    public void m12966i(InterfaceC3356u interfaceC3356u) {
        m12959b("observeForever");
        b bVar = new b(interfaceC3356u);
        d dVar = (d) this.f10767b.mo25092h(interfaceC3356u, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.m12975b(true);
    }

    /* renamed from: j */
    public void mo12967j() {
    }

    /* renamed from: k */
    public void mo12968k() {
    }

    /* renamed from: l */
    public void mo12969l(Object obj) {
        boolean z6;
        synchronized (this.f10766a) {
            z6 = this.f10771f == f10765k;
            this.f10771f = obj;
        }
        if (z6) {
            C5790c.m24453f().mo24458c(this.f10775j);
        }
    }

    /* renamed from: m */
    public void mo12970m(InterfaceC3356u interfaceC3356u) {
        m12959b("removeObserver");
        d dVar = (d) this.f10767b.mo25093i(interfaceC3356u);
        if (dVar == null) {
            return;
        }
        dVar.mo12973e();
        dVar.m12975b(false);
    }

    /* renamed from: n */
    public void mo12971n(Object obj) {
        m12959b("setValue");
        this.f10772g++;
        this.f10770e = obj;
        m12962e(null);
    }
}

package p259j0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p232g0.C4326p;

/* renamed from: j0.n */
/* loaded from: classes.dex */
public final class C5345n {

    /* renamed from: a */
    public final InterfaceC5334c f18846a;

    /* renamed from: b */
    public final InterfaceC5342k f18847b;

    /* renamed from: c */
    public final b f18848c;

    /* renamed from: d */
    public final CopyOnWriteArraySet f18849d;

    /* renamed from: e */
    public final ArrayDeque f18850e;

    /* renamed from: f */
    public final ArrayDeque f18851f;

    /* renamed from: g */
    public final Object f18852g;

    /* renamed from: h */
    public boolean f18853h;

    /* renamed from: i */
    public boolean f18854i;

    /* renamed from: j0.n$a */
    public interface a {
        void invoke(Object obj);
    }

    /* renamed from: j0.n$b */
    public interface b {
        /* renamed from: a */
        void mo21856a(Object obj, C4326p c4326p);
    }

    /* renamed from: j0.n$c */
    public static final class c {

        /* renamed from: a */
        public final Object f18855a;

        /* renamed from: b */
        public C4326p.b f18856b = new C4326p.b();

        /* renamed from: c */
        public boolean f18857c;

        /* renamed from: d */
        public boolean f18858d;

        public c(Object obj) {
            this.f18855a = obj;
        }

        /* renamed from: a */
        public void m21857a(int i7, a aVar) {
            if (this.f18858d) {
                return;
            }
            if (i7 != -1) {
                this.f18856b.m18185a(i7);
            }
            this.f18857c = true;
            aVar.invoke(this.f18855a);
        }

        /* renamed from: b */
        public void m21858b(b bVar) {
            if (this.f18858d || !this.f18857c) {
                return;
            }
            C4326p m18189e = this.f18856b.m18189e();
            this.f18856b = new C4326p.b();
            this.f18857c = false;
            bVar.mo21856a(this.f18855a, m18189e);
        }

        /* renamed from: c */
        public void m21859c(b bVar) {
            this.f18858d = true;
            if (this.f18857c) {
                this.f18857c = false;
                bVar.mo21856a(this.f18855a, this.f18856b.m18189e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f18855a.equals(((c) obj).f18855a);
        }

        public int hashCode() {
            return this.f18855a.hashCode();
        }
    }

    public C5345n(Looper looper, InterfaceC5334c interfaceC5334c, b bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC5334c, bVar, true);
    }

    /* renamed from: h */
    public static /* synthetic */ void m21846h(CopyOnWriteArraySet copyOnWriteArraySet, int i7, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m21857a(i7, aVar);
        }
    }

    /* renamed from: c */
    public void m21847c(Object obj) {
        AbstractC5332a.m21800e(obj);
        synchronized (this.f18852g) {
            try {
                if (this.f18853h) {
                    return;
                }
                this.f18849d.add(new c(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public C5345n m21848d(Looper looper, InterfaceC5334c interfaceC5334c, b bVar) {
        return new C5345n(this.f18849d, looper, interfaceC5334c, bVar, this.f18854i);
    }

    /* renamed from: e */
    public C5345n m21849e(Looper looper, b bVar) {
        return m21848d(looper, this.f18846a, bVar);
    }

    /* renamed from: f */
    public void m21850f() {
        m21855l();
        if (this.f18851f.isEmpty()) {
            return;
        }
        if (!this.f18847b.mo21625e(1)) {
            InterfaceC5342k interfaceC5342k = this.f18847b;
            interfaceC5342k.mo21624d(interfaceC5342k.mo21623c(1));
        }
        boolean isEmpty = this.f18850e.isEmpty();
        this.f18850e.addAll(this.f18851f);
        this.f18851f.clear();
        if (isEmpty) {
            while (!this.f18850e.isEmpty()) {
                ((Runnable) this.f18850e.peekFirst()).run();
                this.f18850e.removeFirst();
            }
        }
    }

    /* renamed from: g */
    public final boolean m21851g(Message message) {
        Iterator it = this.f18849d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m21858b(this.f18848c);
            if (this.f18847b.mo21625e(1)) {
                break;
            }
        }
        return true;
    }

    /* renamed from: i */
    public void m21852i(final int i7, final a aVar) {
        m21855l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f18849d);
        this.f18851f.add(new Runnable() { // from class: j0.m
            @Override // java.lang.Runnable
            public final void run() {
                C5345n.m21846h(copyOnWriteArraySet, i7, aVar);
            }
        });
    }

    /* renamed from: j */
    public void m21853j() {
        m21855l();
        synchronized (this.f18852g) {
            this.f18853h = true;
        }
        Iterator it = this.f18849d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m21859c(this.f18848c);
        }
        this.f18849d.clear();
    }

    /* renamed from: k */
    public void m21854k(int i7, a aVar) {
        m21852i(i7, aVar);
        m21850f();
    }

    /* renamed from: l */
    public final void m21855l() {
        if (this.f18854i) {
            AbstractC5332a.m21802g(Thread.currentThread() == this.f18847b.mo21631k().getThread());
        }
    }

    public C5345n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC5334c interfaceC5334c, b bVar, boolean z6) {
        this.f18846a = interfaceC5334c;
        this.f18849d = copyOnWriteArraySet;
        this.f18848c = bVar;
        this.f18852g = new Object();
        this.f18850e = new ArrayDeque();
        this.f18851f = new ArrayDeque();
        this.f18847b = interfaceC5334c.mo21616e(looper, new Handler.Callback() { // from class: j0.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m21851g;
                m21851g = C5345n.this.m21851g(message);
                return m21851g;
            }
        });
        this.f18854i = z6;
    }
}

package p237g5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4446k0;
import p253i5.C4637v0;
import p256j$.util.DesugarCollections;
import p316p5.C6155l;

/* renamed from: g5.U */
/* loaded from: classes2.dex */
public final class C4419U {

    /* renamed from: d */
    public static C4419U f15666d;

    /* renamed from: a */
    public final LinkedHashSet f15668a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashMap f15669b = new LinkedHashMap();

    /* renamed from: c */
    public static final Logger f15665c = Logger.getLogger(C4419U.class.getName());

    /* renamed from: e */
    public static final Iterable f15667e = m18741c();

    /* renamed from: g5.U$a */
    public static final class a implements AbstractC4446k0.b {
        @Override // p237g5.AbstractC4446k0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo18746b(AbstractC4418T abstractC4418T) {
            return abstractC4418T.mo18737c();
        }

        @Override // p237g5.AbstractC4446k0.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo18745a(AbstractC4418T abstractC4418T) {
            return abstractC4418T.mo18738d();
        }
    }

    /* renamed from: b */
    public static synchronized C4419U m18740b() {
        C4419U c4419u;
        synchronized (C4419U.class) {
            try {
                if (f15666d == null) {
                    List<AbstractC4418T> m18943e = AbstractC4446k0.m18943e(AbstractC4418T.class, f15667e, AbstractC4418T.class.getClassLoader(), new a());
                    f15666d = new C4419U();
                    for (AbstractC4418T abstractC4418T : m18943e) {
                        f15665c.fine("Service loader found " + abstractC4418T);
                        f15666d.m18742a(abstractC4418T);
                    }
                    f15666d.m18744e();
                }
                c4419u = f15666d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4419u;
    }

    /* renamed from: c */
    public static List m18741c() {
        ArrayList arrayList = new ArrayList();
        try {
            boolean z6 = C4637v0.f17275b;
            arrayList.add(C4637v0.class);
        } catch (ClassNotFoundException e7) {
            f15665c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e7);
        }
        try {
            int i7 = C6155l.f22056b;
            arrayList.add(C6155l.class);
        } catch (ClassNotFoundException e8) {
            f15665c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e8);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final synchronized void m18742a(AbstractC4418T abstractC4418T) {
        AbstractC2932o.m10562e(abstractC4418T.mo18738d(), "isAvailable() returned false");
        this.f15668a.add(abstractC4418T);
    }

    /* renamed from: d */
    public synchronized AbstractC4418T m18743d(String str) {
        return (AbstractC4418T) this.f15669b.get(AbstractC2932o.m10573p(str, "policy"));
    }

    /* renamed from: e */
    public final synchronized void m18744e() {
        try {
            this.f15669b.clear();
            Iterator it = this.f15668a.iterator();
            while (it.hasNext()) {
                AbstractC4418T abstractC4418T = (AbstractC4418T) it.next();
                String mo18736b = abstractC4418T.mo18736b();
                AbstractC4418T abstractC4418T2 = (AbstractC4418T) this.f15669b.get(mo18736b);
                if (abstractC4418T2 != null && abstractC4418T2.mo18737c() >= abstractC4418T.mo18737c()) {
                }
                this.f15669b.put(mo18736b, abstractC4418T);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

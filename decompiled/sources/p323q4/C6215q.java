package p323q4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: q4.q */
/* loaded from: classes.dex */
public class C6215q implements InterfaceC6213o {

    /* renamed from: a */
    public final String f22214a;

    /* renamed from: b */
    public final int f22215b;

    /* renamed from: c */
    public final int f22216c;

    /* renamed from: d */
    public final LinkedList f22217d = new LinkedList();

    /* renamed from: e */
    public final Set f22218e = new HashSet();

    /* renamed from: f */
    public final Set f22219f = new HashSet();

    /* renamed from: g */
    public final Map f22220g = new HashMap();

    public C6215q(String str, int i7, int i8) {
        this.f22214a = str;
        this.f22215b = i7;
        this.f22216c = i8;
    }

    @Override // p323q4.InterfaceC6213o
    /* renamed from: a */
    public /* synthetic */ void mo25964a(C6207i c6207i, Runnable runnable) {
        AbstractC6212n.m25962a(this, c6207i, runnable);
    }

    @Override // p323q4.InterfaceC6213o
    /* renamed from: b */
    public synchronized void mo25965b(C6209k c6209k) {
        this.f22217d.add(c6209k);
        Iterator it = new HashSet(this.f22218e).iterator();
        while (it.hasNext()) {
            m25972i((C6211m) it.next());
        }
    }

    @Override // p323q4.InterfaceC6213o
    /* renamed from: c */
    public synchronized void mo25966c() {
        try {
            Iterator it = this.f22218e.iterator();
            while (it.hasNext()) {
                ((C6211m) it.next()).m25959f();
            }
            Iterator it2 = this.f22219f.iterator();
            while (it2.hasNext()) {
                ((C6211m) it2.next()).m25959f();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public C6211m m25968e(String str, int i7) {
        return new C6211m(str, i7);
    }

    /* renamed from: f */
    public final synchronized C6209k m25969f(C6211m c6211m) {
        C6209k c6209k;
        C6211m c6211m2;
        try {
            ListIterator listIterator = this.f22217d.listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                c6209k = (C6209k) listIterator.next();
                c6211m2 = c6209k.m25952a() != null ? (C6211m) this.f22220g.get(c6209k.m25952a()) : null;
                if (c6211m2 == null) {
                    break;
                }
            } while (c6211m2 != c6211m);
            listIterator.remove();
            return c6209k;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void m25970g(C6211m c6211m) {
        try {
            HashSet hashSet = new HashSet(this.f22218e);
            this.f22219f.remove(c6211m);
            this.f22218e.add(c6211m);
            if (!c6211m.m25955b() && c6211m.m25957d() != null) {
                this.f22220g.remove(c6211m.m25957d());
            }
            m25972i(c6211m);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                m25972i((C6211m) it.next());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i */
    public final synchronized void m25972i(C6211m c6211m) {
        try {
            C6209k m25969f = m25969f(c6211m);
            if (m25969f != null) {
                this.f22219f.add(c6211m);
                this.f22218e.remove(c6211m);
                if (m25969f.m25952a() != null) {
                    this.f22220g.put(m25969f.m25952a(), c6211m);
                }
                c6211m.m25958e(m25969f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p323q4.InterfaceC6213o
    public synchronized void start() {
        for (int i7 = 0; i7 < this.f22215b; i7++) {
            final C6211m m25968e = m25968e(this.f22214a + i7, this.f22216c);
            m25968e.m25960g(new Runnable() { // from class: q4.p
                @Override // java.lang.Runnable
                public final void run() {
                    C6215q.this.m25970g(m25968e);
                }
            });
            this.f22218e.add(m25968e);
        }
    }
}

package p081L3;

import java.util.Collections;
import java.util.Iterator;
import p088M3.C1170l;
import p376x3.C6950e;

/* renamed from: L3.o0 */
/* loaded from: classes.dex */
public class C1103o0 {

    /* renamed from: a */
    public C6950e f3615a = new C6950e(Collections.emptyList(), C1072e.f3520c);

    /* renamed from: b */
    public C6950e f3616b = new C6950e(Collections.emptyList(), C1072e.f3521d);

    /* renamed from: a */
    public void m4363a(C1170l c1170l, int i7) {
        C1072e c1072e = new C1072e(c1170l, i7);
        this.f3615a = this.f3615a.m28471e(c1072e);
        this.f3616b = this.f3616b.m28471e(c1072e);
    }

    /* renamed from: b */
    public void m4364b(C6950e c6950e, int i7) {
        Iterator it = c6950e.iterator();
        while (it.hasNext()) {
            m4363a((C1170l) it.next(), i7);
        }
    }

    /* renamed from: c */
    public boolean m4365c(C1170l c1170l) {
        Iterator m28472f = this.f3615a.m28472f(new C1072e(c1170l, 0));
        if (m28472f.hasNext()) {
            return ((C1072e) m28472f.next()).m4257d().equals(c1170l);
        }
        return false;
    }

    /* renamed from: d */
    public C6950e m4366d(int i7) {
        Iterator m28472f = this.f3616b.m28472f(new C1072e(C1170l.m4495g(), i7));
        C6950e m4496h = C1170l.m4496h();
        while (m28472f.hasNext()) {
            C1072e c1072e = (C1072e) m28472f.next();
            if (c1072e.m4256c() != i7) {
                break;
            }
            m4496h = m4496h.m28471e(c1072e.m4257d());
        }
        return m4496h;
    }

    /* renamed from: e */
    public final void m4367e(C1072e c1072e) {
        this.f3615a = this.f3615a.m28473g(c1072e);
        this.f3616b = this.f3616b.m28473g(c1072e);
    }

    /* renamed from: f */
    public void m4368f(C1170l c1170l, int i7) {
        m4367e(new C1072e(c1170l, i7));
    }

    /* renamed from: g */
    public void m4369g(C6950e c6950e, int i7) {
        Iterator it = c6950e.iterator();
        while (it.hasNext()) {
            m4368f((C1170l) it.next(), i7);
        }
    }

    /* renamed from: h */
    public C6950e m4370h(int i7) {
        Iterator m28472f = this.f3616b.m28472f(new C1072e(C1170l.m4495g(), i7));
        C6950e m4496h = C1170l.m4496h();
        while (m28472f.hasNext()) {
            C1072e c1072e = (C1072e) m28472f.next();
            if (c1072e.m4256c() != i7) {
                break;
            }
            m4496h = m4496h.m28471e(c1072e.m4257d());
            m4367e(c1072e);
        }
        return m4496h;
    }
}

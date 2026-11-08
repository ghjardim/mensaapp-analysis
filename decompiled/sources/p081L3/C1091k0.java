package p081L3;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p067J3.C0737c0;
import p067J3.C0747h0;
import p081L3.InterfaceC1096m;
import p088M3.AbstractC1175q;
import p088M3.C1181w;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p376x3.AbstractC6948c;
import p376x3.C6950e;

/* renamed from: L3.k0 */
/* loaded from: classes.dex */
public class C1091k0 {

    /* renamed from: a */
    public C1102o f3572a;

    /* renamed from: b */
    public InterfaceC1096m f3573b;

    /* renamed from: c */
    public boolean f3574c;

    /* renamed from: d */
    public boolean f3575d = false;

    /* renamed from: e */
    public int f3576e = 100;

    /* renamed from: f */
    public double f3577f = 2.0d;

    /* renamed from: a */
    public final AbstractC6948c m4307a(Iterable iterable, C0737c0 c0737c0, AbstractC1175q.a aVar) {
        AbstractC6948c m4355h = this.f3572a.m4355h(c0737c0, aVar);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC1167i interfaceC1167i = (InterfaceC1167i) it.next();
            m4355h = m4355h.mo28455h(interfaceC1167i.getKey(), interfaceC1167i);
        }
        return m4355h;
    }

    /* renamed from: b */
    public final C6950e m4308b(C0737c0 c0737c0, AbstractC6948c abstractC6948c) {
        C6950e c6950e = new C6950e(Collections.emptyList(), c0737c0.m3097c());
        Iterator it = abstractC6948c.iterator();
        while (it.hasNext()) {
            InterfaceC1167i interfaceC1167i = (InterfaceC1167i) ((Map.Entry) it.next()).getValue();
            if (c0737c0.m3115u(interfaceC1167i)) {
                c6950e = c6950e.m28471e(interfaceC1167i);
            }
        }
        return c6950e;
    }

    /* renamed from: c */
    public final void m4309c(C0737c0 c0737c0, C1088j0 c1088j0, int i7) {
        if (c1088j0.m4305a() < this.f3576e) {
            AbstractC2155x.m7309a("QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", c0737c0.toString(), Integer.valueOf(this.f3576e));
            return;
        }
        AbstractC2155x.m7309a("QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", c0737c0.toString(), Integer.valueOf(c1088j0.m4305a()), Integer.valueOf(i7));
        if (c1088j0.m4305a() > this.f3577f * i7) {
            this.f3573b.mo3973m(c0737c0.m3094D());
            AbstractC2155x.m7309a("QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", c0737c0.toString());
        }
    }

    /* renamed from: d */
    public final AbstractC6948c m4310d(C0737c0 c0737c0, C1088j0 c1088j0) {
        if (AbstractC2155x.m7311c()) {
            AbstractC2155x.m7309a("QueryEngine", "Using full collection scan to execute query: %s", c0737c0.toString());
        }
        return this.f3572a.m4356i(c0737c0, AbstractC1175q.a.f3767a, c1088j0);
    }

    /* renamed from: e */
    public AbstractC6948c m4311e(C0737c0 c0737c0, C1181w c1181w, C6950e c6950e) {
        AbstractC2133b.m7217d(this.f3574c, "initialize() not called", new Object[0]);
        AbstractC6948c m4314h = m4314h(c0737c0);
        if (m4314h != null) {
            return m4314h;
        }
        AbstractC6948c m4315i = m4315i(c0737c0, c6950e, c1181w);
        if (m4315i != null) {
            return m4315i;
        }
        C1088j0 c1088j0 = new C1088j0();
        AbstractC6948c m4310d = m4310d(c0737c0, c1088j0);
        if (m4310d != null && this.f3575d) {
            m4309c(c0737c0, c1088j0, m4310d.size());
        }
        return m4310d;
    }

    /* renamed from: f */
    public void m4312f(C1102o c1102o, InterfaceC1096m interfaceC1096m) {
        this.f3572a = c1102o;
        this.f3573b = interfaceC1096m;
        this.f3574c = true;
    }

    /* renamed from: g */
    public final boolean m4313g(C0737c0 c0737c0, int i7, C6950e c6950e, C1181w c1181w) {
        if (!c0737c0.m3110p()) {
            return false;
        }
        if (i7 != c6950e.size()) {
            return true;
        }
        InterfaceC1167i interfaceC1167i = c0737c0.m3106l() == C0737c0.a.LIMIT_TO_FIRST ? (InterfaceC1167i) c6950e.m28469a() : (InterfaceC1167i) c6950e.m28470b();
        if (interfaceC1167i == null) {
            return false;
        }
        return interfaceC1167i.mo4486g() || interfaceC1167i.mo4490k().compareTo(c1181w) > 0;
    }

    /* renamed from: h */
    public final AbstractC6948c m4314h(C0737c0 c0737c0) {
        if (c0737c0.m3116v()) {
            return null;
        }
        C0747h0 m3094D = c0737c0.m3094D();
        InterfaceC1096m.a mo3969i = this.f3573b.mo3969i(m3094D);
        if (mo3969i.equals(InterfaceC1096m.a.NONE)) {
            return null;
        }
        if (c0737c0.m3110p() && mo3969i.equals(InterfaceC1096m.a.PARTIAL)) {
            return m4314h(c0737c0.m3113s(-1L));
        }
        List mo3972l = this.f3573b.mo3972l(m3094D);
        AbstractC2133b.m7217d(mo3972l != null, "index manager must return results for partial and full indexes.", new Object[0]);
        AbstractC6948c m4351d = this.f3572a.m4351d(mo3972l);
        AbstractC1175q.a mo3967g = this.f3573b.mo3967g(m3094D);
        C6950e m4308b = m4308b(c0737c0, m4351d);
        return m4313g(c0737c0, mo3972l.size(), m4308b, mo3967g.mo4454l()) ? m4314h(c0737c0.m3113s(-1L)) : m4307a(m4308b, c0737c0, mo3967g);
    }

    /* renamed from: i */
    public final AbstractC6948c m4315i(C0737c0 c0737c0, C6950e c6950e, C1181w c1181w) {
        if (c0737c0.m3116v() || c1181w.equals(C1181w.f3793b)) {
            return null;
        }
        C6950e m4308b = m4308b(c0737c0, this.f3572a.m4351d(c6950e));
        if (m4313g(c0737c0, c6950e.size(), m4308b, c1181w)) {
            return null;
        }
        if (AbstractC2155x.m7311c()) {
            AbstractC2155x.m7309a("QueryEngine", "Re-using previous result from %s to execute query: %s", c1181w.toString(), c0737c0.toString());
        }
        return m4307a(m4308b, c0737c0, AbstractC1175q.a.m4523h(c1181w, -1));
    }

    /* renamed from: j */
    public void m4316j(boolean z6) {
        this.f3575d = z6;
    }
}

package p060I3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p046G3.C0410X;
import p088M3.AbstractC1168j;
import p088M3.C1170l;
import p088M3.C1177s;
import p116Q3.AbstractC2157z;
import p376x3.AbstractC6948c;
import p376x3.C6950e;

/* renamed from: I3.d */
/* loaded from: classes.dex */
public class C0642d {

    /* renamed from: a */
    public final InterfaceC0639a f2200a;

    /* renamed from: b */
    public final C0643e f2201b;

    /* renamed from: f */
    public long f2205f;

    /* renamed from: g */
    public C0646h f2206g;

    /* renamed from: c */
    public final List f2202c = new ArrayList();

    /* renamed from: e */
    public AbstractC6948c f2204e = AbstractC1168j.m4492b();

    /* renamed from: d */
    public final Map f2203d = new HashMap();

    public C0642d(InterfaceC0639a interfaceC0639a, C0643e c0643e) {
        this.f2200a = interfaceC0639a;
        this.f2201b = c0643e;
    }

    /* renamed from: a */
    public C0410X m2549a(InterfaceC0641c interfaceC0641c, long j7) {
        AbstractC2157z.m7328a(!(interfaceC0641c instanceof C0643e), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f2204e.size();
        if (interfaceC0641c instanceof C0648j) {
            this.f2202c.add((C0648j) interfaceC0641c);
        } else if (interfaceC0641c instanceof C0646h) {
            C0646h c0646h = (C0646h) interfaceC0641c;
            this.f2203d.put(c0646h.m2602b(), c0646h);
            this.f2206g = c0646h;
            if (!c0646h.m2601a()) {
                this.f2204e = this.f2204e.mo28455h(c0646h.m2602b(), C1177s.m4540r(c0646h.m2602b(), c0646h.m2604d()).m4548v(c0646h.m2604d()));
                this.f2206g = null;
            }
        } else if (interfaceC0641c instanceof C0640b) {
            C0640b c0640b = (C0640b) interfaceC0641c;
            if (this.f2206g == null || !c0640b.m2548b().equals(this.f2206g.m2602b())) {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
            this.f2204e = this.f2204e.mo28455h(c0640b.m2548b(), c0640b.m2547a().m4548v(this.f2206g.m2604d()));
            this.f2206g = null;
        }
        this.f2205f += j7;
        if (size != this.f2204e.size()) {
            return new C0410X(this.f2204e.size(), this.f2201b.m2556e(), this.f2205f, this.f2201b.m2555d(), null, C0410X.a.RUNNING);
        }
        return null;
    }

    /* renamed from: b */
    public AbstractC6948c m2550b() {
        AbstractC2157z.m7328a(this.f2206g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        AbstractC2157z.m7328a(this.f2201b.m2552a() != null, "Bundle ID must be set", new Object[0]);
        AbstractC2157z.m7328a(this.f2204e.size() == this.f2201b.m2556e(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.f2201b.m2556e()), Integer.valueOf(this.f2204e.size()));
        AbstractC6948c mo2546c = this.f2200a.mo2546c(this.f2204e, this.f2201b.m2552a());
        Map m2551c = m2551c();
        for (C0648j c0648j : this.f2202c) {
            this.f2200a.mo2544a(c0648j, (C6950e) m2551c.get(c0648j.m2608b()));
        }
        this.f2200a.mo2545b(this.f2201b);
        return mo2546c;
    }

    /* renamed from: c */
    public final Map m2551c() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f2202c.iterator();
        while (it.hasNext()) {
            hashMap.put(((C0648j) it.next()).m2608b(), C1170l.m4496h());
        }
        for (C0646h c0646h : this.f2203d.values()) {
            for (String str : c0646h.m2603c()) {
                hashMap.put(str, ((C6950e) hashMap.get(str)).m28471e(c0646h.m2602b()));
            }
        }
        return hashMap;
    }
}

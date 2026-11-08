package p095N3;

import com.google.protobuf.AbstractC4055i;
import java.util.List;
import p088M3.AbstractC1168j;
import p088M3.C1181w;
import p116Q3.AbstractC2133b;
import p376x3.AbstractC6948c;

/* renamed from: N3.h */
/* loaded from: classes.dex */
public final class C1268h {

    /* renamed from: a */
    public final C1267g f3999a;

    /* renamed from: b */
    public final C1181w f4000b;

    /* renamed from: c */
    public final List f4001c;

    /* renamed from: d */
    public final AbstractC4055i f4002d;

    /* renamed from: e */
    public final AbstractC6948c f4003e;

    public C1268h(C1267g c1267g, C1181w c1181w, List list, AbstractC4055i abstractC4055i, AbstractC6948c abstractC6948c) {
        this.f3999a = c1267g;
        this.f4000b = c1181w;
        this.f4001c = list;
        this.f4002d = abstractC4055i;
        this.f4003e = abstractC6948c;
    }

    /* renamed from: a */
    public static C1268h m4851a(C1267g c1267g, C1181w c1181w, List list, AbstractC4055i abstractC4055i) {
        AbstractC2133b.m7217d(c1267g.m4850h().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(c1267g.m4850h().size()), Integer.valueOf(list.size()));
        AbstractC6948c m4493c = AbstractC1168j.m4493c();
        List m4850h = c1267g.m4850h();
        AbstractC6948c abstractC6948c = m4493c;
        for (int i7 = 0; i7 < m4850h.size(); i7++) {
            abstractC6948c = abstractC6948c.mo28455h(((AbstractC1266f) m4850h.get(i7)).m4835g(), ((C1269i) list.get(i7)).m4858b());
        }
        return new C1268h(c1267g, c1181w, list, abstractC4055i, abstractC6948c);
    }

    /* renamed from: b */
    public C1267g m4852b() {
        return this.f3999a;
    }

    /* renamed from: c */
    public C1181w m4853c() {
        return this.f4000b;
    }

    /* renamed from: d */
    public AbstractC6948c m4854d() {
        return this.f4003e;
    }

    /* renamed from: e */
    public List m4855e() {
        return this.f4001c;
    }

    /* renamed from: f */
    public AbstractC4055i m4856f() {
        return this.f4002d;
    }
}

package p095N3;

import java.util.List;
import p088M3.AbstractC1184z;
import p219e3.C4188r;
import p256j$.util.DesugarCollections;
import p272k4.C5413D;
import p272k4.C5419b;

/* renamed from: N3.a */
/* loaded from: classes.dex */
public abstract class AbstractC1261a implements InterfaceC1276p {

    /* renamed from: a */
    public final List f3985a;

    /* renamed from: N3.a$a */
    public static class a extends AbstractC1261a {
        public a(List list) {
            super(list);
        }

        @Override // p095N3.AbstractC1261a
        /* renamed from: d */
        public C5413D mo4820d(C5413D c5413d) {
            C5419b.b m4816e = AbstractC1261a.m4816e(c5413d);
            for (C5413D c5413d2 : m4821f()) {
                int i7 = 0;
                while (i7 < m4816e.m22563z()) {
                    if (AbstractC1184z.m4608r(m4816e.m22562y(i7), c5413d2)) {
                        m4816e.m22559A(i7);
                    } else {
                        i7++;
                    }
                }
            }
            return (C5413D) C5413D.m22443x0().m22477x(m4816e).m17059n();
        }
    }

    /* renamed from: N3.a$b */
    public static class b extends AbstractC1261a {
        public b(List list) {
            super(list);
        }

        @Override // p095N3.AbstractC1261a
        /* renamed from: d */
        public C5413D mo4820d(C5413D c5413d) {
            C5419b.b m4816e = AbstractC1261a.m4816e(c5413d);
            for (C5413D c5413d2 : m4821f()) {
                if (!AbstractC1184z.m4607q(m4816e, c5413d2)) {
                    m4816e.m22561x(c5413d2);
                }
            }
            return (C5413D) C5413D.m22443x0().m22477x(m4816e).m17059n();
        }
    }

    public AbstractC1261a(List list) {
        this.f3985a = DesugarCollections.unmodifiableList(list);
    }

    /* renamed from: e */
    public static C5419b.b m4816e(C5413D c5413d) {
        return AbstractC1184z.m4611u(c5413d) ? (C5419b.b) c5413d.m22453l0().m17047Y() : C5419b.m22551j0();
    }

    @Override // p095N3.InterfaceC1276p
    /* renamed from: a */
    public C5413D mo4817a(C5413D c5413d) {
        return null;
    }

    @Override // p095N3.InterfaceC1276p
    /* renamed from: b */
    public C5413D mo4818b(C5413D c5413d, C5413D c5413d2) {
        return mo4820d(c5413d);
    }

    @Override // p095N3.InterfaceC1276p
    /* renamed from: c */
    public C5413D mo4819c(C5413D c5413d, C4188r c4188r) {
        return mo4820d(c5413d);
    }

    /* renamed from: d */
    public abstract C5413D mo4820d(C5413D c5413d);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3985a.equals(((AbstractC1261a) obj).f3985a);
    }

    /* renamed from: f */
    public List m4821f() {
        return this.f3985a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f3985a.hashCode();
    }
}

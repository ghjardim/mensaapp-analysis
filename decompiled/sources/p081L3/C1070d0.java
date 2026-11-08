package p081L3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
import p067J3.C0737c0;
import p088M3.AbstractC1168j;
import p088M3.AbstractC1175q;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1179u;
import p088M3.C1181w;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p376x3.AbstractC6948c;

/* renamed from: L3.d0 */
/* loaded from: classes.dex */
public final class C1070d0 implements InterfaceC1106p0 {

    /* renamed from: a */
    public AbstractC6948c f3515a = AbstractC1168j.m4491a();

    /* renamed from: b */
    public InterfaceC1096m f3516b;

    /* renamed from: L3.d0$b */
    public class b implements Iterable {

        /* renamed from: L3.d0$b$a */
        public class a implements Iterator {

            /* renamed from: a */
            public final /* synthetic */ Iterator f3518a;

            public a(Iterator it) {
                this.f3518a = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC1167i next() {
                return (InterfaceC1167i) ((Map.Entry) this.f3518a.next()).getValue();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f3518a.hasNext();
            }
        }

        public b() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(C1070d0.this.f3515a.iterator());
        }
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: a */
    public void mo4243a(InterfaceC1096m interfaceC1096m) {
        this.f3516b = interfaceC1096m;
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: b */
    public Map mo4244b(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            hashMap.put(c1170l, mo4246d(c1170l));
        }
        return hashMap;
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: c */
    public void mo4245c(C1177s c1177s, C1181w c1181w) {
        AbstractC2133b.m7217d(this.f3516b != null, "setIndexManager() not called", new Object[0]);
        AbstractC2133b.m7217d(!c1181w.equals(C1181w.f3793b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f3515a = this.f3515a.mo28455h(c1177s.getKey(), c1177s.mo4481b().m4548v(c1181w));
        this.f3516b.mo3970j(c1177s.getKey().m4503m());
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: d */
    public C1177s mo4246d(C1170l c1170l) {
        InterfaceC1167i interfaceC1167i = (InterfaceC1167i) this.f3515a.mo28451b(c1170l);
        return interfaceC1167i != null ? interfaceC1167i.mo4481b() : C1177s.m4539q(c1170l);
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: e */
    public Map mo4247e(C0737c0 c0737c0, AbstractC1175q.a aVar, Set set, C1088j0 c1088j0) {
        HashMap hashMap = new HashMap();
        Iterator mo28456i = this.f3515a.mo28456i(C1170l.m4498j((C1179u) c0737c0.m3108n().m4463f(StringUtils.EMPTY)));
        while (mo28456i.hasNext()) {
            Map.Entry entry = (Map.Entry) mo28456i.next();
            InterfaceC1167i interfaceC1167i = (InterfaceC1167i) entry.getValue();
            C1170l c1170l = (C1170l) entry.getKey();
            if (!c0737c0.m3108n().m4470p(c1170l.m4505o())) {
                break;
            }
            if (c1170l.m4505o().m4471q() <= c0737c0.m3108n().m4471q() + 1 && AbstractC1175q.a.m4524i(interfaceC1167i).compareTo(aVar) > 0 && (set.contains(interfaceC1167i.getKey()) || c0737c0.m3115u(interfaceC1167i))) {
                hashMap.put(interfaceC1167i.getKey(), interfaceC1167i.mo4481b());
            }
        }
        return hashMap;
    }

    @Override // p081L3.InterfaceC1106p0
    /* renamed from: f */
    public Map mo4248f(String str, AbstractC1175q.a aVar, int i7) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    /* renamed from: h */
    public long m4249h(C1105p c1105p) {
        long j7 = 0;
        while (new b().iterator().hasNext()) {
            j7 += c1105p.m4383m((InterfaceC1167i) r0.next()).mo16315b();
        }
        return j7;
    }

    /* renamed from: i */
    public Iterable m4250i() {
        return new b();
    }

    @Override // p081L3.InterfaceC1106p0
    public void removeAll(Collection collection) {
        AbstractC2133b.m7217d(this.f3516b != null, "setIndexManager() not called", new Object[0]);
        AbstractC6948c m4491a = AbstractC1168j.m4491a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            this.f3515a = this.f3515a.mo28457k(c1170l);
            m4491a = m4491a.mo28455h(c1170l, C1177s.m4540r(c1170l, C1181w.f3793b));
        }
        this.f3516b.mo3974n(m4491a);
    }
}

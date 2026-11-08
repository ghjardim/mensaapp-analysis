package p316p5;

import com.google.android.gms.common.api.C3643a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4417S;
import p237g5.EnumC4455p;
import p316p5.AbstractC6150g;

/* renamed from: p5.k */
/* loaded from: classes2.dex */
public class C6154k extends AbstractC6150g {

    /* renamed from: m */
    public final AtomicInteger f22051m;

    /* renamed from: n */
    public AbstractC4417S.j f22052n;

    /* renamed from: p5.k$a */
    public static final class a extends AbstractC4417S.j {
        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            return AbstractC4417S.f.m18706g();
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    /* renamed from: p5.k$b */
    public static class b extends AbstractC4417S.j {

        /* renamed from: a */
        public final List f22053a;

        /* renamed from: b */
        public final AtomicInteger f22054b;

        /* renamed from: c */
        public final int f22055c;

        public b(List list, AtomicInteger atomicInteger) {
            AbstractC2932o.m10562e(!list.isEmpty(), "empty list");
            this.f22053a = list;
            this.f22054b = (AtomicInteger) AbstractC2932o.m10573p(atomicInteger, "index");
            Iterator it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                i7 += ((AbstractC4417S.j) it.next()).hashCode();
            }
            this.f22055c = i7;
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            return ((AbstractC4417S.j) this.f22053a.get(m25717c())).mo18683a(gVar);
        }

        /* renamed from: c */
        public final int m25717c() {
            return (this.f22054b.getAndIncrement() & C3643a.e.API_PRIORITY_OTHER) % this.f22053a.size();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar == this) {
                return true;
            }
            return this.f22055c == bVar.f22055c && this.f22054b == bVar.f22054b && this.f22053a.size() == bVar.f22053a.size() && new HashSet(this.f22053a).containsAll(bVar.f22053a);
        }

        public int hashCode() {
            return this.f22055c;
        }

        public String toString() {
            return AbstractC2926i.m10534b(b.class).m10540d("subchannelPickers", this.f22053a).toString();
        }
    }

    public C6154k(AbstractC4417S.e eVar) {
        super(eVar);
        this.f22051m = new AtomicInteger(new Random().nextInt());
        this.f22052n = new a();
    }

    /* renamed from: x */
    private void m25715x(EnumC4455p enumC4455p, AbstractC4417S.j jVar) {
        if (enumC4455p == this.f21961k && jVar.equals(this.f22052n)) {
            return;
        }
        m25630p().mo18703f(enumC4455p, jVar);
        this.f21961k = enumC4455p;
        this.f22052n = jVar;
    }

    @Override // p316p5.AbstractC6150g
    /* renamed from: v */
    public void mo25636v() {
        List m25632r = m25632r();
        if (!m25632r.isEmpty()) {
            m25715x(EnumC4455p.READY, m25716w(m25632r));
            return;
        }
        Iterator it = m25628n().iterator();
        while (it.hasNext()) {
            EnumC4455p m25645i = ((AbstractC6150g.c) it.next()).m25645i();
            EnumC4455p enumC4455p = EnumC4455p.CONNECTING;
            if (m25645i == enumC4455p || m25645i == EnumC4455p.IDLE) {
                m25715x(enumC4455p, new a());
                return;
            }
        }
        m25715x(EnumC4455p.TRANSIENT_FAILURE, m25716w(m25628n()));
    }

    /* renamed from: w */
    public AbstractC4417S.j m25716w(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC6150g.c) it.next()).m25644h());
        }
        return new b(arrayList, this.f22051m);
    }
}

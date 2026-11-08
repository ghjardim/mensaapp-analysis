package p316p5;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2932o;
import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4418T;
import p237g5.C4425a;
import p237g5.C4448l0;
import p237g5.C4466x;
import p237g5.EnumC4455p;
import p253i5.C4637v0;

/* renamed from: p5.g */
/* loaded from: classes2.dex */
public abstract class AbstractC6150g extends AbstractC4417S {

    /* renamed from: l */
    public static final Logger f21956l = Logger.getLogger(AbstractC6150g.class.getName());

    /* renamed from: h */
    public final AbstractC4417S.e f21958h;

    /* renamed from: i */
    public boolean f21959i;

    /* renamed from: k */
    public EnumC4455p f21961k;

    /* renamed from: g */
    public final Map f21957g = new LinkedHashMap();

    /* renamed from: j */
    public final AbstractC4418T f21960j = new C4637v0();

    /* renamed from: p5.g$b */
    public static class b {

        /* renamed from: a */
        public final C4448l0 f21962a;

        /* renamed from: b */
        public final List f21963b;

        public b(C4448l0 c4448l0, List list) {
            this.f21962a = c4448l0;
            this.f21963b = list;
        }
    }

    /* renamed from: p5.g$c */
    public class c {

        /* renamed from: a */
        public final Object f21964a;

        /* renamed from: b */
        public AbstractC4417S.h f21965b;

        /* renamed from: c */
        public final Object f21966c;

        /* renamed from: d */
        public final C6148e f21967d;

        /* renamed from: e */
        public final AbstractC4418T f21968e;

        /* renamed from: f */
        public EnumC4455p f21969f;

        /* renamed from: g */
        public AbstractC4417S.j f21970g;

        /* renamed from: h */
        public boolean f21971h;

        /* renamed from: p5.g$c$a */
        public final class a extends AbstractC6146c {
            public a() {
            }

            @Override // p316p5.AbstractC6146c, p237g5.AbstractC4417S.e
            /* renamed from: f */
            public void mo18703f(EnumC4455p enumC4455p, AbstractC4417S.j jVar) {
                if (AbstractC6150g.this.f21957g.containsKey(c.this.f21964a)) {
                    c.this.f21969f = enumC4455p;
                    c.this.f21970g = jVar;
                    if (c.this.f21971h) {
                        return;
                    }
                    AbstractC6150g abstractC6150g = AbstractC6150g.this;
                    if (abstractC6150g.f21959i) {
                        return;
                    }
                    if (enumC4455p == EnumC4455p.IDLE && abstractC6150g.m25634t()) {
                        c.this.f21967d.mo18681e();
                    }
                    AbstractC6150g.this.mo25636v();
                }
            }

            @Override // p316p5.AbstractC6146c
            /* renamed from: g */
            public AbstractC4417S.e mo25607g() {
                return AbstractC6150g.this.f21958h;
            }
        }

        public c(AbstractC6150g abstractC6150g, Object obj, AbstractC4418T abstractC4418T, Object obj2, AbstractC4417S.j jVar) {
            this(obj, abstractC4418T, obj2, jVar, null, false);
        }

        /* renamed from: f */
        public void m25642f() {
            if (this.f21971h) {
                return;
            }
            AbstractC6150g.this.f21957g.remove(this.f21964a);
            this.f21971h = true;
            AbstractC6150g.f21956l.log(Level.FINE, "Child balancer {0} deactivated", this.f21964a);
        }

        /* renamed from: g */
        public Object m25643g() {
            return this.f21966c;
        }

        /* renamed from: h */
        public AbstractC4417S.j m25644h() {
            return this.f21970g;
        }

        /* renamed from: i */
        public EnumC4455p m25645i() {
            return this.f21969f;
        }

        /* renamed from: j */
        public AbstractC4418T m25646j() {
            return this.f21968e;
        }

        /* renamed from: k */
        public boolean m25647k() {
            return this.f21971h;
        }

        /* renamed from: l */
        public void m25648l(AbstractC4418T abstractC4418T) {
            this.f21971h = false;
        }

        /* renamed from: m */
        public void m25649m(AbstractC4417S.h hVar) {
            AbstractC2932o.m10573p(hVar, "Missing address list for child");
            this.f21965b = hVar;
        }

        /* renamed from: n */
        public void m25650n() {
            this.f21967d.mo18682f();
            this.f21969f = EnumC4455p.SHUTDOWN;
            AbstractC6150g.f21956l.log(Level.FINE, "Child balancer {0} deleted", this.f21964a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Address = ");
            sb.append(this.f21964a);
            sb.append(", state = ");
            sb.append(this.f21969f);
            sb.append(", picker type: ");
            sb.append(this.f21970g.getClass());
            sb.append(", lb: ");
            sb.append(this.f21967d.mo25606g().getClass());
            sb.append(this.f21971h ? ", deactivated" : StringUtils.EMPTY);
            return sb.toString();
        }

        public c(Object obj, AbstractC4418T abstractC4418T, Object obj2, AbstractC4417S.j jVar, AbstractC4417S.h hVar, boolean z6) {
            this.f21964a = obj;
            this.f21968e = abstractC4418T;
            this.f21971h = z6;
            this.f21970g = jVar;
            this.f21966c = obj2;
            C6148e c6148e = new C6148e(new a());
            this.f21967d = c6148e;
            this.f21969f = z6 ? EnumC4455p.IDLE : EnumC4455p.CONNECTING;
            this.f21965b = hVar;
            if (z6) {
                return;
            }
            c6148e.m25619r(abstractC4418T);
        }
    }

    /* renamed from: p5.g$d */
    public static class d {

        /* renamed from: a */
        public final String[] f21974a;

        /* renamed from: b */
        public final int f21975b;

        public d(C4466x c4466x) {
            AbstractC2932o.m10573p(c4466x, "eag");
            this.f21974a = new String[c4466x.m19034a().size()];
            Iterator it = c4466x.m19034a().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                this.f21974a[i7] = ((SocketAddress) it.next()).toString();
                i7++;
            }
            Arrays.sort(this.f21974a);
            this.f21975b = Arrays.hashCode(this.f21974a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (dVar.f21975b == this.f21975b) {
                String[] strArr = dVar.f21974a;
                int length = strArr.length;
                String[] strArr2 = this.f21974a;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f21975b;
        }

        public String toString() {
            return Arrays.toString(this.f21974a);
        }
    }

    public AbstractC6150g(AbstractC4417S.e eVar) {
        this.f21958h = (AbstractC4417S.e) AbstractC2932o.m10573p(eVar, "helper");
        f21956l.log(Level.FINE, "Created");
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: a */
    public C4448l0 mo18677a(AbstractC4417S.h hVar) {
        try {
            this.f21959i = true;
            b m25624g = m25624g(hVar);
            if (!m25624g.f21962a.m18961o()) {
                return m25624g.f21962a;
            }
            mo25636v();
            m25635u(m25624g.f21963b);
            return m25624g.f21962a;
        } finally {
            this.f21959i = false;
        }
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: c */
    public void mo18679c(C4448l0 c4448l0) {
        if (this.f21961k != EnumC4455p.READY) {
            this.f21958h.mo18703f(EnumC4455p.TRANSIENT_FAILURE, m25629o(c4448l0));
        }
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: f */
    public void mo18682f() {
        f21956l.log(Level.FINE, "Shutdown");
        Iterator it = this.f21957g.values().iterator();
        while (it.hasNext()) {
            ((c) it.next()).m25650n();
        }
        this.f21957g.clear();
    }

    /* renamed from: g */
    public b m25624g(AbstractC4417S.h hVar) {
        f21956l.log(Level.FINE, "Received resolution result: {0}", hVar);
        Map m25625k = m25625k(hVar);
        if (m25625k.isEmpty()) {
            C4448l0 m18963q = C4448l0.f15810t.m18963q("NameResolver returned no usable address. " + hVar);
            mo18679c(m18963q);
            return new b(m18963q, null);
        }
        for (Map.Entry entry : m25625k.entrySet()) {
            Object key = entry.getKey();
            AbstractC4418T m25646j = ((c) entry.getValue()).m25646j();
            Object m25643g = ((c) entry.getValue()).m25643g();
            if (this.f21957g.containsKey(key)) {
                c cVar = (c) this.f21957g.get(key);
                if (cVar.m25647k() && m25633s()) {
                    cVar.m25648l(m25646j);
                }
            } else {
                this.f21957g.put(key, (c) entry.getValue());
            }
            c cVar2 = (c) this.f21957g.get(key);
            AbstractC4417S.h m25627m = m25627m(key, hVar, m25643g);
            ((c) this.f21957g.get(key)).m25649m(m25627m);
            if (!cVar2.f21971h) {
                cVar2.f21967d.mo18680d(m25627m);
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3010Y it = AbstractC3033v.m11048p(this.f21957g.keySet()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!m25625k.containsKey(next)) {
                c cVar3 = (c) this.f21957g.get(next);
                cVar3.m25642f();
                arrayList.add(cVar3);
            }
        }
        return new b(C4448l0.f15795e, arrayList);
    }

    /* renamed from: k */
    public Map m25625k(AbstractC4417S.h hVar) {
        HashMap hashMap = new HashMap();
        Iterator it = hVar.m18717a().iterator();
        while (it.hasNext()) {
            d dVar = new d((C4466x) it.next());
            c cVar = (c) this.f21957g.get(dVar);
            if (cVar != null) {
                hashMap.put(dVar, cVar);
            } else {
                hashMap.put(dVar, m25626l(dVar, null, m25631q(), hVar));
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    public c m25626l(Object obj, Object obj2, AbstractC4417S.j jVar, AbstractC4417S.h hVar) {
        return new c(this, obj, this.f21960j, obj2, jVar);
    }

    /* renamed from: m */
    public AbstractC4417S.h m25627m(Object obj, AbstractC4417S.h hVar, Object obj2) {
        d dVar;
        C4466x c4466x;
        if (obj instanceof C4466x) {
            dVar = new d((C4466x) obj);
        } else {
            AbstractC2932o.m10562e(obj instanceof d, "key is wrong type");
            dVar = (d) obj;
        }
        Iterator it = hVar.m18717a().iterator();
        while (true) {
            if (!it.hasNext()) {
                c4466x = null;
                break;
            }
            c4466x = (C4466x) it.next();
            if (dVar.equals(new d(c4466x))) {
                break;
            }
        }
        AbstractC2932o.m10573p(c4466x, obj + " no longer present in load balancer children");
        return hVar.m18720e().m18722b(Collections.singletonList(c4466x)).m18723c(C4425a.m18818c().m18824d(AbstractC4417S.f15641e, Boolean.TRUE).m18821a()).m18724d(obj2).m18721a();
    }

    /* renamed from: n */
    public Collection m25628n() {
        return this.f21957g.values();
    }

    /* renamed from: o */
    public AbstractC4417S.j m25629o(C4448l0 c4448l0) {
        return new AbstractC4417S.d(AbstractC4417S.f.m18705f(c4448l0));
    }

    /* renamed from: p */
    public AbstractC4417S.e m25630p() {
        return this.f21958h;
    }

    /* renamed from: q */
    public AbstractC4417S.j m25631q() {
        return new AbstractC4417S.d(AbstractC4417S.f.m18706g());
    }

    /* renamed from: r */
    public List m25632r() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : m25628n()) {
            if (!cVar.m25647k() && cVar.m25645i() == EnumC4455p.READY) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public boolean m25633s() {
        return true;
    }

    /* renamed from: t */
    public boolean m25634t() {
        return true;
    }

    /* renamed from: u */
    public void m25635u(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m25650n();
        }
    }

    /* renamed from: v */
    public abstract void mo25636v();
}

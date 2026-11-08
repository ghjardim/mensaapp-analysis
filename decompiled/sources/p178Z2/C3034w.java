package p178Z2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import p178Z2.AbstractC3035x;
import p178Z2.AbstractC3036y;

/* renamed from: Z2.w */
/* loaded from: classes.dex */
public class C3034w extends AbstractC3036y implements InterfaceC2989C {

    /* renamed from: Z2.w$a */
    public static final class a extends AbstractC3036y.c {
        /* renamed from: d */
        public C3034w m11067d() {
            return (C3034w) super.m11099a();
        }

        /* renamed from: e */
        public a m11068e(Object obj, Object obj2) {
            super.m11101c(obj, obj2);
            return this;
        }
    }

    public C3034w(AbstractC3035x abstractC3035x, int i7) {
        super(abstractC3035x, i7);
    }

    /* renamed from: s */
    public static C3034w m11064s(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return m11065u();
        }
        AbstractC3035x.a aVar = new AbstractC3035x.a(collection.size());
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            AbstractC3033v m11048p = comparator == null ? AbstractC3033v.m11048p(collection2) : AbstractC3033v.m11042B(comparator, collection2);
            if (!m11048p.isEmpty()) {
                aVar.m11086f(key, m11048p);
                i7 += m11048p.size();
            }
        }
        return new C3034w(aVar.m11083c(), i7);
    }

    /* renamed from: u */
    public static C3034w m11065u() {
        return C3027p.f9301n;
    }

    @Override // p178Z2.InterfaceC2993G
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC3033v get(Object obj) {
        AbstractC3033v abstractC3033v = (AbstractC3033v) this.f9325e.get(obj);
        return abstractC3033v == null ? AbstractC3033v.m11050t() : abstractC3033v;
    }
}

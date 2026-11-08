package p310p;

import java.util.HashMap;
import java.util.Map;
import p310p.C6040b;

/* renamed from: p.a */
/* loaded from: classes.dex */
public class C6039a extends C6040b {

    /* renamed from: e */
    public final HashMap f21472e = new HashMap();

    @Override // p310p.C6040b
    /* renamed from: b */
    public C6040b.c mo25091b(Object obj) {
        return (C6040b.c) this.f21472e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f21472e.containsKey(obj);
    }

    @Override // p310p.C6040b
    /* renamed from: h */
    public Object mo25092h(Object obj, Object obj2) {
        C6040b.c mo25091b = mo25091b(obj);
        if (mo25091b != null) {
            return mo25091b.f21478b;
        }
        this.f21472e.put(obj, m25098g(obj, obj2));
        return null;
    }

    @Override // p310p.C6040b
    /* renamed from: i */
    public Object mo25093i(Object obj) {
        Object mo25093i = super.mo25093i(obj);
        this.f21472e.remove(obj);
        return mo25093i;
    }

    /* renamed from: k */
    public Map.Entry m25094k(Object obj) {
        if (contains(obj)) {
            return ((C6040b.c) this.f21472e.get(obj)).f21480d;
        }
        return null;
    }
}

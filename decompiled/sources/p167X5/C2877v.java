package p167X5;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p118Q5.AbstractC2216i;
import p118Q5.AbstractC2218k;
import p132S5.AbstractC2329G0;

/* renamed from: X5.v */
/* loaded from: classes2.dex */
public final class C2877v {

    /* renamed from: a */
    public static final C2877v f8865a;

    /* renamed from: b */
    public static final AbstractC2329G0 f8866b;

    static {
        C2877v c2877v = new C2877v();
        f8865a = c2877v;
        AbstractC2847H.m10267f("kotlinx.coroutines.fast.service.loader", true);
        f8866b = c2877v.m10389a();
    }

    /* renamed from: a */
    public final AbstractC2329G0 m10389a() {
        Object next;
        AbstractC2329G0 m10394e;
        try {
            List m7623i = AbstractC2218k.m7623i(AbstractC2216i.m7618d(ServiceLoader.load(InterfaceC2876u.class, InterfaceC2876u.class.getClassLoader()).iterator()));
            Iterator it = m7623i.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int mo8410c = ((InterfaceC2876u) next).mo8410c();
                    do {
                        Object next2 = it.next();
                        int mo8410c2 = ((InterfaceC2876u) next2).mo8410c();
                        if (mo8410c < mo8410c2) {
                            next = next2;
                            mo8410c = mo8410c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC2876u interfaceC2876u = (InterfaceC2876u) next;
            if (interfaceC2876u != null && (m10394e = AbstractC2878w.m10394e(interfaceC2876u, m7623i)) != null) {
                return m10394e;
            }
            return AbstractC2878w.m10391b(null, null, 3, null);
        } catch (Throwable th) {
            return AbstractC2878w.m10391b(th, null, 2, null);
        }
    }
}

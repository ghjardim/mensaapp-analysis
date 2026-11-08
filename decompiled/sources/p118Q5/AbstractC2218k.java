package p118Q5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p076K5.InterfaceC0834a;
import p378x5.AbstractC7023n;
import p378x5.AbstractC7024o;

/* renamed from: Q5.k */
/* loaded from: classes2.dex */
public abstract class AbstractC2218k extends AbstractC2217j {

    /* renamed from: Q5.k$a */
    public static final class a implements Iterable, InterfaceC0834a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC2210c f6794a;

        public a(InterfaceC2210c interfaceC2210c) {
            this.f6794a = interfaceC2210c;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f6794a.iterator();
        }
    }

    /* renamed from: h */
    public static Iterable m7622h(InterfaceC2210c interfaceC2210c) {
        AbstractC5469l.m23028e(interfaceC2210c, "<this>");
        return new a(interfaceC2210c);
    }

    /* renamed from: i */
    public static List m7623i(InterfaceC2210c interfaceC2210c) {
        AbstractC5469l.m23028e(interfaceC2210c, "<this>");
        Iterator it = interfaceC2210c.iterator();
        if (!it.hasNext()) {
            return AbstractC7024o.m28861g();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC7023n.m28856b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

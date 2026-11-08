package p378x5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: x5.t */
/* loaded from: classes2.dex */
public abstract class AbstractC7029t extends AbstractC7028s {
    /* renamed from: p */
    public static boolean m28870p(Collection collection, Iterable elements) {
        AbstractC5469l.m23028e(collection, "<this>");
        AbstractC5469l.m23028e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: q */
    public static boolean m28871q(Collection collection, Object[] elements) {
        AbstractC5469l.m23028e(collection, "<this>");
        AbstractC5469l.m23028e(elements, "elements");
        return collection.addAll(AbstractC7019j.m28793c(elements));
    }

    /* renamed from: r */
    public static final boolean m28872r(Iterable iterable, InterfaceC0800l interfaceC0800l, boolean z6) {
        Iterator it = iterable.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC0800l.invoke(it.next())).booleanValue() == z6) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    /* renamed from: s */
    public static Object m28873s(List list) {
        AbstractC5469l.m23028e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(AbstractC7024o.m28863i(list));
    }

    /* renamed from: t */
    public static boolean m28874t(Iterable iterable, InterfaceC0800l predicate) {
        AbstractC5469l.m23028e(iterable, "<this>");
        AbstractC5469l.m23028e(predicate, "predicate");
        return m28872r(iterable, predicate, false);
    }
}

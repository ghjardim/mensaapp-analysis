package p378x5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.C1419f;

/* renamed from: x5.o */
/* loaded from: classes2.dex */
public abstract class AbstractC7024o extends AbstractC7023n {
    /* renamed from: e */
    public static ArrayList m28859e(Object... elements) {
        AbstractC5469l.m23028e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C7015f(elements, true));
    }

    /* renamed from: f */
    public static final Collection m28860f(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<this>");
        return new C7015f(objArr, false);
    }

    /* renamed from: g */
    public static List m28861g() {
        return C7034y.f25085a;
    }

    /* renamed from: h */
    public static C1419f m28862h(Collection collection) {
        AbstractC5469l.m23028e(collection, "<this>");
        return new C1419f(0, collection.size() - 1);
    }

    /* renamed from: i */
    public static int m28863i(List list) {
        AbstractC5469l.m23028e(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: j */
    public static List m28864j(Object... elements) {
        AbstractC5469l.m23028e(elements, "elements");
        return elements.length > 0 ? AbstractC7019j.m28793c(elements) : m28861g();
    }

    /* renamed from: k */
    public static List m28865k(Object... elements) {
        AbstractC5469l.m23028e(elements, "elements");
        return AbstractC7020k.m28844q(elements);
    }

    /* renamed from: l */
    public static final List m28866l(List list) {
        AbstractC5469l.m23028e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC7023n.m28856b(list.get(0)) : m28861g();
    }

    /* renamed from: m */
    public static void m28867m() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

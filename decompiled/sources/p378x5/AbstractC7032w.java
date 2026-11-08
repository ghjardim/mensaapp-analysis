package p378x5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p069J5.InterfaceC0800l;
import p104O5.AbstractC1421h;
import p125R5.AbstractC2281g;
import p371w5.AbstractC6930m;

/* renamed from: x5.w */
/* loaded from: classes2.dex */
public abstract class AbstractC7032w extends AbstractC7031v {
    /* renamed from: A */
    public static final Appendable m28875A(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(iterable, "<this>");
        AbstractC5469l.m23028e(buffer, "buffer");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (Object obj : iterable) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            AbstractC2281g.m7725a(buffer, obj, interfaceC0800l);
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: B */
    public static /* synthetic */ Appendable m28876B(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        CharSequence charSequence5 = (i8 & 2) != 0 ? ", " : charSequence;
        int i9 = i8 & 4;
        CharSequence charSequence6 = StringUtils.EMPTY;
        CharSequence charSequence7 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return m28875A(iterable, appendable, charSequence5, charSequence7, charSequence6, (i8 & 16) != 0 ? -1 : i7, (i8 & 32) != 0 ? "..." : charSequence4, (i8 & 64) != 0 ? null : interfaceC0800l);
    }

    /* renamed from: C */
    public static final String m28877C(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC0800l interfaceC0800l) {
        AbstractC5469l.m23028e(iterable, "<this>");
        AbstractC5469l.m23028e(separator, "separator");
        AbstractC5469l.m23028e(prefix, "prefix");
        AbstractC5469l.m23028e(postfix, "postfix");
        AbstractC5469l.m23028e(truncated, "truncated");
        return ((StringBuilder) m28875A(iterable, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC0800l)).toString();
    }

    /* renamed from: D */
    public static /* synthetic */ String m28878D(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC0800l interfaceC0800l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        int i9 = i8 & 2;
        CharSequence charSequence5 = StringUtils.EMPTY;
        CharSequence charSequence6 = i9 != 0 ? StringUtils.EMPTY : charSequence2;
        if ((i8 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i10 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            interfaceC0800l = null;
        }
        return m28877C(iterable, charSequence, charSequence6, charSequence5, i10, charSequence7, interfaceC0800l);
    }

    /* renamed from: E */
    public static Object m28879E(List list) {
        AbstractC5469l.m23028e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC7024o.m28863i(list));
    }

    /* renamed from: F */
    public static Comparable m28880F(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: G */
    public static List m28881G(Collection collection, Iterable elements) {
        AbstractC5469l.m23028e(collection, "<this>");
        AbstractC5469l.m23028e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC7029t.m28870p(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: H */
    public static Object m28882H(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        if (iterable instanceof List) {
            return m28883I((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* renamed from: I */
    public static final Object m28883I(List list) {
        AbstractC5469l.m23028e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* renamed from: J */
    public static List m28884J(Iterable iterable, Comparator comparator) {
        AbstractC5469l.m23028e(iterable, "<this>");
        AbstractC5469l.m23028e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List m28891Q = m28891Q(iterable);
            AbstractC7028s.m28869o(m28891Q, comparator);
            return m28891Q;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m28889O(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC7019j.m28804n(array, comparator);
        return AbstractC7019j.m28793c(array);
    }

    /* renamed from: K */
    public static List m28885K(Iterable iterable, int i7) {
        AbstractC5469l.m23028e(iterable, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        }
        if (i7 == 0) {
            return AbstractC7024o.m28861g();
        }
        if (iterable instanceof Collection) {
            if (i7 >= ((Collection) iterable).size()) {
                return m28889O(iterable);
            }
            if (i7 == 1) {
                return AbstractC7023n.m28856b(m28897v(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i8++;
            if (i8 == i7) {
                break;
            }
        }
        return AbstractC7024o.m28866l(arrayList);
    }

    /* renamed from: L */
    public static byte[] m28886L(Collection collection) {
        AbstractC5469l.m23028e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            bArr[i7] = ((Number) it.next()).byteValue();
            i7++;
        }
        return bArr;
    }

    /* renamed from: M */
    public static final Collection m28887M(Iterable iterable, Collection destination) {
        AbstractC5469l.m23028e(iterable, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* renamed from: N */
    public static int[] m28888N(Collection collection) {
        AbstractC5469l.m23028e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    /* renamed from: O */
    public static List m28889O(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC7024o.m28866l(m28891Q(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC7024o.m28861g();
        }
        if (size != 1) {
            return m28892R(collection);
        }
        return AbstractC7023n.m28856b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* renamed from: P */
    public static long[] m28890P(Collection collection) {
        AbstractC5469l.m23028e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = ((Number) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    /* renamed from: Q */
    public static final List m28891Q(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        return iterable instanceof Collection ? m28892R((Collection) iterable) : (List) m28887M(iterable, new ArrayList());
    }

    /* renamed from: R */
    public static List m28892R(Collection collection) {
        AbstractC5469l.m23028e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: S */
    public static Set m28893S(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC7008H.m28757c((Set) m28887M(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC7008H.m28756b();
        }
        if (size != 1) {
            return (Set) m28887M(iterable, new LinkedHashSet(AbstractC7004D.m28732a(collection.size())));
        }
        return AbstractC7007G.m28755a(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* renamed from: T */
    public static List m28894T(Iterable iterable, int i7, int i8, boolean z6) {
        AbstractC5469l.m23028e(iterable, "<this>");
        AbstractC7009I.m28759a(i7, i8);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator m28760b = AbstractC7009I.m28760b(iterable.iterator(), i7, i8, z6, false);
            while (m28760b.hasNext()) {
                arrayList.add((List) m28760b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i8) + (size % i8 == 0 ? 0 : 1));
        int i9 = 0;
        while (i9 >= 0 && i9 < size) {
            int m5530c = AbstractC1421h.m5530c(i7, size - i9);
            if (m5530c < i7 && !z6) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(m5530c);
            for (int i10 = 0; i10 < m5530c; i10++) {
                arrayList3.add(list.get(i10 + i9));
            }
            arrayList2.add(arrayList3);
            i9 += i8;
        }
        return arrayList2;
    }

    /* renamed from: U */
    public static List m28895U(Iterable iterable, Iterable other) {
        AbstractC5469l.m23028e(iterable, "<this>");
        AbstractC5469l.m23028e(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC7025p.m28868n(iterable, 10), AbstractC7025p.m28868n(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(AbstractC6930m.m28383a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: u */
    public static boolean m28896u(Iterable iterable, Object obj) {
        AbstractC5469l.m23028e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : m28901z(iterable, obj) >= 0;
    }

    /* renamed from: v */
    public static final Object m28897v(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        if (iterable instanceof List) {
            return m28898w((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: w */
    public static final Object m28898w(List list) {
        AbstractC5469l.m23028e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: x */
    public static Object m28899x(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: y */
    public static Object m28900y(List list) {
        AbstractC5469l.m23028e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: z */
    public static final int m28901z(Iterable iterable, Object obj) {
        AbstractC5469l.m23028e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i7 = 0;
        for (Object obj2 : iterable) {
            if (i7 < 0) {
                AbstractC7024o.m28867m();
            }
            if (AbstractC5469l.m23024a(obj, obj2)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }
}

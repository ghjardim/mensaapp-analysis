package p378x5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: x5.n */
/* loaded from: classes2.dex */
public abstract class AbstractC7023n {
    /* renamed from: a */
    public static final Object[] m28855a(Object[] objArr, boolean z6) {
        AbstractC5469l.m23028e(objArr, "<this>");
        if (z6 && AbstractC5469l.m23024a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC5469l.m23027d(copyOf, "copyOf(...)");
        return copyOf;
    }

    /* renamed from: b */
    public static List m28856b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC5469l.m23027d(singletonList, "singletonList(...)");
        return singletonList;
    }

    /* renamed from: c */
    public static List m28857c(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        List m28891Q = AbstractC7032w.m28891Q(iterable);
        Collections.shuffle(m28891Q);
        return m28891Q;
    }

    /* renamed from: d */
    public static final Object[] m28858d(int i7, Object[] array) {
        AbstractC5469l.m23028e(array, "array");
        if (i7 < array.length) {
            array[i7] = null;
        }
        return array;
    }
}

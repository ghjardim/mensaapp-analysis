package p334s;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC5469l;
import p342t.AbstractC6404a;

/* renamed from: s.d */
/* loaded from: classes.dex */
public abstract class AbstractC6311d {
    /* renamed from: a */
    public static final void m26428a(C6309b c6309b, int i7) {
        AbstractC5469l.m23028e(c6309b, "<this>");
        c6309b.m26424k(new int[i7]);
        c6309b.m26423i(new Object[i7]);
    }

    /* renamed from: b */
    public static final int m26429b(C6309b c6309b, int i7) {
        AbstractC5469l.m23028e(c6309b, "<this>");
        try {
            return AbstractC6404a.m26746a(c6309b.m26419e(), c6309b.m26421g(), i7);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public static final int m26430c(C6309b c6309b, Object obj, int i7) {
        AbstractC5469l.m23028e(c6309b, "<this>");
        int m26421g = c6309b.m26421g();
        if (m26421g == 0) {
            return -1;
        }
        int m26429b = m26429b(c6309b, i7);
        if (m26429b < 0) {
            return m26429b;
        }
        if (AbstractC5469l.m23024a(obj, c6309b.m26418b()[m26429b])) {
            return m26429b;
        }
        int i8 = m26429b + 1;
        while (i8 < m26421g && c6309b.m26419e()[i8] == i7) {
            if (AbstractC5469l.m23024a(obj, c6309b.m26418b()[i8])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = m26429b - 1; i9 >= 0 && c6309b.m26419e()[i9] == i7; i9--) {
            if (AbstractC5469l.m23024a(obj, c6309b.m26418b()[i9])) {
                return i9;
            }
        }
        return ~i8;
    }

    /* renamed from: d */
    public static final int m26431d(C6309b c6309b) {
        AbstractC5469l.m23028e(c6309b, "<this>");
        return m26430c(c6309b, null, 0);
    }
}

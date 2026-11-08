package p171Y2;

import java.io.IOException;
import java.util.Iterator;
import p256j$.util.Objects;

/* renamed from: Y2.h */
/* loaded from: classes.dex */
public class C2925h {

    /* renamed from: a */
    public final String f9014a;

    public C2925h(String str) {
        this.f9014a = (String) AbstractC2932o.m10572o(str);
    }

    /* renamed from: f */
    public static C2925h m10525f(char c7) {
        return new C2925h(String.valueOf(c7));
    }

    /* renamed from: g */
    public static C2925h m10526g(String str) {
        return new C2925h(str);
    }

    /* renamed from: a */
    public Appendable m10527a(Appendable appendable, Iterator it) {
        AbstractC2932o.m10572o(appendable);
        if (it.hasNext()) {
            appendable.append(m10532h(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f9014a);
                appendable.append(m10532h(it.next()));
            }
        }
        return appendable;
    }

    /* renamed from: b */
    public final StringBuilder m10528b(StringBuilder sb, Iterable iterable) {
        return m10529c(sb, iterable.iterator());
    }

    /* renamed from: c */
    public final StringBuilder m10529c(StringBuilder sb, Iterator it) {
        try {
            m10527a(sb, it);
            return sb;
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    /* renamed from: d */
    public final String m10530d(Iterable iterable) {
        return m10531e(iterable.iterator());
    }

    /* renamed from: e */
    public final String m10531e(Iterator it) {
        return m10529c(new StringBuilder(), it).toString();
    }

    /* renamed from: h */
    public CharSequence m10532h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}

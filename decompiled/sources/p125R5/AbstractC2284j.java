package p125R5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p069J5.InterfaceC0800l;
import p378x5.AbstractC7024o;
import p378x5.AbstractC7025p;
import p378x5.AbstractC7032w;

/* renamed from: R5.j */
/* loaded from: classes2.dex */
public abstract class AbstractC2284j extends AbstractC2281g {
    /* renamed from: d */
    public static final InterfaceC0800l m7728d(final String str) {
        return str.length() == 0 ? new InterfaceC0800l() { // from class: R5.h
            @Override // p069J5.InterfaceC0800l
            public final Object invoke(Object obj) {
                String m7729e;
                m7729e = AbstractC2284j.m7729e((String) obj);
                return m7729e;
            }
        } : new InterfaceC0800l() { // from class: R5.i
            @Override // p069J5.InterfaceC0800l
            public final Object invoke(Object obj) {
                String m7730f;
                m7730f = AbstractC2284j.m7730f(str, (String) obj);
                return m7730f;
            }
        };
    }

    /* renamed from: e */
    public static final String m7729e(String line) {
        AbstractC5469l.m23028e(line, "line");
        return line;
    }

    /* renamed from: f */
    public static final String m7730f(String str, String line) {
        AbstractC5469l.m23028e(line, "line");
        return str + line;
    }

    /* renamed from: g */
    public static final int m7731g(String str) {
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (!AbstractC2275a.m7713c(str.charAt(i7))) {
                break;
            }
            i7++;
        }
        return i7 == -1 ? str.length() : i7;
    }

    /* renamed from: h */
    public static final String m7732h(String str, String newIndent) {
        String str2;
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(newIndent, "newIndent");
        List m7763R = AbstractC2294t.m7763R(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m7763R) {
            if (!AbstractC2294t.m7756K((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7025p.m28868n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m7731g((String) it.next())));
        }
        Integer num = (Integer) AbstractC7032w.m28880F(arrayList2);
        int i7 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * m7763R.size());
        InterfaceC0800l m7728d = m7728d(newIndent);
        int m28863i = AbstractC7024o.m28863i(m7763R);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : m7763R) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC7024o.m28867m();
            }
            String str3 = (String) obj2;
            if ((i7 == 0 || i7 == m28863i) && AbstractC2294t.m7756K(str3)) {
                str3 = null;
            } else {
                String m7794r0 = AbstractC2296v.m7794r0(str3, intValue);
                if (m7794r0 != null && (str2 = (String) m7728d.invoke(m7794r0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i7 = i8;
        }
        return ((StringBuilder) AbstractC7032w.m28876B(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    /* renamed from: i */
    public static String m7733i(String str) {
        AbstractC5469l.m23028e(str, "<this>");
        return m7732h(str, StringUtils.EMPTY);
    }
}

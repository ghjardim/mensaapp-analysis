package p125R5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0804p;
import p104O5.AbstractC1421h;
import p104O5.C1417d;
import p104O5.C1419f;
import p118Q5.AbstractC2218k;
import p118Q5.InterfaceC2210c;
import p371w5.AbstractC6930m;
import p371w5.C6926i;
import p378x5.AbstractC7019j;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7023n;
import p378x5.AbstractC7025p;
import p378x5.AbstractC7032w;

/* renamed from: R5.t */
/* loaded from: classes2.dex */
public abstract class AbstractC2294t extends AbstractC2291q {

    /* renamed from: R5.t$a */
    public static final class a implements InterfaceC2210c {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f6950a;

        public a(CharSequence charSequence) {
            this.f6950a = charSequence;
        }

        @Override // p118Q5.InterfaceC2210c
        public Iterator iterator() {
            return new C2279e(this.f6950a);
        }
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m7746A(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return m7792y(charSequence, charSequence2, z6);
    }

    /* renamed from: B */
    public static final C6926i m7747B(CharSequence charSequence, Collection collection, int i7, boolean z6, boolean z7) {
        Object obj;
        Object obj2;
        if (!z6 && collection.size() == 1) {
            String str = (String) AbstractC7032w.m28882H(collection);
            int m7754I = !z7 ? m7754I(charSequence, str, i7, false, 4, null) : m7760O(charSequence, str, i7, false, 4, null);
            if (m7754I < 0) {
                return null;
            }
            return AbstractC6930m.m28383a(Integer.valueOf(m7754I), str);
        }
        C1417d c1419f = !z7 ? new C1419f(AbstractC1421h.m5528a(i7, 0), charSequence.length()) : AbstractC1421h.m5533f(AbstractC1421h.m5530c(i7, m7748C(charSequence)), 0);
        if (charSequence instanceof String) {
            int m5518a = c1419f.m5518a();
            int m5519b = c1419f.m5519b();
            int m5520e = c1419f.m5520e();
            if ((m5520e > 0 && m5518a <= m5519b) || (m5520e < 0 && m5519b <= m5518a)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (AbstractC2291q.m7741q(str2, 0, (String) charSequence, m5518a, str2.length(), z6)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (m5518a == m5519b) {
                            break;
                        }
                        m5518a += m5520e;
                    } else {
                        return AbstractC6930m.m28383a(Integer.valueOf(m5518a), str3);
                    }
                }
            }
        } else {
            int m5518a2 = c1419f.m5518a();
            int m5519b2 = c1419f.m5519b();
            int m5520e2 = c1419f.m5520e();
            if ((m5520e2 > 0 && m5518a2 <= m5519b2) || (m5520e2 < 0 && m5519b2 <= m5518a2)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (m7773b0(str4, 0, charSequence, m5518a2, str4.length(), z6)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (m5518a2 == m5519b2) {
                            break;
                        }
                        m5518a2 += m5520e2;
                    } else {
                        return AbstractC6930m.m28383a(Integer.valueOf(m5518a2), str5);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public static final int m7748C(CharSequence charSequence) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: D */
    public static final int m7749D(CharSequence charSequence, char c7, int i7, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? m7755J(charSequence, new char[]{c7}, i7, z6) : ((String) charSequence).indexOf(c7, i7);
    }

    /* renamed from: E */
    public static final int m7750E(CharSequence charSequence, String string, int i7, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(string, "string");
        return (z6 || !(charSequence instanceof String)) ? m7752G(charSequence, string, i7, charSequence.length(), z6, false, 16, null) : ((String) charSequence).indexOf(string, i7);
    }

    /* renamed from: F */
    public static final int m7751F(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7) {
        C1417d c1419f = !z7 ? new C1419f(AbstractC1421h.m5528a(i7, 0), AbstractC1421h.m5530c(i8, charSequence.length())) : AbstractC1421h.m5533f(AbstractC1421h.m5530c(i7, m7748C(charSequence)), AbstractC1421h.m5528a(i8, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int m5518a = c1419f.m5518a();
            int m5519b = c1419f.m5519b();
            int m5520e = c1419f.m5520e();
            if ((m5520e <= 0 || m5518a > m5519b) && (m5520e >= 0 || m5519b > m5518a)) {
                return -1;
            }
            while (!m7773b0(charSequence2, 0, charSequence, m5518a, charSequence2.length(), z6)) {
                if (m5518a == m5519b) {
                    return -1;
                }
                m5518a += m5520e;
            }
            return m5518a;
        }
        int m5518a2 = c1419f.m5518a();
        int m5519b2 = c1419f.m5519b();
        int m5520e2 = c1419f.m5520e();
        if ((m5520e2 <= 0 || m5518a2 > m5519b2) && (m5520e2 >= 0 || m5519b2 > m5518a2)) {
            return -1;
        }
        while (true) {
            String str = (String) charSequence2;
            if (AbstractC2291q.m7741q(str, 0, (String) charSequence, m5518a2, str.length(), z6)) {
                return m5518a2;
            }
            if (m5518a2 == m5519b2) {
                return -1;
            }
            m5518a2 += m5520e2;
        }
    }

    /* renamed from: G */
    public static /* synthetic */ int m7752G(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            z7 = false;
        }
        return m7751F(charSequence, charSequence2, i7, i8, z6, z7);
    }

    /* renamed from: H */
    public static /* synthetic */ int m7753H(CharSequence charSequence, char c7, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return m7749D(charSequence, c7, i7, z6);
    }

    /* renamed from: I */
    public static /* synthetic */ int m7754I(CharSequence charSequence, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return m7750E(charSequence, str, i7, z6);
    }

    /* renamed from: J */
    public static final int m7755J(CharSequence charSequence, char[] chars, int i7, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(chars, "chars");
        if (!z6 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC7020k.m28823S(chars), i7);
        }
        int m5528a = AbstractC1421h.m5528a(i7, 0);
        int m7748C = m7748C(charSequence);
        if (m5528a > m7748C) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(m5528a);
            for (char c7 : chars) {
                if (AbstractC2276b.m7714d(c7, charAt, z6)) {
                    return m5528a;
                }
            }
            if (m5528a == m7748C) {
                return -1;
            }
            m5528a++;
        }
    }

    /* renamed from: K */
    public static boolean m7756K(CharSequence charSequence) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!AbstractC2275a.m7713c(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public static final int m7757L(CharSequence charSequence, char c7, int i7, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? m7761P(charSequence, new char[]{c7}, i7, z6) : ((String) charSequence).lastIndexOf(c7, i7);
    }

    /* renamed from: M */
    public static final int m7758M(CharSequence charSequence, String string, int i7, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(string, "string");
        return (z6 || !(charSequence instanceof String)) ? m7751F(charSequence, string, i7, 0, z6, true) : ((String) charSequence).lastIndexOf(string, i7);
    }

    /* renamed from: N */
    public static /* synthetic */ int m7759N(CharSequence charSequence, char c7, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = m7748C(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return m7757L(charSequence, c7, i7, z6);
    }

    /* renamed from: O */
    public static /* synthetic */ int m7760O(CharSequence charSequence, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = m7748C(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return m7758M(charSequence, str, i7, z6);
    }

    /* renamed from: P */
    public static final int m7761P(CharSequence charSequence, char[] chars, int i7, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(chars, "chars");
        if (!z6 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC7020k.m28823S(chars), i7);
        }
        for (int m5530c = AbstractC1421h.m5530c(i7, m7748C(charSequence)); -1 < m5530c; m5530c--) {
            char charAt = charSequence.charAt(m5530c);
            for (char c7 : chars) {
                if (AbstractC2276b.m7714d(c7, charAt, z6)) {
                    return m5530c;
                }
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public static final InterfaceC2210c m7762Q(CharSequence charSequence) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        return new a(charSequence);
    }

    /* renamed from: R */
    public static final List m7763R(CharSequence charSequence) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        return AbstractC2218k.m7623i(m7762Q(charSequence));
    }

    /* renamed from: S */
    public static final CharSequence m7764S(CharSequence charSequence, int i7, char c7) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException("Desired length " + i7 + " is less than zero.");
        }
        if (i7 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i7);
        sb.append(charSequence);
        int length = i7 - charSequence.length();
        int i8 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c7);
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return sb;
    }

    /* renamed from: T */
    public static final String m7765T(String str, int i7, char c7) {
        AbstractC5469l.m23028e(str, "<this>");
        return m7764S(str, i7, c7).toString();
    }

    /* renamed from: U */
    public static /* synthetic */ String m7766U(String str, int i7, char c7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            c7 = ' ';
        }
        return m7765T(str, i7, c7);
    }

    /* renamed from: V */
    public static final InterfaceC2210c m7767V(CharSequence charSequence, final char[] cArr, int i7, final boolean z6, int i8) {
        m7774c0(i8);
        return new C2278d(charSequence, i7, i8, new InterfaceC0804p() { // from class: R5.r
            @Override // p069J5.InterfaceC0804p
            public final Object invoke(Object obj, Object obj2) {
                C6926i m7771Z;
                m7771Z = AbstractC2294t.m7771Z(cArr, z6, (CharSequence) obj, ((Integer) obj2).intValue());
                return m7771Z;
            }
        });
    }

    /* renamed from: W */
    public static final InterfaceC2210c m7768W(CharSequence charSequence, String[] strArr, int i7, final boolean z6, int i8) {
        m7774c0(i8);
        final List m28793c = AbstractC7019j.m28793c(strArr);
        return new C2278d(charSequence, i7, i8, new InterfaceC0804p() { // from class: R5.s
            @Override // p069J5.InterfaceC0804p
            public final Object invoke(Object obj, Object obj2) {
                C6926i m7772a0;
                m7772a0 = AbstractC2294t.m7772a0(m28793c, z6, (CharSequence) obj, ((Integer) obj2).intValue());
                return m7772a0;
            }
        });
    }

    /* renamed from: X */
    public static /* synthetic */ InterfaceC2210c m7769X(CharSequence charSequence, char[] cArr, int i7, boolean z6, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return m7767V(charSequence, cArr, i7, z6, i8);
    }

    /* renamed from: Y */
    public static /* synthetic */ InterfaceC2210c m7770Y(CharSequence charSequence, String[] strArr, int i7, boolean z6, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return m7768W(charSequence, strArr, i7, z6, i8);
    }

    /* renamed from: Z */
    public static final C6926i m7771Z(char[] cArr, boolean z6, CharSequence DelimitedRangesSequence, int i7) {
        AbstractC5469l.m23028e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int m7755J = m7755J(DelimitedRangesSequence, cArr, i7, z6);
        if (m7755J < 0) {
            return null;
        }
        return AbstractC6930m.m28383a(Integer.valueOf(m7755J), 1);
    }

    /* renamed from: a0 */
    public static final C6926i m7772a0(List list, boolean z6, CharSequence DelimitedRangesSequence, int i7) {
        AbstractC5469l.m23028e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        C6926i m7747B = m7747B(DelimitedRangesSequence, list, i7, z6, false);
        if (m7747B != null) {
            return AbstractC6930m.m28383a(m7747B.m28370c(), Integer.valueOf(((String) m7747B.m28371d()).length()));
        }
        return null;
    }

    /* renamed from: b0 */
    public static final boolean m7773b0(CharSequence charSequence, int i7, CharSequence other, int i8, int i9, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(other, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > other.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!AbstractC2276b.m7714d(charSequence.charAt(i7 + i10), other.charAt(i8 + i10), z6)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c0 */
    public static final void m7774c0(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i7).toString());
    }

    /* renamed from: d0 */
    public static final List m7775d0(CharSequence charSequence, char[] delimiters, boolean z6, int i7) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m7777f0(charSequence, String.valueOf(delimiters[0]), z6, i7);
        }
        Iterable m7622h = AbstractC2218k.m7622h(m7769X(charSequence, delimiters, 0, z6, i7, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC7025p.m28868n(m7622h, 10));
        Iterator it = m7622h.iterator();
        while (it.hasNext()) {
            arrayList.add(m7780i0(charSequence, (C1419f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public static final List m7776e0(CharSequence charSequence, String[] delimiters, boolean z6, int i7) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return m7777f0(charSequence, str, z6, i7);
            }
        }
        Iterable m7622h = AbstractC2218k.m7622h(m7770Y(charSequence, delimiters, 0, z6, i7, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC7025p.m28868n(m7622h, 10));
        Iterator it = m7622h.iterator();
        while (it.hasNext()) {
            arrayList.add(m7780i0(charSequence, (C1419f) it.next()));
        }
        return arrayList;
    }

    /* renamed from: f0 */
    public static final List m7777f0(CharSequence charSequence, String str, boolean z6, int i7) {
        m7774c0(i7);
        int i8 = 0;
        int m7750E = m7750E(charSequence, str, 0, z6);
        if (m7750E == -1 || i7 == 1) {
            return AbstractC7023n.m28856b(charSequence.toString());
        }
        boolean z7 = i7 > 0;
        ArrayList arrayList = new ArrayList(z7 ? AbstractC1421h.m5530c(i7, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i8, m7750E).toString());
            i8 = str.length() + m7750E;
            if (z7 && arrayList.size() == i7 - 1) {
                break;
            }
            m7750E = m7750E(charSequence, str, i8, z6);
        } while (m7750E != -1);
        arrayList.add(charSequence.subSequence(i8, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: g0 */
    public static /* synthetic */ List m7778g0(CharSequence charSequence, char[] cArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return m7775d0(charSequence, cArr, z6, i7);
    }

    /* renamed from: h0 */
    public static /* synthetic */ List m7779h0(CharSequence charSequence, String[] strArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return m7776e0(charSequence, strArr, z6, i7);
    }

    /* renamed from: i0 */
    public static final String m7780i0(CharSequence charSequence, C1419f range) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(range, "range");
        return charSequence.subSequence(range.m5526i().intValue(), range.m5525h().intValue() + 1).toString();
    }

    /* renamed from: j0 */
    public static final String m7781j0(String str, char c7, String missingDelimiterValue) {
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(missingDelimiterValue, "missingDelimiterValue");
        int m7753H = m7753H(str, c7, 0, false, 6, null);
        if (m7753H == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m7753H + 1, str.length());
        AbstractC5469l.m23027d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: k0 */
    public static String m7782k0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(delimiter, "delimiter");
        AbstractC5469l.m23028e(missingDelimiterValue, "missingDelimiterValue");
        int m7754I = m7754I(str, delimiter, 0, false, 6, null);
        if (m7754I == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m7754I + delimiter.length(), str.length());
        AbstractC5469l.m23027d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: l0 */
    public static /* synthetic */ String m7783l0(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return m7781j0(str, c7, str2);
    }

    /* renamed from: m0 */
    public static /* synthetic */ String m7784m0(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return m7782k0(str, str2, str3);
    }

    /* renamed from: n0 */
    public static String m7785n0(String str, char c7, String missingDelimiterValue) {
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(missingDelimiterValue, "missingDelimiterValue");
        int m7759N = m7759N(str, c7, 0, false, 6, null);
        if (m7759N == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(m7759N + 1, str.length());
        AbstractC5469l.m23027d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: o0 */
    public static /* synthetic */ String m7786o0(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return m7785n0(str, c7, str2);
    }

    /* renamed from: p0 */
    public static final String m7787p0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(delimiter, "delimiter");
        AbstractC5469l.m23028e(missingDelimiterValue, "missingDelimiterValue");
        int m7754I = m7754I(str, delimiter, 0, false, 6, null);
        if (m7754I == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, m7754I);
        AbstractC5469l.m23027d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: q0 */
    public static /* synthetic */ String m7788q0(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return m7787p0(str, str2, str3);
    }

    /* renamed from: x */
    public static final boolean m7791x(CharSequence charSequence, char c7, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        return m7753H(charSequence, c7, 0, z6, 2, null) >= 0;
    }

    /* renamed from: y */
    public static final boolean m7792y(CharSequence charSequence, CharSequence other, boolean z6) {
        AbstractC5469l.m23028e(charSequence, "<this>");
        AbstractC5469l.m23028e(other, "other");
        if (other instanceof String) {
            if (m7754I(charSequence, (String) other, 0, z6, 2, null) < 0) {
                return false;
            }
        } else if (m7752G(charSequence, other, 0, charSequence.length(), z6, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m7793z(CharSequence charSequence, char c7, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return m7791x(charSequence, c7, z6);
    }
}

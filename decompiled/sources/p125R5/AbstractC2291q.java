package p125R5;

import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;
import p378x5.AbstractC7013d;

/* renamed from: R5.q */
/* loaded from: classes2.dex */
public abstract class AbstractC2291q extends AbstractC2290p {
    /* renamed from: l */
    public static String m7736l(char[] cArr) {
        AbstractC5469l.m23028e(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: m */
    public static String m7737m(char[] cArr, int i7, int i8) {
        AbstractC5469l.m23028e(cArr, "<this>");
        AbstractC7013d.f25070a.m28767a(i7, i8, cArr.length);
        return new String(cArr, i7, i8 - i7);
    }

    /* renamed from: n */
    public static boolean m7738n(String str, String suffix, boolean z6) {
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(suffix, "suffix");
        return !z6 ? str.endsWith(suffix) : m7741q(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m7739o(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return m7738n(str, str2, z6);
    }

    /* renamed from: p */
    public static boolean m7740p(String str, String str2, boolean z6) {
        return str == null ? str2 == null : !z6 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: q */
    public static final boolean m7741q(String str, int i7, String other, int i8, int i9, boolean z6) {
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(other, "other");
        return !z6 ? str.regionMatches(i7, other, i8, i9) : str.regionMatches(z6, i7, other, i8, i9);
    }

    /* renamed from: r */
    public static final String m7742r(String str, String oldValue, String newValue, boolean z6) {
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(oldValue, "oldValue");
        AbstractC5469l.m23028e(newValue, "newValue");
        int i7 = 0;
        int m7750E = AbstractC2294t.m7750E(str, oldValue, 0, z6);
        if (m7750E < 0) {
            return str;
        }
        int length = oldValue.length();
        int m5528a = AbstractC1421h.m5528a(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i7, m7750E);
            sb.append(newValue);
            i7 = m7750E + length;
            if (m7750E >= str.length()) {
                break;
            }
            m7750E = AbstractC2294t.m7750E(str, oldValue, m7750E + m5528a, z6);
        } while (m7750E > 0);
        sb.append((CharSequence) str, i7, str.length());
        String sb2 = sb.toString();
        AbstractC5469l.m23027d(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: s */
    public static /* synthetic */ String m7743s(String str, String str2, String str3, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return m7742r(str, str2, str3, z6);
    }

    /* renamed from: t */
    public static final boolean m7744t(String str, String prefix, boolean z6) {
        AbstractC5469l.m23028e(str, "<this>");
        AbstractC5469l.m23028e(prefix, "prefix");
        return !z6 ? str.startsWith(prefix) : m7741q(str, 0, prefix, 0, prefix.length(), z6);
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m7745u(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return m7744t(str, str2, z6);
    }
}

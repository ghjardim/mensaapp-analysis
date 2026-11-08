package p301o1;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p248i0.AbstractC4508f;
import p248i0.C4506d;
import p248i0.C4507e;
import p248i0.C4509g;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;

/* renamed from: o1.f */
/* loaded from: classes.dex */
public abstract class AbstractC5924f {
    /* renamed from: a */
    public static void m24911a(Spannable spannable, int i7, int i8, C5925g c5925g, C5921c c5921c, Map map, int i9) {
        C5921c m24915e;
        C5925g m24916f;
        int i10;
        if (c5925g.m24939l() != -1) {
            spannable.setSpan(new StyleSpan(c5925g.m24939l()), i7, i8, 33);
        }
        if (c5925g.m24946s()) {
            spannable.setSpan(new StrikethroughSpan(), i7, i8, 33);
        }
        if (c5925g.m24947t()) {
            spannable.setSpan(new UnderlineSpan(), i7, i8, 33);
        }
        if (c5925g.m24944q()) {
            AbstractC4508f.m19212b(spannable, new ForegroundColorSpan(c5925g.m24930c()), i7, i8, 33);
        }
        if (c5925g.m24943p()) {
            AbstractC4508f.m19212b(spannable, new BackgroundColorSpan(c5925g.m24929b()), i7, i8, 33);
        }
        if (c5925g.m24931d() != null) {
            AbstractC4508f.m19212b(spannable, new TypefaceSpan(c5925g.m24931d()), i7, i8, 33);
        }
        if (c5925g.m24942o() != null) {
            C5920b c5920b = (C5920b) AbstractC5332a.m21800e(c5925g.m24942o());
            int i11 = c5920b.f21331a;
            if (i11 == -1) {
                i11 = (i9 == 2 || i9 == 1) ? 3 : 1;
                i10 = 1;
            } else {
                i10 = c5920b.f21332b;
            }
            int i12 = c5920b.f21333c;
            if (i12 == -2) {
                i12 = 1;
            }
            AbstractC4508f.m19212b(spannable, new C4509g(i11, i10, i12), i7, i8, 33);
        }
        int m24937j = c5925g.m24937j();
        if (m24937j == 2) {
            C5921c m24914d = m24914d(c5921c, map);
            if (m24914d != null && (m24915e = m24915e(m24914d, map)) != null) {
                if (m24915e.m24887g() != 1 || m24915e.m24886f(0).f21335b == null) {
                    AbstractC5346o.m21865f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) AbstractC5330M.m21747i(m24915e.m24886f(0).f21335b);
                    C5925g m24916f2 = m24916f(m24915e.f21339f, m24915e.m24891l(), map);
                    int m24936i = m24916f2 != null ? m24916f2.m24936i() : -1;
                    if (m24936i == -1 && (m24916f = m24916f(m24914d.f21339f, m24914d.m24891l(), map)) != null) {
                        m24936i = m24916f.m24936i();
                    }
                    spannable.setSpan(new C4507e(str, m24936i), i7, i8, 33);
                }
            }
        } else if (m24937j == 3 || m24937j == 4) {
            spannable.setSpan(new C5919a(), i7, i8, 33);
        }
        if (c5925g.m24941n()) {
            AbstractC4508f.m19212b(spannable, new C4506d(), i7, i8, 33);
        }
        int m24933f = c5925g.m24933f();
        if (m24933f == 1) {
            AbstractC4508f.m19212b(spannable, new AbsoluteSizeSpan((int) c5925g.m24932e(), true), i7, i8, 33);
        } else if (m24933f == 2) {
            AbstractC4508f.m19212b(spannable, new RelativeSizeSpan(c5925g.m24932e()), i7, i8, 33);
        } else {
            if (m24933f != 3) {
                return;
            }
            AbstractC4508f.m19211a(spannable, c5925g.m24932e() / 100.0f, i7, i8, 33);
        }
    }

    /* renamed from: b */
    public static String m24912b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", StringUtils.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtils.SPACE);
    }

    /* renamed from: c */
    public static void m24913c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    /* renamed from: d */
    public static C5921c m24914d(C5921c c5921c, Map map) {
        while (c5921c != null) {
            C5925g m24916f = m24916f(c5921c.f21339f, c5921c.m24891l(), map);
            if (m24916f != null && m24916f.m24937j() == 1) {
                return c5921c;
            }
            c5921c = c5921c.f21343j;
        }
        return null;
    }

    /* renamed from: e */
    public static C5921c m24915e(C5921c c5921c, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c5921c);
        while (!arrayDeque.isEmpty()) {
            C5921c c5921c2 = (C5921c) arrayDeque.pop();
            C5925g m24916f = m24916f(c5921c2.f21339f, c5921c2.m24891l(), map);
            if (m24916f != null && m24916f.m24937j() == 3) {
                return c5921c2;
            }
            for (int m24887g = c5921c2.m24887g() - 1; m24887g >= 0; m24887g--) {
                arrayDeque.push(c5921c2.m24886f(m24887g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C5925g m24916f(C5925g c5925g, String[] strArr, Map map) {
        int i7 = 0;
        if (c5925g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C5925g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C5925g c5925g2 = new C5925g();
                int length = strArr.length;
                while (i7 < length) {
                    c5925g2.m24928a((C5925g) map.get(strArr[i7]));
                    i7++;
                }
                return c5925g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return c5925g.m24928a((C5925g) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    c5925g.m24928a((C5925g) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return c5925g;
    }
}

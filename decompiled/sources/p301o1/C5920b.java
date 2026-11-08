package p301o1;

import android.text.TextUtils;
import java.util.regex.Pattern;
import p171Y2.AbstractC2920c;
import p178Z2.AbstractC3037z;

/* renamed from: o1.b */
/* loaded from: classes.dex */
public final class C5920b {

    /* renamed from: d */
    public static final Pattern f21326d = Pattern.compile("\\s+");

    /* renamed from: e */
    public static final AbstractC3037z f21327e = AbstractC3037z.m11110u("auto", "none");

    /* renamed from: f */
    public static final AbstractC3037z f21328f = AbstractC3037z.m11111w("dot", "sesame", "circle");

    /* renamed from: g */
    public static final AbstractC3037z f21329g = AbstractC3037z.m11110u("filled", "open");

    /* renamed from: h */
    public static final AbstractC3037z f21330h = AbstractC3037z.m11111w("after", "before", "outside");

    /* renamed from: a */
    public final int f21331a;

    /* renamed from: b */
    public final int f21332b;

    /* renamed from: c */
    public final int f21333c;

    public C5920b(int i7, int i8, int i9) {
        this.f21331a = i7;
        this.f21332b = i8;
        this.f21333c = i9;
    }

    /* renamed from: a */
    public static C5920b m24878a(String str) {
        if (str == null) {
            return null;
        }
        String m10515e = AbstractC2920c.m10515e(str.trim());
        if (m10515e.isEmpty()) {
            return null;
        }
        return m24879b(AbstractC3037z.m11107p(TextUtils.split(m10515e, f21326d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r9.equals("dot") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p301o1.C5920b m24879b(p178Z2.AbstractC3037z r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p301o1.C5920b.m24879b(Z2.z):o1.b");
    }
}

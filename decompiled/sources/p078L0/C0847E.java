package p078L0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p176Z0.C2963e;
import p176Z0.C2969k;
import p232g0.C4334x;
import p259j0.AbstractC5330M;

/* renamed from: L0.E */
/* loaded from: classes.dex */
public final class C0847E {

    /* renamed from: c */
    public static final Pattern f2901c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f2902a = -1;

    /* renamed from: b */
    public int f2903b = -1;

    /* renamed from: a */
    public boolean m3523a() {
        return (this.f2902a == -1 || this.f2903b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m3524b(String str) {
        Matcher matcher = f2901c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) AbstractC5330M.m21747i(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) AbstractC5330M.m21747i(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f2902a = parseInt;
            this.f2903b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m3525c(C4334x c4334x) {
        for (int i7 = 0; i7 < c4334x.m18402e(); i7++) {
            C4334x.b m18401d = c4334x.m18401d(i7);
            if (m18401d instanceof C2963e) {
                C2963e c2963e = (C2963e) m18401d;
                if ("iTunSMPB".equals(c2963e.f9099c) && m3524b(c2963e.f9100d)) {
                    return true;
                }
            } else if (m18401d instanceof C2969k) {
                C2969k c2969k = (C2969k) m18401d;
                if ("com.apple.iTunes".equals(c2969k.f9112b) && "iTunSMPB".equals(c2969k.f9113c) && m3524b(c2969k.f9114d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}

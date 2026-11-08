package p387z0;

import androidx.media3.exoplayer.rtsp.AbstractC3386h;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p232g0.C4295A;
import p259j0.AbstractC5330M;

/* renamed from: z0.w */
/* loaded from: classes.dex */
public final class C7122w {

    /* renamed from: c */
    public static final C7122w f25304c = new C7122w(0, -9223372036854775807L);

    /* renamed from: d */
    public static final Pattern f25305d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a */
    public final long f25306a;

    /* renamed from: b */
    public final long f25307b;

    public C7122w(long j7, long j8) {
        this.f25306a = j7;
        this.f25307b = j8;
    }

    /* renamed from: b */
    public static String m29342b(long j7) {
        return AbstractC5330M.m21685H("npt=%.3f-", Double.valueOf(j7 / 1000.0d));
    }

    /* renamed from: d */
    public static C7122w m29343d(String str) {
        long parseFloat;
        Matcher matcher = f25305d.matcher(str);
        AbstractC3386h.m13346a(matcher.matches(), str);
        String group = matcher.group(1);
        AbstractC3386h.m13346a(group != null, str);
        long parseFloat2 = ((String) AbstractC5330M.m21747i(group)).equals("now") ? 0L : (long) (Float.parseFloat(group) * 1000.0f);
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = (long) (Float.parseFloat(group2) * 1000.0f);
                AbstractC3386h.m13346a(parseFloat >= parseFloat2, str);
            } catch (NumberFormatException e7) {
                throw C4295A.m17945c(group2, e7);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new C7122w(parseFloat2, parseFloat);
    }

    /* renamed from: a */
    public long m29344a() {
        return this.f25307b - this.f25306a;
    }

    /* renamed from: c */
    public boolean m29345c() {
        return this.f25307b == -9223372036854775807L;
    }
}

package p387z0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p232g0.C4295A;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p387z0.C7100a;
import p387z0.C7124y;

/* renamed from: z0.z */
/* loaded from: classes.dex */
public abstract class AbstractC7125z {

    /* renamed from: a */
    public static final Pattern f25335a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b */
    public static final Pattern f25336b = Pattern.compile("^([a-z])=$");

    /* renamed from: c */
    public static final Pattern f25337c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* renamed from: d */
    public static final Pattern f25338d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* renamed from: a */
    public static void m29373a(C7124y.b bVar, C7100a.b bVar2) {
        try {
            bVar.m29361n(bVar2.m29287j());
        } catch (IllegalArgumentException | IllegalStateException e7) {
            throw C4295A.m17945c(null, e7);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e9, code lost:
    
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p387z0.C7124y m29374b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p387z0.AbstractC7125z.m29374b(java.lang.String):z0.y");
    }

    /* renamed from: c */
    public static C7100a.b m29375c(String str) {
        Matcher matcher = f25338d.matcher(str);
        if (!matcher.matches()) {
            throw C4295A.m17945c("Malformed SDP media description line: " + str, null);
        }
        try {
            return new C7100a.b((String) AbstractC5332a.m21800e(matcher.group(1)), Integer.parseInt((String) AbstractC5332a.m21800e(matcher.group(2))), (String) AbstractC5332a.m21800e(matcher.group(3)), Integer.parseInt((String) AbstractC5332a.m21800e(matcher.group(4))));
        } catch (NumberFormatException e7) {
            AbstractC5346o.m21868i("SDPParser", "Malformed SDP media description line: " + str, e7);
            return null;
        }
    }
}

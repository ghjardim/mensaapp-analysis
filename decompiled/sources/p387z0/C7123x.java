package p387z0;

import android.net.Uri;
import p259j0.AbstractC5324G;
import p259j0.AbstractC5332a;

/* renamed from: z0.x */
/* loaded from: classes.dex */
public final class C7123x {

    /* renamed from: a */
    public final long f25308a;

    /* renamed from: b */
    public final int f25309b;

    /* renamed from: c */
    public final Uri f25310c;

    public C7123x(long j7, int i7, Uri uri) {
        this.f25308a = j7;
        this.f25309b = i7;
        this.f25310c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[Catch: Exception -> 0x0053, TRY_LEAVE, TryCatch #0 {Exception -> 0x0053, blocks: (B:7:0x0027, B:19:0x0071, B:24:0x0078, B:25:0x007d, B:28:0x007e, B:29:0x0083, B:31:0x0049, B:34:0x0055, B:37:0x005f), top: B:6:0x0027 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p178Z2.AbstractC3033v m29346a(java.lang.String r18, android.net.Uri r19) {
        /*
            Z2.v$a r0 = new Z2.v$a
            r0.<init>()
            java.lang.String r1 = ","
            r2 = r18
            java.lang.String[] r1 = p259j0.AbstractC5330M.m21737e1(r2, r1)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto Lc4
            r5 = r1[r4]
            java.lang.String r6 = ";"
            java.lang.String[] r6 = p259j0.AbstractC5330M.m21737e1(r5, r6)
            int r7 = r6.length
            r12 = r3
            r13 = 0
            r14 = -1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L23:
            if (r12 >= r7) goto L94
            r8 = r6[r12]
            java.lang.String r9 = "="
            java.lang.String[] r9 = p259j0.AbstractC5330M.m21740f1(r8, r9)     // Catch: java.lang.Exception -> L53
            r11 = r9[r3]     // Catch: java.lang.Exception -> L53
            r3 = 1
            r9 = r9[r3]     // Catch: java.lang.Exception -> L53
            int r10 = r11.hashCode()     // Catch: java.lang.Exception -> L53
            r3 = 113759(0x1bc5f, float:1.5941E-40)
            r17 = r1
            r1 = 2
            if (r10 == r3) goto L5f
            r3 = 116079(0x1c56f, float:1.62661E-40)
            if (r10 == r3) goto L55
            r3 = 1524180539(0x5ad9263b, float:3.0561052E16)
            if (r10 == r3) goto L49
            goto L69
        L49:
            java.lang.String r3 = "rtptime"
            boolean r3 = r11.equals(r3)     // Catch: java.lang.Exception -> L53
            if (r3 == 0) goto L69
            r3 = r1
            goto L6a
        L53:
            r0 = move-exception
            goto L8f
        L55:
            java.lang.String r3 = "url"
            boolean r3 = r11.equals(r3)     // Catch: java.lang.Exception -> L53
            if (r3 == 0) goto L69
            r3 = 0
            goto L6a
        L5f:
            java.lang.String r3 = "seq"
            boolean r3 = r11.equals(r3)     // Catch: java.lang.Exception -> L53
            if (r3 == 0) goto L69
            r3 = 1
            goto L6a
        L69:
            r3 = -1
        L6a:
            if (r3 == 0) goto L83
            r10 = 1
            if (r3 == r10) goto L7e
            if (r3 != r1) goto L78
            long r15 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Exception -> L53
        L75:
            r1 = r19
            goto L89
        L78:
            r0 = 0
            g0.A r0 = p232g0.C4295A.m17945c(r11, r0)     // Catch: java.lang.Exception -> L53
            throw r0     // Catch: java.lang.Exception -> L53
        L7e:
            int r14 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L53
            goto L75
        L83:
            r1 = r19
            android.net.Uri r13 = m29347b(r9, r1)     // Catch: java.lang.Exception -> L53
        L89:
            int r12 = r12 + 1
            r1 = r17
            r3 = 0
            goto L23
        L8f:
            g0.A r0 = p232g0.C4295A.m17945c(r8, r0)
            throw r0
        L94:
            r17 = r1
            r1 = r19
            if (r13 == 0) goto Lae
            java.lang.String r3 = r13.getScheme()
            if (r3 == 0) goto Lae
            r3 = -1
            r8 = r15
            if (r14 != r3) goto Lb0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto Lae
            goto Lb0
        Lae:
            r0 = 0
            goto Lbf
        Lb0:
            z0.x r3 = new z0.x
            r3.<init>(r8, r14, r13)
            r0.mo11040a(r3)
            int r4 = r4 + 1
            r1 = r17
            r3 = 0
            goto L10
        Lbf:
            g0.A r0 = p232g0.C4295A.m17945c(r5, r0)
            throw r0
        Lc4:
            Z2.v r0 = r0.m11063k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p387z0.C7123x.m29346a(java.lang.String, android.net.Uri):Z2.v");
    }

    /* renamed from: b */
    public static Uri m29347b(String str, Uri uri) {
        AbstractC5332a.m21796a(((String) AbstractC5332a.m21800e(uri.getScheme())).equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        if (((String) AbstractC5332a.m21800e(parse2.getHost())).equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith("/")) {
            return AbstractC5324G.m21666f(uri2, str);
        }
        return AbstractC5324G.m21666f(uri2 + "/", str);
    }
}

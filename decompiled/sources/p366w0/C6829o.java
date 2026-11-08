package p366w0;

import android.media.MediaCodec;
import p284m0.AbstractC5560h;

/* renamed from: w0.o */
/* loaded from: classes.dex */
public class C6829o extends AbstractC5560h {

    /* renamed from: a */
    public final C6830p f24541a;

    /* renamed from: b */
    public final String f24542b;

    /* renamed from: c */
    public final int f24543c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6829o(java.lang.Throwable r4, p366w0.C6830p r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f24544a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f24541a = r5
            int r5 = p259j0.AbstractC5330M.f18800a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = m28098a(r4)
        L27:
            r3.f24542b = r1
            r0 = 23
            if (r5 < r0) goto L32
            int r4 = m28099b(r4)
            goto L36
        L32:
            int r4 = p259j0.AbstractC5330M.m21721Z(r1)
        L36:
            r3.f24543c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p366w0.C6829o.<init>(java.lang.Throwable, w0.p):void");
    }

    /* renamed from: a */
    public static String m28098a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    /* renamed from: b */
    public static int m28099b(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}

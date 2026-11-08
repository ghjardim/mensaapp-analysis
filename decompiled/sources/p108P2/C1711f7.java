package p108P2;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzih;

/* renamed from: P2.f7 */
/* loaded from: classes.dex */
public final class C1711f7 extends AbstractC1625V6 {
    public C1711f7(C1828s7 c1828s7) {
        super(c1828s7);
    }

    /* renamed from: m */
    public static final boolean m6071m(String str) {
        String str2 = (String) AbstractC1805q2.f5425t.m6159a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0244  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1702e7 m6072i(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1711f7.m6072i(java.lang.String):P2.e7");
    }

    /* renamed from: j */
    public final boolean m6073j(String str, zzih zzihVar) {
        zzgo m6240E;
        mo5762h();
        return this.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5349Q0) && zzihVar == zzih.CLIENT_UPLOAD_ELIGIBLE && !m6071m(str) && (m6240E = this.f4967b.m6313K0().m6240E(str)) != null && m6240E.zzv() && !m6240E.zzi().zze().isEmpty();
    }

    /* renamed from: k */
    public final String m6074k(String str) {
        String m6243H = this.f4967b.m6313K0().m6243H(str);
        if (TextUtils.isEmpty(m6243H)) {
            return (String) AbstractC1805q2.f5419r.m6159a(null);
        }
        Uri parse = Uri.parse((String) AbstractC1805q2.f5419r.m6159a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(m6243H + "." + parse.getAuthority());
        return buildUpon.build().toString();
    }

    /* renamed from: l */
    public final boolean m6075l(String str, String str2) {
        C1513I2 m6483A0;
        C1828s7 c1828s7 = this.f4967b;
        zzgo m6240E = c1828s7.m6313K0().m6240E(str);
        if (m6240E == null || (m6483A0 = c1828s7.m6303E0().m6483A0(str)) == null) {
            return false;
        }
        if ((m6240E.zzv() && m6240E.zzi().zza() == 100) || this.f5129a.m5619Q().m5712c0(str, m6483A0.m5836m())) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < m6240E.zzi().zza();
    }
}

package p346t3;

import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;

/* renamed from: t3.f */
/* loaded from: classes.dex */
public class C6504f {

    /* renamed from: g */
    public static final zzan f23436g;

    /* renamed from: a */
    public final String f23437a;

    /* renamed from: b */
    public final String f23438b;

    /* renamed from: c */
    public final String f23439c;

    /* renamed from: d */
    public final String f23440d;

    /* renamed from: e */
    public final String f23441e;

    /* renamed from: f */
    public final String f23442f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f23436g = zzan.zza(hashMap);
    }

    public C6504f(String str) {
        String m27103e = m27103e(str, "apiKey");
        String m27103e2 = m27103e(str, "oobCode");
        String m27103e3 = m27103e(str, "mode");
        if (m27103e == null || m27103e2 == null || m27103e3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f23437a = AbstractC3802r.m15123e(m27103e);
        this.f23438b = AbstractC3802r.m15123e(m27103e2);
        this.f23439c = AbstractC3802r.m15123e(m27103e3);
        this.f23440d = m27103e(str, "continueUrl");
        this.f23441e = m27103e(str, "languageCode");
        this.f23442f = m27103e(str, "tenantId");
    }

    /* renamed from: c */
    public static C6504f m27102c(String str) {
        AbstractC3802r.m15123e(str);
        try {
            return new C6504f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m27103e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(AbstractC3802r.m15123e(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String m27104a() {
        return this.f23438b;
    }

    /* renamed from: b */
    public int m27105b() {
        zzan zzanVar = f23436g;
        if (zzanVar.containsKey(this.f23439c)) {
            return ((Integer) zzanVar.get(this.f23439c)).intValue();
        }
        return 3;
    }

    /* renamed from: d */
    public final String m27106d() {
        return this.f23442f;
    }
}

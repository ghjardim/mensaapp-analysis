package p287m3;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;
import p031E2.AbstractC0281q;
import p219e3.C4183m;

/* renamed from: m3.a */
/* loaded from: classes.dex */
public class C5575a {

    /* renamed from: a */
    public String f20146a;

    /* renamed from: b */
    public String f20147b;

    public C5575a(String str, String str2) {
        AbstractC3802r.m15129k(str);
        AbstractC3802r.m15129k(str2);
        this.f20146a = str;
        this.f20147b = str2;
    }

    /* renamed from: a */
    public static C5575a m23340a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String m1144a = AbstractC0281q.m1144a(jSONObject.optString("token"));
        String m1144a2 = AbstractC0281q.m1144a(jSONObject.optString("ttl"));
        if (m1144a == null || m1144a2 == null) {
            throw new C4183m("Unexpected server response.");
        }
        return new C5575a(m1144a, m1144a2);
    }

    /* renamed from: b */
    public String m23341b() {
        return this.f20147b;
    }

    /* renamed from: c */
    public String m23342c() {
        return this.f20146a;
    }
}

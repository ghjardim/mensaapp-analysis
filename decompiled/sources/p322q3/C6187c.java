package p322q3;

import com.google.android.gms.common.internal.AbstractC3802r;
import org.json.JSONObject;
import p031E2.AbstractC0281q;
import p219e3.C4183m;

/* renamed from: q3.c */
/* loaded from: classes.dex */
public class C6187c {

    /* renamed from: a */
    public String f22131a;

    /* renamed from: b */
    public String f22132b;

    public C6187c(String str, String str2) {
        AbstractC3802r.m15129k(str);
        AbstractC3802r.m15129k(str2);
        this.f22131a = str;
        this.f22132b = str2;
    }

    /* renamed from: a */
    public static C6187c m25842a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String m1144a = AbstractC0281q.m1144a(jSONObject.optString("challenge"));
        String m1144a2 = AbstractC0281q.m1144a(jSONObject.optString("ttl"));
        if (m1144a == null || m1144a2 == null) {
            throw new C4183m("Unexpected server response.");
        }
        return new C6187c(m1144a, m1144a2);
    }

    /* renamed from: b */
    public String m25843b() {
        return this.f22131a;
    }
}

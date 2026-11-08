package p338s3;

import org.json.JSONObject;

/* renamed from: s3.a */
/* loaded from: classes.dex */
public class C6383a {

    /* renamed from: a */
    public final String f23069a;

    public C6383a(String str) {
        this.f23069a = str;
    }

    /* renamed from: a */
    public String m26686a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("safetyNetToken", this.f23069a);
        return jSONObject.toString();
    }
}

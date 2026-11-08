package p322q3;

import org.json.JSONObject;

/* renamed from: q3.a */
/* loaded from: classes.dex */
public class C6185a {

    /* renamed from: a */
    public final String f22130a;

    public C6185a(String str) {
        this.f22130a = str;
    }

    /* renamed from: a */
    public String m25840a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIntegrityToken", this.f22130a);
        return jSONObject.toString();
    }
}

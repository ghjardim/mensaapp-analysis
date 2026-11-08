package p279l3;

import org.json.JSONObject;

/* renamed from: l3.f */
/* loaded from: classes.dex */
public class C5536f {

    /* renamed from: a */
    public final String f19944a;

    public C5536f(String str) {
        this.f19944a = str;
    }

    /* renamed from: a */
    public String m23181a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("debugToken", this.f19944a);
        return jSONObject.toString();
    }
}

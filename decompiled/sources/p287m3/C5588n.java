package p287m3;

import org.json.JSONObject;

/* renamed from: m3.n */
/* loaded from: classes.dex */
public class C5588n {

    /* renamed from: a */
    public int f20185a;

    /* renamed from: b */
    public String f20186b;

    public C5588n(int i7, String str) {
        this.f20185a = i7;
        this.f20186b = str;
    }

    /* renamed from: a */
    public static C5588n m23382a(String str) {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("error"));
        return new C5588n(jSONObject.optInt("code"), jSONObject.optString("message"));
    }

    /* renamed from: b */
    public int m23383b() {
        return this.f20185a;
    }

    /* renamed from: c */
    public String m23384c() {
        return this.f20186b;
    }
}

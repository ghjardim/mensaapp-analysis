package p346t3;

import java.util.Map;

/* renamed from: t3.C */
/* loaded from: classes.dex */
public class C6462C {

    /* renamed from: a */
    public String f23359a;

    /* renamed from: b */
    public Map f23360b;

    public C6462C(String str, Map map) {
        this.f23359a = str;
        this.f23360b = map;
    }

    /* renamed from: a */
    public long m26988a() {
        return m26995h("auth_time");
    }

    /* renamed from: b */
    public Map m26989b() {
        return this.f23360b;
    }

    /* renamed from: c */
    public long m26990c() {
        return m26995h("exp");
    }

    /* renamed from: d */
    public long m26991d() {
        return m26995h("iat");
    }

    /* renamed from: e */
    public String m26992e() {
        Map map = (Map) this.f23360b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    /* renamed from: f */
    public String m26993f() {
        Map map = (Map) this.f23360b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    /* renamed from: g */
    public String m26994g() {
        return this.f23359a;
    }

    /* renamed from: h */
    public final long m26995h(String str) {
        Integer num = (Integer) this.f23360b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}

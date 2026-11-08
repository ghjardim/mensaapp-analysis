package p287m3;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p262j3.AbstractC5367c;
import p295n3.AbstractC5783c;
import p295n3.InterfaceC5781a;

/* renamed from: m3.b */
/* loaded from: classes.dex */
public final class C5576b extends AbstractC5367c {

    /* renamed from: d */
    public static final String f20148d = "m3.b";

    /* renamed from: a */
    public final String f20149a;

    /* renamed from: b */
    public final long f20150b;

    /* renamed from: c */
    public final long f20151c;

    public C5576b(String str, long j7) {
        this(str, j7, new InterfaceC5781a.a().mo24428a());
    }

    /* renamed from: c */
    public static C5576b m23343c(C5575a c5575a) {
        long m23346g;
        AbstractC3802r.m15129k(c5575a);
        try {
            m23346g = (long) (Double.parseDouble(c5575a.m23341b().replace("s", StringUtils.EMPTY)) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map m24436b = AbstractC5783c.m24436b(c5575a.m23342c());
            m23346g = 1000 * (m23346g(m24436b, "exp") - m23346g(m24436b, "iat"));
        }
        return new C5576b(c5575a.m23342c(), m23346g);
    }

    /* renamed from: d */
    public static C5576b m23344d(String str) {
        AbstractC3802r.m15129k(str);
        Map m24436b = AbstractC5783c.m24436b(str);
        long m23346g = m23346g(m24436b, "iat");
        return new C5576b(str, (m23346g(m24436b, "exp") - m23346g) * 1000, m23346g * 1000);
    }

    /* renamed from: e */
    public static C5576b m23345e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C5576b(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e7) {
            Log.e(f20148d, "Could not deserialize token: " + e7.getMessage());
            return null;
        }
    }

    /* renamed from: g */
    public static long m23346g(Map map, String str) {
        AbstractC3802r.m15129k(map);
        AbstractC3802r.m15123e(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // p262j3.AbstractC5367c
    /* renamed from: a */
    public long mo22071a() {
        return this.f20150b + this.f20151c;
    }

    @Override // p262j3.AbstractC5367c
    /* renamed from: b */
    public String mo22072b() {
        return this.f20149a;
    }

    /* renamed from: f */
    public long m23347f() {
        return this.f20151c;
    }

    /* renamed from: h */
    public long m23348h() {
        return this.f20150b;
    }

    /* renamed from: i */
    public String m23349i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", this.f20149a);
            jSONObject.put("receivedAt", this.f20150b);
            jSONObject.put("expiresIn", this.f20151c);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.e(f20148d, "Could not serialize token: " + e7.getMessage());
            return null;
        }
    }

    public C5576b(String str, long j7, long j8) {
        AbstractC3802r.m15123e(str);
        this.f20149a = str;
        this.f20151c = j7;
        this.f20150b = j8;
    }
}

package p061I4;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: I4.g */
/* loaded from: classes.dex */
public final class C0655g implements InterfaceC0660l {

    /* renamed from: a */
    public static final C0655g f2253a = new C0655g();

    @Override // p061I4.InterfaceC0660l
    /* renamed from: a */
    public C0658j mo2639a(ByteBuffer byteBuffer) {
        try {
            Object mo2638b = C0654f.f2252a.mo2638b(byteBuffer);
            if (mo2638b instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) mo2638b;
                Object obj = jSONObject.get("method");
                Object m2645g = m2645g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new C0658j((String) obj, m2645g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + mo2638b);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: b */
    public ByteBuffer mo2640b(Object obj) {
        return C0654f.f2252a.mo2637a(new JSONArray().put(AbstractC0656h.m2646a(obj)));
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: c */
    public ByteBuffer mo2641c(String str, String str2, Object obj, String str3) {
        return C0654f.f2252a.mo2637a(new JSONArray().put(str).put(AbstractC0656h.m2646a(str2)).put(AbstractC0656h.m2646a(obj)).put(AbstractC0656h.m2646a(str3)));
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: d */
    public ByteBuffer mo2642d(String str, String str2, Object obj) {
        return C0654f.f2252a.mo2637a(new JSONArray().put(str).put(AbstractC0656h.m2646a(str2)).put(AbstractC0656h.m2646a(obj)));
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: e */
    public Object mo2643e(ByteBuffer byteBuffer) {
        try {
            Object mo2638b = C0654f.f2252a.mo2638b(byteBuffer);
            if (mo2638b instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) mo2638b;
                if (jSONArray.length() == 1) {
                    return m2645g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object m2645g = m2645g(jSONArray.opt(1));
                    Object m2645g2 = m2645g(jSONArray.opt(2));
                    if ((obj instanceof String) && (m2645g == null || (m2645g instanceof String))) {
                        throw new C0653e((String) obj, (String) m2645g, m2645g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + mo2638b);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // p061I4.InterfaceC0660l
    /* renamed from: f */
    public ByteBuffer mo2644f(C0658j c0658j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", c0658j.f2254a);
            jSONObject.put("args", AbstractC0656h.m2646a(c0658j.f2255b));
            return C0654f.f2252a.mo2637a(jSONObject);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    /* renamed from: g */
    public Object m2645g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}

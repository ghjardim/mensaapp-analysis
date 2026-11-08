package p335s0;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5346o;

/* renamed from: s0.a */
/* loaded from: classes.dex */
public abstract class AbstractC6341a {
    /* renamed from: a */
    public static byte[] m26541a(byte[] bArr) {
        return AbstractC5330M.f18800a >= 27 ? bArr : AbstractC5330M.m21773s0(m26543c(AbstractC5330M.m21687I(bArr)));
    }

    /* renamed from: b */
    public static byte[] m26542b(byte[] bArr) {
        if (AbstractC5330M.f18800a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(AbstractC5330M.m21687I(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                if (i7 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                sb.append("{\"k\":\"");
                sb.append(m26544d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m26544d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return AbstractC5330M.m21773s0(sb.toString());
        } catch (JSONException e7) {
            AbstractC5346o.m21863d("ClearKeyUtil", "Failed to adjust response data: " + AbstractC5330M.m21687I(bArr), e7);
            return bArr;
        }
    }

    /* renamed from: c */
    public static String m26543c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    public static String m26544d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}

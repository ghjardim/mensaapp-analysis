package p295n3;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p334s.C6308a;

/* renamed from: n3.c */
/* loaded from: classes.dex */
public abstract class AbstractC5783c {
    /* renamed from: a */
    public static Map m24435a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m24438d(jSONObject);
            }
            return null;
        } catch (Exception e7) {
            C5782b.m24429f().m24431b("Failed to parse JSONObject into Map:\n" + e7);
            return Collections.emptyMap();
        }
    }

    /* renamed from: b */
    public static Map m24436b(String str) {
        AbstractC3802r.m15123e(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            C5782b.m24429f().m24433d("Invalid token (too few subsections):\n" + str);
            return Collections.emptyMap();
        }
        try {
            Map m24435a = m24435a(new String(Base64.decode(split[1], 11), "UTF-8"));
            return m24435a == null ? Collections.emptyMap() : m24435a;
        } catch (UnsupportedEncodingException e7) {
            C5782b.m24429f().m24433d("Unable to decode token (charset unknown):\n" + e7);
            return Collections.emptyMap();
        }
    }

    /* renamed from: c */
    public static List m24437c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = m24437c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m24438d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Map m24438d(JSONObject jSONObject) {
        C6308a c6308a = new C6308a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m24437c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m24438d((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            c6308a.put(next, obj);
        }
        return c6308a;
    }
}

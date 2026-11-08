package p138T4;

import android.content.SharedPreferences;
import com.google.firebase.messaging.C3968d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: T4.y */
/* loaded from: classes2.dex */
public class C2481y {

    /* renamed from: c */
    public static C2481y f7307c;

    /* renamed from: a */
    public final String f7308a = ",";

    /* renamed from: b */
    public SharedPreferences f7309b;

    /* renamed from: b */
    public static C2481y m8393b() {
        if (f7307c == null) {
            f7307c = new C2481y();
        }
        return f7307c;
    }

    /* renamed from: a */
    public Map m8394a(String str) {
        String m8396d = m8396d(str, null);
        if (m8396d != null) {
            try {
                HashMap hashMap = new HashMap(1);
                Map m8398f = m8398f(new JSONObject(m8396d));
                m8398f.put("to", str);
                hashMap.put("message", m8398f);
                return hashMap;
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final SharedPreferences m8395c() {
        if (this.f7309b == null) {
            this.f7309b = AbstractC2457a.m8325a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.f7309b;
    }

    /* renamed from: d */
    public String m8396d(String str, String str2) {
        return m8395c().getString(str, str2);
    }

    /* renamed from: e */
    public List m8397e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = m8397e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m8398f((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: f */
    public final Map m8398f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m8397e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m8398f((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    /* renamed from: g */
    public void m8399g(String str) {
        m8395c().edit().remove(str).apply();
        String m8396d = m8396d("notification_ids", StringUtils.EMPTY);
        if (m8396d.isEmpty()) {
            return;
        }
        m8400h("notification_ids", m8396d.replace(str + ",", StringUtils.EMPTY));
    }

    /* renamed from: h */
    public void m8400h(String str, String str2) {
        m8395c().edit().putString(str, str2).apply();
    }

    /* renamed from: i */
    public void m8401i(C3968d c3968d) {
        m8400h(c3968d.m15817A0(), new JSONObject(AbstractC2482z.m8407f(c3968d)).toString());
        String str = m8396d("notification_ids", StringUtils.EMPTY) + c3968d.m15817A0() + ",";
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(",")));
        if (arrayList.size() > 100) {
            String str2 = (String) arrayList.get(0);
            m8395c().edit().remove(str2).apply();
            str = str.replace(str2 + ",", StringUtils.EMPTY);
        }
        m8400h("notification_ids", str);
    }
}

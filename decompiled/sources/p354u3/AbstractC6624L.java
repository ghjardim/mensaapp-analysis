package p354u3;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzv;
import com.google.android.gms.internal.p395firebaseauthapi.zzzp;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p003A2.C0019a;
import p031E2.AbstractC0267c;
import p334s.C6308a;

/* renamed from: u3.L */
/* loaded from: classes.dex */
public abstract class AbstractC6624L {

    /* renamed from: a */
    public static final C0019a f23962a = new C0019a("JSONParser", new String[0]);

    /* renamed from: a */
    public static List m27498a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = m27498a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m27500c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map m27499b(String str) {
        AbstractC3802r.m15123e(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            f23962a.m61c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map m27501d = m27501d(new String(AbstractC0267c.m1106b(zza.get(1)), "UTF-8"));
            return m27501d == null ? new HashMap() : m27501d;
        } catch (UnsupportedEncodingException e7) {
            f23962a.m60b("Unable to decode token", e7, new Object[0]);
            return new HashMap();
        }
    }

    /* renamed from: c */
    public static Map m27500c(JSONObject jSONObject) {
        C6308a c6308a = new C6308a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m27498a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m27500c((JSONObject) obj);
            }
            c6308a.put(next, obj);
        }
        return c6308a;
    }

    /* renamed from: d */
    public static Map m27501d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m27500c(jSONObject);
            }
            return null;
        } catch (Exception e7) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzzp(e7);
        }
    }
}

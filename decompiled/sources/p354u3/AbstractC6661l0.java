package p354u3;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import org.json.JSONObject;
import p382y2.AbstractC7069e;

/* renamed from: u3.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC6661l0 {

    /* renamed from: a */
    public static final Map f24057a;

    static {
        HashMap hashMap = new HashMap();
        f24057a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m27565a(Intent intent) {
        AbstractC3802r.m15129k(intent);
        AbstractC3802r.m15119a(m27568d(intent));
        return (Status) AbstractC7069e.m29144b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    /* renamed from: b */
    public static Status m27566b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f24057a;
                if (map.containsKey(string)) {
                    return AbstractC6672r.m27577a(((String) map.get(string)) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + string2);
                }
            }
            return AbstractC6672r.m27577a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e7) {
            return AbstractC6672r.m27577a("WEB_INTERNAL_ERROR:" + str + "[ " + e7.getLocalizedMessage() + " ]");
        }
    }

    /* renamed from: c */
    public static void m27567c(Intent intent, Status status) {
        AbstractC7069e.m29147e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    /* renamed from: d */
    public static boolean m27568d(Intent intent) {
        AbstractC3802r.m15129k(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}

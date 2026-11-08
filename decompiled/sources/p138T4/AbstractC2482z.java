package p138T4;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import com.google.firebase.messaging.C3968d;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.util.Objects;

/* renamed from: T4.z */
/* loaded from: classes2.dex */
public abstract class AbstractC2482z {
    /* renamed from: a */
    public static FirebaseMessaging m8402a(Map map) {
        return FirebaseMessaging.m15706r();
    }

    /* renamed from: b */
    public static C3968d m8403b(Map map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        C3968d.b bVar = new C3968d.b((String) obj2);
        String str = (String) map2.get("collapseKey");
        String str2 = (String) map2.get("messageId");
        String str3 = (String) map2.get("messageType");
        Integer num = (Integer) map2.get("ttl");
        Map map3 = (Map) map2.get("data");
        if (str != null) {
            bVar.m15830b(str);
        }
        if (str3 != null) {
            bVar.m15833e(str3);
        }
        if (str2 != null) {
            bVar.m15832d(str2);
        }
        if (num != null) {
            bVar.m15834f(num.intValue());
        }
        if (map3 != null) {
            bVar.m15831c(map3);
        }
        return bVar.m15829a();
    }

    /* renamed from: c */
    public static Map m8404c(Map map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get("notification") == null) {
            return null;
        }
        return (Map) map2.get("notification");
    }

    /* renamed from: d */
    public static boolean m8405d(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static Map m8406e(C3968d.c cVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (cVar.m15850p() != null) {
            hashMap.put("title", cVar.m15850p());
        }
        if (cVar.m15852r() != null) {
            hashMap.put("titleLocKey", cVar.m15852r());
        }
        if (cVar.m15851q() != null) {
            hashMap.put("titleLocArgs", Arrays.asList(cVar.m15851q()));
        }
        if (cVar.m15836a() != null) {
            hashMap.put("body", cVar.m15836a());
        }
        if (cVar.m15838c() != null) {
            hashMap.put("bodyLocKey", cVar.m15838c());
        }
        if (cVar.m15837b() != null) {
            hashMap.put("bodyLocArgs", Arrays.asList(cVar.m15837b()));
        }
        if (cVar.m15839d() != null) {
            hashMap2.put("channelId", cVar.m15839d());
        }
        if (cVar.m15840e() != null) {
            hashMap2.put("clickAction", cVar.m15840e());
        }
        if (cVar.m15841f() != null) {
            hashMap2.put("color", cVar.m15841f());
        }
        if (cVar.m15842g() != null) {
            hashMap2.put("smallIcon", cVar.m15842g());
        }
        if (cVar.m15843h() != null) {
            hashMap2.put("imageUrl", cVar.m15843h().toString());
        }
        if (cVar.m15844i() != null) {
            hashMap2.put("link", cVar.m15844i().toString());
        }
        if (cVar.m15845k() != null) {
            hashMap2.put("count", cVar.m15845k());
        }
        if (cVar.m15846l() != null) {
            hashMap2.put(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, cVar.m15846l());
        }
        if (cVar.m15847m() != null) {
            hashMap2.put("sound", cVar.m15847m());
        }
        if (cVar.m15849o() != null) {
            hashMap2.put("ticker", cVar.m15849o());
        }
        if (cVar.m15853s() != null) {
            hashMap2.put("visibility", cVar.m15853s());
        }
        if (cVar.m15848n() != null) {
            hashMap2.put("tag", cVar.m15848n());
        }
        hashMap.put("android", hashMap2);
        return hashMap;
    }

    /* renamed from: f */
    public static Map m8407f(C3968d c3968d) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (c3968d.m15826x0() != null) {
            hashMap.put("collapseKey", c3968d.m15826x0());
        }
        if (c3968d.m15828z0() != null) {
            hashMap.put("from", c3968d.m15828z0());
        }
        if (c3968d.m15823G0() != null) {
            hashMap.put("to", c3968d.m15823G0());
        }
        if (c3968d.m15817A0() != null) {
            hashMap.put("messageId", c3968d.m15817A0());
        }
        if (c3968d.m15819C0() != null) {
            hashMap.put("messageType", c3968d.m15819C0());
        }
        if (!c3968d.m15827y0().isEmpty()) {
            for (Map.Entry entry : c3968d.m15827y0().entrySet()) {
                hashMap2.put((String) entry.getKey(), entry.getValue());
            }
        }
        hashMap.put("data", hashMap2);
        hashMap.put("ttl", Integer.valueOf(c3968d.m15824H0()));
        hashMap.put("sentTime", Long.valueOf(c3968d.m15822F0()));
        if (c3968d.m15820D0() != null) {
            hashMap.put("notification", m8406e(c3968d.m15820D0()));
        }
        return hashMap;
    }
}

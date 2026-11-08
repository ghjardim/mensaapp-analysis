package p131S4;

import android.util.Log;
import com.google.firebase.firestore.C3952f;
import java.util.HashMap;
import java.util.Map;
import p117Q4.AbstractC2207z;
import p117Q4.C2182a;
import p256j$.util.Objects;

/* renamed from: S4.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2314a {
    /* renamed from: a */
    public static Map m7829a(Exception exc) {
        C2182a c2182a;
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        if (exc instanceof C3952f) {
            c2182a = new C2182a((C3952f) exc, exc.getCause());
        } else if (exc.getCause() == null || !(exc.getCause() instanceof C3952f)) {
            c2182a = null;
        } else {
            c2182a = new C2182a((C3952f) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
        }
        if (c2182a != null) {
            hashMap.put("code", c2182a.m7383a());
            hashMap.put("message", c2182a.getMessage());
        }
        if (hashMap.containsKey("code")) {
            String str = (String) hashMap.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static void m7830b(AbstractC2207z.x xVar, Exception exc) {
        xVar.mo7359b(new AbstractC2207z.j("firebase_firestore", exc != null ? exc.getMessage() : null, m7829a(exc)));
    }
}

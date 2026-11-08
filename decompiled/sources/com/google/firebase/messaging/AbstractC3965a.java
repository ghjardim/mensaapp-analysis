package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p334s.C6308a;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes.dex */
public abstract class AbstractC3965a {

    /* renamed from: a */
    public static final long f13003a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.a$a */
    public static final class a {
        /* renamed from: a */
        public static C6308a m15758a(Bundle bundle) {
            C6308a c6308a = new C6308a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c6308a.put(str, str2);
                    }
                }
            }
            return c6308a;
        }
    }
}

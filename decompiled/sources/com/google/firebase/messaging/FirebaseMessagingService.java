package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import p187a4.AbstractC3157n;
import p187a4.AbstractServiceC3147h;
import p187a4.C3127U;
import p187a4.C3128V;
import p187a4.C3141e;
import p361v2.C6720a;
import p361v2.C6722c;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC3147h {

    /* renamed from: n */
    public static final Queue f13001n = new ArrayDeque(10);

    /* renamed from: f */
    public C6722c f13002f;

    @Override // p187a4.AbstractServiceC3147h
    /* renamed from: e */
    public Intent mo11516e(Intent intent) {
        return C3128V.m11406b().m11408c();
    }

    @Override // p187a4.AbstractServiceC3147h
    /* renamed from: f */
    public void mo11517f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m15751p(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            mo15755t(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    /* renamed from: l */
    public final boolean m15747l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f13001n;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    /* renamed from: m */
    public final void m15748m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C3967c.m15793t(extras)) {
            C3967c c3967c = new C3967c(extras);
            ExecutorService m11555e = AbstractC3157n.m11555e();
            try {
                if (new C3141e(this, c3967c, m11555e).m11499a()) {
                    return;
                }
                m11555e.shutdown();
                if (AbstractC3966b.m15763E(intent)) {
                    AbstractC3966b.m15787w(intent);
                }
            } finally {
                m11555e.shutdown();
            }
        }
        mo15753r(new C3968d(extras));
    }

    /* renamed from: n */
    public final String m15749n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: o */
    public final C6722c m15750o(Context context) {
        if (this.f13002f == null) {
            this.f13002f = new C6722c(context.getApplicationContext());
        }
        return this.f13002f;
    }

    /* renamed from: p */
    public final void m15751p(Intent intent) {
        if (!m15747l(intent.getStringExtra("google.message_id"))) {
            m15757v(intent);
        }
        m15750o(this).m27675b(new C6720a(intent));
    }

    /* renamed from: q */
    public void m15752q() {
    }

    /* renamed from: r */
    public void mo15753r(C3968d c3968d) {
    }

    /* renamed from: s */
    public void m15754s(String str) {
    }

    /* renamed from: t */
    public void mo15755t(String str) {
    }

    /* renamed from: u */
    public void m15756u(String str, Exception exc) {
    }

    /* renamed from: v */
    public final void m15757v(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                m15752q();
                break;
            case "gcm":
                AbstractC3966b.m15789y(intent);
                m15748m(intent);
                break;
            case "send_error":
                m15756u(m15749n(intent), new C3127U(intent.getStringExtra("error")));
                break;
            case "send_event":
                m15754s(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }
}

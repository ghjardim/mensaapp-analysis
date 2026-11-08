package p187a4;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p137T3.InterfaceC2447b;
import p144U3.InterfaceC2535h;
import p219e3.C4176f;
import p361v2.C6722c;
import p381y1.ExecutorC7060k;

/* renamed from: a4.F */
/* loaded from: classes.dex */
public class C3113F {

    /* renamed from: a */
    public final C4176f f9616a;

    /* renamed from: b */
    public final C3117J f9617b;

    /* renamed from: c */
    public final C6722c f9618c;

    /* renamed from: d */
    public final InterfaceC2447b f9619d;

    /* renamed from: e */
    public final InterfaceC2447b f9620e;

    /* renamed from: f */
    public final InterfaceC2535h f9621f;

    public C3113F(C4176f c4176f, C3117J c3117j, InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2, InterfaceC2535h interfaceC2535h) {
        this(c4176f, c3117j, new C6722c(c4176f.m17532m()), interfaceC2447b, interfaceC2447b2, interfaceC2535h);
    }

    /* renamed from: b */
    public static String m11355b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: i */
    public static boolean m11356i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: c */
    public Task m11357c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m11358d(m11366m(C3117J.m11376c(this.f9616a), "*", bundle));
    }

    /* renamed from: d */
    public final Task m11358d(Task task) {
        return task.continueWith(new ExecutorC7060k(), new Continuation() { // from class: a4.E
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String m11363j;
                m11363j = C3113F.this.m11363j(task2);
                return m11363j;
            }
        });
    }

    /* renamed from: e */
    public final String m11359e() {
        try {
            return m11355b(MessageDigest.getInstance("SHA-1").digest(this.f9616a.m17533q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    public Task m11360f() {
        return this.f9618c.m27674a();
    }

    /* renamed from: g */
    public Task m11361g() {
        return m11358d(m11366m(C3117J.m11376c(this.f9616a), "*", new Bundle()));
    }

    /* renamed from: h */
    public final String m11362h(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: j */
    public final /* synthetic */ String m11363j(Task task) {
        return m11362h((Bundle) task.getResult(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0 A[ADDED_TO_REGION] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11364k(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            e3.f r3 = r2.f9616a
            e3.o r3 = r3.m17534r()
            java.lang.String r3 = r3.m17548c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            a4.J r3 = r2.f9617b
            int r3 = r3.m11379d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            a4.J r3 = r2.f9617b
            java.lang.String r3 = r3.m11377a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            a4.J r3 = r2.f9617b
            java.lang.String r3 = r3.m11378b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.m11359e()
            r5.putString(r3, r4)
            U3.h r3 = r2.f9621f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            com.google.android.gms.tasks.Task r3 = r3.mo8499b(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            U3.m r3 = (p144U3.AbstractC2540m) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.mo8475b()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L85:
            U3.h r3 = r2.f9621f
            com.google.android.gms.tasks.Task r3 = r3.mo8498a()
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "24.1.1"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            T3.b r3 = r2.f9620e
            java.lang.Object r3 = r3.get()
            R3.j r3 = (p123R3.InterfaceC2257j) r3
            T3.b r4 = r2.f9619d
            java.lang.Object r4 = r4.get()
            d4.i r4 = (p212d4.InterfaceC4127i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            R3.j$a r3 = r3.mo7672b(r0)
            R3.j$a r0 = p123R3.InterfaceC2257j.a.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.m7678f()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.mo17307a()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p187a4.C3113F.m11364k(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: l */
    public Task m11365l(boolean z6) {
        return this.f9618c.m27677d(z6);
    }

    /* renamed from: m */
    public final Task m11366m(String str, String str2, Bundle bundle) {
        try {
            m11364k(str, str2, bundle);
            return this.f9618c.m27676c(bundle);
        } catch (InterruptedException | ExecutionException e7) {
            return Tasks.forException(e7);
        }
    }

    /* renamed from: n */
    public Task m11367n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m11358d(m11366m(str, "/topics/" + str2, bundle));
    }

    /* renamed from: o */
    public Task m11368o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m11358d(m11366m(str, "/topics/" + str2, bundle));
    }

    public C3113F(C4176f c4176f, C3117J c3117j, C6722c c6722c, InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2, InterfaceC2535h interfaceC2535h) {
        this.f9616a = c4176f;
        this.f9617b = c3117j;
        this.f9618c = c6722c;
        this.f9619d = interfaceC2447b;
        this.f9620e = interfaceC2447b2;
        this.f9621f = interfaceC2535h;
    }
}

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.internal.p0 */
/* loaded from: classes.dex */
public final class C3799p0 {

    /* renamed from: f */
    public static final Uri f12541f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f12542a;

    /* renamed from: b */
    public final String f12543b;

    /* renamed from: c */
    public final ComponentName f12544c;

    /* renamed from: d */
    public final int f12545d;

    /* renamed from: e */
    public final boolean f12546e;

    public C3799p0(ComponentName componentName, int i7) {
        this.f12542a = null;
        this.f12543b = null;
        AbstractC3802r.m15129k(componentName);
        this.f12544c = componentName;
        this.f12545d = 4225;
        this.f12546e = false;
    }

    /* renamed from: a */
    public final ComponentName m15103a() {
        return this.f12544c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent m15104b(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.f12542a
            if (r1 == 0) goto Lb1
            boolean r1 = r5.f12546e
            r2 = 0
            if (r1 == 0) goto La1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.f12542a
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            android.net.Uri r3 = com.google.android.gms.common.internal.C3799p0.f12541f     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r3)     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            if (r6 == 0) goto L3a
            java.lang.String r3 = "serviceIntentCall"
            android.os.Bundle r1 = r6.call(r3, r2, r1)     // Catch: java.lang.Throwable -> L31
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            goto L50
        L2d:
            r6 = move-exception
            goto L43
        L2f:
            r6 = move-exception
            goto L43
        L31:
            r1 = move-exception
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            throw r1     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
        L36:
            r6 = move-exception
            goto L42
        L38:
            r6 = move-exception
            goto L42
        L3a:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            java.lang.String r1 = "Failed to acquire ContentProviderClient"
            r6.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            throw r6     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
        L42:
            r1 = r2
        L43:
            java.lang.String r3 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r3.concat(r6)
            android.util.Log.w(r0, r6)
        L50:
            if (r1 == 0) goto L90
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r1.getParcelable(r6)
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 != 0) goto L90
            java.lang.String r6 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r6 = r1.getParcelable(r6)
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            if (r6 != 0) goto L68
            goto L90
        L68:
            java.lang.String r1 = r5.f12542a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Dynamic lookup for intent failed for action "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " but has possible resolution"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r0, r1)
            com.google.android.gms.common.internal.d0 r0 = new com.google.android.gms.common.internal.d0
            w2.b r1 = new w2.b
            r2 = 25
            r1.<init>(r2, r6)
            r0.<init>(r1)
            throw r0
        L90:
            if (r2 != 0) goto La1
            java.lang.String r6 = r5.f12542a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        La1:
            if (r2 != 0) goto Lbc
            java.lang.String r6 = r5.f12542a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r6 = r5.f12543b
            android.content.Intent r6 = r0.setPackage(r6)
            return r6
        Lb1:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.f12544c
            android.content.Intent r2 = r6.setComponent(r0)
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3799p0.m15104b(android.content.Context):android.content.Intent");
    }

    /* renamed from: c */
    public final String m15105c() {
        return this.f12543b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3799p0)) {
            return false;
        }
        C3799p0 c3799p0 = (C3799p0) obj;
        return AbstractC3798p.m15099b(this.f12542a, c3799p0.f12542a) && AbstractC3798p.m15099b(this.f12543b, c3799p0.f12543b) && AbstractC3798p.m15099b(this.f12544c, c3799p0.f12544c) && this.f12546e == c3799p0.f12546e;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f12542a, this.f12543b, this.f12544c, 4225, Boolean.valueOf(this.f12546e));
    }

    public final String toString() {
        String str = this.f12542a;
        if (str != null) {
            return str;
        }
        AbstractC3802r.m15129k(this.f12544c);
        return this.f12544c.flattenToString();
    }

    public C3799p0(String str, String str2, int i7, boolean z6) {
        AbstractC3802r.m15123e(str);
        this.f12542a = str;
        AbstractC3802r.m15123e(str2);
        this.f12543b = str2;
        this.f12544c = null;
        this.f12545d = 4225;
        this.f12546e = z6;
    }
}

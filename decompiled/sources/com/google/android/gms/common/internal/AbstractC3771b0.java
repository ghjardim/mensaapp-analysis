package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p045G2.C0385f;

/* renamed from: com.google.android.gms.common.internal.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC3771b0 {

    /* renamed from: a */
    public static final Object f12461a = new Object();

    /* renamed from: b */
    public static boolean f12462b;

    /* renamed from: c */
    public static String f12463c;

    /* renamed from: d */
    public static int f12464d;

    /* renamed from: a */
    public static int m15046a(Context context) {
        m15047b(context);
        return f12464d;
    }

    /* renamed from: b */
    public static void m15047b(Context context) {
        Bundle bundle;
        synchronized (f12461a) {
            try {
                if (f12462b) {
                    return;
                }
                f12462b = true;
                try {
                    bundle = C0385f.m1578a(context).m1573c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e7);
                }
                if (bundle == null) {
                    return;
                }
                f12463c = bundle.getString("com.google.app.id");
                f12464d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

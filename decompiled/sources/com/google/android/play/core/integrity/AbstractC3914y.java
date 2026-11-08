package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p157W2.C2667G;

/* renamed from: com.google.android.play.core.integrity.y */
/* loaded from: classes.dex */
abstract class AbstractC3914y {

    /* renamed from: b */
    private final String f12768b;

    /* renamed from: c */
    private final long f12769c;

    /* renamed from: e */
    private boolean f12771e;

    /* renamed from: a */
    private final C2667G f12767a = new C2667G("IntegrityDialogWrapper");

    /* renamed from: d */
    private final Object f12770d = new Object();

    public AbstractC3914y(String str, long j7) {
        this.f12768b = str;
        this.f12769c = j7;
    }

    /* renamed from: a */
    public final Task m15254a(Activity activity, int i7) {
        synchronized (this.f12770d) {
            try {
                if (this.f12771e) {
                    return Tasks.forResult(0);
                }
                this.f12771e = true;
                this.f12767a.m9141a("checkAndShowDialog(%s)", Integer.valueOf(i7));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i7);
                bundle.putString("package.name", this.f12768b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f12769c);
                return mo15212b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public abstract Task mo15212b(Activity activity, Bundle bundle);
}

package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import p157W2.AbstractBinderC2696v;
import p157W2.AbstractC2692r;
import p157W2.C2667G;
import p157W2.C2680f;
import p157W2.InterfaceC2674N;

/* renamed from: com.google.android.play.core.integrity.bn */
/* loaded from: classes.dex */
final class C3881bn {

    /* renamed from: a */
    final C2680f f12723a;

    /* renamed from: b */
    private final C2667G f12724b;

    /* renamed from: c */
    private final String f12725c;

    /* renamed from: d */
    private final TaskCompletionSource f12726d;

    /* renamed from: e */
    private final C3860at f12727e;

    /* renamed from: f */
    private final InterfaceC3898k f12728f;

    public C3881bn(Context context, C2667G c2667g, C3860at c3860at, InterfaceC3898k interfaceC3898k) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12726d = taskCompletionSource;
        this.f12725c = context.getPackageName();
        this.f12724b = c2667g;
        this.f12727e = c3860at;
        this.f12728f = interfaceC3898k;
        C2680f c2680f = new C2680f(context, c2667g, "ExpressIntegrityService", C3882bo.f12729a, new InterfaceC2674N() { // from class: com.google.android.play.core.integrity.bd
            @Override // p157W2.InterfaceC2674N
            /* renamed from: a */
            public final Object mo9149a(IBinder iBinder) {
                return AbstractBinderC2696v.m9196b(iBinder);
            }
        }, null);
        this.f12723a = c2680f;
        c2680f.m9169c().post(new C3872be(this, taskCompletionSource, context));
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m15232a(C3881bn c3881bn, String str, long j7, long j8, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c3881bn.f12725c);
        bundle.putLong("cloud.prj", j7);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j8);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        AbstractC2692r.m9189b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC2692r.m9188a(arrayList)));
        return bundle;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m15233b(C3881bn c3881bn, long j7, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c3881bn.f12725c);
        bundle.putLong("cloud.prj", j7);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        AbstractC2692r.m9189b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC2692r.m9188a(arrayList)));
        return bundle;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ boolean m15239k(C3881bn c3881bn) {
        return c3881bn.f12726d.getTask().isSuccessful() && ((Integer) c3881bn.f12726d.getTask().getResult()).intValue() == 0;
    }

    /* renamed from: c */
    public final Task m15240c(Activity activity, Bundle bundle) {
        int i7 = bundle.getInt("dialog.intent.type");
        this.f12724b.m9144d("requestAndShowDialog(%s)", Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12723a.m9171t(new C3875bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: d */
    public final Task m15241d(String str, long j7, long j8, int i7) {
        this.f12724b.m9144d("requestExpressIntegrityToken(%s)", Long.valueOf(j8));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12723a.m9171t(new C3874bg(this, taskCompletionSource, 0, str, j7, j8, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: e */
    public final Task m15242e(long j7, int i7) {
        this.f12724b.m9144d("warmUpIntegrityToken(%s)", Long.valueOf(j7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12723a.m9171t(new C3873bf(this, taskCompletionSource, 0, j7, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}

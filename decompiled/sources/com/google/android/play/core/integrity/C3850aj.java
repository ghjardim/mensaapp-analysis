package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import p157W2.AbstractBinderC2661A;
import p157W2.AbstractC2684j;
import p157W2.AbstractC2692r;
import p157W2.C2667G;
import p157W2.C2680f;
import p157W2.InterfaceC2674N;

/* renamed from: com.google.android.play.core.integrity.aj */
/* loaded from: classes.dex */
final class C3850aj {

    /* renamed from: a */
    final C2680f f12660a;

    /* renamed from: b */
    private final C2667G f12661b;

    /* renamed from: c */
    private final String f12662c;

    /* renamed from: d */
    private final C3860at f12663d;

    /* renamed from: e */
    private final InterfaceC3898k f12664e;

    public C3850aj(Context context, C2667G c2667g, C3860at c3860at, InterfaceC3898k interfaceC3898k) {
        this.f12662c = context.getPackageName();
        this.f12661b = c2667g;
        this.f12663d = c3860at;
        this.f12664e = interfaceC3898k;
        if (AbstractC2684j.m9179b(context)) {
            this.f12660a = new C2680f(context, c2667g, "IntegrityService", C3851ak.f12665a, new InterfaceC2674N() { // from class: com.google.android.play.core.integrity.ae
                @Override // p157W2.InterfaceC2674N
                /* renamed from: a */
                public final Object mo9149a(IBinder iBinder) {
                    return AbstractBinderC2661A.m9134b(iBinder);
                }
            }, null);
        } else {
            c2667g.m9142b("Phonesky is not installed.", new Object[0]);
            this.f12660a = null;
        }
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m15213a(C3850aj c3850aj, byte[] bArr, Long l7, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c3850aj.f12662c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l7 != null) {
            bundle.putLong("cloud.prj", l7.longValue());
        }
        ArrayList arrayList = new ArrayList();
        AbstractC2692r.m9189b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC2692r.m9188a(arrayList)));
        return bundle;
    }

    /* renamed from: b */
    public final Task m15218b(Activity activity, Bundle bundle) {
        if (this.f12660a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i7 = bundle.getInt("dialog.intent.type");
        this.f12661b.m9144d("requestAndShowDialog(%s, %s)", this.f12662c, Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12660a.m9171t(new C3847ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: c */
    public final Task m15219c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f12660a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof C3855ao) {
            }
            this.f12661b.m9144d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f12660a.m9171t(new C3846af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e7) {
            return Tasks.forException(new IntegrityServiceException(-13, e7));
        }
    }
}

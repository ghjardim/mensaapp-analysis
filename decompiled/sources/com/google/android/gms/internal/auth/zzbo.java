package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p294n2.AbstractC5773b;
import p294n2.C5774c;
import p329r2.C6289b;
import p329r2.C6290c;

/* loaded from: classes.dex */
public final class zzbo extends AbstractC3647e {
    public zzbo(Activity activity, C5774c c5774c) {
        super(activity, AbstractC5773b.f21065a, (C3643a.d) (c5774c == null ? C5774c.f21069b : c5774c), AbstractC3647e.a.f12263c);
    }

    public final Task<String> getSpatulaHeader() {
        return doRead(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        }).m14994e(1520).m14990a());
    }

    public final Task<C6290c> performProxyRequest(final C6289b c6289b) {
        return doWrite(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                C6289b c6289b2 = c6289b;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), c6289b2);
            }
        }).m14994e(1518).m14990a());
    }

    public zzbo(Context context, C5774c c5774c) {
        super(context, AbstractC5773b.f21065a, c5774c == null ? C5774c.f21069b : c5774c, AbstractC3647e.a.f12263c);
    }
}

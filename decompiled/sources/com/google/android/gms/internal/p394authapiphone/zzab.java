package com.google.android.gms.internal.p394authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p321q2.AbstractC6183b;

/* loaded from: classes.dex */
public final class zzab extends AbstractC6183b {
    public zzab(Activity activity) {
        super(activity);
    }

    @Override // p321q2.AbstractC6183b
    public final Task<Void> startSmsRetriever() {
        return doWrite(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        }).m14993d(zzac.zzc).m14994e(1567).m14990a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzab.this, (TaskCompletionSource) obj2));
            }
        }).m14993d(zzac.zzd).m14994e(1568).m14990a());
    }

    public zzab(Context context) {
        super(context);
    }
}

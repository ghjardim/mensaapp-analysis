package com.google.android.gms.internal.p394authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class zzv extends AbstractC3647e {
    private static final C3643a.g zza;
    private static final C3643a.a zzb;
    private static final C3643a zzc;

    static {
        C3643a.g gVar = new C3643a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new C3643a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, (C3643a.d) C3643a.d.f12262l, AbstractC3647e.a.f12263c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC3720v.m14985a().m14993d(zzac.zzb).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        }).m14994e(1566).m14990a());
    }

    public zzv(Context context) {
        super(context, zzc, C3643a.d.f12262l, AbstractC3647e.a.f12263c);
    }
}

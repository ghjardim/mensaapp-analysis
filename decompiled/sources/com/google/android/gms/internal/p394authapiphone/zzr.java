package com.google.android.gms.internal.p394authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class zzr extends AbstractC3647e {
    private static final C3643a.g zza;
    private static final C3643a.a zzb;
    private static final C3643a zzc;

    static {
        C3643a.g gVar = new C3643a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new C3643a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, (C3643a.d) C3643a.d.f12262l, AbstractC3647e.a.f12263c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(AbstractC3720v.m14985a().m14993d(zzac.zza).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        }).m14994e(1564).m14990a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        AbstractC3802r.m15129k(str);
        AbstractC3802r.m15120b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(AbstractC3720v.m14985a().m14993d(zzac.zza).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzr.this, (TaskCompletionSource) obj2));
            }
        }).m14994e(1565).m14990a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC3720v.m14985a().m14993d(zzac.zza).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        }).m14994e(1563).m14990a());
    }

    public zzr(Context context) {
        super(context, zzc, C3643a.d.f12262l, AbstractC3647e.a.f12263c);
    }
}

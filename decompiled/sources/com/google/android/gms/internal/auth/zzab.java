package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p003A2.C0019a;
import p278l2.AbstractC5523j;
import p278l2.AbstractC5524k;
import p278l2.C5515b;

/* loaded from: classes.dex */
final class zzab extends AbstractC3647e implements zzg {
    private static final C3643a.g zza;
    private static final C3643a.a zzb;
    private static final C3643a zzc;
    private static final C0019a zzd;
    private final Context zze;

    static {
        C3643a.g gVar = new C3643a.g();
        zza = gVar;
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzc = new C3643a("GoogleAuthService.API", zzvVar, gVar);
        zzd = AbstractC5523j.m23153a("GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        super(context, zzc, C3643a.d.f12262l, AbstractC3647e.a.f12263c);
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (AbstractC3722w.m15009c(status, obj, taskCompletionSource)) {
            return;
        }
        zzd.m65g("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zza(final zzbw zzbwVar) {
        return doWrite(AbstractC3720v.m14985a().m14993d(AbstractC5524k.f19913l).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth.zzt
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
            }
        }).m14994e(1513).m14990a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzb(final C5515b c5515b) {
        AbstractC3802r.m15130l(c5515b, "request cannot be null.");
        return doWrite(AbstractC3720v.m14985a().m14993d(AbstractC5524k.f19912k).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth.zzu
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                C5515b c5515b2 = c5515b;
                ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), c5515b2);
            }
        }).m14994e(1515).m14990a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzc(final Account account, final String str, final Bundle bundle) {
        AbstractC3802r.m15130l(account, "Account name cannot be null!");
        AbstractC3802r.m15124f(str, "Scope cannot be null!");
        return doWrite(AbstractC3720v.m14985a().m14993d(AbstractC5524k.f19913l).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
            }
        }).m14994e(1512).m14990a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zzd(final Account account) {
        AbstractC3802r.m15130l(account, "account cannot be null.");
        return doWrite(AbstractC3720v.m14985a().m14993d(AbstractC5524k.f19912k).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth.zzr
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
            }
        }).m14994e(1517).m14990a());
    }

    @Override // com.google.android.gms.internal.auth.zzg
    public final Task zze(final String str) {
        AbstractC3802r.m15130l(str, "Client package name cannot be null!");
        return doWrite(AbstractC3720v.m14985a().m14993d(AbstractC5524k.f19912k).m14991b(new InterfaceC3712r() { // from class: com.google.android.gms.internal.auth.zzq
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                zzab zzabVar = zzab.this;
                ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
            }
        }).m14994e(1514).m14990a());
    }
}

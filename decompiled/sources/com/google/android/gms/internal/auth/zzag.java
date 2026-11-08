package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3684d;
import p286m2.InterfaceC5573g;

/* loaded from: classes.dex */
final class zzag extends AbstractC3684d {
    final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, C3643a c3643a, AbstractC3648f abstractC3648f, Account account) {
        super(c3643a, abstractC3648f);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final InterfaceC3729l createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        ((InterfaceC5573g) ((zzam) bVar).getService()).mo23336J(new zzaf(this), this.zza);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzag) obj);
    }
}

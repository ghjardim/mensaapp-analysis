package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3684d;
import p286m2.InterfaceC5573g;

/* loaded from: classes.dex */
final class zzae extends AbstractC3684d {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzal zzalVar, C3643a c3643a, AbstractC3648f abstractC3648f, String str) {
        super(c3643a, abstractC3648f);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC3729l createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        ((InterfaceC5573g) ((zzam) bVar).getService()).mo23338j(new zzad(this), this.zza);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzae) obj);
    }
}

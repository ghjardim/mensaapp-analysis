package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0804p;
import p371w5.C6934q;

/* loaded from: classes.dex */
final class zzgr extends AbstractC5470m implements InterfaceC0804p {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgd zzgdVar, String str, int i7) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i7;
    }

    @Override // p069J5.InterfaceC0804p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i7 = this.zzc;
        if (i7 != -1) {
            this.zza.zzc().zze(i7, objArr);
        }
        return C6934q.f24811a;
    }
}

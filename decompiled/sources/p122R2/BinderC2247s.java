package p122R2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.internal.safetynet.zzad;
import com.google.android.gms.internal.safetynet.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;
import p122R2.InterfaceC2233e;

/* renamed from: R2.s */
/* loaded from: classes.dex */
public final class BinderC2247s extends zzd {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f6858a;

    public BinderC2247s(C2234f c2234f, TaskCompletionSource taskCompletionSource) {
        this.f6858a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(Status status, boolean z6) {
        zzad zzadVar = new zzad(status, z6);
        InterfaceC2233e.c cVar = new InterfaceC2233e.c();
        cVar.m15012b(zzadVar);
        AbstractC3722w.m15008b(status, cVar, this.f6858a);
    }
}

package p122R2;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.C3678a;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.common.internal.AbstractC3800q;
import com.google.android.gms.internal.safetynet.zzae;
import com.google.android.gms.internal.safetynet.zzaf;
import com.google.android.gms.internal.safetynet.zzh;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p122R2.InterfaceC2233e;

/* renamed from: R2.f */
/* loaded from: classes.dex */
public class C2234f extends AbstractC3647e {
    public C2234f(Context context) {
        super(context, AbstractC2232d.f6844a, (C3643a.d) null, new C3678a());
    }

    /* renamed from: d */
    public Task m7659d(byte[] bArr, String str) {
        return AbstractC3800q.m15106a(zzae.zza(asGoogleApiClient(), bArr, str), new InterfaceC2233e.a());
    }

    /* renamed from: e */
    public Task m7660e() {
        return doRead(AbstractC3720v.m14985a().m14994e(4201).m14991b(new InterfaceC3712r() { // from class: R2.r
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzaf) obj).getService()).zzf(new BinderC2247s(C2234f.this, (TaskCompletionSource) obj2));
            }
        }).m14990a());
    }
}

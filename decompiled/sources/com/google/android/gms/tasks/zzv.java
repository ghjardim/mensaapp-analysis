package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.AbstractC3694i;
import com.google.android.gms.common.api.internal.InterfaceC3696j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzv extends AbstractC3694i {
    private final List zza;

    private zzv(InterfaceC3696j interfaceC3696j) {
        super(interfaceC3696j);
        this.zza = new ArrayList();
        this.mLifecycleFragment.mo14970b("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        InterfaceC3696j fragment = AbstractC3694i.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.mo14971c("TaskOnStopCallback", zzv.class);
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3694i
    public final void onStop() {
        synchronized (this.zza) {
            try {
                Iterator it = this.zza.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzc();
                    }
                }
                this.zza.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}

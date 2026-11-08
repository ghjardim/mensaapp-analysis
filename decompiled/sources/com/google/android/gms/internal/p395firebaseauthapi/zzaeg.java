package com.google.android.gms.internal.p395firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3694i;
import com.google.android.gms.common.api.internal.InterfaceC3696j;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.auth.AbstractC3933b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p219e3.C4176f;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6508h;
import p354u3.InterfaceC6684x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzaeg<ResultT, CallbackT> implements zzaer<ResultT> {
    protected final int zza;
    protected C4176f zzc;
    protected AbstractC6458A zzd;
    protected CallbackT zze;
    protected InterfaceC6684x zzf;
    protected zzaeh<ResultT> zzg;
    protected Executor zzi;
    protected zzagw zzj;
    protected zzagl zzk;
    protected zzafw zzl;
    protected zzahg zzm;
    protected AbstractC6508h zzn;
    protected String zzo;
    protected String zzp;
    protected zzzs zzq;
    protected zzagt zzr;
    protected zzags zzs;
    protected zzahs zzt;
    private boolean zzu;
    protected final zzaei zzb = new zzaei(this);
    protected final List<AbstractC3933b.b> zzh = new ArrayList();

    public static class zza extends AbstractC3694i {
        private final List<AbstractC3933b.b> zza;

        private zza(InterfaceC3696j interfaceC3696j, List<AbstractC3933b.b> list) {
            super(interfaceC3696j);
            this.mLifecycleFragment.mo14970b("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<AbstractC3933b.b> list) {
            InterfaceC3696j fragment = AbstractC3694i.getFragment(activity);
            if (((zza) fragment.mo14971c("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC3694i
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaeg(int i7) {
        this.zza = i7;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaeg<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) AbstractC3802r.m15130l(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(InterfaceC6684x interfaceC6684x) {
        this.zzf = (InterfaceC6684x) AbstractC3802r.m15130l(interfaceC6684x, "external failure callback cannot be null");
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(C4176f c4176f) {
        this.zzc = (C4176f) AbstractC3802r.m15130l(c4176f, "firebaseApp cannot be null");
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(AbstractC6458A abstractC6458A) {
        this.zzd = (AbstractC6458A) AbstractC3802r.m15130l(abstractC6458A, "firebaseUser cannot be null");
        return this;
    }

    public final zzaeg<ResultT, CallbackT> zza(AbstractC3933b.b bVar, Activity activity, Executor executor, String str) {
        AbstractC3933b.b zza2 = zzafc.zza(str, bVar, this);
        synchronized (this.zzh) {
            this.zzh.add((AbstractC3933b.b) AbstractC3802r.m15129k(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) AbstractC3802r.m15129k(executor);
        return this;
    }

    public static /* synthetic */ void zza(zzaeg zzaegVar) {
        zzaegVar.zzb();
        AbstractC3802r.m15133o(zzaegVar.zzu, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzaeg zzaegVar, Status status) {
        InterfaceC6684x interfaceC6684x = zzaegVar.zzf;
        if (interfaceC6684x != null) {
            interfaceC6684x.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}

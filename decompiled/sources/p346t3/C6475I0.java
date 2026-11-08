package p346t3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzahs;
import com.google.android.gms.internal.p395firebaseauthapi.zzahy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import p354u3.C6657j0;

/* renamed from: t3.I0 */
/* loaded from: classes.dex */
public final class C6475I0 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f23377a;

    public C6475I0(FirebaseAuth firebaseAuth) {
        this.f23377a = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) AbstractC3802r.m15129k(task.getException()));
        }
        zzahs zzahsVar = (zzahs) task.getResult();
        if (zzahsVar instanceof zzahy) {
            zzahy zzahyVar = (zzahy) zzahsVar;
            return Tasks.forResult(new C6657j0(AbstractC3802r.m15123e(zzahyVar.zzf()), AbstractC3802r.m15123e(zzahyVar.zze()), zzahyVar.zzc(), zzahyVar.zzb(), zzahyVar.zzd(), AbstractC3802r.m15123e(zzahyVar.zza()), this.f23377a));
        }
        throw new IllegalArgumentException("Response should be an instance of StartTotpMfaEnrollmentResponse but was " + zzahsVar.getClass().getName() + ".");
    }
}

package p354u3;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzae;
import com.google.android.gms.internal.p395firebaseauthapi.zzagt;
import com.google.android.gms.internal.p395firebaseauthapi.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;

/* renamed from: u3.b0 */
/* loaded from: classes.dex */
public final class C6641b0 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ String f23984a;

    /* renamed from: b */
    public final /* synthetic */ C6643c0 f23985b;

    public C6641b0(C6643c0 c6643c0, String str) {
        this.f23984a = str;
        this.f23985b = c6643c0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new C6637Z((String) AbstractC3802r.m15129k(((Exception) AbstractC3802r.m15129k(task.getException())).getMessage())));
        }
        zzagt zzagtVar = (zzagt) task.getResult();
        String zza = zzagtVar.zza();
        if (zzae.zzc(zza)) {
            return Tasks.forException(new C6637Z("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f23984a));
        }
        List<String> zza2 = zzv.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + zza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f23984a);
        }
        C6643c0 c6643c0 = this.f23985b;
        Task mo27519a = c6643c0.f24000f.mo27519a((Application) c6643c0.f23998d.m17532m(), str);
        C6643c0.m27520c(this.f23985b, zzagtVar, mo27519a, this.f23984a);
        return mo27519a;
    }
}

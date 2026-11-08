package p354u3;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p395firebaseauthapi.zzags;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;

/* renamed from: u3.n0 */
/* loaded from: classes.dex */
public final class C6665n0 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ String f24065a;

    /* renamed from: b */
    public final /* synthetic */ IntegrityManager f24066b;

    /* renamed from: c */
    public final /* synthetic */ C6610D f24067c;

    public C6665n0(C6610D c6610d, String str, IntegrityManager integrityManager) {
        this.f24065a = str;
        this.f24066b = integrityManager;
        this.f24067c = c6610d;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        String str;
        if (task.isSuccessful()) {
            this.f24067c.f23932a = ((zzags) task.getResult()).zza();
            return this.f24066b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzags) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f24065a.getBytes("UTF-8")), 11))).build());
        }
        str = C6610D.f23930b;
        Log.e(str, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}

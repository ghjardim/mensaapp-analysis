package p354u3;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzadr;
import com.google.android.gms.internal.p395firebaseauthapi.zzafa;
import com.google.android.gms.internal.p395firebaseauthapi.zzafm;
import com.google.android.gms.internal.p395firebaseauthapi.zzags;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import org.apache.tika.utils.StringUtils;
import p346t3.C6526q;
import p346t3.C6532t;

/* renamed from: u3.D */
/* loaded from: classes.dex */
public class C6610D {

    /* renamed from: b */
    public static final String f23930b = "D";

    /* renamed from: c */
    public static final C6610D f23931c = new C6610D();

    /* renamed from: a */
    public String f23932a;

    /* renamed from: b */
    public static C6610D m27488b() {
        return f23931c;
    }

    /* renamed from: e */
    public static /* synthetic */ void m27489e(C6610D c6610d, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z6, boolean z7, C6659k0 c6659k0, Task task) {
        if (!task.isSuccessful()) {
            Log.e(f23930b, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.m15371r0() == null || !firebaseAuth.m15371r0().m27525e("PHONE_PROVIDER")) {
            c6610d.m27496c(firebaseAuth, str, activity, z6, z7, c6659k0, taskCompletionSource);
        } else {
            firebaseAuth.m15371r0().m27523b(firebaseAuth.m15369q(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new C6667o0(c6610d, taskCompletionSource)).addOnFailureListener(new C6649f0(c6610d, firebaseAuth, str, activity, z6, z7, c6659k0, taskCompletionSource));
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m27490f(C6610D c6610d, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, C6659k0 c6659k0, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new C6681v0().mo27579a(((IntegrityTokenResponse) task.getResult()).token()).mo27580b());
            return;
        }
        String message = task.getException() == null ? StringUtils.EMPTY : task.getException().getMessage();
        Log.e(f23930b, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        c6610d.m27497d(firebaseAuth, c6659k0, activity, taskCompletionSource);
    }

    /* renamed from: i */
    public static boolean m27493i(Exception exc) {
        if (exc instanceof C6532t) {
            return true;
        }
        return (exc instanceof C6526q) && ((C6526q) exc).m27125a().endsWith("UNAUTHORIZED_DOMAIN");
    }

    /* renamed from: a */
    public final Task m27495a(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z6, boolean z7, boolean z8, final RecaptchaAction recaptchaAction) {
        C6648f c6648f = (C6648f) firebaseAuth.m15365o();
        final C6659k0 m27559f = C6659k0.m27559f();
        if (zzafm.zza(firebaseAuth.m15359l()) || c6648f.m27540h()) {
            return Tasks.forResult(new C6681v0().mo27580b());
        }
        String str2 = f23930b;
        Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z7 + ", ForceRecaptchav2Flow from firebaseSettings = " + c6648f.m27538f());
        boolean z9 = z7 || c6648f.m27538f();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task m27564e = m27559f.m27564e();
        if (m27564e != null) {
            if (m27564e.isSuccessful()) {
                return Tasks.forResult(new C6681v0().mo27582d((String) m27564e.getResult()).mo27580b());
            }
            Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + m27564e.getException().getMessage());
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (z9 || z8) {
            m27496c(firebaseAuth, str, activity, z6, z9, m27559f, taskCompletionSource);
        } else {
            final boolean z10 = false;
            firebaseAuth.m15370r().addOnCompleteListener(new OnCompleteListener() { // from class: u3.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C6610D.m27489e(C6610D.this, taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z6, z10, m27559f, task);
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    /* renamed from: c */
    public final void m27496c(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z6, boolean z7, final C6659k0 c6659k0, final TaskCompletionSource taskCompletionSource) {
        if (!z6 || z7) {
            m27497d(firebaseAuth, c6659k0, activity, taskCompletionSource);
        } else {
            (!TextUtils.isEmpty(this.f23932a) ? Tasks.forResult(new zzags(this.f23932a)) : firebaseAuth.m15325K()).continueWithTask(firebaseAuth.m15317E0(), new C6665n0(this, str, IntegrityManagerFactory.create(firebaseAuth.m15359l().m17532m()))).addOnCompleteListener(new OnCompleteListener() { // from class: u3.m0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C6610D.m27490f(C6610D.this, taskCompletionSource, firebaseAuth, c6659k0, activity, task);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m27497d(FirebaseAuth firebaseAuth, C6659k0 c6659k0, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new C6532t());
            return;
        }
        C6628P.m27508d(firebaseAuth.m15359l().m17532m(), firebaseAuth);
        AbstractC3802r.m15129k(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (C6604A.m27473b().m27480h(activity, taskCompletionSource2)) {
            new zzafa(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(zzadr.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new C6669p0(this, taskCompletionSource)).addOnFailureListener(new C6671q0(this, taskCompletionSource));
    }
}

package p354u3;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzae;
import com.google.android.gms.internal.p395firebaseauthapi.zzagt;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import p219e3.C4176f;

/* renamed from: u3.c0 */
/* loaded from: classes.dex */
public final class C6643c0 {

    /* renamed from: a */
    public final Object f23995a;

    /* renamed from: b */
    public final Map f23996b;

    /* renamed from: c */
    public zzagt f23997c;

    /* renamed from: d */
    public C4176f f23998d;

    /* renamed from: e */
    public FirebaseAuth f23999e;

    /* renamed from: f */
    public InterfaceC6635X f24000f;

    public C6643c0(C4176f c4176f, FirebaseAuth firebaseAuth) {
        this(c4176f, firebaseAuth, new C6639a0());
    }

    /* renamed from: c */
    public static /* synthetic */ void m27520c(C6643c0 c6643c0, zzagt zzagtVar, Task task, String str) {
        synchronized (c6643c0.f23995a) {
            c6643c0.f23997c = zzagtVar;
            c6643c0.f23996b.put(str, task);
        }
    }

    /* renamed from: g */
    public static String m27521g(String str) {
        return zzae.zzc(str) ? "*" : str;
    }

    /* renamed from: a */
    public final Task m27522a(String str, Boolean bool) {
        Task m27526f;
        String m27521g = m27521g(str);
        return (bool.booleanValue() || (m27526f = m27526f(m27521g)) == null) ? this.f23999e.m15329M("RECAPTCHA_ENTERPRISE").continueWithTask(new C6641b0(this, m27521g)) : m27526f;
    }

    /* renamed from: b */
    public final Task m27523b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String m27521g = m27521g(str);
        Task m27526f = m27526f(m27521g);
        if (bool.booleanValue() || m27526f == null) {
            m27526f = m27522a(m27521g, bool);
        }
        return m27526f.continueWithTask(new C6647e0(this, recaptchaAction));
    }

    /* renamed from: d */
    public final boolean m27524d(String str) {
        String zzb;
        AbstractC3802r.m15129k(str);
        zzagt zzagtVar = this.f23997c;
        if (zzagtVar == null || (zzb = zzagtVar.zzb(str)) == null) {
            return false;
        }
        return zzb.equals("AUDIT");
    }

    /* renamed from: e */
    public final boolean m27525e(String str) {
        boolean z6;
        synchronized (this.f23995a) {
            try {
                zzagt zzagtVar = this.f23997c;
                z6 = zzagtVar != null && zzagtVar.zzc(str);
            } finally {
            }
        }
        return z6;
    }

    /* renamed from: f */
    public final Task m27526f(String str) {
        Task task;
        synchronized (this.f23995a) {
            task = (Task) this.f23996b.get(str);
        }
        return task;
    }

    public C6643c0(C4176f c4176f, FirebaseAuth firebaseAuth, InterfaceC6635X interfaceC6635X) {
        this.f23995a = new Object();
        this.f23996b = new HashMap();
        this.f23998d = c4176f;
        this.f23999e = firebaseAuth;
        this.f24000f = interfaceC6635X;
    }
}

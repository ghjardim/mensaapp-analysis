package p346t3;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p395firebaseauthapi.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p219e3.C4176f;
import p354u3.AbstractC6631T;

/* renamed from: t3.E0 */
/* loaded from: classes.dex */
public final class C6467E0 extends AbstractC6631T {

    /* renamed from: a */
    public final /* synthetic */ String f23367a;

    /* renamed from: b */
    public final /* synthetic */ C6502e f23368b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f23369c;

    public C6467E0(FirebaseAuth firebaseAuth, String str, C6502e c6502e) {
        this.f23367a = str;
        this.f23368b = c6502e;
        this.f23369c = firebaseAuth;
    }

    @Override // p354u3.AbstractC6631T
    /* renamed from: c */
    public final Task mo15413c(String str) {
        zzabq zzabqVar;
        C4176f c4176f;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Password reset request " + this.f23367a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + this.f23367a);
        }
        zzabqVar = this.f23369c.f12794e;
        c4176f = this.f23369c.f12790a;
        String str3 = this.f23367a;
        C6502e c6502e = this.f23368b;
        str2 = this.f23369c.f12800k;
        return zzabqVar.zza(c4176f, str3, c6502e, str2, str);
    }
}

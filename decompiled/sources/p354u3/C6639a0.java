package p354u3;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;

/* renamed from: u3.a0 */
/* loaded from: classes.dex */
public final class C6639a0 implements InterfaceC6635X {
    @Override // p354u3.InterfaceC6635X
    /* renamed from: a */
    public final Task mo27519a(Application application, String str) {
        return Recaptcha.fetchTaskClient(application, str);
    }
}

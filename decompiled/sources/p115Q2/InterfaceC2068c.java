package p115Q2;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* renamed from: Q2.c */
/* loaded from: classes.dex */
public interface InterfaceC2068c {

    /* renamed from: Q2.c$a */
    public enum a {
        GOOGLE_PAY,
        GOOGLE_WALLET
    }

    Task getPayApiAvailabilityStatus(int i7);

    void savePasses(String str, Activity activity, int i7);
}

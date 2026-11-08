package p030E1;

import android.os.Build;
import android.view.View;

/* renamed from: E1.K */
/* loaded from: classes.dex */
public class C0233K extends AbstractC0231I {

    /* renamed from: g */
    public static boolean f936g = true;

    @Override // p030E1.AbstractC0235M
    /* renamed from: f */
    public void mo949f(View view, int i7) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo949f(view, i7);
        } else if (f936g) {
            try {
                view.setTransitionVisibility(i7);
            } catch (NoSuchMethodError unused) {
                f936g = false;
            }
        }
    }
}

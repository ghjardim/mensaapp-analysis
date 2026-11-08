package p291n;

import android.os.Build;
import android.view.View;

/* renamed from: n.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC5636f0 {
    /* renamed from: a */
    public static void m23670a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ViewOnLongClickListenerC5638g0.m23672f(view, charSequence);
        }
    }
}

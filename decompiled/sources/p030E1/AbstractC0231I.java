package p030E1;

import android.view.View;

/* renamed from: E1.I */
/* loaded from: classes.dex */
public abstract class AbstractC0231I extends AbstractC0229G {

    /* renamed from: f */
    public static boolean f935f = true;

    @Override // p030E1.AbstractC0235M
    /* renamed from: d */
    public void mo947d(View view, int i7, int i8, int i9, int i10) {
        if (f935f) {
            try {
                view.setLeftTopRightBottom(i7, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f935f = false;
            }
        }
    }
}

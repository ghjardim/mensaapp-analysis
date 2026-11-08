package p030E1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: E1.G */
/* loaded from: classes.dex */
public abstract class AbstractC0229G extends AbstractC0226D {

    /* renamed from: d */
    public static boolean f933d = true;

    /* renamed from: e */
    public static boolean f934e = true;

    @Override // p030E1.AbstractC0235M
    /* renamed from: g */
    public void mo944g(View view, Matrix matrix) {
        if (f933d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f933d = false;
            }
        }
    }

    @Override // p030E1.AbstractC0235M
    /* renamed from: h */
    public void mo945h(View view, Matrix matrix) {
        if (f934e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f934e = false;
            }
        }
    }
}

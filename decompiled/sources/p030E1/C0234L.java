package p030E1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: E1.L */
/* loaded from: classes.dex */
public class C0234L extends C0233K {
    @Override // p030E1.AbstractC0226D, p030E1.AbstractC0235M
    /* renamed from: b */
    public float mo939b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p030E1.AbstractC0231I, p030E1.AbstractC0235M
    /* renamed from: d */
    public void mo947d(View view, int i7, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override // p030E1.AbstractC0226D, p030E1.AbstractC0235M
    /* renamed from: e */
    public void mo941e(View view, float f7) {
        view.setTransitionAlpha(f7);
    }

    @Override // p030E1.C0233K, p030E1.AbstractC0235M
    /* renamed from: f */
    public void mo949f(View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override // p030E1.AbstractC0229G, p030E1.AbstractC0235M
    /* renamed from: g */
    public void mo944g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p030E1.AbstractC0229G, p030E1.AbstractC0235M
    /* renamed from: h */
    public void mo945h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}

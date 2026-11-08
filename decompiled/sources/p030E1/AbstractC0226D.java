package p030E1;

import android.view.View;

/* renamed from: E1.D */
/* loaded from: classes.dex */
public abstract class AbstractC0226D extends AbstractC0235M {

    /* renamed from: c */
    public static boolean f932c = true;

    @Override // p030E1.AbstractC0235M
    /* renamed from: b */
    public float mo939b(View view) {
        float transitionAlpha;
        if (f932c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f932c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p030E1.AbstractC0235M
    /* renamed from: e */
    public void mo941e(View view, float f7) {
        if (f932c) {
            try {
                view.setTransitionAlpha(f7);
                return;
            } catch (NoSuchMethodError unused) {
                f932c = false;
            }
        }
        view.setAlpha(f7);
    }

    @Override // p030E1.AbstractC0235M
    /* renamed from: a */
    public void mo938a(View view) {
    }

    @Override // p030E1.AbstractC0235M
    /* renamed from: c */
    public void mo940c(View view) {
    }
}

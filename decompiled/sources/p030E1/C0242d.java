package p030E1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p049H.AbstractC0475B;

/* renamed from: E1.d */
/* loaded from: classes.dex */
public class C0242d extends AbstractC0236N {

    /* renamed from: E1.d$a */
    public class a extends AbstractC0251m {

        /* renamed from: a */
        public final /* synthetic */ View f995a;

        public a(View view) {
            this.f995a = view;
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            AbstractC0223A.m928g(this.f995a, 1.0f);
            AbstractC0223A.m922a(this.f995a);
            abstractC0250l.mo1031Q(this);
        }
    }

    /* renamed from: E1.d$b */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f997a;

        /* renamed from: b */
        public boolean f998b = false;

        public b(View view) {
            this.f997a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0223A.m928g(this.f997a, 1.0f);
            if (this.f998b) {
                this.f997a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC0475B.m1762u(this.f997a) && this.f997a.getLayerType() == 0) {
                this.f998b = true;
                this.f997a.setLayerType(2, null);
            }
        }
    }

    public C0242d(int i7) {
        m959j0(i7);
    }

    /* renamed from: l0 */
    public static float m990l0(C0257s c0257s, float f7) {
        Float f8;
        return (c0257s == null || (f8 = (Float) c0257s.f1080a.get("android:fade:transitionAlpha")) == null) ? f7 : f8.floatValue();
    }

    @Override // p030E1.AbstractC0236N
    /* renamed from: g0 */
    public Animator mo956g0(ViewGroup viewGroup, View view, C0257s c0257s, C0257s c0257s2) {
        float m990l0 = m990l0(c0257s, 0.0f);
        return m991k0(view, m990l0 != 1.0f ? m990l0 : 0.0f, 1.0f);
    }

    @Override // p030E1.AbstractC0236N
    /* renamed from: i0 */
    public Animator mo958i0(ViewGroup viewGroup, View view, C0257s c0257s, C0257s c0257s2) {
        AbstractC0223A.m926e(view);
        return m991k0(view, m990l0(c0257s, 1.0f), 0.0f);
    }

    @Override // p030E1.AbstractC0236N, p030E1.AbstractC0250l
    /* renamed from: k */
    public void mo960k(C0257s c0257s) {
        super.mo960k(c0257s);
        c0257s.f1080a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC0223A.m924c(c0257s.f1081b)));
    }

    /* renamed from: k0 */
    public final Animator m991k0(View view, float f7, float f8) {
        if (f7 == f8) {
            return null;
        }
        AbstractC0223A.m928g(view, f7);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC0223A.f930b, f8);
        ofFloat.addListener(new b(view));
        mo1041a(new a(view));
        return ofFloat;
    }
}

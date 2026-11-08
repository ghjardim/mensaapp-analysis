package p161X;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import p049H.ViewTreeObserverOnPreDrawListenerC0528w;
import p154W.AbstractC2650a;
import p154W.AbstractC2651b;

/* renamed from: X.v */
/* loaded from: classes.dex */
public abstract class AbstractC2792v {
    /* renamed from: a */
    public static int m9950a(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, boolean z6, boolean z7) {
        return z7 ? z6 ? abstractComponentCallbacksC2786p.m9829J() : abstractComponentCallbacksC2786p.m9831K() : z6 ? abstractComponentCallbacksC2786p.m9905u() : abstractComponentCallbacksC2786p.m9913y();
    }

    /* renamed from: b */
    public static a m9951b(Context context, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, boolean z6, boolean z7) {
        int m9821F = abstractComponentCallbacksC2786p.m9821F();
        int m9950a = m9950a(abstractComponentCallbacksC2786p, z6, z7);
        abstractComponentCallbacksC2786p.m9907u1(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC2786p.f8434P;
        if (viewGroup != null && viewGroup.getTag(AbstractC2651b.f7863c) != null) {
            abstractComponentCallbacksC2786p.f8434P.setTag(AbstractC2651b.f7863c, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC2786p.f8434P;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation m9891p0 = abstractComponentCallbacksC2786p.m9891p0(m9821F, z6, m9950a);
        if (m9891p0 != null) {
            return new a(m9891p0);
        }
        Animator m9894q0 = abstractComponentCallbacksC2786p.m9894q0(m9821F, z6, m9950a);
        if (m9894q0 != null) {
            return new a(m9894q0);
        }
        if (m9950a == 0 && m9821F != 0) {
            m9950a = m9953d(context, m9821F, z6);
        }
        if (m9950a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m9950a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m9950a);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e7) {
                    throw e7;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, m9950a);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e8) {
                if (equals) {
                    throw e8;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m9950a);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m9952c(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    public static int m9953d(Context context, int i7, boolean z6) {
        if (i7 == 4097) {
            return z6 ? AbstractC2650a.f7859e : AbstractC2650a.f7860f;
        }
        if (i7 == 8194) {
            return z6 ? AbstractC2650a.f7855a : AbstractC2650a.f7856b;
        }
        if (i7 == 8197) {
            return z6 ? m9952c(context, R.attr.activityCloseEnterAnimation) : m9952c(context, R.attr.activityCloseExitAnimation);
        }
        if (i7 == 4099) {
            return z6 ? AbstractC2650a.f7857c : AbstractC2650a.f7858d;
        }
        if (i7 != 4100) {
            return -1;
        }
        return z6 ? m9952c(context, R.attr.activityOpenEnterAnimation) : m9952c(context, R.attr.activityOpenExitAnimation);
    }

    /* renamed from: X.v$a */
    public static class a {

        /* renamed from: a */
        public final Animation f8511a;

        /* renamed from: b */
        public final AnimatorSet f8512b;

        public a(Animation animation) {
            this.f8511a = animation;
            this.f8512b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f8511a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f8512b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: X.v$b */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a */
        public final ViewGroup f8513a;

        /* renamed from: b */
        public final View f8514b;

        /* renamed from: c */
        public boolean f8515c;

        /* renamed from: d */
        public boolean f8516d;

        /* renamed from: e */
        public boolean f8517e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f8517e = true;
            this.f8513a = viewGroup;
            this.f8514b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation) {
            this.f8517e = true;
            if (this.f8515c) {
                return !this.f8516d;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f8515c = true;
                ViewTreeObserverOnPreDrawListenerC0528w.m2025a(this.f8513a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8515c || !this.f8517e) {
                this.f8513a.endViewTransition(this.f8514b);
                this.f8516d = true;
            } else {
                this.f8517e = false;
                this.f8513a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation, float f7) {
            this.f8517e = true;
            if (this.f8515c) {
                return !this.f8516d;
            }
            if (!super.getTransformation(j7, transformation, f7)) {
                this.f8515c = true;
                ViewTreeObserverOnPreDrawListenerC0528w.m2025a(this.f8513a, this);
            }
            return true;
        }
    }
}

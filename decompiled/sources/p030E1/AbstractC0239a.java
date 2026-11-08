package p030E1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: E1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0239a {
    /* renamed from: a */
    public static void m969a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    public static void m970b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    public static void m971c(Animator animator) {
        animator.resume();
    }
}

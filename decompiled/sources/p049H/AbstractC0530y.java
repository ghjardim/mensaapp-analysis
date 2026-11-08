package p049H;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Map;
import java.util.WeakHashMap;
import p256j$.util.DesugarCollections;

/* renamed from: H.y */
/* loaded from: classes.dex */
public abstract class AbstractC0530y {

    /* renamed from: a */
    public static Map f1722a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: H.y$a */
    public static class a {
        /* renamed from: a */
        public static float m2032a(VelocityTracker velocityTracker, int i7) {
            return velocityTracker.getAxisVelocity(i7);
        }
    }

    /* renamed from: a */
    public static void m2027a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f1722a.containsKey(velocityTracker)) {
                f1722a.put(velocityTracker, new C0531z());
            }
            ((C0531z) f1722a.get(velocityTracker)).m2034a(motionEvent);
        }
    }

    /* renamed from: b */
    public static void m2028b(VelocityTracker velocityTracker, int i7) {
        m2029c(velocityTracker, i7, Float.MAX_VALUE);
    }

    /* renamed from: c */
    public static void m2029c(VelocityTracker velocityTracker, int i7, float f7) {
        velocityTracker.computeCurrentVelocity(i7, f7);
        C0531z m2031e = m2031e(velocityTracker);
        if (m2031e != null) {
            m2031e.m2036c(i7, f7);
        }
    }

    /* renamed from: d */
    public static float m2030d(VelocityTracker velocityTracker, int i7) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m2032a(velocityTracker, i7);
        }
        if (i7 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i7 == 1) {
            return velocityTracker.getYVelocity();
        }
        C0531z m2031e = m2031e(velocityTracker);
        if (m2031e != null) {
            return m2031e.m2037d(i7);
        }
        return 0.0f;
    }

    /* renamed from: e */
    public static C0531z m2031e(VelocityTracker velocityTracker) {
        return (C0531z) f1722a.get(velocityTracker);
    }
}

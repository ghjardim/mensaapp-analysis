package p070K;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: K.c */
/* loaded from: classes.dex */
public abstract class AbstractC0814c {

    /* renamed from: K.c$a */
    public static class a {
        /* renamed from: a */
        public static void m3390a(EdgeEffect edgeEffect, float f7, float f8) {
            edgeEffect.onPull(f7, f8);
        }
    }

    /* renamed from: K.c$b */
    public static class b {
        /* renamed from: a */
        public static EdgeEffect m3391a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m3392b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m3393c(EdgeEffect edgeEffect, float f7, float f8) {
            try {
                return edgeEffect.onPullDistance(f7, f8);
            } catch (Throwable unused) {
                edgeEffect.onPull(f7, f8);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m3386a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.m3391a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m3387b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m3392b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m3388c(EdgeEffect edgeEffect, float f7, float f8) {
        a.m3390a(edgeEffect, f7, f8);
    }

    /* renamed from: d */
    public static float m3389d(EdgeEffect edgeEffect, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m3393c(edgeEffect, f7, f8);
        }
        m3388c(edgeEffect, f7, f8);
        return f7;
    }
}

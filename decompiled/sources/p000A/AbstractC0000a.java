package p000A;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: A.a */
/* loaded from: classes.dex */
public abstract class AbstractC0000a {

    /* renamed from: A.a$a */
    public static class a {
        /* renamed from: a */
        public static void m16a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        public static boolean m17b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        public static ColorFilter m18c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        public static void m19d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        public static void m20e(Drawable drawable, float f7, float f8) {
            drawable.setHotspot(f7, f8);
        }

        /* renamed from: f */
        public static void m21f(Drawable drawable, int i7, int i8, int i9, int i10) {
            drawable.setHotspotBounds(i7, i8, i9, i10);
        }

        /* renamed from: g */
        public static void m22g(Drawable drawable, int i7) {
            drawable.setTint(i7);
        }

        /* renamed from: h */
        public static void m23h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        public static void m24i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: A.a$b */
    public static class b {
        /* renamed from: a */
        public static int m25a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }
    }

    /* renamed from: a */
    public static void m0a(Drawable drawable, Resources.Theme theme) {
        a.m16a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m1b(Drawable drawable) {
        return a.m17b(drawable);
    }

    /* renamed from: c */
    public static int m2c(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* renamed from: d */
    public static ColorFilter m3d(Drawable drawable) {
        return a.m18c(drawable);
    }

    /* renamed from: e */
    public static int m4e(Drawable drawable) {
        return b.m25a(drawable);
    }

    /* renamed from: f */
    public static void m5f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        a.m19d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: g */
    public static boolean m6g(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* renamed from: h */
    public static void m7h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: i */
    public static void m8i(Drawable drawable, boolean z6) {
        drawable.setAutoMirrored(z6);
    }

    /* renamed from: j */
    public static void m9j(Drawable drawable, float f7, float f8) {
        a.m20e(drawable, f7, f8);
    }

    /* renamed from: k */
    public static void m10k(Drawable drawable, int i7, int i8, int i9, int i10) {
        a.m21f(drawable, i7, i8, i9, i10);
    }

    /* renamed from: l */
    public static void m11l(Drawable drawable, int i7) {
        a.m22g(drawable, i7);
    }

    /* renamed from: m */
    public static void m12m(Drawable drawable, ColorStateList colorStateList) {
        a.m23h(drawable, colorStateList);
    }

    /* renamed from: n */
    public static void m13n(Drawable drawable, PorterDuff.Mode mode) {
        a.m24i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static Drawable m14o(Drawable drawable) {
        return drawable instanceof InterfaceC0001b ? ((InterfaceC0001b) drawable).m26a() : drawable;
    }

    /* renamed from: p */
    public static Drawable m15p(Drawable drawable) {
        return drawable;
    }
}

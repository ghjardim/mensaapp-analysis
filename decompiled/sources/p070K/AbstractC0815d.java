package p070K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: K.d */
/* loaded from: classes.dex */
public abstract class AbstractC0815d {

    /* renamed from: K.d$a */
    public static class a {
        /* renamed from: a */
        public static ColorStateList m3398a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m3399b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        public static void m3400c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m3401d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m3394a(ImageView imageView) {
        return a.m3398a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m3395b(ImageView imageView) {
        return a.m3399b(imageView);
    }

    /* renamed from: c */
    public static void m3396c(ImageView imageView, ColorStateList colorStateList) {
        a.m3400c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m3397d(ImageView imageView, PorterDuff.Mode mode) {
        a.m3401d(imageView, mode);
    }
}

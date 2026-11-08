package p049H;

import android.os.Build;
import android.view.DisplayCutout;
import p042G.AbstractC0340b;

/* renamed from: H.h */
/* loaded from: classes.dex */
public final class C0513h {

    /* renamed from: a */
    public final DisplayCutout f1701a;

    /* renamed from: H.h$a */
    public static class a {
        /* renamed from: a */
        public static int m1956a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: b */
        public static int m1957b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: c */
        public static int m1958c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: d */
        public static int m1959d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C0513h(DisplayCutout displayCutout) {
        this.f1701a = displayCutout;
    }

    /* renamed from: e */
    public static C0513h m1951e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0513h(displayCutout);
    }

    /* renamed from: a */
    public int m1952a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m1956a(this.f1701a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m1953b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m1957b(this.f1701a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m1954c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m1958c(this.f1701a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m1955d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m1959d(this.f1701a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0513h.class != obj.getClass()) {
            return false;
        }
        return AbstractC0340b.m1344a(this.f1701a, ((C0513h) obj).f1701a);
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f1701a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f1701a + "}";
    }
}

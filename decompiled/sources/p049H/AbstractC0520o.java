package p049H;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import p007B.InterfaceMenuItemC0026b;

/* renamed from: H.o */
/* loaded from: classes.dex */
public abstract class AbstractC0520o {

    /* renamed from: H.o$a */
    public static class a {
        /* renamed from: a */
        public static MenuItem m1985a(MenuItem menuItem, char c7, int i7) {
            return menuItem.setAlphabeticShortcut(c7, i7);
        }

        /* renamed from: b */
        public static MenuItem m1986b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: c */
        public static MenuItem m1987c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: d */
        public static MenuItem m1988d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: e */
        public static MenuItem m1989e(MenuItem menuItem, char c7, int i7) {
            return menuItem.setNumericShortcut(c7, i7);
        }

        /* renamed from: f */
        public static MenuItem m1990f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m1979a(MenuItem menuItem, char c7, int i7) {
        if (menuItem instanceof InterfaceMenuItemC0026b) {
            ((InterfaceMenuItemC0026b) menuItem).setAlphabeticShortcut(c7, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1985a(menuItem, c7, i7);
        }
    }

    /* renamed from: b */
    public static void m1980b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0026b) {
            ((InterfaceMenuItemC0026b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1986b(menuItem, charSequence);
        }
    }

    /* renamed from: c */
    public static void m1981c(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0026b) {
            ((InterfaceMenuItemC0026b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1987c(menuItem, colorStateList);
        }
    }

    /* renamed from: d */
    public static void m1982d(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0026b) {
            ((InterfaceMenuItemC0026b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1988d(menuItem, mode);
        }
    }

    /* renamed from: e */
    public static void m1983e(MenuItem menuItem, char c7, int i7) {
        if (menuItem instanceof InterfaceMenuItemC0026b) {
            ((InterfaceMenuItemC0026b) menuItem).setNumericShortcut(c7, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1989e(menuItem, c7, i7);
        }
    }

    /* renamed from: f */
    public static void m1984f(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0026b) {
            ((InterfaceMenuItemC0026b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m1990f(menuItem, charSequence);
        }
    }
}

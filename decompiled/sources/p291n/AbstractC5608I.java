package p291n;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import p000A.AbstractC0000a;
import p000A.InterfaceC0001b;
import p247i.AbstractC4501c;

/* renamed from: n.I */
/* loaded from: classes.dex */
public abstract class AbstractC5608I {

    /* renamed from: a */
    public static final int[] f20264a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f20265b = new int[0];

    /* renamed from: c */
    public static final Rect f20266c = new Rect();

    /* renamed from: d */
    public static Class f20267d;

    static {
        try {
            f20267d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m23496a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC0001b) {
                return m23496a(((InterfaceC0001b) drawable).m26a());
            }
            if (drawable instanceof AbstractC4501c) {
                return m23496a(((AbstractC4501c) drawable).m19178a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m23496a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m23496a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static Rect m23498c(Drawable drawable) {
        char c7;
        Insets opticalInsets;
        int i7;
        int i8;
        int i9;
        int i10;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            i7 = opticalInsets.left;
            rect.left = i7;
            i8 = opticalInsets.right;
            rect.right = i8;
            i9 = opticalInsets.top;
            rect.top = i9;
            i10 = opticalInsets.bottom;
            rect.bottom = i10;
            return rect;
        }
        if (f20267d != null) {
            try {
                Drawable m14o = AbstractC0000a.m14o(drawable);
                Object invoke = m14o.getClass().getMethod("getOpticalInsets", null).invoke(m14o, null);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f20267d.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c7 = 3;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c7 = 1;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c7 = 0;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c7 = 2;
                                    break;
                                }
                                c7 = 65535;
                                break;
                            default:
                                c7 = 65535;
                                break;
                        }
                        if (c7 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c7 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c7 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c7 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f20266c;
    }

    /* renamed from: d */
    public static PorterDuff.Mode m23499d(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: b */
    public static void m23497b(Drawable drawable) {
    }
}

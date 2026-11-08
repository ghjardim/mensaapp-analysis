package p049H;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.C3643a;
import java.lang.reflect.Method;
import p042G.InterfaceC0345g;
import p256j$.util.Objects;

/* renamed from: H.E */
/* loaded from: classes.dex */
public abstract class AbstractC0478E {

    /* renamed from: a */
    public static Method f1649a;

    /* renamed from: H.E$a */
    public static class a {
        /* renamed from: a */
        public static float m1814a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* renamed from: b */
        public static float m1815b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: H.E$b */
    public static class b {
        /* renamed from: a */
        public static int m1816a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        /* renamed from: b */
        public static boolean m1817b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: H.E$c */
    public static class c {
        /* renamed from: a */
        public static int m1818a(ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i7, i8, i9);
        }

        /* renamed from: b */
        public static int m1819b(ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i7, i8, i9);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f1649a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static int m1802a(Resources resources, int i7, InterfaceC0345g interfaceC0345g, int i8) {
        int dimensionPixelSize;
        return i7 != -1 ? (i7 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i7)) < 0) ? i8 : dimensionPixelSize : ((Integer) interfaceC0345g.get()).intValue();
    }

    /* renamed from: b */
    public static float m1803b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f1649a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static int m1804c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    /* renamed from: d */
    public static int m1805d(Resources resources, int i7, int i8) {
        if (i7 == 4194304 && i8 == 26) {
            return m1804c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* renamed from: e */
    public static int m1806e(Resources resources, int i7, int i8) {
        if (i7 == 4194304 && i8 == 26) {
            return m1804c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* renamed from: f */
    public static float m1807f(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.m1814a(viewConfiguration) : m1803b(viewConfiguration, context);
    }

    /* renamed from: g */
    public static int m1808g(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.m1816a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: h */
    public static int m1809h(Context context, final ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.m1818a(viewConfiguration, i7, i8, i9);
        }
        if (!m1812k(i7, i8, i9)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int m1805d = m1805d(resources, i9, i8);
        Objects.requireNonNull(viewConfiguration);
        return m1802a(resources, m1805d, new InterfaceC0345g() { // from class: H.C
            @Override // p042G.InterfaceC0345g
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    /* renamed from: i */
    public static int m1810i(Context context, final ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.m1819b(viewConfiguration, i7, i8, i9);
        }
        if (!m1812k(i7, i8, i9)) {
            return C3643a.e.API_PRIORITY_OTHER;
        }
        Resources resources = context.getResources();
        int m1806e = m1806e(resources, i9, i8);
        Objects.requireNonNull(viewConfiguration);
        return m1802a(resources, m1806e, new InterfaceC0345g() { // from class: H.D
            @Override // p042G.InterfaceC0345g
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, C3643a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: j */
    public static float m1811j(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.m1815b(viewConfiguration) : m1803b(viewConfiguration, context);
    }

    /* renamed from: k */
    public static boolean m1812k(int i7, int i8, int i9) {
        InputDevice device = InputDevice.getDevice(i7);
        return (device == null || device.getMotionRange(i8, i9) == null) ? false : true;
    }

    /* renamed from: l */
    public static boolean m1813l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m1817b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int m1804c = m1804c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return m1804c != 0 && resources.getBoolean(m1804c);
    }
}

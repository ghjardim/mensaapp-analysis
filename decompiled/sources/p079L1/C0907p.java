package p079L1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5469l;
import p049H.C0481H;
import p058I1.C0618b;
import p107P1.C1425b;
import p107P1.C1426c;
import p107P1.C1431h;
import p107P1.C1432i;
import p107P1.C1437n;
import p378x5.AbstractC7024o;

/* renamed from: L1.p */
/* loaded from: classes.dex */
public final class C0907p implements InterfaceC0904m {

    /* renamed from: b */
    public static final C0907p f3155b = new C0907p();

    /* renamed from: c */
    public static final String f3156c;

    /* renamed from: d */
    public static final ArrayList f3157d;

    static {
        String simpleName = C0907p.class.getSimpleName();
        AbstractC5469l.m23027d(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f3156c = simpleName;
        f3157d = AbstractC7024o.m28859e(Integer.valueOf(C0481H.l.m1888g()), Integer.valueOf(C0481H.l.m1887f()), Integer.valueOf(C0481H.l.m1882a()), Integer.valueOf(C0481H.l.m1884c()), Integer.valueOf(C0481H.l.m1889h()), Integer.valueOf(C0481H.l.m1886e()), Integer.valueOf(C0481H.l.m1890i()), Integer.valueOf(C0481H.l.m1883b()));
    }

    @Override // p079L1.InterfaceC0904m
    /* renamed from: a */
    public C0902k mo3759a(Activity activity) {
        AbstractC5469l.m23028e(activity, "activity");
        return m3766d(activity);
    }

    /* renamed from: b */
    public C0902k m3764b(Activity activity) {
        C0481H m1851a;
        AbstractC5469l.m23028e(activity, "activity");
        int i7 = Build.VERSION.SDK_INT;
        Rect m5543a = i7 >= 30 ? C1431h.f4478a.m5543a(activity) : i7 >= 29 ? m3770h(activity) : i7 >= 28 ? m3769g(activity) : i7 >= 24 ? m3768f(activity) : m3767e(activity);
        if (i7 >= 30) {
            m1851a = m3771i(activity);
        } else {
            m1851a = new C0481H.a().m1851a();
            AbstractC5469l.m23027d(m1851a, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new C0902k(new C0618b(m5543a), m1851a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public C0902k m3765c(Context context) {
        AbstractC5469l.m23028e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return C1431h.f4478a.m5545c(context);
        }
        Context m5538a = C1426c.f4477a.m5538a(context);
        if (m5538a instanceof Activity) {
            return m3764b((Activity) context);
        }
        if (!(m5538a instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        AbstractC5469l.m23026c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        AbstractC5469l.m23027d(defaultDisplay, "wm.defaultDisplay");
        Point m3774l = m3774l(defaultDisplay);
        return new C0902k(new Rect(0, 0, m3774l.x, m3774l.y), null, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: d */
    public C0902k m3766d(Context context) {
        Rect rect;
        C0481H m1851a;
        AbstractC5469l.m23028e(context, "context");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            rect = C1431h.f4478a.m5546d(context);
        } else {
            Object systemService = context.getSystemService("window");
            AbstractC5469l.m23026c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display display = ((WindowManager) systemService).getDefaultDisplay();
            AbstractC5469l.m23027d(display, "display");
            Point m3774l = m3774l(display);
            rect = new Rect(0, 0, m3774l.x, m3774l.y);
        }
        if (i7 >= 30) {
            m1851a = m3771i(context);
        } else {
            m1851a = new C0481H.a().m1851a();
            AbstractC5469l.m23027d(m1851a, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new C0902k(new C0618b(rect), m1851a);
    }

    /* renamed from: e */
    public final Rect m3767e(Activity activity) {
        int i7;
        AbstractC5469l.m23028e(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        AbstractC5469l.m23027d(defaultDisplay, "defaultDisplay");
        Point m3774l = m3774l(defaultDisplay);
        Rect rect = new Rect();
        int i8 = m3774l.x;
        if (i8 == 0 || (i7 = m3774l.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i8;
            rect.bottom = i7;
        }
        return rect;
    }

    /* renamed from: f */
    public final Rect m3768f(Activity activity) {
        AbstractC5469l.m23028e(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C1425b.f4476a.m5537a(activity)) {
            AbstractC5469l.m23027d(defaultDisplay, "defaultDisplay");
            Point m3774l = m3774l(defaultDisplay);
            int m3773k = m3773k(activity);
            int i7 = rect.bottom;
            if (i7 + m3773k == m3774l.y) {
                rect.bottom = i7 + m3773k;
            } else {
                int i8 = rect.right;
                if (i8 + m3773k == m3774l.x) {
                    rect.right = i8 + m3773k;
                }
            }
        }
        return rect;
    }

    /* renamed from: g */
    public final Rect m3769g(Activity activity) {
        DisplayCutout m3772j;
        AbstractC5469l.m23028e(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C1425b.f4476a.m5537a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                AbstractC5469l.m23026c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                AbstractC5469l.m23026c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e7) {
            Log.w(f3156c, e7);
            m3775m(activity, rect);
        } catch (NoSuchFieldException e8) {
            Log.w(f3156c, e8);
            m3775m(activity, rect);
        } catch (NoSuchMethodException e9) {
            Log.w(f3156c, e9);
            m3775m(activity, rect);
        } catch (InvocationTargetException e10) {
            Log.w(f3156c, e10);
            m3775m(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        C1432i c1432i = C1432i.f4479a;
        AbstractC5469l.m23027d(currentDisplay, "currentDisplay");
        c1432i.m5547a(currentDisplay, point);
        C1425b c1425b = C1425b.f4476a;
        if (!c1425b.m5537a(activity)) {
            int m3773k = m3773k(activity);
            int i7 = rect.bottom;
            if (i7 + m3773k == point.y) {
                rect.bottom = i7 + m3773k;
            } else {
                int i8 = rect.right;
                if (i8 + m3773k == point.x) {
                    rect.right = i8 + m3773k;
                } else if (rect.left == m3773k) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !c1425b.m5537a(activity) && (m3772j = m3772j(currentDisplay)) != null) {
            int i9 = rect.left;
            C1437n c1437n = C1437n.f4480a;
            if (i9 == c1437n.m5553b(m3772j)) {
                rect.left = 0;
            }
            if (point.x - rect.right == c1437n.m5554c(m3772j)) {
                rect.right += c1437n.m5554c(m3772j);
            }
            if (rect.top == c1437n.m5555d(m3772j)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == c1437n.m5552a(m3772j)) {
                rect.bottom += c1437n.m5552a(m3772j);
            }
        }
        return rect;
    }

    /* renamed from: h */
    public final Rect m3770h(Activity activity) {
        AbstractC5469l.m23028e(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            AbstractC5469l.m23026c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (IllegalAccessException e7) {
            Log.w(f3156c, e7);
            return m3769g(activity);
        } catch (NoSuchFieldException e8) {
            Log.w(f3156c, e8);
            return m3769g(activity);
        } catch (NoSuchMethodException e9) {
            Log.w(f3156c, e9);
            return m3769g(activity);
        } catch (InvocationTargetException e10) {
            Log.w(f3156c, e10);
            return m3769g(activity);
        }
    }

    /* renamed from: i */
    public final C0481H m3771i(Context context) {
        AbstractC5469l.m23028e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return C1431h.f4478a.m5544b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    /* renamed from: j */
    public final DisplayCutout m3772j(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (AbstractC0905n.m3762a(obj)) {
                return AbstractC0906o.m3763a(obj);
            }
            return null;
        } catch (ClassNotFoundException e7) {
            Log.w(f3156c, e7);
            return null;
        } catch (IllegalAccessException e8) {
            Log.w(f3156c, e8);
            return null;
        } catch (InstantiationException e9) {
            Log.w(f3156c, e9);
            return null;
        } catch (NoSuchFieldException e10) {
            Log.w(f3156c, e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w(f3156c, e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w(f3156c, e12);
            return null;
        }
    }

    /* renamed from: k */
    public final int m3773k(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: l */
    public final Point m3774l(Display display) {
        AbstractC5469l.m23028e(display, "display");
        Point point = new Point();
        C1432i.f4479a.m5547a(display, point);
        return point;
    }

    /* renamed from: m */
    public final void m3775m(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}

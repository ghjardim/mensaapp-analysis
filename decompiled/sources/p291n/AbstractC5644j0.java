package p291n;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import p049H.AbstractC0475B;

/* renamed from: n.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC5644j0 {

    /* renamed from: a */
    public static Method f20464a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f20464a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f20464a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static void m23699a(View view, Rect rect, Rect rect2) {
        Method method = f20464a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e7) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
            }
        }
    }

    /* renamed from: b */
    public static boolean m23700b(View view) {
        return AbstractC0475B.m1755n(view) == 1;
    }
}

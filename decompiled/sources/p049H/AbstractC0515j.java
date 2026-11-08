package p049H;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: H.j */
/* loaded from: classes.dex */
public abstract class AbstractC0515j {

    /* renamed from: a */
    public static boolean f1702a = false;

    /* renamed from: b */
    public static Method f1703b = null;

    /* renamed from: c */
    public static boolean f1704c = false;

    /* renamed from: d */
    public static Field f1705d;

    /* renamed from: H.j$a */
    public interface a {
        /* renamed from: m */
        boolean mo1967m(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m1961a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f1702a) {
            try {
                f1703b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f1702a = true;
        }
        Method method = f1703b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m1962b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m1961a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC0475B.m1744c(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    public static boolean m1963c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m1966f = m1966f(dialog);
        if (m1966f != null && m1966f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC0475B.m1744c(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m1964d(View view, KeyEvent keyEvent) {
        return AbstractC0475B.m1745d(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m1965e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo1967m(keyEvent) : callback instanceof Activity ? m1962b((Activity) callback, keyEvent) : callback instanceof Dialog ? m1963c((Dialog) callback, keyEvent) : (view != null && AbstractC0475B.m1744c(view, keyEvent)) || aVar.mo1967m(keyEvent);
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m1966f(Dialog dialog) {
        if (!f1704c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f1705d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1704c = true;
        }
        Field field = f1705d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}

package p070K;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: K.f */
/* loaded from: classes.dex */
public abstract class AbstractC0817f {

    /* renamed from: K.f$a */
    public static class a {
        /* renamed from: a */
        public static void m3405a(PopupWindow popupWindow, boolean z6) {
            popupWindow.setOverlapAnchor(z6);
        }

        /* renamed from: b */
        public static void m3406b(PopupWindow popupWindow, int i7) {
            popupWindow.setWindowLayoutType(i7);
        }
    }

    /* renamed from: a */
    public static void m3402a(PopupWindow popupWindow, boolean z6) {
        a.m3405a(popupWindow, z6);
    }

    /* renamed from: b */
    public static void m3403b(PopupWindow popupWindow, int i7) {
        a.m3406b(popupWindow, i7);
    }

    /* renamed from: c */
    public static void m3404c(PopupWindow popupWindow, View view, int i7, int i8, int i9) {
        popupWindow.showAsDropDown(view, i7, i8, i9);
    }
}

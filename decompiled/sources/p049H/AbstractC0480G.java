package p049H;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: H.G */
/* loaded from: classes.dex */
public abstract class AbstractC0480G {

    /* renamed from: H.G$a */
    public static class a {
        /* renamed from: a */
        public static boolean m1829a(ViewParent viewParent, View view, float f7, float f8, boolean z6) {
            return viewParent.onNestedFling(view, f7, f8, z6);
        }

        /* renamed from: b */
        public static boolean m1830b(ViewParent viewParent, View view, float f7, float f8) {
            return viewParent.onNestedPreFling(view, f7, f8);
        }

        /* renamed from: c */
        public static void m1831c(ViewParent viewParent, View view, int i7, int i8, int[] iArr) {
            viewParent.onNestedPreScroll(view, i7, i8, iArr);
        }

        /* renamed from: d */
        public static void m1832d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10) {
            viewParent.onNestedScroll(view, i7, i8, i9, i10);
        }

        /* renamed from: e */
        public static void m1833e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.onNestedScrollAccepted(view, view2, i7);
        }

        /* renamed from: f */
        public static boolean m1834f(ViewParent viewParent, View view, View view2, int i7) {
            return viewParent.onStartNestedScroll(view, view2, i7);
        }

        /* renamed from: g */
        public static void m1835g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static boolean m1822a(ViewParent viewParent, View view, float f7, float f8, boolean z6) {
        try {
            return a.m1829a(viewParent, view, f7, f8, z6);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e7);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m1823b(ViewParent viewParent, View view, float f7, float f8) {
        try {
            return a.m1830b(viewParent, view, f7, f8);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e7);
            return false;
        }
    }

    /* renamed from: c */
    public static void m1824c(ViewParent viewParent, View view, int i7, int i8, int[] iArr, int i9) {
        if (viewParent instanceof InterfaceC0524s) {
            ((InterfaceC0524s) viewParent).mo2019f(view, i7, i8, iArr, i9);
            return;
        }
        if (i9 == 0) {
            try {
                a.m1831c(viewParent, view, i7, i8, iArr);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e7);
            }
        }
    }

    /* renamed from: d */
    public static void m1825d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (viewParent instanceof InterfaceC0525t) {
            ((InterfaceC0525t) viewParent).mo2020a(view, i7, i8, i9, i10, i11, iArr);
            return;
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (viewParent instanceof InterfaceC0524s) {
            ((InterfaceC0524s) viewParent).mo2015b(view, i7, i8, i9, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.m1832d(viewParent, view, i7, i8, i9, i10);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e7);
            }
        }
    }

    /* renamed from: e */
    public static void m1826e(ViewParent viewParent, View view, View view2, int i7, int i8) {
        if (viewParent instanceof InterfaceC0524s) {
            ((InterfaceC0524s) viewParent).mo2017d(view, view2, i7, i8);
            return;
        }
        if (i8 == 0) {
            try {
                a.m1833e(viewParent, view, view2, i7);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e7);
            }
        }
    }

    /* renamed from: f */
    public static boolean m1827f(ViewParent viewParent, View view, View view2, int i7, int i8) {
        if (viewParent instanceof InterfaceC0524s) {
            return ((InterfaceC0524s) viewParent).mo2016c(view, view2, i7, i8);
        }
        if (i8 != 0) {
            return false;
        }
        try {
            return a.m1834f(viewParent, view, view2, i7);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e7);
            return false;
        }
    }

    /* renamed from: g */
    public static void m1828g(ViewParent viewParent, View view, int i7) {
        if (viewParent instanceof InterfaceC0524s) {
            ((InterfaceC0524s) viewParent).mo2018e(view, i7);
            return;
        }
        if (i7 == 0) {
            try {
                a.m1835g(viewParent, view);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e7);
            }
        }
    }
}

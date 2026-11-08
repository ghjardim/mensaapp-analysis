package p107P1;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.AbstractC5469l;
import p049H.C0481H;
import p079L1.C0902k;

/* renamed from: P1.h */
/* loaded from: classes.dex */
public final class C1431h {

    /* renamed from: a */
    public static final C1431h f4478a = new C1431h();

    /* renamed from: a */
    public final Rect m5543a(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        AbstractC5469l.m23028e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        AbstractC5469l.m23027d(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    /* renamed from: b */
    public final C0481H m5544b(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        AbstractC5469l.m23028e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        AbstractC5469l.m23027d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        C0481H m1836n = C0481H.m1836n(windowInsets);
        AbstractC5469l.m23027d(m1836n, "toWindowInsetsCompat(platformInsets)");
        return m1836n;
    }

    /* renamed from: c */
    public final C0902k m5545c(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        AbstractC5469l.m23028e(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        C0481H m1836n = C0481H.m1836n(windowInsets);
        AbstractC5469l.m23027d(m1836n, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        AbstractC5469l.m23027d(bounds, "wm.currentWindowMetrics.bounds");
        return new C0902k(bounds, m1836n);
    }

    /* renamed from: d */
    public final Rect m5546d(Context context) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        AbstractC5469l.m23028e(context, "context");
        maximumWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        AbstractC5469l.m23027d(bounds, "wm.maximumWindowMetrics.bounds");
        return bounds;
    }
}

package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import p370w4.AbstractC6917b;

/* renamed from: io.flutter.plugin.platform.Y */
/* loaded from: classes.dex */
public abstract class AbstractWindowManagerC4753Y implements WindowManager {

    /* renamed from: a */
    public final WindowManager f17533a;

    /* renamed from: b */
    public C4748T f17534b;

    public AbstractWindowManagerC4753Y(WindowManager windowManager, C4748T c4748t) {
        this.f17533a = windowManager;
        this.f17534b = c4748t;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f17533a.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C4748T c4748t = this.f17534b;
        if (c4748t == null) {
            AbstractC6917b.m28359g("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            c4748t.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.f17533a.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public Display getDefaultDisplay() {
        return this.f17533a.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.f17533a.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.f17533a.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f17533a.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(View view) {
        C4748T c4748t = this.f17534b;
        if (c4748t == null) {
            AbstractC6917b.m28359g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            c4748t.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        if (this.f17534b == null) {
            AbstractC6917b.m28359g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            this.f17534b.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        C4748T c4748t = this.f17534b;
        if (c4748t == null) {
            AbstractC6917b.m28359g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            c4748t.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f17533a.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}

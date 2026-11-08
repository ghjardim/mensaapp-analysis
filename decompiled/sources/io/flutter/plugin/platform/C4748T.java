package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: io.flutter.plugin.platform.T */
/* loaded from: classes.dex */
public class C4748T extends ViewGroup {

    /* renamed from: a */
    public final Rect f17531a;

    /* renamed from: b */
    public final Rect f17532b;

    public C4748T(Context context) {
        super(context);
        this.f17531a = new Rect();
        this.f17532b = new Rect();
    }

    /* renamed from: a */
    public static int m20473a(int i7) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f17531a.set(i7, i8, i9, i10);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f17531a, layoutParams.x, layoutParams.y, this.f17532b);
            Rect rect = this.f17532b;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            getChildAt(i9).measure(m20473a(i7), m20473a(i8));
        }
        super.onMeasure(i7, i8);
    }
}

package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p318q.AbstractC6161a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    public final int f10298a;

    /* renamed from: b */
    public final int f10299b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10298a = getResources().getDimensionPixelOffset(AbstractC6161a.f22058b);
        this.f10299b = getResources().getDimensionPixelOffset(AbstractC6161a.f22057a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f10298a * 2), this.f10299b), 1073741824), i8);
    }
}

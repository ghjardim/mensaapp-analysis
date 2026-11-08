package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.api.C3643a;
import p352u1.AbstractC6601g;

/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: a */
    public int f11253a;

    /* renamed from: b */
    public int f11254b;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f11254b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f11253a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i7);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i7 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i8);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i8 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i7) {
        this.f11254b = i7;
        super.setMaxHeight(i7);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i7) {
        this.f11253a = i7;
        super.setMaxWidth(i7);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f11253a = C3643a.e.API_PRIORITY_OTHER;
        this.f11254b = C3643a.e.API_PRIORITY_OTHER;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6601g.f23898y0, i7, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(AbstractC6601g.f23793A0, C3643a.e.API_PRIORITY_OTHER));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(AbstractC6601g.f23900z0, C3643a.e.API_PRIORITY_OTHER));
        obtainStyledAttributes.recycle();
    }
}

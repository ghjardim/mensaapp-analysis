package p231g;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p223f.AbstractC4224i;

/* renamed from: g.a */
/* loaded from: classes.dex */
public abstract class AbstractC4294a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f14753a;

    public AbstractC4294a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14753a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4224i.f14393r);
        this.f14753a = obtainStyledAttributes.getInt(AbstractC4224i.f14397s, 0);
        obtainStyledAttributes.recycle();
    }

    public AbstractC4294a(int i7, int i8) {
        super(i7, i8);
        this.f14753a = 8388627;
    }

    public AbstractC4294a(AbstractC4294a abstractC4294a) {
        super((ViewGroup.MarginLayoutParams) abstractC4294a);
        this.f14753a = 0;
        this.f14753a = abstractC4294a.f14753a;
    }

    public AbstractC4294a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f14753a = 0;
    }
}

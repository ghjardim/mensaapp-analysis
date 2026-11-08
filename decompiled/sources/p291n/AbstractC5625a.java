package p291n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C3235a;
import p223f.AbstractC4216a;
import p223f.AbstractC4224i;

/* renamed from: n.a */
/* loaded from: classes.dex */
public abstract class AbstractC5625a extends ViewGroup {

    /* renamed from: a */
    public final a f20392a;

    /* renamed from: b */
    public final Context f20393b;

    /* renamed from: c */
    public ActionMenuView f20394c;

    /* renamed from: d */
    public C3235a f20395d;

    /* renamed from: e */
    public int f20396e;

    /* renamed from: f */
    public boolean f20397f;

    /* renamed from: n */
    public boolean f20398n;

    /* renamed from: n.a$a */
    public class a {

        /* renamed from: a */
        public boolean f20399a = false;

        public a() {
        }
    }

    public AbstractC5625a(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f20392a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC4216a.f14075a, typedValue, true) || typedValue.resourceId == 0) {
            this.f20393b = context;
        } else {
            this.f20393b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: b */
    public static int m23618b(int i7, int i8, boolean z6) {
        return z6 ? i7 - i8 : i7 + i8;
    }

    /* renamed from: a */
    public int m23619a(View view, int i7, int i8, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, (i7 - view.getMeasuredWidth()) - i9);
    }

    /* renamed from: c */
    public int m23620c(View view, int i7, int i8, int i9, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i8 + ((i9 - measuredHeight) / 2);
        if (z6) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f20396e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC4224i.f14315a, AbstractC4216a.f14077c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(AbstractC4224i.f14355i, 0));
        obtainStyledAttributes.recycle();
        C3235a c3235a = this.f20395d;
        if (c3235a != null) {
            c3235a.m11898B(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f20398n = false;
        }
        if (!this.f20398n) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f20398n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f20398n = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f20397f = false;
        }
        if (!this.f20397f) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f20397f = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f20397f = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i7);

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            super.setVisibility(i7);
        }
    }
}

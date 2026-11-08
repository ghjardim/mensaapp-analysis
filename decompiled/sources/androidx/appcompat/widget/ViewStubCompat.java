package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p223f.AbstractC4224i;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    public int f10230a;

    /* renamed from: b */
    public int f10231b;

    /* renamed from: c */
    public WeakReference f10232c;

    /* renamed from: d */
    public LayoutInflater f10233d;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC3234a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m11890a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f10230a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f10233d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f10230a, viewGroup, false);
        int i7 = this.f10231b;
        if (i7 != -1) {
            inflate.setId(i7);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f10232c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f10231b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f10233d;
    }

    public int getLayoutResource() {
        return this.f10230a;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f10231b = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f10233d = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f10230a = i7;
    }

    public void setOnInflateListener(InterfaceC3234a interfaceC3234a) {
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference weakReference = this.f10232c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i7);
            return;
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            m11890a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10230a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4224i.f14349g3, i7, 0);
        this.f10231b = obtainStyledAttributes.getResourceId(AbstractC4224i.f14364j3, -1);
        this.f10230a = obtainStyledAttributes.getResourceId(AbstractC4224i.f14359i3, 0);
        setId(obtainStyledAttributes.getResourceId(AbstractC4224i.f14354h3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}

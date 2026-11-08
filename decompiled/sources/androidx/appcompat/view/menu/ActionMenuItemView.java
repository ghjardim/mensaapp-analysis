package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C3191d;
import androidx.appcompat.view.menu.InterfaceC3195h;
import androidx.appcompat.widget.ActionMenuView;
import p223f.AbstractC4224i;
import p283m.InterfaceC5552c;
import p291n.AbstractC5636f0;
import p291n.AbstractViewOnTouchListenerC5611L;
import p291n.C5658x;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C5658x implements InterfaceC3195h.a, View.OnClickListener, ActionMenuView.InterfaceC3203a {

    /* renamed from: e */
    public C3192e f9806e;

    /* renamed from: f */
    public CharSequence f9807f;

    /* renamed from: n */
    public Drawable f9808n;

    /* renamed from: o */
    public C3191d.b f9809o;

    /* renamed from: p */
    public AbstractViewOnTouchListenerC5611L f9810p;

    /* renamed from: q */
    public AbstractC3187b f9811q;

    /* renamed from: r */
    public boolean f9812r;

    /* renamed from: s */
    public boolean f9813s;

    /* renamed from: t */
    public int f9814t;

    /* renamed from: u */
    public int f9815u;

    /* renamed from: v */
    public int f9816v;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C3186a extends AbstractViewOnTouchListenerC5611L {
        public C3186a() {
            super(ActionMenuItemView.this);
        }

        @Override // p291n.AbstractViewOnTouchListenerC5611L
        /* renamed from: b */
        public InterfaceC5552c mo11606b() {
            AbstractC3187b abstractC3187b = ActionMenuItemView.this.f9811q;
            if (abstractC3187b != null) {
                return abstractC3187b.mo11608a();
            }
            return null;
        }

        @Override // p291n.AbstractViewOnTouchListenerC5611L
        /* renamed from: c */
        public boolean mo11607c() {
            InterfaceC5552c mo11606b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C3191d.b bVar = actionMenuItemView.f9809o;
            return bVar != null && bVar.mo11609a(actionMenuItemView.f9806e) && (mo11606b = mo11606b()) != null && mo11606b.mo11638f();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC3187b {
        /* renamed from: a */
        public abstract InterfaceC5552c mo11608a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC3203a
    /* renamed from: a */
    public boolean mo11599a() {
        return m11603f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC3203a
    /* renamed from: b */
    public boolean mo11600b() {
        return m11603f() && this.f9806e.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3195h.a
    /* renamed from: c */
    public boolean mo11601c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3195h.a
    /* renamed from: d */
    public void mo11602d(C3192e c3192e, int i7) {
        this.f9806e = c3192e;
        setIcon(c3192e.getIcon());
        setTitle(c3192e.m11715h(this));
        setId(c3192e.getItemId());
        setVisibility(c3192e.isVisible() ? 0 : 8);
        setEnabled(c3192e.isEnabled());
        if (c3192e.hasSubMenu() && this.f9810p == null) {
            this.f9810p = new C3186a();
        }
    }

    /* renamed from: f */
    public boolean m11603f() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: g */
    public final boolean m11604g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3195h.a
    public C3192e getItemData() {
        return this.f9806e;
    }

    /* renamed from: h */
    public final void m11605h() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f9807f);
        if (this.f9808n != null && (!this.f9806e.m11708A() || (!this.f9812r && !this.f9813s))) {
            z6 = false;
        }
        boolean z8 = z7 & z6;
        setText(z8 ? this.f9807f : null);
        CharSequence contentDescription = this.f9806e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z8 ? null : this.f9806e.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f9806e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            AbstractC5636f0.m23670a(this, z8 ? null : this.f9806e.getTitle());
        } else {
            AbstractC5636f0.m23670a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C3191d.b bVar = this.f9809o;
        if (bVar != null) {
            bVar.mo11609a(this.f9806e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9812r = m11604g();
        m11605h();
    }

    @Override // p291n.C5658x, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        boolean m11603f = m11603f();
        if (m11603f && (i9 = this.f9815u) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f9814t) : this.f9814t;
        if (mode != 1073741824 && this.f9814t > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i8);
        }
        if (m11603f || this.f9808n == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f9808n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC5611L abstractViewOnTouchListenerC5611L;
        if (this.f9806e.hasSubMenu() && (abstractViewOnTouchListenerC5611L = this.f9810p) != null && abstractViewOnTouchListenerC5611L.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f9813s != z6) {
            this.f9813s = z6;
            C3192e c3192e = this.f9806e;
            if (c3192e != null) {
                c3192e.m11709a();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f9808n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f9816v;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        m11605h();
    }

    public void setItemInvoker(C3191d.b bVar) {
        this.f9809o = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
        this.f9815u = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC3187b abstractC3187b) {
        this.f9811q = abstractC3187b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f9807f = charSequence;
        m11605h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.f9812r = m11604g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4224i.f14401t, i7, 0);
        this.f9814t = obtainStyledAttributes.getDimensionPixelSize(AbstractC4224i.f14405u, 0);
        obtainStyledAttributes.recycle();
        this.f9816v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f9815u = -1;
        setSaveEnabled(false);
    }
}

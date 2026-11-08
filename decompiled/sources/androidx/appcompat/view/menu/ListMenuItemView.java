package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC3195h;
import p049H.AbstractC0475B;
import p223f.AbstractC4216a;
import p223f.AbstractC4220e;
import p223f.AbstractC4221f;
import p223f.AbstractC4224i;
import p291n.C5632d0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC3195h.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public C3192e f9821a;

    /* renamed from: b */
    public ImageView f9822b;

    /* renamed from: c */
    public RadioButton f9823c;

    /* renamed from: d */
    public TextView f9824d;

    /* renamed from: e */
    public CheckBox f9825e;

    /* renamed from: f */
    public TextView f9826f;

    /* renamed from: n */
    public ImageView f9827n;

    /* renamed from: o */
    public ImageView f9828o;

    /* renamed from: p */
    public LinearLayout f9829p;

    /* renamed from: q */
    public Drawable f9830q;

    /* renamed from: r */
    public int f9831r;

    /* renamed from: s */
    public Context f9832s;

    /* renamed from: t */
    public boolean f9833t;

    /* renamed from: u */
    public Drawable f9834u;

    /* renamed from: v */
    public boolean f9835v;

    /* renamed from: w */
    public int f9836w;

    /* renamed from: x */
    public LayoutInflater f9837x;

    /* renamed from: y */
    public boolean f9838y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4216a.f14089o);
    }

    private LayoutInflater getInflater() {
        if (this.f9837x == null) {
            this.f9837x = LayoutInflater.from(getContext());
        }
        return this.f9837x;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f9827n;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m11610a(View view) {
        m11611b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f9828o;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9828o.getLayoutParams();
        rect.top += this.f9828o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final void m11611b(View view, int i7) {
        LinearLayout linearLayout = this.f9829p;
        if (linearLayout != null) {
            linearLayout.addView(view, i7);
        } else {
            addView(view, i7);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3195h.a
    /* renamed from: c */
    public boolean mo11601c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3195h.a
    /* renamed from: d */
    public void mo11602d(C3192e c3192e, int i7) {
        this.f9821a = c3192e;
        this.f9836w = i7;
        setVisibility(c3192e.isVisible() ? 0 : 8);
        setTitle(c3192e.m11715h(this));
        setCheckable(c3192e.isCheckable());
        m11615h(c3192e.m11733z(), c3192e.m11712e());
        setIcon(c3192e.getIcon());
        setEnabled(c3192e.isEnabled());
        setSubMenuArrowVisible(c3192e.hasSubMenu());
        setContentDescription(c3192e.getContentDescription());
    }

    /* renamed from: e */
    public final void m11612e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC4221f.f14190f, (ViewGroup) this, false);
        this.f9825e = checkBox;
        m11610a(checkBox);
    }

    /* renamed from: f */
    public final void m11613f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC4221f.f14191g, (ViewGroup) this, false);
        this.f9822b = imageView;
        m11611b(imageView, 0);
    }

    /* renamed from: g */
    public final void m11614g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC4221f.f14192h, (ViewGroup) this, false);
        this.f9823c = radioButton;
        m11610a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3195h.a
    public C3192e getItemData() {
        return this.f9821a;
    }

    /* renamed from: h */
    public void m11615h(boolean z6, char c7) {
        int i7 = (z6 && this.f9821a.m11733z()) ? 0 : 8;
        if (i7 == 0) {
            this.f9826f.setText(this.f9821a.m11713f());
        }
        if (this.f9826f.getVisibility() != i7) {
            this.f9826f.setVisibility(i7);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        AbstractC0475B.m1731I(this, this.f9830q);
        TextView textView = (TextView) findViewById(AbstractC4220e.f14157A);
        this.f9824d = textView;
        int i7 = this.f9831r;
        if (i7 != -1) {
            textView.setTextAppearance(this.f9832s, i7);
        }
        this.f9826f = (TextView) findViewById(AbstractC4220e.f14180v);
        ImageView imageView = (ImageView) findViewById(AbstractC4220e.f14183y);
        this.f9827n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f9834u);
        }
        this.f9828o = (ImageView) findViewById(AbstractC4220e.f14170l);
        this.f9829p = (LinearLayout) findViewById(AbstractC4220e.f14166h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        if (this.f9822b != null && this.f9833t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f9822b.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f9823c == null && this.f9825e == null) {
            return;
        }
        if (this.f9821a.m11719l()) {
            if (this.f9823c == null) {
                m11614g();
            }
            compoundButton = this.f9823c;
            view = this.f9825e;
        } else {
            if (this.f9825e == null) {
                m11612e();
            }
            compoundButton = this.f9825e;
            view = this.f9823c;
        }
        if (z6) {
            compoundButton.setChecked(this.f9821a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f9825e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f9823c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if (this.f9821a.m11719l()) {
            if (this.f9823c == null) {
                m11614g();
            }
            compoundButton = this.f9823c;
        } else {
            if (this.f9825e == null) {
                m11612e();
            }
            compoundButton = this.f9825e;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f9838y = z6;
        this.f9833t = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f9828o;
        if (imageView != null) {
            imageView.setVisibility((this.f9835v || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z6 = this.f9821a.m11732y() || this.f9838y;
        if (z6 || this.f9833t) {
            ImageView imageView = this.f9822b;
            if (imageView == null && drawable == null && !this.f9833t) {
                return;
            }
            if (imageView == null) {
                m11613f();
            }
            if (drawable == null && !this.f9833t) {
                this.f9822b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f9822b;
            if (!z6) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f9822b.getVisibility() != 0) {
                this.f9822b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f9824d.getVisibility() != 8) {
                this.f9824d.setVisibility(8);
            }
        } else {
            this.f9824d.setText(charSequence);
            if (this.f9824d.getVisibility() != 0) {
                this.f9824d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        C5632d0 m23637r = C5632d0.m23637r(getContext(), attributeSet, AbstractC4224i.f14391q1, i7, 0);
        this.f9830q = m23637r.m23643f(AbstractC4224i.f14399s1);
        this.f9831r = m23637r.m23649l(AbstractC4224i.f14395r1, -1);
        this.f9833t = m23637r.m23638a(AbstractC4224i.f14403t1, false);
        this.f9832s = context;
        this.f9834u = m23637r.m23643f(AbstractC4224i.f14407u1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC4216a.f14088n, 0);
        this.f9835v = obtainStyledAttributes.hasValue(0);
        m23637r.m23653s();
        obtainStyledAttributes.recycle();
    }
}

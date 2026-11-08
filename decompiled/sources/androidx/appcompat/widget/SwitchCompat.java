package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p000A.AbstractC0000a;
import p049H.AbstractC0475B;
import p070K.AbstractC0818g;
import p223f.AbstractC4216a;
import p223f.AbstractC4224i;
import p239h.AbstractC4474a;
import p267k.C5396a;
import p291n.AbstractC5608I;
import p291n.AbstractC5644j0;
import p291n.C5632d0;
import p291n.C5657w;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: U */
    public static final Property f10140U = new C3226a(Float.class, "thumbPos");

    /* renamed from: V */
    public static final int[] f10141V = {R.attr.state_checked};

    /* renamed from: A */
    public float f10142A;

    /* renamed from: B */
    public float f10143B;

    /* renamed from: C */
    public VelocityTracker f10144C;

    /* renamed from: D */
    public int f10145D;

    /* renamed from: E */
    public float f10146E;

    /* renamed from: F */
    public int f10147F;

    /* renamed from: G */
    public int f10148G;

    /* renamed from: H */
    public int f10149H;

    /* renamed from: I */
    public int f10150I;

    /* renamed from: J */
    public int f10151J;

    /* renamed from: K */
    public int f10152K;

    /* renamed from: L */
    public int f10153L;

    /* renamed from: M */
    public final TextPaint f10154M;

    /* renamed from: N */
    public ColorStateList f10155N;

    /* renamed from: O */
    public Layout f10156O;

    /* renamed from: P */
    public Layout f10157P;

    /* renamed from: Q */
    public TransformationMethod f10158Q;

    /* renamed from: R */
    public ObjectAnimator f10159R;

    /* renamed from: S */
    public final C5657w f10160S;

    /* renamed from: T */
    public final Rect f10161T;

    /* renamed from: a */
    public Drawable f10162a;

    /* renamed from: b */
    public ColorStateList f10163b;

    /* renamed from: c */
    public PorterDuff.Mode f10164c;

    /* renamed from: d */
    public boolean f10165d;

    /* renamed from: e */
    public boolean f10166e;

    /* renamed from: f */
    public Drawable f10167f;

    /* renamed from: n */
    public ColorStateList f10168n;

    /* renamed from: o */
    public PorterDuff.Mode f10169o;

    /* renamed from: p */
    public boolean f10170p;

    /* renamed from: q */
    public boolean f10171q;

    /* renamed from: r */
    public int f10172r;

    /* renamed from: s */
    public int f10173s;

    /* renamed from: t */
    public int f10174t;

    /* renamed from: u */
    public boolean f10175u;

    /* renamed from: v */
    public CharSequence f10176v;

    /* renamed from: w */
    public CharSequence f10177w;

    /* renamed from: x */
    public boolean f10178x;

    /* renamed from: y */
    public int f10179y;

    /* renamed from: z */
    public int f10180z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public static class C3226a extends Property {
        public C3226a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f10146E);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f7) {
            switchCompat.setThumbPosition(f7.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4216a.f14091q);
    }

    /* renamed from: f */
    public static float m11838f(float f7, float f8, float f9) {
        return f7 < f8 ? f8 : f7 > f9 ? f9 : f7;
    }

    private boolean getTargetCheckedState() {
        return this.f10146E > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((AbstractC5644j0.m23700b(this) ? 1.0f - this.f10146E : this.f10146E) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f10167f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f10161T;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f10162a;
        Rect m23498c = drawable2 != null ? AbstractC5608I.m23498c(drawable2) : AbstractC5608I.f20266c;
        return ((((this.f10147F - this.f10149H) - rect.left) - rect.right) - m23498c.left) - m23498c.right;
    }

    /* renamed from: a */
    public final void m11839a(boolean z6) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f10140U, z6 ? 1.0f : 0.0f);
        this.f10159R = ofFloat;
        ofFloat.setDuration(250L);
        this.f10159R.setAutoCancel(true);
        this.f10159R.start();
    }

    /* renamed from: b */
    public final void m11840b() {
        Drawable drawable = this.f10162a;
        if (drawable != null) {
            if (this.f10165d || this.f10166e) {
                Drawable mutate = AbstractC0000a.m15p(drawable).mutate();
                this.f10162a = mutate;
                if (this.f10165d) {
                    AbstractC0000a.m12m(mutate, this.f10163b);
                }
                if (this.f10166e) {
                    AbstractC0000a.m13n(this.f10162a, this.f10164c);
                }
                if (this.f10162a.isStateful()) {
                    this.f10162a.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m11841c() {
        Drawable drawable = this.f10167f;
        if (drawable != null) {
            if (this.f10170p || this.f10171q) {
                Drawable mutate = AbstractC0000a.m15p(drawable).mutate();
                this.f10167f = mutate;
                if (this.f10170p) {
                    AbstractC0000a.m12m(mutate, this.f10168n);
                }
                if (this.f10171q) {
                    AbstractC0000a.m13n(this.f10167f, this.f10169o);
                }
                if (this.f10167f.isStateful()) {
                    this.f10167f.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m11842d() {
        ObjectAnimator objectAnimator = this.f10159R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        int i8;
        Rect rect = this.f10161T;
        int i9 = this.f10150I;
        int i10 = this.f10151J;
        int i11 = this.f10152K;
        int i12 = this.f10153L;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.f10162a;
        Rect m23498c = drawable != null ? AbstractC5608I.m23498c(drawable) : AbstractC5608I.f20266c;
        Drawable drawable2 = this.f10167f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i13 = rect.left;
            thumbOffset += i13;
            if (m23498c != null) {
                int i14 = m23498c.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = m23498c.top;
                int i16 = rect.top;
                i7 = i15 > i16 ? (i15 - i16) + i10 : i10;
                int i17 = m23498c.right;
                int i18 = rect.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = m23498c.bottom;
                int i20 = rect.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                    this.f10167f.setBounds(i9, i7, i11, i8);
                }
            } else {
                i7 = i10;
            }
            i8 = i12;
            this.f10167f.setBounds(i9, i7, i11, i8);
        }
        Drawable drawable3 = this.f10162a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i21 = thumbOffset - rect.left;
            int i22 = thumbOffset + this.f10149H + rect.right;
            this.f10162a.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0000a.m10k(background, i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f10162a;
        if (drawable != null) {
            AbstractC0000a.m9j(drawable, f7, f8);
        }
        Drawable drawable2 = this.f10167f;
        if (drawable2 != null) {
            AbstractC0000a.m9j(drawable2, f7, f8);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f10162a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f10167f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m11843e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: g */
    public final boolean m11844g(float f7, float f8) {
        if (this.f10162a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f10162a.getPadding(this.f10161T);
        int i7 = this.f10151J;
        int i8 = this.f10180z;
        int i9 = i7 - i8;
        int i10 = (this.f10150I + thumbOffset) - i8;
        int i11 = this.f10149H + i10;
        Rect rect = this.f10161T;
        return f7 > ((float) i10) && f7 < ((float) (((i11 + rect.left) + rect.right) + i8)) && f8 > ((float) i9) && f8 < ((float) (this.f10153L + i8));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!AbstractC5644j0.m23700b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f10147F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f10174t : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (AbstractC5644j0.m23700b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f10147F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f10174t : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f10178x;
    }

    public boolean getSplitTrack() {
        return this.f10175u;
    }

    public int getSwitchMinWidth() {
        return this.f10173s;
    }

    public int getSwitchPadding() {
        return this.f10174t;
    }

    public CharSequence getTextOff() {
        return this.f10177w;
    }

    public CharSequence getTextOn() {
        return this.f10176v;
    }

    public Drawable getThumbDrawable() {
        return this.f10162a;
    }

    public int getThumbTextPadding() {
        return this.f10172r;
    }

    public ColorStateList getThumbTintList() {
        return this.f10163b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f10164c;
    }

    public Drawable getTrackDrawable() {
        return this.f10167f;
    }

    public ColorStateList getTrackTintList() {
        return this.f10168n;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f10169o;
    }

    /* renamed from: h */
    public final Layout m11845h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f10158Q;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f10154M, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: i */
    public void m11846i(Context context, int i7) {
        C5632d0 m23635p = C5632d0.m23635p(context, i7, AbstractC4224i.f14376m2);
        ColorStateList m23640c = m23635p.m23640c(AbstractC4224i.f14392q2);
        if (m23640c != null) {
            this.f10155N = m23640c;
        } else {
            this.f10155N = getTextColors();
        }
        int m23642e = m23635p.m23642e(AbstractC4224i.f14380n2, 0);
        if (m23642e != 0) {
            float f7 = m23642e;
            if (f7 != this.f10154M.getTextSize()) {
                this.f10154M.setTextSize(f7);
                requestLayout();
            }
        }
        m11848k(m23635p.m23646i(AbstractC4224i.f14384o2, -1), m23635p.m23646i(AbstractC4224i.f14388p2, -1));
        if (m23635p.m23638a(AbstractC4224i.f14412v2, false)) {
            this.f10158Q = new C5396a(getContext());
        } else {
            this.f10158Q = null;
        }
        m23635p.m23653s();
    }

    /* renamed from: j */
    public void m11847j(Typeface typeface, int i7) {
        if (i7 <= 0) {
            this.f10154M.setFakeBoldText(false);
            this.f10154M.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i7) : Typeface.create(typeface, i7);
            setSwitchTypeface(defaultFromStyle);
            int i8 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i7;
            this.f10154M.setFakeBoldText((i8 & 1) != 0);
            this.f10154M.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10162a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f10167f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f10159R;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f10159R.end();
        this.f10159R = null;
    }

    /* renamed from: k */
    public final void m11848k(int i7, int i8) {
        m11847j(i7 != 1 ? i7 != 2 ? i7 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i8);
    }

    /* renamed from: l */
    public final void m11849l(MotionEvent motionEvent) {
        this.f10179y = 0;
        boolean z6 = true;
        boolean z7 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z7) {
            this.f10144C.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE);
            float xVelocity = this.f10144C.getXVelocity();
            if (Math.abs(xVelocity) <= this.f10145D) {
                z6 = getTargetCheckedState();
            } else if (!AbstractC5644j0.m23700b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z6 = false;
            }
        } else {
            z6 = isChecked;
        }
        if (z6 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z6);
        m11843e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f10141V);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f10161T;
        Drawable drawable = this.f10167f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.f10151J;
        int i8 = this.f10153L;
        int i9 = i7 + rect.top;
        int i10 = i8 - rect.bottom;
        Drawable drawable2 = this.f10162a;
        if (drawable != null) {
            if (!this.f10175u || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m23498c = AbstractC5608I.m23498c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m23498c.left;
                rect.right -= m23498c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f10156O : this.f10157P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f10155N;
            if (colorStateList != null) {
                this.f10154M.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f10154M.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i9 + i10) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f10176v : this.f10177w;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        int width;
        int i12;
        int i13;
        int i14;
        int i15;
        super.onLayout(z6, i7, i8, i9, i10);
        int i16 = 0;
        if (this.f10162a != null) {
            Rect rect = this.f10161T;
            Drawable drawable = this.f10167f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m23498c = AbstractC5608I.m23498c(this.f10162a);
            i11 = Math.max(0, m23498c.left - rect.left);
            i16 = Math.max(0, m23498c.right - rect.right);
        } else {
            i11 = 0;
        }
        if (AbstractC5644j0.m23700b(this)) {
            i12 = getPaddingLeft() + i11;
            width = ((this.f10147F + i12) - i11) - i16;
        } else {
            width = (getWidth() - getPaddingRight()) - i16;
            i12 = (width - this.f10147F) + i11 + i16;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i13 = this.f10148G;
            i14 = paddingTop - (i13 / 2);
        } else {
            if (gravity == 80) {
                i15 = getHeight() - getPaddingBottom();
                i14 = i15 - this.f10148G;
                this.f10150I = i12;
                this.f10151J = i14;
                this.f10153L = i15;
                this.f10152K = width;
            }
            i14 = getPaddingTop();
            i13 = this.f10148G;
        }
        i15 = i13 + i14;
        this.f10150I = i12;
        this.f10151J = i14;
        this.f10153L = i15;
        this.f10152K = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        if (this.f10178x) {
            if (this.f10156O == null) {
                this.f10156O = m11845h(this.f10176v);
            }
            if (this.f10157P == null) {
                this.f10157P = m11845h(this.f10177w);
            }
        }
        Rect rect = this.f10161T;
        Drawable drawable = this.f10162a;
        int i11 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i9 = (this.f10162a.getIntrinsicWidth() - rect.left) - rect.right;
            i10 = this.f10162a.getIntrinsicHeight();
        } else {
            i9 = 0;
            i10 = 0;
        }
        this.f10149H = Math.max(this.f10178x ? Math.max(this.f10156O.getWidth(), this.f10157P.getWidth()) + (this.f10172r * 2) : 0, i9);
        Drawable drawable2 = this.f10167f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i11 = this.f10167f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i12 = rect.left;
        int i13 = rect.right;
        Drawable drawable3 = this.f10162a;
        if (drawable3 != null) {
            Rect m23498c = AbstractC5608I.m23498c(drawable3);
            i12 = Math.max(i12, m23498c.left);
            i13 = Math.max(i13, m23498c.right);
        }
        int max = Math.max(this.f10173s, (this.f10149H * 2) + i12 + i13);
        int max2 = Math.max(i11, i10);
        this.f10147F = max;
        this.f10148G = max2;
        super.onMeasure(i7, i8);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f10176v : this.f10177w;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f10144C
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f10179y
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f10142A
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = p291n.AbstractC5644j0.m23700b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f10146E
            float r0 = r0 + r2
            float r0 = m11838f(r0, r4, r3)
            float r2 = r6.f10146E
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f10142A = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f10142A
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f10180z
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f10143B
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f10180z
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f10179y = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f10142A = r0
            r6.f10143B = r3
            return r1
        L89:
            int r0 = r6.f10179y
            if (r0 != r2) goto L94
            r6.m11849l(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f10179y = r0
            android.view.VelocityTracker r0 = r6.f10144C
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.m11844g(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f10179y = r1
            r6.f10142A = r0
            r6.f10143B = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        super.setChecked(z6);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && AbstractC0475B.m1765x(this)) {
            m11839a(isChecked);
        } else {
            m11842d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0818g.m3419m(this, callback));
    }

    public void setShowText(boolean z6) {
        if (this.f10178x != z6) {
            this.f10178x = z6;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z6) {
        this.f10175u = z6;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.f10173s = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.f10174t = i7;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f10154M.getTypeface() == null || this.f10154M.getTypeface().equals(typeface)) && (this.f10154M.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f10154M.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f10177w = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f10176v = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f10162a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f10162a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f7) {
        this.f10146E = f7;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(AbstractC4474a.m19044b(getContext(), i7));
    }

    public void setThumbTextPadding(int i7) {
        this.f10172r = i7;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f10163b = colorStateList;
        this.f10165d = true;
        m11840b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f10164c = mode;
        this.f10166e = true;
        m11840b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f10167f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f10167f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(AbstractC4474a.m19044b(getContext(), i7));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f10168n = colorStateList;
        this.f10170p = true;
        m11841c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f10169o = mode;
        this.f10171q = true;
        m11841c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10162a || drawable == this.f10167f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10163b = null;
        this.f10164c = null;
        this.f10165d = false;
        this.f10166e = false;
        this.f10168n = null;
        this.f10169o = null;
        this.f10170p = false;
        this.f10171q = false;
        this.f10144C = VelocityTracker.obtain();
        this.f10161T = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f10154M = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C5632d0 m23637r = C5632d0.m23637r(context, attributeSet, AbstractC4224i.f14305X1, i7, 0);
        Drawable m23643f = m23637r.m23643f(AbstractC4224i.f14318a2);
        this.f10162a = m23643f;
        if (m23643f != null) {
            m23643f.setCallback(this);
        }
        Drawable m23643f2 = m23637r.m23643f(AbstractC4224i.f14363j2);
        this.f10167f = m23643f2;
        if (m23643f2 != null) {
            m23643f2.setCallback(this);
        }
        this.f10176v = m23637r.m23651n(AbstractC4224i.f14309Y1);
        this.f10177w = m23637r.m23651n(AbstractC4224i.f14313Z1);
        this.f10178x = m23637r.m23638a(AbstractC4224i.f14323b2, true);
        this.f10172r = m23637r.m23642e(AbstractC4224i.f14348g2, 0);
        this.f10173s = m23637r.m23642e(AbstractC4224i.f14333d2, 0);
        this.f10174t = m23637r.m23642e(AbstractC4224i.f14338e2, 0);
        this.f10175u = m23637r.m23638a(AbstractC4224i.f14328c2, false);
        ColorStateList m23640c = m23637r.m23640c(AbstractC4224i.f14353h2);
        if (m23640c != null) {
            this.f10163b = m23640c;
            this.f10165d = true;
        }
        PorterDuff.Mode m23499d = AbstractC5608I.m23499d(m23637r.m23646i(AbstractC4224i.f14358i2, -1), null);
        if (this.f10164c != m23499d) {
            this.f10164c = m23499d;
            this.f10166e = true;
        }
        if (this.f10165d || this.f10166e) {
            m11840b();
        }
        ColorStateList m23640c2 = m23637r.m23640c(AbstractC4224i.f14368k2);
        if (m23640c2 != null) {
            this.f10168n = m23640c2;
            this.f10170p = true;
        }
        PorterDuff.Mode m23499d2 = AbstractC5608I.m23499d(m23637r.m23646i(AbstractC4224i.f14372l2, -1), null);
        if (this.f10169o != m23499d2) {
            this.f10169o = m23499d2;
            this.f10171q = true;
        }
        if (this.f10170p || this.f10171q) {
            m11841c();
        }
        int m23649l = m23637r.m23649l(AbstractC4224i.f14343f2, 0);
        if (m23649l != 0) {
            m11846i(context, m23649l);
        }
        C5657w c5657w = new C5657w(this);
        this.f10160S = c5657w;
        c5657w.m23729m(attributeSet, i7);
        m23637r.m23653s();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10180z = viewConfiguration.getScaledTouchSlop();
        this.f10145D = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}

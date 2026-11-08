package p291n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p035F.AbstractC0313l;
import p070K.AbstractC0818g;
import p070K.InterfaceC0813b;
import p070K.InterfaceC0819h;
import p207d.AbstractC4094d;
import p239h.AbstractC4474a;
import p386z.AbstractC7092g;

/* renamed from: n.x */
/* loaded from: classes.dex */
public class C5658x extends TextView implements InterfaceC0819h, InterfaceC0813b {

    /* renamed from: a */
    public final C5631d f20486a;

    /* renamed from: b */
    public final C5657w f20487b;

    /* renamed from: c */
    public final C5649o f20488c;

    /* renamed from: d */
    public Future f20489d;

    public C5658x(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5631d c5631d = this.f20486a;
        if (c5631d != null) {
            c5631d.m23625b();
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23719b();
        }
    }

    /* renamed from: e */
    public final void m23745e() {
        Future future = this.f20489d;
        if (future != null) {
            try {
                this.f20489d = null;
                AbstractC4094d.m17162a(future.get());
                AbstractC0818g.m3417k(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0813b.f2835g) {
            return super.getAutoSizeMaxTextSize();
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            return c5657w.m23721e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0813b.f2835g) {
            return super.getAutoSizeMinTextSize();
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            return c5657w.m23722f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0813b.f2835g) {
            return super.getAutoSizeStepGranularity();
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            return c5657w.m23723g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0813b.f2835g) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5657w c5657w = this.f20487b;
        return c5657w != null ? c5657w.m23724h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0813b.f2835g) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            return c5657w.m23725i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return AbstractC0818g.m3407a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return AbstractC0818g.m3408b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5631d c5631d = this.f20486a;
        if (c5631d != null) {
            return c5631d.m23626c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5631d c5631d = this.f20486a;
        if (c5631d != null) {
            return c5631d.m23627d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20487b.m23726j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20487b.m23727k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m23745e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C5649o c5649o;
        return (Build.VERSION.SDK_INT >= 28 || (c5649o = this.f20488c) == null) ? super.getTextClassifier() : c5649o.m23705a();
    }

    public AbstractC0313l.a getTextMetricsParamsCompat() {
        return AbstractC0818g.m3411e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC5635f.m23669a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23730n(z6, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        m23745e();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C5657w c5657w = this.f20487b;
        if (c5657w == null || InterfaceC0813b.f2835g || !c5657w.m23728l()) {
            return;
        }
        this.f20487b.m23720c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (InterfaceC0813b.f2835g) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23735s(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (InterfaceC0813b.f2835g) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23736t(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (InterfaceC0813b.f2835g) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23737u(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5631d c5631d = this.f20486a;
        if (c5631d != null) {
            c5631d.m23629f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C5631d c5631d = this.f20486a;
        if (c5631d != null) {
            c5631d.m23630g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23731o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23731o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23731o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23731o();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0818g.m3419m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i7);
        } else {
            AbstractC0818g.m3414h(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i7);
        } else {
            AbstractC0818g.m3415i(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        AbstractC0818g.m3416j(this, i7);
    }

    public void setPrecomputedText(AbstractC0313l abstractC0313l) {
        AbstractC0818g.m3417k(this, abstractC0313l);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5631d c5631d = this.f20486a;
        if (c5631d != null) {
            c5631d.m23632i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5631d c5631d = this.f20486a;
        if (c5631d != null) {
            c5631d.m23633j(mode);
        }
    }

    @Override // p070K.InterfaceC0819h
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f20487b.m23738v(colorStateList);
        this.f20487b.m23719b();
    }

    @Override // p070K.InterfaceC0819h
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f20487b.m23739w(mode);
        this.f20487b.m23719b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23732p(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5649o c5649o;
        if (Build.VERSION.SDK_INT >= 28 || (c5649o = this.f20488c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c5649o.m23706b(textClassifier);
        }
    }

    public void setTextFuture(Future<AbstractC0313l> future) {
        this.f20489d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(AbstractC0313l.a aVar) {
        AbstractC0818g.m3418l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f7) {
        if (InterfaceC0813b.f2835g) {
            super.setTextSize(i7, f7);
            return;
        }
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23742z(i7, f7);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i7) {
        Typeface m29221a = (typeface == null || i7 <= 0) ? null : AbstractC7092g.m29221a(getContext(), typeface, i7);
        if (m29221a != null) {
            typeface = m29221a;
        }
        super.setTypeface(typeface, i7);
    }

    public C5658x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C5658x(Context context, AttributeSet attributeSet, int i7) {
        super(C5626a0.m23622b(context), attributeSet, i7);
        C5631d c5631d = new C5631d(this);
        this.f20486a = c5631d;
        c5631d.m23628e(attributeSet, i7);
        C5657w c5657w = new C5657w(this);
        this.f20487b = c5657w;
        c5657w.m23729m(attributeSet, i7);
        c5657w.m23719b();
        this.f20488c = new C5649o(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? AbstractC4474a.m19044b(context, i7) : null, i8 != 0 ? AbstractC4474a.m19044b(context, i8) : null, i9 != 0 ? AbstractC4474a.m19044b(context, i9) : null, i10 != 0 ? AbstractC4474a.m19044b(context, i10) : null);
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23731o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? AbstractC4474a.m19044b(context, i7) : null, i8 != 0 ? AbstractC4474a.m19044b(context, i8) : null, i9 != 0 ? AbstractC4474a.m19044b(context, i9) : null, i10 != 0 ? AbstractC4474a.m19044b(context, i10) : null);
        C5657w c5657w = this.f20487b;
        if (c5657w != null) {
            c5657w.m23731o();
        }
    }
}

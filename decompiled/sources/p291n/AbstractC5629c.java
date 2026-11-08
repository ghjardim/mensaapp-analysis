package p291n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p070K.AbstractC0818g;
import p239h.AbstractC4474a;

/* renamed from: n.c */
/* loaded from: classes.dex */
public abstract class AbstractC5629c extends AutoCompleteTextView {

    /* renamed from: c */
    public static final int[] f20410c = {R.attr.popupBackground};

    /* renamed from: a */
    public final C5631d f20411a;

    /* renamed from: b */
    public final C5657w f20412b;

    public AbstractC5629c(Context context, AttributeSet attributeSet, int i7) {
        super(C5626a0.m23622b(context), attributeSet, i7);
        C5632d0 m23637r = C5632d0.m23637r(getContext(), attributeSet, f20410c, i7, 0);
        if (m23637r.m23652o(0)) {
            setDropDownBackgroundDrawable(m23637r.m23643f(0));
        }
        m23637r.m23653s();
        C5631d c5631d = new C5631d(this);
        this.f20411a = c5631d;
        c5631d.m23628e(attributeSet, i7);
        C5657w c5657w = new C5657w(this);
        this.f20412b = c5657w;
        c5657w.m23729m(attributeSet, i7);
        c5657w.m23719b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5631d c5631d = this.f20411a;
        if (c5631d != null) {
            c5631d.m23625b();
        }
        C5657w c5657w = this.f20412b;
        if (c5657w != null) {
            c5657w.m23719b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5631d c5631d = this.f20411a;
        if (c5631d != null) {
            return c5631d.m23626c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5631d c5631d = this.f20411a;
        if (c5631d != null) {
            return c5631d.m23627d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC5635f.m23669a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5631d c5631d = this.f20411a;
        if (c5631d != null) {
            c5631d.m23629f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C5631d c5631d = this.f20411a;
        if (c5631d != null) {
            c5631d.m23630g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0818g.m3419m(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(AbstractC4474a.m19044b(getContext(), i7));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5631d c5631d = this.f20411a;
        if (c5631d != null) {
            c5631d.m23632i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5631d c5631d = this.f20411a;
        if (c5631d != null) {
            c5631d.m23633j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C5657w c5657w = this.f20412b;
        if (c5657w != null) {
            c5657w.m23732p(context, i7);
        }
    }
}

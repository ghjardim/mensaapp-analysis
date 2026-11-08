package p291n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: n.g */
/* loaded from: classes.dex */
public class C5637g extends ImageButton {

    /* renamed from: a */
    public final C5631d f20432a;

    /* renamed from: b */
    public final C5639h f20433b;

    public C5637g(Context context, AttributeSet attributeSet, int i7) {
        super(C5626a0.m23622b(context), attributeSet, i7);
        C5631d c5631d = new C5631d(this);
        this.f20432a = c5631d;
        c5631d.m23628e(attributeSet, i7);
        C5639h c5639h = new C5639h(this);
        this.f20433b = c5639h;
        c5639h.m23684f(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5631d c5631d = this.f20432a;
        if (c5631d != null) {
            c5631d.m23625b();
        }
        C5639h c5639h = this.f20433b;
        if (c5639h != null) {
            c5639h.m23680b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5631d c5631d = this.f20432a;
        if (c5631d != null) {
            return c5631d.m23626c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5631d c5631d = this.f20432a;
        if (c5631d != null) {
            return c5631d.m23627d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C5639h c5639h = this.f20433b;
        if (c5639h != null) {
            return c5639h.m23681c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C5639h c5639h = this.f20433b;
        if (c5639h != null) {
            return c5639h.m23682d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f20433b.m23683e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5631d c5631d = this.f20432a;
        if (c5631d != null) {
            c5631d.m23629f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C5631d c5631d = this.f20432a;
        if (c5631d != null) {
            c5631d.m23630g(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C5639h c5639h = this.f20433b;
        if (c5639h != null) {
            c5639h.m23680b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C5639h c5639h = this.f20433b;
        if (c5639h != null) {
            c5639h.m23680b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        this.f20433b.m23685g(i7);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C5639h c5639h = this.f20433b;
        if (c5639h != null) {
            c5639h.m23680b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5631d c5631d = this.f20432a;
        if (c5631d != null) {
            c5631d.m23632i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5631d c5631d = this.f20432a;
        if (c5631d != null) {
            c5631d.m23633j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C5639h c5639h = this.f20433b;
        if (c5639h != null) {
            c5639h.m23686h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C5639h c5639h = this.f20433b;
        if (c5639h != null) {
            c5639h.m23687i(mode);
        }
    }
}

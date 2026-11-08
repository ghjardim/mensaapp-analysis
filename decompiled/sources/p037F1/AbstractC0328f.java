package p037F1;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p000A.AbstractC0000a;

/* renamed from: F1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0328f extends Drawable {

    /* renamed from: a */
    public Drawable f1209a;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m0a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m7h(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.setLevel(i7) : super.onLevelChange(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i7) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i7);
        } else {
            super.setChangingConfigurations(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i7, PorterDuff.Mode mode) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setColorFilter(i7, mode);
        } else {
            super.setColorFilter(i7, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setFilterBitmap(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m9j(drawable, f7, f8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m10k(drawable, i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}

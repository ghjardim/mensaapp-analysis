package p247i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p000A.AbstractC0000a;

/* renamed from: i.c */
/* loaded from: classes.dex */
public abstract class AbstractC4501c extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public Drawable f16067a;

    public AbstractC4501c(Drawable drawable) {
        m19179b(drawable);
    }

    /* renamed from: a */
    public Drawable m19178a() {
        return this.f16067a;
    }

    /* renamed from: b */
    public void m19179b(Drawable drawable) {
        Drawable drawable2 = this.f16067a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f16067a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f16067a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f16067a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f16067a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f16067a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f16067a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f16067a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f16067a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f16067a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f16067a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f16067a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f16067a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return AbstractC0000a.m6g(this.f16067a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f16067a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        AbstractC0000a.m7h(this.f16067a);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f16067a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        return this.f16067a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f16067a.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        AbstractC0000a.m8i(this.f16067a, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i7) {
        this.f16067a.setChangingConfigurations(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f16067a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        this.f16067a.setDither(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        this.f16067a.setFilterBitmap(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        AbstractC0000a.m9j(this.f16067a, f7, f8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        AbstractC0000a.m10k(this.f16067a, i7, i8, i9, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f16067a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        AbstractC0000a.m11l(this.f16067a, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC0000a.m12m(this.f16067a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC0000a.m13n(this.f16067a, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        return super.setVisible(z6, z7) || this.f16067a.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

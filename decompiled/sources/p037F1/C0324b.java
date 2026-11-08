package p037F1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p000A.AbstractC0000a;
import p334s.C6308a;
import p379y.AbstractC7046k;

/* renamed from: F1.b */
/* loaded from: classes.dex */
public class C0324b extends AbstractC0328f implements Animatable {

    /* renamed from: b */
    public b f1194b;

    /* renamed from: c */
    public Context f1195c;

    /* renamed from: d */
    public ArgbEvaluator f1196d;

    /* renamed from: e */
    public Animator.AnimatorListener f1197e;

    /* renamed from: f */
    public ArrayList f1198f;

    /* renamed from: n */
    public final Drawable.Callback f1199n;

    /* renamed from: F1.b$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0324b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            C0324b.this.scheduleSelf(runnable, j7);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0324b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: F1.b$b */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f1201a;

        /* renamed from: b */
        public C0329g f1202b;

        /* renamed from: c */
        public AnimatorSet f1203c;

        /* renamed from: d */
        public ArrayList f1204d;

        /* renamed from: e */
        public C6308a f1205e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f1201a = bVar.f1201a;
                C0329g c0329g = bVar.f1202b;
                if (c0329g != null) {
                    Drawable.ConstantState constantState = c0329g.getConstantState();
                    if (resources != null) {
                        this.f1202b = (C0329g) constantState.newDrawable(resources);
                    } else {
                        this.f1202b = (C0329g) constantState.newDrawable();
                    }
                    C0329g c0329g2 = (C0329g) this.f1202b.mutate();
                    this.f1202b = c0329g2;
                    c0329g2.setCallback(callback);
                    this.f1202b.setBounds(bVar.f1202b.getBounds());
                    this.f1202b.m1302h(false);
                }
                ArrayList arrayList = bVar.f1204d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f1204d = new ArrayList(size);
                    this.f1205e = new C6308a(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        Animator animator = (Animator) bVar.f1204d.get(i7);
                        Animator clone = animator.clone();
                        String str = (String) bVar.f1205e.get(animator);
                        clone.setTarget(this.f1202b.m1299d(str));
                        this.f1204d.add(clone);
                        this.f1205e.put(clone, str);
                    }
                    m1272a();
                }
            }
        }

        /* renamed from: a */
        public void m1272a() {
            if (this.f1203c == null) {
                this.f1203c = new AnimatorSet();
            }
            this.f1203c.playTogether(this.f1204d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1201a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C0324b() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C0324b m1270a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0324b c0324b = new C0324b(context);
        c0324b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0324b;
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m0a(drawable, theme);
        }
    }

    /* renamed from: b */
    public final void m1271b(String str, Animator animator) {
        animator.setTarget(this.f1194b.f1202b.m1299d(str));
        b bVar = this.f1194b;
        if (bVar.f1204d == null) {
            bVar.f1204d = new ArrayList();
            this.f1194b.f1205e = new C6308a();
        }
        this.f1194b.f1204d.add(animator);
        this.f1194b.f1205e.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            return AbstractC0000a.m1b(drawable);
        }
        return false;
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1194b.f1202b.draw(canvas);
        if (this.f1194b.f1203c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1209a;
        return drawable != null ? AbstractC0000a.m2c(drawable) : this.f1194b.f1202b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1194b.f1201a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1209a;
        return drawable != null ? AbstractC0000a.m3d(drawable) : this.f1194b.f1202b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1209a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f1209a.getConstantState());
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1194b.f1202b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1194b.f1202b.getIntrinsicWidth();
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.getOpacity() : this.f1194b.f1202b.getOpacity();
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m5f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC0323a.f1186e);
                    int resourceId = m29025s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0329g m1296b = C0329g.m1296b(resources, resourceId, theme);
                        m1296b.m1302h(false);
                        m1296b.setCallback(this.f1199n);
                        C0329g c0329g = this.f1194b.f1202b;
                        if (c0329g != null) {
                            c0329g.setCallback(null);
                        }
                        this.f1194b.f1202b = m1296b;
                    }
                    m29025s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0323a.f1187f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1195c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m1271b(string, AbstractC0326d.m1282i(context, resourceId2));
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f1194b.m1272a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1209a;
        return drawable != null ? AbstractC0000a.m6g(drawable) : this.f1194b.f1202b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f1209a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1194b.f1203c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.isStateful() : this.f1194b.f1202b.isStateful();
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1194b.f1202b.setBounds(rect);
        }
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.setLevel(i7) : this.f1194b.f1202b.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1209a;
        return drawable != null ? drawable.setState(iArr) : this.f1194b.f1202b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f1194b.f1202b.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m8i(drawable, z6);
        } else {
            this.f1194b.f1202b.setAutoMirrored(z6);
        }
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z6) {
        super.setFilterBitmap(z6);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // p037F1.AbstractC0328f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m11l(drawable, i7);
        } else {
            this.f1194b.f1202b.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m12m(drawable, colorStateList);
        } else {
            this.f1194b.f1202b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            AbstractC0000a.m13n(drawable, mode);
        } else {
            this.f1194b.f1202b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            return drawable.setVisible(z6, z7);
        }
        this.f1194b.f1202b.setVisible(z6, z7);
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f1194b.f1203c.isStarted()) {
                return;
            }
            this.f1194b.f1203c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1194b.f1203c.end();
        }
    }

    public C0324b(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1209a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1194b.f1202b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: F1.b$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f1206a;

        public c(Drawable.ConstantState constantState) {
            this.f1206a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1206a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1206a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0324b c0324b = new C0324b();
            Drawable newDrawable = this.f1206a.newDrawable();
            c0324b.f1209a = newDrawable;
            newDrawable.setCallback(c0324b.f1199n);
            return c0324b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0324b c0324b = new C0324b();
            Drawable newDrawable = this.f1206a.newDrawable(resources);
            c0324b.f1209a = newDrawable;
            newDrawable.setCallback(c0324b.f1199n);
            return c0324b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0324b c0324b = new C0324b();
            Drawable newDrawable = this.f1206a.newDrawable(resources, theme);
            c0324b.f1209a = newDrawable;
            newDrawable.setCallback(c0324b.f1199n);
            return c0324b;
        }
    }

    public C0324b(Context context, b bVar, Resources resources) {
        this.f1196d = null;
        this.f1197e = null;
        this.f1198f = null;
        a aVar = new a();
        this.f1199n = aVar;
        this.f1195c = context;
        if (bVar != null) {
            this.f1194b = bVar;
        } else {
            this.f1194b = new b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

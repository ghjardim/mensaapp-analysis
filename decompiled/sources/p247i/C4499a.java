package p247i;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p037F1.C0324b;
import p037F1.C0329g;
import p247i.AbstractC4500b;
import p247i.AbstractC4502d;
import p255j.AbstractC5317b;
import p291n.C5619U;
import p334s.C6315h;
import p334s.C6319l;
import p379y.AbstractC7046k;

/* renamed from: i.a */
/* loaded from: classes.dex */
public class C4499a extends AbstractC4502d {

    /* renamed from: A */
    public boolean f16003A;

    /* renamed from: w */
    public c f16004w;

    /* renamed from: x */
    public g f16005x;

    /* renamed from: y */
    public int f16006y;

    /* renamed from: z */
    public int f16007z;

    /* renamed from: i.a$b */
    public static class b extends g {

        /* renamed from: a */
        public final Animatable f16008a;

        public b(Animatable animatable) {
            super();
            this.f16008a = animatable;
        }

        @Override // p247i.C4499a.g
        /* renamed from: c */
        public void mo19130c() {
            this.f16008a.start();
        }

        @Override // p247i.C4499a.g
        /* renamed from: d */
        public void mo19131d() {
            this.f16008a.stop();
        }
    }

    /* renamed from: i.a$c */
    public static class c extends AbstractC4502d.a {

        /* renamed from: K */
        public C6315h f16009K;

        /* renamed from: L */
        public C6319l f16010L;

        public c(c cVar, C4499a c4499a, Resources resources) {
            super(cVar, c4499a, resources);
            if (cVar != null) {
                this.f16009K = cVar.f16009K;
                this.f16010L = cVar.f16010L;
            } else {
                this.f16009K = new C6315h();
                this.f16010L = new C6319l();
            }
        }

        /* renamed from: D */
        public static long m19132D(int i7, int i8) {
            return i8 | (i7 << 32);
        }

        /* renamed from: B */
        public int m19133B(int[] iArr, Drawable drawable, int i7) {
            int m19182z = super.m19182z(iArr, drawable);
            this.f16010L.m26466g(m19182z, Integer.valueOf(i7));
            return m19182z;
        }

        /* renamed from: C */
        public int m19134C(int i7, int i8, Drawable drawable, boolean z6) {
            int m19154a = super.m19154a(drawable);
            long m19132D = m19132D(i7, i8);
            long j7 = z6 ? 8589934592L : 0L;
            long j8 = m19154a;
            this.f16009K.m26437a(m19132D, Long.valueOf(j8 | j7));
            if (z6) {
                this.f16009K.m26437a(m19132D(i8, i7), Long.valueOf(4294967296L | j8 | j7));
            }
            return m19154a;
        }

        /* renamed from: E */
        public int m19135E(int i7) {
            if (i7 < 0) {
                return 0;
            }
            return ((Integer) this.f16010L.m26464e(i7, 0)).intValue();
        }

        /* renamed from: F */
        public int m19136F(int[] iArr) {
            int m19181A = super.m19181A(iArr);
            return m19181A >= 0 ? m19181A : super.m19181A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        public int m19137G(int i7, int i8) {
            return (int) ((Long) this.f16009K.m26442f(m19132D(i7, i8), -1L)).longValue();
        }

        /* renamed from: H */
        public boolean m19138H(int i7, int i8) {
            return (((Long) this.f16009K.m26442f(m19132D(i7, i8), -1L)).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        public boolean m19139I(int i7, int i8) {
            return (((Long) this.f16009K.m26442f(m19132D(i7, i8), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C4499a(this, null);
        }

        @Override // p247i.AbstractC4502d.a, p247i.AbstractC4500b.c
        /* renamed from: r */
        public void mo19140r() {
            this.f16009K = this.f16009K.clone();
            this.f16010L = this.f16010L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C4499a(this, resources);
        }
    }

    /* renamed from: i.a$d */
    public static class d extends g {

        /* renamed from: a */
        public final C0324b f16011a;

        public d(C0324b c0324b) {
            super();
            this.f16011a = c0324b;
        }

        @Override // p247i.C4499a.g
        /* renamed from: c */
        public void mo19130c() {
            this.f16011a.start();
        }

        @Override // p247i.C4499a.g
        /* renamed from: d */
        public void mo19131d() {
            this.f16011a.stop();
        }
    }

    /* renamed from: i.a$e */
    public static class e extends g {

        /* renamed from: a */
        public final ObjectAnimator f16012a;

        /* renamed from: b */
        public final boolean f16013b;

        public e(AnimationDrawable animationDrawable, boolean z6, boolean z7) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i7 = z6 ? numberOfFrames - 1 : 0;
            int i8 = z6 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z6);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i7, i8);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.m19143a());
            ofInt.setInterpolator(fVar);
            this.f16013b = z7;
            this.f16012a = ofInt;
        }

        @Override // p247i.C4499a.g
        /* renamed from: a */
        public boolean mo19141a() {
            return this.f16013b;
        }

        @Override // p247i.C4499a.g
        /* renamed from: b */
        public void mo19142b() {
            this.f16012a.reverse();
        }

        @Override // p247i.C4499a.g
        /* renamed from: c */
        public void mo19130c() {
            this.f16012a.start();
        }

        @Override // p247i.C4499a.g
        /* renamed from: d */
        public void mo19131d() {
            this.f16012a.cancel();
        }
    }

    /* renamed from: i.a$f */
    public static class f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f16014a;

        /* renamed from: b */
        public int f16015b;

        /* renamed from: c */
        public int f16016c;

        public f(AnimationDrawable animationDrawable, boolean z6) {
            m19144b(animationDrawable, z6);
        }

        /* renamed from: a */
        public int m19143a() {
            return this.f16016c;
        }

        /* renamed from: b */
        public int m19144b(AnimationDrawable animationDrawable, boolean z6) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f16015b = numberOfFrames;
            int[] iArr = this.f16014a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f16014a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f16014a;
            int i7 = 0;
            for (int i8 = 0; i8 < numberOfFrames; i8++) {
                int duration = animationDrawable.getDuration(z6 ? (numberOfFrames - i8) - 1 : i8);
                iArr2[i8] = duration;
                i7 += duration;
            }
            this.f16016c = i7;
            return i7;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            int i7 = (int) ((f7 * this.f16016c) + 0.5f);
            int i8 = this.f16015b;
            int[] iArr = this.f16014a;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = iArr[i9];
                if (i7 < i10) {
                    break;
                }
                i7 -= i10;
                i9++;
            }
            return (i9 / i8) + (i9 < i8 ? i7 / this.f16016c : 0.0f);
        }
    }

    public C4499a() {
        this(null, null);
    }

    /* renamed from: l */
    public static C4499a m19119l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C4499a c4499a = new C4499a();
            c4499a.m19123m(context, resources, xmlPullParser, attributeSet, theme);
            return c4499a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // p247i.AbstractC4502d, p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p247i.AbstractC4502d, p247i.AbstractC4500b
    /* renamed from: h */
    public void mo19121h(AbstractC4500b.c cVar) {
        super.mo19121h(cVar);
        if (cVar instanceof c) {
            this.f16004w = (c) cVar;
        }
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f16005x;
        if (gVar != null) {
            gVar.mo19131d();
            this.f16005x = null;
            m19150g(this.f16006y);
            this.f16006y = -1;
            this.f16007z = -1;
        }
    }

    @Override // p247i.AbstractC4500b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c mo19120b() {
        return new c(this.f16004w, this, null);
    }

    /* renamed from: m */
    public void m19123m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC5317b.f18761a);
        setVisible(m29025s.getBoolean(AbstractC5317b.f18763c, true), true);
        m19129s(m29025s);
        m19151i(resources);
        m29025s.recycle();
        m19124n(context, resources, xmlPullParser, attributeSet, theme);
        m19125o();
    }

    @Override // p247i.AbstractC4502d, p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f16003A && super.mutate() == this) {
            this.f16004w.mo19140r();
            this.f16003A = true;
        }
        return this;
    }

    /* renamed from: n */
    public final void m19124n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m19126p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m19127q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: o */
    public final void m19125o() {
        onStateChange(getState());
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i7) {
        return super.onLayoutDirectionChanged(i7);
    }

    @Override // p247i.AbstractC4502d, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m19136F = this.f16004w.m19136F(iArr);
        boolean z6 = m19136F != m19147c() && (m19128r(m19136F) || m19150g(m19136F));
        Drawable current = getCurrent();
        return current != null ? z6 | current.setState(iArr) : z6;
    }

    /* renamed from: p */
    public final int m19126p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC5317b.f18768h);
        int resourceId = m29025s.getResourceId(AbstractC5317b.f18769i, 0);
        int resourceId2 = m29025s.getResourceId(AbstractC5317b.f18770j, -1);
        Drawable m23568j = resourceId2 > 0 ? C5619U.m23557h().m23568j(context, resourceId2) : null;
        m29025s.recycle();
        int[] m19180j = m19180j(attributeSet);
        if (m23568j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            m23568j = xmlPullParser.getName().equals("vector") ? C0329g.m1297c(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (m23568j != null) {
            return this.f16004w.m19133B(m19180j, m23568j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: q */
    public final int m19127q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray m29025s = AbstractC7046k.m29025s(resources, theme, attributeSet, AbstractC5317b.f18771k);
        int resourceId = m29025s.getResourceId(AbstractC5317b.f18774n, -1);
        int resourceId2 = m29025s.getResourceId(AbstractC5317b.f18773m, -1);
        int resourceId3 = m29025s.getResourceId(AbstractC5317b.f18772l, -1);
        Drawable m23568j = resourceId3 > 0 ? C5619U.m23557h().m23568j(context, resourceId3) : null;
        boolean z6 = m29025s.getBoolean(AbstractC5317b.f18775o, false);
        m29025s.recycle();
        if (m23568j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            m23568j = xmlPullParser.getName().equals("animated-vector") ? C0324b.m1270a(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (m23568j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f16004w.m19134C(resourceId, resourceId2, m23568j, z6);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* renamed from: r */
    public final boolean m19128r(int i7) {
        int m19147c;
        int m19137G;
        g bVar;
        g gVar = this.f16005x;
        if (gVar == null) {
            m19147c = m19147c();
        } else {
            if (i7 == this.f16006y) {
                return true;
            }
            if (i7 == this.f16007z && gVar.mo19141a()) {
                gVar.mo19142b();
                this.f16006y = this.f16007z;
                this.f16007z = i7;
                return true;
            }
            m19147c = this.f16006y;
            gVar.mo19131d();
        }
        this.f16005x = null;
        this.f16007z = -1;
        this.f16006y = -1;
        c cVar = this.f16004w;
        int m19135E = cVar.m19135E(m19147c);
        int m19135E2 = cVar.m19135E(i7);
        if (m19135E2 == 0 || m19135E == 0 || (m19137G = cVar.m19137G(m19135E, m19135E2)) < 0) {
            return false;
        }
        boolean m19139I = cVar.m19139I(m19135E, m19135E2);
        m19150g(m19137G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m19138H(m19135E, m19135E2), m19139I);
        } else {
            if (!(current instanceof C0324b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C0324b) current);
        }
        bVar.mo19130c();
        this.f16005x = bVar;
        this.f16007z = m19147c;
        this.f16006y = i7;
        return true;
    }

    /* renamed from: s */
    public final void m19129s(TypedArray typedArray) {
        c cVar = this.f16004w;
        cVar.f16044d |= typedArray.getChangingConfigurations();
        cVar.m19176x(typedArray.getBoolean(AbstractC5317b.f18764d, cVar.f16049i));
        cVar.m19172t(typedArray.getBoolean(AbstractC5317b.f18765e, cVar.f16052l));
        cVar.m19173u(typedArray.getInt(AbstractC5317b.f18766f, cVar.f16032A));
        cVar.m19174v(typedArray.getInt(AbstractC5317b.f18767g, cVar.f16033B));
        setDither(typedArray.getBoolean(AbstractC5317b.f18762b, cVar.f16064x));
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        super.scheduleDrawable(drawable, runnable, j7);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i7) {
        super.setAlpha(i7);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z6) {
        super.setAutoMirrored(z6);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z6) {
        super.setDither(z6);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        g gVar = this.f16005x;
        if (gVar != null && (visible || z7)) {
            if (z6) {
                gVar.mo19130c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // p247i.AbstractC4500b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public C4499a(c cVar, Resources resources) {
        super(null);
        this.f16006y = -1;
        this.f16007z = -1;
        mo19121h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: i.a$g */
    public static abstract class g {
        public g() {
        }

        /* renamed from: a */
        public boolean mo19141a() {
            return false;
        }

        /* renamed from: c */
        public abstract void mo19130c();

        /* renamed from: d */
        public abstract void mo19131d();

        /* renamed from: b */
        public void mo19142b() {
        }
    }
}

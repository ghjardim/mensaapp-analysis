package p291n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p049H.AbstractC0475B;
import p223f.AbstractC4224i;

/* renamed from: n.d */
/* loaded from: classes.dex */
public class C5631d {

    /* renamed from: a */
    public final View f20414a;

    /* renamed from: d */
    public C5628b0 f20417d;

    /* renamed from: e */
    public C5628b0 f20418e;

    /* renamed from: f */
    public C5628b0 f20419f;

    /* renamed from: c */
    public int f20416c = -1;

    /* renamed from: b */
    public final C5633e f20415b = C5633e.m23655b();

    public C5631d(View view) {
        this.f20414a = view;
    }

    /* renamed from: a */
    public final boolean m23624a(Drawable drawable) {
        if (this.f20419f == null) {
            this.f20419f = new C5628b0();
        }
        C5628b0 c5628b0 = this.f20419f;
        c5628b0.m23623a();
        ColorStateList m1749h = AbstractC0475B.m1749h(this.f20414a);
        if (m1749h != null) {
            c5628b0.f20409d = true;
            c5628b0.f20406a = m1749h;
        }
        PorterDuff.Mode m1750i = AbstractC0475B.m1750i(this.f20414a);
        if (m1750i != null) {
            c5628b0.f20408c = true;
            c5628b0.f20407b = m1750i;
        }
        if (!c5628b0.f20409d && !c5628b0.f20408c) {
            return false;
        }
        C5633e.m23658g(drawable, c5628b0, this.f20414a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m23625b() {
        Drawable background = this.f20414a.getBackground();
        if (background != null) {
            if (m23634k() && m23624a(background)) {
                return;
            }
            C5628b0 c5628b0 = this.f20418e;
            if (c5628b0 != null) {
                C5633e.m23658g(background, c5628b0, this.f20414a.getDrawableState());
                return;
            }
            C5628b0 c5628b02 = this.f20417d;
            if (c5628b02 != null) {
                C5633e.m23658g(background, c5628b02, this.f20414a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m23626c() {
        C5628b0 c5628b0 = this.f20418e;
        if (c5628b0 != null) {
            return c5628b0.f20406a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m23627d() {
        C5628b0 c5628b0 = this.f20418e;
        if (c5628b0 != null) {
            return c5628b0.f20407b;
        }
        return null;
    }

    /* renamed from: e */
    public void m23628e(AttributeSet attributeSet, int i7) {
        C5632d0 m23637r = C5632d0.m23637r(this.f20414a.getContext(), attributeSet, AbstractC4224i.f14329c3, i7, 0);
        try {
            if (m23637r.m23652o(AbstractC4224i.f14334d3)) {
                this.f20416c = m23637r.m23649l(AbstractC4224i.f14334d3, -1);
                ColorStateList m23660e = this.f20415b.m23660e(this.f20414a.getContext(), this.f20416c);
                if (m23660e != null) {
                    m23631h(m23660e);
                }
            }
            if (m23637r.m23652o(AbstractC4224i.f14339e3)) {
                AbstractC0475B.m1732J(this.f20414a, m23637r.m23640c(AbstractC4224i.f14339e3));
            }
            if (m23637r.m23652o(AbstractC4224i.f14344f3)) {
                AbstractC0475B.m1733K(this.f20414a, AbstractC5608I.m23499d(m23637r.m23646i(AbstractC4224i.f14344f3, -1), null));
            }
            m23637r.m23653s();
        } catch (Throwable th) {
            m23637r.m23653s();
            throw th;
        }
    }

    /* renamed from: f */
    public void m23629f(Drawable drawable) {
        this.f20416c = -1;
        m23631h(null);
        m23625b();
    }

    /* renamed from: g */
    public void m23630g(int i7) {
        this.f20416c = i7;
        C5633e c5633e = this.f20415b;
        m23631h(c5633e != null ? c5633e.m23660e(this.f20414a.getContext(), i7) : null);
        m23625b();
    }

    /* renamed from: h */
    public void m23631h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f20417d == null) {
                this.f20417d = new C5628b0();
            }
            C5628b0 c5628b0 = this.f20417d;
            c5628b0.f20406a = colorStateList;
            c5628b0.f20409d = true;
        } else {
            this.f20417d = null;
        }
        m23625b();
    }

    /* renamed from: i */
    public void m23632i(ColorStateList colorStateList) {
        if (this.f20418e == null) {
            this.f20418e = new C5628b0();
        }
        C5628b0 c5628b0 = this.f20418e;
        c5628b0.f20406a = colorStateList;
        c5628b0.f20409d = true;
        m23625b();
    }

    /* renamed from: j */
    public void m23633j(PorterDuff.Mode mode) {
        if (this.f20418e == null) {
            this.f20418e = new C5628b0();
        }
        C5628b0 c5628b0 = this.f20418e;
        c5628b0.f20407b = mode;
        c5628b0.f20408c = true;
        m23625b();
    }

    /* renamed from: k */
    public final boolean m23634k() {
        return this.f20417d != null;
    }
}

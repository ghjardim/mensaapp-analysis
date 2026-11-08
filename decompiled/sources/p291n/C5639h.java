package p291n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p070K.AbstractC0815d;
import p223f.AbstractC4224i;
import p239h.AbstractC4474a;

/* renamed from: n.h */
/* loaded from: classes.dex */
public class C5639h {

    /* renamed from: a */
    public final ImageView f20447a;

    /* renamed from: b */
    public C5628b0 f20448b;

    /* renamed from: c */
    public C5628b0 f20449c;

    /* renamed from: d */
    public C5628b0 f20450d;

    public C5639h(ImageView imageView) {
        this.f20447a = imageView;
    }

    /* renamed from: a */
    public final boolean m23679a(Drawable drawable) {
        if (this.f20450d == null) {
            this.f20450d = new C5628b0();
        }
        C5628b0 c5628b0 = this.f20450d;
        c5628b0.m23623a();
        ColorStateList m3394a = AbstractC0815d.m3394a(this.f20447a);
        if (m3394a != null) {
            c5628b0.f20409d = true;
            c5628b0.f20406a = m3394a;
        }
        PorterDuff.Mode m3395b = AbstractC0815d.m3395b(this.f20447a);
        if (m3395b != null) {
            c5628b0.f20408c = true;
            c5628b0.f20407b = m3395b;
        }
        if (!c5628b0.f20409d && !c5628b0.f20408c) {
            return false;
        }
        C5633e.m23658g(drawable, c5628b0, this.f20447a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m23680b() {
        Drawable drawable = this.f20447a.getDrawable();
        if (drawable != null) {
            AbstractC5608I.m23497b(drawable);
        }
        if (drawable != null) {
            if (m23688j() && m23679a(drawable)) {
                return;
            }
            C5628b0 c5628b0 = this.f20449c;
            if (c5628b0 != null) {
                C5633e.m23658g(drawable, c5628b0, this.f20447a.getDrawableState());
                return;
            }
            C5628b0 c5628b02 = this.f20448b;
            if (c5628b02 != null) {
                C5633e.m23658g(drawable, c5628b02, this.f20447a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m23681c() {
        C5628b0 c5628b0 = this.f20449c;
        if (c5628b0 != null) {
            return c5628b0.f20406a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m23682d() {
        C5628b0 c5628b0 = this.f20449c;
        if (c5628b0 != null) {
            return c5628b0.f20407b;
        }
        return null;
    }

    /* renamed from: e */
    public boolean m23683e() {
        return !(this.f20447a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void m23684f(AttributeSet attributeSet, int i7) {
        int m23649l;
        C5632d0 m23637r = C5632d0.m23637r(this.f20447a.getContext(), attributeSet, AbstractC4224i.f14239H, i7, 0);
        try {
            Drawable drawable = this.f20447a.getDrawable();
            if (drawable == null && (m23649l = m23637r.m23649l(AbstractC4224i.f14243I, -1)) != -1 && (drawable = AbstractC4474a.m19044b(this.f20447a.getContext(), m23649l)) != null) {
                this.f20447a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC5608I.m23497b(drawable);
            }
            if (m23637r.m23652o(AbstractC4224i.f14247J)) {
                AbstractC0815d.m3396c(this.f20447a, m23637r.m23640c(AbstractC4224i.f14247J));
            }
            if (m23637r.m23652o(AbstractC4224i.f14251K)) {
                AbstractC0815d.m3397d(this.f20447a, AbstractC5608I.m23499d(m23637r.m23646i(AbstractC4224i.f14251K, -1), null));
            }
            m23637r.m23653s();
        } catch (Throwable th) {
            m23637r.m23653s();
            throw th;
        }
    }

    /* renamed from: g */
    public void m23685g(int i7) {
        if (i7 != 0) {
            Drawable m19044b = AbstractC4474a.m19044b(this.f20447a.getContext(), i7);
            if (m19044b != null) {
                AbstractC5608I.m23497b(m19044b);
            }
            this.f20447a.setImageDrawable(m19044b);
        } else {
            this.f20447a.setImageDrawable(null);
        }
        m23680b();
    }

    /* renamed from: h */
    public void m23686h(ColorStateList colorStateList) {
        if (this.f20449c == null) {
            this.f20449c = new C5628b0();
        }
        C5628b0 c5628b0 = this.f20449c;
        c5628b0.f20406a = colorStateList;
        c5628b0.f20409d = true;
        m23680b();
    }

    /* renamed from: i */
    public void m23687i(PorterDuff.Mode mode) {
        if (this.f20449c == null) {
            this.f20449c = new C5628b0();
        }
        C5628b0 c5628b0 = this.f20449c;
        c5628b0.f20407b = mode;
        c5628b0.f20408c = true;
        m23680b();
    }

    /* renamed from: j */
    public final boolean m23688j() {
        return this.f20448b != null;
    }
}

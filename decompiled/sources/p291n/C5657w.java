package p291n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p070K.AbstractC0818g;
import p070K.InterfaceC0813b;
import p223f.AbstractC4224i;
import p379y.AbstractC7043h;

/* renamed from: n.w */
/* loaded from: classes.dex */
public class C5657w {

    /* renamed from: a */
    public final TextView f20467a;

    /* renamed from: b */
    public C5628b0 f20468b;

    /* renamed from: c */
    public C5628b0 f20469c;

    /* renamed from: d */
    public C5628b0 f20470d;

    /* renamed from: e */
    public C5628b0 f20471e;

    /* renamed from: f */
    public C5628b0 f20472f;

    /* renamed from: g */
    public C5628b0 f20473g;

    /* renamed from: h */
    public C5628b0 f20474h;

    /* renamed from: i */
    public final C5600A f20475i;

    /* renamed from: j */
    public int f20476j = 0;

    /* renamed from: k */
    public int f20477k = -1;

    /* renamed from: l */
    public Typeface f20478l;

    /* renamed from: m */
    public boolean f20479m;

    public C5657w(TextView textView) {
        this.f20467a = textView;
        this.f20475i = new C5600A(textView);
    }

    /* renamed from: d */
    public static C5628b0 m23714d(Context context, C5633e c5633e, int i7) {
        ColorStateList m23660e = c5633e.m23660e(context, i7);
        if (m23660e == null) {
            return null;
        }
        C5628b0 c5628b0 = new C5628b0();
        c5628b0.f20409d = true;
        c5628b0.f20406a = m23660e;
        return c5628b0;
    }

    /* renamed from: A */
    public final void m23715A(int i7, float f7) {
        this.f20475i.m23484u(i7, f7);
    }

    /* renamed from: B */
    public void m23716B(Typeface typeface) {
        if (this.f20479m) {
            this.f20467a.setTypeface(typeface);
            this.f20478l = typeface;
        }
    }

    /* renamed from: C */
    public final void m23717C(Context context, C5632d0 c5632d0) {
        String m23650m;
        Typeface create;
        Typeface create2;
        this.f20476j = c5632d0.m23646i(AbstractC4224i.f14388p2, this.f20476j);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int m23646i = c5632d0.m23646i(AbstractC4224i.f14400s2, -1);
            this.f20477k = m23646i;
            if (m23646i != -1) {
                this.f20476j &= 2;
            }
        }
        if (!c5632d0.m23652o(AbstractC4224i.f14396r2) && !c5632d0.m23652o(AbstractC4224i.f14404t2)) {
            if (c5632d0.m23652o(AbstractC4224i.f14384o2)) {
                this.f20479m = false;
                int m23646i2 = c5632d0.m23646i(AbstractC4224i.f14384o2, 1);
                if (m23646i2 == 1) {
                    this.f20478l = Typeface.SANS_SERIF;
                    return;
                } else if (m23646i2 == 2) {
                    this.f20478l = Typeface.SERIF;
                    return;
                } else {
                    if (m23646i2 != 3) {
                        return;
                    }
                    this.f20478l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f20478l = null;
        int i8 = c5632d0.m23652o(AbstractC4224i.f14404t2) ? AbstractC4224i.f14404t2 : AbstractC4224i.f14396r2;
        int i9 = this.f20477k;
        int i10 = this.f20476j;
        if (!context.isRestricted()) {
            try {
                Typeface m23645h = c5632d0.m23645h(i8, this.f20476j, new a(this, i9, i10));
                if (m23645h != null) {
                    if (i7 < 28 || this.f20477k == -1) {
                        this.f20478l = m23645h;
                    } else {
                        create2 = Typeface.create(Typeface.create(m23645h, 0), this.f20477k, (this.f20476j & 2) != 0);
                        this.f20478l = create2;
                    }
                }
                this.f20479m = this.f20478l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f20478l != null || (m23650m = c5632d0.m23650m(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f20477k == -1) {
            this.f20478l = Typeface.create(m23650m, this.f20476j);
        } else {
            create = Typeface.create(Typeface.create(m23650m, 0), this.f20477k, (this.f20476j & 2) != 0);
            this.f20478l = create;
        }
    }

    /* renamed from: a */
    public final void m23718a(Drawable drawable, C5628b0 c5628b0) {
        if (drawable == null || c5628b0 == null) {
            return;
        }
        C5633e.m23658g(drawable, c5628b0, this.f20467a.getDrawableState());
    }

    /* renamed from: b */
    public void m23719b() {
        if (this.f20468b != null || this.f20469c != null || this.f20470d != null || this.f20471e != null) {
            Drawable[] compoundDrawables = this.f20467a.getCompoundDrawables();
            m23718a(compoundDrawables[0], this.f20468b);
            m23718a(compoundDrawables[1], this.f20469c);
            m23718a(compoundDrawables[2], this.f20470d);
            m23718a(compoundDrawables[3], this.f20471e);
        }
        if (this.f20472f == null && this.f20473g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f20467a.getCompoundDrawablesRelative();
        m23718a(compoundDrawablesRelative[0], this.f20472f);
        m23718a(compoundDrawablesRelative[2], this.f20473g);
    }

    /* renamed from: c */
    public void m23720c() {
        this.f20475i.m23466a();
    }

    /* renamed from: e */
    public int m23721e() {
        return this.f20475i.m23472g();
    }

    /* renamed from: f */
    public int m23722f() {
        return this.f20475i.m23473h();
    }

    /* renamed from: g */
    public int m23723g() {
        return this.f20475i.m23474i();
    }

    /* renamed from: h */
    public int[] m23724h() {
        return this.f20475i.m23475j();
    }

    /* renamed from: i */
    public int m23725i() {
        return this.f20475i.m23476k();
    }

    /* renamed from: j */
    public ColorStateList m23726j() {
        C5628b0 c5628b0 = this.f20474h;
        if (c5628b0 != null) {
            return c5628b0.f20406a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m23727k() {
        C5628b0 c5628b0 = this.f20474h;
        if (c5628b0 != null) {
            return c5628b0.f20407b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m23728l() {
        return this.f20475i.m23478o();
    }

    /* renamed from: m */
    public void m23729m(AttributeSet attributeSet, int i7) {
        boolean z6;
        boolean z7;
        String str;
        String str2;
        int autoSizeStepGranularity;
        LocaleList forLanguageTags;
        Context context = this.f20467a.getContext();
        C5633e m23655b = C5633e.m23655b();
        C5632d0 m23637r = C5632d0.m23637r(context, attributeSet, AbstractC4224i.f14259M, i7, 0);
        int m23649l = m23637r.m23649l(AbstractC4224i.f14263N, -1);
        if (m23637r.m23652o(AbstractC4224i.f14275Q)) {
            this.f20468b = m23714d(context, m23655b, m23637r.m23649l(AbstractC4224i.f14275Q, 0));
        }
        if (m23637r.m23652o(AbstractC4224i.f14267O)) {
            this.f20469c = m23714d(context, m23655b, m23637r.m23649l(AbstractC4224i.f14267O, 0));
        }
        if (m23637r.m23652o(AbstractC4224i.f14279R)) {
            this.f20470d = m23714d(context, m23655b, m23637r.m23649l(AbstractC4224i.f14279R, 0));
        }
        if (m23637r.m23652o(AbstractC4224i.f14271P)) {
            this.f20471e = m23714d(context, m23655b, m23637r.m23649l(AbstractC4224i.f14271P, 0));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (m23637r.m23652o(AbstractC4224i.f14283S)) {
            this.f20472f = m23714d(context, m23655b, m23637r.m23649l(AbstractC4224i.f14283S, 0));
        }
        if (m23637r.m23652o(AbstractC4224i.f14287T)) {
            this.f20473g = m23714d(context, m23655b, m23637r.m23649l(AbstractC4224i.f14287T, 0));
        }
        m23637r.m23653s();
        boolean z8 = this.f20467a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m23649l != -1) {
            C5632d0 m23635p = C5632d0.m23635p(context, m23649l, AbstractC4224i.f14376m2);
            if (z8 || !m23635p.m23652o(AbstractC4224i.f14412v2)) {
                z6 = false;
                z7 = false;
            } else {
                z6 = m23635p.m23638a(AbstractC4224i.f14412v2, false);
                z7 = true;
            }
            m23717C(context, m23635p);
            str2 = m23635p.m23652o(AbstractC4224i.f14416w2) ? m23635p.m23650m(AbstractC4224i.f14416w2) : null;
            str = (i8 < 26 || !m23635p.m23652o(AbstractC4224i.f14408u2)) ? null : m23635p.m23650m(AbstractC4224i.f14408u2);
            m23635p.m23653s();
        } else {
            z6 = false;
            z7 = false;
            str = null;
            str2 = null;
        }
        C5632d0 m23637r2 = C5632d0.m23637r(context, attributeSet, AbstractC4224i.f14376m2, i7, 0);
        if (!z8 && m23637r2.m23652o(AbstractC4224i.f14412v2)) {
            z6 = m23637r2.m23638a(AbstractC4224i.f14412v2, false);
            z7 = true;
        }
        if (m23637r2.m23652o(AbstractC4224i.f14416w2)) {
            str2 = m23637r2.m23650m(AbstractC4224i.f14416w2);
        }
        if (i8 >= 26 && m23637r2.m23652o(AbstractC4224i.f14408u2)) {
            str = m23637r2.m23650m(AbstractC4224i.f14408u2);
        }
        if (i8 >= 28 && m23637r2.m23652o(AbstractC4224i.f14380n2) && m23637r2.m23642e(AbstractC4224i.f14380n2, -1) == 0) {
            this.f20467a.setTextSize(0, 0.0f);
        }
        m23717C(context, m23637r2);
        m23637r2.m23653s();
        if (!z8 && z7) {
            m23734r(z6);
        }
        Typeface typeface = this.f20478l;
        if (typeface != null) {
            if (this.f20477k == -1) {
                this.f20467a.setTypeface(typeface, this.f20476j);
            } else {
                this.f20467a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f20467a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            if (i8 >= 24) {
                TextView textView = this.f20467a;
                forLanguageTags = LocaleList.forLanguageTags(str2);
                textView.setTextLocales(forLanguageTags);
            } else {
                this.f20467a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.f20475i.m23479p(attributeSet, i7);
        if (InterfaceC0813b.f2835g && this.f20475i.m23476k() != 0) {
            int[] m23475j = this.f20475i.m23475j();
            if (m23475j.length > 0) {
                autoSizeStepGranularity = this.f20467a.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    this.f20467a.setAutoSizeTextTypeUniformWithConfiguration(this.f20475i.m23473h(), this.f20475i.m23472g(), this.f20475i.m23474i(), 0);
                } else {
                    this.f20467a.setAutoSizeTextTypeUniformWithPresetSizes(m23475j, 0);
                }
            }
        }
        C5632d0 m23636q = C5632d0.m23636q(context, attributeSet, AbstractC4224i.f14291U);
        int m23649l2 = m23636q.m23649l(AbstractC4224i.f14326c0, -1);
        Drawable m23659c = m23649l2 != -1 ? m23655b.m23659c(context, m23649l2) : null;
        int m23649l3 = m23636q.m23649l(AbstractC4224i.f14351h0, -1);
        Drawable m23659c2 = m23649l3 != -1 ? m23655b.m23659c(context, m23649l3) : null;
        int m23649l4 = m23636q.m23649l(AbstractC4224i.f14331d0, -1);
        Drawable m23659c3 = m23649l4 != -1 ? m23655b.m23659c(context, m23649l4) : null;
        int m23649l5 = m23636q.m23649l(AbstractC4224i.f14316a0, -1);
        Drawable m23659c4 = m23649l5 != -1 ? m23655b.m23659c(context, m23649l5) : null;
        int m23649l6 = m23636q.m23649l(AbstractC4224i.f14336e0, -1);
        Drawable m23659c5 = m23649l6 != -1 ? m23655b.m23659c(context, m23649l6) : null;
        int m23649l7 = m23636q.m23649l(AbstractC4224i.f14321b0, -1);
        m23740x(m23659c, m23659c2, m23659c3, m23659c4, m23659c5, m23649l7 != -1 ? m23655b.m23659c(context, m23649l7) : null);
        if (m23636q.m23652o(AbstractC4224i.f14341f0)) {
            AbstractC0818g.m3412f(this.f20467a, m23636q.m23640c(AbstractC4224i.f14341f0));
        }
        if (m23636q.m23652o(AbstractC4224i.f14346g0)) {
            AbstractC0818g.m3413g(this.f20467a, AbstractC5608I.m23499d(m23636q.m23646i(AbstractC4224i.f14346g0, -1), null));
        }
        int m23642e = m23636q.m23642e(AbstractC4224i.f14356i0, -1);
        int m23642e2 = m23636q.m23642e(AbstractC4224i.f14361j0, -1);
        int m23642e3 = m23636q.m23642e(AbstractC4224i.f14366k0, -1);
        m23636q.m23653s();
        if (m23642e != -1) {
            AbstractC0818g.m3414h(this.f20467a, m23642e);
        }
        if (m23642e2 != -1) {
            AbstractC0818g.m3415i(this.f20467a, m23642e2);
        }
        if (m23642e3 != -1) {
            AbstractC0818g.m3416j(this.f20467a, m23642e3);
        }
    }

    /* renamed from: n */
    public void m23730n(boolean z6, int i7, int i8, int i9, int i10) {
        if (InterfaceC0813b.f2835g) {
            return;
        }
        m23720c();
    }

    /* renamed from: o */
    public void m23731o() {
        m23719b();
    }

    /* renamed from: p */
    public void m23732p(Context context, int i7) {
        String m23650m;
        C5632d0 m23635p = C5632d0.m23635p(context, i7, AbstractC4224i.f14376m2);
        if (m23635p.m23652o(AbstractC4224i.f14412v2)) {
            m23734r(m23635p.m23638a(AbstractC4224i.f14412v2, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (m23635p.m23652o(AbstractC4224i.f14380n2) && m23635p.m23642e(AbstractC4224i.f14380n2, -1) == 0) {
            this.f20467a.setTextSize(0, 0.0f);
        }
        m23717C(context, m23635p);
        if (i8 >= 26 && m23635p.m23652o(AbstractC4224i.f14408u2) && (m23650m = m23635p.m23650m(AbstractC4224i.f14408u2)) != null) {
            this.f20467a.setFontVariationSettings(m23650m);
        }
        m23635p.m23653s();
        Typeface typeface = this.f20478l;
        if (typeface != null) {
            this.f20467a.setTypeface(typeface, this.f20476j);
        }
    }

    /* renamed from: q */
    public void m23733q(Runnable runnable) {
        this.f20467a.post(runnable);
    }

    /* renamed from: r */
    public void m23734r(boolean z6) {
        this.f20467a.setAllCaps(z6);
    }

    /* renamed from: s */
    public void m23735s(int i7, int i8, int i9, int i10) {
        this.f20475i.m23480q(i7, i8, i9, i10);
    }

    /* renamed from: t */
    public void m23736t(int[] iArr, int i7) {
        this.f20475i.m23481r(iArr, i7);
    }

    /* renamed from: u */
    public void m23737u(int i7) {
        this.f20475i.m23482s(i7);
    }

    /* renamed from: v */
    public void m23738v(ColorStateList colorStateList) {
        if (this.f20474h == null) {
            this.f20474h = new C5628b0();
        }
        C5628b0 c5628b0 = this.f20474h;
        c5628b0.f20406a = colorStateList;
        c5628b0.f20409d = colorStateList != null;
        m23741y();
    }

    /* renamed from: w */
    public void m23739w(PorterDuff.Mode mode) {
        if (this.f20474h == null) {
            this.f20474h = new C5628b0();
        }
        C5628b0 c5628b0 = this.f20474h;
        c5628b0.f20407b = mode;
        c5628b0.f20408c = mode != null;
        m23741y();
    }

    /* renamed from: x */
    public final void m23740x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f20467a.getCompoundDrawablesRelative();
            TextView textView = this.f20467a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f20467a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f20467a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f20467a.getCompoundDrawables();
        TextView textView3 = this.f20467a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: y */
    public final void m23741y() {
        C5628b0 c5628b0 = this.f20474h;
        this.f20468b = c5628b0;
        this.f20469c = c5628b0;
        this.f20470d = c5628b0;
        this.f20471e = c5628b0;
        this.f20472f = c5628b0;
        this.f20473g = c5628b0;
    }

    /* renamed from: z */
    public void m23742z(int i7, float f7) {
        if (InterfaceC0813b.f2835g || m23728l()) {
            return;
        }
        m23715A(i7, f7);
    }

    /* renamed from: n.w$a */
    public static class a extends AbstractC7043h.e {

        /* renamed from: a */
        public final WeakReference f20480a;

        /* renamed from: b */
        public final int f20481b;

        /* renamed from: c */
        public final int f20482c;

        /* renamed from: n.w$a$a, reason: collision with other inner class name */
        public class RunnableC7236a implements Runnable {

            /* renamed from: a */
            public final WeakReference f20483a;

            /* renamed from: b */
            public final Typeface f20484b;

            public RunnableC7236a(WeakReference weakReference, Typeface typeface) {
                this.f20483a = weakReference;
                this.f20484b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5657w c5657w = (C5657w) this.f20483a.get();
                if (c5657w == null) {
                    return;
                }
                c5657w.m23716B(this.f20484b);
            }
        }

        public a(C5657w c5657w, int i7, int i8) {
            this.f20480a = new WeakReference(c5657w);
            this.f20481b = i7;
            this.f20482c = i8;
        }

        @Override // p379y.AbstractC7043h.e
        /* renamed from: i */
        public void m29006g(Typeface typeface) {
            int i7;
            C5657w c5657w = (C5657w) this.f20480a.get();
            if (c5657w == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f20481b) != -1) {
                typeface = Typeface.create(typeface, i7, (this.f20482c & 2) != 0);
            }
            c5657w.m23733q(new RunnableC7236a(this.f20480a, typeface));
        }

        @Override // p379y.AbstractC7043h.e
        /* renamed from: h */
        public void m29005f(int i7) {
        }
    }
}

package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p223f.AbstractC4216a;
import p223f.AbstractC4219d;
import p223f.AbstractC4222g;
import p223f.AbstractC4224i;
import p239h.AbstractC4474a;
import p283m.C5550a;
import p291n.C5632d0;
import p291n.InterfaceC5602C;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C3238d implements InterfaceC5602C {

    /* renamed from: a */
    public Toolbar f10281a;

    /* renamed from: b */
    public int f10282b;

    /* renamed from: c */
    public View f10283c;

    /* renamed from: d */
    public Drawable f10284d;

    /* renamed from: e */
    public Drawable f10285e;

    /* renamed from: f */
    public Drawable f10286f;

    /* renamed from: g */
    public boolean f10287g;

    /* renamed from: h */
    public CharSequence f10288h;

    /* renamed from: i */
    public CharSequence f10289i;

    /* renamed from: j */
    public CharSequence f10290j;

    /* renamed from: k */
    public Window.Callback f10291k;

    /* renamed from: l */
    public boolean f10292l;

    /* renamed from: m */
    public int f10293m;

    /* renamed from: n */
    public int f10294n;

    /* renamed from: o */
    public Drawable f10295o;

    /* renamed from: androidx.appcompat.widget.d$a */
    public class a implements View.OnClickListener {

        /* renamed from: a */
        public final C5550a f10296a;

        public a() {
            this.f10296a = new C5550a(C3238d.this.f10281a.getContext(), 0, R.id.home, 0, 0, C3238d.this.f10288h);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3238d c3238d = C3238d.this;
            Window.Callback callback = c3238d.f10291k;
            if (callback == null || !c3238d.f10292l) {
                return;
            }
            callback.onMenuItemSelected(0, this.f10296a);
        }
    }

    public C3238d(Toolbar toolbar, boolean z6) {
        this(toolbar, z6, AbstractC4222g.f14198a, AbstractC4219d.f14144n);
    }

    @Override // p291n.InterfaceC5602C
    /* renamed from: a */
    public void mo11928a(CharSequence charSequence) {
        if (this.f10287g) {
            return;
        }
        m11942o(charSequence);
    }

    @Override // p291n.InterfaceC5602C
    /* renamed from: b */
    public void mo11929b(int i7) {
        m11936i(i7 != 0 ? AbstractC4474a.m19044b(m11932e(), i7) : null);
    }

    @Override // p291n.InterfaceC5602C
    /* renamed from: c */
    public void mo11930c(Window.Callback callback) {
        this.f10291k = callback;
    }

    /* renamed from: d */
    public final int m11931d() {
        if (this.f10281a.getNavigationIcon() == null) {
            return 11;
        }
        this.f10295o = this.f10281a.getNavigationIcon();
        return 15;
    }

    /* renamed from: e */
    public Context m11932e() {
        return this.f10281a.getContext();
    }

    /* renamed from: f */
    public void m11933f(View view) {
        View view2 = this.f10283c;
        if (view2 != null && (this.f10282b & 16) != 0) {
            this.f10281a.removeView(view2);
        }
        this.f10283c = view;
        if (view == null || (this.f10282b & 16) == 0) {
            return;
        }
        this.f10281a.addView(view);
    }

    /* renamed from: g */
    public void m11934g(int i7) {
        if (i7 == this.f10294n) {
            return;
        }
        this.f10294n = i7;
        if (TextUtils.isEmpty(this.f10281a.getNavigationContentDescription())) {
            m11937j(this.f10294n);
        }
    }

    @Override // p291n.InterfaceC5602C
    public CharSequence getTitle() {
        return this.f10281a.getTitle();
    }

    /* renamed from: h */
    public void m11935h(int i7) {
        View view;
        int i8 = this.f10282b ^ i7;
        this.f10282b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    m11943p();
                }
                m11944q();
            }
            if ((i8 & 3) != 0) {
                m11945r();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    this.f10281a.setTitle(this.f10288h);
                    this.f10281a.setSubtitle(this.f10289i);
                } else {
                    this.f10281a.setTitle((CharSequence) null);
                    this.f10281a.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.f10283c) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                this.f10281a.addView(view);
            } else {
                this.f10281a.removeView(view);
            }
        }
    }

    /* renamed from: i */
    public void m11936i(Drawable drawable) {
        this.f10285e = drawable;
        m11945r();
    }

    /* renamed from: j */
    public void m11937j(int i7) {
        m11938k(i7 == 0 ? null : m11932e().getString(i7));
    }

    /* renamed from: k */
    public void m11938k(CharSequence charSequence) {
        this.f10290j = charSequence;
        m11943p();
    }

    /* renamed from: l */
    public void m11939l(Drawable drawable) {
        this.f10286f = drawable;
        m11944q();
    }

    /* renamed from: m */
    public void m11940m(CharSequence charSequence) {
        this.f10289i = charSequence;
        if ((this.f10282b & 8) != 0) {
            this.f10281a.setSubtitle(charSequence);
        }
    }

    /* renamed from: n */
    public void m11941n(CharSequence charSequence) {
        this.f10287g = true;
        m11942o(charSequence);
    }

    /* renamed from: o */
    public final void m11942o(CharSequence charSequence) {
        this.f10288h = charSequence;
        if ((this.f10282b & 8) != 0) {
            this.f10281a.setTitle(charSequence);
        }
    }

    /* renamed from: p */
    public final void m11943p() {
        if ((this.f10282b & 4) != 0) {
            if (TextUtils.isEmpty(this.f10290j)) {
                this.f10281a.setNavigationContentDescription(this.f10294n);
            } else {
                this.f10281a.setNavigationContentDescription(this.f10290j);
            }
        }
    }

    /* renamed from: q */
    public final void m11944q() {
        if ((this.f10282b & 4) == 0) {
            this.f10281a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f10281a;
        Drawable drawable = this.f10286f;
        if (drawable == null) {
            drawable = this.f10295o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: r */
    public final void m11945r() {
        Drawable drawable;
        int i7 = this.f10282b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) != 0) {
            drawable = this.f10285e;
            if (drawable == null) {
                drawable = this.f10284d;
            }
        } else {
            drawable = this.f10284d;
        }
        this.f10281a.setLogo(drawable);
    }

    @Override // p291n.InterfaceC5602C
    public void setIcon(int i7) {
        setIcon(i7 != 0 ? AbstractC4474a.m19044b(m11932e(), i7) : null);
    }

    public C3238d(Toolbar toolbar, boolean z6, int i7, int i8) {
        Drawable drawable;
        this.f10293m = 0;
        this.f10294n = 0;
        this.f10281a = toolbar;
        this.f10288h = toolbar.getTitle();
        this.f10289i = toolbar.getSubtitle();
        this.f10287g = this.f10288h != null;
        this.f10286f = toolbar.getNavigationIcon();
        C5632d0 m23637r = C5632d0.m23637r(toolbar.getContext(), null, AbstractC4224i.f14315a, AbstractC4216a.f14077c, 0);
        this.f10295o = m23637r.m23643f(AbstractC4224i.f14360j);
        if (z6) {
            CharSequence m23651n = m23637r.m23651n(AbstractC4224i.f14385p);
            if (!TextUtils.isEmpty(m23651n)) {
                m11941n(m23651n);
            }
            CharSequence m23651n2 = m23637r.m23651n(AbstractC4224i.f14377n);
            if (!TextUtils.isEmpty(m23651n2)) {
                m11940m(m23651n2);
            }
            Drawable m23643f = m23637r.m23643f(AbstractC4224i.f14369l);
            if (m23643f != null) {
                m11936i(m23643f);
            }
            Drawable m23643f2 = m23637r.m23643f(AbstractC4224i.f14365k);
            if (m23643f2 != null) {
                setIcon(m23643f2);
            }
            if (this.f10286f == null && (drawable = this.f10295o) != null) {
                m11939l(drawable);
            }
            m11935h(m23637r.m23646i(AbstractC4224i.f14350h, 0));
            int m23649l = m23637r.m23649l(AbstractC4224i.f14345g, 0);
            if (m23649l != 0) {
                m11933f(LayoutInflater.from(this.f10281a.getContext()).inflate(m23649l, (ViewGroup) this.f10281a, false));
                m11935h(this.f10282b | 16);
            }
            int m23648k = m23637r.m23648k(AbstractC4224i.f14355i, 0);
            if (m23648k > 0) {
                ViewGroup.LayoutParams layoutParams = this.f10281a.getLayoutParams();
                layoutParams.height = m23648k;
                this.f10281a.setLayoutParams(layoutParams);
            }
            int m23641d = m23637r.m23641d(AbstractC4224i.f14340f, -1);
            int m23641d2 = m23637r.m23641d(AbstractC4224i.f14335e, -1);
            if (m23641d >= 0 || m23641d2 >= 0) {
                this.f10281a.m11854C(Math.max(m23641d, 0), Math.max(m23641d2, 0));
            }
            int m23649l2 = m23637r.m23649l(AbstractC4224i.f14389q, 0);
            if (m23649l2 != 0) {
                Toolbar toolbar2 = this.f10281a;
                toolbar2.m11856E(toolbar2.getContext(), m23649l2);
            }
            int m23649l3 = m23637r.m23649l(AbstractC4224i.f14381o, 0);
            if (m23649l3 != 0) {
                Toolbar toolbar3 = this.f10281a;
                toolbar3.m11855D(toolbar3.getContext(), m23649l3);
            }
            int m23649l4 = m23637r.m23649l(AbstractC4224i.f14373m, 0);
            if (m23649l4 != 0) {
                this.f10281a.setPopupTheme(m23649l4);
            }
        } else {
            this.f10282b = m11931d();
        }
        m23637r.m23653s();
        m11934g(i7);
        this.f10290j = this.f10281a.getNavigationContentDescription();
        this.f10281a.setNavigationOnClickListener(new a());
    }

    @Override // p291n.InterfaceC5602C
    public void setIcon(Drawable drawable) {
        this.f10284d = drawable;
        m11945r();
    }
}

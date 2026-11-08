package p291n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000A.AbstractC0000a;
import p037F1.C0324b;
import p037F1.C0329g;
import p247i.C4499a;
import p255j.AbstractC5316a;
import p334s.C6308a;
import p334s.C6315h;
import p334s.C6317j;
import p334s.C6319l;
import p372x.AbstractC6935a;

/* renamed from: n.U */
/* loaded from: classes.dex */
public final class C5619U {

    /* renamed from: i */
    public static C5619U f20344i;

    /* renamed from: a */
    public WeakHashMap f20346a;

    /* renamed from: b */
    public C6308a f20347b;

    /* renamed from: c */
    public C6319l f20348c;

    /* renamed from: d */
    public final WeakHashMap f20349d = new WeakHashMap(0);

    /* renamed from: e */
    public TypedValue f20350e;

    /* renamed from: f */
    public boolean f20351f;

    /* renamed from: g */
    public e f20352g;

    /* renamed from: h */
    public static final PorterDuff.Mode f20343h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final c f20345j = new c(6);

    /* renamed from: n.U$a */
    public static class a implements d {
        @Override // p291n.C5619U.d
        /* renamed from: a */
        public Drawable mo23578a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C4499a.m19119l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e7);
                return null;
            }
        }
    }

    /* renamed from: n.U$b */
    public static class b implements d {
        @Override // p291n.C5619U.d
        /* renamed from: a */
        public Drawable mo23578a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0324b.m1270a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e7);
                return null;
            }
        }
    }

    /* renamed from: n.U$c */
    public static class c extends C6317j {
        public c(int i7) {
            super(i7);
        }

        /* renamed from: b */
        public static int m23579b(int i7, PorterDuff.Mode mode) {
            return ((i7 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: c */
        public PorterDuffColorFilter m23580c(int i7, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(m23579b(i7, mode)));
        }

        /* renamed from: d */
        public PorterDuffColorFilter m23581d(int i7, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(m23579b(i7, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: n.U$d */
    public interface d {
        /* renamed from: a */
        Drawable mo23578a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: n.U$e */
    public interface e {
        /* renamed from: a */
        Drawable mo23582a(C5619U c5619u, Context context, int i7);

        /* renamed from: b */
        boolean mo23583b(Context context, int i7, Drawable drawable);

        /* renamed from: c */
        PorterDuff.Mode mo23584c(int i7);

        /* renamed from: d */
        ColorStateList mo23585d(Context context, int i7);

        /* renamed from: e */
        boolean mo23586e(Context context, int i7, Drawable drawable);
    }

    /* renamed from: n.U$f */
    public static class f implements d {
        @Override // p291n.C5619U.d
        /* renamed from: a */
        public Drawable mo23578a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0329g.m1297c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e7);
                return null;
            }
        }
    }

    /* renamed from: e */
    public static long m23555e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m23556g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m23558l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C5619U m23557h() {
        C5619U c5619u;
        synchronized (C5619U.class) {
            try {
                if (f20344i == null) {
                    C5619U c5619u2 = new C5619U();
                    f20344i = c5619u2;
                    m23559p(c5619u2);
                }
                c5619u = f20344i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5619u;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m23558l(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter m23580c;
        synchronized (C5619U.class) {
            c cVar = f20345j;
            m23580c = cVar.m23580c(i7, mode);
            if (m23580c == null) {
                m23580c = new PorterDuffColorFilter(i7, mode);
                cVar.m23581d(i7, mode, m23580c);
            }
        }
        return m23580c;
    }

    /* renamed from: p */
    public static void m23559p(C5619U c5619u) {
        if (Build.VERSION.SDK_INT < 24) {
            c5619u.m23562a("vector", new f());
            c5619u.m23562a("animated-vector", new b());
            c5619u.m23562a("animated-selector", new a());
        }
    }

    /* renamed from: q */
    public static boolean m23560q(Drawable drawable) {
        return (drawable instanceof C0329g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: v */
    public static void m23561v(Drawable drawable, C5628b0 c5628b0, int[] iArr) {
        if (AbstractC5608I.m23496a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z6 = c5628b0.f20409d;
        if (z6 || c5628b0.f20408c) {
            drawable.setColorFilter(m23556g(z6 ? c5628b0.f20406a : null, c5628b0.f20408c ? c5628b0.f20407b : f20343h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void m23562a(String str, d dVar) {
        if (this.f20347b == null) {
            this.f20347b = new C6308a();
        }
        this.f20347b.put(str, dVar);
    }

    /* renamed from: b */
    public final synchronized boolean m23563b(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C6315h c6315h = (C6315h) this.f20349d.get(context);
            if (c6315h == null) {
                c6315h = new C6315h();
                this.f20349d.put(context, c6315h);
            }
            c6315h.m26445j(j7, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final void m23564c(Context context, int i7, ColorStateList colorStateList) {
        if (this.f20346a == null) {
            this.f20346a = new WeakHashMap();
        }
        C6319l c6319l = (C6319l) this.f20346a.get(context);
        if (c6319l == null) {
            c6319l = new C6319l();
            this.f20346a.put(context, c6319l);
        }
        c6319l.m26460a(i7, colorStateList);
    }

    /* renamed from: d */
    public final void m23565d(Context context) {
        if (this.f20351f) {
            return;
        }
        this.f20351f = true;
        Drawable m23568j = m23568j(context, AbstractC5316a.f18760a);
        if (m23568j == null || !m23560q(m23568j)) {
            this.f20351f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: f */
    public final Drawable m23566f(Context context, int i7) {
        if (this.f20350e == null) {
            this.f20350e = new TypedValue();
        }
        TypedValue typedValue = this.f20350e;
        context.getResources().getValue(i7, typedValue, true);
        long m23555e = m23555e(typedValue);
        Drawable m23567i = m23567i(context, m23555e);
        if (m23567i != null) {
            return m23567i;
        }
        e eVar = this.f20352g;
        Drawable mo23582a = eVar == null ? null : eVar.mo23582a(this, context, i7);
        if (mo23582a != null) {
            mo23582a.setChangingConfigurations(typedValue.changingConfigurations);
            m23563b(context, m23555e, mo23582a);
        }
        return mo23582a;
    }

    /* renamed from: i */
    public final synchronized Drawable m23567i(Context context, long j7) {
        C6315h c6315h = (C6315h) this.f20349d.get(context);
        if (c6315h == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c6315h.m26441e(j7);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c6315h.m26440d(j7);
        }
        return null;
    }

    /* renamed from: j */
    public synchronized Drawable m23568j(Context context, int i7) {
        return m23569k(context, i7, false);
    }

    /* renamed from: k */
    public synchronized Drawable m23569k(Context context, int i7, boolean z6) {
        Drawable m23573r;
        try {
            m23565d(context);
            m23573r = m23573r(context, i7);
            if (m23573r == null) {
                m23573r = m23566f(context, i7);
            }
            if (m23573r == null) {
                m23573r = AbstractC6935a.getDrawable(context, i7);
            }
            if (m23573r != null) {
                m23573r = m23576u(context, i7, z6, m23573r);
            }
            if (m23573r != null) {
                AbstractC5608I.m23497b(m23573r);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m23573r;
    }

    /* renamed from: m */
    public synchronized ColorStateList m23570m(Context context, int i7) {
        ColorStateList m23571n;
        m23571n = m23571n(context, i7);
        if (m23571n == null) {
            e eVar = this.f20352g;
            m23571n = eVar == null ? null : eVar.mo23585d(context, i7);
            if (m23571n != null) {
                m23564c(context, i7, m23571n);
            }
        }
        return m23571n;
    }

    /* renamed from: n */
    public final ColorStateList m23571n(Context context, int i7) {
        C6319l c6319l;
        WeakHashMap weakHashMap = this.f20346a;
        if (weakHashMap == null || (c6319l = (C6319l) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c6319l.m26463d(i7);
    }

    /* renamed from: o */
    public PorterDuff.Mode m23572o(int i7) {
        e eVar = this.f20352g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo23584c(i7);
    }

    /* renamed from: r */
    public final Drawable m23573r(Context context, int i7) {
        int next;
        C6308a c6308a = this.f20347b;
        if (c6308a == null || c6308a.isEmpty()) {
            return null;
        }
        C6319l c6319l = this.f20348c;
        if (c6319l != null) {
            String str = (String) c6319l.m26463d(i7);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f20347b.get(str) == null)) {
                return null;
            }
        } else {
            this.f20348c = new C6319l();
        }
        if (this.f20350e == null) {
            this.f20350e = new TypedValue();
        }
        TypedValue typedValue = this.f20350e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long m23555e = m23555e(typedValue);
        Drawable m23567i = m23567i(context, m23555e);
        if (m23567i != null) {
            return m23567i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f20348c.m26460a(i7, name);
                d dVar = (d) this.f20347b.get(name);
                if (dVar != null) {
                    m23567i = dVar.mo23578a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m23567i != null) {
                    m23567i.setChangingConfigurations(typedValue.changingConfigurations);
                    m23563b(context, m23555e, m23567i);
                }
            } catch (Exception e7) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
            }
        }
        if (m23567i == null) {
            this.f20348c.m26460a(i7, "appcompat_skip_skip");
        }
        return m23567i;
    }

    /* renamed from: s */
    public synchronized Drawable m23574s(Context context, C5642i0 c5642i0, int i7) {
        try {
            Drawable m23573r = m23573r(context, i7);
            if (m23573r == null) {
                m23573r = c5642i0.m23696c(i7);
            }
            if (m23573r == null) {
                return null;
            }
            return m23576u(context, i7, false, m23573r);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: t */
    public synchronized void m23575t(e eVar) {
        this.f20352g = eVar;
    }

    /* renamed from: u */
    public final Drawable m23576u(Context context, int i7, boolean z6, Drawable drawable) {
        ColorStateList m23570m = m23570m(context, i7);
        if (m23570m == null) {
            e eVar = this.f20352g;
            if ((eVar == null || !eVar.mo23586e(context, i7, drawable)) && !m23577w(context, i7, drawable) && z6) {
                return null;
            }
            return drawable;
        }
        if (AbstractC5608I.m23496a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable m15p = AbstractC0000a.m15p(drawable);
        AbstractC0000a.m12m(m15p, m23570m);
        PorterDuff.Mode m23572o = m23572o(i7);
        if (m23572o == null) {
            return m15p;
        }
        AbstractC0000a.m13n(m15p, m23572o);
        return m15p;
    }

    /* renamed from: w */
    public boolean m23577w(Context context, int i7, Drawable drawable) {
        e eVar = this.f20352g;
        return eVar != null && eVar.mo23583b(context, i7, drawable);
    }
}

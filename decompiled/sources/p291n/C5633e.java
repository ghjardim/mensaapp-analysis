package p291n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p223f.AbstractC4216a;
import p223f.AbstractC4217b;
import p223f.AbstractC4219d;
import p239h.AbstractC4474a;
import p291n.C5619U;
import p386z.AbstractC7086a;

/* renamed from: n.e */
/* loaded from: classes.dex */
public final class C5633e {

    /* renamed from: b */
    public static final PorterDuff.Mode f20423b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C5633e f20424c;

    /* renamed from: a */
    public C5619U f20425a;

    /* renamed from: n.e$a */
    public static class a implements C5619U.e {

        /* renamed from: a */
        public final int[] f20426a = {AbstractC4219d.f14129S, AbstractC4219d.f14127Q, AbstractC4219d.f14131a};

        /* renamed from: b */
        public final int[] f20427b = {AbstractC4219d.f14145o, AbstractC4219d.f14112B, AbstractC4219d.f14150t, AbstractC4219d.f14146p, AbstractC4219d.f14147q, AbstractC4219d.f14149s, AbstractC4219d.f14148r};

        /* renamed from: c */
        public final int[] f20428c = {AbstractC4219d.f14126P, AbstractC4219d.f14128R, AbstractC4219d.f14141k, AbstractC4219d.f14119I, AbstractC4219d.f14120J, AbstractC4219d.f14122L, AbstractC4219d.f14124N, AbstractC4219d.f14121K, AbstractC4219d.f14123M, AbstractC4219d.f14125O};

        /* renamed from: d */
        public final int[] f20429d = {AbstractC4219d.f14153w, AbstractC4219d.f14139i, AbstractC4219d.f14152v};

        /* renamed from: e */
        public final int[] f20430e = {AbstractC4219d.f14118H, AbstractC4219d.f14130T};

        /* renamed from: f */
        public final int[] f20431f = {AbstractC4219d.f14133c, AbstractC4219d.f14137g, AbstractC4219d.f14134d, AbstractC4219d.f14138h};

        @Override // p291n.C5619U.e
        /* renamed from: a */
        public Drawable mo23582a(C5619U c5619u, Context context, int i7) {
            if (i7 == AbstractC4219d.f14140j) {
                return new LayerDrawable(new Drawable[]{c5619u.m23568j(context, AbstractC4219d.f14139i), c5619u.m23568j(context, AbstractC4219d.f14141k)});
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
        @Override // p291n.C5619U.e
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo23583b(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = p291n.C5633e.m23654a()
                int[] r1 = r7.f20426a
                boolean r1 = r7.m23661f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = p223f.AbstractC4216a.f14086l
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f20428c
                boolean r1 = r7.m23661f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = p223f.AbstractC4216a.f14084j
                goto L11
            L20:
                int[] r1 = r7.f20429d
                boolean r1 = r7.m23661f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = p223f.AbstractC4219d.f14151u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = p223f.AbstractC4219d.f14142l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = p291n.AbstractC5608I.m23496a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = p291n.AbstractC5624Z.m23614b(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = p291n.C5633e.m23656d(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p291n.C5633e.a.mo23583b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // p291n.C5619U.e
        /* renamed from: c */
        public PorterDuff.Mode mo23584c(int i7) {
            if (i7 == AbstractC4219d.f14116F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p291n.C5619U.e
        /* renamed from: d */
        public ColorStateList mo23585d(Context context, int i7) {
            if (i7 == AbstractC4219d.f14143m) {
                return AbstractC4474a.m19043a(context, AbstractC4217b.f14097c);
            }
            if (i7 == AbstractC4219d.f14117G) {
                return AbstractC4474a.m19043a(context, AbstractC4217b.f14100f);
            }
            if (i7 == AbstractC4219d.f14116F) {
                return m23666k(context);
            }
            if (i7 == AbstractC4219d.f14136f) {
                return m23665j(context);
            }
            if (i7 == AbstractC4219d.f14132b) {
                return m23662g(context);
            }
            if (i7 == AbstractC4219d.f14135e) {
                return m23664i(context);
            }
            if (i7 == AbstractC4219d.f14114D || i7 == AbstractC4219d.f14115E) {
                return AbstractC4474a.m19043a(context, AbstractC4217b.f14099e);
            }
            if (m23661f(this.f20427b, i7)) {
                return AbstractC5624Z.m23616d(context, AbstractC4216a.f14086l);
            }
            if (m23661f(this.f20430e, i7)) {
                return AbstractC4474a.m19043a(context, AbstractC4217b.f14096b);
            }
            if (m23661f(this.f20431f, i7)) {
                return AbstractC4474a.m19043a(context, AbstractC4217b.f14095a);
            }
            if (i7 == AbstractC4219d.f14111A) {
                return AbstractC4474a.m19043a(context, AbstractC4217b.f14098d);
            }
            return null;
        }

        @Override // p291n.C5619U.e
        /* renamed from: e */
        public boolean mo23586e(Context context, int i7, Drawable drawable) {
            if (i7 == AbstractC4219d.f14113C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m23667l(layerDrawable.findDrawableByLayerId(R.id.background), AbstractC5624Z.m23614b(context, AbstractC4216a.f14086l), C5633e.f20423b);
                m23667l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC5624Z.m23614b(context, AbstractC4216a.f14086l), C5633e.f20423b);
                m23667l(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC5624Z.m23614b(context, AbstractC4216a.f14084j), C5633e.f20423b);
                return true;
            }
            if (i7 != AbstractC4219d.f14155y && i7 != AbstractC4219d.f14154x && i7 != AbstractC4219d.f14156z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m23667l(layerDrawable2.findDrawableByLayerId(R.id.background), AbstractC5624Z.m23613a(context, AbstractC4216a.f14086l), C5633e.f20423b);
            m23667l(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), AbstractC5624Z.m23614b(context, AbstractC4216a.f14084j), C5633e.f20423b);
            m23667l(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC5624Z.m23614b(context, AbstractC4216a.f14084j), C5633e.f20423b);
            return true;
        }

        /* renamed from: f */
        public final boolean m23661f(int[] iArr, int i7) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList m23662g(Context context) {
            return m23663h(context, 0);
        }

        /* renamed from: h */
        public final ColorStateList m23663h(Context context, int i7) {
            int m23614b = AbstractC5624Z.m23614b(context, AbstractC4216a.f14085k);
            return new ColorStateList(new int[][]{AbstractC5624Z.f20383b, AbstractC5624Z.f20386e, AbstractC5624Z.f20384c, AbstractC5624Z.f20390i}, new int[]{AbstractC5624Z.m23613a(context, AbstractC4216a.f14083i), AbstractC7086a.m29188c(m23614b, i7), AbstractC7086a.m29188c(m23614b, i7), i7});
        }

        /* renamed from: i */
        public final ColorStateList m23664i(Context context) {
            return m23663h(context, AbstractC5624Z.m23614b(context, AbstractC4216a.f14082h));
        }

        /* renamed from: j */
        public final ColorStateList m23665j(Context context) {
            return m23663h(context, AbstractC5624Z.m23614b(context, AbstractC4216a.f14083i));
        }

        /* renamed from: k */
        public final ColorStateList m23666k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList m23616d = AbstractC5624Z.m23616d(context, AbstractC4216a.f14087m);
            if (m23616d == null || !m23616d.isStateful()) {
                iArr[0] = AbstractC5624Z.f20383b;
                iArr2[0] = AbstractC5624Z.m23613a(context, AbstractC4216a.f14087m);
                iArr[1] = AbstractC5624Z.f20387f;
                iArr2[1] = AbstractC5624Z.m23614b(context, AbstractC4216a.f14084j);
                iArr[2] = AbstractC5624Z.f20390i;
                iArr2[2] = AbstractC5624Z.m23614b(context, AbstractC4216a.f14087m);
            } else {
                int[] iArr3 = AbstractC5624Z.f20383b;
                iArr[0] = iArr3;
                iArr2[0] = m23616d.getColorForState(iArr3, 0);
                iArr[1] = AbstractC5624Z.f20387f;
                iArr2[1] = AbstractC5624Z.m23614b(context, AbstractC4216a.f14084j);
                iArr[2] = AbstractC5624Z.f20390i;
                iArr2[2] = m23616d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        public final void m23667l(Drawable drawable, int i7, PorterDuff.Mode mode) {
            if (AbstractC5608I.m23496a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C5633e.f20423b;
            }
            drawable.setColorFilter(C5633e.m23656d(i7, mode));
        }
    }

    /* renamed from: b */
    public static synchronized C5633e m23655b() {
        C5633e c5633e;
        synchronized (C5633e.class) {
            try {
                if (f20424c == null) {
                    m23657f();
                }
                c5633e = f20424c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5633e;
    }

    /* renamed from: d */
    public static synchronized PorterDuffColorFilter m23656d(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter m23558l;
        synchronized (C5633e.class) {
            m23558l = C5619U.m23558l(i7, mode);
        }
        return m23558l;
    }

    /* renamed from: f */
    public static synchronized void m23657f() {
        synchronized (C5633e.class) {
            if (f20424c == null) {
                C5633e c5633e = new C5633e();
                f20424c = c5633e;
                c5633e.f20425a = C5619U.m23557h();
                f20424c.f20425a.m23575t(new a());
            }
        }
    }

    /* renamed from: g */
    public static void m23658g(Drawable drawable, C5628b0 c5628b0, int[] iArr) {
        C5619U.m23561v(drawable, c5628b0, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m23659c(Context context, int i7) {
        return this.f20425a.m23568j(context, i7);
    }

    /* renamed from: e */
    public synchronized ColorStateList m23660e(Context context, int i7) {
        return this.f20425a.m23570m(context, i7);
    }
}

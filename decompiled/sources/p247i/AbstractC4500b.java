package p247i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import p000A.AbstractC0000a;

/* renamed from: i.b */
/* loaded from: classes.dex */
public abstract class AbstractC4500b extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public c f16017a;

    /* renamed from: b */
    public Rect f16018b;

    /* renamed from: c */
    public Drawable f16019c;

    /* renamed from: d */
    public Drawable f16020d;

    /* renamed from: f */
    public boolean f16022f;

    /* renamed from: p */
    public boolean f16025p;

    /* renamed from: q */
    public Runnable f16026q;

    /* renamed from: r */
    public long f16027r;

    /* renamed from: s */
    public long f16028s;

    /* renamed from: t */
    public b f16029t;

    /* renamed from: e */
    public int f16021e = 255;

    /* renamed from: n */
    public int f16023n = -1;

    /* renamed from: o */
    public int f16024o = -1;

    /* renamed from: i.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4500b.this.m19146a(true);
            AbstractC4500b.this.invalidateSelf();
        }
    }

    /* renamed from: i.b$c */
    public static abstract class c extends Drawable.ConstantState {

        /* renamed from: A */
        public int f16032A;

        /* renamed from: B */
        public int f16033B;

        /* renamed from: C */
        public boolean f16034C;

        /* renamed from: D */
        public ColorFilter f16035D;

        /* renamed from: E */
        public boolean f16036E;

        /* renamed from: F */
        public ColorStateList f16037F;

        /* renamed from: G */
        public PorterDuff.Mode f16038G;

        /* renamed from: H */
        public boolean f16039H;

        /* renamed from: I */
        public boolean f16040I;

        /* renamed from: a */
        public final AbstractC4500b f16041a;

        /* renamed from: b */
        public Resources f16042b;

        /* renamed from: c */
        public int f16043c;

        /* renamed from: d */
        public int f16044d;

        /* renamed from: e */
        public int f16045e;

        /* renamed from: f */
        public SparseArray f16046f;

        /* renamed from: g */
        public Drawable[] f16047g;

        /* renamed from: h */
        public int f16048h;

        /* renamed from: i */
        public boolean f16049i;

        /* renamed from: j */
        public boolean f16050j;

        /* renamed from: k */
        public Rect f16051k;

        /* renamed from: l */
        public boolean f16052l;

        /* renamed from: m */
        public boolean f16053m;

        /* renamed from: n */
        public int f16054n;

        /* renamed from: o */
        public int f16055o;

        /* renamed from: p */
        public int f16056p;

        /* renamed from: q */
        public int f16057q;

        /* renamed from: r */
        public boolean f16058r;

        /* renamed from: s */
        public int f16059s;

        /* renamed from: t */
        public boolean f16060t;

        /* renamed from: u */
        public boolean f16061u;

        /* renamed from: v */
        public boolean f16062v;

        /* renamed from: w */
        public boolean f16063w;

        /* renamed from: x */
        public boolean f16064x;

        /* renamed from: y */
        public boolean f16065y;

        /* renamed from: z */
        public int f16066z;

        public c(c cVar, AbstractC4500b abstractC4500b, Resources resources) {
            this.f16043c = 160;
            this.f16049i = false;
            this.f16052l = false;
            this.f16064x = true;
            this.f16032A = 0;
            this.f16033B = 0;
            this.f16041a = abstractC4500b;
            this.f16042b = resources != null ? resources : cVar != null ? cVar.f16042b : null;
            int m19145f = AbstractC4500b.m19145f(resources, cVar != null ? cVar.f16043c : 0);
            this.f16043c = m19145f;
            if (cVar == null) {
                this.f16047g = new Drawable[10];
                this.f16048h = 0;
                return;
            }
            this.f16044d = cVar.f16044d;
            this.f16045e = cVar.f16045e;
            this.f16062v = true;
            this.f16063w = true;
            this.f16049i = cVar.f16049i;
            this.f16052l = cVar.f16052l;
            this.f16064x = cVar.f16064x;
            this.f16065y = cVar.f16065y;
            this.f16066z = cVar.f16066z;
            this.f16032A = cVar.f16032A;
            this.f16033B = cVar.f16033B;
            this.f16034C = cVar.f16034C;
            this.f16035D = cVar.f16035D;
            this.f16036E = cVar.f16036E;
            this.f16037F = cVar.f16037F;
            this.f16038G = cVar.f16038G;
            this.f16039H = cVar.f16039H;
            this.f16040I = cVar.f16040I;
            if (cVar.f16043c == m19145f) {
                if (cVar.f16050j) {
                    this.f16051k = new Rect(cVar.f16051k);
                    this.f16050j = true;
                }
                if (cVar.f16053m) {
                    this.f16054n = cVar.f16054n;
                    this.f16055o = cVar.f16055o;
                    this.f16056p = cVar.f16056p;
                    this.f16057q = cVar.f16057q;
                    this.f16053m = true;
                }
            }
            if (cVar.f16058r) {
                this.f16059s = cVar.f16059s;
                this.f16058r = true;
            }
            if (cVar.f16060t) {
                this.f16061u = cVar.f16061u;
                this.f16060t = true;
            }
            Drawable[] drawableArr = cVar.f16047g;
            this.f16047g = new Drawable[drawableArr.length];
            this.f16048h = cVar.f16048h;
            SparseArray sparseArray = cVar.f16046f;
            if (sparseArray != null) {
                this.f16046f = sparseArray.clone();
            } else {
                this.f16046f = new SparseArray(this.f16048h);
            }
            int i7 = this.f16048h;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f16046f.put(i8, constantState);
                    } else {
                        this.f16047g[i8] = drawableArr[i8];
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m19154a(Drawable drawable) {
            int i7 = this.f16048h;
            if (i7 >= this.f16047g.length) {
                mo19168o(i7, i7 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f16041a);
            this.f16047g[i7] = drawable;
            this.f16048h++;
            this.f16045e = drawable.getChangingConfigurations() | this.f16045e;
            m19169p();
            this.f16051k = null;
            this.f16050j = false;
            this.f16053m = false;
            this.f16062v = false;
            return i7;
        }

        /* renamed from: b */
        public final void m19155b(Resources.Theme theme) {
            if (theme != null) {
                m19158e();
                int i7 = this.f16048h;
                Drawable[] drawableArr = this.f16047g;
                for (int i8 = 0; i8 < i7; i8++) {
                    Drawable drawable = drawableArr[i8];
                    if (drawable != null && drawable.canApplyTheme()) {
                        drawableArr[i8].applyTheme(theme);
                        this.f16045e |= drawableArr[i8].getChangingConfigurations();
                    }
                }
                m19177y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean m19156c() {
            if (this.f16062v) {
                return this.f16063w;
            }
            m19158e();
            this.f16062v = true;
            int i7 = this.f16048h;
            Drawable[] drawableArr = this.f16047g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getConstantState() == null) {
                    this.f16063w = false;
                    return false;
                }
            }
            this.f16063w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i7 = this.f16048h;
            Drawable[] drawableArr = this.f16047g;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f16046f.get(i8);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m19157d() {
            this.f16053m = true;
            m19158e();
            int i7 = this.f16048h;
            Drawable[] drawableArr = this.f16047g;
            this.f16055o = -1;
            this.f16054n = -1;
            this.f16057q = 0;
            this.f16056p = 0;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f16054n) {
                    this.f16054n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f16055o) {
                    this.f16055o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f16056p) {
                    this.f16056p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f16057q) {
                    this.f16057q = minimumHeight;
                }
            }
        }

        /* renamed from: e */
        public final void m19158e() {
            SparseArray sparseArray = this.f16046f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    this.f16047g[this.f16046f.keyAt(i7)] = m19171s(((Drawable.ConstantState) this.f16046f.valueAt(i7)).newDrawable(this.f16042b));
                }
                this.f16046f = null;
            }
        }

        /* renamed from: f */
        public final int m19159f() {
            return this.f16047g.length;
        }

        /* renamed from: g */
        public final Drawable m19160g(int i7) {
            int indexOfKey;
            Drawable drawable = this.f16047g[i7];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f16046f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
                return null;
            }
            Drawable m19171s = m19171s(((Drawable.ConstantState) this.f16046f.valueAt(indexOfKey)).newDrawable(this.f16042b));
            this.f16047g[i7] = m19171s;
            this.f16046f.removeAt(indexOfKey);
            if (this.f16046f.size() == 0) {
                this.f16046f = null;
            }
            return m19171s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f16044d | this.f16045e;
        }

        /* renamed from: h */
        public final int m19161h() {
            return this.f16048h;
        }

        /* renamed from: i */
        public final int m19162i() {
            if (!this.f16053m) {
                m19157d();
            }
            return this.f16055o;
        }

        /* renamed from: j */
        public final int m19163j() {
            if (!this.f16053m) {
                m19157d();
            }
            return this.f16057q;
        }

        /* renamed from: k */
        public final int m19164k() {
            if (!this.f16053m) {
                m19157d();
            }
            return this.f16056p;
        }

        /* renamed from: l */
        public final Rect m19165l() {
            Rect rect = null;
            if (this.f16049i) {
                return null;
            }
            Rect rect2 = this.f16051k;
            if (rect2 != null || this.f16050j) {
                return rect2;
            }
            m19158e();
            Rect rect3 = new Rect();
            int i7 = this.f16048h;
            Drawable[] drawableArr = this.f16047g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i9 = rect3.left;
                    if (i9 > rect.left) {
                        rect.left = i9;
                    }
                    int i10 = rect3.top;
                    if (i10 > rect.top) {
                        rect.top = i10;
                    }
                    int i11 = rect3.right;
                    if (i11 > rect.right) {
                        rect.right = i11;
                    }
                    int i12 = rect3.bottom;
                    if (i12 > rect.bottom) {
                        rect.bottom = i12;
                    }
                }
            }
            this.f16050j = true;
            this.f16051k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m19166m() {
            if (!this.f16053m) {
                m19157d();
            }
            return this.f16054n;
        }

        /* renamed from: n */
        public final int m19167n() {
            if (this.f16058r) {
                return this.f16059s;
            }
            m19158e();
            int i7 = this.f16048h;
            Drawable[] drawableArr = this.f16047g;
            int opacity = i7 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i8 = 1; i8 < i7; i8++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i8].getOpacity());
            }
            this.f16059s = opacity;
            this.f16058r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo19168o(int i7, int i8) {
            Drawable[] drawableArr = new Drawable[i8];
            System.arraycopy(this.f16047g, 0, drawableArr, 0, i7);
            this.f16047g = drawableArr;
        }

        /* renamed from: p */
        public void m19169p() {
            this.f16058r = false;
            this.f16060t = false;
        }

        /* renamed from: q */
        public final boolean m19170q() {
            return this.f16052l;
        }

        /* renamed from: r */
        public abstract void mo19140r();

        /* renamed from: s */
        public final Drawable m19171s(Drawable drawable) {
            drawable.setLayoutDirection(this.f16066z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f16041a);
            return mutate;
        }

        /* renamed from: t */
        public final void m19172t(boolean z6) {
            this.f16052l = z6;
        }

        /* renamed from: u */
        public final void m19173u(int i7) {
            this.f16032A = i7;
        }

        /* renamed from: v */
        public final void m19174v(int i7) {
            this.f16033B = i7;
        }

        /* renamed from: w */
        public final boolean m19175w(int i7, int i8) {
            int i9 = this.f16048h;
            Drawable[] drawableArr = this.f16047g;
            boolean z6 = false;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    boolean layoutDirection = drawable.setLayoutDirection(i7);
                    if (i10 == i8) {
                        z6 = layoutDirection;
                    }
                }
            }
            this.f16066z = i7;
            return z6;
        }

        /* renamed from: x */
        public final void m19176x(boolean z6) {
            this.f16049i = z6;
        }

        /* renamed from: y */
        public final void m19177y(Resources resources) {
            if (resources != null) {
                this.f16042b = resources;
                int m19145f = AbstractC4500b.m19145f(resources, this.f16043c);
                int i7 = this.f16043c;
                this.f16043c = m19145f;
                if (i7 != m19145f) {
                    this.f16053m = false;
                    this.f16050j = false;
                }
            }
        }
    }

    /* renamed from: f */
    public static int m19145f(Resources resources, int i7) {
        if (resources != null) {
            i7 = resources.getDisplayMetrics().densityDpi;
        }
        if (i7 == 0) {
            return 160;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m19146a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f16022f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f16019c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f16027r
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f16021e
            r3.setAlpha(r9)
            r13.f16027r = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            i.b$c r10 = r13.f16017a
            int r10 = r10.f16032A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f16021e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f16027r = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f16020d
            if (r9 == 0) goto L64
            long r10 = r13.f16028s
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L66
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L53
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f16020d = r0
            r0 = -1
            r13.f16024o = r0
            r13.f16028s = r6
            goto L66
        L53:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$c r4 = r13.f16017a
            int r4 = r4.f16033B
            int r3 = r3 / r4
            int r4 = r13.f16021e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L67
        L64:
            r13.f16028s = r6
        L66:
            r0 = r3
        L67:
            if (r14 == 0) goto L73
            if (r0 == 0) goto L73
            java.lang.Runnable r14 = r13.f16026q
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p247i.AbstractC4500b.m19146a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f16017a.m19155b(theme);
    }

    /* renamed from: b */
    public abstract c mo19120b();

    /* renamed from: c */
    public int m19147c() {
        return this.f16023n;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f16017a.canApplyTheme();
    }

    /* renamed from: d */
    public final void m19148d(Drawable drawable) {
        if (this.f16029t == null) {
            this.f16029t = new b();
        }
        drawable.setCallback(this.f16029t.m19153b(drawable.getCallback()));
        try {
            if (this.f16017a.f16032A <= 0 && this.f16022f) {
                drawable.setAlpha(this.f16021e);
            }
            c cVar = this.f16017a;
            if (cVar.f16036E) {
                drawable.setColorFilter(cVar.f16035D);
            } else {
                if (cVar.f16039H) {
                    AbstractC0000a.m12m(drawable, cVar.f16037F);
                }
                c cVar2 = this.f16017a;
                if (cVar2.f16040I) {
                    AbstractC0000a.m13n(drawable, cVar2.f16038G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f16017a.f16064x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f16017a.f16034C);
            Rect rect = this.f16018b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f16029t.m19152a());
        } catch (Throwable th) {
            drawable.setCallback(this.f16029t.m19152a());
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f16020d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean m19149e() {
        return isAutoMirrored() && AbstractC0000a.m4e(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m19150g(int r9) {
        /*
            r8 = this;
            int r0 = r8.f16023n
            r1 = 0
            if (r9 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$c r0 = r8.f16017a
            int r0 = r0.f16033B
            r4 = -1
            r5 = 0
            r6 = 0
            if (r0 <= 0) goto L35
            android.graphics.drawable.Drawable r0 = r8.f16020d
            if (r0 == 0) goto L1b
            r0.setVisible(r1, r1)
        L1b:
            android.graphics.drawable.Drawable r0 = r8.f16019c
            if (r0 == 0) goto L2e
            r8.f16020d = r0
            int r0 = r8.f16023n
            r8.f16024o = r0
            i.b$c r0 = r8.f16017a
            int r0 = r0.f16033B
            long r0 = (long) r0
            long r0 = r0 + r2
            r8.f16028s = r0
            goto L3c
        L2e:
            r8.f16020d = r5
            r8.f16024o = r4
            r8.f16028s = r6
            goto L3c
        L35:
            android.graphics.drawable.Drawable r0 = r8.f16019c
            if (r0 == 0) goto L3c
            r0.setVisible(r1, r1)
        L3c:
            if (r9 < 0) goto L5c
            i.b$c r0 = r8.f16017a
            int r1 = r0.f16048h
            if (r9 >= r1) goto L5c
            android.graphics.drawable.Drawable r0 = r0.m19160g(r9)
            r8.f16019c = r0
            r8.f16023n = r9
            if (r0 == 0) goto L60
            i.b$c r9 = r8.f16017a
            int r9 = r9.f16032A
            if (r9 <= 0) goto L58
            long r4 = (long) r9
            long r2 = r2 + r4
            r8.f16027r = r2
        L58:
            r8.m19148d(r0)
            goto L60
        L5c:
            r8.f16019c = r5
            r8.f16023n = r4
        L60:
            long r0 = r8.f16027r
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r0 = 1
            if (r9 != 0) goto L6d
            long r1 = r8.f16028s
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 == 0) goto L7f
        L6d:
            java.lang.Runnable r9 = r8.f16026q
            if (r9 != 0) goto L79
            i.b$a r9 = new i.b$a
            r9.<init>()
            r8.f16026q = r9
            goto L7c
        L79:
            r8.unscheduleSelf(r9)
        L7c:
            r8.m19146a(r0)
        L7f:
            r8.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p247i.AbstractC4500b.m19150g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16021e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f16017a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f16017a.m19156c()) {
            return null;
        }
        this.f16017a.f16044d = getChangingConfigurations();
        return this.f16017a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f16019c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f16018b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f16017a.m19170q()) {
            return this.f16017a.m19162i();
        }
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f16017a.m19170q()) {
            return this.f16017a.m19166m();
        }
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f16017a.m19170q()) {
            return this.f16017a.m19163j();
        }
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f16017a.m19170q()) {
            return this.f16017a.m19164k();
        }
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f16019c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f16017a.m19167n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m19165l = this.f16017a.m19165l();
        if (m19165l != null) {
            rect.set(m19165l);
            padding = (m19165l.right | ((m19165l.left | m19165l.top) | m19165l.bottom)) != 0;
        } else {
            Drawable drawable = this.f16019c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m19149e()) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    /* renamed from: h */
    public void mo19121h(c cVar) {
        this.f16017a = cVar;
        int i7 = this.f16023n;
        if (i7 >= 0) {
            Drawable m19160g = cVar.m19160g(i7);
            this.f16019c = m19160g;
            if (m19160g != null) {
                m19148d(m19160g);
            }
        }
        this.f16024o = -1;
        this.f16020d = null;
    }

    /* renamed from: i */
    public final void m19151i(Resources resources) {
        this.f16017a.m19177y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f16017a;
        if (cVar != null) {
            cVar.m19169p();
        }
        if (drawable != this.f16019c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f16017a.f16034C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z6;
        Drawable drawable = this.f16020d;
        boolean z7 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f16020d = null;
            this.f16024o = -1;
            z6 = true;
        } else {
            z6 = false;
        }
        Drawable drawable2 = this.f16019c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f16022f) {
                this.f16019c.setAlpha(this.f16021e);
            }
        }
        if (this.f16028s != 0) {
            this.f16028s = 0L;
            z6 = true;
        }
        if (this.f16027r != 0) {
            this.f16027r = 0L;
        } else {
            z7 = z6;
        }
        if (z7) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f16025p && super.mutate() == this) {
            c mo19120b = mo19120b();
            mo19120b.mo19140r();
            mo19121h(mo19120b);
            this.f16025p = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16020d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f16019c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i7) {
        return this.f16017a.m19175w(i7, m19147c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        Drawable drawable = this.f16020d;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f16019c;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        if (drawable != this.f16019c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.f16022f && this.f16021e == i7) {
            return;
        }
        this.f16022f = true;
        this.f16021e = i7;
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            if (this.f16027r == 0) {
                drawable.setAlpha(i7);
            } else {
                m19146a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        c cVar = this.f16017a;
        if (cVar.f16034C != z6) {
            cVar.f16034C = z6;
            Drawable drawable = this.f16019c;
            if (drawable != null) {
                AbstractC0000a.m8i(drawable, z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f16017a;
        cVar.f16036E = true;
        if (cVar.f16035D != colorFilter) {
            cVar.f16035D = colorFilter;
            Drawable drawable = this.f16019c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        c cVar = this.f16017a;
        if (cVar.f16064x != z6) {
            cVar.f16064x = z6;
            Drawable drawable = this.f16019c;
            if (drawable != null) {
                drawable.setDither(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            AbstractC0000a.m9j(drawable, f7, f8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Rect rect = this.f16018b;
        if (rect == null) {
            this.f16018b = new Rect(i7, i8, i9, i10);
        } else {
            rect.set(i7, i8, i9, i10);
        }
        Drawable drawable = this.f16019c;
        if (drawable != null) {
            AbstractC0000a.m10k(drawable, i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f16017a;
        cVar.f16039H = true;
        if (cVar.f16037F != colorStateList) {
            cVar.f16037F = colorStateList;
            AbstractC0000a.m12m(this.f16019c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f16017a;
        cVar.f16040I = true;
        if (cVar.f16038G != mode) {
            cVar.f16038G = mode;
            AbstractC0000a.m13n(this.f16019c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        Drawable drawable = this.f16020d;
        if (drawable != null) {
            drawable.setVisible(z6, z7);
        }
        Drawable drawable2 = this.f16019c;
        if (drawable2 != null) {
            drawable2.setVisible(z6, z7);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f16019c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* renamed from: i.b$b */
    public static class b implements Drawable.Callback {

        /* renamed from: a */
        public Drawable.Callback f16031a;

        /* renamed from: a */
        public Drawable.Callback m19152a() {
            Drawable.Callback callback = this.f16031a;
            this.f16031a = null;
            return callback;
        }

        /* renamed from: b */
        public b m19153b(Drawable.Callback callback) {
            this.f16031a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            Drawable.Callback callback = this.f16031a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j7);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f16031a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}

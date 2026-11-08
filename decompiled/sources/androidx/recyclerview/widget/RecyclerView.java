package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C3455a;
import androidx.recyclerview.widget.C3456b;
import androidx.recyclerview.widget.C3466l;
import androidx.recyclerview.widget.C3467m;
import androidx.recyclerview.widget.RunnableC3459e;
import com.google.android.gms.common.api.C3643a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p002A1.AbstractC0017a;
import p002A1.AbstractC0018b;
import p021D.AbstractC0113u;
import p042G.AbstractC0343e;
import p049H.AbstractC0475B;
import p049H.AbstractC0478E;
import p049H.AbstractC0522q;
import p049H.C0523r;
import p056I.AbstractC0592b;
import p056I.C0612v;
import p098O.AbstractC1290a;
import p207d.AbstractC4094d;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: C0 */
    public static final int[] f11316C0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: D0 */
    public static final int[] f11317D0 = {R.attr.clipToPadding};

    /* renamed from: E0 */
    public static final boolean f11318E0 = false;

    /* renamed from: F0 */
    public static final boolean f11319F0 = true;

    /* renamed from: G0 */
    public static final boolean f11320G0 = true;

    /* renamed from: H0 */
    public static final boolean f11321H0 = true;

    /* renamed from: I0 */
    public static final boolean f11322I0 = false;

    /* renamed from: J0 */
    public static final boolean f11323J0 = false;

    /* renamed from: K0 */
    public static final Class[] f11324K0;

    /* renamed from: L0 */
    public static final Interpolator f11325L0;

    /* renamed from: A */
    public int f11326A;

    /* renamed from: A0 */
    public Runnable f11327A0;

    /* renamed from: B */
    public boolean f11328B;

    /* renamed from: B0 */
    public final C3467m.b f11329B0;

    /* renamed from: C */
    public boolean f11330C;

    /* renamed from: D */
    public boolean f11331D;

    /* renamed from: E */
    public int f11332E;

    /* renamed from: F */
    public boolean f11333F;

    /* renamed from: G */
    public final AccessibilityManager f11334G;

    /* renamed from: H */
    public List f11335H;

    /* renamed from: I */
    public boolean f11336I;

    /* renamed from: J */
    public boolean f11337J;

    /* renamed from: K */
    public int f11338K;

    /* renamed from: L */
    public int f11339L;

    /* renamed from: M */
    public C3432j f11340M;

    /* renamed from: N */
    public EdgeEffect f11341N;

    /* renamed from: O */
    public EdgeEffect f11342O;

    /* renamed from: P */
    public EdgeEffect f11343P;

    /* renamed from: Q */
    public EdgeEffect f11344Q;

    /* renamed from: R */
    public AbstractC3433k f11345R;

    /* renamed from: S */
    public int f11346S;

    /* renamed from: T */
    public int f11347T;

    /* renamed from: U */
    public VelocityTracker f11348U;

    /* renamed from: V */
    public int f11349V;

    /* renamed from: W */
    public int f11350W;

    /* renamed from: a */
    public final C3444v f11351a;

    /* renamed from: a0 */
    public int f11352a0;

    /* renamed from: b */
    public final C3442t f11353b;

    /* renamed from: b0 */
    public int f11354b0;

    /* renamed from: c */
    public C3445w f11355c;

    /* renamed from: c0 */
    public int f11356c0;

    /* renamed from: d */
    public C3455a f11357d;

    /* renamed from: d0 */
    public final int f11358d0;

    /* renamed from: e */
    public C3456b f11359e;

    /* renamed from: e0 */
    public final int f11360e0;

    /* renamed from: f */
    public final C3467m f11361f;

    /* renamed from: f0 */
    public float f11362f0;

    /* renamed from: g0 */
    public float f11363g0;

    /* renamed from: h0 */
    public boolean f11364h0;

    /* renamed from: i0 */
    public final RunnableC3448z f11365i0;

    /* renamed from: j0 */
    public RunnableC3459e f11366j0;

    /* renamed from: k0 */
    public RunnableC3459e.b f11367k0;

    /* renamed from: l0 */
    public final C3446x f11368l0;

    /* renamed from: m0 */
    public AbstractC3440r f11369m0;

    /* renamed from: n */
    public boolean f11370n;

    /* renamed from: n0 */
    public List f11371n0;

    /* renamed from: o */
    public final Runnable f11372o;

    /* renamed from: o0 */
    public boolean f11373o0;

    /* renamed from: p */
    public final Rect f11374p;

    /* renamed from: p0 */
    public boolean f11375p0;

    /* renamed from: q */
    public final Rect f11376q;

    /* renamed from: q0 */
    public AbstractC3433k.a f11377q0;

    /* renamed from: r */
    public final RectF f11378r;

    /* renamed from: r0 */
    public boolean f11379r0;

    /* renamed from: s */
    public AbstractC3436n f11380s;

    /* renamed from: s0 */
    public C3463i f11381s0;

    /* renamed from: t */
    public final ArrayList f11382t;

    /* renamed from: t0 */
    public final int[] f11383t0;

    /* renamed from: u */
    public final ArrayList f11384u;

    /* renamed from: u0 */
    public C0523r f11385u0;

    /* renamed from: v */
    public InterfaceC3439q f11386v;

    /* renamed from: v0 */
    public final int[] f11387v0;

    /* renamed from: w */
    public boolean f11388w;

    /* renamed from: w0 */
    public final int[] f11389w0;

    /* renamed from: x */
    public boolean f11390x;

    /* renamed from: x0 */
    public final int[] f11391x0;

    /* renamed from: y */
    public boolean f11392y;

    /* renamed from: y0 */
    public final int[] f11393y0;

    /* renamed from: z */
    public boolean f11394z;

    /* renamed from: z0 */
    public final List f11395z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$A */
    public static abstract class AbstractC3422A {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC3423a implements Runnable {
        public RunnableC3423a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f11394z || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f11388w) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f11330C) {
                recyclerView2.f11328B = true;
            } else {
                recyclerView2.m13616k();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class RunnableC3424b implements Runnable {
        public RunnableC3424b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3433k abstractC3433k = RecyclerView.this.f11345R;
            if (abstractC3433k != null) {
                abstractC3433k.mo13673i();
            }
            RecyclerView.this.f11379r0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public static class InterpolatorC3425c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C3426d implements C3467m.b {
        public C3426d() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C3427e implements C3456b.b {
        public C3427e() {
        }

        @Override // androidx.recyclerview.widget.C3456b.b
        /* renamed from: a */
        public View mo13648a(int i7) {
            return RecyclerView.this.getChildAt(i7);
        }

        @Override // androidx.recyclerview.widget.C3456b.b
        /* renamed from: b */
        public int mo13649b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C3456b.b
        /* renamed from: c */
        public void mo13650c() {
            int mo13649b = mo13649b();
            for (int i7 = 0; i7 < mo13649b; i7++) {
                View mo13648a = mo13648a(i7);
                RecyclerView.this.m13622n(mo13648a);
                mo13648a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C3456b.b
        /* renamed from: d */
        public int mo13651d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C3456b.b
        /* renamed from: e */
        public AbstractC3422A mo13652e(View view) {
            RecyclerView.m13570E(view);
            return null;
        }

        @Override // androidx.recyclerview.widget.C3456b.b
        /* renamed from: f */
        public void mo13653f(int i7) {
            View mo13648a = mo13648a(i7);
            if (mo13648a != null) {
                RecyclerView.m13570E(mo13648a);
            }
            RecyclerView.this.detachViewFromParent(i7);
        }

        @Override // androidx.recyclerview.widget.C3456b.b
        /* renamed from: g */
        public void mo13654g(View view) {
            RecyclerView.m13570E(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C3428f implements C3455a.a {
        public C3428f() {
        }

        @Override // androidx.recyclerview.widget.C3455a.a
        /* renamed from: a */
        public void mo13655a(int i7, int i8) {
            RecyclerView.this.m13594V(i7, i8);
            RecyclerView.this.f11373o0 = true;
        }

        @Override // androidx.recyclerview.widget.C3455a.a
        /* renamed from: b */
        public void mo13656b(C3455a.b bVar) {
            m13663i(bVar);
        }

        @Override // androidx.recyclerview.widget.C3455a.a
        /* renamed from: c */
        public void mo13657c(int i7, int i8, Object obj) {
            RecyclerView.this.m13647z0(i7, i8, obj);
            RecyclerView.this.f11375p0 = true;
        }

        @Override // androidx.recyclerview.widget.C3455a.a
        /* renamed from: d */
        public void mo13658d(C3455a.b bVar) {
            m13663i(bVar);
        }

        @Override // androidx.recyclerview.widget.C3455a.a
        /* renamed from: e */
        public AbstractC3422A mo13659e(int i7) {
            RecyclerView.this.m13577C(i7, true);
            return null;
        }

        @Override // androidx.recyclerview.widget.C3455a.a
        /* renamed from: f */
        public void mo13660f(int i7, int i8) {
            RecyclerView.this.m13595W(i7, i8, false);
            RecyclerView.this.f11373o0 = true;
        }

        @Override // androidx.recyclerview.widget.C3455a.a
        /* renamed from: g */
        public void mo13661g(int i7, int i8) {
            RecyclerView.this.m13593U(i7, i8);
            RecyclerView.this.f11373o0 = true;
        }

        @Override // androidx.recyclerview.widget.C3455a.a
        /* renamed from: h */
        public void mo13662h(int i7, int i8) {
            RecyclerView.this.m13595W(i7, i8, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f11373o0 = true;
            recyclerView.f11368l0.f11449d += i8;
        }

        /* renamed from: i */
        public void m13663i(C3455a.b bVar) {
            int i7 = bVar.f11526a;
            if (i7 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f11380s.mo13526f0(recyclerView, bVar.f11527b, bVar.f11529d);
                return;
            }
            if (i7 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f11380s.mo13529i0(recyclerView2, bVar.f11527b, bVar.f11529d);
            } else if (i7 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f11380s.mo13530k0(recyclerView3, bVar.f11527b, bVar.f11529d, bVar.f11528c);
            } else {
                if (i7 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f11380s.mo13528h0(recyclerView4, bVar.f11527b, bVar.f11529d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class AbstractC3429g {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class AbstractC3430h {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public interface InterfaceC3431i {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static class C3432j {
        /* renamed from: a */
        public EdgeEffect m13664a(RecyclerView recyclerView, int i7) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static abstract class AbstractC3433k {

        /* renamed from: a */
        public a f11401a = null;

        /* renamed from: b */
        public ArrayList f11402b = new ArrayList();

        /* renamed from: c */
        public long f11403c = 120;

        /* renamed from: d */
        public long f11404d = 120;

        /* renamed from: e */
        public long f11405e = 250;

        /* renamed from: f */
        public long f11406f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$k$a */
        public interface a {
            /* renamed from: a */
            void mo13675a(AbstractC3422A abstractC3422A);
        }

        /* renamed from: a */
        public final void m13665a(AbstractC3422A abstractC3422A) {
            m13672h(abstractC3422A);
            a aVar = this.f11401a;
            if (aVar != null) {
                aVar.mo13675a(abstractC3422A);
            }
        }

        /* renamed from: b */
        public final void m13666b() {
            if (this.f11402b.size() <= 0) {
                this.f11402b.clear();
            } else {
                AbstractC4094d.m17162a(this.f11402b.get(0));
                throw null;
            }
        }

        /* renamed from: c */
        public abstract void mo13667c();

        /* renamed from: d */
        public long m13668d() {
            return this.f11406f;
        }

        /* renamed from: e */
        public long m13669e() {
            return this.f11405e;
        }

        /* renamed from: f */
        public long m13670f() {
            return this.f11404d;
        }

        /* renamed from: g */
        public abstract boolean mo13671g();

        /* renamed from: h */
        public void m13672h(AbstractC3422A abstractC3422A) {
        }

        /* renamed from: i */
        public abstract void mo13673i();

        /* renamed from: j */
        public void m13674j(a aVar) {
            this.f11401a = aVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public class C3434l implements AbstractC3433k.a {
        public C3434l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3433k.a
        /* renamed from: a */
        public void mo13675a(AbstractC3422A abstractC3422A) {
            throw null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class AbstractC3435m {
        /* renamed from: d */
        public void m13676d(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: e */
        public void m13677e(Canvas canvas, RecyclerView recyclerView, C3446x c3446x) {
            m13676d(canvas, recyclerView);
        }

        /* renamed from: f */
        public abstract void mo13678f(Canvas canvas, RecyclerView recyclerView, C3446x c3446x);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC3436n {

        /* renamed from: a */
        public C3456b f11408a;

        /* renamed from: b */
        public RecyclerView f11409b;

        /* renamed from: c */
        public final C3466l.b f11410c;

        /* renamed from: d */
        public final C3466l.b f11411d;

        /* renamed from: e */
        public C3466l f11412e;

        /* renamed from: f */
        public C3466l f11413f;

        /* renamed from: g */
        public boolean f11414g;

        /* renamed from: h */
        public boolean f11415h;

        /* renamed from: i */
        public boolean f11416i;

        /* renamed from: j */
        public boolean f11417j;

        /* renamed from: k */
        public boolean f11418k;

        /* renamed from: l */
        public int f11419l;

        /* renamed from: m */
        public int f11420m;

        /* renamed from: n */
        public int f11421n;

        /* renamed from: o */
        public int f11422o;

        /* renamed from: p */
        public int f11423p;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$n$a */
        public class a implements C3466l.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: a */
            public View mo13736a(int i7) {
                return AbstractC3436n.this.m13721s(i7);
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: b */
            public int mo13737b(View view) {
                return AbstractC3436n.this.m13732y(view) - ((ViewGroup.MarginLayoutParams) ((C3437o) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: c */
            public int mo13738c() {
                return AbstractC3436n.this.m13690F();
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: d */
            public int mo13739d() {
                return AbstractC3436n.this.m13697O() - AbstractC3436n.this.m13691G();
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: e */
            public int mo13740e(View view) {
                return AbstractC3436n.this.m13734z(view) + ((ViewGroup.MarginLayoutParams) ((C3437o) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$n$b */
        public class b implements C3466l.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: a */
            public View mo13736a(int i7) {
                return AbstractC3436n.this.m13721s(i7);
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: b */
            public int mo13737b(View view) {
                return AbstractC3436n.this.m13681A(view) - ((ViewGroup.MarginLayoutParams) ((C3437o) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: c */
            public int mo13738c() {
                return AbstractC3436n.this.m13692H();
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: d */
            public int mo13739d() {
                return AbstractC3436n.this.m13683B() - AbstractC3436n.this.m13689E();
            }

            @Override // androidx.recyclerview.widget.C3466l.b
            /* renamed from: e */
            public int mo13740e(View view) {
                return AbstractC3436n.this.m13728w(view) + ((ViewGroup.MarginLayoutParams) ((C3437o) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$n$c */
        public static class c {

            /* renamed from: a */
            public int f11426a;

            /* renamed from: b */
            public int f11427b;

            /* renamed from: c */
            public boolean f11428c;

            /* renamed from: d */
            public boolean f11429d;
        }

        public AbstractC3436n() {
            a aVar = new a();
            this.f11410c = aVar;
            b bVar = new b();
            this.f11411d = bVar;
            this.f11412e = new C3466l(aVar);
            this.f11413f = new C3466l(bVar);
            this.f11414g = false;
            this.f11415h = false;
            this.f11416i = false;
            this.f11417j = true;
            this.f11418k = true;
        }

        /* renamed from: J */
        public static c m13679J(Context context, AttributeSet attributeSet, int i7, int i8) {
            c cVar = new c();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0018b.f114h, i7, i8);
            cVar.f11426a = obtainStyledAttributes.getInt(AbstractC0018b.f115i, 1);
            cVar.f11427b = obtainStyledAttributes.getInt(AbstractC0018b.f124r, 1);
            cVar.f11428c = obtainStyledAttributes.getBoolean(AbstractC0018b.f123q, false);
            cVar.f11429d = obtainStyledAttributes.getBoolean(AbstractC0018b.f125s, false);
            obtainStyledAttributes.recycle();
            return cVar;
        }

        /* renamed from: e */
        public static int m13680e(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i8, i9) : size : Math.min(size, Math.max(i8, i9));
        }

        /* renamed from: A */
        public int m13681A(View view) {
            return view.getTop() - m13696N(view);
        }

        /* renamed from: A0 */
        public void m13682A0() {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: B */
        public int m13683B() {
            return this.f11423p;
        }

        /* renamed from: B0 */
        public void m13684B0() {
            this.f11414g = true;
        }

        /* renamed from: C */
        public int m13685C() {
            return AbstractC0475B.m1755n(this.f11409b);
        }

        /* renamed from: C0 */
        public void m13686C0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f11409b = null;
                this.f11408a = null;
                this.f11422o = 0;
                this.f11423p = 0;
            } else {
                this.f11409b = recyclerView;
                this.f11408a = recyclerView.f11359e;
                this.f11422o = recyclerView.getWidth();
                this.f11423p = recyclerView.getHeight();
            }
            this.f11420m = 1073741824;
            this.f11421n = 1073741824;
        }

        /* renamed from: D */
        public int m13687D(View view) {
            return ((C3437o) view.getLayoutParams()).f11430a.left;
        }

        /* renamed from: D0 */
        public void m13688D0() {
        }

        /* renamed from: E */
        public int m13689E() {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: E0 */
        public abstract boolean mo13520E0();

        /* renamed from: F */
        public int m13690F() {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: G */
        public int m13691G() {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: H */
        public int m13692H() {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: I */
        public int m13693I(View view) {
            return ((C3437o) view.getLayoutParams()).m13741a();
        }

        /* renamed from: K */
        public int m13694K(View view) {
            return ((C3437o) view.getLayoutParams()).f11430a.right;
        }

        /* renamed from: L */
        public int mo13521L(C3442t c3442t, C3446x c3446x) {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView == null) {
                return 1;
            }
            recyclerView.getClass();
            return 1;
        }

        /* renamed from: M */
        public int m13695M(C3442t c3442t, C3446x c3446x) {
            return 0;
        }

        /* renamed from: N */
        public int m13696N(View view) {
            return ((C3437o) view.getLayoutParams()).f11430a.top;
        }

        /* renamed from: O */
        public int m13697O() {
            return this.f11422o;
        }

        /* renamed from: P */
        public boolean m13698P() {
            return this.f11415h;
        }

        /* renamed from: Q */
        public abstract boolean mo13549Q();

        /* renamed from: R */
        public final boolean m13699R(RecyclerView recyclerView, int i7, int i8) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m13690F = m13690F();
            int m13692H = m13692H();
            int m13697O = m13697O() - m13691G();
            int m13683B = m13683B() - m13689E();
            Rect rect = this.f11409b.f11374p;
            m13730x(focusedChild, rect);
            return rect.left - i7 < m13697O && rect.right - i7 > m13690F && rect.top - i8 < m13683B && rect.bottom - i8 > m13692H;
        }

        /* renamed from: S */
        public boolean m13700S(C3442t c3442t, C3446x c3446x) {
            return false;
        }

        /* renamed from: T */
        public boolean m13701T() {
            return false;
        }

        /* renamed from: U */
        public void m13702U(AbstractC3429g abstractC3429g, AbstractC3429g abstractC3429g2) {
        }

        /* renamed from: V */
        public boolean m13703V(RecyclerView recyclerView, ArrayList arrayList, int i7, int i8) {
            return false;
        }

        /* renamed from: W */
        public void m13704W(RecyclerView recyclerView) {
        }

        /* renamed from: X */
        public void m13705X(RecyclerView recyclerView) {
        }

        /* renamed from: Y */
        public void mo13553Y(RecyclerView recyclerView, C3442t c3442t) {
            m13705X(recyclerView);
        }

        /* renamed from: Z */
        public void mo13554Z(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f11409b;
            m13706a0(recyclerView.f11353b, recyclerView.f11368l0, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo13555a(String str) {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView != null) {
                recyclerView.m13609g(str);
            }
        }

        /* renamed from: a0 */
        public void m13706a0(C3442t c3442t, C3446x c3446x, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z6 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f11409b.canScrollVertically(-1) && !this.f11409b.canScrollHorizontally(-1) && !this.f11409b.canScrollHorizontally(1)) {
                z6 = false;
            }
            accessibilityEvent.setScrollable(z6);
            this.f11409b.getClass();
        }

        /* renamed from: b */
        public abstract boolean mo13556b();

        /* renamed from: b0 */
        public void m13707b0(C0612v c0612v) {
            RecyclerView recyclerView = this.f11409b;
            m13708c0(recyclerView.f11353b, recyclerView.f11368l0, c0612v);
        }

        /* renamed from: c */
        public abstract boolean mo13557c();

        /* renamed from: c0 */
        public void m13708c0(C3442t c3442t, C3446x c3446x, C0612v c0612v) {
            if (this.f11409b.canScrollVertically(-1) || this.f11409b.canScrollHorizontally(-1)) {
                c0612v.m2439a(8192);
                c0612v.m2442b0(true);
            }
            if (this.f11409b.canScrollVertically(1) || this.f11409b.canScrollHorizontally(1)) {
                c0612v.m2439a(4096);
                c0612v.m2442b0(true);
            }
            c0612v.m2436X(C0612v.e.m2478a(mo13521L(c3442t, c3446x), mo13534v(c3442t, c3446x), m13700S(c3442t, c3446x), m13695M(c3442t, c3446x)));
        }

        /* renamed from: d */
        public boolean mo13525d(C3437o c3437o) {
            return c3437o != null;
        }

        /* renamed from: d0 */
        public void m13709d0(View view, C0612v c0612v) {
            RecyclerView.m13570E(view);
        }

        /* renamed from: e0 */
        public View m13710e0(View view, int i7) {
            return null;
        }

        /* renamed from: f */
        public abstract int mo13558f(C3446x c3446x);

        /* renamed from: f0 */
        public void mo13526f0(RecyclerView recyclerView, int i7, int i8) {
        }

        /* renamed from: g */
        public abstract int mo13559g(C3446x c3446x);

        /* renamed from: g0 */
        public void mo13527g0(RecyclerView recyclerView) {
        }

        /* renamed from: h */
        public abstract int mo13560h(C3446x c3446x);

        /* renamed from: h0 */
        public void mo13528h0(RecyclerView recyclerView, int i7, int i8, int i9) {
        }

        /* renamed from: i */
        public abstract int mo13561i(C3446x c3446x);

        /* renamed from: i0 */
        public void mo13529i0(RecyclerView recyclerView, int i7, int i8) {
        }

        /* renamed from: j */
        public abstract int mo13562j(C3446x c3446x);

        /* renamed from: j0 */
        public void m13711j0(RecyclerView recyclerView, int i7, int i8) {
        }

        /* renamed from: k */
        public abstract int mo13563k(C3446x c3446x);

        /* renamed from: k0 */
        public void mo13530k0(RecyclerView recyclerView, int i7, int i8, Object obj) {
            m13711j0(recyclerView, i7, i8);
        }

        /* renamed from: l */
        public void m13712l(RecyclerView recyclerView) {
            this.f11415h = true;
            m13704W(recyclerView);
        }

        /* renamed from: l0 */
        public void m13713l0(C3442t c3442t, C3446x c3446x, int i7, int i8) {
            this.f11409b.m13620m(i7, i8);
        }

        /* renamed from: m */
        public void m13714m(RecyclerView recyclerView, C3442t c3442t) {
            this.f11415h = false;
            mo13553Y(recyclerView, c3442t);
        }

        /* renamed from: m0 */
        public boolean m13715m0(RecyclerView recyclerView, View view, View view2) {
            return m13701T() || recyclerView.m13589Q();
        }

        /* renamed from: n */
        public abstract C3437o mo13531n();

        /* renamed from: n0 */
        public boolean m13716n0(RecyclerView recyclerView, C3446x c3446x, View view, View view2) {
            return m13715m0(recyclerView, view, view2);
        }

        /* renamed from: o */
        public C3437o mo13532o(Context context, AttributeSet attributeSet) {
            return new C3437o(context, attributeSet);
        }

        /* renamed from: o0 */
        public abstract void mo13564o0(Parcelable parcelable);

        /* renamed from: p */
        public C3437o mo13533p(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C3437o ? new C3437o((C3437o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3437o((ViewGroup.MarginLayoutParams) layoutParams) : new C3437o(layoutParams);
        }

        /* renamed from: p0 */
        public abstract Parcelable mo13565p0();

        /* renamed from: q */
        public int m13717q() {
            return -1;
        }

        /* renamed from: q0 */
        public void mo13718q0(int i7) {
        }

        /* renamed from: r */
        public int m13719r(View view) {
            return ((C3437o) view.getLayoutParams()).f11430a.bottom;
        }

        /* renamed from: r0 */
        public boolean m13720r0(int i7, Bundle bundle) {
            RecyclerView recyclerView = this.f11409b;
            return m13722s0(recyclerView.f11353b, recyclerView.f11368l0, i7, bundle);
        }

        /* renamed from: s */
        public View m13721s(int i7) {
            C3456b c3456b = this.f11408a;
            if (c3456b != null) {
                return c3456b.m13856c(i7);
            }
            return null;
        }

        /* renamed from: s0 */
        public boolean m13722s0(C3442t c3442t, C3446x c3446x, int i7, Bundle bundle) {
            int m13683B;
            int m13697O;
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView == null) {
                return false;
            }
            if (i7 == 4096) {
                m13683B = recyclerView.canScrollVertically(1) ? (m13683B() - m13692H()) - m13689E() : 0;
                if (this.f11409b.canScrollHorizontally(1)) {
                    m13697O = (m13697O() - m13690F()) - m13691G();
                }
                m13697O = 0;
            } else if (i7 != 8192) {
                m13683B = 0;
                m13697O = 0;
            } else {
                m13683B = recyclerView.canScrollVertically(-1) ? -((m13683B() - m13692H()) - m13689E()) : 0;
                if (this.f11409b.canScrollHorizontally(-1)) {
                    m13697O = -((m13697O() - m13690F()) - m13691G());
                }
                m13697O = 0;
            }
            if (m13683B == 0 && m13697O == 0) {
                return false;
            }
            this.f11409b.m13631r0(m13697O, m13683B);
            return true;
        }

        /* renamed from: t */
        public int m13723t() {
            C3456b c3456b = this.f11408a;
            if (c3456b != null) {
                return c3456b.m13857d();
            }
            return 0;
        }

        /* renamed from: t0 */
        public boolean m13724t0(View view, int i7, Bundle bundle) {
            RecyclerView recyclerView = this.f11409b;
            return m13726u0(recyclerView.f11353b, recyclerView.f11368l0, view, i7, bundle);
        }

        /* renamed from: u */
        public final int[] m13725u(RecyclerView recyclerView, View view, Rect rect, boolean z6) {
            int m13690F = m13690F();
            int m13692H = m13692H();
            int m13697O = m13697O() - m13691G();
            int m13683B = m13683B() - m13689E();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i7 = left - m13690F;
            int min = Math.min(0, i7);
            int i8 = top - m13692H;
            int min2 = Math.min(0, i8);
            int i9 = width - m13697O;
            int max = Math.max(0, i9);
            int max2 = Math.max(0, height - m13683B);
            if (m13685C() != 1) {
                if (min == 0) {
                    min = Math.min(i7, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i9);
            }
            if (min2 == 0) {
                min2 = Math.min(i8, max2);
            }
            return new int[]{max, min2};
        }

        /* renamed from: u0 */
        public boolean m13726u0(C3442t c3442t, C3446x c3446x, View view, int i7, Bundle bundle) {
            return false;
        }

        /* renamed from: v */
        public int mo13534v(C3442t c3442t, C3446x c3446x) {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView == null) {
                return 1;
            }
            recyclerView.getClass();
            return 1;
        }

        /* renamed from: v0 */
        public void m13727v0(C3442t c3442t) {
            int m13723t = m13723t() - 1;
            if (m13723t < 0) {
                return;
            }
            RecyclerView.m13570E(m13721s(m13723t));
            throw null;
        }

        /* renamed from: w */
        public int m13728w(View view) {
            return view.getBottom() + m13719r(view);
        }

        /* renamed from: w0 */
        public void m13729w0(C3442t c3442t) {
            int m13755g = c3442t.m13755g();
            int i7 = m13755g - 1;
            if (i7 >= 0) {
                RecyclerView.m13570E(c3442t.m13757i(i7));
                throw null;
            }
            c3442t.m13751c();
            if (m13755g > 0) {
                this.f11409b.invalidate();
            }
        }

        /* renamed from: x */
        public void m13730x(View view, Rect rect) {
            RecyclerView.m13571F(view, rect);
        }

        /* renamed from: x0 */
        public boolean m13731x0(Runnable runnable) {
            RecyclerView recyclerView = this.f11409b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: y */
        public int m13732y(View view) {
            return view.getLeft() - m13687D(view);
        }

        /* renamed from: y0 */
        public boolean m13733y0(RecyclerView recyclerView, View view, Rect rect, boolean z6) {
            return m13735z0(recyclerView, view, rect, z6, false);
        }

        /* renamed from: z */
        public int m13734z(View view) {
            return view.getRight() + m13694K(view);
        }

        /* renamed from: z0 */
        public boolean m13735z0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z7) {
            int[] m13725u = m13725u(recyclerView, view, rect, z6);
            int i7 = m13725u[0];
            int i8 = m13725u[1];
            if ((z7 && !m13699R(recyclerView, i7, i8)) || (i7 == 0 && i8 == 0)) {
                return false;
            }
            if (z6) {
                recyclerView.scrollBy(i7, i8);
            } else {
                recyclerView.m13631r0(i7, i8);
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC3438p {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface InterfaceC3439q {
        /* renamed from: a */
        void mo13742a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo13743b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo13744c(boolean z6);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC3440r {
        /* renamed from: a */
        public void m13745a(RecyclerView recyclerView, int i7) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static class C3441s {

        /* renamed from: a */
        public SparseArray f11433a = new SparseArray();

        /* renamed from: b */
        public int f11434b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$s$a */
        public static class a {

            /* renamed from: a */
            public final ArrayList f11435a;
        }

        /* renamed from: a */
        public void m13746a() {
            for (int i7 = 0; i7 < this.f11433a.size(); i7++) {
                ((a) this.f11433a.valueAt(i7)).f11435a.clear();
            }
        }

        /* renamed from: b */
        public void m13747b() {
            this.f11434b--;
        }

        /* renamed from: c */
        public void m13748c(AbstractC3429g abstractC3429g, AbstractC3429g abstractC3429g2, boolean z6) {
            if (z6 || this.f11434b != 0) {
                return;
            }
            m13746a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public final class C3442t {

        /* renamed from: a */
        public final ArrayList f11436a;

        /* renamed from: b */
        public ArrayList f11437b;

        /* renamed from: c */
        public final ArrayList f11438c;

        /* renamed from: d */
        public final List f11439d;

        /* renamed from: e */
        public int f11440e;

        /* renamed from: f */
        public int f11441f;

        /* renamed from: g */
        public C3441s f11442g;

        public C3442t() {
            ArrayList arrayList = new ArrayList();
            this.f11436a = arrayList;
            this.f11437b = null;
            this.f11438c = new ArrayList();
            this.f11439d = DesugarCollections.unmodifiableList(arrayList);
            this.f11440e = 2;
            this.f11441f = 2;
        }

        /* renamed from: a */
        public void m13749a(AbstractC3422A abstractC3422A, boolean z6) {
            RecyclerView.m13574i(abstractC3422A);
            throw null;
        }

        /* renamed from: b */
        public void m13750b() {
            this.f11436a.clear();
            m13764p();
        }

        /* renamed from: c */
        public void m13751c() {
            this.f11436a.clear();
            ArrayList arrayList = this.f11437b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: d */
        public int m13752d(int i7) {
            if (i7 >= 0 && i7 < RecyclerView.this.f11368l0.m13777a()) {
                return !RecyclerView.this.f11368l0.m13778b() ? i7 : RecyclerView.this.f11357d.m13844l(i7);
            }
            throw new IndexOutOfBoundsException("invalid position " + i7 + ". State item count is " + RecyclerView.this.f11368l0.m13777a() + RecyclerView.this.m13575A());
        }

        /* renamed from: e */
        public AbstractC3422A m13753e(int i7) {
            int size;
            ArrayList arrayList = this.f11437b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            if (size > 0) {
                AbstractC4094d.m17162a(this.f11437b.get(0));
                throw null;
            }
            RecyclerView.this.getClass();
            throw null;
        }

        /* renamed from: f */
        public C3441s m13754f() {
            if (this.f11442g == null) {
                this.f11442g = new C3441s();
            }
            return this.f11442g;
        }

        /* renamed from: g */
        public int m13755g() {
            return this.f11436a.size();
        }

        /* renamed from: h */
        public AbstractC3422A m13756h(int i7, boolean z6) {
            View m13855b;
            if (this.f11436a.size() > 0) {
                AbstractC4094d.m17162a(this.f11436a.get(0));
                throw null;
            }
            if (z6 || (m13855b = RecyclerView.this.f11359e.m13855b(i7)) == null) {
                if (this.f11438c.size() <= 0) {
                    return null;
                }
                AbstractC4094d.m17162a(this.f11438c.get(0));
                throw null;
            }
            RecyclerView.m13570E(m13855b);
            RecyclerView.this.f11359e.m13863j(m13855b);
            int m13861h = RecyclerView.this.f11359e.m13861h(m13855b);
            if (m13861h != -1) {
                RecyclerView.this.f11359e.m13854a(m13861h);
                m13766r(m13855b);
                throw null;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + ((Object) null) + RecyclerView.this.m13575A());
        }

        /* renamed from: i */
        public View m13757i(int i7) {
            AbstractC4094d.m17162a(this.f11436a.get(i7));
            throw null;
        }

        /* renamed from: j */
        public void m13758j() {
            if (this.f11438c.size() <= 0) {
                return;
            }
            AbstractC4094d.m17162a(this.f11438c.get(0));
            throw null;
        }

        /* renamed from: k */
        public void m13759k() {
            int size = this.f11438c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC4094d.m17162a(this.f11438c.get(i7));
            }
            RecyclerView.this.getClass();
            m13764p();
        }

        /* renamed from: l */
        public void m13760l(int i7, int i8) {
            int size = this.f11438c.size();
            for (int i9 = 0; i9 < size; i9++) {
                AbstractC4094d.m17162a(this.f11438c.get(i9));
            }
        }

        /* renamed from: m */
        public void m13761m(int i7, int i8) {
            int size = this.f11438c.size();
            for (int i9 = 0; i9 < size; i9++) {
                AbstractC4094d.m17162a(this.f11438c.get(i9));
            }
        }

        /* renamed from: n */
        public void m13762n(int i7, int i8, boolean z6) {
            for (int size = this.f11438c.size() - 1; size >= 0; size--) {
                AbstractC4094d.m17162a(this.f11438c.get(size));
            }
        }

        /* renamed from: o */
        public void m13763o(AbstractC3429g abstractC3429g, AbstractC3429g abstractC3429g2, boolean z6) {
            m13750b();
            m13754f().m13748c(abstractC3429g, abstractC3429g2, z6);
        }

        /* renamed from: p */
        public void m13764p() {
            for (int size = this.f11438c.size() - 1; size >= 0; size--) {
                m13765q(size);
            }
            this.f11438c.clear();
            if (RecyclerView.f11321H0) {
                RecyclerView.this.f11367k0.m13907a();
            }
        }

        /* renamed from: q */
        public void m13765q(int i7) {
            AbstractC4094d.m17162a(this.f11438c.get(i7));
            m13749a(null, true);
            this.f11438c.remove(i7);
        }

        /* renamed from: r */
        public void m13766r(View view) {
            RecyclerView.m13570E(view);
            throw null;
        }

        /* renamed from: s */
        public void m13767s(C3441s c3441s) {
            C3441s c3441s2 = this.f11442g;
            if (c3441s2 != null) {
                c3441s2.m13747b();
            }
            this.f11442g = c3441s;
            if (c3441s != null) {
                RecyclerView.this.getAdapter();
            }
        }

        /* renamed from: t */
        public void m13768t(AbstractC3447y abstractC3447y) {
        }

        /* renamed from: u */
        public void m13769u(int i7) {
            this.f11440e = i7;
            m13771w();
        }

        /* renamed from: v */
        public AbstractC3422A m13770v(int i7, boolean z6, long j7) {
            if (i7 < 0 || i7 >= RecyclerView.this.f11368l0.m13777a()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i7 + "(" + i7 + "). Item count:" + RecyclerView.this.f11368l0.m13777a() + RecyclerView.this.m13575A());
            }
            if (RecyclerView.this.f11368l0.m13778b()) {
                m13753e(i7);
            }
            m13756h(i7, z6);
            int m13844l = RecyclerView.this.f11357d.m13844l(i7);
            if (m13844l >= 0) {
                RecyclerView.this.getClass();
                throw null;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i7 + "(offset:" + m13844l + ").state:" + RecyclerView.this.f11368l0.m13777a() + RecyclerView.this.m13575A());
        }

        /* renamed from: w */
        public void m13771w() {
            AbstractC3436n abstractC3436n = RecyclerView.this.f11380s;
            this.f11441f = this.f11440e + (abstractC3436n != null ? abstractC3436n.f11419l : 0);
            for (int size = this.f11438c.size() - 1; size >= 0 && this.f11438c.size() > this.f11441f; size--) {
                m13765q(size);
            }
        }

        /* renamed from: x */
        public void m13772x(int i7, int i8) {
            for (int size = this.f11438c.size() - 1; size >= 0; size--) {
                AbstractC4094d.m17162a(this.f11438c.get(size));
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public interface InterfaceC3443u {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public class C3444v extends AbstractC3430h {
        public C3444v() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static class C3446x {

        /* renamed from: b */
        public SparseArray f11447b;

        /* renamed from: a */
        public int f11446a = -1;

        /* renamed from: c */
        public int f11448c = 0;

        /* renamed from: d */
        public int f11449d = 0;

        /* renamed from: e */
        public int f11450e = 1;

        /* renamed from: f */
        public int f11451f = 0;

        /* renamed from: g */
        public boolean f11452g = false;

        /* renamed from: h */
        public boolean f11453h = false;

        /* renamed from: i */
        public boolean f11454i = false;

        /* renamed from: j */
        public boolean f11455j = false;

        /* renamed from: k */
        public boolean f11456k = false;

        /* renamed from: l */
        public boolean f11457l = false;

        /* renamed from: a */
        public int m13777a() {
            return this.f11453h ? this.f11448c - this.f11449d : this.f11451f;
        }

        /* renamed from: b */
        public boolean m13778b() {
            return this.f11453h;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f11446a + ", mData=" + this.f11447b + ", mItemCount=" + this.f11451f + ", mIsMeasuring=" + this.f11455j + ", mPreviousLayoutItemCount=" + this.f11448c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f11449d + ", mStructureChanged=" + this.f11452g + ", mInPreLayout=" + this.f11453h + ", mRunSimpleAnimations=" + this.f11456k + ", mRunPredictiveAnimations=" + this.f11457l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class AbstractC3447y {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public class RunnableC3448z implements Runnable {

        /* renamed from: a */
        public int f11458a;

        /* renamed from: b */
        public int f11459b;

        /* renamed from: c */
        public OverScroller f11460c;

        /* renamed from: d */
        public Interpolator f11461d;

        /* renamed from: e */
        public boolean f11462e;

        /* renamed from: f */
        public boolean f11463f;

        public RunnableC3448z() {
            Interpolator interpolator = RecyclerView.f11325L0;
            this.f11461d = interpolator;
            this.f11462e = false;
            this.f11463f = false;
            this.f11460c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int m13779a(int i7, int i8, int i9, int i10) {
            int i11;
            int abs = Math.abs(i7);
            int abs2 = Math.abs(i8);
            boolean z6 = abs > abs2;
            int sqrt = (int) Math.sqrt((i9 * i9) + (i10 * i10));
            int sqrt2 = (int) Math.sqrt((i7 * i7) + (i8 * i8));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i12 = width / 2;
            float f7 = width;
            float f8 = i12;
            float m13781c = f8 + (m13781c(Math.min(1.0f, (sqrt2 * 1.0f) / f7)) * f8);
            if (sqrt > 0) {
                i11 = Math.round(Math.abs(m13781c / sqrt) * 1000.0f) * 4;
            } else {
                if (!z6) {
                    abs = abs2;
                }
                i11 = (int) (((abs / f7) + 1.0f) * 300.0f);
            }
            return Math.min(i11, 2000);
        }

        /* renamed from: b */
        public final void m13780b() {
            this.f11463f = false;
            this.f11462e = true;
        }

        /* renamed from: c */
        public final float m13781c(float f7) {
            return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
        }

        /* renamed from: d */
        public final void m13782d() {
            this.f11462e = false;
            if (this.f11463f) {
                m13784f();
            }
        }

        /* renamed from: e */
        public void m13783e(int i7, int i8) {
            RecyclerView.this.setScrollState(2);
            this.f11459b = 0;
            this.f11458a = 0;
            this.f11460c.fling(0, 0, i7, i8, Integer.MIN_VALUE, C3643a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, C3643a.e.API_PRIORITY_OTHER);
            m13784f();
        }

        /* renamed from: f */
        public void m13784f() {
            if (this.f11462e) {
                this.f11463f = true;
            } else {
                RecyclerView.this.removeCallbacks(this);
                AbstractC0475B.m1726D(RecyclerView.this, this);
            }
        }

        /* renamed from: g */
        public void m13785g(int i7, int i8, int i9, Interpolator interpolator) {
            if (this.f11461d != interpolator) {
                this.f11461d = interpolator;
                this.f11460c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f11459b = 0;
            this.f11458a = 0;
            this.f11460c.startScroll(0, 0, i7, i8, i9);
            m13784f();
        }

        /* renamed from: h */
        public void m13786h(int i7, int i8, Interpolator interpolator) {
            int m13779a = m13779a(i7, i8, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f11325L0;
            }
            m13785g(i7, i8, m13779a, interpolator);
        }

        /* renamed from: i */
        public void m13787i() {
            RecyclerView.this.removeCallbacks(this);
            this.f11460c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RecyclerView.this.f11380s == null) {
                m13787i();
                return;
            }
            m13780b();
            RecyclerView.this.m13616k();
            OverScroller overScroller = this.f11460c;
            RecyclerView.this.f11380s.getClass();
            if (overScroller.computeScrollOffset()) {
                int[] iArr = RecyclerView.this.f11389w0;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i7 = currX - this.f11458a;
                int i8 = currY - this.f11459b;
                this.f11458a = currX;
                this.f11459b = currY;
                if (RecyclerView.this.m13628q(i7, i8, iArr, null, 1)) {
                    i7 -= iArr[0];
                    i8 -= iArr[1];
                }
                RecyclerView.this.getClass();
                if (!RecyclerView.this.f11382t.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m13614j(i7, i8);
                }
                RecyclerView.this.m13630r(0, 0, 0, 0, null, 1);
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z6 = (i7 == 0 && i8 == 0) || (i7 != 0 && RecyclerView.this.f11380s.mo13556b() && i7 == 0) || (i8 != 0 && RecyclerView.this.f11380s.mo13557c() && i8 == 0);
                if (overScroller.isFinished() || !(z6 || RecyclerView.this.m13580H(1))) {
                    RecyclerView.this.setScrollState(0);
                    if (RecyclerView.f11321H0) {
                        RecyclerView.this.f11367k0.m13907a();
                    }
                    RecyclerView.this.m13641w0(1);
                } else {
                    m13784f();
                    RecyclerView recyclerView = RecyclerView.this;
                    RunnableC3459e runnableC3459e = recyclerView.f11366j0;
                    if (runnableC3459e != null) {
                        runnableC3459e.m13902f(recyclerView, i7, i8);
                    }
                }
            }
            m13782d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f11324K0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f11325L0 = new InterpolatorC3425c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: E */
    public static AbstractC3422A m13570E(View view) {
        if (view == null) {
            return null;
        }
        ((C3437o) view.getLayoutParams()).getClass();
        return null;
    }

    /* renamed from: F */
    public static void m13571F(View view, Rect rect) {
        C3437o c3437o = (C3437o) view.getLayoutParams();
        Rect rect2 = c3437o.f11430a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c3437o).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c3437o).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c3437o).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c3437o).bottomMargin);
    }

    private C0523r getScrollingChildHelper() {
        if (this.f11385u0 == null) {
            this.f11385u0 = new C0523r(this);
        }
        return this.f11385u0;
    }

    /* renamed from: i */
    public static void m13574i(AbstractC3422A abstractC3422A) {
        throw null;
    }

    /* renamed from: A */
    public String m13575A() {
        return StringUtils.SPACE + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.f11380s + ", context:" + getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m13576B(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m13576B(android.view.View):android.view.View");
    }

    /* renamed from: C */
    public AbstractC3422A m13577C(int i7, boolean z6) {
        int m13860g = this.f11359e.m13860g();
        for (int i8 = 0; i8 < m13860g; i8++) {
            m13570E(this.f11359e.m13859f(i8));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public boolean m13578D(int i7, int i8) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f11330C) {
            return false;
        }
        boolean mo13556b = abstractC3436n.mo13556b();
        boolean mo13557c = this.f11380s.mo13557c();
        if (mo13556b == 0 || Math.abs(i7) < this.f11358d0) {
            i7 = 0;
        }
        if (!mo13557c || Math.abs(i8) < this.f11358d0) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return false;
        }
        float f7 = i7;
        float f8 = i8;
        if (!dispatchNestedPreFling(f7, f8)) {
            boolean z6 = mo13556b != 0 || mo13557c;
            dispatchNestedFling(f7, f8, z6);
            int i9 = mo13556b;
            if (z6) {
                if (mo13557c) {
                    i9 = (mo13556b ? 1 : 0) | 2;
                }
                m13637u0(i9, 1);
                int i10 = this.f11360e0;
                int max = Math.max(-i10, Math.min(i7, i10));
                int i11 = this.f11360e0;
                this.f11365i0.m13783e(max, Math.max(-i11, Math.min(i8, i11)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public final String m13579G(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    /* renamed from: H */
    public boolean m13580H(int i7) {
        return getScrollingChildHelper().m2007l(i7);
    }

    /* renamed from: I */
    public boolean m13581I() {
        return !this.f11394z || this.f11336I || this.f11357d.m13847o();
    }

    /* renamed from: J */
    public final boolean m13582J() {
        int m13857d = this.f11359e.m13857d();
        for (int i7 = 0; i7 < m13857d; i7++) {
            m13570E(this.f11359e.m13856c(i7));
        }
        return false;
    }

    /* renamed from: K */
    public void m13583K() {
        this.f11357d = new C3455a(new C3428f());
    }

    /* renamed from: L */
    public final void m13584L() {
        if (AbstractC0475B.m1754m(this) == 0) {
            AbstractC0475B.m1738P(this, 8);
        }
    }

    /* renamed from: M */
    public final void m13585M() {
        this.f11359e = new C3456b(new C3427e());
    }

    /* renamed from: N */
    public void m13586N(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C3458d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC0017a.f104a), resources.getDimensionPixelSize(AbstractC0017a.f106c), resources.getDimensionPixelOffset(AbstractC0017a.f105b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m13575A());
        }
    }

    /* renamed from: O */
    public void m13587O() {
        this.f11344Q = null;
        this.f11342O = null;
        this.f11343P = null;
        this.f11341N = null;
    }

    /* renamed from: P */
    public boolean m13588P() {
        AccessibilityManager accessibilityManager = this.f11334G;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: Q */
    public boolean m13589Q() {
        return this.f11338K > 0;
    }

    /* renamed from: R */
    public final boolean m13590R(View view, View view2, int i7) {
        int i8;
        if (view2 == null || view2 == this || m13576B(view2) == null) {
            return false;
        }
        if (view == null || m13576B(view) == null) {
            return true;
        }
        this.f11374p.set(0, 0, view.getWidth(), view.getHeight());
        this.f11376q.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f11374p);
        offsetDescendantRectToMyCoords(view2, this.f11376q);
        char c7 = 65535;
        int i9 = this.f11380s.m13685C() == 1 ? -1 : 1;
        Rect rect = this.f11374p;
        int i10 = rect.left;
        Rect rect2 = this.f11376q;
        int i11 = rect2.left;
        if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
            i8 = 1;
        } else {
            int i12 = rect.right;
            int i13 = rect2.right;
            i8 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
            c7 = 1;
        } else {
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            if ((i16 <= i17 && i14 < i17) || i14 <= i15) {
                c7 = 0;
            }
        }
        if (i7 == 1) {
            return c7 < 0 || (c7 == 0 && i8 * i9 <= 0);
        }
        if (i7 == 2) {
            return c7 > 0 || (c7 == 0 && i8 * i9 >= 0);
        }
        if (i7 == 17) {
            return i8 < 0;
        }
        if (i7 == 33) {
            return c7 < 0;
        }
        if (i7 == 66) {
            return i8 > 0;
        }
        if (i7 == 130) {
            return c7 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i7 + m13575A());
    }

    /* renamed from: S */
    public void m13591S() {
        int m13860g = this.f11359e.m13860g();
        for (int i7 = 0; i7 < m13860g; i7++) {
            ((C3437o) this.f11359e.m13859f(i7).getLayoutParams()).f11431b = true;
        }
        this.f11353b.m13758j();
    }

    /* renamed from: T */
    public void m13592T() {
        int m13860g = this.f11359e.m13860g();
        for (int i7 = 0; i7 < m13860g; i7++) {
            m13570E(this.f11359e.m13859f(i7));
        }
        m13591S();
        this.f11353b.m13759k();
    }

    /* renamed from: U */
    public void m13593U(int i7, int i8) {
        int m13860g = this.f11359e.m13860g();
        for (int i9 = 0; i9 < m13860g; i9++) {
            m13570E(this.f11359e.m13859f(i9));
        }
        this.f11353b.m13760l(i7, i8);
        requestLayout();
    }

    /* renamed from: V */
    public void m13594V(int i7, int i8) {
        int m13860g = this.f11359e.m13860g();
        for (int i9 = 0; i9 < m13860g; i9++) {
            m13570E(this.f11359e.m13859f(i9));
        }
        this.f11353b.m13761m(i7, i8);
        requestLayout();
    }

    /* renamed from: W */
    public void m13595W(int i7, int i8, boolean z6) {
        int m13860g = this.f11359e.m13860g();
        for (int i9 = 0; i9 < m13860g; i9++) {
            m13570E(this.f11359e.m13859f(i9));
        }
        this.f11353b.m13762n(i7, i8, z6);
        requestLayout();
    }

    /* renamed from: X */
    public void m13596X(View view) {
    }

    /* renamed from: Y */
    public void m13597Y() {
        this.f11338K++;
    }

    /* renamed from: Z */
    public void m13598Z() {
        m13599a0(true);
    }

    /* renamed from: a0 */
    public void m13599a0(boolean z6) {
        int i7 = this.f11338K - 1;
        this.f11338K = i7;
        if (i7 < 1) {
            this.f11338K = 0;
            if (z6) {
                m13624o();
                m13638v();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i7, int i8) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n == null || !abstractC3436n.m13703V(this, arrayList, i7, i8)) {
            super.addFocusables(arrayList, i7, i8);
        }
    }

    /* renamed from: b0 */
    public final void m13600b0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11347T) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f11347T = motionEvent.getPointerId(i7);
            int x6 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f11352a0 = x6;
            this.f11349V = x6;
            int y6 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f11354b0 = y6;
            this.f11350W = y6;
        }
    }

    /* renamed from: c */
    public void m13601c(AbstractC3435m abstractC3435m) {
        m13603d(abstractC3435m, -1);
    }

    /* renamed from: c0 */
    public void m13602c0(int i7) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3437o) && this.f11380s.mo13525d((C3437o) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null && abstractC3436n.mo13556b()) {
            return this.f11380s.mo13558f(this.f11368l0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null && abstractC3436n.mo13556b()) {
            return this.f11380s.mo13559g(this.f11368l0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null && abstractC3436n.mo13556b()) {
            return this.f11380s.mo13560h(this.f11368l0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null && abstractC3436n.mo13557c()) {
            return this.f11380s.mo13561i(this.f11368l0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null && abstractC3436n.mo13557c()) {
            return this.f11380s.mo13562j(this.f11368l0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null && abstractC3436n.mo13557c()) {
            return this.f11380s.mo13563k(this.f11368l0);
        }
        return 0;
    }

    /* renamed from: d */
    public void m13603d(AbstractC3435m abstractC3435m, int i7) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            abstractC3436n.mo13555a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f11382t.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i7 < 0) {
            this.f11382t.add(abstractC3435m);
        } else {
            this.f11382t.add(i7, abstractC3435m);
        }
        m13591S();
        requestLayout();
    }

    /* renamed from: d0 */
    public final boolean m13604d0() {
        return this.f11345R != null && this.f11380s.mo13520E0();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return getScrollingChildHelper().m1996a(f7, f8, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return getScrollingChildHelper().m1997b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m1998c(i7, i8, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().m2001f(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z6;
        super.draw(canvas);
        int size = this.f11382t.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC3435m) this.f11382t.get(i7)).mo13678f(canvas, this, this.f11368l0);
        }
        EdgeEffect edgeEffect = this.f11341N;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f11370n ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f11341N;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f11342O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f11370n) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f11342O;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f11343P;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f11370n ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f11343P;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f11344Q;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f11370n) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f11344Q;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z6 |= z7;
            canvas.restoreToCount(save4);
        }
        if ((z6 || this.f11345R == null || this.f11382t.size() <= 0 || !this.f11345R.mo13671g()) ? z6 : true) {
            AbstractC0475B.m1725C(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    /* renamed from: e */
    public void m13605e(InterfaceC3439q interfaceC3439q) {
        this.f11384u.add(interfaceC3439q);
    }

    /* renamed from: e0 */
    public final void m13606e0() {
        boolean z6;
        boolean z7;
        if (this.f11336I) {
            this.f11357d.m13851s();
            if (this.f11337J) {
                this.f11380s.mo13527g0(this);
            }
        }
        if (m13604d0()) {
            this.f11357d.m13849q();
        } else {
            this.f11357d.m13841i();
        }
        boolean z8 = this.f11373o0 || this.f11375p0;
        C3446x c3446x = this.f11368l0;
        if (!this.f11394z || this.f11345R == null || (!(z7 = this.f11336I) && !z8 && !this.f11380s.f11414g)) {
            z6 = false;
        } else {
            if (z7) {
                throw null;
            }
            z6 = true;
        }
        c3446x.f11456k = z6;
        c3446x.f11457l = z6 && z8 && !this.f11336I && m13604d0();
    }

    /* renamed from: f */
    public void m13607f(AbstractC3440r abstractC3440r) {
        if (this.f11371n0 == null) {
            this.f11371n0 = new ArrayList();
        }
        this.f11371n0.add(abstractC3440r);
    }

    /* renamed from: f0 */
    public void m13608f0(boolean z6) {
        this.f11337J = z6 | this.f11337J;
        this.f11336I = true;
        m13592T();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i7) {
        View m13710e0 = this.f11380s.m13710e0(view, i7);
        if (m13710e0 != null) {
            return m13710e0;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i7);
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            return m13590R(view, findNextFocus, i7) ? findNextFocus : super.focusSearch(view, i7);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i7);
        }
        m13621m0(findNextFocus, null);
        return view;
    }

    /* renamed from: g */
    public void m13609g(String str) {
        if (m13589Q()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m13575A());
        }
        if (this.f11339L > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(StringUtils.EMPTY + m13575A()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13610g0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.m13642x()
            android.widget.EdgeEffect r1 = r6.f11341N
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            p070K.AbstractC0814c.m3388c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.m13644y()
            android.widget.EdgeEffect r1 = r6.f11343P
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            p070K.AbstractC0814c.m3388c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.m13646z()
            android.widget.EdgeEffect r9 = r6.f11342O
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            p070K.AbstractC0814c.m3388c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.m13640w()
            android.widget.EdgeEffect r9 = r6.f11344Q
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            p070K.AbstractC0814c.m3388c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            p049H.AbstractC0475B.m1725C(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m13610g0(float, float, float, float):void");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            return abstractC3436n.mo13531n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m13575A());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            return abstractC3436n.mo13532o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m13575A());
    }

    public AbstractC3429g getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC3436n abstractC3436n = this.f11380s;
        return abstractC3436n != null ? abstractC3436n.m13717q() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i8) {
        return super.getChildDrawingOrder(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f11370n;
    }

    public C3463i getCompatAccessibilityDelegate() {
        return this.f11381s0;
    }

    public C3432j getEdgeEffectFactory() {
        return this.f11340M;
    }

    public AbstractC3433k getItemAnimator() {
        return this.f11345R;
    }

    public int getItemDecorationCount() {
        return this.f11382t.size();
    }

    public AbstractC3436n getLayoutManager() {
        return this.f11380s;
    }

    public int getMaxFlingVelocity() {
        return this.f11360e0;
    }

    public int getMinFlingVelocity() {
        return this.f11358d0;
    }

    public long getNanoTime() {
        if (f11321H0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC3438p getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f11364h0;
    }

    public C3441s getRecycledViewPool() {
        return this.f11353b.m13754f();
    }

    public int getScrollState() {
        return this.f11346S;
    }

    /* renamed from: h */
    public final void m13611h() {
        m13623n0();
        setScrollState(0);
    }

    /* renamed from: h0 */
    public final void m13612h0() {
        boolean z6;
        EdgeEffect edgeEffect = this.f11341N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z6 = this.f11341N.isFinished();
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f11342O;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z6 |= this.f11342O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f11343P;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z6 |= this.f11343P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f11344Q;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z6 |= this.f11344Q.isFinished();
        }
        if (z6) {
            AbstractC0475B.m1725C(this);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2006k();
    }

    /* renamed from: i0 */
    public void m13613i0() {
        AbstractC3433k abstractC3433k = this.f11345R;
        if (abstractC3433k != null) {
            abstractC3433k.mo13667c();
        }
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            abstractC3436n.m13727v0(this.f11353b);
            this.f11380s.m13729w0(this.f11353b);
        }
        this.f11353b.m13750b();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f11388w;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m2008m();
    }

    /* renamed from: j */
    public void m13614j(int i7, int i8) {
        boolean z6;
        EdgeEffect edgeEffect = this.f11341N;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            z6 = false;
        } else {
            this.f11341N.onRelease();
            z6 = this.f11341N.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f11343P;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f11343P.onRelease();
            z6 |= this.f11343P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f11342O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f11342O.onRelease();
            z6 |= this.f11342O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f11344Q;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f11344Q.onRelease();
            z6 |= this.f11344Q.isFinished();
        }
        if (z6) {
            AbstractC0475B.m1725C(this);
        }
    }

    /* renamed from: j0 */
    public void m13615j0(AbstractC3435m abstractC3435m) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            abstractC3436n.mo13555a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f11382t.remove(abstractC3435m);
        if (this.f11382t.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m13591S();
        requestLayout();
    }

    /* renamed from: k */
    public void m13616k() {
        if (!this.f11394z || this.f11336I) {
            AbstractC0113u.m282a("RV FullInvalidate");
            m13626p();
            AbstractC0113u.m283b();
            return;
        }
        if (this.f11357d.m13847o()) {
            if (!this.f11357d.m13846n(4) || this.f11357d.m13846n(11)) {
                if (this.f11357d.m13847o()) {
                    AbstractC0113u.m282a("RV FullInvalidate");
                    m13626p();
                    AbstractC0113u.m283b();
                    return;
                }
                return;
            }
            AbstractC0113u.m282a("RV PartialInvalidate");
            m13635t0();
            m13597Y();
            this.f11357d.m13849q();
            if (!this.f11328B) {
                if (m13582J()) {
                    m13626p();
                } else {
                    this.f11357d.m13840h();
                }
            }
            m13639v0(true);
            m13598Z();
            AbstractC0113u.m283b();
        }
    }

    /* renamed from: k0 */
    public void m13617k0(InterfaceC3439q interfaceC3439q) {
        this.f11384u.remove(interfaceC3439q);
        if (this.f11386v == interfaceC3439q) {
            this.f11386v = null;
        }
    }

    /* renamed from: l */
    public final void m13618l(Context context, String str, AttributeSet attributeSet, int i7, int i8) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m13579G = m13579G(context, trim);
            try {
                Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(m13579G).asSubclass(AbstractC3436n.class);
                try {
                    constructor = asSubclass.getConstructor(f11324K0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i7), Integer.valueOf(i8)};
                } catch (NoSuchMethodException e7) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e8) {
                        e8.initCause(e7);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m13579G, e8);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC3436n) constructor.newInstance(objArr));
            } catch (ClassCastException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m13579G, e9);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m13579G, e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m13579G, e11);
            } catch (InstantiationException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m13579G, e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m13579G, e13);
            }
        }
    }

    /* renamed from: l0 */
    public void m13619l0(AbstractC3440r abstractC3440r) {
        List list = this.f11371n0;
        if (list != null) {
            list.remove(abstractC3440r);
        }
    }

    /* renamed from: m */
    public void m13620m(int i7, int i8) {
        setMeasuredDimension(AbstractC3436n.m13680e(i7, getPaddingLeft() + getPaddingRight(), AbstractC0475B.m1757p(this)), AbstractC3436n.m13680e(i8, getPaddingTop() + getPaddingBottom(), AbstractC0475B.m1756o(this)));
    }

    /* renamed from: m0 */
    public final void m13621m0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f11374p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C3437o) {
            C3437o c3437o = (C3437o) layoutParams;
            if (!c3437o.f11431b) {
                Rect rect = c3437o.f11430a;
                Rect rect2 = this.f11374p;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f11374p);
            offsetRectIntoDescendantCoords(view, this.f11374p);
        }
        this.f11380s.m13735z0(this, view, this.f11374p, !this.f11394z, view2 == null);
    }

    /* renamed from: n */
    public void m13622n(View view) {
        int size;
        m13570E(view);
        m13596X(view);
        if (this.f11335H == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC4094d.m17162a(this.f11335H.get(size));
        throw null;
    }

    /* renamed from: n0 */
    public final void m13623n0() {
        VelocityTracker velocityTracker = this.f11348U;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m13641w0(0);
        m13612h0();
    }

    /* renamed from: o */
    public final void m13624o() {
        int i7 = this.f11332E;
        this.f11332E = 0;
        if (i7 == 0 || !m13588P()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        AbstractC0592b.m2390b(obtain, i7);
        sendAccessibilityEventUnchecked(obtain);
    }

    /* renamed from: o0 */
    public boolean m13625o0(int i7, int i8, MotionEvent motionEvent) {
        m13616k();
        if (!this.f11382t.isEmpty()) {
            invalidate();
        }
        if (m13630r(0, 0, 0, 0, this.f11387v0, 0)) {
            int i9 = this.f11352a0;
            int[] iArr = this.f11387v0;
            int i10 = iArr[0];
            this.f11352a0 = i9 - i10;
            int i11 = this.f11354b0;
            int i12 = iArr[1];
            this.f11354b0 = i11 - i12;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i10, i12);
            }
            int[] iArr2 = this.f11391x0;
            int i13 = iArr2[0];
            int[] iArr3 = this.f11387v0;
            iArr2[0] = i13 + iArr3[0];
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC0522q.m1995a(motionEvent, 8194)) {
                m13610g0(motionEvent.getX(), 0, motionEvent.getY(), 0);
            }
            m13614j(i7, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f11338K = r0
            r1 = 1
            r5.f11388w = r1
            boolean r2 = r5.f11394z
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f11394z = r1
            androidx.recyclerview.widget.RecyclerView$n r1 = r5.f11380s
            if (r1 == 0) goto L1e
            r1.m13712l(r5)
        L1e:
            r5.f11379r0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f11321H0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC3459e.f11592e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.RunnableC3459e) r1
            r5.f11366j0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f11366j0 = r1
            android.view.Display r1 = p049H.AbstractC0475B.m1752k(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f11366j0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f11596c = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f11366j0
            r0.m13898a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC3459e runnableC3459e;
        super.onDetachedFromWindow();
        AbstractC3433k abstractC3433k = this.f11345R;
        if (abstractC3433k != null) {
            abstractC3433k.mo13667c();
        }
        m13643x0();
        this.f11388w = false;
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            abstractC3436n.m13714m(this, this.f11353b);
        }
        this.f11395z0.clear();
        removeCallbacks(this.f11327A0);
        this.f11361f.m13937a();
        if (!f11321H0 || (runnableC3459e = this.f11366j0) == null) {
            return;
        }
        runnableC3459e.m13905i(this);
        this.f11366j0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f11382t.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC3435m) this.f11382t.get(i7)).m13677e(canvas, this, this.f11368l0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.f11380s
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f11330C
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.f11380s
            boolean r0 = r0.mo13557c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f11380s
            boolean r3 = r3.mo13556b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f11380s
            boolean r3 = r3.mo13557c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f11380s
            boolean r3 = r3.mo13556b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f11362f0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f11363g0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m13625o0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        if (this.f11330C) {
            return false;
        }
        if (m13634t(motionEvent)) {
            m13611h();
            return true;
        }
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n == null) {
            return false;
        }
        boolean mo13556b = abstractC3436n.mo13556b();
        boolean mo13557c = this.f11380s.mo13557c();
        if (this.f11348U == null) {
            this.f11348U = VelocityTracker.obtain();
        }
        this.f11348U.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f11331D) {
                this.f11331D = false;
            }
            this.f11347T = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.f11352a0 = x6;
            this.f11349V = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f11354b0 = y6;
            this.f11350W = y6;
            if (this.f11346S == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f11391x0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i7 = mo13556b;
            if (mo13557c) {
                i7 = (mo13556b ? 1 : 0) | 2;
            }
            m13637u0(i7, 0);
        } else if (actionMasked == 1) {
            this.f11348U.clear();
            m13641w0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f11347T);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f11347T + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x7 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y7 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f11346S != 1) {
                int i8 = x7 - this.f11349V;
                int i9 = y7 - this.f11350W;
                if (mo13556b == 0 || Math.abs(i8) <= this.f11356c0) {
                    z6 = false;
                } else {
                    this.f11352a0 = x7;
                    z6 = true;
                }
                if (mo13557c && Math.abs(i9) > this.f11356c0) {
                    this.f11354b0 = y7;
                    z6 = true;
                }
                if (z6) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m13611h();
        } else if (actionMasked == 5) {
            this.f11347T = motionEvent.getPointerId(actionIndex);
            int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f11352a0 = x8;
            this.f11349V = x8;
            int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f11354b0 = y8;
            this.f11350W = y8;
        } else if (actionMasked == 6) {
            m13600b0(motionEvent);
        }
        return this.f11346S == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        AbstractC0113u.m282a("RV OnLayout");
        m13626p();
        AbstractC0113u.m283b();
        this.f11394z = true;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n == null) {
            m13620m(i7, i8);
            return;
        }
        if (abstractC3436n.mo13549Q()) {
            View.MeasureSpec.getMode(i7);
            View.MeasureSpec.getMode(i8);
            this.f11380s.m13713l0(this.f11353b, this.f11368l0, i7, i8);
            return;
        }
        if (this.f11390x) {
            this.f11380s.m13713l0(this.f11353b, this.f11368l0, i7, i8);
            return;
        }
        if (this.f11333F) {
            m13635t0();
            m13597Y();
            m13606e0();
            m13598Z();
            C3446x c3446x = this.f11368l0;
            if (c3446x.f11457l) {
                c3446x.f11453h = true;
            } else {
                this.f11357d.m13841i();
                this.f11368l0.f11453h = false;
            }
            this.f11333F = false;
            m13639v0(false);
        } else if (this.f11368l0.f11457l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        this.f11368l0.f11451f = 0;
        m13635t0();
        this.f11380s.m13713l0(this.f11353b, this.f11368l0, i7, i8);
        m13639v0(false);
        this.f11368l0.f11453h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (m13589Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C3445w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3445w c3445w = (C3445w) parcelable;
        this.f11355c = c3445w;
        super.onRestoreInstanceState(c3445w.m4904a());
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n == null || (parcelable2 = this.f11355c.f11445c) == null) {
            return;
        }
        abstractC3436n.mo13564o0(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C3445w c3445w = new C3445w(super.onSaveInstanceState());
        C3445w c3445w2 = this.f11355c;
        if (c3445w2 != null) {
            c3445w.m13773b(c3445w2);
        } else {
            AbstractC3436n abstractC3436n = this.f11380s;
            if (abstractC3436n != null) {
                c3445w.f11445c = abstractC3436n.mo13565p0();
            } else {
                c3445w.f11445c = null;
            }
        }
        return c3445w;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        m13587O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m13626p() {
        Log.e("RecyclerView", "No adapter attached; skipping layout");
    }

    /* renamed from: p0 */
    public final void m13627p0(AbstractC3429g abstractC3429g, boolean z6, boolean z7) {
        if (!z6 || z7) {
            m13613i0();
        }
        this.f11357d.m13851s();
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            abstractC3436n.m13702U(null, null);
        }
        this.f11353b.m13763o(null, null, z6);
        this.f11368l0.f11452g = true;
    }

    /* renamed from: q */
    public boolean m13628q(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return getScrollingChildHelper().m1999d(i7, i8, iArr, iArr2, i9);
    }

    /* renamed from: q0 */
    public boolean m13629q0(AccessibilityEvent accessibilityEvent) {
        if (!m13589Q()) {
            return false;
        }
        int m2389a = accessibilityEvent != null ? AbstractC0592b.m2389a(accessibilityEvent) : 0;
        this.f11332E |= m2389a != 0 ? m2389a : 0;
        return true;
    }

    /* renamed from: r */
    public boolean m13630r(int i7, int i8, int i9, int i10, int[] iArr, int i11) {
        return getScrollingChildHelper().m2002g(i7, i8, i9, i10, iArr, i11);
    }

    /* renamed from: r0 */
    public void m13631r0(int i7, int i8) {
        m13633s0(i7, i8, null);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z6) {
        m13570E(view);
        view.clearAnimation();
        m13622n(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f11380s.m13716n0(this, this.f11368l0, view, view2) && view2 != null) {
            m13621m0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f11380s.m13733y0(this, view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        int size = this.f11384u.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((InterfaceC3439q) this.f11384u.get(i7)).mo13744c(z6);
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f11326A != 0 || this.f11330C) {
            this.f11328B = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final boolean m13632s(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        InterfaceC3439q interfaceC3439q = this.f11386v;
        if (interfaceC3439q != null) {
            if (action != 0) {
                interfaceC3439q.mo13742a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f11386v = null;
                }
                return true;
            }
            this.f11386v = null;
        }
        if (action != 0) {
            int size = this.f11384u.size();
            for (int i7 = 0; i7 < size; i7++) {
                InterfaceC3439q interfaceC3439q2 = (InterfaceC3439q) this.f11384u.get(i7);
                if (interfaceC3439q2.mo13743b(this, motionEvent)) {
                    this.f11386v = interfaceC3439q2;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: s0 */
    public void m13633s0(int i7, int i8, Interpolator interpolator) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f11330C) {
            return;
        }
        if (!abstractC3436n.mo13556b()) {
            i7 = 0;
        }
        if (!this.f11380s.mo13557c()) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        this.f11365i0.m13786h(i7, i8, interpolator);
    }

    @Override // android.view.View
    public void scrollBy(int i7, int i8) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f11330C) {
            return;
        }
        boolean mo13556b = abstractC3436n.mo13556b();
        boolean mo13557c = this.f11380s.mo13557c();
        if (mo13556b || mo13557c) {
            if (!mo13556b) {
                i7 = 0;
            }
            if (!mo13557c) {
                i8 = 0;
            }
            m13625o0(i7, i8, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m13629q0(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C3463i c3463i) {
        this.f11381s0 = c3463i;
        AbstractC0475B.m1730H(this, c3463i);
    }

    public void setAdapter(AbstractC3429g abstractC3429g) {
        setLayoutFrozen(false);
        m13627p0(abstractC3429g, false, true);
        m13608f0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC3431i interfaceC3431i) {
        if (interfaceC3431i == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f11370n) {
            m13587O();
        }
        this.f11370n = z6;
        super.setClipToPadding(z6);
        if (this.f11394z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C3432j c3432j) {
        AbstractC0343e.m1353c(c3432j);
        this.f11340M = c3432j;
        m13587O();
    }

    public void setHasFixedSize(boolean z6) {
        this.f11390x = z6;
    }

    public void setItemAnimator(AbstractC3433k abstractC3433k) {
        AbstractC3433k abstractC3433k2 = this.f11345R;
        if (abstractC3433k2 != null) {
            abstractC3433k2.mo13667c();
            this.f11345R.m13674j(null);
        }
        this.f11345R = abstractC3433k;
        if (abstractC3433k != null) {
            abstractC3433k.m13674j(this.f11377q0);
        }
    }

    public void setItemViewCacheSize(int i7) {
        this.f11353b.m13769u(i7);
    }

    public void setLayoutFrozen(boolean z6) {
        if (z6 != this.f11330C) {
            m13609g("Do not setLayoutFrozen in layout or scroll");
            if (!z6) {
                this.f11330C = false;
                this.f11328B = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f11330C = true;
            this.f11331D = true;
            m13643x0();
        }
    }

    public void setLayoutManager(AbstractC3436n abstractC3436n) {
        if (abstractC3436n == this.f11380s) {
            return;
        }
        m13643x0();
        if (this.f11380s != null) {
            AbstractC3433k abstractC3433k = this.f11345R;
            if (abstractC3433k != null) {
                abstractC3433k.mo13667c();
            }
            this.f11380s.m13727v0(this.f11353b);
            this.f11380s.m13729w0(this.f11353b);
            this.f11353b.m13750b();
            if (this.f11388w) {
                this.f11380s.m13714m(this, this.f11353b);
            }
            this.f11380s.m13686C0(null);
            this.f11380s = null;
        } else {
            this.f11353b.m13750b();
        }
        this.f11359e.m13862i();
        this.f11380s = abstractC3436n;
        if (abstractC3436n != null) {
            if (abstractC3436n.f11409b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC3436n + " is already attached to a RecyclerView:" + abstractC3436n.f11409b.m13575A());
            }
            abstractC3436n.m13686C0(this);
            if (this.f11388w) {
                this.f11380s.m13712l(this);
            }
        }
        this.f11353b.m13771w();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        getScrollingChildHelper().m2009n(z6);
    }

    public void setOnFlingListener(AbstractC3438p abstractC3438p) {
    }

    @Deprecated
    public void setOnScrollListener(AbstractC3440r abstractC3440r) {
        this.f11369m0 = abstractC3440r;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f11364h0 = z6;
    }

    public void setRecycledViewPool(C3441s c3441s) {
        this.f11353b.m13767s(c3441s);
    }

    public void setRecyclerListener(InterfaceC3443u interfaceC3443u) {
    }

    public void setScrollState(int i7) {
        if (i7 == this.f11346S) {
            return;
        }
        this.f11346S = i7;
        if (i7 != 2) {
            m13645y0();
        }
        m13636u(i7);
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                this.f11356c0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        this.f11356c0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC3447y abstractC3447y) {
        this.f11353b.m13768t(abstractC3447y);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().m2011p(i7);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m2013r();
    }

    /* renamed from: t */
    public final boolean m13634t(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f11386v = null;
        }
        int size = this.f11384u.size();
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC3439q interfaceC3439q = (InterfaceC3439q) this.f11384u.get(i7);
            if (interfaceC3439q.mo13743b(this, motionEvent) && action != 3) {
                this.f11386v = interfaceC3439q;
                return true;
            }
        }
        return false;
    }

    /* renamed from: t0 */
    public void m13635t0() {
        int i7 = this.f11326A + 1;
        this.f11326A = i7;
        if (i7 != 1 || this.f11330C) {
            return;
        }
        this.f11328B = false;
    }

    /* renamed from: u */
    public void m13636u(int i7) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            abstractC3436n.mo13718q0(i7);
        }
        m13602c0(i7);
        AbstractC3440r abstractC3440r = this.f11369m0;
        if (abstractC3440r != null) {
            abstractC3440r.m13745a(this, i7);
        }
        List list = this.f11371n0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC3440r) this.f11371n0.get(size)).m13745a(this, i7);
            }
        }
    }

    /* renamed from: u0 */
    public boolean m13637u0(int i7, int i8) {
        return getScrollingChildHelper().m2012q(i7, i8);
    }

    /* renamed from: v */
    public void m13638v() {
        int size = this.f11395z0.size() - 1;
        if (size < 0) {
            this.f11395z0.clear();
        } else {
            AbstractC4094d.m17162a(this.f11395z0.get(size));
            throw null;
        }
    }

    /* renamed from: v0 */
    public void m13639v0(boolean z6) {
        if (this.f11326A < 1) {
            this.f11326A = 1;
        }
        if (!z6 && !this.f11330C) {
            this.f11328B = false;
        }
        int i7 = this.f11326A;
        if (i7 == 1) {
            if (z6) {
                boolean z7 = this.f11328B;
            }
            if (!this.f11330C) {
                this.f11328B = false;
            }
        }
        this.f11326A = i7 - 1;
    }

    /* renamed from: w */
    public void m13640w() {
        if (this.f11344Q != null) {
            return;
        }
        EdgeEffect m13664a = this.f11340M.m13664a(this, 3);
        this.f11344Q = m13664a;
        if (this.f11370n) {
            m13664a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m13664a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: w0 */
    public void m13641w0(int i7) {
        getScrollingChildHelper().m2014s(i7);
    }

    /* renamed from: x */
    public void m13642x() {
        if (this.f11341N != null) {
            return;
        }
        EdgeEffect m13664a = this.f11340M.m13664a(this, 0);
        this.f11341N = m13664a;
        if (this.f11370n) {
            m13664a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m13664a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: x0 */
    public void m13643x0() {
        setScrollState(0);
        m13645y0();
    }

    /* renamed from: y */
    public void m13644y() {
        if (this.f11343P != null) {
            return;
        }
        EdgeEffect m13664a = this.f11340M.m13664a(this, 2);
        this.f11343P = m13664a;
        if (this.f11370n) {
            m13664a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m13664a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: y0 */
    public final void m13645y0() {
        this.f11365i0.m13787i();
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            abstractC3436n.m13688D0();
        }
    }

    /* renamed from: z */
    public void m13646z() {
        if (this.f11342O != null) {
            return;
        }
        EdgeEffect m13664a = this.f11340M.m13664a(this, 1);
        this.f11342O = m13664a;
        if (this.f11370n) {
            m13664a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m13664a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: z0 */
    public void m13647z0(int i7, int i8, Object obj) {
        int m13860g = this.f11359e.m13860g();
        for (int i9 = 0; i9 < m13860g; i9++) {
            m13570E(this.f11359e.m13859f(i9));
        }
        this.f11353b.m13772x(i7, i8);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f11351a = new C3444v();
        this.f11353b = new C3442t();
        this.f11361f = new C3467m();
        this.f11372o = new RunnableC3423a();
        this.f11374p = new Rect();
        this.f11376q = new Rect();
        this.f11378r = new RectF();
        this.f11382t = new ArrayList();
        this.f11384u = new ArrayList();
        this.f11326A = 0;
        this.f11336I = false;
        this.f11337J = false;
        this.f11338K = 0;
        this.f11339L = 0;
        this.f11340M = new C3432j();
        this.f11345R = new C3457c();
        this.f11346S = 0;
        this.f11347T = -1;
        this.f11362f0 = Float.MIN_VALUE;
        this.f11363g0 = Float.MIN_VALUE;
        boolean z6 = true;
        this.f11364h0 = true;
        this.f11365i0 = new RunnableC3448z();
        this.f11367k0 = f11321H0 ? new RunnableC3459e.b() : null;
        this.f11368l0 = new C3446x();
        this.f11373o0 = false;
        this.f11375p0 = false;
        this.f11377q0 = new C3434l();
        this.f11379r0 = false;
        this.f11383t0 = new int[2];
        this.f11387v0 = new int[2];
        this.f11389w0 = new int[2];
        this.f11391x0 = new int[2];
        this.f11393y0 = new int[2];
        this.f11395z0 = new ArrayList();
        this.f11327A0 = new RunnableC3424b();
        this.f11329B0 = new C3426d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11317D0, i7, 0);
            this.f11370n = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f11370n = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11356c0 = viewConfiguration.getScaledTouchSlop();
        this.f11362f0 = AbstractC0478E.m1807f(viewConfiguration, context);
        this.f11363g0 = AbstractC0478E.m1811j(viewConfiguration, context);
        this.f11358d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11360e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f11345R.m13674j(this.f11377q0);
        m13583K();
        m13585M();
        m13584L();
        if (AbstractC0475B.m1753l(this) == 0) {
            AbstractC0475B.m1736N(this, 1);
        }
        this.f11334G = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C3463i(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0018b.f114h, i7, 0);
            String string = obtainStyledAttributes2.getString(AbstractC0018b.f122p);
            if (obtainStyledAttributes2.getInt(AbstractC0018b.f116j, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z7 = obtainStyledAttributes2.getBoolean(AbstractC0018b.f117k, false);
            this.f11392y = z7;
            if (z7) {
                m13586N((StateListDrawable) obtainStyledAttributes2.getDrawable(AbstractC0018b.f120n), obtainStyledAttributes2.getDrawable(AbstractC0018b.f121o), (StateListDrawable) obtainStyledAttributes2.getDrawable(AbstractC0018b.f118l), obtainStyledAttributes2.getDrawable(AbstractC0018b.f119m));
            }
            obtainStyledAttributes2.recycle();
            m13618l(context, string, attributeSet, i7, 0);
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f11316C0, i7, 0);
            z6 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z6);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static class C3437o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public final Rect f11430a;

        /* renamed from: b */
        public boolean f11431b;

        /* renamed from: c */
        public boolean f11432c;

        public C3437o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11430a = new Rect();
            this.f11431b = true;
            this.f11432c = false;
        }

        /* renamed from: a */
        public int m13741a() {
            throw null;
        }

        public C3437o(int i7, int i8) {
            super(i7, i8);
            this.f11430a = new Rect();
            this.f11431b = true;
            this.f11432c = false;
        }

        public C3437o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11430a = new Rect();
            this.f11431b = true;
            this.f11432c = false;
        }

        public C3437o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11430a = new Rect();
            this.f11431b = true;
            this.f11432c = false;
        }

        public C3437o(C3437o c3437o) {
            super((ViewGroup.LayoutParams) c3437o);
            this.f11430a = new Rect();
            this.f11431b = true;
            this.f11432c = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static class C3445w extends AbstractC1290a {
        public static final Parcelable.Creator<C3445w> CREATOR = new a();

        /* renamed from: c */
        public Parcelable f11445c;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$a */
        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C3445w createFromParcel(Parcel parcel) {
                return new C3445w(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C3445w createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3445w(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C3445w[] newArray(int i7) {
                return new C3445w[i7];
            }
        }

        public C3445w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11445c = parcel.readParcelable(classLoader == null ? AbstractC3436n.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        public void m13773b(C3445w c3445w) {
            this.f11445c = c3445w.f11445c;
        }

        @Override // p098O.AbstractC1290a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeParcelable(this.f11445c, 0);
        }

        public C3445w(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC3436n abstractC3436n = this.f11380s;
        if (abstractC3436n != null) {
            return abstractC3436n.mo13533p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m13575A());
    }
}

package p291n;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.C3643a;
import java.lang.reflect.Method;
import p049H.AbstractC0475B;
import p070K.AbstractC0817f;
import p223f.AbstractC4224i;
import p283m.InterfaceC5552c;

/* renamed from: n.P */
/* loaded from: classes.dex */
public abstract class AbstractC5615P implements InterfaceC5552c {

    /* renamed from: O */
    public static Method f20294O;

    /* renamed from: P */
    public static Method f20295P;

    /* renamed from: Q */
    public static Method f20296Q;

    /* renamed from: A */
    public View f20297A;

    /* renamed from: B */
    public Drawable f20298B;

    /* renamed from: C */
    public AdapterView.OnItemClickListener f20299C;

    /* renamed from: D */
    public AdapterView.OnItemSelectedListener f20300D;

    /* renamed from: I */
    public Runnable f20305I;

    /* renamed from: J */
    public final Handler f20306J;

    /* renamed from: L */
    public Rect f20308L;

    /* renamed from: M */
    public boolean f20309M;

    /* renamed from: N */
    public PopupWindow f20310N;

    /* renamed from: a */
    public Context f20311a;

    /* renamed from: b */
    public ListAdapter f20312b;

    /* renamed from: c */
    public AbstractC5609J f20313c;

    /* renamed from: f */
    public int f20316f;

    /* renamed from: n */
    public int f20317n;

    /* renamed from: p */
    public boolean f20319p;

    /* renamed from: r */
    public boolean f20321r;

    /* renamed from: s */
    public boolean f20322s;

    /* renamed from: x */
    public View f20327x;

    /* renamed from: z */
    public DataSetObserver f20329z;

    /* renamed from: d */
    public int f20314d = -2;

    /* renamed from: e */
    public int f20315e = -2;

    /* renamed from: o */
    public int f20318o = 1002;

    /* renamed from: q */
    public boolean f20320q = true;

    /* renamed from: t */
    public int f20323t = 0;

    /* renamed from: u */
    public boolean f20324u = false;

    /* renamed from: v */
    public boolean f20325v = false;

    /* renamed from: w */
    public int f20326w = C3643a.e.API_PRIORITY_OTHER;

    /* renamed from: y */
    public int f20328y = 0;

    /* renamed from: E */
    public final g f20301E = new g();

    /* renamed from: F */
    public final f f20302F = new f();

    /* renamed from: G */
    public final e f20303G = new e();

    /* renamed from: H */
    public final c f20304H = new c();

    /* renamed from: K */
    public final Rect f20307K = new Rect();

    /* renamed from: n.P$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m23532h = AbstractC5615P.this.m23532h();
            if (m23532h == null || m23532h.getWindowToken() == null) {
                return;
            }
            AbstractC5615P.this.mo11636a();
        }
    }

    /* renamed from: n.P$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5615P.this.m23530e();
        }
    }

    /* renamed from: n.P$d */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (AbstractC5615P.this.mo11638f()) {
                AbstractC5615P.this.mo11636a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC5615P.this.dismiss();
        }
    }

    /* renamed from: n.P$f */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = AbstractC5615P.this.f20310N) != null && popupWindow.isShowing() && x6 >= 0 && x6 < AbstractC5615P.this.f20310N.getWidth() && y6 >= 0 && y6 < AbstractC5615P.this.f20310N.getHeight()) {
                AbstractC5615P abstractC5615P = AbstractC5615P.this;
                abstractC5615P.f20306J.postDelayed(abstractC5615P.f20301E, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            AbstractC5615P abstractC5615P2 = AbstractC5615P.this;
            abstractC5615P2.f20306J.removeCallbacks(abstractC5615P2.f20301E);
            return false;
        }
    }

    /* renamed from: n.P$g */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5609J abstractC5609J = AbstractC5615P.this.f20313c;
            if (abstractC5609J == null || !AbstractC0475B.m1764w(abstractC5609J) || AbstractC5615P.this.f20313c.getCount() <= AbstractC5615P.this.f20313c.getChildCount()) {
                return;
            }
            int childCount = AbstractC5615P.this.f20313c.getChildCount();
            AbstractC5615P abstractC5615P = AbstractC5615P.this;
            if (childCount <= abstractC5615P.f20326w) {
                abstractC5615P.f20310N.setInputMethodMode(2);
                AbstractC5615P.this.mo11636a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f20294O = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f20296Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f20295P = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC5615P(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f20311a = context;
        this.f20306J = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4224i.f14244I0, i7, i8);
        this.f20316f = obtainStyledAttributes.getDimensionPixelOffset(AbstractC4224i.f14248J0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC4224i.f14252K0, 0);
        this.f20317n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f20319p = true;
        }
        obtainStyledAttributes.recycle();
        C5643j c5643j = new C5643j(context, attributeSet, i7, i8);
        this.f20310N = c5643j;
        c5643j.setInputMethodMode(1);
    }

    /* renamed from: A */
    public void m23525A(boolean z6) {
        this.f20322s = true;
        this.f20321r = z6;
    }

    /* renamed from: B */
    public final void m23526B(boolean z6) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f20310N.setIsClippedToScreen(z6);
            return;
        }
        Method method = f20294O;
        if (method != null) {
            try {
                method.invoke(this.f20310N, Boolean.valueOf(z6));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: C */
    public void m23527C(int i7) {
        this.f20317n = i7;
        this.f20319p = true;
    }

    /* renamed from: D */
    public void m23528D(int i7) {
        this.f20315e = i7;
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: a */
    public void mo11636a() {
        int m23529d = m23529d();
        boolean m23536m = m23536m();
        AbstractC0817f.m3403b(this.f20310N, this.f20318o);
        if (this.f20310N.isShowing()) {
            if (AbstractC0475B.m1764w(m23532h())) {
                int i7 = this.f20315e;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = m23532h().getWidth();
                }
                int i8 = this.f20314d;
                if (i8 == -1) {
                    if (!m23536m) {
                        m23529d = -1;
                    }
                    if (m23536m) {
                        this.f20310N.setWidth(this.f20315e == -1 ? -1 : 0);
                        this.f20310N.setHeight(0);
                    } else {
                        this.f20310N.setWidth(this.f20315e == -1 ? -1 : 0);
                        this.f20310N.setHeight(-1);
                    }
                } else if (i8 != -2) {
                    m23529d = i8;
                }
                this.f20310N.setOutsideTouchable((this.f20325v || this.f20324u) ? false : true);
                this.f20310N.update(m23532h(), this.f20316f, this.f20317n, i7 < 0 ? -1 : i7, m23529d < 0 ? -1 : m23529d);
                return;
            }
            return;
        }
        int i9 = this.f20315e;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = m23532h().getWidth();
        }
        int i10 = this.f20314d;
        if (i10 == -1) {
            m23529d = -1;
        } else if (i10 != -2) {
            m23529d = i10;
        }
        this.f20310N.setWidth(i9);
        this.f20310N.setHeight(m23529d);
        m23526B(true);
        this.f20310N.setOutsideTouchable((this.f20325v || this.f20324u) ? false : true);
        this.f20310N.setTouchInterceptor(this.f20302F);
        if (this.f20322s) {
            AbstractC0817f.m3402a(this.f20310N, this.f20321r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f20296Q;
            if (method != null) {
                try {
                    method.invoke(this.f20310N, this.f20308L);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            this.f20310N.setEpicenterBounds(this.f20308L);
        }
        AbstractC0817f.m3404c(this.f20310N, m23532h(), this.f20316f, this.f20317n, this.f20323t);
        this.f20313c.setSelection(-1);
        if (!this.f20309M || this.f20313c.isInTouchMode()) {
            m23530e();
        }
        if (this.f20309M) {
            return;
        }
        this.f20306J.post(this.f20304H);
    }

    /* renamed from: d */
    public final int m23529d() {
        int i7;
        int i8;
        int makeMeasureSpec;
        int i9;
        if (this.f20313c == null) {
            Context context = this.f20311a;
            this.f20305I = new a();
            AbstractC5609J mo23531g = mo23531g(context, !this.f20309M);
            this.f20313c = mo23531g;
            Drawable drawable = this.f20298B;
            if (drawable != null) {
                mo23531g.setSelector(drawable);
            }
            this.f20313c.setAdapter(this.f20312b);
            this.f20313c.setOnItemClickListener(this.f20299C);
            this.f20313c.setFocusable(true);
            this.f20313c.setFocusableInTouchMode(true);
            this.f20313c.setOnItemSelectedListener(new b());
            this.f20313c.setOnScrollListener(this.f20303G);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f20300D;
            if (onItemSelectedListener != null) {
                this.f20313c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f20313c;
            View view2 = this.f20327x;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i10 = this.f20328y;
                if (i10 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i10 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f20328y);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i11 = this.f20315e;
                if (i11 >= 0) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i11 = 0;
                    i9 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i11, i9), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i7 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i7 = 0;
            }
            this.f20310N.setContentView(view);
        } else {
            View view3 = this.f20327x;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i7 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i7 = 0;
            }
        }
        Drawable background = this.f20310N.getBackground();
        if (background != null) {
            background.getPadding(this.f20307K);
            Rect rect = this.f20307K;
            int i12 = rect.top;
            i8 = rect.bottom + i12;
            if (!this.f20319p) {
                this.f20317n = -i12;
            }
        } else {
            this.f20307K.setEmpty();
            i8 = 0;
        }
        int m23534k = m23534k(m23532h(), this.f20317n, this.f20310N.getInputMethodMode() == 2);
        if (this.f20324u || this.f20314d == -1) {
            return m23534k + i8;
        }
        int i13 = this.f20315e;
        if (i13 == -2) {
            int i14 = this.f20311a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f20307K;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i13 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else {
            int i15 = this.f20311a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f20307K;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - (rect3.left + rect3.right), 1073741824);
        }
        int mo23503d = this.f20313c.mo23503d(makeMeasureSpec, 0, -1, m23534k - i7, -1);
        if (mo23503d > 0) {
            i7 += i8 + this.f20313c.getPaddingTop() + this.f20313c.getPaddingBottom();
        }
        return mo23503d + i7;
    }

    @Override // p283m.InterfaceC5552c
    public void dismiss() {
        this.f20310N.dismiss();
        m23538o();
        this.f20310N.setContentView(null);
        this.f20313c = null;
        this.f20306J.removeCallbacks(this.f20301E);
    }

    /* renamed from: e */
    public void m23530e() {
        AbstractC5609J abstractC5609J = this.f20313c;
        if (abstractC5609J != null) {
            abstractC5609J.setListSelectionHidden(true);
            abstractC5609J.requestLayout();
        }
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: f */
    public boolean mo11638f() {
        return this.f20310N.isShowing();
    }

    /* renamed from: g */
    public abstract AbstractC5609J mo23531g(Context context, boolean z6);

    /* renamed from: h */
    public View m23532h() {
        return this.f20297A;
    }

    /* renamed from: i */
    public int m23533i() {
        return this.f20316f;
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: j */
    public ListView mo11639j() {
        return this.f20313c;
    }

    /* renamed from: k */
    public final int m23534k(View view, int i7, boolean z6) {
        int maxAvailableHeight;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = this.f20310N.getMaxAvailableHeight(view, i7, z6);
            return maxAvailableHeight;
        }
        Method method = f20295P;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f20310N, view, Integer.valueOf(i7), Boolean.valueOf(z6))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f20310N.getMaxAvailableHeight(view, i7);
    }

    /* renamed from: l */
    public int m23535l() {
        if (this.f20319p) {
            return this.f20317n;
        }
        return 0;
    }

    /* renamed from: m */
    public boolean m23536m() {
        return this.f20310N.getInputMethodMode() == 2;
    }

    /* renamed from: n */
    public boolean m23537n() {
        return this.f20309M;
    }

    /* renamed from: o */
    public final void m23538o() {
        View view = this.f20327x;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f20327x);
            }
        }
    }

    /* renamed from: p */
    public void m23539p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f20329z;
        if (dataSetObserver == null) {
            this.f20329z = new d();
        } else {
            ListAdapter listAdapter2 = this.f20312b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f20312b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f20329z);
        }
        AbstractC5609J abstractC5609J = this.f20313c;
        if (abstractC5609J != null) {
            abstractC5609J.setAdapter(this.f20312b);
        }
    }

    /* renamed from: q */
    public void m23540q(View view) {
        this.f20297A = view;
    }

    /* renamed from: r */
    public void m23541r(int i7) {
        this.f20310N.setAnimationStyle(i7);
    }

    /* renamed from: s */
    public void m23542s(int i7) {
        Drawable background = this.f20310N.getBackground();
        if (background == null) {
            m23528D(i7);
            return;
        }
        background.getPadding(this.f20307K);
        Rect rect = this.f20307K;
        this.f20315e = rect.left + rect.right + i7;
    }

    /* renamed from: t */
    public void m23543t(int i7) {
        this.f20323t = i7;
    }

    /* renamed from: u */
    public void m23544u(Rect rect) {
        this.f20308L = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: v */
    public void m23545v(int i7) {
        this.f20316f = i7;
    }

    /* renamed from: w */
    public void m23546w(int i7) {
        this.f20310N.setInputMethodMode(i7);
    }

    /* renamed from: x */
    public void m23547x(boolean z6) {
        this.f20309M = z6;
        this.f20310N.setFocusable(z6);
    }

    /* renamed from: y */
    public void m23548y(PopupWindow.OnDismissListener onDismissListener) {
        this.f20310N.setOnDismissListener(onDismissListener);
    }

    /* renamed from: z */
    public void m23549z(AdapterView.OnItemClickListener onItemClickListener) {
        this.f20299C = onItemClickListener;
    }

    /* renamed from: n.P$b */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            AbstractC5609J abstractC5609J;
            if (i7 == -1 || (abstractC5609J = AbstractC5615P.this.f20313c) == null) {
                return;
            }
            abstractC5609J.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: n.P$e */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i7) {
            if (i7 != 1 || AbstractC5615P.this.m23536m() || AbstractC5615P.this.f20310N.getContentView() == null) {
                return;
            }
            AbstractC5615P abstractC5615P = AbstractC5615P.this;
            abstractC5615P.f20306J.removeCallbacks(abstractC5615P.f20301E);
            AbstractC5615P.this.f20301E.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        }
    }
}

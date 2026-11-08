package p291n;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.C3643a;
import p049H.AbstractC0475B;
import p049H.AbstractC0478E;

/* renamed from: n.g0 */
/* loaded from: classes.dex */
public class ViewOnLongClickListenerC5638g0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: q */
    public static ViewOnLongClickListenerC5638g0 f20434q;

    /* renamed from: r */
    public static ViewOnLongClickListenerC5638g0 f20435r;

    /* renamed from: a */
    public final View f20436a;

    /* renamed from: b */
    public final CharSequence f20437b;

    /* renamed from: c */
    public final int f20438c;

    /* renamed from: d */
    public final Runnable f20439d = new a();

    /* renamed from: e */
    public final Runnable f20440e = new b();

    /* renamed from: f */
    public int f20441f;

    /* renamed from: n */
    public int f20442n;

    /* renamed from: o */
    public C5640h0 f20443o;

    /* renamed from: p */
    public boolean f20444p;

    /* renamed from: n.g0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC5638g0.this.m23677g(false);
        }
    }

    /* renamed from: n.g0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC5638g0.this.m23675c();
        }
    }

    public ViewOnLongClickListenerC5638g0(View view, CharSequence charSequence) {
        this.f20436a = view;
        this.f20437b = charSequence;
        this.f20438c = AbstractC0478E.m1808g(ViewConfiguration.get(view.getContext()));
        m23674b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: e */
    public static void m23671e(ViewOnLongClickListenerC5638g0 viewOnLongClickListenerC5638g0) {
        ViewOnLongClickListenerC5638g0 viewOnLongClickListenerC5638g02 = f20434q;
        if (viewOnLongClickListenerC5638g02 != null) {
            viewOnLongClickListenerC5638g02.m23673a();
        }
        f20434q = viewOnLongClickListenerC5638g0;
        if (viewOnLongClickListenerC5638g0 != null) {
            viewOnLongClickListenerC5638g0.m23676d();
        }
    }

    /* renamed from: f */
    public static void m23672f(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC5638g0 viewOnLongClickListenerC5638g0 = f20434q;
        if (viewOnLongClickListenerC5638g0 != null && viewOnLongClickListenerC5638g0.f20436a == view) {
            m23671e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC5638g0(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC5638g0 viewOnLongClickListenerC5638g02 = f20435r;
        if (viewOnLongClickListenerC5638g02 != null && viewOnLongClickListenerC5638g02.f20436a == view) {
            viewOnLongClickListenerC5638g02.m23675c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: a */
    public final void m23673a() {
        this.f20436a.removeCallbacks(this.f20439d);
    }

    /* renamed from: b */
    public final void m23674b() {
        this.f20441f = C3643a.e.API_PRIORITY_OTHER;
        this.f20442n = C3643a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: c */
    public void m23675c() {
        if (f20435r == this) {
            f20435r = null;
            C5640h0 c5640h0 = this.f20443o;
            if (c5640h0 != null) {
                c5640h0.m23691c();
                this.f20443o = null;
                m23674b();
                this.f20436a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f20434q == this) {
            m23671e(null);
        }
        this.f20436a.removeCallbacks(this.f20440e);
    }

    /* renamed from: d */
    public final void m23676d() {
        this.f20436a.postDelayed(this.f20439d, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: g */
    public void m23677g(boolean z6) {
        long longPressTimeout;
        long j7;
        long j8;
        if (AbstractC0475B.m1764w(this.f20436a)) {
            m23671e(null);
            ViewOnLongClickListenerC5638g0 viewOnLongClickListenerC5638g0 = f20435r;
            if (viewOnLongClickListenerC5638g0 != null) {
                viewOnLongClickListenerC5638g0.m23675c();
            }
            f20435r = this;
            this.f20444p = z6;
            C5640h0 c5640h0 = new C5640h0(this.f20436a.getContext());
            this.f20443o = c5640h0;
            c5640h0.m23693e(this.f20436a, this.f20441f, this.f20442n, this.f20444p, this.f20437b);
            this.f20436a.addOnAttachStateChangeListener(this);
            if (this.f20444p) {
                j8 = 2500;
            } else {
                if ((AbstractC0475B.m1761t(this.f20436a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 15000;
                }
                j8 = j7 - longPressTimeout;
            }
            this.f20436a.removeCallbacks(this.f20440e);
            this.f20436a.postDelayed(this.f20440e, j8);
        }
    }

    /* renamed from: h */
    public final boolean m23678h(MotionEvent motionEvent) {
        int x6 = (int) motionEvent.getX();
        int y6 = (int) motionEvent.getY();
        if (Math.abs(x6 - this.f20441f) <= this.f20438c && Math.abs(y6 - this.f20442n) <= this.f20438c) {
            return false;
        }
        this.f20441f = x6;
        this.f20442n = y6;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f20443o != null && this.f20444p) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f20436a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m23674b();
                m23675c();
            }
        } else if (this.f20436a.isEnabled() && this.f20443o == null && m23678h(motionEvent)) {
            m23671e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f20441f = view.getWidth() / 2;
        this.f20442n = view.getHeight() / 2;
        m23677g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m23675c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}

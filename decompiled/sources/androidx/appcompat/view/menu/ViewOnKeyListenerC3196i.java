package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC3194g;
import p049H.AbstractC0475B;
import p223f.AbstractC4218c;
import p223f.AbstractC4221f;
import p283m.AbstractC5551b;
import p291n.C5618T;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC3196i extends AbstractC5551b implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC3194g, View.OnKeyListener {

    /* renamed from: C */
    public static final int f9961C = AbstractC4221f.f14194j;

    /* renamed from: B */
    public boolean f9963B;

    /* renamed from: b */
    public final Context f9964b;

    /* renamed from: c */
    public final C3191d f9965c;

    /* renamed from: d */
    public final C3190c f9966d;

    /* renamed from: e */
    public final boolean f9967e;

    /* renamed from: f */
    public final int f9968f;

    /* renamed from: n */
    public final int f9969n;

    /* renamed from: o */
    public final int f9970o;

    /* renamed from: p */
    public final C5618T f9971p;

    /* renamed from: s */
    public PopupWindow.OnDismissListener f9974s;

    /* renamed from: t */
    public View f9975t;

    /* renamed from: u */
    public View f9976u;

    /* renamed from: v */
    public InterfaceC3194g.a f9977v;

    /* renamed from: w */
    public ViewTreeObserver f9978w;

    /* renamed from: x */
    public boolean f9979x;

    /* renamed from: y */
    public boolean f9980y;

    /* renamed from: z */
    public int f9981z;

    /* renamed from: q */
    public final ViewTreeObserver.OnGlobalLayoutListener f9972q = new a();

    /* renamed from: r */
    public final View.OnAttachStateChangeListener f9973r = new b();

    /* renamed from: A */
    public int f9962A = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC3196i.this.mo11638f() || ViewOnKeyListenerC3196i.this.f9971p.m23537n()) {
                return;
            }
            View view = ViewOnKeyListenerC3196i.this.f9976u;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC3196i.this.dismiss();
            } else {
                ViewOnKeyListenerC3196i.this.f9971p.mo11636a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.i$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC3196i.this.f9978w;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC3196i.this.f9978w = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC3196i viewOnKeyListenerC3196i = ViewOnKeyListenerC3196i.this;
                viewOnKeyListenerC3196i.f9978w.removeGlobalOnLayoutListener(viewOnKeyListenerC3196i.f9972q);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC3196i(Context context, C3191d c3191d, View view, int i7, int i8, boolean z6) {
        this.f9964b = context;
        this.f9965c = c3191d;
        this.f9967e = z6;
        this.f9966d = new C3190c(c3191d, LayoutInflater.from(context), z6, f9961C);
        this.f9969n = i7;
        this.f9970o = i8;
        Resources resources = context.getResources();
        this.f9968f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC4218c.f14102b));
        this.f9975t = view;
        this.f9971p = new C5618T(context, null, i7, i8);
        c3191d.m11682b(this, context);
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: a */
    public void mo11636a() {
        if (!m11750z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: b */
    public void mo11617b(C3191d c3191d, boolean z6) {
        if (c3191d != this.f9965c) {
            return;
        }
        dismiss();
        InterfaceC3194g.a aVar = this.f9977v;
        if (aVar != null) {
            aVar.mo11748b(c3191d, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: c */
    public void mo11618c(boolean z6) {
        this.f9980y = false;
        C3190c c3190c = this.f9966d;
        if (c3190c != null) {
            c3190c.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: d */
    public boolean mo11637d() {
        return false;
    }

    @Override // p283m.InterfaceC5552c
    public void dismiss() {
        if (mo11638f()) {
            this.f9971p.dismiss();
        }
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: f */
    public boolean mo11638f() {
        return !this.f9979x && this.f9971p.mo11638f();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: h */
    public void mo11622h(InterfaceC3194g.a aVar) {
        this.f9977v = aVar;
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: j */
    public ListView mo11639j() {
        return this.f9971p.mo11639j();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: k */
    public boolean mo11625k(SubMenuC3197j subMenuC3197j) {
        if (subMenuC3197j.hasVisibleItems()) {
            C3193f c3193f = new C3193f(this.f9964b, subMenuC3197j, this.f9976u, this.f9967e, this.f9969n, this.f9970o);
            c3193f.m11743j(this.f9977v);
            c3193f.m11740g(AbstractC5551b.m23268x(subMenuC3197j));
            c3193f.m11742i(this.f9974s);
            this.f9974s = null;
            this.f9965c.m11684d(false);
            int m23533i = this.f9971p.m23533i();
            int m23535l = this.f9971p.m23535l();
            if ((Gravity.getAbsoluteGravity(this.f9962A, AbstractC0475B.m1755n(this.f9975t)) & 7) == 5) {
                m23533i += this.f9975t.getWidth();
            }
            if (c3193f.m11747n(m23533i, m23535l)) {
                InterfaceC3194g.a aVar = this.f9977v;
                if (aVar == null) {
                    return true;
                }
                aVar.mo11749c(subMenuC3197j);
                return true;
            }
        }
        return false;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: l */
    public void mo11640l(C3191d c3191d) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f9979x = true;
        this.f9965c.close();
        ViewTreeObserver viewTreeObserver = this.f9978w;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9978w = this.f9976u.getViewTreeObserver();
            }
            this.f9978w.removeGlobalOnLayoutListener(this.f9972q);
            this.f9978w = null;
        }
        this.f9976u.removeOnAttachStateChangeListener(this.f9973r);
        PopupWindow.OnDismissListener onDismissListener = this.f9974s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: p */
    public void mo11642p(View view) {
        this.f9975t = view;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: r */
    public void mo11643r(boolean z6) {
        this.f9966d.m11656d(z6);
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: s */
    public void mo11644s(int i7) {
        this.f9962A = i7;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: t */
    public void mo11645t(int i7) {
        this.f9971p.m23545v(i7);
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: u */
    public void mo11646u(PopupWindow.OnDismissListener onDismissListener) {
        this.f9974s = onDismissListener;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: v */
    public void mo11647v(boolean z6) {
        this.f9963B = z6;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: w */
    public void mo11648w(int i7) {
        this.f9971p.m23527C(i7);
    }

    /* renamed from: z */
    public final boolean m11750z() {
        View view;
        if (mo11638f()) {
            return true;
        }
        if (this.f9979x || (view = this.f9975t) == null) {
            return false;
        }
        this.f9976u = view;
        this.f9971p.m23548y(this);
        this.f9971p.m23549z(this);
        this.f9971p.m23547x(true);
        View view2 = this.f9976u;
        boolean z6 = this.f9978w == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9978w = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9972q);
        }
        view2.addOnAttachStateChangeListener(this.f9973r);
        this.f9971p.m23540q(view2);
        this.f9971p.m23543t(this.f9962A);
        if (!this.f9980y) {
            this.f9981z = AbstractC5551b.m23267o(this.f9966d, null, this.f9964b, this.f9968f);
            this.f9980y = true;
        }
        this.f9971p.m23542s(this.f9981z);
        this.f9971p.m23546w(2);
        this.f9971p.m23544u(m23270n());
        this.f9971p.mo11636a();
        ListView mo11639j = this.f9971p.mo11639j();
        mo11639j.setOnKeyListener(this);
        if (this.f9963B && this.f9965c.m11700u() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f9964b).inflate(AbstractC4221f.f14193i, (ViewGroup) mo11639j, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f9965c.m11700u());
            }
            frameLayout.setEnabled(false);
            mo11639j.addHeaderView(frameLayout, null, false);
        }
        this.f9971p.m23539p(this.f9966d);
        this.f9971p.mo11636a();
        return true;
    }
}

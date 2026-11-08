package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC3194g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p049H.AbstractC0475B;
import p049H.AbstractC0514i;
import p223f.AbstractC4218c;
import p223f.AbstractC4221f;
import p283m.AbstractC5551b;
import p291n.C5618T;
import p291n.InterfaceC5616Q;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC3189b extends AbstractC5551b implements InterfaceC3194g, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: I */
    public static final int f9848I = AbstractC4221f.f14189e;

    /* renamed from: A */
    public int f9849A;

    /* renamed from: B */
    public int f9850B;

    /* renamed from: D */
    public boolean f9852D;

    /* renamed from: E */
    public InterfaceC3194g.a f9853E;

    /* renamed from: F */
    public ViewTreeObserver f9854F;

    /* renamed from: G */
    public PopupWindow.OnDismissListener f9855G;

    /* renamed from: H */
    public boolean f9856H;

    /* renamed from: b */
    public final Context f9857b;

    /* renamed from: c */
    public final int f9858c;

    /* renamed from: d */
    public final int f9859d;

    /* renamed from: e */
    public final int f9860e;

    /* renamed from: f */
    public final boolean f9861f;

    /* renamed from: n */
    public final Handler f9862n;

    /* renamed from: v */
    public View f9870v;

    /* renamed from: w */
    public View f9871w;

    /* renamed from: y */
    public boolean f9873y;

    /* renamed from: z */
    public boolean f9874z;

    /* renamed from: o */
    public final List f9863o = new ArrayList();

    /* renamed from: p */
    public final List f9864p = new ArrayList();

    /* renamed from: q */
    public final ViewTreeObserver.OnGlobalLayoutListener f9865q = new a();

    /* renamed from: r */
    public final View.OnAttachStateChangeListener f9866r = new b();

    /* renamed from: s */
    public final InterfaceC5616Q f9867s = new c();

    /* renamed from: t */
    public int f9868t = 0;

    /* renamed from: u */
    public int f9869u = 0;

    /* renamed from: C */
    public boolean f9851C = false;

    /* renamed from: x */
    public int f9872x = m11633D();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC3189b.this.mo11638f() || ViewOnKeyListenerC3189b.this.f9864p.size() <= 0 || ((d) ViewOnKeyListenerC3189b.this.f9864p.get(0)).f9882a.m23537n()) {
                return;
            }
            View view = ViewOnKeyListenerC3189b.this.f9871w;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC3189b.this.dismiss();
                return;
            }
            Iterator it = ViewOnKeyListenerC3189b.this.f9864p.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f9882a.mo11636a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC3189b.this.f9854F;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC3189b.this.f9854F = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC3189b viewOnKeyListenerC3189b = ViewOnKeyListenerC3189b.this;
                viewOnKeyListenerC3189b.f9854F.removeGlobalOnLayoutListener(viewOnKeyListenerC3189b.f9865q);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements InterfaceC5616Q {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ d f9878a;

            /* renamed from: b */
            public final /* synthetic */ MenuItem f9879b;

            /* renamed from: c */
            public final /* synthetic */ C3191d f9880c;

            public a(d dVar, MenuItem menuItem, C3191d c3191d) {
                this.f9878a = dVar;
                this.f9879b = menuItem;
                this.f9880c = c3191d;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f9878a;
                if (dVar != null) {
                    ViewOnKeyListenerC3189b.this.f9856H = true;
                    dVar.f9883b.m11684d(false);
                    ViewOnKeyListenerC3189b.this.f9856H = false;
                }
                if (this.f9879b.isEnabled() && this.f9879b.hasSubMenu()) {
                    this.f9880c.m11666H(this.f9879b, 4);
                }
            }
        }

        public c() {
        }

        @Override // p291n.InterfaceC5616Q
        /* renamed from: b */
        public void mo11650b(C3191d c3191d, MenuItem menuItem) {
            ViewOnKeyListenerC3189b.this.f9862n.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC3189b.this.f9864p.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                } else if (c3191d == ((d) ViewOnKeyListenerC3189b.this.f9864p.get(i7)).f9883b) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                return;
            }
            int i8 = i7 + 1;
            ViewOnKeyListenerC3189b.this.f9862n.postAtTime(new a(i8 < ViewOnKeyListenerC3189b.this.f9864p.size() ? (d) ViewOnKeyListenerC3189b.this.f9864p.get(i8) : null, menuItem, c3191d), c3191d, SystemClock.uptimeMillis() + 200);
        }

        @Override // p291n.InterfaceC5616Q
        /* renamed from: c */
        public void mo11651c(C3191d c3191d, MenuItem menuItem) {
            ViewOnKeyListenerC3189b.this.f9862n.removeCallbacksAndMessages(c3191d);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class d {

        /* renamed from: a */
        public final C5618T f9882a;

        /* renamed from: b */
        public final C3191d f9883b;

        /* renamed from: c */
        public final int f9884c;

        public d(C5618T c5618t, C3191d c3191d, int i7) {
            this.f9882a = c5618t;
            this.f9883b = c3191d;
            this.f9884c = i7;
        }

        /* renamed from: a */
        public ListView m11652a() {
            return this.f9882a.mo11639j();
        }
    }

    public ViewOnKeyListenerC3189b(Context context, View view, int i7, int i8, boolean z6) {
        this.f9857b = context;
        this.f9870v = view;
        this.f9859d = i7;
        this.f9860e = i8;
        this.f9861f = z6;
        Resources resources = context.getResources();
        this.f9858c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC4218c.f14102b));
        this.f9862n = new Handler();
    }

    /* renamed from: A */
    public final int m11630A(C3191d c3191d) {
        int size = this.f9864p.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (c3191d == ((d) this.f9864p.get(i7)).f9883b) {
                return i7;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final MenuItem m11631B(C3191d c3191d, C3191d c3191d2) {
        int size = c3191d.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = c3191d.getItem(i7);
            if (item.hasSubMenu() && c3191d2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: C */
    public final View m11632C(d dVar, C3191d c3191d) {
        C3190c c3190c;
        int i7;
        int firstVisiblePosition;
        MenuItem m11631B = m11631B(dVar.f9883b, c3191d);
        if (m11631B == null) {
            return null;
        }
        ListView m11652a = dVar.m11652a();
        ListAdapter adapter = m11652a.getAdapter();
        int i8 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i7 = headerViewListAdapter.getHeadersCount();
            c3190c = (C3190c) headerViewListAdapter.getWrappedAdapter();
        } else {
            c3190c = (C3190c) adapter;
            i7 = 0;
        }
        int count = c3190c.getCount();
        while (true) {
            if (i8 >= count) {
                i8 = -1;
                break;
            }
            if (m11631B == c3190c.getItem(i8)) {
                break;
            }
            i8++;
        }
        if (i8 != -1 && (firstVisiblePosition = (i8 + i7) - m11652a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m11652a.getChildCount()) {
            return m11652a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: D */
    public final int m11633D() {
        return AbstractC0475B.m1755n(this.f9870v) == 1 ? 0 : 1;
    }

    /* renamed from: E */
    public final int m11634E(int i7) {
        List list = this.f9864p;
        ListView m11652a = ((d) list.get(list.size() - 1)).m11652a();
        int[] iArr = new int[2];
        m11652a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f9871w.getWindowVisibleDisplayFrame(rect);
        return this.f9872x == 1 ? (iArr[0] + m11652a.getWidth()) + i7 > rect.right ? 0 : 1 : iArr[0] - i7 < 0 ? 1 : 0;
    }

    /* renamed from: F */
    public final void m11635F(C3191d c3191d) {
        d dVar;
        View view;
        int i7;
        int i8;
        int i9;
        LayoutInflater from = LayoutInflater.from(this.f9857b);
        C3190c c3190c = new C3190c(c3191d, from, this.f9861f, f9848I);
        if (!mo11638f() && this.f9851C) {
            c3190c.m11656d(true);
        } else if (mo11638f()) {
            c3190c.m11656d(AbstractC5551b.m23268x(c3191d));
        }
        int m23267o = AbstractC5551b.m23267o(c3190c, null, this.f9857b, this.f9858c);
        C5618T m11649z = m11649z();
        m11649z.m23539p(c3190c);
        m11649z.m23542s(m23267o);
        m11649z.m23543t(this.f9869u);
        if (this.f9864p.size() > 0) {
            List list = this.f9864p;
            dVar = (d) list.get(list.size() - 1);
            view = m11632C(dVar, c3191d);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            m11649z.m23554H(false);
            m11649z.m23551E(null);
            int m11634E = m11634E(m23267o);
            boolean z6 = m11634E == 1;
            this.f9872x = m11634E;
            if (Build.VERSION.SDK_INT >= 26) {
                m11649z.m23540q(view);
                i8 = 0;
                i7 = 0;
            } else {
                int[] iArr = new int[2];
                this.f9870v.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f9869u & 7) == 5) {
                    iArr[0] = iArr[0] + this.f9870v.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i7 = iArr2[0] - iArr[0];
                i8 = iArr2[1] - iArr[1];
            }
            if ((this.f9869u & 5) == 5) {
                if (!z6) {
                    m23267o = view.getWidth();
                    i9 = i7 - m23267o;
                }
                i9 = i7 + m23267o;
            } else {
                if (z6) {
                    m23267o = view.getWidth();
                    i9 = i7 + m23267o;
                }
                i9 = i7 - m23267o;
            }
            m11649z.m23545v(i9);
            m11649z.m23525A(true);
            m11649z.m23527C(i8);
        } else {
            if (this.f9873y) {
                m11649z.m23545v(this.f9849A);
            }
            if (this.f9874z) {
                m11649z.m23527C(this.f9850B);
            }
            m11649z.m23544u(m23270n());
        }
        this.f9864p.add(new d(m11649z, c3191d, this.f9872x));
        m11649z.mo11636a();
        ListView mo11639j = m11649z.mo11639j();
        mo11639j.setOnKeyListener(this);
        if (dVar == null && this.f9852D && c3191d.m11700u() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(AbstractC4221f.f14193i, (ViewGroup) mo11639j, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c3191d.m11700u());
            mo11639j.addHeaderView(frameLayout, null, false);
            m11649z.mo11636a();
        }
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: a */
    public void mo11636a() {
        if (mo11638f()) {
            return;
        }
        Iterator it = this.f9863o.iterator();
        while (it.hasNext()) {
            m11635F((C3191d) it.next());
        }
        this.f9863o.clear();
        View view = this.f9870v;
        this.f9871w = view;
        if (view != null) {
            boolean z6 = this.f9854F == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f9854F = viewTreeObserver;
            if (z6) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f9865q);
            }
            this.f9871w.addOnAttachStateChangeListener(this.f9866r);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: b */
    public void mo11617b(C3191d c3191d, boolean z6) {
        int m11630A = m11630A(c3191d);
        if (m11630A < 0) {
            return;
        }
        int i7 = m11630A + 1;
        if (i7 < this.f9864p.size()) {
            ((d) this.f9864p.get(i7)).f9883b.m11684d(false);
        }
        d dVar = (d) this.f9864p.remove(m11630A);
        dVar.f9883b.m11669K(this);
        if (this.f9856H) {
            dVar.f9882a.m23552F(null);
            dVar.f9882a.m23541r(0);
        }
        dVar.f9882a.dismiss();
        int size = this.f9864p.size();
        if (size > 0) {
            this.f9872x = ((d) this.f9864p.get(size - 1)).f9884c;
        } else {
            this.f9872x = m11633D();
        }
        if (size != 0) {
            if (z6) {
                ((d) this.f9864p.get(0)).f9883b.m11684d(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC3194g.a aVar = this.f9853E;
        if (aVar != null) {
            aVar.mo11748b(c3191d, true);
        }
        ViewTreeObserver viewTreeObserver = this.f9854F;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f9854F.removeGlobalOnLayoutListener(this.f9865q);
            }
            this.f9854F = null;
        }
        this.f9871w.removeOnAttachStateChangeListener(this.f9866r);
        this.f9855G.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: c */
    public void mo11618c(boolean z6) {
        Iterator it = this.f9864p.iterator();
        while (it.hasNext()) {
            AbstractC5551b.m23269y(((d) it.next()).m11652a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: d */
    public boolean mo11637d() {
        return false;
    }

    @Override // p283m.InterfaceC5552c
    public void dismiss() {
        int size = this.f9864p.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f9864p.toArray(new d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                d dVar = dVarArr[i7];
                if (dVar.f9882a.mo11638f()) {
                    dVar.f9882a.dismiss();
                }
            }
        }
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: f */
    public boolean mo11638f() {
        return this.f9864p.size() > 0 && ((d) this.f9864p.get(0)).f9882a.mo11638f();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: h */
    public void mo11622h(InterfaceC3194g.a aVar) {
        this.f9853E = aVar;
    }

    @Override // p283m.InterfaceC5552c
    /* renamed from: j */
    public ListView mo11639j() {
        if (this.f9864p.isEmpty()) {
            return null;
        }
        return ((d) this.f9864p.get(r0.size() - 1)).m11652a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC3194g
    /* renamed from: k */
    public boolean mo11625k(SubMenuC3197j subMenuC3197j) {
        for (d dVar : this.f9864p) {
            if (subMenuC3197j == dVar.f9883b) {
                dVar.m11652a().requestFocus();
                return true;
            }
        }
        if (!subMenuC3197j.hasVisibleItems()) {
            return false;
        }
        mo11640l(subMenuC3197j);
        InterfaceC3194g.a aVar = this.f9853E;
        if (aVar != null) {
            aVar.mo11749c(subMenuC3197j);
        }
        return true;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: l */
    public void mo11640l(C3191d c3191d) {
        c3191d.m11682b(this, this.f9857b);
        if (mo11638f()) {
            m11635F(c3191d);
        } else {
            this.f9863o.add(c3191d);
        }
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: m */
    public boolean mo11641m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f9864p.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f9864p.get(i7);
            if (!dVar.f9882a.mo11638f()) {
                break;
            } else {
                i7++;
            }
        }
        if (dVar != null) {
            dVar.f9883b.m11684d(false);
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
        if (this.f9870v != view) {
            this.f9870v = view;
            this.f9869u = AbstractC0514i.m1960a(this.f9868t, AbstractC0475B.m1755n(view));
        }
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: r */
    public void mo11643r(boolean z6) {
        this.f9851C = z6;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: s */
    public void mo11644s(int i7) {
        if (this.f9868t != i7) {
            this.f9868t = i7;
            this.f9869u = AbstractC0514i.m1960a(i7, AbstractC0475B.m1755n(this.f9870v));
        }
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: t */
    public void mo11645t(int i7) {
        this.f9873y = true;
        this.f9849A = i7;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: u */
    public void mo11646u(PopupWindow.OnDismissListener onDismissListener) {
        this.f9855G = onDismissListener;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: v */
    public void mo11647v(boolean z6) {
        this.f9852D = z6;
    }

    @Override // p283m.AbstractC5551b
    /* renamed from: w */
    public void mo11648w(int i7) {
        this.f9874z = true;
        this.f9850B = i7;
    }

    /* renamed from: z */
    public final C5618T m11649z() {
        C5618T c5618t = new C5618T(this.f9857b, null, this.f9859d, this.f9860e);
        c5618t.m23553G(this.f9867s);
        c5618t.m23549z(this);
        c5618t.m23548y(this);
        c5618t.m23540q(this.f9870v);
        c5618t.m23543t(this.f9869u);
        c5618t.m23547x(true);
        c5618t.m23546w(2);
        return c5618t;
    }
}

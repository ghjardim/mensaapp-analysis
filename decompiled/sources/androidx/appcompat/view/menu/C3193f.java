package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC3194g;
import p049H.AbstractC0475B;
import p049H.AbstractC0514i;
import p223f.AbstractC4218c;
import p283m.AbstractC5551b;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C3193f {

    /* renamed from: a */
    public final Context f9948a;

    /* renamed from: b */
    public final C3191d f9949b;

    /* renamed from: c */
    public final boolean f9950c;

    /* renamed from: d */
    public final int f9951d;

    /* renamed from: e */
    public final int f9952e;

    /* renamed from: f */
    public View f9953f;

    /* renamed from: g */
    public int f9954g;

    /* renamed from: h */
    public boolean f9955h;

    /* renamed from: i */
    public InterfaceC3194g.a f9956i;

    /* renamed from: j */
    public AbstractC5551b f9957j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f9958k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f9959l;

    /* renamed from: androidx.appcompat.view.menu.f$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C3193f.this.mo11738e();
        }
    }

    public C3193f(Context context, C3191d c3191d, View view, boolean z6, int i7) {
        this(context, c3191d, view, z6, i7, 0);
    }

    /* renamed from: a */
    public final AbstractC5551b m11734a() {
        Display defaultDisplay = ((WindowManager) this.f9948a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC5551b viewOnKeyListenerC3189b = Math.min(point.x, point.y) >= this.f9948a.getResources().getDimensionPixelSize(AbstractC4218c.f14101a) ? new ViewOnKeyListenerC3189b(this.f9948a, this.f9953f, this.f9951d, this.f9952e, this.f9950c) : new ViewOnKeyListenerC3196i(this.f9948a, this.f9949b, this.f9953f, this.f9951d, this.f9952e, this.f9950c);
        viewOnKeyListenerC3189b.mo11640l(this.f9949b);
        viewOnKeyListenerC3189b.mo11646u(this.f9959l);
        viewOnKeyListenerC3189b.mo11642p(this.f9953f);
        viewOnKeyListenerC3189b.mo11622h(this.f9956i);
        viewOnKeyListenerC3189b.mo11643r(this.f9955h);
        viewOnKeyListenerC3189b.mo11644s(this.f9954g);
        return viewOnKeyListenerC3189b;
    }

    /* renamed from: b */
    public void m11735b() {
        if (m11737d()) {
            this.f9957j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC5551b m11736c() {
        if (this.f9957j == null) {
            this.f9957j = m11734a();
        }
        return this.f9957j;
    }

    /* renamed from: d */
    public boolean m11737d() {
        AbstractC5551b abstractC5551b = this.f9957j;
        return abstractC5551b != null && abstractC5551b.mo11638f();
    }

    /* renamed from: e */
    public void mo11738e() {
        this.f9957j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9958k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m11739f(View view) {
        this.f9953f = view;
    }

    /* renamed from: g */
    public void m11740g(boolean z6) {
        this.f9955h = z6;
        AbstractC5551b abstractC5551b = this.f9957j;
        if (abstractC5551b != null) {
            abstractC5551b.mo11643r(z6);
        }
    }

    /* renamed from: h */
    public void m11741h(int i7) {
        this.f9954g = i7;
    }

    /* renamed from: i */
    public void m11742i(PopupWindow.OnDismissListener onDismissListener) {
        this.f9958k = onDismissListener;
    }

    /* renamed from: j */
    public void m11743j(InterfaceC3194g.a aVar) {
        this.f9956i = aVar;
        AbstractC5551b abstractC5551b = this.f9957j;
        if (abstractC5551b != null) {
            abstractC5551b.mo11622h(aVar);
        }
    }

    /* renamed from: k */
    public void m11744k() {
        if (!m11746m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: l */
    public final void m11745l(int i7, int i8, boolean z6, boolean z7) {
        AbstractC5551b m11736c = m11736c();
        m11736c.mo11647v(z7);
        if (z6) {
            if ((AbstractC0514i.m1960a(this.f9954g, AbstractC0475B.m1755n(this.f9953f)) & 7) == 5) {
                i7 -= this.f9953f.getWidth();
            }
            m11736c.mo11645t(i7);
            m11736c.mo11648w(i8);
            int i9 = (int) ((this.f9948a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m11736c.m23271q(new Rect(i7 - i9, i8 - i9, i7 + i9, i8 + i9));
        }
        m11736c.mo11636a();
    }

    /* renamed from: m */
    public boolean m11746m() {
        if (m11737d()) {
            return true;
        }
        if (this.f9953f == null) {
            return false;
        }
        m11745l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m11747n(int i7, int i8) {
        if (m11737d()) {
            return true;
        }
        if (this.f9953f == null) {
            return false;
        }
        m11745l(i7, i8, true, true);
        return true;
    }

    public C3193f(Context context, C3191d c3191d, View view, boolean z6, int i7, int i8) {
        this.f9954g = 8388611;
        this.f9959l = new a();
        this.f9948a = context;
        this.f9949b = c3191d;
        this.f9953f = view;
        this.f9950c = z6;
        this.f9951d = i7;
        this.f9952e = i8;
    }
}

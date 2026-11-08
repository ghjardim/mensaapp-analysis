package p291n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C3190c;
import androidx.appcompat.view.menu.C3191d;
import androidx.appcompat.view.menu.C3192e;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: n.T */
/* loaded from: classes.dex */
public class C5618T extends AbstractC5615P implements InterfaceC5616Q {

    /* renamed from: S */
    public static Method f20337S;

    /* renamed from: R */
    public InterfaceC5616Q f20338R;

    /* renamed from: n.T$a */
    public static class a extends AbstractC5609J {

        /* renamed from: u */
        public final int f20339u;

        /* renamed from: v */
        public final int f20340v;

        /* renamed from: w */
        public InterfaceC5616Q f20341w;

        /* renamed from: x */
        public MenuItem f20342x;

        public a(Context context, boolean z6) {
            super(context, z6);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f20339u = 21;
                this.f20340v = 22;
            } else {
                this.f20339u = 22;
                this.f20340v = 21;
            }
        }

        @Override // p291n.AbstractC5609J
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo23503d(int i7, int i8, int i9, int i10, int i11) {
            return super.mo23503d(i7, i8, i9, i10, i11);
        }

        @Override // p291n.AbstractC5609J
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo23504e(MotionEvent motionEvent, int i7) {
            return super.mo23504e(motionEvent, i7);
        }

        @Override // p291n.AbstractC5609J, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // p291n.AbstractC5609J, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // p291n.AbstractC5609J, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // p291n.AbstractC5609J, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // p291n.AbstractC5609J, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C3190c c3190c;
            int i7;
            int pointToPosition;
            int i8;
            if (this.f20341w != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    c3190c = (C3190c) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c3190c = (C3190c) adapter;
                    i7 = 0;
                }
                C3192e item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i7) < 0 || i8 >= c3190c.getCount()) ? null : c3190c.getItem(i8);
                MenuItem menuItem = this.f20342x;
                if (menuItem != item) {
                    C3191d m11654b = c3190c.m11654b();
                    if (menuItem != null) {
                        this.f20341w.mo11651c(m11654b, menuItem);
                    }
                    this.f20342x = item;
                    if (item != null) {
                        this.f20341w.mo11650b(m11654b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i7, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i7 == this.f20339u) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i7 != this.f20340v) {
                return super.onKeyDown(i7, keyEvent);
            }
            setSelection(-1);
            ((C3190c) getAdapter()).m11654b().m11684d(false);
            return true;
        }

        @Override // p291n.AbstractC5609J, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC5616Q interfaceC5616Q) {
            this.f20341w = interfaceC5616Q;
        }

        @Override // p291n.AbstractC5609J, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f20337S = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C5618T(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    /* renamed from: E */
    public void m23551E(Object obj) {
        this.f20310N.setEnterTransition((Transition) obj);
    }

    /* renamed from: F */
    public void m23552F(Object obj) {
        this.f20310N.setExitTransition((Transition) obj);
    }

    /* renamed from: G */
    public void m23553G(InterfaceC5616Q interfaceC5616Q) {
        this.f20338R = interfaceC5616Q;
    }

    /* renamed from: H */
    public void m23554H(boolean z6) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f20310N.setTouchModal(z6);
            return;
        }
        Method method = f20337S;
        if (method != null) {
            try {
                method.invoke(this.f20310N, Boolean.valueOf(z6));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // p291n.InterfaceC5616Q
    /* renamed from: b */
    public void mo11650b(C3191d c3191d, MenuItem menuItem) {
        InterfaceC5616Q interfaceC5616Q = this.f20338R;
        if (interfaceC5616Q != null) {
            interfaceC5616Q.mo11650b(c3191d, menuItem);
        }
    }

    @Override // p291n.InterfaceC5616Q
    /* renamed from: c */
    public void mo11651c(C3191d c3191d, MenuItem menuItem) {
        InterfaceC5616Q interfaceC5616Q = this.f20338R;
        if (interfaceC5616Q != null) {
            interfaceC5616Q.mo11651c(c3191d, menuItem);
        }
    }

    @Override // p291n.AbstractC5615P
    /* renamed from: g */
    public AbstractC5609J mo23531g(Context context, boolean z6) {
        a aVar = new a(context, z6);
        aVar.setHoverListener(this);
        return aVar;
    }
}

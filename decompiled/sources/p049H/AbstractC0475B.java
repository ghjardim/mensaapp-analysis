package p049H;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p049H.C0499a;
import p207d.AbstractC4094d;
import p358v.AbstractC6701c;

/* renamed from: H.B */
/* loaded from: classes.dex */
public abstract class AbstractC0475B {

    /* renamed from: a */
    public static Field f1633a = null;

    /* renamed from: b */
    public static boolean f1634b = false;

    /* renamed from: c */
    public static final int[] f1635c = {AbstractC6701c.f24131b, AbstractC6701c.f24132c, AbstractC6701c.f24143n, AbstractC6701c.f24154y, AbstractC6701c.f24116B, AbstractC6701c.f24117C, AbstractC6701c.f24118D, AbstractC6701c.f24119E, AbstractC6701c.f24120F, AbstractC6701c.f24121G, AbstractC6701c.f24133d, AbstractC6701c.f24134e, AbstractC6701c.f24135f, AbstractC6701c.f24136g, AbstractC6701c.f24137h, AbstractC6701c.f24138i, AbstractC6701c.f24139j, AbstractC6701c.f24140k, AbstractC6701c.f24141l, AbstractC6701c.f24142m, AbstractC6701c.f24144o, AbstractC6701c.f24145p, AbstractC6701c.f24146q, AbstractC6701c.f24147r, AbstractC6701c.f24148s, AbstractC6701c.f24149t, AbstractC6701c.f24150u, AbstractC6701c.f24151v, AbstractC6701c.f24152w, AbstractC6701c.f24153x, AbstractC6701c.f24155z, AbstractC6701c.f24115A};

    /* renamed from: d */
    public static final InterfaceC0527v f1636d = new InterfaceC0527v() { // from class: H.A
    };

    /* renamed from: e */
    public static final e f1637e = new e();

    /* renamed from: H.B$a */
    public class a extends f {
        public a(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        @Override // p049H.AbstractC0475B.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean mo1768b(View view) {
            return Boolean.valueOf(k.m1792c(view));
        }
    }

    /* renamed from: H.B$b */
    public class b extends f {
        public b(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        @Override // p049H.AbstractC0475B.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence mo1768b(View view) {
            return k.m1790a(view);
        }
    }

    /* renamed from: H.B$c */
    public class c extends f {
        public c(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        @Override // p049H.AbstractC0475B.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence mo1768b(View view) {
            return m.m1794a(view);
        }
    }

    /* renamed from: H.B$d */
    public class d extends f {
        public d(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        @Override // p049H.AbstractC0475B.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean mo1768b(View view) {
            return Boolean.valueOf(k.m1791b(view));
        }
    }

    /* renamed from: H.B$f */
    public static abstract class f {

        /* renamed from: a */
        public final int f1639a;

        /* renamed from: b */
        public final Class f1640b;

        /* renamed from: c */
        public final int f1641c;

        /* renamed from: d */
        public final int f1642d;

        public f(int i7, Class cls, int i8) {
            this(i7, cls, 0, i8);
        }

        /* renamed from: a */
        public final boolean m1775a() {
            return Build.VERSION.SDK_INT >= this.f1641c;
        }

        /* renamed from: b */
        public abstract Object mo1768b(View view);

        /* renamed from: c */
        public Object m1776c(View view) {
            if (m1775a()) {
                return mo1768b(view);
            }
            Object tag = view.getTag(this.f1639a);
            if (this.f1640b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public f(int i7, Class cls, int i8, int i9) {
            this.f1639a = i7;
            this.f1640b = cls;
            this.f1642d = i8;
            this.f1641c = i9;
        }
    }

    /* renamed from: H.B$g */
    public static class g {
        /* renamed from: a */
        public static WindowInsets m1777a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m1778b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m1779c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: H.B$h */
    public static class h {
        /* renamed from: a */
        public static ColorStateList m1780a(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m1781b(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: c */
        public static String m1782c(View view) {
            return view.getTransitionName();
        }

        /* renamed from: d */
        public static void m1783d(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: e */
        public static void m1784e(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: f */
        public static void m1785f(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: g */
        public static void m1786g(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: H.B$i */
    public static class i {
        /* renamed from: a */
        public static C0481H m1787a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0481H m1836n = C0481H.m1836n(rootWindowInsets);
            m1836n.m1848k(m1836n);
            m1836n.m1841d(view.getRootView());
            return m1836n;
        }
    }

    /* renamed from: H.B$j */
    public static class j {
        /* renamed from: a */
        public static int m1788a(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: b */
        public static void m1789b(View view, int i7) {
            view.setImportantForAutofill(i7);
        }
    }

    /* renamed from: H.B$k */
    public static class k {
        /* renamed from: a */
        public static CharSequence m1790a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: b */
        public static boolean m1791b(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: c */
        public static boolean m1792c(View view) {
            return view.isScreenReaderFocusable();
        }
    }

    /* renamed from: H.B$l */
    public static class l {
        /* renamed from: a */
        public static View.AccessibilityDelegate m1793a(View view) {
            return view.getAccessibilityDelegate();
        }
    }

    /* renamed from: H.B$m */
    public static class m {
        /* renamed from: a */
        public static CharSequence m1794a(View view) {
            return view.getStateDescription();
        }
    }

    /* renamed from: H.B$n */
    public static class n {

        /* renamed from: d */
        public static final ArrayList f1643d = new ArrayList();

        /* renamed from: a */
        public WeakHashMap f1644a = null;

        /* renamed from: b */
        public SparseArray f1645b = null;

        /* renamed from: c */
        public WeakReference f1646c = null;

        /* renamed from: a */
        public static n m1795a(View view) {
            n nVar = (n) view.getTag(AbstractC6701c.f24128N);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n();
            view.setTag(AbstractC6701c.f24128N, nVar2);
            return nVar2;
        }

        /* renamed from: b */
        public boolean m1796b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m1801g();
            }
            View m1797c = m1797c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m1797c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m1798d().put(keyCode, new WeakReference(m1797c));
                }
            }
            return m1797c != null;
        }

        /* renamed from: c */
        public final View m1797c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f1644a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m1797c = m1797c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m1797c != null) {
                            return m1797c;
                        }
                    }
                }
                if (m1799e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray m1798d() {
            if (this.f1645b == null) {
                this.f1645b = new SparseArray();
            }
            return this.f1645b;
        }

        /* renamed from: e */
        public final boolean m1799e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC6701c.f24129O);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            AbstractC4094d.m17162a(arrayList.get(size));
            throw null;
        }

        /* renamed from: f */
        public boolean m1800f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f1646c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f1646c = new WeakReference(keyEvent);
            SparseArray m1798d = m1798d();
            if (keyEvent.getAction() != 1 || (indexOfKey = m1798d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) m1798d.valueAt(indexOfKey);
                m1798d.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) m1798d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                m1799e(view, keyEvent);
            }
            return true;
        }

        /* renamed from: g */
        public final void m1801g() {
            WeakHashMap weakHashMap = this.f1644a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f1643d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f1644a == null) {
                        this.f1644a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f1643d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f1644a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f1644a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: A */
    public static C0481H m1723A(View view, C0481H c0481h) {
        WindowInsets m1850m = c0481h.m1850m();
        if (m1850m != null) {
            WindowInsets m1778b = g.m1778b(view, m1850m);
            if (!m1778b.equals(m1850m)) {
                return C0481H.m1837o(m1778b, view);
            }
        }
        return c0481h;
    }

    /* renamed from: B */
    public static f m1724B() {
        return new b(AbstractC6701c.f24125K, CharSequence.class, 8, 28);
    }

    /* renamed from: C */
    public static void m1725C(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: D */
    public static void m1726D(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: E */
    public static void m1727E(View view, Runnable runnable, long j7) {
        view.postOnAnimationDelayed(runnable, j7);
    }

    /* renamed from: F */
    public static void m1728F(View view) {
        g.m1779c(view);
    }

    /* renamed from: G */
    public static f m1729G() {
        return new a(AbstractC6701c.f24126L, Boolean.class, 28);
    }

    /* renamed from: H */
    public static void m1730H(View view, C0499a c0499a) {
        if (c0499a == null && (m1746e(view) instanceof C0499a.a)) {
            c0499a = new C0499a();
        }
        m1737O(view);
        view.setAccessibilityDelegate(c0499a == null ? null : c0499a.m1912d());
    }

    /* renamed from: I */
    public static void m1731I(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: J */
    public static void m1732J(View view, ColorStateList colorStateList) {
        h.m1783d(view, colorStateList);
    }

    /* renamed from: K */
    public static void m1733K(View view, PorterDuff.Mode mode) {
        h.m1784e(view, mode);
    }

    /* renamed from: L */
    public static void m1734L(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: M */
    public static void m1735M(View view, boolean z6) {
        view.setHasTransientState(z6);
    }

    /* renamed from: N */
    public static void m1736N(View view, int i7) {
        view.setImportantForAccessibility(i7);
    }

    /* renamed from: O */
    public static void m1737O(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* renamed from: P */
    public static void m1738P(View view, int i7) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.m1789b(view, i7);
        }
    }

    /* renamed from: Q */
    public static void m1739Q(View view, String str) {
        h.m1785f(view, str);
    }

    /* renamed from: R */
    public static f m1740R() {
        return new c(AbstractC6701c.f24127M, CharSequence.class, 64, 30);
    }

    /* renamed from: S */
    public static void m1741S(View view) {
        h.m1786g(view);
    }

    /* renamed from: a */
    public static f m1742a() {
        return new d(AbstractC6701c.f24124J, Boolean.class, 28);
    }

    /* renamed from: b */
    public static C0481H m1743b(View view, C0481H c0481h) {
        WindowInsets m1850m = c0481h.m1850m();
        if (m1850m != null) {
            WindowInsets m1777a = g.m1777a(view, m1850m);
            if (!m1777a.equals(m1850m)) {
                return C0481H.m1837o(m1777a, view);
            }
        }
        return c0481h;
    }

    /* renamed from: c */
    public static boolean m1744c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return n.m1795a(view).m1796b(view, keyEvent);
    }

    /* renamed from: d */
    public static boolean m1745d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return n.m1795a(view).m1800f(keyEvent);
    }

    /* renamed from: e */
    public static View.AccessibilityDelegate m1746e(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.m1793a(view) : m1747f(view);
    }

    /* renamed from: f */
    public static View.AccessibilityDelegate m1747f(View view) {
        if (f1634b) {
            return null;
        }
        if (f1633a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1633a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1634b = true;
                return null;
            }
        }
        try {
            Object obj = f1633a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1634b = true;
            return null;
        }
    }

    /* renamed from: g */
    public static CharSequence m1748g(View view) {
        return (CharSequence) m1724B().m1776c(view);
    }

    /* renamed from: h */
    public static ColorStateList m1749h(View view) {
        return h.m1780a(view);
    }

    /* renamed from: i */
    public static PorterDuff.Mode m1750i(View view) {
        return h.m1781b(view);
    }

    /* renamed from: j */
    public static Rect m1751j(View view) {
        return view.getClipBounds();
    }

    /* renamed from: k */
    public static Display m1752k(View view) {
        return view.getDisplay();
    }

    /* renamed from: l */
    public static int m1753l(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: m */
    public static int m1754m(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.m1788a(view);
        }
        return 0;
    }

    /* renamed from: n */
    public static int m1755n(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: o */
    public static int m1756o(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: p */
    public static int m1757p(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: q */
    public static C0481H m1758q(View view) {
        return i.m1787a(view);
    }

    /* renamed from: r */
    public static CharSequence m1759r(View view) {
        return (CharSequence) m1740R().m1776c(view);
    }

    /* renamed from: s */
    public static String m1760s(View view) {
        return h.m1782c(view);
    }

    /* renamed from: t */
    public static int m1761t(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: u */
    public static boolean m1762u(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: v */
    public static boolean m1763v(View view) {
        Boolean bool = (Boolean) m1742a().m1776c(view);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: w */
    public static boolean m1764w(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: x */
    public static boolean m1765x(View view) {
        return view.isLaidOut();
    }

    /* renamed from: y */
    public static boolean m1766y(View view) {
        Boolean bool = (Boolean) m1729G().m1776c(view);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: z */
    public static void m1767z(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = m1748g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z6 ? 32 : 2048);
                obtain.setContentChangeTypes(i7);
                if (z6) {
                    obtain.getText().add(m1748g(view));
                    m1737O(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i7 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i7);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m1748g(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e7);
                }
            }
        }
    }

    /* renamed from: H.B$e */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final WeakHashMap f1638a = new WeakHashMap();

        /* renamed from: a */
        public final void m1773a(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z6 = view.isShown() && view.getWindowVisibility() == 0;
            if (booleanValue != z6) {
                AbstractC0475B.m1767z(view, z6 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z6));
            }
        }

        /* renamed from: b */
        public final void m1774b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f1638a.entrySet().iterator();
                while (it.hasNext()) {
                    m1773a((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m1774b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}

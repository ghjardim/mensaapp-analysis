package p049H;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p056I.C0612v;
import p056I.C0613w;
import p358v.AbstractC6701c;

/* renamed from: H.a */
/* loaded from: classes.dex */
public class C0499a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f1679c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f1680a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f1681b;

    /* renamed from: H.a$a */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C0499a f1682a;

        public a(C0499a c0499a) {
            this.f1682a = c0499a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1682a.m1910a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0613w m1911b = this.f1682a.m1911b(view);
            if (m1911b != null) {
                return (AccessibilityNodeProvider) m1911b.m2479a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1682a.mo1914f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0612v m2410e0 = C0612v.m2410e0(accessibilityNodeInfo);
            m2410e0.m2440a0(AbstractC0475B.m1766y(view));
            m2410e0.m2437Y(AbstractC0475B.m1763v(view));
            m2410e0.m2438Z(AbstractC0475B.m1748g(view));
            m2410e0.m2444c0(AbstractC0475B.m1759r(view));
            this.f1682a.mo1915g(view, m2410e0);
            m2410e0.m2445d(accessibilityNodeInfo.getText(), view);
            List m1909c = C0499a.m1909c(view);
            for (int i7 = 0; i7 < m1909c.size(); i7++) {
                m2410e0.m2441b((C0612v.a) m1909c.get(i7));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1682a.m1916h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1682a.m1917i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            return this.f1682a.mo1918j(view, i7, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i7) {
            this.f1682a.m1920l(view, i7);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1682a.m1921m(view, accessibilityEvent);
        }
    }

    public C0499a() {
        this(f1679c);
    }

    /* renamed from: c */
    public static List m1909c(View view) {
        List list = (List) view.getTag(AbstractC6701c.f24122H);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public boolean m1910a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1680a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0613w m1911b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1680a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0613w(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: d */
    public View.AccessibilityDelegate m1912d() {
        return this.f1681b;
    }

    /* renamed from: e */
    public final boolean m1913e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m2412n = C0612v.m2412n(view.createAccessibilityNodeInfo().getText());
            for (int i7 = 0; m2412n != null && i7 < m2412n.length; i7++) {
                if (clickableSpan.equals(m2412n[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo1914f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1680a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo1915g(View view, C0612v c0612v) {
        this.f1680a.onInitializeAccessibilityNodeInfo(view, c0612v.m2446d0());
    }

    /* renamed from: h */
    public void m1916h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1680a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean m1917i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1680a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo1918j(View view, int i7, Bundle bundle) {
        List m1909c = m1909c(view);
        boolean z6 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= m1909c.size()) {
                break;
            }
            C0612v.a aVar = (C0612v.a) m1909c.get(i8);
            if (aVar.m2467a() == i7) {
                z6 = aVar.m2469c(view, bundle);
                break;
            }
            i8++;
        }
        if (!z6) {
            z6 = this.f1680a.performAccessibilityAction(view, i7, bundle);
        }
        return (z6 || i7 != AbstractC6701c.f24130a || bundle == null) ? z6 : m1919k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: k */
    public final boolean m1919k(int i7, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC6701c.f24123I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i7)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m1913e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: l */
    public void m1920l(View view, int i7) {
        this.f1680a.sendAccessibilityEvent(view, i7);
    }

    /* renamed from: m */
    public void m1921m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1680a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0499a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1680a = accessibilityDelegate;
        this.f1681b = new a(this);
    }
}

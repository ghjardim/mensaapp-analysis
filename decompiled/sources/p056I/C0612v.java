package p056I;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p056I.InterfaceC0615y;
import p358v.AbstractC6701c;

/* renamed from: I.v */
/* loaded from: classes.dex */
public class C0612v {

    /* renamed from: d */
    public static int f2095d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f2096a;

    /* renamed from: b */
    public int f2097b = -1;

    /* renamed from: c */
    public int f2098c = -1;

    /* renamed from: I.v$a */
    public static class a {

        /* renamed from: A */
        public static final a f2099A;

        /* renamed from: B */
        public static final a f2100B;

        /* renamed from: C */
        public static final a f2101C;

        /* renamed from: D */
        public static final a f2102D;

        /* renamed from: E */
        public static final a f2103E;

        /* renamed from: F */
        public static final a f2104F;

        /* renamed from: G */
        public static final a f2105G;

        /* renamed from: H */
        public static final a f2106H;

        /* renamed from: I */
        public static final a f2107I;

        /* renamed from: J */
        public static final a f2108J;

        /* renamed from: K */
        public static final a f2109K;

        /* renamed from: L */
        public static final a f2110L;

        /* renamed from: M */
        public static final a f2111M;

        /* renamed from: N */
        public static final a f2112N;

        /* renamed from: O */
        public static final a f2113O;

        /* renamed from: P */
        public static final a f2114P;

        /* renamed from: Q */
        public static final a f2115Q;

        /* renamed from: R */
        public static final a f2116R;

        /* renamed from: S */
        public static final a f2117S;

        /* renamed from: T */
        public static final a f2118T;

        /* renamed from: U */
        public static final a f2119U;

        /* renamed from: d */
        public static final a f2120d = new a(1, null);

        /* renamed from: e */
        public static final a f2121e = new a(2, null);

        /* renamed from: f */
        public static final a f2122f = new a(4, null);

        /* renamed from: g */
        public static final a f2123g = new a(8, null);

        /* renamed from: h */
        public static final a f2124h = new a(16, null);

        /* renamed from: i */
        public static final a f2125i = new a(32, null);

        /* renamed from: j */
        public static final a f2126j = new a(64, null);

        /* renamed from: k */
        public static final a f2127k = new a(128, null);

        /* renamed from: l */
        public static final a f2128l = new a(256, null, InterfaceC0615y.b.class);

        /* renamed from: m */
        public static final a f2129m = new a(512, null, InterfaceC0615y.b.class);

        /* renamed from: n */
        public static final a f2130n = new a(1024, null, InterfaceC0615y.c.class);

        /* renamed from: o */
        public static final a f2131o = new a(2048, null, InterfaceC0615y.c.class);

        /* renamed from: p */
        public static final a f2132p = new a(4096, null);

        /* renamed from: q */
        public static final a f2133q = new a(8192, null);

        /* renamed from: r */
        public static final a f2134r = new a(16384, null);

        /* renamed from: s */
        public static final a f2135s = new a(32768, null);

        /* renamed from: t */
        public static final a f2136t = new a(65536, null);

        /* renamed from: u */
        public static final a f2137u = new a(131072, null, InterfaceC0615y.g.class);

        /* renamed from: v */
        public static final a f2138v = new a(262144, null);

        /* renamed from: w */
        public static final a f2139w = new a(524288, null);

        /* renamed from: x */
        public static final a f2140x = new a(1048576, null);

        /* renamed from: y */
        public static final a f2141y = new a(2097152, null, InterfaceC0615y.h.class);

        /* renamed from: z */
        public static final a f2142z;

        /* renamed from: a */
        public final Object f2143a;

        /* renamed from: b */
        public final int f2144b;

        /* renamed from: c */
        public final Class f2145c;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            int i7 = Build.VERSION.SDK_INT;
            f2142z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f2099A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC0615y.e.class);
            f2100B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f2101C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f2102D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f2103E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i7 >= 29) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction28;
            } else {
                accessibilityAction = null;
            }
            f2104F = new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i7 >= 29) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction27;
            } else {
                accessibilityAction2 = null;
            }
            f2105G = new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i7 >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction26;
            } else {
                accessibilityAction3 = null;
            }
            f2106H = new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i7 >= 29) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction25;
            } else {
                accessibilityAction4 = null;
            }
            f2107I = new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            f2108J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            if (i7 >= 24) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction5 = accessibilityAction24;
            } else {
                accessibilityAction5 = null;
            }
            f2109K = new a(accessibilityAction5, R.id.accessibilityActionSetProgress, null, null, InterfaceC0615y.f.class);
            if (i7 >= 26) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction6 = accessibilityAction23;
            } else {
                accessibilityAction6 = null;
            }
            f2110L = new a(accessibilityAction6, R.id.accessibilityActionMoveWindow, null, null, InterfaceC0615y.d.class);
            if (i7 >= 28) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction7 = accessibilityAction22;
            } else {
                accessibilityAction7 = null;
            }
            f2111M = new a(accessibilityAction7, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i7 >= 28) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction8 = accessibilityAction21;
            } else {
                accessibilityAction8 = null;
            }
            f2112N = new a(accessibilityAction8, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i7 >= 30) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction9 = accessibilityAction20;
            } else {
                accessibilityAction9 = null;
            }
            f2113O = new a(accessibilityAction9, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i7 >= 30) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction10 = accessibilityAction19;
            } else {
                accessibilityAction10 = null;
            }
            f2114P = new a(accessibilityAction10, R.id.accessibilityActionImeEnter, null, null, null);
            if (i7 >= 32) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction11 = accessibilityAction18;
            } else {
                accessibilityAction11 = null;
            }
            f2115Q = new a(accessibilityAction11, R.id.accessibilityActionDragStart, null, null, null);
            if (i7 >= 32) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction12 = accessibilityAction17;
            } else {
                accessibilityAction12 = null;
            }
            f2116R = new a(accessibilityAction12, R.id.accessibilityActionDragDrop, null, null, null);
            if (i7 >= 32) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction13 = accessibilityAction16;
            } else {
                accessibilityAction13 = null;
            }
            f2117S = new a(accessibilityAction13, R.id.accessibilityActionDragCancel, null, null, null);
            if (i7 >= 33) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction14 = accessibilityAction15;
            } else {
                accessibilityAction14 = null;
            }
            f2118T = new a(accessibilityAction14, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f2119U = new a(i7 >= 34 ? d.m2474a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i7, CharSequence charSequence) {
            this(null, i7, charSequence, null, null);
        }

        /* renamed from: a */
        public int m2467a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2143a).getId();
        }

        /* renamed from: b */
        public CharSequence m2468b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2143a).getLabel();
        }

        /* renamed from: c */
        public boolean m2469c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f2143a;
            return obj2 == null ? aVar.f2143a == null : obj2.equals(aVar.f2143a);
        }

        public int hashCode() {
            Object obj = this.f2143a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String m2411h = C0612v.m2411h(this.f2144b);
            if (m2411h.equals("ACTION_UNKNOWN") && m2468b() != null) {
                m2411h = m2468b().toString();
            }
            sb.append(m2411h);
            return sb.toString();
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i7, CharSequence charSequence, Class cls) {
            this(null, i7, charSequence, null, cls);
        }

        public a(Object obj, int i7, CharSequence charSequence, InterfaceC0615y interfaceC0615y, Class cls) {
            this.f2144b = i7;
            if (obj == null) {
                this.f2143a = new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence);
            } else {
                this.f2143a = obj;
            }
            this.f2145c = cls;
        }
    }

    /* renamed from: I.v$b */
    public static class b {
        /* renamed from: a */
        public static CharSequence m2470a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        /* renamed from: b */
        public static void m2471b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* renamed from: I.v$c */
    public static class c {
        /* renamed from: a */
        public static String m2472a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        /* renamed from: b */
        public static boolean m2473b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* renamed from: I.v$d */
    public static class d {
        /* renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m2474a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        /* renamed from: b */
        public static void m2475b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        /* renamed from: c */
        public static CharSequence m2476c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        /* renamed from: d */
        public static boolean m2477d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* renamed from: I.v$e */
    public static class e {

        /* renamed from: a */
        public final Object f2146a;

        public e(Object obj) {
            this.f2146a = obj;
        }

        /* renamed from: a */
        public static e m2478a(int i7, int i8, boolean z6, int i9) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, z6, i9));
        }
    }

    public C0612v(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2096a = accessibilityNodeInfo;
    }

    /* renamed from: e0 */
    public static C0612v m2410e0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0612v(accessibilityNodeInfo);
    }

    /* renamed from: h */
    public static String m2411h(int i7) {
        if (i7 == 1) {
            return "ACTION_FOCUS";
        }
        if (i7 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i7) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i7) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i7) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i7) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: n */
    public static ClickableSpan[] m2412n(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: A */
    public String m2413A() {
        return this.f2096a.getViewIdResourceName();
    }

    /* renamed from: B */
    public final boolean m2414B() {
        return !m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: C */
    public final int m2415C(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i7)).get())) {
                    return sparseArray.keyAt(i7);
                }
            }
        }
        int i8 = f2095d;
        f2095d = i8 + 1;
        return i8;
    }

    /* renamed from: D */
    public boolean m2416D() {
        return Build.VERSION.SDK_INT >= 34 ? d.m2477d(this.f2096a) : m2450i(64);
    }

    /* renamed from: E */
    public boolean m2417E() {
        return this.f2096a.isCheckable();
    }

    /* renamed from: F */
    public boolean m2418F() {
        return this.f2096a.isChecked();
    }

    /* renamed from: G */
    public boolean m2419G() {
        return this.f2096a.isClickable();
    }

    /* renamed from: H */
    public boolean m2420H() {
        return this.f2096a.isContextClickable();
    }

    /* renamed from: I */
    public boolean m2421I() {
        return this.f2096a.isEnabled();
    }

    /* renamed from: J */
    public boolean m2422J() {
        return this.f2096a.isFocusable();
    }

    /* renamed from: K */
    public boolean m2423K() {
        return this.f2096a.isFocused();
    }

    /* renamed from: L */
    public boolean m2424L() {
        return m2450i(67108864);
    }

    /* renamed from: M */
    public boolean m2425M() {
        boolean isImportantForAccessibility;
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        isImportantForAccessibility = this.f2096a.isImportantForAccessibility();
        return isImportantForAccessibility;
    }

    /* renamed from: N */
    public boolean m2426N() {
        return this.f2096a.isLongClickable();
    }

    /* renamed from: O */
    public boolean m2427O() {
        return this.f2096a.isPassword();
    }

    /* renamed from: P */
    public boolean m2428P() {
        return this.f2096a.isScrollable();
    }

    /* renamed from: Q */
    public boolean m2429Q() {
        return this.f2096a.isSelected();
    }

    /* renamed from: R */
    public boolean m2430R() {
        return Build.VERSION.SDK_INT >= 33 ? c.m2473b(this.f2096a) : m2450i(8388608);
    }

    /* renamed from: S */
    public boolean m2431S() {
        return this.f2096a.isVisibleToUser();
    }

    /* renamed from: T */
    public boolean m2432T(int i7, Bundle bundle) {
        return this.f2096a.performAction(i7, bundle);
    }

    /* renamed from: U */
    public final void m2433U(View view) {
        SparseArray m2462v = m2462v(view);
        if (m2462v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < m2462v.size(); i7++) {
                if (((WeakReference) m2462v.valueAt(i7)).get() == null) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                m2462v.remove(((Integer) arrayList.get(i8)).intValue());
            }
        }
    }

    /* renamed from: V */
    public final void m2434V(int i7, boolean z6) {
        Bundle m2458r = m2458r();
        if (m2458r != null) {
            int i8 = m2458r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i7);
            if (!z6) {
                i7 = 0;
            }
            m2458r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i7 | i8);
        }
    }

    /* renamed from: W */
    public void m2435W(CharSequence charSequence) {
        this.f2096a.setClassName(charSequence);
    }

    /* renamed from: X */
    public void m2436X(Object obj) {
        this.f2096a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f2146a);
    }

    /* renamed from: Y */
    public void m2437Y(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2096a.setHeading(z6);
        } else {
            m2434V(2, z6);
        }
    }

    /* renamed from: Z */
    public void m2438Z(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2096a.setPaneTitle(charSequence);
        } else {
            this.f2096a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: a */
    public void m2439a(int i7) {
        this.f2096a.addAction(i7);
    }

    /* renamed from: a0 */
    public void m2440a0(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2096a.setScreenReaderFocusable(z6);
        } else {
            m2434V(1, z6);
        }
    }

    /* renamed from: b */
    public void m2441b(a aVar) {
        this.f2096a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2143a);
    }

    /* renamed from: b0 */
    public void m2442b0(boolean z6) {
        this.f2096a.setScrollable(z6);
    }

    /* renamed from: c */
    public final void m2443c(ClickableSpan clickableSpan, Spanned spanned, int i7) {
        m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i7));
    }

    /* renamed from: c0 */
    public void m2444c0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.m2471b(this.f2096a, charSequence);
        } else {
            this.f2096a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: d */
    public void m2445d(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m2447e();
            m2433U(view);
            ClickableSpan[] m2412n = m2412n(charSequence);
            if (m2412n == null || m2412n.length <= 0) {
                return;
            }
            m2458r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC6701c.f24130a);
            SparseArray m2460t = m2460t(view);
            for (int i7 = 0; i7 < m2412n.length; i7++) {
                int m2415C = m2415C(m2412n[i7], m2460t);
                m2460t.put(m2415C, new WeakReference(m2412n[i7]));
                m2443c(m2412n[i7], (Spanned) charSequence, m2415C);
            }
        }
    }

    /* renamed from: d0 */
    public AccessibilityNodeInfo m2446d0() {
        return this.f2096a;
    }

    /* renamed from: e */
    public final void m2447e() {
        this.f2096a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f2096a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f2096a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f2096a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0612v)) {
            return false;
        }
        C0612v c0612v = (C0612v) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2096a;
        if (accessibilityNodeInfo == null) {
            if (c0612v.f2096a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c0612v.f2096a)) {
            return false;
        }
        return this.f2098c == c0612v.f2098c && this.f2097b == c0612v.f2097b;
    }

    /* renamed from: f */
    public final List m2448f(String str) {
        ArrayList<Integer> integerArrayList = this.f2096a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2096a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public List m2449g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2096a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new a(actionList.get(i7)));
        }
        return arrayList;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2096a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public final boolean m2450i(int i7) {
        Bundle m2458r = m2458r();
        return m2458r != null && (m2458r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i7) == i7;
    }

    /* renamed from: j */
    public void m2451j(Rect rect) {
        this.f2096a.getBoundsInParent(rect);
    }

    /* renamed from: k */
    public void m2452k(Rect rect) {
        this.f2096a.getBoundsInScreen(rect);
    }

    /* renamed from: l */
    public void m2453l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.m2475b(this.f2096a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f2096a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* renamed from: m */
    public CharSequence m2454m() {
        return this.f2096a.getClassName();
    }

    /* renamed from: o */
    public CharSequence m2455o() {
        return Build.VERSION.SDK_INT >= 34 ? d.m2476c(this.f2096a) : this.f2096a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    /* renamed from: p */
    public CharSequence m2456p() {
        return this.f2096a.getContentDescription();
    }

    /* renamed from: q */
    public CharSequence m2457q() {
        return this.f2096a.getError();
    }

    /* renamed from: r */
    public Bundle m2458r() {
        return this.f2096a.getExtras();
    }

    /* renamed from: s */
    public int m2459s() {
        return this.f2096a.getMaxTextLength();
    }

    /* renamed from: t */
    public final SparseArray m2460t(View view) {
        SparseArray m2462v = m2462v(view);
        if (m2462v != null) {
            return m2462v;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC6701c.f24123I, sparseArray);
        return sparseArray;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m2451j(rect);
        sb.append("; boundsInParent: " + rect);
        m2452k(rect);
        sb.append("; boundsInScreen: " + rect);
        m2453l(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(m2461u());
        sb.append("; className: ");
        sb.append(m2454m());
        sb.append("; text: ");
        sb.append(m2464x());
        sb.append("; error: ");
        sb.append(m2457q());
        sb.append("; maxTextLength: ");
        sb.append(m2459s());
        sb.append("; stateDescription: ");
        sb.append(m2463w());
        sb.append("; contentDescription: ");
        sb.append(m2456p());
        sb.append("; tooltipText: ");
        sb.append(m2465y());
        sb.append("; viewIdResName: ");
        sb.append(m2413A());
        sb.append("; uniqueId: ");
        sb.append(m2466z());
        sb.append("; checkable: ");
        sb.append(m2417E());
        sb.append("; checked: ");
        sb.append(m2418F());
        sb.append("; focusable: ");
        sb.append(m2422J());
        sb.append("; focused: ");
        sb.append(m2423K());
        sb.append("; selected: ");
        sb.append(m2429Q());
        sb.append("; clickable: ");
        sb.append(m2419G());
        sb.append("; longClickable: ");
        sb.append(m2426N());
        sb.append("; contextClickable: ");
        sb.append(m2420H());
        sb.append("; enabled: ");
        sb.append(m2421I());
        sb.append("; password: ");
        sb.append(m2427O());
        sb.append("; scrollable: " + m2428P());
        sb.append("; containerTitle: ");
        sb.append(m2455o());
        sb.append("; granularScrollingSupported: ");
        sb.append(m2424L());
        sb.append("; importantForAccessibility: ");
        sb.append(m2425M());
        sb.append("; visible: ");
        sb.append(m2431S());
        sb.append("; isTextSelectable: ");
        sb.append(m2430R());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(m2416D());
        sb.append("; [");
        List m2449g = m2449g();
        for (int i7 = 0; i7 < m2449g.size(); i7++) {
            a aVar = (a) m2449g.get(i7);
            String m2411h = m2411h(aVar.m2467a());
            if (m2411h.equals("ACTION_UNKNOWN") && aVar.m2468b() != null) {
                m2411h = aVar.m2468b().toString();
            }
            sb.append(m2411h);
            if (i7 != m2449g.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence m2461u() {
        return this.f2096a.getPackageName();
    }

    /* renamed from: v */
    public final SparseArray m2462v(View view) {
        return (SparseArray) view.getTag(AbstractC6701c.f24123I);
    }

    /* renamed from: w */
    public CharSequence m2463w() {
        return Build.VERSION.SDK_INT >= 30 ? b.m2470a(this.f2096a) : this.f2096a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* renamed from: x */
    public CharSequence m2464x() {
        if (!m2414B()) {
            return this.f2096a.getText();
        }
        List m2448f = m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List m2448f2 = m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List m2448f3 = m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List m2448f4 = m2448f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2096a.getText(), 0, this.f2096a.getText().length()));
        for (int i7 = 0; i7 < m2448f.size(); i7++) {
            spannableString.setSpan(new C0591a(((Integer) m2448f4.get(i7)).intValue(), this, m2458r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) m2448f.get(i7)).intValue(), ((Integer) m2448f2.get(i7)).intValue(), ((Integer) m2448f3.get(i7)).intValue());
        }
        return spannableString;
    }

    /* renamed from: y */
    public CharSequence m2465y() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f2096a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.f2096a.getTooltipText();
        return tooltipText;
    }

    /* renamed from: z */
    public String m2466z() {
        return Build.VERSION.SDK_INT >= 33 ? c.m2472a(this.f2096a) : this.f2096a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }
}

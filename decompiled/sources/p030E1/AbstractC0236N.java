package p030E1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p030E1.AbstractC0250l;

/* renamed from: E1.N */
/* loaded from: classes.dex */
public abstract class AbstractC0236N extends AbstractC0250l {

    /* renamed from: Q */
    public static final String[] f939Q = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: P */
    public int f940P = 3;

    /* renamed from: E1.N$a */
    public class a extends AbstractC0251m {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f941a;

        /* renamed from: b */
        public final /* synthetic */ View f942b;

        /* renamed from: c */
        public final /* synthetic */ View f943c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f941a = viewGroup;
            this.f942b = view;
            this.f943c = view2;
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            this.f943c.setTag(AbstractC0247i.f1017a, null);
            AbstractC0262x.m1091a(this.f941a).mo1089d(this.f942b);
            abstractC0250l.mo1031Q(this);
        }

        @Override // p030E1.AbstractC0251m, p030E1.AbstractC0250l.f
        /* renamed from: c */
        public void mo963c(AbstractC0250l abstractC0250l) {
            if (this.f942b.getParent() == null) {
                AbstractC0262x.m1091a(this.f941a).mo1088c(this.f942b);
            } else {
                AbstractC0236N.this.mo1048f();
            }
        }

        @Override // p030E1.AbstractC0251m, p030E1.AbstractC0250l.f
        /* renamed from: e */
        public void mo964e(AbstractC0250l abstractC0250l) {
            AbstractC0262x.m1091a(this.f941a).mo1089d(this.f942b);
        }
    }

    /* renamed from: E1.N$c */
    public static class c {

        /* renamed from: a */
        public boolean f951a;

        /* renamed from: b */
        public boolean f952b;

        /* renamed from: c */
        public int f953c;

        /* renamed from: d */
        public int f954d;

        /* renamed from: e */
        public ViewGroup f955e;

        /* renamed from: f */
        public ViewGroup f956f;
    }

    /* renamed from: d0 */
    private void m950d0(C0257s c0257s) {
        c0257s.f1080a.put("android:visibility:visibility", Integer.valueOf(c0257s.f1081b.getVisibility()));
        c0257s.f1080a.put("android:visibility:parent", c0257s.f1081b.getParent());
        int[] iArr = new int[2];
        c0257s.f1081b.getLocationOnScreen(iArr);
        c0257s.f1080a.put("android:visibility:screenLocation", iArr);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: E */
    public String[] mo951E() {
        return f939Q;
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: G */
    public boolean mo952G(C0257s c0257s, C0257s c0257s2) {
        if (c0257s == null && c0257s2 == null) {
            return false;
        }
        if (c0257s != null && c0257s2 != null && c0257s2.f1080a.containsKey("android:visibility:visibility") != c0257s.f1080a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m953e0 = m953e0(c0257s, c0257s2);
        if (m953e0.f951a) {
            return m953e0.f953c == 0 || m953e0.f954d == 0;
        }
        return false;
    }

    /* renamed from: e0 */
    public final c m953e0(C0257s c0257s, C0257s c0257s2) {
        c cVar = new c();
        cVar.f951a = false;
        cVar.f952b = false;
        if (c0257s == null || !c0257s.f1080a.containsKey("android:visibility:visibility")) {
            cVar.f953c = -1;
            cVar.f955e = null;
        } else {
            cVar.f953c = ((Integer) c0257s.f1080a.get("android:visibility:visibility")).intValue();
            cVar.f955e = (ViewGroup) c0257s.f1080a.get("android:visibility:parent");
        }
        if (c0257s2 == null || !c0257s2.f1080a.containsKey("android:visibility:visibility")) {
            cVar.f954d = -1;
            cVar.f956f = null;
        } else {
            cVar.f954d = ((Integer) c0257s2.f1080a.get("android:visibility:visibility")).intValue();
            cVar.f956f = (ViewGroup) c0257s2.f1080a.get("android:visibility:parent");
        }
        if (c0257s != null && c0257s2 != null) {
            int i7 = cVar.f953c;
            int i8 = cVar.f954d;
            if (i7 == i8 && cVar.f955e == cVar.f956f) {
                return cVar;
            }
            if (i7 != i8) {
                if (i7 == 0) {
                    cVar.f952b = false;
                    cVar.f951a = true;
                } else if (i8 == 0) {
                    cVar.f952b = true;
                    cVar.f951a = true;
                }
            } else if (cVar.f956f == null) {
                cVar.f952b = false;
                cVar.f951a = true;
            } else if (cVar.f955e == null) {
                cVar.f952b = true;
                cVar.f951a = true;
            }
        } else if (c0257s == null && cVar.f954d == 0) {
            cVar.f952b = true;
            cVar.f951a = true;
        } else if (c0257s2 == null && cVar.f953c == 0) {
            cVar.f952b = false;
            cVar.f951a = true;
        }
        return cVar;
    }

    /* renamed from: f0 */
    public Animator m954f0(ViewGroup viewGroup, C0257s c0257s, int i7, C0257s c0257s2, int i8) {
        if ((this.f940P & 1) != 1 || c0257s2 == null) {
            return null;
        }
        if (c0257s == null) {
            View view = (View) c0257s2.f1081b.getParent();
            if (m953e0(m1059u(view, false), m1022F(view, false)).f951a) {
                return null;
            }
        }
        return mo956g0(viewGroup, c0257s2.f1081b, c0257s, c0257s2);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: g */
    public void mo955g(C0257s c0257s) {
        m950d0(c0257s);
    }

    /* renamed from: g0 */
    public abstract Animator mo956g0(ViewGroup viewGroup, View view, C0257s c0257s, C0257s c0257s2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r10.f1025C != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m957h0(android.view.ViewGroup r11, p030E1.C0257s r12, int r13, p030E1.C0257s r14, int r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p030E1.AbstractC0236N.m957h0(android.view.ViewGroup, E1.s, int, E1.s, int):android.animation.Animator");
    }

    /* renamed from: i0 */
    public abstract Animator mo958i0(ViewGroup viewGroup, View view, C0257s c0257s, C0257s c0257s2);

    /* renamed from: j0 */
    public void m959j0(int i7) {
        if ((i7 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f940P = i7;
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: k */
    public void mo960k(C0257s c0257s) {
        m950d0(c0257s);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: o */
    public Animator mo961o(ViewGroup viewGroup, C0257s c0257s, C0257s c0257s2) {
        c m953e0 = m953e0(c0257s, c0257s2);
        if (!m953e0.f951a) {
            return null;
        }
        if (m953e0.f955e == null && m953e0.f956f == null) {
            return null;
        }
        return m953e0.f952b ? m954f0(viewGroup, c0257s, m953e0.f953c, c0257s2, m953e0.f954d) : m957h0(viewGroup, c0257s, m953e0.f953c, c0257s2, m953e0.f954d);
    }

    /* renamed from: E1.N$b */
    public static class b extends AnimatorListenerAdapter implements AbstractC0250l.f {

        /* renamed from: a */
        public final View f945a;

        /* renamed from: b */
        public final int f946b;

        /* renamed from: c */
        public final ViewGroup f947c;

        /* renamed from: d */
        public final boolean f948d;

        /* renamed from: e */
        public boolean f949e;

        /* renamed from: f */
        public boolean f950f = false;

        public b(View view, int i7, boolean z6) {
            this.f945a = view;
            this.f946b = i7;
            this.f947c = (ViewGroup) view.getParent();
            this.f948d = z6;
            m968g(true);
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            m967f();
            abstractC0250l.mo1031Q(this);
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: c */
        public void mo963c(AbstractC0250l abstractC0250l) {
            m968g(true);
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: e */
        public void mo964e(AbstractC0250l abstractC0250l) {
            m968g(false);
        }

        /* renamed from: f */
        public final void m967f() {
            if (!this.f950f) {
                AbstractC0223A.m929h(this.f945a, this.f946b);
                ViewGroup viewGroup = this.f947c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m968g(false);
        }

        /* renamed from: g */
        public final void m968g(boolean z6) {
            ViewGroup viewGroup;
            if (!this.f948d || this.f949e == z6 || (viewGroup = this.f947c) == null) {
                return;
            }
            this.f949e = z6;
            AbstractC0262x.m1093c(viewGroup, z6);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f950f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m967f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f950f) {
                return;
            }
            AbstractC0223A.m929h(this.f945a, this.f946b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f950f) {
                return;
            }
            AbstractC0223A.m929h(this.f945a, 0);
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: b */
        public void mo965b(AbstractC0250l abstractC0250l) {
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: d */
        public void mo966d(AbstractC0250l abstractC0250l) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}

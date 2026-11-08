package p161X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.InterfaceC3333P;
import org.apache.tika.utils.StringUtils;
import p049H.AbstractC0475B;
import p154W.AbstractC2651b;
import p161X.AbstractC2768Z;
import p168Y.C2884c;

/* renamed from: X.O */
/* loaded from: classes.dex */
public class C2758O {

    /* renamed from: a */
    public final C2746C f8200a;

    /* renamed from: b */
    public final C2759P f8201b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC2786p f8202c;

    /* renamed from: d */
    public boolean f8203d = false;

    /* renamed from: e */
    public int f8204e = -1;

    /* renamed from: X.O$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8207a;

        static {
            int[] iArr = new int[AbstractC3345j.b.values().length];
            f8207a = iArr;
            try {
                iArr[AbstractC3345j.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8207a[AbstractC3345j.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8207a[AbstractC3345j.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8207a[AbstractC3345j.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C2758O(C2746C c2746c, C2759P c2759p, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        this.f8200a = c2746c;
        this.f8201b = c2759p;
        this.f8202c = abstractComponentCallbacksC2786p;
    }

    /* renamed from: a */
    public void m9562a() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f8202c);
        }
        Bundle bundle = this.f8202c.f8447b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f8202c.m9838P0(bundle2);
        this.f8200a.m9382a(this.f8202c, bundle2, false);
    }

    /* renamed from: b */
    public void m9563b() {
        AbstractComponentCallbacksC2786p m9407l0 = AbstractC2752I.m9407l0(this.f8202c.f8434P);
        AbstractComponentCallbacksC2786p m9823G = this.f8202c.m9823G();
        if (m9407l0 != null && !m9407l0.equals(m9823G)) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
            C2884c.m10406j(abstractComponentCallbacksC2786p, m9407l0, abstractComponentCallbacksC2786p.f8425G);
        }
        int m9594j = this.f8201b.m9594j(this.f8202c);
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8202c;
        abstractComponentCallbacksC2786p2.f8434P.addView(abstractComponentCallbacksC2786p2.f8435Q, m9594j);
    }

    /* renamed from: c */
    public void m9564c() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f8202c);
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = abstractComponentCallbacksC2786p.f8462o;
        C2758O c2758o = null;
        if (abstractComponentCallbacksC2786p2 != null) {
            C2758O m9598n = this.f8201b.m9598n(abstractComponentCallbacksC2786p2.f8455f);
            if (m9598n == null) {
                throw new IllegalStateException("Fragment " + this.f8202c + " declared target fragment " + this.f8202c.f8462o + " that does not belong to this FragmentManager!");
            }
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = this.f8202c;
            abstractComponentCallbacksC2786p3.f8463p = abstractComponentCallbacksC2786p3.f8462o.f8455f;
            abstractComponentCallbacksC2786p3.f8462o = null;
            c2758o = m9598n;
        } else {
            String str = abstractComponentCallbacksC2786p.f8463p;
            if (str != null && (c2758o = this.f8201b.m9598n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f8202c + " declared target fragment " + this.f8202c.f8463p + " that does not belong to this FragmentManager!");
            }
        }
        if (c2758o != null) {
            c2758o.m9574m();
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p4 = this.f8202c;
        abstractComponentCallbacksC2786p4.f8421C = abstractComponentCallbacksC2786p4.f8420B.m9512v0();
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p5 = this.f8202c;
        abstractComponentCallbacksC2786p5.f8423E = abstractComponentCallbacksC2786p5.f8420B.m9519y0();
        this.f8200a.m9388g(this.f8202c, false);
        this.f8202c.m9840Q0();
        this.f8200a.m9383b(this.f8202c, false);
    }

    /* renamed from: d */
    public int m9565d() {
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        if (abstractComponentCallbacksC2786p.f8420B == null) {
            return abstractComponentCallbacksC2786p.f8445a;
        }
        int i7 = this.f8204e;
        int i8 = b.f8207a[abstractComponentCallbacksC2786p.f8446a0.ordinal()];
        if (i8 != 1) {
            i7 = i8 != 2 ? i8 != 3 ? i8 != 4 ? Math.min(i7, -1) : Math.min(i7, 0) : Math.min(i7, 1) : Math.min(i7, 5);
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8202c;
        if (abstractComponentCallbacksC2786p2.f8470w) {
            if (abstractComponentCallbacksC2786p2.f8471x) {
                i7 = Math.max(this.f8204e, 2);
                View view = this.f8202c.f8435Q;
                if (view != null && view.getParent() == null) {
                    i7 = Math.min(i7, 2);
                }
            } else {
                i7 = this.f8204e < 4 ? Math.min(i7, abstractComponentCallbacksC2786p2.f8445a) : Math.min(i7, 1);
            }
        }
        if (!this.f8202c.f8466s) {
            i7 = Math.min(i7, 1);
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = this.f8202c;
        ViewGroup viewGroup = abstractComponentCallbacksC2786p3.f8434P;
        AbstractC2768Z.d.a m9674s = viewGroup != null ? AbstractC2768Z.m9656u(viewGroup, abstractComponentCallbacksC2786p3.m9825H()).m9674s(this) : null;
        if (m9674s == AbstractC2768Z.d.a.ADDING) {
            i7 = Math.min(i7, 6);
        } else if (m9674s == AbstractC2768Z.d.a.REMOVING) {
            i7 = Math.max(i7, 3);
        } else {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p4 = this.f8202c;
            if (abstractComponentCallbacksC2786p4.f8467t) {
                i7 = abstractComponentCallbacksC2786p4.m9859b0() ? Math.min(i7, 1) : Math.min(i7, -1);
            }
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p5 = this.f8202c;
        if (abstractComponentCallbacksC2786p5.f8436R && abstractComponentCallbacksC2786p5.f8445a < 5) {
            i7 = Math.min(i7, 4);
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p6 = this.f8202c;
        if (abstractComponentCallbacksC2786p6.f8468u && abstractComponentCallbacksC2786p6.f8434P != null) {
            i7 = Math.max(i7, 3);
        }
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i7 + " for " + this.f8202c);
        }
        return i7;
    }

    /* renamed from: e */
    public void m9566e() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f8202c);
        }
        Bundle bundle = this.f8202c.f8447b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        if (abstractComponentCallbacksC2786p.f8443Y) {
            abstractComponentCallbacksC2786p.f8445a = 1;
            abstractComponentCallbacksC2786p.m9898r1();
        } else {
            this.f8200a.m9389h(abstractComponentCallbacksC2786p, bundle2, false);
            this.f8202c.m9846T0(bundle2);
            this.f8200a.m9384c(this.f8202c, bundle2, false);
        }
    }

    /* renamed from: f */
    public void m9567f() {
        String str;
        if (this.f8202c.f8470w) {
            return;
        }
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f8202c);
        }
        Bundle bundle = this.f8202c.f8447b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater m9856Z0 = this.f8202c.m9856Z0(bundle2);
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        ViewGroup viewGroup2 = abstractComponentCallbacksC2786p.f8434P;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i7 = abstractComponentCallbacksC2786p.f8425G;
            if (i7 != 0) {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f8202c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC2786p.f8420B.m9500r0().mo9804m(this.f8202c.f8425G);
                if (viewGroup == null) {
                    AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8202c;
                    if (!abstractComponentCallbacksC2786p2.f8472y) {
                        try {
                            str = abstractComponentCallbacksC2786p2.m9834N().getResourceName(this.f8202c.f8425G);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f8202c.f8425G) + " (" + str + ") for fragment " + this.f8202c);
                    }
                } else if (!(viewGroup instanceof C2794x)) {
                    C2884c.m10405i(this.f8202c, viewGroup);
                }
            }
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = this.f8202c;
        abstractComponentCallbacksC2786p3.f8434P = viewGroup;
        abstractComponentCallbacksC2786p3.mo9795V0(m9856Z0, viewGroup, bundle2);
        if (this.f8202c.f8435Q != null) {
            if (AbstractC2752I.m9397I0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f8202c);
            }
            this.f8202c.f8435Q.setSaveFromParentEnabled(false);
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p4 = this.f8202c;
            abstractComponentCallbacksC2786p4.f8435Q.setTag(AbstractC2651b.f7861a, abstractComponentCallbacksC2786p4);
            if (viewGroup != null) {
                m9563b();
            }
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p5 = this.f8202c;
            if (abstractComponentCallbacksC2786p5.f8427I) {
                abstractComponentCallbacksC2786p5.f8435Q.setVisibility(8);
            }
            if (this.f8202c.f8435Q.isAttachedToWindow()) {
                AbstractC0475B.m1728F(this.f8202c.f8435Q);
            } else {
                View view = this.f8202c.f8435Q;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f8202c.m9884m1();
            C2746C c2746c = this.f8200a;
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p6 = this.f8202c;
            c2746c.m9394m(abstractComponentCallbacksC2786p6, abstractComponentCallbacksC2786p6.f8435Q, bundle2, false);
            int visibility = this.f8202c.f8435Q.getVisibility();
            this.f8202c.m9918z1(this.f8202c.f8435Q.getAlpha());
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p7 = this.f8202c;
            if (abstractComponentCallbacksC2786p7.f8434P != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC2786p7.f8435Q.findFocus();
                if (findFocus != null) {
                    this.f8202c.m9910w1(findFocus);
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f8202c);
                    }
                }
                this.f8202c.f8435Q.setAlpha(0.0f);
            }
        }
        this.f8202c.f8445a = 2;
    }

    /* renamed from: g */
    public void m9568g() {
        AbstractComponentCallbacksC2786p m9590f;
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f8202c);
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        boolean z6 = true;
        boolean z7 = abstractComponentCallbacksC2786p.f8467t && !abstractComponentCallbacksC2786p.m9859b0();
        if (z7) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8202c;
            if (!abstractComponentCallbacksC2786p2.f8469v) {
                this.f8201b.m9584B(abstractComponentCallbacksC2786p2.f8455f, null);
            }
        }
        if (!z7 && !this.f8201b.m9600p().m9555q(this.f8202c)) {
            String str = this.f8202c.f8463p;
            if (str != null && (m9590f = this.f8201b.m9590f(str)) != null && m9590f.f8429K) {
                this.f8202c.f8462o = m9590f;
            }
            this.f8202c.f8445a = 0;
            return;
        }
        AbstractC2744A abstractC2744A = this.f8202c.f8421C;
        if (abstractC2744A instanceof InterfaceC3333P) {
            z6 = this.f8201b.m9600p().m9552n();
        } else if (abstractC2744A.m9376t() instanceof Activity) {
            z6 = true ^ ((Activity) abstractC2744A.m9376t()).isChangingConfigurations();
        }
        if ((z7 && !this.f8202c.f8469v) || z6) {
            this.f8201b.m9600p().m9545f(this.f8202c, false);
        }
        this.f8202c.m9851W0();
        this.f8200a.m9385d(this.f8202c, false);
        for (C2758O c2758o : this.f8201b.m9595k()) {
            if (c2758o != null) {
                AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
                if (this.f8202c.f8455f.equals(m9572k.f8463p)) {
                    m9572k.f8462o = this.f8202c;
                    m9572k.f8463p = null;
                }
            }
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = this.f8202c;
        String str2 = abstractComponentCallbacksC2786p3.f8463p;
        if (str2 != null) {
            abstractComponentCallbacksC2786p3.f8462o = this.f8201b.m9590f(str2);
        }
        this.f8201b.m9603s(this);
    }

    /* renamed from: h */
    public void m9569h() {
        View view;
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f8202c);
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        ViewGroup viewGroup = abstractComponentCallbacksC2786p.f8434P;
        if (viewGroup != null && (view = abstractComponentCallbacksC2786p.f8435Q) != null) {
            viewGroup.removeView(view);
        }
        this.f8202c.m9853X0();
        this.f8200a.m9395n(this.f8202c, false);
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8202c;
        abstractComponentCallbacksC2786p2.f8434P = null;
        abstractComponentCallbacksC2786p2.f8435Q = null;
        abstractComponentCallbacksC2786p2.f8450c0 = null;
        abstractComponentCallbacksC2786p2.f8452d0.mo12971n(null);
        this.f8202c.f8471x = false;
    }

    /* renamed from: i */
    public void m9570i() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f8202c);
        }
        this.f8202c.m9854Y0();
        this.f8200a.m9386e(this.f8202c, false);
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        abstractComponentCallbacksC2786p.f8445a = -1;
        abstractComponentCallbacksC2786p.f8421C = null;
        abstractComponentCallbacksC2786p.f8423E = null;
        abstractComponentCallbacksC2786p.f8420B = null;
        if ((!abstractComponentCallbacksC2786p.f8467t || abstractComponentCallbacksC2786p.m9859b0()) && !this.f8201b.m9600p().m9555q(this.f8202c)) {
            return;
        }
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f8202c);
        }
        this.f8202c.m9852X();
    }

    /* renamed from: j */
    public void m9571j() {
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        if (abstractComponentCallbacksC2786p.f8470w && abstractComponentCallbacksC2786p.f8471x && !abstractComponentCallbacksC2786p.f8473z) {
            if (AbstractC2752I.m9397I0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f8202c);
            }
            Bundle bundle = this.f8202c.f8447b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8202c;
            abstractComponentCallbacksC2786p2.mo9795V0(abstractComponentCallbacksC2786p2.m9856Z0(bundle2), null, bundle2);
            View view = this.f8202c.f8435Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = this.f8202c;
                abstractComponentCallbacksC2786p3.f8435Q.setTag(AbstractC2651b.f7861a, abstractComponentCallbacksC2786p3);
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p4 = this.f8202c;
                if (abstractComponentCallbacksC2786p4.f8427I) {
                    abstractComponentCallbacksC2786p4.f8435Q.setVisibility(8);
                }
                this.f8202c.m9884m1();
                C2746C c2746c = this.f8200a;
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p5 = this.f8202c;
                c2746c.m9394m(abstractComponentCallbacksC2786p5, abstractComponentCallbacksC2786p5.f8435Q, bundle2, false);
                this.f8202c.f8445a = 2;
            }
        }
    }

    /* renamed from: k */
    public AbstractComponentCallbacksC2786p m9572k() {
        return this.f8202c;
    }

    /* renamed from: l */
    public final boolean m9573l(View view) {
        if (view == this.f8202c.f8435Q) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f8202c.f8435Q) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void m9574m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f8203d) {
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m9572k());
                return;
            }
            return;
        }
        try {
            this.f8203d = true;
            boolean z6 = false;
            while (true) {
                int m9565d = m9565d();
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
                int i7 = abstractComponentCallbacksC2786p.f8445a;
                if (m9565d == i7) {
                    if (!z6 && i7 == -1 && abstractComponentCallbacksC2786p.f8467t && !abstractComponentCallbacksC2786p.m9859b0() && !this.f8202c.f8469v) {
                        if (AbstractC2752I.m9397I0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f8202c);
                        }
                        this.f8201b.m9600p().m9545f(this.f8202c, true);
                        this.f8201b.m9603s(this);
                        if (AbstractC2752I.m9397I0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f8202c);
                        }
                        this.f8202c.m9852X();
                    }
                    AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8202c;
                    if (abstractComponentCallbacksC2786p2.f8441W) {
                        if (abstractComponentCallbacksC2786p2.f8435Q != null && (viewGroup = abstractComponentCallbacksC2786p2.f8434P) != null) {
                            AbstractC2768Z m9656u = AbstractC2768Z.m9656u(viewGroup, abstractComponentCallbacksC2786p2.m9825H());
                            if (this.f8202c.f8427I) {
                                m9656u.m9666k(this);
                            } else {
                                m9656u.m9668m(this);
                            }
                        }
                        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = this.f8202c;
                        AbstractC2752I abstractC2752I = abstractComponentCallbacksC2786p3.f8420B;
                        if (abstractC2752I != null) {
                            abstractC2752I.m9421G0(abstractComponentCallbacksC2786p3);
                        }
                        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p4 = this.f8202c;
                        abstractComponentCallbacksC2786p4.f8441W = false;
                        abstractComponentCallbacksC2786p4.m9914y0(abstractComponentCallbacksC2786p4.f8427I);
                        this.f8202c.f8422D.m9424I();
                    }
                    this.f8203d = false;
                    return;
                }
                if (m9565d <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            m9570i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC2786p.f8469v && this.f8201b.m9601q(abstractComponentCallbacksC2786p.f8455f) == null) {
                                this.f8201b.m9584B(this.f8202c.f8455f, m9578q());
                            }
                            m9568g();
                            break;
                        case 1:
                            m9569h();
                            this.f8202c.f8445a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC2786p.f8471x = false;
                            abstractComponentCallbacksC2786p.f8445a = 2;
                            break;
                        case 3:
                            if (AbstractC2752I.m9397I0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f8202c);
                            }
                            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p5 = this.f8202c;
                            if (abstractComponentCallbacksC2786p5.f8469v) {
                                this.f8201b.m9584B(abstractComponentCallbacksC2786p5.f8455f, m9578q());
                            } else if (abstractComponentCallbacksC2786p5.f8435Q != null && abstractComponentCallbacksC2786p5.f8449c == null) {
                                m9579r();
                            }
                            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p6 = this.f8202c;
                            if (abstractComponentCallbacksC2786p6.f8435Q != null && (viewGroup2 = abstractComponentCallbacksC2786p6.f8434P) != null) {
                                AbstractC2768Z.m9656u(viewGroup2, abstractComponentCallbacksC2786p6.m9825H()).m9667l(this);
                            }
                            this.f8202c.f8445a = 3;
                            break;
                        case 4:
                            m9582u();
                            break;
                        case 5:
                            abstractComponentCallbacksC2786p.f8445a = 5;
                            break;
                        case 6:
                            m9575n();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            m9564c();
                            break;
                        case 1:
                            m9566e();
                            break;
                        case 2:
                            m9571j();
                            m9567f();
                            break;
                        case 3:
                            m9562a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC2786p.f8435Q != null && (viewGroup3 = abstractComponentCallbacksC2786p.f8434P) != null) {
                                AbstractC2768Z.m9656u(viewGroup3, abstractComponentCallbacksC2786p.m9825H()).m9665j(AbstractC2768Z.d.b.m9709g(this.f8202c.f8435Q.getVisibility()), this);
                            }
                            this.f8202c.f8445a = 4;
                            break;
                        case 5:
                            m9581t();
                            break;
                        case 6:
                            abstractComponentCallbacksC2786p.f8445a = 6;
                            break;
                        case 7:
                            m9577p();
                            break;
                    }
                }
                z6 = true;
            }
        } catch (Throwable th) {
            this.f8203d = false;
            throw th;
        }
    }

    /* renamed from: n */
    public void m9575n() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f8202c);
        }
        this.f8202c.m9866e1();
        this.f8200a.m9387f(this.f8202c, false);
    }

    /* renamed from: o */
    public void m9576o(ClassLoader classLoader) {
        Bundle bundle = this.f8202c.f8447b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f8202c.f8447b.getBundle("savedInstanceState") == null) {
            this.f8202c.f8447b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
            abstractComponentCallbacksC2786p.f8449c = abstractComponentCallbacksC2786p.f8447b.getSparseParcelableArray("viewState");
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8202c;
            abstractComponentCallbacksC2786p2.f8451d = abstractComponentCallbacksC2786p2.f8447b.getBundle("viewRegistryState");
            C2757N c2757n = (C2757N) this.f8202c.f8447b.getParcelable("state");
            if (c2757n != null) {
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = this.f8202c;
                abstractComponentCallbacksC2786p3.f8463p = c2757n.f8197s;
                abstractComponentCallbacksC2786p3.f8464q = c2757n.f8198t;
                Boolean bool = abstractComponentCallbacksC2786p3.f8453e;
                if (bool != null) {
                    abstractComponentCallbacksC2786p3.f8437S = bool.booleanValue();
                    this.f8202c.f8453e = null;
                } else {
                    abstractComponentCallbacksC2786p3.f8437S = c2757n.f8199u;
                }
            }
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p4 = this.f8202c;
            if (abstractComponentCallbacksC2786p4.f8437S) {
                return;
            }
            abstractComponentCallbacksC2786p4.f8436R = true;
        } catch (BadParcelableException e7) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + m9572k(), e7);
        }
    }

    /* renamed from: p */
    public void m9577p() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f8202c);
        }
        View m9811B = this.f8202c.m9811B();
        if (m9811B != null && m9573l(m9811B)) {
            boolean requestFocus = m9811B.requestFocus();
            if (AbstractC2752I.m9397I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(m9811B);
                sb.append(StringUtils.SPACE);
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f8202c);
                sb.append(" resulting in focused view ");
                sb.append(this.f8202c.f8435Q.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f8202c.m9910w1(null);
        this.f8202c.m9874i1();
        this.f8200a.m9390i(this.f8202c, false);
        this.f8201b.m9584B(this.f8202c.f8455f, null);
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        abstractComponentCallbacksC2786p.f8447b = null;
        abstractComponentCallbacksC2786p.f8449c = null;
        abstractComponentCallbacksC2786p.f8451d = null;
    }

    /* renamed from: q */
    public Bundle m9578q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8202c;
        if (abstractComponentCallbacksC2786p.f8445a == -1 && (bundle = abstractComponentCallbacksC2786p.f8447b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C2757N(this.f8202c));
        if (this.f8202c.f8445a > -1) {
            Bundle bundle3 = new Bundle();
            this.f8202c.m9876j1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f8200a.m9391j(this.f8202c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f8202c.f8456f0.m95e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle m9440Q0 = this.f8202c.f8422D.m9440Q0();
            if (!m9440Q0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", m9440Q0);
            }
            if (this.f8202c.f8435Q != null) {
                m9579r();
            }
            SparseArray<? extends Parcelable> sparseArray = this.f8202c.f8449c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f8202c.f8451d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f8202c.f8461n;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* renamed from: r */
    public void m9579r() {
        if (this.f8202c.f8435Q == null) {
            return;
        }
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f8202c + " with view " + this.f8202c.f8435Q);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f8202c.f8435Q.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f8202c.f8449c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f8202c.f8450c0.m9648g(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f8202c.f8451d = bundle;
    }

    /* renamed from: s */
    public void m9580s(int i7) {
        this.f8204e = i7;
    }

    /* renamed from: t */
    public void m9581t() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f8202c);
        }
        this.f8202c.m9879k1();
        this.f8200a.m9392k(this.f8202c, false);
    }

    /* renamed from: u */
    public void m9582u() {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f8202c);
        }
        this.f8202c.m9881l1();
        this.f8200a.m9393l(this.f8202c, false);
    }

    public C2758O(C2746C c2746c, C2759P c2759p, ClassLoader classLoader, AbstractC2796z abstractC2796z, Bundle bundle) {
        this.f8200a = c2746c;
        this.f8201b = c2759p;
        AbstractComponentCallbacksC2786p m9559a = ((C2757N) bundle.getParcelable("state")).m9559a(abstractC2796z, classLoader);
        this.f8202c = m9559a;
        m9559a.f8447b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        m9559a.m9909v1(bundle2);
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + m9559a);
        }
    }

    public C2758O(C2746C c2746c, C2759P c2759p, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, Bundle bundle) {
        this.f8200a = c2746c;
        this.f8201b = c2759p;
        this.f8202c = abstractComponentCallbacksC2786p;
        abstractComponentCallbacksC2786p.f8449c = null;
        abstractComponentCallbacksC2786p.f8451d = null;
        abstractComponentCallbacksC2786p.f8419A = 0;
        abstractComponentCallbacksC2786p.f8471x = false;
        abstractComponentCallbacksC2786p.f8466s = false;
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = abstractComponentCallbacksC2786p.f8462o;
        abstractComponentCallbacksC2786p.f8463p = abstractComponentCallbacksC2786p2 != null ? abstractComponentCallbacksC2786p2.f8455f : null;
        abstractComponentCallbacksC2786p.f8462o = null;
        abstractComponentCallbacksC2786p.f8447b = bundle;
        abstractComponentCallbacksC2786p.f8461n = bundle.getBundle("arguments");
    }

    /* renamed from: X.O$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f8205a;

        public a(View view) {
            this.f8205a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f8205a.removeOnAttachStateChangeListener(this);
            AbstractC0475B.m1728F(this.f8205a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}

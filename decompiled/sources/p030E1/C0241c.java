package p030E1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p049H.AbstractC0475B;

/* renamed from: E1.c */
/* loaded from: classes.dex */
public class C0241c extends AbstractC0250l {

    /* renamed from: S */
    public static final String[] f958S = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: T */
    public static final Property f959T = new b(PointF.class, "boundsOrigin");

    /* renamed from: U */
    public static final Property f960U = new c(PointF.class, "topLeft");

    /* renamed from: V */
    public static final Property f961V = new d(PointF.class, "bottomRight");

    /* renamed from: W */
    public static final Property f962W = new e(PointF.class, "bottomRight");

    /* renamed from: X */
    public static final Property f963X = new f(PointF.class, "topLeft");

    /* renamed from: Y */
    public static final Property f964Y = new g(PointF.class, "position");

    /* renamed from: Z */
    public static C0248j f965Z = new C0248j();

    /* renamed from: P */
    public int[] f966P = new int[2];

    /* renamed from: Q */
    public boolean f967Q = false;

    /* renamed from: R */
    public boolean f968R = false;

    /* renamed from: E1.c$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f969a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f970b;

        /* renamed from: c */
        public final /* synthetic */ View f971c;

        /* renamed from: d */
        public final /* synthetic */ float f972d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f7) {
            this.f969a = viewGroup;
            this.f970b = bitmapDrawable;
            this.f971c = view;
            this.f972d = f7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0223A.m923b(this.f969a).mo1087b(this.f970b);
            AbstractC0223A.m928g(this.f971c, this.f972d);
        }
    }

    /* renamed from: E1.c$b */
    public class b extends Property {

        /* renamed from: a */
        public Rect f974a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f974a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f974a);
            Rect rect = this.f974a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f974a);
            this.f974a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f974a);
        }
    }

    /* renamed from: E1.c$c */
    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m989c(pointF);
        }
    }

    /* renamed from: E1.c$d */
    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m987a(pointF);
        }
    }

    /* renamed from: E1.c$e */
    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC0223A.m927f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: E1.c$f */
    public class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC0223A.m927f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: E1.c$g */
    public class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            AbstractC0223A.m927f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: E1.c$h */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ k f975a;
        private k mViewBounds;

        public h(k kVar) {
            this.f975a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: E1.c$i */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f977a;

        /* renamed from: b */
        public final /* synthetic */ View f978b;

        /* renamed from: c */
        public final /* synthetic */ Rect f979c;

        /* renamed from: d */
        public final /* synthetic */ int f980d;

        /* renamed from: e */
        public final /* synthetic */ int f981e;

        /* renamed from: f */
        public final /* synthetic */ int f982f;

        /* renamed from: g */
        public final /* synthetic */ int f983g;

        public i(View view, Rect rect, int i7, int i8, int i9, int i10) {
            this.f978b = view;
            this.f979c = rect;
            this.f980d = i7;
            this.f981e = i8;
            this.f982f = i9;
            this.f983g = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f977a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f977a) {
                return;
            }
            AbstractC0475B.m1734L(this.f978b, this.f979c);
            AbstractC0223A.m927f(this.f978b, this.f980d, this.f981e, this.f982f, this.f983g);
        }
    }

    /* renamed from: E1.c$j */
    public class j extends AbstractC0251m {

        /* renamed from: a */
        public boolean f985a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f986b;

        public j(ViewGroup viewGroup) {
            this.f986b = viewGroup;
        }

        @Override // p030E1.AbstractC0250l.f
        /* renamed from: a */
        public void mo962a(AbstractC0250l abstractC0250l) {
            if (!this.f985a) {
                AbstractC0262x.m1093c(this.f986b, false);
            }
            abstractC0250l.mo1031Q(this);
        }

        @Override // p030E1.AbstractC0251m, p030E1.AbstractC0250l.f
        /* renamed from: c */
        public void mo963c(AbstractC0250l abstractC0250l) {
            AbstractC0262x.m1093c(this.f986b, true);
        }

        @Override // p030E1.AbstractC0251m, p030E1.AbstractC0250l.f
        /* renamed from: d */
        public void mo966d(AbstractC0250l abstractC0250l) {
            AbstractC0262x.m1093c(this.f986b, false);
            this.f985a = true;
        }

        @Override // p030E1.AbstractC0251m, p030E1.AbstractC0250l.f
        /* renamed from: e */
        public void mo964e(AbstractC0250l abstractC0250l) {
            AbstractC0262x.m1093c(this.f986b, false);
        }
    }

    /* renamed from: E1.c$k */
    public static class k {

        /* renamed from: a */
        public int f988a;

        /* renamed from: b */
        public int f989b;

        /* renamed from: c */
        public int f990c;

        /* renamed from: d */
        public int f991d;

        /* renamed from: e */
        public View f992e;

        /* renamed from: f */
        public int f993f;

        /* renamed from: g */
        public int f994g;

        public k(View view) {
            this.f992e = view;
        }

        /* renamed from: a */
        public void m987a(PointF pointF) {
            this.f990c = Math.round(pointF.x);
            this.f991d = Math.round(pointF.y);
            int i7 = this.f994g + 1;
            this.f994g = i7;
            if (this.f993f == i7) {
                m988b();
            }
        }

        /* renamed from: b */
        public final void m988b() {
            AbstractC0223A.m927f(this.f992e, this.f988a, this.f989b, this.f990c, this.f991d);
            this.f993f = 0;
            this.f994g = 0;
        }

        /* renamed from: c */
        public void m989c(PointF pointF) {
            this.f988a = Math.round(pointF.x);
            this.f989b = Math.round(pointF.y);
            int i7 = this.f993f + 1;
            this.f993f = i7;
            if (i7 == this.f994g) {
                m988b();
            }
        }
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: E */
    public String[] mo951E() {
        return f958S;
    }

    /* renamed from: d0 */
    public final void m973d0(C0257s c0257s) {
        View view = c0257s.f1081b;
        if (!AbstractC0475B.m1765x(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c0257s.f1080a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c0257s.f1080a.put("android:changeBounds:parent", c0257s.f1081b.getParent());
        if (this.f968R) {
            c0257s.f1081b.getLocationInWindow(this.f966P);
            c0257s.f1080a.put("android:changeBounds:windowX", Integer.valueOf(this.f966P[0]));
            c0257s.f1080a.put("android:changeBounds:windowY", Integer.valueOf(this.f966P[1]));
        }
        if (this.f967Q) {
            c0257s.f1080a.put("android:changeBounds:clip", AbstractC0475B.m1751j(view));
        }
    }

    /* renamed from: e0 */
    public final boolean m974e0(View view, View view2) {
        if (!this.f968R) {
            return true;
        }
        C0257s m1059u = m1059u(view, true);
        if (m1059u == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m1059u.f1081b) {
            return true;
        }
        return false;
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: g */
    public void mo955g(C0257s c0257s) {
        m973d0(c0257s);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: k */
    public void mo960k(C0257s c0257s) {
        m973d0(c0257s);
    }

    @Override // p030E1.AbstractC0250l
    /* renamed from: o */
    public Animator mo961o(ViewGroup viewGroup, C0257s c0257s, C0257s c0257s2) {
        int i7;
        View view;
        int i8;
        ObjectAnimator objectAnimator;
        Animator m1085c;
        if (c0257s == null || c0257s2 == null) {
            return null;
        }
        Map map = c0257s.f1080a;
        Map map2 = c0257s2.f1080a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c0257s2.f1081b;
        if (!m974e0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) c0257s.f1080a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) c0257s.f1080a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) c0257s2.f1080a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) c0257s2.f1080a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f966P);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float m924c = AbstractC0223A.m924c(view2);
            AbstractC0223A.m928g(view2, 0.0f);
            AbstractC0223A.m923b(viewGroup).mo1086a(bitmapDrawable);
            AbstractC0245g m1061w = m1061w();
            int[] iArr = this.f966P;
            int i9 = iArr[0];
            int i10 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC0246h.m1011a(f959T, m1061w.mo1010a(intValue - i9, intValue2 - i10, intValue3 - i9, intValue4 - i10)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, m924c));
            return ofPropertyValuesHolder;
        }
        Rect rect = (Rect) c0257s.f1080a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) c0257s2.f1080a.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) c0257s.f1080a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) c0257s2.f1080a.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i7 = 0;
        } else {
            i7 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i7++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i7++;
        }
        if (i7 <= 0) {
            return null;
        }
        if (this.f967Q) {
            view = view2;
            AbstractC0223A.m927f(view, i11, i13, Math.max(i19, i21) + i11, Math.max(i20, i22) + i13);
            ObjectAnimator m1009a = (i11 == i12 && i13 == i14) ? null : AbstractC0244f.m1009a(view, f964Y, m1061w().mo1010a(i11, i13, i12, i14));
            if (rect3 == null) {
                i8 = 0;
                rect3 = new Rect(0, 0, i19, i20);
            } else {
                i8 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i8, i8, i21, i22) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                AbstractC0475B.m1734L(view, rect3);
                C0248j c0248j = f965Z;
                Object[] objArr = new Object[2];
                objArr[i8] = rect3;
                objArr[1] = rect5;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c0248j, objArr);
                ofObject.addListener(new i(view, rect4, i12, i14, i16, i18));
                objectAnimator = ofObject;
            }
            m1085c = AbstractC0256r.m1085c(m1009a, objectAnimator);
        } else {
            view = view2;
            AbstractC0223A.m927f(view, i11, i13, i15, i17);
            if (i7 != 2) {
                m1085c = (i11 == i12 && i13 == i14) ? AbstractC0244f.m1009a(view, f962W, m1061w().mo1010a(i15, i17, i16, i18)) : AbstractC0244f.m1009a(view, f963X, m1061w().mo1010a(i11, i13, i12, i14));
            } else if (i19 == i21 && i20 == i22) {
                m1085c = AbstractC0244f.m1009a(view, f964Y, m1061w().mo1010a(i11, i13, i12, i14));
            } else {
                k kVar = new k(view);
                ObjectAnimator m1009a2 = AbstractC0244f.m1009a(kVar, f960U, m1061w().mo1010a(i11, i13, i12, i14));
                ObjectAnimator m1009a3 = AbstractC0244f.m1009a(kVar, f961V, m1061w().mo1010a(i15, i17, i16, i18));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(m1009a2, m1009a3);
                animatorSet.addListener(new h(kVar));
                m1085c = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC0262x.m1093c(viewGroup4, true);
            mo1041a(new j(viewGroup4));
        }
        return m1085c;
    }
}

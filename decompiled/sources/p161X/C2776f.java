package p161X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import kotlin.jvm.internal.C5480w;
import p021D.C0097e;
import p049H.AbstractC0475B;
import p049H.AbstractC0479F;
import p049H.ViewTreeObserverOnPreDrawListenerC0528w;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0800l;
import p161X.AbstractC2768Z;
import p161X.AbstractC2792v;
import p161X.C2776f;
import p191b.C3478b;
import p207d.AbstractC4094d;
import p334s.C6308a;
import p371w5.AbstractC6930m;
import p371w5.C6926i;
import p371w5.C6934q;
import p378x5.AbstractC7025p;
import p378x5.AbstractC7029t;
import p378x5.AbstractC7032w;

/* renamed from: X.f */
/* loaded from: classes.dex */
public final class C2776f extends AbstractC2768Z {

    /* renamed from: X.f$a */
    public static final class a extends AbstractC2768Z.b {

        /* renamed from: d */
        public final b f8335d;

        /* renamed from: X.f$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC7188a implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ AbstractC2768Z.d f8336a;

            /* renamed from: b */
            public final /* synthetic */ ViewGroup f8337b;

            /* renamed from: c */
            public final /* synthetic */ View f8338c;

            /* renamed from: d */
            public final /* synthetic */ a f8339d;

            public AnimationAnimationListenerC7188a(AbstractC2768Z.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f8336a = dVar;
                this.f8337b = viewGroup;
                this.f8338c = view;
                this.f8339d = aVar;
            }

            /* renamed from: b */
            public static final void m9738b(ViewGroup container, View view, a this$0) {
                AbstractC5469l.m23028e(container, "$container");
                AbstractC5469l.m23028e(this$0, "this$0");
                container.endViewTransition(view);
                this$0.m9736h().m9744a().m9695f(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AbstractC5469l.m23028e(animation, "animation");
                final ViewGroup viewGroup = this.f8337b;
                final View view = this.f8338c;
                final a aVar = this.f8339d;
                viewGroup.post(new Runnable() { // from class: X.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2776f.a.AnimationAnimationListenerC7188a.m9738b(viewGroup, view, aVar);
                    }
                });
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f8336a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                AbstractC5469l.m23028e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                AbstractC5469l.m23028e(animation, "animation");
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f8336a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b animationInfo) {
            AbstractC5469l.m23028e(animationInfo, "animationInfo");
            this.f8335d = animationInfo;
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: c */
        public void mo9684c(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            AbstractC2768Z.d m9744a = this.f8335d.m9744a();
            View view = m9744a.m9698i().f8435Q;
            view.clearAnimation();
            container.endViewTransition(view);
            this.f8335d.m9744a().m9695f(this);
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + m9744a + " has been cancelled.");
            }
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: d */
        public void mo9685d(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            if (this.f8335d.m9745b()) {
                this.f8335d.m9744a().m9695f(this);
                return;
            }
            Context context = container.getContext();
            AbstractC2768Z.d m9744a = this.f8335d.m9744a();
            View view = m9744a.m9698i().f8435Q;
            b bVar = this.f8335d;
            AbstractC5469l.m23027d(context, "context");
            AbstractC2792v.a m9739c = bVar.m9739c(context);
            if (m9739c == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = m9739c.f8511a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (m9744a.m9697h() != AbstractC2768Z.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f8335d.m9744a().m9695f(this);
                return;
            }
            container.startViewTransition(view);
            AbstractC2792v.b bVar2 = new AbstractC2792v.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC7188a(m9744a, container, view, this));
            view.startAnimation(bVar2);
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + m9744a + " has started.");
            }
        }

        /* renamed from: h */
        public final b m9736h() {
            return this.f8335d;
        }
    }

    /* renamed from: X.f$b */
    public static final class b extends f {

        /* renamed from: b */
        public final boolean f8340b;

        /* renamed from: c */
        public boolean f8341c;

        /* renamed from: d */
        public AbstractC2792v.a f8342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC2768Z.d operation, boolean z6) {
            super(operation);
            AbstractC5469l.m23028e(operation, "operation");
            this.f8340b = z6;
        }

        /* renamed from: c */
        public final AbstractC2792v.a m9739c(Context context) {
            AbstractC5469l.m23028e(context, "context");
            if (this.f8341c) {
                return this.f8342d;
            }
            AbstractC2792v.a m9951b = AbstractC2792v.m9951b(context, m9744a().m9698i(), m9744a().m9697h() == AbstractC2768Z.d.b.VISIBLE, this.f8340b);
            this.f8342d = m9951b;
            this.f8341c = true;
            return m9951b;
        }
    }

    /* renamed from: X.f$c */
    public static final class c extends AbstractC2768Z.b {

        /* renamed from: d */
        public final b f8343d;

        /* renamed from: e */
        public AnimatorSet f8344e;

        /* renamed from: X.f$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ ViewGroup f8345a;

            /* renamed from: b */
            public final /* synthetic */ View f8346b;

            /* renamed from: c */
            public final /* synthetic */ boolean f8347c;

            /* renamed from: d */
            public final /* synthetic */ AbstractC2768Z.d f8348d;

            /* renamed from: e */
            public final /* synthetic */ c f8349e;

            public a(ViewGroup viewGroup, View view, boolean z6, AbstractC2768Z.d dVar, c cVar) {
                this.f8345a = viewGroup;
                this.f8346b = view;
                this.f8347c = z6;
                this.f8348d = dVar;
                this.f8349e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                AbstractC5469l.m23028e(anim, "anim");
                this.f8345a.endViewTransition(this.f8346b);
                if (this.f8347c) {
                    AbstractC2768Z.d.b m9697h = this.f8348d.m9697h();
                    View viewToAnimate = this.f8346b;
                    AbstractC5469l.m23027d(viewToAnimate, "viewToAnimate");
                    m9697h.m9710f(viewToAnimate, this.f8345a);
                }
                this.f8349e.m9740h().m9744a().m9695f(this.f8349e);
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f8348d + " has ended.");
                }
            }
        }

        public c(b animatorInfo) {
            AbstractC5469l.m23028e(animatorInfo, "animatorInfo");
            this.f8343d = animatorInfo;
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: b */
        public boolean mo9683b() {
            return true;
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: c */
        public void mo9684c(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            AnimatorSet animatorSet = this.f8344e;
            if (animatorSet == null) {
                this.f8343d.m9744a().m9695f(this);
                return;
            }
            AbstractC2768Z.d m9744a = this.f8343d.m9744a();
            if (!m9744a.m9703n()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.f8351a.m9742a(animatorSet);
            }
            if (AbstractC2752I.m9397I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(m9744a);
                sb.append(" has been canceled");
                sb.append(m9744a.m9703n() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: d */
        public void mo9685d(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            AbstractC2768Z.d m9744a = this.f8343d.m9744a();
            AnimatorSet animatorSet = this.f8344e;
            if (animatorSet == null) {
                this.f8343d.m9744a().m9695f(this);
                return;
            }
            animatorSet.start();
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Animator from operation " + m9744a + " has started.");
            }
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: e */
        public void mo9686e(C3478b backEvent, ViewGroup container) {
            AbstractC5469l.m23028e(backEvent, "backEvent");
            AbstractC5469l.m23028e(container, "container");
            AbstractC2768Z.d m9744a = this.f8343d.m9744a();
            AnimatorSet animatorSet = this.f8344e;
            if (animatorSet == null) {
                this.f8343d.m9744a().m9695f(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !m9744a.m9698i().f8468u) {
                return;
            }
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + m9744a);
            }
            long m9741a = d.f8350a.m9741a(animatorSet);
            long m13982a = (long) (backEvent.m13982a() * m9741a);
            if (m13982a == 0) {
                m13982a = 1;
            }
            if (m13982a == m9741a) {
                m13982a = m9741a - 1;
            }
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + m13982a + " for Animator " + animatorSet + " on operation " + m9744a);
            }
            e.f8351a.m9743b(animatorSet, m13982a);
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: f */
        public void mo9687f(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            if (this.f8343d.m9745b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.f8343d;
            AbstractC5469l.m23027d(context, "context");
            AbstractC2792v.a m9739c = bVar.m9739c(context);
            this.f8344e = m9739c != null ? m9739c.f8512b : null;
            AbstractC2768Z.d m9744a = this.f8343d.m9744a();
            AbstractComponentCallbacksC2786p m9698i = m9744a.m9698i();
            boolean z6 = m9744a.m9697h() == AbstractC2768Z.d.b.GONE;
            View view = m9698i.f8435Q;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f8344e;
            if (animatorSet != null) {
                animatorSet.addListener(new a(container, view, z6, m9744a, this));
            }
            AnimatorSet animatorSet2 = this.f8344e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        /* renamed from: h */
        public final b m9740h() {
            return this.f8343d;
        }
    }

    /* renamed from: X.f$d */
    public static final class d {

        /* renamed from: a */
        public static final d f8350a = new d();

        /* renamed from: a */
        public final long m9741a(AnimatorSet animatorSet) {
            AbstractC5469l.m23028e(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* renamed from: X.f$e */
    public static final class e {

        /* renamed from: a */
        public static final e f8351a = new e();

        /* renamed from: a */
        public final void m9742a(AnimatorSet animatorSet) {
            AbstractC5469l.m23028e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        /* renamed from: b */
        public final void m9743b(AnimatorSet animatorSet, long j7) {
            AbstractC5469l.m23028e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j7);
        }
    }

    /* renamed from: X.f$f */
    public static class f {

        /* renamed from: a */
        public final AbstractC2768Z.d f8352a;

        public f(AbstractC2768Z.d operation) {
            AbstractC5469l.m23028e(operation, "operation");
            this.f8352a = operation;
        }

        /* renamed from: a */
        public final AbstractC2768Z.d m9744a() {
            return this.f8352a;
        }

        /* renamed from: b */
        public final boolean m9745b() {
            AbstractC2768Z.d.b bVar;
            View view = this.f8352a.m9698i().f8435Q;
            AbstractC2768Z.d.b m9711a = view != null ? AbstractC2768Z.d.b.f8301a.m9711a(view) : null;
            AbstractC2768Z.d.b m9697h = this.f8352a.m9697h();
            return m9711a == m9697h || !(m9711a == (bVar = AbstractC2768Z.d.b.VISIBLE) || m9697h == bVar);
        }
    }

    /* renamed from: X.f$g */
    public static final class g extends AbstractC2768Z.b {

        /* renamed from: d */
        public final List f8353d;

        /* renamed from: e */
        public final AbstractC2768Z.d f8354e;

        /* renamed from: f */
        public final AbstractC2768Z.d f8355f;

        /* renamed from: g */
        public final AbstractC2763U f8356g;

        /* renamed from: h */
        public final Object f8357h;

        /* renamed from: i */
        public final ArrayList f8358i;

        /* renamed from: j */
        public final ArrayList f8359j;

        /* renamed from: k */
        public final C6308a f8360k;

        /* renamed from: l */
        public final ArrayList f8361l;

        /* renamed from: m */
        public final ArrayList f8362m;

        /* renamed from: n */
        public final C6308a f8363n;

        /* renamed from: o */
        public final C6308a f8364o;

        /* renamed from: p */
        public final boolean f8365p;

        /* renamed from: q */
        public final C0097e f8366q;

        /* renamed from: r */
        public Object f8367r;

        /* renamed from: X.f$g$a */
        public static final class a extends AbstractC5470m implements InterfaceC0789a {

            /* renamed from: b */
            public final /* synthetic */ ViewGroup f8369b;

            /* renamed from: c */
            public final /* synthetic */ Object f8370c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f8369b = viewGroup;
                this.f8370c = obj;
            }

            /* renamed from: a */
            public final void m9768a() {
                g.this.m9765v().mo998e(this.f8369b, this.f8370c);
            }

            @Override // p069J5.InterfaceC0789a
            public /* bridge */ /* synthetic */ Object invoke() {
                m9768a();
                return C6934q.f24811a;
            }
        }

        /* renamed from: X.f$g$b */
        public static final class b extends AbstractC5470m implements InterfaceC0789a {

            /* renamed from: b */
            public final /* synthetic */ ViewGroup f8372b;

            /* renamed from: c */
            public final /* synthetic */ Object f8373c;

            /* renamed from: d */
            public final /* synthetic */ C5480w f8374d;

            /* renamed from: X.f$g$b$a */
            public static final class a extends AbstractC5470m implements InterfaceC0789a {

                /* renamed from: a */
                public final /* synthetic */ g f8375a;

                /* renamed from: b */
                public final /* synthetic */ ViewGroup f8376b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, ViewGroup viewGroup) {
                    super(0);
                    this.f8375a = gVar;
                    this.f8376b = viewGroup;
                }

                /* renamed from: e */
                public static final void m9771e(g this$0, ViewGroup container) {
                    AbstractC5469l.m23028e(this$0, "this$0");
                    AbstractC5469l.m23028e(container, "$container");
                    Iterator it = this$0.m9766w().iterator();
                    while (it.hasNext()) {
                        AbstractC2768Z.d m9744a = ((h) it.next()).m9744a();
                        View m9847U = m9744a.m9698i().m9847U();
                        if (m9847U != null) {
                            m9744a.m9697h().m9710f(m9847U, container);
                        }
                    }
                }

                /* renamed from: b */
                public final void m9772b() {
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    AbstractC2763U m9765v = this.f8375a.m9765v();
                    Object m9762s = this.f8375a.m9762s();
                    AbstractC5469l.m23025b(m9762s);
                    final g gVar = this.f8375a;
                    final ViewGroup viewGroup = this.f8376b;
                    m9765v.m9635d(m9762s, new Runnable() { // from class: X.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2776f.g.b.a.m9771e(C2776f.g.this, viewGroup);
                        }
                    });
                }

                @Override // p069J5.InterfaceC0789a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m9772b();
                    return C6934q.f24811a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, C5480w c5480w) {
                super(0);
                this.f8372b = viewGroup;
                this.f8373c = obj;
                this.f8374d = c5480w;
            }

            /* renamed from: a */
            public final void m9769a() {
                g gVar = g.this;
                gVar.m9759C(gVar.m9765v().m9636j(this.f8372b, this.f8373c));
                boolean z6 = g.this.m9762s() != null;
                Object obj = this.f8373c;
                ViewGroup viewGroup = this.f8372b;
                if (!z6) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.f8374d.f19710a = new a(g.this, viewGroup);
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.m9763t() + " to " + g.this.m9764u());
                }
            }

            @Override // p069J5.InterfaceC0789a
            public /* bridge */ /* synthetic */ Object invoke() {
                m9769a();
                return C6934q.f24811a;
            }
        }

        public g(List transitionInfos, AbstractC2768Z.d dVar, AbstractC2768Z.d dVar2, AbstractC2763U transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, C6308a sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, C6308a firstOutViews, C6308a lastInViews, boolean z6) {
            AbstractC5469l.m23028e(transitionInfos, "transitionInfos");
            AbstractC5469l.m23028e(transitionImpl, "transitionImpl");
            AbstractC5469l.m23028e(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            AbstractC5469l.m23028e(sharedElementLastInViews, "sharedElementLastInViews");
            AbstractC5469l.m23028e(sharedElementNameMapping, "sharedElementNameMapping");
            AbstractC5469l.m23028e(enteringNames, "enteringNames");
            AbstractC5469l.m23028e(exitingNames, "exitingNames");
            AbstractC5469l.m23028e(firstOutViews, "firstOutViews");
            AbstractC5469l.m23028e(lastInViews, "lastInViews");
            this.f8353d = transitionInfos;
            this.f8354e = dVar;
            this.f8355f = dVar2;
            this.f8356g = transitionImpl;
            this.f8357h = obj;
            this.f8358i = sharedElementFirstOutViews;
            this.f8359j = sharedElementLastInViews;
            this.f8360k = sharedElementNameMapping;
            this.f8361l = enteringNames;
            this.f8362m = exitingNames;
            this.f8363n = firstOutViews;
            this.f8364o = lastInViews;
            this.f8365p = z6;
            this.f8366q = new C0097e();
        }

        /* renamed from: A */
        public static final void m9746A(AbstractC2768Z.d operation, g this$0) {
            AbstractC5469l.m23028e(operation, "$operation");
            AbstractC5469l.m23028e(this$0, "this$0");
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.m9695f(this$0);
        }

        /* renamed from: p */
        public static final void m9753p(AbstractC2768Z.d dVar, AbstractC2768Z.d dVar2, g this$0) {
            AbstractC5469l.m23028e(this$0, "this$0");
            C2761S.m9623a(dVar.m9698i(), dVar2.m9698i(), this$0.f8365p, this$0.f8364o, false);
        }

        /* renamed from: q */
        public static final void m9754q(AbstractC2763U impl, View view, Rect lastInEpicenterRect) {
            AbstractC5469l.m23028e(impl, "$impl");
            AbstractC5469l.m23028e(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.m9637k(view, lastInEpicenterRect);
        }

        /* renamed from: r */
        public static final void m9755r(ArrayList transitioningViews) {
            AbstractC5469l.m23028e(transitioningViews, "$transitioningViews");
            C2761S.m9625d(transitioningViews, 4);
        }

        /* renamed from: y */
        public static final void m9756y(AbstractC2768Z.d operation, g this$0) {
            AbstractC5469l.m23028e(operation, "$operation");
            AbstractC5469l.m23028e(this$0, "this$0");
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.m9695f(this$0);
        }

        /* renamed from: z */
        public static final void m9757z(C5480w seekCancelLambda) {
            AbstractC5469l.m23028e(seekCancelLambda, "$seekCancelLambda");
            InterfaceC0789a interfaceC0789a = (InterfaceC0789a) seekCancelLambda.f19710a;
            if (interfaceC0789a != null) {
                interfaceC0789a.invoke();
            }
        }

        /* renamed from: B */
        public final void m9758B(ArrayList arrayList, ViewGroup viewGroup, InterfaceC0789a interfaceC0789a) {
            C2761S.m9625d(arrayList, 4);
            ArrayList m9638q = this.f8356g.m9638q(this.f8359j);
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator it = this.f8358i.iterator();
                while (it.hasNext()) {
                    Object sharedElementFirstOutViews = it.next();
                    AbstractC5469l.m23027d(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + AbstractC0475B.m1760s(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator it2 = this.f8359j.iterator();
                while (it2.hasNext()) {
                    Object sharedElementLastInViews = it2.next();
                    AbstractC5469l.m23027d(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + AbstractC0475B.m1760s(view2));
                }
            }
            interfaceC0789a.invoke();
            this.f8356g.m9641y(viewGroup, this.f8358i, this.f8359j, m9638q, this.f8360k);
            C2761S.m9625d(arrayList, 0);
            this.f8356g.mo993A(this.f8357h, this.f8358i, this.f8359j);
        }

        /* renamed from: C */
        public final void m9759C(Object obj) {
            this.f8367r = obj;
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: b */
        public boolean mo9683b() {
            if (this.f8356g.mo9629m()) {
                List<h> list = this.f8353d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (h hVar : list) {
                        if (Build.VERSION.SDK_INT < 34 || hVar.m9776f() == null || !this.f8356g.mo9630n(hVar.m9776f())) {
                            break;
                        }
                    }
                }
                Object obj = this.f8357h;
                if (obj == null || this.f8356g.mo9630n(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: c */
        public void mo9684c(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            this.f8366q.m253a();
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: d */
        public void mo9685d(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            if (!container.isLaidOut()) {
                for (h hVar : this.f8353d) {
                    AbstractC2768Z.d m9744a = hVar.m9744a();
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + m9744a);
                    }
                    hVar.m9744a().m9695f(this);
                }
                return;
            }
            Object obj = this.f8367r;
            if (obj != null) {
                AbstractC2763U abstractC2763U = this.f8356g;
                AbstractC5469l.m23025b(obj);
                abstractC2763U.m9634c(obj);
                if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f8354e + " to " + this.f8355f);
                    return;
                }
                return;
            }
            C6926i m9761o = m9761o(container, this.f8355f, this.f8354e);
            ArrayList arrayList = (ArrayList) m9761o.m28368a();
            Object m28369b = m9761o.m28369b();
            List list = this.f8353d;
            ArrayList<AbstractC2768Z.d> arrayList2 = new ArrayList(AbstractC7025p.m28868n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).m9744a());
            }
            for (final AbstractC2768Z.d dVar : arrayList2) {
                this.f8356g.mo1007w(dVar.m9698i(), m28369b, this.f8366q, new Runnable() { // from class: X.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2776f.g.m9756y(AbstractC2768Z.d.this, this);
                    }
                });
            }
            m9758B(arrayList, container, new a(container, m28369b));
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f8354e + " to " + this.f8355f);
            }
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: e */
        public void mo9686e(C3478b backEvent, ViewGroup container) {
            AbstractC5469l.m23028e(backEvent, "backEvent");
            AbstractC5469l.m23028e(container, "container");
            Object obj = this.f8367r;
            if (obj != null) {
                this.f8356g.m9639t(obj, backEvent.m13982a());
            }
        }

        @Override // p161X.AbstractC2768Z.b
        /* renamed from: f */
        public void mo9687f(ViewGroup container) {
            AbstractC5469l.m23028e(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.f8353d.iterator();
                while (it.hasNext()) {
                    AbstractC2768Z.d m9744a = ((h) it.next()).m9744a();
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + m9744a);
                    }
                }
                return;
            }
            if (m9767x() && this.f8357h != null && !mo9683b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f8357h + " between " + this.f8354e + " and " + this.f8355f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (mo9683b() && m9767x()) {
                final C5480w c5480w = new C5480w();
                C6926i m9761o = m9761o(container, this.f8355f, this.f8354e);
                ArrayList arrayList = (ArrayList) m9761o.m28368a();
                Object m28369b = m9761o.m28369b();
                List list = this.f8353d;
                ArrayList<AbstractC2768Z.d> arrayList2 = new ArrayList(AbstractC7025p.m28868n(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).m9744a());
                }
                for (final AbstractC2768Z.d dVar : arrayList2) {
                    this.f8356g.m9640x(dVar.m9698i(), m28369b, this.f8366q, new Runnable() { // from class: X.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2776f.g.m9757z(C5480w.this);
                        }
                    }, new Runnable() { // from class: X.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2776f.g.m9746A(AbstractC2768Z.d.this, this);
                        }
                    });
                }
                m9758B(arrayList, container, new b(container, m28369b, c5480w));
            }
        }

        /* renamed from: n */
        public final void m9760n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC0479F.m1820a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View child = viewGroup.getChildAt(i7);
                if (child.getVisibility() == 0) {
                    AbstractC5469l.m23027d(child, "child");
                    m9760n(arrayList, child);
                }
            }
        }

        /* renamed from: o */
        public final C6926i m9761o(ViewGroup viewGroup, AbstractC2768Z.d dVar, final AbstractC2768Z.d dVar2) {
            final AbstractC2768Z.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f8353d.iterator();
            boolean z6 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((h) it.next()).m9777g() && dVar2 != null && dVar3 != null && !this.f8360k.isEmpty() && this.f8357h != null) {
                    C2761S.m9623a(dVar.m9698i(), dVar2.m9698i(), this.f8365p, this.f8363n, true);
                    ViewTreeObserverOnPreDrawListenerC0528w.m2025a(viewGroup, new Runnable() { // from class: X.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2776f.g.m9753p(AbstractC2768Z.d.this, dVar2, this);
                        }
                    });
                    this.f8358i.addAll(this.f8363n.values());
                    if (!this.f8362m.isEmpty()) {
                        Object obj = this.f8362m.get(0);
                        AbstractC5469l.m23027d(obj, "exitingNames[0]");
                        view2 = (View) this.f8363n.get((String) obj);
                        this.f8356g.mo1006v(this.f8357h, view2);
                    }
                    this.f8359j.addAll(this.f8364o.values());
                    if (!this.f8361l.isEmpty()) {
                        Object obj2 = this.f8361l.get(0);
                        AbstractC5469l.m23027d(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f8364o.get((String) obj2);
                        if (view3 != null) {
                            final AbstractC2763U abstractC2763U = this.f8356g;
                            ViewTreeObserverOnPreDrawListenerC0528w.m2025a(viewGroup, new Runnable() { // from class: X.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2776f.g.m9754q(AbstractC2763U.this, view3, rect);
                                }
                            });
                            z6 = true;
                        }
                    }
                    this.f8356g.mo1008z(this.f8357h, view, this.f8358i);
                    AbstractC2763U abstractC2763U2 = this.f8356g;
                    Object obj3 = this.f8357h;
                    abstractC2763U2.mo1004s(obj3, null, null, null, null, obj3, this.f8359j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f8353d.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                AbstractC2768Z.d m9744a = hVar.m9744a();
                Iterator it3 = it2;
                Object mo1000h = this.f8356g.mo1000h(hVar.m9776f());
                if (mo1000h != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Object obj6 = obj5;
                    View view4 = m9744a.m9698i().f8435Q;
                    Object obj7 = obj4;
                    AbstractC5469l.m23027d(view4, "operation.fragment.mView");
                    m9760n(arrayList2, view4);
                    if (this.f8357h != null && (m9744a == dVar2 || m9744a == dVar3)) {
                        if (m9744a == dVar2) {
                            arrayList2.removeAll(AbstractC7032w.m28893S(this.f8358i));
                        } else {
                            arrayList2.removeAll(AbstractC7032w.m28893S(this.f8359j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f8356g.mo996a(mo1000h, view);
                    } else {
                        this.f8356g.mo997b(mo1000h, arrayList2);
                        this.f8356g.mo1004s(mo1000h, mo1000h, arrayList2, null, null, null, null);
                        if (m9744a.m9697h() == AbstractC2768Z.d.b.GONE) {
                            m9744a.m9706r(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(m9744a.m9698i().f8435Q);
                            this.f8356g.mo1003r(mo1000h, m9744a.m9698i().f8435Q, arrayList3);
                            ViewTreeObserverOnPreDrawListenerC0528w.m2025a(viewGroup, new Runnable() { // from class: X.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2776f.g.m9755r(arrayList2);
                                }
                            });
                        }
                    }
                    if (m9744a.m9697h() == AbstractC2768Z.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z6) {
                            this.f8356g.mo1005u(mo1000h, rect);
                        }
                        if (AbstractC2752I.m9397I0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + mo1000h);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object transitioningViews = it4.next();
                                AbstractC5469l.m23027d(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        this.f8356g.mo1006v(mo1000h, view2);
                        if (AbstractC2752I.m9397I0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + mo1000h);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                Object transitioningViews2 = it5.next();
                                AbstractC5469l.m23027d(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (hVar.m9778h()) {
                        obj4 = this.f8356g.mo1002p(obj7, mo1000h, null);
                        dVar3 = dVar;
                        it2 = it3;
                        obj5 = obj6;
                    } else {
                        obj4 = obj7;
                        obj5 = this.f8356g.mo1002p(obj6, mo1000h, null);
                    }
                }
                dVar3 = dVar;
                it2 = it3;
            }
            Object mo1001o = this.f8356g.mo1001o(obj4, obj5, this.f8357h);
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + mo1001o);
            }
            return new C6926i(arrayList, mo1001o);
        }

        /* renamed from: s */
        public final Object m9762s() {
            return this.f8367r;
        }

        /* renamed from: t */
        public final AbstractC2768Z.d m9763t() {
            return this.f8354e;
        }

        /* renamed from: u */
        public final AbstractC2768Z.d m9764u() {
            return this.f8355f;
        }

        /* renamed from: v */
        public final AbstractC2763U m9765v() {
            return this.f8356g;
        }

        /* renamed from: w */
        public final List m9766w() {
            return this.f8353d;
        }

        /* renamed from: x */
        public final boolean m9767x() {
            List list = this.f8353d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).m9744a().m9698i().f8468u) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: X.f$h */
    public static final class h extends f {

        /* renamed from: b */
        public final Object f8377b;

        /* renamed from: c */
        public final boolean f8378c;

        /* renamed from: d */
        public final Object f8379d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC2768Z.d operation, boolean z6, boolean z7) {
            super(operation);
            Object m9836O;
            AbstractC5469l.m23028e(operation, "operation");
            AbstractC2768Z.d.b m9697h = operation.m9697h();
            AbstractC2768Z.d.b bVar = AbstractC2768Z.d.b.VISIBLE;
            if (m9697h == bVar) {
                AbstractComponentCallbacksC2786p m9698i = operation.m9698i();
                m9836O = z6 ? m9698i.m9833M() : m9698i.m9908v();
            } else {
                AbstractComponentCallbacksC2786p m9698i2 = operation.m9698i();
                m9836O = z6 ? m9698i2.m9836O() : m9698i2.m9916z();
            }
            this.f8377b = m9836O;
            this.f8378c = operation.m9697h() == bVar ? z6 ? operation.m9698i().m9890p() : operation.m9698i().m9888o() : true;
            this.f8379d = z7 ? z6 ? operation.m9698i().m9839Q() : operation.m9698i().m9837P() : null;
        }

        /* renamed from: c */
        public final AbstractC2763U m9773c() {
            AbstractC2763U m9774d = m9774d(this.f8377b);
            AbstractC2763U m9774d2 = m9774d(this.f8379d);
            if (m9774d == null || m9774d2 == null || m9774d == m9774d2) {
                return m9774d == null ? m9774d2 : m9774d;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m9744a().m9698i() + " returned Transition " + this.f8377b + " which uses a different Transition  type than its shared element transition " + this.f8379d).toString());
        }

        /* renamed from: d */
        public final AbstractC2763U m9774d(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC2763U abstractC2763U = C2761S.f8241b;
            if (abstractC2763U != null && abstractC2763U.mo999g(obj)) {
                return abstractC2763U;
            }
            AbstractC2763U abstractC2763U2 = C2761S.f8242c;
            if (abstractC2763U2 != null && abstractC2763U2.mo999g(obj)) {
                return abstractC2763U2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m9744a().m9698i() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        public final Object m9775e() {
            return this.f8379d;
        }

        /* renamed from: f */
        public final Object m9776f() {
            return this.f8377b;
        }

        /* renamed from: g */
        public final boolean m9777g() {
            return this.f8379d != null;
        }

        /* renamed from: h */
        public final boolean m9778h() {
            return this.f8378c;
        }
    }

    /* renamed from: X.f$i */
    public static final class i extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public final /* synthetic */ Collection f8380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.f8380a = collection;
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            AbstractC5469l.m23028e(entry, "entry");
            return Boolean.valueOf(AbstractC7032w.m28896u(this.f8380a, AbstractC0475B.m1760s((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2776f(ViewGroup container) {
        super(container);
        AbstractC5469l.m23028e(container, "container");
    }

    /* renamed from: E */
    public static final void m9730E(C2776f this$0, AbstractC2768Z.d operation) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(operation, "$operation");
        this$0.m9660c(operation);
    }

    /* renamed from: D */
    public final void m9731D(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7029t.m28870p(arrayList2, ((b) it.next()).m9744a().m9696g());
        }
        boolean isEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z6 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = m9675t().getContext();
            AbstractC2768Z.d m9744a = bVar.m9744a();
            AbstractC5469l.m23027d(context, "context");
            AbstractC2792v.a m9739c = bVar.m9739c(context);
            if (m9739c != null) {
                if (m9739c.f8512b == null) {
                    arrayList.add(bVar);
                } else {
                    AbstractComponentCallbacksC2786p m9698i = m9744a.m9698i();
                    if (m9744a.m9696g().isEmpty()) {
                        if (m9744a.m9697h() == AbstractC2768Z.d.b.GONE) {
                            m9744a.m9706r(false);
                        }
                        m9744a.m9692b(new c(bVar));
                        z6 = true;
                    } else if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + m9698i + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            AbstractC2768Z.d m9744a2 = bVar2.m9744a();
            AbstractComponentCallbacksC2786p m9698i2 = m9744a2.m9698i();
            if (isEmpty) {
                if (!z6) {
                    m9744a2.m9692b(new a(bVar2));
                } else if (AbstractC2752I.m9397I0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m9698i2 + " as Animations cannot run alongside Animators.");
                }
            } else if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + m9698i2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* renamed from: F */
    public final void m9732F(List list, boolean z6, AbstractC2768Z.d dVar, AbstractC2768Z.d dVar2) {
        Object obj;
        AbstractC2763U abstractC2763U;
        Iterator it;
        C6926i m28383a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((h) obj2).m9745b()) {
                arrayList.add(obj2);
            }
        }
        ArrayList<h> arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((h) obj3).m9773c() != null) {
                arrayList2.add(obj3);
            }
        }
        AbstractC2763U abstractC2763U2 = null;
        for (h hVar : arrayList2) {
            AbstractC2763U m9773c = hVar.m9773c();
            if (abstractC2763U2 != null && m9773c != abstractC2763U2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.m9744a().m9698i() + " returned Transition " + hVar.m9776f() + " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC2763U2 = m9773c;
        }
        if (abstractC2763U2 == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C6308a c6308a = new C6308a();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C6308a c6308a2 = new C6308a();
        C6308a c6308a3 = new C6308a();
        Iterator it2 = arrayList2.iterator();
        ArrayList arrayList7 = arrayList5;
        ArrayList arrayList8 = arrayList6;
        loop3: while (true) {
            obj = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2.m9777g() && dVar != null && dVar2 != null) {
                    obj = abstractC2763U2.mo994B(abstractC2763U2.mo1000h(hVar2.m9775e()));
                    arrayList8 = dVar2.m9698i().m9841R();
                    AbstractC5469l.m23027d(arrayList8, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList m9841R = dVar.m9698i().m9841R();
                    AbstractC5469l.m23027d(m9841R, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList m9843S = dVar.m9698i().m9843S();
                    AbstractC5469l.m23027d(m9843S, "firstOut.fragment.sharedElementTargetNames");
                    int size = m9843S.size();
                    it = it2;
                    int i7 = 0;
                    while (i7 < size) {
                        int i8 = size;
                        int indexOf = arrayList8.indexOf(m9843S.get(i7));
                        ArrayList arrayList9 = m9843S;
                        if (indexOf != -1) {
                            arrayList8.set(indexOf, m9841R.get(i7));
                        }
                        i7++;
                        size = i8;
                        m9843S = arrayList9;
                    }
                    arrayList7 = dVar2.m9698i().m9843S();
                    AbstractC5469l.m23027d(arrayList7, "lastIn.fragment.sharedElementTargetNames");
                    if (z6) {
                        dVar.m9698i().m9911x();
                        dVar2.m9698i().m9808A();
                        m28383a = AbstractC6930m.m28383a(null, null);
                    } else {
                        dVar.m9698i().m9808A();
                        dVar2.m9698i().m9911x();
                        m28383a = AbstractC6930m.m28383a(null, null);
                    }
                    AbstractC4094d.m17162a(m28383a.m28368a());
                    AbstractC4094d.m17162a(m28383a.m28369b());
                    int size2 = arrayList8.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj4 = arrayList8.get(i9);
                        int i10 = size2;
                        AbstractC5469l.m23027d(obj4, "exitingNames[i]");
                        Object obj5 = arrayList7.get(i9);
                        AbstractC5469l.m23027d(obj5, "enteringNames[i]");
                        c6308a.put((String) obj4, (String) obj5);
                        i9++;
                        size2 = i10;
                        abstractC2763U2 = abstractC2763U2;
                    }
                    abstractC2763U = abstractC2763U2;
                    if (AbstractC2752I.m9397I0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator it3 = arrayList7.iterator(); it3.hasNext(); it3 = it3) {
                            Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator it4 = arrayList8.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                        }
                    }
                    View view = dVar.m9698i().f8435Q;
                    AbstractC5469l.m23027d(view, "firstOut.fragment.mView");
                    m9733G(c6308a2, view);
                    c6308a2.m26413n(arrayList8);
                    c6308a.m26413n(c6308a2.keySet());
                    View view2 = dVar2.m9698i().f8435Q;
                    AbstractC5469l.m23027d(view2, "lastIn.fragment.mView");
                    m9733G(c6308a3, view2);
                    c6308a3.m26413n(arrayList7);
                    c6308a3.m26413n(c6308a.values());
                    C2761S.m9624c(c6308a, c6308a3);
                    Collection keySet = c6308a.keySet();
                    AbstractC5469l.m23027d(keySet, "sharedElementNameMapping.keys");
                    m9734H(c6308a2, keySet);
                    Collection values = c6308a.values();
                    AbstractC5469l.m23027d(values, "sharedElementNameMapping.values");
                    m9734H(c6308a3, values);
                    if (c6308a.isEmpty()) {
                        break;
                    }
                } else {
                    abstractC2763U = abstractC2763U2;
                    it = it2;
                }
                it2 = it;
                abstractC2763U2 = abstractC2763U;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList3.clear();
            arrayList4.clear();
            it2 = it;
            abstractC2763U2 = abstractC2763U;
        }
        AbstractC2763U abstractC2763U3 = abstractC2763U2;
        if (obj == null) {
            if (arrayList2.isEmpty()) {
                return;
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                if (((h) it5.next()).m9776f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList2, dVar, dVar2, abstractC2763U3, obj, arrayList3, arrayList4, c6308a, arrayList7, arrayList8, c6308a2, c6308a3, z6);
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ((h) it6.next()).m9744a().m9692b(gVar);
        }
    }

    /* renamed from: G */
    public final void m9733G(Map map, View view) {
        String m1760s = AbstractC0475B.m1760s(view);
        if (m1760s != null) {
            map.put(m1760s, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View child = viewGroup.getChildAt(i7);
                if (child.getVisibility() == 0) {
                    AbstractC5469l.m23027d(child, "child");
                    m9733G(map, child);
                }
            }
        }
    }

    /* renamed from: H */
    public final void m9734H(C6308a c6308a, Collection collection) {
        Set entries = c6308a.entrySet();
        AbstractC5469l.m23027d(entries, "entries");
        AbstractC7029t.m28874t(entries, new i(collection));
    }

    /* renamed from: I */
    public final void m9735I(List list) {
        AbstractComponentCallbacksC2786p m9698i = ((AbstractC2768Z.d) AbstractC7032w.m28879E(list)).m9698i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2768Z.d dVar = (AbstractC2768Z.d) it.next();
            dVar.m9698i().f8438T.f8483c = m9698i.f8438T.f8483c;
            dVar.m9698i().f8438T.f8484d = m9698i.f8438T.f8484d;
            dVar.m9698i().f8438T.f8485e = m9698i.f8438T.f8485e;
            dVar.m9698i().f8438T.f8486f = m9698i.f8438T.f8486f;
        }
    }

    @Override // p161X.AbstractC2768Z
    /* renamed from: d */
    public void mo9661d(List operations, boolean z6) {
        Object obj;
        Object obj2;
        AbstractC5469l.m23028e(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            AbstractC2768Z.d dVar = (AbstractC2768Z.d) obj2;
            AbstractC2768Z.d.b.a aVar = AbstractC2768Z.d.b.f8301a;
            View view = dVar.m9698i().f8435Q;
            AbstractC5469l.m23027d(view, "operation.fragment.mView");
            AbstractC2768Z.d.b m9711a = aVar.m9711a(view);
            AbstractC2768Z.d.b bVar = AbstractC2768Z.d.b.VISIBLE;
            if (m9711a == bVar && dVar.m9697h() != bVar) {
                break;
            }
        }
        AbstractC2768Z.d dVar2 = (AbstractC2768Z.d) obj2;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            AbstractC2768Z.d dVar3 = (AbstractC2768Z.d) previous;
            AbstractC2768Z.d.b.a aVar2 = AbstractC2768Z.d.b.f8301a;
            View view2 = dVar3.m9698i().f8435Q;
            AbstractC5469l.m23027d(view2, "operation.fragment.mView");
            AbstractC2768Z.d.b m9711a2 = aVar2.m9711a(view2);
            AbstractC2768Z.d.b bVar2 = AbstractC2768Z.d.b.VISIBLE;
            if (m9711a2 != bVar2 && dVar3.m9697h() == bVar2) {
                obj = previous;
                break;
            }
        }
        AbstractC2768Z.d dVar4 = (AbstractC2768Z.d) obj;
        if (AbstractC2752I.m9397I0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar2 + " to " + dVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m9735I(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final AbstractC2768Z.d dVar5 = (AbstractC2768Z.d) it2.next();
            arrayList.add(new b(dVar5, z6));
            boolean z7 = false;
            if (z6) {
                if (dVar5 != dVar2) {
                    arrayList2.add(new h(dVar5, z6, z7));
                    dVar5.m9691a(new Runnable() { // from class: X.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2776f.m9730E(C2776f.this, dVar5);
                        }
                    });
                }
                z7 = true;
                arrayList2.add(new h(dVar5, z6, z7));
                dVar5.m9691a(new Runnable() { // from class: X.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2776f.m9730E(C2776f.this, dVar5);
                    }
                });
            } else {
                if (dVar5 != dVar4) {
                    arrayList2.add(new h(dVar5, z6, z7));
                    dVar5.m9691a(new Runnable() { // from class: X.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2776f.m9730E(C2776f.this, dVar5);
                        }
                    });
                }
                z7 = true;
                arrayList2.add(new h(dVar5, z6, z7));
                dVar5.m9691a(new Runnable() { // from class: X.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2776f.m9730E(C2776f.this, dVar5);
                    }
                });
            }
        }
        m9732F(arrayList2, z6, dVar2, dVar4);
        m9731D(arrayList);
    }
}

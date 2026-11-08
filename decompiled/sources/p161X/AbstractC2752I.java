package p161X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.C3332O;
import androidx.lifecycle.InterfaceC3333P;
import androidx.lifecycle.InterfaceC3349n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p009B1.C0032d;
import p009B1.InterfaceC0034f;
import p042G.InterfaceC0339a;
import p049H.InterfaceC0518m;
import p049H.InterfaceC0521p;
import p154W.AbstractC2651b;
import p161X.AbstractC2760Q;
import p168Y.C2884c;
import p191b.AbstractC3499w;
import p191b.C3478b;
import p191b.C3500x;
import p191b.InterfaceC3502z;
import p207d.AbstractC4093c;
import p207d.AbstractC4094d;
import p207d.AbstractC4095e;
import p207d.C4091a;
import p207d.C4097g;
import p207d.InterfaceC4092b;
import p207d.InterfaceC4096f;
import p215e.AbstractC4141a;
import p215e.C4147g;
import p215e.C4148h;
import p256j$.util.DesugarCollections;
import p365w.C6791g;
import p365w.C6800p;
import p365w.InterfaceC6797m;
import p365w.InterfaceC6798n;
import p372x.InterfaceC6937c;
import p372x.InterfaceC6938d;

/* renamed from: X.I */
/* loaded from: classes.dex */
public abstract class AbstractC2752I {

    /* renamed from: U */
    public static boolean f8105U = false;

    /* renamed from: V */
    public static boolean f8106V = true;

    /* renamed from: A */
    public AbstractComponentCallbacksC2786p f8107A;

    /* renamed from: F */
    public AbstractC4093c f8112F;

    /* renamed from: G */
    public AbstractC4093c f8113G;

    /* renamed from: H */
    public AbstractC4093c f8114H;

    /* renamed from: J */
    public boolean f8116J;

    /* renamed from: K */
    public boolean f8117K;

    /* renamed from: L */
    public boolean f8118L;

    /* renamed from: M */
    public boolean f8119M;

    /* renamed from: N */
    public boolean f8120N;

    /* renamed from: O */
    public ArrayList f8121O;

    /* renamed from: P */
    public ArrayList f8122P;

    /* renamed from: Q */
    public ArrayList f8123Q;

    /* renamed from: R */
    public C2755L f8124R;

    /* renamed from: S */
    public C2884c.c f8125S;

    /* renamed from: b */
    public boolean f8128b;

    /* renamed from: e */
    public ArrayList f8131e;

    /* renamed from: g */
    public C3500x f8133g;

    /* renamed from: x */
    public AbstractC2744A f8150x;

    /* renamed from: y */
    public AbstractC2793w f8151y;

    /* renamed from: z */
    public AbstractComponentCallbacksC2786p f8152z;

    /* renamed from: a */
    public final ArrayList f8127a = new ArrayList();

    /* renamed from: c */
    public final C2759P f8129c = new C2759P();

    /* renamed from: d */
    public ArrayList f8130d = new ArrayList();

    /* renamed from: f */
    public final LayoutInflaterFactory2C2745B f8132f = new LayoutInflaterFactory2C2745B(this);

    /* renamed from: h */
    public C2769a f8134h = null;

    /* renamed from: i */
    public boolean f8135i = false;

    /* renamed from: j */
    public final AbstractC3499w f8136j = new b(false);

    /* renamed from: k */
    public final AtomicInteger f8137k = new AtomicInteger();

    /* renamed from: l */
    public final Map f8138l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public final Map f8139m = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public final Map f8140n = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: o */
    public ArrayList f8141o = new ArrayList();

    /* renamed from: p */
    public final C2746C f8142p = new C2746C(this);

    /* renamed from: q */
    public final CopyOnWriteArrayList f8143q = new CopyOnWriteArrayList();

    /* renamed from: r */
    public final InterfaceC0339a f8144r = new InterfaceC0339a() { // from class: X.D
        @Override // p042G.InterfaceC0339a
        public final void accept(Object obj) {
            AbstractC2752I.this.m9442R0((Configuration) obj);
        }
    };

    /* renamed from: s */
    public final InterfaceC0339a f8145s = new InterfaceC0339a() { // from class: X.E
        @Override // p042G.InterfaceC0339a
        public final void accept(Object obj) {
            AbstractC2752I.this.m9444S0((Integer) obj);
        }
    };

    /* renamed from: t */
    public final InterfaceC0339a f8146t = new InterfaceC0339a() { // from class: X.F
        @Override // p042G.InterfaceC0339a
        public final void accept(Object obj) {
            AbstractC2752I.this.m9446T0((C6791g) obj);
        }
    };

    /* renamed from: u */
    public final InterfaceC0339a f8147u = new InterfaceC0339a() { // from class: X.G
        @Override // p042G.InterfaceC0339a
        public final void accept(Object obj) {
            AbstractC2752I.this.m9448U0((C6800p) obj);
        }
    };

    /* renamed from: v */
    public final InterfaceC0521p f8148v = new c();

    /* renamed from: w */
    public int f8149w = -1;

    /* renamed from: B */
    public AbstractC2796z f8108B = null;

    /* renamed from: C */
    public AbstractC2796z f8109C = new d();

    /* renamed from: D */
    public InterfaceC2770a0 f8110D = null;

    /* renamed from: E */
    public InterfaceC2770a0 f8111E = new e();

    /* renamed from: I */
    public ArrayDeque f8115I = new ArrayDeque();

    /* renamed from: T */
    public Runnable f8126T = new f();

    /* renamed from: X.I$a */
    public class a implements InterfaceC4092b {
        public a() {
        }

        @Override // p207d.InterfaceC4092b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9522a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) AbstractC2752I.this.f8115I.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = kVar.f8163a;
            int i8 = kVar.f8164b;
            AbstractComponentCallbacksC2786p m9593i = AbstractC2752I.this.f8129c.m9593i(str);
            if (m9593i != null) {
                m9593i.m9828I0(i8, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: X.I$b */
    public class b extends AbstractC3499w {
        public b(boolean z6) {
            super(z6);
        }

        @Override // p191b.AbstractC3499w
        /* renamed from: c */
        public void mo9524c() {
            if (AbstractC2752I.m9397I0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + AbstractC2752I.f8106V + " fragment manager " + AbstractC2752I.this);
            }
            if (AbstractC2752I.f8106V) {
                AbstractC2752I.this.m9490o();
                AbstractC2752I.this.f8134h = null;
            }
        }

        @Override // p191b.AbstractC3499w
        /* renamed from: d */
        public void mo9525d() {
            if (AbstractC2752I.m9397I0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + AbstractC2752I.f8106V + " fragment manager " + AbstractC2752I.this);
            }
            AbstractC2752I.this.m9417E0();
        }

        @Override // p191b.AbstractC3499w
        /* renamed from: e */
        public void mo9526e(C3478b c3478b) {
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + AbstractC2752I.f8106V + " fragment manager " + AbstractC2752I.this);
            }
            AbstractC2752I abstractC2752I = AbstractC2752I.this;
            if (abstractC2752I.f8134h != null) {
                Iterator it = abstractC2752I.m9508u(new ArrayList(Collections.singletonList(AbstractC2752I.this.f8134h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((AbstractC2768Z) it.next()).m9678y(c3478b);
                }
                Iterator it2 = AbstractC2752I.this.f8141o.iterator();
                if (it2.hasNext()) {
                    AbstractC4094d.m17162a(it2.next());
                    throw null;
                }
            }
        }

        @Override // p191b.AbstractC3499w
        /* renamed from: f */
        public void mo9527f(C3478b c3478b) {
            if (AbstractC2752I.m9397I0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + AbstractC2752I.f8106V + " fragment manager " + AbstractC2752I.this);
            }
            if (AbstractC2752I.f8106V) {
                AbstractC2752I.this.m9453X();
                AbstractC2752I.this.m9471g1();
            }
        }
    }

    /* renamed from: X.I$c */
    public class c implements InterfaceC0521p {
        public c() {
        }

        @Override // p049H.InterfaceC0521p
        /* renamed from: a */
        public boolean mo1991a(MenuItem menuItem) {
            return AbstractC2752I.this.m9425J(menuItem);
        }

        @Override // p049H.InterfaceC0521p
        /* renamed from: b */
        public void mo1992b(Menu menu) {
            AbstractC2752I.this.m9427K(menu);
        }

        @Override // p049H.InterfaceC0521p
        /* renamed from: c */
        public void mo1993c(Menu menu, MenuInflater menuInflater) {
            AbstractC2752I.this.m9413C(menu, menuInflater);
        }

        @Override // p049H.InterfaceC0521p
        /* renamed from: d */
        public void mo1994d(Menu menu) {
            AbstractC2752I.this.m9435O(menu);
        }
    }

    /* renamed from: X.I$d */
    public class d extends AbstractC2796z {
        public d() {
        }

        @Override // p161X.AbstractC2796z
        /* renamed from: a */
        public AbstractComponentCallbacksC2786p mo9528a(ClassLoader classLoader, String str) {
            return AbstractC2752I.this.m9512v0().m9954d(AbstractC2752I.this.m9512v0().m9376t(), str, null);
        }
    }

    /* renamed from: X.I$e */
    public class e implements InterfaceC2770a0 {
        public e() {
        }

        @Override // p161X.InterfaceC2770a0
        /* renamed from: a */
        public AbstractC2768Z mo9529a(ViewGroup viewGroup) {
            return new C2776f(viewGroup);
        }
    }

    /* renamed from: X.I$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2752I.this.m9459a0(true);
        }
    }

    /* renamed from: X.I$g */
    public class g implements InterfaceC2756M {

        /* renamed from: a */
        public final /* synthetic */ AbstractComponentCallbacksC2786p f8159a;

        public g(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
            this.f8159a = abstractComponentCallbacksC2786p;
        }

        @Override // p161X.InterfaceC2756M
        /* renamed from: b */
        public void mo9530b(AbstractC2752I abstractC2752I, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
            this.f8159a.m9883m0(abstractComponentCallbacksC2786p);
        }
    }

    /* renamed from: X.I$h */
    public class h implements InterfaceC4092b {
        public h() {
        }

        @Override // p207d.InterfaceC4092b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9522a(C4091a c4091a) {
            k kVar = (k) AbstractC2752I.this.f8115I.pollLast();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f8163a;
            int i7 = kVar.f8164b;
            AbstractComponentCallbacksC2786p m9593i = AbstractC2752I.this.f8129c.m9593i(str);
            if (m9593i != null) {
                m9593i.mo9875j0(i7, c4091a.m17155b(), c4091a.m17154a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: X.I$i */
    public class i implements InterfaceC4092b {
        public i() {
        }

        @Override // p207d.InterfaceC4092b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9522a(C4091a c4091a) {
            k kVar = (k) AbstractC2752I.this.f8115I.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.f8163a;
            int i7 = kVar.f8164b;
            AbstractComponentCallbacksC2786p m9593i = AbstractC2752I.this.f8129c.m9593i(str);
            if (m9593i != null) {
                m9593i.mo9875j0(i7, c4091a.m17155b(), c4091a.m17154a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: X.I$j */
    public static class j extends AbstractC4141a {
        @Override // p215e.AbstractC4141a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo9533a(Context context, C4097g c4097g) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m17178a = c4097g.m17178a();
            if (m17178a != null && (bundleExtra = m17178a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m17178a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m17178a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c4097g = new C4097g.a(c4097g.m17181d()).m17183b(null).m17184c(c4097g.m17180c(), c4097g.m17179b()).m17182a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c4097g);
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p215e.AbstractC4141a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C4091a mo9534c(int i7, Intent intent) {
            return new C4091a(i7, intent);
        }
    }

    /* renamed from: X.I$l */
    public interface l {
        /* renamed from: a */
        boolean mo9539a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* renamed from: X.I$m */
    public class m implements l {

        /* renamed from: a */
        public final String f8165a;

        /* renamed from: b */
        public final int f8166b;

        /* renamed from: c */
        public final int f8167c;

        public m(String str, int i7, int i8) {
            this.f8165a = str;
            this.f8166b = i7;
            this.f8167c = i8;
        }

        @Override // p161X.AbstractC2752I.l
        /* renamed from: a */
        public boolean mo9539a(ArrayList arrayList, ArrayList arrayList2) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = AbstractC2752I.this.f8107A;
            if (abstractComponentCallbacksC2786p == null || this.f8166b >= 0 || this.f8165a != null || !abstractComponentCallbacksC2786p.m9899s().m9462b1()) {
                return AbstractC2752I.this.m9467e1(arrayList, arrayList2, this.f8165a, this.f8166b, this.f8167c);
            }
            return false;
        }
    }

    /* renamed from: X.I$n */
    public class n implements l {
        public n() {
        }

        @Override // p161X.AbstractC2752I.l
        /* renamed from: a */
        public boolean mo9539a(ArrayList arrayList, ArrayList arrayList2) {
            boolean m9469f1 = AbstractC2752I.this.m9469f1(arrayList, arrayList2);
            AbstractC2752I abstractC2752I = AbstractC2752I.this;
            abstractC2752I.f8135i = true;
            if (!abstractC2752I.f8141o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(AbstractC2752I.this.m9488n0((C2769a) it.next()));
                }
                Iterator it2 = AbstractC2752I.this.f8141o.iterator();
                while (it2.hasNext()) {
                    AbstractC4094d.m17162a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
            }
            return m9469f1;
        }
    }

    /* renamed from: C0 */
    public static AbstractComponentCallbacksC2786p m9396C0(View view) {
        Object tag = view.getTag(AbstractC2651b.f7861a);
        if (tag instanceof AbstractComponentCallbacksC2786p) {
            return (AbstractComponentCallbacksC2786p) tag;
        }
        return null;
    }

    /* renamed from: I0 */
    public static boolean m9397I0(int i7) {
        return f8105U || Log.isLoggable("FragmentManager", i7);
    }

    /* renamed from: c0 */
    public static void m9401c0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        while (i7 < i8) {
            C2769a c2769a = (C2769a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                c2769a.m9713n(-1);
                c2769a.m9718s();
            } else {
                c2769a.m9713n(1);
                c2769a.m9717r();
            }
            i7++;
        }
    }

    /* renamed from: k0 */
    public static AbstractC2752I m9406k0(View view) {
        AbstractActivityC2791u abstractActivityC2791u;
        AbstractComponentCallbacksC2786p m9407l0 = m9407l0(view);
        if (m9407l0 != null) {
            if (m9407l0.m9855Z()) {
                return m9407l0.m9899s();
            }
            throw new IllegalStateException("The Fragment " + m9407l0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC2791u = null;
                break;
            }
            if (context instanceof AbstractActivityC2791u) {
                abstractActivityC2791u = (AbstractActivityC2791u) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC2791u != null) {
            return abstractActivityC2791u.m9927Y();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* renamed from: l0 */
    public static AbstractComponentCallbacksC2786p m9407l0(View view) {
        while (view != null) {
            AbstractComponentCallbacksC2786p m9396C0 = m9396C0(view);
            if (m9396C0 != null) {
                return m9396C0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: l1 */
    public static int m9408l1(int i7) {
        int i8 = 4097;
        if (i7 == 4097) {
            return 8194;
        }
        if (i7 != 8194) {
            i8 = 8197;
            if (i7 == 8197) {
                return 4100;
            }
            if (i7 == 4099) {
                return 4099;
            }
            if (i7 != 4100) {
                return 0;
            }
        }
        return i8;
    }

    /* renamed from: A */
    public boolean m9409A(MenuItem menuItem) {
        if (this.f8149w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null && abstractComponentCallbacksC2786p.m9844S0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A0 */
    public InterfaceC2770a0 m9410A0() {
        InterfaceC2770a0 interfaceC2770a0 = this.f8110D;
        if (interfaceC2770a0 != null) {
            return interfaceC2770a0;
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8152z;
        return abstractComponentCallbacksC2786p != null ? abstractComponentCallbacksC2786p.f8420B.m9410A0() : this.f8111E;
    }

    /* renamed from: B */
    public void m9411B() {
        this.f8117K = false;
        this.f8118L = false;
        this.f8124R.m9554p(false);
        m9443S(1);
    }

    /* renamed from: B0 */
    public C2884c.c m9412B0() {
        return this.f8125S;
    }

    /* renamed from: C */
    public boolean m9413C(Menu menu, MenuInflater menuInflater) {
        if (this.f8149w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z6 = false;
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null && m9432M0(abstractComponentCallbacksC2786p) && abstractComponentCallbacksC2786p.m9848U0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC2786p);
                z6 = true;
            }
        }
        if (this.f8131e != null) {
            for (int i7 = 0; i7 < this.f8131e.size(); i7++) {
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = (AbstractComponentCallbacksC2786p) this.f8131e.get(i7);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC2786p2)) {
                    abstractComponentCallbacksC2786p2.m9906u0();
                }
            }
        }
        this.f8131e = arrayList;
        return z6;
    }

    /* renamed from: D */
    public void m9414D() {
        this.f8119M = true;
        m9459a0(true);
        m9453X();
        m9502s();
        m9443S(-1);
        Object obj = this.f8150x;
        if (obj instanceof InterfaceC6938d) {
            ((InterfaceC6938d) obj).mo9940e(this.f8145s);
        }
        Object obj2 = this.f8150x;
        if (obj2 instanceof InterfaceC6937c) {
            ((InterfaceC6937c) obj2).mo9946l(this.f8144r);
        }
        Object obj3 = this.f8150x;
        if (obj3 instanceof InterfaceC6797m) {
            ((InterfaceC6797m) obj3).mo9949q(this.f8146t);
        }
        Object obj4 = this.f8150x;
        if (obj4 instanceof InterfaceC6798n) {
            ((InterfaceC6798n) obj4).mo9947o(this.f8147u);
        }
        Object obj5 = this.f8150x;
        if ((obj5 instanceof InterfaceC0518m) && this.f8152z == null) {
            ((InterfaceC0518m) obj5).mo1971c(this.f8148v);
        }
        this.f8150x = null;
        this.f8151y = null;
        this.f8152z = null;
        if (this.f8133g != null) {
            this.f8136j.m14047h();
            this.f8133g = null;
        }
        AbstractC4093c abstractC4093c = this.f8112F;
        if (abstractC4093c != null) {
            abstractC4093c.mo17161c();
            this.f8113G.mo17161c();
            this.f8114H.mo17161c();
        }
    }

    /* renamed from: D0 */
    public C3332O m9415D0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        return this.f8124R.m9551m(abstractComponentCallbacksC2786p);
    }

    /* renamed from: E */
    public void m9416E() {
        m9443S(1);
    }

    /* renamed from: E0 */
    public void m9417E0() {
        m9459a0(true);
        if (!f8106V || this.f8134h == null) {
            if (this.f8136j.m14046g()) {
                if (m9397I0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                m9462b1();
                return;
            } else {
                if (m9397I0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f8133g.m14061k();
                return;
            }
        }
        if (!this.f8141o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(m9488n0(this.f8134h));
            Iterator it = this.f8141o.iterator();
            while (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = this.f8134h.f8214c.iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = ((AbstractC2760Q.a) it3.next()).f8232b;
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.f8468u = false;
            }
        }
        Iterator it4 = m9508u(new ArrayList(Collections.singletonList(this.f8134h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((AbstractC2768Z) it4.next()).m9663f();
        }
        this.f8134h = null;
        m9513v1();
        if (m9397I0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f8136j.m14046g() + " for  FragmentManager " + this);
        }
    }

    /* renamed from: F */
    public void m9418F(boolean z6) {
        if (z6 && (this.f8150x instanceof InterfaceC6938d)) {
            m9510u1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.m9858a1();
                if (z6) {
                    abstractComponentCallbacksC2786p.f8422D.m9418F(true);
                }
            }
        }
    }

    /* renamed from: F0 */
    public void m9419F0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (m9397I0(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC2786p);
        }
        if (abstractComponentCallbacksC2786p.f8427I) {
            return;
        }
        abstractComponentCallbacksC2786p.f8427I = true;
        abstractComponentCallbacksC2786p.f8441W = true ^ abstractComponentCallbacksC2786p.f8441W;
        m9501r1(abstractComponentCallbacksC2786p);
    }

    /* renamed from: G */
    public void m9420G(boolean z6, boolean z7) {
        if (z7 && (this.f8150x instanceof InterfaceC6797m)) {
            m9510u1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.m9860b1(z6);
                if (z7) {
                    abstractComponentCallbacksC2786p.f8422D.m9420G(z6, true);
                }
            }
        }
    }

    /* renamed from: G0 */
    public void m9421G0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (abstractComponentCallbacksC2786p.f8466s && m9426J0(abstractComponentCallbacksC2786p)) {
            this.f8116J = true;
        }
    }

    /* renamed from: H */
    public void m9422H(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        Iterator it = this.f8143q.iterator();
        while (it.hasNext()) {
            ((InterfaceC2756M) it.next()).mo9530b(this, abstractComponentCallbacksC2786p);
        }
    }

    /* renamed from: H0 */
    public boolean m9423H0() {
        return this.f8119M;
    }

    /* renamed from: I */
    public void m9424I() {
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9596l()) {
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.m9914y0(abstractComponentCallbacksC2786p.m9857a0());
                abstractComponentCallbacksC2786p.f8422D.m9424I();
            }
        }
    }

    /* renamed from: J */
    public boolean m9425J(MenuItem menuItem) {
        if (this.f8149w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null && abstractComponentCallbacksC2786p.m9862c1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J0 */
    public final boolean m9426J0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        return (abstractComponentCallbacksC2786p.f8431M && abstractComponentCallbacksC2786p.f8432N) || abstractComponentCallbacksC2786p.f8422D.m9493p();
    }

    /* renamed from: K */
    public void m9427K(Menu menu) {
        if (this.f8149w < 1) {
            return;
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.m9864d1(menu);
            }
        }
    }

    /* renamed from: K0 */
    public final boolean m9428K0() {
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8152z;
        if (abstractComponentCallbacksC2786p == null) {
            return true;
        }
        return abstractComponentCallbacksC2786p.m9855Z() && this.f8152z.m9825H().m9428K0();
    }

    /* renamed from: L */
    public final void m9429L(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (abstractComponentCallbacksC2786p == null || !abstractComponentCallbacksC2786p.equals(m9468f0(abstractComponentCallbacksC2786p.f8455f))) {
            return;
        }
        abstractComponentCallbacksC2786p.m9873h1();
    }

    /* renamed from: L0 */
    public boolean m9430L0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (abstractComponentCallbacksC2786p == null) {
            return false;
        }
        return abstractComponentCallbacksC2786p.m9857a0();
    }

    /* renamed from: M */
    public void m9431M() {
        m9443S(5);
    }

    /* renamed from: M0 */
    public boolean m9432M0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (abstractComponentCallbacksC2786p == null) {
            return true;
        }
        return abstractComponentCallbacksC2786p.m9861c0();
    }

    /* renamed from: N */
    public void m9433N(boolean z6, boolean z7) {
        if (z7 && (this.f8150x instanceof InterfaceC6798n)) {
            m9510u1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.m9868f1(z6);
                if (z7) {
                    abstractComponentCallbacksC2786p.f8422D.m9433N(z6, true);
                }
            }
        }
    }

    /* renamed from: N0 */
    public boolean m9434N0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (abstractComponentCallbacksC2786p == null) {
            return true;
        }
        AbstractC2752I abstractC2752I = abstractComponentCallbacksC2786p.f8420B;
        return abstractComponentCallbacksC2786p.equals(abstractC2752I.m9521z0()) && m9434N0(abstractC2752I.f8152z);
    }

    /* renamed from: O */
    public boolean m9435O(Menu menu) {
        boolean z6 = false;
        if (this.f8149w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null && m9432M0(abstractComponentCallbacksC2786p) && abstractComponentCallbacksC2786p.m9871g1(menu)) {
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: O0 */
    public boolean m9436O0(int i7) {
        return this.f8149w >= i7;
    }

    /* renamed from: P */
    public void m9437P() {
        m9513v1();
        m9429L(this.f8107A);
    }

    /* renamed from: P0 */
    public boolean m9438P0() {
        return this.f8117K || this.f8118L;
    }

    /* renamed from: Q */
    public void m9439Q() {
        this.f8117K = false;
        this.f8118L = false;
        this.f8124R.m9554p(false);
        m9443S(7);
    }

    /* renamed from: R */
    public void m9441R() {
        this.f8117K = false;
        this.f8118L = false;
        this.f8124R.m9554p(false);
        m9443S(5);
    }

    /* renamed from: R0 */
    public final /* synthetic */ void m9442R0(Configuration configuration) {
        if (m9428K0()) {
            m9520z(configuration, false);
        }
    }

    /* renamed from: S */
    public final void m9443S(int i7) {
        try {
            this.f8128b = true;
            this.f8129c.m9588d(i7);
            m9452W0(i7, false);
            Iterator it = m9505t().iterator();
            while (it.hasNext()) {
                ((AbstractC2768Z) it.next()).m9672q();
            }
            this.f8128b = false;
            m9459a0(true);
        } catch (Throwable th) {
            this.f8128b = false;
            throw th;
        }
    }

    /* renamed from: S0 */
    public final /* synthetic */ void m9444S0(Integer num) {
        if (m9428K0() && num.intValue() == 80) {
            m9418F(false);
        }
    }

    /* renamed from: T */
    public void m9445T() {
        this.f8118L = true;
        this.f8124R.m9554p(true);
        m9443S(4);
    }

    /* renamed from: T0 */
    public final /* synthetic */ void m9446T0(C6791g c6791g) {
        if (m9428K0()) {
            m9420G(c6791g.m27843a(), false);
        }
    }

    /* renamed from: U */
    public void m9447U() {
        m9443S(2);
    }

    /* renamed from: U0 */
    public final /* synthetic */ void m9448U0(C6800p c6800p) {
        if (m9428K0()) {
            m9433N(c6800p.m27953a(), false);
        }
    }

    /* renamed from: V */
    public final void m9449V() {
        if (this.f8120N) {
            this.f8120N = false;
            m9507t1();
        }
    }

    /* renamed from: V0 */
    public void m9450V0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, Intent intent, int i7, Bundle bundle) {
        if (this.f8112F == null) {
            this.f8150x.m9373A(abstractComponentCallbacksC2786p, intent, i7, bundle);
            return;
        }
        this.f8115I.addLast(new k(abstractComponentCallbacksC2786p.f8455f, i7));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f8112F.m17159a(intent);
    }

    /* renamed from: W */
    public void m9451W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f8129c.m9589e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f8131e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size; i7++) {
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = (AbstractComponentCallbacksC2786p) this.f8131e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2786p.toString());
            }
        }
        int size2 = this.f8130d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size2; i8++) {
                C2769a c2769a = (C2769a) this.f8130d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(c2769a.toString());
                c2769a.m9715p(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f8137k.get());
        synchronized (this.f8127a) {
            try {
                int size3 = this.f8127a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size3; i9++) {
                        l lVar = (l) this.f8127a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8150x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8151y);
        if (this.f8152z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8152z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8149w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f8117K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8118L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f8119M);
        if (this.f8116J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f8116J);
        }
    }

    /* renamed from: W0 */
    public void m9452W0(int i7, boolean z6) {
        AbstractC2744A abstractC2744A;
        if (this.f8150x == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i7 != this.f8149w) {
            this.f8149w = i7;
            this.f8129c.m9604t();
            m9507t1();
            if (this.f8116J && (abstractC2744A = this.f8150x) != null && this.f8149w == 7) {
                abstractC2744A.mo9374B();
                this.f8116J = false;
            }
        }
    }

    /* renamed from: X */
    public final void m9453X() {
        Iterator it = m9505t().iterator();
        while (it.hasNext()) {
            ((AbstractC2768Z) it.next()).m9672q();
        }
    }

    /* renamed from: X0 */
    public void m9454X0() {
        if (this.f8150x == null) {
            return;
        }
        this.f8117K = false;
        this.f8118L = false;
        this.f8124R.m9554p(false);
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.m9872h0();
            }
        }
    }

    /* renamed from: Y */
    public void m9455Y(l lVar, boolean z6) {
        if (!z6) {
            if (this.f8150x == null) {
                if (!this.f8119M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m9496q();
        }
        synchronized (this.f8127a) {
            try {
                if (this.f8150x == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f8127a.add(lVar);
                    m9489n1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: Y0 */
    public void m9456Y0(C2794x c2794x) {
        View view;
        for (C2758O c2758o : this.f8129c.m9595k()) {
            AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
            if (m9572k.f8425G == c2794x.getId() && (view = m9572k.f8435Q) != null && view.getParent() == null) {
                m9572k.f8434P = c2794x;
                c2758o.m9563b();
            }
        }
    }

    /* renamed from: Z */
    public final void m9457Z(boolean z6) {
        if (this.f8128b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8150x == null) {
            if (!this.f8119M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f8150x.m9378v().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6) {
            m9496q();
        }
        if (this.f8121O == null) {
            this.f8121O = new ArrayList();
            this.f8122P = new ArrayList();
        }
    }

    /* renamed from: Z0 */
    public void m9458Z0(C2758O c2758o) {
        AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
        if (m9572k.f8436R) {
            if (this.f8128b) {
                this.f8120N = true;
            } else {
                m9572k.f8436R = false;
                c2758o.m9574m();
            }
        }
    }

    /* renamed from: a0 */
    public boolean m9459a0(boolean z6) {
        m9457Z(z6);
        boolean z7 = false;
        while (m9491o0(this.f8121O, this.f8122P)) {
            z7 = true;
            this.f8128b = true;
            try {
                m9477i1(this.f8121O, this.f8122P);
            } finally {
                m9499r();
            }
        }
        m9513v1();
        m9449V();
        this.f8129c.m9586b();
        return z7;
    }

    /* renamed from: a1 */
    public void m9460a1(int i7, int i8, boolean z6) {
        if (i7 >= 0) {
            m9455Y(new m(null, i7, i8), z6);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    /* renamed from: b0 */
    public void m9461b0(l lVar, boolean z6) {
        if (z6 && (this.f8150x == null || this.f8119M)) {
            return;
        }
        m9457Z(z6);
        if (lVar.mo9539a(this.f8121O, this.f8122P)) {
            this.f8128b = true;
            try {
                m9477i1(this.f8121O, this.f8122P);
            } finally {
                m9499r();
            }
        }
        m9513v1();
        m9449V();
        this.f8129c.m9586b();
    }

    /* renamed from: b1 */
    public boolean m9462b1() {
        return m9465d1(null, -1, 0);
    }

    /* renamed from: c1 */
    public boolean m9463c1(int i7, int i8) {
        if (i7 >= 0) {
            return m9465d1(null, i7, i8);
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    /* renamed from: d0 */
    public final void m9464d0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        boolean z6 = ((C2769a) arrayList.get(i7)).f8229r;
        ArrayList arrayList3 = this.f8123Q;
        if (arrayList3 == null) {
            this.f8123Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f8123Q.addAll(this.f8129c.m9599o());
        AbstractComponentCallbacksC2786p m9521z0 = m9521z0();
        boolean z7 = false;
        for (int i9 = i7; i9 < i8; i9++) {
            C2769a c2769a = (C2769a) arrayList.get(i9);
            m9521z0 = !((Boolean) arrayList2.get(i9)).booleanValue() ? c2769a.m9719t(this.f8123Q, m9521z0) : c2769a.m9722w(this.f8123Q, m9521z0);
            z7 = z7 || c2769a.f8220i;
        }
        this.f8123Q.clear();
        if (!z6 && this.f8149w >= 1) {
            for (int i10 = i7; i10 < i8; i10++) {
                Iterator it = ((C2769a) arrayList.get(i10)).f8214c.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = ((AbstractC2760Q.a) it.next()).f8232b;
                    if (abstractComponentCallbacksC2786p != null && abstractComponentCallbacksC2786p.f8420B != null) {
                        this.f8129c.m9602r(m9511v(abstractComponentCallbacksC2786p));
                    }
                }
            }
        }
        m9401c0(arrayList, arrayList2, i7, i8);
        boolean booleanValue = ((Boolean) arrayList2.get(i8 - 1)).booleanValue();
        if (z7 && !this.f8141o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m9488n0((C2769a) it2.next()));
            }
            if (this.f8134h == null) {
                Iterator it3 = this.f8141o.iterator();
                while (it3.hasNext()) {
                    AbstractC4094d.m17162a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = this.f8141o.iterator();
                while (it5.hasNext()) {
                    AbstractC4094d.m17162a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i11 = i7; i11 < i8; i11++) {
            C2769a c2769a2 = (C2769a) arrayList.get(i11);
            if (booleanValue) {
                for (int size = c2769a2.f8214c.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = ((AbstractC2760Q.a) c2769a2.f8214c.get(size)).f8232b;
                    if (abstractComponentCallbacksC2786p2 != null) {
                        m9511v(abstractComponentCallbacksC2786p2).m9574m();
                    }
                }
            } else {
                Iterator it7 = c2769a2.f8214c.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p3 = ((AbstractC2760Q.a) it7.next()).f8232b;
                    if (abstractComponentCallbacksC2786p3 != null) {
                        m9511v(abstractComponentCallbacksC2786p3).m9574m();
                    }
                }
            }
        }
        m9452W0(this.f8149w, true);
        for (AbstractC2768Z abstractC2768Z : m9508u(arrayList, i7, i8)) {
            abstractC2768Z.m9659B(booleanValue);
            abstractC2768Z.m9677x();
            abstractC2768Z.m9669n();
        }
        while (i7 < i8) {
            C2769a c2769a3 = (C2769a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue() && c2769a3.f8312v >= 0) {
                c2769a3.f8312v = -1;
            }
            c2769a3.m9721v();
            i7++;
        }
        if (z7) {
            m9480j1();
        }
    }

    /* renamed from: d1 */
    public final boolean m9465d1(String str, int i7, int i8) {
        m9459a0(false);
        m9457Z(true);
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8107A;
        if (abstractComponentCallbacksC2786p != null && i7 < 0 && str == null && abstractComponentCallbacksC2786p.m9899s().m9462b1()) {
            return true;
        }
        boolean m9467e1 = m9467e1(this.f8121O, this.f8122P, str, i7, i8);
        if (m9467e1) {
            this.f8128b = true;
            try {
                m9477i1(this.f8121O, this.f8122P);
            } finally {
                m9499r();
            }
        }
        m9513v1();
        m9449V();
        this.f8129c.m9586b();
        return m9467e1;
    }

    /* renamed from: e0 */
    public boolean m9466e0() {
        boolean m9459a0 = m9459a0(true);
        m9485m0();
        return m9459a0;
    }

    /* renamed from: e1 */
    public boolean m9467e1(ArrayList arrayList, ArrayList arrayList2, String str, int i7, int i8) {
        int m9470g0 = m9470g0(str, i7, (i8 & 1) != 0);
        if (m9470g0 < 0) {
            return false;
        }
        for (int size = this.f8130d.size() - 1; size >= m9470g0; size--) {
            arrayList.add((C2769a) this.f8130d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: f0 */
    public AbstractComponentCallbacksC2786p m9468f0(String str) {
        return this.f8129c.m9590f(str);
    }

    /* renamed from: f1 */
    public boolean m9469f1(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f8130d;
        C2769a c2769a = (C2769a) arrayList3.get(arrayList3.size() - 1);
        this.f8134h = c2769a;
        Iterator it = c2769a.f8214c.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = ((AbstractC2760Q.a) it.next()).f8232b;
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.f8468u = true;
            }
        }
        return m9467e1(arrayList, arrayList2, null, -1, 0);
    }

    /* renamed from: g0 */
    public final int m9470g0(String str, int i7, boolean z6) {
        if (this.f8130d.isEmpty()) {
            return -1;
        }
        if (str == null && i7 < 0) {
            if (z6) {
                return 0;
            }
            return this.f8130d.size() - 1;
        }
        int size = this.f8130d.size() - 1;
        while (size >= 0) {
            C2769a c2769a = (C2769a) this.f8130d.get(size);
            if ((str != null && str.equals(c2769a.m9720u())) || (i7 >= 0 && i7 == c2769a.f8312v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z6) {
            if (size == this.f8130d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2769a c2769a2 = (C2769a) this.f8130d.get(size - 1);
            if ((str == null || !str.equals(c2769a2.m9720u())) && (i7 < 0 || i7 != c2769a2.f8312v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    /* renamed from: g1 */
    public void m9471g1() {
        m9455Y(new n(), false);
    }

    /* renamed from: h */
    public void m9472h(C2769a c2769a) {
        this.f8130d.add(c2769a);
    }

    /* renamed from: h0 */
    public AbstractComponentCallbacksC2786p m9473h0(int i7) {
        return this.f8129c.m9591g(i7);
    }

    /* renamed from: h1 */
    public void m9474h1(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (m9397I0(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC2786p + " nesting=" + abstractComponentCallbacksC2786p.f8419A);
        }
        boolean m9859b0 = abstractComponentCallbacksC2786p.m9859b0();
        if (abstractComponentCallbacksC2786p.f8428J && m9859b0) {
            return;
        }
        this.f8129c.m9605u(abstractComponentCallbacksC2786p);
        if (m9426J0(abstractComponentCallbacksC2786p)) {
            this.f8116J = true;
        }
        abstractComponentCallbacksC2786p.f8467t = true;
        m9501r1(abstractComponentCallbacksC2786p);
    }

    /* renamed from: i */
    public C2758O m9475i(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        String str = abstractComponentCallbacksC2786p.f8444Z;
        if (str != null) {
            C2884c.m10402f(abstractComponentCallbacksC2786p, str);
        }
        if (m9397I0(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC2786p);
        }
        C2758O m9511v = m9511v(abstractComponentCallbacksC2786p);
        abstractComponentCallbacksC2786p.f8420B = this;
        this.f8129c.m9602r(m9511v);
        if (!abstractComponentCallbacksC2786p.f8428J) {
            this.f8129c.m9585a(abstractComponentCallbacksC2786p);
            abstractComponentCallbacksC2786p.f8467t = false;
            if (abstractComponentCallbacksC2786p.f8435Q == null) {
                abstractComponentCallbacksC2786p.f8441W = false;
            }
            if (m9426J0(abstractComponentCallbacksC2786p)) {
                this.f8116J = true;
            }
        }
        return m9511v;
    }

    /* renamed from: i0 */
    public AbstractComponentCallbacksC2786p m9476i0(String str) {
        return this.f8129c.m9592h(str);
    }

    /* renamed from: i1 */
    public final void m9477i1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!((C2769a) arrayList.get(i7)).f8229r) {
                if (i8 != i7) {
                    m9464d0(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C2769a) arrayList.get(i8)).f8229r) {
                        i8++;
                    }
                }
                m9464d0(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            m9464d0(arrayList, arrayList2, i8, size);
        }
    }

    /* renamed from: j */
    public void m9478j(InterfaceC2756M interfaceC2756M) {
        this.f8143q.add(interfaceC2756M);
    }

    /* renamed from: j0 */
    public AbstractComponentCallbacksC2786p m9479j0(String str) {
        return this.f8129c.m9593i(str);
    }

    /* renamed from: j1 */
    public final void m9480j1() {
        if (this.f8141o.size() <= 0) {
            return;
        }
        AbstractC4094d.m17162a(this.f8141o.get(0));
        throw null;
    }

    /* renamed from: k */
    public int m9481k() {
        return this.f8137k.getAndIncrement();
    }

    /* renamed from: k1 */
    public void m9482k1(Parcelable parcelable) {
        C2758O c2758o;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f8150x.m9376t().getClassLoader());
                this.f8139m.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f8150x.m9376t().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.f8129c.m9608x(hashMap);
        C2754K c2754k = (C2754K) bundle3.getParcelable("state");
        if (c2754k == null) {
            return;
        }
        this.f8129c.m9606v();
        Iterator it = c2754k.f8170a.iterator();
        while (it.hasNext()) {
            Bundle m9584B = this.f8129c.m9584B((String) it.next(), null);
            if (m9584B != null) {
                AbstractComponentCallbacksC2786p m9548i = this.f8124R.m9548i(((C2757N) m9584B.getParcelable("state")).f8187b);
                if (m9548i != null) {
                    if (m9397I0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m9548i);
                    }
                    c2758o = new C2758O(this.f8142p, this.f8129c, m9548i, m9584B);
                } else {
                    c2758o = new C2758O(this.f8142p, this.f8129c, this.f8150x.m9376t().getClassLoader(), m9506t0(), m9584B);
                }
                AbstractComponentCallbacksC2786p m9572k = c2758o.m9572k();
                m9572k.f8447b = m9584B;
                m9572k.f8420B = this;
                if (m9397I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m9572k.f8455f + "): " + m9572k);
                }
                c2758o.m9576o(this.f8150x.m9376t().getClassLoader());
                this.f8129c.m9602r(c2758o);
                c2758o.m9580s(this.f8149w);
            }
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8124R.m9550l()) {
            if (!this.f8129c.m9587c(abstractComponentCallbacksC2786p.f8455f)) {
                if (m9397I0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC2786p + " that was not found in the set of active Fragments " + c2754k.f8170a);
                }
                this.f8124R.m9553o(abstractComponentCallbacksC2786p);
                abstractComponentCallbacksC2786p.f8420B = this;
                C2758O c2758o2 = new C2758O(this.f8142p, this.f8129c, abstractComponentCallbacksC2786p);
                c2758o2.m9580s(1);
                c2758o2.m9574m();
                abstractComponentCallbacksC2786p.f8467t = true;
                c2758o2.m9574m();
            }
        }
        this.f8129c.m9607w(c2754k.f8171b);
        if (c2754k.f8172c != null) {
            this.f8130d = new ArrayList(c2754k.f8172c.length);
            int i7 = 0;
            while (true) {
                C2771b[] c2771bArr = c2754k.f8172c;
                if (i7 >= c2771bArr.length) {
                    break;
                }
                C2769a m9724b = c2771bArr[i7].m9724b(this);
                if (m9397I0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + m9724b.f8312v + "): " + m9724b);
                    PrintWriter printWriter = new PrintWriter(new C2765W("FragmentManager"));
                    m9724b.m9716q("  ", printWriter, false);
                    printWriter.close();
                }
                this.f8130d.add(m9724b);
                i7++;
            }
        } else {
            this.f8130d = new ArrayList();
        }
        this.f8137k.set(c2754k.f8173d);
        String str3 = c2754k.f8174e;
        if (str3 != null) {
            AbstractComponentCallbacksC2786p m9468f0 = m9468f0(str3);
            this.f8107A = m9468f0;
            m9429L(m9468f0);
        }
        ArrayList arrayList = c2754k.f8175f;
        if (arrayList != null) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                this.f8138l.put((String) arrayList.get(i8), (C2773c) c2754k.f8176n.get(i8));
            }
        }
        this.f8115I = new ArrayDeque(c2754k.f8177o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public void m9483l(AbstractC2744A abstractC2744A, AbstractC2793w abstractC2793w, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        String str;
        if (this.f8150x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8150x = abstractC2744A;
        this.f8151y = abstractC2793w;
        this.f8152z = abstractComponentCallbacksC2786p;
        if (abstractComponentCallbacksC2786p != null) {
            m9478j(new g(abstractComponentCallbacksC2786p));
        } else if (abstractC2744A instanceof InterfaceC2756M) {
            m9478j((InterfaceC2756M) abstractC2744A);
        }
        if (this.f8152z != null) {
            m9513v1();
        }
        if (abstractC2744A instanceof InterfaceC3502z) {
            InterfaceC3502z interfaceC3502z = (InterfaceC3502z) abstractC2744A;
            C3500x mo9943h = interfaceC3502z.mo9943h();
            this.f8133g = mo9943h;
            InterfaceC3349n interfaceC3349n = interfaceC3502z;
            if (abstractComponentCallbacksC2786p != null) {
                interfaceC3349n = abstractComponentCallbacksC2786p;
            }
            mo9943h.m14058h(interfaceC3349n, this.f8136j);
        }
        if (abstractComponentCallbacksC2786p != null) {
            this.f8124R = abstractComponentCallbacksC2786p.f8420B.m9497q0(abstractComponentCallbacksC2786p);
        } else if (abstractC2744A instanceof InterfaceC3333P) {
            this.f8124R = C2755L.m9542k(((InterfaceC3333P) abstractC2744A).mo9650j());
        } else {
            this.f8124R = new C2755L(false);
        }
        this.f8124R.m9554p(m9438P0());
        this.f8129c.m9583A(this.f8124R);
        Object obj = this.f8150x;
        if ((obj instanceof InterfaceC0034f) && abstractComponentCallbacksC2786p == null) {
            C0032d mo97w = ((InterfaceC0034f) obj).mo97w();
            mo97w.m88h("android:support:fragments", new C0032d.c() { // from class: X.H
                @Override // p009B1.C0032d.c
                /* renamed from: a */
                public final Bundle mo79a() {
                    Bundle m9440Q0;
                    m9440Q0 = AbstractC2752I.this.m9440Q0();
                    return m9440Q0;
                }
            });
            Bundle m83b = mo97w.m83b("android:support:fragments");
            if (m83b != null) {
                m9482k1(m83b);
            }
        }
        Object obj2 = this.f8150x;
        if (obj2 instanceof InterfaceC4096f) {
            AbstractC4095e mo9944i = ((InterfaceC4096f) obj2).mo9944i();
            if (abstractComponentCallbacksC2786p != null) {
                str = abstractComponentCallbacksC2786p.f8455f + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
            } else {
                str = StringUtils.EMPTY;
            }
            String str2 = "FragmentManager:" + str;
            this.f8112F = mo9944i.m17172k(str2 + "StartActivityForResult", new C4148h(), new h());
            this.f8113G = mo9944i.m17172k(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f8114H = mo9944i.m17172k(str2 + "RequestPermissions", new C4147g(), new a());
        }
        Object obj3 = this.f8150x;
        if (obj3 instanceof InterfaceC6937c) {
            ((InterfaceC6937c) obj3).mo9948p(this.f8144r);
        }
        Object obj4 = this.f8150x;
        if (obj4 instanceof InterfaceC6938d) {
            ((InterfaceC6938d) obj4).mo9941f(this.f8145s);
        }
        Object obj5 = this.f8150x;
        if (obj5 instanceof InterfaceC6797m) {
            ((InterfaceC6797m) obj5).mo9945k(this.f8146t);
        }
        Object obj6 = this.f8150x;
        if (obj6 instanceof InterfaceC6798n) {
            ((InterfaceC6798n) obj6).mo9942g(this.f8147u);
        }
        Object obj7 = this.f8150x;
        if ((obj7 instanceof InterfaceC0518m) && abstractComponentCallbacksC2786p == null) {
            ((InterfaceC0518m) obj7).mo1972n(this.f8148v);
        }
    }

    /* renamed from: m */
    public void m9484m(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (m9397I0(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC2786p);
        }
        if (abstractComponentCallbacksC2786p.f8428J) {
            abstractComponentCallbacksC2786p.f8428J = false;
            if (abstractComponentCallbacksC2786p.f8466s) {
                return;
            }
            this.f8129c.m9585a(abstractComponentCallbacksC2786p);
            if (m9397I0(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC2786p);
            }
            if (m9426J0(abstractComponentCallbacksC2786p)) {
                this.f8116J = true;
            }
        }
    }

    /* renamed from: m0 */
    public final void m9485m0() {
        Iterator it = m9505t().iterator();
        while (it.hasNext()) {
            ((AbstractC2768Z) it.next()).m9673r();
        }
    }

    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public Bundle m9440Q0() {
        C2771b[] c2771bArr;
        Bundle bundle = new Bundle();
        m9485m0();
        m9453X();
        m9459a0(true);
        this.f8117K = true;
        this.f8124R.m9554p(true);
        ArrayList m9609y = this.f8129c.m9609y();
        HashMap m9597m = this.f8129c.m9597m();
        if (!m9597m.isEmpty()) {
            ArrayList m9610z = this.f8129c.m9610z();
            int size = this.f8130d.size();
            if (size > 0) {
                c2771bArr = new C2771b[size];
                for (int i7 = 0; i7 < size; i7++) {
                    c2771bArr[i7] = new C2771b((C2769a) this.f8130d.get(i7));
                    if (m9397I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i7 + ": " + this.f8130d.get(i7));
                    }
                }
            } else {
                c2771bArr = null;
            }
            C2754K c2754k = new C2754K();
            c2754k.f8170a = m9609y;
            c2754k.f8171b = m9610z;
            c2754k.f8172c = c2771bArr;
            c2754k.f8173d = this.f8137k.get();
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8107A;
            if (abstractComponentCallbacksC2786p != null) {
                c2754k.f8174e = abstractComponentCallbacksC2786p.f8455f;
            }
            c2754k.f8175f.addAll(this.f8138l.keySet());
            c2754k.f8176n.addAll(this.f8138l.values());
            c2754k.f8177o = new ArrayList(this.f8115I);
            bundle.putParcelable("state", c2754k);
            for (String str : this.f8139m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f8139m.get(str));
            }
            for (String str2 : m9597m.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) m9597m.get(str2));
            }
        } else if (m9397I0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* renamed from: n */
    public AbstractC2760Q m9487n() {
        return new C2769a(this);
    }

    /* renamed from: n0 */
    public Set m9488n0(C2769a c2769a) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c2769a.f8214c.size(); i7++) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = ((AbstractC2760Q.a) c2769a.f8214c.get(i7)).f8232b;
            if (abstractComponentCallbacksC2786p != null && c2769a.f8220i) {
                hashSet.add(abstractComponentCallbacksC2786p);
            }
        }
        return hashSet;
    }

    /* renamed from: n1 */
    public void m9489n1() {
        synchronized (this.f8127a) {
            try {
                if (this.f8127a.size() == 1) {
                    this.f8150x.m9378v().removeCallbacks(this.f8126T);
                    this.f8150x.m9378v().post(this.f8126T);
                    m9513v1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public void m9490o() {
        C2769a c2769a = this.f8134h;
        if (c2769a != null) {
            c2769a.f8311u = false;
            c2769a.mo9615f();
            m9466e0();
            Iterator it = this.f8141o.iterator();
            if (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                throw null;
            }
        }
    }

    /* renamed from: o0 */
    public final boolean m9491o0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f8127a) {
            if (this.f8127a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f8127a.size();
                boolean z6 = false;
                for (int i7 = 0; i7 < size; i7++) {
                    z6 |= ((l) this.f8127a.get(i7)).mo9539a(arrayList, arrayList2);
                }
                return z6;
            } finally {
                this.f8127a.clear();
                this.f8150x.m9378v().removeCallbacks(this.f8126T);
            }
        }
    }

    /* renamed from: o1 */
    public void m9492o1(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, boolean z6) {
        ViewGroup m9503s0 = m9503s0(abstractComponentCallbacksC2786p);
        if (m9503s0 == null || !(m9503s0 instanceof C2794x)) {
            return;
        }
        ((C2794x) m9503s0).setDrawDisappearingViewsLast(!z6);
    }

    /* renamed from: p */
    public boolean m9493p() {
        boolean z6 = false;
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9596l()) {
            if (abstractComponentCallbacksC2786p != null) {
                z6 = m9426J0(abstractComponentCallbacksC2786p);
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p0 */
    public int m9494p0() {
        return this.f8130d.size() + (this.f8134h != null ? 1 : 0);
    }

    /* renamed from: p1 */
    public void m9495p1(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, AbstractC3345j.b bVar) {
        if (abstractComponentCallbacksC2786p.equals(m9468f0(abstractComponentCallbacksC2786p.f8455f)) && (abstractComponentCallbacksC2786p.f8421C == null || abstractComponentCallbacksC2786p.f8420B == this)) {
            abstractComponentCallbacksC2786p.f8446a0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2786p + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: q */
    public final void m9496q() {
        if (m9438P0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: q0 */
    public final C2755L m9497q0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        return this.f8124R.m9549j(abstractComponentCallbacksC2786p);
    }

    /* renamed from: q1 */
    public void m9498q1(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (abstractComponentCallbacksC2786p == null || (abstractComponentCallbacksC2786p.equals(m9468f0(abstractComponentCallbacksC2786p.f8455f)) && (abstractComponentCallbacksC2786p.f8421C == null || abstractComponentCallbacksC2786p.f8420B == this))) {
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p2 = this.f8107A;
            this.f8107A = abstractComponentCallbacksC2786p;
            m9429L(abstractComponentCallbacksC2786p2);
            m9429L(this.f8107A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2786p + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: r */
    public final void m9499r() {
        this.f8128b = false;
        this.f8122P.clear();
        this.f8121O.clear();
    }

    /* renamed from: r0 */
    public AbstractC2793w m9500r0() {
        return this.f8151y;
    }

    /* renamed from: r1 */
    public final void m9501r1(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        ViewGroup m9503s0 = m9503s0(abstractComponentCallbacksC2786p);
        if (m9503s0 == null || abstractComponentCallbacksC2786p.m9905u() + abstractComponentCallbacksC2786p.m9913y() + abstractComponentCallbacksC2786p.m9829J() + abstractComponentCallbacksC2786p.m9831K() <= 0) {
            return;
        }
        if (m9503s0.getTag(AbstractC2651b.f7863c) == null) {
            m9503s0.setTag(AbstractC2651b.f7863c, abstractComponentCallbacksC2786p);
        }
        ((AbstractComponentCallbacksC2786p) m9503s0.getTag(AbstractC2651b.f7863c)).m9915y1(abstractComponentCallbacksC2786p.m9827I());
    }

    /* renamed from: s */
    public final void m9502s() {
        AbstractC2744A abstractC2744A = this.f8150x;
        if (abstractC2744A instanceof InterfaceC3333P ? this.f8129c.m9600p().m9552n() : abstractC2744A.m9376t() instanceof Activity ? !((Activity) this.f8150x.m9376t()).isChangingConfigurations() : true) {
            Iterator it = this.f8138l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C2773c) it.next()).f8328a.iterator();
                while (it2.hasNext()) {
                    this.f8129c.m9600p().m9546g((String) it2.next(), false);
                }
            }
        }
    }

    /* renamed from: s0 */
    public final ViewGroup m9503s0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        ViewGroup viewGroup = abstractComponentCallbacksC2786p.f8434P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC2786p.f8425G > 0 && this.f8151y.mo9805r()) {
            View mo9804m = this.f8151y.mo9804m(abstractComponentCallbacksC2786p.f8425G);
            if (mo9804m instanceof ViewGroup) {
                return (ViewGroup) mo9804m;
            }
        }
        return null;
    }

    /* renamed from: s1 */
    public void m9504s1(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (m9397I0(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC2786p);
        }
        if (abstractComponentCallbacksC2786p.f8427I) {
            abstractComponentCallbacksC2786p.f8427I = false;
            abstractComponentCallbacksC2786p.f8441W = !abstractComponentCallbacksC2786p.f8441W;
        }
    }

    /* renamed from: t */
    public final Set m9505t() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f8129c.m9595k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C2758O) it.next()).m9572k().f8434P;
            if (viewGroup != null) {
                hashSet.add(AbstractC2768Z.m9657v(viewGroup, m9410A0()));
            }
        }
        return hashSet;
    }

    /* renamed from: t0 */
    public AbstractC2796z m9506t0() {
        AbstractC2796z abstractC2796z = this.f8108B;
        if (abstractC2796z != null) {
            return abstractC2796z;
        }
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8152z;
        return abstractComponentCallbacksC2786p != null ? abstractComponentCallbacksC2786p.f8420B.m9506t0() : this.f8109C;
    }

    /* renamed from: t1 */
    public final void m9507t1() {
        Iterator it = this.f8129c.m9595k().iterator();
        while (it.hasNext()) {
            m9458Z0((C2758O) it.next());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = this.f8152z;
        if (abstractComponentCallbacksC2786p != null) {
            sb.append(abstractComponentCallbacksC2786p.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f8152z)));
            sb.append("}");
        } else {
            AbstractC2744A abstractC2744A = this.f8150x;
            if (abstractC2744A != null) {
                sb.append(abstractC2744A.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f8150x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public Set m9508u(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator it = ((C2769a) arrayList.get(i7)).f8214c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = ((AbstractC2760Q.a) it.next()).f8232b;
                if (abstractComponentCallbacksC2786p != null && (viewGroup = abstractComponentCallbacksC2786p.f8434P) != null) {
                    hashSet.add(AbstractC2768Z.m9656u(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    /* renamed from: u0 */
    public List m9509u0() {
        return this.f8129c.m9599o();
    }

    /* renamed from: u1 */
    public final void m9510u1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C2765W("FragmentManager"));
        AbstractC2744A abstractC2744A = this.f8150x;
        if (abstractC2744A != null) {
            try {
                abstractC2744A.mo9379x("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw runtimeException;
            }
        }
        try {
            m9451W("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw runtimeException;
        }
    }

    /* renamed from: v */
    public C2758O m9511v(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        C2758O m9598n = this.f8129c.m9598n(abstractComponentCallbacksC2786p.f8455f);
        if (m9598n != null) {
            return m9598n;
        }
        C2758O c2758o = new C2758O(this.f8142p, this.f8129c, abstractComponentCallbacksC2786p);
        c2758o.m9576o(this.f8150x.m9376t().getClassLoader());
        c2758o.m9580s(this.f8149w);
        return c2758o;
    }

    /* renamed from: v0 */
    public AbstractC2744A m9512v0() {
        return this.f8150x;
    }

    /* renamed from: v1 */
    public final void m9513v1() {
        synchronized (this.f8127a) {
            try {
                if (!this.f8127a.isEmpty()) {
                    this.f8136j.m14049j(true);
                    if (m9397I0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z6 = m9494p0() > 0 && m9434N0(this.f8152z);
                if (m9397I0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z6);
                }
                this.f8136j.m14049j(z6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: w */
    public void m9514w(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        if (m9397I0(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC2786p);
        }
        if (abstractComponentCallbacksC2786p.f8428J) {
            return;
        }
        abstractComponentCallbacksC2786p.f8428J = true;
        if (abstractComponentCallbacksC2786p.f8466s) {
            if (m9397I0(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC2786p);
            }
            this.f8129c.m9605u(abstractComponentCallbacksC2786p);
            if (m9426J0(abstractComponentCallbacksC2786p)) {
                this.f8116J = true;
            }
            m9501r1(abstractComponentCallbacksC2786p);
        }
    }

    /* renamed from: w0 */
    public LayoutInflater.Factory2 m9515w0() {
        return this.f8132f;
    }

    /* renamed from: x */
    public void m9516x() {
        this.f8117K = false;
        this.f8118L = false;
        this.f8124R.m9554p(false);
        m9443S(4);
    }

    /* renamed from: x0 */
    public C2746C m9517x0() {
        return this.f8142p;
    }

    /* renamed from: y */
    public void m9518y() {
        this.f8117K = false;
        this.f8118L = false;
        this.f8124R.m9554p(false);
        m9443S(0);
    }

    /* renamed from: y0 */
    public AbstractComponentCallbacksC2786p m9519y0() {
        return this.f8152z;
    }

    /* renamed from: z */
    public void m9520z(Configuration configuration, boolean z6) {
        if (z6 && (this.f8150x instanceof InterfaceC6937c)) {
            m9510u1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : this.f8129c.m9599o()) {
            if (abstractComponentCallbacksC2786p != null) {
                abstractComponentCallbacksC2786p.m9842R0(configuration);
                if (z6) {
                    abstractComponentCallbacksC2786p.f8422D.m9520z(configuration, true);
                }
            }
        }
    }

    /* renamed from: z0 */
    public AbstractComponentCallbacksC2786p m9521z0() {
        return this.f8107A;
    }

    /* renamed from: X.I$k */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a */
        public String f8163a;

        /* renamed from: b */
        public int f8164b;

        /* renamed from: X.I$k$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i7) {
                return new k[i7];
            }
        }

        public k(String str, int i7) {
            this.f8163a = str;
            this.f8164b = i7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f8163a);
            parcel.writeInt(this.f8164b);
        }

        public k(Parcel parcel) {
            this.f8163a = parcel.readString();
            this.f8164b = parcel.readInt();
        }
    }
}

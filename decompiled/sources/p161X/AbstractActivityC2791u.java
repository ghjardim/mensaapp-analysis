package p161X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.C3332O;
import androidx.lifecycle.C3350o;
import androidx.lifecycle.InterfaceC3333P;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p009B1.C0032d;
import p009B1.InterfaceC0034f;
import p042G.InterfaceC0339a;
import p049H.InterfaceC0518m;
import p049H.InterfaceC0521p;
import p191b.AbstractActivityC3486j;
import p191b.C3500x;
import p191b.InterfaceC3502z;
import p199c.InterfaceC3563b;
import p207d.AbstractC4095e;
import p207d.InterfaceC4096f;
import p208d0.AbstractC4099a;
import p365w.AbstractC6785a;
import p365w.InterfaceC6797m;
import p365w.InterfaceC6798n;
import p372x.InterfaceC6937c;
import p372x.InterfaceC6938d;

/* renamed from: X.u */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2791u extends AbstractActivityC3486j implements AbstractC6785a.b {

    /* renamed from: F */
    public boolean f8507F;

    /* renamed from: G */
    public boolean f8508G;

    /* renamed from: D */
    public final C2795y f8505D = C2795y.m9957b(new a());

    /* renamed from: E */
    public final C3350o f8506E = new C3350o(this);

    /* renamed from: H */
    public boolean f8509H = true;

    /* renamed from: X.u$a */
    public class a extends AbstractC2744A implements InterfaceC6937c, InterfaceC6938d, InterfaceC6797m, InterfaceC6798n, InterfaceC3333P, InterfaceC3502z, InterfaceC4096f, InterfaceC0034f, InterfaceC2756M, InterfaceC0518m {
        public a() {
            super(AbstractActivityC2791u.this);
        }

        @Override // p161X.AbstractC2744A
        /* renamed from: B */
        public void mo9374B() {
            m9938C();
        }

        /* renamed from: C */
        public void m9938C() {
            AbstractActivityC2791u.this.m14006Q();
        }

        @Override // p161X.AbstractC2744A
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC2791u mo9380y() {
            return AbstractActivityC2791u.this;
        }

        @Override // androidx.lifecycle.InterfaceC3349n
        /* renamed from: a */
        public AbstractC3345j mo9642a() {
            return AbstractActivityC2791u.this.f8506E;
        }

        @Override // p161X.InterfaceC2756M
        /* renamed from: b */
        public void mo9530b(AbstractC2752I abstractC2752I, AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
            AbstractActivityC2791u.this.m9936h0(abstractComponentCallbacksC2786p);
        }

        @Override // p049H.InterfaceC0518m
        /* renamed from: c */
        public void mo1971c(InterfaceC0521p interfaceC0521p) {
            AbstractActivityC2791u.this.mo1971c(interfaceC0521p);
        }

        @Override // p372x.InterfaceC6938d
        /* renamed from: e */
        public void mo9940e(InterfaceC0339a interfaceC0339a) {
            AbstractActivityC2791u.this.mo9940e(interfaceC0339a);
        }

        @Override // p372x.InterfaceC6938d
        /* renamed from: f */
        public void mo9941f(InterfaceC0339a interfaceC0339a) {
            AbstractActivityC2791u.this.mo9941f(interfaceC0339a);
        }

        @Override // p365w.InterfaceC6798n
        /* renamed from: g */
        public void mo9942g(InterfaceC0339a interfaceC0339a) {
            AbstractActivityC2791u.this.mo9942g(interfaceC0339a);
        }

        @Override // p191b.InterfaceC3502z
        /* renamed from: h */
        public C3500x mo9943h() {
            return AbstractActivityC2791u.this.mo9943h();
        }

        @Override // p207d.InterfaceC4096f
        /* renamed from: i */
        public AbstractC4095e mo9944i() {
            return AbstractActivityC2791u.this.mo9944i();
        }

        @Override // androidx.lifecycle.InterfaceC3333P
        /* renamed from: j */
        public C3332O mo9650j() {
            return AbstractActivityC2791u.this.mo9650j();
        }

        @Override // p365w.InterfaceC6797m
        /* renamed from: k */
        public void mo9945k(InterfaceC0339a interfaceC0339a) {
            AbstractActivityC2791u.this.mo9945k(interfaceC0339a);
        }

        @Override // p372x.InterfaceC6937c
        /* renamed from: l */
        public void mo9946l(InterfaceC0339a interfaceC0339a) {
            AbstractActivityC2791u.this.mo9946l(interfaceC0339a);
        }

        @Override // p161X.AbstractC2793w
        /* renamed from: m */
        public View mo9804m(int i7) {
            return AbstractActivityC2791u.this.findViewById(i7);
        }

        @Override // p049H.InterfaceC0518m
        /* renamed from: n */
        public void mo1972n(InterfaceC0521p interfaceC0521p) {
            AbstractActivityC2791u.this.mo1972n(interfaceC0521p);
        }

        @Override // p365w.InterfaceC6798n
        /* renamed from: o */
        public void mo9947o(InterfaceC0339a interfaceC0339a) {
            AbstractActivityC2791u.this.mo9947o(interfaceC0339a);
        }

        @Override // p372x.InterfaceC6937c
        /* renamed from: p */
        public void mo9948p(InterfaceC0339a interfaceC0339a) {
            AbstractActivityC2791u.this.mo9948p(interfaceC0339a);
        }

        @Override // p365w.InterfaceC6797m
        /* renamed from: q */
        public void mo9949q(InterfaceC0339a interfaceC0339a) {
            AbstractActivityC2791u.this.mo9949q(interfaceC0339a);
        }

        @Override // p161X.AbstractC2793w
        /* renamed from: r */
        public boolean mo9805r() {
            Window window = AbstractActivityC2791u.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p009B1.InterfaceC0034f
        /* renamed from: w */
        public C0032d mo97w() {
            return AbstractActivityC2791u.this.mo97w();
        }

        @Override // p161X.AbstractC2744A
        /* renamed from: x */
        public void mo9379x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC2791u.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // p161X.AbstractC2744A
        /* renamed from: z */
        public LayoutInflater mo9381z() {
            return AbstractActivityC2791u.this.getLayoutInflater().cloneInContext(AbstractActivityC2791u.this);
        }
    }

    public AbstractActivityC2791u() {
        m9929a0();
    }

    /* renamed from: g0 */
    public static boolean m9925g0(AbstractC2752I abstractC2752I, AbstractC3345j.b bVar) {
        boolean z6 = false;
        for (AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p : abstractC2752I.m9509u0()) {
            if (abstractComponentCallbacksC2786p != null) {
                if (abstractComponentCallbacksC2786p.m9814C() != null) {
                    z6 |= m9925g0(abstractComponentCallbacksC2786p.m9899s(), bVar);
                }
                C2764V c2764v = abstractComponentCallbacksC2786p.f8450c0;
                if (c2764v != null && c2764v.mo9642a().mo12928b().m12935f(AbstractC3345j.b.STARTED)) {
                    abstractComponentCallbacksC2786p.f8450c0.m9649i(bVar);
                    z6 = true;
                }
                if (abstractComponentCallbacksC2786p.f8448b0.mo12928b().m12935f(AbstractC3345j.b.STARTED)) {
                    abstractComponentCallbacksC2786p.f8448b0.m12946m(bVar);
                    z6 = true;
                }
            }
        }
        return z6;
    }

    /* renamed from: X */
    public final View m9926X(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f8505D.m9970n(view, str, context, attributeSet);
    }

    /* renamed from: Y */
    public AbstractC2752I m9927Y() {
        return this.f8505D.m9968l();
    }

    /* renamed from: Z */
    public AbstractC4099a m9928Z() {
        return AbstractC4099a.m17191b(this);
    }

    /* renamed from: a0 */
    public final void m9929a0() {
        mo97w().m88h("android:support:lifecycle", new C0032d.c() { // from class: X.q
            @Override // p009B1.C0032d.c
            /* renamed from: a */
            public final Bundle mo79a() {
                Bundle m9931b0;
                m9931b0 = AbstractActivityC2791u.this.m9931b0();
                return m9931b0;
            }
        });
        mo9948p(new InterfaceC0339a() { // from class: X.r
            @Override // p042G.InterfaceC0339a
            public final void accept(Object obj) {
                AbstractActivityC2791u.this.m9932c0((Configuration) obj);
            }
        });
        m14001L(new InterfaceC0339a() { // from class: X.s
            @Override // p042G.InterfaceC0339a
            public final void accept(Object obj) {
                AbstractActivityC2791u.this.m9933d0((Intent) obj);
            }
        });
        m14000K(new InterfaceC3563b() { // from class: X.t
            @Override // p199c.InterfaceC3563b
            /* renamed from: a */
            public final void mo9920a(Context context) {
                AbstractActivityC2791u.this.m9934e0(context);
            }
        });
    }

    /* renamed from: b0 */
    public final /* synthetic */ Bundle m9931b0() {
        m9935f0();
        this.f8506E.m12941h(AbstractC3345j.a.ON_STOP);
        return new Bundle();
    }

    /* renamed from: c0 */
    public final /* synthetic */ void m9932c0(Configuration configuration) {
        this.f8505D.m9969m();
    }

    /* renamed from: d0 */
    public final /* synthetic */ void m9933d0(Intent intent) {
        this.f8505D.m9969m();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (m27838r(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f8507F);
            printWriter.print(" mResumed=");
            printWriter.print(this.f8508G);
            printWriter.print(" mStopped=");
            printWriter.print(this.f8509H);
            if (getApplication() != null) {
                AbstractC4099a.m17191b(this).mo17192a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f8505D.m9968l().m9451W(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e0 */
    public final /* synthetic */ void m9934e0(Context context) {
        this.f8505D.m9958a(null);
    }

    /* renamed from: f0 */
    public void m9935f0() {
        while (m9925g0(m9927Y(), AbstractC3345j.b.CREATED)) {
        }
    }

    /* renamed from: i0 */
    public void m9937i0() {
        this.f8506E.m12941h(AbstractC3345j.a.ON_RESUME);
        this.f8505D.m9964h();
    }

    @Override // p191b.AbstractActivityC3486j, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        this.f8505D.m9969m();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // p191b.AbstractActivityC3486j, p365w.AbstractActivityC6789e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8506E.m12941h(AbstractC3345j.a.ON_CREATE);
        this.f8505D.m9961e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m9926X = m9926X(view, str, context, attributeSet);
        return m9926X == null ? super.onCreateView(view, str, context, attributeSet) : m9926X;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f8505D.m9962f();
        this.f8506E.m12941h(AbstractC3345j.a.ON_DESTROY);
    }

    @Override // p191b.AbstractActivityC3486j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return this.f8505D.m9960d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f8508G = false;
        this.f8505D.m9963g();
        this.f8506E.m12941h(AbstractC3345j.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m9937i0();
    }

    @Override // p191b.AbstractActivityC3486j, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f8505D.m9969m();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f8505D.m9969m();
        super.onResume();
        this.f8508G = true;
        this.f8505D.m9967k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f8505D.m9969m();
        super.onStart();
        this.f8509H = false;
        if (!this.f8507F) {
            this.f8507F = true;
            this.f8505D.m9959c();
        }
        this.f8505D.m9967k();
        this.f8506E.m12941h(AbstractC3345j.a.ON_START);
        this.f8505D.m9965i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f8505D.m9969m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f8509H = true;
        m9935f0();
        this.f8505D.m9966j();
        this.f8506E.m12941h(AbstractC3345j.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m9926X = m9926X(null, str, context, attributeSet);
        return m9926X == null ? super.onCreateView(str, context, attributeSet) : m9926X;
    }

    @Override // p365w.AbstractC6785a.b
    /* renamed from: b */
    public final void mo9930b(int i7) {
    }

    /* renamed from: h0 */
    public void m9936h0(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
    }
}

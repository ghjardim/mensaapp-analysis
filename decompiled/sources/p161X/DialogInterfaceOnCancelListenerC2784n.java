package p161X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.AbstractC3334Q;
import androidx.lifecycle.AbstractC3335S;
import androidx.lifecycle.InterfaceC3349n;
import androidx.lifecycle.InterfaceC3356u;
import p009B1.AbstractC0035g;
import p191b.DialogC3494r;

/* renamed from: X.n */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2784n extends AbstractComponentCallbacksC2786p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: l0 */
    public Handler f8396l0;

    /* renamed from: u0 */
    public boolean f8405u0;

    /* renamed from: w0 */
    public Dialog f8407w0;

    /* renamed from: x0 */
    public boolean f8408x0;

    /* renamed from: y0 */
    public boolean f8409y0;

    /* renamed from: z0 */
    public boolean f8410z0;

    /* renamed from: m0 */
    public Runnable f8397m0 = new a();

    /* renamed from: n0 */
    public DialogInterface.OnCancelListener f8398n0 = new b();

    /* renamed from: o0 */
    public DialogInterface.OnDismissListener f8399o0 = new c();

    /* renamed from: p0 */
    public int f8400p0 = 0;

    /* renamed from: q0 */
    public int f8401q0 = 0;

    /* renamed from: r0 */
    public boolean f8402r0 = true;

    /* renamed from: s0 */
    public boolean f8403s0 = true;

    /* renamed from: t0 */
    public int f8404t0 = -1;

    /* renamed from: v0 */
    public InterfaceC3356u f8406v0 = new d();

    /* renamed from: A0 */
    public boolean f8395A0 = false;

    /* renamed from: X.n$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC2784n.this.f8399o0.onDismiss(DialogInterfaceOnCancelListenerC2784n.this.f8407w0);
        }
    }

    /* renamed from: X.n$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2784n.this.f8407w0 != null) {
                DialogInterfaceOnCancelListenerC2784n dialogInterfaceOnCancelListenerC2784n = DialogInterfaceOnCancelListenerC2784n.this;
                dialogInterfaceOnCancelListenerC2784n.onCancel(dialogInterfaceOnCancelListenerC2784n.f8407w0);
            }
        }
    }

    /* renamed from: X.n$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2784n.this.f8407w0 != null) {
                DialogInterfaceOnCancelListenerC2784n dialogInterfaceOnCancelListenerC2784n = DialogInterfaceOnCancelListenerC2784n.this;
                dialogInterfaceOnCancelListenerC2784n.onDismiss(dialogInterfaceOnCancelListenerC2784n.f8407w0);
            }
        }
    }

    /* renamed from: X.n$d */
    public class d implements InterfaceC3356u {
        public d() {
        }

        @Override // androidx.lifecycle.InterfaceC3356u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo8344a(InterfaceC3349n interfaceC3349n) {
            if (interfaceC3349n == null || !DialogInterfaceOnCancelListenerC2784n.this.f8403s0) {
                return;
            }
            View m9895q1 = DialogInterfaceOnCancelListenerC2784n.this.m9895q1();
            if (m9895q1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC2784n.this.f8407w0 != null) {
                if (AbstractC2752I.m9397I0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC2784n.this.f8407w0);
                }
                DialogInterfaceOnCancelListenerC2784n.this.f8407w0.setContentView(m9895q1);
            }
        }
    }

    /* renamed from: X.n$e */
    public class e extends AbstractC2793w {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2793w f8415a;

        public e(AbstractC2793w abstractC2793w) {
            this.f8415a = abstractC2793w;
        }

        @Override // p161X.AbstractC2793w
        /* renamed from: m */
        public View mo9804m(int i7) {
            return this.f8415a.mo9805r() ? this.f8415a.mo9804m(i7) : DialogInterfaceOnCancelListenerC2784n.this.m9786J1(i7);
        }

        @Override // p161X.AbstractC2793w
        /* renamed from: r */
        public boolean mo9805r() {
            return this.f8415a.mo9805r() || DialogInterfaceOnCancelListenerC2784n.this.m9788K1();
        }
    }

    /* renamed from: G1 */
    public final void m9783G1(boolean z6, boolean z7, boolean z8) {
        if (this.f8409y0) {
            return;
        }
        this.f8409y0 = true;
        this.f8410z0 = false;
        Dialog dialog = this.f8407w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f8407w0.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.f8396l0.getLooper()) {
                    onDismiss(this.f8407w0);
                } else {
                    this.f8396l0.post(this.f8397m0);
                }
            }
        }
        this.f8408x0 = true;
        if (this.f8404t0 >= 0) {
            if (z8) {
                m9825H().m9463c1(this.f8404t0, 1);
            } else {
                m9825H().m9460a1(this.f8404t0, 1, z6);
            }
            this.f8404t0 = -1;
            return;
        }
        AbstractC2760Q m9487n = m9825H().m9487n();
        m9487n.m9622m(true);
        m9487n.mo9621l(this);
        if (z8) {
            m9487n.mo9617h();
        } else if (z6) {
            m9487n.mo9616g();
        } else {
            m9487n.mo9615f();
        }
    }

    /* renamed from: H1 */
    public int m9784H1() {
        return this.f8401q0;
    }

    /* renamed from: I1 */
    public Dialog mo9785I1(Bundle bundle) {
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC3494r(m9892p1(), m9784H1());
    }

    /* renamed from: J1 */
    public View m9786J1(int i7) {
        Dialog dialog = this.f8407w0;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: K0 */
    public void mo9787K0(Bundle bundle) {
        super.mo9787K0(bundle);
        Dialog dialog = this.f8407w0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f8400p0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f8401q0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z6 = this.f8402r0;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z7 = this.f8403s0;
        if (!z7) {
            bundle.putBoolean("android:showsDialog", z7);
        }
        int i9 = this.f8404t0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    /* renamed from: K1 */
    public boolean m9788K1() {
        return this.f8395A0;
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: L0 */
    public void mo9789L0() {
        super.mo9789L0();
        Dialog dialog = this.f8407w0;
        if (dialog != null) {
            this.f8408x0 = false;
            dialog.show();
            View decorView = this.f8407w0.getWindow().getDecorView();
            AbstractC3334Q.m12909a(decorView, this);
            AbstractC3335S.m12910a(decorView, this);
            AbstractC0035g.m98a(decorView, this);
        }
    }

    /* renamed from: L1 */
    public final void m9790L1(Bundle bundle) {
        if (this.f8403s0 && !this.f8395A0) {
            try {
                this.f8405u0 = true;
                Dialog mo9785I1 = mo9785I1(bundle);
                this.f8407w0 = mo9785I1;
                if (this.f8403s0) {
                    m9792N1(mo9785I1, this.f8400p0);
                    Context m9902t = m9902t();
                    if (m9902t instanceof Activity) {
                        this.f8407w0.setOwnerActivity((Activity) m9902t);
                    }
                    this.f8407w0.setCancelable(this.f8402r0);
                    this.f8407w0.setOnCancelListener(this.f8398n0);
                    this.f8407w0.setOnDismissListener(this.f8399o0);
                    this.f8395A0 = true;
                } else {
                    this.f8407w0 = null;
                }
                this.f8405u0 = false;
            } catch (Throwable th) {
                this.f8405u0 = false;
                throw th;
            }
        }
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: M0 */
    public void mo3133M0() {
        super.mo3133M0();
        Dialog dialog = this.f8407w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: M1 */
    public void m9791M1(boolean z6) {
        this.f8403s0 = z6;
    }

    /* renamed from: N1 */
    public void m9792N1(Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: O0 */
    public void mo9793O0(Bundle bundle) {
        Bundle bundle2;
        super.mo9793O0(bundle);
        if (this.f8407w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f8407w0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: O1 */
    public void mo9794O1(AbstractC2752I abstractC2752I, String str) {
        this.f8409y0 = false;
        this.f8410z0 = true;
        AbstractC2760Q m9487n = abstractC2752I.m9487n();
        m9487n.m9622m(true);
        m9487n.m9612c(this, str);
        m9487n.mo9615f();
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: V0 */
    public void mo9795V0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo9795V0(layoutInflater, viewGroup, bundle);
        if (this.f8435Q != null || this.f8407w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f8407w0.onRestoreInstanceState(bundle2);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: i */
    public AbstractC2793w mo9796i() {
        return new e(super.mo9796i());
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: i0 */
    public void mo9797i0(Bundle bundle) {
        super.mo9797i0(bundle);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: l0 */
    public void mo9798l0(Context context) {
        super.mo9798l0(context);
        m9849V().m12966i(this.f8406v0);
        if (this.f8410z0) {
            return;
        }
        this.f8409y0 = false;
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: o0 */
    public void mo9799o0(Bundle bundle) {
        super.mo9799o0(bundle);
        this.f8396l0 = new Handler();
        this.f8403s0 = this.f8425G == 0;
        if (bundle != null) {
            this.f8400p0 = bundle.getInt("android:style", 0);
            this.f8401q0 = bundle.getInt("android:theme", 0);
            this.f8402r0 = bundle.getBoolean("android:cancelable", true);
            this.f8403s0 = bundle.getBoolean("android:showsDialog", this.f8403s0);
            this.f8404t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8408x0) {
            return;
        }
        if (AbstractC2752I.m9397I0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m9783G1(true, true, false);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: v0 */
    public void mo9800v0() {
        super.mo9800v0();
        Dialog dialog = this.f8407w0;
        if (dialog != null) {
            this.f8408x0 = true;
            dialog.setOnDismissListener(null);
            this.f8407w0.dismiss();
            if (!this.f8409y0) {
                onDismiss(this.f8407w0);
            }
            this.f8407w0 = null;
            this.f8395A0 = false;
        }
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: w0 */
    public void mo9801w0() {
        super.mo9801w0();
        if (!this.f8410z0 && !this.f8409y0) {
            this.f8409y0 = true;
        }
        m9849V().mo12970m(this.f8406v0);
    }

    @Override // p161X.AbstractComponentCallbacksC2786p
    /* renamed from: x0 */
    public LayoutInflater mo9802x0(Bundle bundle) {
        LayoutInflater mo9802x0 = super.mo9802x0(bundle);
        if (this.f8403s0 && !this.f8405u0) {
            m9790L1(bundle);
            if (AbstractC2752I.m9397I0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f8407w0;
            return dialog != null ? mo9802x0.cloneInContext(dialog.getContext()) : mo9802x0;
        }
        if (AbstractC2752I.m9397I0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f8403s0) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return mo9802x0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}

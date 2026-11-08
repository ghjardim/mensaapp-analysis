package p191b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC3334Q;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.C3350o;
import androidx.lifecycle.InterfaceC3349n;
import kotlin.jvm.internal.AbstractC5469l;
import p009B1.AbstractC0035g;
import p009B1.C0032d;
import p009B1.C0033e;
import p009B1.InterfaceC0034f;

/* renamed from: b.r */
/* loaded from: classes.dex */
public class DialogC3494r extends Dialog implements InterfaceC3349n, InterfaceC3502z, InterfaceC0034f {

    /* renamed from: a */
    public C3350o f11719a;

    /* renamed from: b */
    public final C0033e f11720b;

    /* renamed from: c */
    public final C3500x f11721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3494r(Context context, int i7) {
        super(context, i7);
        AbstractC5469l.m23028e(context, "context");
        this.f11720b = C0033e.f156d.m96a(this);
        this.f11721c = new C3500x(new Runnable() { // from class: b.q
            @Override // java.lang.Runnable
            public final void run() {
                DialogC3494r.m14031e(DialogC3494r.this);
            }
        });
    }

    /* renamed from: e */
    public static final void m14031e(DialogC3494r this$0) {
        AbstractC5469l.m23028e(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.InterfaceC3349n
    /* renamed from: a */
    public AbstractC3345j mo9642a() {
        return m14032c();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC5469l.m23028e(view, "view");
        m14033d();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: c */
    public final C3350o m14032c() {
        C3350o c3350o = this.f11719a;
        if (c3350o != null) {
            return c3350o;
        }
        C3350o c3350o2 = new C3350o(this);
        this.f11719a = c3350o2;
        return c3350o2;
    }

    /* renamed from: d */
    public void m14033d() {
        Window window = getWindow();
        AbstractC5469l.m23025b(window);
        View decorView = window.getDecorView();
        AbstractC5469l.m23027d(decorView, "window!!.decorView");
        AbstractC3334Q.m12909a(decorView, this);
        Window window2 = getWindow();
        AbstractC5469l.m23025b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC5469l.m23027d(decorView2, "window!!.decorView");
        AbstractC3476C.m13976a(decorView2, this);
        Window window3 = getWindow();
        AbstractC5469l.m23025b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC5469l.m23027d(decorView3, "window!!.decorView");
        AbstractC0035g.m98a(decorView3, this);
    }

    @Override // p191b.InterfaceC3502z
    /* renamed from: h */
    public final C3500x mo9943h() {
        return this.f11721c;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f11721c.m14061k();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C3500x c3500x = this.f11721c;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC5469l.m23027d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c3500x.m14064n(onBackInvokedDispatcher);
        }
        this.f11720b.m94d(bundle);
        m14032c().m12941h(AbstractC3345j.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC5469l.m23027d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f11720b.m95e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m14032c().m12941h(AbstractC3345j.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m14032c().m12941h(AbstractC3345j.a.ON_DESTROY);
        this.f11719a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        m14033d();
        super.setContentView(i7);
    }

    @Override // p009B1.InterfaceC0034f
    /* renamed from: w */
    public C0032d mo97w() {
        return this.f11720b.m92b();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC5469l.m23028e(view, "view");
        m14033d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC5469l.m23028e(view, "view");
        m14033d();
        super.setContentView(view, layoutParams);
    }
}

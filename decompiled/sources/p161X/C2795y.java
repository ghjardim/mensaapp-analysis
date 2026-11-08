package p161X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import p042G.AbstractC0343e;

/* renamed from: X.y */
/* loaded from: classes.dex */
public class C2795y {

    /* renamed from: a */
    public final AbstractC2744A f8523a;

    public C2795y(AbstractC2744A abstractC2744A) {
        this.f8523a = abstractC2744A;
    }

    /* renamed from: b */
    public static C2795y m9957b(AbstractC2744A abstractC2744A) {
        return new C2795y((AbstractC2744A) AbstractC0343e.m1354d(abstractC2744A, "callbacks == null"));
    }

    /* renamed from: a */
    public void m9958a(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        AbstractC2752I m9377u = this.f8523a.m9377u();
        AbstractC2744A abstractC2744A = this.f8523a;
        m9377u.m9483l(abstractC2744A, abstractC2744A, abstractComponentCallbacksC2786p);
    }

    /* renamed from: c */
    public void m9959c() {
        this.f8523a.m9377u().m9516x();
    }

    /* renamed from: d */
    public boolean m9960d(MenuItem menuItem) {
        return this.f8523a.m9377u().m9409A(menuItem);
    }

    /* renamed from: e */
    public void m9961e() {
        this.f8523a.m9377u().m9411B();
    }

    /* renamed from: f */
    public void m9962f() {
        this.f8523a.m9377u().m9414D();
    }

    /* renamed from: g */
    public void m9963g() {
        this.f8523a.m9377u().m9431M();
    }

    /* renamed from: h */
    public void m9964h() {
        this.f8523a.m9377u().m9439Q();
    }

    /* renamed from: i */
    public void m9965i() {
        this.f8523a.m9377u().m9441R();
    }

    /* renamed from: j */
    public void m9966j() {
        this.f8523a.m9377u().m9445T();
    }

    /* renamed from: k */
    public boolean m9967k() {
        return this.f8523a.m9377u().m9459a0(true);
    }

    /* renamed from: l */
    public AbstractC2752I m9968l() {
        return this.f8523a.m9377u();
    }

    /* renamed from: m */
    public void m9969m() {
        this.f8523a.m9377u().m9454X0();
    }

    /* renamed from: n */
    public View m9970n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f8523a.m9377u().m9515w0().onCreateView(view, str, context, attributeSet);
    }
}

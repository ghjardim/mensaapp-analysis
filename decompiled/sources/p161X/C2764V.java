package p161X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC3323F;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.C3330M;
import androidx.lifecycle.C3332O;
import androidx.lifecycle.C3350o;
import androidx.lifecycle.InterfaceC3333P;
import androidx.lifecycle.InterfaceC3343h;
import p009B1.C0032d;
import p009B1.C0033e;
import p009B1.InterfaceC0034f;
import p192b0.AbstractC3503a;
import p192b0.C3504b;

/* renamed from: X.V */
/* loaded from: classes.dex */
public class C2764V implements InterfaceC3343h, InterfaceC0034f, InterfaceC3333P {

    /* renamed from: a */
    public final AbstractComponentCallbacksC2786p f8265a;

    /* renamed from: b */
    public final C3332O f8266b;

    /* renamed from: c */
    public final Runnable f8267c;

    /* renamed from: d */
    public C3350o f8268d = null;

    /* renamed from: e */
    public C0033e f8269e = null;

    public C2764V(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p, C3332O c3332o, Runnable runnable) {
        this.f8265a = abstractComponentCallbacksC2786p;
        this.f8266b = c3332o;
        this.f8267c = runnable;
    }

    @Override // androidx.lifecycle.InterfaceC3349n
    /* renamed from: a */
    public AbstractC3345j mo9642a() {
        m9644c();
        return this.f8268d;
    }

    /* renamed from: b */
    public void m9643b(AbstractC3345j.a aVar) {
        this.f8268d.m12941h(aVar);
    }

    /* renamed from: c */
    public void m9644c() {
        if (this.f8268d == null) {
            this.f8268d = new C3350o(this);
            C0033e m91a = C0033e.m91a(this);
            this.f8269e = m91a;
            m91a.m93c();
            this.f8267c.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC3343h
    /* renamed from: d */
    public AbstractC3503a mo9645d() {
        Application application;
        Context applicationContext = this.f8265a.m9892p1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C3504b c3504b = new C3504b();
        if (application != null) {
            c3504b.m14082c(C3330M.a.f10719g, application);
        }
        c3504b.m14082c(AbstractC3323F.f10697a, this.f8265a);
        c3504b.m14082c(AbstractC3323F.f10698b, this);
        if (this.f8265a.m9896r() != null) {
            c3504b.m14082c(AbstractC3323F.f10699c, this.f8265a.m9896r());
        }
        return c3504b;
    }

    /* renamed from: e */
    public boolean m9646e() {
        return this.f8268d != null;
    }

    /* renamed from: f */
    public void m9647f(Bundle bundle) {
        this.f8269e.m94d(bundle);
    }

    /* renamed from: g */
    public void m9648g(Bundle bundle) {
        this.f8269e.m95e(bundle);
    }

    /* renamed from: i */
    public void m9649i(AbstractC3345j.b bVar) {
        this.f8268d.m12946m(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC3333P
    /* renamed from: j */
    public C3332O mo9650j() {
        m9644c();
        return this.f8266b;
    }

    @Override // p009B1.InterfaceC0034f
    /* renamed from: w */
    public C0032d mo97w() {
        m9644c();
        return this.f8269e.m92b();
    }
}

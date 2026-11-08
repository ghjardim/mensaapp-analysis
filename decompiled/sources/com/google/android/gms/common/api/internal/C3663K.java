package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.C3734q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3698k;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p031E2.AbstractC0266b;
import p207d.AbstractC4094d;
import p334s.C6308a;
import p368w2.C6861b;
import p368w2.C6863d;
import p389z2.C7144e;

/* renamed from: com.google.android.gms.common.api.internal.K */
/* loaded from: classes.dex */
public final class C3663K implements AbstractC3648f.a, AbstractC3648f.b {

    /* renamed from: b */
    public final C3643a.f f12284b;

    /* renamed from: c */
    public final C3680b f12285c;

    /* renamed from: d */
    public final C3652A f12286d;

    /* renamed from: g */
    public final int f12289g;

    /* renamed from: h */
    public final BinderC3683c0 f12290h;

    /* renamed from: i */
    public boolean f12291i;

    /* renamed from: m */
    public final /* synthetic */ C3688f f12295m;

    /* renamed from: a */
    public final Queue f12283a = new LinkedList();

    /* renamed from: e */
    public final Set f12287e = new HashSet();

    /* renamed from: f */
    public final Map f12288f = new HashMap();

    /* renamed from: j */
    public final List f12292j = new ArrayList();

    /* renamed from: k */
    public C6861b f12293k = null;

    /* renamed from: l */
    public int f12294l = 0;

    public C3663K(C3688f c3688f, AbstractC3647e abstractC3647e) {
        this.f12295m = c3688f;
        C3643a.f zab = abstractC3647e.zab(c3688f.f12360u.getLooper(), this);
        this.f12284b = zab;
        this.f12285c = abstractC3647e.getApiKey();
        this.f12286d = new C3652A();
        this.f12289g = abstractC3647e.zaa();
        if (zab.requiresSignIn()) {
            this.f12290h = abstractC3647e.zac(c3688f.f12351e, c3688f.f12360u);
        } else {
            this.f12290h = null;
        }
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m14845B(C3663K c3663k, C3665M c3665m) {
        if (c3663k.f12292j.contains(c3665m) && !c3663k.f12291i) {
            if (c3663k.f12284b.isConnected()) {
                c3663k.m14871j();
            } else {
                c3663k.m14854E();
            }
        }
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m14846C(C3663K c3663k, C3665M c3665m) {
        C6863d c6863d;
        C6863d[] mo14899g;
        if (c3663k.f12292j.remove(c3665m)) {
            c3663k.f12295m.f12360u.removeMessages(15, c3665m);
            c3663k.f12295m.f12360u.removeMessages(16, c3665m);
            c6863d = c3665m.f12297b;
            ArrayList arrayList = new ArrayList(c3663k.f12283a.size());
            for (AbstractC3703m0 abstractC3703m0 : c3663k.f12283a) {
                if ((abstractC3703m0 instanceof AbstractC3672U) && (mo14899g = ((AbstractC3672U) abstractC3703m0).mo14899g(c3663k)) != null && AbstractC0266b.m1097b(mo14899g, c6863d)) {
                    arrayList.add(abstractC3703m0);
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC3703m0 abstractC3703m02 = (AbstractC3703m0) arrayList.get(i7);
                c3663k.f12283a.remove(abstractC3703m02);
                abstractC3703m02.mo14952b(new C3734q(c6863d));
            }
        }
    }

    /* renamed from: D */
    public final void m14853D() {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        this.f12293k = null;
    }

    /* renamed from: E */
    public final void m14854E() {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        if (this.f12284b.isConnected() || this.f12284b.isConnecting()) {
            return;
        }
        try {
            C3688f c3688f = this.f12295m;
            int m15030b = c3688f.f12353n.m15030b(c3688f.f12351e, this.f12284b);
            if (m15030b == 0) {
                C3688f c3688f2 = this.f12295m;
                C3643a.f fVar = this.f12284b;
                C3667O c3667o = new C3667O(c3688f2, fVar, this.f12285c);
                if (fVar.requiresSignIn()) {
                    ((BinderC3683c0) AbstractC3802r.m15129k(this.f12290h)).m14913a0(c3667o);
                }
                try {
                    this.f12284b.connect(c3667o);
                    return;
                } catch (SecurityException e7) {
                    m14857H(new C6861b(10), e7);
                    return;
                }
            }
            C6861b c6861b = new C6861b(m15030b, null);
            Log.w("GoogleApiManager", "The service for " + this.f12284b.getClass().getName() + " is not available: " + c6861b.toString());
            m14857H(c6861b, null);
        } catch (IllegalStateException e8) {
            m14857H(new C6861b(10), e8);
        }
    }

    /* renamed from: F */
    public final void m14855F(AbstractC3703m0 abstractC3703m0) {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        if (this.f12284b.isConnected()) {
            if (m14877p(abstractC3703m0)) {
                m14874m();
                return;
            } else {
                this.f12283a.add(abstractC3703m0);
                return;
            }
        }
        this.f12283a.add(abstractC3703m0);
        C6861b c6861b = this.f12293k;
        if (c6861b == null || !c6861b.m28240A0()) {
            m14854E();
        } else {
            m14857H(this.f12293k, null);
        }
    }

    /* renamed from: G */
    public final void m14856G() {
        this.f12294l++;
    }

    /* renamed from: H */
    public final void m14857H(C6861b c6861b, Exception exc) {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        BinderC3683c0 binderC3683c0 = this.f12290h;
        if (binderC3683c0 != null) {
            binderC3683c0.m14914b0();
        }
        m14853D();
        this.f12295m.f12353n.m15031c();
        m14868g(c6861b);
        if ((this.f12284b instanceof C7144e) && c6861b.m28242x0() != 24) {
            this.f12295m.f12348b = true;
            C3688f c3688f = this.f12295m;
            c3688f.f12360u.sendMessageDelayed(c3688f.f12360u.obtainMessage(19), 300000L);
        }
        if (c6861b.m28242x0() == 4) {
            m14869h(C3688f.f12344x);
            return;
        }
        if (this.f12283a.isEmpty()) {
            this.f12293k = c6861b;
            return;
        }
        if (exc != null) {
            AbstractC3802r.m15122d(this.f12295m.f12360u);
            m14870i(null, exc, false);
            return;
        }
        if (!this.f12295m.f12361v) {
            m14869h(C3688f.m14921g(this.f12285c, c6861b));
            return;
        }
        m14870i(C3688f.m14921g(this.f12285c, c6861b), null, true);
        if (this.f12283a.isEmpty() || m14878q(c6861b) || this.f12295m.m14942f(c6861b, this.f12289g)) {
            return;
        }
        if (c6861b.m28242x0() == 18) {
            this.f12291i = true;
        }
        if (!this.f12291i) {
            m14869h(C3688f.m14921g(this.f12285c, c6861b));
            return;
        }
        C3688f c3688f2 = this.f12295m;
        c3688f2.f12360u.sendMessageDelayed(Message.obtain(c3688f2.f12360u, 9, this.f12285c), 5000L);
    }

    /* renamed from: I */
    public final void m14858I(C6861b c6861b) {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        C3643a.f fVar = this.f12284b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c6861b));
        m14857H(c6861b, null);
    }

    /* renamed from: J */
    public final void m14859J() {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        if (this.f12291i) {
            m14854E();
        }
    }

    /* renamed from: K */
    public final void m14860K() {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        m14869h(C3688f.f12343w);
        this.f12286d.m14829f();
        for (C3698k.a aVar : (C3698k.a[]) this.f12288f.keySet().toArray(new C3698k.a[0])) {
            m14855F(new C3701l0(aVar, new TaskCompletionSource()));
        }
        m14868g(new C6861b(4));
        if (this.f12284b.isConnected()) {
            this.f12284b.onUserSignOut(new C3662J(this));
        }
    }

    /* renamed from: L */
    public final void m14861L() {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        if (this.f12291i) {
            m14876o();
            C3688f c3688f = this.f12295m;
            m14869h(c3688f.f12352f.mo28257g(c3688f.f12351e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f12284b.disconnect("Timing out connection while resuming.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3704n
    /* renamed from: a */
    public final void mo14862a(C6861b c6861b) {
        m14857H(c6861b, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3686e
    /* renamed from: b */
    public final void mo14863b(int i7) {
        if (Looper.myLooper() == this.f12295m.f12360u.getLooper()) {
            m14873l(i7);
        } else {
            this.f12295m.f12360u.post(new RunnableC3660H(this, i7));
        }
    }

    /* renamed from: c */
    public final boolean m14864c() {
        return this.f12284b.requiresSignIn();
    }

    /* renamed from: d */
    public final boolean m14865d() {
        return m14879r(true);
    }

    /* renamed from: e */
    public final C6863d m14866e(C6863d[] c6863dArr) {
        if (c6863dArr != null && c6863dArr.length != 0) {
            C6863d[] availableFeatures = this.f12284b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C6863d[0];
            }
            C6308a c6308a = new C6308a(availableFeatures.length);
            for (C6863d c6863d : availableFeatures) {
                c6308a.put(c6863d.m28246x0(), Long.valueOf(c6863d.m28247y0()));
            }
            for (C6863d c6863d2 : c6863dArr) {
                Long l7 = (Long) c6308a.get(c6863d2.m28246x0());
                if (l7 == null || l7.longValue() < c6863d2.m28247y0()) {
                    return c6863d2;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3686e
    /* renamed from: f */
    public final void mo14867f(Bundle bundle) {
        if (Looper.myLooper() == this.f12295m.f12360u.getLooper()) {
            m14872k();
        } else {
            this.f12295m.f12360u.post(new RunnableC3659G(this));
        }
    }

    /* renamed from: g */
    public final void m14868g(C6861b c6861b) {
        Iterator it = this.f12287e.iterator();
        if (!it.hasNext()) {
            this.f12287e.clear();
            return;
        }
        AbstractC4094d.m17162a(it.next());
        if (AbstractC3798p.m15099b(c6861b, C6861b.f24674e)) {
            this.f12284b.getEndpointPackageName();
        }
        throw null;
    }

    /* renamed from: h */
    public final void m14869h(Status status) {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        m14870i(status, null, false);
    }

    /* renamed from: i */
    public final void m14870i(Status status, Exception exc, boolean z6) {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f12283a.iterator();
        while (it.hasNext()) {
            AbstractC3703m0 abstractC3703m0 = (AbstractC3703m0) it.next();
            if (!z6 || abstractC3703m0.f12382a == 2) {
                if (status != null) {
                    abstractC3703m0.mo14951a(status);
                } else {
                    abstractC3703m0.mo14952b(exc);
                }
                it.remove();
            }
        }
    }

    /* renamed from: j */
    public final void m14871j() {
        ArrayList arrayList = new ArrayList(this.f12283a);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC3703m0 abstractC3703m0 = (AbstractC3703m0) arrayList.get(i7);
            if (!this.f12284b.isConnected()) {
                return;
            }
            if (m14877p(abstractC3703m0)) {
                this.f12283a.remove(abstractC3703m0);
            }
        }
    }

    /* renamed from: k */
    public final void m14872k() {
        m14853D();
        m14868g(C6861b.f24674e);
        m14876o();
        Iterator it = this.f12288f.values().iterator();
        if (it.hasNext()) {
            ((AbstractC3676Y) it.next()).getClass();
            throw null;
        }
        m14871j();
        m14874m();
    }

    /* renamed from: l */
    public final void m14873l(int i7) {
        m14853D();
        this.f12291i = true;
        this.f12286d.m14828e(i7, this.f12284b.getLastDisconnectMessage());
        C3680b c3680b = this.f12285c;
        C3688f c3688f = this.f12295m;
        c3688f.f12360u.sendMessageDelayed(Message.obtain(c3688f.f12360u, 9, c3680b), 5000L);
        C3680b c3680b2 = this.f12285c;
        C3688f c3688f2 = this.f12295m;
        c3688f2.f12360u.sendMessageDelayed(Message.obtain(c3688f2.f12360u, 11, c3680b2), 120000L);
        this.f12295m.f12353n.m15031c();
        Iterator it = this.f12288f.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3676Y) it.next()).f12321a.run();
        }
    }

    /* renamed from: m */
    public final void m14874m() {
        this.f12295m.f12360u.removeMessages(12, this.f12285c);
        C3680b c3680b = this.f12285c;
        C3688f c3688f = this.f12295m;
        c3688f.f12360u.sendMessageDelayed(c3688f.f12360u.obtainMessage(12, c3680b), this.f12295m.f12347a);
    }

    /* renamed from: n */
    public final void m14875n(AbstractC3703m0 abstractC3703m0) {
        abstractC3703m0.mo14973d(this.f12286d, m14864c());
        try {
            abstractC3703m0.mo14953c(this);
        } catch (DeadObjectException unused) {
            mo14863b(1);
            this.f12284b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: o */
    public final void m14876o() {
        if (this.f12291i) {
            C3688f c3688f = this.f12295m;
            c3688f.f12360u.removeMessages(11, this.f12285c);
            C3688f c3688f2 = this.f12295m;
            c3688f2.f12360u.removeMessages(9, this.f12285c);
            this.f12291i = false;
        }
    }

    /* renamed from: p */
    public final boolean m14877p(AbstractC3703m0 abstractC3703m0) {
        if (!(abstractC3703m0 instanceof AbstractC3672U)) {
            m14875n(abstractC3703m0);
            return true;
        }
        AbstractC3672U abstractC3672U = (AbstractC3672U) abstractC3703m0;
        C6863d m14866e = m14866e(abstractC3672U.mo14899g(this));
        if (m14866e == null) {
            m14875n(abstractC3703m0);
            return true;
        }
        Log.w("GoogleApiManager", this.f12284b.getClass().getName() + " could not execute call because it requires feature (" + m14866e.m28246x0() + ", " + m14866e.m28247y0() + ").");
        if (!this.f12295m.f12361v || !abstractC3672U.mo14898f(this)) {
            abstractC3672U.mo14952b(new C3734q(m14866e));
            return true;
        }
        C3665M c3665m = new C3665M(this.f12285c, m14866e, null);
        int indexOf = this.f12292j.indexOf(c3665m);
        if (indexOf >= 0) {
            C3665M c3665m2 = (C3665M) this.f12292j.get(indexOf);
            this.f12295m.f12360u.removeMessages(15, c3665m2);
            C3688f c3688f = this.f12295m;
            c3688f.f12360u.sendMessageDelayed(Message.obtain(c3688f.f12360u, 15, c3665m2), 5000L);
            return false;
        }
        this.f12292j.add(c3665m);
        C3688f c3688f2 = this.f12295m;
        c3688f2.f12360u.sendMessageDelayed(Message.obtain(c3688f2.f12360u, 15, c3665m), 5000L);
        C3688f c3688f3 = this.f12295m;
        c3688f3.f12360u.sendMessageDelayed(Message.obtain(c3688f3.f12360u, 16, c3665m), 120000L);
        C6861b c6861b = new C6861b(2, null);
        if (m14878q(c6861b)) {
            return false;
        }
        this.f12295m.m14942f(c6861b, this.f12289g);
        return false;
    }

    /* renamed from: q */
    public final boolean m14878q(C6861b c6861b) {
        synchronized (C3688f.f12345y) {
            try {
                C3688f c3688f = this.f12295m;
                if (c3688f.f12357r == null || !c3688f.f12358s.contains(this.f12285c)) {
                    return false;
                }
                this.f12295m.f12357r.m14983h(c6861b, this.f12289g);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: r */
    public final boolean m14879r(boolean z6) {
        AbstractC3802r.m15122d(this.f12295m.f12360u);
        if (!this.f12284b.isConnected() || !this.f12288f.isEmpty()) {
            return false;
        }
        if (!this.f12286d.m14830g()) {
            this.f12284b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z6) {
            return false;
        }
        m14874m();
        return false;
    }

    /* renamed from: s */
    public final int m14880s() {
        return this.f12289g;
    }

    /* renamed from: t */
    public final int m14881t() {
        return this.f12294l;
    }

    /* renamed from: v */
    public final C3643a.f m14882v() {
        return this.f12284b;
    }

    /* renamed from: x */
    public final Map m14883x() {
        return this.f12288f;
    }
}

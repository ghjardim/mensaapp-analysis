package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.AbstractC3731n;
import com.google.android.gms.common.api.AbstractC3733p;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.InterfaceC3730m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.lang.ref.WeakReference;
import p207d.AbstractC4094d;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: classes.dex */
public final class C3693h0 extends AbstractC3733p implements InterfaceC3730m {

    /* renamed from: e */
    public final WeakReference f12369e;

    /* renamed from: f */
    public final HandlerC3689f0 f12370f;

    /* renamed from: a */
    public C3693h0 f12365a = null;

    /* renamed from: b */
    public AbstractC3650h f12366b = null;

    /* renamed from: c */
    public final Object f12367c = new Object();

    /* renamed from: d */
    public Status f12368d = null;

    /* renamed from: g */
    public boolean f12371g = false;

    public C3693h0(WeakReference weakReference) {
        AbstractC3802r.m15130l(weakReference, "GoogleApiClient reference must not be null");
        this.f12369e = weakReference;
        AbstractC3648f abstractC3648f = (AbstractC3648f) weakReference.get();
        this.f12370f = new HandlerC3689f0(this, abstractC3648f != null ? abstractC3648f.mo14817d() : Looper.getMainLooper());
    }

    /* renamed from: k */
    public static final void m14962k(InterfaceC3729l interfaceC3729l) {
    }

    @Override // com.google.android.gms.common.api.InterfaceC3730m
    /* renamed from: a */
    public final void mo14963a(InterfaceC3729l interfaceC3729l) {
        synchronized (this.f12367c) {
            try {
                if (!interfaceC3729l.getStatus().m14799D0()) {
                    m14966g(interfaceC3729l.getStatus());
                    m14962k(interfaceC3729l);
                } else if (m14969j()) {
                    AbstractC4094d.m17162a(AbstractC3802r.m15129k(null));
                    throw null;
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final AbstractC3733p m14964b(AbstractC3731n abstractC3731n) {
        C3693h0 c3693h0;
        synchronized (this.f12367c) {
            AbstractC3802r.m15133o(true, "Cannot call then() twice.");
            AbstractC3802r.m15133o(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            c3693h0 = new C3693h0(this.f12369e);
            this.f12365a = c3693h0;
            m14967h();
        }
        return c3693h0;
    }

    /* renamed from: f */
    public final void m14965f(AbstractC3650h abstractC3650h) {
        synchronized (this.f12367c) {
            this.f12366b = abstractC3650h;
            m14967h();
        }
    }

    /* renamed from: g */
    public final void m14966g(Status status) {
        synchronized (this.f12367c) {
            this.f12368d = status;
            m14968i(status);
        }
    }

    /* renamed from: h */
    public final void m14967h() {
    }

    /* renamed from: i */
    public final void m14968i(Status status) {
        synchronized (this.f12367c) {
            try {
                if (m14969j()) {
                    AbstractC4094d.m17162a(AbstractC3802r.m15129k(null));
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final boolean m14969j() {
        return false;
    }
}

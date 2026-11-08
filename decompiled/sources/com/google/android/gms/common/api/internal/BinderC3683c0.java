package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.C3760S;
import com.google.android.gms.common.internal.C3774d;
import java.util.Set;
import p136T2.AbstractC2443d;
import p136T2.InterfaceC2444e;
import p143U2.AbstractBinderC2518d;
import p143U2.C2526l;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes.dex */
public final class BinderC3683c0 extends AbstractBinderC2518d implements AbstractC3648f.a, AbstractC3648f.b {

    /* renamed from: h */
    public static final C3643a.a f12334h = AbstractC2443d.f7233c;

    /* renamed from: a */
    public final Context f12335a;

    /* renamed from: b */
    public final Handler f12336b;

    /* renamed from: c */
    public final C3643a.a f12337c;

    /* renamed from: d */
    public final Set f12338d;

    /* renamed from: e */
    public final C3774d f12339e;

    /* renamed from: f */
    public InterfaceC2444e f12340f;

    /* renamed from: g */
    public InterfaceC3681b0 f12341g;

    public BinderC3683c0(Context context, Handler handler, C3774d c3774d) {
        C3643a.a aVar = f12334h;
        this.f12335a = context;
        this.f12336b = handler;
        this.f12339e = (C3774d) AbstractC3802r.m15130l(c3774d, "ClientSettings must not be null");
        this.f12338d = c3774d.m15055g();
        this.f12337c = aVar;
    }

    /* renamed from: Z */
    public static /* bridge */ /* synthetic */ void m14912Z(BinderC3683c0 binderC3683c0, C2526l c2526l) {
        C6861b m8473x0 = c2526l.m8473x0();
        if (m8473x0.m28241B0()) {
            C3760S c3760s = (C3760S) AbstractC3802r.m15129k(c2526l.m8474y0());
            C6861b m15033x0 = c3760s.m15033x0();
            if (!m15033x0.m28241B0()) {
                String valueOf = String.valueOf(m15033x0);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                binderC3683c0.f12341g.mo14892c(m15033x0);
                binderC3683c0.f12340f.disconnect();
                return;
            }
            binderC3683c0.f12341g.mo14891b(c3760s.m15034y0(), binderC3683c0.f12338d);
        } else {
            binderC3683c0.f12341g.mo14892c(m8473x0);
        }
        binderC3683c0.f12340f.disconnect();
    }

    @Override // p143U2.InterfaceC2520f
    /* renamed from: H */
    public final void mo8471H(C2526l c2526l) {
        this.f12336b.post(new RunnableC3679a0(this, c2526l));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3704n
    /* renamed from: a */
    public final void mo14862a(C6861b c6861b) {
        this.f12341g.mo14892c(c6861b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T2.e, com.google.android.gms.common.api.a$f] */
    /* renamed from: a0 */
    public final void m14913a0(InterfaceC3681b0 interfaceC3681b0) {
        InterfaceC2444e interfaceC2444e = this.f12340f;
        if (interfaceC2444e != null) {
            interfaceC2444e.disconnect();
        }
        this.f12339e.m15059k(Integer.valueOf(System.identityHashCode(this)));
        C3643a.a aVar = this.f12337c;
        Context context = this.f12335a;
        Handler handler = this.f12336b;
        C3774d c3774d = this.f12339e;
        this.f12340f = aVar.buildClient(context, handler.getLooper(), c3774d, (Object) c3774d.m15056h(), (AbstractC3648f.a) this, (AbstractC3648f.b) this);
        this.f12341g = interfaceC3681b0;
        Set set = this.f12338d;
        if (set == null || set.isEmpty()) {
            this.f12336b.post(new RunnableC3677Z(this));
        } else {
            this.f12340f.mo8311b();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3686e
    /* renamed from: b */
    public final void mo14863b(int i7) {
        this.f12341g.mo14893d(i7);
    }

    /* renamed from: b0 */
    public final void m14914b0() {
        InterfaceC2444e interfaceC2444e = this.f12340f;
        if (interfaceC2444e != null) {
            interfaceC2444e.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3686e
    /* renamed from: f */
    public final void mo14867f(Bundle bundle) {
        this.f12340f.mo8310a(this);
    }
}

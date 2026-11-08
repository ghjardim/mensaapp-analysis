package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import p366w0.AbstractC6820f;
import p368w2.C6861b;
import p368w2.C6869j;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC3711q0 extends AbstractC3694i implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public volatile boolean f12390a;

    /* renamed from: b */
    public final AtomicReference f12391b;

    /* renamed from: c */
    public final Handler f12392c;

    /* renamed from: d */
    public final C6869j f12393d;

    public AbstractDialogInterfaceOnCancelListenerC3711q0(InterfaceC3696j interfaceC3696j, C6869j c6869j) {
        super(interfaceC3696j);
        this.f12391b = new AtomicReference(null);
        this.f12392c = new zau(Looper.getMainLooper());
        this.f12393d = c6869j;
    }

    /* renamed from: e */
    public static final int m14978e(C3705n0 c3705n0) {
        if (c3705n0 == null) {
            return -1;
        }
        return c3705n0.m14976a();
    }

    /* renamed from: a */
    public final void m14981a(C6861b c6861b, int i7) {
        this.f12391b.set(null);
        mo14833b(c6861b, i7);
    }

    /* renamed from: b */
    public abstract void mo14833b(C6861b c6861b, int i7);

    /* renamed from: c */
    public abstract void mo14834c();

    /* renamed from: d */
    public final void m14982d() {
        this.f12391b.set(null);
        mo14834c();
    }

    /* renamed from: h */
    public final void m14983h(C6861b c6861b, int i7) {
        AtomicReference atomicReference;
        C3705n0 c3705n0 = new C3705n0(c6861b, i7);
        do {
            atomicReference = this.f12391b;
            if (AbstractC6820f.m28054a(atomicReference, null, c3705n0)) {
                this.f12392c.post(new RunnableC3709p0(this, c3705n0));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3694i
    public final void onActivityResult(int i7, int i8, Intent intent) {
        C3705n0 c3705n0 = (C3705n0) this.f12391b.get();
        if (i7 != 1) {
            if (i7 == 2) {
                int mo28257g = this.f12393d.mo28257g(getActivity());
                if (mo28257g == 0) {
                    m14982d();
                    return;
                } else {
                    if (c3705n0 == null) {
                        return;
                    }
                    if (c3705n0.m14977b().m28242x0() == 18 && mo28257g == 18) {
                        return;
                    }
                }
            }
        } else if (i8 == -1) {
            m14982d();
            return;
        } else if (i8 == 0) {
            if (c3705n0 != null) {
                m14981a(new C6861b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c3705n0.m14977b().toString()), m14978e(c3705n0));
                return;
            }
            return;
        }
        if (c3705n0 != null) {
            m14981a(c3705n0.m14977b(), c3705n0.m14976a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m14981a(new C6861b(13, null), m14978e((C3705n0) this.f12391b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3694i
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12391b.set(bundle.getBoolean("resolving_error", false) ? new C3705n0(new C6861b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3694i
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C3705n0 c3705n0 = (C3705n0) this.f12391b.get();
        if (c3705n0 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c3705n0.m14976a());
        bundle.putInt("failed_status", c3705n0.m14977b().m28242x0());
        bundle.putParcelable("failed_resolution", c3705n0.m14977b().m28244z0());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3694i
    public void onStart() {
        super.onStart();
        this.f12390a = true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3694i
    public void onStop() {
        super.onStop();
        this.f12390a = false;
    }
}

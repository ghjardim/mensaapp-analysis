package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractC3802r;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
/* loaded from: classes.dex */
public final class RunnableC3709p0 implements Runnable {

    /* renamed from: a */
    public final C3705n0 f12388a;

    /* renamed from: b */
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC3711q0 f12389b;

    public RunnableC3709p0(AbstractDialogInterfaceOnCancelListenerC3711q0 abstractDialogInterfaceOnCancelListenerC3711q0, C3705n0 c3705n0) {
        this.f12389b = abstractDialogInterfaceOnCancelListenerC3711q0;
        this.f12388a = c3705n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12389b.f12390a) {
            C6861b m14977b = this.f12388a.m14977b();
            if (m14977b.m28240A0()) {
                AbstractDialogInterfaceOnCancelListenerC3711q0 abstractDialogInterfaceOnCancelListenerC3711q0 = this.f12389b;
                abstractDialogInterfaceOnCancelListenerC3711q0.mLifecycleFragment.startActivityForResult(GoogleApiActivity.m14793a(abstractDialogInterfaceOnCancelListenerC3711q0.getActivity(), (PendingIntent) AbstractC3802r.m15129k(m14977b.m28244z0()), this.f12388a.m14976a(), false), 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC3711q0 abstractDialogInterfaceOnCancelListenerC3711q02 = this.f12389b;
            if (abstractDialogInterfaceOnCancelListenerC3711q02.f12393d.mo28254b(abstractDialogInterfaceOnCancelListenerC3711q02.getActivity(), m14977b.m28242x0(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC3711q0 abstractDialogInterfaceOnCancelListenerC3711q03 = this.f12389b;
                abstractDialogInterfaceOnCancelListenerC3711q03.f12393d.m28270w(abstractDialogInterfaceOnCancelListenerC3711q03.getActivity(), abstractDialogInterfaceOnCancelListenerC3711q03.mLifecycleFragment, m14977b.m28242x0(), 2, this.f12389b);
                return;
            }
            if (m14977b.m28242x0() != 18) {
                this.f12389b.m14981a(m14977b, this.f12388a.m14976a());
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC3711q0 abstractDialogInterfaceOnCancelListenerC3711q04 = this.f12389b;
            Dialog m28265r = abstractDialogInterfaceOnCancelListenerC3711q04.f12393d.m28265r(abstractDialogInterfaceOnCancelListenerC3711q04.getActivity(), abstractDialogInterfaceOnCancelListenerC3711q04);
            AbstractDialogInterfaceOnCancelListenerC3711q0 abstractDialogInterfaceOnCancelListenerC3711q05 = this.f12389b;
            abstractDialogInterfaceOnCancelListenerC3711q05.f12393d.m28266s(abstractDialogInterfaceOnCancelListenerC3711q05.getActivity().getApplicationContext(), new C3707o0(this, m28265r));
        }
    }
}

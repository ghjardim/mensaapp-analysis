package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC3696j;

/* renamed from: com.google.android.gms.common.internal.E */
/* loaded from: classes.dex */
public final class C3747E extends AbstractDialogInterfaceOnClickListenerC3748F {

    /* renamed from: a */
    public final /* synthetic */ Intent f12437a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC3696j f12438b;

    public C3747E(Intent intent, InterfaceC3696j interfaceC3696j, int i7) {
        this.f12437a = intent;
        this.f12438b = interfaceC3696j;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC3748F
    /* renamed from: a */
    public final void mo15026a() {
        Intent intent = this.f12437a;
        if (intent != null) {
            this.f12438b.startActivityForResult(intent, 2);
        }
    }
}

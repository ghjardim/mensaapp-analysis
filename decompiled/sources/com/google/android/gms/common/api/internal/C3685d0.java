package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.tasks.TaskCompletionSource;
import p368w2.C6863d;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
/* loaded from: classes.dex */
public final class C3685d0 extends AbstractC3720v {

    /* renamed from: d */
    public final /* synthetic */ AbstractC3720v.a f12342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3685d0(AbstractC3720v.a aVar, C6863d[] c6863dArr, boolean z6, int i7) {
        super(c6863dArr, z6, i7);
        this.f12342d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3720v
    /* renamed from: b */
    public final void mo14916b(C3643a.b bVar, TaskCompletionSource taskCompletionSource) {
        InterfaceC3712r interfaceC3712r;
        interfaceC3712r = this.f12342d.f12402a;
        interfaceC3712r.accept(bVar, taskCompletionSource);
    }
}

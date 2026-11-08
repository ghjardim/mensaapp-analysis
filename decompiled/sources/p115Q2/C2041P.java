package p115Q2;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.InterfaceC3686e;
import com.google.android.gms.common.api.internal.InterfaceC3704n;
import com.google.android.gms.common.internal.C3774d;
import com.google.android.gms.internal.pay.zzaa;

/* renamed from: Q2.P */
/* loaded from: classes.dex */
public final class C2041P extends C3643a.a {
    @Override // com.google.android.gms.common.api.C3643a.a
    public final /* synthetic */ C3643a.f buildClient(Context context, Looper looper, C3774d c3774d, Object obj, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
        return new zzaa(context, looper, c3774d, interfaceC3686e, interfaceC3704n);
    }
}

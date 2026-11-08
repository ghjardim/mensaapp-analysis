package p073K2;

import android.app.Activity;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.C3678a;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.common.api.internal.InterfaceC3716t;
import com.google.android.gms.internal.fido.zzo;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p080L2.C0982u;

/* renamed from: K2.a */
/* loaded from: classes.dex */
public class C0823a extends AbstractC3647e {

    /* renamed from: a */
    public static final C3643a.g f2850a;

    /* renamed from: b */
    public static final C3643a f2851b;

    static {
        C3643a.g gVar = new C3643a.g();
        f2850a = gVar;
        f2851b = new C3643a("Fido.FIDO2_API", new zzo(), gVar);
    }

    public C0823a(Activity activity) {
        super(activity, f2851b, (C3643a.d) C3643a.d.f12262l, (InterfaceC3716t) new C3678a());
    }

    /* renamed from: d */
    public Task m3443d(final C0982u c0982u) {
        return doRead(AbstractC3720v.m14985a().m14991b(new InterfaceC3712r() { // from class: K2.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                C0823a c0823a = C0823a.this;
                C0982u c0982u2 = c0982u;
                ((zzs) ((zzp) obj).getService()).zzc(new BinderC0825c(c0823a, (TaskCompletionSource) obj2), c0982u2);
            }
        }).m14994e(5407).m14990a());
    }
}

package p389z2;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.InterfaceC3712r;
import com.google.android.gms.common.internal.C3810v;
import com.google.android.gms.common.internal.C3816y;
import com.google.android.gms.common.internal.InterfaceC3814x;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: z2.d */
/* loaded from: classes.dex */
public final class C7143d extends AbstractC3647e implements InterfaceC3814x {

    /* renamed from: a */
    public static final C3643a.g f25380a;

    /* renamed from: b */
    public static final C3643a.a f25381b;

    /* renamed from: c */
    public static final C3643a f25382c;

    static {
        C3643a.g gVar = new C3643a.g();
        f25380a = gVar;
        C7142c c7142c = new C7142c();
        f25381b = c7142c;
        f25382c = new C3643a("ClientTelemetry.API", c7142c, gVar);
    }

    public C7143d(Context context, C3816y c3816y) {
        super(context, f25382c, c3816y, AbstractC3647e.a.f12263c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3814x
    /* renamed from: a */
    public final Task mo15157a(final C3810v c3810v) {
        AbstractC3720v.a m14985a = AbstractC3720v.m14985a();
        m14985a.m14993d(zaf.zaa);
        m14985a.m14992c(false);
        m14985a.m14991b(new InterfaceC3712r() { // from class: z2.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC3712r
            public final void accept(Object obj, Object obj2) {
                C3643a.g gVar = C7143d.f25380a;
                ((C7140a) ((C7144e) obj).getService()).m29440a(C3810v.this);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(m14985a.m14990a());
    }
}

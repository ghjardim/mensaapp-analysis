package p108P2;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC3812w;
import com.google.android.gms.common.internal.C3796o;
import com.google.android.gms.common.internal.C3810v;
import com.google.android.gms.common.internal.C3816y;
import com.google.android.gms.common.internal.InterfaceC3814x;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: P2.J2 */
/* loaded from: classes.dex */
public final class C1522J2 {

    /* renamed from: d */
    public static C1522J2 f4762d;

    /* renamed from: a */
    public final C1460C3 f4763a;

    /* renamed from: b */
    public final InterfaceC3814x f4764b;

    /* renamed from: c */
    public final AtomicLong f4765c = new AtomicLong(-1);

    public C1522J2(Context context, C1460C3 c1460c3) {
        this.f4764b = AbstractC3812w.m15153b(context, C3816y.m15158a().m15161b("measurement:api").m15160a());
        this.f4763a = c1460c3;
    }

    /* renamed from: a */
    public static C1522J2 m5864a(C1460C3 c1460c3) {
        if (f4762d == null) {
            f4762d = new C1522J2(c1460c3.mo5625c(), c1460c3);
        }
        return f4762d;
    }

    /* renamed from: c */
    public final synchronized void m5866c(int i7, int i8, long j7, long j8, int i9) {
        final long mo1111b = this.f4763a.mo5626d().mo1111b();
        AtomicLong atomicLong = this.f4765c;
        if (atomicLong.get() != -1 && mo1111b - atomicLong.get() <= 1800000) {
            return;
        }
        this.f4764b.mo15157a(new C3810v(0, Arrays.asList(new C3796o(36301, i8, 0, j7, j8, null, null, 0, i9)))).addOnFailureListener(new OnFailureListener() { // from class: P2.H2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C1522J2.this.f4765c.set(mo1111b);
            }
        });
    }
}

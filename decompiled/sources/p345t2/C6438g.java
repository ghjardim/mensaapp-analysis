package p345t2;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.internal.InterfaceC3714s;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p216e0.AbstractC4149a;

/* renamed from: t2.g */
/* loaded from: classes.dex */
public final class C6438g extends AbstractC4149a implements InterfaceC3714s {

    /* renamed from: o */
    public final Semaphore f23345o;

    /* renamed from: p */
    public final Set f23346p;

    public C6438g(Context context, Set set) {
        super(context);
        this.f23345o = new Semaphore(0);
        this.f23346p = set;
    }

    @Override // p216e0.AbstractC4149a
    /* renamed from: C */
    public final /* bridge */ /* synthetic */ Object mo17416C() {
        Iterator it = this.f23346p.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (((AbstractC3648f) it.next()).m14818e(this)) {
                i7++;
            }
        }
        try {
            this.f23345o.tryAcquire(i7, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p216e0.AbstractC4150b
    /* renamed from: p */
    public final void mo17440p() {
        this.f23345o.drainPermits();
        m17434h();
    }
}

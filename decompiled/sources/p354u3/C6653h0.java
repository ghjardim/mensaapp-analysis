package p354u3;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3682c;
import com.google.android.gms.internal.p395firebaseauthapi.zzagw;
import p219e3.C4176f;

/* renamed from: u3.h0 */
/* loaded from: classes.dex */
public final class C6653h0 {

    /* renamed from: a */
    public volatile int f24028a;

    /* renamed from: b */
    public final C6676t f24029b;

    /* renamed from: c */
    public volatile boolean f24030c;

    public C6653h0(C4176f c4176f) {
        this(c4176f.m17532m(), new C6676t(c4176f));
    }

    /* renamed from: b */
    public final void m27544b() {
        this.f24029b.m27588b();
    }

    /* renamed from: c */
    public final void m27545c(int i7) {
        if (i7 > 0 && this.f24028a == 0) {
            this.f24028a = i7;
            if (m27547f()) {
                this.f24029b.m27589c();
            }
        } else if (i7 == 0 && this.f24028a != 0) {
            this.f24029b.m27588b();
        }
        this.f24028a = i7;
    }

    /* renamed from: d */
    public final void m27546d(zzagw zzagwVar) {
        if (zzagwVar == null) {
            return;
        }
        long zza = zzagwVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzagwVar.zzb() + (zza * 1000);
        C6676t c6676t = this.f24029b;
        c6676t.f24084b = zzb;
        c6676t.f24085c = -1L;
        if (m27547f()) {
            this.f24029b.m27589c();
        }
    }

    /* renamed from: f */
    public final boolean m27547f() {
        return this.f24028a > 0 && !this.f24030c;
    }

    public C6653h0(Context context, C6676t c6676t) {
        this.f24030c = false;
        this.f24028a = 0;
        this.f24029b = c6676t;
        ComponentCallbacks2C3682c.m14906c((Application) context.getApplicationContext());
        ComponentCallbacks2C3682c.m14905b().m14907a(new C6651g0(this));
    }
}

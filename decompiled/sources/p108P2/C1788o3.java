package p108P2;

import com.google.android.gms.internal.measurement.zzr;
import java.util.List;

/* renamed from: P2.o3 */
/* loaded from: classes.dex */
public final class C1788o3 implements zzr {

    /* renamed from: a */
    public final /* synthetic */ C1806q3 f5273a;

    public C1788o3(C1806q3 c1806q3) {
        this.f5273a = c1806q3;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i7, String str, List list, boolean z6, boolean z7) {
        int i8 = i7 - 1;
        C1540L2 m5939u = i8 != 0 ? i8 != 1 ? i8 != 3 ? i8 != 4 ? this.f5273a.f5129a.mo5624b().m5939u() : z6 ? this.f5273a.f5129a.mo5624b().m5943y() : !z7 ? this.f5273a.f5129a.mo5624b().m5942x() : this.f5273a.f5129a.mo5624b().m5941w() : this.f5273a.f5129a.mo5624b().m5940v() : z6 ? this.f5273a.f5129a.mo5624b().m5938t() : !z7 ? this.f5273a.f5129a.mo5624b().m5937s() : this.f5273a.f5129a.mo5624b().m5936r() : this.f5273a.f5129a.mo5624b().m5935q();
        int size = list.size();
        if (size == 1) {
            m5939u.m5903b(str, list.get(0));
            return;
        }
        if (size == 2) {
            m5939u.m5904c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            m5939u.m5902a(str);
        } else {
            m5939u.m5905d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}

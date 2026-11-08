package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzhm;
import com.google.android.gms.internal.measurement.zzhx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: P2.o7 */
/* loaded from: classes.dex */
public final class C1792o7 {

    /* renamed from: a */
    public zzhx f5279a;

    /* renamed from: b */
    public List f5280b;

    /* renamed from: c */
    public List f5281c;

    /* renamed from: d */
    public long f5282d;

    /* renamed from: e */
    public final /* synthetic */ C1828s7 f5283e;

    public /* synthetic */ C1792o7(C1828s7 c1828s7, AbstractC1819r7 abstractC1819r7) {
        this.f5283e = c1828s7;
    }

    /* renamed from: b */
    public static final long m6162b(zzhm zzhmVar) {
        return ((zzhmVar.zzd() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m6163a(long j7, zzhm zzhmVar) {
        AbstractC3802r.m15129k(zzhmVar);
        if (this.f5281c == null) {
            this.f5281c = new ArrayList();
        }
        if (this.f5280b == null) {
            this.f5280b = new ArrayList();
        }
        if (!this.f5281c.isEmpty() && m6162b((zzhm) this.f5281c.get(0)) != m6162b(zzhmVar)) {
            return false;
        }
        long zzcf = this.f5282d + zzhmVar.zzcf();
        C1828s7 c1828s7 = this.f5283e;
        if (!c1828s7.m6301D0().m6138P(null, AbstractC1805q2.f5421r1)) {
            c1828s7.m6301D0();
            if (zzcf >= C1775n.m6119o()) {
                return false;
            }
        } else if (!this.f5281c.isEmpty()) {
            c1828s7.m6301D0();
            if (zzcf >= C1775n.m6119o()) {
                return false;
            }
        }
        this.f5282d = zzcf;
        this.f5281c.add(zzhmVar);
        this.f5280b.add(Long.valueOf(j7));
        int size = this.f5281c.size();
        c1828s7.m6301D0();
        return size < Math.max(1, ((Integer) AbstractC1805q2.f5398k.m6159a(null)).intValue());
    }
}

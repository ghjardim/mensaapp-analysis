package p108P2;

import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzpq;

/* renamed from: P2.d */
/* loaded from: classes.dex */
public final class C1685d extends AbstractC1676c {

    /* renamed from: g */
    public final zzfr f5095g;

    /* renamed from: h */
    public final /* synthetic */ C1703f f5096h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1685d(C1703f c1703f, String str, int i7, zzfr zzfrVar) {
        super(str, i7);
        this.f5096h = c1703f;
        this.f5095g = zzfrVar;
    }

    @Override // p108P2.AbstractC1676c
    /* renamed from: a */
    public final int mo5988a() {
        return this.f5095g.zza();
    }

    @Override // p108P2.AbstractC1676c
    /* renamed from: b */
    public final boolean mo5989b() {
        return false;
    }

    @Override // p108P2.AbstractC1676c
    /* renamed from: c */
    public final boolean mo5990c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final boolean m6014k(Long l7, Long l8, zzio zzioVar, boolean z6) {
        zzpq.zzb();
        C1460C3 c1460c3 = this.f5096h.f5129a;
        boolean m6138P = c1460c3.m5605B().m6138P(this.f5054a, AbstractC1805q2.f5323D0);
        zzfr zzfrVar = this.f5095g;
        boolean zzg = zzfrVar.zzg();
        boolean zzh = zzfrVar.zzh();
        boolean zzi = zzfrVar.zzi();
        Object[] objArr = zzg || zzh || zzi;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z6 && objArr != true) {
            c1460c3.mo5624b().m5940v().m5904c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f5055b), zzfrVar.zzj() ? Integer.valueOf(zzfrVar.zza()) : null);
            return true;
        }
        zzfl zzb = zzfrVar.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzioVar.zzt()) {
            if (zzb.zzi()) {
                bool = AbstractC1676c.m5998j(AbstractC1676c.m5996h(zzioVar.zzc(), zzb.zzc()), zzg2);
            } else {
                c1460c3.mo5624b().m5941w().m5903b("No number filter for long property. property", c1460c3.m5609F().m5760f(zzioVar.zzg()));
            }
        } else if (zzioVar.zzr()) {
            if (zzb.zzi()) {
                bool = AbstractC1676c.m5998j(AbstractC1676c.m5995g(zzioVar.zza(), zzb.zzc()), zzg2);
            } else {
                c1460c3.mo5624b().m5941w().m5903b("No number filter for double property. property", c1460c3.m5609F().m5760f(zzioVar.zzg()));
            }
        } else if (!zzioVar.zzv()) {
            c1460c3.mo5624b().m5941w().m5903b("User property has no value, property", c1460c3.m5609F().m5760f(zzioVar.zzg()));
        } else if (zzb.zzk()) {
            bool = AbstractC1676c.m5998j(AbstractC1676c.m5994f(zzioVar.zzh(), zzb.zzd(), c1460c3.mo5624b()), zzg2);
        } else if (!zzb.zzi()) {
            c1460c3.mo5624b().m5941w().m5903b("No string or number filter defined. property", c1460c3.m5609F().m5760f(zzioVar.zzg()));
        } else if (C1882y7.m6564m(zzioVar.zzh())) {
            bool = AbstractC1676c.m5998j(AbstractC1676c.m5997i(zzioVar.zzh(), zzb.zzc()), zzg2);
        } else {
            c1460c3.mo5624b().m5941w().m5904c("Invalid user property value for Numeric number filter. property, value", c1460c3.m5609F().m5760f(zzioVar.zzg()), zzioVar.zzh());
        }
        c1460c3.mo5624b().m5940v().m5903b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f5056c = Boolean.TRUE;
        if (zzi && !bool.booleanValue()) {
            return true;
        }
        if (!z6 || zzfrVar.zzg()) {
            this.f5057d = bool;
        }
        if (bool.booleanValue() && objArr != false && zzioVar.zzu()) {
            long zzd = zzioVar.zzd();
            if (l7 != null) {
                zzd = l7.longValue();
            }
            if (m6138P && zzfrVar.zzg() && !zzfrVar.zzh() && l8 != null) {
                zzd = l8.longValue();
            }
            if (zzfrVar.zzh()) {
                this.f5059f = Long.valueOf(zzd);
            } else {
                this.f5058e = Long.valueOf(zzd);
            }
        }
        return true;
    }
}

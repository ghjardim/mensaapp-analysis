package p108P2;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzdj;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p256j$.util.Objects;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: P2.J5 */
/* loaded from: classes.dex */
public final class C1525J5 extends AbstractC1724h2 {

    /* renamed from: c */
    public volatile C1462C5 f4769c;

    /* renamed from: d */
    public volatile C1462C5 f4770d;

    /* renamed from: e */
    public C1462C5 f4771e;

    /* renamed from: f */
    public final Map f4772f;

    /* renamed from: g */
    public zzdj f4773g;

    /* renamed from: h */
    public volatile boolean f4774h;

    /* renamed from: i */
    public volatile C1462C5 f4775i;

    /* renamed from: j */
    public C1462C5 f4776j;

    /* renamed from: k */
    public boolean f4777k;

    /* renamed from: l */
    public final Object f4778l;

    public C1525J5(C1460C3 c1460c3) {
        super(c1460c3);
        this.f4778l = new Object();
        this.f4772f = new ConcurrentHashMap();
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ void m5870x(C1525J5 c1525j5, Bundle bundle, C1462C5 c1462c5, C1462C5 c1462c52, long j7) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c1525j5.m5880p(c1462c5, c1462c52, j7, true, c1525j5.f5129a.m5619Q().m5719o(null, "screen_view", bundle, null, false));
    }

    /* renamed from: A */
    public final void m5872A(zzdj zzdjVar) {
        synchronized (this.f4778l) {
            try {
                if (Objects.equals(this.f4773g, zzdjVar)) {
                    this.f4773g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f5129a.m5605B().m6140R()) {
            this.f4772f.remove(Integer.valueOf(zzdjVar.zza));
        }
    }

    /* renamed from: B */
    public final void m5873B(zzdj zzdjVar) {
        synchronized (this.f4778l) {
            this.f4777k = false;
            this.f4774h = true;
        }
        C1460C3 c1460c3 = this.f5129a;
        long mo1111b = c1460c3.mo5626d().mo1111b();
        if (!c1460c3.m5605B().m6140R()) {
            this.f4769c = null;
            c1460c3.mo5628f().m6446A(new RunnableC1498G5(this, mo1111b));
        } else {
            C1462C5 m5878G = m5878G(zzdjVar);
            this.f4770d = this.f4769c;
            this.f4769c = null;
            c1460c3.mo5628f().m6446A(new RunnableC1507H5(this, m5878G, mo1111b));
        }
    }

    /* renamed from: C */
    public final void m5874C(zzdj zzdjVar) {
        Object obj = this.f4778l;
        synchronized (obj) {
            this.f4777k = true;
            if (!Objects.equals(zzdjVar, this.f4773g)) {
                synchronized (obj) {
                    this.f4773g = zzdjVar;
                    this.f4774h = false;
                    C1460C3 c1460c3 = this.f5129a;
                    if (c1460c3.m5605B().m6140R()) {
                        this.f4775i = null;
                        c1460c3.mo5628f().m6446A(new RunnableC1516I5(this));
                    }
                }
            }
        }
        C1460C3 c1460c32 = this.f5129a;
        if (!c1460c32.m5605B().m6140R()) {
            this.f4769c = this.f4775i;
            c1460c32.mo5628f().m6446A(new RunnableC1489F5(this));
            return;
        }
        m5879o(zzdjVar.zzb, m5878G(zzdjVar), false);
        C1475E0 m5604A = this.f5129a.m5604A();
        C1460C3 c1460c33 = m5604A.f5129a;
        c1460c33.mo5628f().m6446A(new RunnableC1686d0(m5604A, c1460c33.mo5626d().mo1111b()));
    }

    /* renamed from: D */
    public final void m5875D(zzdj zzdjVar, Bundle bundle) {
        C1462C5 c1462c5;
        if (!this.f5129a.m5605B().m6140R() || bundle == null || (c1462c5 = (C1462C5) this.f4772f.get(Integer.valueOf(zzdjVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c1462c5.f4571c);
        bundle2.putString("name", c1462c5.f4569a);
        bundle2.putString("referrer_name", c1462c5.f4570b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* renamed from: E */
    public final void m5876E(zzdj zzdjVar, String str, String str2) {
        C1460C3 c1460c3 = this.f5129a;
        if (!c1460c3.m5605B().m6140R()) {
            c1460c3.mo5624b().m5942x().m5902a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C1462C5 c1462c5 = this.f4769c;
        if (c1462c5 == null) {
            c1460c3.mo5624b().m5942x().m5902a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f4772f;
        Integer valueOf = Integer.valueOf(zzdjVar.zza);
        if (map.get(valueOf) == null) {
            c1460c3.mo5624b().m5942x().m5902a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m5884u(zzdjVar.zzb, "Activity");
        }
        String str3 = c1462c5.f4570b;
        String str4 = c1462c5.f4569a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            c1460c3.mo5624b().m5942x().m5902a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c1460c3.m5605B().m6149v(null, false))) {
            c1460c3.mo5624b().m5942x().m5903b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c1460c3.m5605B().m6149v(null, false))) {
            c1460c3.mo5624b().m5942x().m5903b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        c1460c3.mo5624b().m5940v().m5904c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C1462C5 c1462c52 = new C1462C5(str, str2, c1460c3.m5619Q().m5684C0());
        map.put(valueOf, c1462c52);
        m5879o(zzdjVar.zzb, c1462c52, true);
    }

    /* renamed from: F */
    public final void m5877F(Bundle bundle, long j7) {
        synchronized (this.f4778l) {
            try {
                if (!this.f4777k) {
                    this.f5129a.mo5624b().m5942x().m5902a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f5129a.m5605B().m6149v(null, false))) {
                    this.f5129a.mo5624b().m5942x().m5903b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f5129a.m5605B().m6149v(null, false))) {
                    this.f5129a.mo5624b().m5942x().m5903b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    zzdj zzdjVar = this.f4773g;
                    string2 = zzdjVar != null ? m5884u(zzdjVar.zzb, "Activity") : "Activity";
                }
                C1462C5 c1462c5 = this.f4769c;
                if (this.f4774h && c1462c5 != null) {
                    this.f4774h = false;
                    boolean equals = Objects.equals(c1462c5.f4570b, string2);
                    boolean equals2 = Objects.equals(c1462c5.f4569a, string);
                    if (equals && equals2) {
                        this.f5129a.mo5624b().m5942x().m5902a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C1460C3 c1460c3 = this.f5129a;
                c1460c3.mo5624b().m5940v().m5904c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                C1462C5 c1462c52 = this.f4769c == null ? this.f4770d : this.f4769c;
                C1462C5 c1462c53 = new C1462C5(string, string2, c1460c3.m5619Q().m5684C0(), true, j7);
                this.f4769c = c1462c53;
                this.f4770d = c1462c52;
                this.f4775i = c1462c53;
                c1460c3.mo5628f().m6446A(new RunnableC1471D5(this, bundle, c1462c53, c1462c52, c1460c3.mo5626d().mo1111b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: G */
    public final C1462C5 m5878G(zzdj zzdjVar) {
        AbstractC3802r.m15129k(zzdjVar);
        Integer valueOf = Integer.valueOf(zzdjVar.zza);
        Map map = this.f4772f;
        C1462C5 c1462c5 = (C1462C5) map.get(valueOf);
        if (c1462c5 == null) {
            C1462C5 c1462c52 = new C1462C5(null, m5884u(zzdjVar.zzb, "Activity"), this.f5129a.m5619Q().m5684C0());
            map.put(valueOf, c1462c52);
            c1462c5 = c1462c52;
        }
        return this.f4775i != null ? this.f4775i : c1462c5;
    }

    @Override // p108P2.AbstractC1724h2
    /* renamed from: n */
    public final boolean mo5563n() {
        return false;
    }

    /* renamed from: o */
    public final void m5879o(String str, C1462C5 c1462c5, boolean z6) {
        C1462C5 c1462c52;
        C1462C5 c1462c53 = this.f4769c == null ? this.f4770d : this.f4769c;
        if (c1462c5.f4570b == null) {
            c1462c52 = new C1462C5(c1462c5.f4569a, str != null ? m5884u(str, "Activity") : null, c1462c5.f4571c, c1462c5.f4573e, c1462c5.f4574f);
        } else {
            c1462c52 = c1462c5;
        }
        this.f4770d = this.f4769c;
        this.f4769c = c1462c52;
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.mo5628f().m6446A(new RunnableC1480E5(this, c1462c52, c1462c53, c1460c3.mo5626d().mo1111b(), z6));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5880p(p108P2.C1462C5 r16, p108P2.C1462C5 r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1525J5.m5880p(P2.C5, P2.C5, long, boolean, android.os.Bundle):void");
    }

    /* renamed from: q */
    public final void m5881q(C1462C5 c1462c5, boolean z6, long j7) {
        C1460C3 c1460c3 = this.f5129a;
        c1460c3.m5604A().m5747n(c1460c3.mo5626d().mo1111b());
        if (!c1460c3.m5618P().f4808f.m5889d(c1462c5 != null && c1462c5.f4572d, z6, j7) || c1462c5 == null) {
            return;
        }
        c1462c5.f4572d = false;
    }

    /* renamed from: s */
    public final C1462C5 m5882s() {
        return this.f4769c;
    }

    /* renamed from: t */
    public final C1462C5 m5883t(boolean z6) {
        m6082i();
        mo5762h();
        if (!z6) {
            return this.f4771e;
        }
        C1462C5 c1462c5 = this.f4771e;
        return c1462c5 != null ? c1462c5 : this.f4776j;
    }

    /* renamed from: u */
    public final String m5884u(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str3 = length > 0 ? split[length - 1] : StringUtils.EMPTY;
        C1460C3 c1460c3 = this.f5129a;
        return str3.length() > c1460c3.m5605B().m6149v(null, false) ? str3.substring(0, c1460c3.m5605B().m6149v(null, false)) : str3;
    }

    /* renamed from: z */
    public final void m5885z(zzdj zzdjVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.f5129a.m5605B().m6140R() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f4772f.put(Integer.valueOf(zzdjVar.zza), new C1462C5(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}

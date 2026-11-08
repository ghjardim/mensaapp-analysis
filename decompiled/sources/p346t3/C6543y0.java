package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzae;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import p382y2.AbstractC7067c;

/* renamed from: t3.y0 */
/* loaded from: classes.dex */
public class C6543y0 extends AbstractC6481M {
    public static final Parcelable.Creator<C6543y0> CREATOR = new C6545z0();

    /* renamed from: a */
    public final String f23468a;

    /* renamed from: b */
    public final String f23469b;

    /* renamed from: c */
    public final String f23470c;

    /* renamed from: d */
    public final zzaic f23471d;

    /* renamed from: e */
    public final String f23472e;

    /* renamed from: f */
    public final String f23473f;

    /* renamed from: n */
    public final String f23474n;

    public C6543y0(String str, String str2, String str3, zzaic zzaicVar, String str4, String str5, String str6) {
        this.f23468a = zzae.zzb(str);
        this.f23469b = str2;
        this.f23470c = str3;
        this.f23471d = zzaicVar;
        this.f23472e = str4;
        this.f23473f = str5;
        this.f23474n = str6;
    }

    /* renamed from: D0 */
    public static zzaic m27135D0(C6543y0 c6543y0, String str) {
        AbstractC3802r.m15129k(c6543y0);
        zzaic zzaicVar = c6543y0.f23471d;
        return zzaicVar != null ? zzaicVar : new zzaic(c6543y0.mo27017B0(), c6543y0.mo27016A0(), c6543y0.mo26997x0(), null, c6543y0.mo27018C0(), null, str, c6543y0.f23472e, c6543y0.f23474n);
    }

    /* renamed from: E0 */
    public static C6543y0 m27136E0(zzaic zzaicVar) {
        AbstractC3802r.m15130l(zzaicVar, "Must specify a non-null webSignInCredential");
        return new C6543y0(null, null, null, zzaicVar, null, null, null);
    }

    /* renamed from: F0 */
    public static C6543y0 m27137F0(String str, String str2, String str3, String str4) {
        AbstractC3802r.m15124f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new C6543y0(str, str2, str3, null, null, null, str4);
    }

    /* renamed from: G0 */
    public static C6543y0 m27138G0(String str, String str2, String str3, String str4, String str5) {
        AbstractC3802r.m15124f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new C6543y0(str, str2, str3, null, str4, str5, null);
    }

    @Override // p346t3.AbstractC6481M
    /* renamed from: A0 */
    public String mo27016A0() {
        return this.f23470c;
    }

    @Override // p346t3.AbstractC6481M
    /* renamed from: B0 */
    public String mo27017B0() {
        return this.f23469b;
    }

    @Override // p346t3.AbstractC6481M
    /* renamed from: C0 */
    public String mo27018C0() {
        return this.f23473f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, mo26997x0(), false);
        AbstractC7067c.m29108E(parcel, 2, mo27017B0(), false);
        AbstractC7067c.m29108E(parcel, 3, mo27016A0(), false);
        AbstractC7067c.m29106C(parcel, 4, this.f23471d, i7, false);
        AbstractC7067c.m29108E(parcel, 5, this.f23472e, false);
        AbstractC7067c.m29108E(parcel, 6, mo27018C0(), false);
        AbstractC7067c.m29108E(parcel, 7, this.f23474n, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: x0 */
    public String mo26997x0() {
        return this.f23468a;
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: y0 */
    public String mo26998y0() {
        return this.f23468a;
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: z0 */
    public final AbstractC6508h mo26999z0() {
        return new C6543y0(this.f23468a, this.f23469b, this.f23470c, this.f23471d, this.f23472e, this.f23473f, this.f23474n);
    }
}

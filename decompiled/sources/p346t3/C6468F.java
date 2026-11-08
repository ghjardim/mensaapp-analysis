package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import p382y2.AbstractC7067c;

/* renamed from: t3.F */
/* loaded from: classes.dex */
public class C6468F extends AbstractC6508h {
    public static final Parcelable.Creator<C6468F> CREATOR = new C6519m0();

    /* renamed from: a */
    public final String f23370a;

    /* renamed from: b */
    public final String f23371b;

    public C6468F(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f23370a = str;
        this.f23371b = str2;
    }

    /* renamed from: A0 */
    public static zzaic m27001A0(C6468F c6468f, String str) {
        AbstractC3802r.m15129k(c6468f);
        return new zzaic(c6468f.f23370a, c6468f.f23371b, c6468f.mo26997x0(), null, null, null, str, null, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f23370a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f23371b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: x0 */
    public String mo26997x0() {
        return "google.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: y0 */
    public String mo26998y0() {
        return "google.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: z0 */
    public final AbstractC6508h mo26999z0() {
        return new C6468F(this.f23370a, this.f23371b);
    }
}

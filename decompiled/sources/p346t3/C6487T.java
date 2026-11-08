package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import p382y2.AbstractC7067c;

/* renamed from: t3.T */
/* loaded from: classes.dex */
public class C6487T extends AbstractC6508h {
    public static final Parcelable.Creator<C6487T> CREATOR = new C6533t0();

    /* renamed from: a */
    public final String f23397a;

    public C6487T(String str) {
        this.f23397a = AbstractC3802r.m15123e(str);
    }

    /* renamed from: A0 */
    public static zzaic m27042A0(C6487T c6487t, String str) {
        AbstractC3802r.m15129k(c6487t);
        return new zzaic(null, null, c6487t.mo26997x0(), null, null, c6487t.f23397a, str, null, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f23397a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: x0 */
    public String mo26997x0() {
        return "playgames.google.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: y0 */
    public String mo26998y0() {
        return "playgames.google.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: z0 */
    public final AbstractC6508h mo26999z0() {
        return new C6487T(this.f23397a);
    }
}

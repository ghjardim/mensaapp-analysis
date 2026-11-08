package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import p382y2.AbstractC7067c;

/* renamed from: t3.l */
/* loaded from: classes.dex */
public class C6516l extends AbstractC6508h {
    public static final Parcelable.Creator<C6516l> CREATOR = new C6461B0();

    /* renamed from: a */
    public final String f23459a;

    public C6516l(String str) {
        this.f23459a = AbstractC3802r.m15123e(str);
    }

    /* renamed from: A0 */
    public static zzaic m27120A0(C6516l c6516l, String str) {
        AbstractC3802r.m15129k(c6516l);
        return new zzaic(null, c6516l.f23459a, c6516l.mo26997x0(), null, null, null, str, null, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f23459a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: x0 */
    public String mo26997x0() {
        return "facebook.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: y0 */
    public String mo26998y0() {
        return "facebook.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: z0 */
    public final AbstractC6508h mo26999z0() {
        return new C6516l(this.f23459a);
    }
}

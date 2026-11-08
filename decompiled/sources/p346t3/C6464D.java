package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import p382y2.AbstractC7067c;

/* renamed from: t3.D */
/* loaded from: classes.dex */
public class C6464D extends AbstractC6508h {
    public static final Parcelable.Creator<C6464D> CREATOR = new C6517l0();

    /* renamed from: a */
    public String f23363a;

    public C6464D(String str) {
        this.f23363a = AbstractC3802r.m15123e(str);
    }

    /* renamed from: A0 */
    public static zzaic m26996A0(C6464D c6464d, String str) {
        AbstractC3802r.m15129k(c6464d);
        return new zzaic(null, c6464d.f23363a, c6464d.mo26997x0(), null, null, null, str, null, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f23363a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: x0 */
    public String mo26997x0() {
        return "github.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: y0 */
    public String mo26998y0() {
        return "github.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: z0 */
    public final AbstractC6508h mo26999z0() {
        return new C6464D(this.f23363a);
    }
}

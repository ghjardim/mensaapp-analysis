package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import p382y2.AbstractC7067c;

/* renamed from: t3.a0 */
/* loaded from: classes.dex */
public class C6495a0 extends AbstractC6508h {
    public static final Parcelable.Creator<C6495a0> CREATOR = new C6537v0();

    /* renamed from: a */
    public String f23405a;

    /* renamed from: b */
    public String f23406b;

    public C6495a0(String str, String str2) {
        this.f23405a = AbstractC3802r.m15123e(str);
        this.f23406b = AbstractC3802r.m15123e(str2);
    }

    /* renamed from: A0 */
    public static zzaic m27063A0(C6495a0 c6495a0, String str) {
        AbstractC3802r.m15129k(c6495a0);
        return new zzaic(null, c6495a0.f23405a, c6495a0.mo26997x0(), null, c6495a0.f23406b, null, str, null, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f23405a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f23406b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: x0 */
    public String mo26997x0() {
        return "twitter.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: y0 */
    public String mo26998y0() {
        return "twitter.com";
    }

    @Override // p346t3.AbstractC6508h
    /* renamed from: z0 */
    public final AbstractC6508h mo26999z0() {
        return new C6495a0(this.f23405a, this.f23406b);
    }
}

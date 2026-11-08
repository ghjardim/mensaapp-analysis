package p080L2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7067c;

/* renamed from: L2.l */
/* loaded from: classes.dex */
public class C0964l extends AbstractC0968n {
    public static final Parcelable.Creator<C0964l> CREATOR = new C0989x0();

    /* renamed from: a */
    public final C0982u f3247a;

    /* renamed from: b */
    public final Uri f3248b;

    /* renamed from: c */
    public final byte[] f3249c;

    public C0964l(C0982u c0982u, Uri uri, byte[] bArr) {
        this.f3247a = (C0982u) AbstractC3802r.m15129k(c0982u);
        m3813A0(uri);
        this.f3248b = uri;
        m3814B0(bArr);
        this.f3249c = bArr;
    }

    /* renamed from: A0 */
    public static Uri m3813A0(Uri uri) {
        AbstractC3802r.m15129k(uri);
        AbstractC3802r.m15120b(uri.getScheme() != null, "origin scheme must be non-empty");
        AbstractC3802r.m15120b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    /* renamed from: B0 */
    public static byte[] m3814B0(byte[] bArr) {
        boolean z6 = true;
        if (bArr != null && bArr.length != 32) {
            z6 = false;
        }
        AbstractC3802r.m15120b(z6, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0964l)) {
            return false;
        }
        C0964l c0964l = (C0964l) obj;
        return AbstractC3798p.m15099b(this.f3247a, c0964l.f3247a) && AbstractC3798p.m15099b(this.f3248b, c0964l.f3248b);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3247a, this.f3248b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 2, m3817z0(), i7, false);
        AbstractC7067c.m29106C(parcel, 3, m3816y0(), i7, false);
        AbstractC7067c.m29127k(parcel, 4, m3815x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public byte[] m3815x0() {
        return this.f3249c;
    }

    /* renamed from: y0 */
    public Uri m3816y0() {
        return this.f3248b;
    }

    /* renamed from: z0 */
    public C0982u m3817z0() {
        return this.f3247a;
    }
}

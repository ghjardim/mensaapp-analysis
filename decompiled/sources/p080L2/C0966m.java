package p080L2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7067c;

/* renamed from: L2.m */
/* loaded from: classes.dex */
public class C0966m extends AbstractC0968n {
    public static final Parcelable.Creator<C0966m> CREATOR = new C0991y0();

    /* renamed from: a */
    public final C0988x f3250a;

    /* renamed from: b */
    public final Uri f3251b;

    /* renamed from: c */
    public final byte[] f3252c;

    public C0966m(C0988x c0988x, Uri uri, byte[] bArr) {
        this.f3250a = (C0988x) AbstractC3802r.m15129k(c0988x);
        m3818A0(uri);
        this.f3251b = uri;
        m3819B0(bArr);
        this.f3252c = bArr;
    }

    /* renamed from: A0 */
    private static Uri m3818A0(Uri uri) {
        AbstractC3802r.m15129k(uri);
        AbstractC3802r.m15120b(uri.getScheme() != null, "origin scheme must be non-empty");
        AbstractC3802r.m15120b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    /* renamed from: B0 */
    private static byte[] m3819B0(byte[] bArr) {
        boolean z6 = true;
        if (bArr != null && bArr.length != 32) {
            z6 = false;
        }
        AbstractC3802r.m15120b(z6, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0966m)) {
            return false;
        }
        C0966m c0966m = (C0966m) obj;
        return AbstractC3798p.m15099b(this.f3250a, c0966m.f3250a) && AbstractC3798p.m15099b(this.f3251b, c0966m.f3251b);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3250a, this.f3251b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 2, m3822z0(), i7, false);
        AbstractC7067c.m29106C(parcel, 3, m3821y0(), i7, false);
        AbstractC7067c.m29127k(parcel, 4, m3820x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public byte[] m3820x0() {
        return this.f3252c;
    }

    /* renamed from: y0 */
    public Uri m3821y0() {
        return this.f3251b;
    }

    /* renamed from: z0 */
    public C0988x m3822z0() {
        return this.f3250a;
    }
}

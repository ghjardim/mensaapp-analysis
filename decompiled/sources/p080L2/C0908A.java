package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.A */
/* loaded from: classes.dex */
public class C0908A extends AbstractC7065a {
    public static final Parcelable.Creator<C0908A> CREATOR = new C0945b0();

    /* renamed from: a */
    public final byte[] f3158a;

    /* renamed from: b */
    public final String f3159b;

    /* renamed from: c */
    public final String f3160c;

    /* renamed from: d */
    public final String f3161d;

    public C0908A(byte[] bArr, String str, String str2, String str3) {
        this.f3158a = (byte[]) AbstractC3802r.m15129k(bArr);
        this.f3159b = (String) AbstractC3802r.m15129k(str);
        this.f3160c = str2;
        this.f3161d = (String) AbstractC3802r.m15129k(str3);
    }

    /* renamed from: M */
    public String m3776M() {
        return this.f3161d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0908A)) {
            return false;
        }
        C0908A c0908a = (C0908A) obj;
        return Arrays.equals(this.f3158a, c0908a.f3158a) && AbstractC3798p.m15099b(this.f3159b, c0908a.f3159b) && AbstractC3798p.m15099b(this.f3160c, c0908a.f3160c) && AbstractC3798p.m15099b(this.f3161d, c0908a.f3161d);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3158a, this.f3159b, this.f3160c, this.f3161d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29127k(parcel, 2, m3778y0(), false);
        AbstractC7067c.m29108E(parcel, 3, m3779z0(), false);
        AbstractC7067c.m29108E(parcel, 4, m3777x0(), false);
        AbstractC7067c.m29108E(parcel, 5, m3776M(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m3777x0() {
        return this.f3160c;
    }

    /* renamed from: y0 */
    public byte[] m3778y0() {
        return this.f3158a;
    }

    /* renamed from: z0 */
    public String m3779z0() {
        return this.f3159b;
    }
}

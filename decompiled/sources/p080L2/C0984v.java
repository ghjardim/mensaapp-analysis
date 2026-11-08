package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.Arrays;
import java.util.List;
import p080L2.EnumC0992z;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.v */
/* loaded from: classes.dex */
public class C0984v extends AbstractC7065a {

    /* renamed from: a */
    public final EnumC0992z f3303a;

    /* renamed from: b */
    public final byte[] f3304b;

    /* renamed from: c */
    public final List f3305c;

    /* renamed from: d */
    public static final zzbc f3302d = zzbc.zzk(zzh.zza, zzh.zzb);
    public static final Parcelable.Creator<C0984v> CREATOR = new C0938W();

    public C0984v(String str, byte[] bArr, List list) {
        AbstractC3802r.m15129k(str);
        try {
            this.f3303a = EnumC0992z.m3860b(str);
            this.f3304b = (byte[]) AbstractC3802r.m15129k(bArr);
            this.f3305c = list;
        } catch (EnumC0992z.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C0984v)) {
            return false;
        }
        C0984v c0984v = (C0984v) obj;
        if (!this.f3303a.equals(c0984v.f3303a) || !Arrays.equals(this.f3304b, c0984v.f3304b)) {
            return false;
        }
        List list2 = this.f3305c;
        if (list2 == null && c0984v.f3305c == null) {
            return true;
        }
        return list2 != null && (list = c0984v.f3305c) != null && list2.containsAll(list) && c0984v.f3305c.containsAll(this.f3305c);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3303a, Integer.valueOf(Arrays.hashCode(this.f3304b)), this.f3305c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, m3847z0(), false);
        AbstractC7067c.m29127k(parcel, 3, m3845x0(), false);
        AbstractC7067c.m29112I(parcel, 4, m3846y0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public byte[] m3845x0() {
        return this.f3304b;
    }

    /* renamed from: y0 */
    public List m3846y0() {
        return this.f3305c;
    }

    /* renamed from: z0 */
    public String m3847z0() {
        return this.f3303a.toString();
    }
}

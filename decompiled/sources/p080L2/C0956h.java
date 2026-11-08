package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;
import p382y2.AbstractC7067c;

/* renamed from: L2.h */
/* loaded from: classes.dex */
public class C0956h extends AbstractC0960j {
    public static final Parcelable.Creator<C0956h> CREATOR = new C0983u0();

    /* renamed from: a */
    public final byte[] f3231a;

    /* renamed from: b */
    public final byte[] f3232b;

    /* renamed from: c */
    public final byte[] f3233c;

    /* renamed from: d */
    public final String[] f3234d;

    public C0956h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f3231a = (byte[]) AbstractC3802r.m15129k(bArr);
        this.f3232b = (byte[]) AbstractC3802r.m15129k(bArr2);
        this.f3233c = (byte[]) AbstractC3802r.m15129k(bArr3);
        this.f3234d = (String[]) AbstractC3802r.m15129k(strArr);
    }

    /* renamed from: A0 */
    public String[] m3802A0() {
        return this.f3234d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0956h)) {
            return false;
        }
        C0956h c0956h = (C0956h) obj;
        return Arrays.equals(this.f3231a, c0956h.f3231a) && Arrays.equals(this.f3232b, c0956h.f3232b) && Arrays.equals(this.f3233c, c0956h.f3233c);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f3231a)), Integer.valueOf(Arrays.hashCode(this.f3232b)), Integer.valueOf(Arrays.hashCode(this.f3233c)));
    }

    public String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f3231a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f3232b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f3233c;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.f3234d));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29127k(parcel, 2, m3805z0(), false);
        AbstractC7067c.m29127k(parcel, 3, m3804y0(), false);
        AbstractC7067c.m29127k(parcel, 4, m3803x0(), false);
        AbstractC7067c.m29109F(parcel, 5, m3802A0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public byte[] m3803x0() {
        return this.f3233c;
    }

    /* renamed from: y0 */
    public byte[] m3804y0() {
        return this.f3232b;
    }

    /* renamed from: z0 */
    public byte[] m3805z0() {
        return this.f3231a;
    }
}

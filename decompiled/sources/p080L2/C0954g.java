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

/* renamed from: L2.g */
/* loaded from: classes.dex */
public class C0954g extends AbstractC0960j {
    public static final Parcelable.Creator<C0954g> CREATOR = new C0981t0();

    /* renamed from: a */
    public final byte[] f3226a;

    /* renamed from: b */
    public final byte[] f3227b;

    /* renamed from: c */
    public final byte[] f3228c;

    /* renamed from: d */
    public final byte[] f3229d;

    /* renamed from: e */
    public final byte[] f3230e;

    public C0954g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f3226a = (byte[]) AbstractC3802r.m15129k(bArr);
        this.f3227b = (byte[]) AbstractC3802r.m15129k(bArr2);
        this.f3228c = (byte[]) AbstractC3802r.m15129k(bArr3);
        this.f3229d = (byte[]) AbstractC3802r.m15129k(bArr4);
        this.f3230e = bArr5;
    }

    /* renamed from: A0 */
    public byte[] m3797A0() {
        return this.f3229d;
    }

    /* renamed from: B0 */
    public byte[] m3798B0() {
        return this.f3230e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0954g)) {
            return false;
        }
        C0954g c0954g = (C0954g) obj;
        return Arrays.equals(this.f3226a, c0954g.f3226a) && Arrays.equals(this.f3227b, c0954g.f3227b) && Arrays.equals(this.f3228c, c0954g.f3228c) && Arrays.equals(this.f3229d, c0954g.f3229d) && Arrays.equals(this.f3230e, c0954g.f3230e);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f3226a)), Integer.valueOf(Arrays.hashCode(this.f3227b)), Integer.valueOf(Arrays.hashCode(this.f3228c)), Integer.valueOf(Arrays.hashCode(this.f3229d)), Integer.valueOf(Arrays.hashCode(this.f3230e)));
    }

    public String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.f3226a;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.f3227b;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.f3228c;
        zza.zzb("authenticatorData", zzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzf4 = zzch.zzf();
        byte[] bArr4 = this.f3229d;
        zza.zzb("signature", zzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f3230e;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29127k(parcel, 2, m3801z0(), false);
        AbstractC7067c.m29127k(parcel, 3, m3800y0(), false);
        AbstractC7067c.m29127k(parcel, 4, m3799x0(), false);
        AbstractC7067c.m29127k(parcel, 5, m3797A0(), false);
        AbstractC7067c.m29127k(parcel, 6, m3798B0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public byte[] m3799x0() {
        return this.f3228c;
    }

    /* renamed from: y0 */
    public byte[] m3800y0() {
        return this.f3227b;
    }

    /* renamed from: z0 */
    public byte[] m3801z0() {
        return this.f3226a;
    }
}

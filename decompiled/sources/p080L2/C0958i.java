package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import p080L2.EnumC0974q;
import p382y2.AbstractC7067c;

/* renamed from: L2.i */
/* loaded from: classes.dex */
public class C0958i extends AbstractC0960j {
    public static final Parcelable.Creator<C0958i> CREATOR = new C0985v0();

    /* renamed from: a */
    public final EnumC0974q f3235a;

    /* renamed from: b */
    public final String f3236b;

    /* renamed from: c */
    public final int f3237c;

    public C0958i(int i7, String str, int i8) {
        try {
            this.f3235a = EnumC0974q.m3825f(i7);
            this.f3236b = str;
            this.f3237c = i8;
        } catch (EnumC0974q.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0958i)) {
            return false;
        }
        C0958i c0958i = (C0958i) obj;
        return AbstractC3798p.m15099b(this.f3235a, c0958i.f3235a) && AbstractC3798p.m15099b(this.f3236b, c0958i.f3236b) && AbstractC3798p.m15099b(Integer.valueOf(this.f3237c), Integer.valueOf(c0958i.f3237c));
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3235a, this.f3236b, Integer.valueOf(this.f3237c));
    }

    public String toString() {
        zzam zza = zzan.zza(this);
        zza.zza("errorCode", this.f3235a.m3826b());
        String str = this.f3236b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 2, m3806x0());
        AbstractC7067c.m29108E(parcel, 3, m3807y0(), false);
        AbstractC7067c.m29136t(parcel, 4, this.f3237c);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public int m3806x0() {
        return this.f3235a.m3826b();
    }

    /* renamed from: y0 */
    public String m3807y0() {
        return this.f3236b;
    }
}

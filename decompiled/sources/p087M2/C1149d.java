package p087M2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p087M2.EnumC1148c;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: M2.d */
/* loaded from: classes.dex */
public class C1149d extends AbstractC7065a {
    public static final Parcelable.Creator<C1149d> CREATOR = new C1155j();

    /* renamed from: a */
    public final int f3735a;

    /* renamed from: b */
    public final EnumC1148c f3736b;

    /* renamed from: c */
    public final byte[] f3737c;

    /* renamed from: d */
    public final String f3738d;

    public C1149d(int i7, String str, byte[] bArr, String str2) {
        this.f3735a = i7;
        try {
            this.f3736b = EnumC1148c.m4441b(str);
            this.f3737c = bArr;
            this.f3738d = str2;
        } catch (EnumC1148c.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1149d)) {
            return false;
        }
        C1149d c1149d = (C1149d) obj;
        if (!Arrays.equals(this.f3737c, c1149d.f3737c) || this.f3736b != c1149d.f3736b) {
            return false;
        }
        String str = this.f3738d;
        if (str == null) {
            if (c1149d.f3738d != null) {
                return false;
            }
        } else if (!str.equals(c1149d.f3738d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f3737c) + 31) * 31) + this.f3736b.hashCode();
        String str = this.f3738d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, m4444z0());
        AbstractC7067c.m29108E(parcel, 2, this.f3736b.toString(), false);
        AbstractC7067c.m29127k(parcel, 3, m4443y0(), false);
        AbstractC7067c.m29108E(parcel, 4, m4442x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m4442x0() {
        return this.f3738d;
    }

    /* renamed from: y0 */
    public byte[] m4443y0() {
        return this.f3737c;
    }

    /* renamed from: z0 */
    public int m4444z0() {
        return this.f3735a;
    }
}

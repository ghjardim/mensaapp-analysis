package p087M2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import java.util.List;
import p031E2.AbstractC0267c;
import p087M2.EnumC1148c;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: M2.b */
/* loaded from: classes.dex */
public class C1147b extends AbstractC7065a {
    public static final Parcelable.Creator<C1147b> CREATOR = new C1153h();

    /* renamed from: a */
    public final int f3726a;

    /* renamed from: b */
    public final byte[] f3727b;

    /* renamed from: c */
    public final EnumC1148c f3728c;

    /* renamed from: d */
    public final List f3729d;

    public C1147b(int i7, byte[] bArr, String str, List list) {
        this.f3726a = i7;
        this.f3727b = bArr;
        try {
            this.f3728c = EnumC1148c.m4441b(str);
            this.f3729d = list;
        } catch (EnumC1148c.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* renamed from: A0 */
    public int m4437A0() {
        return this.f3726a;
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147b)) {
            return false;
        }
        C1147b c1147b = (C1147b) obj;
        if (!Arrays.equals(this.f3727b, c1147b.f3727b) || !this.f3728c.equals(c1147b.f3728c)) {
            return false;
        }
        List list2 = this.f3729d;
        if (list2 == null && c1147b.f3729d == null) {
            return true;
        }
        return list2 != null && (list = c1147b.f3729d) != null && list2.containsAll(list) && c1147b.f3729d.containsAll(this.f3729d);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f3727b)), this.f3728c, this.f3729d);
    }

    public String toString() {
        List list = this.f3729d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", AbstractC0267c.m1107c(this.f3727b), this.f3728c, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, m4437A0());
        AbstractC7067c.m29127k(parcel, 2, m4438x0(), false);
        AbstractC7067c.m29108E(parcel, 3, this.f3728c.toString(), false);
        AbstractC7067c.m29112I(parcel, 4, m4440z0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public byte[] m4438x0() {
        return this.f3727b;
    }

    /* renamed from: y0 */
    public EnumC1148c m4439y0() {
        return this.f3728c;
    }

    /* renamed from: z0 */
    public List m4440z0() {
        return this.f3729d;
    }
}

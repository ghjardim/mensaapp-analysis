package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;

/* renamed from: P2.z7 */
/* loaded from: classes.dex */
public final class C1891z7 extends AbstractC7065a {
    public static final Parcelable.Creator<C1891z7> CREATOR = new C1446A7();

    /* renamed from: a */
    public final int f5638a;

    /* renamed from: b */
    public final String f5639b;

    /* renamed from: c */
    public final long f5640c;

    /* renamed from: d */
    public final Long f5641d;

    /* renamed from: e */
    public final String f5642e;

    /* renamed from: f */
    public final String f5643f;

    /* renamed from: n */
    public final Double f5644n;

    public C1891z7(int i7, String str, long j7, Long l7, Float f7, String str2, String str3, Double d7) {
        this.f5638a = i7;
        this.f5639b = str;
        this.f5640c = j7;
        this.f5641d = l7;
        this.f5644n = i7 == 1 ? f7 != null ? Double.valueOf(f7.doubleValue()) : null : d7;
        this.f5642e = str2;
        this.f5643f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C1446A7.m5577a(this, parcel, i7);
    }

    /* renamed from: x0 */
    public final Object m6595x0() {
        Long l7 = this.f5641d;
        if (l7 != null) {
            return l7;
        }
        Double d7 = this.f5644n;
        if (d7 != null) {
            return d7;
        }
        String str = this.f5642e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public C1891z7(C1455B7 c1455b7) {
        this(c1455b7.f4521c, c1455b7.f4522d, c1455b7.f4523e, c1455b7.f4520b);
    }

    public C1891z7(String str, long j7, Object obj, String str2) {
        AbstractC3802r.m15123e(str);
        this.f5638a = 2;
        this.f5639b = str;
        this.f5640c = j7;
        this.f5643f = str2;
        if (obj == null) {
            this.f5641d = null;
            this.f5644n = null;
            this.f5642e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f5641d = (Long) obj;
            this.f5644n = null;
            this.f5642e = null;
        } else if (obj instanceof String) {
            this.f5641d = null;
            this.f5644n = null;
            this.f5642e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f5641d = null;
                this.f5644n = (Double) obj;
                this.f5642e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}

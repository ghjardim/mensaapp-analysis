package p087M2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: M2.a */
/* loaded from: classes.dex */
public class C1146a extends AbstractC7065a {
    public static final Parcelable.Creator<C1146a> CREATOR = new C1152g();

    /* renamed from: d */
    public static final C1146a f3715d = new C1146a();

    /* renamed from: e */
    public static final C1146a f3716e = new C1146a("unavailable");

    /* renamed from: f */
    public static final C1146a f3717f = new C1146a("unused");

    /* renamed from: a */
    public final a f3718a;

    /* renamed from: b */
    public final String f3719b;

    /* renamed from: c */
    public final String f3720c;

    /* renamed from: M2.a$a */
    public enum a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<a> CREATOR = new C1151f();

        /* renamed from: a */
        public final int f3725a;

        a(int i7) {
            this.f3725a = i7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f3725a);
        }
    }

    /* renamed from: M2.a$b */
    public static class b extends Exception {
        public b(int i7) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i7)));
        }
    }

    public C1146a() {
        this.f3718a = a.ABSENT;
        this.f3720c = null;
        this.f3719b = null;
    }

    /* renamed from: A0 */
    public static a m4432A0(int i7) {
        for (a aVar : a.values()) {
            if (i7 == aVar.f3725a) {
                return aVar;
            }
        }
        throw new b(i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146a)) {
            return false;
        }
        C1146a c1146a = (C1146a) obj;
        if (!this.f3718a.equals(c1146a.f3718a)) {
            return false;
        }
        int ordinal = this.f3718a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.f3719b.equals(c1146a.f3719b);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.f3720c.equals(c1146a.f3720c);
    }

    public int hashCode() {
        int i7;
        int hashCode;
        int hashCode2 = this.f3718a.hashCode() + 31;
        int ordinal = this.f3718a.ordinal();
        if (ordinal == 1) {
            i7 = hashCode2 * 31;
            hashCode = this.f3719b.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i7 = hashCode2 * 31;
            hashCode = this.f3720c.hashCode();
        }
        return i7 + hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 2, m4435z0());
        AbstractC7067c.m29108E(parcel, 3, m4434y0(), false);
        AbstractC7067c.m29108E(parcel, 4, m4433x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m4433x0() {
        return this.f3720c;
    }

    /* renamed from: y0 */
    public String m4434y0() {
        return this.f3719b;
    }

    /* renamed from: z0 */
    public int m4435z0() {
        return this.f3718a.f3725a;
    }

    public C1146a(int i7, String str, String str2) {
        try {
            this.f3718a = m4432A0(i7);
            this.f3719b = str;
            this.f3720c = str2;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public C1146a(String str) {
        this.f3719b = (String) AbstractC3802r.m15129k(str);
        this.f3718a = a.STRING;
        this.f3720c = null;
    }
}

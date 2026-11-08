package p162X0;

import android.os.Parcel;
import android.os.Parcelable;
import p171Y2.AbstractC2920c;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5330M;

/* renamed from: X0.b */
/* loaded from: classes.dex */
public class C2798b implements C4334x.b {
    public static final Parcelable.Creator<C2798b> CREATOR = new a();

    /* renamed from: a */
    public final String f8533a;

    /* renamed from: b */
    public final String f8534b;

    /* renamed from: X0.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2798b createFromParcel(Parcel parcel) {
            return new C2798b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2798b[] newArray(int i7) {
            return new C2798b[i7];
        }
    }

    public C2798b(String str, String str2) {
        this.f8533a = AbstractC2920c.m10516f(str);
        this.f8534b = str2;
    }

    @Override // p232g0.C4334x.b
    /* renamed from: C */
    public /* synthetic */ C4327q mo8979C() {
        return AbstractC4335y.m18406b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2798b c2798b = (C2798b) obj;
        return this.f8533a.equals(c2798b.f8533a) && this.f8534b.equals(c2798b.f8534b);
    }

    public int hashCode() {
        return ((527 + this.f8533a.hashCode()) * 31) + this.f8534b.hashCode();
    }

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public void mo8980o(C4333w.b bVar) {
        String str = this.f8533a;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.m18368O(this.f8534b);
                break;
            case "TITLE":
                bVar.m18393n0(this.f8534b);
                break;
            case "DESCRIPTION":
                bVar.m18375V(this.f8534b);
                break;
            case "ALBUMARTIST":
                bVar.m18367N(this.f8534b);
                break;
            case "ARTIST":
                bVar.m18369P(this.f8534b);
                break;
        }
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public /* synthetic */ byte[] mo8981q0() {
        return AbstractC4335y.m18405a(this);
    }

    public String toString() {
        return "VC: " + this.f8533a + "=" + this.f8534b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f8533a);
        parcel.writeString(this.f8534b);
    }

    public C2798b(Parcel parcel) {
        this.f8533a = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f8534b = (String) AbstractC5330M.m21747i(parcel.readString());
    }
}

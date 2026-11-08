package p169Y0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5332a;

/* renamed from: Y0.c */
/* loaded from: classes.dex */
public final class C2893c implements C4334x.b {
    public static final Parcelable.Creator<C2893c> CREATOR = new a();

    /* renamed from: a */
    public final byte[] f8903a;

    /* renamed from: b */
    public final String f8904b;

    /* renamed from: c */
    public final String f8905c;

    /* renamed from: Y0.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2893c createFromParcel(Parcel parcel) {
            return new C2893c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2893c[] newArray(int i7) {
            return new C2893c[i7];
        }
    }

    public C2893c(byte[] bArr, String str, String str2) {
        this.f8903a = bArr;
        this.f8904b = str;
        this.f8905c = str2;
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
        if (obj == null || C2893c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8903a, ((C2893c) obj).f8903a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8903a);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public void mo8980o(C4333w.b bVar) {
        String str = this.f8904b;
        if (str != null) {
            bVar.m18393n0(str);
        }
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public /* synthetic */ byte[] mo8981q0() {
        return AbstractC4335y.m18405a(this);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f8904b, this.f8905c, Integer.valueOf(this.f8903a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f8903a);
        parcel.writeString(this.f8904b);
        parcel.writeString(this.f8905c);
    }

    public C2893c(Parcel parcel) {
        this.f8903a = (byte[]) AbstractC5332a.m21800e(parcel.createByteArray());
        this.f8904b = parcel.readString();
        this.f8905c = parcel.readString();
    }
}

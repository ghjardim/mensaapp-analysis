package p148V0;

import android.os.Parcel;
import android.os.Parcelable;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p259j0.AbstractC5332a;

/* renamed from: V0.a */
/* loaded from: classes.dex */
public final class C2606a implements C4334x.b {
    public static final Parcelable.Creator<C2606a> CREATOR = new a();

    /* renamed from: a */
    public final int f7716a;

    /* renamed from: b */
    public final String f7717b;

    /* renamed from: V0.a$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2606a createFromParcel(Parcel parcel) {
            return new C2606a(parcel.readInt(), (String) AbstractC5332a.m21800e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2606a[] newArray(int i7) {
            return new C2606a[i7];
        }
    }

    public C2606a(int i7, String str) {
        this.f7716a = i7;
        this.f7717b = str;
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

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public /* synthetic */ void mo8980o(C4333w.b bVar) {
        AbstractC4335y.m18407c(this, bVar);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public /* synthetic */ byte[] mo8981q0() {
        return AbstractC4335y.m18405a(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f7716a + ",url=" + this.f7717b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f7717b);
        parcel.writeInt(this.f7716a);
    }
}

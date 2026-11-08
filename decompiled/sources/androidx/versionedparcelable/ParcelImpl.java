package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p044G1.C0378b;
import p044G1.InterfaceC0379c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C3468a();

    /* renamed from: a */
    public final InterfaceC0379c f11632a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C3468a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i7) {
            return new ParcelImpl[i7];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f11632a = new C0378b(parcel).m1562u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        new C0378b(parcel).m1539L(this.f11632a);
    }
}

package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p080L2.C0916E;

/* renamed from: L2.d0 */
/* loaded from: classes.dex */
public final class C0949d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C0916E.a.m3784b(parcel.readString());
        } catch (C0916E.b e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0916E.a[i7];
    }
}

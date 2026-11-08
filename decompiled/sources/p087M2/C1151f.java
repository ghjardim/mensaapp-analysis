package p087M2;

import android.os.Parcel;
import android.os.Parcelable;
import p087M2.C1146a;

/* renamed from: M2.f */
/* loaded from: classes.dex */
public final class C1151f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C1146a.m4432A0(parcel.readInt());
        } catch (C1146a.b e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1146a.a[i7];
    }
}

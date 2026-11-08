package p361v2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v2.j */
/* loaded from: classes.dex */
public final class C6729j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C6731l(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6731l[i7];
    }
}

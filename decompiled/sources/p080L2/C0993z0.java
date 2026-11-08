package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p080L2.C0970o;

/* renamed from: L2.z0 */
/* loaded from: classes.dex */
public final class C0993z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C0970o.m3823a(parcel.readInt());
        } catch (C0970o.a e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0970o[i7];
    }
}

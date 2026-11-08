package p157W2;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: W2.q */
/* loaded from: classes.dex */
public abstract class AbstractC2691q {

    /* renamed from: a */
    public static final ClassLoader f7939a = AbstractC2691q.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m9185a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m9186b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    /* renamed from: c */
    public static void m9187c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

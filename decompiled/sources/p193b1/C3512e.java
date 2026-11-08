package p193b1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b1.e */
/* loaded from: classes.dex */
public final class C3512e extends AbstractC3509b {
    public static final Parcelable.Creator<C3512e> CREATOR = new a();

    /* renamed from: b1.e$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3512e createFromParcel(Parcel parcel) {
            return new C3512e();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3512e[] newArray(int i7) {
            return new C3512e[i7];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
    }
}

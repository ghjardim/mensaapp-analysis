package p201c1;

import android.os.Parcel;
import android.os.Parcelable;
import p162X0.C2798b;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public final class C3569a extends C2798b {
    public static final Parcelable.Creator<C3569a> CREATOR = new a();

    /* renamed from: c1.a$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3569a createFromParcel(Parcel parcel) {
            return new C3569a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3569a[] newArray(int i7) {
            return new C3569a[i7];
        }
    }

    public C3569a(String str, String str2) {
        super(str, str2);
    }

    public C3569a(Parcel parcel) {
        super(parcel);
    }
}

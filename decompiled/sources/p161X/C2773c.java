package p161X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.c */
/* loaded from: classes.dex */
public class C2773c implements Parcelable {
    public static final Parcelable.Creator<C2773c> CREATOR = new a();

    /* renamed from: a */
    public final List f8328a;

    /* renamed from: b */
    public final List f8329b;

    /* renamed from: X.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2773c createFromParcel(Parcel parcel) {
            return new C2773c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2773c[] newArray(int i7) {
            return new C2773c[i7];
        }
    }

    public C2773c(Parcel parcel) {
        this.f8328a = parcel.createStringArrayList();
        this.f8329b = parcel.createTypedArrayList(C2771b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f8328a);
        parcel.writeTypedList(this.f8329b);
    }
}

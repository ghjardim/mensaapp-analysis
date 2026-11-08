package p161X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p161X.AbstractC2752I;

/* renamed from: X.K */
/* loaded from: classes.dex */
public final class C2754K implements Parcelable {
    public static final Parcelable.Creator<C2754K> CREATOR = new a();

    /* renamed from: a */
    public ArrayList f8170a;

    /* renamed from: b */
    public ArrayList f8171b;

    /* renamed from: c */
    public C2771b[] f8172c;

    /* renamed from: d */
    public int f8173d;

    /* renamed from: e */
    public String f8174e;

    /* renamed from: f */
    public ArrayList f8175f;

    /* renamed from: n */
    public ArrayList f8176n;

    /* renamed from: o */
    public ArrayList f8177o;

    /* renamed from: X.K$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2754K createFromParcel(Parcel parcel) {
            return new C2754K(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2754K[] newArray(int i7) {
            return new C2754K[i7];
        }
    }

    public C2754K() {
        this.f8174e = null;
        this.f8175f = new ArrayList();
        this.f8176n = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f8170a);
        parcel.writeStringList(this.f8171b);
        parcel.writeTypedArray(this.f8172c, i7);
        parcel.writeInt(this.f8173d);
        parcel.writeString(this.f8174e);
        parcel.writeStringList(this.f8175f);
        parcel.writeTypedList(this.f8176n);
        parcel.writeTypedList(this.f8177o);
    }

    public C2754K(Parcel parcel) {
        this.f8174e = null;
        this.f8175f = new ArrayList();
        this.f8176n = new ArrayList();
        this.f8170a = parcel.createStringArrayList();
        this.f8171b = parcel.createStringArrayList();
        this.f8172c = (C2771b[]) parcel.createTypedArray(C2771b.CREATOR);
        this.f8173d = parcel.readInt();
        this.f8174e = parcel.readString();
        this.f8175f = parcel.createStringArrayList();
        this.f8176n = parcel.createTypedArrayList(C2773c.CREATOR);
        this.f8177o = parcel.createTypedArrayList(AbstractC2752I.k.CREATOR);
    }
}

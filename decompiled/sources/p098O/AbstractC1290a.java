package p098O;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O.a */
/* loaded from: classes.dex */
public abstract class AbstractC1290a implements Parcelable {

    /* renamed from: a */
    public final Parcelable f4043a;

    /* renamed from: b */
    public static final AbstractC1290a f4042b = new a();
    public static final Parcelable.Creator<AbstractC1290a> CREATOR = new b();

    /* renamed from: O.a$a */
    public class a extends AbstractC1290a {
        public a() {
            super((a) null);
        }
    }

    /* renamed from: O.a$b */
    public class b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1290a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC1290a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC1290a.f4042b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC1290a[] newArray(int i7) {
            return new AbstractC1290a[i7];
        }
    }

    public /* synthetic */ AbstractC1290a(a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable m4904a() {
        return this.f4043a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f4043a, i7);
    }

    public AbstractC1290a() {
        this.f4043a = null;
    }

    public AbstractC1290a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4043a = parcelable == f4042b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC1290a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4043a = readParcelable == null ? f4042b : readParcelable;
    }
}

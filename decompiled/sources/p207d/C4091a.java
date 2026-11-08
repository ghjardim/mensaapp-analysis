package p207d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: d.a */
/* loaded from: classes.dex */
public final class C4091a implements Parcelable {

    /* renamed from: a */
    public final int f13639a;

    /* renamed from: b */
    public final Intent f13640b;

    /* renamed from: c */
    public static final b f13638c = new b(null);
    public static final Parcelable.Creator<C4091a> CREATOR = new a();

    /* renamed from: d.a$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4091a createFromParcel(Parcel parcel) {
            AbstractC5469l.m23028e(parcel, "parcel");
            return new C4091a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4091a[] newArray(int i7) {
            return new C4091a[i7];
        }
    }

    /* renamed from: d.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final String m17158a(int i7) {
            return i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK";
        }

        public b() {
        }
    }

    public C4091a(int i7, Intent intent) {
        this.f13639a = i7;
        this.f13640b = intent;
    }

    /* renamed from: a */
    public final Intent m17154a() {
        return this.f13640b;
    }

    /* renamed from: b */
    public final int m17155b() {
        return this.f13639a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f13638c.m17158a(this.f13639a) + ", data=" + this.f13640b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        AbstractC5469l.m23028e(dest, "dest");
        dest.writeInt(this.f13639a);
        dest.writeInt(this.f13640b == null ? 0 : 1);
        Intent intent = this.f13640b;
        if (intent != null) {
            intent.writeToParcel(dest, i7);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4091a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        AbstractC5469l.m23028e(parcel, "parcel");
    }
}

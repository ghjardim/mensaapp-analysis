package p343t0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p232g0.AbstractC4335y;
import p232g0.C4327q;
import p232g0.C4333w;
import p232g0.C4334x;
import p256j$.util.DesugarCollections;

/* renamed from: t0.t */
/* loaded from: classes.dex */
public final class C6426t implements C4334x.b {
    public static final Parcelable.Creator<C6426t> CREATOR = new a();

    /* renamed from: a */
    public final String f23311a;

    /* renamed from: b */
    public final String f23312b;

    /* renamed from: c */
    public final List f23313c;

    /* renamed from: t0.t$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6426t createFromParcel(Parcel parcel) {
            return new C6426t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6426t[] newArray(int i7) {
            return new C6426t[i7];
        }
    }

    public C6426t(String str, String str2, List list) {
        this.f23311a = str;
        this.f23312b = str2;
        this.f23313c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // p232g0.C4334x.b
    /* renamed from: C */
    public /* synthetic */ C4327q mo8979C() {
        return AbstractC4335y.m18406b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6426t.class != obj.getClass()) {
            return false;
        }
        C6426t c6426t = (C6426t) obj;
        return TextUtils.equals(this.f23311a, c6426t.f23311a) && TextUtils.equals(this.f23312b, c6426t.f23312b) && this.f23313c.equals(c6426t.f23313c);
    }

    public int hashCode() {
        String str = this.f23311a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23312b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f23313c.hashCode();
    }

    @Override // p232g0.C4334x.b
    /* renamed from: o */
    public /* synthetic */ void mo8980o(C4333w.b bVar) {
        AbstractC4335y.m18407c(this, bVar);
    }

    @Override // p232g0.C4334x.b
    /* renamed from: q0 */
    public /* synthetic */ byte[] mo8981q0() {
        return AbstractC4335y.m18405a(this);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f23311a != null) {
            str = " [" + this.f23311a + ", " + this.f23312b + "]";
        } else {
            str = StringUtils.EMPTY;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f23311a);
        parcel.writeString(this.f23312b);
        int size = this.f23313c.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeParcelable((Parcelable) this.f23313c.get(i8), 0);
        }
    }

    public C6426t(Parcel parcel) {
        this.f23311a = parcel.readString();
        this.f23312b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f23313c = DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: t0.t$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        public final int f23314a;

        /* renamed from: b */
        public final int f23315b;

        /* renamed from: c */
        public final String f23316c;

        /* renamed from: d */
        public final String f23317d;

        /* renamed from: e */
        public final String f23318e;

        /* renamed from: f */
        public final String f23319f;

        /* renamed from: t0.t$b$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        public b(int i7, int i8, String str, String str2, String str3, String str4) {
            this.f23314a = i7;
            this.f23315b = i8;
            this.f23316c = str;
            this.f23317d = str2;
            this.f23318e = str3;
            this.f23319f = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23314a == bVar.f23314a && this.f23315b == bVar.f23315b && TextUtils.equals(this.f23316c, bVar.f23316c) && TextUtils.equals(this.f23317d, bVar.f23317d) && TextUtils.equals(this.f23318e, bVar.f23318e) && TextUtils.equals(this.f23319f, bVar.f23319f);
        }

        public int hashCode() {
            int i7 = ((this.f23314a * 31) + this.f23315b) * 31;
            String str = this.f23316c;
            int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f23317d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f23318e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f23319f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f23314a);
            parcel.writeInt(this.f23315b);
            parcel.writeString(this.f23316c);
            parcel.writeString(this.f23317d);
            parcel.writeString(this.f23318e);
            parcel.writeString(this.f23319f);
        }

        public b(Parcel parcel) {
            this.f23314a = parcel.readInt();
            this.f23315b = parcel.readInt();
            this.f23316c = parcel.readString();
            this.f23317d = parcel.readString();
            this.f23318e = parcel.readString();
            this.f23319f = parcel.readString();
        }
    }
}

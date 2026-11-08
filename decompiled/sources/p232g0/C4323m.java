package p232g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.m */
/* loaded from: classes.dex */
public final class C4323m implements Comparator, Parcelable {
    public static final Parcelable.Creator<C4323m> CREATOR = new a();

    /* renamed from: a */
    public final b[] f15067a;

    /* renamed from: b */
    public int f15068b;

    /* renamed from: c */
    public final String f15069c;

    /* renamed from: d */
    public final int f15070d;

    /* renamed from: g0.m$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4323m createFromParcel(Parcel parcel) {
            return new C4323m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4323m[] newArray(int i7) {
            return new C4323m[i7];
        }
    }

    /* renamed from: g0.m$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        public int f15071a;

        /* renamed from: b */
        public final UUID f15072b;

        /* renamed from: c */
        public final String f15073c;

        /* renamed from: d */
        public final String f15074d;

        /* renamed from: e */
        public final byte[] f15075e;

        /* renamed from: g0.m$b$a */
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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        /* renamed from: a */
        public boolean m18173a(b bVar) {
            return m18175c() && !bVar.m18175c() && m18176d(bVar.f15072b);
        }

        /* renamed from: b */
        public b m18174b(byte[] bArr) {
            return new b(this.f15072b, this.f15073c, this.f15074d, bArr);
        }

        /* renamed from: c */
        public boolean m18175c() {
            return this.f15075e != null;
        }

        /* renamed from: d */
        public boolean m18176d(UUID uuid) {
            return AbstractC4317g.f15027a.equals(this.f15072b) || uuid.equals(this.f15072b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return AbstractC5330M.m21729c(this.f15073c, bVar.f15073c) && AbstractC5330M.m21729c(this.f15074d, bVar.f15074d) && AbstractC5330M.m21729c(this.f15072b, bVar.f15072b) && Arrays.equals(this.f15075e, bVar.f15075e);
        }

        public int hashCode() {
            if (this.f15071a == 0) {
                int hashCode = this.f15072b.hashCode() * 31;
                String str = this.f15073c;
                this.f15071a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f15074d.hashCode()) * 31) + Arrays.hashCode(this.f15075e);
            }
            return this.f15071a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.f15072b.getMostSignificantBits());
            parcel.writeLong(this.f15072b.getLeastSignificantBits());
            parcel.writeString(this.f15073c);
            parcel.writeString(this.f15074d);
            parcel.writeByteArray(this.f15075e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f15072b = (UUID) AbstractC5332a.m21800e(uuid);
            this.f15073c = str;
            this.f15074d = AbstractC4336z.m18427t((String) AbstractC5332a.m21800e(str2));
            this.f15075e = bArr;
        }

        public b(Parcel parcel) {
            this.f15072b = new UUID(parcel.readLong(), parcel.readLong());
            this.f15073c = parcel.readString();
            this.f15074d = (String) AbstractC5330M.m21747i(parcel.readString());
            this.f15075e = parcel.createByteArray();
        }
    }

    public C4323m(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    /* renamed from: b */
    public static boolean m18165b(ArrayList arrayList, int i7, UUID uuid) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (((b) arrayList.get(i8)).f15072b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static C4323m m18166d(C4323m c4323m, C4323m c4323m2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c4323m != null) {
            str = c4323m.f15069c;
            for (b bVar : c4323m.f15067a) {
                if (bVar.m18175c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c4323m2 != null) {
            if (str == null) {
                str = c4323m2.f15069c;
            }
            int size = arrayList.size();
            for (b bVar2 : c4323m2.f15067a) {
                if (bVar2.m18175c() && !m18165b(arrayList, size, bVar2.f15072b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4323m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = AbstractC4317g.f15027a;
        return uuid.equals(bVar.f15072b) ? uuid.equals(bVar2.f15072b) ? 0 : 1 : bVar.f15072b.compareTo(bVar2.f15072b);
    }

    /* renamed from: c */
    public C4323m m18168c(String str) {
        return AbstractC5330M.m21729c(this.f15069c, str) ? this : new C4323m(str, false, this.f15067a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public b m18169e(int i7) {
        return this.f15067a[i7];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4323m.class != obj.getClass()) {
            return false;
        }
        C4323m c4323m = (C4323m) obj;
        return AbstractC5330M.m21729c(this.f15069c, c4323m.f15069c) && Arrays.equals(this.f15067a, c4323m.f15067a);
    }

    /* renamed from: f */
    public C4323m m18170f(C4323m c4323m) {
        String str;
        String str2 = this.f15069c;
        AbstractC5332a.m21802g(str2 == null || (str = c4323m.f15069c) == null || TextUtils.equals(str2, str));
        String str3 = this.f15069c;
        if (str3 == null) {
            str3 = c4323m.f15069c;
        }
        return new C4323m(str3, (b[]) AbstractC5330M.m21700O0(this.f15067a, c4323m.f15067a));
    }

    public int hashCode() {
        if (this.f15068b == 0) {
            String str = this.f15069c;
            this.f15068b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f15067a);
        }
        return this.f15068b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f15069c);
        parcel.writeTypedArray(this.f15067a, 0);
    }

    public C4323m(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C4323m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C4323m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C4323m(String str, boolean z6, b... bVarArr) {
        this.f15069c = str;
        bVarArr = z6 ? (b[]) bVarArr.clone() : bVarArr;
        this.f15067a = bVarArr;
        this.f15070d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C4323m(Parcel parcel) {
        this.f15069c = parcel.readString();
        b[] bVarArr = (b[]) AbstractC5330M.m21747i((b[]) parcel.createTypedArray(b.CREATOR));
        this.f15067a = bVarArr;
        this.f15070d = bVarArr.length;
    }
}

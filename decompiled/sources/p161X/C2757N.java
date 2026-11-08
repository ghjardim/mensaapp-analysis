package p161X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC3345j;

/* renamed from: X.N */
/* loaded from: classes.dex */
public final class C2757N implements Parcelable {
    public static final Parcelable.Creator<C2757N> CREATOR = new a();

    /* renamed from: a */
    public final String f8186a;

    /* renamed from: b */
    public final String f8187b;

    /* renamed from: c */
    public final boolean f8188c;

    /* renamed from: d */
    public final int f8189d;

    /* renamed from: e */
    public final int f8190e;

    /* renamed from: f */
    public final String f8191f;

    /* renamed from: n */
    public final boolean f8192n;

    /* renamed from: o */
    public final boolean f8193o;

    /* renamed from: p */
    public final boolean f8194p;

    /* renamed from: q */
    public final boolean f8195q;

    /* renamed from: r */
    public final int f8196r;

    /* renamed from: s */
    public final String f8197s;

    /* renamed from: t */
    public final int f8198t;

    /* renamed from: u */
    public final boolean f8199u;

    /* renamed from: X.N$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2757N createFromParcel(Parcel parcel) {
            return new C2757N(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2757N[] newArray(int i7) {
            return new C2757N[i7];
        }
    }

    public C2757N(AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p) {
        this.f8186a = abstractComponentCallbacksC2786p.getClass().getName();
        this.f8187b = abstractComponentCallbacksC2786p.f8455f;
        this.f8188c = abstractComponentCallbacksC2786p.f8470w;
        this.f8189d = abstractComponentCallbacksC2786p.f8424F;
        this.f8190e = abstractComponentCallbacksC2786p.f8425G;
        this.f8191f = abstractComponentCallbacksC2786p.f8426H;
        this.f8192n = abstractComponentCallbacksC2786p.f8429K;
        this.f8193o = abstractComponentCallbacksC2786p.f8467t;
        this.f8194p = abstractComponentCallbacksC2786p.f8428J;
        this.f8195q = abstractComponentCallbacksC2786p.f8427I;
        this.f8196r = abstractComponentCallbacksC2786p.f8446a0.ordinal();
        this.f8197s = abstractComponentCallbacksC2786p.f8463p;
        this.f8198t = abstractComponentCallbacksC2786p.f8464q;
        this.f8199u = abstractComponentCallbacksC2786p.f8437S;
    }

    /* renamed from: a */
    public AbstractComponentCallbacksC2786p m9559a(AbstractC2796z abstractC2796z, ClassLoader classLoader) {
        AbstractComponentCallbacksC2786p mo9528a = abstractC2796z.mo9528a(classLoader, this.f8186a);
        mo9528a.f8455f = this.f8187b;
        mo9528a.f8470w = this.f8188c;
        mo9528a.f8472y = true;
        mo9528a.f8424F = this.f8189d;
        mo9528a.f8425G = this.f8190e;
        mo9528a.f8426H = this.f8191f;
        mo9528a.f8429K = this.f8192n;
        mo9528a.f8467t = this.f8193o;
        mo9528a.f8428J = this.f8194p;
        mo9528a.f8427I = this.f8195q;
        mo9528a.f8446a0 = AbstractC3345j.b.values()[this.f8196r];
        mo9528a.f8463p = this.f8197s;
        mo9528a.f8464q = this.f8198t;
        mo9528a.f8437S = this.f8199u;
        return mo9528a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f8186a);
        sb.append(" (");
        sb.append(this.f8187b);
        sb.append(")}:");
        if (this.f8188c) {
            sb.append(" fromLayout");
        }
        if (this.f8190e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f8190e));
        }
        String str = this.f8191f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f8191f);
        }
        if (this.f8192n) {
            sb.append(" retainInstance");
        }
        if (this.f8193o) {
            sb.append(" removing");
        }
        if (this.f8194p) {
            sb.append(" detached");
        }
        if (this.f8195q) {
            sb.append(" hidden");
        }
        if (this.f8197s != null) {
            sb.append(" targetWho=");
            sb.append(this.f8197s);
            sb.append(" targetRequestCode=");
            sb.append(this.f8198t);
        }
        if (this.f8199u) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f8186a);
        parcel.writeString(this.f8187b);
        parcel.writeInt(this.f8188c ? 1 : 0);
        parcel.writeInt(this.f8189d);
        parcel.writeInt(this.f8190e);
        parcel.writeString(this.f8191f);
        parcel.writeInt(this.f8192n ? 1 : 0);
        parcel.writeInt(this.f8193o ? 1 : 0);
        parcel.writeInt(this.f8194p ? 1 : 0);
        parcel.writeInt(this.f8195q ? 1 : 0);
        parcel.writeInt(this.f8196r);
        parcel.writeString(this.f8197s);
        parcel.writeInt(this.f8198t);
        parcel.writeInt(this.f8199u ? 1 : 0);
    }

    public C2757N(Parcel parcel) {
        this.f8186a = parcel.readString();
        this.f8187b = parcel.readString();
        this.f8188c = parcel.readInt() != 0;
        this.f8189d = parcel.readInt();
        this.f8190e = parcel.readInt();
        this.f8191f = parcel.readString();
        this.f8192n = parcel.readInt() != 0;
        this.f8193o = parcel.readInt() != 0;
        this.f8194p = parcel.readInt() != 0;
        this.f8195q = parcel.readInt() != 0;
        this.f8196r = parcel.readInt();
        this.f8197s = parcel.readString();
        this.f8198t = parcel.readInt();
        this.f8199u = parcel.readInt() != 0;
    }
}

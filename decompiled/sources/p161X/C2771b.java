package p161X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC3345j;
import java.util.ArrayList;
import p161X.AbstractC2760Q;

/* renamed from: X.b */
/* loaded from: classes.dex */
public final class C2771b implements Parcelable {
    public static final Parcelable.Creator<C2771b> CREATOR = new a();

    /* renamed from: a */
    public final int[] f8314a;

    /* renamed from: b */
    public final ArrayList f8315b;

    /* renamed from: c */
    public final int[] f8316c;

    /* renamed from: d */
    public final int[] f8317d;

    /* renamed from: e */
    public final int f8318e;

    /* renamed from: f */
    public final String f8319f;

    /* renamed from: n */
    public final int f8320n;

    /* renamed from: o */
    public final int f8321o;

    /* renamed from: p */
    public final CharSequence f8322p;

    /* renamed from: q */
    public final int f8323q;

    /* renamed from: r */
    public final CharSequence f8324r;

    /* renamed from: s */
    public final ArrayList f8325s;

    /* renamed from: t */
    public final ArrayList f8326t;

    /* renamed from: u */
    public final boolean f8327u;

    /* renamed from: X.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2771b createFromParcel(Parcel parcel) {
            return new C2771b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2771b[] newArray(int i7) {
            return new C2771b[i7];
        }
    }

    public C2771b(C2769a c2769a) {
        int size = c2769a.f8214c.size();
        this.f8314a = new int[size * 6];
        if (!c2769a.f8220i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f8315b = new ArrayList(size);
        this.f8316c = new int[size];
        this.f8317d = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC2760Q.a aVar = (AbstractC2760Q.a) c2769a.f8214c.get(i8);
            int i9 = i7 + 1;
            this.f8314a[i7] = aVar.f8231a;
            ArrayList arrayList = this.f8315b;
            AbstractComponentCallbacksC2786p abstractComponentCallbacksC2786p = aVar.f8232b;
            arrayList.add(abstractComponentCallbacksC2786p != null ? abstractComponentCallbacksC2786p.f8455f : null);
            int[] iArr = this.f8314a;
            iArr[i9] = aVar.f8233c ? 1 : 0;
            iArr[i7 + 2] = aVar.f8234d;
            iArr[i7 + 3] = aVar.f8235e;
            int i10 = i7 + 5;
            iArr[i7 + 4] = aVar.f8236f;
            i7 += 6;
            iArr[i10] = aVar.f8237g;
            this.f8316c[i8] = aVar.f8238h.ordinal();
            this.f8317d[i8] = aVar.f8239i.ordinal();
        }
        this.f8318e = c2769a.f8219h;
        this.f8319f = c2769a.f8222k;
        this.f8320n = c2769a.f8312v;
        this.f8321o = c2769a.f8223l;
        this.f8322p = c2769a.f8224m;
        this.f8323q = c2769a.f8225n;
        this.f8324r = c2769a.f8226o;
        this.f8325s = c2769a.f8227p;
        this.f8326t = c2769a.f8228q;
        this.f8327u = c2769a.f8229r;
    }

    /* renamed from: a */
    public final void m9723a(C2769a c2769a) {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean z6 = true;
            if (i7 >= this.f8314a.length) {
                c2769a.f8219h = this.f8318e;
                c2769a.f8222k = this.f8319f;
                c2769a.f8220i = true;
                c2769a.f8223l = this.f8321o;
                c2769a.f8224m = this.f8322p;
                c2769a.f8225n = this.f8323q;
                c2769a.f8226o = this.f8324r;
                c2769a.f8227p = this.f8325s;
                c2769a.f8228q = this.f8326t;
                c2769a.f8229r = this.f8327u;
                return;
            }
            AbstractC2760Q.a aVar = new AbstractC2760Q.a();
            int i9 = i7 + 1;
            aVar.f8231a = this.f8314a[i7];
            if (AbstractC2752I.m9397I0(2)) {
                Log.v("FragmentManager", "Instantiate " + c2769a + " op #" + i8 + " base fragment #" + this.f8314a[i9]);
            }
            aVar.f8238h = AbstractC3345j.b.values()[this.f8316c[i8]];
            aVar.f8239i = AbstractC3345j.b.values()[this.f8317d[i8]];
            int[] iArr = this.f8314a;
            int i10 = i7 + 2;
            if (iArr[i9] == 0) {
                z6 = false;
            }
            aVar.f8233c = z6;
            int i11 = iArr[i10];
            aVar.f8234d = i11;
            int i12 = iArr[i7 + 3];
            aVar.f8235e = i12;
            int i13 = i7 + 5;
            int i14 = iArr[i7 + 4];
            aVar.f8236f = i14;
            i7 += 6;
            int i15 = iArr[i13];
            aVar.f8237g = i15;
            c2769a.f8215d = i11;
            c2769a.f8216e = i12;
            c2769a.f8217f = i14;
            c2769a.f8218g = i15;
            c2769a.m9614e(aVar);
            i8++;
        }
    }

    /* renamed from: b */
    public C2769a m9724b(AbstractC2752I abstractC2752I) {
        C2769a c2769a = new C2769a(abstractC2752I);
        m9723a(c2769a);
        c2769a.f8312v = this.f8320n;
        for (int i7 = 0; i7 < this.f8315b.size(); i7++) {
            String str = (String) this.f8315b.get(i7);
            if (str != null) {
                ((AbstractC2760Q.a) c2769a.f8214c.get(i7)).f8232b = abstractC2752I.m9468f0(str);
            }
        }
        c2769a.m9713n(1);
        return c2769a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f8314a);
        parcel.writeStringList(this.f8315b);
        parcel.writeIntArray(this.f8316c);
        parcel.writeIntArray(this.f8317d);
        parcel.writeInt(this.f8318e);
        parcel.writeString(this.f8319f);
        parcel.writeInt(this.f8320n);
        parcel.writeInt(this.f8321o);
        TextUtils.writeToParcel(this.f8322p, parcel, 0);
        parcel.writeInt(this.f8323q);
        TextUtils.writeToParcel(this.f8324r, parcel, 0);
        parcel.writeStringList(this.f8325s);
        parcel.writeStringList(this.f8326t);
        parcel.writeInt(this.f8327u ? 1 : 0);
    }

    public C2771b(Parcel parcel) {
        this.f8314a = parcel.createIntArray();
        this.f8315b = parcel.createStringArrayList();
        this.f8316c = parcel.createIntArray();
        this.f8317d = parcel.createIntArray();
        this.f8318e = parcel.readInt();
        this.f8319f = parcel.readString();
        this.f8320n = parcel.readInt();
        this.f8321o = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f8322p = (CharSequence) creator.createFromParcel(parcel);
        this.f8323q = parcel.readInt();
        this.f8324r = (CharSequence) creator.createFromParcel(parcel);
        this.f8325s = parcel.createStringArrayList();
        this.f8326t = parcel.createStringArrayList();
        this.f8327u = parcel.readInt() != 0;
    }
}

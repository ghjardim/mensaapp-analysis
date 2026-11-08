package p044G1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import org.apache.tika.utils.StringUtils;
import p334s.C6308a;

/* renamed from: G1.b */
/* loaded from: classes.dex */
public class C0378b extends AbstractC0377a {

    /* renamed from: d */
    public final SparseIntArray f1477d;

    /* renamed from: e */
    public final Parcel f1478e;

    /* renamed from: f */
    public final int f1479f;

    /* renamed from: g */
    public final int f1480g;

    /* renamed from: h */
    public final String f1481h;

    /* renamed from: i */
    public int f1482i;

    /* renamed from: j */
    public int f1483j;

    /* renamed from: k */
    public int f1484k;

    public C0378b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), StringUtils.EMPTY, new C6308a(), new C6308a(), new C6308a());
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: A */
    public void mo1528A(byte[] bArr) {
        if (bArr == null) {
            this.f1478e.writeInt(-1);
        } else {
            this.f1478e.writeInt(bArr.length);
            this.f1478e.writeByteArray(bArr);
        }
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: C */
    public void mo1530C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1478e, 0);
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: E */
    public void mo1532E(int i7) {
        this.f1478e.writeInt(i7);
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: G */
    public void mo1534G(Parcelable parcelable) {
        this.f1478e.writeParcelable(parcelable, 0);
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: I */
    public void mo1536I(String str) {
        this.f1478e.writeString(str);
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: a */
    public void mo1542a() {
        int i7 = this.f1482i;
        if (i7 >= 0) {
            int i8 = this.f1477d.get(i7);
            int dataPosition = this.f1478e.dataPosition();
            this.f1478e.setDataPosition(i8);
            this.f1478e.writeInt(dataPosition - i8);
            this.f1478e.setDataPosition(dataPosition);
        }
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: b */
    public AbstractC0377a mo1543b() {
        Parcel parcel = this.f1478e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f1483j;
        if (i7 == this.f1479f) {
            i7 = this.f1480g;
        }
        return new C0378b(parcel, dataPosition, i7, this.f1481h + "  ", this.f1474a, this.f1475b, this.f1476c);
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: g */
    public boolean mo1548g() {
        return this.f1478e.readInt() != 0;
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: i */
    public byte[] mo1550i() {
        int readInt = this.f1478e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1478e.readByteArray(bArr);
        return bArr;
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: k */
    public CharSequence mo1552k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1478e);
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: m */
    public boolean mo1554m(int i7) {
        while (this.f1483j < this.f1480g) {
            int i8 = this.f1484k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            this.f1478e.setDataPosition(this.f1483j);
            int readInt = this.f1478e.readInt();
            this.f1484k = this.f1478e.readInt();
            this.f1483j += readInt;
        }
        return this.f1484k == i7;
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: o */
    public int mo1556o() {
        return this.f1478e.readInt();
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: q */
    public Parcelable mo1558q() {
        return this.f1478e.readParcelable(getClass().getClassLoader());
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: s */
    public String mo1560s() {
        return this.f1478e.readString();
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: w */
    public void mo1564w(int i7) {
        mo1542a();
        this.f1482i = i7;
        this.f1477d.put(i7, this.f1478e.dataPosition());
        mo1532E(0);
        mo1532E(i7);
    }

    @Override // p044G1.AbstractC0377a
    /* renamed from: y */
    public void mo1566y(boolean z6) {
        this.f1478e.writeInt(z6 ? 1 : 0);
    }

    public C0378b(Parcel parcel, int i7, int i8, String str, C6308a c6308a, C6308a c6308a2, C6308a c6308a3) {
        super(c6308a, c6308a2, c6308a3);
        this.f1477d = new SparseIntArray();
        this.f1482i = -1;
        this.f1484k = -1;
        this.f1478e = parcel;
        this.f1479f = i7;
        this.f1480g = i8;
        this.f1483j = i7;
        this.f1481h = str;
    }
}

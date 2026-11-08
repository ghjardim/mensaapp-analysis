package p176Z0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p232g0.C4333w;
import p259j0.AbstractC5330M;

/* renamed from: Z0.a */
/* loaded from: classes.dex */
public final class C2959a extends AbstractC2967i {
    public static final Parcelable.Creator<C2959a> CREATOR = new a();

    /* renamed from: b */
    public final String f9082b;

    /* renamed from: c */
    public final String f9083c;

    /* renamed from: d */
    public final int f9084d;

    /* renamed from: e */
    public final byte[] f9085e;

    /* renamed from: Z0.a$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2959a createFromParcel(Parcel parcel) {
            return new C2959a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2959a[] newArray(int i7) {
            return new C2959a[i7];
        }
    }

    public C2959a(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f9082b = str;
        this.f9083c = str2;
        this.f9084d = i7;
        this.f9085e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2959a.class != obj.getClass()) {
            return false;
        }
        C2959a c2959a = (C2959a) obj;
        return this.f9084d == c2959a.f9084d && AbstractC5330M.m21729c(this.f9082b, c2959a.f9082b) && AbstractC5330M.m21729c(this.f9083c, c2959a.f9083c) && Arrays.equals(this.f9085e, c2959a.f9085e);
    }

    public int hashCode() {
        int i7 = (527 + this.f9084d) * 31;
        String str = this.f9082b;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9083c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9085e);
    }

    @Override // p176Z0.AbstractC2967i, p232g0.C4334x.b
    /* renamed from: o */
    public void mo8980o(C4333w.b bVar) {
        bVar.m18363J(this.f9085e, this.f9084d);
    }

    @Override // p176Z0.AbstractC2967i
    public String toString() {
        return this.f9110a + ": mimeType=" + this.f9082b + ", description=" + this.f9083c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9082b);
        parcel.writeString(this.f9083c);
        parcel.writeInt(this.f9084d);
        parcel.writeByteArray(this.f9085e);
    }

    public C2959a(Parcel parcel) {
        super("APIC");
        this.f9082b = (String) AbstractC5330M.m21747i(parcel.readString());
        this.f9083c = parcel.readString();
        this.f9084d = parcel.readInt();
        this.f9085e = (byte[]) AbstractC5330M.m21747i(parcel.createByteArray());
    }
}

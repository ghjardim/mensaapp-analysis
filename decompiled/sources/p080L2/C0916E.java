package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.E */
/* loaded from: classes.dex */
public class C0916E extends AbstractC7065a {
    public static final Parcelable.Creator<C0916E> CREATOR = new C0951e0();

    /* renamed from: c */
    public static final C0916E f3182c = new C0916E(a.SUPPORTED.toString(), null);

    /* renamed from: d */
    public static final C0916E f3183d = new C0916E(a.NOT_SUPPORTED.toString(), null);

    /* renamed from: a */
    public final a f3184a;

    /* renamed from: b */
    public final String f3185b;

    /* renamed from: L2.E$a */
    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new C0949d0();

        /* renamed from: a */
        public final String f3190a;

        a(String str) {
            this.f3190a = str;
        }

        /* renamed from: b */
        public static a m3784b(String str) {
            for (a aVar : values()) {
                if (str.equals(aVar.f3190a)) {
                    return aVar;
                }
            }
            throw new b(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f3190a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f3190a);
        }
    }

    /* renamed from: L2.E$b */
    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public C0916E(String str, String str2) {
        AbstractC3802r.m15129k(str);
        try {
            this.f3184a = a.m3784b(str);
            this.f3185b = str2;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0916E)) {
            return false;
        }
        C0916E c0916e = (C0916E) obj;
        return zzao.zza(this.f3184a, c0916e.f3184a) && zzao.zza(this.f3185b, c0916e.f3185b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3184a, this.f3185b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, m3783y0(), false);
        AbstractC7067c.m29108E(parcel, 3, m3782x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m3782x0() {
        return this.f3185b;
    }

    /* renamed from: y0 */
    public String m3783y0() {
        return this.f3184a.toString();
    }
}

package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: L2.o */
/* loaded from: classes.dex */
public class C0970o implements Parcelable {
    public static final Parcelable.Creator<C0970o> CREATOR = new C0993z0();

    /* renamed from: a */
    public final InterfaceC0942a f3253a;

    /* renamed from: L2.o$a */
    public static class a extends Exception {
        public a(int i7) {
            super("Algorithm with COSE value " + i7 + " not supported");
        }
    }

    public C0970o(InterfaceC0942a interfaceC0942a) {
        this.f3253a = (InterfaceC0942a) AbstractC3802r.m15129k(interfaceC0942a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C0970o m3823a(int i7) {
        EnumC0910B enumC0910B;
        if (i7 == EnumC0910B.LEGACY_RS1.mo3780b()) {
            enumC0910B = EnumC0910B.RS1;
        } else {
            EnumC0910B[] values = EnumC0910B.values();
            int length = values.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    for (EnumC0910B enumC0910B2 : EnumC0972p.values()) {
                        if (enumC0910B2.mo3780b() == i7) {
                            enumC0910B = enumC0910B2;
                        }
                    }
                    throw new a(i7);
                }
                EnumC0910B enumC0910B3 = values[i8];
                if (enumC0910B3.mo3780b() == i7) {
                    enumC0910B = enumC0910B3;
                    break;
                }
                i8++;
            }
        }
        return new C0970o(enumC0910B);
    }

    /* renamed from: b */
    public int m3824b() {
        return this.f3253a.mo3780b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0970o) && this.f3253a.mo3780b() == ((C0970o) obj).f3253a.mo3780b();
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3253a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f3253a.mo3780b());
    }
}

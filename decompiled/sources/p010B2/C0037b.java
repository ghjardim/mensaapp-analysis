package p010B2;

import android.os.Parcel;
import android.os.Parcelable;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: B2.b */
/* loaded from: classes.dex */
public final class C0037b extends AbstractC7065a {
    public static final Parcelable.Creator<C0037b> CREATOR = new C0038c();

    /* renamed from: a */
    public final int f163a;

    /* renamed from: b */
    public final C0036a f164b;

    public C0037b(int i7, C0036a c0036a) {
        this.f163a = i7;
        this.f164b = c0036a;
    }

    /* renamed from: x0 */
    public static C0037b m102x0(AbstractC0076a.b bVar) {
        if (bVar instanceof C0036a) {
            return new C0037b((C0036a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f163a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29106C(parcel, 2, this.f164b, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: y0 */
    public final AbstractC0076a.b m103y0() {
        C0036a c0036a = this.f164b;
        if (c0036a != null) {
            return c0036a;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public C0037b(C0036a c0036a) {
        this.f163a = 1;
        this.f164b = c0036a;
    }
}

package p122R2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: R2.n */
/* loaded from: classes.dex */
public final class C2242n extends AbstractC7065a {
    public static final Parcelable.Creator<C2242n> CREATOR = new C2243o();

    /* renamed from: a */
    public final int f6855a;

    /* renamed from: b */
    public final boolean f6856b;

    public C2242n(int i7, boolean z6) {
        this.f6855a = i7;
        this.f6856b = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 2, this.f6855a);
        AbstractC7067c.m29123g(parcel, 3, this.f6856b);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

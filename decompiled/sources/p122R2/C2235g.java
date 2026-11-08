package p122R2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: R2.g */
/* loaded from: classes.dex */
public final class C2235g extends AbstractC7065a {
    public static final Parcelable.Creator<C2235g> CREATOR = new C2236h();

    /* renamed from: a */
    public final String f6849a;

    public C2235g(String str) {
        this.f6849a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, this.f6849a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public final String zza() {
        return this.f6849a;
    }
}

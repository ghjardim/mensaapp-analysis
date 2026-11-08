package p143U2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3758P;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: U2.j */
/* loaded from: classes.dex */
public final class C2524j extends AbstractC7065a {
    public static final Parcelable.Creator<C2524j> CREATOR = new C2525k();

    /* renamed from: a */
    public final int f7368a;

    /* renamed from: b */
    public final C3758P f7369b;

    public C2524j(int i7, C3758P c3758p) {
        this.f7368a = i7;
        this.f7369b = c3758p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f7368a);
        AbstractC7067c.m29106C(parcel, 2, this.f7369b, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

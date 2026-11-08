package p143U2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3760S;
import p368w2.C6861b;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: U2.l */
/* loaded from: classes.dex */
public final class C2526l extends AbstractC7065a {
    public static final Parcelable.Creator<C2526l> CREATOR = new C2527m();

    /* renamed from: a */
    public final int f7370a;

    /* renamed from: b */
    public final C6861b f7371b;

    /* renamed from: c */
    public final C3760S f7372c;

    public C2526l(int i7, C6861b c6861b, C3760S c3760s) {
        this.f7370a = i7;
        this.f7371b = c6861b;
        this.f7372c = c3760s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f7370a);
        AbstractC7067c.m29106C(parcel, 2, this.f7371b, i7, false);
        AbstractC7067c.m29106C(parcel, 3, this.f7372c, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final C6861b m8473x0() {
        return this.f7371b;
    }

    /* renamed from: y0 */
    public final C3760S m8474y0() {
        return this.f7372c;
    }
}

package p313p2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.c */
/* loaded from: classes.dex */
public final class C6108c extends AbstractC7065a {
    public static final Parcelable.Creator<C6108c> CREATOR = new C6124s();

    /* renamed from: a */
    public final PendingIntent f21847a;

    public C6108c(PendingIntent pendingIntent) {
        this.f21847a = (PendingIntent) AbstractC3802r.m15129k(pendingIntent);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, m25488x0(), i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public PendingIntent m25488x0() {
        return this.f21847a;
    }
}

package p115Q2;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.G0 */
/* loaded from: classes.dex */
public final class C2024G0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2024G0> CREATOR = new C2028I0();

    /* renamed from: a */
    public int f6231a;

    /* renamed from: b */
    public String f6232b;

    /* renamed from: c */
    public Bitmap f6233c;

    /* renamed from: d */
    public Bitmap f6234d;

    /* renamed from: e */
    public String f6235e;

    /* renamed from: f */
    public String f6236f;

    /* renamed from: n */
    public PendingIntent f6237n;

    /* renamed from: o */
    public C2030J0 f6238o;

    public C2024G0(int i7, String str, Bitmap bitmap, Bitmap bitmap2, String str2, String str3, PendingIntent pendingIntent, C2030J0 c2030j0) {
        this.f6231a = i7;
        this.f6232b = str;
        this.f6233c = bitmap;
        this.f6234d = bitmap2;
        this.f6235e = str2;
        this.f6236f = str3;
        this.f6237n = pendingIntent;
        this.f6238o = c2030j0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2024G0) {
            C2024G0 c2024g0 = (C2024G0) obj;
            if (AbstractC3798p.m15099b(Integer.valueOf(this.f6231a), Integer.valueOf(c2024g0.f6231a)) && AbstractC3798p.m15099b(this.f6232b, c2024g0.f6232b) && AbstractC3798p.m15099b(this.f6233c, c2024g0.f6233c) && AbstractC3798p.m15099b(this.f6234d, c2024g0.f6234d) && AbstractC3798p.m15099b(this.f6235e, c2024g0.f6235e) && AbstractC3798p.m15099b(this.f6236f, c2024g0.f6236f) && AbstractC3798p.m15099b(this.f6237n, c2024g0.f6237n) && AbstractC3798p.m15099b(this.f6238o, c2024g0.f6238o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6231a), this.f6232b, this.f6233c, this.f6234d, this.f6235e, this.f6236f, this.f6237n, this.f6238o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6231a);
        AbstractC7067c.m29108E(parcel, 2, this.f6232b, false);
        AbstractC7067c.m29106C(parcel, 3, this.f6233c, i7, false);
        AbstractC7067c.m29106C(parcel, 4, this.f6234d, i7, false);
        AbstractC7067c.m29108E(parcel, 5, this.f6235e, false);
        AbstractC7067c.m29108E(parcel, 6, this.f6236f, false);
        AbstractC7067c.m29106C(parcel, 7, this.f6237n, i7, false);
        AbstractC7067c.m29106C(parcel, 8, this.f6238o, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

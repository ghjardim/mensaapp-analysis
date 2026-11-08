package p115Q2;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.J0 */
/* loaded from: classes.dex */
public final class C2030J0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2030J0> CREATOR = new C2032K0();

    /* renamed from: a */
    public String f6244a;

    /* renamed from: b */
    public String f6245b;

    /* renamed from: c */
    public String f6246c;

    /* renamed from: d */
    public PendingIntent f6247d;

    /* renamed from: e */
    public String f6248e;

    /* renamed from: f */
    public PendingIntent f6249f;

    /* renamed from: n */
    public Bitmap f6250n;

    /* renamed from: o */
    public Bitmap[] f6251o;

    /* renamed from: p */
    public C2081g0 f6252p;

    public C2030J0(String str, String str2, String str3, PendingIntent pendingIntent, String str4, PendingIntent pendingIntent2, Bitmap bitmap, Bitmap[] bitmapArr, C2081g0 c2081g0) {
        this.f6244a = str;
        this.f6245b = str2;
        this.f6246c = str3;
        this.f6247d = pendingIntent;
        this.f6248e = str4;
        this.f6249f = pendingIntent2;
        this.f6250n = bitmap;
        this.f6251o = bitmapArr;
        this.f6252p = c2081g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2030J0) {
            C2030J0 c2030j0 = (C2030J0) obj;
            if (AbstractC3798p.m15099b(this.f6244a, c2030j0.f6244a) && AbstractC3798p.m15099b(this.f6245b, c2030j0.f6245b) && AbstractC3798p.m15099b(this.f6246c, c2030j0.f6246c) && AbstractC3798p.m15099b(this.f6247d, c2030j0.f6247d) && AbstractC3798p.m15099b(this.f6248e, c2030j0.f6248e) && AbstractC3798p.m15099b(this.f6249f, c2030j0.f6249f) && AbstractC3798p.m15099b(this.f6250n, c2030j0.f6250n) && Arrays.equals(this.f6251o, c2030j0.f6251o) && AbstractC3798p.m15099b(this.f6252p, c2030j0.f6252p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6244a, this.f6245b, this.f6246c, this.f6247d, this.f6248e, this.f6249f, this.f6250n, Integer.valueOf(Arrays.hashCode(this.f6251o)), this.f6252p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6244a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6245b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f6246c, false);
        AbstractC7067c.m29106C(parcel, 4, this.f6247d, i7, false);
        AbstractC7067c.m29108E(parcel, 5, this.f6248e, false);
        AbstractC7067c.m29106C(parcel, 6, this.f6249f, i7, false);
        AbstractC7067c.m29106C(parcel, 7, this.f6250n, i7, false);
        AbstractC7067c.m29111H(parcel, 8, this.f6251o, i7, false);
        AbstractC7067c.m29106C(parcel, 9, this.f6252p, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

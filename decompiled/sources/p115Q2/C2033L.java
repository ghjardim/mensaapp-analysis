package p115Q2;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.L */
/* loaded from: classes.dex */
public final class C2033L extends AbstractC7065a {
    public static final Parcelable.Creator<C2033L> CREATOR = new C2035M();

    /* renamed from: a */
    public C2037N f6253a;

    /* renamed from: b */
    public String f6254b;

    /* renamed from: c */
    public String f6255c;

    /* renamed from: d */
    public String f6256d;

    /* renamed from: e */
    public Bitmap f6257e;

    /* renamed from: f */
    public String f6258f;

    /* renamed from: n */
    public PendingIntent f6259n;

    /* renamed from: o */
    public String f6260o;

    /* renamed from: p */
    public Bitmap f6261p;

    /* renamed from: q */
    public final int f6262q;

    public C2033L(C2037N c2037n, String str, String str2, String str3, Bitmap bitmap, String str4, PendingIntent pendingIntent, String str5, Bitmap bitmap2, int i7) {
        this.f6253a = c2037n;
        this.f6254b = str;
        this.f6255c = str2;
        this.f6256d = str3;
        this.f6257e = bitmap;
        this.f6258f = str4;
        this.f6259n = pendingIntent;
        this.f6260o = str5;
        this.f6261p = bitmap2;
        this.f6262q = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2033L) {
            C2033L c2033l = (C2033L) obj;
            if (AbstractC3798p.m15099b(this.f6253a, c2033l.f6253a) && AbstractC3798p.m15099b(this.f6254b, c2033l.f6254b) && AbstractC3798p.m15099b(this.f6255c, c2033l.f6255c) && AbstractC3798p.m15099b(this.f6256d, c2033l.f6256d) && AbstractC3798p.m15099b(this.f6257e, c2033l.f6257e) && AbstractC3798p.m15099b(this.f6258f, c2033l.f6258f) && AbstractC3798p.m15099b(this.f6259n, c2033l.f6259n) && AbstractC3798p.m15099b(this.f6260o, c2033l.f6260o) && AbstractC3798p.m15099b(this.f6261p, c2033l.f6261p) && AbstractC3798p.m15099b(Integer.valueOf(this.f6262q), Integer.valueOf(c2033l.f6262q))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6253a, this.f6254b, this.f6255c, this.f6256d, this.f6257e, this.f6258f, this.f6259n, this.f6260o, this.f6261p, Integer.valueOf(this.f6262q));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f6253a, i7, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6254b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f6255c, false);
        AbstractC7067c.m29108E(parcel, 4, this.f6256d, false);
        AbstractC7067c.m29106C(parcel, 5, this.f6257e, i7, false);
        AbstractC7067c.m29108E(parcel, 6, this.f6258f, false);
        AbstractC7067c.m29106C(parcel, 7, this.f6259n, i7, false);
        AbstractC7067c.m29108E(parcel, 8, this.f6260o, false);
        AbstractC7067c.m29106C(parcel, 9, this.f6261p, i7, false);
        AbstractC7067c.m29136t(parcel, 10, this.f6262q);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

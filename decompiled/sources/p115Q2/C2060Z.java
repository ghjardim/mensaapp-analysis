package p115Q2;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.Z */
/* loaded from: classes.dex */
public final class C2060Z extends AbstractC7065a {
    public static final Parcelable.Creator<C2060Z> CREATOR = new C2063a0();

    /* renamed from: a */
    public int f6369a;

    /* renamed from: b */
    public String f6370b;

    /* renamed from: c */
    public Bitmap f6371c;

    /* renamed from: d */
    public String f6372d;

    /* renamed from: e */
    public String f6373e;

    /* renamed from: f */
    public String f6374f;

    /* renamed from: n */
    public Bitmap f6375n;

    /* renamed from: o */
    public PendingIntent f6376o;

    /* renamed from: p */
    public int f6377p;

    public C2060Z(int i7, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent, int i8) {
        this.f6369a = i7;
        this.f6370b = str;
        this.f6371c = bitmap;
        this.f6372d = str2;
        this.f6373e = str3;
        this.f6374f = str4;
        this.f6375n = bitmap2;
        this.f6376o = pendingIntent;
        this.f6377p = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2060Z) {
            C2060Z c2060z = (C2060Z) obj;
            if (AbstractC3798p.m15099b(Integer.valueOf(this.f6369a), Integer.valueOf(c2060z.f6369a)) && AbstractC3798p.m15099b(this.f6370b, c2060z.f6370b) && AbstractC3798p.m15099b(this.f6371c, c2060z.f6371c) && AbstractC3798p.m15099b(this.f6372d, c2060z.f6372d) && AbstractC3798p.m15099b(this.f6373e, c2060z.f6373e) && AbstractC3798p.m15099b(this.f6374f, c2060z.f6374f) && AbstractC3798p.m15099b(this.f6375n, c2060z.f6375n) && AbstractC3798p.m15099b(this.f6376o, c2060z.f6376o) && AbstractC3798p.m15099b(Integer.valueOf(this.f6377p), Integer.valueOf(c2060z.f6377p))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6369a), this.f6370b, this.f6371c, this.f6372d, this.f6373e, this.f6374f, this.f6375n, this.f6376o, Integer.valueOf(this.f6377p));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6369a);
        AbstractC7067c.m29108E(parcel, 2, this.f6370b, false);
        AbstractC7067c.m29106C(parcel, 3, this.f6371c, i7, false);
        AbstractC7067c.m29108E(parcel, 4, this.f6372d, false);
        AbstractC7067c.m29108E(parcel, 5, this.f6373e, false);
        AbstractC7067c.m29106C(parcel, 6, this.f6375n, i7, false);
        AbstractC7067c.m29106C(parcel, 7, this.f6376o, i7, false);
        AbstractC7067c.m29108E(parcel, 8, this.f6374f, false);
        AbstractC7067c.m29136t(parcel, 9, this.f6377p);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

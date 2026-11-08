package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: P2.j */
/* loaded from: classes.dex */
public final class C1739j extends AbstractC7065a {
    public static final Parcelable.Creator<C1739j> CREATOR = new C1748k();

    /* renamed from: a */
    public String f5169a;

    /* renamed from: b */
    public String f5170b;

    /* renamed from: c */
    public C1891z7 f5171c;

    /* renamed from: d */
    public long f5172d;

    /* renamed from: e */
    public boolean f5173e;

    /* renamed from: f */
    public String f5174f;

    /* renamed from: n */
    public final C1519J f5175n;

    /* renamed from: o */
    public long f5176o;

    /* renamed from: p */
    public C1519J f5177p;

    /* renamed from: q */
    public final long f5178q;

    /* renamed from: r */
    public final C1519J f5179r;

    public C1739j(C1739j c1739j) {
        AbstractC3802r.m15129k(c1739j);
        this.f5169a = c1739j.f5169a;
        this.f5170b = c1739j.f5170b;
        this.f5171c = c1739j.f5171c;
        this.f5172d = c1739j.f5172d;
        this.f5173e = c1739j.f5173e;
        this.f5174f = c1739j.f5174f;
        this.f5175n = c1739j.f5175n;
        this.f5176o = c1739j.f5176o;
        this.f5177p = c1739j.f5177p;
        this.f5178q = c1739j.f5178q;
        this.f5179r = c1739j.f5179r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, this.f5169a, false);
        AbstractC7067c.m29108E(parcel, 3, this.f5170b, false);
        AbstractC7067c.m29106C(parcel, 4, this.f5171c, i7, false);
        AbstractC7067c.m29140x(parcel, 5, this.f5172d);
        AbstractC7067c.m29123g(parcel, 6, this.f5173e);
        AbstractC7067c.m29108E(parcel, 7, this.f5174f, false);
        AbstractC7067c.m29106C(parcel, 8, this.f5175n, i7, false);
        AbstractC7067c.m29140x(parcel, 9, this.f5176o);
        AbstractC7067c.m29106C(parcel, 10, this.f5177p, i7, false);
        AbstractC7067c.m29140x(parcel, 11, this.f5178q);
        AbstractC7067c.m29106C(parcel, 12, this.f5179r, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C1739j(String str, String str2, C1891z7 c1891z7, long j7, boolean z6, String str3, C1519J c1519j, long j8, C1519J c1519j2, long j9, C1519J c1519j3) {
        this.f5169a = str;
        this.f5170b = str2;
        this.f5171c = c1891z7;
        this.f5172d = j7;
        this.f5173e = z6;
        this.f5174f = str3;
        this.f5175n = c1519j;
        this.f5176o = j8;
        this.f5177p = c1519j2;
        this.f5178q = j9;
        this.f5179r = c1519j3;
    }
}

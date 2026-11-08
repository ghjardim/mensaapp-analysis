package p278l2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: l2.a */
/* loaded from: classes.dex */
public class C5514a extends AbstractC7065a {
    public static final Parcelable.Creator<C5514a> CREATOR = new C5520g();

    /* renamed from: a */
    public final int f19889a;

    /* renamed from: b */
    public final long f19890b;

    /* renamed from: c */
    public final String f19891c;

    /* renamed from: d */
    public final int f19892d;

    /* renamed from: e */
    public final int f19893e;

    /* renamed from: f */
    public final String f19894f;

    public C5514a(int i7, long j7, String str, int i8, int i9, String str2) {
        this.f19889a = i7;
        this.f19890b = j7;
        this.f19891c = (String) AbstractC3802r.m15129k(str);
        this.f19892d = i8;
        this.f19893e = i9;
        this.f19894f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5514a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5514a c5514a = (C5514a) obj;
        return this.f19889a == c5514a.f19889a && this.f19890b == c5514a.f19890b && AbstractC3798p.m15099b(this.f19891c, c5514a.f19891c) && this.f19892d == c5514a.f19892d && this.f19893e == c5514a.f19893e && AbstractC3798p.m15099b(this.f19894f, c5514a.f19894f);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f19889a), Long.valueOf(this.f19890b), this.f19891c, Integer.valueOf(this.f19892d), Integer.valueOf(this.f19893e), this.f19894f);
    }

    public String toString() {
        int i7 = this.f19892d;
        String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.f19891c + ", changeType = " + str + ", changeData = " + this.f19894f + ", eventIndex = " + this.f19893e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f19889a);
        AbstractC7067c.m29140x(parcel, 2, this.f19890b);
        AbstractC7067c.m29108E(parcel, 3, this.f19891c, false);
        AbstractC7067c.m29136t(parcel, 4, this.f19892d);
        AbstractC7067c.m29136t(parcel, 5, this.f19893e);
        AbstractC7067c.m29108E(parcel, 6, this.f19894f, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

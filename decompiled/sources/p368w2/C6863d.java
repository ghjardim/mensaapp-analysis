package p368w2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: w2.d */
/* loaded from: classes.dex */
public class C6863d extends AbstractC7065a {
    public static final Parcelable.Creator<C6863d> CREATOR = new C6881v();

    /* renamed from: a */
    public final String f24682a;

    /* renamed from: b */
    public final int f24683b;

    /* renamed from: c */
    public final long f24684c;

    public C6863d(String str, int i7, long j7) {
        this.f24682a = str;
        this.f24683b = i7;
        this.f24684c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6863d) {
            C6863d c6863d = (C6863d) obj;
            if (((m28246x0() != null && m28246x0().equals(c6863d.m28246x0())) || (m28246x0() == null && c6863d.m28246x0() == null)) && m28247y0() == c6863d.m28247y0()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(m28246x0(), Long.valueOf(m28247y0()));
    }

    public final String toString() {
        AbstractC3798p.a m15101d = AbstractC3798p.m15101d(this);
        m15101d.m15102a("name", m28246x0());
        m15101d.m15102a("version", Long.valueOf(m28247y0()));
        return m15101d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, m28246x0(), false);
        AbstractC7067c.m29136t(parcel, 2, this.f24683b);
        AbstractC7067c.m29140x(parcel, 3, m28247y0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m28246x0() {
        return this.f24682a;
    }

    /* renamed from: y0 */
    public long m28247y0() {
        long j7 = this.f24684c;
        return j7 == -1 ? this.f24683b : j7;
    }

    public C6863d(String str, long j7) {
        this.f24682a = str;
        this.f24684c = j7;
        this.f24683b = -1;
    }
}

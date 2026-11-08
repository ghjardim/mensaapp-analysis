package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.r */
/* loaded from: classes.dex */
public class C0976r extends AbstractC7065a {
    public static final Parcelable.Creator<C0976r> CREATOR = new C0923H0();

    /* renamed from: a */
    public final String f3279a;

    public C0976r(String str) {
        this.f3279a = (String) AbstractC3802r.m15129k(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0976r) {
            return this.f3279a.equals(((C0976r) obj).f3279a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3279a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, m3827x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m3827x0() {
        return this.f3279a;
    }
}

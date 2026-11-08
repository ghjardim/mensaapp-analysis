package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p080L2.C0970o;
import p080L2.EnumC0992z;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.w */
/* loaded from: classes.dex */
public class C0986w extends AbstractC7065a {
    public static final Parcelable.Creator<C0986w> CREATOR = new C0939X();

    /* renamed from: a */
    public final EnumC0992z f3306a;

    /* renamed from: b */
    public final C0970o f3307b;

    public C0986w(String str, int i7) {
        AbstractC3802r.m15129k(str);
        try {
            this.f3306a = EnumC0992z.m3860b(str);
            AbstractC3802r.m15129k(Integer.valueOf(i7));
            try {
                this.f3307b = C0970o.m3823a(i7);
            } catch (C0970o.a e7) {
                throw new IllegalArgumentException(e7);
            }
        } catch (EnumC0992z.a e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0986w)) {
            return false;
        }
        C0986w c0986w = (C0986w) obj;
        return this.f3306a.equals(c0986w.f3306a) && this.f3307b.equals(c0986w.f3307b);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3306a, this.f3307b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, m3849y0(), false);
        AbstractC7067c.m29139w(parcel, 3, Integer.valueOf(m3848x0()), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public int m3848x0() {
        return this.f3307b.m3824b();
    }

    /* renamed from: y0 */
    public String m3849y0() {
        return this.f3306a.toString();
    }
}

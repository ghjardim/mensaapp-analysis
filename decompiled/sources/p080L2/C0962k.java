package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p080L2.EnumC0914D;
import p080L2.EnumC0944b;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.k */
/* loaded from: classes.dex */
public class C0962k extends AbstractC7065a {
    public static final Parcelable.Creator<C0962k> CREATOR = new C0987w0();

    /* renamed from: a */
    public final EnumC0944b f3243a;

    /* renamed from: b */
    public final Boolean f3244b;

    /* renamed from: c */
    public final EnumC0959i0 f3245c;

    /* renamed from: d */
    public final EnumC0914D f3246d;

    public C0962k(String str, Boolean bool, String str2, String str3) {
        EnumC0944b m3790b;
        EnumC0914D enumC0914D = null;
        if (str == null) {
            m3790b = null;
        } else {
            try {
                m3790b = EnumC0944b.m3790b(str);
            } catch (EnumC0914D.a | EnumC0944b.a | C0957h0 e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f3243a = m3790b;
        this.f3244b = bool;
        this.f3245c = str2 == null ? null : EnumC0959i0.m3808b(str2);
        if (str3 != null) {
            enumC0914D = EnumC0914D.m3781b(str3);
        }
        this.f3246d = enumC0914D;
    }

    /* renamed from: A0 */
    public String m3809A0() {
        if (m3812z0() == null) {
            return null;
        }
        return m3812z0().toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0962k)) {
            return false;
        }
        C0962k c0962k = (C0962k) obj;
        return AbstractC3798p.m15099b(this.f3243a, c0962k.f3243a) && AbstractC3798p.m15099b(this.f3244b, c0962k.f3244b) && AbstractC3798p.m15099b(this.f3245c, c0962k.f3245c) && AbstractC3798p.m15099b(m3812z0(), c0962k.m3812z0());
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3243a, this.f3244b, this.f3245c, m3812z0());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, m3810x0(), false);
        AbstractC7067c.m29125i(parcel, 3, m3811y0(), false);
        EnumC0959i0 enumC0959i0 = this.f3245c;
        AbstractC7067c.m29108E(parcel, 4, enumC0959i0 == null ? null : enumC0959i0.toString(), false);
        AbstractC7067c.m29108E(parcel, 5, m3809A0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m3810x0() {
        EnumC0944b enumC0944b = this.f3243a;
        if (enumC0944b == null) {
            return null;
        }
        return enumC0944b.toString();
    }

    /* renamed from: y0 */
    public Boolean m3811y0() {
        return this.f3244b;
    }

    /* renamed from: z0 */
    public EnumC0914D m3812z0() {
        EnumC0914D enumC0914D = this.f3246d;
        if (enumC0914D != null) {
            return enumC0914D;
        }
        Boolean bool = this.f3244b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return EnumC0914D.RESIDENT_KEY_REQUIRED;
    }
}

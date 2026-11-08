package p313p2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.e */
/* loaded from: classes.dex */
public class C6110e extends AbstractC7065a {
    public static final Parcelable.Creator<C6110e> CREATOR = new C6126u();

    /* renamed from: a */
    public final int f21848a;

    public C6110e(int i7) {
        this.f21848a = i7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6110e) {
            return AbstractC3798p.m15099b(Integer.valueOf(this.f21848a), Integer.valueOf(((C6110e) obj).f21848a));
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f21848a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f21848a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

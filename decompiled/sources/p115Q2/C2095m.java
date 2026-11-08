package p115Q2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.m */
/* loaded from: classes.dex */
public final class C2095m extends AbstractC7065a {
    public static final Parcelable.Creator<C2095m> CREATOR = new C2097n();

    /* renamed from: a */
    public int f6412a;

    /* renamed from: b */
    public PendingIntent f6413b;

    /* renamed from: c */
    public byte[][] f6414c;

    public C2095m(int i7, PendingIntent pendingIntent, byte[][] bArr) {
        this.f6412a = i7;
        this.f6413b = pendingIntent;
        this.f6414c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2095m) {
            C2095m c2095m = (C2095m) obj;
            if (AbstractC3798p.m15099b(Integer.valueOf(this.f6412a), Integer.valueOf(c2095m.f6412a)) && AbstractC3798p.m15099b(this.f6413b, c2095m.f6413b) && Arrays.equals(this.f6414c, c2095m.f6414c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6412a), this.f6413b, Integer.valueOf(Arrays.hashCode(this.f6414c)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6412a);
        AbstractC7067c.m29106C(parcel, 2, this.f6413b, i7, false);
        AbstractC7067c.m29128l(parcel, 4, this.f6414c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

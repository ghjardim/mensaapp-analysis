package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.S */
/* loaded from: classes.dex */
public final class C2046S extends AbstractC7065a {
    public static final Parcelable.Creator<C2046S> CREATOR = new C2048T();

    /* renamed from: a */
    public String f6276a;

    /* renamed from: b */
    public String f6277b;

    /* renamed from: c */
    public boolean f6278c;

    /* renamed from: d */
    public byte[] f6279d;

    /* renamed from: e */
    public int f6280e;

    public C2046S(String str, String str2, boolean z6, byte[] bArr, int i7) {
        this.f6276a = str;
        this.f6277b = str2;
        this.f6278c = z6;
        this.f6279d = bArr;
        this.f6280e = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2046S) {
            C2046S c2046s = (C2046S) obj;
            if (AbstractC3798p.m15099b(this.f6276a, c2046s.f6276a) && AbstractC3798p.m15099b(this.f6277b, c2046s.f6277b) && AbstractC3798p.m15099b(Boolean.valueOf(this.f6278c), Boolean.valueOf(c2046s.f6278c)) && Arrays.equals(this.f6279d, c2046s.f6279d) && AbstractC3798p.m15099b(Integer.valueOf(this.f6280e), Integer.valueOf(c2046s.f6280e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6276a, this.f6277b, Boolean.valueOf(this.f6278c), Integer.valueOf(Arrays.hashCode(this.f6279d)), Integer.valueOf(this.f6280e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6276a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6277b, false);
        AbstractC7067c.m29123g(parcel, 3, this.f6278c);
        AbstractC7067c.m29127k(parcel, 4, this.f6279d, false);
        AbstractC7067c.m29136t(parcel, 5, this.f6280e);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

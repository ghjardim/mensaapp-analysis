package p278l2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: l2.c */
/* loaded from: classes.dex */
public class C5516c extends AbstractC7065a {
    public static final Parcelable.Creator<C5516c> CREATOR = new C5522i();

    /* renamed from: a */
    public final int f19899a;

    /* renamed from: b */
    public final List f19900b;

    public C5516c(int i7, List list) {
        this.f19899a = i7;
        this.f19900b = (List) AbstractC3802r.m15129k(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f19899a);
        AbstractC7067c.m29112I(parcel, 2, this.f19900b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: P2.Z6 */
/* loaded from: classes.dex */
public final class C1657Z6 extends AbstractC7065a {
    public static final Parcelable.Creator<C1657Z6> CREATOR = new C1666a7();

    /* renamed from: a */
    public final List f5027a;

    public C1657Z6(List list) {
        this.f5027a = list;
    }

    /* renamed from: x0 */
    public static C1657Z6 m5985x0(EnumC1444A5... enumC1444A5Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC1444A5Arr[0].zza()));
        return new C1657Z6(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f5027a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29138v(parcel, 1, list, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

package p017C2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: C2.f */
/* loaded from: classes.dex */
public final class C0081f extends AbstractC7065a {
    public static final Parcelable.Creator<C0081f> CREATOR = new C0085j();

    /* renamed from: a */
    public final int f298a;

    /* renamed from: b */
    public final String f299b;

    /* renamed from: c */
    public final ArrayList f300c;

    public C0081f(int i7, String str, ArrayList arrayList) {
        this.f298a = i7;
        this.f299b = str;
        this.f300c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f298a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29108E(parcel, 2, this.f299b, false);
        AbstractC7067c.m29112I(parcel, 3, this.f300c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C0081f(String str, Map map) {
        ArrayList arrayList;
        this.f298a = 1;
        this.f299b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new C0082g(str2, (AbstractC0076a.a) map.get(str2)));
            }
        }
        this.f300c = arrayList;
    }
}

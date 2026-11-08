package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p346t3.AbstractC6476J;
import p346t3.C6486S;
import p346t3.C6492Y;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: u3.N */
/* loaded from: classes.dex */
public final class C6626N extends AbstractC7065a {
    public static final Parcelable.Creator<C6626N> CREATOR = new C6629Q();

    /* renamed from: a */
    public final List f23964a;

    /* renamed from: b */
    public final List f23965b;

    public C6626N(List list, List list2) {
        this.f23964a = list == null ? new ArrayList() : list;
        this.f23965b = list2 == null ? new ArrayList() : list2;
    }

    /* renamed from: x0 */
    public static C6626N m27503x0(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6476J abstractC6476J = (AbstractC6476J) it.next();
            if (abstractC6476J instanceof C6486S) {
                arrayList.add((C6486S) abstractC6476J);
            } else if (abstractC6476J instanceof C6492Y) {
                arrayList2.add((C6492Y) abstractC6476J);
            }
        }
        return new C6626N(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29112I(parcel, 1, this.f23964a, false);
        AbstractC7067c.m29112I(parcel, 2, this.f23965b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23964a.iterator();
        while (it.hasNext()) {
            arrayList.add((C6486S) it.next());
        }
        Iterator it2 = this.f23965b.iterator();
        while (it2.hasNext()) {
            arrayList.add((C6492Y) it2.next());
        }
        return arrayList;
    }
}

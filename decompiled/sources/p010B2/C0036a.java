package p010B2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: B2.a */
/* loaded from: classes.dex */
public final class C0036a extends AbstractC7065a implements AbstractC0076a.b {
    public static final Parcelable.Creator<C0036a> CREATOR = new C0040e();

    /* renamed from: a */
    public final int f160a;

    /* renamed from: b */
    public final HashMap f161b = new HashMap();

    /* renamed from: c */
    public final SparseArray f162c = new SparseArray();

    public C0036a(int i7, ArrayList arrayList) {
        this.f160a = i7;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0039d c0039d = (C0039d) arrayList.get(i8);
            m101x0(c0039d.f166b, c0039d.f167c);
        }
    }

    @Override // p017C2.AbstractC0076a.b
    /* renamed from: F */
    public final /* bridge */ /* synthetic */ Object mo99F(Object obj) {
        Integer num = (Integer) this.f161b.get((String) obj);
        return num == null ? (Integer) this.f161b.get("gms_unknown") : num;
    }

    @Override // p017C2.AbstractC0076a.b
    /* renamed from: w */
    public final /* bridge */ /* synthetic */ Object mo100w(Object obj) {
        String str = (String) this.f162c.get(((Integer) obj).intValue());
        return (str == null && this.f161b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f160a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f161b.keySet()) {
            arrayList.add(new C0039d(str, ((Integer) this.f161b.get(str)).intValue()));
        }
        AbstractC7067c.m29112I(parcel, 2, arrayList, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public C0036a m101x0(String str, int i7) {
        this.f161b.put(str, Integer.valueOf(i7));
        this.f162c.put(i7, str);
        return this;
    }
}

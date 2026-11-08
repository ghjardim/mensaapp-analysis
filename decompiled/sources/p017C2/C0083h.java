package p017C2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: C2.h */
/* loaded from: classes.dex */
public final class C0083h extends AbstractC7065a {
    public static final Parcelable.Creator<C0083h> CREATOR = new C0084i();

    /* renamed from: a */
    public final int f304a;

    /* renamed from: b */
    public final HashMap f305b;

    /* renamed from: c */
    public final String f306c;

    public C0083h(int i7, ArrayList arrayList, String str) {
        this.f304a = i7;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0081f c0081f = (C0081f) arrayList.get(i8);
            String str2 = c0081f.f299b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) AbstractC3802r.m15129k(c0081f.f300c)).size();
            for (int i9 = 0; i9 < size2; i9++) {
                C0082g c0082g = (C0082g) c0081f.f300c.get(i9);
                hashMap2.put(c0082g.f302b, c0082g.f303c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f305b = hashMap;
        this.f306c = (String) AbstractC3802r.m15129k(str);
        m234z0();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f305b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f305b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f304a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f305b.keySet()) {
            arrayList.add(new C0081f(str, (Map) this.f305b.get(str)));
        }
        AbstractC7067c.m29112I(parcel, 2, arrayList, false);
        AbstractC7067c.m29108E(parcel, 3, this.f306c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final String m232x0() {
        return this.f306c;
    }

    /* renamed from: y0 */
    public final Map m233y0(String str) {
        return (Map) this.f305b.get(str);
    }

    /* renamed from: z0 */
    public final void m234z0() {
        Iterator it = this.f305b.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f305b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((AbstractC0076a.a) map.get((String) it2.next())).m225K0(this);
            }
        }
    }
}

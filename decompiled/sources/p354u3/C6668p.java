package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p346t3.AbstractC6476J;
import p346t3.AbstractC6480L;
import p346t3.C6486S;
import p346t3.C6492Y;
import p382y2.AbstractC7067c;

/* renamed from: u3.p */
/* loaded from: classes.dex */
public final class C6668p extends AbstractC6480L {
    public static final Parcelable.Creator<C6668p> CREATOR = new C6674s();

    /* renamed from: a */
    public String f24075a;

    /* renamed from: b */
    public String f24076b;

    /* renamed from: c */
    public List f24077c;

    /* renamed from: d */
    public List f24078d;

    /* renamed from: e */
    public C6654i f24079e;

    public C6668p() {
    }

    /* renamed from: y0 */
    public static C6668p m27572y0(String str, C6654i c6654i) {
        AbstractC3802r.m15123e(str);
        C6668p c6668p = new C6668p();
        c6668p.f24075a = str;
        c6668p.f24079e = c6654i;
        return c6668p;
    }

    /* renamed from: z0 */
    public static C6668p m27573z0(List list, String str) {
        AbstractC3802r.m15129k(list);
        AbstractC3802r.m15123e(str);
        C6668p c6668p = new C6668p();
        c6668p.f24077c = new ArrayList();
        c6668p.f24078d = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6476J abstractC6476J = (AbstractC6476J) it.next();
            if (abstractC6476J instanceof C6486S) {
                c6668p.f24077c.add((C6486S) abstractC6476J);
            } else {
                if (!(abstractC6476J instanceof C6492Y)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + abstractC6476J.mo27010y0());
                }
                c6668p.f24078d.add((C6492Y) abstractC6476J);
            }
        }
        c6668p.f24076b = str;
        return c6668p;
    }

    /* renamed from: A0 */
    public final String m27574A0() {
        return this.f24075a;
    }

    /* renamed from: B0 */
    public final boolean m27575B0() {
        return this.f24075a != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f24075a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f24076b, false);
        AbstractC7067c.m29112I(parcel, 3, this.f24077c, false);
        AbstractC7067c.m29112I(parcel, 4, this.f24078d, false);
        AbstractC7067c.m29106C(parcel, 5, this.f24079e, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final C6654i m27576x0() {
        return this.f24079e;
    }

    public final String zzc() {
        return this.f24076b;
    }

    public C6668p(String str, String str2, List list, List list2, C6654i c6654i) {
        this.f24075a = str;
        this.f24076b = str2;
        this.f24077c = list;
        this.f24078d = list2;
        this.f24079e = c6654i;
    }
}

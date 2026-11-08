package p302o2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7067c;

/* renamed from: o2.b */
/* loaded from: classes.dex */
public final class C5928b extends zzbz {
    public static final Parcelable.Creator<C5928b> CREATOR = new C5929c();

    /* renamed from: f */
    public static final HashMap f21399f;

    /* renamed from: a */
    public final Set f21400a;

    /* renamed from: b */
    public final int f21401b;

    /* renamed from: c */
    public ArrayList f21402c;

    /* renamed from: d */
    public int f21403d;

    /* renamed from: e */
    public C5931e f21404e;

    static {
        HashMap hashMap = new HashMap();
        f21399f = hashMap;
        hashMap.put("authenticatorData", AbstractC0076a.a.m218z0("authenticatorData", 2, C5933g.class));
        hashMap.put("progress", AbstractC0076a.a.m217y0("progress", 4, C5931e.class));
    }

    public C5928b(Set set, int i7, ArrayList arrayList, int i8, C5931e c5931e) {
        this.f21400a = set;
        this.f21401b = i7;
        this.f21402c = arrayList;
        this.f21403d = i8;
        this.f21404e = c5931e;
    }

    @Override // p017C2.AbstractC0076a
    public final void addConcreteTypeArrayInternal(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        int m219D0 = aVar.m219D0();
        if (m219D0 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(m219D0), arrayList.getClass().getCanonicalName()));
        }
        this.f21402c = arrayList;
        this.f21400a.add(Integer.valueOf(m219D0));
    }

    @Override // p017C2.AbstractC0076a
    public final void addConcreteTypeInternal(AbstractC0076a.a aVar, String str, AbstractC0076a abstractC0076a) {
        int m219D0 = aVar.m219D0();
        if (m219D0 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(m219D0), abstractC0076a.getClass().getCanonicalName()));
        }
        this.f21404e = (C5931e) abstractC0076a;
        this.f21400a.add(Integer.valueOf(m219D0));
    }

    @Override // p017C2.AbstractC0076a
    public final /* synthetic */ Map getFieldMappings() {
        return f21399f;
    }

    @Override // p017C2.AbstractC0076a
    public final Object getFieldValue(AbstractC0076a.a aVar) {
        int m219D0 = aVar.m219D0();
        if (m219D0 == 1) {
            return Integer.valueOf(this.f21401b);
        }
        if (m219D0 == 2) {
            return this.f21402c;
        }
        if (m219D0 == 4) {
            return this.f21404e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m219D0());
    }

    @Override // p017C2.AbstractC0076a
    public final boolean isFieldSet(AbstractC0076a.a aVar) {
        return this.f21400a.contains(Integer.valueOf(aVar.m219D0()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        Set set = this.f21400a;
        if (set.contains(1)) {
            AbstractC7067c.m29136t(parcel, 1, this.f21401b);
        }
        if (set.contains(2)) {
            AbstractC7067c.m29112I(parcel, 2, this.f21402c, true);
        }
        if (set.contains(3)) {
            AbstractC7067c.m29136t(parcel, 3, this.f21403d);
        }
        if (set.contains(4)) {
            AbstractC7067c.m29106C(parcel, 4, this.f21404e, i7, true);
        }
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

package p302o2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7067c;

/* renamed from: o2.g */
/* loaded from: classes.dex */
public final class C5933g extends zzbz {
    public static final Parcelable.Creator<C5933g> CREATOR = new C5934h();

    /* renamed from: n */
    public static final HashMap f21412n;

    /* renamed from: a */
    public final Set f21413a;

    /* renamed from: b */
    public final int f21414b;

    /* renamed from: c */
    public C5935i f21415c;

    /* renamed from: d */
    public String f21416d;

    /* renamed from: e */
    public String f21417e;

    /* renamed from: f */
    public String f21418f;

    static {
        HashMap hashMap = new HashMap();
        f21412n = hashMap;
        hashMap.put("authenticatorInfo", AbstractC0076a.a.m217y0("authenticatorInfo", 2, C5935i.class));
        hashMap.put("signature", AbstractC0076a.a.m213B0("signature", 3));
        hashMap.put("package", AbstractC0076a.a.m213B0("package", 4));
    }

    public C5933g(Set set, int i7, C5935i c5935i, String str, String str2, String str3) {
        this.f21413a = set;
        this.f21414b = i7;
        this.f21415c = c5935i;
        this.f21416d = str;
        this.f21417e = str2;
        this.f21418f = str3;
    }

    @Override // p017C2.AbstractC0076a
    public final void addConcreteTypeInternal(AbstractC0076a.a aVar, String str, AbstractC0076a abstractC0076a) {
        int m219D0 = aVar.m219D0();
        if (m219D0 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(m219D0), abstractC0076a.getClass().getCanonicalName()));
        }
        this.f21415c = (C5935i) abstractC0076a;
        this.f21413a.add(Integer.valueOf(m219D0));
    }

    @Override // p017C2.AbstractC0076a
    public final /* synthetic */ Map getFieldMappings() {
        return f21412n;
    }

    @Override // p017C2.AbstractC0076a
    public final Object getFieldValue(AbstractC0076a.a aVar) {
        int m219D0 = aVar.m219D0();
        if (m219D0 == 1) {
            return Integer.valueOf(this.f21414b);
        }
        if (m219D0 == 2) {
            return this.f21415c;
        }
        if (m219D0 == 3) {
            return this.f21416d;
        }
        if (m219D0 == 4) {
            return this.f21417e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m219D0());
    }

    @Override // p017C2.AbstractC0076a
    public final boolean isFieldSet(AbstractC0076a.a aVar) {
        return this.f21413a.contains(Integer.valueOf(aVar.m219D0()));
    }

    @Override // p017C2.AbstractC0076a
    public final void setStringInternal(AbstractC0076a.a aVar, String str, String str2) {
        int m219D0 = aVar.m219D0();
        if (m219D0 == 3) {
            this.f21416d = str2;
        } else {
            if (m219D0 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(m219D0)));
            }
            this.f21417e = str2;
        }
        this.f21413a.add(Integer.valueOf(m219D0));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        Set set = this.f21413a;
        if (set.contains(1)) {
            AbstractC7067c.m29136t(parcel, 1, this.f21414b);
        }
        if (set.contains(2)) {
            AbstractC7067c.m29106C(parcel, 2, this.f21415c, i7, true);
        }
        if (set.contains(3)) {
            AbstractC7067c.m29108E(parcel, 3, this.f21416d, true);
        }
        if (set.contains(4)) {
            AbstractC7067c.m29108E(parcel, 4, this.f21417e, true);
        }
        if (set.contains(5)) {
            AbstractC7067c.m29108E(parcel, 5, this.f21418f, true);
        }
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

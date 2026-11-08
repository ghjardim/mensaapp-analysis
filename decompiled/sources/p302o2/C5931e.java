package p302o2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p017C2.AbstractC0076a;
import p334s.C6308a;
import p382y2.AbstractC7067c;

/* renamed from: o2.e */
/* loaded from: classes.dex */
public final class C5931e extends zzbz {
    public static final Parcelable.Creator<C5931e> CREATOR = new C5932f();

    /* renamed from: n */
    public static final C6308a f21405n;

    /* renamed from: a */
    public final int f21406a;

    /* renamed from: b */
    public List f21407b;

    /* renamed from: c */
    public List f21408c;

    /* renamed from: d */
    public List f21409d;

    /* renamed from: e */
    public List f21410e;

    /* renamed from: f */
    public List f21411f;

    static {
        C6308a c6308a = new C6308a();
        f21405n = c6308a;
        c6308a.put("registered", AbstractC0076a.a.m214C0("registered", 2));
        c6308a.put("in_progress", AbstractC0076a.a.m214C0("in_progress", 3));
        c6308a.put("success", AbstractC0076a.a.m214C0("success", 4));
        c6308a.put("failed", AbstractC0076a.a.m214C0("failed", 5));
        c6308a.put("escrowed", AbstractC0076a.a.m214C0("escrowed", 6));
    }

    public C5931e(int i7, List list, List list2, List list3, List list4, List list5) {
        this.f21406a = i7;
        this.f21407b = list;
        this.f21408c = list2;
        this.f21409d = list3;
        this.f21410e = list4;
        this.f21411f = list5;
    }

    @Override // p017C2.AbstractC0076a
    public final Map getFieldMappings() {
        return f21405n;
    }

    @Override // p017C2.AbstractC0076a
    public final Object getFieldValue(AbstractC0076a.a aVar) {
        switch (aVar.m219D0()) {
            case 1:
                return Integer.valueOf(this.f21406a);
            case 2:
                return this.f21407b;
            case 3:
                return this.f21408c;
            case 4:
                return this.f21409d;
            case 5:
                return this.f21410e;
            case 6:
                return this.f21411f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m219D0());
        }
    }

    @Override // p017C2.AbstractC0076a
    public final boolean isFieldSet(AbstractC0076a.a aVar) {
        return true;
    }

    @Override // p017C2.AbstractC0076a
    public final void setStringsInternal(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        int m219D0 = aVar.m219D0();
        if (m219D0 == 2) {
            this.f21407b = arrayList;
            return;
        }
        if (m219D0 == 3) {
            this.f21408c = arrayList;
            return;
        }
        if (m219D0 == 4) {
            this.f21409d = arrayList;
        } else if (m219D0 == 5) {
            this.f21410e = arrayList;
        } else {
            if (m219D0 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(m219D0)));
            }
            this.f21411f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f21406a);
        AbstractC7067c.m29110G(parcel, 2, this.f21407b, false);
        AbstractC7067c.m29110G(parcel, 3, this.f21408c, false);
        AbstractC7067c.m29110G(parcel, 4, this.f21409d, false);
        AbstractC7067c.m29110G(parcel, 5, this.f21410e, false);
        AbstractC7067c.m29110G(parcel, 6, this.f21411f, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

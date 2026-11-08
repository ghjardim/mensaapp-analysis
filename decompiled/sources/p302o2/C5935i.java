package p302o2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7067c;

/* renamed from: o2.i */
/* loaded from: classes.dex */
public final class C5935i extends zzbz {
    public static final Parcelable.Creator<C5935i> CREATOR = new C5936j();

    /* renamed from: o */
    public static final HashMap f21419o;

    /* renamed from: a */
    public final Set f21420a;

    /* renamed from: b */
    public final int f21421b;

    /* renamed from: c */
    public String f21422c;

    /* renamed from: d */
    public int f21423d;

    /* renamed from: e */
    public byte[] f21424e;

    /* renamed from: f */
    public PendingIntent f21425f;

    /* renamed from: n */
    public C5927a f21426n;

    static {
        HashMap hashMap = new HashMap();
        f21419o = hashMap;
        hashMap.put("accountType", AbstractC0076a.a.m213B0("accountType", 2));
        hashMap.put("status", AbstractC0076a.a.m212A0("status", 3));
        hashMap.put("transferBytes", AbstractC0076a.a.m216x0("transferBytes", 4));
    }

    public C5935i(Set set, int i7, String str, int i8, byte[] bArr, PendingIntent pendingIntent, C5927a c5927a) {
        this.f21420a = set;
        this.f21421b = i7;
        this.f21422c = str;
        this.f21423d = i8;
        this.f21424e = bArr;
        this.f21425f = pendingIntent;
        this.f21426n = c5927a;
    }

    @Override // p017C2.AbstractC0076a
    public final /* synthetic */ Map getFieldMappings() {
        return f21419o;
    }

    @Override // p017C2.AbstractC0076a
    public final Object getFieldValue(AbstractC0076a.a aVar) {
        int m219D0 = aVar.m219D0();
        if (m219D0 == 1) {
            return Integer.valueOf(this.f21421b);
        }
        if (m219D0 == 2) {
            return this.f21422c;
        }
        if (m219D0 == 3) {
            return Integer.valueOf(this.f21423d);
        }
        if (m219D0 == 4) {
            return this.f21424e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m219D0());
    }

    @Override // p017C2.AbstractC0076a
    public final boolean isFieldSet(AbstractC0076a.a aVar) {
        return this.f21420a.contains(Integer.valueOf(aVar.m219D0()));
    }

    @Override // p017C2.AbstractC0076a
    public final void setDecodedBytesInternal(AbstractC0076a.a aVar, String str, byte[] bArr) {
        int m219D0 = aVar.m219D0();
        if (m219D0 == 4) {
            this.f21424e = bArr;
            this.f21420a.add(Integer.valueOf(m219D0));
        } else {
            throw new IllegalArgumentException("Field with id=" + m219D0 + " is not known to be a byte array.");
        }
    }

    @Override // p017C2.AbstractC0076a
    public final void setIntegerInternal(AbstractC0076a.a aVar, String str, int i7) {
        int m219D0 = aVar.m219D0();
        if (m219D0 == 3) {
            this.f21423d = i7;
            this.f21420a.add(Integer.valueOf(m219D0));
        } else {
            throw new IllegalArgumentException("Field with id=" + m219D0 + " is not known to be an int.");
        }
    }

    @Override // p017C2.AbstractC0076a
    public final void setStringInternal(AbstractC0076a.a aVar, String str, String str2) {
        int m219D0 = aVar.m219D0();
        if (m219D0 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(m219D0)));
        }
        this.f21422c = str2;
        this.f21420a.add(Integer.valueOf(m219D0));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        Set set = this.f21420a;
        if (set.contains(1)) {
            AbstractC7067c.m29136t(parcel, 1, this.f21421b);
        }
        if (set.contains(2)) {
            AbstractC7067c.m29108E(parcel, 2, this.f21422c, true);
        }
        if (set.contains(3)) {
            AbstractC7067c.m29136t(parcel, 3, this.f21423d);
        }
        if (set.contains(4)) {
            AbstractC7067c.m29127k(parcel, 4, this.f21424e, true);
        }
        if (set.contains(5)) {
            AbstractC7067c.m29106C(parcel, 5, this.f21425f, i7, true);
        }
        if (set.contains(6)) {
            AbstractC7067c.m29106C(parcel, 6, this.f21426n, i7, true);
        }
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

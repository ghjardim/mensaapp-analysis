package p108P2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: P2.H */
/* loaded from: classes.dex */
public final class C1501H extends AbstractC7065a implements Iterable {
    public static final Parcelable.Creator<C1501H> CREATOR = new C1510I();

    /* renamed from: a */
    public final Bundle f4692a;

    public C1501H(Bundle bundle) {
        this.f4692a = bundle;
    }

    /* renamed from: A0 */
    public final Double m5764A0(String str) {
        return Double.valueOf(this.f4692a.getDouble(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
    }

    /* renamed from: B0 */
    public final Long m5765B0(String str) {
        return Long.valueOf(this.f4692a.getLong(str));
    }

    /* renamed from: C0 */
    public final Object m5766C0(String str) {
        return this.f4692a.get(str);
    }

    /* renamed from: D0 */
    public final String m5767D0(String str) {
        return this.f4692a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1492G(this);
    }

    public final String toString() {
        return this.f4692a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29126j(parcel, 2, m5769z0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final int m5768x0() {
        return this.f4692a.size();
    }

    /* renamed from: z0 */
    public final Bundle m5769z0() {
        return new Bundle(this.f4692a);
    }
}

package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: P2.b7 */
/* loaded from: classes.dex */
public final class C1675b7 extends AbstractC7065a {
    public static final Parcelable.Creator<C1675b7> CREATOR = new C1684c7();

    /* renamed from: a */
    public final List f5053a;

    public C1675b7(List list) {
        this.f5053a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f5053a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29112I(parcel, 1, list, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

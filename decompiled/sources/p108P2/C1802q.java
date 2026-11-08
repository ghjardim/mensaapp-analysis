package p108P2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: P2.q */
/* loaded from: classes.dex */
public final class C1802q extends AbstractC7065a {
    public static final Parcelable.Creator<C1802q> CREATOR = new C1811r();

    /* renamed from: a */
    public final Bundle f5315a;

    public C1802q(Bundle bundle) {
        this.f5315a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Bundle bundle = this.f5315a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29126j(parcel, 1, bundle, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

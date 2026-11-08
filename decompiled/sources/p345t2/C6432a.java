package p345t2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: t2.a */
/* loaded from: classes.dex */
public class C6432a extends AbstractC7065a {
    public static final Parcelable.Creator<C6432a> CREATOR = new C6435d();

    /* renamed from: a */
    public final int f23334a;

    /* renamed from: b */
    public int f23335b;

    /* renamed from: c */
    public Bundle f23336c;

    public C6432a(int i7, int i8, Bundle bundle) {
        this.f23334a = i7;
        this.f23335b = i8;
        this.f23336c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f23334a);
        AbstractC7067c.m29136t(parcel, 2, m26914x0());
        AbstractC7067c.m29126j(parcel, 3, this.f23336c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public int m26914x0() {
        return this.f23335b;
    }
}

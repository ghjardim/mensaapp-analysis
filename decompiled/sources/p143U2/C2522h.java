package p143U2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: U2.h */
/* loaded from: classes.dex */
public final class C2522h extends AbstractC7065a implements InterfaceC3729l {
    public static final Parcelable.Creator<C2522h> CREATOR = new C2523i();

    /* renamed from: a */
    public final List f7366a;

    /* renamed from: b */
    public final String f7367b;

    public C2522h(List list, String str) {
        this.f7366a = list;
        this.f7367b = str;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.f7367b != null ? Status.f12248f : Status.f12252q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f7366a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29110G(parcel, 1, list, false);
        AbstractC7067c.m29108E(parcel, 2, this.f7367b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

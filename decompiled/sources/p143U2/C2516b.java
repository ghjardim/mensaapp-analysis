package p143U2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: U2.b */
/* loaded from: classes.dex */
public final class C2516b extends AbstractC7065a implements InterfaceC3729l {
    public static final Parcelable.Creator<C2516b> CREATOR = new C2517c();

    /* renamed from: a */
    public final int f7363a;

    /* renamed from: b */
    public int f7364b;

    /* renamed from: c */
    public Intent f7365c;

    public C2516b(int i7, int i8, Intent intent) {
        this.f7363a = i7;
        this.f7364b = i8;
        this.f7365c = intent;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public final Status getStatus() {
        return this.f7364b == 0 ? Status.f12248f : Status.f12252q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f7363a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29136t(parcel, 2, this.f7364b);
        AbstractC7067c.m29106C(parcel, 3, this.f7365c, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

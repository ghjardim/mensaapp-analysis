package p017C2;

import android.os.Parcel;
import android.os.Parcelable;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: C2.g */
/* loaded from: classes.dex */
public final class C0082g extends AbstractC7065a {
    public static final Parcelable.Creator<C0082g> CREATOR = new C0080e();

    /* renamed from: a */
    public final int f301a;

    /* renamed from: b */
    public final String f302b;

    /* renamed from: c */
    public final AbstractC0076a.a f303c;

    public C0082g(int i7, String str, AbstractC0076a.a aVar) {
        this.f301a = i7;
        this.f302b = str;
        this.f303c = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f301a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29108E(parcel, 2, this.f302b, false);
        AbstractC7067c.m29106C(parcel, 3, this.f303c, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C0082g(String str, AbstractC0076a.a aVar) {
        this.f301a = 1;
        this.f302b = str;
        this.f303c = aVar;
    }
}

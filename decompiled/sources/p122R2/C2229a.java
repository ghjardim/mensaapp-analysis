package p122R2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: R2.a */
/* loaded from: classes.dex */
public class C2229a extends AbstractC7065a {
    public static final Parcelable.Creator<C2229a> CREATOR = new C2237i();

    /* renamed from: a */
    public final String f6833a;

    /* renamed from: b */
    public final byte[] f6834b;

    /* renamed from: c */
    public final int f6835c;

    public C2229a(String str, byte[] bArr, int i7) {
        this.f6833a = str;
        this.f6834b = bArr;
        this.f6835c = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, this.f6833a, false);
        AbstractC7067c.m29127k(parcel, 3, this.f6834b, false);
        AbstractC7067c.m29136t(parcel, 4, this.f6835c);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

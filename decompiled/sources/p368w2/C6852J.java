package p368w2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: w2.J */
/* loaded from: classes.dex */
public final class C6852J extends AbstractC7065a {
    public static final Parcelable.Creator<C6852J> CREATOR = new C6853K();

    /* renamed from: a */
    public final boolean f24658a;

    /* renamed from: b */
    public final String f24659b;

    /* renamed from: c */
    public final int f24660c;

    /* renamed from: d */
    public final int f24661d;

    public C6852J(boolean z6, String str, int i7, int i8) {
        this.f24658a = z6;
        this.f24659b = str;
        this.f24660c = AbstractC6859Q.m28236a(i7) - 1;
        this.f24661d = AbstractC6882w.m28299a(i8) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, this.f24658a);
        AbstractC7067c.m29108E(parcel, 2, this.f24659b, false);
        AbstractC7067c.m29136t(parcel, 3, this.f24660c);
        AbstractC7067c.m29136t(parcel, 4, this.f24661d);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final boolean m28226x0() {
        return this.f24658a;
    }

    /* renamed from: y0 */
    public final int m28227y0() {
        return AbstractC6882w.m28299a(this.f24661d);
    }

    /* renamed from: z0 */
    public final int m28228z0() {
        return AbstractC6859Q.m28236a(this.f24660c);
    }

    public final String zza() {
        return this.f24659b;
    }
}

package p010B2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: B2.d */
/* loaded from: classes.dex */
public final class C0039d extends AbstractC7065a {
    public static final Parcelable.Creator<C0039d> CREATOR = new C0041f();

    /* renamed from: a */
    public final int f165a;

    /* renamed from: b */
    public final String f166b;

    /* renamed from: c */
    public final int f167c;

    public C0039d(int i7, String str, int i8) {
        this.f165a = i7;
        this.f166b = str;
        this.f167c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f165a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29108E(parcel, 2, this.f166b, false);
        AbstractC7067c.m29136t(parcel, 3, this.f167c);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C0039d(String str, int i7) {
        this.f165a = 1;
        this.f166b = str;
        this.f167c = i7;
    }
}

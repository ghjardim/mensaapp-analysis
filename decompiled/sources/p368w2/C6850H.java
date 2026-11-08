package p368w2;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p052H2.BinderC0553b;
import p052H2.InterfaceC0552a;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: w2.H */
/* loaded from: classes.dex */
public final class C6850H extends AbstractC7065a {
    public static final Parcelable.Creator<C6850H> CREATOR = new C6851I();

    /* renamed from: a */
    public final String f24652a;

    /* renamed from: b */
    public final boolean f24653b;

    /* renamed from: c */
    public final boolean f24654c;

    /* renamed from: d */
    public final Context f24655d;

    /* renamed from: e */
    public final boolean f24656e;

    /* renamed from: f */
    public final boolean f24657f;

    public C6850H(String str, boolean z6, boolean z7, IBinder iBinder, boolean z8, boolean z9) {
        this.f24652a = str;
        this.f24653b = z6;
        this.f24654c = z7;
        this.f24655d = (Context) BinderC0553b.m2137b(InterfaceC0552a.a.m2136a(iBinder));
        this.f24656e = z8;
        this.f24657f = z9;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [H2.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f24652a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, str, false);
        AbstractC7067c.m29123g(parcel, 2, this.f24653b);
        AbstractC7067c.m29123g(parcel, 3, this.f24654c);
        AbstractC7067c.m29135s(parcel, 4, BinderC0553b.m2138f(this.f24655d), false);
        AbstractC7067c.m29123g(parcel, 5, this.f24656e);
        AbstractC7067c.m29123g(parcel, 6, this.f24657f);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}

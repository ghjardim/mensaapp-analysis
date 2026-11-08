package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;

/* renamed from: P2.J */
/* loaded from: classes.dex */
public final class C1519J extends AbstractC7065a {
    public static final Parcelable.Creator<C1519J> CREATOR = new C1528K();

    /* renamed from: a */
    public final String f4758a;

    /* renamed from: b */
    public final C1501H f4759b;

    /* renamed from: c */
    public final String f4760c;

    /* renamed from: d */
    public final long f4761d;

    public C1519J(C1519J c1519j, long j7) {
        AbstractC3802r.m15129k(c1519j);
        this.f4758a = c1519j.f4758a;
        this.f4759b = c1519j.f4759b;
        this.f4760c = c1519j.f4760c;
        this.f4761d = j7;
    }

    public final String toString() {
        return "origin=" + this.f4760c + ",name=" + this.f4758a + ",params=" + String.valueOf(this.f4759b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C1528K.m5891a(this, parcel, i7);
    }

    public C1519J(String str, C1501H c1501h, String str2, long j7) {
        this.f4758a = str;
        this.f4759b = c1501h;
        this.f4760c = str2;
        this.f4761d = j7;
    }
}

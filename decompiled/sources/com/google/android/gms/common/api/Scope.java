package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public final class Scope extends AbstractC7065a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C3739v();

    /* renamed from: a */
    public final int f12245a;

    /* renamed from: b */
    public final String f12246b;

    public Scope(int i7, String str) {
        AbstractC3802r.m15124f(str, "scopeUri must not be null or empty");
        this.f12245a = i7;
        this.f12246b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f12246b.equals(((Scope) obj).f12246b);
        }
        return false;
    }

    public int hashCode() {
        return this.f12246b.hashCode();
    }

    public String toString() {
        return this.f12246b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f12245a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29108E(parcel, 2, m14795x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m14795x0() {
        return this.f12246b;
    }

    public Scope(String str) {
        this(1, str);
    }
}

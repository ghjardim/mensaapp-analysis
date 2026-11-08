package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import p278l2.C5529p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public class TokenData extends AbstractC7065a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C5529p();

    /* renamed from: a */
    public final int f12152a;

    /* renamed from: b */
    public final String f12153b;

    /* renamed from: c */
    public final Long f12154c;

    /* renamed from: d */
    public final boolean f12155d;

    /* renamed from: e */
    public final boolean f12156e;

    /* renamed from: f */
    public final List f12157f;

    /* renamed from: n */
    public final String f12158n;

    public TokenData(int i7, String str, Long l7, boolean z6, boolean z7, List list, String str2) {
        this.f12152a = i7;
        this.f12153b = AbstractC3802r.m15123e(str);
        this.f12154c = l7;
        this.f12155d = z6;
        this.f12156e = z7;
        this.f12157f = list;
        this.f12158n = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f12153b, tokenData.f12153b) && AbstractC3798p.m15099b(this.f12154c, tokenData.f12154c) && this.f12155d == tokenData.f12155d && this.f12156e == tokenData.f12156e && AbstractC3798p.m15099b(this.f12157f, tokenData.f12157f) && AbstractC3798p.m15099b(this.f12158n, tokenData.f12158n);
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f12153b, this.f12154c, Boolean.valueOf(this.f12155d), Boolean.valueOf(this.f12156e), this.f12157f, this.f12158n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f12152a);
        AbstractC7067c.m29108E(parcel, 2, this.f12153b, false);
        AbstractC7067c.m29142z(parcel, 3, this.f12154c, false);
        AbstractC7067c.m29123g(parcel, 4, this.f12155d);
        AbstractC7067c.m29123g(parcel, 5, this.f12156e);
        AbstractC7067c.m29110G(parcel, 6, this.f12157f, false);
        AbstractC7067c.m29108E(parcel, 7, this.f12158n, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public final String zza() {
        return this.f12153b;
    }
}

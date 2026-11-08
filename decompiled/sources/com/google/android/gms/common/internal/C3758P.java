package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: com.google.android.gms.common.internal.P */
/* loaded from: classes.dex */
public final class C3758P extends AbstractC7065a {
    public static final Parcelable.Creator<C3758P> CREATOR = new C3759Q();

    /* renamed from: a */
    public final int f12448a;

    /* renamed from: b */
    public final Account f12449b;

    /* renamed from: c */
    public final int f12450c;

    /* renamed from: d */
    public final GoogleSignInAccount f12451d;

    public C3758P(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f12448a = i7;
        this.f12449b = account;
        this.f12450c = i8;
        this.f12451d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f12448a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29106C(parcel, 2, this.f12449b, i7, false);
        AbstractC7067c.m29136t(parcel, 3, this.f12450c);
        AbstractC7067c.m29106C(parcel, 4, this.f12451d, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C3758P(Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i7, googleSignInAccount);
    }
}

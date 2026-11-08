package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p272k4.C5410A;
import p368w2.C6863d;
import p382y2.AbstractC7066b;
import p382y2.AbstractC7067c;

/* renamed from: com.google.android.gms.common.internal.o0 */
/* loaded from: classes.dex */
public final class C3797o0 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m15097a(C3778f c3778f, Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, c3778f.f12490a);
        AbstractC7067c.m29136t(parcel, 2, c3778f.f12491b);
        AbstractC7067c.m29136t(parcel, 3, c3778f.f12492c);
        AbstractC7067c.m29108E(parcel, 4, c3778f.f12493d, false);
        AbstractC7067c.m29135s(parcel, 5, c3778f.f12494e, false);
        AbstractC7067c.m29111H(parcel, 6, c3778f.f12495f, i7, false);
        AbstractC7067c.m29126j(parcel, 7, c3778f.f12496n, false);
        AbstractC7067c.m29106C(parcel, 8, c3778f.f12497o, i7, false);
        AbstractC7067c.m29111H(parcel, 10, c3778f.f12498p, i7, false);
        AbstractC7067c.m29111H(parcel, 11, c3778f.f12499q, i7, false);
        AbstractC7067c.m29123g(parcel, 12, c3778f.f12500r);
        AbstractC7067c.m29136t(parcel, 13, c3778f.f12501s);
        AbstractC7067c.m29123g(parcel, 14, c3778f.f12502t);
        AbstractC7067c.m29108E(parcel, 15, c3778f.m15071x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        Scope[] scopeArr = C3778f.f12488v;
        Bundle bundle = new Bundle();
        C6863d[] c6863dArr = C3778f.f12489w;
        C6863d[] c6863dArr2 = c6863dArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z6 = false;
        int i10 = 0;
        boolean z7 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 2:
                    i8 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 3:
                    i9 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 4:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    iBinder = AbstractC7066b.m29067E(parcel, m29066D);
                    break;
                case 6:
                    scopeArr = (Scope[]) AbstractC7066b.m29097t(parcel, m29066D, Scope.CREATOR);
                    break;
                case 7:
                    bundle = AbstractC7066b.m29083f(parcel, m29066D);
                    break;
                case 8:
                    account = (Account) AbstractC7066b.m29093p(parcel, m29066D, Account.CREATOR);
                    break;
                case 9:
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
                case 10:
                    c6863dArr = (C6863d[]) AbstractC7066b.m29097t(parcel, m29066D, C6863d.CREATOR);
                    break;
                case 11:
                    c6863dArr2 = (C6863d[]) AbstractC7066b.m29097t(parcel, m29066D, C6863d.CREATOR);
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 13:
                    i10 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 14:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 15:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C3778f(i7, i8, i9, str, iBinder, scopeArr, bundle, account, c6863dArr, c6863dArr2, z6, i10, z7, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3778f[i7];
    }
}

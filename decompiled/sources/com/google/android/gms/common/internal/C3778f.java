package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC3786j;
import p368w2.C6863d;
import p382y2.AbstractC7065a;

/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes.dex */
public class C3778f extends AbstractC7065a {
    public static final Parcelable.Creator<C3778f> CREATOR = new C3797o0();

    /* renamed from: v */
    public static final Scope[] f12488v = new Scope[0];

    /* renamed from: w */
    public static final C6863d[] f12489w = new C6863d[0];

    /* renamed from: a */
    public final int f12490a;

    /* renamed from: b */
    public final int f12491b;

    /* renamed from: c */
    public final int f12492c;

    /* renamed from: d */
    public String f12493d;

    /* renamed from: e */
    public IBinder f12494e;

    /* renamed from: f */
    public Scope[] f12495f;

    /* renamed from: n */
    public Bundle f12496n;

    /* renamed from: o */
    public Account f12497o;

    /* renamed from: p */
    public C6863d[] f12498p;

    /* renamed from: q */
    public C6863d[] f12499q;

    /* renamed from: r */
    public final boolean f12500r;

    /* renamed from: s */
    public final int f12501s;

    /* renamed from: t */
    public boolean f12502t;

    /* renamed from: u */
    public final String f12503u;

    public C3778f(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C6863d[] c6863dArr, C6863d[] c6863dArr2, boolean z6, int i10, boolean z7, String str2) {
        scopeArr = scopeArr == null ? f12488v : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c6863dArr = c6863dArr == null ? f12489w : c6863dArr;
        c6863dArr2 = c6863dArr2 == null ? f12489w : c6863dArr2;
        this.f12490a = i7;
        this.f12491b = i8;
        this.f12492c = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f12493d = "com.google.android.gms";
        } else {
            this.f12493d = str;
        }
        if (i7 < 2) {
            this.f12497o = iBinder != null ? AbstractBinderC3768a.m15044b(InterfaceC3786j.a.m15094a(iBinder)) : null;
        } else {
            this.f12494e = iBinder;
            this.f12497o = account;
        }
        this.f12495f = scopeArr;
        this.f12496n = bundle;
        this.f12498p = c6863dArr;
        this.f12499q = c6863dArr2;
        this.f12500r = z6;
        this.f12501s = i10;
        this.f12502t = z7;
        this.f12503u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C3797o0.m15097a(this, parcel, i7);
    }

    /* renamed from: x0 */
    public String m15071x0() {
        return this.f12503u;
    }
}

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p031E2.AbstractC0277m;
import p368w2.C6861b;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public final class Status extends AbstractC7065a implements InterfaceC3729l, ReflectedParcelable {

    /* renamed from: a */
    public final int f12255a;

    /* renamed from: b */
    public final String f12256b;

    /* renamed from: c */
    public final PendingIntent f12257c;

    /* renamed from: d */
    public final C6861b f12258d;

    /* renamed from: e */
    public static final Status f12247e = new Status(-1);

    /* renamed from: f */
    public static final Status f12248f = new Status(0);

    /* renamed from: n */
    public static final Status f12249n = new Status(14);

    /* renamed from: o */
    public static final Status f12250o = new Status(8);

    /* renamed from: p */
    public static final Status f12251p = new Status(15);

    /* renamed from: q */
    public static final Status f12252q = new Status(16);

    /* renamed from: s */
    public static final Status f12254s = new Status(17);

    /* renamed from: r */
    public static final Status f12253r = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C3740w();

    public Status(int i7, String str, PendingIntent pendingIntent, C6861b c6861b) {
        this.f12255a = i7;
        this.f12256b = str;
        this.f12257c = pendingIntent;
        this.f12258d = c6861b;
    }

    /* renamed from: A0 */
    public String m14796A0() {
        return this.f12256b;
    }

    /* renamed from: B0 */
    public boolean m14797B0() {
        return this.f12257c != null;
    }

    /* renamed from: C0 */
    public boolean m14798C0() {
        return this.f12255a == 16;
    }

    /* renamed from: D0 */
    public boolean m14799D0() {
        return this.f12255a <= 0;
    }

    /* renamed from: E0 */
    public void m14800E0(Activity activity, int i7) {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        if (m14797B0()) {
            if (AbstractC0277m.m1139j()) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle = pendingIntentBackgroundActivityStartMode.toBundle();
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            PendingIntent pendingIntent = this.f12257c;
            AbstractC3802r.m15129k(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i7, null, 0, 0, 0, bundle2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f12255a == status.f12255a && AbstractC3798p.m15099b(this.f12256b, status.f12256b) && AbstractC3798p.m15099b(this.f12257c, status.f12257c) && AbstractC3798p.m15099b(this.f12258d, status.f12258d);
    }

    @Override // com.google.android.gms.common.api.InterfaceC3729l
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f12255a), this.f12256b, this.f12257c, this.f12258d);
    }

    public String toString() {
        AbstractC3798p.a m15101d = AbstractC3798p.m15101d(this);
        m15101d.m15102a("statusCode", zza());
        m15101d.m15102a("resolution", this.f12257c);
        return m15101d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, m14803z0());
        AbstractC7067c.m29108E(parcel, 2, m14796A0(), false);
        AbstractC7067c.m29106C(parcel, 3, this.f12257c, i7, false);
        AbstractC7067c.m29106C(parcel, 4, m14801x0(), i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public C6861b m14801x0() {
        return this.f12258d;
    }

    /* renamed from: y0 */
    public PendingIntent m14802y0() {
        return this.f12257c;
    }

    /* renamed from: z0 */
    public int m14803z0() {
        return this.f12255a;
    }

    public final String zza() {
        String str = this.f12256b;
        return str != null ? str : AbstractC3645c.m14807a(this.f12255a);
    }

    public Status(int i7) {
        this(i7, (String) null);
    }

    public Status(C6861b c6861b, String str) {
        this(c6861b, str, 17);
    }

    public Status(int i7, String str) {
        this(i7, str, (PendingIntent) null);
    }

    public Status(C6861b c6861b, String str, int i7) {
        this(i7, str, c6861b.m28244z0(), c6861b);
    }

    public Status(int i7, String str, PendingIntent pendingIntent) {
        this(i7, str, pendingIntent, null);
    }
}

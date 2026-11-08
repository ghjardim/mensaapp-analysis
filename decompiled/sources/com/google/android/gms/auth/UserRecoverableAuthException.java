package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.AbstractC3802r;
import p278l2.C5517d;
import p278l2.EnumC5530q;

@KeepName
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends C5517d {

    /* renamed from: a */
    public final Intent f12159a;

    /* renamed from: b */
    public final PendingIntent f12160b;

    /* renamed from: c */
    public final EnumC5530q f12161c;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, EnumC5530q.LEGACY);
    }

    /* renamed from: b */
    public static UserRecoverableAuthException m14702b(String str, Intent intent, PendingIntent pendingIntent) {
        AbstractC3802r.m15129k(intent);
        AbstractC3802r.m15129k(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, EnumC5530q.AUTH_INSTANTIATION);
    }

    /* renamed from: a */
    public Intent m14703a() {
        Intent intent = this.f12159a;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.f12161c.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (ordinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    public UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, EnumC5530q enumC5530q) {
        super(str);
        this.f12160b = pendingIntent;
        this.f12159a = intent;
        this.f12161c = (EnumC5530q) AbstractC3802r.m15129k(enumC5530q);
    }
}

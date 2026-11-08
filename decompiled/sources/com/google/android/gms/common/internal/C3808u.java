package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import p368w2.AbstractC6876q;

/* renamed from: com.google.android.gms.common.internal.u */
/* loaded from: classes.dex */
public class C3808u {

    /* renamed from: a */
    public final Resources f12572a;

    /* renamed from: b */
    public final String f12573b;

    public C3808u(Context context) {
        AbstractC3802r.m15129k(context);
        Resources resources = context.getResources();
        this.f12572a = resources;
        this.f12573b = resources.getResourcePackageName(AbstractC6876q.f24702a);
    }

    /* renamed from: a */
    public String m15148a(String str) {
        int identifier = this.f12572a.getIdentifier(str, "string", this.f12573b);
        if (identifier == 0) {
            return null;
        }
        return this.f12572a.getString(identifier);
    }
}

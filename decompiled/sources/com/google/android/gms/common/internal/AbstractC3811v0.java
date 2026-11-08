package com.google.android.gms.common.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.common.internal.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC3811v0 {

    /* renamed from: a */
    public static final Uri f12576a;

    /* renamed from: b */
    public static final Uri f12577b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f12576a = parse;
        f12577b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}

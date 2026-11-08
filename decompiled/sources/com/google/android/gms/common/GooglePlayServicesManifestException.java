package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a */
    public final int f12243a;

    public GooglePlayServicesManifestException(int i7, String str) {
        super(str);
        this.f12243a = i7;
    }
}

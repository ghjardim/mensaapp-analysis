package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.C3644b;

/* renamed from: com.google.android.play.core.integrity.i */
/* loaded from: classes.dex */
public final class C3896i implements InterfaceC3898k {
    @Override // com.google.android.play.core.integrity.InterfaceC3898k
    /* renamed from: a */
    public final C3644b mo15245a(Bundle bundle) {
        int i7 = bundle.getInt("error");
        if (i7 == 0) {
            return null;
        }
        return new IntegrityServiceException(i7, null);
    }
}

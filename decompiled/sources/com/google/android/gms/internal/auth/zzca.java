package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class zzca extends ContentObserver {
    public zzca(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzcb.zzl;
        atomicBoolean.set(true);
    }
}

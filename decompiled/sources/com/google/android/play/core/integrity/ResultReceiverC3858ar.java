package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.google.android.play.core.integrity.ar */
/* loaded from: classes.dex */
final class ResultReceiverC3858ar extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ BinderC3859as f12677a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC3858ar(BinderC3859as binderC3859as, Handler handler) {
        super(handler);
        this.f12677a = binderC3859as;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        if (i7 == 1) {
            this.f12677a.f12678a.trySetResult(3);
        } else if (i7 == 2) {
            this.f12677a.f12678a.trySetResult(2);
        } else {
            if (i7 != 3) {
                return;
            }
            this.f12677a.f12678a.trySetResult(1);
        }
    }
}

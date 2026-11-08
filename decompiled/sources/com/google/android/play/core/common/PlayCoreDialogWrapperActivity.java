package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a */
    public ResultReceiver f12637a;

    /* renamed from: a */
    public final void m15204a() {
        ResultReceiver resultReceiver = this.f12637a;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 0 && (resultReceiver = this.f12637a) != null) {
            if (i8 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i8 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12637a = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f12637a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            m15204a();
            finish();
        } else {
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                m15204a();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f12637a);
    }
}

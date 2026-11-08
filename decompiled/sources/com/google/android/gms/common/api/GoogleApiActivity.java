package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C3688f;
import com.google.android.gms.common.internal.AbstractC3802r;
import p368w2.C6861b;
import p368w2.C6869j;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public int f12244a = 0;

    /* renamed from: a */
    public static Intent m14793a(Context context, PendingIntent pendingIntent, int i7, boolean z6) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i7);
        intent.putExtra("notify_manager", z6);
        return intent;
    }

    /* renamed from: b */
    public final void m14794b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            C6869j.m28253n().m28262o(this, ((Integer) AbstractC3802r.m15129k(num)).intValue(), 2, this);
            this.f12244a = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f12244a = 1;
        } catch (ActivityNotFoundException e7) {
            if (extras.getBoolean("notify_manager", true)) {
                C3688f.m14929u(this).m14936F(new C6861b(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", str, e7);
            }
            this.f12244a = 1;
            finish();
        } catch (IntentSender.SendIntentException e8) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f12244a = 0;
            setResult(i8, intent);
            if (booleanExtra) {
                C3688f m14929u = C3688f.m14929u(this);
                if (i8 == -1) {
                    m14929u.m14937G();
                } else if (i8 == 0) {
                    m14929u.m14936F(new C6861b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i7 == 2) {
            this.f12244a = 0;
            setResult(i8, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f12244a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12244a = bundle.getInt("resolution");
        }
        if (this.f12244a != 1) {
            m14794b();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f12244a);
        super.onSaveInstanceState(bundle);
    }
}

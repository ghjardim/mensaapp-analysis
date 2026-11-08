package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.google.firebase.messaging.C3968d;
import java.util.HashMap;
import p138T4.AbstractC2457a;
import p138T4.AbstractC2482z;
import p138T4.C2449B;
import p138T4.C2481y;

/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static HashMap f17633a = new HashMap();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (AbstractC2457a.m8325a() == null) {
            AbstractC2457a.m8326b(context.getApplicationContext() != null ? context.getApplicationContext() : context);
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        C3968d c3968d = new C3968d(intent.getExtras());
        if (c3968d.m15820D0() != null) {
            f17633a.put(c3968d.m15817A0(), c3968d);
            C2481y.m8393b().m8401i(c3968d);
        }
        if (AbstractC2482z.m8405d(context)) {
            C2449B.m8315o().m8316p(c3968d);
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        Parcel obtain = Parcel.obtain();
        c3968d.writeToParcel(obtain, 0);
        intent2.putExtra("notification", obtain.marshall());
        FlutterFirebaseMessagingBackgroundService.m20638k(context, intent2, c3968d.m15821E0() == 1);
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p170Y1.AbstractC2908o;
import p170Y1.C2913t;
import p261j2.AbstractC5364a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public static /* synthetic */ void m14699b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR)).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        C2913t.m10496f(context);
        AbstractC2908o.a mo10461d = AbstractC2908o.m10487a().mo10459b(queryParameter).mo10461d(AbstractC5364a.m22068b(intValue));
        if (queryParameter2 != null) {
            mo10461d.mo10460c(Base64.decode(queryParameter2, 0));
        }
        C2913t.m10494c().m10498e().m17882v(mo10461d.mo10458a(), i7, new Runnable() { // from class: f2.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m14699b();
            }
        });
    }
}

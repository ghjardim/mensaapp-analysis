package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.AbstractC3413c;
import p381y1.ExecutorC7060k;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C3407a implements AbstractC3413c.c {
        public C3407a() {
        }

        @Override // androidx.profileinstaller.AbstractC3413c.c
        /* renamed from: a */
        public void mo13468a(int i7, Object obj) {
            AbstractC3413c.f11268b.mo13468a(i7, obj);
        }

        @Override // androidx.profileinstaller.AbstractC3413c.c
        /* renamed from: b */
        public void mo13469b(int i7, Object obj) {
            AbstractC3413c.f11268b.mo13469b(i7, obj);
            ProfileInstallReceiver.this.setResultCode(i7);
        }
    }

    /* renamed from: a */
    public static void m13467a(AbstractC3413c.c cVar) {
        if (Build.VERSION.SDK_INT < 24) {
            cVar.mo13469b(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            cVar.mo13469b(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC3413c.m13512k(context, new ExecutorC7060k(), new C3407a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    AbstractC3413c.m13513l(context, new ExecutorC7060k(), new C3407a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        AbstractC3413c.m13504c(context, new ExecutorC7060k(), new C3407a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m13467a(new C3407a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C3407a c3407a = new C3407a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            AbstractC3411a.m13485b(context, c3407a);
        } else {
            c3407a.mo13469b(16, null);
        }
    }
}

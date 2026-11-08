package p292n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: n0.b */
/* loaded from: classes.dex */
public final class C5715b {

    /* renamed from: a */
    public final Context f20656a;

    /* renamed from: b */
    public final a f20657b;

    /* renamed from: c */
    public boolean f20658c;

    /* renamed from: n0.b$a */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a */
        public final b f20659a;

        /* renamed from: b */
        public final Handler f20660b;

        public a(Handler handler, b bVar) {
            this.f20660b = handler;
            this.f20659a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f20660b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5715b.this.f20658c) {
                this.f20659a.mo23941A();
            }
        }
    }

    /* renamed from: n0.b$b */
    public interface b {
        /* renamed from: A */
        void mo23941A();
    }

    public C5715b(Context context, Handler handler, b bVar) {
        this.f20656a = context.getApplicationContext();
        this.f20657b = new a(handler, bVar);
    }

    /* renamed from: b */
    public void m23940b(boolean z6) {
        if (z6 && !this.f20658c) {
            this.f20656a.registerReceiver(this.f20657b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f20658c = true;
        } else {
            if (z6 || !this.f20658c) {
                return;
            }
            this.f20656a.unregisterReceiver(this.f20657b);
            this.f20658c = false;
        }
    }
}

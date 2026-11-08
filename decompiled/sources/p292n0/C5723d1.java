package p292n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;

/* renamed from: n0.d1 */
/* loaded from: classes.dex */
public final class C5723d1 {

    /* renamed from: a */
    public final Context f20752a;

    /* renamed from: b */
    public final Handler f20753b;

    /* renamed from: c */
    public final b f20754c;

    /* renamed from: d */
    public final AudioManager f20755d;

    /* renamed from: e */
    public c f20756e;

    /* renamed from: f */
    public int f20757f;

    /* renamed from: g */
    public int f20758g;

    /* renamed from: h */
    public boolean f20759h;

    /* renamed from: n0.d1$b */
    public interface b {
        /* renamed from: E */
        void mo24096E(int i7, boolean z6);

        /* renamed from: p */
        void mo24108p(int i7);
    }

    /* renamed from: n0.d1$c */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = C5723d1.this.f20753b;
            final C5723d1 c5723d1 = C5723d1.this;
            handler.post(new Runnable() { // from class: n0.e1
                @Override // java.lang.Runnable
                public final void run() {
                    C5723d1.m24118b(C5723d1.this);
                }
            });
        }
    }

    public C5723d1(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20752a = applicationContext;
        this.f20753b = handler;
        this.f20754c = bVar;
        AudioManager audioManager = (AudioManager) AbstractC5332a.m21804i((AudioManager) applicationContext.getSystemService("audio"));
        this.f20755d = audioManager;
        this.f20757f = 3;
        this.f20758g = m24120f(audioManager, 3);
        this.f20759h = m24119e(audioManager, this.f20757f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f20756e = cVar;
        } catch (RuntimeException e7) {
            AbstractC5346o.m21868i("StreamVolumeManager", "Error registering stream volume receiver", e7);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m24118b(C5723d1 c5723d1) {
        c5723d1.m24125i();
    }

    /* renamed from: e */
    public static boolean m24119e(AudioManager audioManager, int i7) {
        return AbstractC5330M.f18800a >= 23 ? audioManager.isStreamMute(i7) : m24120f(audioManager, i7) == 0;
    }

    /* renamed from: f */
    public static int m24120f(AudioManager audioManager, int i7) {
        try {
            return audioManager.getStreamVolume(i7);
        } catch (RuntimeException e7) {
            AbstractC5346o.m21868i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i7, e7);
            return audioManager.getStreamMaxVolume(i7);
        }
    }

    /* renamed from: c */
    public int m24121c() {
        return this.f20755d.getStreamMaxVolume(this.f20757f);
    }

    /* renamed from: d */
    public int m24122d() {
        int streamMinVolume;
        if (AbstractC5330M.f18800a < 28) {
            return 0;
        }
        streamMinVolume = this.f20755d.getStreamMinVolume(this.f20757f);
        return streamMinVolume;
    }

    /* renamed from: g */
    public void m24123g() {
        c cVar = this.f20756e;
        if (cVar != null) {
            try {
                this.f20752a.unregisterReceiver(cVar);
            } catch (RuntimeException e7) {
                AbstractC5346o.m21868i("StreamVolumeManager", "Error unregistering stream volume receiver", e7);
            }
            this.f20756e = null;
        }
    }

    /* renamed from: h */
    public void m24124h(int i7) {
        if (this.f20757f == i7) {
            return;
        }
        this.f20757f = i7;
        m24125i();
        this.f20754c.mo24108p(i7);
    }

    /* renamed from: i */
    public final void m24125i() {
        int m24120f = m24120f(this.f20755d, this.f20757f);
        boolean m24119e = m24119e(this.f20755d, this.f20757f);
        if (this.f20758g == m24120f && this.f20759h == m24119e) {
            return;
        }
        this.f20758g = m24120f;
        this.f20759h = m24119e;
        this.f20754c.mo24096E(m24120f, m24119e);
    }
}

package p311p0;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import p232g0.C4312b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: p0.i */
/* loaded from: classes.dex */
public final class C6080i {

    /* renamed from: a */
    public final Context f21725a;

    /* renamed from: b */
    public final f f21726b;

    /* renamed from: c */
    public final Handler f21727c;

    /* renamed from: d */
    public final c f21728d;

    /* renamed from: e */
    public final BroadcastReceiver f21729e;

    /* renamed from: f */
    public final d f21730f;

    /* renamed from: g */
    public C6074e f21731g;

    /* renamed from: h */
    public C6081j f21732h;

    /* renamed from: i */
    public C4312b f21733i;

    /* renamed from: j */
    public boolean f21734j;

    /* renamed from: p0.i$b */
    public static final class b {
        /* renamed from: a */
        public static void m25390a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) AbstractC5332a.m21800e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        /* renamed from: b */
        public static void m25391b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) AbstractC5332a.m21800e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: p0.i$c */
    public final class c extends AudioDeviceCallback {
        public c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C6080i c6080i = C6080i.this;
            c6080i.m25385f(C6074e.m25358g(c6080i.f21725a, C6080i.this.f21733i, C6080i.this.f21732h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (AbstractC5330M.m21772s(audioDeviceInfoArr, C6080i.this.f21732h)) {
                C6080i.this.f21732h = null;
            }
            C6080i c6080i = C6080i.this;
            c6080i.m25385f(C6074e.m25358g(c6080i.f21725a, C6080i.this.f21733i, C6080i.this.f21732h));
        }
    }

    /* renamed from: p0.i$d */
    public final class d extends ContentObserver {

        /* renamed from: a */
        public final ContentResolver f21736a;

        /* renamed from: b */
        public final Uri f21737b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f21736a = contentResolver;
            this.f21737b = uri;
        }

        /* renamed from: a */
        public void m25392a() {
            this.f21736a.registerContentObserver(this.f21737b, false, this);
        }

        /* renamed from: b */
        public void m25393b() {
            this.f21736a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            C6080i c6080i = C6080i.this;
            c6080i.m25385f(C6074e.m25358g(c6080i.f21725a, C6080i.this.f21733i, C6080i.this.f21732h));
        }
    }

    /* renamed from: p0.i$e */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C6080i c6080i = C6080i.this;
            c6080i.m25385f(C6074e.m25357f(context, intent, c6080i.f21733i, C6080i.this.f21732h));
        }
    }

    /* renamed from: p0.i$f */
    public interface f {
        /* renamed from: a */
        void mo25156a(C6074e c6074e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6080i(Context context, f fVar, C4312b c4312b, C6081j c6081j) {
        Context applicationContext = context.getApplicationContext();
        this.f21725a = applicationContext;
        this.f21726b = (f) AbstractC5332a.m21800e(fVar);
        this.f21733i = c4312b;
        this.f21732h = c6081j;
        Handler m21675C = AbstractC5330M.m21675C();
        this.f21727c = m21675C;
        int i7 = AbstractC5330M.f18800a;
        Object[] objArr = 0;
        this.f21728d = i7 >= 23 ? new c() : null;
        this.f21729e = i7 >= 21 ? new e() : null;
        Uri m25360j = C6074e.m25360j();
        this.f21730f = m25360j != null ? new d(m21675C, applicationContext.getContentResolver(), m25360j) : null;
    }

    /* renamed from: f */
    public final void m25385f(C6074e c6074e) {
        if (!this.f21734j || c6074e.equals(this.f21731g)) {
            return;
        }
        this.f21731g = c6074e;
        this.f21726b.mo25156a(c6074e);
    }

    /* renamed from: g */
    public C6074e m25386g() {
        c cVar;
        if (this.f21734j) {
            return (C6074e) AbstractC5332a.m21800e(this.f21731g);
        }
        this.f21734j = true;
        d dVar = this.f21730f;
        if (dVar != null) {
            dVar.m25392a();
        }
        if (AbstractC5330M.f18800a >= 23 && (cVar = this.f21728d) != null) {
            b.m25390a(this.f21725a, cVar, this.f21727c);
        }
        C6074e m25357f = C6074e.m25357f(this.f21725a, this.f21729e != null ? this.f21725a.registerReceiver(this.f21729e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f21727c) : null, this.f21733i, this.f21732h);
        this.f21731g = m25357f;
        return m25357f;
    }

    /* renamed from: h */
    public void m25387h(C4312b c4312b) {
        this.f21733i = c4312b;
        m25385f(C6074e.m25358g(this.f21725a, c4312b, this.f21732h));
    }

    /* renamed from: i */
    public void m25388i(AudioDeviceInfo audioDeviceInfo) {
        C6081j c6081j = this.f21732h;
        if (AbstractC5330M.m21729c(audioDeviceInfo, c6081j == null ? null : c6081j.f21740a)) {
            return;
        }
        C6081j c6081j2 = audioDeviceInfo != null ? new C6081j(audioDeviceInfo) : null;
        this.f21732h = c6081j2;
        m25385f(C6074e.m25358g(this.f21725a, this.f21733i, c6081j2));
    }

    /* renamed from: j */
    public void m25389j() {
        c cVar;
        if (this.f21734j) {
            this.f21731g = null;
            if (AbstractC5330M.f18800a >= 23 && (cVar = this.f21728d) != null) {
                b.m25391b(this.f21725a, cVar);
            }
            BroadcastReceiver broadcastReceiver = this.f21729e;
            if (broadcastReceiver != null) {
                this.f21725a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f21730f;
            if (dVar != null) {
                dVar.m25393b();
            }
            this.f21734j = false;
        }
    }
}

package p138T4;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.firebase.messaging.C3968d;
import io.flutter.embedding.engine.C4659a;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p012B4.C0055f;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.InterfaceC0651c;
import p370w4.C6916a;
import p384y4.C7084j;
import p391z4.C7146a;

/* renamed from: T4.e */
/* loaded from: classes2.dex */
public class C2461e implements C0659k.c {

    /* renamed from: c */
    public final AtomicBoolean f7254c = new AtomicBoolean(false);

    /* renamed from: d */
    public C0659k f7255d;

    /* renamed from: e */
    public C4659a f7256e;

    /* renamed from: T4.e$a */
    public class a implements C0659k.d {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f7257a;

        public a(CountDownLatch countDownLatch) {
            this.f7257a = countDownLatch;
        }

        @Override // p061I4.C0659k.d
        /* renamed from: a */
        public void mo2314a(Object obj) {
            this.f7257a.countDown();
        }

        @Override // p061I4.C0659k.d
        /* renamed from: b */
        public void mo2315b(String str, String str2, Object obj) {
            this.f7257a.countDown();
        }

        @Override // p061I4.C0659k.d
        /* renamed from: c */
        public void mo2316c() {
            this.f7257a.countDown();
        }
    }

    /* renamed from: T4.e$b */
    public class b extends HashMap {

        /* renamed from: a */
        public final /* synthetic */ Map f7259a;

        public b(Map map) {
            this.f7259a = map;
            put("userCallbackHandle", Long.valueOf(C2461e.this.m8335g()));
            put("message", map);
        }
    }

    /* renamed from: n */
    public static void m8331n(long j7) {
        Context m8325a = AbstractC2457a.m8325a();
        if (m8325a == null) {
            Log.e("FLTFireBGExecutor", "Context is null, cannot continue.");
        } else {
            m8325a.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", j7).apply();
        }
    }

    /* renamed from: o */
    public static void m8332o(long j7) {
        AbstractC2457a.m8325a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", j7).apply();
    }

    @Override // p061I4.C0659k.c
    /* renamed from: b */
    public void mo2185b(C0658j c0658j, C0659k.d dVar) {
        if (!c0658j.f2254a.equals("MessagingBackground#initialized")) {
            dVar.mo2316c();
        } else {
            m8341m();
            dVar.mo2314a(Boolean.TRUE);
        }
    }

    /* renamed from: e */
    public void m8333e(Intent intent, CountDownLatch countDownLatch) {
        if (this.f7256e == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        a aVar = countDownLatch != null ? new a(countDownLatch) : null;
        byte[] byteArrayExtra = intent.getByteArrayExtra("notification");
        if (byteArrayExtra == null) {
            Log.e("FLTFireBGExecutor", "RemoteMessage byte array not found in Intent.");
            return;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            this.f7255d.m2653d("MessagingBackground#onMessage", new b(AbstractC2482z.m8407f(C3968d.CREATOR.createFromParcel(obtain))), aVar);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: f */
    public final long m8334f() {
        return AbstractC2457a.m8325a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
    }

    /* renamed from: g */
    public final long m8335g() {
        return AbstractC2457a.m8325a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
    }

    /* renamed from: h */
    public final void m8336h(InterfaceC0651c interfaceC0651c) {
        C0659k c0659k = new C0659k(interfaceC0651c, "plugins.flutter.io/firebase_messaging_background");
        this.f7255d = c0659k;
        c0659k.m2654e(this);
    }

    /* renamed from: i */
    public boolean m8337i() {
        return m8334f() != 0;
    }

    /* renamed from: j */
    public boolean m8338j() {
        return !this.f7254c.get();
    }

    /* renamed from: k */
    public final /* synthetic */ void m8339k(C0055f c0055f, C7084j c7084j, long j7) {
        String m135j = c0055f.m135j();
        AssetManager assets = AbstractC2457a.m8325a().getAssets();
        if (m8338j()) {
            if (c7084j != null) {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(c7084j.m29182b()));
                this.f7256e = new C4659a(AbstractC2457a.m8325a(), c7084j.m29182b());
            } else {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                this.f7256e = new C4659a(AbstractC2457a.m8325a());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j7);
            if (lookupCallbackInformation == null) {
                Log.e("FLTFireBGExecutor", "Failed to find registered callback");
                return;
            }
            C7146a m20207l = this.f7256e.m20207l();
            m8336h(m20207l);
            m20207l.m29443i(new C7146a.b(assets, m135j, lookupCallbackInformation));
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void m8340l(final C0055f c0055f, Handler handler, final C7084j c7084j, final long j7) {
        c0055f.m143s(AbstractC2457a.m8325a());
        c0055f.m134i(AbstractC2457a.m8325a(), null, handler, new Runnable() { // from class: T4.d
            @Override // java.lang.Runnable
            public final void run() {
                C2461e.this.m8339k(c0055f, c7084j, j7);
            }
        });
    }

    /* renamed from: m */
    public final void m8341m() {
        this.f7254c.set(true);
        FlutterFirebaseMessagingBackgroundService.m20640m();
    }

    /* renamed from: p */
    public void m8342p() {
        if (m8338j()) {
            long m8334f = m8334f();
            if (m8334f != 0) {
                m8343q(m8334f, null);
            }
        }
    }

    /* renamed from: q */
    public void m8343q(final long j7, final C7084j c7084j) {
        if (this.f7256e != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        final C0055f m28349c = C6916a.m28346e().m28349c();
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: T4.c
            @Override // java.lang.Runnable
            public final void run() {
                C2461e.this.m8340l(m28349c, handler, c7084j, j7);
            }
        });
    }
}

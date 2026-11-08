package p259j0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.apache.tika.utils.XMLReaderUtils;
import p272k4.C5410A;
import p272k4.C5413D;

/* renamed from: j0.t */
/* loaded from: classes.dex */
public final class C5351t {

    /* renamed from: e */
    public static C5351t f18873e;

    /* renamed from: a */
    public final Handler f18874a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList f18875b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Object f18876c = new Object();

    /* renamed from: d */
    public int f18877d = 0;

    /* renamed from: j0.t$b */
    public static final class b {

        /* renamed from: j0.t$b$a */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            public final C5351t f18878a;

            public a(C5351t c5351t) {
                this.f18878a = c5351t;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f18878a.m21895k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        /* renamed from: a */
        public static void m21896a(Context context, C5351t c5351t) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC5332a.m21800e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(c5351t);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                c5351t.m21895k(5);
            }
        }
    }

    /* renamed from: j0.t$c */
    public interface c {
        /* renamed from: a */
        void mo2070a(int i7);
    }

    /* renamed from: j0.t$d */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int m21890g = C5351t.m21890g(context);
            if (AbstractC5330M.f18800a < 31 || m21890g != 5) {
                C5351t.this.m21895k(m21890g);
            } else {
                b.m21896a(context, C5351t.this);
            }
        }
    }

    public C5351t(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    /* renamed from: d */
    public static synchronized C5351t m21888d(Context context) {
        C5351t c5351t;
        synchronized (C5351t.class) {
            try {
                if (f18873e == null) {
                    f18873e = new C5351t(context);
                }
                c5351t = f18873e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5351t;
    }

    /* renamed from: e */
    public static int m21889e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return 2;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return AbstractC5330M.f18800a >= 29 ? 9 : 0;
        }
    }

    /* renamed from: g */
    public static int m21890g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i7 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i7 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m21889e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i7;
    }

    /* renamed from: f */
    public int m21891f() {
        int i7;
        synchronized (this.f18876c) {
            i7 = this.f18877d;
        }
        return i7;
    }

    /* renamed from: h */
    public final /* synthetic */ void m21892h(c cVar) {
        cVar.mo2070a(m21891f());
    }

    /* renamed from: i */
    public void m21893i(final c cVar) {
        m21894j();
        this.f18875b.add(new WeakReference(cVar));
        this.f18874a.post(new Runnable() { // from class: j0.s
            @Override // java.lang.Runnable
            public final void run() {
                C5351t.this.m21892h(cVar);
            }
        });
    }

    /* renamed from: j */
    public final void m21894j() {
        Iterator it = this.f18875b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f18875b.remove(weakReference);
            }
        }
    }

    /* renamed from: k */
    public final void m21895k(int i7) {
        synchronized (this.f18876c) {
            try {
                if (this.f18877d == i7) {
                    return;
                }
                this.f18877d = i7;
                Iterator it = this.f18875b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        cVar.mo2070a(i7);
                    } else {
                        this.f18875b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

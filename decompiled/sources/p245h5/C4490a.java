package p245h5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4411L;
import p237g5.AbstractC4420V;
import p237g5.AbstractC4421W;
import p237g5.AbstractC4422X;
import p237g5.AbstractC4437g;
import p237g5.AbstractC4468z;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.EnumC4455p;
import p264j5.C5378g;

/* renamed from: h5.a */
/* loaded from: classes2.dex */
public final class C4490a extends AbstractC4468z {

    /* renamed from: c */
    public static final AbstractC4422X f15986c = m19106j();

    /* renamed from: a */
    public final AbstractC4421W f15987a;

    /* renamed from: b */
    public Context f15988b;

    /* renamed from: h5.a$b */
    public static final class b extends AbstractC4420V {

        /* renamed from: a */
        public final AbstractC4420V f15989a;

        /* renamed from: b */
        public final Context f15990b;

        /* renamed from: c */
        public final ConnectivityManager f15991c;

        /* renamed from: d */
        public final Object f15992d = new Object();

        /* renamed from: e */
        public Runnable f15993e;

        /* renamed from: h5.a$b$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ c f15994a;

            public a(c cVar) {
                this.f15994a = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f15991c.unregisterNetworkCallback(this.f15994a);
            }
        }

        /* renamed from: h5.a$b$b, reason: collision with other inner class name */
        public class RunnableC7221b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ d f15996a;

            public RunnableC7221b(d dVar) {
                this.f15996a = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f15990b.unregisterReceiver(this.f15996a);
            }
        }

        /* renamed from: h5.a$b$c */
        public class c extends ConnectivityManager.NetworkCallback {
            public c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b.this.f15989a.mo18750k();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z6) {
                if (z6) {
                    return;
                }
                b.this.f15989a.mo18750k();
            }
        }

        /* renamed from: h5.a$b$d */
        public class d extends BroadcastReceiver {

            /* renamed from: a */
            public boolean f15999a;

            public d() {
                this.f15999a = false;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z6 = this.f15999a;
                boolean z7 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f15999a = z7;
                if (!z7 || z6) {
                    return;
                }
                b.this.f15989a.mo18750k();
            }
        }

        public b(AbstractC4420V abstractC4420V, Context context) {
            this.f15989a = abstractC4420V;
            this.f15990b = context;
            if (context == null) {
                this.f15991c = null;
                return;
            }
            this.f15991c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                m19112s();
            } catch (SecurityException e7) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e7);
            }
        }

        @Override // p237g5.AbstractC4431d
        /* renamed from: a */
        public String mo18909a() {
            return this.f15989a.mo18909a();
        }

        @Override // p237g5.AbstractC4431d
        /* renamed from: h */
        public AbstractC4437g mo18910h(C4426a0 c4426a0, C4429c c4429c) {
            return this.f15989a.mo18910h(c4426a0, c4429c);
        }

        @Override // p237g5.AbstractC4420V
        /* renamed from: j */
        public boolean mo18749j(long j7, TimeUnit timeUnit) {
            return this.f15989a.mo18749j(j7, timeUnit);
        }

        @Override // p237g5.AbstractC4420V
        /* renamed from: k */
        public void mo18750k() {
            this.f15989a.mo18750k();
        }

        @Override // p237g5.AbstractC4420V
        /* renamed from: l */
        public EnumC4455p mo18751l(boolean z6) {
            return this.f15989a.mo18751l(z6);
        }

        @Override // p237g5.AbstractC4420V
        /* renamed from: m */
        public void mo18752m(EnumC4455p enumC4455p, Runnable runnable) {
            this.f15989a.mo18752m(enumC4455p, runnable);
        }

        @Override // p237g5.AbstractC4420V
        /* renamed from: n */
        public AbstractC4420V mo18753n() {
            m19113t();
            return this.f15989a.mo18753n();
        }

        @Override // p237g5.AbstractC4420V
        /* renamed from: o */
        public AbstractC4420V mo18754o() {
            m19113t();
            return this.f15989a.mo18754o();
        }

        /* renamed from: s */
        public final void m19112s() {
            if (Build.VERSION.SDK_INT >= 24 && this.f15991c != null) {
                c cVar = new c();
                this.f15991c.registerDefaultNetworkCallback(cVar);
                this.f15993e = new a(cVar);
            } else {
                d dVar = new d();
                this.f15990b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f15993e = new RunnableC7221b(dVar);
            }
        }

        /* renamed from: t */
        public final void m19113t() {
            synchronized (this.f15992d) {
                try {
                    Runnable runnable = this.f15993e;
                    if (runnable != null) {
                        runnable.run();
                        this.f15993e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C4490a(AbstractC4421W abstractC4421W) {
        this.f15987a = (AbstractC4421W) AbstractC2932o.m10573p(abstractC4421W, "delegateBuilder");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /* renamed from: j */
    public static AbstractC4422X m19106j() {
        try {
            try {
                AbstractC4422X abstractC4422X = (AbstractC4422X) C5378g.class.asSubclass(AbstractC4422X.class).getConstructor(null).newInstance(null);
                if (AbstractC4411L.m18670a(abstractC4422X)) {
                    return abstractC4422X;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
                return null;
            } catch (Exception e7) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e7);
                return null;
            }
        } catch (ClassCastException e8) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e8);
            return null;
        }
    }

    /* renamed from: k */
    public static C4490a m19107k(AbstractC4421W abstractC4421W) {
        return new C4490a(abstractC4421W);
    }

    @Override // p237g5.AbstractC4467y, p237g5.AbstractC4421W
    /* renamed from: a */
    public AbstractC4420V mo18756a() {
        return new b(this.f15987a.mo18756a(), this.f15988b);
    }

    @Override // p237g5.AbstractC4468z, p237g5.AbstractC4467y
    /* renamed from: e */
    public AbstractC4421W mo19036e() {
        return this.f15987a;
    }

    /* renamed from: i */
    public C4490a m19108i(Context context) {
        this.f15988b = context;
        return this;
    }
}

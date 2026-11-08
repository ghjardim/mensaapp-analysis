package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3645c;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.StringUtils;
import p045G2.AbstractC0380a;
import p368w2.C6861b;
import p368w2.C6863d;
import p368w2.C6870k;

/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC3772c {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile AbstractC0380a zzB;
    private C6861b zzC;
    private boolean zzD;
    private volatile C3791l0 zzE;
    C3813w0 zza;
    final Handler zzb;
    protected c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC3782h zzn;
    private final C6870k zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC3792m zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private ServiceConnectionC3785i0 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final C6863d[] zze = new C6863d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        /* renamed from: b */
        void mo6275b(int i7);

        /* renamed from: f */
        void mo6278f(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        /* renamed from: a */
        void mo6274a(C6861b c6861b);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface c {
        /* renamed from: a */
        void mo14890a(C6861b c6861b);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    public class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC3772c.c
        /* renamed from: a */
        public final void mo14890a(C6861b c6861b) {
            if (c6861b.m28241B0()) {
                AbstractC3772c abstractC3772c = AbstractC3772c.this;
                abstractC3772c.getRemoteService(null, abstractC3772c.getScopes());
            } else if (AbstractC3772c.this.zzx != null) {
                AbstractC3772c.this.zzx.mo6274a(c6861b);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
        /* renamed from: a */
        void mo14843a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC3772c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.AbstractC3772c.a r13, com.google.android.gms.common.internal.AbstractC3772c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.h r3 = com.google.android.gms.common.internal.AbstractC3782h.m15078b(r10)
            w2.k r4 = p368w2.C6870k.m28272f()
            com.google.android.gms.common.internal.AbstractC3802r.m15129k(r13)
            com.google.android.gms.common.internal.AbstractC3802r.m15129k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC3772c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    public static /* bridge */ /* synthetic */ void zzj(AbstractC3772c abstractC3772c, C3791l0 c3791l0) {
        abstractC3772c.zzE = c3791l0;
        if (abstractC3772c.usesClientTelemetry()) {
            C3776e c3776e = c3791l0.f12526d;
            C3804s.m15135b().m15137c(c3776e == null ? null : c3776e.m15067C0());
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC3772c abstractC3772c, int i7) {
        int i8;
        int i9;
        synchronized (abstractC3772c.zzp) {
            i8 = abstractC3772c.zzv;
        }
        if (i8 == 3) {
            abstractC3772c.zzD = true;
            i9 = 5;
        } else {
            i9 = 4;
        }
        Handler handler = abstractC3772c.zzb;
        handler.sendMessage(handler.obtainMessage(i9, abstractC3772c.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC3772c abstractC3772c, int i7, int i8, IInterface iInterface) {
        synchronized (abstractC3772c.zzp) {
            try {
                if (abstractC3772c.zzv != i7) {
                    return false;
                }
                abstractC3772c.m15048c(i8, iInterface);
                return true;
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(AbstractC3772c abstractC3772c) {
        if (abstractC3772c.zzD || TextUtils.isEmpty(abstractC3772c.getServiceDescriptor()) || TextUtils.isEmpty(abstractC3772c.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(abstractC3772c.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void m15048c(int i7, IInterface iInterface) {
        C3813w0 c3813w0;
        AbstractC3802r.m15119a((i7 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i7;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i7 == 1) {
                    ServiceConnectionC3785i0 serviceConnectionC3785i0 = this.zzu;
                    if (serviceConnectionC3785i0 != null) {
                        AbstractC3782h abstractC3782h = this.zzn;
                        String m15155b = this.zza.m15155b();
                        AbstractC3802r.m15129k(m15155b);
                        abstractC3782h.m15084g(m15155b, this.zza.m15154a(), 4225, serviceConnectionC3785i0, zze(), this.zza.m15156c());
                        this.zzu = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    ServiceConnectionC3785i0 serviceConnectionC3785i02 = this.zzu;
                    if (serviceConnectionC3785i02 != null && (c3813w0 = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c3813w0.m15155b() + " on " + c3813w0.m15154a());
                        AbstractC3782h abstractC3782h2 = this.zzn;
                        String m15155b2 = this.zza.m15155b();
                        AbstractC3802r.m15129k(m15155b2);
                        abstractC3782h2.m15084g(m15155b2, this.zza.m15154a(), 4225, serviceConnectionC3785i02, zze(), this.zza.m15156c());
                        this.zzd.incrementAndGet();
                    }
                    ServiceConnectionC3785i0 serviceConnectionC3785i03 = new ServiceConnectionC3785i0(this, this.zzd.get());
                    this.zzu = serviceConnectionC3785i03;
                    C3813w0 c3813w02 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new C3813w0(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new C3813w0(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = c3813w02;
                    if (c3813w02.m15156c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.m15155b())));
                    }
                    AbstractC3782h abstractC3782h3 = this.zzn;
                    String m15155b3 = this.zza.m15155b();
                    AbstractC3802r.m15129k(m15155b3);
                    C6861b mo15082e = abstractC3782h3.mo15082e(new C3799p0(m15155b3, this.zza.m15154a(), 4225, this.zza.m15156c()), serviceConnectionC3785i03, zze(), getBindServiceExecutor());
                    if (!mo15082e.m28241B0()) {
                        Log.w("GmsClient", "unable to connect to service: " + this.zza.m15155b() + " on " + this.zza.m15154a());
                        int m28242x0 = mo15082e.m28242x0() == -1 ? 16 : mo15082e.m28242x0();
                        if (mo15082e.m28244z0() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, mo15082e.m28244z0());
                        }
                        zzl(m28242x0, bundle, this.zzd.get());
                    }
                } else if (i7 == 4) {
                    AbstractC3802r.m15129k(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int mo28258h = this.zzo.mo28258h(this.zzl, getMinApkVersion());
        if (mo28258h == 0) {
            connect(new d());
        } else {
            m15048c(1, null);
            triggerNotAvailable(new d(), mo28258h, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        AbstractC3802r.m15130l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        m15048c(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((AbstractC3781g0) this.zzt.get(i7)).m15076d();
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        m15048c(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        InterfaceC3792m interfaceC3792m;
        synchronized (this.zzp) {
            i7 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC3792m = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i7 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i7 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i7 == 4) {
            printWriter.print("CONNECTED");
        } else if (i7 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC3792m == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC3792m.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j7 = this.zzh;
            append.println(j7 + StringUtils.SPACE + simpleDateFormat.format(new Date(j7)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i8 = this.zzf;
            if (i8 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i8 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i8 != 3) {
                printWriter.append((CharSequence) String.valueOf(i8));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j8 = this.zzg;
            append2.println(j8 + StringUtils.SPACE + simpleDateFormat.format(new Date(j8)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC3645c.m14807a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j9 = this.zzj;
            append3.println(j9 + StringUtils.SPACE + simpleDateFormat.format(new Date(j9)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public C6863d[] getApiFeatures() {
        return zze;
    }

    public AbstractC0380a getAttributionSourceWrapper() {
        return null;
    }

    public final C6863d[] getAvailableFeatures() {
        C3791l0 c3791l0 = this.zzE;
        if (c3791l0 == null) {
            return null;
        }
        return c3791l0.f12524b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        C3813w0 c3813w0;
        if (!isConnected() || (c3813w0 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c3813w0.m15154a();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(InterfaceC3786j interfaceC3786j, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i7 = this.zzy;
        int i8 = C6870k.f24689a;
        Scope[] scopeArr = C3778f.f12488v;
        Bundle bundle = new Bundle();
        C6863d[] c6863dArr = C3778f.f12489w;
        C3778f c3778f = new C3778f(6, i7, i8, null, null, scopeArr, bundle, null, c6863dArr, c6863dArr, true, 0, false, str);
        c3778f.f12493d = this.zzl.getPackageName();
        c3778f.f12496n = getServiceRequestExtraArgs;
        if (set != null) {
            c3778f.f12495f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c3778f.f12497o = account;
            if (interfaceC3786j != null) {
                c3778f.f12494e = interfaceC3786j.asBinder();
            }
        } else if (requiresAccount()) {
            c3778f.f12497o = getAccount();
        }
        c3778f.f12498p = zze;
        c3778f.f12499q = getApiFeatures();
        if (usesClientTelemetry()) {
            c3778f.f12502t = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC3792m interfaceC3792m = this.zzr;
                    if (interfaceC3792m != null) {
                        interfaceC3792m.mo15039n(new BinderC3783h0(this, this.zzd.get()), c3778f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            triggerConnectionSuspended(3);
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                AbstractC3802r.m15130l(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC3792m interfaceC3792m = this.zzr;
                if (interfaceC3792m == null) {
                    return null;
                }
                return interfaceC3792m.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C3776e getTelemetryConfiguration() {
        C3791l0 c3791l0 = this.zzE;
        if (c3791l0 == null) {
            return null;
        }
        return c3791l0.f12526d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z6;
        synchronized (this.zzp) {
            z6 = this.zzv == 4;
        }
        return z6;
    }

    public boolean isConnecting() {
        boolean z6;
        synchronized (this.zzp) {
            int i7 = this.zzv;
            z6 = true;
            if (i7 != 2 && i7 != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(C6861b c6861b) {
        this.zzi = c6861b.m28242x0();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i7) {
        this.zzf = i7;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i7, IBinder iBinder, Bundle bundle, int i8) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i8, -1, new C3787j0(this, i7, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.mo14843a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i7) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i7));
    }

    public void triggerNotAvailable(c cVar, int i7, PendingIntent pendingIntent) {
        AbstractC3802r.m15130l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i7, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i7, Bundle bundle, int i8) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i8, -1, new C3789k0(this, i7, bundle)));
    }

    public AbstractC3772c(Context context, Looper looper, AbstractC3782h abstractC3782h, C6870k c6870k, int i7, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        AbstractC3802r.m15130l(context, "Context must not be null");
        this.zzl = context;
        AbstractC3802r.m15130l(looper, "Looper must not be null");
        this.zzm = looper;
        AbstractC3802r.m15130l(abstractC3782h, "Supervisor must not be null");
        this.zzn = abstractC3782h;
        AbstractC3802r.m15130l(c6870k, "API availability must not be null");
        this.zzo = c6870k;
        this.zzb = new HandlerC3779f0(this, looper);
        this.zzy = i7;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void setAttributionSourceWrapper(AbstractC0380a abstractC0380a) {
    }
}

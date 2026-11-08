package p150V2;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p031E2.AbstractC0281q;
import p031E2.AbstractC0283s;
import p031E2.C0271g;
import p031E2.InterfaceC0268d;
import p207d.AbstractC4094d;

/* renamed from: V2.a */
/* loaded from: classes.dex */
public class C2618a {

    /* renamed from: r */
    public static final long f7728r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    public static volatile ScheduledExecutorService f7729s = null;

    /* renamed from: t */
    public static final Object f7730t = new Object();

    /* renamed from: u */
    public static volatile InterfaceC2622e f7731u = new C2620c();

    /* renamed from: a */
    public final Object f7732a;

    /* renamed from: b */
    public final PowerManager.WakeLock f7733b;

    /* renamed from: c */
    public int f7734c;

    /* renamed from: d */
    public Future f7735d;

    /* renamed from: e */
    public long f7736e;

    /* renamed from: f */
    public final Set f7737f;

    /* renamed from: g */
    public boolean f7738g;

    /* renamed from: h */
    public int f7739h;

    /* renamed from: i */
    public zzb f7740i;

    /* renamed from: j */
    public InterfaceC0268d f7741j;

    /* renamed from: k */
    public WorkSource f7742k;

    /* renamed from: l */
    public final String f7743l;

    /* renamed from: m */
    public final String f7744m;

    /* renamed from: n */
    public final Context f7745n;

    /* renamed from: o */
    public final Map f7746o;

    /* renamed from: p */
    public AtomicInteger f7747p;

    /* renamed from: q */
    public final ScheduledExecutorService f7748q;

    public C2618a(Context context, int i7, String str) {
        String packageName = context.getPackageName();
        this.f7732a = new Object();
        this.f7734c = 0;
        this.f7737f = new HashSet();
        this.f7738g = true;
        this.f7741j = C0271g.m1116d();
        this.f7746o = new HashMap();
        this.f7747p = new AtomicInteger(0);
        AbstractC3802r.m15130l(context, "WakeLock: context must not be null");
        AbstractC3802r.m15124f(str, "WakeLock: wakeLockName must not be empty");
        this.f7745n = context.getApplicationContext();
        this.f7744m = str;
        this.f7740i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f7743l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f7743l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i7, str);
        this.f7733b = newWakeLock;
        if (AbstractC0283s.m1150c(context)) {
            WorkSource m1149b = AbstractC0283s.m1149b(context, AbstractC0281q.m1145b(packageName) ? context.getPackageName() : packageName);
            this.f7742k = m1149b;
            if (m1149b != null) {
                m8998i(newWakeLock, m1149b);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f7729s;
        if (scheduledExecutorService == null) {
            synchronized (f7730t) {
                try {
                    scheduledExecutorService = f7729s;
                    if (scheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f7729s = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f7748q = scheduledExecutorService;
    }

    /* renamed from: e */
    public static /* synthetic */ void m8997e(C2618a c2618a) {
        synchronized (c2618a.f7732a) {
            try {
                if (c2618a.m9000b()) {
                    Log.e("WakeLock", String.valueOf(c2618a.f7743l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c2618a.m9004g();
                    if (c2618a.m9000b()) {
                        c2618a.f7734c = 1;
                        c2618a.m9005h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public static void m8998i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
            Log.wtf("WakeLock", e7.toString());
        }
    }

    /* renamed from: a */
    public void m8999a(long j7) {
        this.f7747p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f7728r), 1L);
        if (j7 > 0) {
            max = Math.min(j7, max);
        }
        synchronized (this.f7732a) {
            try {
                if (!m9000b()) {
                    this.f7740i = zzb.zza(false, null);
                    this.f7733b.acquire();
                    this.f7741j.mo1111b();
                }
                this.f7734c++;
                this.f7739h++;
                m9003f(null);
                C2621d c2621d = (C2621d) this.f7746o.get(null);
                if (c2621d == null) {
                    c2621d = new C2621d(null);
                    this.f7746o.put(null, c2621d);
                }
                c2621d.f7750a++;
                long mo1111b = this.f7741j.mo1111b();
                long j8 = Long.MAX_VALUE - mo1111b > max ? mo1111b + max : Long.MAX_VALUE;
                if (j8 > this.f7736e) {
                    this.f7736e = j8;
                    Future future = this.f7735d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f7735d = this.f7748q.schedule(new Runnable() { // from class: V2.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2618a.m8997e(C2618a.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public boolean m9000b() {
        boolean z6;
        synchronized (this.f7732a) {
            z6 = this.f7734c > 0;
        }
        return z6;
    }

    /* renamed from: c */
    public void m9001c() {
        if (this.f7747p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f7743l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f7732a) {
            try {
                m9003f(null);
                if (this.f7746o.containsKey(null)) {
                    C2621d c2621d = (C2621d) this.f7746o.get(null);
                    if (c2621d != null) {
                        int i7 = c2621d.f7750a - 1;
                        c2621d.f7750a = i7;
                        if (i7 == 0) {
                            this.f7746o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f7743l).concat(" counter does not exist"));
                }
                m9005h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public void m9002d(boolean z6) {
        synchronized (this.f7732a) {
            this.f7738g = z6;
        }
    }

    /* renamed from: f */
    public final String m9003f(String str) {
        if (this.f7738g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    public final void m9004g() {
        if (this.f7737f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f7737f);
        this.f7737f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC4094d.m17162a(arrayList.get(0));
        throw null;
    }

    /* renamed from: h */
    public final void m9005h(int i7) {
        synchronized (this.f7732a) {
            try {
                if (m9000b()) {
                    if (this.f7738g) {
                        int i8 = this.f7734c - 1;
                        this.f7734c = i8;
                        if (i8 > 0) {
                            return;
                        }
                    } else {
                        this.f7734c = 0;
                    }
                    m9004g();
                    Iterator it = this.f7746o.values().iterator();
                    while (it.hasNext()) {
                        ((C2621d) it.next()).f7750a = 0;
                    }
                    this.f7746o.clear();
                    Future future = this.f7735d;
                    if (future != null) {
                        future.cancel(false);
                        this.f7735d = null;
                        this.f7736e = 0L;
                    }
                    this.f7739h = 0;
                    if (this.f7733b.isHeld()) {
                        try {
                            try {
                                this.f7733b.release();
                                if (this.f7740i != null) {
                                    this.f7740i = null;
                                }
                            } catch (RuntimeException e7) {
                                if (!e7.getClass().equals(RuntimeException.class)) {
                                    throw e7;
                                }
                                Log.e("WakeLock", String.valueOf(this.f7743l).concat(" failed to release!"), e7);
                                if (this.f7740i != null) {
                                    this.f7740i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f7740i != null) {
                                this.f7740i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f7743l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

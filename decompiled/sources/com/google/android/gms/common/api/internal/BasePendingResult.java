package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.AbstractC3731n;
import com.google.android.gms.common.api.AbstractC3733p;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.InterfaceC3730m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.InterfaceC3788k;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p207d.AbstractC4094d;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC3729l> extends AbstractC3650h {
    static final ThreadLocal zaa = new C3713r0();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private AbstractC3715s0 resultGuardian;
    protected final HandlerC3654a zab;
    protected final WeakReference zac;
    private InterfaceC3730m zah;
    private InterfaceC3729l zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC3788k zao;
    private volatile C3693h0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC3654a extends zau {
        public HandlerC3654a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m14839a(InterfaceC3730m interfaceC3730m, InterfaceC3729l interfaceC3729l) {
            int i7 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((InterfaceC3730m) AbstractC3802r.m15129k(interfaceC3730m), interfaceC3729l)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 != 1) {
                if (i7 == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f12251p);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i7, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            InterfaceC3730m interfaceC3730m = (InterfaceC3730m) pair.first;
            InterfaceC3729l interfaceC3729l = (InterfaceC3729l) pair.second;
            try {
                interfaceC3730m.mo14963a(interfaceC3729l);
            } catch (RuntimeException e7) {
                BasePendingResult.zal(interfaceC3729l);
                throw e7;
            }
        }
    }

    public BasePendingResult(AbstractC3648f abstractC3648f) {
        this.zab = new HandlerC3654a(abstractC3648f != null ? abstractC3648f.mo14817d() : Looper.getMainLooper());
        this.zac = new WeakReference(abstractC3648f);
    }

    public static void zal(InterfaceC3729l interfaceC3729l) {
    }

    /* renamed from: a */
    public final InterfaceC3729l m14837a() {
        InterfaceC3729l interfaceC3729l;
        synchronized (this.zae) {
            AbstractC3802r.m15133o(!this.zal, "Result has already been consumed.");
            AbstractC3802r.m15133o(isReady(), "Result is not ready.");
            interfaceC3729l = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        AbstractC4094d.m17162a(this.zai.getAndSet(null));
        return (InterfaceC3729l) AbstractC3802r.m15129k(interfaceC3729l);
    }

    @Override // com.google.android.gms.common.api.AbstractC3650h
    public final void addStatusListener(AbstractC3650h.a aVar) {
        AbstractC3802r.m15120b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.mo14820a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        AbstractC3802r.m15128j("await must not be called on the UI thread");
        AbstractC3802r.m15133o(!this.zal, "Result has already been consumed");
        AbstractC3802r.m15133o(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f12249n);
        }
        AbstractC3802r.m15133o(isReady(), "Result is not ready.");
        return (R) m14837a();
    }

    /* renamed from: b */
    public final void m14838b(InterfaceC3729l interfaceC3729l) {
        this.zaj = interfaceC3729l;
        this.zak = interfaceC3729l.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            InterfaceC3730m interfaceC3730m = this.zah;
            if (interfaceC3730m != null) {
                this.zab.removeMessages(2);
                this.zab.m14839a(interfaceC3730m, m14837a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC3650h.a) arrayList.get(i7)).mo14820a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    m14838b(createFailedResult(Status.f12252q));
                }
            } finally {
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z6;
        synchronized (this.zae) {
            z6 = this.zam;
        }
        return z6;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(InterfaceC3788k interfaceC3788k) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r7) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r7);
                    return;
                }
                isReady();
                AbstractC3802r.m15133o(!isReady(), "Results have already been set");
                AbstractC3802r.m15133o(!this.zal, "Result has already been consumed");
                m14838b(r7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(InterfaceC3730m interfaceC3730m) {
        synchronized (this.zae) {
            try {
                if (interfaceC3730m == null) {
                    this.zah = null;
                    return;
                }
                boolean z6 = true;
                AbstractC3802r.m15133o(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z6 = false;
                }
                AbstractC3802r.m15133o(z6, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.m14839a(interfaceC3730m, m14837a());
                } else {
                    this.zah = interfaceC3730m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends InterfaceC3729l> AbstractC3733p then(AbstractC3731n abstractC3731n) {
        AbstractC3733p m14964b;
        AbstractC3802r.m15133o(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                AbstractC3802r.m15133o(this.zap == null, "Cannot call then() twice.");
                AbstractC3802r.m15133o(this.zah == null, "Cannot call then() if callbacks are set.");
                AbstractC3802r.m15133o(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new C3693h0(this.zac);
                m14964b = this.zap.m14964b(abstractC3731n);
                if (isReady()) {
                    this.zab.m14839a(this.zap, m14837a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m14964b;
    }

    public final void zak() {
        boolean z6 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z6 = false;
        }
        this.zaq = z6;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((AbstractC3648f) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(AbstractC3695i0 abstractC3695i0) {
        this.zai.set(abstractC3695i0);
    }

    @Override // com.google.android.gms.common.api.AbstractC3650h
    @ResultIgnorabilityUnspecified
    public final R await(long j7, TimeUnit timeUnit) {
        if (j7 > 0) {
            AbstractC3802r.m15128j("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC3802r.m15133o(!this.zal, "Result has already been consumed.");
        AbstractC3802r.m15133o(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j7, timeUnit)) {
                forceFailureUnlessReady(Status.f12251p);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f12249n);
        }
        AbstractC3802r.m15133o(isReady(), "Result is not ready.");
        return (R) m14837a();
    }

    public final void setResultCallback(InterfaceC3730m interfaceC3730m, long j7, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (interfaceC3730m == null) {
                    this.zah = null;
                    return;
                }
                boolean z6 = true;
                AbstractC3802r.m15133o(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z6 = false;
                }
                AbstractC3802r.m15133o(z6, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.m14839a(interfaceC3730m, m14837a());
                } else {
                    this.zah = interfaceC3730m;
                    HandlerC3654a handlerC3654a = this.zab;
                    handlerC3654a.sendMessageDelayed(handlerC3654a.obtainMessage(2, this), timeUnit.toMillis(j7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

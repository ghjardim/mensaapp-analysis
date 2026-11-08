package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.internal.AbstractC3684d;
import com.google.android.gms.common.api.internal.AbstractC3700l;
import com.google.android.gms.common.api.internal.AbstractC3708p;
import com.google.android.gms.common.api.internal.AbstractC3710q;
import com.google.android.gms.common.api.internal.AbstractC3720v;
import com.google.android.gms.common.api.internal.AbstractC3724x;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC3702m;
import com.google.android.gms.common.api.internal.BinderC3683c0;
import com.google.android.gms.common.api.internal.C3653B;
import com.google.android.gms.common.api.internal.C3663K;
import com.google.android.gms.common.api.internal.C3668P;
import com.google.android.gms.common.api.internal.C3678a;
import com.google.android.gms.common.api.internal.C3680b;
import com.google.android.gms.common.api.internal.C3688f;
import com.google.android.gms.common.api.internal.C3698k;
import com.google.android.gms.common.api.internal.InterfaceC3716t;
import com.google.android.gms.common.internal.AbstractC3772c;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.C3774d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import p207d.AbstractC4094d;

/* renamed from: com.google.android.gms.common.api.e */
/* loaded from: classes.dex */
public abstract class AbstractC3647e {
    protected final C3688f zaa;
    private final Context zab;
    private final String zac;
    private final C3643a zad;
    private final C3643a.d zae;
    private final C3680b zaf;
    private final Looper zag;
    private final int zah;
    private final AbstractC3648f zai;
    private final InterfaceC3716t zaj;

    /* renamed from: com.google.android.gms.common.api.e$a */
    public static class a {

        /* renamed from: c */
        public static final a f12263c = new C7214a().m14811a();

        /* renamed from: a */
        public final InterfaceC3716t f12264a;

        /* renamed from: b */
        public final Looper f12265b;

        /* renamed from: com.google.android.gms.common.api.e$a$a, reason: collision with other inner class name */
        public static class C7214a {

            /* renamed from: a */
            public InterfaceC3716t f12266a;

            /* renamed from: b */
            public Looper f12267b;

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public a m14811a() {
                if (this.f12266a == null) {
                    this.f12266a = new C3678a();
                }
                if (this.f12267b == null) {
                    this.f12267b = Looper.getMainLooper();
                }
                return new a(this.f12266a, this.f12267b);
            }

            /* renamed from: b */
            public C7214a m14812b(Looper looper) {
                AbstractC3802r.m15130l(looper, "Looper must not be null.");
                this.f12267b = looper;
                return this;
            }

            /* renamed from: c */
            public C7214a m14813c(InterfaceC3716t interfaceC3716t) {
                AbstractC3802r.m15130l(interfaceC3716t, "StatusExceptionMapper must not be null.");
                this.f12266a = interfaceC3716t;
                return this;
            }
        }

        public a(InterfaceC3716t interfaceC3716t, Account account, Looper looper) {
            this.f12264a = interfaceC3716t;
            this.f12265b = looper;
        }
    }

    public AbstractC3647e(Activity activity, C3643a c3643a, C3643a.d dVar, a aVar) {
        this(activity, activity, c3643a, dVar, aVar);
    }

    public AbstractC3648f asGoogleApiClient() {
        return this.zai;
    }

    /* renamed from: b */
    public final AbstractC3684d m14809b(int i7, AbstractC3684d abstractC3684d) {
        abstractC3684d.zak();
        this.zaa.m14933C(this, i7, abstractC3684d);
        return abstractC3684d;
    }

    /* renamed from: c */
    public final Task m14810c(int i7, AbstractC3720v abstractC3720v) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.m14934D(this, i7, abstractC3720v, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public C3774d.a createClientSettingsBuilder() {
        C3774d.a aVar = new C3774d.a();
        aVar.m15063d(null);
        aVar.m15062c(Collections.emptySet());
        aVar.m15064e(this.zab.getClass().getName());
        aVar.m15061b(this.zab.getPackageName());
        return aVar;
    }

    public Task<Boolean> disconnectService() {
        return this.zaa.m14949w(this);
    }

    public <A extends C3643a.b, T extends AbstractC3684d> T doBestEffortWrite(T t7) {
        m14809b(2, t7);
        return t7;
    }

    public <A extends C3643a.b, T extends AbstractC3684d> T doRead(T t7) {
        m14809b(0, t7);
        return t7;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends C3643a.b, T extends AbstractC3708p, U extends AbstractC3724x> Task<Void> doRegisterEventListener(T t7, U u7) {
        AbstractC3802r.m15129k(t7);
        AbstractC3802r.m15129k(u7);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C3698k.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends C3643a.b, T extends AbstractC3684d> T doWrite(T t7) {
        m14809b(1, t7);
        return t7;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C3680b getApiKey() {
        return this.zaf;
    }

    public C3643a.d getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C3698k registerListener(L l7, String str) {
        return AbstractC3700l.m14974a(l7, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3643a.f zab(Looper looper, C3663K c3663k) {
        C3774d m15060a = createClientSettingsBuilder().m15060a();
        C3643a.f buildClient = ((C3643a.a) AbstractC3802r.m15129k(this.zad.m14804a())).buildClient(this.zab, looper, m15060a, (Object) this.zae, (AbstractC3648f.a) c3663k, (AbstractC3648f.b) c3663k);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof AbstractC3772c)) {
            ((AbstractC3772c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof AbstractServiceConnectionC3702m)) {
            return buildClient;
        }
        AbstractC4094d.m17162a(buildClient);
        throw null;
    }

    public final BinderC3683c0 zac(Context context, Handler handler) {
        return new BinderC3683c0(context, handler, createClientSettingsBuilder().m15060a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC3647e(android.app.Activity r2, com.google.android.gms.common.api.C3643a r3, com.google.android.gms.common.api.C3643a.d r4, com.google.android.gms.common.api.internal.InterfaceC3716t r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.m14813c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.m14812b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.m14811a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC3647e.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.t):void");
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3643a.b> Task<TResult> doBestEffortWrite(AbstractC3720v abstractC3720v) {
        return m14810c(2, abstractC3720v);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3643a.b> Task<TResult> doRead(AbstractC3720v abstractC3720v) {
        return m14810c(0, abstractC3720v);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C3698k.a aVar, int i7) {
        AbstractC3802r.m15130l(aVar, "Listener key cannot be null.");
        return this.zaa.m14950x(this, aVar, i7);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3643a.b> Task<TResult> doWrite(AbstractC3720v abstractC3720v) {
        return m14810c(1, abstractC3720v);
    }

    public AbstractC3647e(Context context, Activity activity, C3643a c3643a, C3643a.d dVar, a aVar) {
        String apiFallbackAttributionTag;
        AbstractC3802r.m15130l(context, "Null context is not permitted.");
        AbstractC3802r.m15130l(c3643a, "Api must not be null.");
        AbstractC3802r.m15130l(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC3802r.m15130l(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = c3643a;
        this.zae = dVar;
        this.zag = aVar.f12265b;
        C3680b m14903a = C3680b.m14903a(c3643a, dVar, apiFallbackAttributionTag);
        this.zaf = m14903a;
        this.zai = new C3668P(this);
        C3688f m14929u = C3688f.m14929u(context2);
        this.zaa = m14929u;
        this.zah = m14929u.m14947l();
        this.zaj = aVar.f12264a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C3653B.m14832j(activity, m14929u, m14903a);
        }
        m14929u.m14938H(this);
    }

    @ResultIgnorabilityUnspecified
    public <A extends C3643a.b> Task<Void> doRegisterEventListener(AbstractC3710q abstractC3710q) {
        AbstractC3802r.m15129k(abstractC3710q);
        throw null;
    }

    public AbstractC3647e(Context context, C3643a c3643a, C3643a.d dVar, a aVar) {
        this(context, null, c3643a, dVar, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC3647e(android.content.Context r2, com.google.android.gms.common.api.C3643a r3, com.google.android.gms.common.api.C3643a.d r4, com.google.android.gms.common.api.internal.InterfaceC3716t r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.m14813c(r5)
            com.google.android.gms.common.api.e$a r5 = r0.m14811a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.AbstractC3647e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.t):void");
    }
}

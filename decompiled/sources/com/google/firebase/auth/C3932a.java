package com.google.firebase.auth;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.auth.AbstractC3933b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p346t3.AbstractC6480L;
import p346t3.C6486S;
import p354u3.C6668p;

/* renamed from: com.google.firebase.auth.a */
/* loaded from: classes.dex */
public final class C3932a {

    /* renamed from: a */
    public final FirebaseAuth f12818a;

    /* renamed from: b */
    public Long f12819b;

    /* renamed from: c */
    public AbstractC3933b.b f12820c;

    /* renamed from: d */
    public Executor f12821d;

    /* renamed from: e */
    public String f12822e;

    /* renamed from: f */
    public Activity f12823f;

    /* renamed from: g */
    public AbstractC3933b.a f12824g;

    /* renamed from: h */
    public AbstractC6480L f12825h;

    /* renamed from: i */
    public C6486S f12826i;

    /* renamed from: j */
    public boolean f12827j;

    /* renamed from: k */
    public boolean f12828k;

    /* renamed from: l */
    public boolean f12829l;

    /* renamed from: com.google.firebase.auth.a$a */
    public static final class a {

        /* renamed from: a */
        public final FirebaseAuth f12830a;

        /* renamed from: b */
        public String f12831b;

        /* renamed from: c */
        public Long f12832c;

        /* renamed from: d */
        public AbstractC3933b.b f12833d;

        /* renamed from: e */
        public Executor f12834e;

        /* renamed from: f */
        public Activity f12835f;

        /* renamed from: g */
        public AbstractC3933b.a f12836g;

        /* renamed from: h */
        public AbstractC6480L f12837h;

        /* renamed from: i */
        public C6486S f12838i;

        /* renamed from: j */
        public boolean f12839j;

        public a(FirebaseAuth firebaseAuth) {
            this.f12830a = (FirebaseAuth) AbstractC3802r.m15129k(firebaseAuth);
        }

        /* renamed from: a */
        public final C3932a m15402a() {
            AbstractC3802r.m15130l(this.f12830a, "FirebaseAuth instance cannot be null");
            AbstractC3802r.m15130l(this.f12832c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            AbstractC3802r.m15130l(this.f12833d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f12834e = this.f12830a.m15320G0();
            if (this.f12832c.longValue() < 0 || this.f12832c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            AbstractC6480L abstractC6480L = this.f12837h;
            if (abstractC6480L == null) {
                AbstractC3802r.m15124f(this.f12831b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                AbstractC3802r.m15120b(!this.f12839j, "You cannot require sms validation without setting a multi-factor session.");
                AbstractC3802r.m15120b(this.f12838i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else if (abstractC6480L == null || !((C6668p) abstractC6480L).m27575B0()) {
                AbstractC3802r.m15120b(this.f12838i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                AbstractC3802r.m15120b(this.f12831b == null, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
            } else {
                AbstractC3802r.m15123e(this.f12831b);
                AbstractC3802r.m15120b(this.f12838i == null, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
            }
            return new C3932a(this.f12830a, this.f12832c, this.f12833d, this.f12834e, this.f12831b, this.f12835f, this.f12836g, this.f12837h, this.f12838i, this.f12839j);
        }

        /* renamed from: b */
        public final a m15403b(Activity activity) {
            this.f12835f = activity;
            return this;
        }

        /* renamed from: c */
        public final a m15404c(AbstractC3933b.b bVar) {
            this.f12833d = bVar;
            return this;
        }

        /* renamed from: d */
        public final a m15405d(AbstractC3933b.a aVar) {
            this.f12836g = aVar;
            return this;
        }

        /* renamed from: e */
        public final a m15406e(C6486S c6486s) {
            this.f12838i = c6486s;
            return this;
        }

        /* renamed from: f */
        public final a m15407f(AbstractC6480L abstractC6480L) {
            this.f12837h = abstractC6480L;
            return this;
        }

        /* renamed from: g */
        public final a m15408g(String str) {
            this.f12831b = str;
            return this;
        }

        /* renamed from: h */
        public final a m15409h(Long l7, TimeUnit timeUnit) {
            this.f12832c = Long.valueOf(TimeUnit.SECONDS.convert(l7.longValue(), timeUnit));
            return this;
        }
    }

    /* renamed from: a */
    public final Activity m15387a() {
        return this.f12823f;
    }

    /* renamed from: b */
    public final void m15388b(boolean z6) {
        this.f12828k = true;
    }

    /* renamed from: c */
    public final FirebaseAuth m15389c() {
        return this.f12818a;
    }

    /* renamed from: d */
    public final void m15390d(boolean z6) {
        this.f12829l = true;
    }

    /* renamed from: e */
    public final AbstractC6480L m15391e() {
        return this.f12825h;
    }

    /* renamed from: f */
    public final AbstractC3933b.a m15392f() {
        return this.f12824g;
    }

    /* renamed from: g */
    public final AbstractC3933b.b m15393g() {
        return this.f12820c;
    }

    /* renamed from: h */
    public final C6486S m15394h() {
        return this.f12826i;
    }

    /* renamed from: i */
    public final Long m15395i() {
        return this.f12819b;
    }

    /* renamed from: j */
    public final String m15396j() {
        return this.f12822e;
    }

    /* renamed from: k */
    public final Executor m15397k() {
        return this.f12821d;
    }

    /* renamed from: l */
    public final boolean m15398l() {
        return this.f12828k;
    }

    /* renamed from: m */
    public final boolean m15399m() {
        return this.f12827j;
    }

    /* renamed from: n */
    public final boolean m15400n() {
        return this.f12829l;
    }

    /* renamed from: o */
    public final boolean m15401o() {
        return this.f12825h != null;
    }

    public C3932a(FirebaseAuth firebaseAuth, Long l7, AbstractC3933b.b bVar, Executor executor, String str, Activity activity, AbstractC3933b.a aVar, AbstractC6480L abstractC6480L, C6486S c6486s, boolean z6) {
        this.f12818a = firebaseAuth;
        this.f12822e = str;
        this.f12819b = l7;
        this.f12820c = bVar;
        this.f12823f = activity;
        this.f12821d = executor;
        this.f12824g = aVar;
        this.f12825h = abstractC6480L;
        this.f12826i = c6486s;
        this.f12827j = z6;
    }
}

package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzabq;
import com.google.android.gms.internal.p395firebaseauthapi.zzadr;
import com.google.android.gms.internal.p395firebaseauthapi.zzadu;
import com.google.android.gms.internal.p395firebaseauthapi.zzae;
import com.google.android.gms.internal.p395firebaseauthapi.zzaee;
import com.google.android.gms.internal.p395firebaseauthapi.zzafc;
import com.google.android.gms.internal.p395firebaseauthapi.zzafm;
import com.google.android.gms.internal.p395firebaseauthapi.zzagw;
import com.google.android.gms.internal.p395firebaseauthapi.zzahk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.AbstractC3933b;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p137T3.InterfaceC2447b;
import p172Y3.C2945b;
import p219e3.C4176f;
import p219e3.C4183m;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6474I;
import p346t3.AbstractC6508h;
import p346t3.AbstractC6514k;
import p346t3.AbstractC6520n;
import p346t3.AbstractC6538w;
import p346t3.C6465D0;
import p346t3.C6467E0;
import p346t3.C6469F0;
import p346t3.C6471G0;
import p346t3.C6473H0;
import p346t3.C6475I0;
import p346t3.C6477J0;
import p346t3.C6479K0;
import p346t3.C6483O;
import p346t3.C6484P;
import p346t3.C6486S;
import p346t3.C6490W;
import p346t3.C6501d0;
import p346t3.C6502e;
import p346t3.C6504f;
import p346t3.C6512j;
import p354u3.AbstractC6625M;
import p354u3.AbstractC6675s0;
import p354u3.C6610D;
import p354u3.C6621I0;
import p354u3.C6628P;
import p354u3.C6643c0;
import p354u3.C6645d0;
import p354u3.C6648f;
import p354u3.C6653h0;
import p354u3.C6654i;
import p354u3.C6659k0;
import p354u3.C6668p;
import p354u3.InterfaceC6638a;
import p354u3.InterfaceC6640b;
import p354u3.InterfaceC6655i0;
import p354u3.InterfaceC6679u0;
import p354u3.InterfaceC6684x;

/* loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC6640b {

    /* renamed from: A */
    public final Executor f12788A;

    /* renamed from: B */
    public String f12789B;

    /* renamed from: a */
    public final C4176f f12790a;

    /* renamed from: b */
    public final List f12791b;

    /* renamed from: c */
    public final List f12792c;

    /* renamed from: d */
    public final List f12793d;

    /* renamed from: e */
    public final zzabq f12794e;

    /* renamed from: f */
    public AbstractC6458A f12795f;

    /* renamed from: g */
    public final C6648f f12796g;

    /* renamed from: h */
    public final Object f12797h;

    /* renamed from: i */
    public String f12798i;

    /* renamed from: j */
    public final Object f12799j;

    /* renamed from: k */
    public String f12800k;

    /* renamed from: l */
    public C6643c0 f12801l;

    /* renamed from: m */
    public final RecaptchaAction f12802m;

    /* renamed from: n */
    public final RecaptchaAction f12803n;

    /* renamed from: o */
    public final RecaptchaAction f12804o;

    /* renamed from: p */
    public final RecaptchaAction f12805p;

    /* renamed from: q */
    public final RecaptchaAction f12806q;

    /* renamed from: r */
    public final RecaptchaAction f12807r;

    /* renamed from: s */
    public final C6645d0 f12808s;

    /* renamed from: t */
    public final C6659k0 f12809t;

    /* renamed from: u */
    public final C6610D f12810u;

    /* renamed from: v */
    public final InterfaceC2447b f12811v;

    /* renamed from: w */
    public final InterfaceC2447b f12812w;

    /* renamed from: x */
    public C6653h0 f12813x;

    /* renamed from: y */
    public final Executor f12814y;

    /* renamed from: z */
    public final Executor f12815z;

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    public interface InterfaceC3928a {
        /* renamed from: a */
        void mo5198a(FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    public interface InterfaceC3929b {
        /* renamed from: a */
        void mo5446a(FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$c */
    public class C3930c implements InterfaceC6684x, InterfaceC6679u0 {
        public C3930c() {
        }

        @Override // p354u3.InterfaceC6679u0
        /* renamed from: a */
        public final void mo15386a(zzagw zzagwVar, AbstractC6458A abstractC6458A) {
            AbstractC3802r.m15129k(zzagwVar);
            AbstractC3802r.m15129k(abstractC6458A);
            abstractC6458A.mo26973U0(zzagwVar);
            FirebaseAuth.this.m15360l0(abstractC6458A, zzagwVar, true, true);
        }

        @Override // p354u3.InterfaceC6684x
        public final void zza(Status status) {
            if (status.m14803z0() == 17011 || status.m14803z0() == 17021 || status.m14803z0() == 17005 || status.m14803z0() == 17091) {
                FirebaseAuth.this.m15318F();
            }
        }
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$d */
    public class C3931d implements InterfaceC6679u0 {
        public C3931d() {
        }

        @Override // p354u3.InterfaceC6679u0
        /* renamed from: a */
        public final void mo15386a(zzagw zzagwVar, AbstractC6458A abstractC6458A) {
            AbstractC3802r.m15129k(zzagwVar);
            AbstractC3802r.m15129k(abstractC6458A);
            abstractC6458A.mo26973U0(zzagwVar);
            FirebaseAuth.this.m15358k0(abstractC6458A, zzagwVar, true);
        }
    }

    public FirebaseAuth(C4176f c4176f, InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this(c4176f, new zzabq(c4176f, executor2, scheduledExecutorService), new C6645d0(c4176f.m17532m(), c4176f.m17535s()), C6659k0.m27559f(), C6610D.m27488b(), interfaceC2447b, interfaceC2447b2, executor, executor2, executor3, executor4);
    }

    /* renamed from: M0 */
    public static C6653h0 m15301M0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f12813x == null) {
            firebaseAuth.f12813x = new C6653h0((C4176f) AbstractC3802r.m15129k(firebaseAuth.f12790a));
        }
        return firebaseAuth.f12813x;
    }

    /* renamed from: f0 */
    public static void m15304f0(FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A) {
        if (abstractC6458A != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + abstractC6458A.mo26979a() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f12788A.execute(new RunnableC3944m(firebaseAuth));
    }

    /* renamed from: g0 */
    public static void m15305g0(FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A, zzagw zzagwVar, boolean z6, boolean z7) {
        boolean z8;
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(zzagwVar);
        boolean z9 = true;
        boolean z10 = firebaseAuth.f12795f != null && abstractC6458A.mo26979a().equals(firebaseAuth.f12795f.mo26979a());
        if (z10 || !z7) {
            AbstractC6458A abstractC6458A2 = firebaseAuth.f12795f;
            if (abstractC6458A2 == null) {
                z8 = true;
            } else {
                boolean z11 = (z10 && abstractC6458A2.mo26976X0().zzc().equals(zzagwVar.zzc())) ? false : true;
                z8 = z10 ? false : true;
                z9 = z11;
            }
            AbstractC3802r.m15129k(abstractC6458A);
            if (firebaseAuth.f12795f == null || !abstractC6458A.mo26979a().equals(firebaseAuth.mo15343a())) {
                firebaseAuth.f12795f = abstractC6458A;
            } else {
                firebaseAuth.f12795f.mo26972T0(abstractC6458A.mo26953B0());
                if (!abstractC6458A.mo26955D0()) {
                    firebaseAuth.f12795f.mo26974V0();
                }
                List mo27004b = abstractC6458A.mo26952A0().mo27004b();
                List mo26978Z0 = abstractC6458A.mo26978Z0();
                firebaseAuth.f12795f.mo26977Y0(mo27004b);
                firebaseAuth.f12795f.mo26975W0(mo26978Z0);
            }
            if (z6) {
                firebaseAuth.f12808s.m27532f(firebaseAuth.f12795f);
            }
            if (z9) {
                AbstractC6458A abstractC6458A3 = firebaseAuth.f12795f;
                if (abstractC6458A3 != null) {
                    abstractC6458A3.mo26973U0(zzagwVar);
                }
                m15309s0(firebaseAuth, firebaseAuth.f12795f);
            }
            if (z8) {
                m15304f0(firebaseAuth, firebaseAuth.f12795f);
            }
            if (z6) {
                firebaseAuth.f12808s.m27531e(abstractC6458A, zzagwVar);
            }
            AbstractC6458A abstractC6458A4 = firebaseAuth.f12795f;
            if (abstractC6458A4 != null) {
                m15301M0(firebaseAuth).m27546d(abstractC6458A4.mo26976X0());
            }
        }
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C4176f.m17517o().m17531k(FirebaseAuth.class);
    }

    /* renamed from: h0 */
    public static void m15306h0(C3932a c3932a) {
        String m15123e;
        String m27041y;
        if (!c3932a.m15401o()) {
            FirebaseAuth m15389c = c3932a.m15389c();
            String m15123e2 = AbstractC3802r.m15123e(c3932a.m15396j());
            if (c3932a.m15392f() == null && zzafc.zza(m15123e2, c3932a.m15393g(), c3932a.m15387a(), c3932a.m15397k())) {
                return;
            }
            m15389c.f12810u.m27495a(m15389c, m15123e2, c3932a.m15387a(), m15389c.m15326K0(), c3932a.m15398l(), c3932a.m15400n(), m15389c.f12805p).addOnCompleteListener(new C6465D0(m15389c, c3932a, m15123e2));
            return;
        }
        FirebaseAuth m15389c2 = c3932a.m15389c();
        C6668p c6668p = (C6668p) AbstractC3802r.m15129k(c3932a.m15391e());
        if (c6668p.m27575B0()) {
            m27041y = AbstractC3802r.m15123e(c3932a.m15396j());
            m15123e = m27041y;
        } else {
            C6486S c6486s = (C6486S) AbstractC3802r.m15129k(c3932a.m15394h());
            m15123e = AbstractC3802r.m15123e(c6486s.mo27008a());
            m27041y = c6486s.m27041y();
        }
        if (c3932a.m15392f() == null || !zzafc.zza(m15123e, c3932a.m15393g(), c3932a.m15387a(), c3932a.m15397k())) {
            m15389c2.f12810u.m27495a(m15389c2, m27041y, c3932a.m15387a(), m15389c2.m15326K0(), c3932a.m15398l(), c3932a.m15400n(), c6668p.m27575B0() ? m15389c2.f12806q : m15389c2.f12807r).addOnCompleteListener(new C3939h(m15389c2, c3932a, m15123e));
        }
    }

    /* renamed from: j0 */
    public static void m15307j0(final C4183m c4183m, C3932a c3932a, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        final AbstractC3933b.b zza = zzafc.zza(str, c3932a.m15393g(), null);
        c3932a.m15397k().execute(new Runnable() { // from class: t3.C0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3933b.b.this.onVerificationFailed(c4183m);
            }
        });
    }

    /* renamed from: s0 */
    public static void m15309s0(FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A) {
        if (abstractC6458A != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + abstractC6458A.mo26979a() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f12788A.execute(new RunnableC3945n(firebaseAuth, new C2945b(abstractC6458A != null ? abstractC6458A.zzd() : null)));
    }

    /* renamed from: A */
    public Task m15311A() {
        AbstractC6458A abstractC6458A = this.f12795f;
        if (abstractC6458A == null || !abstractC6458A.mo26955D0()) {
            return this.f12794e.zza(this.f12790a, new C3931d(), this.f12800k);
        }
        C6654i c6654i = (C6654i) this.f12795f;
        c6654i.m27551d1(false);
        return Tasks.forResult(new C6621I0(c6654i));
    }

    /* renamed from: B */
    public Task m15312B(AbstractC6508h abstractC6508h) {
        AbstractC3802r.m15129k(abstractC6508h);
        AbstractC6508h mo26999z0 = abstractC6508h.mo26999z0();
        if (mo26999z0 instanceof C6512j) {
            C6512j c6512j = (C6512j) mo26999z0;
            return !c6512j.m27117D0() ? m15330N(c6512j.zzc(), (String) AbstractC3802r.m15129k(c6512j.zzd()), this.f12800k, null, false) : m15374t0(AbstractC3802r.m15123e(c6512j.zze())) ? Tasks.forException(zzadr.zza(new Status(17072))) : m15333Q(c6512j, null, false);
        }
        if (mo26999z0 instanceof C6483O) {
            return this.f12794e.zza(this.f12790a, (C6483O) mo26999z0, this.f12800k, (InterfaceC6679u0) new C3931d());
        }
        return this.f12794e.zza(this.f12790a, mo26999z0, this.f12800k, new C3931d());
    }

    /* renamed from: C */
    public Task m15313C(String str) {
        AbstractC3802r.m15123e(str);
        return this.f12794e.zza(this.f12790a, str, this.f12800k, new C3931d());
    }

    /* renamed from: C0 */
    public final Executor m15314C0() {
        return this.f12814y;
    }

    /* renamed from: D */
    public Task m15315D(String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        return m15330N(str, str2, this.f12800k, null, false);
    }

    /* renamed from: E */
    public Task m15316E(String str, String str2) {
        return m15312B(AbstractC6514k.m27119b(str, str2));
    }

    /* renamed from: E0 */
    public final Executor m15317E0() {
        return this.f12815z;
    }

    /* renamed from: F */
    public void m15318F() {
        m15323I0();
        C6653h0 c6653h0 = this.f12813x;
        if (c6653h0 != null) {
            c6653h0.m27544b();
        }
    }

    /* renamed from: G */
    public Task m15319G(Activity activity, AbstractC6520n abstractC6520n) {
        AbstractC3802r.m15129k(abstractC6520n);
        AbstractC3802r.m15129k(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f12809t.m27562c(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzadr.zza(new Status(17057)));
        }
        C6628P.m27508d(activity.getApplicationContext(), this);
        abstractC6520n.mo27024c(activity);
        return taskCompletionSource.getTask();
    }

    /* renamed from: G0 */
    public final Executor m15320G0() {
        return this.f12788A;
    }

    /* renamed from: H */
    public void m15321H() {
        synchronized (this.f12797h) {
            this.f12798i = zzaee.zza();
        }
    }

    /* renamed from: I */
    public void m15322I(String str, int i7) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15120b(i7 >= 0 && i7 <= 65535, "Port number must be in the range 0-65535");
        zzafm.zza(this.f12790a, str, i7);
    }

    /* renamed from: I0 */
    public final void m15323I0() {
        AbstractC3802r.m15129k(this.f12808s);
        AbstractC6458A abstractC6458A = this.f12795f;
        if (abstractC6458A != null) {
            C6645d0 c6645d0 = this.f12808s;
            AbstractC3802r.m15129k(abstractC6458A);
            c6645d0.m27530d(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC6458A.mo26979a()));
            this.f12795f = null;
        }
        this.f12808s.m27530d("com.google.firebase.auth.FIREBASE_USER");
        m15309s0(this, null);
        m15304f0(this, null);
    }

    /* renamed from: J */
    public Task m15324J(String str) {
        AbstractC3802r.m15123e(str);
        return this.f12794e.zzd(this.f12790a, str, this.f12800k);
    }

    /* renamed from: K */
    public final Task m15325K() {
        return this.f12794e.zza();
    }

    /* renamed from: K0 */
    public final boolean m15326K0() {
        return zzadu.zza(m15359l().m17532m());
    }

    /* renamed from: L */
    public final Task m15327L(Activity activity, AbstractC6520n abstractC6520n, AbstractC6458A abstractC6458A) {
        AbstractC3802r.m15129k(activity);
        AbstractC3802r.m15129k(abstractC6520n);
        AbstractC3802r.m15129k(abstractC6458A);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f12809t.m27563d(activity, taskCompletionSource, this, abstractC6458A)) {
            return Tasks.forException(zzadr.zza(new Status(17057)));
        }
        C6628P.m27509e(activity.getApplicationContext(), this, abstractC6458A);
        abstractC6520n.mo27022a(activity);
        return taskCompletionSource.getTask();
    }

    /* renamed from: L0 */
    public final synchronized C6653h0 m15328L0() {
        return m15301M0(this);
    }

    /* renamed from: M */
    public final Task m15329M(String str) {
        return this.f12794e.zza(this.f12800k, str);
    }

    /* renamed from: N */
    public final Task m15330N(String str, String str2, String str3, AbstractC6458A abstractC6458A, boolean z6) {
        return new C3935d(this, str, z6, abstractC6458A, str2, str3).m27518b(this, str3, this.f12803n, "EMAIL_PASSWORD_PROVIDER");
    }

    /* renamed from: O */
    public final Task m15331O(String str, String str2, C6502e c6502e) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        if (c6502e == null) {
            c6502e = C6502e.m27076I0();
        }
        String str3 = this.f12798i;
        if (str3 != null) {
            c6502e.m27083H0(str3);
        }
        return this.f12794e.zza(str, str2, c6502e);
    }

    /* renamed from: P */
    public final Task m15332P(C6502e c6502e, String str) {
        AbstractC3802r.m15123e(str);
        if (this.f12798i != null) {
            if (c6502e == null) {
                c6502e = C6502e.m27076I0();
            }
            c6502e.m27083H0(this.f12798i);
        }
        return this.f12794e.zza(this.f12790a, c6502e, str);
    }

    /* renamed from: Q */
    public final Task m15333Q(C6512j c6512j, AbstractC6458A abstractC6458A, boolean z6) {
        return new C3934c(this, z6, abstractC6458A, c6512j).m27518b(this, this.f12800k, this.f12802m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* renamed from: R */
    public final Task m15334R(AbstractC6458A abstractC6458A) {
        AbstractC3802r.m15129k(abstractC6458A);
        return this.f12794e.zza(abstractC6458A, new C6473H0(this, abstractC6458A));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: S */
    public final Task m15335S(AbstractC6458A abstractC6458A, String str) {
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15123e(str);
        return this.f12794e.zza(this.f12790a, abstractC6458A, str, this.f12800k, (InterfaceC6655i0) new C3930c()).continueWithTask(new C6469F0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: T */
    public final Task m15336T(AbstractC6458A abstractC6458A, AbstractC6508h abstractC6508h) {
        AbstractC3802r.m15129k(abstractC6508h);
        AbstractC3802r.m15129k(abstractC6458A);
        return abstractC6508h instanceof C6512j ? new C3940i(this, abstractC6458A, (C6512j) abstractC6508h.mo26999z0()).m27518b(this, abstractC6458A.mo26954C0(), this.f12804o, "EMAIL_PASSWORD_PROVIDER") : this.f12794e.zza(this.f12790a, abstractC6458A, abstractC6508h.mo26999z0(), (String) null, (InterfaceC6655i0) new C3930c());
    }

    /* renamed from: U */
    public final Task m15337U(AbstractC6458A abstractC6458A, AbstractC6474I abstractC6474I, String str) {
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(abstractC6474I);
        return abstractC6474I instanceof C6484P ? this.f12794e.zza(this.f12790a, (C6484P) abstractC6474I, abstractC6458A, str, new C3931d()) : abstractC6474I instanceof C6490W ? this.f12794e.zza(this.f12790a, (C6490W) abstractC6474I, abstractC6458A, str, this.f12800k, new C3931d()) : Tasks.forException(zzadr.zza(new Status(17499)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: V */
    public final Task m15338V(AbstractC6458A abstractC6458A, C6483O c6483o) {
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(c6483o);
        return this.f12794e.zza(this.f12790a, abstractC6458A, (C6483O) c6483o.mo26999z0(), (InterfaceC6655i0) new C3930c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: W */
    public final Task m15339W(AbstractC6458A abstractC6458A, C6501d0 c6501d0) {
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(c6501d0);
        return this.f12794e.zza(this.f12790a, abstractC6458A, c6501d0, (InterfaceC6655i0) new C3930c());
    }

    /* renamed from: X */
    public final Task m15340X(AbstractC6458A abstractC6458A, InterfaceC6655i0 interfaceC6655i0) {
        AbstractC3802r.m15129k(abstractC6458A);
        return this.f12794e.zza(this.f12790a, abstractC6458A, interfaceC6655i0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [t3.K0, u3.i0] */
    /* renamed from: Y */
    public final Task m15341Y(AbstractC6458A abstractC6458A, boolean z6) {
        if (abstractC6458A == null) {
            return Tasks.forException(zzadr.zza(new Status(17495)));
        }
        zzagw mo26976X0 = abstractC6458A.mo26976X0();
        return (!mo26976X0.zzg() || z6) ? this.f12794e.zza(this.f12790a, abstractC6458A, mo26976X0.zzd(), (InterfaceC6655i0) new C6479K0(this)) : Tasks.forResult(AbstractC6625M.m27502a(mo26976X0.zzc()));
    }

    /* renamed from: Z */
    public final Task m15342Z(AbstractC6474I abstractC6474I, C6668p c6668p, AbstractC6458A abstractC6458A) {
        AbstractC3802r.m15129k(abstractC6474I);
        AbstractC3802r.m15129k(c6668p);
        if (abstractC6474I instanceof C6484P) {
            return this.f12794e.zza(this.f12790a, abstractC6458A, (C6484P) abstractC6474I, AbstractC3802r.m15123e(c6668p.zzc()), new C3931d());
        }
        if (abstractC6474I instanceof C6490W) {
            return this.f12794e.zza(this.f12790a, abstractC6458A, (C6490W) abstractC6474I, AbstractC3802r.m15123e(c6668p.zzc()), this.f12800k, new C3931d());
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    @Override // p354u3.InterfaceC6640b
    /* renamed from: a */
    public String mo15343a() {
        AbstractC6458A abstractC6458A = this.f12795f;
        if (abstractC6458A == null) {
            return null;
        }
        return abstractC6458A.mo26979a();
    }

    /* renamed from: a0 */
    public final Task m15344a0(C6668p c6668p) {
        AbstractC3802r.m15129k(c6668p);
        return this.f12794e.zza(c6668p, this.f12800k).continueWithTask(new C6475I0(this));
    }

    @Override // p354u3.InterfaceC6640b
    /* renamed from: b */
    public void mo15345b(InterfaceC6638a interfaceC6638a) {
        AbstractC3802r.m15129k(interfaceC6638a);
        this.f12792c.add(interfaceC6638a);
        m15328L0().m27545c(this.f12792c.size());
    }

    @Override // p354u3.InterfaceC6640b
    /* renamed from: c */
    public void mo15346c(InterfaceC6638a interfaceC6638a) {
        AbstractC3802r.m15129k(interfaceC6638a);
        this.f12792c.remove(interfaceC6638a);
        m15328L0().m27545c(this.f12792c.size());
    }

    /* renamed from: c0 */
    public final AbstractC3933b.b m15347c0(C3932a c3932a, AbstractC3933b.b bVar, AbstractC6675s0 abstractC6675s0) {
        return c3932a.m15398l() ? bVar : new C3941j(this, c3932a, abstractC6675s0, bVar);
    }

    @Override // p354u3.InterfaceC6640b
    /* renamed from: d */
    public Task mo15348d(boolean z6) {
        return m15341Y(this.f12795f, z6);
    }

    /* renamed from: d0 */
    public final AbstractC3933b.b m15349d0(String str, AbstractC3933b.b bVar) {
        return (this.f12796g.m27539g() && str != null && str.equals(this.f12796g.m27536d())) ? new C3938g(this, bVar) : bVar;
    }

    /* renamed from: e */
    public void m15350e(InterfaceC3928a interfaceC3928a) {
        this.f12793d.add(interfaceC3928a);
        this.f12788A.execute(new RunnableC3943l(this, interfaceC3928a));
    }

    /* renamed from: f */
    public void m15351f(InterfaceC3929b interfaceC3929b) {
        this.f12791b.add(interfaceC3929b);
        this.f12788A.execute(new RunnableC3937f(this, interfaceC3929b));
    }

    /* renamed from: g */
    public Task m15352g(String str) {
        AbstractC3802r.m15123e(str);
        return this.f12794e.zza(this.f12790a, str, this.f12800k);
    }

    /* renamed from: h */
    public Task m15353h(String str) {
        AbstractC3802r.m15123e(str);
        return this.f12794e.zzb(this.f12790a, str, this.f12800k);
    }

    /* renamed from: i */
    public Task m15354i(String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        return this.f12794e.zza(this.f12790a, str, str2, this.f12800k);
    }

    /* renamed from: i0 */
    public final void m15355i0(C3932a c3932a, AbstractC6675s0 abstractC6675s0) {
        long longValue = c3932a.m15395i().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String m15123e = AbstractC3802r.m15123e(c3932a.m15396j());
        String mo27585c = abstractC6675s0.mo27585c();
        String mo27584b = abstractC6675s0.mo27584b();
        String mo27586d = abstractC6675s0.mo27586d();
        if (zzae.zzc(mo27585c) && m15371r0() != null && m15371r0().m27524d("PHONE_PROVIDER")) {
            mo27585c = "NO_RECAPTCHA";
        }
        String str = mo27585c;
        zzahk zzahkVar = new zzahk(m15123e, longValue, c3932a.m15392f() != null, this.f12798i, this.f12800k, mo27586d, mo27584b, str, m15326K0());
        AbstractC3933b.b m15349d0 = m15349d0(m15123e, c3932a.m15393g());
        if (TextUtils.isEmpty(abstractC6675s0.mo27586d())) {
            m15349d0 = m15347c0(c3932a, m15349d0, AbstractC6675s0.m27583a().mo27582d(mo27586d).mo27581c(str).mo27579a(mo27584b).mo27580b());
        }
        this.f12794e.zza(this.f12790a, zzahkVar, m15349d0, c3932a.m15387a(), c3932a.m15397k());
    }

    /* renamed from: j */
    public Task m15356j(String str, String str2) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        return new C3942k(this, str, str2).m27518b(this, this.f12800k, this.f12804o, "EMAIL_PASSWORD_PROVIDER");
    }

    /* renamed from: k */
    public Task m15357k(String str) {
        AbstractC3802r.m15123e(str);
        return this.f12794e.zzc(this.f12790a, str, this.f12800k);
    }

    /* renamed from: k0 */
    public final void m15358k0(AbstractC6458A abstractC6458A, zzagw zzagwVar, boolean z6) {
        m15360l0(abstractC6458A, zzagwVar, true, false);
    }

    /* renamed from: l */
    public C4176f m15359l() {
        return this.f12790a;
    }

    /* renamed from: l0 */
    public final void m15360l0(AbstractC6458A abstractC6458A, zzagw zzagwVar, boolean z6, boolean z7) {
        m15305g0(this, abstractC6458A, zzagwVar, true, z7);
    }

    /* renamed from: m */
    public AbstractC6458A m15361m() {
        return this.f12795f;
    }

    /* renamed from: m0 */
    public final synchronized void m15362m0(C6643c0 c6643c0) {
        this.f12801l = c6643c0;
    }

    /* renamed from: n */
    public String m15363n() {
        return this.f12789B;
    }

    /* renamed from: n0 */
    public final Task m15364n0(Activity activity, AbstractC6520n abstractC6520n, AbstractC6458A abstractC6458A) {
        AbstractC3802r.m15129k(activity);
        AbstractC3802r.m15129k(abstractC6520n);
        AbstractC3802r.m15129k(abstractC6458A);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f12809t.m27563d(activity, taskCompletionSource, this, abstractC6458A)) {
            return Tasks.forException(zzadr.zza(new Status(17057)));
        }
        C6628P.m27509e(activity.getApplicationContext(), this, abstractC6458A);
        abstractC6520n.mo27023b(activity);
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public AbstractC6538w m15365o() {
        return this.f12796g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: o0 */
    public final Task m15366o0(AbstractC6458A abstractC6458A) {
        return m15340X(abstractC6458A, new C3930c());
    }

    /* renamed from: p */
    public String m15367p() {
        String str;
        synchronized (this.f12797h) {
            str = this.f12798i;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: p0 */
    public final Task m15368p0(AbstractC6458A abstractC6458A, String str) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(abstractC6458A);
        return this.f12794e.zzb(this.f12790a, abstractC6458A, str, new C3930c());
    }

    /* renamed from: q */
    public String m15369q() {
        String str;
        synchronized (this.f12799j) {
            str = this.f12800k;
        }
        return str;
    }

    /* renamed from: r */
    public Task m15370r() {
        if (this.f12801l == null) {
            this.f12801l = new C6643c0(this.f12790a, this);
        }
        return this.f12801l.m27522a(this.f12800k, Boolean.FALSE).continueWithTask(new C6477J0(this));
    }

    /* renamed from: r0 */
    public final synchronized C6643c0 m15371r0() {
        return this.f12801l;
    }

    /* renamed from: s */
    public void m15372s(InterfaceC3928a interfaceC3928a) {
        this.f12793d.remove(interfaceC3928a);
    }

    /* renamed from: t */
    public void m15373t(InterfaceC3929b interfaceC3929b) {
        this.f12791b.remove(interfaceC3929b);
    }

    /* renamed from: t0 */
    public final boolean m15374t0(String str) {
        C6504f m27102c = C6504f.m27102c(str);
        return (m27102c == null || TextUtils.equals(this.f12800k, m27102c.m27106d())) ? false : true;
    }

    /* renamed from: u */
    public Task m15375u(String str) {
        AbstractC3802r.m15123e(str);
        return m15377v(str, null);
    }

    /* renamed from: u0 */
    public final InterfaceC2447b m15376u0() {
        return this.f12811v;
    }

    /* renamed from: v */
    public Task m15377v(String str, C6502e c6502e) {
        AbstractC3802r.m15123e(str);
        if (c6502e == null) {
            c6502e = C6502e.m27076I0();
        }
        String str2 = this.f12798i;
        if (str2 != null) {
            c6502e.m27083H0(str2);
        }
        c6502e.m27082G0(1);
        return new C6467E0(this, str, c6502e).m27518b(this, this.f12800k, this.f12802m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* renamed from: w */
    public Task m15378w(String str, C6502e c6502e) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(c6502e);
        if (!c6502e.m27084x0()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.f12798i;
        if (str2 != null) {
            c6502e.m27083H0(str2);
        }
        return new C6471G0(this, str, c6502e).m27518b(this, this.f12800k, this.f12802m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: w0 */
    public final Task m15379w0(AbstractC6458A abstractC6458A, String str) {
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15123e(str);
        return this.f12794e.zzc(this.f12790a, abstractC6458A, str, new C3930c());
    }

    /* renamed from: x */
    public void m15380x(String str) {
        String str2;
        AbstractC3802r.m15123e(str);
        if (str.startsWith("chrome-extension://")) {
            this.f12789B = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.f12789B = (String) AbstractC3802r.m15129k(new URI(str2).getHost());
        } catch (URISyntaxException e7) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e7.getMessage());
            }
            this.f12789B = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: x0 */
    public final Task m15381x0(AbstractC6458A abstractC6458A, AbstractC6508h abstractC6508h) {
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15129k(abstractC6508h);
        AbstractC6508h mo26999z0 = abstractC6508h.mo26999z0();
        if (!(mo26999z0 instanceof C6512j)) {
            return mo26999z0 instanceof C6483O ? this.f12794e.zzb(this.f12790a, abstractC6458A, (C6483O) mo26999z0, this.f12800k, (InterfaceC6655i0) new C3930c()) : this.f12794e.zzc(this.f12790a, abstractC6458A, mo26999z0, abstractC6458A.mo26954C0(), new C3930c());
        }
        C6512j c6512j = (C6512j) mo26999z0;
        return "password".equals(c6512j.mo26998y0()) ? m15330N(c6512j.zzc(), AbstractC3802r.m15123e(c6512j.zzd()), abstractC6458A.mo26954C0(), abstractC6458A, true) : m15374t0(AbstractC3802r.m15123e(c6512j.zze())) ? Tasks.forException(zzadr.zza(new Status(17072))) : m15333Q(c6512j, abstractC6458A, true);
    }

    /* renamed from: y */
    public void m15382y(String str) {
        AbstractC3802r.m15123e(str);
        synchronized (this.f12797h) {
            this.f12798i = str;
        }
    }

    /* renamed from: y0 */
    public final InterfaceC2447b m15383y0() {
        return this.f12812w;
    }

    /* renamed from: z */
    public void m15384z(String str) {
        AbstractC3802r.m15123e(str);
        synchronized (this.f12799j) {
            this.f12800k = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, u3.i0] */
    /* renamed from: z0 */
    public final Task m15385z0(AbstractC6458A abstractC6458A, String str) {
        AbstractC3802r.m15129k(abstractC6458A);
        AbstractC3802r.m15123e(str);
        return this.f12794e.zzd(this.f12790a, abstractC6458A, str, new C3930c());
    }

    @Keep
    public static FirebaseAuth getInstance(C4176f c4176f) {
        return (FirebaseAuth) c4176f.m17531k(FirebaseAuth.class);
    }

    public FirebaseAuth(C4176f c4176f, zzabq zzabqVar, C6645d0 c6645d0, C6659k0 c6659k0, C6610D c6610d, InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzagw m27527a;
        this.f12791b = new CopyOnWriteArrayList();
        this.f12792c = new CopyOnWriteArrayList();
        this.f12793d = new CopyOnWriteArrayList();
        this.f12797h = new Object();
        this.f12799j = new Object();
        this.f12802m = RecaptchaAction.custom("getOobCode");
        this.f12803n = RecaptchaAction.custom("signInWithPassword");
        this.f12804o = RecaptchaAction.custom("signUpPassword");
        this.f12805p = RecaptchaAction.custom("sendVerificationCode");
        this.f12806q = RecaptchaAction.custom("mfaSmsEnrollment");
        this.f12807r = RecaptchaAction.custom("mfaSmsSignIn");
        this.f12790a = (C4176f) AbstractC3802r.m15129k(c4176f);
        this.f12794e = (zzabq) AbstractC3802r.m15129k(zzabqVar);
        C6645d0 c6645d02 = (C6645d0) AbstractC3802r.m15129k(c6645d0);
        this.f12808s = c6645d02;
        this.f12796g = new C6648f();
        C6659k0 c6659k02 = (C6659k0) AbstractC3802r.m15129k(c6659k0);
        this.f12809t = c6659k02;
        this.f12810u = (C6610D) AbstractC3802r.m15129k(c6610d);
        this.f12811v = interfaceC2447b;
        this.f12812w = interfaceC2447b2;
        this.f12814y = executor2;
        this.f12815z = executor3;
        this.f12788A = executor4;
        AbstractC6458A m27528b = c6645d02.m27528b();
        this.f12795f = m27528b;
        if (m27528b != null && (m27527a = c6645d02.m27527a(m27528b)) != null) {
            m15305g0(this, this.f12795f, m27527a, false, false);
        }
        c6659k02.m27561b(this);
    }
}

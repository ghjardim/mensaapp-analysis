package p159W4;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.AbstractC3642a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0661m;
import p159W4.AbstractC2714h;
import p159W4.C2707a;
import p256j$.util.Objects;
import p278l2.AbstractC5518e;
import p337s2.C6373b;

/* renamed from: W4.a */
/* loaded from: classes2.dex */
public class C2707a implements InterfaceC0191a, InterfaceC0298a {

    /* renamed from: c */
    public b f7975c;

    /* renamed from: d */
    public InterfaceC0651c f7976d;

    /* renamed from: e */
    public InterfaceC0300c f7977e;

    /* renamed from: W4.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7978a;

        static {
            int[] iArr = new int[AbstractC2714h.f.values().length];
            f7978a = iArr;
            try {
                iArr[AbstractC2714h.f.GAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7978a[AbstractC2714h.f.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: W4.a$b */
    public static class b implements InterfaceC0661m, AbstractC2714h.b {

        /* renamed from: c */
        public final Context f7979c;

        /* renamed from: d */
        public Activity f7980d;

        /* renamed from: e */
        public final C2713g f7981e;

        /* renamed from: f */
        public C6373b f7982f;

        /* renamed from: g */
        public List f7983g;

        /* renamed from: h */
        public a f7984h;

        /* renamed from: W4.a$b$a */
        public static class a {

            /* renamed from: a */
            public final String f7985a;

            /* renamed from: b */
            public final AbstractC2714h.e f7986b;

            /* renamed from: c */
            public final AbstractC2714h.h f7987c;

            /* renamed from: d */
            public final AbstractC2714h.e f7988d;

            /* renamed from: e */
            public final AbstractC2714h.e f7989e;

            /* renamed from: f */
            public final Object f7990f;

            public a(String str, AbstractC2714h.e eVar, AbstractC2714h.h hVar, AbstractC2714h.e eVar2, AbstractC2714h.e eVar3, Object obj) {
                this.f7985a = str;
                this.f7986b = eVar;
                this.f7987c = hVar;
                this.f7988d = eVar2;
                this.f7989e = eVar3;
                this.f7990f = obj;
            }
        }

        public b(Context context, C2713g c2713g) {
            this.f7979c = context;
            this.f7981e = c2713g;
        }

        /* renamed from: A */
        public static boolean m9252A(String str) {
            return str == null || str.isEmpty();
        }

        /* renamed from: w */
        private void m9257w(String str, String str2) {
            a aVar = this.f7984h;
            AbstractC2714h.h hVar = aVar.f7987c;
            if (hVar != null) {
                Objects.requireNonNull(hVar);
                hVar.mo9325b(new AbstractC2714h.a(str, str2, null));
            } else {
                AbstractC2714h.e eVar = aVar.f7986b;
                if (eVar == null && (eVar = aVar.f7988d) == null) {
                    eVar = aVar.f7989e;
                }
                Objects.requireNonNull(eVar);
                eVar.mo9307b(new AbstractC2714h.a(str, str2, null));
            }
            this.f7984h = null;
        }

        /* renamed from: B */
        public final /* synthetic */ void m9258B(Task task) {
            if (task.isSuccessful()) {
                m9281x();
            } else {
                m9257w("status", "Failed to disconnect.");
            }
        }

        /* renamed from: C */
        public final /* synthetic */ void m9259C(Boolean bool, AbstractC2714h.e eVar, UserRecoverableAuthException userRecoverableAuthException, String str) {
            if (!bool.booleanValue() || this.f7984h != null) {
                eVar.mo9307b(new AbstractC2714h.a("user_recoverable_auth", userRecoverableAuthException.getLocalizedMessage(), null));
                return;
            }
            Activity m9283z = m9283z();
            if (m9283z != null) {
                m9273o("getTokens", eVar, str);
                m9283z.startActivityForResult(userRecoverableAuthException.m14703a(), 53294);
            } else {
                eVar.mo9307b(new AbstractC2714h.a("user_recoverable_auth", "Cannot recover auth because app is not in foreground. " + userRecoverableAuthException.getLocalizedMessage(), null));
            }
        }

        /* renamed from: D */
        public final /* synthetic */ void m9260D(Task task) {
            if (task.isSuccessful()) {
                m9281x();
            } else {
                m9257w("status", "Failed to signout.");
            }
        }

        /* renamed from: E */
        public final void m9261E(GoogleSignInAccount googleSignInAccount) {
            AbstractC2714h.g.a m9318b = new AbstractC2714h.g.a().m9319c(googleSignInAccount.m14743f0()).m9320d(googleSignInAccount.m14735A0()).m9321e(googleSignInAccount.m14736B0()).m9323g(googleSignInAccount.m14738D0()).m9318b(googleSignInAccount.m14742M());
            if (googleSignInAccount.m14744m() != null) {
                m9318b.m9322f(googleSignInAccount.m14744m().toString());
            }
            m9282y(m9318b.m9317a());
        }

        /* renamed from: F */
        public final void m9262F(Task task) {
            try {
                m9261E((GoogleSignInAccount) task.getResult(C3644b.class));
            } catch (C3644b e7) {
                m9257w(m9279u(e7.getStatusCode()), e7.toString());
            } catch (RuntimeExecutionException e8) {
                m9257w("exception", e8.toString());
            }
        }

        /* renamed from: G */
        public void m9263G(Activity activity) {
            this.f7980d = activity;
        }

        @Override // p061I4.InterfaceC0661m
        /* renamed from: a */
        public boolean mo2655a(int i7, int i8, Intent intent) {
            a aVar = this.f7984h;
            if (aVar == null) {
                return false;
            }
            switch (i7) {
                case 53293:
                    if (intent == null) {
                        m9257w("sign_in_failed", "Signin failed");
                        break;
                    } else {
                        m9262F(AbstractC3642a.m14783c(intent));
                        break;
                    }
                case 53294:
                    if (i8 != -1) {
                        m9257w("failed_to_recover_auth", "Failed attempt to recover authentication");
                        break;
                    } else {
                        AbstractC2714h.e eVar = aVar.f7989e;
                        Objects.requireNonNull(eVar);
                        Object obj = this.f7984h.f7990f;
                        Objects.requireNonNull(obj);
                        this.f7984h = null;
                        mo9265c((String) obj, Boolean.FALSE, eVar);
                        break;
                    }
                case 53295:
                    m9280v(Boolean.valueOf(i8 == -1));
                    break;
            }
            return false;
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: b */
        public void mo9264b(AbstractC2714h.h hVar) {
            m9278t("signOut", hVar);
            this.f7982f.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: W4.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C2707a.b.this.m9260D(task);
                }
            });
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: c */
        public void mo9265c(final String str, final Boolean bool, final AbstractC2714h.e eVar) {
            try {
                eVar.mo9306a(AbstractC5518e.m23152b(this.f7979c, new Account(str, "com.google"), "oauth2:" + AbstractC2708b.m9284a(StringUtils.SPACE, this.f7983g)));
            } catch (UserRecoverableAuthException e7) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: W4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2707a.b.this.m9259C(bool, eVar, e7, str);
                    }
                });
            } catch (Exception e8) {
                eVar.mo9307b(new AbstractC2714h.a("exception", e8.getMessage(), null));
            }
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: d */
        public void mo9266d(AbstractC2714h.e eVar) {
            m9276r("signInSilently", eVar);
            Task m26683f = this.f7982f.m26683f();
            if (m26683f.isComplete()) {
                m9262F(m26683f);
            } else {
                m26683f.addOnCompleteListener(new OnCompleteListener() { // from class: W4.f
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C2707a.b.this.m9262F(task);
                    }
                });
            }
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: e */
        public void mo9267e(AbstractC2714h.h hVar) {
            m9278t("disconnect", hVar);
            this.f7982f.m26682e().addOnCompleteListener(new OnCompleteListener() { // from class: W4.e
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C2707a.b.this.m9258B(task);
                }
            });
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: f */
        public void mo9268f(AbstractC2714h.c cVar) {
            GoogleSignInOptions.C3641a c3641a;
            int identifier;
            try {
                int i7 = a.f7978a[cVar.m9297h().ordinal()];
                if (i7 == 1) {
                    c3641a = new GoogleSignInOptions.C3641a(GoogleSignInOptions.f12205t);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("Unknown signInOption");
                    }
                    c3641a = new GoogleSignInOptions.C3641a(GoogleSignInOptions.f12204s).m14770b();
                }
                String m9296g = cVar.m9296g();
                if (!m9252A(cVar.m9291b()) && m9252A(m9296g)) {
                    Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                    m9296g = cVar.m9291b();
                }
                if (m9252A(m9296g) && (identifier = this.f7979c.getResources().getIdentifier("default_web_client_id", "string", this.f7979c.getPackageName())) != 0) {
                    m9296g = this.f7979c.getString(identifier);
                }
                if (!m9252A(m9296g)) {
                    c3641a.m14772d(m9296g);
                    c3641a.m14775g(m9296g, cVar.m9293d().booleanValue());
                }
                List m9295f = cVar.m9295f();
                this.f7983g = m9295f;
                Iterator it = m9295f.iterator();
                while (it.hasNext()) {
                    c3641a.m14774f(new Scope((String) it.next()), new Scope[0]);
                }
                if (!m9252A(cVar.m9294e())) {
                    c3641a.m14777i(cVar.m9294e());
                }
                String m9292c = cVar.m9292c();
                if (!m9252A(m9292c)) {
                    c3641a.m14776h(m9292c);
                }
                this.f7982f = this.f7981e.m9285a(this.f7979c, c3641a.m14769a());
            } catch (Exception e7) {
                throw new AbstractC2714h.a("exception", e7.getMessage(), null);
            }
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: g */
        public void mo9269g(AbstractC2714h.e eVar) {
            if (m9283z() == null) {
                throw new IllegalStateException("signIn needs a foreground activity");
            }
            m9276r("signIn", eVar);
            m9283z().startActivityForResult(this.f7982f.m26681d(), 53293);
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: h */
        public Boolean mo9270h() {
            return Boolean.valueOf(AbstractC3642a.m14782b(this.f7979c) != null);
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: i */
        public void mo9271i(List list, AbstractC2714h.e eVar) {
            m9274p("requestScopes", eVar);
            GoogleSignInAccount m9286b = this.f7981e.m9286b(this.f7979c);
            if (m9286b == null) {
                m9257w("sign_in_required", "No account to grant scopes.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Scope scope = new Scope((String) it.next());
                if (!this.f7981e.m9287c(m9286b, scope)) {
                    arrayList.add(scope);
                }
            }
            if (arrayList.isEmpty()) {
                m9280v(Boolean.TRUE);
            } else {
                this.f7981e.m9288d(m9283z(), 53295, m9286b, (Scope[]) arrayList.toArray(new Scope[0]));
            }
        }

        @Override // p159W4.AbstractC2714h.b
        /* renamed from: j */
        public void mo9272j(String str) {
            try {
                AbstractC5518e.m23151a(this.f7979c, str);
            } catch (Exception e7) {
                throw new AbstractC2714h.a("exception", e7.getMessage(), null);
            }
        }

        /* renamed from: o */
        public final void m9273o(String str, AbstractC2714h.e eVar, Object obj) {
            m9277s(str, eVar, obj);
        }

        /* renamed from: p */
        public final void m9274p(String str, AbstractC2714h.e eVar) {
            m9275q(str, null, null, eVar, null, null);
        }

        /* renamed from: q */
        public final void m9275q(String str, AbstractC2714h.e eVar, AbstractC2714h.h hVar, AbstractC2714h.e eVar2, AbstractC2714h.e eVar3, Object obj) {
            if (this.f7984h == null) {
                this.f7984h = new a(str, eVar, hVar, eVar2, eVar3, obj);
                return;
            }
            throw new IllegalStateException("Concurrent operations detected: " + this.f7984h.f7985a + ", " + str);
        }

        /* renamed from: r */
        public final void m9276r(String str, AbstractC2714h.e eVar) {
            m9275q(str, eVar, null, null, null, null);
        }

        /* renamed from: s */
        public final void m9277s(String str, AbstractC2714h.e eVar, Object obj) {
            m9275q(str, null, null, null, eVar, obj);
        }

        /* renamed from: t */
        public final void m9278t(String str, AbstractC2714h.h hVar) {
            m9275q(str, null, hVar, null, null, null);
        }

        /* renamed from: u */
        public final String m9279u(int i7) {
            return i7 != 4 ? i7 != 7 ? i7 != 12501 ? "sign_in_failed" : "sign_in_canceled" : "network_error" : "sign_in_required";
        }

        /* renamed from: v */
        public final void m9280v(Boolean bool) {
            AbstractC2714h.e eVar = this.f7984h.f7988d;
            Objects.requireNonNull(eVar);
            eVar.mo9306a(bool);
            this.f7984h = null;
        }

        /* renamed from: x */
        public final void m9281x() {
            AbstractC2714h.h hVar = this.f7984h.f7987c;
            Objects.requireNonNull(hVar);
            hVar.mo9324a();
            this.f7984h = null;
        }

        /* renamed from: y */
        public final void m9282y(AbstractC2714h.g gVar) {
            AbstractC2714h.e eVar = this.f7984h.f7986b;
            Objects.requireNonNull(eVar);
            eVar.mo9306a(gVar);
            this.f7984h = null;
        }

        /* renamed from: z */
        public Activity m9283z() {
            return this.f7980d;
        }
    }

    /* renamed from: a */
    private void m9248a(InterfaceC0300c interfaceC0300c) {
        this.f7977e = interfaceC0300c;
        interfaceC0300c.mo1209l(this.f7975c);
        this.f7975c.m9263G(interfaceC0300c.mo1204g());
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        m9251d(bVar.m786b(), bVar.m785a(), new C2713g());
    }

    /* renamed from: b */
    public final void m9249b() {
        this.f7975c = null;
        InterfaceC0651c interfaceC0651c = this.f7976d;
        if (interfaceC0651c != null) {
            AbstractC2724r.m9336k(interfaceC0651c, null);
            this.f7976d = null;
        }
    }

    /* renamed from: c */
    public final void m9250c() {
        this.f7977e.mo1208k(this.f7975c);
        this.f7975c.m9263G(null);
        this.f7977e = null;
    }

    /* renamed from: d */
    public void m9251d(InterfaceC0651c interfaceC0651c, Context context, C2713g c2713g) {
        this.f7976d = interfaceC0651c;
        b bVar = new b(context, c2713g);
        this.f7975c = bVar;
        AbstractC2724r.m9336k(interfaceC0651c, bVar);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c interfaceC0300c) {
        m9248a(interfaceC0300c);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        m9250c();
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c interfaceC0300c) {
        m9248a(interfaceC0300c);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        m9250c();
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        m9249b();
    }
}

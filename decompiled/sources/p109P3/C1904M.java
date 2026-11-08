package p109P3;

import java.util.Locale;
import p067J3.EnumC0733a0;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p116Q3.C2138g;
import p237g5.C4448l0;

/* renamed from: P3.M */
/* loaded from: classes.dex */
public class C1904M {

    /* renamed from: b */
    public int f5668b;

    /* renamed from: c */
    public C2138g.b f5669c;

    /* renamed from: e */
    public final C2138g f5671e;

    /* renamed from: f */
    public final a f5672f;

    /* renamed from: a */
    public EnumC0733a0 f5667a = EnumC0733a0.UNKNOWN;

    /* renamed from: d */
    public boolean f5670d = true;

    /* renamed from: P3.M$a */
    public interface a {
        /* renamed from: a */
        void mo6631a(EnumC0733a0 enumC0733a0);
    }

    public C1904M(C2138g c2138g, a aVar) {
        this.f5671e = c2138g;
        this.f5672f = aVar;
    }

    /* renamed from: b */
    public final void m6623b() {
        C2138g.b bVar = this.f5669c;
        if (bVar != null) {
            bVar.m7245c();
            this.f5669c = null;
        }
    }

    /* renamed from: c */
    public EnumC0733a0 m6624c() {
        return this.f5667a;
    }

    /* renamed from: d */
    public void m6625d(C4448l0 c4448l0) {
        if (this.f5667a == EnumC0733a0.ONLINE) {
            m6629h(EnumC0733a0.UNKNOWN);
            AbstractC2133b.m7217d(this.f5668b == 0, "watchStreamFailures must be 0", new Object[0]);
            AbstractC2133b.m7217d(this.f5669c == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i7 = this.f5668b + 1;
        this.f5668b = i7;
        if (i7 >= 1) {
            m6623b();
            m6628g(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, c4448l0));
            m6629h(EnumC0733a0.OFFLINE);
        }
    }

    /* renamed from: e */
    public void m6626e() {
        if (this.f5668b == 0) {
            m6629h(EnumC0733a0.UNKNOWN);
            AbstractC2133b.m7217d(this.f5669c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f5669c = this.f5671e.m7233k(C2138g.d.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: P3.L
                @Override // java.lang.Runnable
                public final void run() {
                    C1904M.this.m6627f();
                }
            });
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m6627f() {
        this.f5669c = null;
        AbstractC2133b.m7217d(this.f5667a == EnumC0733a0.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        m6628g(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        m6629h(EnumC0733a0.OFFLINE);
    }

    /* renamed from: g */
    public final void m6628g(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        if (!this.f5670d) {
            AbstractC2155x.m7309a("OnlineStateTracker", "%s", format);
        } else {
            AbstractC2155x.m7313e("OnlineStateTracker", "%s", format);
            this.f5670d = false;
        }
    }

    /* renamed from: h */
    public final void m6629h(EnumC0733a0 enumC0733a0) {
        if (enumC0733a0 != this.f5667a) {
            this.f5667a = enumC0733a0;
            this.f5672f.mo6631a(enumC0733a0);
        }
    }

    /* renamed from: i */
    public void m6630i(EnumC0733a0 enumC0733a0) {
        m6623b();
        this.f5668b = 0;
        if (enumC0733a0 == EnumC0733a0.ONLINE) {
            this.f5670d = false;
        }
        m6629h(enumC0733a0);
    }
}

package p108P2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcr;

/* renamed from: P2.L6 */
/* loaded from: classes.dex */
public final class C1544L6 extends AbstractC1724h2 {

    /* renamed from: c */
    public Handler f4805c;

    /* renamed from: d */
    public boolean f4806d;

    /* renamed from: e */
    public final C1535K6 f4807e;

    /* renamed from: f */
    public final C1526J6 f4808f;

    /* renamed from: g */
    public final C1508H6 f4809g;

    public C1544L6(C1460C3 c1460c3) {
        super(c1460c3);
        this.f4806d = true;
        this.f4807e = new C1535K6(this);
        this.f4808f = new C1526J6(this);
        this.f4809g = new C1508H6(this);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m5908q(C1544L6 c1544l6, long j7) {
        c1544l6.mo5762h();
        c1544l6.m5910u();
        C1460C3 c1460c3 = c1544l6.f5129a;
        c1460c3.mo5624b().m5940v().m5903b("Activity paused, time", Long.valueOf(j7));
        c1544l6.f4809g.m5770a(j7);
        if (c1460c3.m5605B().m6140R()) {
            c1544l6.f4808f.m5887b(j7);
        }
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m5909r(C1544L6 c1544l6, long j7) {
        c1544l6.mo5762h();
        c1544l6.m5910u();
        C1460C3 c1460c3 = c1544l6.f5129a;
        c1460c3.mo5624b().m5940v().m5903b("Activity resumed, time", Long.valueOf(j7));
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5373b1)) {
            if (c1460c3.m5605B().m6140R() || c1544l6.f4806d) {
                c1544l6.f4808f.m5888c(j7);
            }
        } else if (c1460c3.m5605B().m6140R() || c1460c3.m5611H().f5080u.m5975b()) {
            c1544l6.f4808f.m5888c(j7);
        }
        c1544l6.f4809g.m5771b();
        C1535K6 c1535k6 = c1544l6.f4807e;
        C1544L6 c1544l62 = c1535k6.f4795a;
        c1544l62.mo5762h();
        if (c1544l62.f5129a.m5635o()) {
            c1535k6.m5895b(c1544l62.f5129a.mo5626d().mo1110a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m5910u() {
        mo5762h();
        if (this.f4805c == null) {
            this.f4805c = new zzcr(Looper.getMainLooper());
        }
    }

    @Override // p108P2.AbstractC1724h2
    /* renamed from: n */
    public final boolean mo5563n() {
        return false;
    }

    /* renamed from: s */
    public final void m5911s(boolean z6) {
        mo5762h();
        this.f4806d = z6;
    }

    /* renamed from: t */
    public final boolean m5912t() {
        mo5762h();
        return this.f4806d;
    }
}

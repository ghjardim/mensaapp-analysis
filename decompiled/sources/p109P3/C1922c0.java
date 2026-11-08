package p109P3;

import com.google.protobuf.AbstractC4055i;
import java.util.Map;
import p081L3.C1038O1;
import p088M3.C1181w;
import p116Q3.AbstractC2133b;
import p116Q3.C2138g;
import p272k4.AbstractC5435r;
import p272k4.C5436s;
import p272k4.C5437t;

/* renamed from: P3.c0 */
/* loaded from: classes.dex */
public class C1922c0 extends AbstractC1921c {

    /* renamed from: t */
    public static final AbstractC4055i f5790t = AbstractC4055i.f13379b;

    /* renamed from: s */
    public final C1907P f5791s;

    /* renamed from: P3.c0$a */
    public interface a extends InterfaceC1913W {
        /* renamed from: c */
        void mo6751c(C1181w c1181w, AbstractC1918a0 abstractC1918a0);
    }

    public C1922c0(C1946z c1946z, C2138g c2138g, C1907P c1907p, a aVar) {
        super(c1946z, AbstractC5435r.m22695c(), c2138g, C2138g.d.LISTEN_STREAM_CONNECTION_BACKOFF, C2138g.d.LISTEN_STREAM_IDLE, C2138g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f5791s = c1907p;
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo6837s(C5437t c5437t) {
        this.f5782l.m7301f();
        AbstractC1918a0 m6651A = this.f5791s.m6651A(c5437t);
        ((a) this.f5783m).mo6751c(this.f5791s.m6703z(c5437t), m6651A);
    }

    /* renamed from: B */
    public void m6854B(int i7) {
        AbstractC2133b.m7217d(mo6831m(), "Unwatching targets requires an open stream", new Object[0]);
        m6843y((C5436s) C5436s.m22709h0().m22717y(this.f5791s.m6676a()).m22718z(i7).m17059n());
    }

    /* renamed from: C */
    public void m6855C(C1038O1 c1038o1) {
        AbstractC2133b.m7217d(mo6831m(), "Watching queries requires an open stream", new Object[0]);
        C5436s.b m22716x = C5436s.m22709h0().m22717y(this.f5791s.m6676a()).m22716x(this.f5791s.m6672V(c1038o1));
        Map m6664N = this.f5791s.m6664N(c1038o1);
        if (m6664N != null) {
            m22716x.m22715w(m6664N);
        }
        m6843y((C5436s) m22716x.m17059n());
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo6830l() {
        super.mo6830l();
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo6831m() {
        return super.mo6831m();
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo6832n() {
        return super.mo6832n();
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: v */
    public /* bridge */ /* synthetic */ void mo6840v() {
        super.mo6840v();
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: w */
    public /* bridge */ /* synthetic */ void mo6841w() {
        super.mo6841w();
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo6836r(C5437t c5437t) {
        mo6837s(c5437t);
    }
}

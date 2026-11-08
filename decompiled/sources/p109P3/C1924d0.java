package p109P3;

import com.google.protobuf.AbstractC4055i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p088M3.C1181w;
import p095N3.AbstractC1266f;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2157z;
import p116Q3.C2138g;
import p272k4.AbstractC5435r;
import p272k4.C5415F;
import p272k4.C5416G;

/* renamed from: P3.d0 */
/* loaded from: classes.dex */
public class C1924d0 extends AbstractC1921c {

    /* renamed from: v */
    public static final AbstractC4055i f5793v = AbstractC4055i.f13379b;

    /* renamed from: s */
    public final C1907P f5794s;

    /* renamed from: t */
    public boolean f5795t;

    /* renamed from: u */
    public AbstractC4055i f5796u;

    /* renamed from: P3.d0$a */
    public interface a extends InterfaceC1913W {
        /* renamed from: d */
        void mo6752d(C1181w c1181w, List list);

        /* renamed from: e */
        void mo6753e();
    }

    public C1924d0(C1946z c1946z, C2138g c2138g, C1907P c1907p, a aVar) {
        super(c1946z, AbstractC5435r.m22697e(), c2138g, C2138g.d.WRITE_STREAM_CONNECTION_BACKOFF, C2138g.d.WRITE_STREAM_IDLE, C2138g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f5795t = false;
        this.f5796u = f5793v;
        this.f5794s = c1907p;
    }

    /* renamed from: A */
    public boolean m6857A() {
        return this.f5795t;
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo6836r(C5416G c5416g) {
        this.f5796u = c5416g.m22535c0();
        this.f5795t = true;
        ((a) this.f5783m).mo6753e();
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo6837s(C5416G c5416g) {
        this.f5796u = c5416g.m22535c0();
        this.f5782l.m7301f();
        C1181w m6702y = this.f5794s.m6702y(c5416g.m22534a0());
        int m22537e0 = c5416g.m22537e0();
        ArrayList arrayList = new ArrayList(m22537e0);
        for (int i7 = 0; i7 < m22537e0; i7++) {
            arrayList.add(this.f5794s.m6693p(c5416g.m22536d0(i7), m6702y));
        }
        ((a) this.f5783m).mo6752d(m6702y, arrayList);
    }

    /* renamed from: D */
    public void m6860D(AbstractC4055i abstractC4055i) {
        this.f5796u = (AbstractC4055i) AbstractC2157z.m7329b(abstractC4055i);
    }

    /* renamed from: E */
    public void m6861E() {
        AbstractC2133b.m7217d(mo6831m(), "Writing handshake requires an opened stream", new Object[0]);
        AbstractC2133b.m7217d(!this.f5795t, "Handshake already completed", new Object[0]);
        m6843y((C5415F) C5415F.m22526g0().m22530x(this.f5794s.m6676a()).m17059n());
    }

    /* renamed from: F */
    public void m6862F(List list) {
        AbstractC2133b.m7217d(mo6831m(), "Writing mutations requires an opened stream", new Object[0]);
        AbstractC2133b.m7217d(this.f5795t, "Handshake must be complete before writing mutations", new Object[0]);
        C5415F.b m22526g0 = C5415F.m22526g0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m22526g0.m22529w(this.f5794s.m6665O((AbstractC1266f) it.next()));
        }
        m22526g0.m22531y(this.f5796u);
        m6843y((C5415F) m22526g0.m17059n());
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
    public void mo6840v() {
        this.f5795t = false;
        super.mo6840v();
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: w */
    public /* bridge */ /* synthetic */ void mo6841w() {
        super.mo6841w();
    }

    @Override // p109P3.AbstractC1921c
    /* renamed from: x */
    public void mo6842x() {
        if (this.f5795t) {
            m6862F(Collections.emptyList());
        }
    }

    /* renamed from: z */
    public AbstractC4055i m6863z() {
        return this.f5796u;
    }
}

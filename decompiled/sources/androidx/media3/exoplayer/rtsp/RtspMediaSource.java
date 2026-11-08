package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.media3.exoplayer.rtsp.C3384f;
import androidx.media3.exoplayer.rtsp.InterfaceC3379a;
import java.io.IOException;
import javax.net.SocketFactory;
import p022D0.AbstractC0119E;
import p022D0.AbstractC0140a;
import p022D0.AbstractC0177w;
import p022D0.C0151f0;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p232g0.AbstractC4303I;
import p232g0.AbstractC4332v;
import p232g0.C4331u;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5511y;
import p335s0.InterfaceC6321A;
import p387z0.C7122w;

/* loaded from: classes.dex */
public final class RtspMediaSource extends AbstractC0140a {

    /* renamed from: o */
    public final InterfaceC3379a.a f10964o;

    /* renamed from: p */
    public final String f10965p;

    /* renamed from: q */
    public final Uri f10966q;

    /* renamed from: r */
    public final SocketFactory f10967r;

    /* renamed from: s */
    public final boolean f10968s;

    /* renamed from: u */
    public boolean f10970u;

    /* renamed from: v */
    public boolean f10971v;

    /* renamed from: x */
    public C4331u f10973x;

    /* renamed from: t */
    public long f10969t = -9223372036854775807L;

    /* renamed from: w */
    public boolean f10972w = true;

    /* renamed from: androidx.media3.exoplayer.rtsp.RtspMediaSource$a */
    public class C3375a implements C3384f.d {
        public C3375a() {
        }

        @Override // androidx.media3.exoplayer.rtsp.C3384f.d
        /* renamed from: a */
        public void mo13158a(C7122w c7122w) {
            RtspMediaSource.this.f10969t = AbstractC5330M.m21692K0(c7122w.m29344a());
            RtspMediaSource.this.f10970u = !c7122w.m29345c();
            RtspMediaSource.this.f10971v = c7122w.m29345c();
            RtspMediaSource.this.f10972w = false;
            RtspMediaSource.this.m13154K();
        }

        @Override // androidx.media3.exoplayer.rtsp.C3384f.d
        /* renamed from: b */
        public void mo13159b() {
            RtspMediaSource.this.f10970u = false;
            RtspMediaSource.this.m13154K();
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.RtspMediaSource$b */
    public class C3376b extends AbstractC0177w {
        public C3376b(AbstractC4303I abstractC4303I) {
            super(abstractC4303I);
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: g */
        public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
            super.mo303g(i7, bVar, z6);
            bVar.f14814f = true;
            return bVar;
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: o */
        public AbstractC4303I.c mo305o(int i7, AbstractC4303I.c cVar, long j7) {
            super.mo305o(i7, cVar, j7);
            cVar.f14842k = true;
            return cVar;
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.RtspMediaSource$c */
    public static class C3377c extends IOException {
        public C3377c(String str) {
            super(str);
        }

        public C3377c(Throwable th) {
            super(th);
        }

        public C3377c(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.RtspMediaSource$d */
    public static final class C3378d extends C3377c {
        public C3378d(String str) {
            super(str);
        }
    }

    static {
        AbstractC4332v.m18323a("media3.exoplayer.rtsp");
    }

    public RtspMediaSource(C4331u c4331u, InterfaceC3379a.a aVar, String str, SocketFactory socketFactory, boolean z6) {
        this.f10973x = c4331u;
        this.f10964o = aVar;
        this.f10965p = str;
        this.f10966q = ((C4331u.h) AbstractC5332a.m21800e(c4331u.f15212b)).f15304a;
        this.f10967r = socketFactory;
        this.f10968s = z6;
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        m13154K();
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
    }

    /* renamed from: K */
    public final void m13154K() {
        AbstractC4303I c0151f0 = new C0151f0(this.f10969t, this.f10970u, false, this.f10971v, null, mo331i());
        if (this.f10972w) {
            c0151f0 = new C3376b(c0151f0);
        }
        m522D(c0151f0);
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public synchronized void mo294a(C4331u c4331u) {
        this.f10973x = c4331u;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        return new C3384f(interfaceC0533b, this.f10964o, this.f10966q, new C3375a(), this.f10965p, this.f10967r, this.f10968s);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        ((C3384f) interfaceC0117C).m13297W();
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public synchronized C4331u mo331i() {
        return this.f10973x;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
    }

    public static final class Factory implements InterfaceC0120F.a {

        /* renamed from: a */
        public long f10974a = 8000;

        /* renamed from: b */
        public String f10975b = "AndroidXMedia3/1.4.1";

        /* renamed from: c */
        public SocketFactory f10976c = SocketFactory.getDefault();

        /* renamed from: d */
        public boolean f10977d;

        /* renamed from: e */
        public boolean f10978e;

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: a */
        public /* synthetic */ InterfaceC0120F.a mo339a(InterfaceC4529t.a aVar) {
            return AbstractC0119E.m327b(this, aVar);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: b */
        public /* synthetic */ InterfaceC0120F.a mo340b(boolean z6) {
            return AbstractC0119E.m326a(this, z6);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource mo343e(C4331u c4331u) {
            AbstractC5332a.m21800e(c4331u.f15212b);
            return new RtspMediaSource(c4331u, this.f10977d ? new C3389k(this.f10974a) : new C3391m(this.f10974a), this.f10975b, this.f10976c, this.f10978e);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo342d(InterfaceC6321A interfaceC6321A) {
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo341c(InterfaceC0544m interfaceC0544m) {
            return this;
        }
    }
}

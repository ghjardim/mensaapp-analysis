package androidx.media3.exoplayer.rtsp;

import android.os.Handler;
import androidx.media3.exoplayer.rtsp.C3380b;
import androidx.media3.exoplayer.rtsp.InterfaceC3379a;
import p050H0.C0545n;
import p078L0.C0854L;
import p078L0.C0875j;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p232g0.InterfaceC4319i;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.AbstractC5496j;
import p387z0.C7103d;
import p387z0.C7114o;

/* renamed from: androidx.media3.exoplayer.rtsp.b */
/* loaded from: classes.dex */
public final class C3380b implements C0545n.e {

    /* renamed from: a */
    public final int f10981a;

    /* renamed from: b */
    public final C7114o f10982b;

    /* renamed from: c */
    public final a f10983c;

    /* renamed from: d */
    public final InterfaceC0885t f10984d;

    /* renamed from: f */
    public final InterfaceC3379a.a f10986f;

    /* renamed from: g */
    public InterfaceC3379a f10987g;

    /* renamed from: h */
    public C7103d f10988h;

    /* renamed from: i */
    public C0875j f10989i;

    /* renamed from: j */
    public volatile boolean f10990j;

    /* renamed from: l */
    public volatile long f10992l;

    /* renamed from: e */
    public final Handler f10985e = AbstractC5330M.m21671A();

    /* renamed from: k */
    public volatile long f10991k = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.rtsp.b$a */
    public interface a {
        /* renamed from: a */
        void mo13172a(String str, InterfaceC3379a interfaceC3379a);
    }

    public C3380b(int i7, C7114o c7114o, a aVar, InterfaceC0885t interfaceC0885t, InterfaceC3379a.a aVar2) {
        this.f10981a = i7;
        this.f10982b = c7114o;
        this.f10983c = aVar;
        this.f10984d = interfaceC0885t;
        this.f10986f = aVar2;
    }

    @Override // p050H0.C0545n.e
    /* renamed from: b */
    public void mo481b() {
        if (this.f10990j) {
            this.f10990j = false;
        }
        try {
            if (this.f10987g == null) {
                InterfaceC3379a mo13164a = this.f10986f.mo13164a(this.f10981a);
                this.f10987g = mo13164a;
                final String mo13160b = mo13164a.mo13160b();
                final InterfaceC3379a interfaceC3379a = this.f10987g;
                this.f10985e.post(new Runnable() { // from class: z0.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3380b.this.m13167d(mo13160b, interfaceC3379a);
                    }
                });
                this.f10989i = new C0875j((InterfaceC4319i) AbstractC5332a.m21800e(this.f10987g), 0L, -1L);
                C7103d c7103d = new C7103d(this.f10982b.f25286a, this.f10981a);
                this.f10988h = c7103d;
                c7103d.mo696b(this.f10984d);
            }
            while (!this.f10990j) {
                if (this.f10991k != -9223372036854775807L) {
                    ((C7103d) AbstractC5332a.m21800e(this.f10988h)).mo695a(this.f10992l, this.f10991k);
                    this.f10991k = -9223372036854775807L;
                }
                if (((C7103d) AbstractC5332a.m21800e(this.f10988h)).mo699h((InterfaceC0884s) AbstractC5332a.m21800e(this.f10989i), new C0854L()) == -1) {
                    break;
                }
            }
            this.f10990j = false;
            if (((InterfaceC3379a) AbstractC5332a.m21800e(this.f10987g)).mo13162f()) {
                AbstractC5496j.m23079a(this.f10987g);
                this.f10987g = null;
            }
        } catch (Throwable th) {
            if (((InterfaceC3379a) AbstractC5332a.m21800e(this.f10987g)).mo13162f()) {
                AbstractC5496j.m23079a(this.f10987g);
                this.f10987g = null;
            }
            throw th;
        }
    }

    @Override // p050H0.C0545n.e
    /* renamed from: c */
    public void mo482c() {
        this.f10990j = true;
    }

    /* renamed from: d */
    public final /* synthetic */ void m13167d(String str, InterfaceC3379a interfaceC3379a) {
        this.f10983c.mo13172a(str, interfaceC3379a);
    }

    /* renamed from: e */
    public void m13168e() {
        ((C7103d) AbstractC5332a.m21800e(this.f10988h)).m29296f();
    }

    /* renamed from: f */
    public void m13169f(long j7, long j8) {
        this.f10991k = j7;
        this.f10992l = j8;
    }

    /* renamed from: g */
    public void m13170g(int i7) {
        if (((C7103d) AbstractC5332a.m21800e(this.f10988h)).m29295e()) {
            return;
        }
        this.f10988h.m29297j(i7);
    }

    /* renamed from: h */
    public void m13171h(long j7) {
        if (j7 == -9223372036854775807L || ((C7103d) AbstractC5332a.m21800e(this.f10988h)).m29295e()) {
            return;
        }
        this.f10988h.m29298k(j7);
    }
}

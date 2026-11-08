package p276l0;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p276l0.C5499m;
import p276l0.InterfaceC5493g;

/* renamed from: l0.l */
/* loaded from: classes.dex */
public final class C5498l implements InterfaceC5493g {

    /* renamed from: a */
    public final Context f19802a;

    /* renamed from: b */
    public final List f19803b = new ArrayList();

    /* renamed from: c */
    public final InterfaceC5493g f19804c;

    /* renamed from: d */
    public InterfaceC5493g f19805d;

    /* renamed from: e */
    public InterfaceC5493g f19806e;

    /* renamed from: f */
    public InterfaceC5493g f19807f;

    /* renamed from: g */
    public InterfaceC5493g f19808g;

    /* renamed from: h */
    public InterfaceC5493g f19809h;

    /* renamed from: i */
    public InterfaceC5493g f19810i;

    /* renamed from: j */
    public InterfaceC5493g f19811j;

    /* renamed from: k */
    public InterfaceC5493g f19812k;

    /* renamed from: l0.l$a */
    public static final class a implements InterfaceC5493g.a {

        /* renamed from: a */
        public final Context f19813a;

        /* renamed from: b */
        public final InterfaceC5493g.a f19814b;

        /* renamed from: c */
        public InterfaceC5511y f19815c;

        public a(Context context) {
            this(context, new C5499m.b());
        }

        @Override // p276l0.InterfaceC5493g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5498l mo23075a() {
            C5498l c5498l = new C5498l(this.f19813a, this.f19814b.mo23075a());
            InterfaceC5511y interfaceC5511y = this.f19815c;
            if (interfaceC5511y != null) {
                c5498l.mo711c(interfaceC5511y);
            }
            return c5498l;
        }

        public a(Context context, InterfaceC5493g.a aVar) {
            this.f19813a = context.getApplicationContext();
            this.f19814b = aVar;
        }
    }

    public C5498l(Context context, InterfaceC5493g interfaceC5493g) {
        this.f19802a = context.getApplicationContext();
        this.f19804c = (InterfaceC5493g) AbstractC5332a.m21800e(interfaceC5493g);
    }

    /* renamed from: A */
    public final InterfaceC5493g m23096A() {
        if (this.f19808g == null) {
            try {
                InterfaceC5493g interfaceC5493g = (InterfaceC5493g) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f19808g = interfaceC5493g;
                m23099g(interfaceC5493g);
            } catch (ClassNotFoundException unused) {
                AbstractC5346o.m21867h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e7) {
                throw new RuntimeException("Error instantiating RTMP extension", e7);
            }
            if (this.f19808g == null) {
                this.f19808g = this.f19804c;
            }
        }
        return this.f19808g;
    }

    /* renamed from: B */
    public final InterfaceC5493g m23097B() {
        if (this.f19809h == null) {
            C5512z c5512z = new C5512z();
            this.f19809h = c5512z;
            m23099g(c5512z);
        }
        return this.f19809h;
    }

    /* renamed from: C */
    public final void m23098C(InterfaceC5493g interfaceC5493g, InterfaceC5511y interfaceC5511y) {
        if (interfaceC5493g != null) {
            interfaceC5493g.mo711c(interfaceC5511y);
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: c */
    public void mo711c(InterfaceC5511y interfaceC5511y) {
        AbstractC5332a.m21800e(interfaceC5511y);
        this.f19804c.mo711c(interfaceC5511y);
        this.f19803b.add(interfaceC5511y);
        m23098C(this.f19805d, interfaceC5511y);
        m23098C(this.f19806e, interfaceC5511y);
        m23098C(this.f19807f, interfaceC5511y);
        m23098C(this.f19808g, interfaceC5511y);
        m23098C(this.f19809h, interfaceC5511y);
        m23098C(this.f19810i, interfaceC5511y);
        m23098C(this.f19811j, interfaceC5511y);
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        InterfaceC5493g interfaceC5493g = this.f19812k;
        if (interfaceC5493g != null) {
            try {
                interfaceC5493g.close();
            } finally {
                this.f19812k = null;
            }
        }
    }

    /* renamed from: g */
    public final void m23099g(InterfaceC5493g interfaceC5493g) {
        for (int i7 = 0; i7 < this.f19803b.size(); i7++) {
            interfaceC5493g.mo711c((InterfaceC5511y) this.f19803b.get(i7));
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: n */
    public Map mo713n() {
        InterfaceC5493g interfaceC5493g = this.f19812k;
        return interfaceC5493g == null ? Collections.emptyMap() : interfaceC5493g.mo713n();
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        AbstractC5332a.m21802g(this.f19812k == null);
        String scheme = c5497k.f19781a.getScheme();
        if (AbstractC5330M.m21680E0(c5497k.f19781a)) {
            String path = c5497k.f19781a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f19812k = m23103y();
            } else {
                this.f19812k = m23100v();
            }
        } else if ("asset".equals(scheme)) {
            this.f19812k = m23100v();
        } else if ("content".equals(scheme)) {
            this.f19812k = m23101w();
        } else if ("rtmp".equals(scheme)) {
            this.f19812k = m23096A();
        } else if ("udp".equals(scheme)) {
            this.f19812k = m23097B();
        } else if ("data".equals(scheme)) {
            this.f19812k = m23102x();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f19812k = m23104z();
        } else {
            this.f19812k = this.f19804c;
        }
        return this.f19812k.mo714o(c5497k);
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        return ((InterfaceC5493g) AbstractC5332a.m21800e(this.f19812k)).read(bArr, i7, i8);
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        InterfaceC5493g interfaceC5493g = this.f19812k;
        if (interfaceC5493g == null) {
            return null;
        }
        return interfaceC5493g.mo715s();
    }

    /* renamed from: v */
    public final InterfaceC5493g m23100v() {
        if (this.f19806e == null) {
            C5487a c5487a = new C5487a(this.f19802a);
            this.f19806e = c5487a;
            m23099g(c5487a);
        }
        return this.f19806e;
    }

    /* renamed from: w */
    public final InterfaceC5493g m23101w() {
        if (this.f19807f == null) {
            C5490d c5490d = new C5490d(this.f19802a);
            this.f19807f = c5490d;
            m23099g(c5490d);
        }
        return this.f19807f;
    }

    /* renamed from: x */
    public final InterfaceC5493g m23102x() {
        if (this.f19810i == null) {
            C5491e c5491e = new C5491e();
            this.f19810i = c5491e;
            m23099g(c5491e);
        }
        return this.f19810i;
    }

    /* renamed from: y */
    public final InterfaceC5493g m23103y() {
        if (this.f19805d == null) {
            C5502p c5502p = new C5502p();
            this.f19805d = c5502p;
            m23099g(c5502p);
        }
        return this.f19805d;
    }

    /* renamed from: z */
    public final InterfaceC5493g m23104z() {
        if (this.f19811j == null) {
            C5509w c5509w = new C5509w(this.f19802a);
            this.f19811j = c5509w;
            m23099g(c5509w);
        }
        return this.f19811j;
    }
}

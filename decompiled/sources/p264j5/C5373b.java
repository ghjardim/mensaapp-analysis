package p264j5;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p206c6.C3616d;
import p206c6.C3619g;
import p264j5.C5381j;
import p281l5.C5547i;
import p281l5.EnumC5539a;
import p281l5.InterfaceC5541c;

/* renamed from: j5.b */
/* loaded from: classes2.dex */
public final class C5373b implements InterfaceC5541c {

    /* renamed from: d */
    public static final Logger f19021d = Logger.getLogger(C5380i.class.getName());

    /* renamed from: a */
    public final a f19022a;

    /* renamed from: b */
    public final InterfaceC5541c f19023b;

    /* renamed from: c */
    public final C5381j f19024c = new C5381j(Level.FINE, C5380i.class);

    /* renamed from: j5.b$a */
    public interface a {
        /* renamed from: h */
        void mo22124h(Throwable th);
    }

    public C5373b(a aVar, InterfaceC5541c interfaceC5541c) {
        this.f19022a = (a) AbstractC2932o.m10573p(aVar, "transportExceptionHandler");
        this.f19023b = (InterfaceC5541c) AbstractC2932o.m10573p(interfaceC5541c, "frameWriter");
    }

    /* renamed from: a */
    public static Level m22116a(Throwable th) {
        return th.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: B */
    public void mo22117B() {
        try {
            this.f19023b.mo22117B();
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: L */
    public void mo22118L(int i7, EnumC5539a enumC5539a, byte[] bArr) {
        this.f19024c.m22242c(C5381j.a.OUTBOUND, i7, enumC5539a, C3619g.m14641w(bArr));
        try {
            this.f19023b.mo22118L(i7, enumC5539a, bArr);
            this.f19023b.flush();
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: U */
    public void mo22119U(C5547i c5547i) {
        this.f19024c.m22248i(C5381j.a.OUTBOUND, c5547i);
        try {
            this.f19023b.mo22119U(c5547i);
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f19023b.close();
        } catch (IOException e7) {
            f19021d.log(m22116a(e7), "Failed closing connection", (Throwable) e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: e */
    public void mo22113e(int i7, EnumC5539a enumC5539a) {
        this.f19024c.m22247h(C5381j.a.OUTBOUND, i7, enumC5539a);
        try {
            this.f19023b.mo22113e(i7, enumC5539a);
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: f */
    public void mo22120f(int i7, long j7) {
        this.f19024c.m22250k(C5381j.a.OUTBOUND, i7, j7);
        try {
            this.f19023b.mo22120f(i7, j7);
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    public void flush() {
        try {
            this.f19023b.flush();
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: g0 */
    public void mo22121g0(boolean z6, int i7, C3616d c3616d, int i8) {
        this.f19024c.m22241b(C5381j.a.OUTBOUND, i7, c3616d.m14616a(), i8, z6);
        try {
            this.f19023b.mo22121g0(z6, i7, c3616d, i8);
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: i */
    public void mo22114i(boolean z6, int i7, int i8) {
        if (z6) {
            this.f19024c.m22245f(C5381j.a.OUTBOUND, (4294967295L & i8) | (i7 << 32));
        } else {
            this.f19024c.m22244e(C5381j.a.OUTBOUND, (4294967295L & i8) | (i7 << 32));
        }
        try {
            this.f19023b.mo22114i(z6, i7, i8);
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: m0 */
    public void mo22115m0(C5547i c5547i) {
        this.f19024c.m22249j(C5381j.a.OUTBOUND);
        try {
            this.f19023b.mo22115m0(c5547i);
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: p0 */
    public int mo22122p0() {
        return this.f19023b.mo22122p0();
    }

    @Override // p281l5.InterfaceC5541c
    /* renamed from: r0 */
    public void mo22123r0(boolean z6, boolean z7, int i7, int i8, List list) {
        try {
            this.f19023b.mo22123r0(z6, z7, i7, i8, list);
        } catch (IOException e7) {
            this.f19022a.mo22124h(e7);
        }
    }
}

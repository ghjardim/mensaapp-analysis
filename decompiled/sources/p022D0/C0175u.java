package p022D0;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0174t;
import p043G0.InterfaceC0375y;
import p171Y2.AbstractC2922e;
import p211d3.InterfaceFutureC4115e;
import p232g0.C4304J;
import p232g0.C4327q;
import p284m0.C5561i;
import p292n0.C5714a1;
import p292n0.C5756s0;
import p292n0.C5762v0;

/* renamed from: D0.u */
/* loaded from: classes.dex */
public final class C0175u implements InterfaceC0117C {

    /* renamed from: a */
    public final Uri f720a;

    /* renamed from: b */
    public final C0165m0 f721b;

    /* renamed from: c */
    public final byte[] f722c;

    /* renamed from: d */
    public final AtomicBoolean f723d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicReference f724e = new AtomicReference();

    /* renamed from: f */
    public InterfaceFutureC4115e f725f;

    /* renamed from: D0.u$a */
    public final class a implements InterfaceC0145c0 {

        /* renamed from: a */
        public int f726a = 0;

        public a() {
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: b */
        public boolean mo487b() {
            return C0175u.this.f723d.get();
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: c */
        public void mo488c() {
            Throwable th = (Throwable) C0175u.this.f724e.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: j */
        public int mo489j(long j7) {
            return 0;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: q */
        public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
            int i8 = this.f726a;
            if (i8 == 2) {
                c5561i.m23272i(4);
                return -4;
            }
            if ((i7 & 2) != 0 || i8 == 0) {
                c5756s0.f20950b = C0175u.this.f721b.m653b(0).m18064a(0);
                this.f726a = 1;
                return -5;
            }
            if (!C0175u.this.f723d.get()) {
                return -3;
            }
            int length = C0175u.this.f722c.length;
            c5561i.m23272i(1);
            c5561i.f20079f = 0L;
            if ((i7 & 4) == 0) {
                c5561i.m23290s(length);
                c5561i.f20077d.put(C0175u.this.f722c, 0, length);
            }
            if ((i7 & 1) == 0) {
                this.f726a = 2;
            }
            return -4;
        }
    }

    public C0175u(Uri uri, String str, InterfaceC0174t interfaceC0174t) {
        this.f720a = uri;
        this.f721b = new C0165m0(new C4304J(new C4327q.b().m18264o0(str).m18234K()));
        this.f722c = uri.toString().getBytes(AbstractC2922e.f9010c);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return this.f723d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return !this.f723d.get();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        return !this.f723d.get();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        return this.f723d.get() ? Long.MIN_VALUE : 0L;
    }

    /* renamed from: k */
    public void m705k() {
        InterfaceFutureC4115e interfaceFutureC4115e = this.f725f;
        if (interfaceFutureC4115e != null) {
            interfaceFutureC4115e.cancel(false);
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            if (interfaceC0145c0Arr[i7] != null && (interfaceC0375yArr[i7] == null || !zArr[i7])) {
                interfaceC0145c0Arr[i7] = null;
            }
            if (interfaceC0145c0Arr[i7] == null && interfaceC0375yArr[i7] != null) {
                interfaceC0145c0Arr[i7] = new a();
                zArr2[i7] = true;
            }
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        aVar.mo322c(this);
        new InterfaceC0174t.a(this.f720a);
        throw null;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        return -9223372036854775807L;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return this.f721b;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
    }
}

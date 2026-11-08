package p240h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p240h0.InterfaceC4476b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: h0.f */
/* loaded from: classes.dex */
public class C4480f implements InterfaceC4476b {

    /* renamed from: b */
    public int f15962b;

    /* renamed from: c */
    public float f15963c = 1.0f;

    /* renamed from: d */
    public float f15964d = 1.0f;

    /* renamed from: e */
    public InterfaceC4476b.a f15965e;

    /* renamed from: f */
    public InterfaceC4476b.a f15966f;

    /* renamed from: g */
    public InterfaceC4476b.a f15967g;

    /* renamed from: h */
    public InterfaceC4476b.a f15968h;

    /* renamed from: i */
    public boolean f15969i;

    /* renamed from: j */
    public C4479e f15970j;

    /* renamed from: k */
    public ByteBuffer f15971k;

    /* renamed from: l */
    public ShortBuffer f15972l;

    /* renamed from: m */
    public ByteBuffer f15973m;

    /* renamed from: n */
    public long f15974n;

    /* renamed from: o */
    public long f15975o;

    /* renamed from: p */
    public boolean f15976p;

    public C4480f() {
        InterfaceC4476b.a aVar = InterfaceC4476b.a.f15927e;
        this.f15965e = aVar;
        this.f15966f = aVar;
        this.f15967g = aVar;
        this.f15968h = aVar;
        ByteBuffer byteBuffer = InterfaceC4476b.f15926a;
        this.f15971k = byteBuffer;
        this.f15972l = byteBuffer.asShortBuffer();
        this.f15973m = byteBuffer;
        this.f15962b = -1;
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: a */
    public final ByteBuffer mo19055a() {
        int m19082k;
        C4479e c4479e = this.f15970j;
        if (c4479e != null && (m19082k = c4479e.m19082k()) > 0) {
            if (this.f15971k.capacity() < m19082k) {
                ByteBuffer order = ByteBuffer.allocateDirect(m19082k).order(ByteOrder.nativeOrder());
                this.f15971k = order;
                this.f15972l = order.asShortBuffer();
            } else {
                this.f15971k.clear();
                this.f15972l.clear();
            }
            c4479e.m19081j(this.f15972l);
            this.f15975o += m19082k;
            this.f15971k.limit(m19082k);
            this.f15973m = this.f15971k;
        }
        ByteBuffer byteBuffer = this.f15973m;
        this.f15973m = InterfaceC4476b.f15926a;
        return byteBuffer;
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: b */
    public final void mo19056b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C4479e c4479e = (C4479e) AbstractC5332a.m21800e(this.f15970j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f15974n += remaining;
            c4479e.m19090t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: c */
    public final boolean mo19057c() {
        C4479e c4479e;
        return this.f15976p && ((c4479e = this.f15970j) == null || c4479e.m19082k() == 0);
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: d */
    public final InterfaceC4476b.a mo19058d(InterfaceC4476b.a aVar) {
        if (aVar.f15930c != 2) {
            throw new InterfaceC4476b.b(aVar);
        }
        int i7 = this.f15962b;
        if (i7 == -1) {
            i7 = aVar.f15928a;
        }
        this.f15965e = aVar;
        InterfaceC4476b.a aVar2 = new InterfaceC4476b.a(i7, aVar.f15929b, 2);
        this.f15966f = aVar2;
        this.f15969i = true;
        return aVar2;
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: e */
    public final void mo19059e() {
        C4479e c4479e = this.f15970j;
        if (c4479e != null) {
            c4479e.m19089s();
        }
        this.f15976p = true;
    }

    /* renamed from: f */
    public final long m19094f(long j7) {
        if (this.f15975o < 1024) {
            return (long) (this.f15963c * j7);
        }
        long m19083l = this.f15974n - ((C4479e) AbstractC5332a.m21800e(this.f15970j)).m19083l();
        int i7 = this.f15968h.f15928a;
        int i8 = this.f15967g.f15928a;
        return i7 == i8 ? AbstractC5330M.m21718X0(j7, m19083l, this.f15975o) : AbstractC5330M.m21718X0(j7, m19083l * i7, this.f15975o * i8);
    }

    @Override // p240h0.InterfaceC4476b
    public final void flush() {
        if (isActive()) {
            InterfaceC4476b.a aVar = this.f15965e;
            this.f15967g = aVar;
            InterfaceC4476b.a aVar2 = this.f15966f;
            this.f15968h = aVar2;
            if (this.f15969i) {
                this.f15970j = new C4479e(aVar.f15928a, aVar.f15929b, this.f15963c, this.f15964d, aVar2.f15928a);
            } else {
                C4479e c4479e = this.f15970j;
                if (c4479e != null) {
                    c4479e.m19080i();
                }
            }
        }
        this.f15973m = InterfaceC4476b.f15926a;
        this.f15974n = 0L;
        this.f15975o = 0L;
        this.f15976p = false;
    }

    /* renamed from: g */
    public final void m19095g(float f7) {
        if (this.f15964d != f7) {
            this.f15964d = f7;
            this.f15969i = true;
        }
    }

    /* renamed from: h */
    public final void m19096h(float f7) {
        if (this.f15963c != f7) {
            this.f15963c = f7;
            this.f15969i = true;
        }
    }

    @Override // p240h0.InterfaceC4476b
    public final boolean isActive() {
        return this.f15966f.f15928a != -1 && (Math.abs(this.f15963c - 1.0f) >= 1.0E-4f || Math.abs(this.f15964d - 1.0f) >= 1.0E-4f || this.f15966f.f15928a != this.f15965e.f15928a);
    }

    @Override // p240h0.InterfaceC4476b
    public final void reset() {
        this.f15963c = 1.0f;
        this.f15964d = 1.0f;
        InterfaceC4476b.a aVar = InterfaceC4476b.a.f15927e;
        this.f15965e = aVar;
        this.f15966f = aVar;
        this.f15967g = aVar;
        this.f15968h = aVar;
        ByteBuffer byteBuffer = InterfaceC4476b.f15926a;
        this.f15971k = byteBuffer;
        this.f15972l = byteBuffer.asShortBuffer();
        this.f15973m = byteBuffer;
        this.f15962b = -1;
        this.f15969i = false;
        this.f15970j = null;
        this.f15974n = 0L;
        this.f15975o = 0L;
        this.f15976p = false;
    }
}

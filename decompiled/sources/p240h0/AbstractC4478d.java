package p240h0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p240h0.InterfaceC4476b;

/* renamed from: h0.d */
/* loaded from: classes.dex */
public abstract class AbstractC4478d implements InterfaceC4476b {

    /* renamed from: b */
    public InterfaceC4476b.a f15933b;

    /* renamed from: c */
    public InterfaceC4476b.a f15934c;

    /* renamed from: d */
    public InterfaceC4476b.a f15935d;

    /* renamed from: e */
    public InterfaceC4476b.a f15936e;

    /* renamed from: f */
    public ByteBuffer f15937f;

    /* renamed from: g */
    public ByteBuffer f15938g;

    /* renamed from: h */
    public boolean f15939h;

    public AbstractC4478d() {
        ByteBuffer byteBuffer = InterfaceC4476b.f15926a;
        this.f15937f = byteBuffer;
        this.f15938g = byteBuffer;
        InterfaceC4476b.a aVar = InterfaceC4476b.a.f15927e;
        this.f15935d = aVar;
        this.f15936e = aVar;
        this.f15933b = aVar;
        this.f15934c = aVar;
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: a */
    public ByteBuffer mo19055a() {
        ByteBuffer byteBuffer = this.f15938g;
        this.f15938g = InterfaceC4476b.f15926a;
        return byteBuffer;
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: c */
    public boolean mo19057c() {
        return this.f15939h && this.f15938g == InterfaceC4476b.f15926a;
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: d */
    public final InterfaceC4476b.a mo19058d(InterfaceC4476b.a aVar) {
        this.f15935d = aVar;
        this.f15936e = mo19066g(aVar);
        return isActive() ? this.f15936e : InterfaceC4476b.a.f15927e;
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: e */
    public final void mo19059e() {
        this.f15939h = true;
        mo19068i();
    }

    /* renamed from: f */
    public final boolean m19065f() {
        return this.f15938g.hasRemaining();
    }

    @Override // p240h0.InterfaceC4476b
    public final void flush() {
        this.f15938g = InterfaceC4476b.f15926a;
        this.f15939h = false;
        this.f15933b = this.f15935d;
        this.f15934c = this.f15936e;
        mo19067h();
    }

    /* renamed from: g */
    public abstract InterfaceC4476b.a mo19066g(InterfaceC4476b.a aVar);

    @Override // p240h0.InterfaceC4476b
    public boolean isActive() {
        return this.f15936e != InterfaceC4476b.a.f15927e;
    }

    /* renamed from: k */
    public final ByteBuffer m19070k(int i7) {
        if (this.f15937f.capacity() < i7) {
            this.f15937f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f15937f.clear();
        }
        ByteBuffer byteBuffer = this.f15937f;
        this.f15938g = byteBuffer;
        return byteBuffer;
    }

    @Override // p240h0.InterfaceC4476b
    public final void reset() {
        flush();
        this.f15937f = InterfaceC4476b.f15926a;
        InterfaceC4476b.a aVar = InterfaceC4476b.a.f15927e;
        this.f15935d = aVar;
        this.f15936e = aVar;
        this.f15933b = aVar;
        this.f15934c = aVar;
        mo19069j();
    }

    /* renamed from: h */
    public void mo19067h() {
    }

    /* renamed from: i */
    public void mo19068i() {
    }

    /* renamed from: j */
    public void mo19069j() {
    }
}

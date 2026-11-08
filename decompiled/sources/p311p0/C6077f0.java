package p311p0;

import java.nio.ByteBuffer;
import p240h0.AbstractC4478d;
import p240h0.InterfaceC4476b;
import p259j0.AbstractC5330M;

/* renamed from: p0.f0 */
/* loaded from: classes.dex */
public final class C6077f0 extends AbstractC4478d {

    /* renamed from: i */
    public int f21718i;

    /* renamed from: j */
    public int f21719j;

    /* renamed from: k */
    public boolean f21720k;

    /* renamed from: l */
    public int f21721l;

    /* renamed from: m */
    public byte[] f21722m = AbstractC5330M.f18805f;

    /* renamed from: n */
    public int f21723n;

    /* renamed from: o */
    public long f21724o;

    @Override // p240h0.AbstractC4478d, p240h0.InterfaceC4476b
    /* renamed from: a */
    public ByteBuffer mo19055a() {
        int i7;
        if (super.mo19057c() && (i7 = this.f21723n) > 0) {
            m19070k(i7).put(this.f21722m, 0, this.f21723n).flip();
            this.f21723n = 0;
        }
        return super.mo19055a();
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: b */
    public void mo19056b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f21721l);
        this.f21724o += min / this.f15933b.f15931d;
        this.f21721l -= min;
        byteBuffer.position(position + min);
        if (this.f21721l > 0) {
            return;
        }
        int i8 = i7 - min;
        int length = (this.f21723n + i8) - this.f21722m.length;
        ByteBuffer m19070k = m19070k(length);
        int m21766p = AbstractC5330M.m21766p(length, 0, this.f21723n);
        m19070k.put(this.f21722m, 0, m21766p);
        int m21766p2 = AbstractC5330M.m21766p(length - m21766p, 0, i8);
        byteBuffer.limit(byteBuffer.position() + m21766p2);
        m19070k.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i8 - m21766p2;
        int i10 = this.f21723n - m21766p;
        this.f21723n = i10;
        byte[] bArr = this.f21722m;
        System.arraycopy(bArr, m21766p, bArr, 0, i10);
        byteBuffer.get(this.f21722m, this.f21723n, i9);
        this.f21723n += i9;
        m19070k.flip();
    }

    @Override // p240h0.AbstractC4478d, p240h0.InterfaceC4476b
    /* renamed from: c */
    public boolean mo19057c() {
        return super.mo19057c() && this.f21723n == 0;
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: g */
    public InterfaceC4476b.a mo19066g(InterfaceC4476b.a aVar) {
        if (aVar.f15930c != 2) {
            throw new InterfaceC4476b.b(aVar);
        }
        this.f21720k = true;
        return (this.f21718i == 0 && this.f21719j == 0) ? InterfaceC4476b.a.f15927e : aVar;
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: h */
    public void mo19067h() {
        if (this.f21720k) {
            this.f21720k = false;
            int i7 = this.f21719j;
            int i8 = this.f15933b.f15931d;
            this.f21722m = new byte[i7 * i8];
            this.f21721l = this.f21718i * i8;
        }
        this.f21723n = 0;
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: i */
    public void mo19068i() {
        if (this.f21720k) {
            if (this.f21723n > 0) {
                this.f21724o += r0 / this.f15933b.f15931d;
            }
            this.f21723n = 0;
        }
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: j */
    public void mo19069j() {
        this.f21722m = AbstractC5330M.f18805f;
    }

    /* renamed from: l */
    public long m25375l() {
        return this.f21724o;
    }

    /* renamed from: m */
    public void m25376m() {
        this.f21724o = 0L;
    }

    /* renamed from: n */
    public void m25377n(int i7, int i8) {
        this.f21718i = i7;
        this.f21719j = i8;
    }
}

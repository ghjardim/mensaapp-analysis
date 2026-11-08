package p311p0;

import java.nio.ByteBuffer;
import p240h0.AbstractC4478d;
import p240h0.InterfaceC4476b;
import p259j0.AbstractC5332a;

/* renamed from: p0.C */
/* loaded from: classes.dex */
public final class C6043C extends AbstractC4478d {

    /* renamed from: i */
    public int[] f21535i;

    /* renamed from: j */
    public int[] f21536j;

    @Override // p240h0.InterfaceC4476b
    /* renamed from: b */
    public void mo19056b(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC5332a.m21800e(this.f21536j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m19070k = m19070k(((limit - position) / this.f15933b.f15931d) * this.f15934c.f15931d);
        while (position < limit) {
            for (int i7 : iArr) {
                m19070k.putShort(byteBuffer.getShort((i7 * 2) + position));
            }
            position += this.f15933b.f15931d;
        }
        byteBuffer.position(limit);
        m19070k.flip();
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: g */
    public InterfaceC4476b.a mo19066g(InterfaceC4476b.a aVar) {
        int[] iArr = this.f21535i;
        if (iArr == null) {
            return InterfaceC4476b.a.f15927e;
        }
        if (aVar.f15930c != 2) {
            throw new InterfaceC4476b.b(aVar);
        }
        boolean z6 = aVar.f15929b != iArr.length;
        int i7 = 0;
        while (i7 < iArr.length) {
            int i8 = iArr[i7];
            if (i8 >= aVar.f15929b) {
                throw new InterfaceC4476b.b(aVar);
            }
            z6 |= i8 != i7;
            i7++;
        }
        return z6 ? new InterfaceC4476b.a(aVar.f15928a, iArr.length, 2) : InterfaceC4476b.a.f15927e;
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: h */
    public void mo19067h() {
        this.f21536j = this.f21535i;
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: j */
    public void mo19069j() {
        this.f21536j = null;
        this.f21535i = null;
    }

    /* renamed from: l */
    public void m25146l(int[] iArr) {
        this.f21535i = iArr;
    }
}

package p311p0;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import p240h0.AbstractC4478d;
import p240h0.InterfaceC4476b;
import p259j0.AbstractC5330M;

/* renamed from: p0.e0 */
/* loaded from: classes.dex */
public final class C6075e0 extends AbstractC4478d {

    /* renamed from: i */
    public static final int f21717i = Float.floatToIntBits(Float.NaN);

    /* renamed from: l */
    public static void m25373l(int i7, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i7 * 4.656612875245797E-10d));
        if (floatToIntBits == f21717i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: b */
    public void mo19056b(ByteBuffer byteBuffer) {
        ByteBuffer m19070k;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = this.f15933b.f15930c;
        if (i8 == 21) {
            m19070k = m19070k((i7 / 3) * 4);
            while (position < limit) {
                m25373l(((byteBuffer.get(position) & ForkServer.ERROR) << 8) | ((byteBuffer.get(position + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(position + 2) & ForkServer.ERROR) << 24), m19070k);
                position += 3;
            }
        } else if (i8 == 22) {
            m19070k = m19070k(i7);
            while (position < limit) {
                m25373l((byteBuffer.get(position) & ForkServer.ERROR) | ((byteBuffer.get(position + 1) & ForkServer.ERROR) << 8) | ((byteBuffer.get(position + 2) & ForkServer.ERROR) << 16) | ((byteBuffer.get(position + 3) & ForkServer.ERROR) << 24), m19070k);
                position += 4;
            }
        } else if (i8 == 1342177280) {
            m19070k = m19070k((i7 / 3) * 4);
            while (position < limit) {
                m25373l(((byteBuffer.get(position + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(position + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(position) & ForkServer.ERROR) << 24), m19070k);
                position += 3;
            }
        } else {
            if (i8 != 1610612736) {
                throw new IllegalStateException();
            }
            m19070k = m19070k(i7);
            while (position < limit) {
                m25373l((byteBuffer.get(position + 3) & ForkServer.ERROR) | ((byteBuffer.get(position + 2) & ForkServer.ERROR) << 8) | ((byteBuffer.get(position + 1) & ForkServer.ERROR) << 16) | ((byteBuffer.get(position) & ForkServer.ERROR) << 24), m19070k);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m19070k.flip();
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: g */
    public InterfaceC4476b.a mo19066g(InterfaceC4476b.a aVar) {
        int i7 = aVar.f15930c;
        if (AbstractC5330M.m21672A0(i7)) {
            return i7 != 4 ? new InterfaceC4476b.a(aVar.f15928a, aVar.f15929b, 4) : InterfaceC4476b.a.f15927e;
        }
        throw new InterfaceC4476b.b(aVar);
    }
}

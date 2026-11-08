package p311p0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import p078L0.AbstractC0853K;
import p203c3.AbstractC3580j;
import p240h0.InterfaceC4476b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p284m0.C5561i;

/* renamed from: p0.c0 */
/* loaded from: classes.dex */
public final class C6071c0 {

    /* renamed from: d */
    public static final byte[] f21689d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e */
    public static final byte[] f21690e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    public ByteBuffer f21691a = InterfaceC4476b.f15926a;

    /* renamed from: c */
    public int f21693c = 0;

    /* renamed from: b */
    public int f21692b = 2;

    /* renamed from: a */
    public void m25325a(C5561i c5561i, List list) {
        AbstractC5332a.m21800e(c5561i.f20077d);
        if (c5561i.f20077d.limit() - c5561i.f20077d.position() == 0) {
            return;
        }
        this.f21691a = m25326b(c5561i.f20077d, (this.f21692b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        c5561i.mo19253j();
        c5561i.m23290s(this.f21691a.remaining());
        c5561i.f20077d.put(this.f21691a);
        c5561i.m23291t();
    }

    /* renamed from: b */
    public final ByteBuffer m25326b(ByteBuffer byteBuffer, byte[] bArr) {
        int i7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        int i9 = (i8 + 255) / 255;
        int i10 = i9 + 27 + i8;
        if (this.f21692b == 2) {
            int length = bArr != null ? bArr.length + 28 : f21689d.length;
            i10 += f21690e.length + length;
            i7 = length;
        } else {
            i7 = 0;
        }
        ByteBuffer m25327c = m25327c(i10);
        if (this.f21692b == 2) {
            if (bArr != null) {
                m25329e(m25327c, bArr);
            } else {
                m25327c.put(f21689d);
            }
            m25327c.put(f21690e);
        }
        int m3551j = this.f21693c + AbstractC0853K.m3551j(byteBuffer);
        this.f21693c = m3551j;
        m25330f(m25327c, m3551j, this.f21692b, i9, false);
        for (int i11 = 0; i11 < i9; i11++) {
            if (i8 >= 255) {
                m25327c.put((byte) -1);
                i8 -= 255;
            } else {
                m25327c.put((byte) i8);
                i8 = 0;
            }
        }
        while (position < limit) {
            m25327c.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        m25327c.flip();
        if (this.f21692b == 2) {
            byte[] array = m25327c.array();
            int arrayOffset = m25327c.arrayOffset() + i7;
            byte[] bArr2 = f21690e;
            m25327c.putInt(i7 + bArr2.length + 22, AbstractC5330M.m21782x(array, arrayOffset + bArr2.length, m25327c.limit() - m25327c.position(), 0));
        } else {
            m25327c.putInt(22, AbstractC5330M.m21782x(m25327c.array(), m25327c.arrayOffset(), m25327c.limit() - m25327c.position(), 0));
        }
        this.f21692b++;
        return m25327c;
    }

    /* renamed from: c */
    public final ByteBuffer m25327c(int i7) {
        if (this.f21691a.capacity() < i7) {
            this.f21691a = ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f21691a.clear();
        }
        return this.f21691a;
    }

    /* renamed from: d */
    public void m25328d() {
        this.f21691a = InterfaceC4476b.f15926a;
        this.f21693c = 0;
        this.f21692b = 2;
    }

    /* renamed from: e */
    public final void m25329e(ByteBuffer byteBuffer, byte[] bArr) {
        m25330f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(AbstractC3580j.m14442a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, AbstractC5330M.m21782x(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    /* renamed from: f */
    public final void m25330f(ByteBuffer byteBuffer, long j7, int i7, int i8, boolean z6) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z6 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        byteBuffer.put(AbstractC3580j.m14442a(i8));
    }
}

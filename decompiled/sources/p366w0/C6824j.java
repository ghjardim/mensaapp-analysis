package p366w0;

import java.nio.ByteBuffer;
import p259j0.AbstractC5332a;
import p284m0.C5561i;

/* renamed from: w0.j */
/* loaded from: classes.dex */
public final class C6824j extends C5561i {

    /* renamed from: q */
    public long f24529q;

    /* renamed from: r */
    public int f24530r;

    /* renamed from: s */
    public int f24531s;

    public C6824j() {
        super(2);
        this.f24531s = 32;
    }

    /* renamed from: A */
    public long m28085A() {
        return this.f24529q;
    }

    /* renamed from: B */
    public int m28086B() {
        return this.f24530r;
    }

    /* renamed from: C */
    public boolean m28087C() {
        return this.f24530r > 0;
    }

    /* renamed from: D */
    public void m28088D(int i7) {
        AbstractC5332a.m21796a(i7 > 0);
        this.f24531s = i7;
    }

    @Override // p284m0.C5561i, p284m0.AbstractC5553a
    /* renamed from: j */
    public void mo19253j() {
        super.mo19253j();
        this.f24530r = 0;
    }

    /* renamed from: x */
    public boolean m28089x(C5561i c5561i) {
        AbstractC5332a.m21796a(!c5561i.m23292u());
        AbstractC5332a.m21796a(!c5561i.m23274l());
        AbstractC5332a.m21796a(!c5561i.m23275m());
        if (!m28090y(c5561i)) {
            return false;
        }
        int i7 = this.f24530r;
        this.f24530r = i7 + 1;
        if (i7 == 0) {
            this.f20079f = c5561i.f20079f;
            if (c5561i.m23277o()) {
                m23279q(1);
            }
        }
        ByteBuffer byteBuffer = c5561i.f20077d;
        if (byteBuffer != null) {
            m23290s(byteBuffer.remaining());
            this.f20077d.put(byteBuffer);
        }
        this.f24529q = c5561i.f20079f;
        return true;
    }

    /* renamed from: y */
    public final boolean m28090y(C5561i c5561i) {
        ByteBuffer byteBuffer;
        if (!m28087C()) {
            return true;
        }
        if (this.f24530r >= this.f24531s) {
            return false;
        }
        ByteBuffer byteBuffer2 = c5561i.f20077d;
        return byteBuffer2 == null || (byteBuffer = this.f20077d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    /* renamed from: z */
    public long m28091z() {
        return this.f20079f;
    }
}
